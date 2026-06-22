// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeWebPathResponseBody extends TeaModel {
    /**
     * <p>The list of web paths.</p>
     */
    @NameInMap("ConfigList")
    public java.util.List<DescribeWebPathResponseBodyConfigList> configList;

    /**
     * <p>The number of entries on the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>The page number of the current page in a paged query. Paging is used to display results.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The maximum number of entries per page in a paged query. Paging is used to display results.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request. The China Chinese Cloud generates a unique identifier for each request, which can be used for troubleshooting and diagnostics.</p>
     * 
     * <strong>example:</strong>
     * <p>B37C9052-A73E-4707-A024-92477028****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeWebPathResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebPathResponseBody self = new DescribeWebPathResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeWebPathResponseBody setConfigList(java.util.List<DescribeWebPathResponseBodyConfigList> configList) {
        this.configList = configList;
        return this;
    }
    public java.util.List<DescribeWebPathResponseBodyConfigList> getConfigList() {
        return this.configList;
    }

    public DescribeWebPathResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public DescribeWebPathResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeWebPathResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeWebPathResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeWebPathResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeWebPathResponseBodyConfigListTargetList extends TeaModel {
        /**
         * <p>The target object.</p>
         * 
         * <strong>example:</strong>
         * <p>82048187-bb9b-4e19-8320-7b4ddb97****</p>
         */
        @NameInMap("Target")
        public String target;

        /**
         * <p>The target type. Valid values:</p>
         * <ul>
         * <li><strong>uuid</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>uuid</p>
         */
        @NameInMap("TargetType")
        public String targetType;

        public static DescribeWebPathResponseBodyConfigListTargetList build(java.util.Map<String, ?> map) throws Exception {
            DescribeWebPathResponseBodyConfigListTargetList self = new DescribeWebPathResponseBodyConfigListTargetList();
            return TeaModel.build(map, self);
        }

        public DescribeWebPathResponseBodyConfigListTargetList setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

        public DescribeWebPathResponseBodyConfigListTargetList setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

    }

    public static class DescribeWebPathResponseBodyConfigList extends TeaModel {
        /**
         * <p>The list of servers on which the web directory takes effect.</p>
         */
        @NameInMap("TargetList")
        public java.util.List<DescribeWebPathResponseBodyConfigListTargetList> targetList;

        /**
         * <p>The web directory.</p>
         * 
         * <strong>example:</strong>
         * <p>/root/www****</p>
         */
        @NameInMap("WebPath")
        public String webPath;

        /**
         * <p>The type of the web path. Valid values:</p>
         * <ul>
         * <li><strong>def</strong>: automatically identified by the system.</li>
         * <li><strong>customize</strong>: manually added.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>def</p>
         */
        @NameInMap("WebPathType")
        public String webPathType;

        public static DescribeWebPathResponseBodyConfigList build(java.util.Map<String, ?> map) throws Exception {
            DescribeWebPathResponseBodyConfigList self = new DescribeWebPathResponseBodyConfigList();
            return TeaModel.build(map, self);
        }

        public DescribeWebPathResponseBodyConfigList setTargetList(java.util.List<DescribeWebPathResponseBodyConfigListTargetList> targetList) {
            this.targetList = targetList;
            return this;
        }
        public java.util.List<DescribeWebPathResponseBodyConfigListTargetList> getTargetList() {
            return this.targetList;
        }

        public DescribeWebPathResponseBodyConfigList setWebPath(String webPath) {
            this.webPath = webPath;
            return this;
        }
        public String getWebPath() {
            return this.webPath;
        }

        public DescribeWebPathResponseBodyConfigList setWebPathType(String webPathType) {
            this.webPathType = webPathType;
            return this;
        }
        public String getWebPathType() {
            return this.webPathType;
        }

    }

}
