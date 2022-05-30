// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xgippop20220520.models;

import com.aliyun.tea.*;

public class GetFreeFlowUsageResponseBody extends TeaModel {
    // 结果码
    @NameInMap("Code")
    public String code;

    // 结果
    @NameInMap("Data")
    public GetFreeFlowUsageResponseBodyData data;

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

    public static GetFreeFlowUsageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFreeFlowUsageResponseBody self = new GetFreeFlowUsageResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFreeFlowUsageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetFreeFlowUsageResponseBody setData(GetFreeFlowUsageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetFreeFlowUsageResponseBodyData getData() {
        return this.data;
    }

    public GetFreeFlowUsageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetFreeFlowUsageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetFreeFlowUsageResponseBody setRt(Long rt) {
        this.rt = rt;
        return this;
    }
    public Long getRt() {
        return this.rt;
    }

    public GetFreeFlowUsageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetFreeFlowUsageResponseBodyDataCustomerList extends TeaModel {
        // 购买渠道
        @NameInMap("ChannelId")
        public String channelId;

        // C端产品失效时间
        @NameInMap("CustomerEndTime")
        public String customerEndTime;

        @NameInMap("CustomerFlowOrderId")
        public String customerFlowOrderId;

        // C端免流状态，取值包括create/working/expiration
        @NameInMap("CustomerFlowStatus")
        public String customerFlowStatus;

        // C端产品开通时间
        @NameInMap("CustomerOpenTime")
        public String customerOpenTime;

        // C端产品生效时间
        @NameInMap("CustomerStartTime")
        public String customerStartTime;

        // 免流产品ID
        @NameInMap("FlowProductId")
        public String flowProductId;

        // 免流产品名
        @NameInMap("FlowProductName")
        public String flowProductName;

        // 是否包月，true或false
        @NameInMap("IsLasting")
        public Boolean isLasting;

        // C端手机号
        @NameInMap("MobileNumber")
        public String mobileNumber;

        // 该流量包的计量单元数
        @NameInMap("UnitNum")
        public Integer unitNum;

        // 流量包价格
        @NameInMap("UnitPrice")
        public Integer unitPrice;

        public static GetFreeFlowUsageResponseBodyDataCustomerList build(java.util.Map<String, ?> map) throws Exception {
            GetFreeFlowUsageResponseBodyDataCustomerList self = new GetFreeFlowUsageResponseBodyDataCustomerList();
            return TeaModel.build(map, self);
        }

        public GetFreeFlowUsageResponseBodyDataCustomerList setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public GetFreeFlowUsageResponseBodyDataCustomerList setCustomerEndTime(String customerEndTime) {
            this.customerEndTime = customerEndTime;
            return this;
        }
        public String getCustomerEndTime() {
            return this.customerEndTime;
        }

        public GetFreeFlowUsageResponseBodyDataCustomerList setCustomerFlowOrderId(String customerFlowOrderId) {
            this.customerFlowOrderId = customerFlowOrderId;
            return this;
        }
        public String getCustomerFlowOrderId() {
            return this.customerFlowOrderId;
        }

        public GetFreeFlowUsageResponseBodyDataCustomerList setCustomerFlowStatus(String customerFlowStatus) {
            this.customerFlowStatus = customerFlowStatus;
            return this;
        }
        public String getCustomerFlowStatus() {
            return this.customerFlowStatus;
        }

        public GetFreeFlowUsageResponseBodyDataCustomerList setCustomerOpenTime(String customerOpenTime) {
            this.customerOpenTime = customerOpenTime;
            return this;
        }
        public String getCustomerOpenTime() {
            return this.customerOpenTime;
        }

        public GetFreeFlowUsageResponseBodyDataCustomerList setCustomerStartTime(String customerStartTime) {
            this.customerStartTime = customerStartTime;
            return this;
        }
        public String getCustomerStartTime() {
            return this.customerStartTime;
        }

        public GetFreeFlowUsageResponseBodyDataCustomerList setFlowProductId(String flowProductId) {
            this.flowProductId = flowProductId;
            return this;
        }
        public String getFlowProductId() {
            return this.flowProductId;
        }

        public GetFreeFlowUsageResponseBodyDataCustomerList setFlowProductName(String flowProductName) {
            this.flowProductName = flowProductName;
            return this;
        }
        public String getFlowProductName() {
            return this.flowProductName;
        }

        public GetFreeFlowUsageResponseBodyDataCustomerList setIsLasting(Boolean isLasting) {
            this.isLasting = isLasting;
            return this;
        }
        public Boolean getIsLasting() {
            return this.isLasting;
        }

        public GetFreeFlowUsageResponseBodyDataCustomerList setMobileNumber(String mobileNumber) {
            this.mobileNumber = mobileNumber;
            return this;
        }
        public String getMobileNumber() {
            return this.mobileNumber;
        }

        public GetFreeFlowUsageResponseBodyDataCustomerList setUnitNum(Integer unitNum) {
            this.unitNum = unitNum;
            return this;
        }
        public Integer getUnitNum() {
            return this.unitNum;
        }

        public GetFreeFlowUsageResponseBodyDataCustomerList setUnitPrice(Integer unitPrice) {
            this.unitPrice = unitPrice;
            return this;
        }
        public Integer getUnitPrice() {
            return this.unitPrice;
        }

    }

    public static class GetFreeFlowUsageResponseBodyData extends TeaModel {
        // 当前页数
        @NameInMap("CurPageNum")
        public Integer curPageNum;

        // C端用户列表
        @NameInMap("CustomerList")
        public java.util.List<GetFreeFlowUsageResponseBodyDataCustomerList> customerList;

        // 是否有下一页
        @NameInMap("HasNext")
        public Boolean hasNext;

        // 是否有上一页
        @NameInMap("HasPrev")
        public Boolean hasPrev;

        // 实例ID
        @NameInMap("InstanceId")
        public String instanceId;

        // 每页的记录条数
        @NameInMap("NumPerPage")
        public Integer numPerPage;

        // 总记录条数
        @NameInMap("TotalNum")
        public Integer totalNum;

        // 总页数
        @NameInMap("TotalPageNum")
        public Integer totalPageNum;

        public static GetFreeFlowUsageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetFreeFlowUsageResponseBodyData self = new GetFreeFlowUsageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetFreeFlowUsageResponseBodyData setCurPageNum(Integer curPageNum) {
            this.curPageNum = curPageNum;
            return this;
        }
        public Integer getCurPageNum() {
            return this.curPageNum;
        }

        public GetFreeFlowUsageResponseBodyData setCustomerList(java.util.List<GetFreeFlowUsageResponseBodyDataCustomerList> customerList) {
            this.customerList = customerList;
            return this;
        }
        public java.util.List<GetFreeFlowUsageResponseBodyDataCustomerList> getCustomerList() {
            return this.customerList;
        }

        public GetFreeFlowUsageResponseBodyData setHasNext(Boolean hasNext) {
            this.hasNext = hasNext;
            return this;
        }
        public Boolean getHasNext() {
            return this.hasNext;
        }

        public GetFreeFlowUsageResponseBodyData setHasPrev(Boolean hasPrev) {
            this.hasPrev = hasPrev;
            return this;
        }
        public Boolean getHasPrev() {
            return this.hasPrev;
        }

        public GetFreeFlowUsageResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetFreeFlowUsageResponseBodyData setNumPerPage(Integer numPerPage) {
            this.numPerPage = numPerPage;
            return this;
        }
        public Integer getNumPerPage() {
            return this.numPerPage;
        }

        public GetFreeFlowUsageResponseBodyData setTotalNum(Integer totalNum) {
            this.totalNum = totalNum;
            return this;
        }
        public Integer getTotalNum() {
            return this.totalNum;
        }

        public GetFreeFlowUsageResponseBodyData setTotalPageNum(Integer totalPageNum) {
            this.totalPageNum = totalPageNum;
            return this;
        }
        public Integer getTotalPageNum() {
            return this.totalPageNum;
        }

    }

}
