// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiflow20210202.models;

import com.aliyun.tea.*;

public class GetRunRequest extends TeaModel {
    // 是否返回详细信息，目前详细信息包含： RuntimeManifest
    @NameInMap("Verbose")
    public Boolean verbose;

    public static GetRunRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRunRequest self = new GetRunRequest();
        return TeaModel.build(map, self);
    }

    public GetRunRequest setVerbose(Boolean verbose) {
        this.verbose = verbose;
        return this;
    }
    public Boolean getVerbose() {
        return this.verbose;
    }

}
