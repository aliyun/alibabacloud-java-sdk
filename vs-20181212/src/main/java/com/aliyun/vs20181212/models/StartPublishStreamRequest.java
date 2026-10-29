// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class StartPublishStreamRequest extends TeaModel {
    /**
     * <p>The ID of the cloud application service instance for which to start desktop capture and streaming.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>render-9f8c57355d224ad7beaf95e145f22111</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The streaming URL for the desktop capture content.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rtmp://example.com/live/stream</p>
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
