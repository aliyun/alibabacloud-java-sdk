// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class GetQuotaRequest extends TeaModel {
    /**
     * <p>Specifies whether to display detailed information.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Verbose")
    public Boolean verbose;

    /**
     * <p>Specifies whether to return the node metadata bound to the quota.</p>
     */
    @NameInMap("WithNodeMeta")
    public Boolean withNodeMeta;

    public static GetQuotaRequest build(java.util.Map<String, ?> map) throws Exception {
        GetQuotaRequest self = new GetQuotaRequest();
        return TeaModel.build(map, self);
    }

    public GetQuotaRequest setVerbose(Boolean verbose) {
        this.verbose = verbose;
        return this;
    }
    public Boolean getVerbose() {
        return this.verbose;
    }

    public GetQuotaRequest setWithNodeMeta(Boolean withNodeMeta) {
        this.withNodeMeta = withNodeMeta;
        return this;
    }
    public Boolean getWithNodeMeta() {
        return this.withNodeMeta;
    }

}
