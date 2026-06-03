// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class GetLogTypeDistributionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>8EC13467-A84C-401F-A4A0-AF893066FBA1</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>2019-06-06 00:00:00</p>
         */
        @NameInMap("BeginDate")
        public String beginDate;

        /**
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("DeleteSqlCount")
        public Long deleteSqlCount;

        /**
         * <strong>example:</strong>
         * <p>2019-06-06 01:00:00</p>
         */
        @NameInMap("EndDate")
        public String endDate;

        /**
         * <strong>example:</strong>
         * <p>500000</p>
         */
        @NameInMap("ExecCostUS")
        public String execCostUS;

        /**
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("InsertSqlCount")
        public Long insertSqlCount;

        /**
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("OtherSqlCount")
        public Long otherSqlCount;

        /**
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("SelectSqlCount")
        public Long selectSqlCount;

        /**
         * <strong>example:</strong>
         * <p>50000</p>
         */
        @NameInMap("SqlCount")
        public Long sqlCount;

        /**
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("UpdateSqlCount")
        public Long updateSqlCount;

        public static GetLogTypeDistributionResponseBodyTimeList build(java.util.Map<String, ?> map) throws Exception {
            GetLogTypeDistributionResponseBodyTimeList self = new GetLogTypeDistributionResponseBodyTimeList();
            return TeaModel.build(map, self);
        }

        public GetLogTypeDistributionResponseBodyTimeList setBeginDate(String beginDate) {
            this.beginDate = beginDate;
            return this;
        }
        public String getBeginDate() {
            return this.beginDate;
        }

        public GetLogTypeDistributionResponseBodyTimeList setDeleteSqlCount(Long deleteSqlCount) {
            this.deleteSqlCount = deleteSqlCount;
            return this;
        }
        public Long getDeleteSqlCount() {
            return this.deleteSqlCount;
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

        public GetLogTypeDistributionResponseBodyTimeList setInsertSqlCount(Long insertSqlCount) {
            this.insertSqlCount = insertSqlCount;
            return this;
        }
        public Long getInsertSqlCount() {
            return this.insertSqlCount;
        }

        public GetLogTypeDistributionResponseBodyTimeList setOtherSqlCount(Long otherSqlCount) {
            this.otherSqlCount = otherSqlCount;
            return this;
        }
        public Long getOtherSqlCount() {
            return this.otherSqlCount;
        }

        public GetLogTypeDistributionResponseBodyTimeList setSelectSqlCount(Long selectSqlCount) {
            this.selectSqlCount = selectSqlCount;
            return this;
        }
        public Long getSelectSqlCount() {
            return this.selectSqlCount;
        }

        public GetLogTypeDistributionResponseBodyTimeList setSqlCount(Long sqlCount) {
            this.sqlCount = sqlCount;
            return this;
        }
        public Long getSqlCount() {
            return this.sqlCount;
        }

        public GetLogTypeDistributionResponseBodyTimeList setUpdateSqlCount(Long updateSqlCount) {
            this.updateSqlCount = updateSqlCount;
            return this;
        }
        public Long getUpdateSqlCount() {
            return this.updateSqlCount;
        }

    }

}
