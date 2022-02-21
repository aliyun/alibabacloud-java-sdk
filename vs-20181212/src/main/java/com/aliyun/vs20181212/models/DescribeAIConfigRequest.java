// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeAIConfigRequest extends TeaModel {
    @NameInMap("ConfigId")
    public String configId;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static DescribeAIConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAIConfigRequest self = new DescribeAIConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAIConfigRequest setConfigId(String configId) {
        this.configId = configId;
        return this;
    }
    public String getConfigId() {
        return this.configId;
    }

    public DescribeAIConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
