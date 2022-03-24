// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.serverless20210924.models;

import com.aliyun.tea.*;

public class ListEnvironmentRevisionsRequest extends TeaModel {
    // The name of an environment.
    @NameInMap("environmentName")
    public String environmentName;

    public static ListEnvironmentRevisionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEnvironmentRevisionsRequest self = new ListEnvironmentRevisionsRequest();
        return TeaModel.build(map, self);
    }

    public ListEnvironmentRevisionsRequest setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
        return this;
    }
    public String getEnvironmentName() {
        return this.environmentName;
    }

}
