// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeHighDefinitionMonitorLogAttributeResponseBody extends TeaModel {
    /**
     * <p>The ID of the fine-grained monitoring instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The type of the monitoring instance that is queried. The value is set to **EIP**.</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The name of the log project of Log Service.</p>
     */
    @NameInMap("LogProject")
    public String logProject;

    /**
     * <p>The name of the Logstore of Log Service.</p>
     */
    @NameInMap("LogStore")
    public String logStore;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the operation is performed. Valid values:</p>
     * <br>
     * <p>*   **true**: The operation is performed.</p>
     * <p>*   **false**: The operation is not performed.</p>
     */
    @NameInMap("Success")
    public String success;

    public static DescribeHighDefinitionMonitorLogAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHighDefinitionMonitorLogAttributeResponseBody self = new DescribeHighDefinitionMonitorLogAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHighDefinitionMonitorLogAttributeResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeHighDefinitionMonitorLogAttributeResponseBody setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public DescribeHighDefinitionMonitorLogAttributeResponseBody setLogProject(String logProject) {
        this.logProject = logProject;
        return this;
    }
    public String getLogProject() {
        return this.logProject;
    }

    public DescribeHighDefinitionMonitorLogAttributeResponseBody setLogStore(String logStore) {
        this.logStore = logStore;
        return this;
    }
    public String getLogStore() {
        return this.logStore;
    }

    public DescribeHighDefinitionMonitorLogAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeHighDefinitionMonitorLogAttributeResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}
