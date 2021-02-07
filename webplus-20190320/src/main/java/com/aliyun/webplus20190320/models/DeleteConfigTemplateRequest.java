// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class DeleteConfigTemplateRequest extends TeaModel {
    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("RegionId")
    public String regionId;

    public static DeleteConfigTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteConfigTemplateRequest self = new DeleteConfigTemplateRequest();
        return TeaModel.build(map, self);
    }

    public DeleteConfigTemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public DeleteConfigTemplateRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
