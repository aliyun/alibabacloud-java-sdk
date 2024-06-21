// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetTemplateScratchRequest extends TeaModel {
    /**
     * <p>The region ID of the scenario.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/131035.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The data display option. Valid values:</p>
     * <ul>
     * <li>Sources: displays only the data of source nodes. This setting takes effect only when TemplateScratchType is set to ArchitectureDetection.</li>
     * <li>Source: displays only the data of the source node. This setting takes effect only when TemplateScratchType is not set to ArchitectureDetection.</li>
     * <li>Provisions: displays only the data of new nodes. This setting takes effect only when TemplateScratchType is not set to ArchitectureDetection.</li>
     * <li>All: displays all data.</li>
     * </ul>
     * <p>For more information about source nodes and new nodes, see <a href="https://help.aliyun.com/document_detail/352074.html">Overview</a>.</p>
     * <blockquote>
     * <p> If you do not specify this parameter, the node data is not displayed.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Source</p>
     */
    @NameInMap("ShowDataOption")
    public String showDataOption;

    /**
     * <p>The ID of the scenario.</p>
     * 
     * <strong>example:</strong>
     * <p>ts-7f7a704cf71c49a6****</p>
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
