// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class QueryIncomeTrendResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public java.util.List<QueryIncomeTrendResponseBodyModel> model;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Total")
    public Long total;

    public static QueryIncomeTrendResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryIncomeTrendResponseBody self = new QueryIncomeTrendResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryIncomeTrendResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryIncomeTrendResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryIncomeTrendResponseBody setModel(java.util.List<QueryIncomeTrendResponseBodyModel> model) {
        this.model = model;
        return this;
    }
    public java.util.List<QueryIncomeTrendResponseBodyModel> getModel() {
        return this.model;
    }

    public QueryIncomeTrendResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QueryIncomeTrendResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryIncomeTrendResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryIncomeTrendResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryIncomeTrendResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class QueryIncomeTrendResponseBodyModel extends TeaModel {
        @NameInMap("AccEstIncomeRate")
        public String accEstIncomeRate;

        @NameInMap("AccessStatus")
        public Long accessStatus;

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

        @NameInMap("BizDate")
        public Long bizDate;

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

        @NameInMap("ThisYearEstIncomeRate")
        public String thisYearEstIncomeRate;

        public static QueryIncomeTrendResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            QueryIncomeTrendResponseBodyModel self = new QueryIncomeTrendResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public QueryIncomeTrendResponseBodyModel setAccEstIncomeRate(String accEstIncomeRate) {
            this.accEstIncomeRate = accEstIncomeRate;
            return this;
        }
        public String getAccEstIncomeRate() {
            return this.accEstIncomeRate;
        }

        public QueryIncomeTrendResponseBodyModel setAccessStatus(Long accessStatus) {
            this.accessStatus = accessStatus;
            return this;
        }
        public Long getAccessStatus() {
            return this.accessStatus;
        }

        public QueryIncomeTrendResponseBodyModel setAdSlotClickRate(String adSlotClickRate) {
            this.adSlotClickRate = adSlotClickRate;
            return this;
        }
        public String getAdSlotClickRate() {
            return this.adSlotClickRate;
        }

        public QueryIncomeTrendResponseBodyModel setAdSlotHitRate(String adSlotHitRate) {
            this.adSlotHitRate = adSlotHitRate;
            return this;
        }
        public String getAdSlotHitRate() {
            return this.adSlotHitRate;
        }

        public QueryIncomeTrendResponseBodyModel setAdSlotHitTimes(Long adSlotHitTimes) {
            this.adSlotHitTimes = adSlotHitTimes;
            return this;
        }
        public Long getAdSlotHitTimes() {
            return this.adSlotHitTimes;
        }

        public QueryIncomeTrendResponseBodyModel setAdSlotId(String adSlotId) {
            this.adSlotId = adSlotId;
            return this;
        }
        public String getAdSlotId() {
            return this.adSlotId;
        }

        public QueryIncomeTrendResponseBodyModel setAdSlotName(String adSlotName) {
            this.adSlotName = adSlotName;
            return this;
        }
        public String getAdSlotName() {
            return this.adSlotName;
        }

        public QueryIncomeTrendResponseBodyModel setAdSlotRequests(Long adSlotRequests) {
            this.adSlotRequests = adSlotRequests;
            return this;
        }
        public Long getAdSlotRequests() {
            return this.adSlotRequests;
        }

        public QueryIncomeTrendResponseBodyModel setAdSlotShowRate(String adSlotShowRate) {
            this.adSlotShowRate = adSlotShowRate;
            return this;
        }
        public String getAdSlotShowRate() {
            return this.adSlotShowRate;
        }

        public QueryIncomeTrendResponseBodyModel setAdSlotType(String adSlotType) {
            this.adSlotType = adSlotType;
            return this;
        }
        public String getAdSlotType() {
            return this.adSlotType;
        }

        public QueryIncomeTrendResponseBodyModel setBizDate(Long bizDate) {
            this.bizDate = bizDate;
            return this;
        }
        public Long getBizDate() {
            return this.bizDate;
        }

        public QueryIncomeTrendResponseBodyModel setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public QueryIncomeTrendResponseBodyModel setChannelName(String channelName) {
            this.channelName = channelName;
            return this;
        }
        public String getChannelName() {
            return this.channelName;
        }

        public QueryIncomeTrendResponseBodyModel setClickTimes(Long clickTimes) {
            this.clickTimes = clickTimes;
            return this;
        }
        public Long getClickTimes() {
            return this.clickTimes;
        }

        public QueryIncomeTrendResponseBodyModel setEcpm(Long ecpm) {
            this.ecpm = ecpm;
            return this;
        }
        public Long getEcpm() {
            return this.ecpm;
        }

        public QueryIncomeTrendResponseBodyModel setEcpmRate(String ecpmRate) {
            this.ecpmRate = ecpmRate;
            return this;
        }
        public String getEcpmRate() {
            return this.ecpmRate;
        }

        public QueryIncomeTrendResponseBodyModel setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public QueryIncomeTrendResponseBodyModel setEstimatedIncome(Long estimatedIncome) {
            this.estimatedIncome = estimatedIncome;
            return this;
        }
        public Long getEstimatedIncome() {
            return this.estimatedIncome;
        }

        public QueryIncomeTrendResponseBodyModel setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public QueryIncomeTrendResponseBodyModel setMediaName(String mediaName) {
            this.mediaName = mediaName;
            return this;
        }
        public String getMediaName() {
            return this.mediaName;
        }

        public QueryIncomeTrendResponseBodyModel setShowTimes(Long showTimes) {
            this.showTimes = showTimes;
            return this;
        }
        public Long getShowTimes() {
            return this.showTimes;
        }

        public QueryIncomeTrendResponseBodyModel setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public QueryIncomeTrendResponseBodyModel setThisDaysEstIncome(Long thisDaysEstIncome) {
            this.thisDaysEstIncome = thisDaysEstIncome;
            return this;
        }
        public Long getThisDaysEstIncome() {
            return this.thisDaysEstIncome;
        }

        public QueryIncomeTrendResponseBodyModel setThisDaysEstIncomeRate(String thisDaysEstIncomeRate) {
            this.thisDaysEstIncomeRate = thisDaysEstIncomeRate;
            return this;
        }
        public String getThisDaysEstIncomeRate() {
            return this.thisDaysEstIncomeRate;
        }

        public QueryIncomeTrendResponseBodyModel setThisMonEstIncomeRate(String thisMonEstIncomeRate) {
            this.thisMonEstIncomeRate = thisMonEstIncomeRate;
            return this;
        }
        public String getThisMonEstIncomeRate() {
            return this.thisMonEstIncomeRate;
        }

        public QueryIncomeTrendResponseBodyModel setThisYearEstIncomeRate(String thisYearEstIncomeRate) {
            this.thisYearEstIncomeRate = thisYearEstIncomeRate;
            return this;
        }
        public String getThisYearEstIncomeRate() {
            return this.thisYearEstIncomeRate;
        }

    }

}
