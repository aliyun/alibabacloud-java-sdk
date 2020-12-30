// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class DetectWhiteBaseImageRequest extends TeaModel {
    @NameInMap("ImageURL")
    public String imageURL;

    public static DetectWhiteBaseImageRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectWhiteBaseImageRequest self = new DetectWhiteBaseImageRequest();
        return TeaModel.build(map, self);
    }

    public DetectWhiteBaseImageRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

}
