// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricCiprojectbyappnameResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Message")
    public String message;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Data")
    public java.util.List<QueryLinkefabricFabricCiprojectbyappnameResponseBodyData> data;

    public static QueryLinkefabricFabricCiprojectbyappnameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricCiprojectbyappnameResponseBody self = new QueryLinkefabricFabricCiprojectbyappnameResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricCiprojectbyappnameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkefabricFabricCiprojectbyappnameResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkefabricFabricCiprojectbyappnameResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkefabricFabricCiprojectbyappnameResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryLinkefabricFabricCiprojectbyappnameResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkefabricFabricCiprojectbyappnameResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkefabricFabricCiprojectbyappnameResponseBody setData(java.util.List<QueryLinkefabricFabricCiprojectbyappnameResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryLinkefabricFabricCiprojectbyappnameResponseBodyData> getData() {
        return this.data;
    }

    public static class QueryLinkefabricFabricCiprojectbyappnameResponseBodyData extends TeaModel {
        @NameInMap("AntxVersion")
        public String antxVersion;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("BaseJar")
        public Boolean baseJar;

        @NameInMap("ConfigBak")
        public Boolean configBak;

        @NameInMap("DevStage")
        public String devStage;

        @NameInMap("ExtraInfo")
        public String extraInfo;

        @NameInMap("GrayRelease")
        public Boolean grayRelease;

        @NameInMap("Id")
        public Long id;

        @NameInMap("IsNewApp")
        public Boolean isNewApp;

        @NameInMap("IsRollback")
        public Boolean isRollback;

        @NameInMap("OriginReleaseIds")
        public String originReleaseIds;

        @NameInMap("ProjectId")
        public String projectId;

        @NameInMap("ReleaseId")
        public String releaseId;

        @NameInMap("SandboxRelease")
        public Boolean sandboxRelease;

        @NameInMap("Station")
        public String station;

        @NameInMap("TenantId")
        public Long tenantId;

        @NameInMap("UtcCreate")
        public Long utcCreate;

        @NameInMap("UtcModified")
        public Long utcModified;

        public static QueryLinkefabricFabricCiprojectbyappnameResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkefabricFabricCiprojectbyappnameResponseBodyData self = new QueryLinkefabricFabricCiprojectbyappnameResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryLinkefabricFabricCiprojectbyappnameResponseBodyData setAntxVersion(String antxVersion) {
            this.antxVersion = antxVersion;
            return this;
        }
        public String getAntxVersion() {
            return this.antxVersion;
        }

        public QueryLinkefabricFabricCiprojectbyappnameResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public QueryLinkefabricFabricCiprojectbyappnameResponseBodyData setBaseJar(Boolean baseJar) {
            this.baseJar = baseJar;
            return this;
        }
        public Boolean getBaseJar() {
            return this.baseJar;
        }

        public QueryLinkefabricFabricCiprojectbyappnameResponseBodyData setConfigBak(Boolean configBak) {
            this.configBak = configBak;
            return this;
        }
        public Boolean getConfigBak() {
            return this.configBak;
        }

        public QueryLinkefabricFabricCiprojectbyappnameResponseBodyData setDevStage(String devStage) {
            this.devStage = devStage;
            return this;
        }
        public String getDevStage() {
            return this.devStage;
        }

        public QueryLinkefabricFabricCiprojectbyappnameResponseBodyData setExtraInfo(String extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }
        public String getExtraInfo() {
            return this.extraInfo;
        }

        public QueryLinkefabricFabricCiprojectbyappnameResponseBodyData setGrayRelease(Boolean grayRelease) {
            this.grayRelease = grayRelease;
            return this;
        }
        public Boolean getGrayRelease() {
            return this.grayRelease;
        }

        public QueryLinkefabricFabricCiprojectbyappnameResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryLinkefabricFabricCiprojectbyappnameResponseBodyData setIsNewApp(Boolean isNewApp) {
            this.isNewApp = isNewApp;
            return this;
        }
        public Boolean getIsNewApp() {
            return this.isNewApp;
        }

        public QueryLinkefabricFabricCiprojectbyappnameResponseBodyData setIsRollback(Boolean isRollback) {
            this.isRollback = isRollback;
            return this;
        }
        public Boolean getIsRollback() {
            return this.isRollback;
        }

        public QueryLinkefabricFabricCiprojectbyappnameResponseBodyData setOriginReleaseIds(String originReleaseIds) {
            this.originReleaseIds = originReleaseIds;
            return this;
        }
        public String getOriginReleaseIds() {
            return this.originReleaseIds;
        }

        public QueryLinkefabricFabricCiprojectbyappnameResponseBodyData setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public QueryLinkefabricFabricCiprojectbyappnameResponseBodyData setReleaseId(String releaseId) {
            this.releaseId = releaseId;
            return this;
        }
        public String getReleaseId() {
            return this.releaseId;
        }

        public QueryLinkefabricFabricCiprojectbyappnameResponseBodyData setSandboxRelease(Boolean sandboxRelease) {
            this.sandboxRelease = sandboxRelease;
            return this;
        }
        public Boolean getSandboxRelease() {
            return this.sandboxRelease;
        }

        public QueryLinkefabricFabricCiprojectbyappnameResponseBodyData setStation(String station) {
            this.station = station;
            return this;
        }
        public String getStation() {
            return this.station;
        }

        public QueryLinkefabricFabricCiprojectbyappnameResponseBodyData setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public QueryLinkefabricFabricCiprojectbyappnameResponseBodyData setUtcCreate(Long utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public Long getUtcCreate() {
            return this.utcCreate;
        }

        public QueryLinkefabricFabricCiprojectbyappnameResponseBodyData setUtcModified(Long utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public Long getUtcModified() {
            return this.utcModified;
        }

    }

}
