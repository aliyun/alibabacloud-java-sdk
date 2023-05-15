// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVulTargetStatisticsResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The configurations of the vulnerability scan feature.</p>
     */
    @NameInMap("TargetStats")
    public java.util.List<DescribeVulTargetStatisticsResponseBodyTargetStats> targetStats;

    /**
     * <p>An array that consists of the configurations of the vulnerability scan feature.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeVulTargetStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVulTargetStatisticsResponseBody self = new DescribeVulTargetStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVulTargetStatisticsResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeVulTargetStatisticsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeVulTargetStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVulTargetStatisticsResponseBody setTargetStats(java.util.List<DescribeVulTargetStatisticsResponseBodyTargetStats> targetStats) {
        this.targetStats = targetStats;
        return this;
    }
    public java.util.List<DescribeVulTargetStatisticsResponseBodyTargetStats> getTargetStats() {
        return this.targetStats;
    }

    public DescribeVulTargetStatisticsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeVulTargetStatisticsResponseBodyTargetStatsTargets extends TeaModel {
        /**
         * <p>The group ID or UUID of the server to which the configurations are applied.</p>
         */
        @NameInMap("Flag")
        public String flag;

        /**
         * <p>The condition by which the configurations are applied to the server. Valid values:</p>
         * <br>
         * <p>*   **uuid**: the UUID of the server</p>
         * <p>*   **groupId**: the ID of the server group</p>
         */
        @NameInMap("Target")
        public String target;

        @NameInMap("TargetType")
        public String targetType;

        public static DescribeVulTargetStatisticsResponseBodyTargetStatsTargets build(java.util.Map<String, ?> map) throws Exception {
            DescribeVulTargetStatisticsResponseBodyTargetStatsTargets self = new DescribeVulTargetStatisticsResponseBodyTargetStatsTargets();
            return TeaModel.build(map, self);
        }

        public DescribeVulTargetStatisticsResponseBodyTargetStatsTargets setFlag(String flag) {
            this.flag = flag;
            return this;
        }
        public String getFlag() {
            return this.flag;
        }

        public DescribeVulTargetStatisticsResponseBodyTargetStatsTargets setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

        public DescribeVulTargetStatisticsResponseBodyTargetStatsTargets setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

    }

    public static class DescribeVulTargetStatisticsResponseBodyTargetStats extends TeaModel {
        /**
         * <p>The information about the server.</p>
         */
        @NameInMap("Targets")
        public java.util.List<DescribeVulTargetStatisticsResponseBodyTargetStatsTargets> targets;

        /**
         * <p>The number of servers to which the configurations are applied.</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        /**
         * <p>An array that consists of available servers.</p>
         */
        @NameInMap("UuidCount")
        public Integer uuidCount;

        /**
         * <p>The total number of servers.</p>
         */
        @NameInMap("VulType")
        public String vulType;

        public static DescribeVulTargetStatisticsResponseBodyTargetStats build(java.util.Map<String, ?> map) throws Exception {
            DescribeVulTargetStatisticsResponseBodyTargetStats self = new DescribeVulTargetStatisticsResponseBodyTargetStats();
            return TeaModel.build(map, self);
        }

        public DescribeVulTargetStatisticsResponseBodyTargetStats setTargets(java.util.List<DescribeVulTargetStatisticsResponseBodyTargetStatsTargets> targets) {
            this.targets = targets;
            return this;
        }
        public java.util.List<DescribeVulTargetStatisticsResponseBodyTargetStatsTargets> getTargets() {
            return this.targets;
        }

        public DescribeVulTargetStatisticsResponseBodyTargetStats setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public DescribeVulTargetStatisticsResponseBodyTargetStats setUuidCount(Integer uuidCount) {
            this.uuidCount = uuidCount;
            return this;
        }
        public Integer getUuidCount() {
            return this.uuidCount;
        }

        public DescribeVulTargetStatisticsResponseBodyTargetStats setVulType(String vulType) {
            this.vulType = vulType;
            return this;
        }
        public String getVulType() {
            return this.vulType;
        }

    }

}
