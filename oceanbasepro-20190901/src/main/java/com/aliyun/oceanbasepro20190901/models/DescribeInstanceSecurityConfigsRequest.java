// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeInstanceSecurityConfigsRequest extends TeaModel {
    /**
     * <p>The unique identifier of the check.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("CheckId")
    public String checkId;

    /**
     * <p>The ID of the OceanBase cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ob317v4uif****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static DescribeInstanceSecurityConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceSecurityConfigsRequest self = new DescribeInstanceSecurityConfigsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceSecurityConfigsRequest setCheckId(String checkId) {
        this.checkId = checkId;
        return this;
    }
    public String getCheckId() {
        return this.checkId;
    }

    public DescribeInstanceSecurityConfigsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
