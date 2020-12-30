// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class DetectObjectRequest extends TeaModel {
    @NameInMap("ImageURL")
    public String imageURL;

    public static DetectObjectRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectObjectRequest self = new DetectObjectRequest();
        return TeaModel.build(map, self);
    }

    public DetectObjectRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

}
