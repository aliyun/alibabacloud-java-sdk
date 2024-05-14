// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class DescribeDomainAdvanceConfigsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DomainList")
    public String domainList;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static DescribeDomainAdvanceConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainAdvanceConfigsRequest self = new DescribeDomainAdvanceConfigsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDomainAdvanceConfigsRequest setDomainList(String domainList) {
        this.domainList = domainList;
        return this;
    }
    public String getDomainList() {
        return this.domainList;
    }

    public DescribeDomainAdvanceConfigsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeDomainAdvanceConfigsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDomainAdvanceConfigsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
