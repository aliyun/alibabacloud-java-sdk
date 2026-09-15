// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetLastOnceTaskInfoRequest extends TeaModel {
    /**
     * <p>The source from which the task was added.</p>
     * 
     * <strong>example:</strong>
     * <p>console_batch</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The task name. Valid values:</p>
     * <ul>
     * <li><strong>CLIENT_PROBLEM_CHECK</strong>: client problem troubleshooting task</li>
     * <li><strong>CLIENT_DEV_OPS</strong>: cloud O&amp;M task</li>
     * <li><strong>ASSET_SECURITY_CHECK</strong>: asset collection task</li>
     * <li><strong>ASSETS_COLLECTION</strong>: Asset Fingerprints collection task</li>
     * <li><strong>IMAGE_SCAN</strong>: container image scan task</li>
     * <li><strong>AI_SECURITY_CHECK</strong>: AI asset synchronization task</li>
     * <li><strong>IDC_PROBE_SCAN</strong>: IDC probe scan task</li>
     * <li><strong>ATTACK_SURFACE_SCAN</strong>: attack surface boundary asset scan task</li>
     * <li><strong>ASSET_EXPOSURE_SCAN</strong>: asset exposure scan task</li>
     * <li><strong>VUL_CHECK_TASK</strong>: vulnerability scanning task</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ASSETS_COLLECTION</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    /**
     * <p>The task type. Valid values:</p>
     * <ul>
     * <li><strong>CLIENT_PROBLEM_CHECK</strong>: client problem troubleshooting task</li>
     * <li><strong>CLIENT_DEV_OPS</strong>: cloud O&amp;M task</li>
     * <li><strong>ASSET_SECURITY_CHECK</strong>: asset collection task</li>
     * <li><strong>ASSETS_COLLECTION</strong>: Asset Fingerprints collection task</li>
     * <li><strong>IMAGE_SCAN</strong>: container image scan task</li>
     * <li><strong>AI_SECURITY_CHECK</strong>: AI asset synchronization task</li>
     * <li><strong>IDC_PROBE_SCAN</strong>: IDC probe scan task</li>
     * <li><strong>ATTACK_SURFACE_SCAN</strong>: attack surface boundary asset scan task</li>
     * <li><strong>ASSET_EXPOSURE_SCAN</strong>: asset exposure scan task</li>
     * <li><strong>VUL_CHECK_TASK</strong>: vulnerability scanning task</li>
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
