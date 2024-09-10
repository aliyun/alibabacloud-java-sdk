// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeGroupedTagsResponseBody extends TeaModel {
    /**
     * <p>This parameter is deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
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
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>151F6EB6-D5F3-417A-AF7B-4D84975DB586</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The request is successful.</li>
     * <li><strong>false</strong>: The request fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
         * 
         * <strong>example:</strong>
         * <p>152</p>
         */
        @NameInMap("Count")
        public String count;

        /**
         * <p>The name of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>InternetIp</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>3252366</p>
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
