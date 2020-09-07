// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceByTagsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageRecordCount")
    @Validation(required = true)
    public Integer pageRecordCount;

    @NameInMap("TotalRecordCount")
    @Validation(required = true)
    public Integer totalRecordCount;

    @NameInMap("Items")
    @Validation(required = true)
    public DescribeDBInstanceByTagsResponseItems items;

    public static DescribeDBInstanceByTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceByTagsResponse self = new DescribeDBInstanceByTagsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceByTagsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBInstanceByTagsResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDBInstanceByTagsResponse setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeDBInstanceByTagsResponse setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public DescribeDBInstanceByTagsResponse setItems(DescribeDBInstanceByTagsResponseItems items) {
        this.items = items;
        return this;
    }
    public DescribeDBInstanceByTagsResponseItems getItems() {
        return this.items;
    }

    public static class DescribeDBInstanceByTagsResponseItemsDBInstanceTagTagsTag extends TeaModel {
        @NameInMap("TagKey")
        @Validation(required = true)
        public String tagKey;

        @NameInMap("TagValue")
        @Validation(required = true)
        public String tagValue;

        public static DescribeDBInstanceByTagsResponseItemsDBInstanceTagTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceByTagsResponseItemsDBInstanceTagTagsTag self = new DescribeDBInstanceByTagsResponseItemsDBInstanceTagTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceByTagsResponseItemsDBInstanceTagTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeDBInstanceByTagsResponseItemsDBInstanceTagTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeDBInstanceByTagsResponseItemsDBInstanceTagTags extends TeaModel {
        @NameInMap("Tag")
        @Validation(required = true)
        public java.util.List<DescribeDBInstanceByTagsResponseItemsDBInstanceTagTagsTag> tag;

        public static DescribeDBInstanceByTagsResponseItemsDBInstanceTagTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceByTagsResponseItemsDBInstanceTagTags self = new DescribeDBInstanceByTagsResponseItemsDBInstanceTagTags();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceByTagsResponseItemsDBInstanceTagTags setTag(java.util.List<DescribeDBInstanceByTagsResponseItemsDBInstanceTagTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeDBInstanceByTagsResponseItemsDBInstanceTagTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeDBInstanceByTagsResponseItemsDBInstanceTag extends TeaModel {
        @NameInMap("DBInstanceId")
        @Validation(required = true)
        public String DBInstanceId;

        @NameInMap("Tags")
        @Validation(required = true)
        public DescribeDBInstanceByTagsResponseItemsDBInstanceTagTags tags;

        public static DescribeDBInstanceByTagsResponseItemsDBInstanceTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceByTagsResponseItemsDBInstanceTag self = new DescribeDBInstanceByTagsResponseItemsDBInstanceTag();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceByTagsResponseItemsDBInstanceTag setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public DescribeDBInstanceByTagsResponseItemsDBInstanceTag setTags(DescribeDBInstanceByTagsResponseItemsDBInstanceTagTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeDBInstanceByTagsResponseItemsDBInstanceTagTags getTags() {
            return this.tags;
        }

    }

    public static class DescribeDBInstanceByTagsResponseItems extends TeaModel {
        @NameInMap("DBInstanceTag")
        @Validation(required = true)
        public java.util.List<DescribeDBInstanceByTagsResponseItemsDBInstanceTag> DBInstanceTag;

        public static DescribeDBInstanceByTagsResponseItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceByTagsResponseItems self = new DescribeDBInstanceByTagsResponseItems();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceByTagsResponseItems setDBInstanceTag(java.util.List<DescribeDBInstanceByTagsResponseItemsDBInstanceTag> DBInstanceTag) {
            this.DBInstanceTag = DBInstanceTag;
            return this;
        }
        public java.util.List<DescribeDBInstanceByTagsResponseItemsDBInstanceTag> getDBInstanceTag() {
            return this.DBInstanceTag;
        }

    }

}
