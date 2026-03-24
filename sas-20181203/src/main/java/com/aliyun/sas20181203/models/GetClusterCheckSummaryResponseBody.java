// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetClusterCheckSummaryResponseBody extends TeaModel {
    /**
     * <p>Return data.</p>
     */
    @NameInMap("Data")
    public GetClusterCheckSummaryResponseBodyData data;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0B48AB3C-84FC-424D-A01D-B9270EF46038</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetClusterCheckSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetClusterCheckSummaryResponseBody self = new GetClusterCheckSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetClusterCheckSummaryResponseBody setData(GetClusterCheckSummaryResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetClusterCheckSummaryResponseBodyData getData() {
        return this.data;
    }

    public GetClusterCheckSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetClusterCheckSummaryResponseBodyData extends TeaModel {
        /**
         * <p>Total number of items that failed the check.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("NotPassCount")
        public Integer notPassCount;

        /**
         * <p>Number of high-risk inspection items that have not passed.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NotPassHighCount")
        public Integer notPassHighCount;

        /**
         * <p>Number of low-risk inspection items that have not passed.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("NotPassLowCount")
        public Integer notPassLowCount;

        /**
         * <p>Number of medium-risk failed inspection items.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("NotPassMediumCount")
        public Integer notPassMediumCount;

        public static GetClusterCheckSummaryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetClusterCheckSummaryResponseBodyData self = new GetClusterCheckSummaryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetClusterCheckSummaryResponseBodyData setNotPassCount(Integer notPassCount) {
            this.notPassCount = notPassCount;
            return this;
        }
        public Integer getNotPassCount() {
            return this.notPassCount;
        }

        public GetClusterCheckSummaryResponseBodyData setNotPassHighCount(Integer notPassHighCount) {
            this.notPassHighCount = notPassHighCount;
            return this;
        }
        public Integer getNotPassHighCount() {
            return this.notPassHighCount;
        }

        public GetClusterCheckSummaryResponseBodyData setNotPassLowCount(Integer notPassLowCount) {
            this.notPassLowCount = notPassLowCount;
            return this;
        }
        public Integer getNotPassLowCount() {
            return this.notPassLowCount;
        }

        public GetClusterCheckSummaryResponseBodyData setNotPassMediumCount(Integer notPassMediumCount) {
            this.notPassMediumCount = notPassMediumCount;
            return this;
        }
        public Integer getNotPassMediumCount() {
            return this.notPassMediumCount;
        }

    }

}
