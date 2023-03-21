// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeOfflineMachinesRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Os")
    public String os;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionIdStr")
    public String regionIdStr;

    @NameInMap("RegionNo")
    public String regionNo;

    @NameInMap("Remark")
    public String remark;

    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Vendor")
    public Integer vendor;

    public static DescribeOfflineMachinesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeOfflineMachinesRequest self = new DescribeOfflineMachinesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeOfflineMachinesRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeOfflineMachinesRequest setOs(String os) {
        this.os = os;
        return this;
    }
    public String getOs() {
        return this.os;
    }

    public DescribeOfflineMachinesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeOfflineMachinesRequest setRegionIdStr(String regionIdStr) {
        this.regionIdStr = regionIdStr;
        return this;
    }
    public String getRegionIdStr() {
        return this.regionIdStr;
    }

    public DescribeOfflineMachinesRequest setRegionNo(String regionNo) {
        this.regionNo = regionNo;
        return this;
    }
    public String getRegionNo() {
        return this.regionNo;
    }

    public DescribeOfflineMachinesRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public DescribeOfflineMachinesRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeOfflineMachinesRequest setVendor(Integer vendor) {
        this.vendor = vendor;
        return this;
    }
    public Integer getVendor() {
        return this.vendor;
    }

}
