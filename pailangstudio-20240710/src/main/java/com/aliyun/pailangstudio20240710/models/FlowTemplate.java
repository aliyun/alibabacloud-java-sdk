// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pailangstudio20240710.models;

import com.aliyun.tea.*;

public class FlowTemplate extends TeaModel {
    @NameInMap("Accessibility")
    public String accessibility;

    @NameInMap("AliyunDocumentId")
    public String aliyunDocumentId;

    @NameInMap("Description")
    public String description;

    @NameInMap("DescriptionI18N")
    public java.util.Map<String, String> descriptionI18N;

    @NameInMap("DisplayName")
    public String displayName;

    @NameInMap("DisplayNameI18N")
    public java.util.Map<String, String> displayNameI18N;

    @NameInMap("FlowFiles")
    public String flowFiles;

    @NameInMap("FlowStoragePath")
    public String flowStoragePath;

    @NameInMap("FlowTemplateId")
    public String flowTemplateId;

    @NameInMap("FlowType")
    public String flowType;

    @NameInMap("Locale")
    public String locale;

    @NameInMap("ReferenceCount")
    public Integer referenceCount;

    @NameInMap("TemplateGroup")
    public String templateGroup;

    @NameInMap("TemplateName")
    public String templateName;

    @NameInMap("Url")
    public String url;

    @NameInMap("Version")
    public String version;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static FlowTemplate build(java.util.Map<String, ?> map) throws Exception {
        FlowTemplate self = new FlowTemplate();
        return TeaModel.build(map, self);
    }

    public FlowTemplate setAccessibility(String accessibility) {
        this.accessibility = accessibility;
        return this;
    }
    public String getAccessibility() {
        return this.accessibility;
    }

    public FlowTemplate setAliyunDocumentId(String aliyunDocumentId) {
        this.aliyunDocumentId = aliyunDocumentId;
        return this;
    }
    public String getAliyunDocumentId() {
        return this.aliyunDocumentId;
    }

    public FlowTemplate setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public FlowTemplate setDescriptionI18N(java.util.Map<String, String> descriptionI18N) {
        this.descriptionI18N = descriptionI18N;
        return this;
    }
    public java.util.Map<String, String> getDescriptionI18N() {
        return this.descriptionI18N;
    }

    public FlowTemplate setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public FlowTemplate setDisplayNameI18N(java.util.Map<String, String> displayNameI18N) {
        this.displayNameI18N = displayNameI18N;
        return this;
    }
    public java.util.Map<String, String> getDisplayNameI18N() {
        return this.displayNameI18N;
    }

    public FlowTemplate setFlowFiles(String flowFiles) {
        this.flowFiles = flowFiles;
        return this;
    }
    public String getFlowFiles() {
        return this.flowFiles;
    }

    public FlowTemplate setFlowStoragePath(String flowStoragePath) {
        this.flowStoragePath = flowStoragePath;
        return this;
    }
    public String getFlowStoragePath() {
        return this.flowStoragePath;
    }

    public FlowTemplate setFlowTemplateId(String flowTemplateId) {
        this.flowTemplateId = flowTemplateId;
        return this;
    }
    public String getFlowTemplateId() {
        return this.flowTemplateId;
    }

    public FlowTemplate setFlowType(String flowType) {
        this.flowType = flowType;
        return this;
    }
    public String getFlowType() {
        return this.flowType;
    }

    public FlowTemplate setLocale(String locale) {
        this.locale = locale;
        return this;
    }
    public String getLocale() {
        return this.locale;
    }

    public FlowTemplate setReferenceCount(Integer referenceCount) {
        this.referenceCount = referenceCount;
        return this;
    }
    public Integer getReferenceCount() {
        return this.referenceCount;
    }

    public FlowTemplate setTemplateGroup(String templateGroup) {
        this.templateGroup = templateGroup;
        return this;
    }
    public String getTemplateGroup() {
        return this.templateGroup;
    }

    public FlowTemplate setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public FlowTemplate setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public FlowTemplate setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public FlowTemplate setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
