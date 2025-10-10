// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class BatchRestartApplicationsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>00893b3a-0e24-45ed-be0c-1f20e07b****</p>
     */
    @NameInMap("AppIds")
    public String appIds;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    public static BatchRestartApplicationsRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchRestartApplicationsRequest self = new BatchRestartApplicationsRequest();
        return TeaModel.build(map, self);
    }

    public BatchRestartApplicationsRequest setAppIds(String appIds) {
        this.appIds = appIds;
        return this;
    }
    public String getAppIds() {
        return this.appIds;
    }

    public BatchRestartApplicationsRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

}
