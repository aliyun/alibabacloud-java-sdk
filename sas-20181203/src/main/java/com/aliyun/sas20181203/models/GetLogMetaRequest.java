// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetLogMetaRequest extends TeaModel {
    @NameInMap("LogStore")
    public String logStore;

    public static GetLogMetaRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLogMetaRequest self = new GetLogMetaRequest();
        return TeaModel.build(map, self);
    }

    public GetLogMetaRequest setLogStore(String logStore) {
        this.logStore = logStore;
        return this;
    }
    public String getLogStore() {
        return this.logStore;
    }

}
