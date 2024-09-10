// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetLastOnceTaskInfoRequest extends TeaModel {
    /**
     * <p>The source of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>console_batch</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The name of the task. Valid values:</p>
     * <ul>
     * <li><strong>CLIENT_PROBLEM_CHECK</strong>: client diagnosis task</li>
     * <li><strong>CLIENT_DEV_OPS</strong>: O\&amp;M task of Cloud Assistant</li>
     * <li><strong>ASSETS_COLLECTION</strong>: asset collection task</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ASSETS_COLLECTION</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    /**
     * <p>The type of the task. Valid values:</p>
     * <ul>
     * <li><strong>CLIENT_PROBLEM_CHECK</strong>: client diagnosis task</li>
     * <li><strong>CLIENT_DEV_OPS</strong>: O\&amp;M task of Cloud Assistant</li>
     * <li><strong>ASSETS_COLLECTION</strong>: asset collection task</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ASSETS_COLLECTION</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    public static GetLastOnceTaskInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLastOnceTaskInfoRequest self = new GetLastOnceTaskInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetLastOnceTaskInfoRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public GetLastOnceTaskInfoRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public GetLastOnceTaskInfoRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
