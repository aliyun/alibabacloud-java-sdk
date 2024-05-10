// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetMetricStoreMeteringModeResponseBody extends TeaModel {
    @NameInMap("meteringMode")
    public String meteringMode;

    public static GetMetricStoreMeteringModeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMetricStoreMeteringModeResponseBody self = new GetMetricStoreMeteringModeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMetricStoreMeteringModeResponseBody setMeteringMode(String meteringMode) {
        this.meteringMode = meteringMode;
        return this;
    }
    public String getMeteringMode() {
        return this.meteringMode;
    }

}
