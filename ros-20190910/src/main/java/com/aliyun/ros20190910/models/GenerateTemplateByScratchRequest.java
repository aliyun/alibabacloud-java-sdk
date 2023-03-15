// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GenerateTemplateByScratchRequest extends TeaModel {
    /**
     * <p>The ID of the region to which the new node belongs.</p>
     */
    @NameInMap("ProvisionRegionId")
    public String provisionRegionId;

    /**
     * <p>The ID of the region in which the scenario is created.</p>
     * <br>
     * <p>You can call the [DescribeRegions](~~131035~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the scenario.</p>
     * <br>
     * <p>For more information about how to query the IDs of scenarios, see [ListTemplateScratches](~~363050~~).</p>
     */
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
