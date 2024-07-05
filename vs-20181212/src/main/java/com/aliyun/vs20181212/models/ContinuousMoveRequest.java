// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ContinuousMoveRequest extends TeaModel {
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
     * <p>0.5</p>
     */
    @NameInMap("Pan")
    public String pan;

    /**
     * <strong>example:</strong>
     * <p>0.5</p>
     */
    @NameInMap("Tilt")
    public String tilt;

    /**
     * <strong>example:</strong>
     * <p>0.5</p>
     */
    @NameInMap("Zoom")
    public String zoom;

    public static ContinuousMoveRequest build(java.util.Map<String, ?> map) throws Exception {
        ContinuousMoveRequest self = new ContinuousMoveRequest();
        return TeaModel.build(map, self);
    }

    public ContinuousMoveRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ContinuousMoveRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ContinuousMoveRequest setPan(String pan) {
        this.pan = pan;
        return this;
    }
    public String getPan() {
        return this.pan;
    }

    public ContinuousMoveRequest setTilt(String tilt) {
        this.tilt = tilt;
        return this;
    }
    public String getTilt() {
        return this.tilt;
    }

    public ContinuousMoveRequest setZoom(String zoom) {
        this.zoom = zoom;
        return this;
    }
    public String getZoom() {
        return this.zoom;
    }

}
