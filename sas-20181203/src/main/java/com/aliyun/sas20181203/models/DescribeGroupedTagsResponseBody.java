// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeGroupedTagsResponseBody extends TeaModel {
    // This parameter is deprecated.
    @NameInMap("Count")
    public Integer count;

    // An array that consists of the statistics of the asset tags.
    @NameInMap("GroupedFileds")
    public java.util.List<DescribeGroupedTagsResponseBodyGroupedFileds> groupedFileds;

    // The HTTP status code of the request.
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    // The ID of the request, which is used to locate and troubleshoot issues.
    @NameInMap("RequestId")
    public String requestId;

    // Indicates whether the request is successful. Valid values:
    // 
    // *   **true**: The request is successful.
    // *   **false**: The request fails.
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
        // The number of assets to which the tag is added.
        @NameInMap("Count")
        public String count;

        // The name of the tag.
        @NameInMap("Name")
        public String name;

        // The ID of the tag.
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
