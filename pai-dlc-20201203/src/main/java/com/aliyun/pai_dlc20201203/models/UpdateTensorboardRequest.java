// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class UpdateTensorboardRequest extends TeaModel {
    /**
     * <p>The visibility of the jobs. Valid values:</p>
     * <ul>
     * <li>PUBLIC: The jobs are public in the workspace.</li>
     * <li>PRIVATE: The jobs are visible only to you and the administrator of the workspace.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PRIVATE</p>
     */
    @NameInMap("Accessibility")
    public String accessibility;

    /**
     * <p>The maximum running time. Unit: minutes.</p>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("MaxRunningTimeMinutes")
    public Long maxRunningTimeMinutes;

    @NameInMap("Priority")
    public String priority;

    /**
     * <p>The workspace ID. 
     * &lt;props=&quot;china&quot;&gt;For more information about how to query the workspace ID, see <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>380</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static UpdateTensorboardRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTensorboardRequest self = new UpdateTensorboardRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTensorboardRequest setAccessibility(String accessibility) {
        this.accessibility = accessibility;
        return this;
    }
    public String getAccessibility() {
        return this.accessibility;
    }

    public UpdateTensorboardRequest setMaxRunningTimeMinutes(Long maxRunningTimeMinutes) {
        this.maxRunningTimeMinutes = maxRunningTimeMinutes;
        return this;
    }
    public Long getMaxRunningTimeMinutes() {
        return this.maxRunningTimeMinutes;
    }

    public UpdateTensorboardRequest setPriority(String priority) {
        this.priority = priority;
        return this;
    }
    public String getPriority() {
        return this.priority;
    }

    public UpdateTensorboardRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
