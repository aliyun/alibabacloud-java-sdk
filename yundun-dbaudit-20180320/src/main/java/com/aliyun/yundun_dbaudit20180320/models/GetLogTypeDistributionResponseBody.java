// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class GetLogTypeDistributionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TimeList")
    public java.util.List<GetLogTypeDistributionResponseBodyTimeList> timeList;

    public static GetLogTypeDistributionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLogTypeDistributionResponseBody self = new GetLogTypeDistributionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLogTypeDistributionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLogTypeDistributionResponseBody setTimeList(java.util.List<GetLogTypeDistributionResponseBodyTimeList> timeList) {
        this.timeList = timeList;
        return this;
    }
    public java.util.List<GetLogTypeDistributionResponseBodyTimeList> getTimeList() {
        return this.timeList;
    }

    public static class GetLogTypeDistributionResponseBodyTimeList extends TeaModel {
        @NameInMap("EndDate")
        public String endDate;

        @NameInMap("ExecCostUS")
        public String execCostUS;

        @NameInMap("InsertSqlCount")
        public Integer insertSqlCount;

        @NameInMap("SelectSqlCount")
        public Integer selectSqlCount;

        @NameInMap("DeleteSqlCount")
        public Integer deleteSqlCount;

        @NameInMap("BeginDate")
        public String beginDate;

        @NameInMap("OtherSqlCount")
        public Integer otherSqlCount;

        @NameInMap("SqlCount")
        public Integer sqlCount;

        @NameInMap("UpdateSqlCount")
        public Integer updateSqlCount;

        public static GetLogTypeDistributionResponseBodyTimeList build(java.util.Map<String, ?> map) throws Exception {
            GetLogTypeDistributionResponseBodyTimeList self = new GetLogTypeDistributionResponseBodyTimeList();
            return TeaModel.build(map, self);
        }

        public GetLogTypeDistributionResponseBodyTimeList setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public GetLogTypeDistributionResponseBodyTimeList setExecCostUS(String execCostUS) {
            this.execCostUS = execCostUS;
            return this;
        }
        public String getExecCostUS() {
            return this.execCostUS;
        }

        public GetLogTypeDistributionResponseBodyTimeList setInsertSqlCount(Integer insertSqlCount) {
            this.insertSqlCount = insertSqlCount;
            return this;
        }
        public Integer getInsertSqlCount() {
            return this.insertSqlCount;
        }

        public GetLogTypeDistributionResponseBodyTimeList setSelectSqlCount(Integer selectSqlCount) {
            this.selectSqlCount = selectSqlCount;
            return this;
        }
        public Integer getSelectSqlCount() {
            return this.selectSqlCount;
        }

        public GetLogTypeDistributionResponseBodyTimeList setDeleteSqlCount(Integer deleteSqlCount) {
            this.deleteSqlCount = deleteSqlCount;
            return this;
        }
        public Integer getDeleteSqlCount() {
            return this.deleteSqlCount;
        }

        public GetLogTypeDistributionResponseBodyTimeList setBeginDate(String beginDate) {
            this.beginDate = beginDate;
            return this;
        }
        public String getBeginDate() {
            return this.beginDate;
        }

        public GetLogTypeDistributionResponseBodyTimeList setOtherSqlCount(Integer otherSqlCount) {
            this.otherSqlCount = otherSqlCount;
            return this;
        }
        public Integer getOtherSqlCount() {
            return this.otherSqlCount;
        }

        public GetLogTypeDistributionResponseBodyTimeList setSqlCount(Integer sqlCount) {
            this.sqlCount = sqlCount;
            return this;
        }
        public Integer getSqlCount() {
            return this.sqlCount;
        }

        public GetLogTypeDistributionResponseBodyTimeList setUpdateSqlCount(Integer updateSqlCount) {
            this.updateSqlCount = updateSqlCount;
            return this;
        }
        public Integer getUpdateSqlCount() {
            return this.updateSqlCount;
        }

    }

}
