// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AddManifestEditTemplateRequest extends TeaModel {
    /**
     * <p>The name of the template. Spaces are allowed.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>add-multilang-tracks</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The video encoding configuration, such as <code>{&quot;Codec&quot;:&quot;H.264&quot;,&quot;Bitrate&quot;:&quot;5000000&quot;}</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Codec&quot;:&quot;H.264&quot;,&quot;Bitrate&quot;:&quot;5000000&quot;}</p>
     */
    @NameInMap("Templates")
    public String templates;

    public static AddManifestEditTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        AddManifestEditTemplateRequest self = new AddManifestEditTemplateRequest();
        return TeaModel.build(map, self);
    }

    public AddManifestEditTemplateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddManifestEditTemplateRequest setTemplates(String templates) {
        this.templates = templates;
        return this;
    }
    public String getTemplates() {
        return this.templates;
    }

}
