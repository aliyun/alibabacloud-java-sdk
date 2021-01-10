// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutVcsprojectissueResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("ErrorMsgParamsMap")
    public String errorMsgParamsMap;

    @NameInMap("Message")
    public String message;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public java.util.List<GetLinkeBahamutVcsprojectissueResponseBodyResult> result;

    public static GetLinkeBahamutVcsprojectissueResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutVcsprojectissueResponseBody self = new GetLinkeBahamutVcsprojectissueResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutVcsprojectissueResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkeBahamutVcsprojectissueResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkeBahamutVcsprojectissueResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkeBahamutVcsprojectissueResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetLinkeBahamutVcsprojectissueResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public GetLinkeBahamutVcsprojectissueResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLinkeBahamutVcsprojectissueResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkeBahamutVcsprojectissueResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkeBahamutVcsprojectissueResponseBody setResult(java.util.List<GetLinkeBahamutVcsprojectissueResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<GetLinkeBahamutVcsprojectissueResponseBodyResult> getResult() {
        return this.result;
    }

    public static class GetLinkeBahamutVcsprojectissueResponseBodyResult extends TeaModel {
        @NameInMap("Assignee")
        public String assignee;

        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("Description")
        public String description;

        @NameInMap("Id")
        public String id;

        @NameInMap("Iid")
        public String iid;

        @NameInMap("State")
        public String state;

        @NameInMap("Title")
        public String title;

        @NameInMap("UpdatedAt")
        public String updatedAt;

        public static GetLinkeBahamutVcsprojectissueResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeBahamutVcsprojectissueResponseBodyResult self = new GetLinkeBahamutVcsprojectissueResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetLinkeBahamutVcsprojectissueResponseBodyResult setAssignee(String assignee) {
            this.assignee = assignee;
            return this;
        }
        public String getAssignee() {
            return this.assignee;
        }

        public GetLinkeBahamutVcsprojectissueResponseBodyResult setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public GetLinkeBahamutVcsprojectissueResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetLinkeBahamutVcsprojectissueResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetLinkeBahamutVcsprojectissueResponseBodyResult setIid(String iid) {
            this.iid = iid;
            return this;
        }
        public String getIid() {
            return this.iid;
        }

        public GetLinkeBahamutVcsprojectissueResponseBodyResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public GetLinkeBahamutVcsprojectissueResponseBodyResult setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public GetLinkeBahamutVcsprojectissueResponseBodyResult setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

    }

}
