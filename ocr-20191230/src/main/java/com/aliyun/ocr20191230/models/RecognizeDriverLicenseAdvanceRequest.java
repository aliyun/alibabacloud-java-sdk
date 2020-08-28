// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeDriverLicenseAdvanceRequest extends TeaModel {
    @NameInMap("ImageURLObject")
    @Validation(required = true)
    public java.io.InputStream imageURLObject;

    @NameInMap("Side")
    @Validation(required = true)
    public String side;

    public static RecognizeDriverLicenseAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeDriverLicenseAdvanceRequest self = new RecognizeDriverLicenseAdvanceRequest();
        return TeaModel.build(map, self);
    }

}
