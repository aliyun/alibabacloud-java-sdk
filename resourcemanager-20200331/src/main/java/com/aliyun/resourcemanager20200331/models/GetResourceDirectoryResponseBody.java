// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class GetResourceDirectoryResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information of the resource directory.</p>
     */
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
        /**
         * <p>The status of the Control Policy feature. Valid values:</p>
         * <br>
         * <p>*   Enabled: The feature is enabled.</p>
         * <p>*   PendingEnable: The feature is being enabled.</p>
         * <p>*   Disabled: The feature is disabled.</p>
         * <p>*   PendingDisable: The feature is being disabled.</p>
         */
        @NameInMap("ControlPolicyStatus")
        public String controlPolicyStatus;

        /**
         * <p>The time when the resource directory was enabled.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The real-name verification information.</p>
         */
        @NameInMap("IdentityInformation")
        public String identityInformation;

        /**
         * <p>The ID of the management account.</p>
         */
        @NameInMap("MasterAccountId")
        public String masterAccountId;

        /**
         * <p>The name of the management account.</p>
         */
        @NameInMap("MasterAccountName")
        public String masterAccountName;

        /**
         * <p>The status of the member deletion feature. Valid values:</p>
         * <br>
         * <p>*   Enabled: The feature is enabled. You can call the [DeleteAccount](~~311546~~) operation to delete members of the resource account type.</p>
         * <p>*   Disabled: The feature is disabled. You cannot delete members of the resource account type.</p>
         */
        @NameInMap("MemberDeletionStatus")
        public String memberDeletionStatus;

        /**
         * <p>The ID of the resource directory.</p>
         */
        @NameInMap("ResourceDirectoryId")
        public String resourceDirectoryId;

        /**
         * <p>The ID of the Root folder.</p>
         */
        @NameInMap("RootFolderId")
        public String rootFolderId;

        public static GetResourceDirectoryResponseBodyResourceDirectory build(java.util.Map<String, ?> map) throws Exception {
            GetResourceDirectoryResponseBodyResourceDirectory self = new GetResourceDirectoryResponseBodyResourceDirectory();
            return TeaModel.build(map, self);
        }

        public GetResourceDirectoryResponseBodyResourceDirectory setControlPolicyStatus(String controlPolicyStatus) {
            this.controlPolicyStatus = controlPolicyStatus;
            return this;
        }
        public String getControlPolicyStatus() {
            return this.controlPolicyStatus;
        }

        public GetResourceDirectoryResponseBodyResourceDirectory setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetResourceDirectoryResponseBodyResourceDirectory setIdentityInformation(String identityInformation) {
            this.identityInformation = identityInformation;
            return this;
        }
        public String getIdentityInformation() {
            return this.identityInformation;
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

        public GetResourceDirectoryResponseBodyResourceDirectory setMemberDeletionStatus(String memberDeletionStatus) {
            this.memberDeletionStatus = memberDeletionStatus;
            return this;
        }
        public String getMemberDeletionStatus() {
            return this.memberDeletionStatus;
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
