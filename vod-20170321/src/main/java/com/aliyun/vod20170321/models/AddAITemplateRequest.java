// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AddAITemplateRequest extends TeaModel {
    /**
     * <p>The detailed configurations of the AI template. The value must be a JSON string. For more information, see <a href="~~89863#title-vd3-499-o36~~">AITemplateConfig</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;AuditItem&quot;:[&quot;terrorism&quot;,&quot;porn&quot;],&quot;AuditRange&quot;:[&quot;image-cover&quot;,&quot;text-title&quot;,&quot;video&quot;],&quot;AuditContent&quot;:[&quot;screen&quot;],&quot;AuditAutoBlock&quot;:&quot;yes&quot;}</p>
     */
    @NameInMap("TemplateConfig")
    public String templateConfig;

    /**
     * <p>The name of the AI template. The name can be up to 128 bytes in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AI-media-test</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <p>The type of the AI template. Valid values:</p>
     * <ul>
     * <li><strong>AIMediaAudit</strong>: automated review</li>
     * <li><strong>AIImage</strong>: smart thumbnail</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AIMediaAudit</p>
     */
    @NameInMap("TemplateType")
    public String templateType;

    public static AddAITemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        AddAITemplateRequest self = new AddAITemplateRequest();
        return TeaModel.build(map, self);
    }

    public AddAITemplateRequest setTemplateConfig(String templateConfig) {
        this.templateConfig = templateConfig;
        return this;
    }
    public String getTemplateConfig() {
        return this.templateConfig;
    }

    public AddAITemplateRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public AddAITemplateRequest setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

}
