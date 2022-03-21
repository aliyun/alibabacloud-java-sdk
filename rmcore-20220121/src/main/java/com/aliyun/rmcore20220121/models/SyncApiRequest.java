// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rmcore20220121.models;

import com.aliyun.tea.*;

public class SyncApiRequest extends TeaModel {
    @NameInMap("ApiDefinitions")
    public String apiDefinitions;

    public static SyncApiRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncApiRequest self = new SyncApiRequest();
        return TeaModel.build(map, self);
    }

    public SyncApiRequest setApiDefinitions(String apiDefinitions) {
        this.apiDefinitions = apiDefinitions;
        return this;
    }
    public String getApiDefinitions() {
        return this.apiDefinitions;
    }

}
