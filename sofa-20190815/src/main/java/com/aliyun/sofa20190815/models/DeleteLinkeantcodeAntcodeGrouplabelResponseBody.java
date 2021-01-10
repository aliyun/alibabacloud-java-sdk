// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeantcodeAntcodeGrouplabelResponseBody extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Color")
    public String color;

    @NameInMap("CreatedAt")
    public String createdAt;

    @NameInMap("SourceType")
    public String sourceType;

    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("UpdatedAt")
    public String updatedAt;

    @NameInMap("Template")
    public Boolean template;

    @NameInMap("GroupId")
    public Long groupId;

    @NameInMap("Name")
    public String name;

    @NameInMap("TenantId")
    public Long tenantId;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Id")
    public Long id;

    @NameInMap("ResultCode")
    public String resultCode;

    public static DeleteLinkeantcodeAntcodeGrouplabelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeantcodeAntcodeGrouplabelResponseBody self = new DeleteLinkeantcodeAntcodeGrouplabelResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeantcodeAntcodeGrouplabelResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DeleteLinkeantcodeAntcodeGrouplabelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteLinkeantcodeAntcodeGrouplabelResponseBody setColor(String color) {
        this.color = color;
        return this;
    }
    public String getColor() {
        return this.color;
    }

    public DeleteLinkeantcodeAntcodeGrouplabelResponseBody setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public DeleteLinkeantcodeAntcodeGrouplabelResponseBody setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public DeleteLinkeantcodeAntcodeGrouplabelResponseBody setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public DeleteLinkeantcodeAntcodeGrouplabelResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public DeleteLinkeantcodeAntcodeGrouplabelResponseBody setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public DeleteLinkeantcodeAntcodeGrouplabelResponseBody setTemplate(Boolean template) {
        this.template = template;
        return this;
    }
    public Boolean getTemplate() {
        return this.template;
    }

    public DeleteLinkeantcodeAntcodeGrouplabelResponseBody setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public DeleteLinkeantcodeAntcodeGrouplabelResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DeleteLinkeantcodeAntcodeGrouplabelResponseBody setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public DeleteLinkeantcodeAntcodeGrouplabelResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public DeleteLinkeantcodeAntcodeGrouplabelResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DeleteLinkeantcodeAntcodeGrouplabelResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

}
