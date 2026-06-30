// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribePolarClawSkillDetailRequest extends TeaModel {
    /**
     * <p>The application ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-xxx</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>The Skill identifier.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>alibacloud-rds-copilot</p>
     */
    @NameInMap("Slug")
    public String slug;

    public static DescribePolarClawSkillDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePolarClawSkillDetailRequest self = new DescribePolarClawSkillDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribePolarClawSkillDetailRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public DescribePolarClawSkillDetailRequest setSlug(String slug) {
        this.slug = slug;
        return this;
    }
    public String getSlug() {
        return this.slug;
    }

}
