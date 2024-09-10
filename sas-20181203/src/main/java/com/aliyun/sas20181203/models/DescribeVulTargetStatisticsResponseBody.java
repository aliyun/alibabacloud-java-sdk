// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVulTargetStatisticsResponseBody extends TeaModel {
    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>23AD0BD2-8771-5647-819E-6BA51E212F80</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>An array that consists of the configurations of the vulnerability scan feature.</p>
     */
    @NameInMap("TargetStats")
    public java.util.List<DescribeVulTargetStatisticsResponseBodyTargetStats> targetStats;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
         * <p>Indicates whether the configurations are applied to the server. Valid values:</p>
         * <ul>
         * <li><strong>add</strong>: yes</li>
         * <li><strong>del</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>add</p>
         */
        @NameInMap("Flag")
        public String flag;

        /**
         * <p>The group ID or UUID of the server to which the configurations are applied.</p>
         * 
         * <strong>example:</strong>
         * <p>0011ea53-738c-4bff-93be-ce6a1cc9****</p>
         */
        @NameInMap("Target")
        public String target;

        /**
         * <p>The condition by which the configurations are applied to the server. Valid values:</p>
         * <ul>
         * <li><strong>uuid</strong>: the UUID of the server</li>
         * <li><strong>groupId</strong>: the ID of the server group</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>uuid</p>
         */
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
         * <p>An array that consists of available servers.</p>
         */
        @NameInMap("Targets")
        public java.util.List<DescribeVulTargetStatisticsResponseBodyTargetStatsTargets> targets;

        /**
         * <p>The total number of servers.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        /**
         * <p>The number of servers to which the configurations are applied.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("UuidCount")
        public Integer uuidCount;

        /**
         * <p>The type of the vulnerability. Valid values:</p>
         * <ul>
         * <li>cve: Linux software vulnerabilities</li>
         * <li>sys: Windows system vulnerabilities</li>
         * <li>cms: Web-CMS vulnerabilities</li>
         * <li>emg: urgent vulnerabilities</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cve</p>
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
