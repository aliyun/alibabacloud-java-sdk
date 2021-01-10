// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeLinklogKnowledgeprioritylistResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("ResponseContentRange")
    public String responseContentRange;

    @NameInMap("ResponseContentType")
    public String responseContentType;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public java.util.List<GetLinkeLinklogKnowledgeprioritylistResponseBodyResult> result;

    public static GetLinkeLinklogKnowledgeprioritylistResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeLinklogKnowledgeprioritylistResponseBody self = new GetLinkeLinklogKnowledgeprioritylistResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkeLinklogKnowledgeprioritylistResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkeLinklogKnowledgeprioritylistResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkeLinklogKnowledgeprioritylistResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkeLinklogKnowledgeprioritylistResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public GetLinkeLinklogKnowledgeprioritylistResponseBody setResponseContentRange(String responseContentRange) {
        this.responseContentRange = responseContentRange;
        return this;
    }
    public String getResponseContentRange() {
        return this.responseContentRange;
    }

    public GetLinkeLinklogKnowledgeprioritylistResponseBody setResponseContentType(String responseContentType) {
        this.responseContentType = responseContentType;
        return this;
    }
    public String getResponseContentType() {
        return this.responseContentType;
    }

    public GetLinkeLinklogKnowledgeprioritylistResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkeLinklogKnowledgeprioritylistResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkeLinklogKnowledgeprioritylistResponseBody setResult(java.util.List<GetLinkeLinklogKnowledgeprioritylistResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<GetLinkeLinklogKnowledgeprioritylistResponseBodyResult> getResult() {
        return this.result;
    }

    public static class GetLinkeLinklogKnowledgeprioritylistResponseBodyResult extends TeaModel {
        @NameInMap("Begin")
        public Long begin;

        @NameInMap("BeginMills")
        public Long beginMills;

        @NameInMap("CurrentPage")
        public Long currentPage;

        @NameInMap("End")
        public Long end;

        @NameInMap("EndMills")
        public Long endMills;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("Sorter")
        public String sorter;

        @NameInMap("StoreId")
        public Long storeId;

        @NameInMap("Type")
        public String type;

        @NameInMap("Val")
        public Long val;

        public static GetLinkeLinklogKnowledgeprioritylistResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeLinklogKnowledgeprioritylistResponseBodyResult self = new GetLinkeLinklogKnowledgeprioritylistResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetLinkeLinklogKnowledgeprioritylistResponseBodyResult setBegin(Long begin) {
            this.begin = begin;
            return this;
        }
        public Long getBegin() {
            return this.begin;
        }

        public GetLinkeLinklogKnowledgeprioritylistResponseBodyResult setBeginMills(Long beginMills) {
            this.beginMills = beginMills;
            return this;
        }
        public Long getBeginMills() {
            return this.beginMills;
        }

        public GetLinkeLinklogKnowledgeprioritylistResponseBodyResult setCurrentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Long getCurrentPage() {
            return this.currentPage;
        }

        public GetLinkeLinklogKnowledgeprioritylistResponseBodyResult setEnd(Long end) {
            this.end = end;
            return this;
        }
        public Long getEnd() {
            return this.end;
        }

        public GetLinkeLinklogKnowledgeprioritylistResponseBodyResult setEndMills(Long endMills) {
            this.endMills = endMills;
            return this;
        }
        public Long getEndMills() {
            return this.endMills;
        }

        public GetLinkeLinklogKnowledgeprioritylistResponseBodyResult setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public GetLinkeLinklogKnowledgeprioritylistResponseBodyResult setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public GetLinkeLinklogKnowledgeprioritylistResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetLinkeLinklogKnowledgeprioritylistResponseBodyResult setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public GetLinkeLinklogKnowledgeprioritylistResponseBodyResult setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public GetLinkeLinklogKnowledgeprioritylistResponseBodyResult setSorter(String sorter) {
            this.sorter = sorter;
            return this;
        }
        public String getSorter() {
            return this.sorter;
        }

        public GetLinkeLinklogKnowledgeprioritylistResponseBodyResult setStoreId(Long storeId) {
            this.storeId = storeId;
            return this;
        }
        public Long getStoreId() {
            return this.storeId;
        }

        public GetLinkeLinklogKnowledgeprioritylistResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetLinkeLinklogKnowledgeprioritylistResponseBodyResult setVal(Long val) {
            this.val = val;
            return this;
        }
        public Long getVal() {
            return this.val;
        }

    }

}
