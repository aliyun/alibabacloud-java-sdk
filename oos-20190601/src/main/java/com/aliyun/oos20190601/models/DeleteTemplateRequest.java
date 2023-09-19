// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class DeleteTemplateRequest extends TeaModel {
    /**
     * <p>Specifies whether to delete the related executions when a template is deleted.</p>
     */
    @NameInMap("AutoDeleteExecutions")
    public Boolean autoDeleteExecutions;

    /**
     * <p>The region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The name of the template. The name can be 1 to 200 characters in length and can contain letters, digits, hyphens (-), and underscores (\_). It cannot start with ALIYUN, ACS, ALIBABA, or ALICLOUD.</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    public static DeleteTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteTemplateRequest self = new DeleteTemplateRequest();
        return TeaModel.build(map, self);
    }

    public DeleteTemplateRequest setAutoDeleteExecutions(Boolean autoDeleteExecutions) {
        this.autoDeleteExecutions = autoDeleteExecutions;
        return this;
    }
    public Boolean getAutoDeleteExecutions() {
        return this.autoDeleteExecutions;
    }

    public DeleteTemplateRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteTemplateRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

}
