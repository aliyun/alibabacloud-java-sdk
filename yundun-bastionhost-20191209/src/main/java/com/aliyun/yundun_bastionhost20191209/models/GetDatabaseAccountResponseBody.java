// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class GetDatabaseAccountResponseBody extends TeaModel {
    @NameInMap("DatabaseAccount")
    public GetDatabaseAccountResponseBodyDatabaseAccount databaseAccount;

    @NameInMap("RequestId")
    public String requestId;

    public static GetDatabaseAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDatabaseAccountResponseBody self = new GetDatabaseAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDatabaseAccountResponseBody setDatabaseAccount(GetDatabaseAccountResponseBodyDatabaseAccount databaseAccount) {
        this.databaseAccount = databaseAccount;
        return this;
    }
    public GetDatabaseAccountResponseBodyDatabaseAccount getDatabaseAccount() {
        return this.databaseAccount;
    }

    public GetDatabaseAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDatabaseAccountResponseBodyDatabaseAccount extends TeaModel {
        @NameInMap("DatabaseAccountId")
        public String databaseAccountId;

        @NameInMap("DatabaseAccountName")
        public String databaseAccountName;

        @NameInMap("DatabaseSchema")
        public String databaseSchema;

        @NameInMap("HasPassword")
        public Boolean hasPassword;

        @NameInMap("LoginAttribute")
        public String loginAttribute;

        public static GetDatabaseAccountResponseBodyDatabaseAccount build(java.util.Map<String, ?> map) throws Exception {
            GetDatabaseAccountResponseBodyDatabaseAccount self = new GetDatabaseAccountResponseBodyDatabaseAccount();
            return TeaModel.build(map, self);
        }

        public GetDatabaseAccountResponseBodyDatabaseAccount setDatabaseAccountId(String databaseAccountId) {
            this.databaseAccountId = databaseAccountId;
            return this;
        }
        public String getDatabaseAccountId() {
            return this.databaseAccountId;
        }

        public GetDatabaseAccountResponseBodyDatabaseAccount setDatabaseAccountName(String databaseAccountName) {
            this.databaseAccountName = databaseAccountName;
            return this;
        }
        public String getDatabaseAccountName() {
            return this.databaseAccountName;
        }

        public GetDatabaseAccountResponseBodyDatabaseAccount setDatabaseSchema(String databaseSchema) {
            this.databaseSchema = databaseSchema;
            return this;
        }
        public String getDatabaseSchema() {
            return this.databaseSchema;
        }

        public GetDatabaseAccountResponseBodyDatabaseAccount setHasPassword(Boolean hasPassword) {
            this.hasPassword = hasPassword;
            return this;
        }
        public Boolean getHasPassword() {
            return this.hasPassword;
        }

        public GetDatabaseAccountResponseBodyDatabaseAccount setLoginAttribute(String loginAttribute) {
            this.loginAttribute = loginAttribute;
            return this;
        }
        public String getLoginAttribute() {
            return this.loginAttribute;
        }

    }

}
