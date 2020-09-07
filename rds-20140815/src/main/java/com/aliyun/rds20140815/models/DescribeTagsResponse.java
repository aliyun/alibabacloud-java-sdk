// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeTagsResponse extends TeaModel {
    // description: 请求ID。; 
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    // description: 由Tag信息组成的数组。
    @NameInMap("Items")
    @Validation(required = true)
    public DescribeTagsResponseItems items;

    public static DescribeTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTagsResponse self = new DescribeTagsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTagsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTagsResponse setItems(DescribeTagsResponseItems items) {
        this.items = items;
        return this;
    }
    public DescribeTagsResponseItems getItems() {
        return this.items;
    }

    public static class DescribeTagsResponseItemsTagInfosDBInstanceIds extends TeaModel {
        // DBInstanceIds
        @NameInMap("DBInstanceIds")
        @Validation(required = true)
        public java.util.List<String> DBInstanceIds;

        public static DescribeTagsResponseItemsTagInfosDBInstanceIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeTagsResponseItemsTagInfosDBInstanceIds self = new DescribeTagsResponseItemsTagInfosDBInstanceIds();
            return TeaModel.build(map, self);
        }

        public DescribeTagsResponseItemsTagInfosDBInstanceIds setDBInstanceIds(java.util.List<String> DBInstanceIds) {
            this.DBInstanceIds = DBInstanceIds;
            return this;
        }
        public java.util.List<String> getDBInstanceIds() {
            return this.DBInstanceIds;
        }

    }

    public static class DescribeTagsResponseItemsTagInfos extends TeaModel {
        // description: 标签键。; 
        @NameInMap("TagKey")
        @Validation(required = true)
        public String tagKey;

        // description: 标签值。; 
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

        public DescribeTagsResponseItemsTagInfos setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeTagsResponseItemsTagInfos setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

        public DescribeTagsResponseItemsTagInfos setDBInstanceIds(DescribeTagsResponseItemsTagInfosDBInstanceIds DBInstanceIds) {
            this.DBInstanceIds = DBInstanceIds;
            return this;
        }
        public DescribeTagsResponseItemsTagInfosDBInstanceIds getDBInstanceIds() {
            return this.DBInstanceIds;
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

        public DescribeTagsResponseItems setTagInfos(java.util.List<DescribeTagsResponseItemsTagInfos> tagInfos) {
            this.tagInfos = tagInfos;
            return this;
        }
        public java.util.List<DescribeTagsResponseItemsTagInfos> getTagInfos() {
            return this.tagInfos;
        }

    }

}
