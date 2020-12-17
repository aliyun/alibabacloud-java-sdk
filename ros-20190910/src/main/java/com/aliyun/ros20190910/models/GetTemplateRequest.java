// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetTemplateRequest extends TeaModel {
    @NameInMap("StackId")
    public String stackId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ChangeSetId")
    public String changeSetId;

    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("TemplateVersion")
    public String templateVersion;

    @NameInMap("TemplateStage")
    public String templateStage;

    @NameInMap("IncludePermission")
    public String includePermission;

    @NameInMap("StackGroupName")
    public String stackGroupName;

    public static GetTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTemplateRequest self = new GetTemplateRequest();
        return TeaModel.build(map, self);
    }

    public GetTemplateRequest setStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }
    public String getStackId() {
        return this.stackId;
    }

    public GetTemplateRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetTemplateRequest setChangeSetId(String changeSetId) {
        this.changeSetId = changeSetId;
        return this;
    }
    public String getChangeSetId() {
        return this.changeSetId;
    }

    public GetTemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public GetTemplateRequest setTemplateVersion(String templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }
    public String getTemplateVersion() {
        return this.templateVersion;
    }

    public GetTemplateRequest setTemplateStage(String templateStage) {
        this.templateStage = templateStage;
        return this;
    }
    public String getTemplateStage() {
        return this.templateStage;
    }

    public GetTemplateRequest setIncludePermission(String includePermission) {
        this.includePermission = includePermission;
        return this;
    }
    public String getIncludePermission() {
        return this.includePermission;
    }

    public GetTemplateRequest setStackGroupName(String stackGroupName) {
        this.stackGroupName = stackGroupName;
        return this;
    }
    public String getStackGroupName() {
        return this.stackGroupName;
    }

}
