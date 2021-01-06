// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class InitResourceDirectoryResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ResourceDirectory")
    @Validation(required = true)
    public InitResourceDirectoryResponseResourceDirectory resourceDirectory;

    public static InitResourceDirectoryResponse build(java.util.Map<String, ?> map) throws Exception {
        InitResourceDirectoryResponse self = new InitResourceDirectoryResponse();
        return TeaModel.build(map, self);
    }

    public InitResourceDirectoryResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InitResourceDirectoryResponse setResourceDirectory(InitResourceDirectoryResponseResourceDirectory resourceDirectory) {
        this.resourceDirectory = resourceDirectory;
        return this;
    }
    public InitResourceDirectoryResponseResourceDirectory getResourceDirectory() {
        return this.resourceDirectory;
    }

    public static class InitResourceDirectoryResponseResourceDirectory extends TeaModel {
        @NameInMap("ResourceDirectoryId")
        @Validation(required = true)
        public String resourceDirectoryId;

        @NameInMap("MasterAccountId")
        @Validation(required = true)
        public String masterAccountId;

        @NameInMap("MasterAccountName")
        @Validation(required = true)
        public String masterAccountName;

        @NameInMap("RootFolderId")
        @Validation(required = true)
        public String rootFolderId;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        public static InitResourceDirectoryResponseResourceDirectory build(java.util.Map<String, ?> map) throws Exception {
            InitResourceDirectoryResponseResourceDirectory self = new InitResourceDirectoryResponseResourceDirectory();
            return TeaModel.build(map, self);
        }

        public InitResourceDirectoryResponseResourceDirectory setResourceDirectoryId(String resourceDirectoryId) {
            this.resourceDirectoryId = resourceDirectoryId;
            return this;
        }
        public String getResourceDirectoryId() {
            return this.resourceDirectoryId;
        }

        public InitResourceDirectoryResponseResourceDirectory setMasterAccountId(String masterAccountId) {
            this.masterAccountId = masterAccountId;
            return this;
        }
        public String getMasterAccountId() {
            return this.masterAccountId;
        }

        public InitResourceDirectoryResponseResourceDirectory setMasterAccountName(String masterAccountName) {
            this.masterAccountName = masterAccountName;
            return this;
        }
        public String getMasterAccountName() {
            return this.masterAccountName;
        }

        public InitResourceDirectoryResponseResourceDirectory setRootFolderId(String rootFolderId) {
            this.rootFolderId = rootFolderId;
            return this;
        }
        public String getRootFolderId() {
            return this.rootFolderId;
        }

        public InitResourceDirectoryResponseResourceDirectory setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

    }

}
