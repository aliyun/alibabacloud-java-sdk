// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class StartPublishStreamRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PublishUrl")
    public String publishUrl;

    public static StartPublishStreamRequest build(java.util.Map<String, ?> map) throws Exception {
        StartPublishStreamRequest self = new StartPublishStreamRequest();
        return TeaModel.build(map, self);
    }

    public StartPublishStreamRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public StartPublishStreamRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public StartPublishStreamRequest setPublishUrl(String publishUrl) {
        this.publishUrl = publishUrl;
        return this;
    }
    public String getPublishUrl() {
        return this.publishUrl;
    }

}
