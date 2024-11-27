// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class MoveDatabasesToNetworkDomainResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E5B1BC32-72B2-5BFD-BF75-5D38261264D1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The results of the call.</p>
     */
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
        /**
         * <p>Indicates whether the database is added to the network domain.</p>
         * <blockquote>
         * <p>The code LICENSE_OUT_OF_LIMIT indicates that the network domain feature is not supported by the current Bastionhost edition.</p>
         * </blockquote>
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
         * <p>45</p>
         */
        @NameInMap("DatabaseId")
        public String databaseId;

        /**
         * <p>The error message that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>N/A</p>
         */
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
