// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class GetClusterResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>E7B7D598-B080-5C8E-AA35-D43EC0D5F886</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The list of the cluster details.</p>
     */
    @NameInMap("result")
    public GetClusterResponseBodyResult result;

    public static GetClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetClusterResponseBody self = new GetClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public GetClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetClusterResponseBody setResult(GetClusterResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetClusterResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetClusterResponseBodyResultDataNode extends TeaModel {
        /**
         * <p>The name of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The number of replicas.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("number")
        public Integer number;

        /**
         * <p>The number of partitions.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("partition")
        public Integer partition;

        public static GetClusterResponseBodyResultDataNode build(java.util.Map<String, ?> map) throws Exception {
            GetClusterResponseBodyResultDataNode self = new GetClusterResponseBodyResultDataNode();
            return TeaModel.build(map, self);
        }

        public GetClusterResponseBodyResultDataNode setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetClusterResponseBodyResultDataNode setNumber(Integer number) {
            this.number = number;
            return this;
        }
        public Integer getNumber() {
            return this.number;
        }

        public GetClusterResponseBodyResultDataNode setPartition(Integer partition) {
            this.partition = partition;
            return this;
        }
        public Integer getPartition() {
            return this.partition;
        }

    }

    public static class GetClusterResponseBodyResultQueryNode extends TeaModel {
        /**
         * <p>The name of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The number of nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("number")
        public Integer number;

        /**
         * <p>The number of replicas.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("partition")
        public Integer partition;

        public static GetClusterResponseBodyResultQueryNode build(java.util.Map<String, ?> map) throws Exception {
            GetClusterResponseBodyResultQueryNode self = new GetClusterResponseBodyResultQueryNode();
            return TeaModel.build(map, self);
        }

        public GetClusterResponseBodyResultQueryNode setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetClusterResponseBodyResultQueryNode setNumber(Integer number) {
            this.number = number;
            return this;
        }
        public Integer getNumber() {
            return this.number;
        }

        public GetClusterResponseBodyResultQueryNode setPartition(Integer partition) {
            this.partition = partition;
            return this;
        }
        public Integer getPartition() {
            return this.partition;
        }

    }

    public static class GetClusterResponseBodyResult extends TeaModel {
        @NameInMap("config")
        public java.util.Map<String, java.util.Map<String, ?>> config;

        /**
         * <p>The time when the cluster was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-08-09 00:01:02</p>
         */
        @NameInMap("configUpdateTime")
        public String configUpdateTime;

        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>The effective advanced configuration version.</p>
         * 
         * <strong>example:</strong>
         * <p>test_yyds_data1</p>
         */
        @NameInMap("currentAdvanceConfigVersion")
        public String currentAdvanceConfigVersion;

        /**
         * <p>The effective online configuration version.</p>
         * 
         * <strong>example:</strong>
         * <p>test_yyds_data1</p>
         */
        @NameInMap("currentOnlineConfigVersion")
        public String currentOnlineConfigVersion;

        /**
         * <p>The specifications of the data node.</p>
         */
        @NameInMap("dataNode")
        public GetClusterResponseBodyResultDataNode dataNode;

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
         * <p>test_yyds_data1</p>
         */
        @NameInMap("latestAdvanceConfigVersion")
        public String latestAdvanceConfigVersion;

        /**
         * <p>The latest online configuration version.</p>
         * 
         * <strong>example:</strong>
         * <p>test_yyds_data1</p>
         */
        @NameInMap("latestOnlineConfigVersion")
        public String latestOnlineConfigVersion;

        /**
         * <p>The name of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>general</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The specifications of the query node.</p>
         */
        @NameInMap("queryNode")
        public GetClusterResponseBodyResultQueryNode queryNode;

        /**
         * <p>The creation status of the cluster. Valid values: NEW and PUBLISH. NEW indicates that the cluster is being created. PUBLISH indicates that the cluster is created.</p>
         * 
         * <strong>example:</strong>
         * <p>NEW</p>
         */
        @NameInMap("status")
        public String status;

        public static GetClusterResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetClusterResponseBodyResult self = new GetClusterResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetClusterResponseBodyResult setConfig(java.util.Map<String, java.util.Map<String, ?>> config) {
            this.config = config;
            return this;
        }
        public java.util.Map<String, java.util.Map<String, ?>> getConfig() {
            return this.config;
        }

        public GetClusterResponseBodyResult setConfigUpdateTime(String configUpdateTime) {
            this.configUpdateTime = configUpdateTime;
            return this;
        }
        public String getConfigUpdateTime() {
            return this.configUpdateTime;
        }

        public GetClusterResponseBodyResult setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetClusterResponseBodyResult setCurrentAdvanceConfigVersion(String currentAdvanceConfigVersion) {
            this.currentAdvanceConfigVersion = currentAdvanceConfigVersion;
            return this;
        }
        public String getCurrentAdvanceConfigVersion() {
            return this.currentAdvanceConfigVersion;
        }

        public GetClusterResponseBodyResult setCurrentOnlineConfigVersion(String currentOnlineConfigVersion) {
            this.currentOnlineConfigVersion = currentOnlineConfigVersion;
            return this;
        }
        public String getCurrentOnlineConfigVersion() {
            return this.currentOnlineConfigVersion;
        }

        public GetClusterResponseBodyResult setDataNode(GetClusterResponseBodyResultDataNode dataNode) {
            this.dataNode = dataNode;
            return this;
        }
        public GetClusterResponseBodyResultDataNode getDataNode() {
            return this.dataNode;
        }

        public GetClusterResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetClusterResponseBodyResult setLatestAdvanceConfigVersion(String latestAdvanceConfigVersion) {
            this.latestAdvanceConfigVersion = latestAdvanceConfigVersion;
            return this;
        }
        public String getLatestAdvanceConfigVersion() {
            return this.latestAdvanceConfigVersion;
        }

        public GetClusterResponseBodyResult setLatestOnlineConfigVersion(String latestOnlineConfigVersion) {
            this.latestOnlineConfigVersion = latestOnlineConfigVersion;
            return this;
        }
        public String getLatestOnlineConfigVersion() {
            return this.latestOnlineConfigVersion;
        }

        public GetClusterResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetClusterResponseBodyResult setQueryNode(GetClusterResponseBodyResultQueryNode queryNode) {
            this.queryNode = queryNode;
            return this;
        }
        public GetClusterResponseBodyResultQueryNode getQueryNode() {
            return this.queryNode;
        }

        public GetClusterResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
