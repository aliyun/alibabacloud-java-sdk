// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class ModifyImageShareStatusRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("ImageId")
    public String imageId;

    @NameInMap("Operation")
    public String operation;

    @NameInMap("RegionId")
    public String regionId;

    public static ModifyImageShareStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyImageShareStatusRequest self = new ModifyImageShareStatusRequest();
        return TeaModel.build(map, self);
    }

    public ModifyImageShareStatusRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyImageShareStatusRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public ModifyImageShareStatusRequest setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

    public ModifyImageShareStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
