// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodPlayerCollectDataDemoResponseBody extends TeaModel {
    @NameInMap("DataList")
    public java.util.List<DescribeVodPlayerCollectDataDemoResponseBodyDataList> dataList;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>25818875-5F78-4AF6-D7393642CA58****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeVodPlayerCollectDataDemoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodPlayerCollectDataDemoResponseBody self = new DescribeVodPlayerCollectDataDemoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVodPlayerCollectDataDemoResponseBody setDataList(java.util.List<DescribeVodPlayerCollectDataDemoResponseBodyDataList> dataList) {
        this.dataList = dataList;
        return this;
    }
    public java.util.List<DescribeVodPlayerCollectDataDemoResponseBodyDataList> getDataList() {
        return this.dataList;
    }

    public DescribeVodPlayerCollectDataDemoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeVodPlayerCollectDataDemoResponseBodyDataList extends TeaModel {
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

        public static DescribeVodPlayerCollectDataDemoResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodPlayerCollectDataDemoResponseBodyDataList self = new DescribeVodPlayerCollectDataDemoResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public DescribeVodPlayerCollectDataDemoResponseBodyDataList setMetric(String metric) {
            this.metric = metric;
            return this;
        }
        public String getMetric() {
            return this.metric;
        }

        public DescribeVodPlayerCollectDataDemoResponseBodyDataList setValue(Double value) {
            this.value = value;
            return this;
        }
        public Double getValue() {
            return this.value;
        }

        public DescribeVodPlayerCollectDataDemoResponseBodyDataList setValueRatio(Double valueRatio) {
            this.valueRatio = valueRatio;
            return this;
        }
        public Double getValueRatio() {
            return this.valueRatio;
        }

        public DescribeVodPlayerCollectDataDemoResponseBodyDataList setValueRefer(Double valueRefer) {
            this.valueRefer = valueRefer;
            return this;
        }
        public Double getValueRefer() {
            return this.valueRefer;
        }

    }

}
