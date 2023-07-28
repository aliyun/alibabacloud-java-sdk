// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class DeleteTemplatesRequest extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("AutoDeleteExecutions")
    public Boolean autoDeleteExecutions;

    /**
     * <p>The name list of templates to be deleted.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Specifies whether to delete the related executions when a template is deleted.</p>
     */
    @NameInMap("TemplateNames")
    public String templateNames;

    public static DeleteTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteTemplatesRequest self = new DeleteTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteTemplatesRequest setAutoDeleteExecutions(Boolean autoDeleteExecutions) {
        this.autoDeleteExecutions = autoDeleteExecutions;
        return this;
    }
    public Boolean getAutoDeleteExecutions() {
        return this.autoDeleteExecutions;
    }

    public DeleteTemplatesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteTemplatesRequest setTemplateNames(String templateNames) {
        this.templateNames = templateNames;
        return this;
    }
    public String getTemplateNames() {
        return this.templateNames;
    }

}
