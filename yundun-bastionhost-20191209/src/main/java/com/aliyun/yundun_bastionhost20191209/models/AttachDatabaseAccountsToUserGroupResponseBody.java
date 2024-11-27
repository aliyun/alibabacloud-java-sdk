// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class AttachDatabaseAccountsToUserGroupResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5D0EB759-CB0A-537D-A2CC-13A9854FA08D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The result of the call.</p>
     */
    @NameInMap("Results")
    public java.util.List<AttachDatabaseAccountsToUserGroupResponseBodyResults> results;

    public static AttachDatabaseAccountsToUserGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AttachDatabaseAccountsToUserGroupResponseBody self = new AttachDatabaseAccountsToUserGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public AttachDatabaseAccountsToUserGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AttachDatabaseAccountsToUserGroupResponseBody setResults(java.util.List<AttachDatabaseAccountsToUserGroupResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<AttachDatabaseAccountsToUserGroupResponseBodyResults> getResults() {
        return this.results;
    }

    public static class AttachDatabaseAccountsToUserGroupResponseBodyResultsDatabaseAccounts extends TeaModel {
        /**
         * <p>The error code returned. If OK is returned, the authorization was successful. If another error code is returned, the authorization failed.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The database account ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("DatabaseAccountId")
        public String databaseAccountId;

        /**
         * <p>The error message returned.</p>
         */
        @NameInMap("Message")
        public String message;

        public static AttachDatabaseAccountsToUserGroupResponseBodyResultsDatabaseAccounts build(java.util.Map<String, ?> map) throws Exception {
            AttachDatabaseAccountsToUserGroupResponseBodyResultsDatabaseAccounts self = new AttachDatabaseAccountsToUserGroupResponseBodyResultsDatabaseAccounts();
            return TeaModel.build(map, self);
        }

        public AttachDatabaseAccountsToUserGroupResponseBodyResultsDatabaseAccounts setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public AttachDatabaseAccountsToUserGroupResponseBodyResultsDatabaseAccounts setDatabaseAccountId(String databaseAccountId) {
            this.databaseAccountId = databaseAccountId;
            return this;
        }
        public String getDatabaseAccountId() {
            return this.databaseAccountId;
        }

        public AttachDatabaseAccountsToUserGroupResponseBodyResultsDatabaseAccounts setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class AttachDatabaseAccountsToUserGroupResponseBodyResults extends TeaModel {
        /**
         * <p>The error code returned. If OK is returned, the authorization was successful. If another error code is returned, the authorization failed.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>A list that shows the authorization results of the database accounts.</p>
         */
        @NameInMap("DatabaseAccounts")
        public java.util.List<AttachDatabaseAccountsToUserGroupResponseBodyResultsDatabaseAccounts> databaseAccounts;

        /**
         * <p>The database ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("DatabaseId")
        public String databaseId;

        /**
         * <p>The error message returned.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The user group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("UserGroupId")
        public String userGroupId;

        public static AttachDatabaseAccountsToUserGroupResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            AttachDatabaseAccountsToUserGroupResponseBodyResults self = new AttachDatabaseAccountsToUserGroupResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public AttachDatabaseAccountsToUserGroupResponseBodyResults setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public AttachDatabaseAccountsToUserGroupResponseBodyResults setDatabaseAccounts(java.util.List<AttachDatabaseAccountsToUserGroupResponseBodyResultsDatabaseAccounts> databaseAccounts) {
            this.databaseAccounts = databaseAccounts;
            return this;
        }
        public java.util.List<AttachDatabaseAccountsToUserGroupResponseBodyResultsDatabaseAccounts> getDatabaseAccounts() {
            return this.databaseAccounts;
        }

        public AttachDatabaseAccountsToUserGroupResponseBodyResults setDatabaseId(String databaseId) {
            this.databaseId = databaseId;
            return this;
        }
        public String getDatabaseId() {
            return this.databaseId;
        }

        public AttachDatabaseAccountsToUserGroupResponseBodyResults setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public AttachDatabaseAccountsToUserGroupResponseBodyResults setUserGroupId(String userGroupId) {
            this.userGroupId = userGroupId;
            return this;
        }
        public String getUserGroupId() {
            return this.userGroupId;
        }

    }

}
