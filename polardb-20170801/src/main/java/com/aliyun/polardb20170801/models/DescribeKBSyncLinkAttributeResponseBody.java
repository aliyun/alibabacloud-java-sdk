// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeKBSyncLinkAttributeResponseBody extends TeaModel {
    /**
     * <p>The client ID of the source application.</p>
     * 
     * <strong>example:</strong>
     * <p>cli_a123456</p>
     */
    @NameInMap("ClientId")
    public String clientId;

    /**
     * <p>The synchronization configuration whitelist returned based on the source type. For DINGTALK, UserId can be returned. For FEISHU, FeishuChatMemberStaleTtlSeconds can be returned.</p>
     */
    @NameInMap("Config")
    public DescribeKBSyncLinkAttributeResponseBodyConfig config;

    /**
     * <p>The creation time of the synchronization link.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-09-22T12:00:00Z</p>
     */
    @NameInMap("CreationTime")
    public String creationTime;

    /**
     * <p>The description of the synchronization link.</p>
     * 
     * <strong>example:</strong>
     * <p>Synchronize Lark knowledge base documents</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The source channel of the synchronization link. Valid values: OSS, DINGTALK, FEISHU, and SHAREPOINT.</p>
     * 
     * <strong>example:</strong>
     * <p>FEISHU</p>
     */
    @NameInMap("ImPlatform")
    public String imPlatform;

    /**
     * <p>The unique identifier of the synchronization link.</p>
     * 
     * <strong>example:</strong>
     * <p>pkbl-123456</p>
     */
    @NameInMap("LinkId")
    public String linkId;

    /**
     * <p>The name of the synchronization link.</p>
     * 
     * <strong>example:</strong>
     * <p>feishu-doc-sync</p>
     */
    @NameInMap("LinkName")
    public String linkName;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>12345678-1234-1234-1234-1234567890ab</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The source directory.</p>
     * 
     * <strong>example:</strong>
     * <p>/documents</p>
     */
    @NameInMap("SourceDir")
    public String sourceDir;

    /**
     * <p>The automatic synchronization interval, in minutes.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("SyncIntervalMinutes")
    public Integer syncIntervalMinutes;

    /**
     * <p>The status of the synchronization link.</p>
     * 
     * <strong>example:</strong>
     * <p>RUNNING</p>
     */
    @NameInMap("SyncStatus")
    public String syncStatus;

    public static DescribeKBSyncLinkAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeKBSyncLinkAttributeResponseBody self = new DescribeKBSyncLinkAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeKBSyncLinkAttributeResponseBody setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public DescribeKBSyncLinkAttributeResponseBody setConfig(DescribeKBSyncLinkAttributeResponseBodyConfig config) {
        this.config = config;
        return this;
    }
    public DescribeKBSyncLinkAttributeResponseBodyConfig getConfig() {
        return this.config;
    }

    public DescribeKBSyncLinkAttributeResponseBody setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    public String getCreationTime() {
        return this.creationTime;
    }

    public DescribeKBSyncLinkAttributeResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeKBSyncLinkAttributeResponseBody setImPlatform(String imPlatform) {
        this.imPlatform = imPlatform;
        return this;
    }
    public String getImPlatform() {
        return this.imPlatform;
    }

    public DescribeKBSyncLinkAttributeResponseBody setLinkId(String linkId) {
        this.linkId = linkId;
        return this;
    }
    public String getLinkId() {
        return this.linkId;
    }

    public DescribeKBSyncLinkAttributeResponseBody setLinkName(String linkName) {
        this.linkName = linkName;
        return this;
    }
    public String getLinkName() {
        return this.linkName;
    }

    public DescribeKBSyncLinkAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeKBSyncLinkAttributeResponseBody setSourceDir(String sourceDir) {
        this.sourceDir = sourceDir;
        return this;
    }
    public String getSourceDir() {
        return this.sourceDir;
    }

    public DescribeKBSyncLinkAttributeResponseBody setSyncIntervalMinutes(Integer syncIntervalMinutes) {
        this.syncIntervalMinutes = syncIntervalMinutes;
        return this;
    }
    public Integer getSyncIntervalMinutes() {
        return this.syncIntervalMinutes;
    }

    public DescribeKBSyncLinkAttributeResponseBody setSyncStatus(String syncStatus) {
        this.syncStatus = syncStatus;
        return this;
    }
    public String getSyncStatus() {
        return this.syncStatus;
    }

    public static class DescribeKBSyncLinkAttributeResponseBodyConfig extends TeaModel {
        /**
         * <p>The validity period of the successful snapshot of Lark group members for fallback reuse, in seconds. This parameter is returned only for FEISHU synchronization links. A value of -1 indicates that the snapshot never expires. A value of 0 indicates that snapshot fallback reuse is disabled. A positive integer indicates the maximum age of the snapshot allowed for reuse. The valid value configured for the link is returned. If no value is configured, the default value -1 is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        @NameInMap("FeishuChatMemberStaleTtlSeconds")
        public Integer feishuChatMemberStaleTtlSeconds;

        /**
         * <p>The ID of the DingTalk user who performs the operation. This parameter is returned only for DINGTALK synchronization links.</p>
         * 
         * <strong>example:</strong>
         * <p>manager123</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static DescribeKBSyncLinkAttributeResponseBodyConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeKBSyncLinkAttributeResponseBodyConfig self = new DescribeKBSyncLinkAttributeResponseBodyConfig();
            return TeaModel.build(map, self);
        }

        public DescribeKBSyncLinkAttributeResponseBodyConfig setFeishuChatMemberStaleTtlSeconds(Integer feishuChatMemberStaleTtlSeconds) {
            this.feishuChatMemberStaleTtlSeconds = feishuChatMemberStaleTtlSeconds;
            return this;
        }
        public Integer getFeishuChatMemberStaleTtlSeconds() {
            return this.feishuChatMemberStaleTtlSeconds;
        }

        public DescribeKBSyncLinkAttributeResponseBodyConfig setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
