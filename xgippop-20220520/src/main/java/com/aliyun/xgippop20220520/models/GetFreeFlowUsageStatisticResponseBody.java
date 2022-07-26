// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xgippop20220520.models;

import com.aliyun.tea.*;

public class GetFreeFlowUsageStatisticResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetFreeFlowUsageStatisticResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Rt")
    public Long rt;

    @NameInMap("Success")
    public Boolean success;

    public static GetFreeFlowUsageStatisticResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFreeFlowUsageStatisticResponseBody self = new GetFreeFlowUsageStatisticResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFreeFlowUsageStatisticResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetFreeFlowUsageStatisticResponseBody setData(java.util.List<GetFreeFlowUsageStatisticResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetFreeFlowUsageStatisticResponseBodyData> getData() {
        return this.data;
    }

    public GetFreeFlowUsageStatisticResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetFreeFlowUsageStatisticResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetFreeFlowUsageStatisticResponseBody setRt(Long rt) {
        this.rt = rt;
        return this;
    }
    public Long getRt() {
        return this.rt;
    }

    public GetFreeFlowUsageStatisticResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetFreeFlowUsageStatisticResponseBodyData extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("SpecType")
        public String specType;

        @NameInMap("TotalMoney")
        public String totalMoney;

        @NameInMap("TotalOrderNumber")
        public Long totalOrderNumber;

        @NameInMap("TotalUnitNumber")
        public Long totalUnitNumber;

        @NameInMap("YunOutProduct")
        public String yunOutProduct;

        public static GetFreeFlowUsageStatisticResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetFreeFlowUsageStatisticResponseBodyData self = new GetFreeFlowUsageStatisticResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetFreeFlowUsageStatisticResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetFreeFlowUsageStatisticResponseBodyData setSpecType(String specType) {
            this.specType = specType;
            return this;
        }
        public String getSpecType() {
            return this.specType;
        }

        public GetFreeFlowUsageStatisticResponseBodyData setTotalMoney(String totalMoney) {
            this.totalMoney = totalMoney;
            return this;
        }
        public String getTotalMoney() {
            return this.totalMoney;
        }

        public GetFreeFlowUsageStatisticResponseBodyData setTotalOrderNumber(Long totalOrderNumber) {
            this.totalOrderNumber = totalOrderNumber;
            return this;
        }
        public Long getTotalOrderNumber() {
            return this.totalOrderNumber;
        }

        public GetFreeFlowUsageStatisticResponseBodyData setTotalUnitNumber(Long totalUnitNumber) {
            this.totalUnitNumber = totalUnitNumber;
            return this;
        }
        public Long getTotalUnitNumber() {
            return this.totalUnitNumber;
        }

        public GetFreeFlowUsageStatisticResponseBodyData setYunOutProduct(String yunOutProduct) {
            this.yunOutProduct = yunOutProduct;
            return this;
        }
        public String getYunOutProduct() {
            return this.yunOutProduct;
        }

    }

}
