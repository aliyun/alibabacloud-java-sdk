// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20251111.models;

import com.aliyun.tea.*;

public class CreateFlashSmsAccessProfileShrinkRequest extends TeaModel {
    /**
     * <p>The access configuration.</p>
     */
    @NameInMap("AccessProfile")
    public String accessProfileShrink;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4f9a8e2b-6c1d-4a7e-9b3f-2d5c8a1e7b04</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The provider ID. Valid values:</p>
     * <ul>
     * <li>Uincall: Beijing Youyin Communication Co., Ltd.</li>
     * <li>ChuangLan: Beijing Chuanglan Yunzhi Information Co., Ltd.</li>
     * <li>ChinaMobile: China Mobile.</li>
     * <li>ShangHaiTianNan: Shanghai Tiannan.</li>
     * <li>HeDao: Galexes.</li>
     * <li>DySms: Alibaba Communication.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Uincall</p>
     */
    @NameInMap("ProviderId")
    public String providerId;

    public static CreateFlashSmsAccessProfileShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFlashSmsAccessProfileShrinkRequest self = new CreateFlashSmsAccessProfileShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateFlashSmsAccessProfileShrinkRequest setAccessProfileShrink(String accessProfileShrink) {
        this.accessProfileShrink = accessProfileShrink;
        return this;
    }
    public String getAccessProfileShrink() {
        return this.accessProfileShrink;
    }

    public CreateFlashSmsAccessProfileShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateFlashSmsAccessProfileShrinkRequest setProviderId(String providerId) {
        this.providerId = providerId;
        return this;
    }
    public String getProviderId() {
        return this.providerId;
    }

}
