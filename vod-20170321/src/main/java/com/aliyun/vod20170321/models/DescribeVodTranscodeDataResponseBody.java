// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodTranscodeDataResponseBody extends TeaModel {
    /**
     * <p>The interval at which the data was queried. Valid values:</p>
     * <ul>
     * <li><strong>hour</strong></li>
     * <li><strong>day</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>day</p>
     */
    @NameInMap("DataInterval")
    public String dataInterval;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>C370DAF1-C838-4288-****-9A87633D248E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The transcoding statistics returned.</p>
     */
    @NameInMap("TranscodeData")
    public DescribeVodTranscodeDataResponseBodyTranscodeData transcodeData;

    public static DescribeVodTranscodeDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodTranscodeDataResponseBody self = new DescribeVodTranscodeDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVodTranscodeDataResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
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

    public static class DescribeVodTranscodeDataResponseBodyTranscodeDataTranscodeDataItemDataDataItem extends TeaModel {
        /**
         * <p>The transcoding specification. Valid values:</p>
         * <ul>
         * <li><strong>Audio</strong>: audio transcoding</li>
         * <li><strong>Segmentation</strong>: container format conversion</li>
         * <li><strong>H264.LD, H264.SD, H264.HD, H264.2K, H264.4K, and more</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>H264.SD</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The transcoding duration. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>111</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeVodTranscodeDataResponseBodyTranscodeDataTranscodeDataItemDataDataItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodTranscodeDataResponseBodyTranscodeDataTranscodeDataItemDataDataItem self = new DescribeVodTranscodeDataResponseBodyTranscodeDataTranscodeDataItemDataDataItem();
            return TeaModel.build(map, self);
        }

        public DescribeVodTranscodeDataResponseBodyTranscodeDataTranscodeDataItemDataDataItem setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeVodTranscodeDataResponseBodyTranscodeDataTranscodeDataItemDataDataItem setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
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
        /**
         * <p>The statistics on transcoding of different specifications.</p>
         */
        @NameInMap("Data")
        public DescribeVodTranscodeDataResponseBodyTranscodeDataTranscodeDataItemData data;

        /**
         * <p>The timestamp of the returned data. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-02-01T16:00:00Z</p>
         */
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
