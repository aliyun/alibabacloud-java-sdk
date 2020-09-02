// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeHighDefinitionMonitorLogAttributeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public String success;

    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("InstanceType")
    @Validation(required = true)
    public String instanceType;

    @NameInMap("LogProject")
    @Validation(required = true)
    public String logProject;

    @NameInMap("LogStore")
    @Validation(required = true)
    public String logStore;

    public static DescribeHighDefinitionMonitorLogAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHighDefinitionMonitorLogAttributeResponse self = new DescribeHighDefinitionMonitorLogAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHighDefinitionMonitorLogAttributeResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeHighDefinitionMonitorLogAttributeResponse setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public DescribeHighDefinitionMonitorLogAttributeResponse setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeHighDefinitionMonitorLogAttributeResponse setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public DescribeHighDefinitionMonitorLogAttributeResponse setLogProject(String logProject) {
        this.logProject = logProject;
        return this;
    }
    public String getLogProject() {
        return this.logProject;
    }

    public DescribeHighDefinitionMonitorLogAttributeResponse setLogStore(String logStore) {
        this.logStore = logStore;
        return this;
    }
    public String getLogStore() {
        return this.logStore;
    }

}
