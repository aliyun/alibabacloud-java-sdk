// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetClusterCheckItemWarningStatisticsResponseBody extends TeaModel {
    /**
     * <p>The statistics on risk items by risk level.</p>
     */
    @NameInMap("Data")
    public GetClusterCheckItemWarningStatisticsResponseBodyData data;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetClusterCheckItemWarningStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetClusterCheckItemWarningStatisticsResponseBody self = new GetClusterCheckItemWarningStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetClusterCheckItemWarningStatisticsResponseBody setData(GetClusterCheckItemWarningStatisticsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetClusterCheckItemWarningStatisticsResponseBodyData getData() {
        return this.data;
    }

    public GetClusterCheckItemWarningStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetClusterCheckItemWarningStatisticsResponseBodyData extends TeaModel {
        /**
         * <p>The number of high-risk items.</p>
         */
        @NameInMap("HighWarningCount")
        public Integer highWarningCount;

        /**
         * <p>The number of low-risk items.</p>
         */
        @NameInMap("LowWarningCount")
        public Integer lowWarningCount;

        /**
         * <p>The number of medium-risk items.</p>
         */
        @NameInMap("MediumWarningCount")
        public Integer mediumWarningCount;

        public static GetClusterCheckItemWarningStatisticsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetClusterCheckItemWarningStatisticsResponseBodyData self = new GetClusterCheckItemWarningStatisticsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetClusterCheckItemWarningStatisticsResponseBodyData setHighWarningCount(Integer highWarningCount) {
            this.highWarningCount = highWarningCount;
            return this;
        }
        public Integer getHighWarningCount() {
            return this.highWarningCount;
        }

        public GetClusterCheckItemWarningStatisticsResponseBodyData setLowWarningCount(Integer lowWarningCount) {
            this.lowWarningCount = lowWarningCount;
            return this;
        }
        public Integer getLowWarningCount() {
            return this.lowWarningCount;
        }

        public GetClusterCheckItemWarningStatisticsResponseBodyData setMediumWarningCount(Integer mediumWarningCount) {
            this.mediumWarningCount = mediumWarningCount;
            return this;
        }
        public Integer getMediumWarningCount() {
            return this.mediumWarningCount;
        }

    }

}
