// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class CreateRayHistoryServerRequest extends TeaModel {
    /**
     * <p>The visibility of the job. Valid values:</p>
     * <ul>
     * <li>PUBLIC: visible to all members in the workspace.</li>
     * <li>PRIVATE: visible only to you and administrators in the workspace.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PRIVATE</p>
     */
    @NameInMap("Accessibility")
    public String accessibility;

    /**
     * <p>The display name of the job.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my-ray-history-server</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>The hardware specifications of the public resource group. To access the detailed list of specifications, see <a href="https://help.aliyun.com/document_detail/171758.html">PAI-DLC billing</a>.&gt;Notice: Prices vary depending on the specifications..</p>
     * 
     * <strong>example:</strong>
     * <p>ecs.c6.large</p>
     */
    @NameInMap("EcsSpec")
    public String ecsSpec;

    /**
     * <p>The maximum runtime in minutes.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("MaxRuntimeMinutes")
    public Integer maxRuntimeMinutes;

    /**
     * <p>The resource group ID. This parameter is optional.</p>
     * <ul>
     * <li>If this parameter is left empty, the job is committed to the public resource group.</li>
     * <li>If the current workspace is attached to a resource quota, you can specify the corresponding resource quota ID. For details about how to query the resource quota ID, see <a href="https://help.aliyun.com/document_detail/2651299.html">Manage resource quotas</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>quotaxxx</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>The storage path for Ray logs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://bucket-test-hangzhou.oss-cn-hangzhou-internal.aliyuncs.com/tmp</p>
     */
    @NameInMap("StoragePath")
    public String storagePath;

    /**
     * <p>The workspace ID. &lt;props=&quot;china&quot;&gt;For information about how to obtain the workspace ID, see <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a>..</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateRayHistoryServerRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRayHistoryServerRequest self = new CreateRayHistoryServerRequest();
        return TeaModel.build(map, self);
    }

    public CreateRayHistoryServerRequest setAccessibility(String accessibility) {
        this.accessibility = accessibility;
        return this;
    }
    public String getAccessibility() {
        return this.accessibility;
    }

    public CreateRayHistoryServerRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public CreateRayHistoryServerRequest setEcsSpec(String ecsSpec) {
        this.ecsSpec = ecsSpec;
        return this;
    }
    public String getEcsSpec() {
        return this.ecsSpec;
    }

    public CreateRayHistoryServerRequest setMaxRuntimeMinutes(Integer maxRuntimeMinutes) {
        this.maxRuntimeMinutes = maxRuntimeMinutes;
        return this;
    }
    public Integer getMaxRuntimeMinutes() {
        return this.maxRuntimeMinutes;
    }

    public CreateRayHistoryServerRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public CreateRayHistoryServerRequest setStoragePath(String storagePath) {
        this.storagePath = storagePath;
        return this;
    }
    public String getStoragePath() {
        return this.storagePath;
    }

    public CreateRayHistoryServerRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
