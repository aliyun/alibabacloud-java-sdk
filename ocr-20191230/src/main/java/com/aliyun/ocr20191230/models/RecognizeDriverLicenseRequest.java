// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeDriverLicenseRequest extends TeaModel {
    @NameInMap("ImageURL")
    @Validation(required = true)
    public String imageURL;

    @NameInMap("Side")
    @Validation(required = true)
    public String side;

    public static RecognizeDriverLicenseRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeDriverLicenseRequest self = new RecognizeDriverLicenseRequest();
        return TeaModel.build(map, self);
    }

}
