// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeTaskErrorLogRequest extends TeaModel {
    /**
     * <p>The ID of the task.</p>
     * <br>
     * <p>>  You can call the DescribeImageFixTask operation to query the IDs of tasks.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("BuildTaskId")
    public String buildTaskId;

    public static DescribeTaskErrorLogRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTaskErrorLogRequest self = new DescribeTaskErrorLogRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTaskErrorLogRequest setBuildTaskId(String buildTaskId) {
        this.buildTaskId = buildTaskId;
        return this;
    }
    public String getBuildTaskId() {
        return this.buildTaskId;
    }

}
