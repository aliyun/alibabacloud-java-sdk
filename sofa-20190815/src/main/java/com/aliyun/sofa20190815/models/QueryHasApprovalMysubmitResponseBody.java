// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasApprovalMysubmitResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public QueryHasApprovalMysubmitResponseBodyResultContent resultContent;

    public static QueryHasApprovalMysubmitResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryHasApprovalMysubmitResponseBody self = new QueryHasApprovalMysubmitResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryHasApprovalMysubmitResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryHasApprovalMysubmitResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryHasApprovalMysubmitResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryHasApprovalMysubmitResponseBody setResultContent(QueryHasApprovalMysubmitResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public QueryHasApprovalMysubmitResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class QueryHasApprovalMysubmitResponseBodyResultContentDataRenderDatas extends TeaModel {
        @NameInMap("Label")
        public String label;

        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        @NameInMap("Visible")
        public Boolean visible;

        public static QueryHasApprovalMysubmitResponseBodyResultContentDataRenderDatas build(java.util.Map<String, ?> map) throws Exception {
            QueryHasApprovalMysubmitResponseBodyResultContentDataRenderDatas self = new QueryHasApprovalMysubmitResponseBodyResultContentDataRenderDatas();
            return TeaModel.build(map, self);
        }

        public QueryHasApprovalMysubmitResponseBodyResultContentDataRenderDatas setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryHasApprovalMysubmitResponseBodyResultContentDataRenderDatas setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public QueryHasApprovalMysubmitResponseBodyResultContentDataRenderDatas setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public QueryHasApprovalMysubmitResponseBodyResultContentDataRenderDatas setVisible(Boolean visible) {
            this.visible = visible;
            return this;
        }
        public Boolean getVisible() {
            return this.visible;
        }

    }

    public static class QueryHasApprovalMysubmitResponseBodyResultContentData extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Url")
        public String url;

        @NameInMap("OutBizId")
        public String outBizId;

        @NameInMap("Type")
        public String type;

        @NameInMap("RefSource")
        public String refSource;

        @NameInMap("Context")
        public String context;

        @NameInMap("Status")
        public String status;

        @NameInMap("SyncFromBPMS")
        public Boolean syncFromBPMS;

        @NameInMap("ExecuteStatus")
        public String executeStatus;

        @NameInMap("FailedReason")
        public String failedReason;

        @NameInMap("SubmitterId")
        public String submitterId;

        @NameInMap("SubmitterAccount")
        public String submitterAccount;

        @NameInMap("SubmitterNickName")
        public String submitterNickName;

        @NameInMap("SubmitterRealName")
        public String submitterRealName;

        @NameInMap("Strategy")
        public String strategy;

        @NameInMap("Title")
        public String title;

        @NameInMap("Brief")
        public String brief;

        @NameInMap("StatusUpdated")
        public String statusUpdated;

        @NameInMap("UpdaterId")
        public String updaterId;

        @NameInMap("BpmsLink")
        public String bpmsLink;

        @NameInMap("ProcessTaskId")
        public String processTaskId;

        @NameInMap("UtcCreate")
        public String utcCreate;

        @NameInMap("UtcModified")
        public String utcModified;

        @NameInMap("RenderDatas")
        public java.util.List<QueryHasApprovalMysubmitResponseBodyResultContentDataRenderDatas> renderDatas;

        public static QueryHasApprovalMysubmitResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            QueryHasApprovalMysubmitResponseBodyResultContentData self = new QueryHasApprovalMysubmitResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public QueryHasApprovalMysubmitResponseBodyResultContentData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryHasApprovalMysubmitResponseBodyResultContentData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public QueryHasApprovalMysubmitResponseBodyResultContentData setOutBizId(String outBizId) {
            this.outBizId = outBizId;
            return this;
        }
        public String getOutBizId() {
            return this.outBizId;
        }

        public QueryHasApprovalMysubmitResponseBodyResultContentData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryHasApprovalMysubmitResponseBodyResultContentData setRefSource(String refSource) {
            this.refSource = refSource;
            return this;
        }
        public String getRefSource() {
            return this.refSource;
        }

        public QueryHasApprovalMysubmitResponseBodyResultContentData setContext(String context) {
            this.context = context;
            return this;
        }
        public String getContext() {
            return this.context;
        }

        public QueryHasApprovalMysubmitResponseBodyResultContentData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryHasApprovalMysubmitResponseBodyResultContentData setSyncFromBPMS(Boolean syncFromBPMS) {
            this.syncFromBPMS = syncFromBPMS;
            return this;
        }
        public Boolean getSyncFromBPMS() {
            return this.syncFromBPMS;
        }

        public QueryHasApprovalMysubmitResponseBodyResultContentData setExecuteStatus(String executeStatus) {
            this.executeStatus = executeStatus;
            return this;
        }
        public String getExecuteStatus() {
            return this.executeStatus;
        }

        public QueryHasApprovalMysubmitResponseBodyResultContentData setFailedReason(String failedReason) {
            this.failedReason = failedReason;
            return this;
        }
        public String getFailedReason() {
            return this.failedReason;
        }

        public QueryHasApprovalMysubmitResponseBodyResultContentData setSubmitterId(String submitterId) {
            this.submitterId = submitterId;
            return this;
        }
        public String getSubmitterId() {
            return this.submitterId;
        }

        public QueryHasApprovalMysubmitResponseBodyResultContentData setSubmitterAccount(String submitterAccount) {
            this.submitterAccount = submitterAccount;
            return this;
        }
        public String getSubmitterAccount() {
            return this.submitterAccount;
        }

        public QueryHasApprovalMysubmitResponseBodyResultContentData setSubmitterNickName(String submitterNickName) {
            this.submitterNickName = submitterNickName;
            return this;
        }
        public String getSubmitterNickName() {
            return this.submitterNickName;
        }

        public QueryHasApprovalMysubmitResponseBodyResultContentData setSubmitterRealName(String submitterRealName) {
            this.submitterRealName = submitterRealName;
            return this;
        }
        public String getSubmitterRealName() {
            return this.submitterRealName;
        }

        public QueryHasApprovalMysubmitResponseBodyResultContentData setStrategy(String strategy) {
            this.strategy = strategy;
            return this;
        }
        public String getStrategy() {
            return this.strategy;
        }

        public QueryHasApprovalMysubmitResponseBodyResultContentData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public QueryHasApprovalMysubmitResponseBodyResultContentData setBrief(String brief) {
            this.brief = brief;
            return this;
        }
        public String getBrief() {
            return this.brief;
        }

        public QueryHasApprovalMysubmitResponseBodyResultContentData setStatusUpdated(String statusUpdated) {
            this.statusUpdated = statusUpdated;
            return this;
        }
        public String getStatusUpdated() {
            return this.statusUpdated;
        }

        public QueryHasApprovalMysubmitResponseBodyResultContentData setUpdaterId(String updaterId) {
            this.updaterId = updaterId;
            return this;
        }
        public String getUpdaterId() {
            return this.updaterId;
        }

        public QueryHasApprovalMysubmitResponseBodyResultContentData setBpmsLink(String bpmsLink) {
            this.bpmsLink = bpmsLink;
            return this;
        }
        public String getBpmsLink() {
            return this.bpmsLink;
        }

        public QueryHasApprovalMysubmitResponseBodyResultContentData setProcessTaskId(String processTaskId) {
            this.processTaskId = processTaskId;
            return this;
        }
        public String getProcessTaskId() {
            return this.processTaskId;
        }

        public QueryHasApprovalMysubmitResponseBodyResultContentData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public QueryHasApprovalMysubmitResponseBodyResultContentData setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

        public QueryHasApprovalMysubmitResponseBodyResultContentData setRenderDatas(java.util.List<QueryHasApprovalMysubmitResponseBodyResultContentDataRenderDatas> renderDatas) {
            this.renderDatas = renderDatas;
            return this;
        }
        public java.util.List<QueryHasApprovalMysubmitResponseBodyResultContentDataRenderDatas> getRenderDatas() {
            return this.renderDatas;
        }

    }

    public static class QueryHasApprovalMysubmitResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static QueryHasApprovalMysubmitResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            QueryHasApprovalMysubmitResponseBodyResultContentTopErrorCode self = new QueryHasApprovalMysubmitResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public QueryHasApprovalMysubmitResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public QueryHasApprovalMysubmitResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public QueryHasApprovalMysubmitResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public QueryHasApprovalMysubmitResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public QueryHasApprovalMysubmitResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public QueryHasApprovalMysubmitResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public QueryHasApprovalMysubmitResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryHasApprovalMysubmitResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class QueryHasApprovalMysubmitResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static QueryHasApprovalMysubmitResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            QueryHasApprovalMysubmitResponseBodyResultContentTopErrorReason self = new QueryHasApprovalMysubmitResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public QueryHasApprovalMysubmitResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasApprovalMysubmitResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class QueryHasApprovalMysubmitResponseBodyResultContent extends TeaModel {
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
        public java.util.List<QueryHasApprovalMysubmitResponseBodyResultContentData> data;

        @NameInMap("TopErrorCode")
        public QueryHasApprovalMysubmitResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public QueryHasApprovalMysubmitResponseBodyResultContentTopErrorReason topErrorReason;

        public static QueryHasApprovalMysubmitResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            QueryHasApprovalMysubmitResponseBodyResultContent self = new QueryHasApprovalMysubmitResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public QueryHasApprovalMysubmitResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasApprovalMysubmitResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryHasApprovalMysubmitResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public QueryHasApprovalMysubmitResponseBodyResultContent setCurrentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Long getCurrentPage() {
            return this.currentPage;
        }

        public QueryHasApprovalMysubmitResponseBodyResultContent setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public QueryHasApprovalMysubmitResponseBodyResultContent setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public QueryHasApprovalMysubmitResponseBodyResultContent setData(java.util.List<QueryHasApprovalMysubmitResponseBodyResultContentData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryHasApprovalMysubmitResponseBodyResultContentData> getData() {
            return this.data;
        }

        public QueryHasApprovalMysubmitResponseBodyResultContent setTopErrorCode(QueryHasApprovalMysubmitResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public QueryHasApprovalMysubmitResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public QueryHasApprovalMysubmitResponseBodyResultContent setTopErrorReason(QueryHasApprovalMysubmitResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public QueryHasApprovalMysubmitResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
