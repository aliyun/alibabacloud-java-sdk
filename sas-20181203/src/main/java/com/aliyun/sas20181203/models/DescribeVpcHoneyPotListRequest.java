// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVpcHoneyPotListRequest extends TeaModel {
    // The number of the page to return.
    @NameInMap("CurrentPage")
    public Integer currentPage;

    // Specifies whether the cloud honeypot feature is enabled for the VPC. Valid values:
    // 
    // *   **true**: yes
    // *   **false**: no
    @NameInMap("HoneyPotExistence")
    public Boolean honeyPotExistence;

    // The number of entries to return on each page. Default value: 20. If you leave this parameter empty, 20 entries are returned on each page.
    // 
    // >  We recommend that you do not leave this parameter empty.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The ID of the VPC on which the honeypot is deployed.
    // 
    // >  You can call the [DescribeVpcList](~~DescribeVpcList~~) operation to query the IDs of VPCs.
    @NameInMap("VpcId")
    public String vpcId;

    // The name of the VPC.
    // 
    // >  You can call the [DescribeVpcList](~~DescribeVpcList~~) operation to query the names of VPCs.
    @NameInMap("VpcName")
    public String vpcName;

    // The region ID of the VPC.
    // 
    // >  You can call the [DescribeVpcList](~~DescribeVpcList~~) operation to query the region IDs of VPCs.
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
