// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class BatchStartApplicationsRequest extends TeaModel {
    /**
     * <p>ebf491f0-c1a5-45e2-b2c4-710dbe2a\*\*\*\*</p>
     */
    @NameInMap("AppIds")
    public String appIds;

    /**
     * <p>cn-shanghai</p>
     */
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
