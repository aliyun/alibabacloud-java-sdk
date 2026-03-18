// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class UpdateNodeGroupDescriptionRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>okcc</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>ng-3d5ce6454354****</p>
     */
    @NameInMap("NodeGroupId")
    public String nodeGroupId;

    @NameInMap("X-Acs-Ram-Auth-Context")
    public String xAcsRamAuthContext;

    public static UpdateNodeGroupDescriptionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateNodeGroupDescriptionRequest self = new UpdateNodeGroupDescriptionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateNodeGroupDescriptionRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateNodeGroupDescriptionRequest setNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
        return this;
    }
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

    public UpdateNodeGroupDescriptionRequest setXAcsRamAuthContext(String xAcsRamAuthContext) {
        this.xAcsRamAuthContext = xAcsRamAuthContext;
        return this;
    }
    public String getXAcsRamAuthContext() {
        return this.xAcsRamAuthContext;
    }

}
