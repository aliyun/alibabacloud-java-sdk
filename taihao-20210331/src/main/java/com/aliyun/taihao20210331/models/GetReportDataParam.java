// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class GetReportDataParam extends TeaModel {
    // cluster id
    @NameInMap("clusterId")
    public String clusterId;

    // is deatil
    @NameInMap("detailData")
    public Boolean detailData;

    // view name
    @NameInMap("name")
    public String name;

    // report Id
    @NameInMap("reportId")
    public String reportId;

    // user id
    @NameInMap("resourceOwnerUid")
    public String resourceOwnerUid;

    public static GetReportDataParam build(java.util.Map<String, ?> map) throws Exception {
        GetReportDataParam self = new GetReportDataParam();
        return TeaModel.build(map, self);
    }

    public GetReportDataParam setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetReportDataParam setDetailData(Boolean detailData) {
        this.detailData = detailData;
        return this;
    }
    public Boolean getDetailData() {
        return this.detailData;
    }

    public GetReportDataParam setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetReportDataParam setReportId(String reportId) {
        this.reportId = reportId;
        return this;
    }
    public String getReportId() {
        return this.reportId;
    }

    public GetReportDataParam setResourceOwnerUid(String resourceOwnerUid) {
        this.resourceOwnerUid = resourceOwnerUid;
        return this;
    }
    public String getResourceOwnerUid() {
        return this.resourceOwnerUid;
    }

}
