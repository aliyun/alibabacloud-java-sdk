// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeInstanceLogRequest extends TeaModel {
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

    public DescribeInstanceLogRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
