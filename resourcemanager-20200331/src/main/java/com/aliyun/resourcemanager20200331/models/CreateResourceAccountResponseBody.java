// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class CreateResourceAccountResponseBody extends TeaModel {
    /**
     * <p>The information about the member.</p>
     */
    @NameInMap("Account")
    public CreateResourceAccountResponseBodyAccount account;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B356A415-D860-43E5-865A-E2193D62BBD6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateResourceAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateResourceAccountResponseBody self = new CreateResourceAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateResourceAccountResponseBody setAccount(CreateResourceAccountResponseBodyAccount account) {
        this.account = account;
        return this;
    }
    public CreateResourceAccountResponseBodyAccount getAccount() {
        return this.account;
    }

    public CreateResourceAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateResourceAccountResponseBodyAccount extends TeaModel {
        /**
         * <p>The ID of the member.</p>
         * 
         * <strong>example:</strong>
         * <p>112730938585****</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        /**
         * <p>The Alibaba Cloud account ID of the member.</p>
         * 
         * <strong>example:</strong>
         * <p>alice@rd-3g****.aliyunid.com</p>
         */
        @NameInMap("AccountName")
        public String accountName;

        /**
         * <p>The display name of the member.</p>
         * 
         * <strong>example:</strong>
         * <p>Dev</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The ID of the folder.</p>
         * 
         * <strong>example:</strong>
         * <p>fd-r23M55****</p>
         */
        @NameInMap("FolderId")
        public String folderId;

        /**
         * <p>The way in which the member joins the resource directory. Valid values:</p>
         * <ul>
         * <li>invited: The member is invited to join the resource directory.</li>
         * <li>created: The member is directly created in the resource directory.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>created</p>
         */
        @NameInMap("JoinMethod")
        public String joinMethod;

        /**
         * <p>The time when the member joined the resource directory. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-12-31T03:37:39.456Z</p>
         */
        @NameInMap("JoinTime")
        public String joinTime;

        /**
         * <p>The time when the member was modified. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-12-31T03:37:39.456Z</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <p>The ID of the resource directory.</p>
         * 
         * <strong>example:</strong>
         * <p>rd-3G****</p>
         */
        @NameInMap("ResourceDirectoryId")
        public String resourceDirectoryId;

        /**
         * <p>The status of the member. The value CreateSuccess indicates that the member is created.</p>
         * 
         * <strong>example:</strong>
         * <p>CreateSuccess</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The type of the member. The value ResourceAccount indicates that the member is a resource account.</p>
         * 
         * <strong>example:</strong>
         * <p>ResourceAccount</p>
         */
        @NameInMap("Type")
        public String type;

        public static CreateResourceAccountResponseBodyAccount build(java.util.Map<String, ?> map) throws Exception {
            CreateResourceAccountResponseBodyAccount self = new CreateResourceAccountResponseBodyAccount();
            return TeaModel.build(map, self);
        }

        public CreateResourceAccountResponseBodyAccount setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public CreateResourceAccountResponseBodyAccount setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public CreateResourceAccountResponseBodyAccount setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public CreateResourceAccountResponseBodyAccount setFolderId(String folderId) {
            this.folderId = folderId;
            return this;
        }
        public String getFolderId() {
            return this.folderId;
        }

        public CreateResourceAccountResponseBodyAccount setJoinMethod(String joinMethod) {
            this.joinMethod = joinMethod;
            return this;
        }
        public String getJoinMethod() {
            return this.joinMethod;
        }

        public CreateResourceAccountResponseBodyAccount setJoinTime(String joinTime) {
            this.joinTime = joinTime;
            return this;
        }
        public String getJoinTime() {
            return this.joinTime;
        }

        public CreateResourceAccountResponseBodyAccount setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public CreateResourceAccountResponseBodyAccount setResourceDirectoryId(String resourceDirectoryId) {
            this.resourceDirectoryId = resourceDirectoryId;
            return this;
        }
        public String getResourceDirectoryId() {
            return this.resourceDirectoryId;
        }

        public CreateResourceAccountResponseBodyAccount setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateResourceAccountResponseBodyAccount setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
