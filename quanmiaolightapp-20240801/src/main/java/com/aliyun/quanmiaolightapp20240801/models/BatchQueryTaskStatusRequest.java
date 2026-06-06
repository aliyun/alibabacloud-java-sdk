// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class BatchQueryTaskStatusRequest extends TeaModel {
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

    public static BatchQueryTaskStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchQueryTaskStatusRequest self = new BatchQueryTaskStatusRequest();
        return TeaModel.build(map, self);
    }

    public BatchQueryTaskStatusRequest setTaskCode(String taskCode) {
        this.taskCode = taskCode;
        return this;
    }
    public String getTaskCode() {
        return this.taskCode;
    }

    public BatchQueryTaskStatusRequest setTaskIds(java.util.List<String> taskIds) {
        this.taskIds = taskIds;
        return this;
    }
    public java.util.List<String> getTaskIds() {
        return this.taskIds;
    }

}
