// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeNewProjectEipMonitorDataResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("EipMonitorDatas")
    @Validation(required = true)
    public DescribeNewProjectEipMonitorDataResponseEipMonitorDatas eipMonitorDatas;

    public static DescribeNewProjectEipMonitorDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNewProjectEipMonitorDataResponse self = new DescribeNewProjectEipMonitorDataResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeNewProjectEipMonitorDataResponseEipMonitorDatasEipMonitorData extends TeaModel {
        @NameInMap("EipRX")
        @Validation(required = true)
        public Integer eipRX;

        @NameInMap("EipTX")
        @Validation(required = true)
        public Integer eipTX;

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

        public static DescribeNewProjectEipMonitorDataResponseEipMonitorDatasEipMonitorData build(java.util.Map<String, ?> map) throws Exception {
            DescribeNewProjectEipMonitorDataResponseEipMonitorDatasEipMonitorData self = new DescribeNewProjectEipMonitorDataResponseEipMonitorDatasEipMonitorData();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeNewProjectEipMonitorDataResponseEipMonitorDatas extends TeaModel {
        @NameInMap("EipMonitorData")
        @Validation(required = true)
        public java.util.List<DescribeNewProjectEipMonitorDataResponseEipMonitorDatasEipMonitorData> eipMonitorData;

        public static DescribeNewProjectEipMonitorDataResponseEipMonitorDatas build(java.util.Map<String, ?> map) throws Exception {
            DescribeNewProjectEipMonitorDataResponseEipMonitorDatas self = new DescribeNewProjectEipMonitorDataResponseEipMonitorDatas();
            return TeaModel.build(map, self);
        }

    }

}
