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

}
