// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class DescribeDeviceSeatsRequest extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SerialNo")
    public String serialNo;

    @NameInMap("SerialNoList")
    public java.util.List<String> serialNoList;

    @NameInMap("SiteId")
    public String siteId;

    @NameInMap("TenantId")
    public String tenantId;

    public static DescribeDeviceSeatsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeviceSeatsRequest self = new DescribeDeviceSeatsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDeviceSeatsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDeviceSeatsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDeviceSeatsRequest setSerialNo(String serialNo) {
        this.serialNo = serialNo;
        return this;
    }
    public String getSerialNo() {
        return this.serialNo;
    }

    public DescribeDeviceSeatsRequest setSerialNoList(java.util.List<String> serialNoList) {
        this.serialNoList = serialNoList;
        return this;
    }
    public java.util.List<String> getSerialNoList() {
        return this.serialNoList;
    }

    public DescribeDeviceSeatsRequest setSiteId(String siteId) {
        this.siteId = siteId;
        return this;
    }
    public String getSiteId() {
        return this.siteId;
    }

    public DescribeDeviceSeatsRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
