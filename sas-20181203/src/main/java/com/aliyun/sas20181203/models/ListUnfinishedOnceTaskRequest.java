// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListUnfinishedOnceTaskRequest extends TeaModel {
    /**
     * <p>The target object value.</p>
     * <ul>
     * <li>If TaskType is set to IMAGE_SCAN, you must provide the image digest.</li>
     * <li>If TaskType is set to ASSETS_COLLECTION, you must provide the machine UUID.</li>
     * </ul>
     * <p>If this parameter is not provided in the preceding scenarios, the service returns HTTP 400 with error code -101.</p>
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
     * <li><strong>IMAGE_SCAN</strong>: image scan task</li>
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
