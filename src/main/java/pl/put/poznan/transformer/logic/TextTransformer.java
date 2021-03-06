package pl.put.poznan.transformer.logic;

import pl.put.poznan.transformer.exceptions.BadTextTransformationException;

import javax.xml.transform.Transformer;

public class TextTransformer{
    private InterfaceTextTransformer transformer;

    public TextTransformer(String[] transforms) throws BadTextTransformationException{
        transformer = new NoTransformer();
        for(String transform : transforms){
            switch(transform){
                case "upper":
                    transformer = new UpperTransformer(transformer);
                    break;
                case "lower":
                    transformer = new LowerTransformer(transformer);
                    break;
                case "capitalize":
                    transformer = new CapitalizeTransformer(transformer);
                    break;
                case "inverse":
                    transformer = new InverseTransformer(transformer);
                    break;
                case "numbersToText":
                    transformer = new NumbersToTextTransformer(transformer);
                    break;
                case "toShortForm":
                    transformer = new ShortFormTransformer(transformer);
                    break;
                case "toFullForm":
                    transformer = new FullFormTransformer(transformer);
                    break;
                case "latexFormat":
                    transformer = new LatexFormatTransformer(transformer);
                    break;
                case "duplicates":
                    transformer = new DuplicatesTransformer(transformer);
                    break;
                case "nochange":
                    break;
                default:
                     throw new BadTextTransformationException();
            }
        }
    }

    public String transform(String text){
        return transformer.transform(text);
    }
}
