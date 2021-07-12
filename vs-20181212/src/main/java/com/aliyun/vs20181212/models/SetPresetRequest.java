// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class SetPresetRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("Id")
    public String id;

    @NameInMap("PresetId")
    public String presetId;

    @NameInMap("SubProtocol")
    public String subProtocol;

    public static SetPresetRequest build(java.util.Map<String, ?> map) throws Exception {
        SetPresetRequest self = new SetPresetRequest();
        return TeaModel.build(map, self);
    }

    public SetPresetRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SetPresetRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public SetPresetRequest setPresetId(String presetId) {
        this.presetId = presetId;
        return this;
    }
    public String getPresetId() {
        return this.presetId;
    }

    public SetPresetRequest setSubProtocol(String subProtocol) {
        this.subProtocol = subProtocol;
        return this;
    }
    public String getSubProtocol() {
        return this.subProtocol;
    }

}
