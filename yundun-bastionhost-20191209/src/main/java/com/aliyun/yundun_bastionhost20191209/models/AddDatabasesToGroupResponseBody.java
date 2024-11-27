// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class AddDatabasesToGroupResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EC9BF0F4-8983-491A-BC8C-1B4DD94976DE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Results")
    public java.util.List<AddDatabasesToGroupResponseBodyResults> results;

    public static AddDatabasesToGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddDatabasesToGroupResponseBody self = new AddDatabasesToGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public AddDatabasesToGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddDatabasesToGroupResponseBody setResults(java.util.List<AddDatabasesToGroupResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<AddDatabasesToGroupResponseBodyResults> getResults() {
        return this.results;
    }

    public static class AddDatabasesToGroupResponseBodyResults extends TeaModel {
        /**
         * <p>The error code returned. If <strong>OK</strong> is returned, the operation was successful. If another error code is returned, the operation failed.</p>
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
         * <p>9</p>
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
         * <p>The error message returned.</p>
         */
        @NameInMap("Message")
        public String message;

        public static AddDatabasesToGroupResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            AddDatabasesToGroupResponseBodyResults self = new AddDatabasesToGroupResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public AddDatabasesToGroupResponseBodyResults setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public AddDatabasesToGroupResponseBodyResults setDatabaseId(String databaseId) {
            this.databaseId = databaseId;
            return this;
        }
        public String getDatabaseId() {
            return this.databaseId;
        }

        public AddDatabasesToGroupResponseBodyResults setHostGroupId(String hostGroupId) {
            this.hostGroupId = hostGroupId;
            return this;
        }
        public String getHostGroupId() {
            return this.hostGroupId;
        }

        public AddDatabasesToGroupResponseBodyResults setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
