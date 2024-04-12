// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class RemoveDatabasesFromGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Code")
        public String code;

        @NameInMap("DatabaseId")
        public String databaseId;

        @NameInMap("HostGroupId")
        public String hostGroupId;

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
