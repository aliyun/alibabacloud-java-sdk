// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeCharacterRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/ocr/RecognizeCharacter/RecognizeCharacter5.jpg">http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/ocr/RecognizeCharacter/RecognizeCharacter5.jpg</a></p>
     */
    @NameInMap("ImageURL")
    public String imageURL;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MinHeight")
    public Integer minHeight;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("OutputProbability")
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
