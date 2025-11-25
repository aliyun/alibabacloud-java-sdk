// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateMultiUserInstancesRequest extends TeaModel {
    @NameInMap("MemberInstances")
    public java.util.List<UpdateMultiUserInstancesRequestMemberInstances> memberInstances;

    public static UpdateMultiUserInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMultiUserInstancesRequest self = new UpdateMultiUserInstancesRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMultiUserInstancesRequest setMemberInstances(java.util.List<UpdateMultiUserInstancesRequestMemberInstances> memberInstances) {
        this.memberInstances = memberInstances;
        return this;
    }
    public java.util.List<UpdateMultiUserInstancesRequestMemberInstances> getMemberInstances() {
        return this.memberInstances;
    }

    public static class UpdateMultiUserInstancesRequestMemberInstancesVersionSummary extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("CoreCount")
        public Long coreCount;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("EcsCount")
        public Long ecsCount;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Version")
        public Integer version;

        public static UpdateMultiUserInstancesRequestMemberInstancesVersionSummary build(java.util.Map<String, ?> map) throws Exception {
            UpdateMultiUserInstancesRequestMemberInstancesVersionSummary self = new UpdateMultiUserInstancesRequestMemberInstancesVersionSummary();
            return TeaModel.build(map, self);
        }

        public UpdateMultiUserInstancesRequestMemberInstancesVersionSummary setCoreCount(Long coreCount) {
            this.coreCount = coreCount;
            return this;
        }
        public Long getCoreCount() {
            return this.coreCount;
        }

        public UpdateMultiUserInstancesRequestMemberInstancesVersionSummary setEcsCount(Long ecsCount) {
            this.ecsCount = ecsCount;
            return this;
        }
        public Long getEcsCount() {
            return this.ecsCount;
        }

        public UpdateMultiUserInstancesRequestMemberInstancesVersionSummary setVersion(Integer version) {
            this.version = version;
            return this;
        }
        public Integer getVersion() {
            return this.version;
        }

    }

    public static class UpdateMultiUserInstancesRequestMemberInstances extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1766185894104675</p>
         */
        @NameInMap("AliUid")
        public Long aliUid;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("AntiRansomwareCapacity")
        public Long antiRansomwareCapacity;

        /**
         * <strong>example:</strong>
         * <p>PREPAID</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CspmCapacity")
        public Long cspmCapacity;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("HoneypotCapacity")
        public Long honeypotCapacity;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ImageScanCapacity")
        public Long imageScanCapacity;

        /**
         * <strong>example:</strong>
         * <p>sas-p0anpb26my69</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>CHANGE</p>
         */
        @NameInMap("OptType")
        public String optType;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RaspCapacity")
        public Long raspCapacity;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("SdkCapacity")
        public Long sdkCapacity;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("SlsCapacity")
        public Long slsCapacity;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("ThreatAnalysisCapacity")
        public Long threatAnalysisCapacity;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ThreatAnalysisFlow")
        public Long threatAnalysisFlow;

        /**
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("Version")
        public String version;

        @NameInMap("VersionSummary")
        public java.util.List<UpdateMultiUserInstancesRequestMemberInstancesVersionSummary> versionSummary;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("WebLockCapacity")
        public Long webLockCapacity;

        public static UpdateMultiUserInstancesRequestMemberInstances build(java.util.Map<String, ?> map) throws Exception {
            UpdateMultiUserInstancesRequestMemberInstances self = new UpdateMultiUserInstancesRequestMemberInstances();
            return TeaModel.build(map, self);
        }

        public UpdateMultiUserInstancesRequestMemberInstances setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public UpdateMultiUserInstancesRequestMemberInstances setAntiRansomwareCapacity(Long antiRansomwareCapacity) {
            this.antiRansomwareCapacity = antiRansomwareCapacity;
            return this;
        }
        public Long getAntiRansomwareCapacity() {
            return this.antiRansomwareCapacity;
        }

        public UpdateMultiUserInstancesRequestMemberInstances setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public UpdateMultiUserInstancesRequestMemberInstances setCspmCapacity(Long cspmCapacity) {
            this.cspmCapacity = cspmCapacity;
            return this;
        }
        public Long getCspmCapacity() {
            return this.cspmCapacity;
        }

        public UpdateMultiUserInstancesRequestMemberInstances setHoneypotCapacity(Long honeypotCapacity) {
            this.honeypotCapacity = honeypotCapacity;
            return this;
        }
        public Long getHoneypotCapacity() {
            return this.honeypotCapacity;
        }

        public UpdateMultiUserInstancesRequestMemberInstances setImageScanCapacity(Long imageScanCapacity) {
            this.imageScanCapacity = imageScanCapacity;
            return this;
        }
        public Long getImageScanCapacity() {
            return this.imageScanCapacity;
        }

        public UpdateMultiUserInstancesRequestMemberInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public UpdateMultiUserInstancesRequestMemberInstances setOptType(String optType) {
            this.optType = optType;
            return this;
        }
        public String getOptType() {
            return this.optType;
        }

        public UpdateMultiUserInstancesRequestMemberInstances setRaspCapacity(Long raspCapacity) {
            this.raspCapacity = raspCapacity;
            return this;
        }
        public Long getRaspCapacity() {
            return this.raspCapacity;
        }

        public UpdateMultiUserInstancesRequestMemberInstances setSdkCapacity(Long sdkCapacity) {
            this.sdkCapacity = sdkCapacity;
            return this;
        }
        public Long getSdkCapacity() {
            return this.sdkCapacity;
        }

        public UpdateMultiUserInstancesRequestMemberInstances setSlsCapacity(Long slsCapacity) {
            this.slsCapacity = slsCapacity;
            return this;
        }
        public Long getSlsCapacity() {
            return this.slsCapacity;
        }

        public UpdateMultiUserInstancesRequestMemberInstances setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public UpdateMultiUserInstancesRequestMemberInstances setThreatAnalysisCapacity(Long threatAnalysisCapacity) {
            this.threatAnalysisCapacity = threatAnalysisCapacity;
            return this;
        }
        public Long getThreatAnalysisCapacity() {
            return this.threatAnalysisCapacity;
        }

        public UpdateMultiUserInstancesRequestMemberInstances setThreatAnalysisFlow(Long threatAnalysisFlow) {
            this.threatAnalysisFlow = threatAnalysisFlow;
            return this;
        }
        public Long getThreatAnalysisFlow() {
            return this.threatAnalysisFlow;
        }

        public UpdateMultiUserInstancesRequestMemberInstances setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public UpdateMultiUserInstancesRequestMemberInstances setVersionSummary(java.util.List<UpdateMultiUserInstancesRequestMemberInstancesVersionSummary> versionSummary) {
            this.versionSummary = versionSummary;
            return this;
        }
        public java.util.List<UpdateMultiUserInstancesRequestMemberInstancesVersionSummary> getVersionSummary() {
            return this.versionSummary;
        }

        public UpdateMultiUserInstancesRequestMemberInstances setWebLockCapacity(Long webLockCapacity) {
            this.webLockCapacity = webLockCapacity;
            return this;
        }
        public Long getWebLockCapacity() {
            return this.webLockCapacity;
        }

    }

}
