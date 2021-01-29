// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeCharacterRequest extends TeaModel {
    @NameInMap("ImageType")
    public Integer imageType;

    @NameInMap("ImageURL")
    public String imageURL;

    @NameInMap("MinHeight")
    public Integer minHeight;

    @NameInMap("OutputProbability")
    public Boolean outputProbability;

    public static RecognizeCharacterRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeCharacterRequest self = new RecognizeCharacterRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeCharacterRequest setImageType(Integer imageType) {
        this.imageType = imageType;
        return this;
    }
    public Integer getImageType() {
        return this.imageType;
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
