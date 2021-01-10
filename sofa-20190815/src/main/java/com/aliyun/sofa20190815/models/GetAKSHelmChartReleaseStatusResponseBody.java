// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetAKSHelmChartReleaseStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("SubChartReleases")
    public java.util.List<GetAKSHelmChartReleaseStatusResponseBodySubChartReleases> subChartReleases;

    @NameInMap("MainChartRelease")
    public GetAKSHelmChartReleaseStatusResponseBodyMainChartRelease mainChartRelease;

    public static GetAKSHelmChartReleaseStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAKSHelmChartReleaseStatusResponseBody self = new GetAKSHelmChartReleaseStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAKSHelmChartReleaseStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAKSHelmChartReleaseStatusResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetAKSHelmChartReleaseStatusResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetAKSHelmChartReleaseStatusResponseBody setSubChartReleases(java.util.List<GetAKSHelmChartReleaseStatusResponseBodySubChartReleases> subChartReleases) {
        this.subChartReleases = subChartReleases;
        return this;
    }
    public java.util.List<GetAKSHelmChartReleaseStatusResponseBodySubChartReleases> getSubChartReleases() {
        return this.subChartReleases;
    }

    public GetAKSHelmChartReleaseStatusResponseBody setMainChartRelease(GetAKSHelmChartReleaseStatusResponseBodyMainChartRelease mainChartRelease) {
        this.mainChartRelease = mainChartRelease;
        return this;
    }
    public GetAKSHelmChartReleaseStatusResponseBodyMainChartRelease getMainChartRelease() {
        return this.mainChartRelease;
    }

    public static class GetAKSHelmChartReleaseStatusResponseBodySubChartReleases extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("MainChartReleaseId")
        public String mainChartReleaseId;

        @NameInMap("ReleaseLog")
        public String releaseLog;

        @NameInMap("Revision")
        public Long revision;

        @NameInMap("Status")
        public Long status;

        @NameInMap("SubChartName")
        public String subChartName;

        @NameInMap("SubChartReleaseName")
        public String subChartReleaseName;

        @NameInMap("SubChartVersion")
        public String subChartVersion;

        @NameInMap("Superseded")
        public Long superseded;

        public static GetAKSHelmChartReleaseStatusResponseBodySubChartReleases build(java.util.Map<String, ?> map) throws Exception {
            GetAKSHelmChartReleaseStatusResponseBodySubChartReleases self = new GetAKSHelmChartReleaseStatusResponseBodySubChartReleases();
            return TeaModel.build(map, self);
        }

        public GetAKSHelmChartReleaseStatusResponseBodySubChartReleases setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetAKSHelmChartReleaseStatusResponseBodySubChartReleases setMainChartReleaseId(String mainChartReleaseId) {
            this.mainChartReleaseId = mainChartReleaseId;
            return this;
        }
        public String getMainChartReleaseId() {
            return this.mainChartReleaseId;
        }

        public GetAKSHelmChartReleaseStatusResponseBodySubChartReleases setReleaseLog(String releaseLog) {
            this.releaseLog = releaseLog;
            return this;
        }
        public String getReleaseLog() {
            return this.releaseLog;
        }

        public GetAKSHelmChartReleaseStatusResponseBodySubChartReleases setRevision(Long revision) {
            this.revision = revision;
            return this;
        }
        public Long getRevision() {
            return this.revision;
        }

        public GetAKSHelmChartReleaseStatusResponseBodySubChartReleases setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public GetAKSHelmChartReleaseStatusResponseBodySubChartReleases setSubChartName(String subChartName) {
            this.subChartName = subChartName;
            return this;
        }
        public String getSubChartName() {
            return this.subChartName;
        }

        public GetAKSHelmChartReleaseStatusResponseBodySubChartReleases setSubChartReleaseName(String subChartReleaseName) {
            this.subChartReleaseName = subChartReleaseName;
            return this;
        }
        public String getSubChartReleaseName() {
            return this.subChartReleaseName;
        }

        public GetAKSHelmChartReleaseStatusResponseBodySubChartReleases setSubChartVersion(String subChartVersion) {
            this.subChartVersion = subChartVersion;
            return this;
        }
        public String getSubChartVersion() {
            return this.subChartVersion;
        }

        public GetAKSHelmChartReleaseStatusResponseBodySubChartReleases setSuperseded(Long superseded) {
            this.superseded = superseded;
            return this;
        }
        public Long getSuperseded() {
            return this.superseded;
        }

    }

    public static class GetAKSHelmChartReleaseStatusResponseBodyMainChartRelease extends TeaModel {
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

        public static GetAKSHelmChartReleaseStatusResponseBodyMainChartRelease build(java.util.Map<String, ?> map) throws Exception {
            GetAKSHelmChartReleaseStatusResponseBodyMainChartRelease self = new GetAKSHelmChartReleaseStatusResponseBodyMainChartRelease();
            return TeaModel.build(map, self);
        }

        public GetAKSHelmChartReleaseStatusResponseBodyMainChartRelease setChartId(String chartId) {
            this.chartId = chartId;
            return this;
        }
        public String getChartId() {
            return this.chartId;
        }

        public GetAKSHelmChartReleaseStatusResponseBodyMainChartRelease setChartName(String chartName) {
            this.chartName = chartName;
            return this;
        }
        public String getChartName() {
            return this.chartName;
        }

        public GetAKSHelmChartReleaseStatusResponseBodyMainChartRelease setChartVersion(String chartVersion) {
            this.chartVersion = chartVersion;
            return this;
        }
        public String getChartVersion() {
            return this.chartVersion;
        }

        public GetAKSHelmChartReleaseStatusResponseBodyMainChartRelease setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public GetAKSHelmChartReleaseStatusResponseBodyMainChartRelease setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public GetAKSHelmChartReleaseStatusResponseBodyMainChartRelease setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetAKSHelmChartReleaseStatusResponseBodyMainChartRelease setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetAKSHelmChartReleaseStatusResponseBodyMainChartRelease setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public GetAKSHelmChartReleaseStatusResponseBodyMainChartRelease setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public GetAKSHelmChartReleaseStatusResponseBodyMainChartRelease setReleaseLog(String releaseLog) {
            this.releaseLog = releaseLog;
            return this;
        }
        public String getReleaseLog() {
            return this.releaseLog;
        }

        public GetAKSHelmChartReleaseStatusResponseBodyMainChartRelease setReleaseName(String releaseName) {
            this.releaseName = releaseName;
            return this;
        }
        public String getReleaseName() {
            return this.releaseName;
        }

        public GetAKSHelmChartReleaseStatusResponseBodyMainChartRelease setRevision(Long revision) {
            this.revision = revision;
            return this;
        }
        public Long getRevision() {
            return this.revision;
        }

        public GetAKSHelmChartReleaseStatusResponseBodyMainChartRelease setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public GetAKSHelmChartReleaseStatusResponseBodyMainChartRelease setSuperseded(Long superseded) {
            this.superseded = superseded;
            return this;
        }
        public Long getSuperseded() {
            return this.superseded;
        }

    }

}
