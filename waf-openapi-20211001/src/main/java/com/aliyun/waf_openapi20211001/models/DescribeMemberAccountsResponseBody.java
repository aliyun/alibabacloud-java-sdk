// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeMemberAccountsResponseBody extends TeaModel {
    @NameInMap("AccountInfos")
    public java.util.List<DescribeMemberAccountsResponseBodyAccountInfos> accountInfos;

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
        @NameInMap("AccountId")
        public String accountId;

        @NameInMap("AccountName")
        public String accountName;

        @NameInMap("AccountStatus")
        public String accountStatus;

        @NameInMap("Description")
        public String description;

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
