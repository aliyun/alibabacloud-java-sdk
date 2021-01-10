// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasApprovalMypendingResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public QueryHasApprovalMypendingResponseBodyResultContent resultContent;

    public static QueryHasApprovalMypendingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryHasApprovalMypendingResponseBody self = new QueryHasApprovalMypendingResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryHasApprovalMypendingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryHasApprovalMypendingResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryHasApprovalMypendingResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryHasApprovalMypendingResponseBody setResultContent(QueryHasApprovalMypendingResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public QueryHasApprovalMypendingResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class QueryHasApprovalMypendingResponseBodyResultContentDataApprovalDTORenderDatas extends TeaModel {
        @NameInMap("Label")
        public String label;

        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        @NameInMap("Visible")
        public Boolean visible;

        public static QueryHasApprovalMypendingResponseBodyResultContentDataApprovalDTORenderDatas build(java.util.Map<String, ?> map) throws Exception {
            QueryHasApprovalMypendingResponseBodyResultContentDataApprovalDTORenderDatas self = new QueryHasApprovalMypendingResponseBodyResultContentDataApprovalDTORenderDatas();
            return TeaModel.build(map, self);
        }

        public QueryHasApprovalMypendingResponseBodyResultContentDataApprovalDTORenderDatas setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryHasApprovalMypendingResponseBodyResultContentDataApprovalDTORenderDatas setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public QueryHasApprovalMypendingResponseBodyResultContentDataApprovalDTORenderDatas setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public QueryHasApprovalMypendingResponseBodyResultContentDataApprovalDTORenderDatas setVisible(Boolean visible) {
            this.visible = visible;
            return this;
        }
        public Boolean getVisible() {
            return this.visible;
        }

    }

    public static class QueryHasApprovalMypendingResponseBodyResultContentDataApprovalDTO extends TeaModel {
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
        public java.util.List<QueryHasApprovalMypendingResponseBodyResultContentDataApprovalDTORenderDatas> renderDatas;

        public static QueryHasApprovalMypendingResponseBodyResultContentDataApprovalDTO build(java.util.Map<String, ?> map) throws Exception {
            QueryHasApprovalMypendingResponseBodyResultContentDataApprovalDTO self = new QueryHasApprovalMypendingResponseBodyResultContentDataApprovalDTO();
            return TeaModel.build(map, self);
        }

        public QueryHasApprovalMypendingResponseBodyResultContentDataApprovalDTO setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryHasApprovalMypendingResponseBodyResultContentDataApprovalDTO setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public QueryHasApprovalMypendingResponseBodyResultContentDataApprovalDTO setOutBizId(String outBizId) {
            this.outBizId = outBizId;
            return this;
        }
        public String getOutBizId() {
            return this.outBizId;
        }

        public QueryHasApprovalMypendingResponseBodyResultContentDataApprovalDTO setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryHasApprovalMypendingResponseBodyResultContentDataApprovalDTO setRefSource(String refSource) {
            this.refSource = refSource;
            return this;
        }
        public String getRefSource() {
            return this.refSource;
        }

        public QueryHasApprovalMypendingResponseBodyResultContentDataApprovalDTO setContext(String context) {
            this.context = context;
            return this;
        }
        public String getContext() {
            return this.context;
        }

        public QueryHasApprovalMypendingResponseBodyResultContentDataApprovalDTO setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryHasApprovalMypendingResponseBodyResultContentDataApprovalDTO setSyncFromBPMS(Boolean syncFromBPMS) {
            this.syncFromBPMS = syncFromBPMS;
            return this;
        }
        public Boolean getSyncFromBPMS() {
            return this.syncFromBPMS;
        }

        public QueryHasApprovalMypendingResponseBodyResultContentDataApprovalDTO setExecuteStatus(String executeStatus) {
            this.executeStatus = executeStatus;
            return this;
        }
        public String getExecuteStatus() {
            return this.executeStatus;
        }

        public QueryHasApprovalMypendingResponseBodyResultContentDataApprovalDTO setFailedReason(String failedReason) {
            this.failedReason = failedReason;
            return this;
        }
        public String getFailedReason() {
            return this.failedReason;
        }

        public QueryHasApprovalMypendingResponseBodyResultContentDataApprovalDTO setSubmitterId(String submitterId) {
            this.submitterId = submitterId;
            return this;
        }
        public String getSubmitterId() {
            return this.submitterId;
        }

        public QueryHasApprovalMypendingResponseBodyResultContentDataApprovalDTO setSubmitterAccount(String submitterAccount) {
            this.submitterAccount = submitterAccount;
            return this;
        }
        public String getSubmitterAccount() {
            return this.submitterAccount;
        }

        public QueryHasApprovalMypendingResponseBodyResultContentDataApprovalDTO setSubmitterNickName(String submitterNickName) {
            this.submitterNickName = submitterNickName;
            return this;
        }
        public String getSubmitterNickName() {
            return this.submitterNickName;
        }

        public QueryHasApprovalMypendingResponseBodyResultContentDataApprovalDTO setSubmitterRealName(String submitterRealName) {
            this.submitterRealName = submitterRealName;
            return this;
        }
        public String getSubmitterRealName() {
            return this.submitterRealName;
        }

        public QueryHasApprovalMypendingResponseBodyResultContentDataApprovalDTO setStrategy(String strategy) {
            this.strategy = strategy;
            return this;
        }
        public String getStrategy() {
            return this.strategy;
        }

        public QueryHasApprovalMypendingResponseBodyResultContentDataApprovalDTO setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public QueryHasApprovalMypendingResponseBodyResultContentDataApprovalDTO setBrief(String brief) {
            this.brief = brief;
            return this;
        }
        public String getBrief() {
            return this.brief;
        }

        public QueryHasApprovalMypendingResponseBodyResultContentDataApprovalDTO setStatusUpdated(String statusUpdated) {
            this.statusUpdated = statusUpdated;
            return this;
        }
        public String getStatusUpdated() {
            return this.statusUpdated;
        }

        public QueryHasApprovalMypendingResponseBodyResultContentDataApprovalDTO setUpdaterId(String updaterId) {
            this.updaterId = updaterId;
            return this;
        }
        public String getUpdaterId() {
            return this.updaterId;
        }

        public QueryHasApprovalMypendingResponseBodyResultContentDataApprovalDTO setBpmsLink(String bpmsLink) {
            this.bpmsLink = bpmsLink;
            return this;
        }
        public String getBpmsLink() {
            return this.bpmsLink;
        }

        public QueryHasApprovalMypendingResponseBodyResultContentDataApprovalDTO setProcessTaskId(String processTaskId) {
            this.processTaskId = processTaskId;
            return this;
        }
        public String getProcessTaskId() {
            return this.processTaskId;
        }

        public QueryHasApprovalMypendingResponseBodyResultContentDataApprovalDTO setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public QueryHasApprovalMypendingResponseBodyResultContentDataApprovalDTO setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

        public QueryHasApprovalMypendingResponseBodyResultContentDataApprovalDTO setRenderDatas(java.util.List<QueryHasApprovalMypendingResponseBodyResultContentDataApprovalDTORenderDatas> renderDatas) {
            this.renderDatas = renderDatas;
            return this;
        }
        public java.util.List<QueryHasApprovalMypendingResponseBodyResultContentDataApprovalDTORenderDatas> getRenderDatas() {
            return this.renderDatas;
        }

    }

    public static class QueryHasApprovalMypendingResponseBodyResultContentData extends TeaModel {
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
        public QueryHasApprovalMypendingResponseBodyResultContentDataApprovalDTO approvalDTO;

        public static QueryHasApprovalMypendingResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            QueryHasApprovalMypendingResponseBodyResultContentData self = new QueryHasApprovalMypendingResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public QueryHasApprovalMypendingResponseBodyResultContentData setApprovalProcessTaskId(String approvalProcessTaskId) {
            this.approvalProcessTaskId = approvalProcessTaskId;
            return this;
        }
        public String getApprovalProcessTaskId() {
            return this.approvalProcessTaskId;
        }

        public QueryHasApprovalMypendingResponseBodyResultContentData setApprovalLoginName(String approvalLoginName) {
            this.approvalLoginName = approvalLoginName;
            return this;
        }
        public String getApprovalLoginName() {
            return this.approvalLoginName;
        }

        public QueryHasApprovalMypendingResponseBodyResultContentData setMemo(String memo) {
            this.memo = memo;
            return this;
        }
        public String getMemo() {
            return this.memo;
        }

        public QueryHasApprovalMypendingResponseBodyResultContentData setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public QueryHasApprovalMypendingResponseBodyResultContentData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryHasApprovalMypendingResponseBodyResultContentData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public QueryHasApprovalMypendingResponseBodyResultContentData setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

        public QueryHasApprovalMypendingResponseBodyResultContentData setApprovalDTO(QueryHasApprovalMypendingResponseBodyResultContentDataApprovalDTO approvalDTO) {
            this.approvalDTO = approvalDTO;
            return this;
        }
        public QueryHasApprovalMypendingResponseBodyResultContentDataApprovalDTO getApprovalDTO() {
            return this.approvalDTO;
        }

    }

    public static class QueryHasApprovalMypendingResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static QueryHasApprovalMypendingResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            QueryHasApprovalMypendingResponseBodyResultContentTopErrorCode self = new QueryHasApprovalMypendingResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public QueryHasApprovalMypendingResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public QueryHasApprovalMypendingResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public QueryHasApprovalMypendingResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public QueryHasApprovalMypendingResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public QueryHasApprovalMypendingResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public QueryHasApprovalMypendingResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public QueryHasApprovalMypendingResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryHasApprovalMypendingResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class QueryHasApprovalMypendingResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static QueryHasApprovalMypendingResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            QueryHasApprovalMypendingResponseBodyResultContentTopErrorReason self = new QueryHasApprovalMypendingResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public QueryHasApprovalMypendingResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasApprovalMypendingResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class QueryHasApprovalMypendingResponseBodyResultContent extends TeaModel {
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
        public java.util.List<QueryHasApprovalMypendingResponseBodyResultContentData> data;

        @NameInMap("TopErrorCode")
        public QueryHasApprovalMypendingResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public QueryHasApprovalMypendingResponseBodyResultContentTopErrorReason topErrorReason;

        public static QueryHasApprovalMypendingResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            QueryHasApprovalMypendingResponseBodyResultContent self = new QueryHasApprovalMypendingResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public QueryHasApprovalMypendingResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasApprovalMypendingResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryHasApprovalMypendingResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public QueryHasApprovalMypendingResponseBodyResultContent setCurrentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Long getCurrentPage() {
            return this.currentPage;
        }

        public QueryHasApprovalMypendingResponseBodyResultContent setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public QueryHasApprovalMypendingResponseBodyResultContent setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public QueryHasApprovalMypendingResponseBodyResultContent setData(java.util.List<QueryHasApprovalMypendingResponseBodyResultContentData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryHasApprovalMypendingResponseBodyResultContentData> getData() {
            return this.data;
        }

        public QueryHasApprovalMypendingResponseBodyResultContent setTopErrorCode(QueryHasApprovalMypendingResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public QueryHasApprovalMypendingResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public QueryHasApprovalMypendingResponseBodyResultContent setTopErrorReason(QueryHasApprovalMypendingResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public QueryHasApprovalMypendingResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
