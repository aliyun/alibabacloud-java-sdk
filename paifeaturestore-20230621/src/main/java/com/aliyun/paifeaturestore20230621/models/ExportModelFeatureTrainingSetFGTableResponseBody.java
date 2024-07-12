// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class ExportModelFeatureTrainingSetFGTableResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <strong>example:</strong>
     * <p>514F82AF-3C04-5C3D-8F38-A11261BF37B0</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ExportModelFeatureTrainingSetFGTableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExportModelFeatureTrainingSetFGTableResponseBody self = new ExportModelFeatureTrainingSetFGTableResponseBody();
        return TeaModel.build(map, self);
    }

    public ExportModelFeatureTrainingSetFGTableResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public ExportModelFeatureTrainingSetFGTableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
