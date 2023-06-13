// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class ModifyImageShareStatusRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that it is unique among different requests. The token can only contain ASCII characters and cannot exceed 64 characters in length.**** For more information, see [How to ensure idempotence](~~25693~~).</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the image.</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>Valid values:</p>
     * <br>
     * <p>*   Share</p>
     * <p>*   UnShare</p>
     */
    @NameInMap("Operation")
    public String operation;

    /**
     * <p>The region ID of the custom image. You can call the [ListRegions](~~189315~~) operation to query the most recent region list.</p>
     */
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
