// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class GetMultiAccountResourceConfigurationRequest extends TeaModel {
    @NameInMap("AccountId")
    public String accountId;

    @NameInMap("ResourceId")
    public String resourceId;

    @NameInMap("ResourceRegionId")
    public String resourceRegionId;

    @NameInMap("ResourceType")
    public String resourceType;

    public static GetMultiAccountResourceConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMultiAccountResourceConfigurationRequest self = new GetMultiAccountResourceConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public GetMultiAccountResourceConfigurationRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public GetMultiAccountResourceConfigurationRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public GetMultiAccountResourceConfigurationRequest setResourceRegionId(String resourceRegionId) {
        this.resourceRegionId = resourceRegionId;
        return this;
    }
    public String getResourceRegionId() {
        return this.resourceRegionId;
    }

    public GetMultiAccountResourceConfigurationRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
