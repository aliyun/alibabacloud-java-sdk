// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class DetectIPCObjectRequest extends TeaModel {
    // 图片URL地址
    @NameInMap("ImageURL")
    public String imageURL;

    public static DetectIPCObjectRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectIPCObjectRequest self = new DetectIPCObjectRequest();
        return TeaModel.build(map, self);
    }

    public DetectIPCObjectRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

}
