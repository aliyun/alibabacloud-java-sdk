// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class UpdateConfigRequest extends TeaModel {
    /**
     * <p>The configuration content.</p>
     */
    @NameInMap("configData")
    public java.util.Map<String, ?> configData;

    /**
     * <p>Specifies whether this is a dry run request.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("dryRun")
    public Boolean dryRun;

    public static UpdateConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateConfigRequest self = new UpdateConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateConfigRequest setConfigData(java.util.Map<String, ?> configData) {
        this.configData = configData;
        return this;
    }
    public java.util.Map<String, ?> getConfigData() {
        return this.configData;
    }

    public UpdateConfigRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

}
