// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class EnableResourceDirectoryResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>EC2FE94D-A4A2-51A1-A493-5C273A36C46A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information of the resource directory.</p>
     */
    @NameInMap("ResourceDirectory")
    public EnableResourceDirectoryResponseBodyResourceDirectory resourceDirectory;

    public static EnableResourceDirectoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableResourceDirectoryResponseBody self = new EnableResourceDirectoryResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableResourceDirectoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EnableResourceDirectoryResponseBody setResourceDirectory(EnableResourceDirectoryResponseBodyResourceDirectory resourceDirectory) {
        this.resourceDirectory = resourceDirectory;
        return this;
    }
    public EnableResourceDirectoryResponseBodyResourceDirectory getResourceDirectory() {
        return this.resourceDirectory;
    }

    public static class EnableResourceDirectoryResponseBodyResourceDirectory extends TeaModel {
        /**
         * <p>The time when the resource directory was enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-08T02:15:31.744Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The ID of the management account.</p>
         * 
         * <strong>example:</strong>
         * <p>507408460615****</p>
         */
        @NameInMap("MasterAccountId")
        public String masterAccountId;

        /**
         * <p>The name of the management account.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:alice@example.com">alice@example.com</a></p>
         */
        @NameInMap("MasterAccountName")
        public String masterAccountName;

        /**
         * <p>The ID of the resource directory.</p>
         * 
         * <strong>example:</strong>
         * <p>rd-54****</p>
         */
        @NameInMap("ResourceDirectoryId")
        public String resourceDirectoryId;

        /**
         * <p>The ID of the Root folder.</p>
         * 
         * <strong>example:</strong>
         * <p>r-G9****</p>
         */
        @NameInMap("RootFolderId")
        public String rootFolderId;

        public static EnableResourceDirectoryResponseBodyResourceDirectory build(java.util.Map<String, ?> map) throws Exception {
            EnableResourceDirectoryResponseBodyResourceDirectory self = new EnableResourceDirectoryResponseBodyResourceDirectory();
            return TeaModel.build(map, self);
        }

        public EnableResourceDirectoryResponseBodyResourceDirectory setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public EnableResourceDirectoryResponseBodyResourceDirectory setMasterAccountId(String masterAccountId) {
            this.masterAccountId = masterAccountId;
            return this;
        }
        public String getMasterAccountId() {
            return this.masterAccountId;
        }

        public EnableResourceDirectoryResponseBodyResourceDirectory setMasterAccountName(String masterAccountName) {
            this.masterAccountName = masterAccountName;
            return this;
        }
        public String getMasterAccountName() {
            return this.masterAccountName;
        }

        public EnableResourceDirectoryResponseBodyResourceDirectory setResourceDirectoryId(String resourceDirectoryId) {
            this.resourceDirectoryId = resourceDirectoryId;
            return this;
        }
        public String getResourceDirectoryId() {
            return this.resourceDirectoryId;
        }

        public EnableResourceDirectoryResponseBodyResourceDirectory setRootFolderId(String rootFolderId) {
            this.rootFolderId = rootFolderId;
            return this;
        }
        public String getRootFolderId() {
            return this.rootFolderId;
        }

    }

}
