// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class ListSkillResponseBody extends TeaModel {
    /**
     * <p>The skill list.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListSkillResponseBodyData> data;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The unique request identifier.</p>
     * 
     * <strong>example:</strong>
     * <p>FE9C65D7-930F-57A5-A207-8C396329****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListSkillResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSkillResponseBody self = new ListSkillResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSkillResponseBody setData(java.util.List<ListSkillResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListSkillResponseBodyData> getData() {
        return this.data;
    }

    public ListSkillResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListSkillResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListSkillResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSkillResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListSkillResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the currently active version.</p>
         * 
         * <strong>example:</strong>
         * <p>version-example</p>
         */
        @NameInMap("ActiveVersionId")
        public String activeVersionId;

        /**
         * <p>The skill category.</p>
         * 
         * <strong>example:</strong>
         * <p>productivity</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The data content.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;MySQL&quot;: &quot;MySQL optimization guide...&quot;,&quot;PostgreSQL&quot;: &quot;PostgreSQL optimization guide...&quot;}</p>
         */
        @NameInMap("Content")
        public java.util.Map<String, ?> content;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-02-04T21:14:45Z</p>
         */
        @NameInMap("CreatedAt")
        public String createdAt;

        /**
         * <p>The list of database types.</p>
         */
        @NameInMap("Dbtypes")
        public java.util.List<String> dbtypes;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>SQL Review Expert: Comprehensively reviews SQL for security, performance, and compliance, identifies risks, and provides optimization suggestions. Activated immediately when a user submits SQL or asks about &quot;SQL review&quot;, &quot;SQL Review&quot;, &quot;any risks&quot;, or &quot;how to optimize&quot;</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The display name of the skill.</p>
         * 
         * <strong>example:</strong>
         * <p>Example Skill</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The public HTTPS URL of the current icon. Empty if not configured.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/skill-icon.png">https://example.com/skill-icon.png</a></p>
         * 
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("Icon")
        public String icon;

        /**
         * <p>The unique identifier of the skill.</p>
         * 
         * <strong>example:</strong>
         * <p>9a2ba261-7bb2-41a7-9c6e-1799fb5b****</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>Indicates whether the skill is deleted.</p>
         */
        @NameInMap("IsDeleted")
        public Boolean isDeleted;

        /**
         * <p>The skill name.</p>
         * 
         * <strong>example:</strong>
         * <p>sql-review</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The visibility scope of the skill.</p>
         * 
         * <strong>example:</strong>
         * <p>PRIVATE</p>
         */
        @NameInMap("Scope")
        public String scope;

        /**
         * <p>The skill type.</p>
         * 
         * <strong>example:</strong>
         * <p>system</p>
         */
        @NameInMap("SkillType")
        public String skillType;

        /**
         * <p>The stable identifier of the skill.</p>
         * 
         * <strong>example:</strong>
         * <p>example-skill</p>
         */
        @NameInMap("Slug")
        public String slug;

        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-02-04T21:14:45Z</p>
         */
        @NameInMap("UpdatedAt")
        public String updatedAt;

        public static ListSkillResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListSkillResponseBodyData self = new ListSkillResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListSkillResponseBodyData setActiveVersionId(String activeVersionId) {
            this.activeVersionId = activeVersionId;
            return this;
        }
        public String getActiveVersionId() {
            return this.activeVersionId;
        }

        public ListSkillResponseBodyData setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ListSkillResponseBodyData setContent(java.util.Map<String, ?> content) {
            this.content = content;
            return this;
        }
        public java.util.Map<String, ?> getContent() {
            return this.content;
        }

        public ListSkillResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListSkillResponseBodyData setDbtypes(java.util.List<String> dbtypes) {
            this.dbtypes = dbtypes;
            return this;
        }
        public java.util.List<String> getDbtypes() {
            return this.dbtypes;
        }

        public ListSkillResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListSkillResponseBodyData setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListSkillResponseBodyData setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public ListSkillResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListSkillResponseBodyData setIsDeleted(Boolean isDeleted) {
            this.isDeleted = isDeleted;
            return this;
        }
        public Boolean getIsDeleted() {
            return this.isDeleted;
        }

        public ListSkillResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListSkillResponseBodyData setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public ListSkillResponseBodyData setSkillType(String skillType) {
            this.skillType = skillType;
            return this;
        }
        public String getSkillType() {
            return this.skillType;
        }

        public ListSkillResponseBodyData setSlug(String slug) {
            this.slug = slug;
            return this;
        }
        public String getSlug() {
            return this.slug;
        }

        public ListSkillResponseBodyData setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

    }

}
