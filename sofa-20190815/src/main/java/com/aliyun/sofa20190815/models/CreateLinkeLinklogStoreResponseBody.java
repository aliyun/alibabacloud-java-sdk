// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeLinklogStoreResponseBody extends TeaModel {
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
    public CreateLinkeLinklogStoreResponseBodyResult result;

    public static CreateLinkeLinklogStoreResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeLinklogStoreResponseBody self = new CreateLinkeLinklogStoreResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLinkeLinklogStoreResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateLinkeLinklogStoreResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public CreateLinkeLinklogStoreResponseBody setResponseContentRange(String responseContentRange) {
        this.responseContentRange = responseContentRange;
        return this;
    }
    public String getResponseContentRange() {
        return this.responseContentRange;
    }

    public CreateLinkeLinklogStoreResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public CreateLinkeLinklogStoreResponseBody setResponseContentType(String responseContentType) {
        this.responseContentType = responseContentType;
        return this;
    }
    public String getResponseContentType() {
        return this.responseContentType;
    }

    public CreateLinkeLinklogStoreResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CreateLinkeLinklogStoreResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateLinkeLinklogStoreResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateLinkeLinklogStoreResponseBody setResult(CreateLinkeLinklogStoreResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateLinkeLinklogStoreResponseBodyResult getResult() {
        return this.result;
    }

    public static class CreateLinkeLinklogStoreResponseBodyResult extends TeaModel {
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

        public static CreateLinkeLinklogStoreResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateLinkeLinklogStoreResponseBodyResult self = new CreateLinkeLinklogStoreResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateLinkeLinklogStoreResponseBodyResult setCurrentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Long getCurrentPage() {
            return this.currentPage;
        }

        public CreateLinkeLinklogStoreResponseBodyResult setEndMills(Long endMills) {
            this.endMills = endMills;
            return this;
        }
        public Long getEndMills() {
            return this.endMills;
        }

        public CreateLinkeLinklogStoreResponseBodyResult setEnvPattern(String envPattern) {
            this.envPattern = envPattern;
            return this;
        }
        public String getEnvPattern() {
            return this.envPattern;
        }

        public CreateLinkeLinklogStoreResponseBodyResult setEnd(Long end) {
            this.end = end;
            return this;
        }
        public Long getEnd() {
            return this.end;
        }

        public CreateLinkeLinklogStoreResponseBodyResult setStepPattern(String stepPattern) {
            this.stepPattern = stepPattern;
            return this;
        }
        public String getStepPattern() {
            return this.stepPattern;
        }

        public CreateLinkeLinklogStoreResponseBodyResult setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public CreateLinkeLinklogStoreResponseBodyResult setBeginMills(Long beginMills) {
            this.beginMills = beginMills;
            return this;
        }
        public Long getBeginMills() {
            return this.beginMills;
        }

        public CreateLinkeLinklogStoreResponseBodyResult setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public CreateLinkeLinklogStoreResponseBodyResult setSorter(String sorter) {
            this.sorter = sorter;
            return this;
        }
        public String getSorter() {
            return this.sorter;
        }

        public CreateLinkeLinklogStoreResponseBodyResult setBegin(Long begin) {
            this.begin = begin;
            return this;
        }
        public Long getBegin() {
            return this.begin;
        }

        public CreateLinkeLinklogStoreResponseBodyResult setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public CreateLinkeLinklogStoreResponseBodyResult setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public CreateLinkeLinklogStoreResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateLinkeLinklogStoreResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
