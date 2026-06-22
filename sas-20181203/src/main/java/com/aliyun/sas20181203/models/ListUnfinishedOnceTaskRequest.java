// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListUnfinishedOnceTaskRequest extends TeaModel {
    /**
     * <p>The target object value. Valid values:</p>
     * <ul>
     * <li>If the task type is <strong>IMAGE_SCAN</strong>, the target object value is the <strong>Digest</strong> of the image.</li>
     * <li>If the task type is <strong>ASSETS_COLLECTION</strong>, the target object value is the <strong>Uuid</strong> of the server.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>4fe8e1cd-3c37-4851-b9de-124da32c****</p>
     */
    @NameInMap("Target")
    public String target;

    /**
     * <p>The task type. Valid values:</p>
     * <ul>
     * <li><strong>ASSETS_COLLECTION</strong>: asset information collection task</li>
     * <li><strong>IMAGE_SCAN</strong>: image scan task.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>IMAGE_SCAN</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    public static ListUnfinishedOnceTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUnfinishedOnceTaskRequest self = new ListUnfinishedOnceTaskRequest();
        return TeaModel.build(map, self);
    }

    public ListUnfinishedOnceTaskRequest setTarget(String target) {
        this.target = target;
        return this;
    }
    public String getTarget() {
        return this.target;
    }

    public ListUnfinishedOnceTaskRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
