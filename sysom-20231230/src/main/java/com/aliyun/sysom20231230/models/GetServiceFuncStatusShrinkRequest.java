// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetServiceFuncStatusShrinkRequest extends TeaModel {
    /**
     * <p>The channel name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs</p>
     */
    @NameInMap("channel")
    public String channel;

    /**
     * <p>The diagnostic parameters. Different types of diagnostics require different diagnostic parameters. You can use this field to filter records whose parameters match the specified values.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("params")
    public String paramsShrink;

    /**
     * <p>The service name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>livetrace</p>
     */
    @NameInMap("service_name")
    public String serviceName;

    public static GetServiceFuncStatusShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetServiceFuncStatusShrinkRequest self = new GetServiceFuncStatusShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetServiceFuncStatusShrinkRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public GetServiceFuncStatusShrinkRequest setParamsShrink(String paramsShrink) {
        this.paramsShrink = paramsShrink;
        return this;
    }
    public String getParamsShrink() {
        return this.paramsShrink;
    }

    public GetServiceFuncStatusShrinkRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

}
