// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class CustomizeClassifyImageRequest extends TeaModel {
    @NameInMap("ImageUrl")
    public String imageUrl;

    @NameInMap("ServiceId")
    public String serviceId;

    public static CustomizeClassifyImageRequest build(java.util.Map<String, ?> map) throws Exception {
        CustomizeClassifyImageRequest self = new CustomizeClassifyImageRequest();
        return TeaModel.build(map, self);
    }

    public CustomizeClassifyImageRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public CustomizeClassifyImageRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

}
