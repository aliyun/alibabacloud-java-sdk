// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class UpdateMetricStoreMeteringModeRequest extends TeaModel {
    /**
     * <p>The billing mode. Default value: ChargeByFunction. Valid values: ChargeByFunction and ChargeByDataIngest.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ChargeByFunction</p>
     */
    @NameInMap("meteringMode")
    public String meteringMode;

    public static UpdateMetricStoreMeteringModeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMetricStoreMeteringModeRequest self = new UpdateMetricStoreMeteringModeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMetricStoreMeteringModeRequest setMeteringMode(String meteringMode) {
        this.meteringMode = meteringMode;
        return this;
    }
    public String getMeteringMode() {
        return this.meteringMode;
    }

}
