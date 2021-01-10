// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasApprovalMyfinishedResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public QueryHasApprovalMyfinishedResponseBodyResultContent resultContent;

    public static QueryHasApprovalMyfinishedResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryHasApprovalMyfinishedResponseBody self = new QueryHasApprovalMyfinishedResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryHasApprovalMyfinishedResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryHasApprovalMyfinishedResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryHasApprovalMyfinishedResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryHasApprovalMyfinishedResponseBody setResultContent(QueryHasApprovalMyfinishedResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public QueryHasApprovalMyfinishedResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class QueryHasApprovalMyfinishedResponseBodyResultContentDataApprovalDTORenderDatas extends TeaModel {
        @NameInMap("Label")
        public String label;

        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        @NameInMap("Visible")
        public Boolean visible;

        public static QueryHasApprovalMyfinishedResponseBodyResultContentDataApprovalDTORenderDatas build(java.util.Map<String, ?> map) throws Exception {
            QueryHasApprovalMyfinishedResponseBodyResultContentDataApprovalDTORenderDatas self = new QueryHasApprovalMyfinishedResponseBodyResultContentDataApprovalDTORenderDatas();
            return TeaModel.build(map, self);
        }

        public QueryHasApprovalMyfinishedResponseBodyResultContentDataApprovalDTORenderDatas setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryHasApprovalMyfinishedResponseBodyResultContentDataApprovalDTORenderDatas setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public QueryHasApprovalMyfinishedResponseBodyResultContentDataApprovalDTORenderDatas setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public QueryHasApprovalMyfinishedResponseBodyResultContentDataApprovalDTORenderDatas setVisible(Boolean visible) {
            this.visible = visible;
            return this;
        }
        public Boolean getVisible() {
            return this.visible;
        }

    }

    public static class QueryHasApprovalMyfinishedResponseBodyResultContentDataApprovalDTO extends TeaModel {
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
        public java.util.List<QueryHasApprovalMyfinishedResponseBodyResultContentDataApprovalDTORenderDatas> renderDatas;

        public static QueryHasApprovalMyfinishedResponseBodyResultContentDataApprovalDTO build(java.util.Map<String, ?> map) throws Exception {
            QueryHasApprovalMyfinishedResponseBodyResultContentDataApprovalDTO self = new QueryHasApprovalMyfinishedResponseBodyResultContentDataApprovalDTO();
            return TeaModel.build(map, self);
        }

        public QueryHasApprovalMyfinishedResponseBodyResultContentDataApprovalDTO setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryHasApprovalMyfinishedResponseBodyResultContentDataApprovalDTO setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public QueryHasApprovalMyfinishedResponseBodyResultContentDataApprovalDTO setOutBizId(String outBizId) {
            this.outBizId = outBizId;
            return this;
        }
        public String getOutBizId() {
            return this.outBizId;
        }

        public QueryHasApprovalMyfinishedResponseBodyResultContentDataApprovalDTO setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryHasApprovalMyfinishedResponseBodyResultContentDataApprovalDTO setRefSource(String refSource) {
            this.refSource = refSource;
            return this;
        }
        public String getRefSource() {
            return this.refSource;
        }

        public QueryHasApprovalMyfinishedResponseBodyResultContentDataApprovalDTO setContext(String context) {
            this.context = context;
            return this;
        }
        public String getContext() {
            return this.context;
        }

        public QueryHasApprovalMyfinishedResponseBodyResultContentDataApprovalDTO setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryHasApprovalMyfinishedResponseBodyResultContentDataApprovalDTO setSyncFromBPMS(Boolean syncFromBPMS) {
            this.syncFromBPMS = syncFromBPMS;
            return this;
        }
        public Boolean getSyncFromBPMS() {
            return this.syncFromBPMS;
        }

        public QueryHasApprovalMyfinishedResponseBodyResultContentDataApprovalDTO setExecuteStatus(String executeStatus) {
            this.executeStatus = executeStatus;
            return this;
        }
        public String getExecuteStatus() {
            return this.executeStatus;
        }

        public QueryHasApprovalMyfinishedResponseBodyResultContentDataApprovalDTO setFailedReason(String failedReason) {
            this.failedReason = failedReason;
            return this;
        }
        public String getFailedReason() {
            return this.failedReason;
        }

        public QueryHasApprovalMyfinishedResponseBodyResultContentDataApprovalDTO setSubmitterId(String submitterId) {
            this.submitterId = submitterId;
            return this;
        }
        public String getSubmitterId() {
            return this.submitterId;
        }

        public QueryHasApprovalMyfinishedResponseBodyResultContentDataApprovalDTO setSubmitterAccount(String submitterAccount) {
            this.submitterAccount = submitterAccount;
            return this;
        }
        public String getSubmitterAccount() {
            return this.submitterAccount;
        }

        public QueryHasApprovalMyfinishedResponseBodyResultContentDataApprovalDTO setSubmitterNickName(String submitterNickName) {
            this.submitterNickName = submitterNickName;
            return this;
        }
        public String getSubmitterNickName() {
            return this.submitterNickName;
        }

        public QueryHasApprovalMyfinishedResponseBodyResultContentDataApprovalDTO setSubmitterRealName(String submitterRealName) {
            this.submitterRealName = submitterRealName;
            return this;
        }
        public String getSubmitterRealName() {
            return this.submitterRealName;
        }

        public QueryHasApprovalMyfinishedResponseBodyResultContentDataApprovalDTO setStrategy(String strategy) {
            this.strategy = strategy;
            return this;
        }
        public String getStrategy() {
            return this.strategy;
        }

        public QueryHasApprovalMyfinishedResponseBodyResultContentDataApprovalDTO setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public QueryHasApprovalMyfinishedResponseBodyResultContentDataApprovalDTO setBrief(String brief) {
            this.brief = brief;
            return this;
        }
        public String getBrief() {
            return this.brief;
        }

        public QueryHasApprovalMyfinishedResponseBodyResultContentDataApprovalDTO setStatusUpdated(String statusUpdated) {
            this.statusUpdated = statusUpdated;
            return this;
        }
        public String getStatusUpdated() {
            return this.statusUpdated;
        }

        public QueryHasApprovalMyfinishedResponseBodyResultContentDataApprovalDTO setUpdaterId(String updaterId) {
            this.updaterId = updaterId;
            return this;
        }
        public String getUpdaterId() {
            return this.updaterId;
        }

        public QueryHasApprovalMyfinishedResponseBodyResultContentDataApprovalDTO setBpmsLink(String bpmsLink) {
            this.bpmsLink = bpmsLink;
            return this;
        }
        public String getBpmsLink() {
            return this.bpmsLink;
        }

        public QueryHasApprovalMyfinishedResponseBodyResultContentDataApprovalDTO setProcessTaskId(String processTaskId) {
            this.processTaskId = processTaskId;
            return this;
        }
        public String getProcessTaskId() {
            return this.processTaskId;
        }

        public QueryHasApprovalMyfinishedResponseBodyResultContentDataApprovalDTO setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public QueryHasApprovalMyfinishedResponseBodyResultContentDataApprovalDTO setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

        public QueryHasApprovalMyfinishedResponseBodyResultContentDataApprovalDTO setRenderDatas(java.util.List<QueryHasApprovalMyfinishedResponseBodyResultContentDataApprovalDTORenderDatas> renderDatas) {
            this.renderDatas = renderDatas;
            return this;
        }
        public java.util.List<QueryHasApprovalMyfinishedResponseBodyResultContentDataApprovalDTORenderDatas> getRenderDatas() {
            return this.renderDatas;
        }

    }

    public static class QueryHasApprovalMyfinishedResponseBodyResultContentData extends TeaModel {
        @NameInMap("ApprovalProcessTaskId")
        public String approvalProcessTaskId;

        @NameInMap("ApprovalLoginName")
        public String approvalLoginName;

        @NameInMap("Memo")
        public String memo;

        @NameInMap("Action")
        public String action;

        @NameInMap("Id")
        public String id;

        @NameInMap("UtcCreate")
        public String utcCreate;

        @NameInMap("UtcModified")
        public String utcModified;

        @NameInMap("ApprovalDTO")
        public QueryHasApprovalMyfinishedResponseBodyResultContentDataApprovalDTO approvalDTO;

        public static QueryHasApprovalMyfinishedResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            QueryHasApprovalMyfinishedResponseBodyResultContentData self = new QueryHasApprovalMyfinishedResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public QueryHasApprovalMyfinishedResponseBodyResultContentData setApprovalProcessTaskId(String approvalProcessTaskId) {
            this.approvalProcessTaskId = approvalProcessTaskId;
            return this;
        }
        public String getApprovalProcessTaskId() {
            return this.approvalProcessTaskId;
        }

        public QueryHasApprovalMyfinishedResponseBodyResultContentData setApprovalLoginName(String approvalLoginName) {
            this.approvalLoginName = approvalLoginName;
            return this;
        }
        public String getApprovalLoginName() {
            return this.approvalLoginName;
        }

        public QueryHasApprovalMyfinishedResponseBodyResultContentData setMemo(String memo) {
            this.memo = memo;
            return this;
        }
        public String getMemo() {
            return this.memo;
        }

        public QueryHasApprovalMyfinishedResponseBodyResultContentData setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public QueryHasApprovalMyfinishedResponseBodyResultContentData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryHasApprovalMyfinishedResponseBodyResultContentData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public QueryHasApprovalMyfinishedResponseBodyResultContentData setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

        public QueryHasApprovalMyfinishedResponseBodyResultContentData setApprovalDTO(QueryHasApprovalMyfinishedResponseBodyResultContentDataApprovalDTO approvalDTO) {
            this.approvalDTO = approvalDTO;
            return this;
        }
        public QueryHasApprovalMyfinishedResponseBodyResultContentDataApprovalDTO getApprovalDTO() {
            return this.approvalDTO;
        }

    }

    public static class QueryHasApprovalMyfinishedResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static QueryHasApprovalMyfinishedResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            QueryHasApprovalMyfinishedResponseBodyResultContentTopErrorCode self = new QueryHasApprovalMyfinishedResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public QueryHasApprovalMyfinishedResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public QueryHasApprovalMyfinishedResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public QueryHasApprovalMyfinishedResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public QueryHasApprovalMyfinishedResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public QueryHasApprovalMyfinishedResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public QueryHasApprovalMyfinishedResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public QueryHasApprovalMyfinishedResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryHasApprovalMyfinishedResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class QueryHasApprovalMyfinishedResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static QueryHasApprovalMyfinishedResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            QueryHasApprovalMyfinishedResponseBodyResultContentTopErrorReason self = new QueryHasApprovalMyfinishedResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public QueryHasApprovalMyfinishedResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasApprovalMyfinishedResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class QueryHasApprovalMyfinishedResponseBodyResultContent extends TeaModel {
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
        public java.util.List<QueryHasApprovalMyfinishedResponseBodyResultContentData> data;

        @NameInMap("TopErrorCode")
        public QueryHasApprovalMyfinishedResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public QueryHasApprovalMyfinishedResponseBodyResultContentTopErrorReason topErrorReason;

        public static QueryHasApprovalMyfinishedResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            QueryHasApprovalMyfinishedResponseBodyResultContent self = new QueryHasApprovalMyfinishedResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public QueryHasApprovalMyfinishedResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasApprovalMyfinishedResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryHasApprovalMyfinishedResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public QueryHasApprovalMyfinishedResponseBodyResultContent setCurrentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Long getCurrentPage() {
            return this.currentPage;
        }

        public QueryHasApprovalMyfinishedResponseBodyResultContent setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public QueryHasApprovalMyfinishedResponseBodyResultContent setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public QueryHasApprovalMyfinishedResponseBodyResultContent setData(java.util.List<QueryHasApprovalMyfinishedResponseBodyResultContentData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryHasApprovalMyfinishedResponseBodyResultContentData> getData() {
            return this.data;
        }

        public QueryHasApprovalMyfinishedResponseBodyResultContent setTopErrorCode(QueryHasApprovalMyfinishedResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public QueryHasApprovalMyfinishedResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public QueryHasApprovalMyfinishedResponseBodyResultContent setTopErrorReason(QueryHasApprovalMyfinishedResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public QueryHasApprovalMyfinishedResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
