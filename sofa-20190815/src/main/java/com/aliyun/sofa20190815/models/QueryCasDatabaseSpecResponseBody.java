// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryCasDatabaseSpecResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public java.util.List<QueryCasDatabaseSpecResponseBodyData> data;

    public static QueryCasDatabaseSpecResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCasDatabaseSpecResponseBody self = new QueryCasDatabaseSpecResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCasDatabaseSpecResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCasDatabaseSpecResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryCasDatabaseSpecResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryCasDatabaseSpecResponseBody setData(java.util.List<QueryCasDatabaseSpecResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryCasDatabaseSpecResponseBodyData> getData() {
        return this.data;
    }

    public static class QueryCasDatabaseSpecResponseBodyData extends TeaModel {
        @NameInMap("Cpu")
        public Long cpu;

        @NameInMap("CustomStorage")
        public Boolean customStorage;

        @NameInMap("Engine")
        public String engine;

        @NameInMap("IaasId")
        public String iaasId;

        @NameInMap("Id")
        public String id;

        @NameInMap("MaxConnections")
        public Long maxConnections;

        @NameInMap("MaxIops")
        public Long maxIops;

        @NameInMap("MaxStorage")
        public Long maxStorage;

        @NameInMap("Memory")
        public Long memory;

        @NameInMap("MinStorage")
        public Long minStorage;

        @NameInMap("Name")
        public String name;

        @NameInMap("Type")
        public String type;

        @NameInMap("EngineVersion")
        public java.util.List<String> engineVersion;

        @NameInMap("SupportedStorages")
        public java.util.List<String> supportedStorages;

        public static QueryCasDatabaseSpecResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryCasDatabaseSpecResponseBodyData self = new QueryCasDatabaseSpecResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryCasDatabaseSpecResponseBodyData setCpu(Long cpu) {
            this.cpu = cpu;
            return this;
        }
        public Long getCpu() {
            return this.cpu;
        }

        public QueryCasDatabaseSpecResponseBodyData setCustomStorage(Boolean customStorage) {
            this.customStorage = customStorage;
            return this;
        }
        public Boolean getCustomStorage() {
            return this.customStorage;
        }

        public QueryCasDatabaseSpecResponseBodyData setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public QueryCasDatabaseSpecResponseBodyData setIaasId(String iaasId) {
            this.iaasId = iaasId;
            return this;
        }
        public String getIaasId() {
            return this.iaasId;
        }

        public QueryCasDatabaseSpecResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryCasDatabaseSpecResponseBodyData setMaxConnections(Long maxConnections) {
            this.maxConnections = maxConnections;
            return this;
        }
        public Long getMaxConnections() {
            return this.maxConnections;
        }

        public QueryCasDatabaseSpecResponseBodyData setMaxIops(Long maxIops) {
            this.maxIops = maxIops;
            return this;
        }
        public Long getMaxIops() {
            return this.maxIops;
        }

        public QueryCasDatabaseSpecResponseBodyData setMaxStorage(Long maxStorage) {
            this.maxStorage = maxStorage;
            return this;
        }
        public Long getMaxStorage() {
            return this.maxStorage;
        }

        public QueryCasDatabaseSpecResponseBodyData setMemory(Long memory) {
            this.memory = memory;
            return this;
        }
        public Long getMemory() {
            return this.memory;
        }

        public QueryCasDatabaseSpecResponseBodyData setMinStorage(Long minStorage) {
            this.minStorage = minStorage;
            return this;
        }
        public Long getMinStorage() {
            return this.minStorage;
        }

        public QueryCasDatabaseSpecResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryCasDatabaseSpecResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryCasDatabaseSpecResponseBodyData setEngineVersion(java.util.List<String> engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public java.util.List<String> getEngineVersion() {
            return this.engineVersion;
        }

        public QueryCasDatabaseSpecResponseBodyData setSupportedStorages(java.util.List<String> supportedStorages) {
            this.supportedStorages = supportedStorages;
            return this;
        }
        public java.util.List<String> getSupportedStorages() {
            return this.supportedStorages;
        }

    }

}
