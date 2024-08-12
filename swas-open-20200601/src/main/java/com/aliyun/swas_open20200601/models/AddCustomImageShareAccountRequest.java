// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class AddCustomImageShareAccountRequest extends TeaModel {
    /**
     * <p>The IDs of the Alibaba Cloud accounts with which you want to share the custom image.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Account")
    public java.util.List<Long> account;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The <strong>token</strong> can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the custom image.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>m-saacssasc****</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The region ID of the simple application server. You can call the <a href="https://help.aliyun.com/document_detail/189315.html">ListRegions</a> operation to query the most recent region list.</p>
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
