// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20161111.models;

import com.aliyun.tea.*;

public class GetResourceDirectoryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceDirectory")
    public GetResourceDirectoryResponseBodyResourceDirectory resourceDirectory;

    public static GetResourceDirectoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetResourceDirectoryResponseBody self = new GetResourceDirectoryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetResourceDirectoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetResourceDirectoryResponseBody setResourceDirectory(GetResourceDirectoryResponseBodyResourceDirectory resourceDirectory) {
        this.resourceDirectory = resourceDirectory;
        return this;
    }
    public GetResourceDirectoryResponseBodyResourceDirectory getResourceDirectory() {
        return this.resourceDirectory;
    }

    public static class GetResourceDirectoryResponseBodyResourceDirectory extends TeaModel {
        @NameInMap("CreateDate")
        public String createDate;

        @NameInMap("MasterAccountId")
        public String masterAccountId;

        @NameInMap("MasterAccountName")
        public String masterAccountName;

        @NameInMap("ResourceDirectoryId")
        public String resourceDirectoryId;

        @NameInMap("RootFolderId")
        public String rootFolderId;

        public static GetResourceDirectoryResponseBodyResourceDirectory build(java.util.Map<String, ?> map) throws Exception {
            GetResourceDirectoryResponseBodyResourceDirectory self = new GetResourceDirectoryResponseBodyResourceDirectory();
            return TeaModel.build(map, self);
        }

        public GetResourceDirectoryResponseBodyResourceDirectory setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public GetResourceDirectoryResponseBodyResourceDirectory setMasterAccountId(String masterAccountId) {
            this.masterAccountId = masterAccountId;
            return this;
        }
        public String getMasterAccountId() {
            return this.masterAccountId;
        }

        public GetResourceDirectoryResponseBodyResourceDirectory setMasterAccountName(String masterAccountName) {
            this.masterAccountName = masterAccountName;
            return this;
        }
        public String getMasterAccountName() {
            return this.masterAccountName;
        }

        public GetResourceDirectoryResponseBodyResourceDirectory setResourceDirectoryId(String resourceDirectoryId) {
            this.resourceDirectoryId = resourceDirectoryId;
            return this;
        }
        public String getResourceDirectoryId() {
            return this.resourceDirectoryId;
        }

        public GetResourceDirectoryResponseBodyResourceDirectory setRootFolderId(String rootFolderId) {
            this.rootFolderId = rootFolderId;
            return this;
        }
        public String getRootFolderId() {
            return this.rootFolderId;
        }

    }

}
