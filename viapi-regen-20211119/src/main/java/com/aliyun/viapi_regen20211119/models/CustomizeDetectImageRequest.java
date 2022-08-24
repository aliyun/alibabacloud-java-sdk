// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class CustomizeDetectImageRequest extends TeaModel {
    @NameInMap("ImageUrl")
    public String imageUrl;

    @NameInMap("ServiceId")
    public String serviceId;

    public static CustomizeDetectImageRequest build(java.util.Map<String, ?> map) throws Exception {
        CustomizeDetectImageRequest self = new CustomizeDetectImageRequest();
        return TeaModel.build(map, self);
    }

    public CustomizeDetectImageRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public CustomizeDetectImageRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

}
