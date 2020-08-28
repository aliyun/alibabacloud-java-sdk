// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeDrivingLicenseRequest extends TeaModel {
    @NameInMap("ImageURL")
    @Validation(required = true)
    public String imageURL;

    @NameInMap("Side")
    @Validation(required = true)
    public String side;

    public static RecognizeDrivingLicenseRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeDrivingLicenseRequest self = new RecognizeDrivingLicenseRequest();
        return TeaModel.build(map, self);
    }

}
