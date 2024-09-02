// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class PushInterventionDictionaryEntriesRequest extends TeaModel {
    /**
     * <p>The request body.</p>
     */
    @NameInMap("body")
    public java.util.List<java.util.Map<String, ?>> body;

    /**
     * <p>Specifies whether to check the validity of input parameters. Default value: false.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: checks only the validity of input parameters.</li>
     * <li><strong>false</strong>: checks the validity of input parameters and creates an attribution configuration.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
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
