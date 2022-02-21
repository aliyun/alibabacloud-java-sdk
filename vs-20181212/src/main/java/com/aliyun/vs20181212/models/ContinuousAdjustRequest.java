// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ContinuousAdjustRequest extends TeaModel {
    @NameInMap("Focus")
    public String focus;

    @NameInMap("Id")
    public String id;

    @NameInMap("Iris")
    public String iris;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static ContinuousAdjustRequest build(java.util.Map<String, ?> map) throws Exception {
        ContinuousAdjustRequest self = new ContinuousAdjustRequest();
        return TeaModel.build(map, self);
    }

    public ContinuousAdjustRequest setFocus(String focus) {
        this.focus = focus;
        return this;
    }
    public String getFocus() {
        return this.focus;
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

    public ContinuousAdjustRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
