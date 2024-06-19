// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeScaleOutMigrateTaskListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>32</p>
     */
    @NameInMap("Progress")
    public Integer progress;

    /**
     * <strong>example:</strong>
     * <p>C458B1E8-1683-3645-B154-6BA32080EEA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeScaleOutMigrateTaskListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScaleOutMigrateTaskListResponseBody self = new DescribeScaleOutMigrateTaskListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScaleOutMigrateTaskListResponseBody setProgress(Integer progress) {
        this.progress = progress;
        return this;
    }
    public Integer getProgress() {
        return this.progress;
    }

    public DescribeScaleOutMigrateTaskListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
