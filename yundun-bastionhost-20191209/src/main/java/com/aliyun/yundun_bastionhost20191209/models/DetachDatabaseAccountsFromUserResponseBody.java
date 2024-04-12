// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class DetachDatabaseAccountsFromUserResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Results")
    public java.util.List<DetachDatabaseAccountsFromUserResponseBodyResults> results;

    public static DetachDatabaseAccountsFromUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetachDatabaseAccountsFromUserResponseBody self = new DetachDatabaseAccountsFromUserResponseBody();
        return TeaModel.build(map, self);
    }

    public DetachDatabaseAccountsFromUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DetachDatabaseAccountsFromUserResponseBody setResults(java.util.List<DetachDatabaseAccountsFromUserResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<DetachDatabaseAccountsFromUserResponseBodyResults> getResults() {
        return this.results;
    }

    public static class DetachDatabaseAccountsFromUserResponseBodyResultsDatabaseAccounts extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("DatabaseAccountId")
        public String databaseAccountId;

        @NameInMap("Message")
        public String message;

        public static DetachDatabaseAccountsFromUserResponseBodyResultsDatabaseAccounts build(java.util.Map<String, ?> map) throws Exception {
            DetachDatabaseAccountsFromUserResponseBodyResultsDatabaseAccounts self = new DetachDatabaseAccountsFromUserResponseBodyResultsDatabaseAccounts();
            return TeaModel.build(map, self);
        }

        public DetachDatabaseAccountsFromUserResponseBodyResultsDatabaseAccounts setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DetachDatabaseAccountsFromUserResponseBodyResultsDatabaseAccounts setDatabaseAccountId(String databaseAccountId) {
            this.databaseAccountId = databaseAccountId;
            return this;
        }
        public String getDatabaseAccountId() {
            return this.databaseAccountId;
        }

        public DetachDatabaseAccountsFromUserResponseBodyResultsDatabaseAccounts setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class DetachDatabaseAccountsFromUserResponseBodyResults extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("DatabaseAccounts")
        public java.util.List<DetachDatabaseAccountsFromUserResponseBodyResultsDatabaseAccounts> databaseAccounts;

        @NameInMap("DatabaseId")
        public String databaseId;

        @NameInMap("Message")
        public String message;

        @NameInMap("UserId")
        public String userId;

        public static DetachDatabaseAccountsFromUserResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            DetachDatabaseAccountsFromUserResponseBodyResults self = new DetachDatabaseAccountsFromUserResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public DetachDatabaseAccountsFromUserResponseBodyResults setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DetachDatabaseAccountsFromUserResponseBodyResults setDatabaseAccounts(java.util.List<DetachDatabaseAccountsFromUserResponseBodyResultsDatabaseAccounts> databaseAccounts) {
            this.databaseAccounts = databaseAccounts;
            return this;
        }
        public java.util.List<DetachDatabaseAccountsFromUserResponseBodyResultsDatabaseAccounts> getDatabaseAccounts() {
            return this.databaseAccounts;
        }

        public DetachDatabaseAccountsFromUserResponseBodyResults setDatabaseId(String databaseId) {
            this.databaseId = databaseId;
            return this;
        }
        public String getDatabaseId() {
            return this.databaseId;
        }

        public DetachDatabaseAccountsFromUserResponseBodyResults setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DetachDatabaseAccountsFromUserResponseBodyResults setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
