// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeVsDevicesDataResponseBody extends TeaModel {
    @NameInMap("DevicesDataPerInterval")
    public DescribeVsDevicesDataResponseBodyDevicesDataPerInterval devicesDataPerInterval;

    /**
     * <strong>example:</strong>
     * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeVsDevicesDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVsDevicesDataResponseBody self = new DescribeVsDevicesDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVsDevicesDataResponseBody setDevicesDataPerInterval(DescribeVsDevicesDataResponseBodyDevicesDataPerInterval devicesDataPerInterval) {
        this.devicesDataPerInterval = devicesDataPerInterval;
        return this;
    }
    public DescribeVsDevicesDataResponseBodyDevicesDataPerInterval getDevicesDataPerInterval() {
        return this.devicesDataPerInterval;
    }

    public DescribeVsDevicesDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeVsDevicesDataResponseBodyDevicesDataPerIntervalDataModule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>128</p>
         */
        @NameInMap("DevicesDataValue")
        public String devicesDataValue;

        /**
         * <strong>example:</strong>
         * <p>2022-01-04T16:00:00Z</p>
         */
        @NameInMap("TimeStamp")
        public String timeStamp;

        public static DescribeVsDevicesDataResponseBodyDevicesDataPerIntervalDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeVsDevicesDataResponseBodyDevicesDataPerIntervalDataModule self = new DescribeVsDevicesDataResponseBodyDevicesDataPerIntervalDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeVsDevicesDataResponseBodyDevicesDataPerIntervalDataModule setDevicesDataValue(String devicesDataValue) {
            this.devicesDataValue = devicesDataValue;
            return this;
        }
        public String getDevicesDataValue() {
            return this.devicesDataValue;
        }

        public DescribeVsDevicesDataResponseBodyDevicesDataPerIntervalDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

    }

    public static class DescribeVsDevicesDataResponseBodyDevicesDataPerInterval extends TeaModel {
        @NameInMap("DataModule")
        public java.util.List<DescribeVsDevicesDataResponseBodyDevicesDataPerIntervalDataModule> dataModule;

        public static DescribeVsDevicesDataResponseBodyDevicesDataPerInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeVsDevicesDataResponseBodyDevicesDataPerInterval self = new DescribeVsDevicesDataResponseBodyDevicesDataPerInterval();
            return TeaModel.build(map, self);
        }

        public DescribeVsDevicesDataResponseBodyDevicesDataPerInterval setDataModule(java.util.List<DescribeVsDevicesDataResponseBodyDevicesDataPerIntervalDataModule> dataModule) {
            this.dataModule = dataModule;
            return this;
        }
        public java.util.List<DescribeVsDevicesDataResponseBodyDevicesDataPerIntervalDataModule> getDataModule() {
            return this.dataModule;
        }

    }

}
