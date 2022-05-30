// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xgippop20220520.models;

import com.aliyun.tea.*;

public class GetFreeFlowUsageStatisticResponseBody extends TeaModel {
    // 结果码
    @NameInMap("Code")
    public String code;

    // 结果
    @NameInMap("Data")
    public java.util.List<GetFreeFlowUsageStatisticResponseBodyData> data;

    // 结果描述
    @NameInMap("Message")
    public String message;

    // 请求链路ID，如POP请求进来的requestId，返回时原样返回
    @NameInMap("RequestId")
    public String requestId;

    // 服务端处理耗时，ms
    @NameInMap("Rt")
    public Long rt;

    // 是否成功
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

        // 该实例对应的包类型
        @NameInMap("SpecType")
        public String specType;

        @NameInMap("TotalMoney")
        public String totalMoney;

        // 该实例的订单总数
        @NameInMap("TotalOrderNumber")
        public Long totalOrderNumber;

        // 该实例的订单总计量单元数
        @NameInMap("TotalUnitNumber")
        public Long totalUnitNumber;

        // 产品规格
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
