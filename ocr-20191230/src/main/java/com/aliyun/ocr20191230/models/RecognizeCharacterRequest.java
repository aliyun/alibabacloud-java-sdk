// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeCharacterRequest extends TeaModel {
    @NameInMap("ImageURL")
    @Validation(required = true)
    public String imageURL;

    @NameInMap("MinHeight")
    @Validation(required = true)
    public Integer minHeight;

    @NameInMap("OutputProbability")
    @Validation(required = true)
    public Boolean outputProbability;

    public static RecognizeCharacterRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeCharacterRequest self = new RecognizeCharacterRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeCharacterRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

    public RecognizeCharacterRequest setMinHeight(Integer minHeight) {
        this.minHeight = minHeight;
        return this;
    }
    public Integer getMinHeight() {
        return this.minHeight;
    }

    public RecognizeCharacterRequest setOutputProbability(Boolean outputProbability) {
        this.outputProbability = outputProbability;
        return this;
    }
    public Boolean getOutputProbability() {
        return this.outputProbability;
    }

}
