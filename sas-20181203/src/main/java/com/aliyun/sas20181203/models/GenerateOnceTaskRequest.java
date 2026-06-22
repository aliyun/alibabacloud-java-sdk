// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GenerateOnceTaskRequest extends TeaModel {
    /**
     * <p>A JSON string that contains additional parameters for the task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;mode&quot;:1,&quot;problemType&quot;:&quot;offline&quot;,&quot;uuids&quot;:&quot;inet-795dcad1-360f-49d2-b01e-b7da7f1c****&quot;}</p>
     */
    @NameInMap("Param")
    public String param;

    /**
     * <p>The source that initiated the task.</p>
     * 
     * <strong>example:</strong>
     * <p>Manual</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The name of the scan task.</p>
     * <ul>
     * <li></li>
     * <li></li>
     * <li></li>
     * <li></li>
     * <li></li>
     * <li></li>
     * <li></li>
     * <li></li>
     * <li></li>
     * <li></li>
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
     * <li><p><strong>CLIENT_PROBLEM_CHECK</strong>: a client troubleshooting task</p>
     * </li>
     * <li><p><strong>CLIENT_DEV_OPS</strong>: a cloud DevOps task</p>
     * </li>
     * <li><p><strong>ASSET_SECURITY_CHECK</strong>: an asset collection task</p>
     * </li>
     * <li><p><strong>ASSETS_COLLECTION</strong>: an asset fingerprinting task</p>
     * </li>
     * <li><p><strong>IMAGE_SCAN</strong>: a container image scan task</p>
     * </li>
     * <li><p><strong>AI_SECURITY_CHECK</strong>: an AI asset synchronization task</p>
     * </li>
     * <li><p><strong>IDC_PROBE_SCAN</strong>: an IDC probe scan task</p>
     * </li>
     * <li><p><strong>ATTACK_SURFACE_SCAN</strong>: an attack surface scan task</p>
     * </li>
     * <li><p><strong>ASSET_EXPOSURE_SCAN</strong>: an asset exposure scan task</p>
     * </li>
     * <li><p><strong>VUL_CHECK_TASK</strong>: a vulnerability scan task</p>
     * </li>
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
