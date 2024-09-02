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
     * <p>Specifies whether to verify the application before modification. Valid values: true and false.</p>
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

    public ModifyAppGroupQuotaRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

}
