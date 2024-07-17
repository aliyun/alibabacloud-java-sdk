// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class GetClusterRunTimeInfoResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E45380E8-994A-5402-9806-F114B3295FCF</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The result.</p>
     */
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

    public static class GetClusterRunTimeInfoResponseBodyResultDataNodesConfigStatusList extends TeaModel {
        /**
         * <p>The time when the configuration was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("configUpdateTime")
        public String configUpdateTime;

        /**
         * <p>The configuration progress. Unit: percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("donePercent")
        public Integer donePercent;

        /**
         * <p>The number of processed Searcher workers in the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("doneSize")
        public Integer doneSize;

        /**
         * <p>The cluster name.</p>
         * 
         * <strong>example:</strong>
         * <p>test_0704</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The total number of Searcher workers in the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("totalSize")
        public Integer totalSize;

        public static GetClusterRunTimeInfoResponseBodyResultDataNodesConfigStatusList build(java.util.Map<String, ?> map) throws Exception {
            GetClusterRunTimeInfoResponseBodyResultDataNodesConfigStatusList self = new GetClusterRunTimeInfoResponseBodyResultDataNodesConfigStatusList();
            return TeaModel.build(map, self);
        }

        public GetClusterRunTimeInfoResponseBodyResultDataNodesConfigStatusList setConfigUpdateTime(String configUpdateTime) {
            this.configUpdateTime = configUpdateTime;
            return this;
        }
        public String getConfigUpdateTime() {
            return this.configUpdateTime;
        }

        public GetClusterRunTimeInfoResponseBodyResultDataNodesConfigStatusList setDonePercent(Integer donePercent) {
            this.donePercent = donePercent;
            return this;
        }
        public Integer getDonePercent() {
            return this.donePercent;
        }

        public GetClusterRunTimeInfoResponseBodyResultDataNodesConfigStatusList setDoneSize(Integer doneSize) {
            this.doneSize = doneSize;
            return this;
        }
        public Integer getDoneSize() {
            return this.doneSize;
        }

        public GetClusterRunTimeInfoResponseBodyResultDataNodesConfigStatusList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetClusterRunTimeInfoResponseBodyResultDataNodesConfigStatusList setTotalSize(Integer totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Integer getTotalSize() {
            return this.totalSize;
        }

    }

    public static class GetClusterRunTimeInfoResponseBodyResultDataNodesDataStatusListAdvanceConfigInfo extends TeaModel {
        /**
         * <p>The name of the index configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>index_meta_name</p>
         */
        @NameInMap("configMetaName")
        public String configMetaName;

        /**
         * <p>The version number.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("version")
        public Long version;

        public static GetClusterRunTimeInfoResponseBodyResultDataNodesDataStatusListAdvanceConfigInfo build(java.util.Map<String, ?> map) throws Exception {
            GetClusterRunTimeInfoResponseBodyResultDataNodesDataStatusListAdvanceConfigInfo self = new GetClusterRunTimeInfoResponseBodyResultDataNodesDataStatusListAdvanceConfigInfo();
            return TeaModel.build(map, self);
        }

        public GetClusterRunTimeInfoResponseBodyResultDataNodesDataStatusListAdvanceConfigInfo setConfigMetaName(String configMetaName) {
            this.configMetaName = configMetaName;
            return this;
        }
        public String getConfigMetaName() {
            return this.configMetaName;
        }

        public GetClusterRunTimeInfoResponseBodyResultDataNodesDataStatusListAdvanceConfigInfo setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

    }

    public static class GetClusterRunTimeInfoResponseBodyResultDataNodesDataStatusListIndexConfigInfo extends TeaModel {
        /**
         * <p>The name of the index configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>index_meta_name</p>
         */
        @NameInMap("configMetaName")
        public String configMetaName;

        /**
         * <p>The version of the index template.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("version")
        public Long version;

        public static GetClusterRunTimeInfoResponseBodyResultDataNodesDataStatusListIndexConfigInfo build(java.util.Map<String, ?> map) throws Exception {
            GetClusterRunTimeInfoResponseBodyResultDataNodesDataStatusListIndexConfigInfo self = new GetClusterRunTimeInfoResponseBodyResultDataNodesDataStatusListIndexConfigInfo();
            return TeaModel.build(map, self);
        }

        public GetClusterRunTimeInfoResponseBodyResultDataNodesDataStatusListIndexConfigInfo setConfigMetaName(String configMetaName) {
            this.configMetaName = configMetaName;
            return this;
        }
        public String getConfigMetaName() {
            return this.configMetaName;
        }

        public GetClusterRunTimeInfoResponseBodyResultDataNodesDataStatusListIndexConfigInfo setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

    }

    public static class GetClusterRunTimeInfoResponseBodyResultDataNodesDataStatusList extends TeaModel {
        /**
         * <p>The information about the advanced configuration.</p>
         */
        @NameInMap("advanceConfigInfo")
        public GetClusterRunTimeInfoResponseBodyResultDataNodesDataStatusListAdvanceConfigInfo advanceConfigInfo;

        /**
         * <p>The name of the worker that failed due to a deployment failure.</p>
         */
        @NameInMap("deployFailedWorker")
        public java.util.List<String> deployFailedWorker;

        /**
         * <p>The storage capacity. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("docSize")
        public Integer docSize;

        /**
         * <p>The configuration progress. Unit: percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("donePercent")
        public Integer donePercent;

        /**
         * <p>The number of processed QRS workers in the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("doneSize")
        public Integer doneSize;

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>0A3B1C48006A6C0905F6375F4821EB50</p>
         */
        @NameInMap("errorMsg")
        public String errorMsg;

        /**
         * <p>The time when full data in the index was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot; &quot;</p>
         */
        @NameInMap("fullUpdateTime")
        public String fullUpdateTime;

        /**
         * <p>The time when the full index version was generated.</p>
         * 
         * <strong>example:</strong>
         * <p>123423</p>
         */
        @NameInMap("fullVersion")
        public Long fullVersion;

        /**
         * <p>The time when incremental data in the index was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("incUpdateTime")
        public String incUpdateTime;

        /**
         * <p>The time when the incremental index version was generated.</p>
         * 
         * <strong>example:</strong>
         * <p>123423</p>
         */
        @NameInMap("incVersion")
        public Long incVersion;

        /**
         * <p>The information about the index configuration.</p>
         */
        @NameInMap("indexConfigInfo")
        public GetClusterRunTimeInfoResponseBodyResultDataNodesDataStatusListIndexConfigInfo indexConfigInfo;

        /**
         * <p>The index size.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("indexSize")
        public Long indexSize;

        /**
         * <p>The name of the worker that failed due to insufficient disks.</p>
         */
        @NameInMap("lackDiskWorker")
        public java.util.List<String> lackDiskWorker;

        /**
         * <p>The name of the worker that failed due to insufficient memory.</p>
         */
        @NameInMap("lackMemWorker")
        public java.util.List<String> lackMemWorker;

        /**
         * <p>The name of the QRS worker.</p>
         * 
         * <strong>example:</strong>
         * <p>ha-cn-c4d2rq7nt04_qrs</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The total number of QRS workers in the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("totalSize")
        public Integer totalSize;

        public static GetClusterRunTimeInfoResponseBodyResultDataNodesDataStatusList build(java.util.Map<String, ?> map) throws Exception {
            GetClusterRunTimeInfoResponseBodyResultDataNodesDataStatusList self = new GetClusterRunTimeInfoResponseBodyResultDataNodesDataStatusList();
            return TeaModel.build(map, self);
        }

        public GetClusterRunTimeInfoResponseBodyResultDataNodesDataStatusList setAdvanceConfigInfo(GetClusterRunTimeInfoResponseBodyResultDataNodesDataStatusListAdvanceConfigInfo advanceConfigInfo) {
            this.advanceConfigInfo = advanceConfigInfo;
            return this;
        }
        public GetClusterRunTimeInfoResponseBodyResultDataNodesDataStatusListAdvanceConfigInfo getAdvanceConfigInfo() {
            return this.advanceConfigInfo;
        }

        public GetClusterRunTimeInfoResponseBodyResultDataNodesDataStatusList setDeployFailedWorker(java.util.List<String> deployFailedWorker) {
            this.deployFailedWorker = deployFailedWorker;
            return this;
        }
        public java.util.List<String> getDeployFailedWorker() {
            return this.deployFailedWorker;
        }

        public GetClusterRunTimeInfoResponseBodyResultDataNodesDataStatusList setDocSize(Integer docSize) {
            this.docSize = docSize;
            return this;
        }
        public Integer getDocSize() {
            return this.docSize;
        }

        public GetClusterRunTimeInfoResponseBodyResultDataNodesDataStatusList setDonePercent(Integer donePercent) {
            this.donePercent = donePercent;
            return this;
        }
        public Integer getDonePercent() {
            return this.donePercent;
        }

        public GetClusterRunTimeInfoResponseBodyResultDataNodesDataStatusList setDoneSize(Integer doneSize) {
            this.doneSize = doneSize;
            return this;
        }
        public Integer getDoneSize() {
            return this.doneSize;
        }

        public GetClusterRunTimeInfoResponseBodyResultDataNodesDataStatusList setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public GetClusterRunTimeInfoResponseBodyResultDataNodesDataStatusList setFullUpdateTime(String fullUpdateTime) {
            this.fullUpdateTime = fullUpdateTime;
            return this;
        }
        public String getFullUpdateTime() {
            return this.fullUpdateTime;
        }

        public GetClusterRunTimeInfoResponseBodyResultDataNodesDataStatusList setFullVersion(Long fullVersion) {
            this.fullVersion = fullVersion;
            return this;
        }
        public Long getFullVersion() {
            return this.fullVersion;
        }

        public GetClusterRunTimeInfoResponseBodyResultDataNodesDataStatusList setIncUpdateTime(String incUpdateTime) {
            this.incUpdateTime = incUpdateTime;
            return this;
        }
        public String getIncUpdateTime() {
            return this.incUpdateTime;
        }

        public GetClusterRunTimeInfoResponseBodyResultDataNodesDataStatusList setIncVersion(Long incVersion) {
            this.incVersion = incVersion;
            return this;
        }
        public Long getIncVersion() {
            return this.incVersion;
        }

        public GetClusterRunTimeInfoResponseBodyResultDataNodesDataStatusList setIndexConfigInfo(GetClusterRunTimeInfoResponseBodyResultDataNodesDataStatusListIndexConfigInfo indexConfigInfo) {
            this.indexConfigInfo = indexConfigInfo;
            return this;
        }
        public GetClusterRunTimeInfoResponseBodyResultDataNodesDataStatusListIndexConfigInfo getIndexConfigInfo() {
            return this.indexConfigInfo;
        }

        public GetClusterRunTimeInfoResponseBodyResultDataNodesDataStatusList setIndexSize(Long indexSize) {
            this.indexSize = indexSize;
            return this;
        }
        public Long getIndexSize() {
            return this.indexSize;
        }

        public GetClusterRunTimeInfoResponseBodyResultDataNodesDataStatusList setLackDiskWorker(java.util.List<String> lackDiskWorker) {
            this.lackDiskWorker = lackDiskWorker;
            return this;
        }
        public java.util.List<String> getLackDiskWorker() {
            return this.lackDiskWorker;
        }

        public GetClusterRunTimeInfoResponseBodyResultDataNodesDataStatusList setLackMemWorker(java.util.List<String> lackMemWorker) {
            this.lackMemWorker = lackMemWorker;
            return this;
        }
        public java.util.List<String> getLackMemWorker() {
            return this.lackMemWorker;
        }

        public GetClusterRunTimeInfoResponseBodyResultDataNodesDataStatusList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetClusterRunTimeInfoResponseBodyResultDataNodesDataStatusList setTotalSize(Integer totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Integer getTotalSize() {
            return this.totalSize;
        }

    }

    public static class GetClusterRunTimeInfoResponseBodyResultDataNodesServiceStatus extends TeaModel {
        /**
         * <p>The process progress of QRS workers in the cluster. Unit: percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("donePercent")
        public Integer donePercent;

        /**
         * <p>The number of processed QRS workers in the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("doneSize")
        public Integer doneSize;

        /**
         * <p>The name of the QRS worker.</p>
         * 
         * <strong>example:</strong>
         * <p>ha-cn-0ju2s170b03_qrs</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The total number of QRS workers in the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("totalSize")
        public Integer totalSize;

        public static GetClusterRunTimeInfoResponseBodyResultDataNodesServiceStatus build(java.util.Map<String, ?> map) throws Exception {
            GetClusterRunTimeInfoResponseBodyResultDataNodesServiceStatus self = new GetClusterRunTimeInfoResponseBodyResultDataNodesServiceStatus();
            return TeaModel.build(map, self);
        }

        public GetClusterRunTimeInfoResponseBodyResultDataNodesServiceStatus setDonePercent(Integer donePercent) {
            this.donePercent = donePercent;
            return this;
        }
        public Integer getDonePercent() {
            return this.donePercent;
        }

        public GetClusterRunTimeInfoResponseBodyResultDataNodesServiceStatus setDoneSize(Integer doneSize) {
            this.doneSize = doneSize;
            return this;
        }
        public Integer getDoneSize() {
            return this.doneSize;
        }

        public GetClusterRunTimeInfoResponseBodyResultDataNodesServiceStatus setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetClusterRunTimeInfoResponseBodyResultDataNodesServiceStatus setTotalSize(Integer totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Integer getTotalSize() {
            return this.totalSize;
        }

    }

    public static class GetClusterRunTimeInfoResponseBodyResultDataNodes extends TeaModel {
        /**
         * <p>The configuration status.</p>
         */
        @NameInMap("configStatusList")
        public java.util.List<GetClusterRunTimeInfoResponseBodyResultDataNodesConfigStatusList> configStatusList;

        /**
         * <p>The data of the Searcher worker.</p>
         */
        @NameInMap("dataStatusList")
        public java.util.List<GetClusterRunTimeInfoResponseBodyResultDataNodesDataStatusList> dataStatusList;

        /**
         * <p>The service status of the QRS worker.</p>
         */
        @NameInMap("serviceStatus")
        public GetClusterRunTimeInfoResponseBodyResultDataNodesServiceStatus serviceStatus;

        public static GetClusterRunTimeInfoResponseBodyResultDataNodes build(java.util.Map<String, ?> map) throws Exception {
            GetClusterRunTimeInfoResponseBodyResultDataNodes self = new GetClusterRunTimeInfoResponseBodyResultDataNodes();
            return TeaModel.build(map, self);
        }

        public GetClusterRunTimeInfoResponseBodyResultDataNodes setConfigStatusList(java.util.List<GetClusterRunTimeInfoResponseBodyResultDataNodesConfigStatusList> configStatusList) {
            this.configStatusList = configStatusList;
            return this;
        }
        public java.util.List<GetClusterRunTimeInfoResponseBodyResultDataNodesConfigStatusList> getConfigStatusList() {
            return this.configStatusList;
        }

        public GetClusterRunTimeInfoResponseBodyResultDataNodes setDataStatusList(java.util.List<GetClusterRunTimeInfoResponseBodyResultDataNodesDataStatusList> dataStatusList) {
            this.dataStatusList = dataStatusList;
            return this;
        }
        public java.util.List<GetClusterRunTimeInfoResponseBodyResultDataNodesDataStatusList> getDataStatusList() {
            return this.dataStatusList;
        }

        public GetClusterRunTimeInfoResponseBodyResultDataNodes setServiceStatus(GetClusterRunTimeInfoResponseBodyResultDataNodesServiceStatus serviceStatus) {
            this.serviceStatus = serviceStatus;
            return this;
        }
        public GetClusterRunTimeInfoResponseBodyResultDataNodesServiceStatus getServiceStatus() {
            return this.serviceStatus;
        }

    }

    public static class GetClusterRunTimeInfoResponseBodyResultQueryNodeConfigStatusList extends TeaModel {
        /**
         * <p>The time when the configuration was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot; &quot;</p>
         */
        @NameInMap("configUpdateTime")
        public String configUpdateTime;

        /**
         * <p>The process progress of QRS workers in the cluster. Unit: percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("donePercent")
        public Integer donePercent;

        /**
         * <p>The number of processed QRS workers in the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("doneSize")
        public Integer doneSize;

        /**
         * <p>The cluster name.</p>
         * 
         * <strong>example:</strong>
         * <p>ha-cn-zvp2qr1sk01_qrs</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The total number of QRS workers in the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("totalSize")
        public Integer totalSize;

        public static GetClusterRunTimeInfoResponseBodyResultQueryNodeConfigStatusList build(java.util.Map<String, ?> map) throws Exception {
            GetClusterRunTimeInfoResponseBodyResultQueryNodeConfigStatusList self = new GetClusterRunTimeInfoResponseBodyResultQueryNodeConfigStatusList();
            return TeaModel.build(map, self);
        }

        public GetClusterRunTimeInfoResponseBodyResultQueryNodeConfigStatusList setConfigUpdateTime(String configUpdateTime) {
            this.configUpdateTime = configUpdateTime;
            return this;
        }
        public String getConfigUpdateTime() {
            return this.configUpdateTime;
        }

        public GetClusterRunTimeInfoResponseBodyResultQueryNodeConfigStatusList setDonePercent(Integer donePercent) {
            this.donePercent = donePercent;
            return this;
        }
        public Integer getDonePercent() {
            return this.donePercent;
        }

        public GetClusterRunTimeInfoResponseBodyResultQueryNodeConfigStatusList setDoneSize(Integer doneSize) {
            this.doneSize = doneSize;
            return this;
        }
        public Integer getDoneSize() {
            return this.doneSize;
        }

        public GetClusterRunTimeInfoResponseBodyResultQueryNodeConfigStatusList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetClusterRunTimeInfoResponseBodyResultQueryNodeConfigStatusList setTotalSize(Integer totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Integer getTotalSize() {
            return this.totalSize;
        }

    }

    public static class GetClusterRunTimeInfoResponseBodyResultQueryNodeServiceStatus extends TeaModel {
        /**
         * <p>The process progress of QRS workers in the cluster. Unit: percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("donePercent")
        public Integer donePercent;

        /**
         * <p>The number of processed QRS workers in the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("doneSize")
        public Integer doneSize;

        /**
         * <p>The cluster name.</p>
         * 
         * <strong>example:</strong>
         * <p>ha-cn-c4d2rq7nt04_qrs</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The total number of QRS workers in the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("totalSize")
        public Integer totalSize;

        public static GetClusterRunTimeInfoResponseBodyResultQueryNodeServiceStatus build(java.util.Map<String, ?> map) throws Exception {
            GetClusterRunTimeInfoResponseBodyResultQueryNodeServiceStatus self = new GetClusterRunTimeInfoResponseBodyResultQueryNodeServiceStatus();
            return TeaModel.build(map, self);
        }

        public GetClusterRunTimeInfoResponseBodyResultQueryNodeServiceStatus setDonePercent(Integer donePercent) {
            this.donePercent = donePercent;
            return this;
        }
        public Integer getDonePercent() {
            return this.donePercent;
        }

        public GetClusterRunTimeInfoResponseBodyResultQueryNodeServiceStatus setDoneSize(Integer doneSize) {
            this.doneSize = doneSize;
            return this;
        }
        public Integer getDoneSize() {
            return this.doneSize;
        }

        public GetClusterRunTimeInfoResponseBodyResultQueryNodeServiceStatus setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetClusterRunTimeInfoResponseBodyResultQueryNodeServiceStatus setTotalSize(Integer totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Integer getTotalSize() {
            return this.totalSize;
        }

    }

    public static class GetClusterRunTimeInfoResponseBodyResultQueryNode extends TeaModel {
        /**
         * <p>The configuration status.</p>
         */
        @NameInMap("configStatusList")
        public java.util.List<GetClusterRunTimeInfoResponseBodyResultQueryNodeConfigStatusList> configStatusList;

        /**
         * <p>The service status of the QRS worker.</p>
         */
        @NameInMap("serviceStatus")
        public GetClusterRunTimeInfoResponseBodyResultQueryNodeServiceStatus serviceStatus;

        public static GetClusterRunTimeInfoResponseBodyResultQueryNode build(java.util.Map<String, ?> map) throws Exception {
            GetClusterRunTimeInfoResponseBodyResultQueryNode self = new GetClusterRunTimeInfoResponseBodyResultQueryNode();
            return TeaModel.build(map, self);
        }

        public GetClusterRunTimeInfoResponseBodyResultQueryNode setConfigStatusList(java.util.List<GetClusterRunTimeInfoResponseBodyResultQueryNodeConfigStatusList> configStatusList) {
            this.configStatusList = configStatusList;
            return this;
        }
        public java.util.List<GetClusterRunTimeInfoResponseBodyResultQueryNodeConfigStatusList> getConfigStatusList() {
            return this.configStatusList;
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
        /**
         * <p>The cluster name.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc_hz_domain_1</p>
         */
        @NameInMap("clusterName")
        public String clusterName;

        /**
         * <p>The information about the Searcher workers.</p>
         */
        @NameInMap("dataNodes")
        public java.util.List<GetClusterRunTimeInfoResponseBodyResultDataNodes> dataNodes;

        /**
         * <p>The information about the Query Result Searcher (QRS) workers.</p>
         */
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

        public GetClusterRunTimeInfoResponseBodyResult setDataNodes(java.util.List<GetClusterRunTimeInfoResponseBodyResultDataNodes> dataNodes) {
            this.dataNodes = dataNodes;
            return this;
        }
        public java.util.List<GetClusterRunTimeInfoResponseBodyResultDataNodes> getDataNodes() {
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
