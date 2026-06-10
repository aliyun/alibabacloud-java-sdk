// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ImportScriptRequest extends TeaModel {
    /**
     * <p>Instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>00b37342-e759-4fe5-b296-aef775933af0</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>NLU engine. Applies only to Large Language Model (LLM) scenarios.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>Prompts: LLM scenario.</p>
     * </li>
     * <li><p>Empty: Non-LLM scenario.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Prompts</p>
     */
    @NameInMap("NluEngine")
    public String nluEngine;

    /**
     * <p>URL of the scenario JSON file to import.</p>
     * <blockquote>
     * <p>This value is the Folder parameter returned by the GetJobDataUploadParams operation.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>UPLOADED/SCRIPT/136a055e-***-46c6-853a-731b3a2973de/18dc6d79-338f-413c-a5a8-dcce5f05b41a_9bd7916d-a340-4925-a911-92390cbe0f33.json</p>
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
