// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetInstanceAuthRangeResponseBody extends TeaModel {
    @NameInMap("InstanceAuthRange")
    public GetInstanceAuthRangeResponseBodyInstanceAuthRange instanceAuthRange;

    /**
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
         * <strong>example:</strong>
         * <p>1-2000000000:1</p>
         */
        @NameInMap("AdvancedCount")
        public String advancedCount;

        /**
         * <strong>example:</strong>
         * <p>0-9000000000:10</p>
         */
        @NameInMap("AntiRansomwareCapacity")
        public String antiRansomwareCapacity;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AntiRansomwareService")
        public Integer antiRansomwareService;

        /**
         * <strong>example:</strong>
         * <p>1-2000000000:1</p>
         */
        @NameInMap("AntiVirusCore")
        public String antiVirusCore;

        /**
         * <strong>example:</strong>
         * <p>1-2000000000:1</p>
         */
        @NameInMap("ContainerCore")
        public String containerCore;

        /**
         * <strong>example:</strong>
         * <p>1-2000000000:1</p>
         */
        @NameInMap("ContainerCount")
        public String containerCount;

        /**
         * <strong>example:</strong>
         * <p>15000-9999999999:55000</p>
         */
        @NameInMap("CspmCapacity")
        public String cspmCapacity;

        /**
         * <strong>example:</strong>
         * <p>1-2000000000:1</p>
         */
        @NameInMap("EnterpriseCount")
        public String enterpriseCount;

        /**
         * <strong>example:</strong>
         * <p>20-500:1</p>
         */
        @NameInMap("HoneypotCapacity")
        public String honeypotCapacity;

        /**
         * <strong>example:</strong>
         * <p>0-200000:20</p>
         */
        @NameInMap("ImageScanCapacity")
        public String imageScanCapacity;

        /**
         * <strong>example:</strong>
         * <p>0-100000000:1</p>
         */
        @NameInMap("RaspCapacity")
        public String raspCapacity;

        /**
         * <strong>example:</strong>
         * <p>10-9999999999:10</p>
         */
        @NameInMap("SdkCapacity")
        public String sdkCapacity;

        /**
         * <strong>example:</strong>
         * <p>0-600000000:10</p>
         */
        @NameInMap("SlsCapacity")
        public String slsCapacity;

        /**
         * <strong>example:</strong>
         * <p>0-9999999999:1000</p>
         */
        @NameInMap("ThreatAnalysisCapacity")
        public String threatAnalysisCapacity;

        /**
         * <strong>example:</strong>
         * <p>0-9999999999:100</p>
         */
        @NameInMap("ThreatAnalysisFlow")
        public String threatAnalysisFlow;

        /**
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
