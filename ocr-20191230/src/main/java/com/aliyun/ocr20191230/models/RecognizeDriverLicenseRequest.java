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

    public RecognizeDriverLicenseRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

    public RecognizeDriverLicenseRequest setSide(String side) {
        this.side = side;
        return this;
    }
    public String getSide() {
        return this.side;
    }

}
