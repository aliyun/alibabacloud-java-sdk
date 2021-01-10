// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkedeploycoreDeploycoreAppqueryprofileResponseBody extends TeaModel {
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
    public QueryLinkedeploycoreDeploycoreAppqueryprofileResponseBodyData data;

    public static QueryLinkedeploycoreDeploycoreAppqueryprofileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkedeploycoreDeploycoreAppqueryprofileResponseBody self = new QueryLinkedeploycoreDeploycoreAppqueryprofileResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkedeploycoreDeploycoreAppqueryprofileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkedeploycoreDeploycoreAppqueryprofileResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkedeploycoreDeploycoreAppqueryprofileResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkedeploycoreDeploycoreAppqueryprofileResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryLinkedeploycoreDeploycoreAppqueryprofileResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkedeploycoreDeploycoreAppqueryprofileResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkedeploycoreDeploycoreAppqueryprofileResponseBody setData(QueryLinkedeploycoreDeploycoreAppqueryprofileResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryLinkedeploycoreDeploycoreAppqueryprofileResponseBodyData getData() {
        return this.data;
    }

    public static class QueryLinkedeploycoreDeploycoreAppqueryprofileResponseBodyData extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("DefaultBuildPackVersion")
        public String defaultBuildPackVersion;

        @NameInMap("EnvName")
        public String envName;

        @NameInMap("FrontApp")
        public Boolean frontApp;

        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("Name")
        public String name;

        @NameInMap("StationName")
        public String stationName;

        @NameInMap("TechStack")
        public String techStack;

        @NameInMap("TenantId")
        public Long tenantId;

        @NameInMap("TenantName")
        public String tenantName;

        @NameInMap("BuildPackVersions")
        public java.util.List<String> buildPackVersions;

        @NameInMap("Customized")
        public java.util.List<String> customized;

        @NameInMap("Iteration")
        public java.util.List<String> iteration;

        @NameInMap("LatestTag")
        public java.util.List<String> latestTag;

        @NameInMap("Sidecars")
        public java.util.List<String> sidecars;

        @NameInMap("Trunk")
        public java.util.List<String> trunk;

        @NameInMap("ZoneList")
        public java.util.List<String> zoneList;

        public static QueryLinkedeploycoreDeploycoreAppqueryprofileResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkedeploycoreDeploycoreAppqueryprofileResponseBodyData self = new QueryLinkedeploycoreDeploycoreAppqueryprofileResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryLinkedeploycoreDeploycoreAppqueryprofileResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public QueryLinkedeploycoreDeploycoreAppqueryprofileResponseBodyData setDefaultBuildPackVersion(String defaultBuildPackVersion) {
            this.defaultBuildPackVersion = defaultBuildPackVersion;
            return this;
        }
        public String getDefaultBuildPackVersion() {
            return this.defaultBuildPackVersion;
        }

        public QueryLinkedeploycoreDeploycoreAppqueryprofileResponseBodyData setEnvName(String envName) {
            this.envName = envName;
            return this;
        }
        public String getEnvName() {
            return this.envName;
        }

        public QueryLinkedeploycoreDeploycoreAppqueryprofileResponseBodyData setFrontApp(Boolean frontApp) {
            this.frontApp = frontApp;
            return this;
        }
        public Boolean getFrontApp() {
            return this.frontApp;
        }

        public QueryLinkedeploycoreDeploycoreAppqueryprofileResponseBodyData setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public QueryLinkedeploycoreDeploycoreAppqueryprofileResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryLinkedeploycoreDeploycoreAppqueryprofileResponseBodyData setStationName(String stationName) {
            this.stationName = stationName;
            return this;
        }
        public String getStationName() {
            return this.stationName;
        }

        public QueryLinkedeploycoreDeploycoreAppqueryprofileResponseBodyData setTechStack(String techStack) {
            this.techStack = techStack;
            return this;
        }
        public String getTechStack() {
            return this.techStack;
        }

        public QueryLinkedeploycoreDeploycoreAppqueryprofileResponseBodyData setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public QueryLinkedeploycoreDeploycoreAppqueryprofileResponseBodyData setTenantName(String tenantName) {
            this.tenantName = tenantName;
            return this;
        }
        public String getTenantName() {
            return this.tenantName;
        }

        public QueryLinkedeploycoreDeploycoreAppqueryprofileResponseBodyData setBuildPackVersions(java.util.List<String> buildPackVersions) {
            this.buildPackVersions = buildPackVersions;
            return this;
        }
        public java.util.List<String> getBuildPackVersions() {
            return this.buildPackVersions;
        }

        public QueryLinkedeploycoreDeploycoreAppqueryprofileResponseBodyData setCustomized(java.util.List<String> customized) {
            this.customized = customized;
            return this;
        }
        public java.util.List<String> getCustomized() {
            return this.customized;
        }

        public QueryLinkedeploycoreDeploycoreAppqueryprofileResponseBodyData setIteration(java.util.List<String> iteration) {
            this.iteration = iteration;
            return this;
        }
        public java.util.List<String> getIteration() {
            return this.iteration;
        }

        public QueryLinkedeploycoreDeploycoreAppqueryprofileResponseBodyData setLatestTag(java.util.List<String> latestTag) {
            this.latestTag = latestTag;
            return this;
        }
        public java.util.List<String> getLatestTag() {
            return this.latestTag;
        }

        public QueryLinkedeploycoreDeploycoreAppqueryprofileResponseBodyData setSidecars(java.util.List<String> sidecars) {
            this.sidecars = sidecars;
            return this;
        }
        public java.util.List<String> getSidecars() {
            return this.sidecars;
        }

        public QueryLinkedeploycoreDeploycoreAppqueryprofileResponseBodyData setTrunk(java.util.List<String> trunk) {
            this.trunk = trunk;
            return this;
        }
        public java.util.List<String> getTrunk() {
            return this.trunk;
        }

        public QueryLinkedeploycoreDeploycoreAppqueryprofileResponseBodyData setZoneList(java.util.List<String> zoneList) {
            this.zoneList = zoneList;
            return this;
        }
        public java.util.List<String> getZoneList() {
            return this.zoneList;
        }

    }

}
