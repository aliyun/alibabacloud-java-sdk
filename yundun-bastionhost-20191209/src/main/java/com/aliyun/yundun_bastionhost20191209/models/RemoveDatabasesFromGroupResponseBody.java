// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class RemoveDatabasesFromGroupResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EC9BF0F4-8983-491A-BC8C-1B4DD94976DE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The result of the call.</p>
     */
    @NameInMap("Results")
    public java.util.List<RemoveDatabasesFromGroupResponseBodyResults> results;

    public static RemoveDatabasesFromGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveDatabasesFromGroupResponseBody self = new RemoveDatabasesFromGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveDatabasesFromGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RemoveDatabasesFromGroupResponseBody setResults(java.util.List<RemoveDatabasesFromGroupResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<RemoveDatabasesFromGroupResponseBodyResults> getResults() {
        return this.results;
    }

    public static class RemoveDatabasesFromGroupResponseBodyResults extends TeaModel {
        /**
         * <p>The error code that is returned. If OK is returned, the operation was successful. If another error code is returned, the operation failed.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The database ID.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("DatabaseId")
        public String databaseId;

        /**
         * <p>The asset group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("HostGroupId")
        public String hostGroupId;

        /**
         * <p>The error message that is returned.</p>
         */
        @NameInMap("Message")
        public String message;

        public static RemoveDatabasesFromGroupResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            RemoveDatabasesFromGroupResponseBodyResults self = new RemoveDatabasesFromGroupResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public RemoveDatabasesFromGroupResponseBodyResults setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public RemoveDatabasesFromGroupResponseBodyResults setDatabaseId(String databaseId) {
            this.databaseId = databaseId;
            return this;
        }
        public String getDatabaseId() {
            return this.databaseId;
        }

        public RemoveDatabasesFromGroupResponseBodyResults setHostGroupId(String hostGroupId) {
            this.hostGroupId = hostGroupId;
            return this;
        }
        public String getHostGroupId() {
            return this.hostGroupId;
        }

        public RemoveDatabasesFromGroupResponseBodyResults setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
