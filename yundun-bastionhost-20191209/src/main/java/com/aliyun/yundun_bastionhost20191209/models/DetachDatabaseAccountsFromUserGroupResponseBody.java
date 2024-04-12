// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class DetachDatabaseAccountsFromUserGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Results")
    public java.util.List<DetachDatabaseAccountsFromUserGroupResponseBodyResults> results;

    public static DetachDatabaseAccountsFromUserGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetachDatabaseAccountsFromUserGroupResponseBody self = new DetachDatabaseAccountsFromUserGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DetachDatabaseAccountsFromUserGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DetachDatabaseAccountsFromUserGroupResponseBody setResults(java.util.List<DetachDatabaseAccountsFromUserGroupResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<DetachDatabaseAccountsFromUserGroupResponseBodyResults> getResults() {
        return this.results;
    }

    public static class DetachDatabaseAccountsFromUserGroupResponseBodyResultsDatabaseAccounts extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("DatabaseAccountId")
        public String databaseAccountId;

        @NameInMap("Message")
        public String message;

        public static DetachDatabaseAccountsFromUserGroupResponseBodyResultsDatabaseAccounts build(java.util.Map<String, ?> map) throws Exception {
            DetachDatabaseAccountsFromUserGroupResponseBodyResultsDatabaseAccounts self = new DetachDatabaseAccountsFromUserGroupResponseBodyResultsDatabaseAccounts();
            return TeaModel.build(map, self);
        }

        public DetachDatabaseAccountsFromUserGroupResponseBodyResultsDatabaseAccounts setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DetachDatabaseAccountsFromUserGroupResponseBodyResultsDatabaseAccounts setDatabaseAccountId(String databaseAccountId) {
            this.databaseAccountId = databaseAccountId;
            return this;
        }
        public String getDatabaseAccountId() {
            return this.databaseAccountId;
        }

        public DetachDatabaseAccountsFromUserGroupResponseBodyResultsDatabaseAccounts setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class DetachDatabaseAccountsFromUserGroupResponseBodyResults extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("DatabaseAccounts")
        public java.util.List<DetachDatabaseAccountsFromUserGroupResponseBodyResultsDatabaseAccounts> databaseAccounts;

        @NameInMap("DatabaseId")
        public String databaseId;

        @NameInMap("Message")
        public String message;

        @NameInMap("UserGroupId")
        public String userGroupId;

        public static DetachDatabaseAccountsFromUserGroupResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            DetachDatabaseAccountsFromUserGroupResponseBodyResults self = new DetachDatabaseAccountsFromUserGroupResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public DetachDatabaseAccountsFromUserGroupResponseBodyResults setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DetachDatabaseAccountsFromUserGroupResponseBodyResults setDatabaseAccounts(java.util.List<DetachDatabaseAccountsFromUserGroupResponseBodyResultsDatabaseAccounts> databaseAccounts) {
            this.databaseAccounts = databaseAccounts;
            return this;
        }
        public java.util.List<DetachDatabaseAccountsFromUserGroupResponseBodyResultsDatabaseAccounts> getDatabaseAccounts() {
            return this.databaseAccounts;
        }

        public DetachDatabaseAccountsFromUserGroupResponseBodyResults setDatabaseId(String databaseId) {
            this.databaseId = databaseId;
            return this;
        }
        public String getDatabaseId() {
            return this.databaseId;
        }

        public DetachDatabaseAccountsFromUserGroupResponseBodyResults setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DetachDatabaseAccountsFromUserGroupResponseBodyResults setUserGroupId(String userGroupId) {
            this.userGroupId = userGroupId;
            return this;
        }
        public String getUserGroupId() {
            return this.userGroupId;
        }

    }

}
