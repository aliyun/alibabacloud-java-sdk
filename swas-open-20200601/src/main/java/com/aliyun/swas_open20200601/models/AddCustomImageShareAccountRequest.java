// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class AddCustomImageShareAccountRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Account")
    public java.util.List<Long> account;

    /**
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>m-saacssasc****</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static AddCustomImageShareAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        AddCustomImageShareAccountRequest self = new AddCustomImageShareAccountRequest();
        return TeaModel.build(map, self);
    }

    public AddCustomImageShareAccountRequest setAccount(java.util.List<Long> account) {
        this.account = account;
        return this;
    }
    public java.util.List<Long> getAccount() {
        return this.account;
    }

    public AddCustomImageShareAccountRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AddCustomImageShareAccountRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public AddCustomImageShareAccountRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
