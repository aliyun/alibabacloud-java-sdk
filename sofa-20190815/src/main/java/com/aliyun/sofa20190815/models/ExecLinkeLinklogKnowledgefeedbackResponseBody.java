// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeLinklogKnowledgefeedbackResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("ResponseContentRange")
    public String responseContentRange;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("ResponseContentType")
    public String responseContentType;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("Result")
    public ExecLinkeLinklogKnowledgefeedbackResponseBodyResult result;

    public static ExecLinkeLinklogKnowledgefeedbackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeLinklogKnowledgefeedbackResponseBody self = new ExecLinkeLinklogKnowledgefeedbackResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecLinkeLinklogKnowledgefeedbackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecLinkeLinklogKnowledgefeedbackResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public ExecLinkeLinklogKnowledgefeedbackResponseBody setResponseContentRange(String responseContentRange) {
        this.responseContentRange = responseContentRange;
        return this;
    }
    public String getResponseContentRange() {
        return this.responseContentRange;
    }

    public ExecLinkeLinklogKnowledgefeedbackResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public ExecLinkeLinklogKnowledgefeedbackResponseBody setResponseContentType(String responseContentType) {
        this.responseContentType = responseContentType;
        return this;
    }
    public String getResponseContentType() {
        return this.responseContentType;
    }

    public ExecLinkeLinklogKnowledgefeedbackResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ExecLinkeLinklogKnowledgefeedbackResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ExecLinkeLinklogKnowledgefeedbackResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ExecLinkeLinklogKnowledgefeedbackResponseBody setResult(ExecLinkeLinklogKnowledgefeedbackResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ExecLinkeLinklogKnowledgefeedbackResponseBodyResult getResult() {
        return this.result;
    }

    public static class ExecLinkeLinklogKnowledgefeedbackResponseBodyResult extends TeaModel {
        @NameInMap("CurrentPage")
        public Long currentPage;

        @NameInMap("EndMills")
        public Long endMills;

        @NameInMap("Result")
        public Long result;

        @NameInMap("KnowledgeId")
        public Long knowledgeId;

        @NameInMap("End")
        public Long end;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("BeginMills")
        public Long beginMills;

        @NameInMap("StoreId")
        public Long storeId;

        @NameInMap("IsOptions")
        public Long isOptions;

        @NameInMap("Sorter")
        public String sorter;

        @NameInMap("TagList")
        public java.util.List<Long> tagList;

        @NameInMap("Begin")
        public Long begin;

        @NameInMap("LogId")
        public Long logId;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Feedback")
        public String feedback;

        @NameInMap("Id")
        public Long id;

        public static ExecLinkeLinklogKnowledgefeedbackResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ExecLinkeLinklogKnowledgefeedbackResponseBodyResult self = new ExecLinkeLinklogKnowledgefeedbackResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ExecLinkeLinklogKnowledgefeedbackResponseBodyResult setCurrentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Long getCurrentPage() {
            return this.currentPage;
        }

        public ExecLinkeLinklogKnowledgefeedbackResponseBodyResult setEndMills(Long endMills) {
            this.endMills = endMills;
            return this;
        }
        public Long getEndMills() {
            return this.endMills;
        }

        public ExecLinkeLinklogKnowledgefeedbackResponseBodyResult setResult(Long result) {
            this.result = result;
            return this;
        }
        public Long getResult() {
            return this.result;
        }

        public ExecLinkeLinklogKnowledgefeedbackResponseBodyResult setKnowledgeId(Long knowledgeId) {
            this.knowledgeId = knowledgeId;
            return this;
        }
        public Long getKnowledgeId() {
            return this.knowledgeId;
        }

        public ExecLinkeLinklogKnowledgefeedbackResponseBodyResult setEnd(Long end) {
            this.end = end;
            return this;
        }
        public Long getEnd() {
            return this.end;
        }

        public ExecLinkeLinklogKnowledgefeedbackResponseBodyResult setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ExecLinkeLinklogKnowledgefeedbackResponseBodyResult setBeginMills(Long beginMills) {
            this.beginMills = beginMills;
            return this;
        }
        public Long getBeginMills() {
            return this.beginMills;
        }

        public ExecLinkeLinklogKnowledgefeedbackResponseBodyResult setStoreId(Long storeId) {
            this.storeId = storeId;
            return this;
        }
        public Long getStoreId() {
            return this.storeId;
        }

        public ExecLinkeLinklogKnowledgefeedbackResponseBodyResult setIsOptions(Long isOptions) {
            this.isOptions = isOptions;
            return this;
        }
        public Long getIsOptions() {
            return this.isOptions;
        }

        public ExecLinkeLinklogKnowledgefeedbackResponseBodyResult setSorter(String sorter) {
            this.sorter = sorter;
            return this;
        }
        public String getSorter() {
            return this.sorter;
        }

        public ExecLinkeLinklogKnowledgefeedbackResponseBodyResult setTagList(java.util.List<Long> tagList) {
            this.tagList = tagList;
            return this;
        }
        public java.util.List<Long> getTagList() {
            return this.tagList;
        }

        public ExecLinkeLinklogKnowledgefeedbackResponseBodyResult setBegin(Long begin) {
            this.begin = begin;
            return this;
        }
        public Long getBegin() {
            return this.begin;
        }

        public ExecLinkeLinklogKnowledgefeedbackResponseBodyResult setLogId(Long logId) {
            this.logId = logId;
            return this;
        }
        public Long getLogId() {
            return this.logId;
        }

        public ExecLinkeLinklogKnowledgefeedbackResponseBodyResult setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ExecLinkeLinklogKnowledgefeedbackResponseBodyResult setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ExecLinkeLinklogKnowledgefeedbackResponseBodyResult setFeedback(String feedback) {
            this.feedback = feedback;
            return this;
        }
        public String getFeedback() {
            return this.feedback;
        }

        public ExecLinkeLinklogKnowledgefeedbackResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
