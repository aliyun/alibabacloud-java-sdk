// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeTakeoutOrderAdvanceRequest extends TeaModel {
    @NameInMap("ImageURLObject")
    @Validation(required = true)
    public java.io.InputStream imageURLObject;

    public static RecognizeTakeoutOrderAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeTakeoutOrderAdvanceRequest self = new RecognizeTakeoutOrderAdvanceRequest();
        return TeaModel.build(map, self);
    }

}
