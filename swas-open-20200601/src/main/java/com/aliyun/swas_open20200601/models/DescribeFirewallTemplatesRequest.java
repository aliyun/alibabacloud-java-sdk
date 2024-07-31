// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class DescribeFirewallTemplatesRequest extends TeaModel {
    /**
     * <p>The IDs of the firewall templates.</p>
     */
    @NameInMap("FirewallTemplateId")
    public java.util.List<String> firewallTemplateId;

    /**
     * <p>The name of the firewall template.</p>
     * 
     * <strong>example:</strong>
     * <p>testName</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The page number.</p>
     * <p>Pages start from page 1.</p>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID of the simple application server. You can call the <a href="https://help.aliyun.com/document_detail/189315.html">ListRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeFirewallTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFirewallTemplatesRequest self = new DescribeFirewallTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFirewallTemplatesRequest setFirewallTemplateId(java.util.List<String> firewallTemplateId) {
        this.firewallTemplateId = firewallTemplateId;
        return this;
    }
    public java.util.List<String> getFirewallTemplateId() {
        return this.firewallTemplateId;
    }

    public DescribeFirewallTemplatesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeFirewallTemplatesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeFirewallTemplatesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeFirewallTemplatesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
