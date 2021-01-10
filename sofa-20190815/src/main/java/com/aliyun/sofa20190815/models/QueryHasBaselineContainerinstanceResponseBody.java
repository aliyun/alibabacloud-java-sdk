// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasBaselineContainerinstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public QueryHasBaselineContainerinstanceResponseBodyResultContent resultContent;

    public static QueryHasBaselineContainerinstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryHasBaselineContainerinstanceResponseBody self = new QueryHasBaselineContainerinstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryHasBaselineContainerinstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryHasBaselineContainerinstanceResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryHasBaselineContainerinstanceResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryHasBaselineContainerinstanceResponseBody setResultContent(QueryHasBaselineContainerinstanceResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public QueryHasBaselineContainerinstanceResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class QueryHasBaselineContainerinstanceResponseBodyResultContentData extends TeaModel {
        @NameInMap("AppInstanceId")
        public String appInstanceId;

        @NameInMap("IaasMetadataName")
        public String iaasMetadataName;

        @NameInMap("IaasMetadataId")
        public String iaasMetadataId;

        @NameInMap("Name")
        public String name;

        @NameInMap("Cpu")
        public Long cpu;

        @NameInMap("Image")
        public String image;

        @NameInMap("HostName")
        public String hostName;

        @NameInMap("Memory")
        public Long memory;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("HostIp")
        public String hostIp;

        @NameInMap("Status")
        public String status;

        @NameInMap("Source")
        public String source;

        @NameInMap("PodName")
        public String podName;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("Id")
        public String id;

        @NameInMap("UtcCreate")
        public String utcCreate;

        @NameInMap("UtcModified")
        public String utcModified;

        public static QueryHasBaselineContainerinstanceResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            QueryHasBaselineContainerinstanceResponseBodyResultContentData self = new QueryHasBaselineContainerinstanceResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public QueryHasBaselineContainerinstanceResponseBodyResultContentData setAppInstanceId(String appInstanceId) {
            this.appInstanceId = appInstanceId;
            return this;
        }
        public String getAppInstanceId() {
            return this.appInstanceId;
        }

        public QueryHasBaselineContainerinstanceResponseBodyResultContentData setIaasMetadataName(String iaasMetadataName) {
            this.iaasMetadataName = iaasMetadataName;
            return this;
        }
        public String getIaasMetadataName() {
            return this.iaasMetadataName;
        }

        public QueryHasBaselineContainerinstanceResponseBodyResultContentData setIaasMetadataId(String iaasMetadataId) {
            this.iaasMetadataId = iaasMetadataId;
            return this;
        }
        public String getIaasMetadataId() {
            return this.iaasMetadataId;
        }

        public QueryHasBaselineContainerinstanceResponseBodyResultContentData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryHasBaselineContainerinstanceResponseBodyResultContentData setCpu(Long cpu) {
            this.cpu = cpu;
            return this;
        }
        public Long getCpu() {
            return this.cpu;
        }

        public QueryHasBaselineContainerinstanceResponseBodyResultContentData setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public QueryHasBaselineContainerinstanceResponseBodyResultContentData setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public QueryHasBaselineContainerinstanceResponseBodyResultContentData setMemory(Long memory) {
            this.memory = memory;
            return this;
        }
        public Long getMemory() {
            return this.memory;
        }

        public QueryHasBaselineContainerinstanceResponseBodyResultContentData setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public QueryHasBaselineContainerinstanceResponseBodyResultContentData setHostIp(String hostIp) {
            this.hostIp = hostIp;
            return this;
        }
        public String getHostIp() {
            return this.hostIp;
        }

        public QueryHasBaselineContainerinstanceResponseBodyResultContentData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryHasBaselineContainerinstanceResponseBodyResultContentData setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public QueryHasBaselineContainerinstanceResponseBodyResultContentData setPodName(String podName) {
            this.podName = podName;
            return this;
        }
        public String getPodName() {
            return this.podName;
        }

        public QueryHasBaselineContainerinstanceResponseBodyResultContentData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public QueryHasBaselineContainerinstanceResponseBodyResultContentData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryHasBaselineContainerinstanceResponseBodyResultContentData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public QueryHasBaselineContainerinstanceResponseBodyResultContentData setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

    }

    public static class QueryHasBaselineContainerinstanceResponseBodyResultContentTopErrorCode extends TeaModel {
        @NameInMap("ExceptionCode")
        public String exceptionCode;

        @NameInMap("ExceptionCodeDescription")
        public String exceptionCodeDescription;

        @NameInMap("Level")
        public String level;

        @NameInMap("Prefix")
        public String prefix;

        @NameInMap("Scene")
        public String scene;

        @NameInMap("SceneName")
        public String sceneName;

        @NameInMap("Type")
        public String type;

        @NameInMap("Version")
        public String version;

        public static QueryHasBaselineContainerinstanceResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            QueryHasBaselineContainerinstanceResponseBodyResultContentTopErrorCode self = new QueryHasBaselineContainerinstanceResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public QueryHasBaselineContainerinstanceResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public QueryHasBaselineContainerinstanceResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public QueryHasBaselineContainerinstanceResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public QueryHasBaselineContainerinstanceResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public QueryHasBaselineContainerinstanceResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public QueryHasBaselineContainerinstanceResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public QueryHasBaselineContainerinstanceResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryHasBaselineContainerinstanceResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class QueryHasBaselineContainerinstanceResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static QueryHasBaselineContainerinstanceResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            QueryHasBaselineContainerinstanceResponseBodyResultContentTopErrorReason self = new QueryHasBaselineContainerinstanceResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public QueryHasBaselineContainerinstanceResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasBaselineContainerinstanceResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class QueryHasBaselineContainerinstanceResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("CurrentPage")
        public Long currentPage;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("Data")
        public java.util.List<QueryHasBaselineContainerinstanceResponseBodyResultContentData> data;

        @NameInMap("TopErrorCode")
        public QueryHasBaselineContainerinstanceResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public QueryHasBaselineContainerinstanceResponseBodyResultContentTopErrorReason topErrorReason;

        public static QueryHasBaselineContainerinstanceResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            QueryHasBaselineContainerinstanceResponseBodyResultContent self = new QueryHasBaselineContainerinstanceResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public QueryHasBaselineContainerinstanceResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasBaselineContainerinstanceResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryHasBaselineContainerinstanceResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public QueryHasBaselineContainerinstanceResponseBodyResultContent setCurrentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Long getCurrentPage() {
            return this.currentPage;
        }

        public QueryHasBaselineContainerinstanceResponseBodyResultContent setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public QueryHasBaselineContainerinstanceResponseBodyResultContent setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public QueryHasBaselineContainerinstanceResponseBodyResultContent setData(java.util.List<QueryHasBaselineContainerinstanceResponseBodyResultContentData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryHasBaselineContainerinstanceResponseBodyResultContentData> getData() {
            return this.data;
        }

        public QueryHasBaselineContainerinstanceResponseBodyResultContent setTopErrorCode(QueryHasBaselineContainerinstanceResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public QueryHasBaselineContainerinstanceResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public QueryHasBaselineContainerinstanceResponseBodyResultContent setTopErrorReason(QueryHasBaselineContainerinstanceResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public QueryHasBaselineContainerinstanceResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
