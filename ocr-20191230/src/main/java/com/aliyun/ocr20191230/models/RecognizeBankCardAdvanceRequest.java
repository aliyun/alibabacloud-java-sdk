// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeBankCardAdvanceRequest extends TeaModel {
    @NameInMap("ImageURLObject")
    @Validation(required = true)
    public java.io.InputStream imageURLObject;

    public static RecognizeBankCardAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeBankCardAdvanceRequest self = new RecognizeBankCardAdvanceRequest();
        return TeaModel.build(map, self);
    }

}
