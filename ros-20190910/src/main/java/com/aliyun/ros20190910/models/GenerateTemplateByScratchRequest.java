// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GenerateTemplateByScratchRequest extends TeaModel {
    /**
     * <p>The region ID of the new node.</p>
     */
    @NameInMap("ProvisionRegionId")
    public String provisionRegionId;

    /**
     * <p>The region ID of the scenario.</p>
     * <br>
     * <p>You can call the [DescribeRegions](https://help.aliyun.com/document_detail/131035.html) operation to query the most recent region list.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the scenario.</p>
     * <br>
     * <p>For more information about how to query the IDs of scenarios, see [ListTemplateScratches](https://help.aliyun.com/document_detail/363050.html).</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TemplateScratchId")
    public String templateScratchId;

    /**
     * <p>The type of the template that Resource Orchestration Service (ROS) generates. ROS can generate templates of the ROS and Terraform types. Default value: ROS.</p>
     */
    @NameInMap("TemplateType")
    public String templateType;

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

    public GenerateTemplateByScratchRequest setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

}
