// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class UpdateLogStoreMeteringModeRequest extends TeaModel {
    /**
     * <p>The billing mode. Valid values: ChargeByFunction and ChargeByDataIngest. Default value: ChargeByFunction. The value ChargeByFunction specifies the pay-by-feature billing mode. The value ChargeByDataIngest specifies the pay-by-ingested-data billing mode.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ChargeByFunction</p>
     */
    @NameInMap("meteringMode")
    public String meteringMode;

    public static UpdateLogStoreMeteringModeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLogStoreMeteringModeRequest self = new UpdateLogStoreMeteringModeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLogStoreMeteringModeRequest setMeteringMode(String meteringMode) {
        this.meteringMode = meteringMode;
        return this;
    }
    public String getMeteringMode() {
        return this.meteringMode;
    }

}
