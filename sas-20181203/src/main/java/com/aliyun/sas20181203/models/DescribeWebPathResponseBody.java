// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeWebPathResponseBody extends TeaModel {
    @NameInMap("ConfigList")
    public java.util.List<DescribeWebPathResponseBodyConfigList> configList;

    @NameInMap("Count")
    public Integer count;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Target")
        public String target;

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
        @NameInMap("TargetList")
        public java.util.List<DescribeWebPathResponseBodyConfigListTargetList> targetList;

        @NameInMap("WebPath")
        public String webPath;

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
