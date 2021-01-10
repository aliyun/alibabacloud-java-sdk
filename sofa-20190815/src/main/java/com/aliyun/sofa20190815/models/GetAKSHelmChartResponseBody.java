// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetAKSHelmChartResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ChartPackage")
    public GetAKSHelmChartResponseBodyChartPackage chartPackage;

    public static GetAKSHelmChartResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAKSHelmChartResponseBody self = new GetAKSHelmChartResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAKSHelmChartResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAKSHelmChartResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetAKSHelmChartResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetAKSHelmChartResponseBody setChartPackage(GetAKSHelmChartResponseBodyChartPackage chartPackage) {
        this.chartPackage = chartPackage;
        return this;
    }
    public GetAKSHelmChartResponseBodyChartPackage getChartPackage() {
        return this.chartPackage;
    }

    public static class GetAKSHelmChartResponseBodyChartPackageSubCharts extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Version")
        public String version;

        public static GetAKSHelmChartResponseBodyChartPackageSubCharts build(java.util.Map<String, ?> map) throws Exception {
            GetAKSHelmChartResponseBodyChartPackageSubCharts self = new GetAKSHelmChartResponseBodyChartPackageSubCharts();
            return TeaModel.build(map, self);
        }

        public GetAKSHelmChartResponseBodyChartPackageSubCharts setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetAKSHelmChartResponseBodyChartPackageSubCharts setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class GetAKSHelmChartResponseBodyChartPackageChartMetaData extends TeaModel {
        @NameInMap("ApiVersion")
        public String apiVersion;

        @NameInMap("AppVersion")
        public String appVersion;

        @NameInMap("Description")
        public String description;

        @NameInMap("Icon")
        public String icon;

        @NameInMap("Name")
        public String name;

        @NameInMap("Type")
        public String type;

        @NameInMap("Version")
        public String version;

        public static GetAKSHelmChartResponseBodyChartPackageChartMetaData build(java.util.Map<String, ?> map) throws Exception {
            GetAKSHelmChartResponseBodyChartPackageChartMetaData self = new GetAKSHelmChartResponseBodyChartPackageChartMetaData();
            return TeaModel.build(map, self);
        }

        public GetAKSHelmChartResponseBodyChartPackageChartMetaData setApiVersion(String apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }
        public String getApiVersion() {
            return this.apiVersion;
        }

        public GetAKSHelmChartResponseBodyChartPackageChartMetaData setAppVersion(String appVersion) {
            this.appVersion = appVersion;
            return this;
        }
        public String getAppVersion() {
            return this.appVersion;
        }

        public GetAKSHelmChartResponseBodyChartPackageChartMetaData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetAKSHelmChartResponseBodyChartPackageChartMetaData setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public GetAKSHelmChartResponseBodyChartPackageChartMetaData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetAKSHelmChartResponseBodyChartPackageChartMetaData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetAKSHelmChartResponseBodyChartPackageChartMetaData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class GetAKSHelmChartResponseBodyChartPackage extends TeaModel {
        @NameInMap("ChartType")
        public String chartType;

        @NameInMap("Description")
        public String description;

        @NameInMap("GmtCreated")
        public String gmtCreated;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Name")
        public String name;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("Readme")
        public String readme;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Version")
        public String version;

        @NameInMap("SubCharts")
        public java.util.List<GetAKSHelmChartResponseBodyChartPackageSubCharts> subCharts;

        @NameInMap("ChartMetaData")
        public GetAKSHelmChartResponseBodyChartPackageChartMetaData chartMetaData;

        public static GetAKSHelmChartResponseBodyChartPackage build(java.util.Map<String, ?> map) throws Exception {
            GetAKSHelmChartResponseBodyChartPackage self = new GetAKSHelmChartResponseBodyChartPackage();
            return TeaModel.build(map, self);
        }

        public GetAKSHelmChartResponseBodyChartPackage setChartType(String chartType) {
            this.chartType = chartType;
            return this;
        }
        public String getChartType() {
            return this.chartType;
        }

        public GetAKSHelmChartResponseBodyChartPackage setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetAKSHelmChartResponseBodyChartPackage setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public GetAKSHelmChartResponseBodyChartPackage setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetAKSHelmChartResponseBodyChartPackage setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetAKSHelmChartResponseBodyChartPackage setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public GetAKSHelmChartResponseBodyChartPackage setReadme(String readme) {
            this.readme = readme;
            return this;
        }
        public String getReadme() {
            return this.readme;
        }

        public GetAKSHelmChartResponseBodyChartPackage setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetAKSHelmChartResponseBodyChartPackage setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public GetAKSHelmChartResponseBodyChartPackage setSubCharts(java.util.List<GetAKSHelmChartResponseBodyChartPackageSubCharts> subCharts) {
            this.subCharts = subCharts;
            return this;
        }
        public java.util.List<GetAKSHelmChartResponseBodyChartPackageSubCharts> getSubCharts() {
            return this.subCharts;
        }

        public GetAKSHelmChartResponseBodyChartPackage setChartMetaData(GetAKSHelmChartResponseBodyChartPackageChartMetaData chartMetaData) {
            this.chartMetaData = chartMetaData;
            return this;
        }
        public GetAKSHelmChartResponseBodyChartPackageChartMetaData getChartMetaData() {
            return this.chartMetaData;
        }

    }

}
