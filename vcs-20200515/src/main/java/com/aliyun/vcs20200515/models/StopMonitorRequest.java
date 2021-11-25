// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class StopMonitorRequest extends TeaModel {
    @NameInMap("AlgorithmVendor")
    public String algorithmVendor;

    @NameInMap("TaskId")
    public String taskId;

    public static StopMonitorRequest build(java.util.Map<String, ?> map) throws Exception {
        StopMonitorRequest self = new StopMonitorRequest();
        return TeaModel.build(map, self);
    }

    public StopMonitorRequest setAlgorithmVendor(String algorithmVendor) {
        this.algorithmVendor = algorithmVendor;
        return this;
    }
    public String getAlgorithmVendor() {
        return this.algorithmVendor;
    }

    public StopMonitorRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
