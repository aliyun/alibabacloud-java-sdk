// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class DescribeDomainBasicConfigsRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("DomainKey")
    public String domainKey;

    @NameInMap("AccessType")
    public String accessType;

    @NameInMap("CloudNativeProductId")
    public Integer cloudNativeProductId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static DescribeDomainBasicConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainBasicConfigsRequest self = new DescribeDomainBasicConfigsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDomainBasicConfigsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeDomainBasicConfigsRequest setDomainKey(String domainKey) {
        this.domainKey = domainKey;
        return this;
    }
    public String getDomainKey() {
        return this.domainKey;
    }

    public DescribeDomainBasicConfigsRequest setAccessType(String accessType) {
        this.accessType = accessType;
        return this;
    }
    public String getAccessType() {
        return this.accessType;
    }

    public DescribeDomainBasicConfigsRequest setCloudNativeProductId(Integer cloudNativeProductId) {
        this.cloudNativeProductId = cloudNativeProductId;
        return this;
    }
    public Integer getCloudNativeProductId() {
        return this.cloudNativeProductId;
    }

    public DescribeDomainBasicConfigsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDomainBasicConfigsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDomainBasicConfigsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
