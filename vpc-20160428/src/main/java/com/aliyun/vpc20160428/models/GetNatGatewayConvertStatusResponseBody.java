// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class GetNatGatewayConvertStatusResponseBody extends TeaModel {
    /**
     * <p>The status during the switch.</p>
     */
    @NameInMap("ConvertSteps")
    public java.util.List<GetNatGatewayConvertStatusResponseBodyConvertSteps> convertSteps;

    /**
     * <p>The type of the NAT gateway. Set the value to **Enhanced**, which specifies an enhanced Internet NAT gateway.</p>
     */
    @NameInMap("DstNatType")
    public String dstNatType;

    /**
     * <p>The ID of the Internet NAT gateway.</p>
     */
    @NameInMap("NatGatewayId")
    public String natGatewayId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetNatGatewayConvertStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetNatGatewayConvertStatusResponseBody self = new GetNatGatewayConvertStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetNatGatewayConvertStatusResponseBody setConvertSteps(java.util.List<GetNatGatewayConvertStatusResponseBodyConvertSteps> convertSteps) {
        this.convertSteps = convertSteps;
        return this;
    }
    public java.util.List<GetNatGatewayConvertStatusResponseBodyConvertSteps> getConvertSteps() {
        return this.convertSteps;
    }

    public GetNatGatewayConvertStatusResponseBody setDstNatType(String dstNatType) {
        this.dstNatType = dstNatType;
        return this;
    }
    public String getDstNatType() {
        return this.dstNatType;
    }

    public GetNatGatewayConvertStatusResponseBody setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
        return this;
    }
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    public GetNatGatewayConvertStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetNatGatewayConvertStatusResponseBodyConvertSteps extends TeaModel {
        /**
         * <p>Valid values:</p>
         * <br>
         * <p>*   **init**: initializing</p>
         * <p>*   **check**: checking configurations</p>
         * <p>*   **configure**: pushing configurations</p>
         * <p>*   **activate**: switching</p>
         * <p>*   **conf_delete**: deleting configurations</p>
         * <p>*   **rollback**: rolling back</p>
         * <p>*   **end_success**: switched</p>
         * <p>*   **end_fail**: failed</p>
         */
        @NameInMap("StepName")
        public String stepName;

        /**
         * <p>The time when the switch started.</p>
         */
        @NameInMap("StepStartTime")
        public String stepStartTime;

        /**
         * <p>The switch status. Valid values:</p>
         * <br>
         * <p>*   **processing**: switching</p>
         * <p>*   **successful**: switched</p>
         * <p>*   **failed**: failed</p>
         */
        @NameInMap("StepStatus")
        public String stepStatus;

        public static GetNatGatewayConvertStatusResponseBodyConvertSteps build(java.util.Map<String, ?> map) throws Exception {
            GetNatGatewayConvertStatusResponseBodyConvertSteps self = new GetNatGatewayConvertStatusResponseBodyConvertSteps();
            return TeaModel.build(map, self);
        }

        public GetNatGatewayConvertStatusResponseBodyConvertSteps setStepName(String stepName) {
            this.stepName = stepName;
            return this;
        }
        public String getStepName() {
            return this.stepName;
        }

        public GetNatGatewayConvertStatusResponseBodyConvertSteps setStepStartTime(String stepStartTime) {
            this.stepStartTime = stepStartTime;
            return this;
        }
        public String getStepStartTime() {
            return this.stepStartTime;
        }

        public GetNatGatewayConvertStatusResponseBodyConvertSteps setStepStatus(String stepStatus) {
            this.stepStatus = stepStatus;
            return this;
        }
        public String getStepStatus() {
            return this.stepStatus;
        }

    }

}
