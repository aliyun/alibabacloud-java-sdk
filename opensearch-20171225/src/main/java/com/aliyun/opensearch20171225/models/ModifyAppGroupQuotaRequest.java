// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ModifyAppGroupQuotaRequest extends TeaModel {
    /**
     * <p>The request body.</p>
     */
    @NameInMap("body")
    public Quota body;

    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to check the validity of input parameters. Default value: false.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: checks only the validity of input parameters.</li>
     * <li><strong>false</strong>: checks the validity of input parameters and creates an attribution configuration.</li>
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
