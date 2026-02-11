// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safconsole20250521.models;

import com.aliyun.tea.*;

public class CompleteModelingProjectRequest extends TeaModel {
    /**
     * <p>Project ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>01</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    public static CompleteModelingProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        CompleteModelingProjectRequest self = new CompleteModelingProjectRequest();
        return TeaModel.build(map, self);
    }

    public CompleteModelingProjectRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
