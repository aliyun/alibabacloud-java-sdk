// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411.models;

import com.aliyun.tea.*;

public class GetFeeHistoryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("FeeList")
    public GetFeeHistoryResponseBodyFeeList feeList;

    @NameInMap("Pager")
    public GetFeeHistoryResponseBodyPager pager;

    @NameInMap("Code")
    public Integer code;

    public static GetFeeHistoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFeeHistoryResponseBody self = new GetFeeHistoryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFeeHistoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetFeeHistoryResponseBody setFeeList(GetFeeHistoryResponseBodyFeeList feeList) {
        this.feeList = feeList;
        return this;
    }
    public GetFeeHistoryResponseBodyFeeList getFeeList() {
        return this.feeList;
    }

    public GetFeeHistoryResponseBody setPager(GetFeeHistoryResponseBodyPager pager) {
        this.pager = pager;
        return this;
    }
    public GetFeeHistoryResponseBodyPager getPager() {
        return this.pager;
    }

    public GetFeeHistoryResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public static class GetFeeHistoryResponseBodyFeeListFee extends TeaModel {
        @NameInMap("EndDate")
        public String endDate;

        @NameInMap("TimeSpan")
        public String timeSpan;

        @NameInMap("Date")
        public String date;

        @NameInMap("StartDate")
        public String startDate;

        @NameInMap("LevelThreeTraffic")
        public Integer levelThreeTraffic;

        @NameInMap("Mode")
        public String mode;

        @NameInMap("TotalTraffic")
        public Integer totalTraffic;

        @NameInMap("BusinessType")
        public String businessType;

        @NameInMap("LevelTwoTraffic")
        public Integer levelTwoTraffic;

        @NameInMap("LevelThreeBandwidth")
        public Integer levelThreeBandwidth;

        @NameInMap("LevelTwoBandwidth")
        public Integer levelTwoBandwidth;

        @NameInMap("FlowOut")
        public Integer flowOut;

        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("TotalBandwidth")
        public Integer totalBandwidth;

        public static GetFeeHistoryResponseBodyFeeListFee build(java.util.Map<String, ?> map) throws Exception {
            GetFeeHistoryResponseBodyFeeListFee self = new GetFeeHistoryResponseBodyFeeListFee();
            return TeaModel.build(map, self);
        }

        public GetFeeHistoryResponseBodyFeeListFee setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public GetFeeHistoryResponseBodyFeeListFee setTimeSpan(String timeSpan) {
            this.timeSpan = timeSpan;
            return this;
        }
        public String getTimeSpan() {
            return this.timeSpan;
        }

        public GetFeeHistoryResponseBodyFeeListFee setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public GetFeeHistoryResponseBodyFeeListFee setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

        public GetFeeHistoryResponseBodyFeeListFee setLevelThreeTraffic(Integer levelThreeTraffic) {
            this.levelThreeTraffic = levelThreeTraffic;
            return this;
        }
        public Integer getLevelThreeTraffic() {
            return this.levelThreeTraffic;
        }

        public GetFeeHistoryResponseBodyFeeListFee setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public GetFeeHistoryResponseBodyFeeListFee setTotalTraffic(Integer totalTraffic) {
            this.totalTraffic = totalTraffic;
            return this;
        }
        public Integer getTotalTraffic() {
            return this.totalTraffic;
        }

        public GetFeeHistoryResponseBodyFeeListFee setBusinessType(String businessType) {
            this.businessType = businessType;
            return this;
        }
        public String getBusinessType() {
            return this.businessType;
        }

        public GetFeeHistoryResponseBodyFeeListFee setLevelTwoTraffic(Integer levelTwoTraffic) {
            this.levelTwoTraffic = levelTwoTraffic;
            return this;
        }
        public Integer getLevelTwoTraffic() {
            return this.levelTwoTraffic;
        }

        public GetFeeHistoryResponseBodyFeeListFee setLevelThreeBandwidth(Integer levelThreeBandwidth) {
            this.levelThreeBandwidth = levelThreeBandwidth;
            return this;
        }
        public Integer getLevelThreeBandwidth() {
            return this.levelThreeBandwidth;
        }

        public GetFeeHistoryResponseBodyFeeListFee setLevelTwoBandwidth(Integer levelTwoBandwidth) {
            this.levelTwoBandwidth = levelTwoBandwidth;
            return this;
        }
        public Integer getLevelTwoBandwidth() {
            return this.levelTwoBandwidth;
        }

        public GetFeeHistoryResponseBodyFeeListFee setFlowOut(Integer flowOut) {
            this.flowOut = flowOut;
            return this;
        }
        public Integer getFlowOut() {
            return this.flowOut;
        }

        public GetFeeHistoryResponseBodyFeeListFee setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public GetFeeHistoryResponseBodyFeeListFee setTotalBandwidth(Integer totalBandwidth) {
            this.totalBandwidth = totalBandwidth;
            return this;
        }
        public Integer getTotalBandwidth() {
            return this.totalBandwidth;
        }

    }

    public static class GetFeeHistoryResponseBodyFeeList extends TeaModel {
        @NameInMap("Fee")
        public java.util.List<GetFeeHistoryResponseBodyFeeListFee> fee;

        public static GetFeeHistoryResponseBodyFeeList build(java.util.Map<String, ?> map) throws Exception {
            GetFeeHistoryResponseBodyFeeList self = new GetFeeHistoryResponseBodyFeeList();
            return TeaModel.build(map, self);
        }

        public GetFeeHistoryResponseBodyFeeList setFee(java.util.List<GetFeeHistoryResponseBodyFeeListFee> fee) {
            this.fee = fee;
            return this;
        }
        public java.util.List<GetFeeHistoryResponseBodyFeeListFee> getFee() {
            return this.fee;
        }

    }

    public static class GetFeeHistoryResponseBodyPager extends TeaModel {
        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Total")
        public Integer total;

        @NameInMap("Page")
        public Integer page;

        public static GetFeeHistoryResponseBodyPager build(java.util.Map<String, ?> map) throws Exception {
            GetFeeHistoryResponseBodyPager self = new GetFeeHistoryResponseBodyPager();
            return TeaModel.build(map, self);
        }

        public GetFeeHistoryResponseBodyPager setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetFeeHistoryResponseBodyPager setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public GetFeeHistoryResponseBodyPager setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

    }

}
