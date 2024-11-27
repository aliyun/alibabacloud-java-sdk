// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class DetachDatabaseAccountsFromUserResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>79D7E114-CB52-5695-AB15-12776C308387</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The result of the call.</p>
     */
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
        /**
         * <p>The error code that is returned. If OK is returned, the operation was successful. If another error code is returned, the operation failed.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The ID of the database account on which the permissions are revoked.</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        @NameInMap("DatabaseAccountId")
        public String databaseAccountId;

        /**
         * <p>The error message that is returned.</p>
         */
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
        /**
         * <p>The error code that is returned. If <strong>OK</strong> is returned, the operation was successful. If another error code is returned, the operation failed.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>A list that shows the operation results of the database accounts.</p>
         */
        @NameInMap("DatabaseAccounts")
        public java.util.List<DetachDatabaseAccountsFromUserResponseBodyResultsDatabaseAccounts> databaseAccounts;

        /**
         * <p>The ID of the database on which the permissions are revoked.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
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
