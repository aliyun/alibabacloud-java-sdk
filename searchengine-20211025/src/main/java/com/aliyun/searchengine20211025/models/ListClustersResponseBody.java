// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ListClustersResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

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
        @NameInMap("name")
        public String name;

        @NameInMap("number")
        public Integer number;

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
        @NameInMap("name")
        public String name;

        @NameInMap("number")
        public Integer number;

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
        @NameInMap("configUpdateTime")
        public String configUpdateTime;

        @NameInMap("currentAdvanceConfigVersion")
        public String currentAdvanceConfigVersion;

        @NameInMap("currentOnlineConfigVersion")
        public String currentOnlineConfigVersion;

        @NameInMap("dataNode")
        public ListClustersResponseBodyResultDataNode dataNode;

        @NameInMap("description")
        public String description;

        @NameInMap("latestAdvanceConfigVersion")
        public String latestAdvanceConfigVersion;

        @NameInMap("latestOnlineConfigVersion")
        public String latestOnlineConfigVersion;

        @NameInMap("name")
        public String name;

        @NameInMap("queryNode")
        public ListClustersResponseBodyResultQueryNode queryNode;

        @NameInMap("status")
        public String status;

        public static ListClustersResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListClustersResponseBodyResult self = new ListClustersResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListClustersResponseBodyResult setConfigUpdateTime(String configUpdateTime) {
            this.configUpdateTime = configUpdateTime;
            return this;
        }
        public String getConfigUpdateTime() {
            return this.configUpdateTime;
        }

        public ListClustersResponseBodyResult setCurrentAdvanceConfigVersion(String currentAdvanceConfigVersion) {
            this.currentAdvanceConfigVersion = currentAdvanceConfigVersion;
            return this;
        }
        public String getCurrentAdvanceConfigVersion() {
            return this.currentAdvanceConfigVersion;
        }

        public ListClustersResponseBodyResult setCurrentOnlineConfigVersion(String currentOnlineConfigVersion) {
            this.currentOnlineConfigVersion = currentOnlineConfigVersion;
            return this;
        }
        public String getCurrentOnlineConfigVersion() {
            return this.currentOnlineConfigVersion;
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

        public ListClustersResponseBodyResult setLatestOnlineConfigVersion(String latestOnlineConfigVersion) {
            this.latestOnlineConfigVersion = latestOnlineConfigVersion;
            return this;
        }
        public String getLatestOnlineConfigVersion() {
            return this.latestOnlineConfigVersion;
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
