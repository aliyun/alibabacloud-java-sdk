// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class GetResourceDirectoryResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>CD76D376-2517-4924-92C5-DBC52262F93A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the resource directory.</p>
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
         * <ul>
         * <li>Enabled: The feature is enabled.</li>
         * <li>PendingEnable: The feature is being enabled.</li>
         * <li>Disabled: The feature is disabled.</li>
         * <li>PendingDisable: The feature is being disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("ControlPolicyStatus")
        public String controlPolicyStatus;

        /**
         * <p>The time when the resource directory was enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-02-18T15:32:10.473Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The real-name verification information.</p>
         * 
         * <strong>example:</strong>
         * <p>*** Co., Ltd.</p>
         */
        @NameInMap("IdentityInformation")
        public String identityInformation;

        /**
         * <p>The ID of the management account.</p>
         * 
         * <strong>example:</strong>
         * <p>172845045600****</p>
         */
        @NameInMap("MasterAccountId")
        public String masterAccountId;

        /**
         * <p>The name of the management account.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun-admin</p>
         */
        @NameInMap("MasterAccountName")
        public String masterAccountName;

        /**
         * <p>The status of the Member Display Name Synchronization feature. Valid values:</p>
         * <ul>
         * <li>Enabled</li>
         * <li>Disabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("MemberAccountDisplayNameSyncStatus")
        public String memberAccountDisplayNameSyncStatus;

        /**
         * <p>The status of the member deletion feature. Valid values:</p>
         * <ul>
         * <li>Enabled: The feature is enabled. You can call the <a href="~~DeleteAccount~~">DeleteAccount</a> operation to delete members of the resource account type.</li>
         * <li>Disabled: The feature is disabled. You cannot delete members of the resource account type.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("MemberDeletionStatus")
        public String memberDeletionStatus;

        /**
         * <p>The ID of the resource directory.</p>
         * 
         * <strong>example:</strong>
         * <p>rd-St****</p>
         */
        @NameInMap("ResourceDirectoryId")
        public String resourceDirectoryId;

        /**
         * <p>The ID of the Root folder.</p>
         * 
         * <strong>example:</strong>
         * <p>r-Zo****</p>
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

        public GetResourceDirectoryResponseBodyResourceDirectory setMemberAccountDisplayNameSyncStatus(String memberAccountDisplayNameSyncStatus) {
            this.memberAccountDisplayNameSyncStatus = memberAccountDisplayNameSyncStatus;
            return this;
        }
        public String getMemberAccountDisplayNameSyncStatus() {
            return this.memberAccountDisplayNameSyncStatus;
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
