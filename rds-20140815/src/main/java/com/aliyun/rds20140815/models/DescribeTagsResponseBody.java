// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeTagsResponseBody extends TeaModel {
    /**
     * <p>The tags that are added to the instance.</p>
     */
    @NameInMap("Items")
    public DescribeTagsResponseBodyItems items;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeTagsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTagsResponseBody self = new DescribeTagsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTagsResponseBody setItems(DescribeTagsResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeTagsResponseBodyItems getItems() {
        return this.items;
    }

    public DescribeTagsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeTagsResponseBodyItemsTagInfosDBInstanceIds extends TeaModel {
        @NameInMap("DBInstanceIds")
        public java.util.List<String> DBInstanceIds;

        public static DescribeTagsResponseBodyItemsTagInfosDBInstanceIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeTagsResponseBodyItemsTagInfosDBInstanceIds self = new DescribeTagsResponseBodyItemsTagInfosDBInstanceIds();
            return TeaModel.build(map, self);
        }

        public DescribeTagsResponseBodyItemsTagInfosDBInstanceIds setDBInstanceIds(java.util.List<String> DBInstanceIds) {
            this.DBInstanceIds = DBInstanceIds;
            return this;
        }
        public java.util.List<String> getDBInstanceIds() {
            return this.DBInstanceIds;
        }

    }

    public static class DescribeTagsResponseBodyItemsTagInfos extends TeaModel {
        /**
         * <p>The IDs of the instances to which the tag is added.</p>
         */
        @NameInMap("DBInstanceIds")
        public DescribeTagsResponseBodyItemsTagInfosDBInstanceIds DBInstanceIds;

        /**
         * <p>The key of the tag.</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The value of the tag.</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static DescribeTagsResponseBodyItemsTagInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeTagsResponseBodyItemsTagInfos self = new DescribeTagsResponseBodyItemsTagInfos();
            return TeaModel.build(map, self);
        }

        public DescribeTagsResponseBodyItemsTagInfos setDBInstanceIds(DescribeTagsResponseBodyItemsTagInfosDBInstanceIds DBInstanceIds) {
            this.DBInstanceIds = DBInstanceIds;
            return this;
        }
        public DescribeTagsResponseBodyItemsTagInfosDBInstanceIds getDBInstanceIds() {
            return this.DBInstanceIds;
        }

        public DescribeTagsResponseBodyItemsTagInfos setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeTagsResponseBodyItemsTagInfos setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeTagsResponseBodyItems extends TeaModel {
        @NameInMap("TagInfos")
        public java.util.List<DescribeTagsResponseBodyItemsTagInfos> tagInfos;

        public static DescribeTagsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeTagsResponseBodyItems self = new DescribeTagsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeTagsResponseBodyItems setTagInfos(java.util.List<DescribeTagsResponseBodyItemsTagInfos> tagInfos) {
            this.tagInfos = tagInfos;
            return this;
        }
        public java.util.List<DescribeTagsResponseBodyItemsTagInfos> getTagInfos() {
            return this.tagInfos;
        }

    }

}
