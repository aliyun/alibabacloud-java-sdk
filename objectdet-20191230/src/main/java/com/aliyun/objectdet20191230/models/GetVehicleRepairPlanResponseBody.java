// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class GetVehicleRepairPlanResponseBody extends TeaModel {
    @NameInMap("HttpCode")
    public Integer httpCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public GetVehicleRepairPlanResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static GetVehicleRepairPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVehicleRepairPlanResponseBody self = new GetVehicleRepairPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVehicleRepairPlanResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public GetVehicleRepairPlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetVehicleRepairPlanResponseBody setData(GetVehicleRepairPlanResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetVehicleRepairPlanResponseBodyData getData() {
        return this.data;
    }

    public GetVehicleRepairPlanResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetVehicleRepairPlanResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetVehicleRepairPlanResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetVehicleRepairPlanResponseBodyDataRepairParts extends TeaModel {
        @NameInMap("RelationType")
        public String relationType;

        @NameInMap("PartsStdCode")
        public String partsStdCode;

        @NameInMap("PartNameMatch")
        public Boolean partNameMatch;

        @NameInMap("RepairFee")
        public String repairFee;

        @NameInMap("OutStandardPartsName")
        public String outStandardPartsName;

        @NameInMap("PartsStdName")
        public String partsStdName;

        @NameInMap("RepairTypeName")
        public String repairTypeName;

        @NameInMap("RepairType")
        public String repairType;

        @NameInMap("OeMatch")
        public Boolean oeMatch;

        @NameInMap("OutStandardPartsId")
        public String outStandardPartsId;

        @NameInMap("GarageType")
        public String garageType;

        public static GetVehicleRepairPlanResponseBodyDataRepairParts build(java.util.Map<String, ?> map) throws Exception {
            GetVehicleRepairPlanResponseBodyDataRepairParts self = new GetVehicleRepairPlanResponseBodyDataRepairParts();
            return TeaModel.build(map, self);
        }

        public GetVehicleRepairPlanResponseBodyDataRepairParts setRelationType(String relationType) {
            this.relationType = relationType;
            return this;
        }
        public String getRelationType() {
            return this.relationType;
        }

        public GetVehicleRepairPlanResponseBodyDataRepairParts setPartsStdCode(String partsStdCode) {
            this.partsStdCode = partsStdCode;
            return this;
        }
        public String getPartsStdCode() {
            return this.partsStdCode;
        }

        public GetVehicleRepairPlanResponseBodyDataRepairParts setPartNameMatch(Boolean partNameMatch) {
            this.partNameMatch = partNameMatch;
            return this;
        }
        public Boolean getPartNameMatch() {
            return this.partNameMatch;
        }

        public GetVehicleRepairPlanResponseBodyDataRepairParts setRepairFee(String repairFee) {
            this.repairFee = repairFee;
            return this;
        }
        public String getRepairFee() {
            return this.repairFee;
        }

        public GetVehicleRepairPlanResponseBodyDataRepairParts setOutStandardPartsName(String outStandardPartsName) {
            this.outStandardPartsName = outStandardPartsName;
            return this;
        }
        public String getOutStandardPartsName() {
            return this.outStandardPartsName;
        }

        public GetVehicleRepairPlanResponseBodyDataRepairParts setPartsStdName(String partsStdName) {
            this.partsStdName = partsStdName;
            return this;
        }
        public String getPartsStdName() {
            return this.partsStdName;
        }

        public GetVehicleRepairPlanResponseBodyDataRepairParts setRepairTypeName(String repairTypeName) {
            this.repairTypeName = repairTypeName;
            return this;
        }
        public String getRepairTypeName() {
            return this.repairTypeName;
        }

        public GetVehicleRepairPlanResponseBodyDataRepairParts setRepairType(String repairType) {
            this.repairType = repairType;
            return this;
        }
        public String getRepairType() {
            return this.repairType;
        }

        public GetVehicleRepairPlanResponseBodyDataRepairParts setOeMatch(Boolean oeMatch) {
            this.oeMatch = oeMatch;
            return this;
        }
        public Boolean getOeMatch() {
            return this.oeMatch;
        }

        public GetVehicleRepairPlanResponseBodyDataRepairParts setOutStandardPartsId(String outStandardPartsId) {
            this.outStandardPartsId = outStandardPartsId;
            return this;
        }
        public String getOutStandardPartsId() {
            return this.outStandardPartsId;
        }

        public GetVehicleRepairPlanResponseBodyDataRepairParts setGarageType(String garageType) {
            this.garageType = garageType;
            return this;
        }
        public String getGarageType() {
            return this.garageType;
        }

    }

    public static class GetVehicleRepairPlanResponseBodyData extends TeaModel {
        @NameInMap("RepairParts")
        public java.util.List<GetVehicleRepairPlanResponseBodyDataRepairParts> repairParts;

        @NameInMap("FrameNo")
        public String frameNo;

        public static GetVehicleRepairPlanResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetVehicleRepairPlanResponseBodyData self = new GetVehicleRepairPlanResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetVehicleRepairPlanResponseBodyData setRepairParts(java.util.List<GetVehicleRepairPlanResponseBodyDataRepairParts> repairParts) {
            this.repairParts = repairParts;
            return this;
        }
        public java.util.List<GetVehicleRepairPlanResponseBodyDataRepairParts> getRepairParts() {
            return this.repairParts;
        }

        public GetVehicleRepairPlanResponseBodyData setFrameNo(String frameNo) {
            this.frameNo = frameNo;
            return this;
        }
        public String getFrameNo() {
            return this.frameNo;
        }

    }

}
