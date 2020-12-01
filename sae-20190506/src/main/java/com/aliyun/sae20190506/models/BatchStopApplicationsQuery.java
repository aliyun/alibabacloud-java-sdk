// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class BatchStopApplicationsQuery extends TeaModel {
    @NameInMap("NamespaceId")
    @Validation(required = true)
    public String namespaceId;

    @NameInMap("AppIds")
    public String appIds;

    public static BatchStopApplicationsQuery build(java.util.Map<String, ?> map) throws Exception {
        BatchStopApplicationsQuery self = new BatchStopApplicationsQuery();
        return TeaModel.build(map, self);
    }

    public BatchStopApplicationsQuery setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public BatchStopApplicationsQuery setAppIds(String appIds) {
        this.appIds = appIds;
        return this;
    }
    public String getAppIds() {
        return this.appIds;
    }

}
