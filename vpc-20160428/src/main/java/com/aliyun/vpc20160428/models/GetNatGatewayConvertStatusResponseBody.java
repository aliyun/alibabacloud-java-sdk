// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class GetNatGatewayConvertStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DstNatType")
    public String dstNatType;

    @NameInMap("ConvertSteps")
    public java.util.List<GetNatGatewayConvertStatusResponseBodyConvertSteps> convertSteps;

    @NameInMap("NatGatewayId")
    public String natGatewayId;

    public static GetNatGatewayConvertStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetNatGatewayConvertStatusResponseBody self = new GetNatGatewayConvertStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetNatGatewayConvertStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetNatGatewayConvertStatusResponseBody setDstNatType(String dstNatType) {
        this.dstNatType = dstNatType;
        return this;
    }
    public String getDstNatType() {
        return this.dstNatType;
    }

    public GetNatGatewayConvertStatusResponseBody setConvertSteps(java.util.List<GetNatGatewayConvertStatusResponseBodyConvertSteps> convertSteps) {
        this.convertSteps = convertSteps;
        return this;
    }
    public java.util.List<GetNatGatewayConvertStatusResponseBodyConvertSteps> getConvertSteps() {
        return this.convertSteps;
    }

    public GetNatGatewayConvertStatusResponseBody setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
        return this;
    }
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    public static class GetNatGatewayConvertStatusResponseBodyConvertSteps extends TeaModel {
        @NameInMap("StepStartTime")
        public String stepStartTime;

        @NameInMap("StepStatus")
        public String stepStatus;

        @NameInMap("StepName")
        public String stepName;

        public static GetNatGatewayConvertStatusResponseBodyConvertSteps build(java.util.Map<String, ?> map) throws Exception {
            GetNatGatewayConvertStatusResponseBodyConvertSteps self = new GetNatGatewayConvertStatusResponseBodyConvertSteps();
            return TeaModel.build(map, self);
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

        public GetNatGatewayConvertStatusResponseBodyConvertSteps setStepName(String stepName) {
            this.stepName = stepName;
            return this;
        }
        public String getStepName() {
            return this.stepName;
        }

    }

}
