// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceByTagsResponseBody extends TeaModel {
    /**
     * <p>The details about the instance.</p>
     */
    @NameInMap("Items")
    public DescribeDBInstanceByTagsResponseBodyItems items;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    public static DescribeDBInstanceByTagsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceByTagsResponseBody self = new DescribeDBInstanceByTagsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceByTagsResponseBody setItems(DescribeDBInstanceByTagsResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeDBInstanceByTagsResponseBodyItems getItems() {
        return this.items;
    }

    public DescribeDBInstanceByTagsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDBInstanceByTagsResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeDBInstanceByTagsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBInstanceByTagsResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeDBInstanceByTagsResponseBodyItemsDBInstanceTagTagsTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>key1</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>value1</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static DescribeDBInstanceByTagsResponseBodyItemsDBInstanceTagTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceByTagsResponseBodyItemsDBInstanceTagTagsTag self = new DescribeDBInstanceByTagsResponseBodyItemsDBInstanceTagTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceByTagsResponseBodyItemsDBInstanceTagTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeDBInstanceByTagsResponseBodyItemsDBInstanceTagTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeDBInstanceByTagsResponseBodyItemsDBInstanceTagTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeDBInstanceByTagsResponseBodyItemsDBInstanceTagTagsTag> tag;

        public static DescribeDBInstanceByTagsResponseBodyItemsDBInstanceTagTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceByTagsResponseBodyItemsDBInstanceTagTags self = new DescribeDBInstanceByTagsResponseBodyItemsDBInstanceTagTags();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceByTagsResponseBodyItemsDBInstanceTagTags setTag(java.util.List<DescribeDBInstanceByTagsResponseBodyItemsDBInstanceTagTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeDBInstanceByTagsResponseBodyItemsDBInstanceTagTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeDBInstanceByTagsResponseBodyItemsDBInstanceTag extends TeaModel {
        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-uf6w**********</p>
         */
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        /**
         * <p>The details about the tag.</p>
         */
        @NameInMap("Tags")
        public DescribeDBInstanceByTagsResponseBodyItemsDBInstanceTagTags tags;

        public static DescribeDBInstanceByTagsResponseBodyItemsDBInstanceTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceByTagsResponseBodyItemsDBInstanceTag self = new DescribeDBInstanceByTagsResponseBodyItemsDBInstanceTag();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceByTagsResponseBodyItemsDBInstanceTag setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public DescribeDBInstanceByTagsResponseBodyItemsDBInstanceTag setTags(DescribeDBInstanceByTagsResponseBodyItemsDBInstanceTagTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeDBInstanceByTagsResponseBodyItemsDBInstanceTagTags getTags() {
            return this.tags;
        }

    }

    public static class DescribeDBInstanceByTagsResponseBodyItems extends TeaModel {
        @NameInMap("DBInstanceTag")
        public java.util.List<DescribeDBInstanceByTagsResponseBodyItemsDBInstanceTag> DBInstanceTag;

        public static DescribeDBInstanceByTagsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceByTagsResponseBodyItems self = new DescribeDBInstanceByTagsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceByTagsResponseBodyItems setDBInstanceTag(java.util.List<DescribeDBInstanceByTagsResponseBodyItemsDBInstanceTag> DBInstanceTag) {
            this.DBInstanceTag = DBInstanceTag;
            return this;
        }
        public java.util.List<DescribeDBInstanceByTagsResponseBodyItemsDBInstanceTag> getDBInstanceTag() {
            return this.DBInstanceTag;
        }

    }

}
