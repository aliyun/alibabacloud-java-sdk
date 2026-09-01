// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateMultiUserInstancesRequest extends TeaModel {
    /**
     * <p>The member instances.</p>
     */
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
         * <p>The number of authorized cores assigned to the member.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("CoreCount")
        public Long coreCount;

        /**
         * <p>The number of authorized instances assigned to the member.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("EcsCount")
        public Long ecsCount;

        /**
         * <p>The Security Center edition of the member accounts. Valid values:  </p>
         * <ul>
         * <li><strong>1</strong>: Free Edition </li>
         * <li><strong>3</strong>: Enterprise Edition</li>
         * <li><strong>5</strong>: Premium Edition</li>
         * <li><strong>6</strong>: Anti-virus Edition    </li>
         * <li><strong>7</strong>: Ultimate Edition   </li>
         * <li><strong>8</strong>: multi-edition   </li>
         * <li><strong>10</strong>: value-added services only</li>
         * </ul>
         * 
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
         * <p>The Alibaba Cloud account UID of the member.</p>
         * 
         * <strong>example:</strong>
         * <p>1766185894104675</p>
         */
        @NameInMap("AliUid")
        public Long aliUid;

        /**
         * <p>The anti-ransomware capacity assigned to the member. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("AntiRansomwareCapacity")
        public Long antiRansomwareCapacity;

        /**
         * <p>The billing type. Valid values:</p>
         * <ul>
         * <li><strong>PREPAID</strong>: upfront.</li>
         * <li><strong>POSTPAID</strong> (default): pay-as-you-go.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PREPAID</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>The number of cloud platform configuration check scans assigned to the member. Unit: scans per month.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CspmCapacity")
        public Long cspmCapacity;

        @NameInMap("CspmInstanceCapacity")
        public Long cspmInstanceCapacity;

        /**
         * <p>The number of honeypot quotas assigned to the member.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("HoneypotCapacity")
        public Long honeypotCapacity;

        /**
         * <p>The number of image scan quotas assigned to the member.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ImageScanCapacity")
        public Long imageScanCapacity;

        /**
         * <p>The Security Center instance ID purchased by the member accounts.</p>
         * 
         * <strong>example:</strong>
         * <p>sas-p0anpb26my69</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The operation type. Valid values:  </p>
         * <ul>
         * <li><strong>ADD</strong>: increase </li>
         * <li><strong>CHANGE</strong>: update</li>
         * <li><strong>DEL</strong>: delete</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CHANGE</p>
         */
        @NameInMap("OptType")
        public String optType;

        /**
         * <p>The number of application protection quotas assigned to the member. Unit: quotas per month.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RaspCapacity")
        public Long raspCapacity;

        /**
         * <p>The number of malicious file detection SDK quotas assigned to the member.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("SdkCapacity")
        public Long sdkCapacity;

        /**
         * <p>The log storage capacity assigned to the member. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("SlsCapacity")
        public Long slsCapacity;

        /**
         * <p>The instance status of the member accounts. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: active.</li>
         * <li><strong>2</strong>: expired.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The threat analysis capacity assigned to the member. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("ThreatAnalysisCapacity")
        public Long threatAnalysisCapacity;

        /**
         * <p>The log ingestion traffic for threat detection and response assigned to the member. Unit: GB/day.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ThreatAnalysisFlow")
        public Long threatAnalysisFlow;

        /**
         * <p>The Security Center edition to bind. Valid values:  </p>
         * <ul>
         * <li><strong>1</strong>: Free Edition </li>
         * <li><strong>3</strong>: Enterprise Edition</li>
         * <li><strong>5</strong>: Advanced Edition</li>
         * <li><strong>6</strong>: Anti-virus Edition    </li>
         * <li><strong>7</strong>: Ultimate Edition</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("Version")
        public String version;

        /**
         * <p>The authorization usage information of the member accounts.</p>
         */
        @NameInMap("VersionSummary")
        public java.util.List<UpdateMultiUserInstancesRequestMemberInstancesVersionSummary> versionSummary;

        /**
         * <p>The number of web tamper-proofing authorization quotas assigned to the member.</p>
         * 
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

        public UpdateMultiUserInstancesRequestMemberInstances setCspmInstanceCapacity(Long cspmInstanceCapacity) {
            this.cspmInstanceCapacity = cspmInstanceCapacity;
            return this;
        }
        public Long getCspmInstanceCapacity() {
            return this.cspmInstanceCapacity;
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
