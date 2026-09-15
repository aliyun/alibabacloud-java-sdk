// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateClientAlertModeRequest extends TeaModel {
    /**
     * <p>The protection mode. Valid values:</p>
     * <ul>
     * <li><strong>strict</strong>: Strict mode. Defense mode has a risk of false positives. Use Defense mode during critical event protection periods.</li>
     * <li><strong>balance</strong>: Balanced mode. Defense mode detects more suspicious risks while reducing false positives.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>balance</p>
     */
    @NameInMap("Mode")
    public String mode;

    /**
     * <p>The list of server UUIDs.</p>
     */
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
