// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class InitResourceDirectoryResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information of the resource directory.</p>
     */
    @NameInMap("ResourceDirectory")
    public InitResourceDirectoryResponseBodyResourceDirectory resourceDirectory;

    public static InitResourceDirectoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InitResourceDirectoryResponseBody self = new InitResourceDirectoryResponseBody();
        return TeaModel.build(map, self);
    }

    public InitResourceDirectoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InitResourceDirectoryResponseBody setResourceDirectory(InitResourceDirectoryResponseBodyResourceDirectory resourceDirectory) {
        this.resourceDirectory = resourceDirectory;
        return this;
    }
    public InitResourceDirectoryResponseBodyResourceDirectory getResourceDirectory() {
        return this.resourceDirectory;
    }

    public static class InitResourceDirectoryResponseBodyResourceDirectory extends TeaModel {
        /**
         * <p>The time when the resource directory was enabled.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The ID of the enterprise management account.</p>
         */
        @NameInMap("MasterAccountId")
        public String masterAccountId;

        /**
         * <p>The name of the enterprise management account.</p>
         */
        @NameInMap("MasterAccountName")
        public String masterAccountName;

        /**
         * <p>The ID of the resource directory.</p>
         */
        @NameInMap("ResourceDirectoryId")
        public String resourceDirectoryId;

        /**
         * <p>The ID of the root folder.</p>
         */
        @NameInMap("RootFolderId")
        public String rootFolderId;

        public static InitResourceDirectoryResponseBodyResourceDirectory build(java.util.Map<String, ?> map) throws Exception {
            InitResourceDirectoryResponseBodyResourceDirectory self = new InitResourceDirectoryResponseBodyResourceDirectory();
            return TeaModel.build(map, self);
        }

        public InitResourceDirectoryResponseBodyResourceDirectory setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public InitResourceDirectoryResponseBodyResourceDirectory setMasterAccountId(String masterAccountId) {
            this.masterAccountId = masterAccountId;
            return this;
        }
        public String getMasterAccountId() {
            return this.masterAccountId;
        }

        public InitResourceDirectoryResponseBodyResourceDirectory setMasterAccountName(String masterAccountName) {
            this.masterAccountName = masterAccountName;
            return this;
        }
        public String getMasterAccountName() {
            return this.masterAccountName;
        }

        public InitResourceDirectoryResponseBodyResourceDirectory setResourceDirectoryId(String resourceDirectoryId) {
            this.resourceDirectoryId = resourceDirectoryId;
            return this;
        }
        public String getResourceDirectoryId() {
            return this.resourceDirectoryId;
        }

        public InitResourceDirectoryResponseBodyResourceDirectory setRootFolderId(String rootFolderId) {
            this.rootFolderId = rootFolderId;
            return this;
        }
        public String getRootFolderId() {
            return this.rootFolderId;
        }

    }

}
