// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class CreateStreamSnapshotRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>323*****997-cn-qingdao</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <strong>example:</strong>
     * <p>device</p>
     */
    @NameInMap("Location")
    public String location;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static CreateStreamSnapshotRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateStreamSnapshotRequest self = new CreateStreamSnapshotRequest();
        return TeaModel.build(map, self);
    }

    public CreateStreamSnapshotRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CreateStreamSnapshotRequest setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public CreateStreamSnapshotRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
