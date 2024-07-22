// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class DescribeTTSConfigRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dc437bba-5a25-4bbc-b4c2-f268864bebb5</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>1971226538081821</p>
     */
    @NameInMap("InstanceOwnerId")
    public Long instanceOwnerId;

    public static DescribeTTSConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTTSConfigRequest self = new DescribeTTSConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTTSConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeTTSConfigRequest setInstanceOwnerId(Long instanceOwnerId) {
        this.instanceOwnerId = instanceOwnerId;
        return this;
    }
    public Long getInstanceOwnerId() {
        return this.instanceOwnerId;
    }

}
