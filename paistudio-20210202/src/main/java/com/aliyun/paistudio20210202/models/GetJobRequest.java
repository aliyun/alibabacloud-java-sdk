// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class GetJobRequest extends TeaModel {
    @NameInMap("Verbose")
    public Boolean verbose;

    public static GetJobRequest build(java.util.Map<String, ?> map) throws Exception {
        GetJobRequest self = new GetJobRequest();
        return TeaModel.build(map, self);
    }

    public GetJobRequest setVerbose(Boolean verbose) {
        this.verbose = verbose;
        return this;
    }
    public Boolean getVerbose() {
        return this.verbose;
    }

}
