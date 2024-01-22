// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class BatchStartApplicationsRequest extends TeaModel {
    /**
     * <p>The returned message.</p>
     * <br>
     * <p>*   **success** is returned when the request succeeds.</p>
     * <p>*   An error code is returned when the request fails.</p>
     */
    @NameInMap("AppIds")
    public String appIds;

    /**
     * <p>The ID of the request.</p>
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
