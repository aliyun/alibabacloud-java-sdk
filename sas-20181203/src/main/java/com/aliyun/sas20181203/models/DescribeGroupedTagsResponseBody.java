// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeGroupedTagsResponseBody extends TeaModel {
    @NameInMap("Count")
    public Integer count;

    @NameInMap("GroupedFileds")
    public java.util.List<DescribeGroupedTagsResponseBodyGroupedFileds> groupedFileds;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeGroupedTagsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGroupedTagsResponseBody self = new DescribeGroupedTagsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGroupedTagsResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public DescribeGroupedTagsResponseBody setGroupedFileds(java.util.List<DescribeGroupedTagsResponseBodyGroupedFileds> groupedFileds) {
        this.groupedFileds = groupedFileds;
        return this;
    }
    public java.util.List<DescribeGroupedTagsResponseBodyGroupedFileds> getGroupedFileds() {
        return this.groupedFileds;
    }

    public DescribeGroupedTagsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeGroupedTagsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGroupedTagsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeGroupedTagsResponseBodyGroupedFileds extends TeaModel {
        @NameInMap("Count")
        public String count;

        @NameInMap("Name")
        public String name;

        @NameInMap("TagId")
        public Integer tagId;

        public static DescribeGroupedTagsResponseBodyGroupedFileds build(java.util.Map<String, ?> map) throws Exception {
            DescribeGroupedTagsResponseBodyGroupedFileds self = new DescribeGroupedTagsResponseBodyGroupedFileds();
            return TeaModel.build(map, self);
        }

        public DescribeGroupedTagsResponseBodyGroupedFileds setCount(String count) {
            this.count = count;
            return this;
        }
        public String getCount() {
            return this.count;
        }

        public DescribeGroupedTagsResponseBodyGroupedFileds setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeGroupedTagsResponseBodyGroupedFileds setTagId(Integer tagId) {
            this.tagId = tagId;
            return this;
        }
        public Integer getTagId() {
            return this.tagId;
        }

    }

}
