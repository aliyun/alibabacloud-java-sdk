// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.threedvision20210131.models;

import com.aliyun.tea.*;

public class ReconstructBodyBySingleImageRequest extends TeaModel {
    // A short description of struct
    @NameInMap("ImageURL")
    public String imageURL;

    public static ReconstructBodyBySingleImageRequest build(java.util.Map<String, ?> map) throws Exception {
        ReconstructBodyBySingleImageRequest self = new ReconstructBodyBySingleImageRequest();
        return TeaModel.build(map, self);
    }

    public ReconstructBodyBySingleImageRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

}
