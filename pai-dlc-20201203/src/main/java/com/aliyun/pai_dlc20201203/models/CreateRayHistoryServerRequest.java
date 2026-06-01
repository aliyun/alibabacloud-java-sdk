// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class CreateRayHistoryServerRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>PRIVATE</p>
     */
    @NameInMap("Accessibility")
    public String accessibility;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my-ray-history-server</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <strong>example:</strong>
     * <p>ecs.c6.large</p>
     */
    @NameInMap("EcsSpec")
    public String ecsSpec;

    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("MaxRuntimeMinutes")
    public Integer maxRuntimeMinutes;

    /**
     * <strong>example:</strong>
     * <p>quotaxxx</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://bucket-test-hangzhou.oss-cn-hangzhou-internal.aliyuncs.com/tmp</p>
     */
    @NameInMap("StoragePath")
    public String storagePath;

    /**
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
