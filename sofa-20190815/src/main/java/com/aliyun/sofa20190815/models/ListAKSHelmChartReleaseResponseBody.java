// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListAKSHelmChartReleaseResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("ChartReleases")
    public java.util.List<ListAKSHelmChartReleaseResponseBodyChartReleases> chartReleases;

    public static ListAKSHelmChartReleaseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAKSHelmChartReleaseResponseBody self = new ListAKSHelmChartReleaseResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAKSHelmChartReleaseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAKSHelmChartReleaseResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListAKSHelmChartReleaseResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListAKSHelmChartReleaseResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListAKSHelmChartReleaseResponseBody setChartReleases(java.util.List<ListAKSHelmChartReleaseResponseBodyChartReleases> chartReleases) {
        this.chartReleases = chartReleases;
        return this;
    }
    public java.util.List<ListAKSHelmChartReleaseResponseBodyChartReleases> getChartReleases() {
        return this.chartReleases;
    }

    public static class ListAKSHelmChartReleaseResponseBodyChartReleasesExtraData extends TeaModel {
        @NameInMap("ChartType")
        public String chartType;

        @NameInMap("Icon")
        public String icon;

        public static ListAKSHelmChartReleaseResponseBodyChartReleasesExtraData build(java.util.Map<String, ?> map) throws Exception {
            ListAKSHelmChartReleaseResponseBodyChartReleasesExtraData self = new ListAKSHelmChartReleaseResponseBodyChartReleasesExtraData();
            return TeaModel.build(map, self);
        }

        public ListAKSHelmChartReleaseResponseBodyChartReleasesExtraData setChartType(String chartType) {
            this.chartType = chartType;
            return this;
        }
        public String getChartType() {
            return this.chartType;
        }

        public ListAKSHelmChartReleaseResponseBodyChartReleasesExtraData setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

    }

    public static class ListAKSHelmChartReleaseResponseBodyChartReleases extends TeaModel {
        @NameInMap("ChartId")
        public String chartId;

        @NameInMap("ChartName")
        public String chartName;

        @NameInMap("ChartVersion")
        public String chartVersion;

        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("GmtCreated")
        public String gmtCreated;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public String id;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("ReleaseLog")
        public String releaseLog;

        @NameInMap("ReleaseName")
        public String releaseName;

        @NameInMap("Revision")
        public Long revision;

        @NameInMap("Status")
        public Long status;

        @NameInMap("Superseded")
        public Long superseded;

        @NameInMap("ExtraData")
        public ListAKSHelmChartReleaseResponseBodyChartReleasesExtraData extraData;

        public static ListAKSHelmChartReleaseResponseBodyChartReleases build(java.util.Map<String, ?> map) throws Exception {
            ListAKSHelmChartReleaseResponseBodyChartReleases self = new ListAKSHelmChartReleaseResponseBodyChartReleases();
            return TeaModel.build(map, self);
        }

        public ListAKSHelmChartReleaseResponseBodyChartReleases setChartId(String chartId) {
            this.chartId = chartId;
            return this;
        }
        public String getChartId() {
            return this.chartId;
        }

        public ListAKSHelmChartReleaseResponseBodyChartReleases setChartName(String chartName) {
            this.chartName = chartName;
            return this;
        }
        public String getChartName() {
            return this.chartName;
        }

        public ListAKSHelmChartReleaseResponseBodyChartReleases setChartVersion(String chartVersion) {
            this.chartVersion = chartVersion;
            return this;
        }
        public String getChartVersion() {
            return this.chartVersion;
        }

        public ListAKSHelmChartReleaseResponseBodyChartReleases setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public ListAKSHelmChartReleaseResponseBodyChartReleases setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public ListAKSHelmChartReleaseResponseBodyChartReleases setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListAKSHelmChartReleaseResponseBodyChartReleases setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListAKSHelmChartReleaseResponseBodyChartReleases setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ListAKSHelmChartReleaseResponseBodyChartReleases setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListAKSHelmChartReleaseResponseBodyChartReleases setReleaseLog(String releaseLog) {
            this.releaseLog = releaseLog;
            return this;
        }
        public String getReleaseLog() {
            return this.releaseLog;
        }

        public ListAKSHelmChartReleaseResponseBodyChartReleases setReleaseName(String releaseName) {
            this.releaseName = releaseName;
            return this;
        }
        public String getReleaseName() {
            return this.releaseName;
        }

        public ListAKSHelmChartReleaseResponseBodyChartReleases setRevision(Long revision) {
            this.revision = revision;
            return this;
        }
        public Long getRevision() {
            return this.revision;
        }

        public ListAKSHelmChartReleaseResponseBodyChartReleases setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public ListAKSHelmChartReleaseResponseBodyChartReleases setSuperseded(Long superseded) {
            this.superseded = superseded;
            return this;
        }
        public Long getSuperseded() {
            return this.superseded;
        }

        public ListAKSHelmChartReleaseResponseBodyChartReleases setExtraData(ListAKSHelmChartReleaseResponseBodyChartReleasesExtraData extraData) {
            this.extraData = extraData;
            return this;
        }
        public ListAKSHelmChartReleaseResponseBodyChartReleasesExtraData getExtraData() {
            return this.extraData;
        }

    }

}
