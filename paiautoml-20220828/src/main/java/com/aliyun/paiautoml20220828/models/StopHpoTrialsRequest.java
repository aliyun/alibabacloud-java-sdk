// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiautoml20220828.models;

import com.aliyun.tea.*;

public class StopHpoTrialsRequest extends TeaModel {
    @NameInMap("TrialIds")
    public java.util.List<String> trialIds;

    public static StopHpoTrialsRequest build(java.util.Map<String, ?> map) throws Exception {
        StopHpoTrialsRequest self = new StopHpoTrialsRequest();
        return TeaModel.build(map, self);
    }

    public StopHpoTrialsRequest setTrialIds(java.util.List<String> trialIds) {
        this.trialIds = trialIds;
        return this;
    }
    public java.util.List<String> getTrialIds() {
        return this.trialIds;
    }

}
