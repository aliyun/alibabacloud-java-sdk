// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListNetworkDomainsRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("NetworkDomainName")
    public String networkDomainName;

    @NameInMap("NetworkDomainType")
    public String networkDomainType;

    @NameInMap("PageNumber")
    public String pageNumber;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("RegionId")
    public String regionId;

    public static ListNetworkDomainsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListNetworkDomainsRequest self = new ListNetworkDomainsRequest();
        return TeaModel.build(map, self);
    }

    public ListNetworkDomainsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListNetworkDomainsRequest setNetworkDomainName(String networkDomainName) {
        this.networkDomainName = networkDomainName;
        return this;
    }
    public String getNetworkDomainName() {
        return this.networkDomainName;
    }

    public ListNetworkDomainsRequest setNetworkDomainType(String networkDomainType) {
        this.networkDomainType = networkDomainType;
        return this;
    }
    public String getNetworkDomainType() {
        return this.networkDomainType;
    }

    public ListNetworkDomainsRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ListNetworkDomainsRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListNetworkDomainsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
