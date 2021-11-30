// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class DeleteTemplateScratchRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("TemplateScratchId")
    public String templateScratchId;

    public static DeleteTemplateScratchRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteTemplateScratchRequest self = new DeleteTemplateScratchRequest();
        return TeaModel.build(map, self);
    }

    public DeleteTemplateScratchRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteTemplateScratchRequest setTemplateScratchId(String templateScratchId) {
        this.templateScratchId = templateScratchId;
        return this;
    }
    public String getTemplateScratchId() {
        return this.templateScratchId;
    }

}
