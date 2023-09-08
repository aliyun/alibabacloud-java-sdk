// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ListDataSourcesResponseBody extends TeaModel {
    /**
     * <p>## Method</p>
     * <br>
     * <p>`GET`</p>
     * <br>
     * <p>## URI</p>
     * <br>
     * <p>`/openapi/ha3/instances/{instanceId}/data-sources`</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The returned results.</p>
     */
    @NameInMap("result")
    public java.util.List<ListDataSourcesResponseBodyResult> result;

    public static ListDataSourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataSourcesResponseBody self = new ListDataSourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataSourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDataSourcesResponseBody setResult(java.util.List<ListDataSourcesResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListDataSourcesResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListDataSourcesResponseBodyResult extends TeaModel {
        /**
         * <p>The data sources deployed in offline mode.</p>
         */
        @NameInMap("domain")
        public String domain;

        /**
         * <p>The indexes.</p>
         */
        @NameInMap("indexes")
        public java.util.List<String> indexes;

        /**
         * <p>The time when the full data of the data source was last queried.</p>
         */
        @NameInMap("lastFulTime")
        public Long lastFulTime;

        /**
         * <p>The name of the data source.</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The status of the data source.</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The type of the data source.</p>
         */
        @NameInMap("type")
        public String type;

        public static ListDataSourcesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListDataSourcesResponseBodyResult self = new ListDataSourcesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListDataSourcesResponseBodyResult setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public ListDataSourcesResponseBodyResult setIndexes(java.util.List<String> indexes) {
            this.indexes = indexes;
            return this;
        }
        public java.util.List<String> getIndexes() {
            return this.indexes;
        }

        public ListDataSourcesResponseBodyResult setLastFulTime(Long lastFulTime) {
            this.lastFulTime = lastFulTime;
            return this;
        }
        public Long getLastFulTime() {
            return this.lastFulTime;
        }

        public ListDataSourcesResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDataSourcesResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListDataSourcesResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
