// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutReleaseappsResponseBody extends TeaModel {
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
    public java.util.List<GetLinkeBahamutReleaseappsResponseBodyResult> result;

    public static GetLinkeBahamutReleaseappsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutReleaseappsResponseBody self = new GetLinkeBahamutReleaseappsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutReleaseappsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkeBahamutReleaseappsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkeBahamutReleaseappsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkeBahamutReleaseappsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetLinkeBahamutReleaseappsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLinkeBahamutReleaseappsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkeBahamutReleaseappsResponseBody setResult(java.util.List<GetLinkeBahamutReleaseappsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<GetLinkeBahamutReleaseappsResponseBodyResult> getResult() {
        return this.result;
    }

    public static class GetLinkeBahamutReleaseappsResponseBodyResultReleaseReposReleaseAppsAppUnitsAppUnitCreatedBys extends TeaModel {
        @NameInMap("LinkUrl")
        public String linkUrl;

        @NameInMap("StageCnName")
        public String stageCnName;

        @NameInMap("Subject")
        public String subject;

        @NameInMap("TypeCnName")
        public String typeCnName;

        public static GetLinkeBahamutReleaseappsResponseBodyResultReleaseReposReleaseAppsAppUnitsAppUnitCreatedBys build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeBahamutReleaseappsResponseBodyResultReleaseReposReleaseAppsAppUnitsAppUnitCreatedBys self = new GetLinkeBahamutReleaseappsResponseBodyResultReleaseReposReleaseAppsAppUnitsAppUnitCreatedBys();
            return TeaModel.build(map, self);
        }

        public GetLinkeBahamutReleaseappsResponseBodyResultReleaseReposReleaseAppsAppUnitsAppUnitCreatedBys setLinkUrl(String linkUrl) {
            this.linkUrl = linkUrl;
            return this;
        }
        public String getLinkUrl() {
            return this.linkUrl;
        }

        public GetLinkeBahamutReleaseappsResponseBodyResultReleaseReposReleaseAppsAppUnitsAppUnitCreatedBys setStageCnName(String stageCnName) {
            this.stageCnName = stageCnName;
            return this;
        }
        public String getStageCnName() {
            return this.stageCnName;
        }

        public GetLinkeBahamutReleaseappsResponseBodyResultReleaseReposReleaseAppsAppUnitsAppUnitCreatedBys setSubject(String subject) {
            this.subject = subject;
            return this;
        }
        public String getSubject() {
            return this.subject;
        }

        public GetLinkeBahamutReleaseappsResponseBodyResultReleaseReposReleaseAppsAppUnitsAppUnitCreatedBys setTypeCnName(String typeCnName) {
            this.typeCnName = typeCnName;
            return this;
        }
        public String getTypeCnName() {
            return this.typeCnName;
        }

    }

    public static class GetLinkeBahamutReleaseappsResponseBodyResultReleaseReposReleaseAppsAppUnitsStageStep extends TeaModel {
        @NameInMap("CurrentIndex")
        public Long currentIndex;

        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("FabricStageName")
        public String fabricStageName;

        @NameInMap("FrontCurrentIndex")
        public Long frontCurrentIndex;

        @NameInMap("Name")
        public String name;

        @NameInMap("Total")
        public Long total;

        public static GetLinkeBahamutReleaseappsResponseBodyResultReleaseReposReleaseAppsAppUnitsStageStep build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeBahamutReleaseappsResponseBodyResultReleaseReposReleaseAppsAppUnitsStageStep self = new GetLinkeBahamutReleaseappsResponseBodyResultReleaseReposReleaseAppsAppUnitsStageStep();
            return TeaModel.build(map, self);
        }

        public GetLinkeBahamutReleaseappsResponseBodyResultReleaseReposReleaseAppsAppUnitsStageStep setCurrentIndex(Long currentIndex) {
            this.currentIndex = currentIndex;
            return this;
        }
        public Long getCurrentIndex() {
            return this.currentIndex;
        }

        public GetLinkeBahamutReleaseappsResponseBodyResultReleaseReposReleaseAppsAppUnitsStageStep setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetLinkeBahamutReleaseappsResponseBodyResultReleaseReposReleaseAppsAppUnitsStageStep setFabricStageName(String fabricStageName) {
            this.fabricStageName = fabricStageName;
            return this;
        }
        public String getFabricStageName() {
            return this.fabricStageName;
        }

        public GetLinkeBahamutReleaseappsResponseBodyResultReleaseReposReleaseAppsAppUnitsStageStep setFrontCurrentIndex(Long frontCurrentIndex) {
            this.frontCurrentIndex = frontCurrentIndex;
            return this;
        }
        public Long getFrontCurrentIndex() {
            return this.frontCurrentIndex;
        }

        public GetLinkeBahamutReleaseappsResponseBodyResultReleaseReposReleaseAppsAppUnitsStageStep setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetLinkeBahamutReleaseappsResponseBodyResultReleaseReposReleaseAppsAppUnitsStageStep setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

    public static class GetLinkeBahamutReleaseappsResponseBodyResultReleaseReposReleaseAppsAppUnits extends TeaModel {
        @NameInMap("CanRemove")
        public Boolean canRemove;

        @NameInMap("IterationId")
        public String iterationId;

        @NameInMap("AppUnitCreatedBys")
        public java.util.List<GetLinkeBahamutReleaseappsResponseBodyResultReleaseReposReleaseAppsAppUnitsAppUnitCreatedBys> appUnitCreatedBys;

        @NameInMap("StageStep")
        public GetLinkeBahamutReleaseappsResponseBodyResultReleaseReposReleaseAppsAppUnitsStageStep stageStep;

        public static GetLinkeBahamutReleaseappsResponseBodyResultReleaseReposReleaseAppsAppUnits build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeBahamutReleaseappsResponseBodyResultReleaseReposReleaseAppsAppUnits self = new GetLinkeBahamutReleaseappsResponseBodyResultReleaseReposReleaseAppsAppUnits();
            return TeaModel.build(map, self);
        }

        public GetLinkeBahamutReleaseappsResponseBodyResultReleaseReposReleaseAppsAppUnits setCanRemove(Boolean canRemove) {
            this.canRemove = canRemove;
            return this;
        }
        public Boolean getCanRemove() {
            return this.canRemove;
        }

        public GetLinkeBahamutReleaseappsResponseBodyResultReleaseReposReleaseAppsAppUnits setIterationId(String iterationId) {
            this.iterationId = iterationId;
            return this;
        }
        public String getIterationId() {
            return this.iterationId;
        }

        public GetLinkeBahamutReleaseappsResponseBodyResultReleaseReposReleaseAppsAppUnits setAppUnitCreatedBys(java.util.List<GetLinkeBahamutReleaseappsResponseBodyResultReleaseReposReleaseAppsAppUnitsAppUnitCreatedBys> appUnitCreatedBys) {
            this.appUnitCreatedBys = appUnitCreatedBys;
            return this;
        }
        public java.util.List<GetLinkeBahamutReleaseappsResponseBodyResultReleaseReposReleaseAppsAppUnitsAppUnitCreatedBys> getAppUnitCreatedBys() {
            return this.appUnitCreatedBys;
        }

        public GetLinkeBahamutReleaseappsResponseBodyResultReleaseReposReleaseAppsAppUnits setStageStep(GetLinkeBahamutReleaseappsResponseBodyResultReleaseReposReleaseAppsAppUnitsStageStep stageStep) {
            this.stageStep = stageStep;
            return this;
        }
        public GetLinkeBahamutReleaseappsResponseBodyResultReleaseReposReleaseAppsAppUnitsStageStep getStageStep() {
            return this.stageStep;
        }

    }

    public static class GetLinkeBahamutReleaseappsResponseBodyResultReleaseReposReleaseApps extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("Release")
        public Boolean release;

        @NameInMap("RepoName")
        public String repoName;

        @NameInMap("AppUnits")
        public java.util.List<GetLinkeBahamutReleaseappsResponseBodyResultReleaseReposReleaseAppsAppUnits> appUnits;

        public static GetLinkeBahamutReleaseappsResponseBodyResultReleaseReposReleaseApps build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeBahamutReleaseappsResponseBodyResultReleaseReposReleaseApps self = new GetLinkeBahamutReleaseappsResponseBodyResultReleaseReposReleaseApps();
            return TeaModel.build(map, self);
        }

        public GetLinkeBahamutReleaseappsResponseBodyResultReleaseReposReleaseApps setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public GetLinkeBahamutReleaseappsResponseBodyResultReleaseReposReleaseApps setRelease(Boolean release) {
            this.release = release;
            return this;
        }
        public Boolean getRelease() {
            return this.release;
        }

        public GetLinkeBahamutReleaseappsResponseBodyResultReleaseReposReleaseApps setRepoName(String repoName) {
            this.repoName = repoName;
            return this;
        }
        public String getRepoName() {
            return this.repoName;
        }

        public GetLinkeBahamutReleaseappsResponseBodyResultReleaseReposReleaseApps setAppUnits(java.util.List<GetLinkeBahamutReleaseappsResponseBodyResultReleaseReposReleaseAppsAppUnits> appUnits) {
            this.appUnits = appUnits;
            return this;
        }
        public java.util.List<GetLinkeBahamutReleaseappsResponseBodyResultReleaseReposReleaseAppsAppUnits> getAppUnits() {
            return this.appUnits;
        }

    }

    public static class GetLinkeBahamutReleaseappsResponseBodyResultReleaseRepos extends TeaModel {
        @NameInMap("RepoName")
        public String repoName;

        @NameInMap("ReleaseApps")
        public java.util.List<GetLinkeBahamutReleaseappsResponseBodyResultReleaseReposReleaseApps> releaseApps;

        public static GetLinkeBahamutReleaseappsResponseBodyResultReleaseRepos build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeBahamutReleaseappsResponseBodyResultReleaseRepos self = new GetLinkeBahamutReleaseappsResponseBodyResultReleaseRepos();
            return TeaModel.build(map, self);
        }

        public GetLinkeBahamutReleaseappsResponseBodyResultReleaseRepos setRepoName(String repoName) {
            this.repoName = repoName;
            return this;
        }
        public String getRepoName() {
            return this.repoName;
        }

        public GetLinkeBahamutReleaseappsResponseBodyResultReleaseRepos setReleaseApps(java.util.List<GetLinkeBahamutReleaseappsResponseBodyResultReleaseReposReleaseApps> releaseApps) {
            this.releaseApps = releaseApps;
            return this;
        }
        public java.util.List<GetLinkeBahamutReleaseappsResponseBodyResultReleaseReposReleaseApps> getReleaseApps() {
            return this.releaseApps;
        }

    }

    public static class GetLinkeBahamutReleaseappsResponseBodyResult extends TeaModel {
        @NameInMap("ReleaseId")
        public String releaseId;

        @NameInMap("ReleaseRepos")
        public java.util.List<GetLinkeBahamutReleaseappsResponseBodyResultReleaseRepos> releaseRepos;

        public static GetLinkeBahamutReleaseappsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeBahamutReleaseappsResponseBodyResult self = new GetLinkeBahamutReleaseappsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetLinkeBahamutReleaseappsResponseBodyResult setReleaseId(String releaseId) {
            this.releaseId = releaseId;
            return this;
        }
        public String getReleaseId() {
            return this.releaseId;
        }

        public GetLinkeBahamutReleaseappsResponseBodyResult setReleaseRepos(java.util.List<GetLinkeBahamutReleaseappsResponseBodyResultReleaseRepos> releaseRepos) {
            this.releaseRepos = releaseRepos;
            return this;
        }
        public java.util.List<GetLinkeBahamutReleaseappsResponseBodyResultReleaseRepos> getReleaseRepos() {
            return this.releaseRepos;
        }

    }

}
