// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribePolarClawSkillTemplatesResponseBody extends TeaModel {
    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The number of entries per page. Valid values:</p>
     * <ul>
     * <li><p><strong>30</strong></p>
     * </li>
     * <li><p><strong>50</strong></p>
     * </li>
     * <li><p><strong>100</strong></p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>925B84D9-CA72-432C-95CF-738C22******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The skill templates.</p>
     */
    @NameInMap("SkillTemplates")
    public java.util.List<DescribePolarClawSkillTemplatesResponseBodySkillTemplates> skillTemplates;

    /**
     * <p>The total number of entries. This parameter is returned only when you query a list.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    public static DescribePolarClawSkillTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePolarClawSkillTemplatesResponseBody self = new DescribePolarClawSkillTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePolarClawSkillTemplatesResponseBody setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribePolarClawSkillTemplatesResponseBody setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribePolarClawSkillTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePolarClawSkillTemplatesResponseBody setSkillTemplates(java.util.List<DescribePolarClawSkillTemplatesResponseBodySkillTemplates> skillTemplates) {
        this.skillTemplates = skillTemplates;
        return this;
    }
    public java.util.List<DescribePolarClawSkillTemplatesResponseBodySkillTemplates> getSkillTemplates() {
        return this.skillTemplates;
    }

    public DescribePolarClawSkillTemplatesResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class DescribePolarClawSkillTemplatesResponseBodySkillTemplates extends TeaModel {
        /**
         * <p>The time when the skill template was created in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-11-15T16:00Z</p>
         */
        @NameInMap("Created")
        public String created;

        /**
         * <p>The rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>423</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The time when the skill template was last modified in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-11-16T16:00Z</p>
         */
        @NameInMap("Modified")
        public String modified;

        /**
         * <p>The number of skills.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("SkillCounts")
        public String skillCounts;

        /**
         * <p>The skill template description.</p>
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
         * <p>pcpg-skill-2ze5v8n27o7x92a</p>
         */
        @NameInMap("SkillTemplateId")
        public String skillTemplateId;

        /**
         * <p>The skill template name.</p>
         * 
         * <strong>example:</strong>
         * <p>skill-template-test</p>
         */
        @NameInMap("SkillTemplateName")
        public String skillTemplateName;

        /**
         * <p>The skill templatetype. Valid values: 0: system template. 1: user template.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SkillTemplateType")
        public String skillTemplateType;

        /**
         * <p>The source application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pa-**************</p>
         */
        @NameInMap("SrcApplicationId")
        public String srcApplicationId;

        public static DescribePolarClawSkillTemplatesResponseBodySkillTemplates build(java.util.Map<String, ?> map) throws Exception {
            DescribePolarClawSkillTemplatesResponseBodySkillTemplates self = new DescribePolarClawSkillTemplatesResponseBodySkillTemplates();
            return TeaModel.build(map, self);
        }

        public DescribePolarClawSkillTemplatesResponseBodySkillTemplates setCreated(String created) {
            this.created = created;
            return this;
        }
        public String getCreated() {
            return this.created;
        }

        public DescribePolarClawSkillTemplatesResponseBodySkillTemplates setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribePolarClawSkillTemplatesResponseBodySkillTemplates setModified(String modified) {
            this.modified = modified;
            return this;
        }
        public String getModified() {
            return this.modified;
        }

        public DescribePolarClawSkillTemplatesResponseBodySkillTemplates setSkillCounts(String skillCounts) {
            this.skillCounts = skillCounts;
            return this;
        }
        public String getSkillCounts() {
            return this.skillCounts;
        }

        public DescribePolarClawSkillTemplatesResponseBodySkillTemplates setSkillTemplateDesc(String skillTemplateDesc) {
            this.skillTemplateDesc = skillTemplateDesc;
            return this;
        }
        public String getSkillTemplateDesc() {
            return this.skillTemplateDesc;
        }

        public DescribePolarClawSkillTemplatesResponseBodySkillTemplates setSkillTemplateId(String skillTemplateId) {
            this.skillTemplateId = skillTemplateId;
            return this;
        }
        public String getSkillTemplateId() {
            return this.skillTemplateId;
        }

        public DescribePolarClawSkillTemplatesResponseBodySkillTemplates setSkillTemplateName(String skillTemplateName) {
            this.skillTemplateName = skillTemplateName;
            return this;
        }
        public String getSkillTemplateName() {
            return this.skillTemplateName;
        }

        public DescribePolarClawSkillTemplatesResponseBodySkillTemplates setSkillTemplateType(String skillTemplateType) {
            this.skillTemplateType = skillTemplateType;
            return this;
        }
        public String getSkillTemplateType() {
            return this.skillTemplateType;
        }

        public DescribePolarClawSkillTemplatesResponseBodySkillTemplates setSrcApplicationId(String srcApplicationId) {
            this.srcApplicationId = srcApplicationId;
            return this;
        }
        public String getSrcApplicationId() {
            return this.srcApplicationId;
        }

    }

}
