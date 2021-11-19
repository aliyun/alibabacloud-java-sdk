// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class CreatePtsSceneBaseLineFromReportRequest extends TeaModel {
    @NameInMap("ReportId")
    public String reportId;

    @NameInMap("SceneId")
    public String sceneId;

    public static CreatePtsSceneBaseLineFromReportRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePtsSceneBaseLineFromReportRequest self = new CreatePtsSceneBaseLineFromReportRequest();
        return TeaModel.build(map, self);
    }

    public CreatePtsSceneBaseLineFromReportRequest setReportId(String reportId) {
        this.reportId = reportId;
        return this;
    }
    public String getReportId() {
        return this.reportId;
    }

    public CreatePtsSceneBaseLineFromReportRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

}
