// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeMemberAccountsResponseBody extends TeaModel {
    /**
     * <p>The information about the member accounts.</p>
     */
    @NameInMap("AccountInfos")
    public java.util.List<DescribeMemberAccountsResponseBodyAccountInfos> accountInfos;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>50C4A80D-D46C-57E0-9A7D-03C078474852</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeMemberAccountsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMemberAccountsResponseBody self = new DescribeMemberAccountsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMemberAccountsResponseBody setAccountInfos(java.util.List<DescribeMemberAccountsResponseBodyAccountInfos> accountInfos) {
        this.accountInfos = accountInfos;
        return this;
    }
    public java.util.List<DescribeMemberAccountsResponseBodyAccountInfos> getAccountInfos() {
        return this.accountInfos;
    }

    public DescribeMemberAccountsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeMemberAccountsResponseBodyAccountInfos extends TeaModel {
        /**
         * <p>The ID of the member account.</p>
         * 
         * <strong>example:</strong>
         * <p>169************21</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        /**
         * <p>The name of the member account.</p>
         * 
         * <strong>example:</strong>
         * <p>ipflgmqqnbjg</p>
         */
        @NameInMap("AccountName")
        public String accountName;

        /**
         * <p>The status of the member account. Valid values:</p>
         * <ul>
         * <li><p><strong>enabled</strong>: The member account is being managed.</p>
         * </li>
         * <li><p><strong>disabled</strong>: The member account is not being managed.</p>
         * </li>
         * <li><p><strong>disabling</strong>: The member account is being removed from management.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("AccountStatus")
        public String accountStatus;

        /**
         * <p>The description of the member account.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The time when the member account was added. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1683367751000</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        public static DescribeMemberAccountsResponseBodyAccountInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeMemberAccountsResponseBodyAccountInfos self = new DescribeMemberAccountsResponseBodyAccountInfos();
            return TeaModel.build(map, self);
        }

        public DescribeMemberAccountsResponseBodyAccountInfos setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public DescribeMemberAccountsResponseBodyAccountInfos setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public DescribeMemberAccountsResponseBodyAccountInfos setAccountStatus(String accountStatus) {
            this.accountStatus = accountStatus;
            return this;
        }
        public String getAccountStatus() {
            return this.accountStatus;
        }

        public DescribeMemberAccountsResponseBodyAccountInfos setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeMemberAccountsResponseBodyAccountInfos setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

    }

}
