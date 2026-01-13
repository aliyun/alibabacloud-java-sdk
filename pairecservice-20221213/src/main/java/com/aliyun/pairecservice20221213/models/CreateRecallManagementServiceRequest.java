// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CreateRecallManagementServiceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>this is a test recall</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>pairec-cn-test123</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>hot_global_recall</p>
     */
    @NameInMap("Name")
    public String name;

    public static CreateRecallManagementServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRecallManagementServiceRequest self = new CreateRecallManagementServiceRequest();
        return TeaModel.build(map, self);
    }

    public CreateRecallManagementServiceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateRecallManagementServiceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateRecallManagementServiceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
