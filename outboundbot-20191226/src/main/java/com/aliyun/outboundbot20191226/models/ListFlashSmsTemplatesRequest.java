// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ListFlashSmsTemplatesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>fe542524-9585-4cc7-be54-c8782ed7f60e</p>
     */
    @NameInMap("ConfigId")
    public String configId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>361c8a53-0e29-42f3-8aa7-c7752d010399</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Uincall</p>
     */
    @NameInMap("ProviderId")
    public String providerId;

    public static ListFlashSmsTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFlashSmsTemplatesRequest self = new ListFlashSmsTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public ListFlashSmsTemplatesRequest setConfigId(String configId) {
        this.configId = configId;
        return this;
    }
    public String getConfigId() {
        return this.configId;
    }

    public ListFlashSmsTemplatesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListFlashSmsTemplatesRequest setProviderId(String providerId) {
        this.providerId = providerId;
        return this;
    }
    public String getProviderId() {
        return this.providerId;
    }

}
