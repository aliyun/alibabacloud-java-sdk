// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class DescribeCloudMonitorAgentStatusesResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the Cloud Monitor agent was automatically installed on the simple application server.</p>
     */
    @NameInMap("InstanceStatusList")
    public java.util.List<DescribeCloudMonitorAgentStatusesResponseBodyInstanceStatusList> instanceStatusList;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>30637AD6-D977-4833-A54C-CC89483E1FEE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCloudMonitorAgentStatusesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudMonitorAgentStatusesResponseBody self = new DescribeCloudMonitorAgentStatusesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCloudMonitorAgentStatusesResponseBody setInstanceStatusList(java.util.List<DescribeCloudMonitorAgentStatusesResponseBodyInstanceStatusList> instanceStatusList) {
        this.instanceStatusList = instanceStatusList;
        return this;
    }
    public java.util.List<DescribeCloudMonitorAgentStatusesResponseBodyInstanceStatusList> getInstanceStatusList() {
        return this.instanceStatusList;
    }

    public DescribeCloudMonitorAgentStatusesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeCloudMonitorAgentStatusesResponseBodyInstanceStatusList extends TeaModel {
        /**
         * <p>Indicates whether the Cloud Monitor agent was automatically installed on the simple application server. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AutoInstall")
        public Boolean autoInstall;

        /**
         * <p>The ID of the simple application server.</p>
         * 
         * <strong>example:</strong>
         * <p>c854dc6f07e74953830bb5808d0****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The running status of the Cloud Monitoring plug-in. Possible values are:</p>
         * <ul>
         * <li>running: Cloud Monitoring plug-in running.</li>
         * <li>stopped: Cloud Monitoring plug-in stopped.</li>
         * <li>installing: Cloud Monitoring plug-in installing.</li>
         * <li>install_faild: Cloud Monitoring plug-in installation failed.</li>
         * <li>abnormal: Cloud Monitoring plug-in installation abnormal.</li>
         * <li>not_installed: Cloud Monitoring plug-in not installed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>running</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeCloudMonitorAgentStatusesResponseBodyInstanceStatusList build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudMonitorAgentStatusesResponseBodyInstanceStatusList self = new DescribeCloudMonitorAgentStatusesResponseBodyInstanceStatusList();
            return TeaModel.build(map, self);
        }

        public DescribeCloudMonitorAgentStatusesResponseBodyInstanceStatusList setAutoInstall(Boolean autoInstall) {
            this.autoInstall = autoInstall;
            return this;
        }
        public Boolean getAutoInstall() {
            return this.autoInstall;
        }

        public DescribeCloudMonitorAgentStatusesResponseBodyInstanceStatusList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeCloudMonitorAgentStatusesResponseBodyInstanceStatusList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
