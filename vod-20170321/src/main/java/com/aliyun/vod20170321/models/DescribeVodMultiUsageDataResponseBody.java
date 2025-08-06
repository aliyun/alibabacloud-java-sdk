// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodMultiUsageDataResponseBody extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("MultiUsageData")
    public DescribeVodMultiUsageDataResponseBodyMultiUsageData multiUsageData;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StartTime")
    public String startTime;

    public static DescribeVodMultiUsageDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodMultiUsageDataResponseBody self = new DescribeVodMultiUsageDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVodMultiUsageDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeVodMultiUsageDataResponseBody setMultiUsageData(DescribeVodMultiUsageDataResponseBodyMultiUsageData multiUsageData) {
        this.multiUsageData = multiUsageData;
        return this;
    }
    public DescribeVodMultiUsageDataResponseBodyMultiUsageData getMultiUsageData() {
        return this.multiUsageData;
    }

    public DescribeVodMultiUsageDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVodMultiUsageDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribeVodMultiUsageDataResponseBodyMultiUsageDataDataModule extends TeaModel {
        @NameInMap("Value")
        public Long value;

        @NameInMap("ValueType")
        public String valueType;

        public static DescribeVodMultiUsageDataResponseBodyMultiUsageDataDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodMultiUsageDataResponseBodyMultiUsageDataDataModule self = new DescribeVodMultiUsageDataResponseBodyMultiUsageDataDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeVodMultiUsageDataResponseBodyMultiUsageDataDataModule setValue(Long value) {
            this.value = value;
            return this;
        }
        public Long getValue() {
            return this.value;
        }

        public DescribeVodMultiUsageDataResponseBodyMultiUsageDataDataModule setValueType(String valueType) {
            this.valueType = valueType;
            return this;
        }
        public String getValueType() {
            return this.valueType;
        }

    }

    public static class DescribeVodMultiUsageDataResponseBodyMultiUsageData extends TeaModel {
        @NameInMap("DataModule")
        public java.util.List<DescribeVodMultiUsageDataResponseBodyMultiUsageDataDataModule> dataModule;

        public static DescribeVodMultiUsageDataResponseBodyMultiUsageData build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodMultiUsageDataResponseBodyMultiUsageData self = new DescribeVodMultiUsageDataResponseBodyMultiUsageData();
            return TeaModel.build(map, self);
        }

        public DescribeVodMultiUsageDataResponseBodyMultiUsageData setDataModule(java.util.List<DescribeVodMultiUsageDataResponseBodyMultiUsageDataDataModule> dataModule) {
            this.dataModule = dataModule;
            return this;
        }
        public java.util.List<DescribeVodMultiUsageDataResponseBodyMultiUsageDataDataModule> getDataModule() {
            return this.dataModule;
        }

    }

}
