// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GenerateOnceTaskRequest extends TeaModel {
    /**
     * <p>The extended information field.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;mode&quot;:1,&quot;problemType&quot;:&quot;offline&quot;,&quot;uuids&quot;:&quot;inet-795dcad1-360f-49d2-b01e-b7da7f1c****&quot;}</p>
     */
    @NameInMap("Param")
    public String param;

    /**
     * <p>The source of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>Manual</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The node name. Valid values:</p>
     * <ul>
     * <li><strong>CLIENT_PROBLEM_CHECK</strong>: Client troubleshooting node.</li>
     * <li><strong>CLIENT_DEV_OPS</strong>: Cloud O&amp;M node.</li>
     * <li><strong>ASSET_SECURITY_CHECK</strong>: Asset collection node.</li>
     * <li><strong>ASSETS_COLLECTION</strong>: Asset Fingerprints collection node.</li>
     * <li><strong>IMAGE_SCAN</strong>: Container image scan node.</li>
     * <li><strong>AI_SECURITY_CHECK</strong>: AI asset synchronization node.</li>
     * <li><strong>IDC_PROBE_SCAN</strong>: IDC probe scan node.</li>
     * <li><strong>ATTACK_SURFACE_SCAN</strong>: Attack surface border asset scan node.</li>
     * <li><strong>ASSET_EXPOSURE_SCAN</strong>: Asset exposure scan node.</li>
     * <li><strong>VUL_CHECK_TASK</strong>: Vulnerability scanning node.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CLIENT_PROBLEM_CHECK</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    /**
     * <p>The node type. Valid values:</p>
     * <ul>
     * <li><strong>CLIENT_PROBLEM_CHECK</strong>: Client troubleshooting node.</li>
     * <li><strong>CLIENT_DEV_OPS</strong>: Cloud O&amp;M node.</li>
     * <li><strong>ASSET_SECURITY_CHECK</strong>: Asset collection node.</li>
     * <li><strong>ASSETS_COLLECTION</strong>: Asset Fingerprints collection node.</li>
     * <li><strong>IMAGE_SCAN</strong>: Container image scan node.</li>
     * <li><strong>AI_SECURITY_CHECK</strong>: AI asset synchronization node.</li>
     * <li><strong>IDC_PROBE_SCAN</strong>: IDC probe scan node.</li>
     * <li><strong>ATTACK_SURFACE_SCAN</strong>: Attack surface border asset scan node.</li>
     * <li><strong>ASSET_EXPOSURE_SCAN</strong>: Asset exposure scan node.</li>
     * <li><strong>VUL_CHECK_TASK</strong>: Vulnerability scanning node.</li>
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
