// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class ListAccountsForParentResponseBody extends TeaModel {
    /**
     * <p>The information of the members.</p>
     */
    @NameInMap("Accounts")
    public ListAccountsForParentResponseBodyAccounts accounts;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>7B8A4E7D-6CFF-471D-84DF-195A7A241ECB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListAccountsForParentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAccountsForParentResponseBody self = new ListAccountsForParentResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAccountsForParentResponseBody setAccounts(ListAccountsForParentResponseBodyAccounts accounts) {
        this.accounts = accounts;
        return this;
    }
    public ListAccountsForParentResponseBodyAccounts getAccounts() {
        return this.accounts;
    }

    public ListAccountsForParentResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAccountsForParentResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAccountsForParentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAccountsForParentResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListAccountsForParentResponseBodyAccountsAccountTagsTag extends TeaModel {
        /**
         * <p>A tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>tag_key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>A tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>tag_value</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListAccountsForParentResponseBodyAccountsAccountTagsTag build(java.util.Map<String, ?> map) throws Exception {
            ListAccountsForParentResponseBodyAccountsAccountTagsTag self = new ListAccountsForParentResponseBodyAccountsAccountTagsTag();
            return TeaModel.build(map, self);
        }

        public ListAccountsForParentResponseBodyAccountsAccountTagsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListAccountsForParentResponseBodyAccountsAccountTagsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListAccountsForParentResponseBodyAccountsAccountTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<ListAccountsForParentResponseBodyAccountsAccountTagsTag> tag;

        public static ListAccountsForParentResponseBodyAccountsAccountTags build(java.util.Map<String, ?> map) throws Exception {
            ListAccountsForParentResponseBodyAccountsAccountTags self = new ListAccountsForParentResponseBodyAccountsAccountTags();
            return TeaModel.build(map, self);
        }

        public ListAccountsForParentResponseBodyAccountsAccountTags setTag(java.util.List<ListAccountsForParentResponseBodyAccountsAccountTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<ListAccountsForParentResponseBodyAccountsAccountTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class ListAccountsForParentResponseBodyAccountsAccount extends TeaModel {
        /**
         * <p>The Alibaba Cloud account ID of the member.</p>
         * 
         * <strong>example:</strong>
         * <p>184311716100****</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        /**
         * <p>The display name of the member.</p>
         * 
         * <strong>example:</strong>
         * <p>admin</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The ID of the folder.</p>
         * 
         * <strong>example:</strong>
         * <p>fd-bVaRIG****</p>
         */
        @NameInMap("FolderId")
        public String folderId;

        /**
         * <p>The way in which the member joins the resource directory.</p>
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
         * <p>2015-01-23T12:33:18Z</p>
         */
        @NameInMap("JoinTime")
        public String joinTime;

        /**
         * <p>The time when the member was modified. The time is displayed in UTC.</p>
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
         * <p>rd-k4****</p>
         */
        @NameInMap("ResourceDirectoryId")
        public String resourceDirectoryId;

        /**
         * <p>The status of the member. Valid values:</p>
         * <ul>
         * <li>CreateSuccess: The member is created.</li>
         * <li>PromoteVerifying: The upgrade of the member is being confirmed.</li>
         * <li>PromoteFailed: The upgrade of the member fails.</li>
         * <li>PromoteExpired: The upgrade of the member expires.</li>
         * <li>PromoteCancelled: The upgrade of the member is canceled.</li>
         * <li>PromoteSuccess: The member is upgraded.</li>
         * <li>InviteSuccess: The member accepts the invitation.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CreateSuccess</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The tags that are added to the member.</p>
         */
        @NameInMap("Tags")
        public ListAccountsForParentResponseBodyAccountsAccountTags tags;

        /**
         * <p>The type of the member.</p>
         * <ul>
         * <li>CloudAccount: cloud account</li>
         * <li>ResourceAccount: resource account</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ResourceAccount</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListAccountsForParentResponseBodyAccountsAccount build(java.util.Map<String, ?> map) throws Exception {
            ListAccountsForParentResponseBodyAccountsAccount self = new ListAccountsForParentResponseBodyAccountsAccount();
            return TeaModel.build(map, self);
        }

        public ListAccountsForParentResponseBodyAccountsAccount setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public ListAccountsForParentResponseBodyAccountsAccount setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListAccountsForParentResponseBodyAccountsAccount setFolderId(String folderId) {
            this.folderId = folderId;
            return this;
        }
        public String getFolderId() {
            return this.folderId;
        }

        public ListAccountsForParentResponseBodyAccountsAccount setJoinMethod(String joinMethod) {
            this.joinMethod = joinMethod;
            return this;
        }
        public String getJoinMethod() {
            return this.joinMethod;
        }

        public ListAccountsForParentResponseBodyAccountsAccount setJoinTime(String joinTime) {
            this.joinTime = joinTime;
            return this;
        }
        public String getJoinTime() {
            return this.joinTime;
        }

        public ListAccountsForParentResponseBodyAccountsAccount setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public ListAccountsForParentResponseBodyAccountsAccount setResourceDirectoryId(String resourceDirectoryId) {
            this.resourceDirectoryId = resourceDirectoryId;
            return this;
        }
        public String getResourceDirectoryId() {
            return this.resourceDirectoryId;
        }

        public ListAccountsForParentResponseBodyAccountsAccount setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListAccountsForParentResponseBodyAccountsAccount setTags(ListAccountsForParentResponseBodyAccountsAccountTags tags) {
            this.tags = tags;
            return this;
        }
        public ListAccountsForParentResponseBodyAccountsAccountTags getTags() {
            return this.tags;
        }

        public ListAccountsForParentResponseBodyAccountsAccount setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListAccountsForParentResponseBodyAccounts extends TeaModel {
        @NameInMap("Account")
        public java.util.List<ListAccountsForParentResponseBodyAccountsAccount> account;

        public static ListAccountsForParentResponseBodyAccounts build(java.util.Map<String, ?> map) throws Exception {
            ListAccountsForParentResponseBodyAccounts self = new ListAccountsForParentResponseBodyAccounts();
            return TeaModel.build(map, self);
        }

        public ListAccountsForParentResponseBodyAccounts setAccount(java.util.List<ListAccountsForParentResponseBodyAccountsAccount> account) {
            this.account = account;
            return this;
        }
        public java.util.List<ListAccountsForParentResponseBodyAccountsAccount> getAccount() {
            return this.account;
        }

    }

}
