// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class ListResourcesForTagOptionResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     * <br>
     * <p>Pages start from page 1. Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * <br>
     * <p>Valid values: 1 to 100 Minimum value: 1. Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>An array that consists of the associated resources.</p>
     */
    @NameInMap("ResourceDetails")
    public java.util.List<ListResourcesForTagOptionResponseBodyResourceDetails> resourceDetails;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListResourcesForTagOptionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListResourcesForTagOptionResponseBody self = new ListResourcesForTagOptionResponseBody();
        return TeaModel.build(map, self);
    }

    public ListResourcesForTagOptionResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListResourcesForTagOptionResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListResourcesForTagOptionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListResourcesForTagOptionResponseBody setResourceDetails(java.util.List<ListResourcesForTagOptionResponseBodyResourceDetails> resourceDetails) {
        this.resourceDetails = resourceDetails;
        return this;
    }
    public java.util.List<ListResourcesForTagOptionResponseBodyResourceDetails> getResourceDetails() {
        return this.resourceDetails;
    }

    public ListResourcesForTagOptionResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListResourcesForTagOptionResponseBodyResourceDetails extends TeaModel {
        /**
         * <p>The time when the resource was created.</p>
         * <br>
         * <p>The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the resource.</p>
         * <br>
         * <p>The value must be 1 to 128 characters in length.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the resource.</p>
         */
        @NameInMap("ResourceArn")
        public String resourceArn;

        /**
         * <p>The ID of the resource with which the tag option is associated.</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The name of the resource.</p>
         */
        @NameInMap("ResourceName")
        public String resourceName;

        public static ListResourcesForTagOptionResponseBodyResourceDetails build(java.util.Map<String, ?> map) throws Exception {
            ListResourcesForTagOptionResponseBodyResourceDetails self = new ListResourcesForTagOptionResponseBodyResourceDetails();
            return TeaModel.build(map, self);
        }

        public ListResourcesForTagOptionResponseBodyResourceDetails setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListResourcesForTagOptionResponseBodyResourceDetails setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListResourcesForTagOptionResponseBodyResourceDetails setResourceArn(String resourceArn) {
            this.resourceArn = resourceArn;
            return this;
        }
        public String getResourceArn() {
            return this.resourceArn;
        }

        public ListResourcesForTagOptionResponseBodyResourceDetails setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ListResourcesForTagOptionResponseBodyResourceDetails setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

    }

}
