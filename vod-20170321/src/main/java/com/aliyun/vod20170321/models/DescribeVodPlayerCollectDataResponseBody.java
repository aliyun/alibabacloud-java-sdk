// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodPlayerCollectDataResponseBody extends TeaModel {
    @NameInMap("DataList")
    public java.util.List<DescribeVodPlayerCollectDataResponseBodyDataList> dataList;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>25818875-5F78-4AF6-D7393642CA58****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeVodPlayerCollectDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodPlayerCollectDataResponseBody self = new DescribeVodPlayerCollectDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVodPlayerCollectDataResponseBody setDataList(java.util.List<DescribeVodPlayerCollectDataResponseBodyDataList> dataList) {
        this.dataList = dataList;
        return this;
    }
    public java.util.List<DescribeVodPlayerCollectDataResponseBodyDataList> getDataList() {
        return this.dataList;
    }

    public DescribeVodPlayerCollectDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeVodPlayerCollectDataResponseBodyDataList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Vv</p>
         */
        @NameInMap("Metric")
        public String metric;

        /**
         * <strong>example:</strong>
         * <p>100.0</p>
         */
        @NameInMap("Value")
        public Double value;

        /**
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("ValueRatio")
        public Double valueRatio;

        /**
         * <strong>example:</strong>
         * <p>200.0</p>
         */
        @NameInMap("ValueRefer")
        public Double valueRefer;

        public static DescribeVodPlayerCollectDataResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodPlayerCollectDataResponseBodyDataList self = new DescribeVodPlayerCollectDataResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public DescribeVodPlayerCollectDataResponseBodyDataList setMetric(String metric) {
            this.metric = metric;
            return this;
        }
        public String getMetric() {
            return this.metric;
        }

        public DescribeVodPlayerCollectDataResponseBodyDataList setValue(Double value) {
            this.value = value;
            return this;
        }
        public Double getValue() {
            return this.value;
        }

        public DescribeVodPlayerCollectDataResponseBodyDataList setValueRatio(Double valueRatio) {
            this.valueRatio = valueRatio;
            return this;
        }
        public Double getValueRatio() {
            return this.valueRatio;
        }

        public DescribeVodPlayerCollectDataResponseBodyDataList setValueRefer(Double valueRefer) {
            this.valueRefer = valueRefer;
            return this;
        }
        public Double getValueRefer() {
            return this.valueRefer;
        }

    }

}
