// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class DescribeWorkZonesRequest extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("ZoneIdList")
    public java.util.List<String> zoneIdList;

    @NameInMap("ZoneNameList")
    public java.util.List<String> zoneNameList;

    public static DescribeWorkZonesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeWorkZonesRequest self = new DescribeWorkZonesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeWorkZonesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeWorkZonesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeWorkZonesRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public DescribeWorkZonesRequest setZoneIdList(java.util.List<String> zoneIdList) {
        this.zoneIdList = zoneIdList;
        return this;
    }
    public java.util.List<String> getZoneIdList() {
        return this.zoneIdList;
    }

    public DescribeWorkZonesRequest setZoneNameList(java.util.List<String> zoneNameList) {
        this.zoneNameList = zoneNameList;
        return this;
    }
    public java.util.List<String> getZoneNameList() {
        return this.zoneNameList;
    }

}
