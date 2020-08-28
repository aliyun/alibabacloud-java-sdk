// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeBankCardRequest extends TeaModel {
    @NameInMap("ImageURL")
    @Validation(required = true)
    public String imageURL;

    public static RecognizeBankCardRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeBankCardRequest self = new RecognizeBankCardRequest();
        return TeaModel.build(map, self);
    }

}
