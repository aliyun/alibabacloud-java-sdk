// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class DropProjectRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3242****</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    public static DropProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        DropProjectRequest self = new DropProjectRequest();
        return TeaModel.build(map, self);
    }

    public DropProjectRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
