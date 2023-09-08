// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class GetDataSourceResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The information about the data source.</p>
     */
    @NameInMap("result")
    public GetDataSourceResponseBodyResult result;

    public static GetDataSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDataSourceResponseBody self = new GetDataSourceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDataSourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDataSourceResponseBody setResult(GetDataSourceResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetDataSourceResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetDataSourceResponseBodyResult extends TeaModel {
        @NameInMap("domain")
        public String domain;

        @NameInMap("indexes")
        public java.util.List<String> indexes;

        @NameInMap("lastFulTime")
        public Long lastFulTime;

        @NameInMap("name")
        public String name;

        @NameInMap("status")
        public String status;

        /**
         * <p>The type of the data source.</p>
         */
        @NameInMap("type")
        public String type;

        public static GetDataSourceResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetDataSourceResponseBodyResult self = new GetDataSourceResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetDataSourceResponseBodyResult setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public GetDataSourceResponseBodyResult setIndexes(java.util.List<String> indexes) {
            this.indexes = indexes;
            return this;
        }
        public java.util.List<String> getIndexes() {
            return this.indexes;
        }

        public GetDataSourceResponseBodyResult setLastFulTime(Long lastFulTime) {
            this.lastFulTime = lastFulTime;
            return this;
        }
        public Long getLastFulTime() {
            return this.lastFulTime;
        }

        public GetDataSourceResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetDataSourceResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetDataSourceResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
