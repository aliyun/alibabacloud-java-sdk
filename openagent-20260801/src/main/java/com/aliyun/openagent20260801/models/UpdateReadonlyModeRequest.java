// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openagent20260801.models;

import com.aliyun.tea.*;

public class UpdateReadonlyModeRequest extends TeaModel {
    /**
     * <p>Required. Pass the string true to enable read-only mode, or false to disable it. The value is case-insensitive.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("value")
    public String value;

    public static UpdateReadonlyModeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateReadonlyModeRequest self = new UpdateReadonlyModeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateReadonlyModeRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
