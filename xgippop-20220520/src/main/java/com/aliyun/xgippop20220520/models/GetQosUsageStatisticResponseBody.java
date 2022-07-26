// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xgippop20220520.models;

import com.aliyun.tea.*;

public class GetQosUsageStatisticResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetQosUsageStatisticResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Rt")
    public Long rt;

    @NameInMap("Success")
    public Boolean success;

    public static GetQosUsageStatisticResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetQosUsageStatisticResponseBody self = new GetQosUsageStatisticResponseBody();
        return TeaModel.build(map, self);
    }

    public GetQosUsageStatisticResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetQosUsageStatisticResponseBody setData(GetQosUsageStatisticResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetQosUsageStatisticResponseBodyData getData() {
        return this.data;
    }

    public GetQosUsageStatisticResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetQosUsageStatisticResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetQosUsageStatisticResponseBody setRt(Long rt) {
        this.rt = rt;
        return this;
    }
    public Long getRt() {
        return this.rt;
    }

    public GetQosUsageStatisticResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetQosUsageStatisticResponseBodyDataGetQosUsageStatisticResList extends TeaModel {
        @NameInMap("BillCount")
        public Long billCount;

        @NameInMap("DsDay")
        public Long dsDay;

        @NameInMap("FailCount")
        public Long failCount;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Month")
        public Long month;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("ProductName")
        public String productName;

        @NameInMap("Provice")
        public String provice;

        @NameInMap("SpecType")
        public String specType;

        @NameInMap("SucessCount")
        public Long sucessCount;

        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("YunOutProduct")
        public String yunOutProduct;

        public static GetQosUsageStatisticResponseBodyDataGetQosUsageStatisticResList build(java.util.Map<String, ?> map) throws Exception {
            GetQosUsageStatisticResponseBodyDataGetQosUsageStatisticResList self = new GetQosUsageStatisticResponseBodyDataGetQosUsageStatisticResList();
            return TeaModel.build(map, self);
        }

        public GetQosUsageStatisticResponseBodyDataGetQosUsageStatisticResList setBillCount(Long billCount) {
            this.billCount = billCount;
            return this;
        }
        public Long getBillCount() {
            return this.billCount;
        }

        public GetQosUsageStatisticResponseBodyDataGetQosUsageStatisticResList setDsDay(Long dsDay) {
            this.dsDay = dsDay;
            return this;
        }
        public Long getDsDay() {
            return this.dsDay;
        }

        public GetQosUsageStatisticResponseBodyDataGetQosUsageStatisticResList setFailCount(Long failCount) {
            this.failCount = failCount;
            return this;
        }
        public Long getFailCount() {
            return this.failCount;
        }

        public GetQosUsageStatisticResponseBodyDataGetQosUsageStatisticResList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetQosUsageStatisticResponseBodyDataGetQosUsageStatisticResList setMonth(Long month) {
            this.month = month;
            return this;
        }
        public Long getMonth() {
            return this.month;
        }

        public GetQosUsageStatisticResponseBodyDataGetQosUsageStatisticResList setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public GetQosUsageStatisticResponseBodyDataGetQosUsageStatisticResList setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public GetQosUsageStatisticResponseBodyDataGetQosUsageStatisticResList setProvice(String provice) {
            this.provice = provice;
            return this;
        }
        public String getProvice() {
            return this.provice;
        }

        public GetQosUsageStatisticResponseBodyDataGetQosUsageStatisticResList setSpecType(String specType) {
            this.specType = specType;
            return this;
        }
        public String getSpecType() {
            return this.specType;
        }

        public GetQosUsageStatisticResponseBodyDataGetQosUsageStatisticResList setSucessCount(Long sucessCount) {
            this.sucessCount = sucessCount;
            return this;
        }
        public Long getSucessCount() {
            return this.sucessCount;
        }

        public GetQosUsageStatisticResponseBodyDataGetQosUsageStatisticResList setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public GetQosUsageStatisticResponseBodyDataGetQosUsageStatisticResList setYunOutProduct(String yunOutProduct) {
            this.yunOutProduct = yunOutProduct;
            return this;
        }
        public String getYunOutProduct() {
            return this.yunOutProduct;
        }

    }

    public static class GetQosUsageStatisticResponseBodyData extends TeaModel {
        @NameInMap("CurPageNum")
        public Integer curPageNum;

        @NameInMap("GetQosUsageStatisticResList")
        public java.util.List<GetQosUsageStatisticResponseBodyDataGetQosUsageStatisticResList> getQosUsageStatisticResList;

        @NameInMap("NumPerPage")
        public Integer numPerPage;

        @NameInMap("TotalNum")
        public Integer totalNum;

        public static GetQosUsageStatisticResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetQosUsageStatisticResponseBodyData self = new GetQosUsageStatisticResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetQosUsageStatisticResponseBodyData setCurPageNum(Integer curPageNum) {
            this.curPageNum = curPageNum;
            return this;
        }
        public Integer getCurPageNum() {
            return this.curPageNum;
        }

        public GetQosUsageStatisticResponseBodyData setGetQosUsageStatisticResList(java.util.List<GetQosUsageStatisticResponseBodyDataGetQosUsageStatisticResList> getQosUsageStatisticResList) {
            this.getQosUsageStatisticResList = getQosUsageStatisticResList;
            return this;
        }
        public java.util.List<GetQosUsageStatisticResponseBodyDataGetQosUsageStatisticResList> getGetQosUsageStatisticResList() {
            return this.getQosUsageStatisticResList;
        }

        public GetQosUsageStatisticResponseBodyData setNumPerPage(Integer numPerPage) {
            this.numPerPage = numPerPage;
            return this;
        }
        public Integer getNumPerPage() {
            return this.numPerPage;
        }

        public GetQosUsageStatisticResponseBodyData setTotalNum(Integer totalNum) {
            this.totalNum = totalNum;
            return this;
        }
        public Integer getTotalNum() {
            return this.totalNum;
        }

    }

}
