// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class App extends TeaModel {
    @NameInMap("autoSwitch")
    public Boolean autoSwitch;

    @NameInMap("cluster")
    public AppCluster cluster;

    @NameInMap("dataSources")
    public java.util.List<DataSource> dataSources;

    @NameInMap("description")
    public String description;

    @NameInMap("domain")
    public Domain domain;

    @NameInMap("fetchFields")
    public java.util.List<String> fetchFields;

    @NameInMap("firstRanks")
    public java.util.List<FirstRank> firstRanks;

    @NameInMap("networkType")
    public String networkType;

    @NameInMap("queryProcessors")
    public java.util.List<QueryProcessor> queryProcessors;

    @NameInMap("quota")
    public Quota quota;

    @NameInMap("realtimeShared")
    public Boolean realtimeShared;

    @NameInMap("schema")
    public Schema schema;

    @NameInMap("schemas")
    public java.util.List<Schema> schemas;

    @NameInMap("secondRanks")
    public java.util.List<SecondRank> secondRanks;

    @NameInMap("summaries")
    public java.util.List<Summary> summaries;

    @NameInMap("type")
    public String type;

    public static App build(java.util.Map<String, ?> map) throws Exception {
        App self = new App();
        return TeaModel.build(map, self);
    }

    public App setAutoSwitch(Boolean autoSwitch) {
        this.autoSwitch = autoSwitch;
        return this;
    }
    public Boolean getAutoSwitch() {
        return this.autoSwitch;
    }

    public App setCluster(AppCluster cluster) {
        this.cluster = cluster;
        return this;
    }
    public AppCluster getCluster() {
        return this.cluster;
    }

    public App setDataSources(java.util.List<DataSource> dataSources) {
        this.dataSources = dataSources;
        return this;
    }
    public java.util.List<DataSource> getDataSources() {
        return this.dataSources;
    }

    public App setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public App setDomain(Domain domain) {
        this.domain = domain;
        return this;
    }
    public Domain getDomain() {
        return this.domain;
    }

    public App setFetchFields(java.util.List<String> fetchFields) {
        this.fetchFields = fetchFields;
        return this;
    }
    public java.util.List<String> getFetchFields() {
        return this.fetchFields;
    }

    public App setFirstRanks(java.util.List<FirstRank> firstRanks) {
        this.firstRanks = firstRanks;
        return this;
    }
    public java.util.List<FirstRank> getFirstRanks() {
        return this.firstRanks;
    }

    public App setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public App setQueryProcessors(java.util.List<QueryProcessor> queryProcessors) {
        this.queryProcessors = queryProcessors;
        return this;
    }
    public java.util.List<QueryProcessor> getQueryProcessors() {
        return this.queryProcessors;
    }

    public App setQuota(Quota quota) {
        this.quota = quota;
        return this;
    }
    public Quota getQuota() {
        return this.quota;
    }

    public App setRealtimeShared(Boolean realtimeShared) {
        this.realtimeShared = realtimeShared;
        return this;
    }
    public Boolean getRealtimeShared() {
        return this.realtimeShared;
    }

    public App setSchema(Schema schema) {
        this.schema = schema;
        return this;
    }
    public Schema getSchema() {
        return this.schema;
    }

    public App setSchemas(java.util.List<Schema> schemas) {
        this.schemas = schemas;
        return this;
    }
    public java.util.List<Schema> getSchemas() {
        return this.schemas;
    }

    public App setSecondRanks(java.util.List<SecondRank> secondRanks) {
        this.secondRanks = secondRanks;
        return this;
    }
    public java.util.List<SecondRank> getSecondRanks() {
        return this.secondRanks;
    }

    public App setSummaries(java.util.List<Summary> summaries) {
        this.summaries = summaries;
        return this;
    }
    public java.util.List<Summary> getSummaries() {
        return this.summaries;
    }

    public App setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class AppCluster extends TeaModel {
        @NameInMap("maxQueryClauseLength")
        public Integer maxQueryClauseLength;

        @NameInMap("maxTimeoutMS")
        public Integer maxTimeoutMS;

        public static AppCluster build(java.util.Map<String, ?> map) throws Exception {
            AppCluster self = new AppCluster();
            return TeaModel.build(map, self);
        }

        public AppCluster setMaxQueryClauseLength(Integer maxQueryClauseLength) {
            this.maxQueryClauseLength = maxQueryClauseLength;
            return this;
        }
        public Integer getMaxQueryClauseLength() {
            return this.maxQueryClauseLength;
        }

        public AppCluster setMaxTimeoutMS(Integer maxTimeoutMS) {
            this.maxTimeoutMS = maxTimeoutMS;
            return this;
        }
        public Integer getMaxTimeoutMS() {
            return this.maxTimeoutMS;
        }

    }

}
