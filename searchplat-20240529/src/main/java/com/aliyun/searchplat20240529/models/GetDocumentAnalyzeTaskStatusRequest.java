// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240529.models;

import com.aliyun.tea.*;

public class GetDocumentAnalyzeTaskStatusRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("task_id")
    public String taskId;

    public static GetDocumentAnalyzeTaskStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDocumentAnalyzeTaskStatusRequest self = new GetDocumentAnalyzeTaskStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetDocumentAnalyzeTaskStatusRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
