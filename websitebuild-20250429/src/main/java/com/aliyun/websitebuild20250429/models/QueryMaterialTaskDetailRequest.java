// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class QueryMaterialTaskDetailRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c3r127e325at9yd</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static QueryMaterialTaskDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMaterialTaskDetailRequest self = new QueryMaterialTaskDetailRequest();
        return TeaModel.build(map, self);
    }

    public QueryMaterialTaskDetailRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
