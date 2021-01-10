// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CloneLinkeBahamutAoneinternalconverttolinkeiterationformResponseBody extends TeaModel {
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
    public CloneLinkeBahamutAoneinternalconverttolinkeiterationformResponseBodyResult result;

    public static CloneLinkeBahamutAoneinternalconverttolinkeiterationformResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloneLinkeBahamutAoneinternalconverttolinkeiterationformResponseBody self = new CloneLinkeBahamutAoneinternalconverttolinkeiterationformResponseBody();
        return TeaModel.build(map, self);
    }

    public CloneLinkeBahamutAoneinternalconverttolinkeiterationformResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CloneLinkeBahamutAoneinternalconverttolinkeiterationformResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CloneLinkeBahamutAoneinternalconverttolinkeiterationformResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public CloneLinkeBahamutAoneinternalconverttolinkeiterationformResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public CloneLinkeBahamutAoneinternalconverttolinkeiterationformResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CloneLinkeBahamutAoneinternalconverttolinkeiterationformResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CloneLinkeBahamutAoneinternalconverttolinkeiterationformResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CloneLinkeBahamutAoneinternalconverttolinkeiterationformResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CloneLinkeBahamutAoneinternalconverttolinkeiterationformResponseBody setResult(CloneLinkeBahamutAoneinternalconverttolinkeiterationformResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CloneLinkeBahamutAoneinternalconverttolinkeiterationformResponseBodyResult getResult() {
        return this.result;
    }

    public static class CloneLinkeBahamutAoneinternalconverttolinkeiterationformResponseBodyResult extends TeaModel {
        @NameInMap("TestOwner")
        public String testOwner;

        @NameInMap("WorkItems")
        public java.util.List<String> workItems;

        @NameInMap("AoneCodeChangeId")
        public String aoneCodeChangeId;

        @NameInMap("IsBranchRelease")
        public Boolean isBranchRelease;

        @NameInMap("PrePubOwner")
        public String prePubOwner;

        @NameInMap("Project")
        public String project;

        @NameInMap("Users")
        public java.util.List<String> users;

        @NameInMap("Name")
        public String name;

        @NameInMap("AppForms")
        public String appForms;

        @NameInMap("IterationManager")
        public String iterationManager;

        public static CloneLinkeBahamutAoneinternalconverttolinkeiterationformResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CloneLinkeBahamutAoneinternalconverttolinkeiterationformResponseBodyResult self = new CloneLinkeBahamutAoneinternalconverttolinkeiterationformResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CloneLinkeBahamutAoneinternalconverttolinkeiterationformResponseBodyResult setTestOwner(String testOwner) {
            this.testOwner = testOwner;
            return this;
        }
        public String getTestOwner() {
            return this.testOwner;
        }

        public CloneLinkeBahamutAoneinternalconverttolinkeiterationformResponseBodyResult setWorkItems(java.util.List<String> workItems) {
            this.workItems = workItems;
            return this;
        }
        public java.util.List<String> getWorkItems() {
            return this.workItems;
        }

        public CloneLinkeBahamutAoneinternalconverttolinkeiterationformResponseBodyResult setAoneCodeChangeId(String aoneCodeChangeId) {
            this.aoneCodeChangeId = aoneCodeChangeId;
            return this;
        }
        public String getAoneCodeChangeId() {
            return this.aoneCodeChangeId;
        }

        public CloneLinkeBahamutAoneinternalconverttolinkeiterationformResponseBodyResult setIsBranchRelease(Boolean isBranchRelease) {
            this.isBranchRelease = isBranchRelease;
            return this;
        }
        public Boolean getIsBranchRelease() {
            return this.isBranchRelease;
        }

        public CloneLinkeBahamutAoneinternalconverttolinkeiterationformResponseBodyResult setPrePubOwner(String prePubOwner) {
            this.prePubOwner = prePubOwner;
            return this;
        }
        public String getPrePubOwner() {
            return this.prePubOwner;
        }

        public CloneLinkeBahamutAoneinternalconverttolinkeiterationformResponseBodyResult setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public CloneLinkeBahamutAoneinternalconverttolinkeiterationformResponseBodyResult setUsers(java.util.List<String> users) {
            this.users = users;
            return this;
        }
        public java.util.List<String> getUsers() {
            return this.users;
        }

        public CloneLinkeBahamutAoneinternalconverttolinkeiterationformResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CloneLinkeBahamutAoneinternalconverttolinkeiterationformResponseBodyResult setAppForms(String appForms) {
            this.appForms = appForms;
            return this;
        }
        public String getAppForms() {
            return this.appForms;
        }

        public CloneLinkeBahamutAoneinternalconverttolinkeiterationformResponseBodyResult setIterationManager(String iterationManager) {
            this.iterationManager = iterationManager;
            return this;
        }
        public String getIterationManager() {
            return this.iterationManager;
        }

    }

}
