// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class BatchStartApplicationsRequest extends TeaModel {
    @NameInMap("AppIds")
    public String appIds;

    @NameInMap("NamespaceId")
    public String namespaceId;

    public static BatchStartApplicationsRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchStartApplicationsRequest self = new BatchStartApplicationsRequest();
        return TeaModel.build(map, self);
    }

    public BatchStartApplicationsRequest setAppIds(String appIds) {
        this.appIds = appIds;
        return this;
    }
    public String getAppIds() {
        return this.appIds;
    }

    public BatchStartApplicationsRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

}
