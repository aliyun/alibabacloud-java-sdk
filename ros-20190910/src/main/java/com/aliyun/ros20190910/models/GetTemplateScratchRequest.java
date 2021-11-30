// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetTemplateScratchRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ShowDataOption")
    public String showDataOption;

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
