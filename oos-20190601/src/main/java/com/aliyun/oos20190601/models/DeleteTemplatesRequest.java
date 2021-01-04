// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class DeleteTemplatesRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("TemplateNames")
    public String templateNames;

    @NameInMap("AutoDeleteExecutions")
    public Boolean autoDeleteExecutions;

    public static DeleteTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteTemplatesRequest self = new DeleteTemplatesRequest();
        return TeaModel.build(map, self);
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

    public DeleteTemplatesRequest setAutoDeleteExecutions(Boolean autoDeleteExecutions) {
        this.autoDeleteExecutions = autoDeleteExecutions;
        return this;
    }
    public Boolean getAutoDeleteExecutions() {
        return this.autoDeleteExecutions;
    }

}
