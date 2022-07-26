// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class GetClusterRunTimeInfoResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<GetClusterRunTimeInfoResponseBodyResult> result;

    public static GetClusterRunTimeInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetClusterRunTimeInfoResponseBody self = new GetClusterRunTimeInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetClusterRunTimeInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetClusterRunTimeInfoResponseBody setResult(java.util.List<GetClusterRunTimeInfoResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<GetClusterRunTimeInfoResponseBodyResult> getResult() {
        return this.result;
    }

    public static class GetClusterRunTimeInfoResponseBodyResultDataNodesConfigStatus extends TeaModel {
        @NameInMap("configUpdateTime")
        public String configUpdateTime;

        @NameInMap("donePercent")
        public Long donePercent;

        @NameInMap("doneSize")
        public Long doneSize;

        @NameInMap("name")
        public String name;

        @NameInMap("totalSize")
        public Long totalSize;

        public static GetClusterRunTimeInfoResponseBodyResultDataNodesConfigStatus build(java.util.Map<String, ?> map) throws Exception {
            GetClusterRunTimeInfoResponseBodyResultDataNodesConfigStatus self = new GetClusterRunTimeInfoResponseBodyResultDataNodesConfigStatus();
            return TeaModel.build(map, self);
        }

        public GetClusterRunTimeInfoResponseBodyResultDataNodesConfigStatus setConfigUpdateTime(String configUpdateTime) {
            this.configUpdateTime = configUpdateTime;
            return this;
        }
        public String getConfigUpdateTime() {
            return this.configUpdateTime;
        }

        public GetClusterRunTimeInfoResponseBodyResultDataNodesConfigStatus setDonePercent(Long donePercent) {
            this.donePercent = donePercent;
            return this;
        }
        public Long getDonePercent() {
            return this.donePercent;
        }

        public GetClusterRunTimeInfoResponseBodyResultDataNodesConfigStatus setDoneSize(Long doneSize) {
            this.doneSize = doneSize;
            return this;
        }
        public Long getDoneSize() {
            return this.doneSize;
        }

        public GetClusterRunTimeInfoResponseBodyResultDataNodesConfigStatus setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetClusterRunTimeInfoResponseBodyResultDataNodesConfigStatus setTotalSize(Long totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Long getTotalSize() {
            return this.totalSize;
        }

    }

    public static class GetClusterRunTimeInfoResponseBodyResultDataNodesDataStatus extends TeaModel {
        @NameInMap("donePercent")
        public Long donePercent;

        @NameInMap("doneSize")
        public Long doneSize;

        @NameInMap("errorMsg")
        public String errorMsg;

        @NameInMap("fullSwitchTime")
        public String fullSwitchTime;

        @NameInMap("incSwitchTime")
        public String incSwitchTime;

        @NameInMap("name")
        public String name;

        @NameInMap("partition")
        public Long partition;

        @NameInMap("totalSize")
        public Long totalSize;

        @NameInMap("version")
        public Long version;

        public static GetClusterRunTimeInfoResponseBodyResultDataNodesDataStatus build(java.util.Map<String, ?> map) throws Exception {
            GetClusterRunTimeInfoResponseBodyResultDataNodesDataStatus self = new GetClusterRunTimeInfoResponseBodyResultDataNodesDataStatus();
            return TeaModel.build(map, self);
        }

        public GetClusterRunTimeInfoResponseBodyResultDataNodesDataStatus setDonePercent(Long donePercent) {
            this.donePercent = donePercent;
            return this;
        }
        public Long getDonePercent() {
            return this.donePercent;
        }

        public GetClusterRunTimeInfoResponseBodyResultDataNodesDataStatus setDoneSize(Long doneSize) {
            this.doneSize = doneSize;
            return this;
        }
        public Long getDoneSize() {
            return this.doneSize;
        }

        public GetClusterRunTimeInfoResponseBodyResultDataNodesDataStatus setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public GetClusterRunTimeInfoResponseBodyResultDataNodesDataStatus setFullSwitchTime(String fullSwitchTime) {
            this.fullSwitchTime = fullSwitchTime;
            return this;
        }
        public String getFullSwitchTime() {
            return this.fullSwitchTime;
        }

        public GetClusterRunTimeInfoResponseBodyResultDataNodesDataStatus setIncSwitchTime(String incSwitchTime) {
            this.incSwitchTime = incSwitchTime;
            return this;
        }
        public String getIncSwitchTime() {
            return this.incSwitchTime;
        }

        public GetClusterRunTimeInfoResponseBodyResultDataNodesDataStatus setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetClusterRunTimeInfoResponseBodyResultDataNodesDataStatus setPartition(Long partition) {
            this.partition = partition;
            return this;
        }
        public Long getPartition() {
            return this.partition;
        }

        public GetClusterRunTimeInfoResponseBodyResultDataNodesDataStatus setTotalSize(Long totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Long getTotalSize() {
            return this.totalSize;
        }

        public GetClusterRunTimeInfoResponseBodyResultDataNodesDataStatus setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

    }

    public static class GetClusterRunTimeInfoResponseBodyResultDataNodesServiceStatus extends TeaModel {
        @NameInMap("donePercent")
        public Long donePercent;

        @NameInMap("doneSize")
        public Long doneSize;

        @NameInMap("totalSize")
        public Long totalSize;

        public static GetClusterRunTimeInfoResponseBodyResultDataNodesServiceStatus build(java.util.Map<String, ?> map) throws Exception {
            GetClusterRunTimeInfoResponseBodyResultDataNodesServiceStatus self = new GetClusterRunTimeInfoResponseBodyResultDataNodesServiceStatus();
            return TeaModel.build(map, self);
        }

        public GetClusterRunTimeInfoResponseBodyResultDataNodesServiceStatus setDonePercent(Long donePercent) {
            this.donePercent = donePercent;
            return this;
        }
        public Long getDonePercent() {
            return this.donePercent;
        }

        public GetClusterRunTimeInfoResponseBodyResultDataNodesServiceStatus setDoneSize(Long doneSize) {
            this.doneSize = doneSize;
            return this;
        }
        public Long getDoneSize() {
            return this.doneSize;
        }

        public GetClusterRunTimeInfoResponseBodyResultDataNodesServiceStatus setTotalSize(Long totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Long getTotalSize() {
            return this.totalSize;
        }

    }

    public static class GetClusterRunTimeInfoResponseBodyResultDataNodes extends TeaModel {
        @NameInMap("configStatus")
        public GetClusterRunTimeInfoResponseBodyResultDataNodesConfigStatus configStatus;

        @NameInMap("dataStatus")
        public GetClusterRunTimeInfoResponseBodyResultDataNodesDataStatus dataStatus;

        @NameInMap("serviceStatus")
        public GetClusterRunTimeInfoResponseBodyResultDataNodesServiceStatus serviceStatus;

        public static GetClusterRunTimeInfoResponseBodyResultDataNodes build(java.util.Map<String, ?> map) throws Exception {
            GetClusterRunTimeInfoResponseBodyResultDataNodes self = new GetClusterRunTimeInfoResponseBodyResultDataNodes();
            return TeaModel.build(map, self);
        }

        public GetClusterRunTimeInfoResponseBodyResultDataNodes setConfigStatus(GetClusterRunTimeInfoResponseBodyResultDataNodesConfigStatus configStatus) {
            this.configStatus = configStatus;
            return this;
        }
        public GetClusterRunTimeInfoResponseBodyResultDataNodesConfigStatus getConfigStatus() {
            return this.configStatus;
        }

        public GetClusterRunTimeInfoResponseBodyResultDataNodes setDataStatus(GetClusterRunTimeInfoResponseBodyResultDataNodesDataStatus dataStatus) {
            this.dataStatus = dataStatus;
            return this;
        }
        public GetClusterRunTimeInfoResponseBodyResultDataNodesDataStatus getDataStatus() {
            return this.dataStatus;
        }

        public GetClusterRunTimeInfoResponseBodyResultDataNodes setServiceStatus(GetClusterRunTimeInfoResponseBodyResultDataNodesServiceStatus serviceStatus) {
            this.serviceStatus = serviceStatus;
            return this;
        }
        public GetClusterRunTimeInfoResponseBodyResultDataNodesServiceStatus getServiceStatus() {
            return this.serviceStatus;
        }

    }

    public static class GetClusterRunTimeInfoResponseBodyResultQueryNodeConfigStatus extends TeaModel {
        @NameInMap("configUpdateTime")
        public String configUpdateTime;

        @NameInMap("donePercent")
        public Long donePercent;

        @NameInMap("doneSize")
        public Long doneSize;

        @NameInMap("name")
        public String name;

        @NameInMap("totalSize")
        public Long totalSize;

        public static GetClusterRunTimeInfoResponseBodyResultQueryNodeConfigStatus build(java.util.Map<String, ?> map) throws Exception {
            GetClusterRunTimeInfoResponseBodyResultQueryNodeConfigStatus self = new GetClusterRunTimeInfoResponseBodyResultQueryNodeConfigStatus();
            return TeaModel.build(map, self);
        }

        public GetClusterRunTimeInfoResponseBodyResultQueryNodeConfigStatus setConfigUpdateTime(String configUpdateTime) {
            this.configUpdateTime = configUpdateTime;
            return this;
        }
        public String getConfigUpdateTime() {
            return this.configUpdateTime;
        }

        public GetClusterRunTimeInfoResponseBodyResultQueryNodeConfigStatus setDonePercent(Long donePercent) {
            this.donePercent = donePercent;
            return this;
        }
        public Long getDonePercent() {
            return this.donePercent;
        }

        public GetClusterRunTimeInfoResponseBodyResultQueryNodeConfigStatus setDoneSize(Long doneSize) {
            this.doneSize = doneSize;
            return this;
        }
        public Long getDoneSize() {
            return this.doneSize;
        }

        public GetClusterRunTimeInfoResponseBodyResultQueryNodeConfigStatus setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetClusterRunTimeInfoResponseBodyResultQueryNodeConfigStatus setTotalSize(Long totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Long getTotalSize() {
            return this.totalSize;
        }

    }

    public static class GetClusterRunTimeInfoResponseBodyResultQueryNodeServiceStatus extends TeaModel {
        @NameInMap("donePercent")
        public Long donePercent;

        @NameInMap("doneSize")
        public Long doneSize;

        @NameInMap("totalSize")
        public Long totalSize;

        public static GetClusterRunTimeInfoResponseBodyResultQueryNodeServiceStatus build(java.util.Map<String, ?> map) throws Exception {
            GetClusterRunTimeInfoResponseBodyResultQueryNodeServiceStatus self = new GetClusterRunTimeInfoResponseBodyResultQueryNodeServiceStatus();
            return TeaModel.build(map, self);
        }

        public GetClusterRunTimeInfoResponseBodyResultQueryNodeServiceStatus setDonePercent(Long donePercent) {
            this.donePercent = donePercent;
            return this;
        }
        public Long getDonePercent() {
            return this.donePercent;
        }

        public GetClusterRunTimeInfoResponseBodyResultQueryNodeServiceStatus setDoneSize(Long doneSize) {
            this.doneSize = doneSize;
            return this;
        }
        public Long getDoneSize() {
            return this.doneSize;
        }

        public GetClusterRunTimeInfoResponseBodyResultQueryNodeServiceStatus setTotalSize(Long totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Long getTotalSize() {
            return this.totalSize;
        }

    }

    public static class GetClusterRunTimeInfoResponseBodyResultQueryNode extends TeaModel {
        @NameInMap("configStatus")
        public GetClusterRunTimeInfoResponseBodyResultQueryNodeConfigStatus configStatus;

        @NameInMap("serviceStatus")
        public GetClusterRunTimeInfoResponseBodyResultQueryNodeServiceStatus serviceStatus;

        public static GetClusterRunTimeInfoResponseBodyResultQueryNode build(java.util.Map<String, ?> map) throws Exception {
            GetClusterRunTimeInfoResponseBodyResultQueryNode self = new GetClusterRunTimeInfoResponseBodyResultQueryNode();
            return TeaModel.build(map, self);
        }

        public GetClusterRunTimeInfoResponseBodyResultQueryNode setConfigStatus(GetClusterRunTimeInfoResponseBodyResultQueryNodeConfigStatus configStatus) {
            this.configStatus = configStatus;
            return this;
        }
        public GetClusterRunTimeInfoResponseBodyResultQueryNodeConfigStatus getConfigStatus() {
            return this.configStatus;
        }

        public GetClusterRunTimeInfoResponseBodyResultQueryNode setServiceStatus(GetClusterRunTimeInfoResponseBodyResultQueryNodeServiceStatus serviceStatus) {
            this.serviceStatus = serviceStatus;
            return this;
        }
        public GetClusterRunTimeInfoResponseBodyResultQueryNodeServiceStatus getServiceStatus() {
            return this.serviceStatus;
        }

    }

    public static class GetClusterRunTimeInfoResponseBodyResult extends TeaModel {
        @NameInMap("clusterName")
        public String clusterName;

        @NameInMap("dataNodes")
        public GetClusterRunTimeInfoResponseBodyResultDataNodes dataNodes;

        @NameInMap("queryNode")
        public GetClusterRunTimeInfoResponseBodyResultQueryNode queryNode;

        public static GetClusterRunTimeInfoResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetClusterRunTimeInfoResponseBodyResult self = new GetClusterRunTimeInfoResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetClusterRunTimeInfoResponseBodyResult setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public GetClusterRunTimeInfoResponseBodyResult setDataNodes(GetClusterRunTimeInfoResponseBodyResultDataNodes dataNodes) {
            this.dataNodes = dataNodes;
            return this;
        }
        public GetClusterRunTimeInfoResponseBodyResultDataNodes getDataNodes() {
            return this.dataNodes;
        }

        public GetClusterRunTimeInfoResponseBodyResult setQueryNode(GetClusterRunTimeInfoResponseBodyResultQueryNode queryNode) {
            this.queryNode = queryNode;
            return this;
        }
        public GetClusterRunTimeInfoResponseBodyResultQueryNode getQueryNode() {
            return this.queryNode;
        }

    }

}
