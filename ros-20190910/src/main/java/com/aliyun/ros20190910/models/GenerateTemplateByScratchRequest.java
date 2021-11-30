// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GenerateTemplateByScratchRequest extends TeaModel {
    @NameInMap("ProvisionRegionId")
    public String provisionRegionId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("TemplateScratchId")
    public String templateScratchId;

    public static GenerateTemplateByScratchRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateTemplateByScratchRequest self = new GenerateTemplateByScratchRequest();
        return TeaModel.build(map, self);
    }

    public GenerateTemplateByScratchRequest setProvisionRegionId(String provisionRegionId) {
        this.provisionRegionId = provisionRegionId;
        return this;
    }
    public String getProvisionRegionId() {
        return this.provisionRegionId;
    }

    public GenerateTemplateByScratchRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GenerateTemplateByScratchRequest setTemplateScratchId(String templateScratchId) {
        this.templateScratchId = templateScratchId;
        return this;
    }
    public String getTemplateScratchId() {
        return this.templateScratchId;
    }

}
