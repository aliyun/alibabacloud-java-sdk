// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GenerateOnceTaskRequest extends TeaModel {
    /**
     * <p>The additional information.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;mode&quot;:1,&quot;problemType&quot;:&quot;offline&quot;,&quot;uuids&quot;:&quot;inet-795dcad1-360f-49d2-b01e-b7da7f1c****&quot;}</p>
     */
    @NameInMap("Param")
    public String param;

    /**
     * <p>The source of the scan task.</p>
     * 
     * <strong>example:</strong>
     * <p>Manual</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The name of the scan task. Valid values:</p>
     * <ul>
     * <li><strong>CLIENT_PROBLEM_CHECK</strong>: a client diagnosis task</li>
     * <li><strong>CLIENT_DEV_OPS</strong>: an O\&amp;M task of Cloud Assistant</li>
     * <li><strong>ASSET_SECURITY_CHECK</strong>: a task of asset information collection</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CLIENT_PROBLEM_CHECK</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    /**
     * <p>The type of the scan task. Valid values:</p>
     * <ul>
     * <li><strong>CLIENT_PROBLEM_CHECK</strong>: a client diagnosis task</li>
     * <li><strong>CLIENT_DEV_OPS</strong>: an O\&amp;M task of Cloud Assistant</li>
     * <li><strong>ASSET_SECURITY_CHECK</strong>: a task of asset information collection</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CLIENT_PROBLEM_CHECK</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    public static GenerateOnceTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateOnceTaskRequest self = new GenerateOnceTaskRequest();
        return TeaModel.build(map, self);
    }

    public GenerateOnceTaskRequest setParam(String param) {
        this.param = param;
        return this;
    }
    public String getParam() {
        return this.param;
    }

    public GenerateOnceTaskRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public GenerateOnceTaskRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public GenerateOnceTaskRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
