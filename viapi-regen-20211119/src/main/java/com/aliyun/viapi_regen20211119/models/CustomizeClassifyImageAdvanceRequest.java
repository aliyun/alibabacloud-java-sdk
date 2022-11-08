// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class CustomizeClassifyImageAdvanceRequest extends TeaModel {
    @NameInMap("ImageUrl")
    public java.io.InputStream imageUrlObject;

    @NameInMap("ServiceId")
    public String serviceId;

    public static CustomizeClassifyImageAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CustomizeClassifyImageAdvanceRequest self = new CustomizeClassifyImageAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public CustomizeClassifyImageAdvanceRequest setImageUrlObject(java.io.InputStream imageUrlObject) {
        this.imageUrlObject = imageUrlObject;
        return this;
    }
    public java.io.InputStream getImageUrlObject() {
        return this.imageUrlObject;
    }

    public CustomizeClassifyImageAdvanceRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

}
