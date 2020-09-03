// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeCharacterAdvanceRequest extends TeaModel {
    @NameInMap("ImageURLObject")
    @Validation(required = true)
    public java.io.InputStream imageURLObject;

    @NameInMap("MinHeight")
    @Validation(required = true)
    public Integer minHeight;

    @NameInMap("OutputProbability")
    @Validation(required = true)
    public Boolean outputProbability;

    public static RecognizeCharacterAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeCharacterAdvanceRequest self = new RecognizeCharacterAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeCharacterAdvanceRequest setImageURLObject(java.io.InputStream imageURLObject) {
        this.imageURLObject = imageURLObject;
        return this;
    }
    public java.io.InputStream getImageURLObject() {
        return this.imageURLObject;
    }

    public RecognizeCharacterAdvanceRequest setMinHeight(Integer minHeight) {
        this.minHeight = minHeight;
        return this;
    }
    public Integer getMinHeight() {
        return this.minHeight;
    }

    public RecognizeCharacterAdvanceRequest setOutputProbability(Boolean outputProbability) {
        this.outputProbability = outputProbability;
        return this;
    }
    public Boolean getOutputProbability() {
        return this.outputProbability;
    }

}
