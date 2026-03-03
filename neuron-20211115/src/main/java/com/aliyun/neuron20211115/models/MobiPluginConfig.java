// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class MobiPluginConfig extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("content")
    public String content;

    @NameInMap("mappings")
    public java.util.List<AppConfigMapping> mappings;

    public static MobiPluginConfig build(java.util.Map<String, ?> map) throws Exception {
        MobiPluginConfig self = new MobiPluginConfig();
        return TeaModel.build(map, self);
    }

    public MobiPluginConfig setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public MobiPluginConfig setMappings(java.util.List<AppConfigMapping> mappings) {
        this.mappings = mappings;
        return this;
    }
    public java.util.List<AppConfigMapping> getMappings() {
        return this.mappings;
    }

}
