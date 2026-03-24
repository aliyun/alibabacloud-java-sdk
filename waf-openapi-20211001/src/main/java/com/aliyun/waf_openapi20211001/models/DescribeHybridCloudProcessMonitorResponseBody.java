// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeHybridCloudProcessMonitorResponseBody extends TeaModel {
    /**
     * <p>The list of application statuses.</p>
     */
    @NameInMap("ProcessMonitors")
    public java.util.List<DescribeHybridCloudProcessMonitorResponseBodyProcessMonitors> processMonitors;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>DBF79169-B6A0-5C8E-86B2-CFE3****496E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <blockquote>
     * <p>This parameter is deprecated and no longer returns a valid value.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeHybridCloudProcessMonitorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHybridCloudProcessMonitorResponseBody self = new DescribeHybridCloudProcessMonitorResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHybridCloudProcessMonitorResponseBody setProcessMonitors(java.util.List<DescribeHybridCloudProcessMonitorResponseBodyProcessMonitors> processMonitors) {
        this.processMonitors = processMonitors;
        return this;
    }
    public java.util.List<DescribeHybridCloudProcessMonitorResponseBodyProcessMonitors> getProcessMonitors() {
        return this.processMonitors;
    }

    public DescribeHybridCloudProcessMonitorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeHybridCloudProcessMonitorResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeHybridCloudProcessMonitorResponseBodyProcessMonitors extends TeaModel {
        /**
         * <p>The severity level of the application status. Valid values:</p>
         * <ul>
         * <li><p><strong>normal</strong>: normal.</p>
         * </li>
         * <li><p><strong>critical</strong>: abnormal.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("Levle")
        public String levle;

        /**
         * <p>The name of the application running on the cluster node. Valid values:</p>
         * <ul>
         * <li><p><strong>tianqingproxy</strong>: the central management service</p>
         * </li>
         * <li><p><strong>redis</strong>: the storage service</p>
         * </li>
         * <li><p><strong>scc</strong>: the traffic metering service</p>
         * </li>
         * <li><p><strong>keeper</strong>: the threat intelligence service</p>
         * </li>
         * <li><p><strong>node_exporter</strong>: the application log upload service</p>
         * </li>
         * <li><p><strong>xagent</strong>: the traffic detection service</p>
         * </li>
         * <li><p><strong>noproxy</strong>: the traffic forwarding service</p>
         * </li>
         * <li><p><strong>xloge</strong>: the attack log upload service</p>
         * </li>
         * <li><p><strong>ilogtail</strong>: the log collection service</p>
         * </li>
         * <li><p><strong>xlogd</strong>: the log analysis service</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>keeper</p>
         */
        @NameInMap("ProcessName")
        public String processName;

        /**
         * <p>The running status of the application. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong>: abnormal.</p>
         * </li>
         * <li><p><strong>1</strong>: normal.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ProcessStatus")
        public Long processStatus;

        public static DescribeHybridCloudProcessMonitorResponseBodyProcessMonitors build(java.util.Map<String, ?> map) throws Exception {
            DescribeHybridCloudProcessMonitorResponseBodyProcessMonitors self = new DescribeHybridCloudProcessMonitorResponseBodyProcessMonitors();
            return TeaModel.build(map, self);
        }

        public DescribeHybridCloudProcessMonitorResponseBodyProcessMonitors setLevle(String levle) {
            this.levle = levle;
            return this;
        }
        public String getLevle() {
            return this.levle;
        }

        public DescribeHybridCloudProcessMonitorResponseBodyProcessMonitors setProcessName(String processName) {
            this.processName = processName;
            return this;
        }
        public String getProcessName() {
            return this.processName;
        }

        public DescribeHybridCloudProcessMonitorResponseBodyProcessMonitors setProcessStatus(Long processStatus) {
            this.processStatus = processStatus;
            return this;
        }
        public Long getProcessStatus() {
            return this.processStatus;
        }

    }

}
