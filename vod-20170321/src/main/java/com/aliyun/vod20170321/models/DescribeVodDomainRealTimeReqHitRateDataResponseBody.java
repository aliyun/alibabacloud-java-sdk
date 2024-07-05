// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodDomainRealTimeReqHitRateDataResponseBody extends TeaModel {
    /**
     * <p>The returned results.</p>
     */
    @NameInMap("Data")
    public DescribeVodDomainRealTimeReqHitRateDataResponseBodyData data;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>70A26B11-3673-479C-AEA8-E03FC5D3496D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeVodDomainRealTimeReqHitRateDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainRealTimeReqHitRateDataResponseBody self = new DescribeVodDomainRealTimeReqHitRateDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVodDomainRealTimeReqHitRateDataResponseBody setData(DescribeVodDomainRealTimeReqHitRateDataResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeVodDomainRealTimeReqHitRateDataResponseBodyData getData() {
        return this.data;
    }

    public DescribeVodDomainRealTimeReqHitRateDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeVodDomainRealTimeReqHitRateDataResponseBodyDataReqHitRateDataModel extends TeaModel {
        /**
         * <p>The cache hit ratio that is calculated based on requests. The cache hit ratio is measured in percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>0.8956940476262277</p>
         */
        @NameInMap("ReqHitRate")
        public Float reqHitRate;

        /**
         * <p>The timestamp of the data returned. The time follows the ISO 8601 standard. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-02T11:26:00Z</p>
         */
        @NameInMap("TimeStamp")
        public String timeStamp;

        public static DescribeVodDomainRealTimeReqHitRateDataResponseBodyDataReqHitRateDataModel build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainRealTimeReqHitRateDataResponseBodyDataReqHitRateDataModel self = new DescribeVodDomainRealTimeReqHitRateDataResponseBodyDataReqHitRateDataModel();
            return TeaModel.build(map, self);
        }

        public DescribeVodDomainRealTimeReqHitRateDataResponseBodyDataReqHitRateDataModel setReqHitRate(Float reqHitRate) {
            this.reqHitRate = reqHitRate;
            return this;
        }
        public Float getReqHitRate() {
            return this.reqHitRate;
        }

        public DescribeVodDomainRealTimeReqHitRateDataResponseBodyDataReqHitRateDataModel setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

    }

    public static class DescribeVodDomainRealTimeReqHitRateDataResponseBodyData extends TeaModel {
        @NameInMap("ReqHitRateDataModel")
        public java.util.List<DescribeVodDomainRealTimeReqHitRateDataResponseBodyDataReqHitRateDataModel> reqHitRateDataModel;

        public static DescribeVodDomainRealTimeReqHitRateDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainRealTimeReqHitRateDataResponseBodyData self = new DescribeVodDomainRealTimeReqHitRateDataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeVodDomainRealTimeReqHitRateDataResponseBodyData setReqHitRateDataModel(java.util.List<DescribeVodDomainRealTimeReqHitRateDataResponseBodyDataReqHitRateDataModel> reqHitRateDataModel) {
            this.reqHitRateDataModel = reqHitRateDataModel;
            return this;
        }
        public java.util.List<DescribeVodDomainRealTimeReqHitRateDataResponseBodyDataReqHitRateDataModel> getReqHitRateDataModel() {
            return this.reqHitRateDataModel;
        }

    }

}
