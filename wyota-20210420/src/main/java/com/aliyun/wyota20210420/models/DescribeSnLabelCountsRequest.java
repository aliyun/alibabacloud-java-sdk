// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class DescribeSnLabelCountsRequest extends TeaModel {
    @NameInMap("LabelList")
    public java.util.List<String> labelList;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("ZoneId")
    public String zoneId;

    @NameInMap("ZoneName")
    public String zoneName;

    public static DescribeSnLabelCountsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSnLabelCountsRequest self = new DescribeSnLabelCountsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSnLabelCountsRequest setLabelList(java.util.List<String> labelList) {
        this.labelList = labelList;
        return this;
    }
    public java.util.List<String> getLabelList() {
        return this.labelList;
    }

    public DescribeSnLabelCountsRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public DescribeSnLabelCountsRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public DescribeSnLabelCountsRequest setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }
    public String getZoneName() {
        return this.zoneName;
    }

}
