// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class GetTrainingJobLatestMetricsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>loss</p>
     */
    @NameInMap("Names")
    public String names;

    public static GetTrainingJobLatestMetricsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTrainingJobLatestMetricsRequest self = new GetTrainingJobLatestMetricsRequest();
        return TeaModel.build(map, self);
    }

    public GetTrainingJobLatestMetricsRequest setNames(String names) {
        this.names = names;
        return this;
    }
    public String getNames() {
        return this.names;
    }

}
