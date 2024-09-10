// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertyTypeScaItemResponseBody extends TeaModel {
    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public DescribePropertyTypeScaItemResponseBodyPageInfo pageInfo;

    /**
     * <p>An array that consists of the middleware types.</p>
     */
    @NameInMap("PropertyTypeItems")
    public java.util.List<DescribePropertyTypeScaItemResponseBodyPropertyTypeItems> propertyTypeItems;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>B7A839E8-70AE-591D-8D9E-C5419A22****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribePropertyTypeScaItemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePropertyTypeScaItemResponseBody self = new DescribePropertyTypeScaItemResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePropertyTypeScaItemResponseBody setPageInfo(DescribePropertyTypeScaItemResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribePropertyTypeScaItemResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public DescribePropertyTypeScaItemResponseBody setPropertyTypeItems(java.util.List<DescribePropertyTypeScaItemResponseBodyPropertyTypeItems> propertyTypeItems) {
        this.propertyTypeItems = propertyTypeItems;
        return this;
    }
    public java.util.List<DescribePropertyTypeScaItemResponseBodyPropertyTypeItems> getPropertyTypeItems() {
        return this.propertyTypeItems;
    }

    public DescribePropertyTypeScaItemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePropertyTypeScaItemResponseBodyPageInfo extends TeaModel {
        /**
         * <p>The number of entries returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>69</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribePropertyTypeScaItemResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribePropertyTypeScaItemResponseBodyPageInfo self = new DescribePropertyTypeScaItemResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribePropertyTypeScaItemResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribePropertyTypeScaItemResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribePropertyTypeScaItemResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribePropertyTypeScaItemResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class DescribePropertyTypeScaItemResponseBodyPropertyTypeItems extends TeaModel {
        /**
         * <p>The name of the middleware type.</p>
         * 
         * <strong>example:</strong>
         * <p>Docker Component</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The type of the middleware. Valid values:</p>
         * <ul>
         * <li><strong>system_service</strong>: system service</li>
         * <li><strong>software_library</strong>: software library</li>
         * <li><strong>docker_component</strong>: container component</li>
         * <li><strong>database</strong>: database</li>
         * <li><strong>web_container</strong>: web container</li>
         * <li><strong>jar</strong>: JAR package</li>
         * <li><strong>web_framework</strong>: web framework</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>docker_component</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribePropertyTypeScaItemResponseBodyPropertyTypeItems build(java.util.Map<String, ?> map) throws Exception {
            DescribePropertyTypeScaItemResponseBodyPropertyTypeItems self = new DescribePropertyTypeScaItemResponseBodyPropertyTypeItems();
            return TeaModel.build(map, self);
        }

        public DescribePropertyTypeScaItemResponseBodyPropertyTypeItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribePropertyTypeScaItemResponseBodyPropertyTypeItems setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
