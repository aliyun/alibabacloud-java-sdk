// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodAIDataResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DataInterval")
    @Validation(required = true)
    public String dataInterval;

    @NameInMap("AIData")
    @Validation(required = true)
    public DescribeVodAIDataResponseAIData AIData;

    public static DescribeVodAIDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodAIDataResponse self = new DescribeVodAIDataResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeVodAIDataResponseAIDataAIDataItemDataDataItem extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static DescribeVodAIDataResponseAIDataAIDataItemDataDataItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodAIDataResponseAIDataAIDataItemDataDataItem self = new DescribeVodAIDataResponseAIDataAIDataItemDataDataItem();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeVodAIDataResponseAIDataAIDataItemData extends TeaModel {
        @NameInMap("DataItem")
        @Validation(required = true)
        public java.util.List<DescribeVodAIDataResponseAIDataAIDataItemDataDataItem> dataItem;

        public static DescribeVodAIDataResponseAIDataAIDataItemData build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodAIDataResponseAIDataAIDataItemData self = new DescribeVodAIDataResponseAIDataAIDataItemData();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeVodAIDataResponseAIDataAIDataItem extends TeaModel {
        @NameInMap("TimeStamp")
        @Validation(required = true)
        public String timeStamp;

        @NameInMap("Data")
        @Validation(required = true)
        public DescribeVodAIDataResponseAIDataAIDataItemData data;

        public static DescribeVodAIDataResponseAIDataAIDataItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodAIDataResponseAIDataAIDataItem self = new DescribeVodAIDataResponseAIDataAIDataItem();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeVodAIDataResponseAIData extends TeaModel {
        @NameInMap("AIDataItem")
        @Validation(required = true)
        public java.util.List<DescribeVodAIDataResponseAIDataAIDataItem> AIDataItem;

        public static DescribeVodAIDataResponseAIData build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodAIDataResponseAIData self = new DescribeVodAIDataResponseAIData();
            return TeaModel.build(map, self);
        }

    }

}
