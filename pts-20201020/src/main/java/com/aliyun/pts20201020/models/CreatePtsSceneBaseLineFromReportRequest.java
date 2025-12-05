// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class CreatePtsSceneBaseLineFromReportRequest extends TeaModel {
    /**
     * <p>The ID of the report. For more information, see the <a href="https://help.aliyun.com/document_detail/201321.html">table</a> provided in this topic.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>HNB78HB</p>
     */
    @NameInMap("ReportId")
    public String reportId;

    /**
     * <p>The ID of the scene. For more information, see the <a href="https://help.aliyun.com/document_detail/201321.html">table</a> provided in this topic.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>VCB78HB</p>
     */
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
