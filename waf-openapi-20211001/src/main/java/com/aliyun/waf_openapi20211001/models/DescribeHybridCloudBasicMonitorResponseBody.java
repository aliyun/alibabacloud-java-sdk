// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeHybridCloudBasicMonitorResponseBody extends TeaModel {
    /**
     * <p>The list of basic monitoring items.</p>
     */
    @NameInMap("BasicMonitors")
    public java.util.List<DescribeHybridCloudBasicMonitorResponseBodyBasicMonitors> basicMonitors;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0B8AF42B-16A9-5762-AEF3-D148****FE5D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <blockquote>
     * <p>This parameter is deprecated and no longer returns meaningful data.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("TotalCount")
    @Deprecated
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

    @Deprecated
    public DescribeHybridCloudBasicMonitorResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeHybridCloudBasicMonitorResponseBodyBasicMonitors extends TeaModel {
        /**
         * <p>The status. Valid values:</p>
         * <ul>
         * <li><p><strong>normal</strong>: Normal.</p>
         * </li>
         * <li><p><code>****</code>: abnormal (four asterisk characters are returned).</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("Levle")
        public String levle;

        /**
         * <p>The monitoring item. Valid values:</p>
         * <ul>
         * <li><p><strong>basic_monitor_cpu_usage</strong>: CPU.</p>
         * </li>
         * <li><p><strong>basic_monitor_memory_usage</strong>: memory.</p>
         * </li>
         * <li><p><strong>basic_monitor_disk_usage</strong>: disk.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>basic_monitor_cpu_usage</p>
         */
        @NameInMap("MonitorName")
        public String monitorName;

        /**
         * <p>The usage ratio.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
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
