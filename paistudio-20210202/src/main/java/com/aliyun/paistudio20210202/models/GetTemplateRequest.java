// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class GetTemplateRequest extends TeaModel {
    @NameInMap("Verbose")
    public Boolean verbose;

    public static GetTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTemplateRequest self = new GetTemplateRequest();
        return TeaModel.build(map, self);
    }

    public GetTemplateRequest setVerbose(Boolean verbose) {
        this.verbose = verbose;
        return this;
    }
    public Boolean getVerbose() {
        return this.verbose;
    }

}
