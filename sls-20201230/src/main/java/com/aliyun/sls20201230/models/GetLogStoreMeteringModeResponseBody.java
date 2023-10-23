// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetLogStoreMeteringModeResponseBody extends TeaModel {
    @NameInMap("meteringMode")
    public String meteringMode;

    public static GetLogStoreMeteringModeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLogStoreMeteringModeResponseBody self = new GetLogStoreMeteringModeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLogStoreMeteringModeResponseBody setMeteringMode(String meteringMode) {
        this.meteringMode = meteringMode;
        return this;
    }
    public String getMeteringMode() {
        return this.meteringMode;
    }

}
