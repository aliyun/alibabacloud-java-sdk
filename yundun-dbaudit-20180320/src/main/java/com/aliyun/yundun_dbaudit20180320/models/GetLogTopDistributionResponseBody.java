// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class GetLogTopDistributionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TimeList")
    public java.util.List<GetLogTopDistributionResponseBodyTimeList> timeList;

    public static GetLogTopDistributionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLogTopDistributionResponseBody self = new GetLogTopDistributionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLogTopDistributionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLogTopDistributionResponseBody setTimeList(java.util.List<GetLogTopDistributionResponseBodyTimeList> timeList) {
        this.timeList = timeList;
        return this;
    }
    public java.util.List<GetLogTopDistributionResponseBodyTimeList> getTimeList() {
        return this.timeList;
    }

    public static class GetLogTopDistributionResponseBodyTimeList extends TeaModel {
        @NameInMap("BeginDate")
        public String beginDate;

        @NameInMap("SqlCount")
        public Long sqlCount;

        @NameInMap("EndDate")
        public String endDate;

        @NameInMap("TopTime")
        public String topTime;

        public static GetLogTopDistributionResponseBodyTimeList build(java.util.Map<String, ?> map) throws Exception {
            GetLogTopDistributionResponseBodyTimeList self = new GetLogTopDistributionResponseBodyTimeList();
            return TeaModel.build(map, self);
        }

        public GetLogTopDistributionResponseBodyTimeList setBeginDate(String beginDate) {
            this.beginDate = beginDate;
            return this;
        }
        public String getBeginDate() {
            return this.beginDate;
        }

        public GetLogTopDistributionResponseBodyTimeList setSqlCount(Long sqlCount) {
            this.sqlCount = sqlCount;
            return this;
        }
        public Long getSqlCount() {
            return this.sqlCount;
        }

        public GetLogTopDistributionResponseBodyTimeList setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public GetLogTopDistributionResponseBodyTimeList setTopTime(String topTime) {
            this.topTime = topTime;
            return this;
        }
        public String getTopTime() {
            return this.topTime;
        }

    }

}
