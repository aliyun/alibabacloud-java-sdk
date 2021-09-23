// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class GetInstanceUpgradeInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("InstanceUpgradeInfo")
    public GetInstanceUpgradeInfoResponseBodyInstanceUpgradeInfo instanceUpgradeInfo;

    public static GetInstanceUpgradeInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceUpgradeInfoResponseBody self = new GetInstanceUpgradeInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceUpgradeInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInstanceUpgradeInfoResponseBody setInstanceUpgradeInfo(GetInstanceUpgradeInfoResponseBodyInstanceUpgradeInfo instanceUpgradeInfo) {
        this.instanceUpgradeInfo = instanceUpgradeInfo;
        return this;
    }
    public GetInstanceUpgradeInfoResponseBodyInstanceUpgradeInfo getInstanceUpgradeInfo() {
        return this.instanceUpgradeInfo;
    }

    public static class GetInstanceUpgradeInfoResponseBodyInstanceUpgradeInfoCandidatePeriodList extends TeaModel {
        @NameInMap("CandidateStartTime")
        public Long candidateStartTime;

        @NameInMap("CandidateEndTime")
        public Long candidateEndTime;

        public static GetInstanceUpgradeInfoResponseBodyInstanceUpgradeInfoCandidatePeriodList build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceUpgradeInfoResponseBodyInstanceUpgradeInfoCandidatePeriodList self = new GetInstanceUpgradeInfoResponseBodyInstanceUpgradeInfoCandidatePeriodList();
            return TeaModel.build(map, self);
        }

        public GetInstanceUpgradeInfoResponseBodyInstanceUpgradeInfoCandidatePeriodList setCandidateStartTime(Long candidateStartTime) {
            this.candidateStartTime = candidateStartTime;
            return this;
        }
        public Long getCandidateStartTime() {
            return this.candidateStartTime;
        }

        public GetInstanceUpgradeInfoResponseBodyInstanceUpgradeInfoCandidatePeriodList setCandidateEndTime(Long candidateEndTime) {
            this.candidateEndTime = candidateEndTime;
            return this;
        }
        public Long getCandidateEndTime() {
            return this.candidateEndTime;
        }

    }

    public static class GetInstanceUpgradeInfoResponseBodyInstanceUpgradeInfoInvalidPeriodList extends TeaModel {
        @NameInMap("InvalidEndTime")
        public Long invalidEndTime;

        @NameInMap("InvalidStartTime")
        public Long invalidStartTime;

        public static GetInstanceUpgradeInfoResponseBodyInstanceUpgradeInfoInvalidPeriodList build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceUpgradeInfoResponseBodyInstanceUpgradeInfoInvalidPeriodList self = new GetInstanceUpgradeInfoResponseBodyInstanceUpgradeInfoInvalidPeriodList();
            return TeaModel.build(map, self);
        }

        public GetInstanceUpgradeInfoResponseBodyInstanceUpgradeInfoInvalidPeriodList setInvalidEndTime(Long invalidEndTime) {
            this.invalidEndTime = invalidEndTime;
            return this;
        }
        public Long getInvalidEndTime() {
            return this.invalidEndTime;
        }

        public GetInstanceUpgradeInfoResponseBodyInstanceUpgradeInfoInvalidPeriodList setInvalidStartTime(Long invalidStartTime) {
            this.invalidStartTime = invalidStartTime;
            return this;
        }
        public Long getInvalidStartTime() {
            return this.invalidStartTime;
        }

    }

    public static class GetInstanceUpgradeInfoResponseBodyInstanceUpgradeInfo extends TeaModel {
        @NameInMap("UpgradeMode")
        public String upgradeMode;

        @NameInMap("Operable")
        public Boolean operable;

        @NameInMap("AliUid")
        public Long aliUid;

        @NameInMap("LatestStartTime")
        public Long latestStartTime;

        @NameInMap("ImageVersion")
        public String imageVersion;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("PeriodInterval")
        public Integer periodInterval;

        @NameInMap("UpgradeStartTime")
        public Long upgradeStartTime;

        @NameInMap("UpgradeEndTime")
        public Long upgradeEndTime;

        @NameInMap("CandidatePeriodList")
        public java.util.List<GetInstanceUpgradeInfoResponseBodyInstanceUpgradeInfoCandidatePeriodList> candidatePeriodList;

        @NameInMap("InvalidPeriodList")
        public java.util.List<GetInstanceUpgradeInfoResponseBodyInstanceUpgradeInfoInvalidPeriodList> invalidPeriodList;

        public static GetInstanceUpgradeInfoResponseBodyInstanceUpgradeInfo build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceUpgradeInfoResponseBodyInstanceUpgradeInfo self = new GetInstanceUpgradeInfoResponseBodyInstanceUpgradeInfo();
            return TeaModel.build(map, self);
        }

        public GetInstanceUpgradeInfoResponseBodyInstanceUpgradeInfo setUpgradeMode(String upgradeMode) {
            this.upgradeMode = upgradeMode;
            return this;
        }
        public String getUpgradeMode() {
            return this.upgradeMode;
        }

        public GetInstanceUpgradeInfoResponseBodyInstanceUpgradeInfo setOperable(Boolean operable) {
            this.operable = operable;
            return this;
        }
        public Boolean getOperable() {
            return this.operable;
        }

        public GetInstanceUpgradeInfoResponseBodyInstanceUpgradeInfo setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public GetInstanceUpgradeInfoResponseBodyInstanceUpgradeInfo setLatestStartTime(Long latestStartTime) {
            this.latestStartTime = latestStartTime;
            return this;
        }
        public Long getLatestStartTime() {
            return this.latestStartTime;
        }

        public GetInstanceUpgradeInfoResponseBodyInstanceUpgradeInfo setImageVersion(String imageVersion) {
            this.imageVersion = imageVersion;
            return this;
        }
        public String getImageVersion() {
            return this.imageVersion;
        }

        public GetInstanceUpgradeInfoResponseBodyInstanceUpgradeInfo setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetInstanceUpgradeInfoResponseBodyInstanceUpgradeInfo setPeriodInterval(Integer periodInterval) {
            this.periodInterval = periodInterval;
            return this;
        }
        public Integer getPeriodInterval() {
            return this.periodInterval;
        }

        public GetInstanceUpgradeInfoResponseBodyInstanceUpgradeInfo setUpgradeStartTime(Long upgradeStartTime) {
            this.upgradeStartTime = upgradeStartTime;
            return this;
        }
        public Long getUpgradeStartTime() {
            return this.upgradeStartTime;
        }

        public GetInstanceUpgradeInfoResponseBodyInstanceUpgradeInfo setUpgradeEndTime(Long upgradeEndTime) {
            this.upgradeEndTime = upgradeEndTime;
            return this;
        }
        public Long getUpgradeEndTime() {
            return this.upgradeEndTime;
        }

        public GetInstanceUpgradeInfoResponseBodyInstanceUpgradeInfo setCandidatePeriodList(java.util.List<GetInstanceUpgradeInfoResponseBodyInstanceUpgradeInfoCandidatePeriodList> candidatePeriodList) {
            this.candidatePeriodList = candidatePeriodList;
            return this;
        }
        public java.util.List<GetInstanceUpgradeInfoResponseBodyInstanceUpgradeInfoCandidatePeriodList> getCandidatePeriodList() {
            return this.candidatePeriodList;
        }

        public GetInstanceUpgradeInfoResponseBodyInstanceUpgradeInfo setInvalidPeriodList(java.util.List<GetInstanceUpgradeInfoResponseBodyInstanceUpgradeInfoInvalidPeriodList> invalidPeriodList) {
            this.invalidPeriodList = invalidPeriodList;
            return this;
        }
        public java.util.List<GetInstanceUpgradeInfoResponseBodyInstanceUpgradeInfoInvalidPeriodList> getInvalidPeriodList() {
            return this.invalidPeriodList;
        }

    }

}
