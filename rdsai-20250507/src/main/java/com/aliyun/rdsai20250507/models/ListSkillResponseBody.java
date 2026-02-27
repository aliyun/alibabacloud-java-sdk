// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class ListSkillResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListSkillResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <strong>example:</strong>
     * <p>FE9C65D7-930F-57A5-A207-8C396329****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
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
        @NameInMap("Content")
        public java.util.Map<String, ?> content;

        /**
         * <strong>example:</strong>
         * <p>2026-02-04T21:14:45Z</p>
         */
        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("Dbtypes")
        public java.util.List<String> dbtypes;

        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>9a2ba261-7bb2-41a7-9c6e-1799fb5b****</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>sql-review</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>system</p>
         */
        @NameInMap("SkillType")
        public String skillType;

        /**
         * <strong>example:</strong>
         * <p>2026-02-04T21:14:45Z</p>
         */
        @NameInMap("UpdatedAt")
        public String updatedAt;

        public static ListSkillResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListSkillResponseBodyData self = new ListSkillResponseBodyData();
            return TeaModel.build(map, self);
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

        public ListSkillResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListSkillResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListSkillResponseBodyData setSkillType(String skillType) {
            this.skillType = skillType;
            return this;
        }
        public String getSkillType() {
            return this.skillType;
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
