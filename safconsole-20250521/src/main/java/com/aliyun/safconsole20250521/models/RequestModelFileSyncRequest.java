// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safconsole20250521.models;

import com.aliyun.tea.*;

public class RequestModelFileSyncRequest extends TeaModel {
    /**
     * <p>Project ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>01</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    public static RequestModelFileSyncRequest build(java.util.Map<String, ?> map) throws Exception {
        RequestModelFileSyncRequest self = new RequestModelFileSyncRequest();
        return TeaModel.build(map, self);
    }

    public RequestModelFileSyncRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
