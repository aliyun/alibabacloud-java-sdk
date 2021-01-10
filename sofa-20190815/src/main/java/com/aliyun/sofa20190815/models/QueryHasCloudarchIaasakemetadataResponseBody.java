// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasCloudarchIaasakemetadataResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public QueryHasCloudarchIaasakemetadataResponseBodyResultContent resultContent;

    public static QueryHasCloudarchIaasakemetadataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryHasCloudarchIaasakemetadataResponseBody self = new QueryHasCloudarchIaasakemetadataResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryHasCloudarchIaasakemetadataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryHasCloudarchIaasakemetadataResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryHasCloudarchIaasakemetadataResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryHasCloudarchIaasakemetadataResponseBody setResultContent(QueryHasCloudarchIaasakemetadataResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public QueryHasCloudarchIaasakemetadataResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class QueryHasCloudarchIaasakemetadataResponseBodyResultContentData extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("AkeClusterId")
        public String akeClusterId;

        @NameInMap("AkeClusterName")
        public String akeClusterName;

        @NameInMap("AkeClusterStatus")
        public String akeClusterStatus;

        @NameInMap("AkeEndpoint")
        public String akeEndpoint;

        @NameInMap("AkeVersion")
        public String akeVersion;

        @NameInMap("NodeAccessType")
        public String nodeAccessType;

        @NameInMap("ContainerAccessType")
        public String containerAccessType;

        @NameInMap("Source")
        public String source;

        public static QueryHasCloudarchIaasakemetadataResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            QueryHasCloudarchIaasakemetadataResponseBodyResultContentData self = new QueryHasCloudarchIaasakemetadataResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public QueryHasCloudarchIaasakemetadataResponseBodyResultContentData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryHasCloudarchIaasakemetadataResponseBodyResultContentData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryHasCloudarchIaasakemetadataResponseBodyResultContentData setAkeClusterId(String akeClusterId) {
            this.akeClusterId = akeClusterId;
            return this;
        }
        public String getAkeClusterId() {
            return this.akeClusterId;
        }

        public QueryHasCloudarchIaasakemetadataResponseBodyResultContentData setAkeClusterName(String akeClusterName) {
            this.akeClusterName = akeClusterName;
            return this;
        }
        public String getAkeClusterName() {
            return this.akeClusterName;
        }

        public QueryHasCloudarchIaasakemetadataResponseBodyResultContentData setAkeClusterStatus(String akeClusterStatus) {
            this.akeClusterStatus = akeClusterStatus;
            return this;
        }
        public String getAkeClusterStatus() {
            return this.akeClusterStatus;
        }

        public QueryHasCloudarchIaasakemetadataResponseBodyResultContentData setAkeEndpoint(String akeEndpoint) {
            this.akeEndpoint = akeEndpoint;
            return this;
        }
        public String getAkeEndpoint() {
            return this.akeEndpoint;
        }

        public QueryHasCloudarchIaasakemetadataResponseBodyResultContentData setAkeVersion(String akeVersion) {
            this.akeVersion = akeVersion;
            return this;
        }
        public String getAkeVersion() {
            return this.akeVersion;
        }

        public QueryHasCloudarchIaasakemetadataResponseBodyResultContentData setNodeAccessType(String nodeAccessType) {
            this.nodeAccessType = nodeAccessType;
            return this;
        }
        public String getNodeAccessType() {
            return this.nodeAccessType;
        }

        public QueryHasCloudarchIaasakemetadataResponseBodyResultContentData setContainerAccessType(String containerAccessType) {
            this.containerAccessType = containerAccessType;
            return this;
        }
        public String getContainerAccessType() {
            return this.containerAccessType;
        }

        public QueryHasCloudarchIaasakemetadataResponseBodyResultContentData setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

    }

    public static class QueryHasCloudarchIaasakemetadataResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static QueryHasCloudarchIaasakemetadataResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            QueryHasCloudarchIaasakemetadataResponseBodyResultContentTopErrorCode self = new QueryHasCloudarchIaasakemetadataResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public QueryHasCloudarchIaasakemetadataResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public QueryHasCloudarchIaasakemetadataResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public QueryHasCloudarchIaasakemetadataResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public QueryHasCloudarchIaasakemetadataResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public QueryHasCloudarchIaasakemetadataResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public QueryHasCloudarchIaasakemetadataResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public QueryHasCloudarchIaasakemetadataResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryHasCloudarchIaasakemetadataResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class QueryHasCloudarchIaasakemetadataResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static QueryHasCloudarchIaasakemetadataResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            QueryHasCloudarchIaasakemetadataResponseBodyResultContentTopErrorReason self = new QueryHasCloudarchIaasakemetadataResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public QueryHasCloudarchIaasakemetadataResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasCloudarchIaasakemetadataResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class QueryHasCloudarchIaasakemetadataResponseBodyResultContent extends TeaModel {
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
        public java.util.List<QueryHasCloudarchIaasakemetadataResponseBodyResultContentData> data;

        @NameInMap("TopErrorCode")
        public QueryHasCloudarchIaasakemetadataResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public QueryHasCloudarchIaasakemetadataResponseBodyResultContentTopErrorReason topErrorReason;

        public static QueryHasCloudarchIaasakemetadataResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            QueryHasCloudarchIaasakemetadataResponseBodyResultContent self = new QueryHasCloudarchIaasakemetadataResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public QueryHasCloudarchIaasakemetadataResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasCloudarchIaasakemetadataResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryHasCloudarchIaasakemetadataResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public QueryHasCloudarchIaasakemetadataResponseBodyResultContent setCurrentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Long getCurrentPage() {
            return this.currentPage;
        }

        public QueryHasCloudarchIaasakemetadataResponseBodyResultContent setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public QueryHasCloudarchIaasakemetadataResponseBodyResultContent setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public QueryHasCloudarchIaasakemetadataResponseBodyResultContent setData(java.util.List<QueryHasCloudarchIaasakemetadataResponseBodyResultContentData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryHasCloudarchIaasakemetadataResponseBodyResultContentData> getData() {
            return this.data;
        }

        public QueryHasCloudarchIaasakemetadataResponseBodyResultContent setTopErrorCode(QueryHasCloudarchIaasakemetadataResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public QueryHasCloudarchIaasakemetadataResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public QueryHasCloudarchIaasakemetadataResponseBodyResultContent setTopErrorReason(QueryHasCloudarchIaasakemetadataResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public QueryHasCloudarchIaasakemetadataResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
