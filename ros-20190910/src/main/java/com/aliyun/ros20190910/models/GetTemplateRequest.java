// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetTemplateRequest extends TeaModel {
    /**
     * <p>The ID of the change set.</p>
     * <br>
     * <p>>  You must specify only one of the following parameters: StackId, ChangeSetId, StackGroupName, and TemplateId.</p>
     */
    @NameInMap("ChangeSetId")
    public String changeSetId;

    /**
     * <p>Specifies whether to query the template sharing information. Default value: Disabled. Valid values:</p>
     * <br>
     * <p>*   Enabled</p>
     * <p>*   Disabled</p>
     * <br>
     * <p>>  Only the template owner can query the template sharing information.</p>
     */
    @NameInMap("IncludePermission")
    public String includePermission;

    /**
     * <p>Specifies whether to query the information about tags. Default value: Disabled. Valid values:</p>
     * <br>
     * <p>*   Enabled</p>
     * <p>*   Disabled</p>
     * <br>
     * <p>>  This parameter only takes effect when you specify the TemplateId parameter.</p>
     */
    @NameInMap("IncludeTags")
    public String includeTags;

    /**
     * <p>The ID of the region to which the stack or stack group defined in the template belongs. You can call the [DescribeRegions](~~131035~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The name of the stack group.</p>
     * <br>
     * <p>>  You must specify only one of the following parameters: StackId, ChangeSetId, StackGroupName, and TemplateId.</p>
     */
    @NameInMap("StackGroupName")
    public String stackGroupName;

    /**
     * <p>The ID of the stack.</p>
     * <br>
     * <p>>  You must specify only one of the following parameters: StackId, ChangeSetId, StackGroupName, and TemplateId.</p>
     */
    @NameInMap("StackId")
    public String stackId;

    /**
     * <p>The ID of the template.</p>
     * <br>
     * <p>This parameter applies to shared and private templates. If the template is a shared template, the value of the TemplateId parameter is the same as the value of the TemplateARN parameter. You can use the template ID to query a shared template.</p>
     * <br>
     * <p>>  You must specify only one of the following parameters: StackId, ChangeSetId, StackGroupName, and TemplateId.</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The stage of the template. This parameter only takes effect when you specify the StackId, ChangeSetId, or StackGroupName parameter.</p>
     * <br>
     * <p>Default value: Processed. Valid values:</p>
     * <br>
     * <p>*   Processed: returns the processed template that contains transforms.</p>
     * <p>*   Original: returns the original template that you specify.</p>
     */
    @NameInMap("TemplateStage")
    public String templateStage;

    /**
     * <p>The version of the template. This parameter only takes effect when you specify the TemplateId parameter.</p>
     * <br>
     * <p>If the template is a shared template, you can specify this parameter only if you set the VersionOption parameter to AllVersions.</p>
     * <br>
     * <p>Valid values: v1 to v100.</p>
     */
    @NameInMap("TemplateVersion")
    public String templateVersion;

    public static GetTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTemplateRequest self = new GetTemplateRequest();
        return TeaModel.build(map, self);
    }

    public GetTemplateRequest setChangeSetId(String changeSetId) {
        this.changeSetId = changeSetId;
        return this;
    }
    public String getChangeSetId() {
        return this.changeSetId;
    }

    public GetTemplateRequest setIncludePermission(String includePermission) {
        this.includePermission = includePermission;
        return this;
    }
    public String getIncludePermission() {
        return this.includePermission;
    }

    public GetTemplateRequest setIncludeTags(String includeTags) {
        this.includeTags = includeTags;
        return this;
    }
    public String getIncludeTags() {
        return this.includeTags;
    }

    public GetTemplateRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetTemplateRequest setStackGroupName(String stackGroupName) {
        this.stackGroupName = stackGroupName;
        return this;
    }
    public String getStackGroupName() {
        return this.stackGroupName;
    }

    public GetTemplateRequest setStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }
    public String getStackId() {
        return this.stackId;
    }

    public GetTemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public GetTemplateRequest setTemplateStage(String templateStage) {
        this.templateStage = templateStage;
        return this;
    }
    public String getTemplateStage() {
        return this.templateStage;
    }

    public GetTemplateRequest setTemplateVersion(String templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }
    public String getTemplateVersion() {
        return this.templateVersion;
    }

}
