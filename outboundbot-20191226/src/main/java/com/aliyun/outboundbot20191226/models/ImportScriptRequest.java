// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ImportScriptRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("NluEngine")
    public String nluEngine;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SignatureUrl")
    public String signatureUrl;

    public static ImportScriptRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportScriptRequest self = new ImportScriptRequest();
        return TeaModel.build(map, self);
    }

    public ImportScriptRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ImportScriptRequest setNluEngine(String nluEngine) {
        this.nluEngine = nluEngine;
        return this;
    }
    public String getNluEngine() {
        return this.nluEngine;
    }

    public ImportScriptRequest setSignatureUrl(String signatureUrl) {
        this.signatureUrl = signatureUrl;
        return this;
    }
    public String getSignatureUrl() {
        return this.signatureUrl;
    }

}
