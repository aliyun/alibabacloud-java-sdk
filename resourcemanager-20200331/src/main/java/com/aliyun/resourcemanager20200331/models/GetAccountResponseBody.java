// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class GetAccountResponseBody extends TeaModel {
    /**
     * <p>The member account information.</p>
     */
    @NameInMap("Account")
    public GetAccountResponseBodyAccount account;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9B34724D-54B0-4A51-B34D-4512372FE1BE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAccountResponseBody self = new GetAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAccountResponseBody setAccount(GetAccountResponseBodyAccount account) {
        this.account = account;
        return this;
    }
    public GetAccountResponseBodyAccount getAccount() {
        return this.account;
    }

    public GetAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAccountResponseBodyAccountTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>tag_key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>tag_value</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetAccountResponseBodyAccountTags build(java.util.Map<String, ?> map) throws Exception {
            GetAccountResponseBodyAccountTags self = new GetAccountResponseBodyAccountTags();
            return TeaModel.build(map, self);
        }

        public GetAccountResponseBodyAccountTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetAccountResponseBodyAccountTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetAccountResponseBodyAccount extends TeaModel {
        /**
         * <p>The member account ID.</p>
         * 
         * <strong>example:</strong>
         * <p>181761095690****</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        /**
         * <p>The name of the account.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:someone@example.com">someone@example.com</a></p>
         */
        @NameInMap("AccountName")
        public String accountName;

        /**
         * <p>The display name of the member account.</p>
         * 
         * <strong>example:</strong>
         * <p>admin</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The email status. Valid values:</p>
         * <ul>
         * <li>Empty: No email modification record exists.</li>
         * <li>WAIT_MODIFY: The modification is in progress.</li>
         * <li>CANCELLED: The modification is canceled.</li>
         * <li>EXPIRED: The modification has expired.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>WAIT_MODIFY</p>
         */
        @NameInMap("EmailStatus")
        public String emailStatus;

        /**
         * <p>The ID of the folder.</p>
         * 
         * <strong>example:</strong>
         * <p>fd-bVaRIG****</p>
         */
        @NameInMap("FolderId")
        public String folderId;

        /**
         * <p>The real-name verification information.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun-admin</p>
         */
        @NameInMap("IdentityInformation")
        public String identityInformation;

        /**
         * <p>The method used by the member account to join the resource directory. Valid values:</p>
         * <ul>
         * <li>invited: Invited.</li>
         * <li>created: Created.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>created</p>
         */
        @NameInMap("JoinMethod")
        public String joinMethod;

        /**
         * <p>The time when the member account joined the resource directory. The time is displayed in UTC, as specified by RFC 3339, with Z indicating UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2015-01-23T12:33:18Z</p>
         */
        @NameInMap("JoinTime")
        public String joinTime;

        /**
         * <p>The location of the member account in the resource directory.</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>The time when the member account was last modified. The time is displayed in UTC, as specified by RFC 3339, with Z indicating UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2015-01-23T12:33:18Z</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <p>The ID of the resource directory.</p>
         * 
         * <strong>example:</strong>
         * <p>rd-k3****</p>
         */
        @NameInMap("ResourceDirectoryId")
        public String resourceDirectoryId;

        /**
         * <p>The path ID (RDPath) of the member account in the resource directory.</p>
         */
        @NameInMap("ResourceDirectoryPath")
        public String resourceDirectoryPath;

        /**
         * <p>The join status of the member account. Valid values:</p>
         * <ul>
         * <li>CreateSuccess: Created.</li>
         * <li>PromoteVerifying: Upgrade is being confirmed.</li>
         * <li>PromoteFailed: Upgrade failed.</li>
         * <li>PromoteExpired: Upgrade expired.</li>
         * <li>PromoteCancelled: Upgrade canceled.</li>
         * <li>PromoteSuccess: Upgrade succeeded.</li>
         * <li>InviteSuccess: Invitation succeeded.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CreateSuccess</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<GetAccountResponseBodyAccountTags> tags;

        /**
         * <p>The type of the member account. Valid values:</p>
         * <ul>
         * <li>CloudAccount: Cloud account.</li>
         * <li>ResourceAccount: Resource account.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ResourceAccount</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetAccountResponseBodyAccount build(java.util.Map<String, ?> map) throws Exception {
            GetAccountResponseBodyAccount self = new GetAccountResponseBodyAccount();
            return TeaModel.build(map, self);
        }

        public GetAccountResponseBodyAccount setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public GetAccountResponseBodyAccount setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public GetAccountResponseBodyAccount setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetAccountResponseBodyAccount setEmailStatus(String emailStatus) {
            this.emailStatus = emailStatus;
            return this;
        }
        public String getEmailStatus() {
            return this.emailStatus;
        }

        public GetAccountResponseBodyAccount setFolderId(String folderId) {
            this.folderId = folderId;
            return this;
        }
        public String getFolderId() {
            return this.folderId;
        }

        public GetAccountResponseBodyAccount setIdentityInformation(String identityInformation) {
            this.identityInformation = identityInformation;
            return this;
        }
        public String getIdentityInformation() {
            return this.identityInformation;
        }

        public GetAccountResponseBodyAccount setJoinMethod(String joinMethod) {
            this.joinMethod = joinMethod;
            return this;
        }
        public String getJoinMethod() {
            return this.joinMethod;
        }

        public GetAccountResponseBodyAccount setJoinTime(String joinTime) {
            this.joinTime = joinTime;
            return this;
        }
        public String getJoinTime() {
            return this.joinTime;
        }

        public GetAccountResponseBodyAccount setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public GetAccountResponseBodyAccount setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public GetAccountResponseBodyAccount setResourceDirectoryId(String resourceDirectoryId) {
            this.resourceDirectoryId = resourceDirectoryId;
            return this;
        }
        public String getResourceDirectoryId() {
            return this.resourceDirectoryId;
        }

        public GetAccountResponseBodyAccount setResourceDirectoryPath(String resourceDirectoryPath) {
            this.resourceDirectoryPath = resourceDirectoryPath;
            return this;
        }
        public String getResourceDirectoryPath() {
            return this.resourceDirectoryPath;
        }

        public GetAccountResponseBodyAccount setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetAccountResponseBodyAccount setTags(java.util.List<GetAccountResponseBodyAccountTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<GetAccountResponseBodyAccountTags> getTags() {
            return this.tags;
        }

        public GetAccountResponseBodyAccount setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
