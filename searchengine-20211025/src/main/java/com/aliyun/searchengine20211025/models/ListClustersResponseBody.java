// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ListClustersResponseBody extends TeaModel {
    /**
     * <p>id of request</p>
     * 
     * <strong>example:</strong>
     * <p>F43E8AB4-419C-5F4C-90D6-615590DFAA3C</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The clusters.</p>
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
         * <p>The name of the Searcher worker.</p>
         * 
         * <strong>example:</strong>
         * <p>ha-cn-8ed2k7brm05_qrs</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The number of Searcher workers.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("number")
        public Integer number;

        /**
         * <p>The ID of the partition that is stored on the Searcher worker.</p>
         * 
         * <strong>example:</strong>
         * <p>dt=20220216</p>
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
         * <p>The name of the QRS worker.</p>
         * 
         * <strong>example:</strong>
         * <p>test_0704</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The number of QRS workers.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("number")
        public Integer number;

        /**
         * <p>The ID of the partition that is stored on the QRS worker.</p>
         * 
         * <strong>example:</strong>
         * <p>dt=20211216</p>
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
         * 
         * <strong>example:</strong>
         * <p>&quot; &quot;</p>
         */
        @NameInMap("configUpdateTime")
        public String configUpdateTime;

        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>The effective advanced configuration version.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot; &quot;</p>
         */
        @NameInMap("currentAdvanceConfigVersion")
        public String currentAdvanceConfigVersion;

        /**
         * <p>The effective dictionary configuration version.</p>
         */
        @NameInMap("currentOfflineDictConfigVersion")
        public String currentOfflineDictConfigVersion;

        /**
         * <p>The effective online configuration version.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot; &quot;</p>
         */
        @NameInMap("currentOnlineConfigVersion")
        public String currentOnlineConfigVersion;

        /**
         * <p>The effective query configuration version.</p>
         */
        @NameInMap("currentOnlineQueryConfigVersion")
        public String currentOnlineQueryConfigVersion;

        /**
         * <p>The information about Searcher workers.</p>
         */
        @NameInMap("dataNode")
        public ListClustersResponseBodyResultDataNode dataNode;

        /**
         * <p>The description of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>fzz_test</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The latest advanced configuration version.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot; &quot;</p>
         */
        @NameInMap("latestAdvanceConfigVersion")
        public String latestAdvanceConfigVersion;

        /**
         * <p>The latest dictionary configuration version.</p>
         */
        @NameInMap("latestOfflineDictConfigVersion")
        public String latestOfflineDictConfigVersion;

        /**
         * <p>The latest online configuration version.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot; &quot;</p>
         */
        @NameInMap("latestOnlineConfigVersion")
        public String latestOnlineConfigVersion;

        /**
         * <p>The latest query configuration version.</p>
         */
        @NameInMap("latestOnlineQueryConfigVersion")
        public String latestOnlineQueryConfigVersion;

        /**
         * <p>The cluster name.</p>
         * 
         * <strong>example:</strong>
         * <p>ha-cn-7pp2pcna701_qrs</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The information about Query Result Searcher (QRS) workers.</p>
         */
        @NameInMap("queryNode")
        public ListClustersResponseBodyResultQueryNode queryNode;

        /**
         * <p>The status of the cluster. Valid values: running: The cluster is running. starting: The cluster is being started. stopping: The cluster is being stopped. stopped: The cluster is stopped.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;starting&quot;</p>
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
