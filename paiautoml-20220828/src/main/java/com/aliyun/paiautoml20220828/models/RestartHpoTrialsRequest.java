// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiautoml20220828.models;

import com.aliyun.tea.*;

public class RestartHpoTrialsRequest extends TeaModel {
    @NameInMap("TrialHyperParameters")
    public String trialHyperParameters;

    @NameInMap("TrialIds")
    public java.util.List<String> trialIds;

    public static RestartHpoTrialsRequest build(java.util.Map<String, ?> map) throws Exception {
        RestartHpoTrialsRequest self = new RestartHpoTrialsRequest();
        return TeaModel.build(map, self);
    }

    public RestartHpoTrialsRequest setTrialHyperParameters(String trialHyperParameters) {
        this.trialHyperParameters = trialHyperParameters;
        return this;
    }
    public String getTrialHyperParameters() {
        return this.trialHyperParameters;
    }

    public RestartHpoTrialsRequest setTrialIds(java.util.List<String> trialIds) {
        this.trialIds = trialIds;
        return this;
    }
    public java.util.List<String> getTrialIds() {
        return this.trialIds;
    }

}
