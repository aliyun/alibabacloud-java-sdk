// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xgippop20220520.models;

import com.aliyun.tea.*;

public class GetQosFlowUsageResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetQosFlowUsageResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Rt")
    public Long rt;

    @NameInMap("Success")
    public Boolean success;

    public static GetQosFlowUsageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetQosFlowUsageResponseBody self = new GetQosFlowUsageResponseBody();
        return TeaModel.build(map, self);
    }

    public GetQosFlowUsageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetQosFlowUsageResponseBody setData(GetQosFlowUsageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetQosFlowUsageResponseBodyData getData() {
        return this.data;
    }

    public GetQosFlowUsageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetQosFlowUsageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetQosFlowUsageResponseBody setRt(Long rt) {
        this.rt = rt;
        return this;
    }
    public Long getRt() {
        return this.rt;
    }

    public GetQosFlowUsageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetQosFlowUsageResponseBodyDataCustomerList extends TeaModel {
        @NameInMap("AliUid")
        public Long aliUid;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("DsDay")
        public Long dsDay;

        @NameInMap("DsMonth")
        public Long dsMonth;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("ItemCode")
        public String itemCode;

        @NameInMap("Message")
        public String message;

        @NameInMap("Name")
        public String name;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("OrderNum")
        public Integer orderNum;

        @NameInMap("ProductId")
        public String productId;

        @NameInMap("ProductName")
        public String productName;

        @NameInMap("Provice")
        public String provice;

        @NameInMap("QosRequestId")
        public String qosRequestId;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("SpecType")
        public String specType;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("TotalPrice")
        public Integer totalPrice;

        @NameInMap("TotolTime")
        public Long totolTime;

        public static GetQosFlowUsageResponseBodyDataCustomerList build(java.util.Map<String, ?> map) throws Exception {
            GetQosFlowUsageResponseBodyDataCustomerList self = new GetQosFlowUsageResponseBodyDataCustomerList();
            return TeaModel.build(map, self);
        }

        public GetQosFlowUsageResponseBodyDataCustomerList setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public GetQosFlowUsageResponseBodyDataCustomerList setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetQosFlowUsageResponseBodyDataCustomerList setDsDay(Long dsDay) {
            this.dsDay = dsDay;
            return this;
        }
        public Long getDsDay() {
            return this.dsDay;
        }

        public GetQosFlowUsageResponseBodyDataCustomerList setDsMonth(Long dsMonth) {
            this.dsMonth = dsMonth;
            return this;
        }
        public Long getDsMonth() {
            return this.dsMonth;
        }

        public GetQosFlowUsageResponseBodyDataCustomerList setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetQosFlowUsageResponseBodyDataCustomerList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetQosFlowUsageResponseBodyDataCustomerList setItemCode(String itemCode) {
            this.itemCode = itemCode;
            return this;
        }
        public String getItemCode() {
            return this.itemCode;
        }

        public GetQosFlowUsageResponseBodyDataCustomerList setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetQosFlowUsageResponseBodyDataCustomerList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetQosFlowUsageResponseBodyDataCustomerList setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public GetQosFlowUsageResponseBodyDataCustomerList setOrderNum(Integer orderNum) {
            this.orderNum = orderNum;
            return this;
        }
        public Integer getOrderNum() {
            return this.orderNum;
        }

        public GetQosFlowUsageResponseBodyDataCustomerList setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
        }

        public GetQosFlowUsageResponseBodyDataCustomerList setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public GetQosFlowUsageResponseBodyDataCustomerList setProvice(String provice) {
            this.provice = provice;
            return this;
        }
        public String getProvice() {
            return this.provice;
        }

        public GetQosFlowUsageResponseBodyDataCustomerList setQosRequestId(String qosRequestId) {
            this.qosRequestId = qosRequestId;
            return this;
        }
        public String getQosRequestId() {
            return this.qosRequestId;
        }

        public GetQosFlowUsageResponseBodyDataCustomerList setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public GetQosFlowUsageResponseBodyDataCustomerList setSpecType(String specType) {
            this.specType = specType;
            return this;
        }
        public String getSpecType() {
            return this.specType;
        }

        public GetQosFlowUsageResponseBodyDataCustomerList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetQosFlowUsageResponseBodyDataCustomerList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetQosFlowUsageResponseBodyDataCustomerList setTotalPrice(Integer totalPrice) {
            this.totalPrice = totalPrice;
            return this;
        }
        public Integer getTotalPrice() {
            return this.totalPrice;
        }

        public GetQosFlowUsageResponseBodyDataCustomerList setTotolTime(Long totolTime) {
            this.totolTime = totolTime;
            return this;
        }
        public Long getTotolTime() {
            return this.totolTime;
        }

    }

    public static class GetQosFlowUsageResponseBodyData extends TeaModel {
        @NameInMap("CurPageNum")
        public Integer curPageNum;

        @NameInMap("CustomerList")
        public java.util.List<GetQosFlowUsageResponseBodyDataCustomerList> customerList;

        @NameInMap("HasNext")
        public Boolean hasNext;

        @NameInMap("HasPrev")
        public Boolean hasPrev;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("NumPerPage")
        public Integer numPerPage;

        @NameInMap("TotalNum")
        public Integer totalNum;

        @NameInMap("TotalPageNum")
        public Integer totalPageNum;

        public static GetQosFlowUsageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetQosFlowUsageResponseBodyData self = new GetQosFlowUsageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetQosFlowUsageResponseBodyData setCurPageNum(Integer curPageNum) {
            this.curPageNum = curPageNum;
            return this;
        }
        public Integer getCurPageNum() {
            return this.curPageNum;
        }

        public GetQosFlowUsageResponseBodyData setCustomerList(java.util.List<GetQosFlowUsageResponseBodyDataCustomerList> customerList) {
            this.customerList = customerList;
            return this;
        }
        public java.util.List<GetQosFlowUsageResponseBodyDataCustomerList> getCustomerList() {
            return this.customerList;
        }

        public GetQosFlowUsageResponseBodyData setHasNext(Boolean hasNext) {
            this.hasNext = hasNext;
            return this;
        }
        public Boolean getHasNext() {
            return this.hasNext;
        }

        public GetQosFlowUsageResponseBodyData setHasPrev(Boolean hasPrev) {
            this.hasPrev = hasPrev;
            return this;
        }
        public Boolean getHasPrev() {
            return this.hasPrev;
        }

        public GetQosFlowUsageResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetQosFlowUsageResponseBodyData setNumPerPage(Integer numPerPage) {
            this.numPerPage = numPerPage;
            return this;
        }
        public Integer getNumPerPage() {
            return this.numPerPage;
        }

        public GetQosFlowUsageResponseBodyData setTotalNum(Integer totalNum) {
            this.totalNum = totalNum;
            return this;
        }
        public Integer getTotalNum() {
            return this.totalNum;
        }

        public GetQosFlowUsageResponseBodyData setTotalPageNum(Integer totalPageNum) {
            this.totalPageNum = totalPageNum;
            return this;
        }
        public Integer getTotalPageNum() {
            return this.totalPageNum;
        }

    }

}
