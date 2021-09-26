// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class GetSessionDistributionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TimeList")
    public java.util.List<GetSessionDistributionResponseBodyTimeList> timeList;

    public static GetSessionDistributionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSessionDistributionResponseBody self = new GetSessionDistributionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSessionDistributionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSessionDistributionResponseBody setTimeList(java.util.List<GetSessionDistributionResponseBodyTimeList> timeList) {
        this.timeList = timeList;
        return this;
    }
    public java.util.List<GetSessionDistributionResponseBodyTimeList> getTimeList() {
        return this.timeList;
    }

    public static class GetSessionDistributionResponseBodyTimeList extends TeaModel {
        @NameInMap("BeginDate")
        public String beginDate;

        @NameInMap("LoginSessionCount")
        public Integer loginSessionCount;

        @NameInMap("ActiveSessionCount")
        public Integer activeSessionCount;

        @NameInMap("EndDate")
        public String endDate;

        @NameInMap("ErrorSessionCount")
        public Integer errorSessionCount;

        public static GetSessionDistributionResponseBodyTimeList build(java.util.Map<String, ?> map) throws Exception {
            GetSessionDistributionResponseBodyTimeList self = new GetSessionDistributionResponseBodyTimeList();
            return TeaModel.build(map, self);
        }

        public GetSessionDistributionResponseBodyTimeList setBeginDate(String beginDate) {
            this.beginDate = beginDate;
            return this;
        }
        public String getBeginDate() {
            return this.beginDate;
        }

        public GetSessionDistributionResponseBodyTimeList setLoginSessionCount(Integer loginSessionCount) {
            this.loginSessionCount = loginSessionCount;
            return this;
        }
        public Integer getLoginSessionCount() {
            return this.loginSessionCount;
        }

        public GetSessionDistributionResponseBodyTimeList setActiveSessionCount(Integer activeSessionCount) {
            this.activeSessionCount = activeSessionCount;
            return this;
        }
        public Integer getActiveSessionCount() {
            return this.activeSessionCount;
        }

        public GetSessionDistributionResponseBodyTimeList setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public GetSessionDistributionResponseBodyTimeList setErrorSessionCount(Integer errorSessionCount) {
            this.errorSessionCount = errorSessionCount;
            return this;
        }
        public Integer getErrorSessionCount() {
            return this.errorSessionCount;
        }

    }

}
