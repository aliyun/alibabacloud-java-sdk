// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeDashboardRequest extends TeaModel {
    @NameInMap("BackendBucketRegionId")
    public String backendBucketRegionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribeDashboardRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDashboardRequest self = new DescribeDashboardRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDashboardRequest setBackendBucketRegionId(String backendBucketRegionId) {
        this.backendBucketRegionId = backendBucketRegionId;
        return this;
    }
    public String getBackendBucketRegionId() {
        return this.backendBucketRegionId;
    }

    public DescribeDashboardRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeDashboardRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
