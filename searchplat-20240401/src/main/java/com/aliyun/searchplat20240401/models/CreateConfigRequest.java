// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class CreateConfigRequest extends TeaModel {
    /**
     * <p>The configuration content.</p>
     */
    @NameInMap("configData")
    public java.util.Map<String, ?> configData;

    /**
     * <p>Specifies whether the request is a dry run.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("dryRun")
    public Boolean dryRun;

    public static CreateConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateConfigRequest self = new CreateConfigRequest();
        return TeaModel.build(map, self);
    }

    public CreateConfigRequest setConfigData(java.util.Map<String, ?> configData) {
        this.configData = configData;
        return this;
    }
    public java.util.Map<String, ?> getConfigData() {
        return this.configData;
    }

    public CreateConfigRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

}
