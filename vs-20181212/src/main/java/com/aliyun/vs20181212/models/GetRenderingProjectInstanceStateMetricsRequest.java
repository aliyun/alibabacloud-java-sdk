// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class GetRenderingProjectInstanceStateMetricsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>project-422bc38dfgh5eb44149f135ef76304f63b</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    public static GetRenderingProjectInstanceStateMetricsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRenderingProjectInstanceStateMetricsRequest self = new GetRenderingProjectInstanceStateMetricsRequest();
        return TeaModel.build(map, self);
    }

    public GetRenderingProjectInstanceStateMetricsRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
