// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class PauseClientRequest extends TeaModel {
    /**
     * <p>The UUIDs of servers for which you want to enable or disable the Security Center agent.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>uuid-1211-sadsd-2131</p>
     */
    @NameInMap("Uuids")
    public String uuids;

    /**
     * <p>The status of the Security Center agent. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: disabled</li>
     * <li><strong>1</strong>: enabled</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Value")
    public String value;

    public static PauseClientRequest build(java.util.Map<String, ?> map) throws Exception {
        PauseClientRequest self = new PauseClientRequest();
        return TeaModel.build(map, self);
    }

    public PauseClientRequest setUuids(String uuids) {
        this.uuids = uuids;
        return this;
    }
    public String getUuids() {
        return this.uuids;
    }

    public PauseClientRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
