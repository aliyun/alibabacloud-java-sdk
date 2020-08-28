// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeTagsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Items")
    @Validation(required = true)
    public DescribeTagsResponseItems items;

    public static DescribeTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTagsResponse self = new DescribeTagsResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeTagsResponseItemsTagInfosDBInstanceIds extends TeaModel {
        @NameInMap("DBInstanceIds")
        @Validation(required = true)
        public java.util.List<String> DBInstanceIds;

        public static DescribeTagsResponseItemsTagInfosDBInstanceIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeTagsResponseItemsTagInfosDBInstanceIds self = new DescribeTagsResponseItemsTagInfosDBInstanceIds();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeTagsResponseItemsTagInfos extends TeaModel {
        @NameInMap("TagKey")
        @Validation(required = true)
        public String tagKey;

        @NameInMap("TagValue")
        @Validation(required = true)
        public String tagValue;

        @NameInMap("DBInstanceIds")
        @Validation(required = true)
        public DescribeTagsResponseItemsTagInfosDBInstanceIds DBInstanceIds;

        public static DescribeTagsResponseItemsTagInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeTagsResponseItemsTagInfos self = new DescribeTagsResponseItemsTagInfos();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeTagsResponseItems extends TeaModel {
        @NameInMap("TagInfos")
        @Validation(required = true)
        public java.util.List<DescribeTagsResponseItemsTagInfos> tagInfos;

        public static DescribeTagsResponseItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeTagsResponseItems self = new DescribeTagsResponseItems();
            return TeaModel.build(map, self);
        }

    }

}
