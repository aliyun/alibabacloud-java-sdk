// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class StopMoveRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("Id")
    public String id;

    @NameInMap("Pan")
    public Boolean pan;

    @NameInMap("Tilt")
    public Boolean tilt;

    @NameInMap("Zoom")
    public Boolean zoom;

    @NameInMap("SubProtocol")
    public String subProtocol;

    public static StopMoveRequest build(java.util.Map<String, ?> map) throws Exception {
        StopMoveRequest self = new StopMoveRequest();
        return TeaModel.build(map, self);
    }

    public StopMoveRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public StopMoveRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
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

    public StopMoveRequest setSubProtocol(String subProtocol) {
        this.subProtocol = subProtocol;
        return this;
    }
    public String getSubProtocol() {
        return this.subProtocol;
    }

}
