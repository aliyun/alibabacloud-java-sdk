// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeAvailableCpuResourceRequest extends TeaModel {
    /**
     * <p>The CPU resources available.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ob317v4uif****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <pre><code>http(s)://[Endpoint]/?Action=DescribeAvailableCpuResource
     * &amp;InstanceId=ob317v4uif****
     * &amp;TenantId=ob2mr3oae0****
     * &amp;ModifyType=update
     * &amp;Common request parameters
     * </code></pre>
     * 
     * <strong>example:</strong>
     * <p>update</p>
     */
    @NameInMap("ModifyType")
    public String modifyType;

    /**
     * <p>The operation that you want to perform.<br>Set the value to <strong>DescribeAvailableCpuResource</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>ob2mr3oae0****</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    public static DescribeAvailableCpuResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableCpuResourceRequest self = new DescribeAvailableCpuResourceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableCpuResourceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeAvailableCpuResourceRequest setModifyType(String modifyType) {
        this.modifyType = modifyType;
        return this;
    }
    public String getModifyType() {
        return this.modifyType;
    }

    public DescribeAvailableCpuResourceRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
