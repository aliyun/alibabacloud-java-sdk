// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreatePolarClawSkillTemplateRequest extends TeaModel {
    /**
     * <p>The application ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-**************</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>The application type.</p>
     * <blockquote>
     * <p>If you are calling this operation for the first time, you do not need to specify this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>polardb_polarclaw</p>
     */
    @NameInMap("ApplicationType")
    public String applicationType;

    /**
     * <p>The region ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/98041.html">DescribeRegions</a> operation to query all available regions for the current account, including region IDs.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The description of the skill template.</p>
     * 
     * <strong>example:</strong>
     * <p>skill template for test.</p>
     */
    @NameInMap("SkillTemplateDesc")
    public String skillTemplateDesc;

    /**
     * <p>The name of the skill template.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>skill_template_test</p>
     */
    @NameInMap("SkillTemplateName")
    public String skillTemplateName;

    /**
     * <p>The skill template parameters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;skillName\&quot;:\&quot;polarclawhub\&quot;,\&quot;version\&quot;:\&quot;0.0.0\&quot;},{\&quot;skillName\&quot;:\&quot;github\&quot;,\&quot;version\&quot;:\&quot;1.0.0\&quot;}]</p>
     */
    @NameInMap("SkillTemplateParam")
    public String skillTemplateParam;

    public static CreatePolarClawSkillTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePolarClawSkillTemplateRequest self = new CreatePolarClawSkillTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreatePolarClawSkillTemplateRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public CreatePolarClawSkillTemplateRequest setApplicationType(String applicationType) {
        this.applicationType = applicationType;
        return this;
    }
    public String getApplicationType() {
        return this.applicationType;
    }

    public CreatePolarClawSkillTemplateRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreatePolarClawSkillTemplateRequest setSkillTemplateDesc(String skillTemplateDesc) {
        this.skillTemplateDesc = skillTemplateDesc;
        return this;
    }
    public String getSkillTemplateDesc() {
        return this.skillTemplateDesc;
    }

    public CreatePolarClawSkillTemplateRequest setSkillTemplateName(String skillTemplateName) {
        this.skillTemplateName = skillTemplateName;
        return this;
    }
    public String getSkillTemplateName() {
        return this.skillTemplateName;
    }

    public CreatePolarClawSkillTemplateRequest setSkillTemplateParam(String skillTemplateParam) {
        this.skillTemplateParam = skillTemplateParam;
        return this;
    }
    public String getSkillTemplateParam() {
        return this.skillTemplateParam;
    }

}
