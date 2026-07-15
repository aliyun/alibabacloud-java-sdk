// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetRayHistoryServerResponseBody extends TeaModel {
    /**
     * <p>The visibility of the job.</p>
     * 
     * <strong>example:</strong>
     * <p>PRIVATE</p>
     */
    @NameInMap("Accessibility")
    public String accessibility;

    /**
     * <p>The display name of the job.</p>
     * 
     * <strong>example:</strong>
     * <p>my-ray-history-server</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>The specifications of the public resource group. For a list of supported instance types, see <a href="https://help.aliyun.com/document_detail/171758.html">PAI-DLC billing</a>.&gt;Notice: Pricing varies based on the specifications.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs.g6.large</p>
     */
    @NameInMap("EcsSpec")
    public String ecsSpec;

    /**
     * <p>The time when the job was created. The time is in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-01-12T14:35:01Z</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    /**
     * <p>The time when the job is complete. The time is in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-01-12T15:36:08Z</p>
     */
    @NameInMap("GmtFinishTime")
    public String gmtFinishTime;

    /**
     * <p>The time when the job was last modified. The time is in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-01-12T14:36:00Z</p>
     */
    @NameInMap("GmtModifyTime")
    public String gmtModifyTime;

    /**
     * <p>The maximum running time. Unit: minutes.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("MaxRuntimeMinutes")
    public Integer maxRuntimeMinutes;

    /**
     * <p>The ID of the Ray history server.</p>
     * 
     * <strong>example:</strong>
     * <p>rhsxxx</p>
     */
    @NameInMap("RayHistoryServerId")
    public String rayHistoryServerId;

    /**
     * <p>The URL of the Ray dashboard.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://rhsxxx-dashboard.dsw-gateway-cn-wulanchabu.data.aliyun.com/">https://rhsxxx-dashboard.dsw-gateway-cn-wulanchabu.data.aliyun.com/</a></p>
     */
    @NameInMap("RayHistoryServerUrl")
    public String rayHistoryServerUrl;

    /**
     * <p>The code of the job status.</p>
     * 
     * <strong>example:</strong>
     * <p>NotFound</p>
     */
    @NameInMap("ReasonCode")
    public String reasonCode;

    /**
     * <p>The message that describes the job status.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("ReasonMessage")
    public String reasonMessage;

    /**
     * <p>The ID of the resource group to which the job belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>quotaxxx</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>The name of the resource on which the job runs.</p>
     * 
     * <strong>example:</strong>
     * <p>my-resource-name</p>
     */
    @NameInMap("ResourceName")
    public String resourceName;

    /**
     * <p>The status of the job.</p>
     * 
     * <strong>example:</strong>
     * <p>running</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The storage path of Ray logs.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://bucket-test-hangzhou.oss-cn-hangzhou-internal.aliyuncs.com/tmp</p>
     */
    @NameInMap("StoragePath")
    public String storagePath;

    /**
     * <p>The tenant ID.</p>
     * 
     * <strong>example:</strong>
     * <p>10**************14</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    /**
     * <p>The ID of the user who creates the job.</p>
     * 
     * <strong>example:</strong>
     * <p>123456789</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <p>The username of the user who creates the job.</p>
     * 
     * <strong>example:</strong>
     * <p>myusername</p>
     */
    @NameInMap("Username")
    public String username;

    /**
     * <p>The ID of the workspace to which the job belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>46099</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static GetRayHistoryServerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRayHistoryServerResponseBody self = new GetRayHistoryServerResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRayHistoryServerResponseBody setAccessibility(String accessibility) {
        this.accessibility = accessibility;
        return this;
    }
    public String getAccessibility() {
        return this.accessibility;
    }

    public GetRayHistoryServerResponseBody setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public GetRayHistoryServerResponseBody setEcsSpec(String ecsSpec) {
        this.ecsSpec = ecsSpec;
        return this;
    }
    public String getEcsSpec() {
        return this.ecsSpec;
    }

    public GetRayHistoryServerResponseBody setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public GetRayHistoryServerResponseBody setGmtFinishTime(String gmtFinishTime) {
        this.gmtFinishTime = gmtFinishTime;
        return this;
    }
    public String getGmtFinishTime() {
        return this.gmtFinishTime;
    }

    public GetRayHistoryServerResponseBody setGmtModifyTime(String gmtModifyTime) {
        this.gmtModifyTime = gmtModifyTime;
        return this;
    }
    public String getGmtModifyTime() {
        return this.gmtModifyTime;
    }

    public GetRayHistoryServerResponseBody setMaxRuntimeMinutes(Integer maxRuntimeMinutes) {
        this.maxRuntimeMinutes = maxRuntimeMinutes;
        return this;
    }
    public Integer getMaxRuntimeMinutes() {
        return this.maxRuntimeMinutes;
    }

    public GetRayHistoryServerResponseBody setRayHistoryServerId(String rayHistoryServerId) {
        this.rayHistoryServerId = rayHistoryServerId;
        return this;
    }
    public String getRayHistoryServerId() {
        return this.rayHistoryServerId;
    }

    public GetRayHistoryServerResponseBody setRayHistoryServerUrl(String rayHistoryServerUrl) {
        this.rayHistoryServerUrl = rayHistoryServerUrl;
        return this;
    }
    public String getRayHistoryServerUrl() {
        return this.rayHistoryServerUrl;
    }

    public GetRayHistoryServerResponseBody setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
        return this;
    }
    public String getReasonCode() {
        return this.reasonCode;
    }

    public GetRayHistoryServerResponseBody setReasonMessage(String reasonMessage) {
        this.reasonMessage = reasonMessage;
        return this;
    }
    public String getReasonMessage() {
        return this.reasonMessage;
    }

    public GetRayHistoryServerResponseBody setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public GetRayHistoryServerResponseBody setResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }
    public String getResourceName() {
        return this.resourceName;
    }

    public GetRayHistoryServerResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetRayHistoryServerResponseBody setStoragePath(String storagePath) {
        this.storagePath = storagePath;
        return this;
    }
    public String getStoragePath() {
        return this.storagePath;
    }

    public GetRayHistoryServerResponseBody setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public GetRayHistoryServerResponseBody setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public GetRayHistoryServerResponseBody setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

    public GetRayHistoryServerResponseBody setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
