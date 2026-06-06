// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class BatchCancelTasksRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>EssayCorrectionTask</p>
     */
    @NameInMap("taskCode")
    public String taskCode;

    /**
     * <strong>example:</strong>
     * <p>[&quot;xxxx1&quot;,&quot;xxxx2&quot;]</p>
     */
    @NameInMap("taskIds")
    public java.util.List<String> taskIds;

    public static BatchCancelTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchCancelTasksRequest self = new BatchCancelTasksRequest();
        return TeaModel.build(map, self);
    }

    public BatchCancelTasksRequest setTaskCode(String taskCode) {
        this.taskCode = taskCode;
        return this;
    }
    public String getTaskCode() {
        return this.taskCode;
    }

    public BatchCancelTasksRequest setTaskIds(java.util.List<String> taskIds) {
        this.taskIds = taskIds;
        return this;
    }
    public java.util.List<String> getTaskIds() {
        return this.taskIds;
    }

}
