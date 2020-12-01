// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class BatchStartApplicationsQuery extends TeaModel {
    @NameInMap("NamespaceId")
    @Validation(required = true)
    public String namespaceId;

    @NameInMap("AppIds")
    @Validation(required = true)
    public String appIds;

    public static BatchStartApplicationsQuery build(java.util.Map<String, ?> map) throws Exception {
        BatchStartApplicationsQuery self = new BatchStartApplicationsQuery();
        return TeaModel.build(map, self);
    }

    public BatchStartApplicationsQuery setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public BatchStartApplicationsQuery setAppIds(String appIds) {
        this.appIds = appIds;
        return this;
    }
    public String getAppIds() {
        return this.appIds;
    }

}
