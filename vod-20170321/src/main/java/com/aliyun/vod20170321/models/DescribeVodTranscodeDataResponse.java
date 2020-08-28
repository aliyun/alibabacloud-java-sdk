// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodTranscodeDataResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DataInterval")
    @Validation(required = true)
    public String dataInterval;

    @NameInMap("TranscodeData")
    @Validation(required = true)
    public DescribeVodTranscodeDataResponseTranscodeData transcodeData;

    public static DescribeVodTranscodeDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodTranscodeDataResponse self = new DescribeVodTranscodeDataResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeVodTranscodeDataResponseTranscodeDataTranscodeDataItemDataDataItem extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static DescribeVodTranscodeDataResponseTranscodeDataTranscodeDataItemDataDataItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodTranscodeDataResponseTranscodeDataTranscodeDataItemDataDataItem self = new DescribeVodTranscodeDataResponseTranscodeDataTranscodeDataItemDataDataItem();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeVodTranscodeDataResponseTranscodeDataTranscodeDataItemData extends TeaModel {
        @NameInMap("DataItem")
        @Validation(required = true)
        public java.util.List<DescribeVodTranscodeDataResponseTranscodeDataTranscodeDataItemDataDataItem> dataItem;

        public static DescribeVodTranscodeDataResponseTranscodeDataTranscodeDataItemData build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodTranscodeDataResponseTranscodeDataTranscodeDataItemData self = new DescribeVodTranscodeDataResponseTranscodeDataTranscodeDataItemData();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeVodTranscodeDataResponseTranscodeDataTranscodeDataItem extends TeaModel {
        @NameInMap("TimeStamp")
        @Validation(required = true)
        public String timeStamp;

        @NameInMap("Data")
        @Validation(required = true)
        public DescribeVodTranscodeDataResponseTranscodeDataTranscodeDataItemData data;

        public static DescribeVodTranscodeDataResponseTranscodeDataTranscodeDataItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodTranscodeDataResponseTranscodeDataTranscodeDataItem self = new DescribeVodTranscodeDataResponseTranscodeDataTranscodeDataItem();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeVodTranscodeDataResponseTranscodeData extends TeaModel {
        @NameInMap("TranscodeDataItem")
        @Validation(required = true)
        public java.util.List<DescribeVodTranscodeDataResponseTranscodeDataTranscodeDataItem> transcodeDataItem;

        public static DescribeVodTranscodeDataResponseTranscodeData build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodTranscodeDataResponseTranscodeData self = new DescribeVodTranscodeDataResponseTranscodeData();
            return TeaModel.build(map, self);
        }

    }

}
