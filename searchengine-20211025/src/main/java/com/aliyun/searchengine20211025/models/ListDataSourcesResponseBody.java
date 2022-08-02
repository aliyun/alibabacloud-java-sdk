// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ListDataSourcesResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

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

    public static class ListDataSourcesResponseBodyResultConfig extends TeaModel {
        @NameInMap("accessKey")
        public String accessKey;

        @NameInMap("accessSecret")
        public String accessSecret;

        @NameInMap("partition")
        public String partition;

        @NameInMap("project")
        public String project;

        @NameInMap("table")
        public String table;

        public static ListDataSourcesResponseBodyResultConfig build(java.util.Map<String, ?> map) throws Exception {
            ListDataSourcesResponseBodyResultConfig self = new ListDataSourcesResponseBodyResultConfig();
            return TeaModel.build(map, self);
        }

        public ListDataSourcesResponseBodyResultConfig setAccessKey(String accessKey) {
            this.accessKey = accessKey;
            return this;
        }
        public String getAccessKey() {
            return this.accessKey;
        }

        public ListDataSourcesResponseBodyResultConfig setAccessSecret(String accessSecret) {
            this.accessSecret = accessSecret;
            return this;
        }
        public String getAccessSecret() {
            return this.accessSecret;
        }

        public ListDataSourcesResponseBodyResultConfig setPartition(String partition) {
            this.partition = partition;
            return this;
        }
        public String getPartition() {
            return this.partition;
        }

        public ListDataSourcesResponseBodyResultConfig setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public ListDataSourcesResponseBodyResultConfig setTable(String table) {
            this.table = table;
            return this;
        }
        public String getTable() {
            return this.table;
        }

    }

    public static class ListDataSourcesResponseBodyResult extends TeaModel {
        @NameInMap("autoBuildIndex")
        public Boolean autoBuildIndex;

        @NameInMap("config")
        public ListDataSourcesResponseBodyResultConfig config;

        @NameInMap("domain")
        public String domain;

        @NameInMap("indexes")
        public java.util.List<String> indexes;

        @NameInMap("lastFullTime")
        public Long lastFullTime;

        @NameInMap("name")
        public String name;

        @NameInMap("partitions")
        public java.util.List<String> partitions;

        @NameInMap("status")
        public String status;

        @NameInMap("type")
        public String type;

        public static ListDataSourcesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListDataSourcesResponseBodyResult self = new ListDataSourcesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListDataSourcesResponseBodyResult setAutoBuildIndex(Boolean autoBuildIndex) {
            this.autoBuildIndex = autoBuildIndex;
            return this;
        }
        public Boolean getAutoBuildIndex() {
            return this.autoBuildIndex;
        }

        public ListDataSourcesResponseBodyResult setConfig(ListDataSourcesResponseBodyResultConfig config) {
            this.config = config;
            return this;
        }
        public ListDataSourcesResponseBodyResultConfig getConfig() {
            return this.config;
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

        public ListDataSourcesResponseBodyResult setLastFullTime(Long lastFullTime) {
            this.lastFullTime = lastFullTime;
            return this;
        }
        public Long getLastFullTime() {
            return this.lastFullTime;
        }

        public ListDataSourcesResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDataSourcesResponseBodyResult setPartitions(java.util.List<String> partitions) {
            this.partitions = partitions;
            return this;
        }
        public java.util.List<String> getPartitions() {
            return this.partitions;
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
