// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeLicensePlateAdvanceRequest extends TeaModel {
    @NameInMap("ImageURLObject")
    @Validation(required = true)
    public java.io.InputStream imageURLObject;

    public static RecognizeLicensePlateAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeLicensePlateAdvanceRequest self = new RecognizeLicensePlateAdvanceRequest();
        return TeaModel.build(map, self);
    }

}
