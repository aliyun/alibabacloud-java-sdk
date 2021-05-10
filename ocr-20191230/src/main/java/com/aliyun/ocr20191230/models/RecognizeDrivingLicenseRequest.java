// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeDrivingLicenseRequest extends TeaModel {
    @NameInMap("ImageURL")
    public String imageURL;

    @NameInMap("Side")
    public String side;

    public static RecognizeDrivingLicenseRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeDrivingLicenseRequest self = new RecognizeDrivingLicenseRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeDrivingLicenseRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

    public RecognizeDrivingLicenseRequest setSide(String side) {
        this.side = side;
        return this;
    }
    public String getSide() {
        return this.side;
    }

}
