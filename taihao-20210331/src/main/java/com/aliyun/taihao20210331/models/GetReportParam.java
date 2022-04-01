// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class GetReportParam extends TeaModel {
    // cluster id
    @NameInMap("clusterId")
    public String clusterId;

    // report id
    @NameInMap("reportId")
    public String reportId;

    // uid
    @NameInMap("resourceOwnerUid")
    public String resourceOwnerUid;

    public static GetReportParam build(java.util.Map<String, ?> map) throws Exception {
        GetReportParam self = new GetReportParam();
        return TeaModel.build(map, self);
    }

    public GetReportParam setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetReportParam setReportId(String reportId) {
        this.reportId = reportId;
        return this;
    }
    public String getReportId() {
        return this.reportId;
    }

    public GetReportParam setResourceOwnerUid(String resourceOwnerUid) {
        this.resourceOwnerUid = resourceOwnerUid;
        return this;
    }
    public String getResourceOwnerUid() {
        return this.resourceOwnerUid;
    }

}
