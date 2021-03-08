// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodTranscodeDataResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TranscodeData")
    public DescribeVodTranscodeDataResponseBodyTranscodeData transcodeData;

    @NameInMap("DataInterval")
    public String dataInterval;

    public static DescribeVodTranscodeDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodTranscodeDataResponseBody self = new DescribeVodTranscodeDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVodTranscodeDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVodTranscodeDataResponseBody setTranscodeData(DescribeVodTranscodeDataResponseBodyTranscodeData transcodeData) {
        this.transcodeData = transcodeData;
        return this;
    }
    public DescribeVodTranscodeDataResponseBodyTranscodeData getTranscodeData() {
        return this.transcodeData;
    }

    public DescribeVodTranscodeDataResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public static class DescribeVodTranscodeDataResponseBodyTranscodeDataTranscodeDataItemDataDataItem extends TeaModel {
        @NameInMap("Value")
        public String value;

        @NameInMap("Name")
        public String name;

        public static DescribeVodTranscodeDataResponseBodyTranscodeDataTranscodeDataItemDataDataItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodTranscodeDataResponseBodyTranscodeDataTranscodeDataItemDataDataItem self = new DescribeVodTranscodeDataResponseBodyTranscodeDataTranscodeDataItemDataDataItem();
            return TeaModel.build(map, self);
        }

        public DescribeVodTranscodeDataResponseBodyTranscodeDataTranscodeDataItemDataDataItem setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public DescribeVodTranscodeDataResponseBodyTranscodeDataTranscodeDataItemDataDataItem setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeVodTranscodeDataResponseBodyTranscodeDataTranscodeDataItemData extends TeaModel {
        @NameInMap("DataItem")
        public java.util.List<DescribeVodTranscodeDataResponseBodyTranscodeDataTranscodeDataItemDataDataItem> dataItem;

        public static DescribeVodTranscodeDataResponseBodyTranscodeDataTranscodeDataItemData build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodTranscodeDataResponseBodyTranscodeDataTranscodeDataItemData self = new DescribeVodTranscodeDataResponseBodyTranscodeDataTranscodeDataItemData();
            return TeaModel.build(map, self);
        }

        public DescribeVodTranscodeDataResponseBodyTranscodeDataTranscodeDataItemData setDataItem(java.util.List<DescribeVodTranscodeDataResponseBodyTranscodeDataTranscodeDataItemDataDataItem> dataItem) {
            this.dataItem = dataItem;
            return this;
        }
        public java.util.List<DescribeVodTranscodeDataResponseBodyTranscodeDataTranscodeDataItemDataDataItem> getDataItem() {
            return this.dataItem;
        }

    }

    public static class DescribeVodTranscodeDataResponseBodyTranscodeDataTranscodeDataItem extends TeaModel {
        @NameInMap("Data")
        public DescribeVodTranscodeDataResponseBodyTranscodeDataTranscodeDataItemData data;

        @NameInMap("TimeStamp")
        public String timeStamp;

        public static DescribeVodTranscodeDataResponseBodyTranscodeDataTranscodeDataItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodTranscodeDataResponseBodyTranscodeDataTranscodeDataItem self = new DescribeVodTranscodeDataResponseBodyTranscodeDataTranscodeDataItem();
            return TeaModel.build(map, self);
        }

        public DescribeVodTranscodeDataResponseBodyTranscodeDataTranscodeDataItem setData(DescribeVodTranscodeDataResponseBodyTranscodeDataTranscodeDataItemData data) {
            this.data = data;
            return this;
        }
        public DescribeVodTranscodeDataResponseBodyTranscodeDataTranscodeDataItemData getData() {
            return this.data;
        }

        public DescribeVodTranscodeDataResponseBodyTranscodeDataTranscodeDataItem setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

    }

    public static class DescribeVodTranscodeDataResponseBodyTranscodeData extends TeaModel {
        @NameInMap("TranscodeDataItem")
        public java.util.List<DescribeVodTranscodeDataResponseBodyTranscodeDataTranscodeDataItem> transcodeDataItem;

        public static DescribeVodTranscodeDataResponseBodyTranscodeData build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodTranscodeDataResponseBodyTranscodeData self = new DescribeVodTranscodeDataResponseBodyTranscodeData();
            return TeaModel.build(map, self);
        }

        public DescribeVodTranscodeDataResponseBodyTranscodeData setTranscodeDataItem(java.util.List<DescribeVodTranscodeDataResponseBodyTranscodeDataTranscodeDataItem> transcodeDataItem) {
            this.transcodeDataItem = transcodeDataItem;
            return this;
        }
        public java.util.List<DescribeVodTranscodeDataResponseBodyTranscodeDataTranscodeDataItem> getTranscodeDataItem() {
            return this.transcodeDataItem;
        }

    }

}
