// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListAKSHelmChartReleaseVersionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("ReleaseVersions")
    public java.util.List<ListAKSHelmChartReleaseVersionResponseBodyReleaseVersions> releaseVersions;

    public static ListAKSHelmChartReleaseVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAKSHelmChartReleaseVersionResponseBody self = new ListAKSHelmChartReleaseVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAKSHelmChartReleaseVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAKSHelmChartReleaseVersionResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListAKSHelmChartReleaseVersionResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListAKSHelmChartReleaseVersionResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListAKSHelmChartReleaseVersionResponseBody setReleaseVersions(java.util.List<ListAKSHelmChartReleaseVersionResponseBodyReleaseVersions> releaseVersions) {
        this.releaseVersions = releaseVersions;
        return this;
    }
    public java.util.List<ListAKSHelmChartReleaseVersionResponseBodyReleaseVersions> getReleaseVersions() {
        return this.releaseVersions;
    }

    public static class ListAKSHelmChartReleaseVersionResponseBodyReleaseVersions extends TeaModel {
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

        public static ListAKSHelmChartReleaseVersionResponseBodyReleaseVersions build(java.util.Map<String, ?> map) throws Exception {
            ListAKSHelmChartReleaseVersionResponseBodyReleaseVersions self = new ListAKSHelmChartReleaseVersionResponseBodyReleaseVersions();
            return TeaModel.build(map, self);
        }

        public ListAKSHelmChartReleaseVersionResponseBodyReleaseVersions setChartId(String chartId) {
            this.chartId = chartId;
            return this;
        }
        public String getChartId() {
            return this.chartId;
        }

        public ListAKSHelmChartReleaseVersionResponseBodyReleaseVersions setChartName(String chartName) {
            this.chartName = chartName;
            return this;
        }
        public String getChartName() {
            return this.chartName;
        }

        public ListAKSHelmChartReleaseVersionResponseBodyReleaseVersions setChartVersion(String chartVersion) {
            this.chartVersion = chartVersion;
            return this;
        }
        public String getChartVersion() {
            return this.chartVersion;
        }

        public ListAKSHelmChartReleaseVersionResponseBodyReleaseVersions setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public ListAKSHelmChartReleaseVersionResponseBodyReleaseVersions setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public ListAKSHelmChartReleaseVersionResponseBodyReleaseVersions setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListAKSHelmChartReleaseVersionResponseBodyReleaseVersions setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListAKSHelmChartReleaseVersionResponseBodyReleaseVersions setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ListAKSHelmChartReleaseVersionResponseBodyReleaseVersions setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListAKSHelmChartReleaseVersionResponseBodyReleaseVersions setReleaseLog(String releaseLog) {
            this.releaseLog = releaseLog;
            return this;
        }
        public String getReleaseLog() {
            return this.releaseLog;
        }

        public ListAKSHelmChartReleaseVersionResponseBodyReleaseVersions setReleaseName(String releaseName) {
            this.releaseName = releaseName;
            return this;
        }
        public String getReleaseName() {
            return this.releaseName;
        }

        public ListAKSHelmChartReleaseVersionResponseBodyReleaseVersions setRevision(Long revision) {
            this.revision = revision;
            return this;
        }
        public Long getRevision() {
            return this.revision;
        }

        public ListAKSHelmChartReleaseVersionResponseBodyReleaseVersions setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public ListAKSHelmChartReleaseVersionResponseBodyReleaseVersions setSuperseded(Long superseded) {
            this.superseded = superseded;
            return this;
        }
        public Long getSuperseded() {
            return this.superseded;
        }

    }

}
