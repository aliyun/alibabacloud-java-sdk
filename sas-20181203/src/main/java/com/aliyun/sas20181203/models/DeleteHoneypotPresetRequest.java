// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteHoneypotPresetRequest extends TeaModel {
    @NameInMap("HoneypotPresetId")
    public String honeypotPresetId;

    public static DeleteHoneypotPresetRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteHoneypotPresetRequest self = new DeleteHoneypotPresetRequest();
        return TeaModel.build(map, self);
    }

    public DeleteHoneypotPresetRequest setHoneypotPresetId(String honeypotPresetId) {
        this.honeypotPresetId = honeypotPresetId;
        return this;
    }
    public String getHoneypotPresetId() {
        return this.honeypotPresetId;
    }

}
