// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class DeleteCallCenterProviderRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>36e9a4cd-a821-4f78-86fa-a9a4aefeea2e</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>xxxxxxxxx</p>
     */
    @NameInMap("ProviderId")
    public String providerId;

    public static DeleteCallCenterProviderRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCallCenterProviderRequest self = new DeleteCallCenterProviderRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCallCenterProviderRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteCallCenterProviderRequest setProviderId(String providerId) {
        this.providerId = providerId;
        return this;
    }
    public String getProviderId() {
        return this.providerId;
    }

}
