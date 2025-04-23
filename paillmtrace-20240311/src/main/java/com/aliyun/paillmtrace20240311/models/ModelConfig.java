// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paillmtrace20240311.models;

import com.aliyun.tea.*;

public class ModelConfig extends TeaModel {
    @NameInMap("ApiKey")
    public String apiKey;

    @NameInMap("Endpoint")
    public String endpoint;

    @NameInMap("IsSelfHost")
    public Boolean isSelfHost;

    @NameInMap("Name")
    public String name;

    @NameInMap("Temperature")
    public Float temperature;

    @NameInMap("TopP")
    public Float topP;

    @NameInMap("UseFunctionCall")
    public Boolean useFunctionCall;

    public static ModelConfig build(java.util.Map<String, ?> map) throws Exception {
        ModelConfig self = new ModelConfig();
        return TeaModel.build(map, self);
    }

    public ModelConfig setApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    public String getApiKey() {
        return this.apiKey;
    }

    public ModelConfig setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public ModelConfig setIsSelfHost(Boolean isSelfHost) {
        this.isSelfHost = isSelfHost;
        return this;
    }
    public Boolean getIsSelfHost() {
        return this.isSelfHost;
    }

    public ModelConfig setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModelConfig setTemperature(Float temperature) {
        this.temperature = temperature;
        return this;
    }
    public Float getTemperature() {
        return this.temperature;
    }

    public ModelConfig setTopP(Float topP) {
        this.topP = topP;
        return this;
    }
    public Float getTopP() {
        return this.topP;
    }

    public ModelConfig setUseFunctionCall(Boolean useFunctionCall) {
        this.useFunctionCall = useFunctionCall;
        return this;
    }
    public Boolean getUseFunctionCall() {
        return this.useFunctionCall;
    }

}
