// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class GetSanityCheckTaskRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Verbose")
    public Boolean verbose;

    public static GetSanityCheckTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSanityCheckTaskRequest self = new GetSanityCheckTaskRequest();
        return TeaModel.build(map, self);
    }

    public GetSanityCheckTaskRequest setVerbose(Boolean verbose) {
        this.verbose = verbose;
        return this;
    }
    public Boolean getVerbose() {
        return this.verbose;
    }

}
