// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutStagequalityResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Message")
    public String message;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public GetLinkeBahamutStagequalityResponseBodyResult result;

    public static GetLinkeBahamutStagequalityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutStagequalityResponseBody self = new GetLinkeBahamutStagequalityResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutStagequalityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkeBahamutStagequalityResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkeBahamutStagequalityResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkeBahamutStagequalityResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetLinkeBahamutStagequalityResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLinkeBahamutStagequalityResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkeBahamutStagequalityResponseBody setResult(GetLinkeBahamutStagequalityResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetLinkeBahamutStagequalityResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetLinkeBahamutStagequalityResponseBodyResultItems extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Link")
        public String link;

        @NameInMap("MeetTheRule")
        public Boolean meetTheRule;

        @NameInMap("Message")
        public String message;

        @NameInMap("Rule")
        public String rule;

        @NameInMap("Value")
        public String value;

        public static GetLinkeBahamutStagequalityResponseBodyResultItems build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeBahamutStagequalityResponseBodyResultItems self = new GetLinkeBahamutStagequalityResponseBodyResultItems();
            return TeaModel.build(map, self);
        }

        public GetLinkeBahamutStagequalityResponseBodyResultItems setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetLinkeBahamutStagequalityResponseBodyResultItems setLink(String link) {
            this.link = link;
            return this;
        }
        public String getLink() {
            return this.link;
        }

        public GetLinkeBahamutStagequalityResponseBodyResultItems setMeetTheRule(Boolean meetTheRule) {
            this.meetTheRule = meetTheRule;
            return this;
        }
        public Boolean getMeetTheRule() {
            return this.meetTheRule;
        }

        public GetLinkeBahamutStagequalityResponseBodyResultItems setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetLinkeBahamutStagequalityResponseBodyResultItems setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
        }

        public GetLinkeBahamutStagequalityResponseBodyResultItems setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetLinkeBahamutStagequalityResponseBodyResult extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("Branch")
        public String branch;

        @NameInMap("CodeName")
        public String codeName;

        @NameInMap("Pass")
        public Boolean pass;

        @NameInMap("Items")
        public java.util.List<GetLinkeBahamutStagequalityResponseBodyResultItems> items;

        public static GetLinkeBahamutStagequalityResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeBahamutStagequalityResponseBodyResult self = new GetLinkeBahamutStagequalityResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetLinkeBahamutStagequalityResponseBodyResult setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public GetLinkeBahamutStagequalityResponseBodyResult setBranch(String branch) {
            this.branch = branch;
            return this;
        }
        public String getBranch() {
            return this.branch;
        }

        public GetLinkeBahamutStagequalityResponseBodyResult setCodeName(String codeName) {
            this.codeName = codeName;
            return this;
        }
        public String getCodeName() {
            return this.codeName;
        }

        public GetLinkeBahamutStagequalityResponseBodyResult setPass(Boolean pass) {
            this.pass = pass;
            return this;
        }
        public Boolean getPass() {
            return this.pass;
        }

        public GetLinkeBahamutStagequalityResponseBodyResult setItems(java.util.List<GetLinkeBahamutStagequalityResponseBodyResultItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<GetLinkeBahamutStagequalityResponseBodyResultItems> getItems() {
            return this.items;
        }

    }

}
