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

    public RecognizeDriverLicenseAdvanceRequest setImageURLObject(java.io.InputStream imageURLObject) {
        this.imageURLObject = imageURLObject;
        return this;
    }
    public java.io.InputStream getImageURLObject() {
        return this.imageURLObject;
    }

    public RecognizeDriverLicenseAdvanceRequest setSide(String side) {
        this.side = side;
        return this;
    }
    public String getSide() {
        return this.side;
    }

}
