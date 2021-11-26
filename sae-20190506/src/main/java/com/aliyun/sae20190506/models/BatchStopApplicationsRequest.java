// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class BatchStopApplicationsRequest extends TeaModel {
    @NameInMap("AppIds")
    public String appIds;

    @NameInMap("NamespaceId")
    public String namespaceId;

    public static BatchStopApplicationsRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchStopApplicationsRequest self = new BatchStopApplicationsRequest();
        return TeaModel.build(map, self);
    }

    public BatchStopApplicationsRequest setAppIds(String appIds) {
        this.appIds = appIds;
        return this;
    }
    public String getAppIds() {
        return this.appIds;
    }

    public BatchStopApplicationsRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

}
