// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeBahamutSearchappResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Message")
    public String message;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("ErrorMsgParamsMap")
    public String errorMsgParamsMap;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("Result")
    public java.util.List<ExecLinkeBahamutSearchappResponseBodyResult> result;

    public static ExecLinkeBahamutSearchappResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeBahamutSearchappResponseBody self = new ExecLinkeBahamutSearchappResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecLinkeBahamutSearchappResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecLinkeBahamutSearchappResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ExecLinkeBahamutSearchappResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public ExecLinkeBahamutSearchappResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public ExecLinkeBahamutSearchappResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ExecLinkeBahamutSearchappResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ExecLinkeBahamutSearchappResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ExecLinkeBahamutSearchappResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ExecLinkeBahamutSearchappResponseBody setResult(java.util.List<ExecLinkeBahamutSearchappResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ExecLinkeBahamutSearchappResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ExecLinkeBahamutSearchappResponseBodyResult extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Owners")
        public java.util.List<String> owners;

        @NameInMap("AppGroupName")
        public String appGroupName;

        @NameInMap("SecondArchDomain")
        public String secondArchDomain;

        @NameInMap("AppType")
        public String appType;

        @NameInMap("RecentLiveTime")
        public String recentLiveTime;

        @NameInMap("Name")
        public String name;

        @NameInMap("FirstArchDomain")
        public String firstArchDomain;

        @NameInMap("Level")
        public String level;

        @NameInMap("Id")
        public String id;

        @NameInMap("OwnerObjs")
        public java.util.List<String> ownerObjs;

        public static ExecLinkeBahamutSearchappResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ExecLinkeBahamutSearchappResponseBodyResult self = new ExecLinkeBahamutSearchappResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ExecLinkeBahamutSearchappResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ExecLinkeBahamutSearchappResponseBodyResult setOwners(java.util.List<String> owners) {
            this.owners = owners;
            return this;
        }
        public java.util.List<String> getOwners() {
            return this.owners;
        }

        public ExecLinkeBahamutSearchappResponseBodyResult setAppGroupName(String appGroupName) {
            this.appGroupName = appGroupName;
            return this;
        }
        public String getAppGroupName() {
            return this.appGroupName;
        }

        public ExecLinkeBahamutSearchappResponseBodyResult setSecondArchDomain(String secondArchDomain) {
            this.secondArchDomain = secondArchDomain;
            return this;
        }
        public String getSecondArchDomain() {
            return this.secondArchDomain;
        }

        public ExecLinkeBahamutSearchappResponseBodyResult setAppType(String appType) {
            this.appType = appType;
            return this;
        }
        public String getAppType() {
            return this.appType;
        }

        public ExecLinkeBahamutSearchappResponseBodyResult setRecentLiveTime(String recentLiveTime) {
            this.recentLiveTime = recentLiveTime;
            return this;
        }
        public String getRecentLiveTime() {
            return this.recentLiveTime;
        }

        public ExecLinkeBahamutSearchappResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ExecLinkeBahamutSearchappResponseBodyResult setFirstArchDomain(String firstArchDomain) {
            this.firstArchDomain = firstArchDomain;
            return this;
        }
        public String getFirstArchDomain() {
            return this.firstArchDomain;
        }

        public ExecLinkeBahamutSearchappResponseBodyResult setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public ExecLinkeBahamutSearchappResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ExecLinkeBahamutSearchappResponseBodyResult setOwnerObjs(java.util.List<String> ownerObjs) {
            this.ownerObjs = ownerObjs;
            return this;
        }
        public java.util.List<String> getOwnerObjs() {
            return this.ownerObjs;
        }

    }

}
