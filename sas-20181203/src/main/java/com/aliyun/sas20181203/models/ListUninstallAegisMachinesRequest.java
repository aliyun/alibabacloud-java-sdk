// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListUninstallAegisMachinesRequest extends TeaModel {
    // The number of the page to return. Default value: **1**.
    @NameInMap("CurrentPage")
    public Integer currentPage;

    // The operating system of the server.
    // 
    // >  The value of this parameter is the value of the Values parameter that is returned by calling the [DescribeCriteria](~~DescribeCriteria~~) operation. If the value of the **Name** parameter in the response is **osType**, the value of the **Values** parameter indicates an operating system.
    @NameInMap("Os")
    public String os;

    // The number of entries to return on each page. Default value: **5**.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The region in which the server resides.
    // 
    // >  The value of this parameter is the value of the Values parameter that is returned by calling the [DescribeCriteria](~~DescribeCriteria~~) operation. If the value of the **Name** parameter in the response is **regionId**, the value of the **Values** parameter indicates a region ID.
    @NameInMap("RegionIdStr")
    public String regionIdStr;

    // The region in which the server resides.
    // 
    // >  The value of this parameter is the value of the Values parameter that is returned by calling the [DescribeCriteria](~~DescribeCriteria~~) operation. If the value of the **Name** parameter in the response is **regionId**, the value of the **Values** parameter indicates a region ID.
    @NameInMap("RegionNo")
    public String regionNo;

    // The information about the server that you want to query. The value can be the name or the public IP address of the server.
    @NameInMap("Remark")
    public String remark;

    // The source IP address of the request.
    @NameInMap("SourceIp")
    public String sourceIp;

    // The source of the server. Valid values:
    // 
    // *   **0**: an asset provided by Alibaba Cloud.
    // *   **1**: a third-party cloud server
    // *   **2**: a server in a data center
    // *   **3**, **4**, **5**, and **7**: other cloud asset
    // *   **8**: a lightweight asset
    @NameInMap("Vendor")
    public Integer vendor;

    public static ListUninstallAegisMachinesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUninstallAegisMachinesRequest self = new ListUninstallAegisMachinesRequest();
        return TeaModel.build(map, self);
    }

    public ListUninstallAegisMachinesRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListUninstallAegisMachinesRequest setOs(String os) {
        this.os = os;
        return this;
    }
    public String getOs() {
        return this.os;
    }

    public ListUninstallAegisMachinesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListUninstallAegisMachinesRequest setRegionIdStr(String regionIdStr) {
        this.regionIdStr = regionIdStr;
        return this;
    }
    public String getRegionIdStr() {
        return this.regionIdStr;
    }

    public ListUninstallAegisMachinesRequest setRegionNo(String regionNo) {
        this.regionNo = regionNo;
        return this;
    }
    public String getRegionNo() {
        return this.regionNo;
    }

    public ListUninstallAegisMachinesRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public ListUninstallAegisMachinesRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public ListUninstallAegisMachinesRequest setVendor(Integer vendor) {
        this.vendor = vendor;
        return this;
    }
    public Integer getVendor() {
        return this.vendor;
    }

}
