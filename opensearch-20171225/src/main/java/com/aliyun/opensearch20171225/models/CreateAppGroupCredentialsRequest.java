// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class CreateAppGroupCredentialsRequest extends TeaModel {
    /**
     * <p>The credential type, such as \<code>api-key\\</code>, \<code>account\\</code>, \<code>invoke-key\\</code>, or \<code>api-token\\</code>. To create an API key, set this parameter to \<code>api-token\\</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>api-token</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <p>Specifies whether to perform a dry run. In a dry run, the system checks the request parameters but does not execute the operation.</p>
     */
    @NameInMap("dryRun")
    public Boolean dryRun;

    public static CreateAppGroupCredentialsRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAppGroupCredentialsRequest self = new CreateAppGroupCredentialsRequest();
        return TeaModel.build(map, self);
    }

    public CreateAppGroupCredentialsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateAppGroupCredentialsRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

}
