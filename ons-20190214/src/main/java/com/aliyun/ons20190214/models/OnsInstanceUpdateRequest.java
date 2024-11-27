// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsInstanceUpdateRequest extends TeaModel {
    /**
     * <p>The ID of the instance whose name or description you want to update.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MQ_INST_188077086902****_BXSuW61e</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The new name of the instance. The name must meet the following rules:</p>
     * <ul>
     * <li>The name of the instance must be unique in the region where the instance is deployed.</li>
     * <li>The name must be 3 to 64 characters in length and can contain letters, digits, hyphens (-), underscores (_), and Chinese characters.</li>
     * <li>If you do not configure this parameter, the instance name remains unchanged.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Updatedname</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The updated description of the instance. If you do not configure this parameter, the instance description remains unchanged.</p>
     * 
     * <strong>example:</strong>
     * <p>Updateddescription</p>
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
