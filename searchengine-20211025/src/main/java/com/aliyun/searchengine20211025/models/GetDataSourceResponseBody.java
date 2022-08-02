// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class GetDataSourceResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

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

    public static class GetDataSourceResponseBodyResultConfig extends TeaModel {
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

        public static GetDataSourceResponseBodyResultConfig build(java.util.Map<String, ?> map) throws Exception {
            GetDataSourceResponseBodyResultConfig self = new GetDataSourceResponseBodyResultConfig();
            return TeaModel.build(map, self);
        }

        public GetDataSourceResponseBodyResultConfig setAccessKey(String accessKey) {
            this.accessKey = accessKey;
            return this;
        }
        public String getAccessKey() {
            return this.accessKey;
        }

        public GetDataSourceResponseBodyResultConfig setAccessSecret(String accessSecret) {
            this.accessSecret = accessSecret;
            return this;
        }
        public String getAccessSecret() {
            return this.accessSecret;
        }

        public GetDataSourceResponseBodyResultConfig setPartition(String partition) {
            this.partition = partition;
            return this;
        }
        public String getPartition() {
            return this.partition;
        }

        public GetDataSourceResponseBodyResultConfig setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public GetDataSourceResponseBodyResultConfig setTable(String table) {
            this.table = table;
            return this;
        }
        public String getTable() {
            return this.table;
        }

    }

    public static class GetDataSourceResponseBodyResult extends TeaModel {
        @NameInMap("autoBuildIndex")
        public Boolean autoBuildIndex;

        @NameInMap("config")
        public GetDataSourceResponseBodyResultConfig config;

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

        public static GetDataSourceResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetDataSourceResponseBodyResult self = new GetDataSourceResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetDataSourceResponseBodyResult setAutoBuildIndex(Boolean autoBuildIndex) {
            this.autoBuildIndex = autoBuildIndex;
            return this;
        }
        public Boolean getAutoBuildIndex() {
            return this.autoBuildIndex;
        }

        public GetDataSourceResponseBodyResult setConfig(GetDataSourceResponseBodyResultConfig config) {
            this.config = config;
            return this;
        }
        public GetDataSourceResponseBodyResultConfig getConfig() {
            return this.config;
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

        public GetDataSourceResponseBodyResult setLastFullTime(Long lastFullTime) {
            this.lastFullTime = lastFullTime;
            return this;
        }
        public Long getLastFullTime() {
            return this.lastFullTime;
        }

        public GetDataSourceResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetDataSourceResponseBodyResult setPartitions(java.util.List<String> partitions) {
            this.partitions = partitions;
            return this;
        }
        public java.util.List<String> getPartitions() {
            return this.partitions;
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
