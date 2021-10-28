// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeGatewaysTagsRequest extends TeaModel {
    @NameInMap("GatewayIds")
    public String gatewayIds;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("StorageBundleId")
    public String storageBundleId;

    @NameInMap("TagCategory")
    public String tagCategory;

    public static DescribeGatewaysTagsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGatewaysTagsRequest self = new DescribeGatewaysTagsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeGatewaysTagsRequest setGatewayIds(String gatewayIds) {
        this.gatewayIds = gatewayIds;
        return this;
    }
    public String getGatewayIds() {
        return this.gatewayIds;
    }

    public DescribeGatewaysTagsRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeGatewaysTagsRequest setStorageBundleId(String storageBundleId) {
        this.storageBundleId = storageBundleId;
        return this;
    }
    public String getStorageBundleId() {
        return this.storageBundleId;
    }

    public DescribeGatewaysTagsRequest setTagCategory(String tagCategory) {
        this.tagCategory = tagCategory;
        return this;
    }
    public String getTagCategory() {
        return this.tagCategory;
    }

}
