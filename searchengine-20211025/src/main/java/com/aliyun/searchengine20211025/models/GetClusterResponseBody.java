// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class GetClusterResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

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
        @NameInMap("name")
        public String name;

        @NameInMap("number")
        public Integer number;

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
        @NameInMap("name")
        public String name;

        @NameInMap("number")
        public Integer number;

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
        @NameInMap("configUpdateTime")
        public String configUpdateTime;

        @NameInMap("currentAdvanceConfigVersion")
        public String currentAdvanceConfigVersion;

        @NameInMap("currentOnlineConfigVersion")
        public String currentOnlineConfigVersion;

        @NameInMap("dataNode")
        public GetClusterResponseBodyResultDataNode dataNode;

        @NameInMap("description")
        public String description;

        @NameInMap("latestAdvanceConfigVersion")
        public String latestAdvanceConfigVersion;

        @NameInMap("latestOnlineConfigVersion")
        public String latestOnlineConfigVersion;

        @NameInMap("name")
        public String name;

        @NameInMap("queryNode")
        public GetClusterResponseBodyResultQueryNode queryNode;

        @NameInMap("status")
        public String status;

        public static GetClusterResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetClusterResponseBodyResult self = new GetClusterResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetClusterResponseBodyResult setConfigUpdateTime(String configUpdateTime) {
            this.configUpdateTime = configUpdateTime;
            return this;
        }
        public String getConfigUpdateTime() {
            return this.configUpdateTime;
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
