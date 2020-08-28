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

    }

    public static class DescribeDBInstanceByTagsResponseItemsDBInstanceTagTags extends TeaModel {
        @NameInMap("Tag")
        @Validation(required = true)
        public java.util.List<DescribeDBInstanceByTagsResponseItemsDBInstanceTagTagsTag> tag;

        public static DescribeDBInstanceByTagsResponseItemsDBInstanceTagTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceByTagsResponseItemsDBInstanceTagTags self = new DescribeDBInstanceByTagsResponseItemsDBInstanceTagTags();
            return TeaModel.build(map, self);
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

    }

    public static class DescribeDBInstanceByTagsResponseItems extends TeaModel {
        @NameInMap("DBInstanceTag")
        @Validation(required = true)
        public java.util.List<DescribeDBInstanceByTagsResponseItemsDBInstanceTag> DBInstanceTag;

        public static DescribeDBInstanceByTagsResponseItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceByTagsResponseItems self = new DescribeDBInstanceByTagsResponseItems();
            return TeaModel.build(map, self);
        }

    }

}
