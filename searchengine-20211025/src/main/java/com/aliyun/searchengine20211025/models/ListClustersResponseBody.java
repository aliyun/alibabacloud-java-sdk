// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ListClustersResponseBody extends TeaModel {
    /**
     * <p>id of request</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The list of clusters.</p>
     */
    @NameInMap("result")
    public java.util.List<ListClustersResponseBodyResult> result;

    public static ListClustersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClustersResponseBody self = new ListClustersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClustersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListClustersResponseBody setResult(java.util.List<ListClustersResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListClustersResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListClustersResponseBodyResultDataNode extends TeaModel {
        /**
         * <p>The name of the node.</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The number of nodes.</p>
         */
        @NameInMap("number")
        public Integer number;

        /**
         * <p>The partition ID of the node.</p>
         */
        @NameInMap("partition")
        public Integer partition;

        public static ListClustersResponseBodyResultDataNode build(java.util.Map<String, ?> map) throws Exception {
            ListClustersResponseBodyResultDataNode self = new ListClustersResponseBodyResultDataNode();
            return TeaModel.build(map, self);
        }

        public ListClustersResponseBodyResultDataNode setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListClustersResponseBodyResultDataNode setNumber(Integer number) {
            this.number = number;
            return this;
        }
        public Integer getNumber() {
            return this.number;
        }

        public ListClustersResponseBodyResultDataNode setPartition(Integer partition) {
            this.partition = partition;
            return this;
        }
        public Integer getPartition() {
            return this.partition;
        }

    }

    public static class ListClustersResponseBodyResultQueryNode extends TeaModel {
        /**
         * <p>The name of the node.</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The number of nodes.</p>
         */
        @NameInMap("number")
        public Integer number;

        /**
         * <p>The number o replicas.</p>
         */
        @NameInMap("partition")
        public Integer partition;

        public static ListClustersResponseBodyResultQueryNode build(java.util.Map<String, ?> map) throws Exception {
            ListClustersResponseBodyResultQueryNode self = new ListClustersResponseBodyResultQueryNode();
            return TeaModel.build(map, self);
        }

        public ListClustersResponseBodyResultQueryNode setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListClustersResponseBodyResultQueryNode setNumber(Integer number) {
            this.number = number;
            return this;
        }
        public Integer getNumber() {
            return this.number;
        }

        public ListClustersResponseBodyResultQueryNode setPartition(Integer partition) {
            this.partition = partition;
            return this;
        }
        public Integer getPartition() {
            return this.partition;
        }

    }

    public static class ListClustersResponseBodyResult extends TeaModel {
        @NameInMap("config")
        public java.util.Map<String, java.util.Map<String, ?>> config;

        /**
         * <p>The time when the configuration was updated.</p>
         */
        @NameInMap("configUpdateTime")
        public String configUpdateTime;

        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>The effective advanced version.</p>
         */
        @NameInMap("currentAdvanceConfigVersion")
        public String currentAdvanceConfigVersion;

        /**
         * <p>词典配置生效版本</p>
         */
        @NameInMap("currentOfflineDictConfigVersion")
        public String currentOfflineDictConfigVersion;

        /**
         * <p>The effective online configuration version.</p>
         */
        @NameInMap("currentOnlineConfigVersion")
        public String currentOnlineConfigVersion;

        /**
         * <p>查询配置生效版本</p>
         */
        @NameInMap("currentOnlineQueryConfigVersion")
        public String currentOnlineQueryConfigVersion;

        /**
         * <p>The information about the node in the cluster.</p>
         */
        @NameInMap("dataNode")
        public ListClustersResponseBodyResultDataNode dataNode;

        /**
         * <p>The description of the cluster.</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The latest advanced configuration version.</p>
         */
        @NameInMap("latestAdvanceConfigVersion")
        public String latestAdvanceConfigVersion;

        /**
         * <p>词典配置最新版本</p>
         */
        @NameInMap("latestOfflineDictConfigVersion")
        public String latestOfflineDictConfigVersion;

        /**
         * <p>The latest online configuration version.</p>
         */
        @NameInMap("latestOnlineConfigVersion")
        public String latestOnlineConfigVersion;

        /**
         * <p>查询配置最新版本</p>
         */
        @NameInMap("latestOnlineQueryConfigVersion")
        public String latestOnlineQueryConfigVersion;

        /**
         * <p>The name of the cluster.</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The query node of the cluster.</p>
         */
        @NameInMap("queryNode")
        public ListClustersResponseBodyResultQueryNode queryNode;

        /**
         * <p>The status of the cluster. Valid values: running, starting, stopping, and stopped. running indicates the cluster is running, starting indicates the cluster is starting, stopping indicates the cluster is stopping, and stopped indicates the cluster has stopped.</p>
         */
        @NameInMap("status")
        public String status;

        public static ListClustersResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListClustersResponseBodyResult self = new ListClustersResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListClustersResponseBodyResult setConfig(java.util.Map<String, java.util.Map<String, ?>> config) {
            this.config = config;
            return this;
        }
        public java.util.Map<String, java.util.Map<String, ?>> getConfig() {
            return this.config;
        }

        public ListClustersResponseBodyResult setConfigUpdateTime(String configUpdateTime) {
            this.configUpdateTime = configUpdateTime;
            return this;
        }
        public String getConfigUpdateTime() {
            return this.configUpdateTime;
        }

        public ListClustersResponseBodyResult setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListClustersResponseBodyResult setCurrentAdvanceConfigVersion(String currentAdvanceConfigVersion) {
            this.currentAdvanceConfigVersion = currentAdvanceConfigVersion;
            return this;
        }
        public String getCurrentAdvanceConfigVersion() {
            return this.currentAdvanceConfigVersion;
        }

        public ListClustersResponseBodyResult setCurrentOfflineDictConfigVersion(String currentOfflineDictConfigVersion) {
            this.currentOfflineDictConfigVersion = currentOfflineDictConfigVersion;
            return this;
        }
        public String getCurrentOfflineDictConfigVersion() {
            return this.currentOfflineDictConfigVersion;
        }

        public ListClustersResponseBodyResult setCurrentOnlineConfigVersion(String currentOnlineConfigVersion) {
            this.currentOnlineConfigVersion = currentOnlineConfigVersion;
            return this;
        }
        public String getCurrentOnlineConfigVersion() {
            return this.currentOnlineConfigVersion;
        }

        public ListClustersResponseBodyResult setCurrentOnlineQueryConfigVersion(String currentOnlineQueryConfigVersion) {
            this.currentOnlineQueryConfigVersion = currentOnlineQueryConfigVersion;
            return this;
        }
        public String getCurrentOnlineQueryConfigVersion() {
            return this.currentOnlineQueryConfigVersion;
        }

        public ListClustersResponseBodyResult setDataNode(ListClustersResponseBodyResultDataNode dataNode) {
            this.dataNode = dataNode;
            return this;
        }
        public ListClustersResponseBodyResultDataNode getDataNode() {
            return this.dataNode;
        }

        public ListClustersResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListClustersResponseBodyResult setLatestAdvanceConfigVersion(String latestAdvanceConfigVersion) {
            this.latestAdvanceConfigVersion = latestAdvanceConfigVersion;
            return this;
        }
        public String getLatestAdvanceConfigVersion() {
            return this.latestAdvanceConfigVersion;
        }

        public ListClustersResponseBodyResult setLatestOfflineDictConfigVersion(String latestOfflineDictConfigVersion) {
            this.latestOfflineDictConfigVersion = latestOfflineDictConfigVersion;
            return this;
        }
        public String getLatestOfflineDictConfigVersion() {
            return this.latestOfflineDictConfigVersion;
        }

        public ListClustersResponseBodyResult setLatestOnlineConfigVersion(String latestOnlineConfigVersion) {
            this.latestOnlineConfigVersion = latestOnlineConfigVersion;
            return this;
        }
        public String getLatestOnlineConfigVersion() {
            return this.latestOnlineConfigVersion;
        }

        public ListClustersResponseBodyResult setLatestOnlineQueryConfigVersion(String latestOnlineQueryConfigVersion) {
            this.latestOnlineQueryConfigVersion = latestOnlineQueryConfigVersion;
            return this;
        }
        public String getLatestOnlineQueryConfigVersion() {
            return this.latestOnlineQueryConfigVersion;
        }

        public ListClustersResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListClustersResponseBodyResult setQueryNode(ListClustersResponseBodyResultQueryNode queryNode) {
            this.queryNode = queryNode;
            return this;
        }
        public ListClustersResponseBodyResultQueryNode getQueryNode() {
            return this.queryNode;
        }

        public ListClustersResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
