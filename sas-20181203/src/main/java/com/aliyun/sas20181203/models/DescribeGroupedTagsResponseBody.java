// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeGroupedTagsResponseBody extends TeaModel {
    /**
     * <p>This parameter is deprecated.</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>An array that consists of the statistics of the asset tags.</p>
     */
    @NameInMap("GroupedFileds")
    public java.util.List<DescribeGroupedTagsResponseBodyGroupedFileds> groupedFileds;

    /**
     * <p>The HTTP status code of the request.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <br>
     * <p>*   **true**: The request is successful.</p>
     * <p>*   **false**: The request fails.</p>
     */
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
        /**
         * <p>The number of assets to which the tag is added.</p>
         */
        @NameInMap("Count")
        public String count;

        /**
         * <p>The name of the tag.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the tag.</p>
         */
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
