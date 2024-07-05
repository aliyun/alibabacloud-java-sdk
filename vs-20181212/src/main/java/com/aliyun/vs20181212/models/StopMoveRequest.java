// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class StopMoveRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>348*****380-cn-qingdao</p>
     */
    @NameInMap("Id")
    public String id;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Pan")
    public Boolean pan;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Tilt")
    public Boolean tilt;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Zoom")
    public Boolean zoom;

    public static StopMoveRequest build(java.util.Map<String, ?> map) throws Exception {
        StopMoveRequest self = new StopMoveRequest();
        return TeaModel.build(map, self);
    }

    public StopMoveRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public StopMoveRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public StopMoveRequest setPan(Boolean pan) {
        this.pan = pan;
        return this;
    }
    public Boolean getPan() {
        return this.pan;
    }

    public StopMoveRequest setTilt(Boolean tilt) {
        this.tilt = tilt;
        return this;
    }
    public Boolean getTilt() {
        return this.tilt;
    }

    public StopMoveRequest setZoom(Boolean zoom) {
        this.zoom = zoom;
        return this;
    }
    public Boolean getZoom() {
        return this.zoom;
    }

}
