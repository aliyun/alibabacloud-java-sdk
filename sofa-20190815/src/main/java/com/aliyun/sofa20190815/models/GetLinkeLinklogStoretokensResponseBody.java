// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeLinklogStoretokensResponseBody extends TeaModel {
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
    public GetLinkeLinklogStoretokensResponseBodyResult result;

    public static GetLinkeLinklogStoretokensResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeLinklogStoretokensResponseBody self = new GetLinkeLinklogStoretokensResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkeLinklogStoretokensResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkeLinklogStoretokensResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkeLinklogStoretokensResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkeLinklogStoretokensResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public GetLinkeLinklogStoretokensResponseBody setResponseContentRange(String responseContentRange) {
        this.responseContentRange = responseContentRange;
        return this;
    }
    public String getResponseContentRange() {
        return this.responseContentRange;
    }

    public GetLinkeLinklogStoretokensResponseBody setResponseContentType(String responseContentType) {
        this.responseContentType = responseContentType;
        return this;
    }
    public String getResponseContentType() {
        return this.responseContentType;
    }

    public GetLinkeLinklogStoretokensResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkeLinklogStoretokensResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkeLinklogStoretokensResponseBody setResult(GetLinkeLinklogStoretokensResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetLinkeLinklogStoretokensResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetLinkeLinklogStoretokensResponseBodyResult extends TeaModel {
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

        public static GetLinkeLinklogStoretokensResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeLinklogStoretokensResponseBodyResult self = new GetLinkeLinklogStoretokensResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetLinkeLinklogStoretokensResponseBodyResult setBegin(Long begin) {
            this.begin = begin;
            return this;
        }
        public Long getBegin() {
            return this.begin;
        }

        public GetLinkeLinklogStoretokensResponseBodyResult setBeginMills(Long beginMills) {
            this.beginMills = beginMills;
            return this;
        }
        public Long getBeginMills() {
            return this.beginMills;
        }

        public GetLinkeLinklogStoretokensResponseBodyResult setCurrentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Long getCurrentPage() {
            return this.currentPage;
        }

        public GetLinkeLinklogStoretokensResponseBodyResult setEnd(Long end) {
            this.end = end;
            return this;
        }
        public Long getEnd() {
            return this.end;
        }

        public GetLinkeLinklogStoretokensResponseBodyResult setEndMills(Long endMills) {
            this.endMills = endMills;
            return this;
        }
        public Long getEndMills() {
            return this.endMills;
        }

        public GetLinkeLinklogStoretokensResponseBodyResult setEnvPattern(String envPattern) {
            this.envPattern = envPattern;
            return this;
        }
        public String getEnvPattern() {
            return this.envPattern;
        }

        public GetLinkeLinklogStoretokensResponseBodyResult setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public GetLinkeLinklogStoretokensResponseBodyResult setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public GetLinkeLinklogStoretokensResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetLinkeLinklogStoretokensResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetLinkeLinklogStoretokensResponseBodyResult setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public GetLinkeLinklogStoretokensResponseBodyResult setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public GetLinkeLinklogStoretokensResponseBodyResult setSorter(String sorter) {
            this.sorter = sorter;
            return this;
        }
        public String getSorter() {
            return this.sorter;
        }

        public GetLinkeLinklogStoretokensResponseBodyResult setStepPattern(String stepPattern) {
            this.stepPattern = stepPattern;
            return this;
        }
        public String getStepPattern() {
            return this.stepPattern;
        }

    }

}
