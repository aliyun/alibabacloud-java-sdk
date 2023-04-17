// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class ListResourcesForTagOptionResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceDetails")
    public java.util.List<ListResourcesForTagOptionResponseBodyResourceDetails> resourceDetails;

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
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("ResourceArn")
        public String resourceArn;

        @NameInMap("ResourceId")
        public String resourceId;

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
