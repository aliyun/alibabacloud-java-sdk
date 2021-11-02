// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class QueryIncomeDataResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public QueryIncomeDataResponseBodyModel model;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryIncomeDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryIncomeDataResponseBody self = new QueryIncomeDataResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryIncomeDataResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryIncomeDataResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryIncomeDataResponseBody setModel(QueryIncomeDataResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public QueryIncomeDataResponseBodyModel getModel() {
        return this.model;
    }

    public QueryIncomeDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryIncomeDataResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryIncomeDataResponseBodyModel extends TeaModel {
        @NameInMap("AccEstIncomeRate")
        public String accEstIncomeRate;

        @NameInMap("AccessStatus")
        public Long accessStatus;

        @NameInMap("AccumulatedIncome")
        public Long accumulatedIncome;

        @NameInMap("AdSlotClickRate")
        public String adSlotClickRate;

        @NameInMap("AdSlotHitRate")
        public String adSlotHitRate;

        @NameInMap("AdSlotHitTimes")
        public Long adSlotHitTimes;

        @NameInMap("AdSlotId")
        public String adSlotId;

        @NameInMap("AdSlotName")
        public String adSlotName;

        @NameInMap("AdSlotRequests")
        public Long adSlotRequests;

        @NameInMap("AdSlotShowRate")
        public String adSlotShowRate;

        @NameInMap("AdSlotType")
        public String adSlotType;

        @NameInMap("ChannelId")
        public String channelId;

        @NameInMap("ChannelName")
        public String channelName;

        @NameInMap("ClickTimes")
        public Long clickTimes;

        @NameInMap("Ecpm")
        public Long ecpm;

        @NameInMap("EcpmRate")
        public String ecpmRate;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("EstimatedIncome")
        public Long estimatedIncome;

        @NameInMap("LastDayEstimatedIncome")
        public Long lastDayEstimatedIncome;

        @NameInMap("MediaId")
        public String mediaId;

        @NameInMap("MediaName")
        public String mediaName;

        @NameInMap("ShowTimes")
        public Long showTimes;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("ThisDaysEstIncome")
        public Long thisDaysEstIncome;

        @NameInMap("ThisDaysEstIncomeRate")
        public String thisDaysEstIncomeRate;

        @NameInMap("ThisMonEstIncomeRate")
        public String thisMonEstIncomeRate;

        @NameInMap("ThisMonEstimatedIncome")
        public Long thisMonEstimatedIncome;

        @NameInMap("ThisYearEstIncomeRate")
        public String thisYearEstIncomeRate;

        @NameInMap("ThisYearIncome")
        public Long thisYearIncome;

        public static QueryIncomeDataResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            QueryIncomeDataResponseBodyModel self = new QueryIncomeDataResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public QueryIncomeDataResponseBodyModel setAccEstIncomeRate(String accEstIncomeRate) {
            this.accEstIncomeRate = accEstIncomeRate;
            return this;
        }
        public String getAccEstIncomeRate() {
            return this.accEstIncomeRate;
        }

        public QueryIncomeDataResponseBodyModel setAccessStatus(Long accessStatus) {
            this.accessStatus = accessStatus;
            return this;
        }
        public Long getAccessStatus() {
            return this.accessStatus;
        }

        public QueryIncomeDataResponseBodyModel setAccumulatedIncome(Long accumulatedIncome) {
            this.accumulatedIncome = accumulatedIncome;
            return this;
        }
        public Long getAccumulatedIncome() {
            return this.accumulatedIncome;
        }

        public QueryIncomeDataResponseBodyModel setAdSlotClickRate(String adSlotClickRate) {
            this.adSlotClickRate = adSlotClickRate;
            return this;
        }
        public String getAdSlotClickRate() {
            return this.adSlotClickRate;
        }

        public QueryIncomeDataResponseBodyModel setAdSlotHitRate(String adSlotHitRate) {
            this.adSlotHitRate = adSlotHitRate;
            return this;
        }
        public String getAdSlotHitRate() {
            return this.adSlotHitRate;
        }

        public QueryIncomeDataResponseBodyModel setAdSlotHitTimes(Long adSlotHitTimes) {
            this.adSlotHitTimes = adSlotHitTimes;
            return this;
        }
        public Long getAdSlotHitTimes() {
            return this.adSlotHitTimes;
        }

        public QueryIncomeDataResponseBodyModel setAdSlotId(String adSlotId) {
            this.adSlotId = adSlotId;
            return this;
        }
        public String getAdSlotId() {
            return this.adSlotId;
        }

        public QueryIncomeDataResponseBodyModel setAdSlotName(String adSlotName) {
            this.adSlotName = adSlotName;
            return this;
        }
        public String getAdSlotName() {
            return this.adSlotName;
        }

        public QueryIncomeDataResponseBodyModel setAdSlotRequests(Long adSlotRequests) {
            this.adSlotRequests = adSlotRequests;
            return this;
        }
        public Long getAdSlotRequests() {
            return this.adSlotRequests;
        }

        public QueryIncomeDataResponseBodyModel setAdSlotShowRate(String adSlotShowRate) {
            this.adSlotShowRate = adSlotShowRate;
            return this;
        }
        public String getAdSlotShowRate() {
            return this.adSlotShowRate;
        }

        public QueryIncomeDataResponseBodyModel setAdSlotType(String adSlotType) {
            this.adSlotType = adSlotType;
            return this;
        }
        public String getAdSlotType() {
            return this.adSlotType;
        }

        public QueryIncomeDataResponseBodyModel setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public QueryIncomeDataResponseBodyModel setChannelName(String channelName) {
            this.channelName = channelName;
            return this;
        }
        public String getChannelName() {
            return this.channelName;
        }

        public QueryIncomeDataResponseBodyModel setClickTimes(Long clickTimes) {
            this.clickTimes = clickTimes;
            return this;
        }
        public Long getClickTimes() {
            return this.clickTimes;
        }

        public QueryIncomeDataResponseBodyModel setEcpm(Long ecpm) {
            this.ecpm = ecpm;
            return this;
        }
        public Long getEcpm() {
            return this.ecpm;
        }

        public QueryIncomeDataResponseBodyModel setEcpmRate(String ecpmRate) {
            this.ecpmRate = ecpmRate;
            return this;
        }
        public String getEcpmRate() {
            return this.ecpmRate;
        }

        public QueryIncomeDataResponseBodyModel setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public QueryIncomeDataResponseBodyModel setEstimatedIncome(Long estimatedIncome) {
            this.estimatedIncome = estimatedIncome;
            return this;
        }
        public Long getEstimatedIncome() {
            return this.estimatedIncome;
        }

        public QueryIncomeDataResponseBodyModel setLastDayEstimatedIncome(Long lastDayEstimatedIncome) {
            this.lastDayEstimatedIncome = lastDayEstimatedIncome;
            return this;
        }
        public Long getLastDayEstimatedIncome() {
            return this.lastDayEstimatedIncome;
        }

        public QueryIncomeDataResponseBodyModel setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public QueryIncomeDataResponseBodyModel setMediaName(String mediaName) {
            this.mediaName = mediaName;
            return this;
        }
        public String getMediaName() {
            return this.mediaName;
        }

        public QueryIncomeDataResponseBodyModel setShowTimes(Long showTimes) {
            this.showTimes = showTimes;
            return this;
        }
        public Long getShowTimes() {
            return this.showTimes;
        }

        public QueryIncomeDataResponseBodyModel setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public QueryIncomeDataResponseBodyModel setThisDaysEstIncome(Long thisDaysEstIncome) {
            this.thisDaysEstIncome = thisDaysEstIncome;
            return this;
        }
        public Long getThisDaysEstIncome() {
            return this.thisDaysEstIncome;
        }

        public QueryIncomeDataResponseBodyModel setThisDaysEstIncomeRate(String thisDaysEstIncomeRate) {
            this.thisDaysEstIncomeRate = thisDaysEstIncomeRate;
            return this;
        }
        public String getThisDaysEstIncomeRate() {
            return this.thisDaysEstIncomeRate;
        }

        public QueryIncomeDataResponseBodyModel setThisMonEstIncomeRate(String thisMonEstIncomeRate) {
            this.thisMonEstIncomeRate = thisMonEstIncomeRate;
            return this;
        }
        public String getThisMonEstIncomeRate() {
            return this.thisMonEstIncomeRate;
        }

        public QueryIncomeDataResponseBodyModel setThisMonEstimatedIncome(Long thisMonEstimatedIncome) {
            this.thisMonEstimatedIncome = thisMonEstimatedIncome;
            return this;
        }
        public Long getThisMonEstimatedIncome() {
            return this.thisMonEstimatedIncome;
        }

        public QueryIncomeDataResponseBodyModel setThisYearEstIncomeRate(String thisYearEstIncomeRate) {
            this.thisYearEstIncomeRate = thisYearEstIncomeRate;
            return this;
        }
        public String getThisYearEstIncomeRate() {
            return this.thisYearEstIncomeRate;
        }

        public QueryIncomeDataResponseBodyModel setThisYearIncome(Long thisYearIncome) {
            this.thisYearIncome = thisYearIncome;
            return this;
        }
        public Long getThisYearIncome() {
            return this.thisYearIncome;
        }

    }

}
