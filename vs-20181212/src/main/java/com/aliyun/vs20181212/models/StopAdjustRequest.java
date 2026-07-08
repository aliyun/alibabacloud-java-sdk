// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class StopAdjustRequest extends TeaModel {
    /**
     * <p>Stop adjusting the zoom. Default is false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Focus")
    public Boolean focus;

    /**
     * <p>Device ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>348*****380-cn-qingdao</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>Stop adjusting the aperture. Default is false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Iris")
    public Boolean iris;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static StopAdjustRequest build(java.util.Map<String, ?> map) throws Exception {
        StopAdjustRequest self = new StopAdjustRequest();
        return TeaModel.build(map, self);
    }

    public StopAdjustRequest setFocus(Boolean focus) {
        this.focus = focus;
        return this;
    }
    public Boolean getFocus() {
        return this.focus;
    }

    public StopAdjustRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public StopAdjustRequest setIris(Boolean iris) {
        this.iris = iris;
        return this;
    }
    public Boolean getIris() {
        return this.iris;
    }

    public StopAdjustRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
