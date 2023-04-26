// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UpdateVodTemplateRequest extends TeaModel {
    /**
     * <p>The name of the template.</p>
     * <br>
     * <p>*   The name can be up to 128 bytes in length.</p>
     * <p>*   The value must be encoded in UTF-8.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>Modifies a snapshot template.</p>
     */
    @NameInMap("TemplateConfig")
    public String templateConfig;

    /**
     * <p>The operation that you want to perform. Set the value to **UpdateVodTemplate**.</p>
     */
    @NameInMap("VodTemplateId")
    public String vodTemplateId;

    public static UpdateVodTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateVodTemplateRequest self = new UpdateVodTemplateRequest();
        return TeaModel.build(map, self);
    }

    public UpdateVodTemplateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateVodTemplateRequest setTemplateConfig(String templateConfig) {
        this.templateConfig = templateConfig;
        return this;
    }
    public String getTemplateConfig() {
        return this.templateConfig;
    }

    public UpdateVodTemplateRequest setVodTemplateId(String vodTemplateId) {
        this.vodTemplateId = vodTemplateId;
        return this;
    }
    public String getVodTemplateId() {
        return this.vodTemplateId;
    }

}
