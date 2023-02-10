// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVpcHoneyPotListRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("HoneyPotExistence")
    public Boolean honeyPotExistence;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("VpcName")
    public String vpcName;

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
