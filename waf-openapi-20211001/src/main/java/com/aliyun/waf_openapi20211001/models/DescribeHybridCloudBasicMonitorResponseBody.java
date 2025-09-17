// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeHybridCloudBasicMonitorResponseBody extends TeaModel {
    /**
     * <p>The basic metrics.</p>
     */
    @NameInMap("BasicMonitors")
    public java.util.List<DescribeHybridCloudBasicMonitorResponseBodyBasicMonitors> basicMonitors;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0B8AF42B-16A9-5762-AEF3-D148****FE5D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeHybridCloudBasicMonitorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHybridCloudBasicMonitorResponseBody self = new DescribeHybridCloudBasicMonitorResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHybridCloudBasicMonitorResponseBody setBasicMonitors(java.util.List<DescribeHybridCloudBasicMonitorResponseBodyBasicMonitors> basicMonitors) {
        this.basicMonitors = basicMonitors;
        return this;
    }
    public java.util.List<DescribeHybridCloudBasicMonitorResponseBodyBasicMonitors> getBasicMonitors() {
        return this.basicMonitors;
    }

    public DescribeHybridCloudBasicMonitorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeHybridCloudBasicMonitorResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeHybridCloudBasicMonitorResponseBodyBasicMonitors extends TeaModel {
        @NameInMap("Levle")
        public String levle;

        /**
         * <p>The metric. Valid values:</p>
         * <ul>
         * <li><strong>basic_monitor_cpu_usage</strong>: the CPU.</li>
         * <li><strong>basic_monitor_memory_usage</strong>: the memory.</li>
         * <li><strong>basic_monitor_disk_usage</strong>: the disk.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>basic_monitor_cpu_usage</p>
         */
        @NameInMap("MonitorName")
        public String monitorName;

        /**
         * <p>The resource usage.</p>
         * 
         * <strong>example:</strong>
         * <p>5.905694</p>
         */
        @NameInMap("UseRatio")
        public Long useRatio;

        public static DescribeHybridCloudBasicMonitorResponseBodyBasicMonitors build(java.util.Map<String, ?> map) throws Exception {
            DescribeHybridCloudBasicMonitorResponseBodyBasicMonitors self = new DescribeHybridCloudBasicMonitorResponseBodyBasicMonitors();
            return TeaModel.build(map, self);
        }

        public DescribeHybridCloudBasicMonitorResponseBodyBasicMonitors setLevle(String levle) {
            this.levle = levle;
            return this;
        }
        public String getLevle() {
            return this.levle;
        }

        public DescribeHybridCloudBasicMonitorResponseBodyBasicMonitors setMonitorName(String monitorName) {
            this.monitorName = monitorName;
            return this;
        }
        public String getMonitorName() {
            return this.monitorName;
        }

        public DescribeHybridCloudBasicMonitorResponseBodyBasicMonitors setUseRatio(Long useRatio) {
            this.useRatio = useRatio;
            return this;
        }
        public Long getUseRatio() {
            return this.useRatio;
        }

    }

}
