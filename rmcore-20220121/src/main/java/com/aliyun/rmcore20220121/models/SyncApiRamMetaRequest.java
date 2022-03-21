// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rmcore20220121.models;

import com.aliyun.tea.*;

public class SyncApiRamMetaRequest extends TeaModel {
    @NameInMap("ApiRamMetas")
    public String apiRamMetas;

    public static SyncApiRamMetaRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncApiRamMetaRequest self = new SyncApiRamMetaRequest();
        return TeaModel.build(map, self);
    }

    public SyncApiRamMetaRequest setApiRamMetas(String apiRamMetas) {
        this.apiRamMetas = apiRamMetas;
        return this;
    }
    public String getApiRamMetas() {
        return this.apiRamMetas;
    }

}
