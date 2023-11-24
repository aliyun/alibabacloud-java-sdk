// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class CreateQueryProcessorRequest extends TeaModel {
    /**
     * <p>The request body.</p>
     */
    @NameInMap("body")
    public Object body;

    /**
     * <p>Specifies whether to perform a dry run.</p>
     */
    @NameInMap("dryRun")
    public Boolean dryRun;

    public static CreateQueryProcessorRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateQueryProcessorRequest self = new CreateQueryProcessorRequest();
        return TeaModel.build(map, self);
    }

    public CreateQueryProcessorRequest setBody(Object body) {
        this.body = body;
        return this;
    }
    public Object getBody() {
        return this.body;
    }

    public CreateQueryProcessorRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

}
