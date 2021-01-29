// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeBusinessLicenseRequest extends TeaModel {
    @NameInMap("ImageType")
    public Integer imageType;

    @NameInMap("ImageURL")
    public String imageURL;

    public static RecognizeBusinessLicenseRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeBusinessLicenseRequest self = new RecognizeBusinessLicenseRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeBusinessLicenseRequest setImageType(Integer imageType) {
        this.imageType = imageType;
        return this;
    }
    public Integer getImageType() {
        return this.imageType;
    }

    public RecognizeBusinessLicenseRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

}
