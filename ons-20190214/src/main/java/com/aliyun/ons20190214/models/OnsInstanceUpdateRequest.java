// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsInstanceUpdateRequest extends TeaModel {
    /**
     * <p>The ID of the instance whose name or description you want to update.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The new name of the instance. The name must meet the following rules:</p>
     * <br>
     * <p>*   The name of the instance must be unique in the region where the instance is deployed.</p>
     * <p>*   The name must be 3 to 64 characters in length and can contain letters, digits, hyphens (-), and underscores (\_).</p>
     * <p>*   If you do not configure this parameter, the instance name remains unchanged.</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The updated description of the instance. If you do not configure this parameter, the instance description remains unchanged.</p>
     */
    @NameInMap("Remark")
    public String remark;

    public static OnsInstanceUpdateRequest build(java.util.Map<String, ?> map) throws Exception {
        OnsInstanceUpdateRequest self = new OnsInstanceUpdateRequest();
        return TeaModel.build(map, self);
    }

    public OnsInstanceUpdateRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public OnsInstanceUpdateRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public OnsInstanceUpdateRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
