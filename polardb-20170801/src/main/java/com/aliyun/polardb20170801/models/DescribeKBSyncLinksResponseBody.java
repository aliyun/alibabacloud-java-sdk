// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeKBSyncLinksResponseBody extends TeaModel {
    @NameInMap("Items")
    public java.util.List<DescribeKBSyncLinksResponseBodyItems> items;

    /**
     * <strong>example:</strong>
     * <p>EB07CFF0-D8A4-5C76-AED7-D00E26FC2***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeKBSyncLinksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeKBSyncLinksResponseBody self = new DescribeKBSyncLinksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeKBSyncLinksResponseBody setItems(java.util.List<DescribeKBSyncLinksResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeKBSyncLinksResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeKBSyncLinksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeKBSyncLinksResponseBodyItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>cli_xxxxxxbe8</p>
         */
        @NameInMap("ClientId")
        public String clientId;

        /**
         * <strong>example:</strong>
         * <p>2026-08-11T09:55:19Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <strong>example:</strong>
         * <p>testDesc</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>FEISHU</p>
         */
        @NameInMap("ImPlatform")
        public String imPlatform;

        /**
         * <strong>example:</strong>
         * <p>pkbl-xxxxx</p>
         */
        @NameInMap("LinkId")
        public String linkId;

        /**
         * <strong>example:</strong>
         * <p>testName</p>
         */
        @NameInMap("LinkName")
        public String linkName;

        /**
         * <strong>example:</strong>
         * <p><a href="https://example.feishu.cn/wiki/space/xxxxxx">https://example.feishu.cn/wiki/space/xxxxxx</a></p>
         */
        @NameInMap("SourceDir")
        public String sourceDir;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("SyncIntervalMinutes")
        public Integer syncIntervalMinutes;

        /**
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("SyncStatus")
        public String syncStatus;

        public static DescribeKBSyncLinksResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeKBSyncLinksResponseBodyItems self = new DescribeKBSyncLinksResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeKBSyncLinksResponseBodyItems setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public DescribeKBSyncLinksResponseBodyItems setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeKBSyncLinksResponseBodyItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeKBSyncLinksResponseBodyItems setImPlatform(String imPlatform) {
            this.imPlatform = imPlatform;
            return this;
        }
        public String getImPlatform() {
            return this.imPlatform;
        }

        public DescribeKBSyncLinksResponseBodyItems setLinkId(String linkId) {
            this.linkId = linkId;
            return this;
        }
        public String getLinkId() {
            return this.linkId;
        }

        public DescribeKBSyncLinksResponseBodyItems setLinkName(String linkName) {
            this.linkName = linkName;
            return this;
        }
        public String getLinkName() {
            return this.linkName;
        }

        public DescribeKBSyncLinksResponseBodyItems setSourceDir(String sourceDir) {
            this.sourceDir = sourceDir;
            return this;
        }
        public String getSourceDir() {
            return this.sourceDir;
        }

        public DescribeKBSyncLinksResponseBodyItems setSyncIntervalMinutes(Integer syncIntervalMinutes) {
            this.syncIntervalMinutes = syncIntervalMinutes;
            return this;
        }
        public Integer getSyncIntervalMinutes() {
            return this.syncIntervalMinutes;
        }

        public DescribeKBSyncLinksResponseBodyItems setSyncStatus(String syncStatus) {
            this.syncStatus = syncStatus;
            return this;
        }
        public String getSyncStatus() {
            return this.syncStatus;
        }

    }

}
