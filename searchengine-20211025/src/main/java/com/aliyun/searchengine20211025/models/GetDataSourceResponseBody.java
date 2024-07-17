// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class GetDataSourceResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>FE03180A-0E29-5474-8A86-33F0683294A4</p>
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
        /**
         * <p>The data center where the data source is deployed in offline mode</p>
         * 
         * <strong>example:</strong>
         * <p>vpc_hz_domain_1</p>
         */
        @NameInMap("domain")
        public String domain;

        /**
         * <p>The list of index information</p>
         */
        @NameInMap("indexes")
        public java.util.List<String> indexes;

        /**
         * <p>The time when the full data of the data source was last queried.</p>
         * 
         * <strong>example:</strong>
         * <p>1718787219</p>
         */
        @NameInMap("lastFulTime")
        public Long lastFulTime;

        /**
         * <p>The name of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>my_index</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The status of the data source. Valid values: new: The data source is being created. publish: The data source is in the normal state. trash: The data source is being deleted.</p>
         * 
         * <strong>example:</strong>
         * <p>NEW</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The type of the data source</p>
         * 
         * <strong>example:</strong>
         * <p>odps</p>
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
