// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411.models;

import com.aliyun.tea.*;

public class GetFeeHistoryResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public Integer code;

    @NameInMap("FeeList")
    @Validation(required = true)
    public GetFeeHistoryResponseFeeList feeList;

    @NameInMap("Pager")
    @Validation(required = true)
    public GetFeeHistoryResponsePager pager;

    public static GetFeeHistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFeeHistoryResponse self = new GetFeeHistoryResponse();
        return TeaModel.build(map, self);
    }

    public GetFeeHistoryResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetFeeHistoryResponse setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetFeeHistoryResponse setFeeList(GetFeeHistoryResponseFeeList feeList) {
        this.feeList = feeList;
        return this;
    }
    public GetFeeHistoryResponseFeeList getFeeList() {
        return this.feeList;
    }

    public GetFeeHistoryResponse setPager(GetFeeHistoryResponsePager pager) {
        this.pager = pager;
        return this;
    }
    public GetFeeHistoryResponsePager getPager() {
        return this.pager;
    }

    public static class GetFeeHistoryResponseFeeListFee extends TeaModel {
        @NameInMap("Date")
        @Validation(required = true)
        public String date;

        @NameInMap("Mode")
        @Validation(required = true)
        public String mode;

        @NameInMap("TotalBandwidth")
        @Validation(required = true)
        public Integer totalBandwidth;

        @NameInMap("LevelTwoBandwidth")
        @Validation(required = true)
        public Integer levelTwoBandwidth;

        @NameInMap("LevelThreeBandwidth")
        @Validation(required = true)
        public Integer levelThreeBandwidth;

        @NameInMap("TotalTraffic")
        @Validation(required = true)
        public Integer totalTraffic;

        @NameInMap("LevelTwoTraffic")
        @Validation(required = true)
        public Integer levelTwoTraffic;

        @NameInMap("LevelThreeTraffic")
        @Validation(required = true)
        public Integer levelThreeTraffic;

        @NameInMap("TimeSpan")
        @Validation(required = true)
        public String timeSpan;

        @NameInMap("BusinessType")
        @Validation(required = true)
        public String businessType;

        @NameInMap("StartDate")
        @Validation(required = true)
        public String startDate;

        @NameInMap("EndDate")
        @Validation(required = true)
        public String endDate;

        @NameInMap("ResourceId")
        @Validation(required = true)
        public String resourceId;

        @NameInMap("FlowOut")
        @Validation(required = true)
        public Integer flowOut;

        public static GetFeeHistoryResponseFeeListFee build(java.util.Map<String, ?> map) throws Exception {
            GetFeeHistoryResponseFeeListFee self = new GetFeeHistoryResponseFeeListFee();
            return TeaModel.build(map, self);
        }

        public GetFeeHistoryResponseFeeListFee setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public GetFeeHistoryResponseFeeListFee setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public GetFeeHistoryResponseFeeListFee setTotalBandwidth(Integer totalBandwidth) {
            this.totalBandwidth = totalBandwidth;
            return this;
        }
        public Integer getTotalBandwidth() {
            return this.totalBandwidth;
        }

        public GetFeeHistoryResponseFeeListFee setLevelTwoBandwidth(Integer levelTwoBandwidth) {
            this.levelTwoBandwidth = levelTwoBandwidth;
            return this;
        }
        public Integer getLevelTwoBandwidth() {
            return this.levelTwoBandwidth;
        }

        public GetFeeHistoryResponseFeeListFee setLevelThreeBandwidth(Integer levelThreeBandwidth) {
            this.levelThreeBandwidth = levelThreeBandwidth;
            return this;
        }
        public Integer getLevelThreeBandwidth() {
            return this.levelThreeBandwidth;
        }

        public GetFeeHistoryResponseFeeListFee setTotalTraffic(Integer totalTraffic) {
            this.totalTraffic = totalTraffic;
            return this;
        }
        public Integer getTotalTraffic() {
            return this.totalTraffic;
        }

        public GetFeeHistoryResponseFeeListFee setLevelTwoTraffic(Integer levelTwoTraffic) {
            this.levelTwoTraffic = levelTwoTraffic;
            return this;
        }
        public Integer getLevelTwoTraffic() {
            return this.levelTwoTraffic;
        }

        public GetFeeHistoryResponseFeeListFee setLevelThreeTraffic(Integer levelThreeTraffic) {
            this.levelThreeTraffic = levelThreeTraffic;
            return this;
        }
        public Integer getLevelThreeTraffic() {
            return this.levelThreeTraffic;
        }

        public GetFeeHistoryResponseFeeListFee setTimeSpan(String timeSpan) {
            this.timeSpan = timeSpan;
            return this;
        }
        public String getTimeSpan() {
            return this.timeSpan;
        }

        public GetFeeHistoryResponseFeeListFee setBusinessType(String businessType) {
            this.businessType = businessType;
            return this;
        }
        public String getBusinessType() {
            return this.businessType;
        }

        public GetFeeHistoryResponseFeeListFee setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

        public GetFeeHistoryResponseFeeListFee setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public GetFeeHistoryResponseFeeListFee setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public GetFeeHistoryResponseFeeListFee setFlowOut(Integer flowOut) {
            this.flowOut = flowOut;
            return this;
        }
        public Integer getFlowOut() {
            return this.flowOut;
        }

    }

    public static class GetFeeHistoryResponseFeeList extends TeaModel {
        @NameInMap("Fee")
        @Validation(required = true)
        public java.util.List<GetFeeHistoryResponseFeeListFee> fee;

        public static GetFeeHistoryResponseFeeList build(java.util.Map<String, ?> map) throws Exception {
            GetFeeHistoryResponseFeeList self = new GetFeeHistoryResponseFeeList();
            return TeaModel.build(map, self);
        }

        public GetFeeHistoryResponseFeeList setFee(java.util.List<GetFeeHistoryResponseFeeListFee> fee) {
            this.fee = fee;
            return this;
        }
        public java.util.List<GetFeeHistoryResponseFeeListFee> getFee() {
            return this.fee;
        }

    }

    public static class GetFeeHistoryResponsePager extends TeaModel {
        @NameInMap("Page")
        @Validation(required = true)
        public Integer page;

        @NameInMap("Total")
        @Validation(required = true)
        public Integer total;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        public static GetFeeHistoryResponsePager build(java.util.Map<String, ?> map) throws Exception {
            GetFeeHistoryResponsePager self = new GetFeeHistoryResponsePager();
            return TeaModel.build(map, self);
        }

        public GetFeeHistoryResponsePager setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public GetFeeHistoryResponsePager setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public GetFeeHistoryResponsePager setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

    }

}
