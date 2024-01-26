// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20181111.models;

import com.aliyun.tea.*;

public class QueryPlanStatusRequest extends TeaModel {
    @NameInMap("ReportId")
    public Long reportId;

    @NameInMap("SceneId")
    public Long sceneId;

    public static QueryPlanStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryPlanStatusRequest self = new QueryPlanStatusRequest();
        return TeaModel.build(map, self);
    }

    public QueryPlanStatusRequest setReportId(Long reportId) {
        this.reportId = reportId;
        return this;
    }
    public Long getReportId() {
        return this.reportId;
    }

    public QueryPlanStatusRequest setSceneId(Long sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public Long getSceneId() {
        return this.sceneId;
    }

}
