// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribePolarClawSkillTemplateResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CDB3258F-B5DE-43C4-8935-CBA0CA******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The skill template group.</p>
     */
    @NameInMap("SkillTemplates")
    public java.util.List<DescribePolarClawSkillTemplateResponseBodySkillTemplates> skillTemplates;

    public static DescribePolarClawSkillTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePolarClawSkillTemplateResponseBody self = new DescribePolarClawSkillTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePolarClawSkillTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePolarClawSkillTemplateResponseBody setSkillTemplates(java.util.List<DescribePolarClawSkillTemplateResponseBodySkillTemplates> skillTemplates) {
        this.skillTemplates = skillTemplates;
        return this;
    }
    public java.util.List<DescribePolarClawSkillTemplateResponseBodySkillTemplates> getSkillTemplates() {
        return this.skillTemplates;
    }

    public static class DescribePolarClawSkillTemplateResponseBodySkillTemplates extends TeaModel {
        /**
         * <p>Indicates whether it is actually created.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-03-21 12:00:00</p>
         */
        @NameInMap("Created")
        public String created;

        /**
         * <p>The last modification time of the parameter template.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-04-23 23:00:00</p>
         */
        @NameInMap("Modified")
        public String modified;

        /**
         * <p>The description of the skill template.</p>
         * 
         * <strong>example:</strong>
         * <p>skill template for test</p>
         */
        @NameInMap("SkillTemplateDesc")
        public String skillTemplateDesc;

        /**
         * <p>The skill template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pcpg-skill-**************</p>
         */
        @NameInMap("SkillTemplateId")
        public String skillTemplateId;

        /**
         * <p>The name of the skill template.</p>
         * 
         * <strong>example:</strong>
         * <p>skill-template-test</p>
         */
        @NameInMap("SkillTemplateName")
        public String skillTemplateName;

        /**
         * <p>The list of associated skill details.</p>
         */
        @NameInMap("Skills")
        public java.util.Map<String, String> skills;

        /**
         * <p>The source application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pa-**************</p>
         */
        @NameInMap("SrcApplicationId")
        public String srcApplicationId;

        public static DescribePolarClawSkillTemplateResponseBodySkillTemplates build(java.util.Map<String, ?> map) throws Exception {
            DescribePolarClawSkillTemplateResponseBodySkillTemplates self = new DescribePolarClawSkillTemplateResponseBodySkillTemplates();
            return TeaModel.build(map, self);
        }

        public DescribePolarClawSkillTemplateResponseBodySkillTemplates setCreated(String created) {
            this.created = created;
            return this;
        }
        public String getCreated() {
            return this.created;
        }

        public DescribePolarClawSkillTemplateResponseBodySkillTemplates setModified(String modified) {
            this.modified = modified;
            return this;
        }
        public String getModified() {
            return this.modified;
        }

        public DescribePolarClawSkillTemplateResponseBodySkillTemplates setSkillTemplateDesc(String skillTemplateDesc) {
            this.skillTemplateDesc = skillTemplateDesc;
            return this;
        }
        public String getSkillTemplateDesc() {
            return this.skillTemplateDesc;
        }

        public DescribePolarClawSkillTemplateResponseBodySkillTemplates setSkillTemplateId(String skillTemplateId) {
            this.skillTemplateId = skillTemplateId;
            return this;
        }
        public String getSkillTemplateId() {
            return this.skillTemplateId;
        }

        public DescribePolarClawSkillTemplateResponseBodySkillTemplates setSkillTemplateName(String skillTemplateName) {
            this.skillTemplateName = skillTemplateName;
            return this;
        }
        public String getSkillTemplateName() {
            return this.skillTemplateName;
        }

        public DescribePolarClawSkillTemplateResponseBodySkillTemplates setSkills(java.util.Map<String, String> skills) {
            this.skills = skills;
            return this;
        }
        public java.util.Map<String, String> getSkills() {
            return this.skills;
        }

        public DescribePolarClawSkillTemplateResponseBodySkillTemplates setSrcApplicationId(String srcApplicationId) {
            this.srcApplicationId = srcApplicationId;
            return this;
        }
        public String getSrcApplicationId() {
            return this.srcApplicationId;
        }

    }

}
