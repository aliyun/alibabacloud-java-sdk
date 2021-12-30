// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeTagsResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 标签信息列表
    @NameInMap("TagInfos")
    public java.util.List<DescribeTagsResponseBodyTagInfos> tagInfos;

    public static DescribeTagsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTagsResponseBody self = new DescribeTagsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTagsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTagsResponseBody setTagInfos(java.util.List<DescribeTagsResponseBodyTagInfos> tagInfos) {
        this.tagInfos = tagInfos;
        return this;
    }
    public java.util.List<DescribeTagsResponseBodyTagInfos> getTagInfos() {
        return this.tagInfos;
    }

    public static class DescribeTagsResponseBodyTagInfos extends TeaModel {
        // 标签关联数据库实例列表
        @NameInMap("DBInstanceIds")
        public java.util.List<String> DBInstanceIds;

        // 标签Key
        @NameInMap("TagKey")
        public String tagKey;

        // 标签Value
        @NameInMap("TagValue")
        public String tagValue;

        public static DescribeTagsResponseBodyTagInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeTagsResponseBodyTagInfos self = new DescribeTagsResponseBodyTagInfos();
            return TeaModel.build(map, self);
        }

        public DescribeTagsResponseBodyTagInfos setDBInstanceIds(java.util.List<String> DBInstanceIds) {
            this.DBInstanceIds = DBInstanceIds;
            return this;
        }
        public java.util.List<String> getDBInstanceIds() {
            return this.DBInstanceIds;
        }

        public DescribeTagsResponseBodyTagInfos setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeTagsResponseBodyTagInfos setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

}
