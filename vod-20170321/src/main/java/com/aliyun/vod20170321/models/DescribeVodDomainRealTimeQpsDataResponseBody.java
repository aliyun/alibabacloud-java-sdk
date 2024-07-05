// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodDomainRealTimeQpsDataResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public DescribeVodDomainRealTimeQpsDataResponseBodyData data;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>32DC9806-E9F9-4490-BBDC-B3A9E32FCC1D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeVodDomainRealTimeQpsDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainRealTimeQpsDataResponseBody self = new DescribeVodDomainRealTimeQpsDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVodDomainRealTimeQpsDataResponseBody setData(DescribeVodDomainRealTimeQpsDataResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeVodDomainRealTimeQpsDataResponseBodyData getData() {
        return this.data;
    }

    public DescribeVodDomainRealTimeQpsDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeVodDomainRealTimeQpsDataResponseBodyDataQpsModel extends TeaModel {
        /**
         * <p>The number of queries per second.</p>
         * 
         * <strong>example:</strong>
         * <p>1851.25</p>
         */
        @NameInMap("Qps")
        public Float qps;

        /**
         * <p>The timestamp of the returned data. The time follows the ISO 8601 standard. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-12-02T11:25:00Z</p>
         */
        @NameInMap("TimeStamp")
        public String timeStamp;

        public static DescribeVodDomainRealTimeQpsDataResponseBodyDataQpsModel build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainRealTimeQpsDataResponseBodyDataQpsModel self = new DescribeVodDomainRealTimeQpsDataResponseBodyDataQpsModel();
            return TeaModel.build(map, self);
        }

        public DescribeVodDomainRealTimeQpsDataResponseBodyDataQpsModel setQps(Float qps) {
            this.qps = qps;
            return this;
        }
        public Float getQps() {
            return this.qps;
        }

        public DescribeVodDomainRealTimeQpsDataResponseBodyDataQpsModel setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

    }

    public static class DescribeVodDomainRealTimeQpsDataResponseBodyData extends TeaModel {
        @NameInMap("QpsModel")
        public java.util.List<DescribeVodDomainRealTimeQpsDataResponseBodyDataQpsModel> qpsModel;

        public static DescribeVodDomainRealTimeQpsDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainRealTimeQpsDataResponseBodyData self = new DescribeVodDomainRealTimeQpsDataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeVodDomainRealTimeQpsDataResponseBodyData setQpsModel(java.util.List<DescribeVodDomainRealTimeQpsDataResponseBodyDataQpsModel> qpsModel) {
            this.qpsModel = qpsModel;
            return this;
        }
        public java.util.List<DescribeVodDomainRealTimeQpsDataResponseBodyDataQpsModel> getQpsModel() {
            return this.qpsModel;
        }

    }

}
