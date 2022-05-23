// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xgippop20220520.models;

import com.aliyun.tea.*;

public class GetFreeFlowProductListResponseBody extends TeaModel {
    // 结果码
    @NameInMap("Code")
    public String code;

    // 结果
    @NameInMap("Data")
    public java.util.List<GetFreeFlowProductListResponseBodyData> data;

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

    public static GetFreeFlowProductListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFreeFlowProductListResponseBody self = new GetFreeFlowProductListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFreeFlowProductListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetFreeFlowProductListResponseBody setData(java.util.List<GetFreeFlowProductListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetFreeFlowProductListResponseBodyData> getData() {
        return this.data;
    }

    public GetFreeFlowProductListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetFreeFlowProductListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetFreeFlowProductListResponseBody setRt(Long rt) {
        this.rt = rt;
        return this;
    }
    public Long getRt() {
        return this.rt;
    }

    public GetFreeFlowProductListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetFreeFlowProductListResponseBodyData extends TeaModel {
        // 产品当前状态，true为已配置，false为未配置
        @NameInMap("Configured")
        public Boolean configured;

        // 产品包含的流量大小
        @NameInMap("FlowProductAmount")
        public String flowProductAmount;

        // 免流产品ID
        @NameInMap("FlowProductId")
        public String flowProductId;

        // 流量包名称
        @NameInMap("FlowProductName")
        public String flowProductName;

        // 产品周期
        @NameInMap("FlowProductPeriod")
        public String flowProductPeriod;

        // 取值包括free（定向流量）/normal（通用流量）
        @NameInMap("FlowType")
        public String flowType;

        // 取值包括cm（中国移动）/ct（中国电信）/cu（中国联通）
        @NameInMap("Operator")
        public String operator;

        // 注意这里返回的全量套餐里，只能包含SpecType与该InstanceId的SpecType相同的规格
        @NameInMap("SpecType")
        public String specType;

        @NameInMap("Spid")
        public String spid;

        @NameInMap("UnitPrice")
        public Integer unitPrice;

        public static GetFreeFlowProductListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetFreeFlowProductListResponseBodyData self = new GetFreeFlowProductListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetFreeFlowProductListResponseBodyData setConfigured(Boolean configured) {
            this.configured = configured;
            return this;
        }
        public Boolean getConfigured() {
            return this.configured;
        }

        public GetFreeFlowProductListResponseBodyData setFlowProductAmount(String flowProductAmount) {
            this.flowProductAmount = flowProductAmount;
            return this;
        }
        public String getFlowProductAmount() {
            return this.flowProductAmount;
        }

        public GetFreeFlowProductListResponseBodyData setFlowProductId(String flowProductId) {
            this.flowProductId = flowProductId;
            return this;
        }
        public String getFlowProductId() {
            return this.flowProductId;
        }

        public GetFreeFlowProductListResponseBodyData setFlowProductName(String flowProductName) {
            this.flowProductName = flowProductName;
            return this;
        }
        public String getFlowProductName() {
            return this.flowProductName;
        }

        public GetFreeFlowProductListResponseBodyData setFlowProductPeriod(String flowProductPeriod) {
            this.flowProductPeriod = flowProductPeriod;
            return this;
        }
        public String getFlowProductPeriod() {
            return this.flowProductPeriod;
        }

        public GetFreeFlowProductListResponseBodyData setFlowType(String flowType) {
            this.flowType = flowType;
            return this;
        }
        public String getFlowType() {
            return this.flowType;
        }

        public GetFreeFlowProductListResponseBodyData setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public GetFreeFlowProductListResponseBodyData setSpecType(String specType) {
            this.specType = specType;
            return this;
        }
        public String getSpecType() {
            return this.specType;
        }

        public GetFreeFlowProductListResponseBodyData setSpid(String spid) {
            this.spid = spid;
            return this;
        }
        public String getSpid() {
            return this.spid;
        }

        public GetFreeFlowProductListResponseBodyData setUnitPrice(Integer unitPrice) {
            this.unitPrice = unitPrice;
            return this;
        }
        public Integer getUnitPrice() {
            return this.unitPrice;
        }

    }

}
