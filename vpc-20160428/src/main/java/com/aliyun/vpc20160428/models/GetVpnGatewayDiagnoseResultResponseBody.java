// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class GetVpnGatewayDiagnoseResultResponseBody extends TeaModel {
    @NameInMap("BeginTime")
    public String beginTime;

    @NameInMap("DiagnoseId")
    public String diagnoseId;

    @NameInMap("DiagnoseResult")
    public java.util.List<GetVpnGatewayDiagnoseResultResponseBodyDiagnoseResult> diagnoseResult;

    @NameInMap("FinishTime")
    public String finishTime;

    @NameInMap("FinishedCount")
    public Integer finishedCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceInstanceId")
    public String resourceInstanceId;

    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("VpnGatewayId")
    public String vpnGatewayId;

    public static GetVpnGatewayDiagnoseResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVpnGatewayDiagnoseResultResponseBody self = new GetVpnGatewayDiagnoseResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVpnGatewayDiagnoseResultResponseBody setBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public String getBeginTime() {
        return this.beginTime;
    }

    public GetVpnGatewayDiagnoseResultResponseBody setDiagnoseId(String diagnoseId) {
        this.diagnoseId = diagnoseId;
        return this;
    }
    public String getDiagnoseId() {
        return this.diagnoseId;
    }

    public GetVpnGatewayDiagnoseResultResponseBody setDiagnoseResult(java.util.List<GetVpnGatewayDiagnoseResultResponseBodyDiagnoseResult> diagnoseResult) {
        this.diagnoseResult = diagnoseResult;
        return this;
    }
    public java.util.List<GetVpnGatewayDiagnoseResultResponseBodyDiagnoseResult> getDiagnoseResult() {
        return this.diagnoseResult;
    }

    public GetVpnGatewayDiagnoseResultResponseBody setFinishTime(String finishTime) {
        this.finishTime = finishTime;
        return this;
    }
    public String getFinishTime() {
        return this.finishTime;
    }

    public GetVpnGatewayDiagnoseResultResponseBody setFinishedCount(Integer finishedCount) {
        this.finishedCount = finishedCount;
        return this;
    }
    public Integer getFinishedCount() {
        return this.finishedCount;
    }

    public GetVpnGatewayDiagnoseResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetVpnGatewayDiagnoseResultResponseBody setResourceInstanceId(String resourceInstanceId) {
        this.resourceInstanceId = resourceInstanceId;
        return this;
    }
    public String getResourceInstanceId() {
        return this.resourceInstanceId;
    }

    public GetVpnGatewayDiagnoseResultResponseBody setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public GetVpnGatewayDiagnoseResultResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public GetVpnGatewayDiagnoseResultResponseBody setVpnGatewayId(String vpnGatewayId) {
        this.vpnGatewayId = vpnGatewayId;
        return this;
    }
    public String getVpnGatewayId() {
        return this.vpnGatewayId;
    }

    public static class GetVpnGatewayDiagnoseResultResponseBodyDiagnoseResult extends TeaModel {
        @NameInMap("DiagnoseName")
        public String diagnoseName;

        @NameInMap("DiagnoseResultDescription")
        public String diagnoseResultDescription;

        @NameInMap("DiagnoseResultLevel")
        public String diagnoseResultLevel;

        public static GetVpnGatewayDiagnoseResultResponseBodyDiagnoseResult build(java.util.Map<String, ?> map) throws Exception {
            GetVpnGatewayDiagnoseResultResponseBodyDiagnoseResult self = new GetVpnGatewayDiagnoseResultResponseBodyDiagnoseResult();
            return TeaModel.build(map, self);
        }

        public GetVpnGatewayDiagnoseResultResponseBodyDiagnoseResult setDiagnoseName(String diagnoseName) {
            this.diagnoseName = diagnoseName;
            return this;
        }
        public String getDiagnoseName() {
            return this.diagnoseName;
        }

        public GetVpnGatewayDiagnoseResultResponseBodyDiagnoseResult setDiagnoseResultDescription(String diagnoseResultDescription) {
            this.diagnoseResultDescription = diagnoseResultDescription;
            return this;
        }
        public String getDiagnoseResultDescription() {
            return this.diagnoseResultDescription;
        }

        public GetVpnGatewayDiagnoseResultResponseBodyDiagnoseResult setDiagnoseResultLevel(String diagnoseResultLevel) {
            this.diagnoseResultLevel = diagnoseResultLevel;
            return this;
        }
        public String getDiagnoseResultLevel() {
            return this.diagnoseResultLevel;
        }

    }

}
