// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class GetSessionDistributionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1B217656-2267-4FBF-B26C-CDD201BDC3B8</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ActiveSessionCount")
        public Long activeSessionCount;

        /**
         * <strong>example:</strong>
         * <p>2019-06-06 00:00:00</p>
         */
        @NameInMap("BeginDate")
        public String beginDate;

        /**
         * <strong>example:</strong>
         * <p>2019-06-06 01:00:00</p>
         */
        @NameInMap("EndDate")
        public String endDate;

        /**
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("ErrorSessionCount")
        public Long errorSessionCount;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("LoginSessionCount")
        public Long loginSessionCount;

        public static GetSessionDistributionResponseBodyTimeList build(java.util.Map<String, ?> map) throws Exception {
            GetSessionDistributionResponseBodyTimeList self = new GetSessionDistributionResponseBodyTimeList();
            return TeaModel.build(map, self);
        }

        public GetSessionDistributionResponseBodyTimeList setActiveSessionCount(Long activeSessionCount) {
            this.activeSessionCount = activeSessionCount;
            return this;
        }
        public Long getActiveSessionCount() {
            return this.activeSessionCount;
        }

        public GetSessionDistributionResponseBodyTimeList setBeginDate(String beginDate) {
            this.beginDate = beginDate;
            return this;
        }
        public String getBeginDate() {
            return this.beginDate;
        }

        public GetSessionDistributionResponseBodyTimeList setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public GetSessionDistributionResponseBodyTimeList setErrorSessionCount(Long errorSessionCount) {
            this.errorSessionCount = errorSessionCount;
            return this;
        }
        public Long getErrorSessionCount() {
            return this.errorSessionCount;
        }

        public GetSessionDistributionResponseBodyTimeList setLoginSessionCount(Long loginSessionCount) {
            this.loginSessionCount = loginSessionCount;
            return this;
        }
        public Long getLoginSessionCount() {
            return this.loginSessionCount;
        }

    }

}
