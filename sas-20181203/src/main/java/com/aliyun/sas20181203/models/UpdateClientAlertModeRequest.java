// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateClientAlertModeRequest extends TeaModel {
    @NameInMap("Mode")
    public String mode;

    @NameInMap("Uuids")
    public java.util.List<String> uuids;

    public static UpdateClientAlertModeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateClientAlertModeRequest self = new UpdateClientAlertModeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateClientAlertModeRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public UpdateClientAlertModeRequest setUuids(java.util.List<String> uuids) {
        this.uuids = uuids;
        return this;
    }
    public java.util.List<String> getUuids() {
        return this.uuids;
    }

}
