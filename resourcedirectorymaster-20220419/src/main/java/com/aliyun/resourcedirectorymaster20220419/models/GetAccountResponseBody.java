// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class GetAccountResponseBody extends TeaModel {
    /**
     * <p>The information of the member.</p>
     */
    @NameInMap("Account")
    public GetAccountResponseBodyAccount account;

    /**
     * <p>The ID of the request.</p>
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
         * <p>A tag key.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>A tag value.</p>
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
         * <p>The Alibaba Cloud account ID of the member.</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        /**
         * <p>The Alibaba Cloud account name of the member.</p>
         */
        @NameInMap("AccountName")
        public String accountName;

        /**
         * <p>The display name of the member.</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The status of the modification for the email address bound to the member. Valid values:</p>
         * <br>
         * <p>*   If the value of this parameter is empty, no modification is performed for the email address.</p>
         * <p>*   WAIT_MODIFY: The modification is being performed.</p>
         * <p>*   CANCELLED: The modification is canceled.</p>
         * <p>*   EXPIRED: The modification expires.</p>
         */
        @NameInMap("EmailStatus")
        public String emailStatus;

        /**
         * <p>The ID of the folder.</p>
         */
        @NameInMap("FolderId")
        public String folderId;

        /**
         * <p>The real-name verification information.</p>
         */
        @NameInMap("IdentityInformation")
        public String identityInformation;

        /**
         * <p>The way in which the member joins the resource directory. Valid values:</p>
         * <br>
         * <p>*   invited: The member is invited to join the resource directory.</p>
         * <p>*   created: The member is directly created in the resource directory.</p>
         */
        @NameInMap("JoinMethod")
        public String joinMethod;

        /**
         * <p>The time when the member joined the resource directory.</p>
         */
        @NameInMap("JoinTime")
        public String joinTime;

        /**
         * <p>The location of the member in the resource directory.</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>The time when the member was modified.</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <p>The ID of the resource directory.</p>
         */
        @NameInMap("ResourceDirectoryId")
        public String resourceDirectoryId;

        /**
         * <p>The path of the member in the resource directory.</p>
         */
        @NameInMap("ResourceDirectoryPath")
        public String resourceDirectoryPath;

        /**
         * <p>The status of the member. Valid values:</p>
         * <br>
         * <p>*   CreateSuccess: The member is created.</p>
         * <p>*   PromoteVerifying: The upgrade of the member is being confirmed.</p>
         * <p>*   PromoteFailed: The upgrade of the member fails.</p>
         * <p>*   PromoteExpired: The upgrade of the member expires.</p>
         * <p>*   PromoteCancelled: The upgrade of the member is canceled.</p>
         * <p>*   PromoteSuccess: The member is upgraded.</p>
         * <p>*   InviteSuccess: The member accepts the invitation.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The tags of the member.</p>
         */
        @NameInMap("Tags")
        public java.util.List<GetAccountResponseBodyAccountTags> tags;

        /**
         * <p>The type of the member. Valid values:</p>
         * <br>
         * <p>*   CloudAccount: cloud account</p>
         * <p>*   ResourceAccount: resource account</p>
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
