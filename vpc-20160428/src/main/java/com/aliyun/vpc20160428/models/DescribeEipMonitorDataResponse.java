// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeEipMonitorDataResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("EipMonitorDatas")
    @Validation(required = true)
    public DescribeEipMonitorDataResponseEipMonitorDatas eipMonitorDatas;

    public static DescribeEipMonitorDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEipMonitorDataResponse self = new DescribeEipMonitorDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEipMonitorDataResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEipMonitorDataResponse setEipMonitorDatas(DescribeEipMonitorDataResponseEipMonitorDatas eipMonitorDatas) {
        this.eipMonitorDatas = eipMonitorDatas;
        return this;
    }
    public DescribeEipMonitorDataResponseEipMonitorDatas getEipMonitorDatas() {
        return this.eipMonitorDatas;
    }

    public static class DescribeEipMonitorDataResponseEipMonitorDatasEipMonitorData extends TeaModel {
        @NameInMap("EipRX")
        @Validation(required = true)
        public Long eipRX;

        @NameInMap("EipTX")
        @Validation(required = true)
        public Long eipTX;

        @NameInMap("EipFlow")
        @Validation(required = true)
        public Integer eipFlow;

        @NameInMap("EipBandwidth")
        @Validation(required = true)
        public Integer eipBandwidth;

        @NameInMap("EipPackets")
        @Validation(required = true)
        public Integer eipPackets;

        @NameInMap("TimeStamp")
        @Validation(required = true)
        public String timeStamp;

        public static DescribeEipMonitorDataResponseEipMonitorDatasEipMonitorData build(java.util.Map<String, ?> map) throws Exception {
            DescribeEipMonitorDataResponseEipMonitorDatasEipMonitorData self = new DescribeEipMonitorDataResponseEipMonitorDatasEipMonitorData();
            return TeaModel.build(map, self);
        }

        public DescribeEipMonitorDataResponseEipMonitorDatasEipMonitorData setEipRX(Long eipRX) {
            this.eipRX = eipRX;
            return this;
        }
        public Long getEipRX() {
            return this.eipRX;
        }

        public DescribeEipMonitorDataResponseEipMonitorDatasEipMonitorData setEipTX(Long eipTX) {
            this.eipTX = eipTX;
            return this;
        }
        public Long getEipTX() {
            return this.eipTX;
        }

        public DescribeEipMonitorDataResponseEipMonitorDatasEipMonitorData setEipFlow(Integer eipFlow) {
            this.eipFlow = eipFlow;
            return this;
        }
        public Integer getEipFlow() {
            return this.eipFlow;
        }

        public DescribeEipMonitorDataResponseEipMonitorDatasEipMonitorData setEipBandwidth(Integer eipBandwidth) {
            this.eipBandwidth = eipBandwidth;
            return this;
        }
        public Integer getEipBandwidth() {
            return this.eipBandwidth;
        }

        public DescribeEipMonitorDataResponseEipMonitorDatasEipMonitorData setEipPackets(Integer eipPackets) {
            this.eipPackets = eipPackets;
            return this;
        }
        public Integer getEipPackets() {
            return this.eipPackets;
        }

        public DescribeEipMonitorDataResponseEipMonitorDatasEipMonitorData setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

    }

    public static class DescribeEipMonitorDataResponseEipMonitorDatas extends TeaModel {
        @NameInMap("EipMonitorData")
        @Validation(required = true)
        public java.util.List<DescribeEipMonitorDataResponseEipMonitorDatasEipMonitorData> eipMonitorData;

        public static DescribeEipMonitorDataResponseEipMonitorDatas build(java.util.Map<String, ?> map) throws Exception {
            DescribeEipMonitorDataResponseEipMonitorDatas self = new DescribeEipMonitorDataResponseEipMonitorDatas();
            return TeaModel.build(map, self);
        }

        public DescribeEipMonitorDataResponseEipMonitorDatas setEipMonitorData(java.util.List<DescribeEipMonitorDataResponseEipMonitorDatasEipMonitorData> eipMonitorData) {
            this.eipMonitorData = eipMonitorData;
            return this;
        }
        public java.util.List<DescribeEipMonitorDataResponseEipMonitorDatasEipMonitorData> getEipMonitorData() {
            return this.eipMonitorData;
        }

    }

}
