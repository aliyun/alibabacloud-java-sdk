// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class InvokeDiagnosisRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cloud_assist</p>
     */
    @NameInMap("channel")
    public String channel;

    /**
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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>memgraph</p>
     */
    @NameInMap("service_name")
    public String serviceName;

    public static InvokeDiagnosisRequest build(java.util.Map<String, ?> map) throws Exception {
        InvokeDiagnosisRequest self = new InvokeDiagnosisRequest();
        return TeaModel.build(map, self);
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

}
