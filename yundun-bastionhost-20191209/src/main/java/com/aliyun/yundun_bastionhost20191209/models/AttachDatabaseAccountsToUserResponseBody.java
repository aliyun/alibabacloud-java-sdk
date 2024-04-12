// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class AttachDatabaseAccountsToUserResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Results")
    public java.util.List<AttachDatabaseAccountsToUserResponseBodyResults> results;

    public static AttachDatabaseAccountsToUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AttachDatabaseAccountsToUserResponseBody self = new AttachDatabaseAccountsToUserResponseBody();
        return TeaModel.build(map, self);
    }

    public AttachDatabaseAccountsToUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AttachDatabaseAccountsToUserResponseBody setResults(java.util.List<AttachDatabaseAccountsToUserResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<AttachDatabaseAccountsToUserResponseBodyResults> getResults() {
        return this.results;
    }

    public static class AttachDatabaseAccountsToUserResponseBodyResultsDatabaseAccounts extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("DatabaseAccountId")
        public String databaseAccountId;

        @NameInMap("Message")
        public String message;

        public static AttachDatabaseAccountsToUserResponseBodyResultsDatabaseAccounts build(java.util.Map<String, ?> map) throws Exception {
            AttachDatabaseAccountsToUserResponseBodyResultsDatabaseAccounts self = new AttachDatabaseAccountsToUserResponseBodyResultsDatabaseAccounts();
            return TeaModel.build(map, self);
        }

        public AttachDatabaseAccountsToUserResponseBodyResultsDatabaseAccounts setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public AttachDatabaseAccountsToUserResponseBodyResultsDatabaseAccounts setDatabaseAccountId(String databaseAccountId) {
            this.databaseAccountId = databaseAccountId;
            return this;
        }
        public String getDatabaseAccountId() {
            return this.databaseAccountId;
        }

        public AttachDatabaseAccountsToUserResponseBodyResultsDatabaseAccounts setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class AttachDatabaseAccountsToUserResponseBodyResults extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("DatabaseAccounts")
        public java.util.List<AttachDatabaseAccountsToUserResponseBodyResultsDatabaseAccounts> databaseAccounts;

        @NameInMap("DatabaseId")
        public String databaseId;

        @NameInMap("Message")
        public String message;

        @NameInMap("UserId")
        public String userId;

        public static AttachDatabaseAccountsToUserResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            AttachDatabaseAccountsToUserResponseBodyResults self = new AttachDatabaseAccountsToUserResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public AttachDatabaseAccountsToUserResponseBodyResults setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public AttachDatabaseAccountsToUserResponseBodyResults setDatabaseAccounts(java.util.List<AttachDatabaseAccountsToUserResponseBodyResultsDatabaseAccounts> databaseAccounts) {
            this.databaseAccounts = databaseAccounts;
            return this;
        }
        public java.util.List<AttachDatabaseAccountsToUserResponseBodyResultsDatabaseAccounts> getDatabaseAccounts() {
            return this.databaseAccounts;
        }

        public AttachDatabaseAccountsToUserResponseBodyResults setDatabaseId(String databaseId) {
            this.databaseId = databaseId;
            return this;
        }
        public String getDatabaseId() {
            return this.databaseId;
        }

        public AttachDatabaseAccountsToUserResponseBodyResults setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public AttachDatabaseAccountsToUserResponseBodyResults setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
