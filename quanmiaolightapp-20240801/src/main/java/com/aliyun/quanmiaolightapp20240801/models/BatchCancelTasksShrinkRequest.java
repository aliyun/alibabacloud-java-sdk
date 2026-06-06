// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class BatchCancelTasksShrinkRequest extends TeaModel {
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

    public static BatchCancelTasksShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchCancelTasksShrinkRequest self = new BatchCancelTasksShrinkRequest();
        return TeaModel.build(map, self);
    }

    public BatchCancelTasksShrinkRequest setTaskCode(String taskCode) {
        this.taskCode = taskCode;
        return this;
    }
    public String getTaskCode() {
        return this.taskCode;
    }

    public BatchCancelTasksShrinkRequest setTaskIdsShrink(String taskIdsShrink) {
        this.taskIdsShrink = taskIdsShrink;
        return this;
    }
    public String getTaskIdsShrink() {
        return this.taskIdsShrink;
    }

}
