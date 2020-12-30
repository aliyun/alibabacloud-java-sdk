// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class DetectTransparentImageRequest extends TeaModel {
    @NameInMap("ImageURL")
    public String imageURL;

    public static DetectTransparentImageRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectTransparentImageRequest self = new DetectTransparentImageRequest();
        return TeaModel.build(map, self);
    }

    public DetectTransparentImageRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

}
