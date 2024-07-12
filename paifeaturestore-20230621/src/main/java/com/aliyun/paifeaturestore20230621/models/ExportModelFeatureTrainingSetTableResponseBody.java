// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class ExportModelFeatureTrainingSetTableResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0FBBE454-9BD1-5D8F-9129-D14DB7FAFE0B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TaskId")
    public String taskId;

    public static ExportModelFeatureTrainingSetTableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExportModelFeatureTrainingSetTableResponseBody self = new ExportModelFeatureTrainingSetTableResponseBody();
        return TeaModel.build(map, self);
    }

    public ExportModelFeatureTrainingSetTableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExportModelFeatureTrainingSetTableResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
