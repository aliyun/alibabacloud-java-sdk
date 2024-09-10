// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVpcHoneyPotListRequest extends TeaModel {
    /**
     * <p>The number of the page to return.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>Specifies whether the cloud honeypot feature is enabled for the VPCs. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: yes</li>
     * <li><strong>false</strong>: no</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("HoneyPotExistence")
    public Boolean honeyPotExistence;

    /**
     * <p>The number of entries to return on each page. Default value: 20. If you leave this parameter empty, 20 entries are returned on each page.</p>
     * <blockquote>
     * <p>We recommend that you do not leave this parameter empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the VPC on which the honeypot is deployed.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeVpcList~~">DescribeVpcList</a> operation to query the IDs of VPCs.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vpc-d7o009q63fqy21r8u****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The name of the VPC.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeVpcList~~">DescribeVpcList</a> operation to query the names of VPCs.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>abcnet</p>
     */
    @NameInMap("VpcName")
    public String vpcName;

    /**
     * <p>The region ID of the VPC.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeVpcList~~">DescribeVpcList</a> operation to query the region IDs of VPCs.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ap-southeast-2</p>
     */
    @NameInMap("VpcRegionId")
    public String vpcRegionId;

    public static DescribeVpcHoneyPotListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcHoneyPotListRequest self = new DescribeVpcHoneyPotListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVpcHoneyPotListRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeVpcHoneyPotListRequest setHoneyPotExistence(Boolean honeyPotExistence) {
        this.honeyPotExistence = honeyPotExistence;
        return this;
    }
    public Boolean getHoneyPotExistence() {
        return this.honeyPotExistence;
    }

    public DescribeVpcHoneyPotListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeVpcHoneyPotListRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public DescribeVpcHoneyPotListRequest setVpcName(String vpcName) {
        this.vpcName = vpcName;
        return this;
    }
    public String getVpcName() {
        return this.vpcName;
    }

    public DescribeVpcHoneyPotListRequest setVpcRegionId(String vpcRegionId) {
        this.vpcRegionId = vpcRegionId;
        return this;
    }
    public String getVpcRegionId() {
        return this.vpcRegionId;
    }

}
