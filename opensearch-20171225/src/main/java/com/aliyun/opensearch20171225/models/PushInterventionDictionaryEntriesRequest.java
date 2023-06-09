// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class PushInterventionDictionaryEntriesRequest extends TeaModel {
    @NameInMap("body")
    public java.util.List<java.util.Map<String, ?>> body;

    @NameInMap("dryRun")
    public Boolean dryRun;

    public static PushInterventionDictionaryEntriesRequest build(java.util.Map<String, ?> map) throws Exception {
        PushInterventionDictionaryEntriesRequest self = new PushInterventionDictionaryEntriesRequest();
        return TeaModel.build(map, self);
    }

    public PushInterventionDictionaryEntriesRequest setBody(java.util.List<java.util.Map<String, ?>> body) {
        this.body = body;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getBody() {
        return this.body;
    }

    public PushInterventionDictionaryEntriesRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

}
