// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class PreloadPlayDeviceAbilityRequest extends TeaModel {
    @NameInMap("Brand")
    public String brand;

    @NameInMap("ResourceRealOwnerId")
    public Long resourceRealOwnerId;

    public static PreloadPlayDeviceAbilityRequest build(java.util.Map<String, ?> map) throws Exception {
        PreloadPlayDeviceAbilityRequest self = new PreloadPlayDeviceAbilityRequest();
        return TeaModel.build(map, self);
    }

    public PreloadPlayDeviceAbilityRequest setBrand(String brand) {
        this.brand = brand;
        return this;
    }
    public String getBrand() {
        return this.brand;
    }

    public PreloadPlayDeviceAbilityRequest setResourceRealOwnerId(Long resourceRealOwnerId) {
        this.resourceRealOwnerId = resourceRealOwnerId;
        return this;
    }
    public Long getResourceRealOwnerId() {
        return this.resourceRealOwnerId;
    }

}
