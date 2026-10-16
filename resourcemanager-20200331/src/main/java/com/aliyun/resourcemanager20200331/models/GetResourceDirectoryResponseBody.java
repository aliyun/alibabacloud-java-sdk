// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class GetResourceDirectoryResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CD76D376-2517-4924-92C5-DBC52262F93A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The resource directory information.</p>
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
         * <p>The status of the control policy. Valid values:</p>
         * <ul>
         * <li>Enabled: Enabled.</li>
         * <li>PendingEnable: Being enabled.</li>
         * <li>Disabled: Disabled.</li>
         * <li>PendingDisable: Being disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("ControlPolicyStatus")
        public String controlPolicyStatus;

        /**
         * <p>The time when the resource directory was created. The time is displayed in UTC in RFC 3339 format, indicated by Z.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-02-18T15:32:10.473Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The real-name verification information of the member.</p>
         * 
         * <strong>example:</strong>
         * <p>***有限公司</p>
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
         * <p>Indicates whether member deletion is enabled. Valid values:</p>
         * <ul>
         * <li>Enabled: Enabled. You can call <a href="https://help.aliyun.com/document_detail/311546.html">DeleteAccount</a> to delete members of the resource account type.</li>
         * <li>Disabled: Disabled. You cannot delete members of the resource account type.</li>
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
