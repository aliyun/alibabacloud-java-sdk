// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeBusinessLicenseRequest extends TeaModel {
    @NameInMap("ImageURL")
    public String imageURL;

    public static RecognizeBusinessLicenseRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeBusinessLicenseRequest self = new RecognizeBusinessLicenseRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeBusinessLicenseRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

}
