// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeServiceMeshUpgradeStatusResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The upgrade results.</p>
     */
    @NameInMap("UpgradeDetail")
    public DescribeServiceMeshUpgradeStatusResponseBodyUpgradeDetail upgradeDetail;

    public static DescribeServiceMeshUpgradeStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceMeshUpgradeStatusResponseBody self = new DescribeServiceMeshUpgradeStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeServiceMeshUpgradeStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeServiceMeshUpgradeStatusResponseBody setUpgradeDetail(DescribeServiceMeshUpgradeStatusResponseBodyUpgradeDetail upgradeDetail) {
        this.upgradeDetail = upgradeDetail;
        return this;
    }
    public DescribeServiceMeshUpgradeStatusResponseBodyUpgradeDetail getUpgradeDetail() {
        return this.upgradeDetail;
    }

    public static class DescribeServiceMeshUpgradeStatusResponseBodyUpgradeDetail extends TeaModel {
        /**
         * <p>The number of ingress gateways that are upgraded.</p>
         */
        @NameInMap("FinishedGatewaysNum")
        public Long finishedGatewaysNum;

        /**
         * <p>The information about the status of the ingress gateways.</p>
         */
        @NameInMap("GatewayStatusRecord")
        public java.util.Map<String, UpgradeDetailGatewayStatusRecordValue> gatewayStatusRecord;

        /**
         * <p>The status of the ASM instance. Valid values:</p>
         * <br>
         * <p>*   running: The instance is running.</p>
         * <p>*   `upgrading`: The instance is being upgraded.</p>
         * <p>*   `upgrading_failed`: The upgrade of the instance fails.</p>
         */
        @NameInMap("MeshStatus")
        public String meshStatus;

        /**
         * <p>The total number of ingress gateways in the ASM instance.</p>
         */
        @NameInMap("TotalGatewaysNum")
        public Long totalGatewaysNum;

        public static DescribeServiceMeshUpgradeStatusResponseBodyUpgradeDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshUpgradeStatusResponseBodyUpgradeDetail self = new DescribeServiceMeshUpgradeStatusResponseBodyUpgradeDetail();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshUpgradeStatusResponseBodyUpgradeDetail setFinishedGatewaysNum(Long finishedGatewaysNum) {
            this.finishedGatewaysNum = finishedGatewaysNum;
            return this;
        }
        public Long getFinishedGatewaysNum() {
            return this.finishedGatewaysNum;
        }

        public DescribeServiceMeshUpgradeStatusResponseBodyUpgradeDetail setGatewayStatusRecord(java.util.Map<String, UpgradeDetailGatewayStatusRecordValue> gatewayStatusRecord) {
            this.gatewayStatusRecord = gatewayStatusRecord;
            return this;
        }
        public java.util.Map<String, UpgradeDetailGatewayStatusRecordValue> getGatewayStatusRecord() {
            return this.gatewayStatusRecord;
        }

        public DescribeServiceMeshUpgradeStatusResponseBodyUpgradeDetail setMeshStatus(String meshStatus) {
            this.meshStatus = meshStatus;
            return this;
        }
        public String getMeshStatus() {
            return this.meshStatus;
        }

        public DescribeServiceMeshUpgradeStatusResponseBodyUpgradeDetail setTotalGatewaysNum(Long totalGatewaysNum) {
            this.totalGatewaysNum = totalGatewaysNum;
            return this;
        }
        public Long getTotalGatewaysNum() {
            return this.totalGatewaysNum;
        }

    }

}
