// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeLinklogStoreResponseBody extends TeaModel {
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
    public DeleteLinkeLinklogStoreResponseBodyResult result;

    public static DeleteLinkeLinklogStoreResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeLinklogStoreResponseBody self = new DeleteLinkeLinklogStoreResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeLinklogStoreResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteLinkeLinklogStoreResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public DeleteLinkeLinklogStoreResponseBody setResponseContentRange(String responseContentRange) {
        this.responseContentRange = responseContentRange;
        return this;
    }
    public String getResponseContentRange() {
        return this.responseContentRange;
    }

    public DeleteLinkeLinklogStoreResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public DeleteLinkeLinklogStoreResponseBody setResponseContentType(String responseContentType) {
        this.responseContentType = responseContentType;
        return this;
    }
    public String getResponseContentType() {
        return this.responseContentType;
    }

    public DeleteLinkeLinklogStoreResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public DeleteLinkeLinklogStoreResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DeleteLinkeLinklogStoreResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DeleteLinkeLinklogStoreResponseBody setResult(DeleteLinkeLinklogStoreResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DeleteLinkeLinklogStoreResponseBodyResult getResult() {
        return this.result;
    }

    public static class DeleteLinkeLinklogStoreResponseBodyResult extends TeaModel {
        @NameInMap("CurrentPage")
        public Long currentPage;

        @NameInMap("EndMills")
        public Long endMills;

        @NameInMap("EnvPattern")
        public String envPattern;

        @NameInMap("End")
        public Long end;

        @NameInMap("StepPattern")
        public String stepPattern;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("BeginMills")
        public Long beginMills;

        @NameInMap("OwnerId")
        public String ownerId;

        @NameInMap("Sorter")
        public String sorter;

        @NameInMap("Begin")
        public Long begin;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public Long id;

        public static DeleteLinkeLinklogStoreResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DeleteLinkeLinklogStoreResponseBodyResult self = new DeleteLinkeLinklogStoreResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DeleteLinkeLinklogStoreResponseBodyResult setCurrentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Long getCurrentPage() {
            return this.currentPage;
        }

        public DeleteLinkeLinklogStoreResponseBodyResult setEndMills(Long endMills) {
            this.endMills = endMills;
            return this;
        }
        public Long getEndMills() {
            return this.endMills;
        }

        public DeleteLinkeLinklogStoreResponseBodyResult setEnvPattern(String envPattern) {
            this.envPattern = envPattern;
            return this;
        }
        public String getEnvPattern() {
            return this.envPattern;
        }

        public DeleteLinkeLinklogStoreResponseBodyResult setEnd(Long end) {
            this.end = end;
            return this;
        }
        public Long getEnd() {
            return this.end;
        }

        public DeleteLinkeLinklogStoreResponseBodyResult setStepPattern(String stepPattern) {
            this.stepPattern = stepPattern;
            return this;
        }
        public String getStepPattern() {
            return this.stepPattern;
        }

        public DeleteLinkeLinklogStoreResponseBodyResult setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public DeleteLinkeLinklogStoreResponseBodyResult setBeginMills(Long beginMills) {
            this.beginMills = beginMills;
            return this;
        }
        public Long getBeginMills() {
            return this.beginMills;
        }

        public DeleteLinkeLinklogStoreResponseBodyResult setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public DeleteLinkeLinklogStoreResponseBodyResult setSorter(String sorter) {
            this.sorter = sorter;
            return this;
        }
        public String getSorter() {
            return this.sorter;
        }

        public DeleteLinkeLinklogStoreResponseBodyResult setBegin(Long begin) {
            this.begin = begin;
            return this;
        }
        public Long getBegin() {
            return this.begin;
        }

        public DeleteLinkeLinklogStoreResponseBodyResult setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DeleteLinkeLinklogStoreResponseBodyResult setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public DeleteLinkeLinklogStoreResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DeleteLinkeLinklogStoreResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
