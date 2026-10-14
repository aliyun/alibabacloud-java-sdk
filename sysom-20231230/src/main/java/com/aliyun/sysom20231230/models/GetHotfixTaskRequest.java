// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetHotfixTaskRequest extends TeaModel {
    /**
     * <p>The ID of the asynchronous task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hotfix-da3dcc0b-5019-4b59-b12f-2e500da9083c</p>
     */
    @NameInMap("taskId")
    public String taskId;

    public static GetHotfixTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHotfixTaskRequest self = new GetHotfixTaskRequest();
        return TeaModel.build(map, self);
    }

    public GetHotfixTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
