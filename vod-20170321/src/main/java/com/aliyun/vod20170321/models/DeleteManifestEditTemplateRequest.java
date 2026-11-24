// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteManifestEditTemplateRequest extends TeaModel {
    /**
     * <p>The ID of the ManifestEdit template to be deleted. Only letters, digits, underscores (_), and hyphens (-) are supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>9c6581d59240de5e258ffa4c71a3e01b</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    public static DeleteManifestEditTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteManifestEditTemplateRequest self = new DeleteManifestEditTemplateRequest();
        return TeaModel.build(map, self);
    }

    public DeleteManifestEditTemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
