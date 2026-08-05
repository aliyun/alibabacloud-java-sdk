// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class CreateCredentialsRequest extends TeaModel {
    /**
     * <p>The credential type. Valid types:</p>
     * <ul>
     * <li>api-token</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>api-token</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <p>Specifies whether to only validate the request parameters. Default value: false.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Only validates the request parameters.</p>
     * </li>
     * <li><p><strong>false</strong>: Validates the request parameters and creates the attribution configuration.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("dryRun")
    public Boolean dryRun;

    public static CreateCredentialsRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCredentialsRequest self = new CreateCredentialsRequest();
        return TeaModel.build(map, self);
    }

    public CreateCredentialsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateCredentialsRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

}
