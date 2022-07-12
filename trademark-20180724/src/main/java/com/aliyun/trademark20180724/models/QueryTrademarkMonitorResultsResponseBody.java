// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryTrademarkMonitorResultsResponseBody extends TeaModel {
    @NameInMap("CurrentPageNum")
    public Integer currentPageNum;

    @NameInMap("Data")
    public QueryTrademarkMonitorResultsResponseBodyData data;

    @NameInMap("NextPage")
    public Boolean nextPage;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PrePage")
    public Boolean prePage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalItemNum")
    public Integer totalItemNum;

    @NameInMap("TotalPageNum")
    public Integer totalPageNum;

    public static QueryTrademarkMonitorResultsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTrademarkMonitorResultsResponseBody self = new QueryTrademarkMonitorResultsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTrademarkMonitorResultsResponseBody setCurrentPageNum(Integer currentPageNum) {
        this.currentPageNum = currentPageNum;
        return this;
    }
    public Integer getCurrentPageNum() {
        return this.currentPageNum;
    }

    public QueryTrademarkMonitorResultsResponseBody setData(QueryTrademarkMonitorResultsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryTrademarkMonitorResultsResponseBodyData getData() {
        return this.data;
    }

    public QueryTrademarkMonitorResultsResponseBody setNextPage(Boolean nextPage) {
        this.nextPage = nextPage;
        return this;
    }
    public Boolean getNextPage() {
        return this.nextPage;
    }

    public QueryTrademarkMonitorResultsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryTrademarkMonitorResultsResponseBody setPrePage(Boolean prePage) {
        this.prePage = prePage;
        return this;
    }
    public Boolean getPrePage() {
        return this.prePage;
    }

    public QueryTrademarkMonitorResultsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTrademarkMonitorResultsResponseBody setTotalItemNum(Integer totalItemNum) {
        this.totalItemNum = totalItemNum;
        return this;
    }
    public Integer getTotalItemNum() {
        return this.totalItemNum;
    }

    public QueryTrademarkMonitorResultsResponseBody setTotalPageNum(Integer totalPageNum) {
        this.totalPageNum = totalPageNum;
        return this;
    }
    public Integer getTotalPageNum() {
        return this.totalPageNum;
    }

    public static class QueryTrademarkMonitorResultsResponseBodyDataTmMonitorResult extends TeaModel {
        @NameInMap("ApplyDate")
        public String applyDate;

        @NameInMap("ChesanEndDate")
        public String chesanEndDate;

        @NameInMap("Classification")
        public String classification;

        @NameInMap("DataCreateTime")
        public Long dataCreateTime;

        @NameInMap("DataUpdateTime")
        public Long dataUpdateTime;

        @NameInMap("OwnerEnName")
        public String ownerEnName;

        @NameInMap("OwnerName")
        public String ownerName;

        @NameInMap("RegistrationNumber")
        public String registrationNumber;

        @NameInMap("RuleId")
        public String ruleId;

        @NameInMap("TmImage")
        public String tmImage;

        @NameInMap("TmName")
        public String tmName;

        @NameInMap("TmProcedureStatusDesc")
        public String tmProcedureStatusDesc;

        @NameInMap("TmUid")
        public String tmUid;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("WuxiaoEndDate")
        public String wuxiaoEndDate;

        @NameInMap("XuzhanEndDate")
        public String xuzhanEndDate;

        @NameInMap("YiyiEndDate")
        public String yiyiEndDate;

        public static QueryTrademarkMonitorResultsResponseBodyDataTmMonitorResult build(java.util.Map<String, ?> map) throws Exception {
            QueryTrademarkMonitorResultsResponseBodyDataTmMonitorResult self = new QueryTrademarkMonitorResultsResponseBodyDataTmMonitorResult();
            return TeaModel.build(map, self);
        }

        public QueryTrademarkMonitorResultsResponseBodyDataTmMonitorResult setApplyDate(String applyDate) {
            this.applyDate = applyDate;
            return this;
        }
        public String getApplyDate() {
            return this.applyDate;
        }

        public QueryTrademarkMonitorResultsResponseBodyDataTmMonitorResult setChesanEndDate(String chesanEndDate) {
            this.chesanEndDate = chesanEndDate;
            return this;
        }
        public String getChesanEndDate() {
            return this.chesanEndDate;
        }

        public QueryTrademarkMonitorResultsResponseBodyDataTmMonitorResult setClassification(String classification) {
            this.classification = classification;
            return this;
        }
        public String getClassification() {
            return this.classification;
        }

        public QueryTrademarkMonitorResultsResponseBodyDataTmMonitorResult setDataCreateTime(Long dataCreateTime) {
            this.dataCreateTime = dataCreateTime;
            return this;
        }
        public Long getDataCreateTime() {
            return this.dataCreateTime;
        }

        public QueryTrademarkMonitorResultsResponseBodyDataTmMonitorResult setDataUpdateTime(Long dataUpdateTime) {
            this.dataUpdateTime = dataUpdateTime;
            return this;
        }
        public Long getDataUpdateTime() {
            return this.dataUpdateTime;
        }

        public QueryTrademarkMonitorResultsResponseBodyDataTmMonitorResult setOwnerEnName(String ownerEnName) {
            this.ownerEnName = ownerEnName;
            return this;
        }
        public String getOwnerEnName() {
            return this.ownerEnName;
        }

        public QueryTrademarkMonitorResultsResponseBodyDataTmMonitorResult setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public QueryTrademarkMonitorResultsResponseBodyDataTmMonitorResult setRegistrationNumber(String registrationNumber) {
            this.registrationNumber = registrationNumber;
            return this;
        }
        public String getRegistrationNumber() {
            return this.registrationNumber;
        }

        public QueryTrademarkMonitorResultsResponseBodyDataTmMonitorResult setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public QueryTrademarkMonitorResultsResponseBodyDataTmMonitorResult setTmImage(String tmImage) {
            this.tmImage = tmImage;
            return this;
        }
        public String getTmImage() {
            return this.tmImage;
        }

        public QueryTrademarkMonitorResultsResponseBodyDataTmMonitorResult setTmName(String tmName) {
            this.tmName = tmName;
            return this;
        }
        public String getTmName() {
            return this.tmName;
        }

        public QueryTrademarkMonitorResultsResponseBodyDataTmMonitorResult setTmProcedureStatusDesc(String tmProcedureStatusDesc) {
            this.tmProcedureStatusDesc = tmProcedureStatusDesc;
            return this;
        }
        public String getTmProcedureStatusDesc() {
            return this.tmProcedureStatusDesc;
        }

        public QueryTrademarkMonitorResultsResponseBodyDataTmMonitorResult setTmUid(String tmUid) {
            this.tmUid = tmUid;
            return this;
        }
        public String getTmUid() {
            return this.tmUid;
        }

        public QueryTrademarkMonitorResultsResponseBodyDataTmMonitorResult setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public QueryTrademarkMonitorResultsResponseBodyDataTmMonitorResult setWuxiaoEndDate(String wuxiaoEndDate) {
            this.wuxiaoEndDate = wuxiaoEndDate;
            return this;
        }
        public String getWuxiaoEndDate() {
            return this.wuxiaoEndDate;
        }

        public QueryTrademarkMonitorResultsResponseBodyDataTmMonitorResult setXuzhanEndDate(String xuzhanEndDate) {
            this.xuzhanEndDate = xuzhanEndDate;
            return this;
        }
        public String getXuzhanEndDate() {
            return this.xuzhanEndDate;
        }

        public QueryTrademarkMonitorResultsResponseBodyDataTmMonitorResult setYiyiEndDate(String yiyiEndDate) {
            this.yiyiEndDate = yiyiEndDate;
            return this;
        }
        public String getYiyiEndDate() {
            return this.yiyiEndDate;
        }

    }

    public static class QueryTrademarkMonitorResultsResponseBodyData extends TeaModel {
        @NameInMap("TmMonitorResult")
        public java.util.List<QueryTrademarkMonitorResultsResponseBodyDataTmMonitorResult> tmMonitorResult;

        public static QueryTrademarkMonitorResultsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryTrademarkMonitorResultsResponseBodyData self = new QueryTrademarkMonitorResultsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryTrademarkMonitorResultsResponseBodyData setTmMonitorResult(java.util.List<QueryTrademarkMonitorResultsResponseBodyDataTmMonitorResult> tmMonitorResult) {
            this.tmMonitorResult = tmMonitorResult;
            return this;
        }
        public java.util.List<QueryTrademarkMonitorResultsResponseBodyDataTmMonitorResult> getTmMonitorResult() {
            return this.tmMonitorResult;
        }

    }

}
