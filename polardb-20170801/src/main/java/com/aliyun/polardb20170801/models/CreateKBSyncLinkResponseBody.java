// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateKBSyncLinkResponseBody extends TeaModel {
    /**
     * <p>The client ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cli_xxxxxxbe8</p>
     */
    @NameInMap("ClientId")
    public String clientId;

    /**
     * <p>The creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-08-14T05:58:42Z</p>
     */
    @NameInMap("CreationTime")
    public String creationTime;

    /**
     * <p>The description of the synchronization link.</p>
     * 
     * <strong>example:</strong>
     * <p>testDesc</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The source channel of the synchronization link. Valid values:</p>
     * <ul>
     * <li>FEISHU </li>
     * <li>SHAREPOINT</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FEISHU</p>
     */
    @NameInMap("ImPlatform")
    public String imPlatform;

    /**
     * <p>The synchronization link ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pkbl-xxxxxx</p>
     */
    @NameInMap("LinkId")
    public String linkId;

    /**
     * <p>The name of the synchronization link.</p>
     * 
     * <strong>example:</strong>
     * <p>testName</p>
     */
    @NameInMap("LinkName")
    public String linkName;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>24A1990B-4F6E-482B-B8CB-75C612******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The source directory address for synchronization.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.feishu.cn/wiki/space/xxxxxx">https://example.feishu.cn/wiki/space/xxxxxx</a></p>
     */
    @NameInMap("SourceDir")
    public String sourceDir;

    /**
     * <p>The synchronization interval. Unit: minutes.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("SyncIntervalMinutes")
    public Integer syncIntervalMinutes;

    /**
     * <p>The synchronization status. Valid values:</p>
     * <ul>
     * <li>CREATING</li>
     * <li>RUNNING</li>
     * <li>PAUSED</li>
     * <li>DELETING</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CREATING</p>
     */
    @NameInMap("SyncStatus")
    public String syncStatus;

    public static CreateKBSyncLinkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateKBSyncLinkResponseBody self = new CreateKBSyncLinkResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateKBSyncLinkResponseBody setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public CreateKBSyncLinkResponseBody setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    public String getCreationTime() {
        return this.creationTime;
    }

    public CreateKBSyncLinkResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateKBSyncLinkResponseBody setImPlatform(String imPlatform) {
        this.imPlatform = imPlatform;
        return this;
    }
    public String getImPlatform() {
        return this.imPlatform;
    }

    public CreateKBSyncLinkResponseBody setLinkId(String linkId) {
        this.linkId = linkId;
        return this;
    }
    public String getLinkId() {
        return this.linkId;
    }

    public CreateKBSyncLinkResponseBody setLinkName(String linkName) {
        this.linkName = linkName;
        return this;
    }
    public String getLinkName() {
        return this.linkName;
    }

    public CreateKBSyncLinkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateKBSyncLinkResponseBody setSourceDir(String sourceDir) {
        this.sourceDir = sourceDir;
        return this;
    }
    public String getSourceDir() {
        return this.sourceDir;
    }

    public CreateKBSyncLinkResponseBody setSyncIntervalMinutes(Integer syncIntervalMinutes) {
        this.syncIntervalMinutes = syncIntervalMinutes;
        return this;
    }
    public Integer getSyncIntervalMinutes() {
        return this.syncIntervalMinutes;
    }

    public CreateKBSyncLinkResponseBody setSyncStatus(String syncStatus) {
        this.syncStatus = syncStatus;
        return this;
    }
    public String getSyncStatus() {
        return this.syncStatus;
    }

}
