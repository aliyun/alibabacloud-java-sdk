// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class GetDatabaseAccountResponseBody extends TeaModel {
    /**
     * <p>The returned information about the database account.</p>
     */
    @NameInMap("DatabaseAccount")
    public GetDatabaseAccountResponseBodyDatabaseAccount databaseAccount;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>FA06D274-8D0A-59FB-8B7E-584C0EEBBFFF</p>
     */
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
        /**
         * <p>The database account ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        @NameInMap("DatabaseAccountId")
        public String databaseAccountId;

        /**
         * <p>The name of the database account.</p>
         * 
         * <strong>example:</strong>
         * <p>uac</p>
         */
        @NameInMap("DatabaseAccountName")
        public String databaseAccountName;

        /**
         * <p>The database name. A value is returned for this parameter if the database engine is PostgreSQL or Oracle.</p>
         * 
         * <strong>example:</strong>
         * <p>orcl</p>
         */
        @NameInMap("DatabaseSchema")
        public String databaseSchema;

        /**
         * <p>Indicates whether the database account has a password.
         * Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasPassword")
        public Boolean hasPassword;

        /**
         * <p>The logon attribute. A value is returned for this parameter if the database engine is Oracle. Valid values:</p>
         * <ul>
         * <li>SERVICENAME</li>
         * <li>SID</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SID</p>
         */
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
