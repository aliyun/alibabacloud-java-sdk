// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListExecutionRiskyTasksRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

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
