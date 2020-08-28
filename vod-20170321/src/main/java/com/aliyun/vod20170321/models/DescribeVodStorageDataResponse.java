// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodStorageDataResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DataInterval")
    @Validation(required = true)
    public String dataInterval;

    @NameInMap("StorageData")
    @Validation(required = true)
    public DescribeVodStorageDataResponseStorageData storageData;

    public static DescribeVodStorageDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodStorageDataResponse self = new DescribeVodStorageDataResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeVodStorageDataResponseStorageDataStorageDataItem extends TeaModel {
        @NameInMap("TimeStamp")
        @Validation(required = true)
        public String timeStamp;

        @NameInMap("StorageUtilization")
        @Validation(required = true)
        public String storageUtilization;

        @NameInMap("NetworkOut")
        @Validation(required = true)
        public String networkOut;

        public static DescribeVodStorageDataResponseStorageDataStorageDataItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodStorageDataResponseStorageDataStorageDataItem self = new DescribeVodStorageDataResponseStorageDataStorageDataItem();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeVodStorageDataResponseStorageData extends TeaModel {
        @NameInMap("StorageDataItem")
        @Validation(required = true)
        public java.util.List<DescribeVodStorageDataResponseStorageDataStorageDataItem> storageDataItem;

        public static DescribeVodStorageDataResponseStorageData build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodStorageDataResponseStorageData self = new DescribeVodStorageDataResponseStorageData();
            return TeaModel.build(map, self);
        }

    }

}
