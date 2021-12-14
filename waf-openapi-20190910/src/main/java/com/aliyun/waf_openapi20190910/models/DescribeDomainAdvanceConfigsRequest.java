// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class DescribeDomainAdvanceConfigsRequest extends TeaModel {
    @NameInMap("DomainList")
    public String domainList;

    @NameInMap("InstanceId")
    public String instanceId;

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

    public DescribeDomainAdvanceConfigsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
