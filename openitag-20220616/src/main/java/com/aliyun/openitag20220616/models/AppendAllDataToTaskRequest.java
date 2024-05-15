// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openitag20220616.models;

import com.aliyun.tea.*;

public class AppendAllDataToTaskRequest extends TeaModel {
    @NameInMap("body")
    public OpenDatasetProxyAppendDataRequest body;

    public static AppendAllDataToTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        AppendAllDataToTaskRequest self = new AppendAllDataToTaskRequest();
        return TeaModel.build(map, self);
    }

    public AppendAllDataToTaskRequest setBody(OpenDatasetProxyAppendDataRequest body) {
        this.body = body;
        return this;
    }
    public OpenDatasetProxyAppendDataRequest getBody() {
        return this.body;
    }

}
