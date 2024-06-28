// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeHighDefinitionMonitorLogAttributeResponseBody extends TeaModel {
    /**
     * <p>The ID of the instance whose fine-grained monitoring configurations you want to query.</p>
     * 
     * <strong>example:</strong>
     * <p>eip-wz9fi6qboho9fwgx7****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The type of instance for which you want to query fine-grained monitoring. Only <strong>EIP</strong> may be returned.</p>
     * 
     * <strong>example:</strong>
     * <p>EIP</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The name of the project.</p>
     * 
     * <strong>example:</strong>
     * <p>hdmonitor-cn-shenzhen-1658206966225390</p>
     */
    @NameInMap("LogProject")
    public String logProject;

    /**
     * <p>The name of the Logstore.</p>
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
     * <p>Indicates whether the operation is performed. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
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
