// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeleteDataProcessJobTemplateRequest extends TeaModel {
    /**
     * <p>The ID of the region where the template is located.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the task template to delete.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tpl-123456</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    public static DeleteDataProcessJobTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataProcessJobTemplateRequest self = new DeleteDataProcessJobTemplateRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDataProcessJobTemplateRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteDataProcessJobTemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
