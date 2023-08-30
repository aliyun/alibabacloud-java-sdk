// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class DescribeCloudMonitorAgentStatusesResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the Cloud Monitor agent was automatically installed on the simple application server. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     */
    @NameInMap("InstanceStatusList")
    public java.util.List<DescribeCloudMonitorAgentStatusesResponseBodyInstanceStatusList> instanceStatusList;

    /**
     * <p>The request ID.</p>
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
        @NameInMap("AutoInstall")
        public Boolean autoInstall;

        @NameInMap("InstanceId")
        public String instanceId;

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
