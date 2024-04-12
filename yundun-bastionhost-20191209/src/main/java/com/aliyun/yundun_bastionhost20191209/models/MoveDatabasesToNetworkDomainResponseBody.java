// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class MoveDatabasesToNetworkDomainResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Results")
    public java.util.List<MoveDatabasesToNetworkDomainResponseBodyResults> results;

    public static MoveDatabasesToNetworkDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MoveDatabasesToNetworkDomainResponseBody self = new MoveDatabasesToNetworkDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public MoveDatabasesToNetworkDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MoveDatabasesToNetworkDomainResponseBody setResults(java.util.List<MoveDatabasesToNetworkDomainResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<MoveDatabasesToNetworkDomainResponseBodyResults> getResults() {
        return this.results;
    }

    public static class MoveDatabasesToNetworkDomainResponseBodyResults extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("DatabaseId")
        public String databaseId;

        @NameInMap("Message")
        public String message;

        public static MoveDatabasesToNetworkDomainResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            MoveDatabasesToNetworkDomainResponseBodyResults self = new MoveDatabasesToNetworkDomainResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public MoveDatabasesToNetworkDomainResponseBodyResults setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public MoveDatabasesToNetworkDomainResponseBodyResults setDatabaseId(String databaseId) {
            this.databaseId = databaseId;
            return this;
        }
        public String getDatabaseId() {
            return this.databaseId;
        }

        public MoveDatabasesToNetworkDomainResponseBodyResults setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
