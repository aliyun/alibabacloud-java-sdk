// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CheckLinkeBahamutCeasingResponseBody extends TeaModel {
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
    public java.util.List<CheckLinkeBahamutCeasingResponseBodyResult> result;

    public static CheckLinkeBahamutCeasingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckLinkeBahamutCeasingResponseBody self = new CheckLinkeBahamutCeasingResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckLinkeBahamutCeasingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckLinkeBahamutCeasingResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CheckLinkeBahamutCeasingResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public CheckLinkeBahamutCeasingResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public CheckLinkeBahamutCeasingResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CheckLinkeBahamutCeasingResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CheckLinkeBahamutCeasingResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CheckLinkeBahamutCeasingResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CheckLinkeBahamutCeasingResponseBody setResult(java.util.List<CheckLinkeBahamutCeasingResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<CheckLinkeBahamutCeasingResponseBodyResult> getResult() {
        return this.result;
    }

    public static class CheckLinkeBahamutCeasingResponseBodyResult extends TeaModel {
        @NameInMap("ParentArchDomainBlackList")
        public java.util.List<String> parentArchDomainBlackList;

        @NameInMap("ParentArchDomainWhiteList")
        public java.util.List<String> parentArchDomainWhiteList;

        @NameInMap("ReleaseWhiteList")
        public java.util.List<String> releaseWhiteList;

        @NameInMap("ReleaseBlackList")
        public java.util.List<String> releaseBlackList;

        @NameInMap("LastModified")
        public Long lastModified;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("Tenant")
        public String tenant;

        @NameInMap("Description")
        public String description;

        @NameInMap("AppWhiteList")
        public java.util.List<String> appWhiteList;

        @NameInMap("AppBlackList")
        public java.util.List<String> appBlackList;

        @NameInMap("PreReleaseIncluded")
        public Boolean preReleaseIncluded;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("Created")
        public Long created;

        @NameInMap("Id")
        public String id;

        public static CheckLinkeBahamutCeasingResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CheckLinkeBahamutCeasingResponseBodyResult self = new CheckLinkeBahamutCeasingResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CheckLinkeBahamutCeasingResponseBodyResult setParentArchDomainBlackList(java.util.List<String> parentArchDomainBlackList) {
            this.parentArchDomainBlackList = parentArchDomainBlackList;
            return this;
        }
        public java.util.List<String> getParentArchDomainBlackList() {
            return this.parentArchDomainBlackList;
        }

        public CheckLinkeBahamutCeasingResponseBodyResult setParentArchDomainWhiteList(java.util.List<String> parentArchDomainWhiteList) {
            this.parentArchDomainWhiteList = parentArchDomainWhiteList;
            return this;
        }
        public java.util.List<String> getParentArchDomainWhiteList() {
            return this.parentArchDomainWhiteList;
        }

        public CheckLinkeBahamutCeasingResponseBodyResult setReleaseWhiteList(java.util.List<String> releaseWhiteList) {
            this.releaseWhiteList = releaseWhiteList;
            return this;
        }
        public java.util.List<String> getReleaseWhiteList() {
            return this.releaseWhiteList;
        }

        public CheckLinkeBahamutCeasingResponseBodyResult setReleaseBlackList(java.util.List<String> releaseBlackList) {
            this.releaseBlackList = releaseBlackList;
            return this;
        }
        public java.util.List<String> getReleaseBlackList() {
            return this.releaseBlackList;
        }

        public CheckLinkeBahamutCeasingResponseBodyResult setLastModified(Long lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public Long getLastModified() {
            return this.lastModified;
        }

        public CheckLinkeBahamutCeasingResponseBodyResult setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public CheckLinkeBahamutCeasingResponseBodyResult setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public CheckLinkeBahamutCeasingResponseBodyResult setTenant(String tenant) {
            this.tenant = tenant;
            return this;
        }
        public String getTenant() {
            return this.tenant;
        }

        public CheckLinkeBahamutCeasingResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CheckLinkeBahamutCeasingResponseBodyResult setAppWhiteList(java.util.List<String> appWhiteList) {
            this.appWhiteList = appWhiteList;
            return this;
        }
        public java.util.List<String> getAppWhiteList() {
            return this.appWhiteList;
        }

        public CheckLinkeBahamutCeasingResponseBodyResult setAppBlackList(java.util.List<String> appBlackList) {
            this.appBlackList = appBlackList;
            return this;
        }
        public java.util.List<String> getAppBlackList() {
            return this.appBlackList;
        }

        public CheckLinkeBahamutCeasingResponseBodyResult setPreReleaseIncluded(Boolean preReleaseIncluded) {
            this.preReleaseIncluded = preReleaseIncluded;
            return this;
        }
        public Boolean getPreReleaseIncluded() {
            return this.preReleaseIncluded;
        }

        public CheckLinkeBahamutCeasingResponseBodyResult setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public CheckLinkeBahamutCeasingResponseBodyResult setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public CheckLinkeBahamutCeasingResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
