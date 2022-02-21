// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DeleteAIConfigRequest extends TeaModel {
    @NameInMap("ConfigId")
    public String configId;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static DeleteAIConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAIConfigRequest self = new DeleteAIConfigRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAIConfigRequest setConfigId(String configId) {
        this.configId = configId;
        return this;
    }
    public String getConfigId() {
        return this.configId;
    }

    public DeleteAIConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
