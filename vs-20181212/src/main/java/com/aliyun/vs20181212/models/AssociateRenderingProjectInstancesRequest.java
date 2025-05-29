// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class AssociateRenderingProjectInstancesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>project-422bc38dfgh5eb44149f135ef76304f63b</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RenderingInstanceIds")
    public java.util.List<String> renderingInstanceIds;

    public static AssociateRenderingProjectInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        AssociateRenderingProjectInstancesRequest self = new AssociateRenderingProjectInstancesRequest();
        return TeaModel.build(map, self);
    }

    public AssociateRenderingProjectInstancesRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public AssociateRenderingProjectInstancesRequest setRenderingInstanceIds(java.util.List<String> renderingInstanceIds) {
        this.renderingInstanceIds = renderingInstanceIds;
        return this;
    }
    public java.util.List<String> getRenderingInstanceIds() {
        return this.renderingInstanceIds;
    }

}
