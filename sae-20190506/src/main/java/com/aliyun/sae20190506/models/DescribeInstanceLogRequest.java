// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeInstanceLogRequest extends TeaModel {
    /**
     * <p>The ID of the sidecar container. You can call the <a href="https://help.aliyun.com/document_detail/2834847.html">DescribeApplicationInstances</a> to obtain the ID.</p>
     * 
     * <strong>example:</strong>
     * <p>sidecar-test-01</p>
     */
    @NameInMap("ContainerId")
    public String containerId;

    /**
     * <p>The ID of the request.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>******-d700e680-aa4d-4ec1-afc2-6566b5ff4d7a-85d44d4bfc-*****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static DescribeInstanceLogRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceLogRequest self = new DescribeInstanceLogRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceLogRequest setContainerId(String containerId) {
        this.containerId = containerId;
        return this;
    }
    public String getContainerId() {
        return this.containerId;
    }

    public DescribeInstanceLogRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
