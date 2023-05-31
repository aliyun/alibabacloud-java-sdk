// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertyScaItemResponseBody extends TeaModel {
    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public DescribePropertyScaItemResponseBodyPageInfo pageInfo;

    /**
     * <p>An array that consists of the information about middleware fingerprints.</p>
     */
    @NameInMap("PropertyItems")
    public java.util.List<DescribePropertyScaItemResponseBodyPropertyItems> propertyItems;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribePropertyScaItemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePropertyScaItemResponseBody self = new DescribePropertyScaItemResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePropertyScaItemResponseBody setPageInfo(DescribePropertyScaItemResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribePropertyScaItemResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public DescribePropertyScaItemResponseBody setPropertyItems(java.util.List<DescribePropertyScaItemResponseBodyPropertyItems> propertyItems) {
        this.propertyItems = propertyItems;
        return this;
    }
    public java.util.List<DescribePropertyScaItemResponseBodyPropertyItems> getPropertyItems() {
        return this.propertyItems;
    }

    public DescribePropertyScaItemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePropertyScaItemResponseBodyPageInfo extends TeaModel {
        /**
         * <p>The number of entries returned on the current page.</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The page number of the returned page.</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries returned per page.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribePropertyScaItemResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribePropertyScaItemResponseBodyPageInfo self = new DescribePropertyScaItemResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribePropertyScaItemResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribePropertyScaItemResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribePropertyScaItemResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribePropertyScaItemResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class DescribePropertyScaItemResponseBodyPropertyItems extends TeaModel {
        /**
         * <p>The type of the middleware, database, or web service. Valid values:</p>
         * <br>
         * <p>*   **system_service**: system service</p>
         * <p>*   **software_library**: software library</p>
         * <p>*   **docker_component**: container component</p>
         * <p>*   **database**: database</p>
         * <p>*   **web_container**: web container</p>
         * <p>*   **jar**: JAR package</p>
         * <p>*   **web_framework**: web framework</p>
         */
        @NameInMap("BizType")
        public String bizType;

        /**
         * <p>The number of servers on which the middleware is run.</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The name of the middleware.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The display name of the middleware type.</p>
         */
        @NameInMap("TypeDisplay")
        public String typeDisplay;

        public static DescribePropertyScaItemResponseBodyPropertyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribePropertyScaItemResponseBodyPropertyItems self = new DescribePropertyScaItemResponseBodyPropertyItems();
            return TeaModel.build(map, self);
        }

        public DescribePropertyScaItemResponseBodyPropertyItems setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public DescribePropertyScaItemResponseBodyPropertyItems setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribePropertyScaItemResponseBodyPropertyItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribePropertyScaItemResponseBodyPropertyItems setTypeDisplay(String typeDisplay) {
            this.typeDisplay = typeDisplay;
            return this;
        }
        public String getTypeDisplay() {
            return this.typeDisplay;
        }

    }

}
