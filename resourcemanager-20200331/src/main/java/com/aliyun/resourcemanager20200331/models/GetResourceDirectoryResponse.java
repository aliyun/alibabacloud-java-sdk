// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class GetResourceDirectoryResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ResourceDirectory")
    @Validation(required = true)
    public GetResourceDirectoryResponseResourceDirectory resourceDirectory;

    public static GetResourceDirectoryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetResourceDirectoryResponse self = new GetResourceDirectoryResponse();
        return TeaModel.build(map, self);
    }

    public GetResourceDirectoryResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetResourceDirectoryResponse setResourceDirectory(GetResourceDirectoryResponseResourceDirectory resourceDirectory) {
        this.resourceDirectory = resourceDirectory;
        return this;
    }
    public GetResourceDirectoryResponseResourceDirectory getResourceDirectory() {
        return this.resourceDirectory;
    }

    public static class GetResourceDirectoryResponseResourceDirectory extends TeaModel {
        @NameInMap("ResourceDirectoryId")
        @Validation(required = true)
        public String resourceDirectoryId;

        @NameInMap("MasterAccountName")
        @Validation(required = true)
        public String masterAccountName;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        @NameInMap("RootFolderId")
        @Validation(required = true)
        public String rootFolderId;

        @NameInMap("MasterAccountId")
        @Validation(required = true)
        public String masterAccountId;

        public static GetResourceDirectoryResponseResourceDirectory build(java.util.Map<String, ?> map) throws Exception {
            GetResourceDirectoryResponseResourceDirectory self = new GetResourceDirectoryResponseResourceDirectory();
            return TeaModel.build(map, self);
        }

        public GetResourceDirectoryResponseResourceDirectory setResourceDirectoryId(String resourceDirectoryId) {
            this.resourceDirectoryId = resourceDirectoryId;
            return this;
        }
        public String getResourceDirectoryId() {
            return this.resourceDirectoryId;
        }

        public GetResourceDirectoryResponseResourceDirectory setMasterAccountName(String masterAccountName) {
            this.masterAccountName = masterAccountName;
            return this;
        }
        public String getMasterAccountName() {
            return this.masterAccountName;
        }

        public GetResourceDirectoryResponseResourceDirectory setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetResourceDirectoryResponseResourceDirectory setRootFolderId(String rootFolderId) {
            this.rootFolderId = rootFolderId;
            return this;
        }
        public String getRootFolderId() {
            return this.rootFolderId;
        }

        public GetResourceDirectoryResponseResourceDirectory setMasterAccountId(String masterAccountId) {
            this.masterAccountId = masterAccountId;
            return this;
        }
        public String getMasterAccountId() {
            return this.masterAccountId;
        }

    }

}
