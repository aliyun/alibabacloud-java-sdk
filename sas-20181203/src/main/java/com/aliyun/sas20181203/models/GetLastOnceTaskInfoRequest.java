// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetLastOnceTaskInfoRequest extends TeaModel {
    /**
     * <p>The source that initiated the task.</p>
     * 
     * <strong>example:</strong>
     * <p>console_batch</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The name of the task. Valid values:</p>
     * <ul>
     * <li><p><code>CLIENT_PROBLEM_CHECK</code>: client troubleshooting task</p>
     * </li>
     * <li><p><code>CLIENT_DEV_OPS</code>: O\&amp;M task</p>
     * </li>
     * <li><p><code>ASSET_SECURITY_CHECK</code>: asset collection task</p>
     * </li>
     * <li><p><code>ASSETS_COLLECTION</code>: asset fingerprint collection task</p>
     * </li>
     * <li><p><code>IMAGE_SCAN</code>: container image scan task</p>
     * </li>
     * <li><p><code>AI_SECURITY_CHECK</code>: AI asset synchronization task</p>
     * </li>
     * <li><p><code>IDC_PROBE_SCAN</code>: IDC probe scan task</p>
     * </li>
     * <li><p><code>ATTACK_SURFACE_SCAN</code>: attack surface boundary asset scan task</p>
     * </li>
     * <li><p><code>ASSET_EXPOSURE_SCAN</code>: asset exposure scan task</p>
     * </li>
     * <li><p><code>VUL_CHECK_TASK</code>: vulnerability scan task</p>
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
     * <li><p><code>CLIENT_PROBLEM_CHECK</code>: client troubleshooting task</p>
     * </li>
     * <li><p><code>CLIENT_DEV_OPS</code>: O\&amp;M task</p>
     * </li>
     * <li><p><code>ASSET_SECURITY_CHECK</code>: asset collection task</p>
     * </li>
     * <li><p><code>ASSETS_COLLECTION</code>: asset fingerprint collection task</p>
     * </li>
     * <li><p><code>IMAGE_SCAN</code>: container image scan task</p>
     * </li>
     * <li><p><code>AI_SECURITY_CHECK</code>: AI asset synchronization task</p>
     * </li>
     * <li><p><code>IDC_PROBE_SCAN</code>: IDC probe scan task</p>
     * </li>
     * <li><p><code>ATTACK_SURFACE_SCAN</code>: attack surface boundary asset scan task</p>
     * </li>
     * <li><p><code>ASSET_EXPOSURE_SCAN</code>: asset exposure scan task</p>
     * </li>
     * <li><p><code>VUL_CHECK_TASK</code>: vulnerability scan task</p>
     * </li>
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
