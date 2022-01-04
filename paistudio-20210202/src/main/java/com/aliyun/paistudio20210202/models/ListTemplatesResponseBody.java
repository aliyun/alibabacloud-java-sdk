// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class ListTemplatesResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TemplateData")
    public java.util.List<ListTemplatesResponseBodyTemplateData> templateData;

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
        @NameInMap("Content")
        public String content;

        @NameInMap("Description")
        public String description;

        @NameInMap("Detail")
        public String detail;

        @NameInMap("DocLink")
        public String docLink;

        @NameInMap("ImageLink")
        public String imageLink;

        @NameInMap("Name")
        public String name;

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

        public ListTemplatesResponseBodyTemplateDataTemplate setImageLink(String imageLink) {
            this.imageLink = imageLink;
            return this;
        }
        public String getImageLink() {
            return this.imageLink;
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
        @NameInMap("Name")
        public String name;

        @NameInMap("TagId")
        public String tagId;

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
        @NameInMap("Name")
        public String name;

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
