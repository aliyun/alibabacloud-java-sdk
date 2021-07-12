// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ContinuousAdjustRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("Id")
    public String id;

    @NameInMap("Iris")
    public String iris;

    @NameInMap("Focus")
    public String focus;

    @NameInMap("SubProtocol")
    public String subProtocol;

    public static ContinuousAdjustRequest build(java.util.Map<String, ?> map) throws Exception {
        ContinuousAdjustRequest self = new ContinuousAdjustRequest();
        return TeaModel.build(map, self);
    }

    public ContinuousAdjustRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ContinuousAdjustRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ContinuousAdjustRequest setIris(String iris) {
        this.iris = iris;
        return this;
    }
    public String getIris() {
        return this.iris;
    }

    public ContinuousAdjustRequest setFocus(String focus) {
        this.focus = focus;
        return this;
    }
    public String getFocus() {
        return this.focus;
    }

    public ContinuousAdjustRequest setSubProtocol(String subProtocol) {
        this.subProtocol = subProtocol;
        return this;
    }
    public String getSubProtocol() {
        return this.subProtocol;
    }

}
