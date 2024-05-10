// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetChangeSetRequest extends TeaModel {
    /**
     * <p>The ID of the change set.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ChangeSetId")
    public String changeSetId;

    /**
     * <p>The region ID of the change set. You can call the [DescribeRegions](https://help.aliyun.com/document_detail/131035.html) operation to query the most recent region list.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Specifies whether to obtain the template. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false (default)</p>
     */
    @NameInMap("ShowTemplate")
    public Boolean showTemplate;

    public static GetChangeSetRequest build(java.util.Map<String, ?> map) throws Exception {
        GetChangeSetRequest self = new GetChangeSetRequest();
        return TeaModel.build(map, self);
    }

    public GetChangeSetRequest setChangeSetId(String changeSetId) {
        this.changeSetId = changeSetId;
        return this;
    }
    public String getChangeSetId() {
        return this.changeSetId;
    }

    public GetChangeSetRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetChangeSetRequest setShowTemplate(Boolean showTemplate) {
        this.showTemplate = showTemplate;
        return this;
    }
    public Boolean getShowTemplate() {
        return this.showTemplate;
    }

}
