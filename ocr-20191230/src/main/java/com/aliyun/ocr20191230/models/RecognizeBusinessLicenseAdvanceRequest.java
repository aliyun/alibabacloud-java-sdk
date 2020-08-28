// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeBusinessLicenseAdvanceRequest extends TeaModel {
    @NameInMap("ImageURLObject")
    @Validation(required = true)
    public java.io.InputStream imageURLObject;

    public static RecognizeBusinessLicenseAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeBusinessLicenseAdvanceRequest self = new RecognizeBusinessLicenseAdvanceRequest();
        return TeaModel.build(map, self);
    }

}
