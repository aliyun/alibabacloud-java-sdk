// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeBusinessCardRequest extends TeaModel {
    @NameInMap("ImageURL")
    @Validation(required = true)
    public String imageURL;

    public static RecognizeBusinessCardRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeBusinessCardRequest self = new RecognizeBusinessCardRequest();
        return TeaModel.build(map, self);
    }

}
