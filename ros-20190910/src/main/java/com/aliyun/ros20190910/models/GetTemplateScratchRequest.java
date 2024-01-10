// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetTemplateScratchRequest extends TeaModel {
    /**
     * <p>The region ID of the scenario.</p>
     * <br>
     * <p>You can call the [DescribeRegions](~~131035~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The data display option. Valid values:</p>
     * <br>
     * <p>*   Sources: displays only the data of source nodes. This setting takes effect only when TemplateScratchType is set to ArchitectureDetection.</p>
     * <p>*   Source: displays only the data of the source node. This setting takes effect only when TemplateScratchType is not set to ArchitectureDetection.</p>
     * <p>*   Provisions: displays only the data of new nodes. This setting takes effect only when TemplateScratchType is not set to ArchitectureDetection.</p>
     * <p>*   All: displays all data.</p>
     * <br>
     * <p>For more information about source nodes and new nodes, see [Overview](~~352074~~).</p>
     * <br>
     * <p>>  If you do not specify this parameter, the node data is not displayed.</p>
     */
    @NameInMap("ShowDataOption")
    public String showDataOption;

    /**
     * <p>The ID of the scenario.</p>
     */
    @NameInMap("TemplateScratchId")
    public String templateScratchId;

    public static GetTemplateScratchRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTemplateScratchRequest self = new GetTemplateScratchRequest();
        return TeaModel.build(map, self);
    }

    public GetTemplateScratchRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetTemplateScratchRequest setShowDataOption(String showDataOption) {
        this.showDataOption = showDataOption;
        return this;
    }
    public String getShowDataOption() {
        return this.showDataOption;
    }

    public GetTemplateScratchRequest setTemplateScratchId(String templateScratchId) {
        this.templateScratchId = templateScratchId;
        return this;
    }
    public String getTemplateScratchId() {
        return this.templateScratchId;
    }

}
