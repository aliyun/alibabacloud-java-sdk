// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetClusterCheckItemWarningStatisticsResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetClusterCheckItemWarningStatisticsResponseBodyData data;

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
        @NameInMap("HighWarningCount")
        public Integer highWarningCount;

        @NameInMap("LowWarningCount")
        public Integer lowWarningCount;

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
