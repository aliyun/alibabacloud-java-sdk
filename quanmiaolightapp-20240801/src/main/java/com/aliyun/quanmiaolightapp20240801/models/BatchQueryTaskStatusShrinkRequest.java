// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class BatchQueryTaskStatusShrinkRequest extends TeaModel {
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
    public String taskIdsShrink;

    public static BatchQueryTaskStatusShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchQueryTaskStatusShrinkRequest self = new BatchQueryTaskStatusShrinkRequest();
        return TeaModel.build(map, self);
    }

    public BatchQueryTaskStatusShrinkRequest setTaskCode(String taskCode) {
        this.taskCode = taskCode;
        return this;
    }
    public String getTaskCode() {
        return this.taskCode;
    }

    public BatchQueryTaskStatusShrinkRequest setTaskIdsShrink(String taskIdsShrink) {
        this.taskIdsShrink = taskIdsShrink;
        return this;
    }
    public String getTaskIdsShrink() {
        return this.taskIdsShrink;
    }

}
