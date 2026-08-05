// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class UpdateCredentialsRequest extends TeaModel {
    /**
     * <p>Specifies whether the credential is enabled. Valid values:</p>
     * <ul>
     * <li>true: Enabled.</li>
     * <li>false: Disabled.</li>
     * </ul>
     */
    @NameInMap("enabled")
    public Boolean enabled;

    /**
     * <p>Specifies whether to perform a dry run.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("dryRun")
    public Boolean dryRun;

    public static UpdateCredentialsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCredentialsRequest self = new UpdateCredentialsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCredentialsRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public UpdateCredentialsRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

}
