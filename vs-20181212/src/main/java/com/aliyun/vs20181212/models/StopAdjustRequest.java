// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class StopAdjustRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("Id")
    public String id;

    @NameInMap("Iris")
    public Boolean iris;

    @NameInMap("Focus")
    public Boolean focus;

    @NameInMap("SubProtocol")
    public String subProtocol;

    public static StopAdjustRequest build(java.util.Map<String, ?> map) throws Exception {
        StopAdjustRequest self = new StopAdjustRequest();
        return TeaModel.build(map, self);
    }

    public StopAdjustRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
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

    public StopAdjustRequest setFocus(Boolean focus) {
        this.focus = focus;
        return this;
    }
    public Boolean getFocus() {
        return this.focus;
    }

    public StopAdjustRequest setSubProtocol(String subProtocol) {
        this.subProtocol = subProtocol;
        return this;
    }
    public String getSubProtocol() {
        return this.subProtocol;
    }

}
