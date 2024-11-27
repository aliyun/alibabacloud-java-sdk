// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListNetworkDomainsRequest extends TeaModel {
    /**
     * <p>The bastion host ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to query the bastion host ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bastionhost-cn-tl329pvu70x</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the network domain.</p>
     */
    @NameInMap("NetworkDomainName")
    public String networkDomainName;

    /**
     * <p>The connection mode of the network domain. Valid values:</p>
     * <ul>
     * <li><strong>Direct</strong></li>
     * <li><strong>Proxy</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Proxy</p>
     */
    @NameInMap("NetworkDomainType")
    public String networkDomainType;

    /**
     * <p>The page number. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The number of entries per page.\
     * Valid values: 1 to 100. Default value: 20. If you leave this parameter empty, 20 entries are returned on each page.</p>
     * <blockquote>
     * <p>We recommend that you do not leave this parameter empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The region ID of the bastion host.</p>
     * <blockquote>
     * <p>For more information about the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
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
