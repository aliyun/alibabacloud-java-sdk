// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ModifyAppGroupQuotaRequest extends TeaModel {
    /**
     * <p>The request body.</p>
     */
    @NameInMap("body")
    public Quota body;

    /**
     * <p>A client token that is used to ensure the idempotence of the request. The client generates this value to make sure that it is unique among different requests. The value can be up to 64 ASCII characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>74db41d8cd3c784209093aa76afbe89e</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform a dry run. Default value: false.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Validates the request parameters without creating the attribution configuration.</p>
     * </li>
     * <li><p><strong>false</strong>: Validates the request parameters and creates the attribution configuration.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("dryRun")
    public Boolean dryRun;

    public static ModifyAppGroupQuotaRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAppGroupQuotaRequest self = new ModifyAppGroupQuotaRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAppGroupQuotaRequest setBody(Quota body) {
        this.body = body;
        return this;
    }
    public Quota getBody() {
        return this.body;
    }

    public ModifyAppGroupQuotaRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyAppGroupQuotaRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

}
