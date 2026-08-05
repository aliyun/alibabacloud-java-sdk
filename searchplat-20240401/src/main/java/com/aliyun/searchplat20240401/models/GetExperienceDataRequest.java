// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class GetExperienceDataRequest extends TeaModel {
    /**
     * <p>Specifies whether to validate the request parameters without performing the actual operation. Default value: false.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong></p>
     * </li>
     * <li><p><strong>false</strong>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("dryRun")
    public Boolean dryRun;

    public static GetExperienceDataRequest build(java.util.Map<String, ?> map) throws Exception {
        GetExperienceDataRequest self = new GetExperienceDataRequest();
        return TeaModel.build(map, self);
    }

    public GetExperienceDataRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

}
