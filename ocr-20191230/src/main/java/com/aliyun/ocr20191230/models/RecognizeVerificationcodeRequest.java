// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeVerificationcodeRequest extends TeaModel {
    @NameInMap("ImageURL")
    @Validation(required = true)
    public String imageURL;

    public static RecognizeVerificationcodeRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeVerificationcodeRequest self = new RecognizeVerificationcodeRequest();
        return TeaModel.build(map, self);
    }

}
