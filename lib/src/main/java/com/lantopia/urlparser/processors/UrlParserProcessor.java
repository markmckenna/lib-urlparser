package com.lantopia.urlparser.processors;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.TypeElement;
import java.util.Set;

/**
 * @author Mark McKenna &lt;mark.denis.mckenna@gmail.com&gt;
 * @version 0.1
 * @since 25/01/2015
 */
@SupportedAnnotationTypes("com.lantopia.urlparser.annotations.Url")
@SupportedSourceVersion(SourceVersion.RELEASE_6)
public class UrlParserProcessor extends AbstractProcessor {
    @Override
    public boolean process(final Set<? extends TypeElement> annotations, final RoundEnvironment roundEnv) {
        return true; // Consume @Url annotations; they won't be provided to any other processors.
    }
}
