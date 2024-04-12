// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class AddDatabasesToGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Code")
        public String code;

        @NameInMap("DatabaseId")
        public String databaseId;

        @NameInMap("HostGroupId")
        public String hostGroupId;

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
