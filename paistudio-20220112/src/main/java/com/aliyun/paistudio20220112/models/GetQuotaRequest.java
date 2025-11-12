// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class GetQuotaRequest extends TeaModel {
    @NameInMap("Verbose")
    public Boolean verbose;

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
