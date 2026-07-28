// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeHighDefinitionMonitorLogAttributeResponseBody extends TeaModel {
    /**
     * <p>The instance ID for which high-precision second-level monitoring is queried.</p>
     * 
     * <strong>example:</strong>
     * <p>eip-wz9fi6qboho9fwgx7****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The type of the instance for which high-precision second-level monitoring is queried. The value is <strong>EIP</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>EIP</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The name of the LogProject.</p>
     * 
     * <strong>example:</strong>
     * <p>hdmonitor-cn-shenzhen-1658206966225390</p>
     */
    @NameInMap("LogProject")
    public String logProject;

    /**
     * <p>The name of the LogStore.</p>
     * 
     * <strong>example:</strong>
     * <p>hdmonitor</p>
     */
    @NameInMap("LogStore")
    public String logStore;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>54B48E3D-DF70-471B-AA93-08E683A1B457</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
     * <ul>
     * <li><strong>true</strong>: The call was successful.</li>
     * <li><strong>false</strong>: The call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
