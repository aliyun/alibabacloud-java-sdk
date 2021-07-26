// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class GetTemplateResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("Name")
    public String name;

    @NameInMap("ImageLink")
    public String imageLink;

    @NameInMap("DocLink")
    public String docLink;

    @NameInMap("Detail")
    public String detail;

    @NameInMap("Description")
    public String description;

    @NameInMap("Content")
    public String content;

    public static GetTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTemplateResponseBody self = new GetTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTemplateResponseBody setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public GetTemplateResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetTemplateResponseBody setImageLink(String imageLink) {
        this.imageLink = imageLink;
        return this;
    }
    public String getImageLink() {
        return this.imageLink;
    }

    public GetTemplateResponseBody setDocLink(String docLink) {
        this.docLink = docLink;
        return this;
    }
    public String getDocLink() {
        return this.docLink;
    }

    public GetTemplateResponseBody setDetail(String detail) {
        this.detail = detail;
        return this;
    }
    public String getDetail() {
        return this.detail;
    }

    public GetTemplateResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetTemplateResponseBody setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

}
