// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class GetDeploymentsByNameRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ignoreJobSummary")
    public Boolean ignoreJobSummary;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ignoreResourceSetting")
    public Boolean ignoreResourceSetting;

    public static GetDeploymentsByNameRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDeploymentsByNameRequest self = new GetDeploymentsByNameRequest();
        return TeaModel.build(map, self);
    }

    public GetDeploymentsByNameRequest setIgnoreJobSummary(Boolean ignoreJobSummary) {
        this.ignoreJobSummary = ignoreJobSummary;
        return this;
    }
    public Boolean getIgnoreJobSummary() {
        return this.ignoreJobSummary;
    }

    public GetDeploymentsByNameRequest setIgnoreResourceSetting(Boolean ignoreResourceSetting) {
        this.ignoreResourceSetting = ignoreResourceSetting;
        return this;
    }
    public Boolean getIgnoreResourceSetting() {
        return this.ignoreResourceSetting;
    }

}
