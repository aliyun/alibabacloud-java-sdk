// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class UpdateFetchFieldsRequest extends TeaModel {
    @NameInMap("body")
    public java.util.List<String> body;

    /**
     * <p>true</p>
     */
    @NameInMap("dryRun")
    public Boolean dryRun;

    public static UpdateFetchFieldsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFetchFieldsRequest self = new UpdateFetchFieldsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFetchFieldsRequest setBody(java.util.List<String> body) {
        this.body = body;
        return this;
    }
    public java.util.List<String> getBody() {
        return this.body;
    }

    public UpdateFetchFieldsRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

}
