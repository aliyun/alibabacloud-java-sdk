// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutAppimportbaseinfoResponseBody extends TeaModel {
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
    public GetLinkeBahamutAppimportbaseinfoResponseBodyResult result;

    public static GetLinkeBahamutAppimportbaseinfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutAppimportbaseinfoResponseBody self = new GetLinkeBahamutAppimportbaseinfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutAppimportbaseinfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkeBahamutAppimportbaseinfoResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkeBahamutAppimportbaseinfoResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkeBahamutAppimportbaseinfoResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetLinkeBahamutAppimportbaseinfoResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public GetLinkeBahamutAppimportbaseinfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLinkeBahamutAppimportbaseinfoResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkeBahamutAppimportbaseinfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkeBahamutAppimportbaseinfoResponseBody setResult(GetLinkeBahamutAppimportbaseinfoResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetLinkeBahamutAppimportbaseinfoResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetLinkeBahamutAppimportbaseinfoResponseBodyResult extends TeaModel {
        @NameInMap("AccessControl")
        public String accessControl;

        @NameInMap("AppDisplayName")
        public String appDisplayName;

        @NameInMap("AppLevel")
        public String appLevel;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("AppTechStackName")
        public String appTechStackName;

        @NameInMap("AppType")
        public String appType;

        @NameInMap("ArchDomainId")
        public String archDomainId;

        @NameInMap("CreateApp")
        public Boolean createApp;

        @NameInMap("CreateRepo")
        public Boolean createRepo;

        @NameInMap("Description")
        public String description;

        @NameInMap("FromLocal")
        public Boolean fromLocal;

        @NameInMap("Group")
        public String group;

        @NameInMap("Repo")
        public String repo;

        @NameInMap("RepoEncode")
        public String repoEncode;

        @NameInMap("RepoUrl")
        public String repoUrl;

        @NameInMap("TechV2")
        public Boolean techV2;

        @NameInMap("TenantExternalId")
        public String tenantExternalId;

        @NameInMap("DevOwnerAccounts")
        public java.util.List<String> devOwnerAccounts;

        @NameInMap("FileList")
        public java.util.List<String> fileList;

        @NameInMap("SyncCloudTenants")
        public java.util.List<String> syncCloudTenants;

        @NameInMap("TestOwnerAccounts")
        public java.util.List<String> testOwnerAccounts;

        public static GetLinkeBahamutAppimportbaseinfoResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeBahamutAppimportbaseinfoResponseBodyResult self = new GetLinkeBahamutAppimportbaseinfoResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetLinkeBahamutAppimportbaseinfoResponseBodyResult setAccessControl(String accessControl) {
            this.accessControl = accessControl;
            return this;
        }
        public String getAccessControl() {
            return this.accessControl;
        }

        public GetLinkeBahamutAppimportbaseinfoResponseBodyResult setAppDisplayName(String appDisplayName) {
            this.appDisplayName = appDisplayName;
            return this;
        }
        public String getAppDisplayName() {
            return this.appDisplayName;
        }

        public GetLinkeBahamutAppimportbaseinfoResponseBodyResult setAppLevel(String appLevel) {
            this.appLevel = appLevel;
            return this;
        }
        public String getAppLevel() {
            return this.appLevel;
        }

        public GetLinkeBahamutAppimportbaseinfoResponseBodyResult setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public GetLinkeBahamutAppimportbaseinfoResponseBodyResult setAppTechStackName(String appTechStackName) {
            this.appTechStackName = appTechStackName;
            return this;
        }
        public String getAppTechStackName() {
            return this.appTechStackName;
        }

        public GetLinkeBahamutAppimportbaseinfoResponseBodyResult setAppType(String appType) {
            this.appType = appType;
            return this;
        }
        public String getAppType() {
            return this.appType;
        }

        public GetLinkeBahamutAppimportbaseinfoResponseBodyResult setArchDomainId(String archDomainId) {
            this.archDomainId = archDomainId;
            return this;
        }
        public String getArchDomainId() {
            return this.archDomainId;
        }

        public GetLinkeBahamutAppimportbaseinfoResponseBodyResult setCreateApp(Boolean createApp) {
            this.createApp = createApp;
            return this;
        }
        public Boolean getCreateApp() {
            return this.createApp;
        }

        public GetLinkeBahamutAppimportbaseinfoResponseBodyResult setCreateRepo(Boolean createRepo) {
            this.createRepo = createRepo;
            return this;
        }
        public Boolean getCreateRepo() {
            return this.createRepo;
        }

        public GetLinkeBahamutAppimportbaseinfoResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetLinkeBahamutAppimportbaseinfoResponseBodyResult setFromLocal(Boolean fromLocal) {
            this.fromLocal = fromLocal;
            return this;
        }
        public Boolean getFromLocal() {
            return this.fromLocal;
        }

        public GetLinkeBahamutAppimportbaseinfoResponseBodyResult setGroup(String group) {
            this.group = group;
            return this;
        }
        public String getGroup() {
            return this.group;
        }

        public GetLinkeBahamutAppimportbaseinfoResponseBodyResult setRepo(String repo) {
            this.repo = repo;
            return this;
        }
        public String getRepo() {
            return this.repo;
        }

        public GetLinkeBahamutAppimportbaseinfoResponseBodyResult setRepoEncode(String repoEncode) {
            this.repoEncode = repoEncode;
            return this;
        }
        public String getRepoEncode() {
            return this.repoEncode;
        }

        public GetLinkeBahamutAppimportbaseinfoResponseBodyResult setRepoUrl(String repoUrl) {
            this.repoUrl = repoUrl;
            return this;
        }
        public String getRepoUrl() {
            return this.repoUrl;
        }

        public GetLinkeBahamutAppimportbaseinfoResponseBodyResult setTechV2(Boolean techV2) {
            this.techV2 = techV2;
            return this;
        }
        public Boolean getTechV2() {
            return this.techV2;
        }

        public GetLinkeBahamutAppimportbaseinfoResponseBodyResult setTenantExternalId(String tenantExternalId) {
            this.tenantExternalId = tenantExternalId;
            return this;
        }
        public String getTenantExternalId() {
            return this.tenantExternalId;
        }

        public GetLinkeBahamutAppimportbaseinfoResponseBodyResult setDevOwnerAccounts(java.util.List<String> devOwnerAccounts) {
            this.devOwnerAccounts = devOwnerAccounts;
            return this;
        }
        public java.util.List<String> getDevOwnerAccounts() {
            return this.devOwnerAccounts;
        }

        public GetLinkeBahamutAppimportbaseinfoResponseBodyResult setFileList(java.util.List<String> fileList) {
            this.fileList = fileList;
            return this;
        }
        public java.util.List<String> getFileList() {
            return this.fileList;
        }

        public GetLinkeBahamutAppimportbaseinfoResponseBodyResult setSyncCloudTenants(java.util.List<String> syncCloudTenants) {
            this.syncCloudTenants = syncCloudTenants;
            return this;
        }
        public java.util.List<String> getSyncCloudTenants() {
            return this.syncCloudTenants;
        }

        public GetLinkeBahamutAppimportbaseinfoResponseBodyResult setTestOwnerAccounts(java.util.List<String> testOwnerAccounts) {
            this.testOwnerAccounts = testOwnerAccounts;
            return this;
        }
        public java.util.List<String> getTestOwnerAccounts() {
            return this.testOwnerAccounts;
        }

    }

}
