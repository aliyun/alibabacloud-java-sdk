// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeMemberAccountsResponseBody extends TeaModel {
    /**
     * <p>The information about the member.</p>
     */
    @NameInMap("AccountInfos")
    public java.util.List<DescribeMemberAccountsResponseBodyAccountInfos> accountInfos;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>50C4A80D-D46C-57E0-9A7D-03C0****4852</p>
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
         * <p>The ID of the member.</p>
         * 
         * <strong>example:</strong>
         * <p>169************21</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        /**
         * <p>The name of the member.</p>
         * 
         * <strong>example:</strong>
         * <p>ipflgmqqnbjg</p>
         */
        @NameInMap("AccountName")
        public String accountName;

        /**
         * <p>The status of the member.</p>
         * <ul>
         * <li><strong>enabled</strong>: managed.</li>
         * <li><strong>disabled</strong>: not managed.</li>
         * <li><strong>disabling</strong>: being deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("AccountStatus")
        public String accountStatus;

        /**
         * <p>The description of the member.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The time when the member was added.</p>
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
