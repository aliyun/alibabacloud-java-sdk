// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class AttachDatabaseAccountsToUserResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>23120B8E-8737-50BD-A3A3-902A7821F04D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The result of the call.</p>
     */
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
        /**
         * <p>The error code that is returned. If OK is returned, the authorization was successful. If another error code is returned, the authorization failed.</p>
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
         * <p>6</p>
         */
        @NameInMap("DatabaseAccountId")
        public String databaseAccountId;

        /**
         * <p>The error message that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
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
        /**
         * <p>The error code that is returned. If <strong>OK</strong> is returned, the authorization was successful. If another error code is returned, the authorization failed.</p>
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
        public java.util.List<AttachDatabaseAccountsToUserResponseBodyResultsDatabaseAccounts> databaseAccounts;

        /**
         * <p>The database ID.</p>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("DatabaseId")
        public String databaseId;

        /**
         * <p>The error message that is returned.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
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
