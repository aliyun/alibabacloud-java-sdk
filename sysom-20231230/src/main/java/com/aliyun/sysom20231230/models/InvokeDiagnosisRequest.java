// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class InvokeDiagnosisRequest extends TeaModel {
    @NameInMap("X-Debug-Id")
    public String xDebugId;

    /**
     * <p>The diagnosis channel (currently fixed to the ECS channel).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs</p>
     */
    @NameInMap("channel")
    public String channel;

    /**
     * <p>The diagnosis parameters. Different diagnosis types require different parameters. Refer to the supplementary request parameter descriptions below for the parameters required by each diagnosis type.</p>
     * <blockquote>
     * <p>Notice: Pass a JSON-formatted string.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;instance&quot;: &quot;i-wz9gdv7qmdhusamc4dl01&quot;,
     *     &quot;uid&quot;: &quot;xxxxxxxxxxxxxx&quot;,
     *     &quot;region&quot;: &quot;cn-shenzhen&quot;
     * }</p>
     */
    @NameInMap("params")
    public String params;

    /**
     * <p>The diagnosis type. This parameter distinguishes between different types of diagnostics.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>memgraph</p>
     */
    @NameInMap("service_name")
    public String serviceName;

    @NameInMap("x-sysom-invoke-source")
    public String xSysomInvokeSource;

    public static InvokeDiagnosisRequest build(java.util.Map<String, ?> map) throws Exception {
        InvokeDiagnosisRequest self = new InvokeDiagnosisRequest();
        return TeaModel.build(map, self);
    }

    public InvokeDiagnosisRequest setXDebugId(String xDebugId) {
        this.xDebugId = xDebugId;
        return this;
    }
    public String getXDebugId() {
        return this.xDebugId;
    }

    public InvokeDiagnosisRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public InvokeDiagnosisRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public InvokeDiagnosisRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public InvokeDiagnosisRequest setXSysomInvokeSource(String xSysomInvokeSource) {
        this.xSysomInvokeSource = xSysomInvokeSource;
        return this;
    }
    public String getXSysomInvokeSource() {
        return this.xSysomInvokeSource;
    }

}
