// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodDomainRealTimeByteHitRateDataResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public DescribeVodDomainRealTimeByteHitRateDataResponseBodyData data;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>70A26B11-3673-479C-AEA8-E03FC5D3496D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeVodDomainRealTimeByteHitRateDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainRealTimeByteHitRateDataResponseBody self = new DescribeVodDomainRealTimeByteHitRateDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVodDomainRealTimeByteHitRateDataResponseBody setData(DescribeVodDomainRealTimeByteHitRateDataResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeVodDomainRealTimeByteHitRateDataResponseBodyData getData() {
        return this.data;
    }

    public DescribeVodDomainRealTimeByteHitRateDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeVodDomainRealTimeByteHitRateDataResponseBodyDataByteHitRateDataModel extends TeaModel {
        /**
         * <p>The byte hit ratio in percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>0.8956940476262277</p>
         */
        @NameInMap("ByteHitRate")
        public Float byteHitRate;

        /**
         * <p>The timestamp of the data returned. The time follows the ISO 8601 standard. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-05-15T09:13:00Z</p>
         */
        @NameInMap("TimeStamp")
        public String timeStamp;

        public static DescribeVodDomainRealTimeByteHitRateDataResponseBodyDataByteHitRateDataModel build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainRealTimeByteHitRateDataResponseBodyDataByteHitRateDataModel self = new DescribeVodDomainRealTimeByteHitRateDataResponseBodyDataByteHitRateDataModel();
            return TeaModel.build(map, self);
        }

        public DescribeVodDomainRealTimeByteHitRateDataResponseBodyDataByteHitRateDataModel setByteHitRate(Float byteHitRate) {
            this.byteHitRate = byteHitRate;
            return this;
        }
        public Float getByteHitRate() {
            return this.byteHitRate;
        }

        public DescribeVodDomainRealTimeByteHitRateDataResponseBodyDataByteHitRateDataModel setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

    }

    public static class DescribeVodDomainRealTimeByteHitRateDataResponseBodyData extends TeaModel {
        @NameInMap("ByteHitRateDataModel")
        public java.util.List<DescribeVodDomainRealTimeByteHitRateDataResponseBodyDataByteHitRateDataModel> byteHitRateDataModel;

        public static DescribeVodDomainRealTimeByteHitRateDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainRealTimeByteHitRateDataResponseBodyData self = new DescribeVodDomainRealTimeByteHitRateDataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeVodDomainRealTimeByteHitRateDataResponseBodyData setByteHitRateDataModel(java.util.List<DescribeVodDomainRealTimeByteHitRateDataResponseBodyDataByteHitRateDataModel> byteHitRateDataModel) {
            this.byteHitRateDataModel = byteHitRateDataModel;
            return this;
        }
        public java.util.List<DescribeVodDomainRealTimeByteHitRateDataResponseBodyDataByteHitRateDataModel> getByteHitRateDataModel() {
            return this.byteHitRateDataModel;
        }

    }

}
