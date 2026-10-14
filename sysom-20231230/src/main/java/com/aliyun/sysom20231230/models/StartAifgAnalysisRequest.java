// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class StartAifgAnalysisRequest extends TeaModel {
    /**
     * <p>The channel type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs</p>
     */
    @NameInMap("channel")
    public String channel;

    /**
     * <p>The additional information.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;train_taskid&quot;: &quot;train-92abd24&quot;, &quot;duration&quot;: &quot;10&quot;}</p>
     */
    @NameInMap("params")
    public String params;

    /**
     * <p>The region information.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("region")
    public String region;

    /**
     * <p>The service name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>slowNode</p>
     */
    @NameInMap("serviceName")
    public String serviceName;

    public static StartAifgAnalysisRequest build(java.util.Map<String, ?> map) throws Exception {
        StartAifgAnalysisRequest self = new StartAifgAnalysisRequest();
        return TeaModel.build(map, self);
    }

    public StartAifgAnalysisRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public StartAifgAnalysisRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public StartAifgAnalysisRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public StartAifgAnalysisRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

}
