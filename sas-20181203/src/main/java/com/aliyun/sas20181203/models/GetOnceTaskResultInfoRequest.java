// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetOnceTaskResultInfoRequest extends TeaModel {
    /**
     * <p>The ID of the one-time task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>9dfa3a7eb9547781632785b49003****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The name of the task. Valid values:</p>
     * <ul>
     * <li><p><strong>CLIENT_PROBLEM_CHECK</strong>: client troubleshooting task</p>
     * </li>
     * <li><p><strong>CLIENT_DEV_OPS</strong>: cloud O\&amp;M task</p>
     * </li>
     * <li><p><strong>ASSET_SECURITY_CHECK</strong>: asset collection task</p>
     * </li>
     * <li><p><strong>ASSETS_COLLECTION</strong>: asset fingerprint collection task</p>
     * </li>
     * <li><p><strong>IMAGE_SCAN</strong>: container image scan task</p>
     * </li>
     * <li><p><strong>AI_SECURITY_CHECK</strong>: AI asset synchronization task</p>
     * </li>
     * <li><p><strong>IDC_PROBE_SCAN</strong>: IDC probe scan task</p>
     * </li>
     * <li><p><strong>ATTACK_SURFACE_SCAN</strong>: attack surface and boundary asset scan task</p>
     * </li>
     * <li><p><strong>ASSET_EXPOSURE_SCAN</strong>: asset exposure scan task</p>
     * </li>
     * <li><p><strong>VUL_CHECK_TASK</strong>: vulnerability scan task</p>
     * </li>
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
     * <li><p><strong>CLIENT_PROBLEM_CHECK</strong>: client troubleshooting task</p>
     * </li>
     * <li><p><strong>CLIENT_DEV_OPS</strong>: cloud O\&amp;M task</p>
     * </li>
     * <li><p><strong>ASSET_SECURITY_CHECK</strong>: asset collection task</p>
     * </li>
     * <li><p><strong>ASSETS_COLLECTION</strong>: asset fingerprint collection task</p>
     * </li>
     * <li><p><strong>IMAGE_SCAN</strong>: container image scan task</p>
     * </li>
     * <li><p><strong>AI_SECURITY_CHECK</strong>: AI asset synchronization task</p>
     * </li>
     * <li><p><strong>IDC_PROBE_SCAN</strong>: IDC probe scan task</p>
     * </li>
     * <li><p><strong>ATTACK_SURFACE_SCAN</strong>: attack surface and boundary asset scan task</p>
     * </li>
     * <li><p><strong>ASSET_EXPOSURE_SCAN</strong>: asset exposure scan task</p>
     * </li>
     * <li><p><strong>VUL_CHECK_TASK</strong>: vulnerability scan task</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ASSETS_COLLECTION</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    public static GetOnceTaskResultInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOnceTaskResultInfoRequest self = new GetOnceTaskResultInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetOnceTaskResultInfoRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public GetOnceTaskResultInfoRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public GetOnceTaskResultInfoRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
