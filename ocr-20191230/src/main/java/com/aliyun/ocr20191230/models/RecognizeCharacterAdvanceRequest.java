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

}
