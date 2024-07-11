// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListExecutionRiskyTasksRequest extends TeaModel {
    /**
     * <p>The ID of the region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The name of the template.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>myTemplate</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    public static ListExecutionRiskyTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListExecutionRiskyTasksRequest self = new ListExecutionRiskyTasksRequest();
        return TeaModel.build(map, self);
    }

    public ListExecutionRiskyTasksRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListExecutionRiskyTasksRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

}
