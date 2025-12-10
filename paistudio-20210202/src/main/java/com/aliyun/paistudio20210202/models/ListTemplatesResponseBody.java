// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class ListTemplatesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TemplateData")
    public java.util.List<ListTemplatesResponseBodyTemplateData> templateData;

    /**
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTemplatesResponseBody self = new ListTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTemplatesResponseBody setTemplateData(java.util.List<ListTemplatesResponseBodyTemplateData> templateData) {
        this.templateData = templateData;
        return this;
    }
    public java.util.List<ListTemplatesResponseBodyTemplateData> getTemplateData() {
        return this.templateData;
    }

    public ListTemplatesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListTemplatesResponseBodyTemplateDataTemplate extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Content")
        public String content;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("Description")
        public String description;

        @NameInMap("Detail")
        public String detail;

        /**
         * <strong>example:</strong>
         * <p>url://xxx</p>
         */
        @NameInMap("DocLink")
        public String docLink;

        /**
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
         */
        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        /**
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
         */
        @NameInMap("GmtModifiedTime")
        public String gmtModifiedTime;

        /**
         * <strong>example:</strong>
         * <p>url://xxx</p>
         */
        @NameInMap("ImageLink")
        public String imageLink;

        @NameInMap("Labels")
        public java.util.List<java.util.Map<String, ?>> labels;

        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>template-rbvg5wzljzjhc9ks92</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        public static ListTemplatesResponseBodyTemplateDataTemplate build(java.util.Map<String, ?> map) throws Exception {
            ListTemplatesResponseBodyTemplateDataTemplate self = new ListTemplatesResponseBodyTemplateDataTemplate();
            return TeaModel.build(map, self);
        }

        public ListTemplatesResponseBodyTemplateDataTemplate setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListTemplatesResponseBodyTemplateDataTemplate setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListTemplatesResponseBodyTemplateDataTemplate setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListTemplatesResponseBodyTemplateDataTemplate setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

        public ListTemplatesResponseBodyTemplateDataTemplate setDocLink(String docLink) {
            this.docLink = docLink;
            return this;
        }
        public String getDocLink() {
            return this.docLink;
        }

        public ListTemplatesResponseBodyTemplateDataTemplate setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public ListTemplatesResponseBodyTemplateDataTemplate setGmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public ListTemplatesResponseBodyTemplateDataTemplate setImageLink(String imageLink) {
            this.imageLink = imageLink;
            return this;
        }
        public String getImageLink() {
            return this.imageLink;
        }

        public ListTemplatesResponseBodyTemplateDataTemplate setLabels(java.util.List<java.util.Map<String, ?>> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getLabels() {
            return this.labels;
        }

        public ListTemplatesResponseBodyTemplateDataTemplate setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListTemplatesResponseBodyTemplateDataTemplate setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

    public static class ListTemplatesResponseBodyTemplateDataTemplateTag extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>PyTorch</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>template-tag-rbvg5wzljzjhc9ks92</p>
         */
        @NameInMap("TagId")
        public String tagId;

        /**
         * <strong>example:</strong>
         * <p>template-tag-type-rbvg5wzljzjhc9ks92</p>
         */
        @NameInMap("TypeId")
        public String typeId;

        public static ListTemplatesResponseBodyTemplateDataTemplateTag build(java.util.Map<String, ?> map) throws Exception {
            ListTemplatesResponseBodyTemplateDataTemplateTag self = new ListTemplatesResponseBodyTemplateDataTemplateTag();
            return TeaModel.build(map, self);
        }

        public ListTemplatesResponseBodyTemplateDataTemplateTag setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListTemplatesResponseBodyTemplateDataTemplateTag setTagId(String tagId) {
            this.tagId = tagId;
            return this;
        }
        public String getTagId() {
            return this.tagId;
        }

        public ListTemplatesResponseBodyTemplateDataTemplateTag setTypeId(String typeId) {
            this.typeId = typeId;
            return this;
        }
        public String getTypeId() {
            return this.typeId;
        }

    }

    public static class ListTemplatesResponseBodyTemplateDataTemplateType extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>行业分类</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>templatetagtype-rbvg5wzljzjhc9ks92</p>
         */
        @NameInMap("TypeId")
        public String typeId;

        public static ListTemplatesResponseBodyTemplateDataTemplateType build(java.util.Map<String, ?> map) throws Exception {
            ListTemplatesResponseBodyTemplateDataTemplateType self = new ListTemplatesResponseBodyTemplateDataTemplateType();
            return TeaModel.build(map, self);
        }

        public ListTemplatesResponseBodyTemplateDataTemplateType setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListTemplatesResponseBodyTemplateDataTemplateType setTypeId(String typeId) {
            this.typeId = typeId;
            return this;
        }
        public String getTypeId() {
            return this.typeId;
        }

    }

    public static class ListTemplatesResponseBodyTemplateData extends TeaModel {
        @NameInMap("Template")
        public ListTemplatesResponseBodyTemplateDataTemplate template;

        @NameInMap("TemplateTag")
        public ListTemplatesResponseBodyTemplateDataTemplateTag templateTag;

        @NameInMap("TemplateType")
        public ListTemplatesResponseBodyTemplateDataTemplateType templateType;

        public static ListTemplatesResponseBodyTemplateData build(java.util.Map<String, ?> map) throws Exception {
            ListTemplatesResponseBodyTemplateData self = new ListTemplatesResponseBodyTemplateData();
            return TeaModel.build(map, self);
        }

        public ListTemplatesResponseBodyTemplateData setTemplate(ListTemplatesResponseBodyTemplateDataTemplate template) {
            this.template = template;
            return this;
        }
        public ListTemplatesResponseBodyTemplateDataTemplate getTemplate() {
            return this.template;
        }

        public ListTemplatesResponseBodyTemplateData setTemplateTag(ListTemplatesResponseBodyTemplateDataTemplateTag templateTag) {
            this.templateTag = templateTag;
            return this;
        }
        public ListTemplatesResponseBodyTemplateDataTemplateTag getTemplateTag() {
            return this.templateTag;
        }

        public ListTemplatesResponseBodyTemplateData setTemplateType(ListTemplatesResponseBodyTemplateDataTemplateType templateType) {
            this.templateType = templateType;
            return this;
        }
        public ListTemplatesResponseBodyTemplateDataTemplateType getTemplateType() {
            return this.templateType;
        }

    }

}
