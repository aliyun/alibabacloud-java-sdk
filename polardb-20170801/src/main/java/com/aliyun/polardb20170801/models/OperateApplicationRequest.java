// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class OperateApplicationRequest extends TeaModel {
    /**
     * <p>The application ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-**************</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>The Ray component type. Supported only for the restart operation of Ray applications. The value is a comma-separated list of components. Valid components are head, jupyterlab, and grafana, which can be combined. worker or gpuworker is not accepted. To select workers, you must specify GroupNames. If only head is specified, other components are not actively restarted, but connections and jobs may be affected. To restore dependencies, explicitly add jupyterlab or select the entire cluster. When provided together with GroupNames, the union of both is used and deduplicated. If neither selection parameter is provided, all resident components are restarted, but scaled-out workers are not restarted. Explicit empty strings, pure whitespace, comma-only strings, unknown types, or non-Ray applications are rejected and do not fall back to a full-cluster operation. DisableHeadScheduling and EnableHeadScheduling always apply to the head of the entire application. Specifying this parameter for these operations is rejected.</p>
     * 
     * <strong>example:</strong>
     * <p>head,jupyterlab,grafana</p>
     */
    @NameInMap("ComponentTypes")
    public String componentTypes;

    /**
     * <p>The Ray resident worker group name. Supported only for the restart operation of Ray applications. The value is a comma-separated list of exact workerGroup names, which are trimmed, deduplicated, and case-sensitive. Only resident CPU or GPU workers in the specified groups are restarted, excluding scaled-out workers. If only this parameter is specified, the head, other groups, or auxiliary components are not restarted. Unknown group names, explicit empty strings, pure whitespace, comma-only strings, or non-Ray applications are rejected. If any explicitly selected group exists but has no resident targets, the entire request is rejected and does not expand to scaled-out workers or a full-cluster operation. Full-cluster requests without selection parameters skip groups with no resident targets. DisableHeadScheduling and EnableHeadScheduling do not restart any workers. Specifying this parameter for these operations is rejected.</p>
     * 
     * <strong>example:</strong>
     * <p>cpuGroup,gpuGroup</p>
     */
    @NameInMap("GroupNames")
    public String groupNames;

    /**
     * <p>The operation type.</p>
     * <ul>
     * <li><strong>restart</strong>: Restart.</li>
     * <li><strong>stop</strong>: Stop.</li>
     * <li><strong>start</strong>: Start.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>restart</p>
     */
    @NameInMap("Operation")
    public String operation;

    public static OperateApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateApplicationRequest self = new OperateApplicationRequest();
        return TeaModel.build(map, self);
    }

    public OperateApplicationRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public OperateApplicationRequest setComponentTypes(String componentTypes) {
        this.componentTypes = componentTypes;
        return this;
    }
    public String getComponentTypes() {
        return this.componentTypes;
    }

    public OperateApplicationRequest setGroupNames(String groupNames) {
        this.groupNames = groupNames;
        return this;
    }
    public String getGroupNames() {
        return this.groupNames;
    }

    public OperateApplicationRequest setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

}
