// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class GetTemplateResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{     &quot;metadata&quot;: {       &quot;name&quot;: &quot;实验名称&quot;,       &quot;id&quot;: &quot;pai_exp_xxxdfafafasfa&quot;,       &quot;desc&quot;: &quot;实验描述&quot;,     },     &quot;nodes&quot;: [     ],     &quot;edges&quot;: [     ],     &quot;globalParams&quot;: [     ],     &quot;globalSettings&quot;:[     ]  }</p>
     */
    @NameInMap("Content")
    public String content;

    @NameInMap("Description")
    public String description;

    @NameInMap("Detail")
    public String detail;

    /**
     * <strong>example:</strong>
     * <p>URL://xxx</p>
     */
    @NameInMap("DocLink")
    public String docLink;

    /**
     * <strong>example:</strong>
     * <p>URL://xxx</p>
     */
    @NameInMap("ImageLink")
    public String imageLink;

    @NameInMap("Labels")
    public java.util.List<java.util.Map<String, ?>> labels;

    @NameInMap("Name")
    public String name;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SourceId")
    public String sourceId;

    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <strong>example:</strong>
     * <p>template-12345</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("TemplateType")
    public String templateType;

    public static GetTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTemplateResponseBody self = new GetTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTemplateResponseBody setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public GetTemplateResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetTemplateResponseBody setDetail(String detail) {
        this.detail = detail;
        return this;
    }
    public String getDetail() {
        return this.detail;
    }

    public GetTemplateResponseBody setDocLink(String docLink) {
        this.docLink = docLink;
        return this;
    }
    public String getDocLink() {
        return this.docLink;
    }

    public GetTemplateResponseBody setImageLink(String imageLink) {
        this.imageLink = imageLink;
        return this;
    }
    public String getImageLink() {
        return this.imageLink;
    }

    public GetTemplateResponseBody setLabels(java.util.List<java.util.Map<String, ?>> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getLabels() {
        return this.labels;
    }

    public GetTemplateResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTemplateResponseBody setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public String getSourceId() {
        return this.sourceId;
    }

    public GetTemplateResponseBody setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public GetTemplateResponseBody setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public GetTemplateResponseBody setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

}
