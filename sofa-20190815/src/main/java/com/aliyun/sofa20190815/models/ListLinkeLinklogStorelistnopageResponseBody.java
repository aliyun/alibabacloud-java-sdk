// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLinkeLinklogStorelistnopageResponseBody extends TeaModel {
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
    public java.util.List<ListLinkeLinklogStorelistnopageResponseBodyResult> result;

    public static ListLinkeLinklogStorelistnopageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLinkeLinklogStorelistnopageResponseBody self = new ListLinkeLinklogStorelistnopageResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLinkeLinklogStorelistnopageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLinkeLinklogStorelistnopageResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListLinkeLinklogStorelistnopageResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListLinkeLinklogStorelistnopageResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public ListLinkeLinklogStorelistnopageResponseBody setResponseContentRange(String responseContentRange) {
        this.responseContentRange = responseContentRange;
        return this;
    }
    public String getResponseContentRange() {
        return this.responseContentRange;
    }

    public ListLinkeLinklogStorelistnopageResponseBody setResponseContentType(String responseContentType) {
        this.responseContentType = responseContentType;
        return this;
    }
    public String getResponseContentType() {
        return this.responseContentType;
    }

    public ListLinkeLinklogStorelistnopageResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public ListLinkeLinklogStorelistnopageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListLinkeLinklogStorelistnopageResponseBody setResult(java.util.List<ListLinkeLinklogStorelistnopageResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListLinkeLinklogStorelistnopageResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListLinkeLinklogStorelistnopageResponseBodyResult extends TeaModel {
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

        @NameInMap("EnvPattern")
        public String envPattern;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("OwnerId")
        public String ownerId;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Sorter")
        public String sorter;

        @NameInMap("StepPattern")
        public String stepPattern;

        public static ListLinkeLinklogStorelistnopageResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListLinkeLinklogStorelistnopageResponseBodyResult self = new ListLinkeLinklogStorelistnopageResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListLinkeLinklogStorelistnopageResponseBodyResult setBegin(Long begin) {
            this.begin = begin;
            return this;
        }
        public Long getBegin() {
            return this.begin;
        }

        public ListLinkeLinklogStorelistnopageResponseBodyResult setBeginMills(Long beginMills) {
            this.beginMills = beginMills;
            return this;
        }
        public Long getBeginMills() {
            return this.beginMills;
        }

        public ListLinkeLinklogStorelistnopageResponseBodyResult setCurrentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Long getCurrentPage() {
            return this.currentPage;
        }

        public ListLinkeLinklogStorelistnopageResponseBodyResult setEnd(Long end) {
            this.end = end;
            return this;
        }
        public Long getEnd() {
            return this.end;
        }

        public ListLinkeLinklogStorelistnopageResponseBodyResult setEndMills(Long endMills) {
            this.endMills = endMills;
            return this;
        }
        public Long getEndMills() {
            return this.endMills;
        }

        public ListLinkeLinklogStorelistnopageResponseBodyResult setEnvPattern(String envPattern) {
            this.envPattern = envPattern;
            return this;
        }
        public String getEnvPattern() {
            return this.envPattern;
        }

        public ListLinkeLinklogStorelistnopageResponseBodyResult setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListLinkeLinklogStorelistnopageResponseBodyResult setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ListLinkeLinklogStorelistnopageResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListLinkeLinklogStorelistnopageResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListLinkeLinklogStorelistnopageResponseBodyResult setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public ListLinkeLinklogStorelistnopageResponseBodyResult setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListLinkeLinklogStorelistnopageResponseBodyResult setSorter(String sorter) {
            this.sorter = sorter;
            return this;
        }
        public String getSorter() {
            return this.sorter;
        }

        public ListLinkeLinklogStorelistnopageResponseBodyResult setStepPattern(String stepPattern) {
            this.stepPattern = stepPattern;
            return this;
        }
        public String getStepPattern() {
            return this.stepPattern;
        }

    }

}
