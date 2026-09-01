// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetInstanceAuthRangeResponseBody extends TeaModel {
    /**
     * <p>The instance authorization range validation.</p>
     */
    @NameInMap("InstanceAuthRange")
    public GetInstanceAuthRangeResponseBodyInstanceAuthRange instanceAuthRange;

    /**
     * <p>The ID of the request. Alibaba Cloud generates a unique identifier for each request. You can use the ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>F8B6F758-BCD4-597A-8A2C-DA5A552C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetInstanceAuthRangeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceAuthRangeResponseBody self = new GetInstanceAuthRangeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceAuthRangeResponseBody setInstanceAuthRange(GetInstanceAuthRangeResponseBodyInstanceAuthRange instanceAuthRange) {
        this.instanceAuthRange = instanceAuthRange;
        return this;
    }
    public GetInstanceAuthRangeResponseBodyInstanceAuthRange getInstanceAuthRange() {
        return this.instanceAuthRange;
    }

    public GetInstanceAuthRangeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetInstanceAuthRangeResponseBodyInstanceAuthRange extends TeaModel {
        /**
         * <p>The number of instances for the Advanced Edition. Valid values:</p>
         * <ul>
         * <li><strong>1-2000000000</strong>: range</li>
         * <li><strong>1</strong>: step</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1-2000000000:1</p>
         */
        @NameInMap("AdvancedCount")
        public String advancedCount;

        /**
         * <p>The anti-ransomware capacity. Valid values:</p>
         * <ul>
         * <li><strong>1-9000000000</strong>: range</li>
         * <li><strong>10</strong>: step</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0-9000000000:10</p>
         */
        @NameInMap("AntiRansomwareCapacity")
        public String antiRansomwareCapacity;

        /**
         * <p>The anti-ransomware managed service. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Not activated.</li>
         * <li><strong>1</strong>: Activated.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AntiRansomwareService")
        public Integer antiRansomwareService;

        /**
         * <p>The number of cores for Anti-virus Edition. Valid values:</p>
         * <ul>
         * <li><strong>1-2000000000</strong>: range</li>
         * <li><strong>1</strong>: step</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1-2000000000:1</p>
         */
        @NameInMap("AntiVirusCore")
        public String antiVirusCore;

        /**
         * <p>The number of cores for the Ultimate Edition. Valid values:</p>
         * <ul>
         * <li><strong>1-2000000000</strong>: range</li>
         * <li><strong>1</strong>: step</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1-2000000000:1</p>
         */
        @NameInMap("ContainerCore")
        public String containerCore;

        /**
         * <p>The number of instances for the Ultimate Edition. Valid values:</p>
         * <ul>
         * <li><strong>1-2000000000</strong>: range</li>
         * <li><strong>1</strong>: step</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1-2000000000:1</p>
         */
        @NameInMap("ContainerCount")
        public String containerCount;

        /**
         * <p>The number of cloud platform configuration check scans. Valid values:</p>
         * <ul>
         * <li><strong>15000-9999999999</strong>: range</li>
         * <li><strong>55000</strong>: step</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>15000-9999999999:55000</p>
         */
        @NameInMap("CspmCapacity")
        public String cspmCapacity;

        @NameInMap("CspmInstanceCapacity")
        public String cspmInstanceCapacity;

        /**
         * <p>The number of instances for the Enterprise Edition. Valid values:</p>
         * <ul>
         * <li><strong>Value</strong>: 1-2000000000</li>
         * <li><strong>Step</strong>: 1</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1-2000000000:1</p>
         */
        @NameInMap("EnterpriseCount")
        public String enterpriseCount;

        /**
         * <p>The number of honeypot authorizations. Valid values:</p>
         * <ul>
         * <li><strong>20-500</strong>: range</li>
         * <li><strong>1</strong>: step</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>20-500:1</p>
         */
        @NameInMap("HoneypotCapacity")
        public String honeypotCapacity;

        /**
         * <p>The number of image scan authorizations. Valid values:</p>
         * <ul>
         * <li><strong>1-200000</strong>: range</li>
         * <li><strong>20</strong>: step</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0-200000:20</p>
         */
        @NameInMap("ImageScanCapacity")
        public String imageScanCapacity;

        /**
         * <p>The number of application protection authorizations. Valid values:</p>
         * <ul>
         * <li><strong>1-100000000</strong>: range</li>
         * <li><strong>1</strong>: step</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0-100000000:1</p>
         */
        @NameInMap("RaspCapacity")
        public String raspCapacity;

        /**
         * <p>The number of malicious file detection SDK authorizations. Valid values:</p>
         * <ul>
         * <li><strong>10-9999999999</strong>: range</li>
         * <li><strong>10</strong>: step</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10-9999999999:10</p>
         */
        @NameInMap("SdkCapacity")
        public String sdkCapacity;

        /**
         * <p>The log storage capacity. Valid values:</p>
         * <ul>
         * <li><strong>1-600000000</strong>: range</li>
         * <li><strong>10</strong>: step</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0-600000000:10</p>
         */
        @NameInMap("SlsCapacity")
        public String slsCapacity;

        /**
         * <p>The threat analysis capacity. Valid values:</p>
         * <ul>
         * <li><strong>1-9999999999</strong>: range</li>
         * <li><strong>1000</strong>: step</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0-9999999999:1000</p>
         */
        @NameInMap("ThreatAnalysisCapacity")
        public String threatAnalysisCapacity;

        /**
         * <p>The log ingestion traffic for threat detection and response. Valid values:</p>
         * <ul>
         * <li><strong>1-9999999999</strong>: range</li>
         * <li><strong>100</strong>: step</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0-9999999999:100</p>
         */
        @NameInMap("ThreatAnalysisFlow")
        public String threatAnalysisFlow;

        /**
         * <p>The number of web tamper-proofing authorizations. Valid values:</p>
         * <ul>
         * <li><strong>1-9999</strong>: range</li>
         * <li><strong>1</strong>: step</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0-9999:1</p>
         */
        @NameInMap("WebLockCapacity")
        public String webLockCapacity;

        public static GetInstanceAuthRangeResponseBodyInstanceAuthRange build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceAuthRangeResponseBodyInstanceAuthRange self = new GetInstanceAuthRangeResponseBodyInstanceAuthRange();
            return TeaModel.build(map, self);
        }

        public GetInstanceAuthRangeResponseBodyInstanceAuthRange setAdvancedCount(String advancedCount) {
            this.advancedCount = advancedCount;
            return this;
        }
        public String getAdvancedCount() {
            return this.advancedCount;
        }

        public GetInstanceAuthRangeResponseBodyInstanceAuthRange setAntiRansomwareCapacity(String antiRansomwareCapacity) {
            this.antiRansomwareCapacity = antiRansomwareCapacity;
            return this;
        }
        public String getAntiRansomwareCapacity() {
            return this.antiRansomwareCapacity;
        }

        public GetInstanceAuthRangeResponseBodyInstanceAuthRange setAntiRansomwareService(Integer antiRansomwareService) {
            this.antiRansomwareService = antiRansomwareService;
            return this;
        }
        public Integer getAntiRansomwareService() {
            return this.antiRansomwareService;
        }

        public GetInstanceAuthRangeResponseBodyInstanceAuthRange setAntiVirusCore(String antiVirusCore) {
            this.antiVirusCore = antiVirusCore;
            return this;
        }
        public String getAntiVirusCore() {
            return this.antiVirusCore;
        }

        public GetInstanceAuthRangeResponseBodyInstanceAuthRange setContainerCore(String containerCore) {
            this.containerCore = containerCore;
            return this;
        }
        public String getContainerCore() {
            return this.containerCore;
        }

        public GetInstanceAuthRangeResponseBodyInstanceAuthRange setContainerCount(String containerCount) {
            this.containerCount = containerCount;
            return this;
        }
        public String getContainerCount() {
            return this.containerCount;
        }

        public GetInstanceAuthRangeResponseBodyInstanceAuthRange setCspmCapacity(String cspmCapacity) {
            this.cspmCapacity = cspmCapacity;
            return this;
        }
        public String getCspmCapacity() {
            return this.cspmCapacity;
        }

        public GetInstanceAuthRangeResponseBodyInstanceAuthRange setCspmInstanceCapacity(String cspmInstanceCapacity) {
            this.cspmInstanceCapacity = cspmInstanceCapacity;
            return this;
        }
        public String getCspmInstanceCapacity() {
            return this.cspmInstanceCapacity;
        }

        public GetInstanceAuthRangeResponseBodyInstanceAuthRange setEnterpriseCount(String enterpriseCount) {
            this.enterpriseCount = enterpriseCount;
            return this;
        }
        public String getEnterpriseCount() {
            return this.enterpriseCount;
        }

        public GetInstanceAuthRangeResponseBodyInstanceAuthRange setHoneypotCapacity(String honeypotCapacity) {
            this.honeypotCapacity = honeypotCapacity;
            return this;
        }
        public String getHoneypotCapacity() {
            return this.honeypotCapacity;
        }

        public GetInstanceAuthRangeResponseBodyInstanceAuthRange setImageScanCapacity(String imageScanCapacity) {
            this.imageScanCapacity = imageScanCapacity;
            return this;
        }
        public String getImageScanCapacity() {
            return this.imageScanCapacity;
        }

        public GetInstanceAuthRangeResponseBodyInstanceAuthRange setRaspCapacity(String raspCapacity) {
            this.raspCapacity = raspCapacity;
            return this;
        }
        public String getRaspCapacity() {
            return this.raspCapacity;
        }

        public GetInstanceAuthRangeResponseBodyInstanceAuthRange setSdkCapacity(String sdkCapacity) {
            this.sdkCapacity = sdkCapacity;
            return this;
        }
        public String getSdkCapacity() {
            return this.sdkCapacity;
        }

        public GetInstanceAuthRangeResponseBodyInstanceAuthRange setSlsCapacity(String slsCapacity) {
            this.slsCapacity = slsCapacity;
            return this;
        }
        public String getSlsCapacity() {
            return this.slsCapacity;
        }

        public GetInstanceAuthRangeResponseBodyInstanceAuthRange setThreatAnalysisCapacity(String threatAnalysisCapacity) {
            this.threatAnalysisCapacity = threatAnalysisCapacity;
            return this;
        }
        public String getThreatAnalysisCapacity() {
            return this.threatAnalysisCapacity;
        }

        public GetInstanceAuthRangeResponseBodyInstanceAuthRange setThreatAnalysisFlow(String threatAnalysisFlow) {
            this.threatAnalysisFlow = threatAnalysisFlow;
            return this;
        }
        public String getThreatAnalysisFlow() {
            return this.threatAnalysisFlow;
        }

        public GetInstanceAuthRangeResponseBodyInstanceAuthRange setWebLockCapacity(String webLockCapacity) {
            this.webLockCapacity = webLockCapacity;
            return this;
        }
        public String getWebLockCapacity() {
            return this.webLockCapacity;
        }

    }

}
