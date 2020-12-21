// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class UploadImageRequest extends TeaModel {
    @NameInMap("ImageUrl")
    public String imageUrl;

    public static UploadImageRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadImageRequest self = new UploadImageRequest();
        return TeaModel.build(map, self);
    }

    public UploadImageRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

}
