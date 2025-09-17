// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeHybridCloudProcessMonitorResponseBody extends TeaModel {
    /**
     * <p>The status of the applications.</p>
     */
    @NameInMap("ProcessMonitors")
    public java.util.List<DescribeHybridCloudProcessMonitorResponseBodyProcessMonitors> processMonitors;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>DBF79169-B6A0-5C8E-86B2-CFE3****496E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Levle")
        public String levle;

        /**
         * <p>The service that the application provides. Valid values:</p>
         * <ul>
         * <li><strong>tianqingproxy</strong>: centralized management service.</li>
         * <li><strong>redis</strong>: storage service.</li>
         * <li><strong>scc</strong>: traffic calculation service.</li>
         * <li><strong>keeper</strong>: threat intelligence service.</li>
         * <li><strong>node_exporter</strong>: application log upload service.</li>
         * <li><strong>xagent</strong>: traffic detection service.</li>
         * <li><strong>noproxy</strong>: traffic forwarding service.</li>
         * <li><strong>xloge</strong>: attack log upload service.</li>
         * <li><strong>ilogtail</strong>: log collection service.</li>
         * <li><strong>xlogd</strong>: log analysis service.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>tianqingproxy</p>
         */
        @NameInMap("ProcessName")
        public String processName;

        /**
         * <p>The status of the application. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: abnormal.</li>
         * <li><strong>1</strong>: normal.</li>
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
