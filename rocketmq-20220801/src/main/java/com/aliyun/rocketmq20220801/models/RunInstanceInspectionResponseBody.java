// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class RunInstanceInspectionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>inspection-run-001</p>
     */
    @NameInMap("runId")
    public String runId;

    public static RunInstanceInspectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunInstanceInspectionResponseBody self = new RunInstanceInspectionResponseBody();
        return TeaModel.build(map, self);
    }

    public RunInstanceInspectionResponseBody setRunId(String runId) {
        this.runId = runId;
        return this;
    }
    public String getRunId() {
        return this.runId;
    }

}
