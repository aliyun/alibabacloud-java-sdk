// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetTemplateRequest extends TeaModel {
    /**
     * <p>The ID of the change set.</p>
     * <blockquote>
     * <p>You must specify one of the following parameters: StackId, ChangeSetId, StackGroupName, and TemplateId.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1f6521a4-05af-4975-afe9-bc4b45ad****</p>
     */
    @NameInMap("ChangeSetId")
    public String changeSetId;

    /**
     * <p>Specifies whether to query the shared information about the template. Valid values:</p>
     * <ul>
     * <li>Enabled</li>
     * <li>Disabled (default)</li>
     * </ul>
     * <blockquote>
     * <p>Only the template owner can query the shared information of a template.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Enabled</p>
     */
    @NameInMap("IncludePermission")
    public String includePermission;

    /**
     * <p>Specifies whether to query the information about tags. Valid values:</p>
     * <ul>
     * <li>Enabled</li>
     * <li>Disabled (default)</li>
     * </ul>
     * <blockquote>
     * <p>This parameter takes effect only if you specify TemplateId.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Enabled</p>
     */
    @NameInMap("IncludeTags")
    public String includeTags;

    /**
     * <p>The region ID of the stack or stack group that uses the template. You can call the <a href="https://help.aliyun.com/document_detail/131035.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The name of the stack group.</p>
     * <blockquote>
     * <p>You must specify one of the following parameters: StackId, ChangeSetId, StackGroupName, and TemplateId.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>MyStackGroup</p>
     */
    @NameInMap("StackGroupName")
    public String stackGroupName;

    /**
     * <p>The ID of the stack.</p>
     * <blockquote>
     * <p>You must specify one of the following parameters: StackId, ChangeSetId, StackGroupName, and TemplateId.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>4a6c9851-3b0f-4f5f-b4ca-a14bf691****</p>
     */
    @NameInMap("StackId")
    public String stackId;

    /**
     * <p>The ID of the template.</p>
     * <p>This parameter applies to shared and private templates. If the template is a shared template, the value of TemplateId is the same as the value of TemplateARN. You can use the template ID to query a shared template.</p>
     * <blockquote>
     * <p>You must specify one of the following parameters: StackId, ChangeSetId, StackGroupName, and TemplateId.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5ecd1e10-b0e9-4389-a565-e4c15efc****</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The stage of the template. This parameter takes effect only if you specify StackId, ChangeSetId, or StackGroupName.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>Processed (default): returns the processed template.</li>
     * <li>Original: returns the original template.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Processed</p>
     */
    @NameInMap("TemplateStage")
    public String templateStage;

    /**
     * <p>The version of the template. This parameter takes effect only if you specify TemplateId.\
     * If the template is a shared template, you can specify this parameter only if VersionOption is set to AllVersions. For more information, see <a href="https://help.aliyun.com/document_detail/194768.html">SetTemplatePermission</a>.</p>
     * <p>Valid values: v1 to v100.</p>
     * 
     * <strong>example:</strong>
     * <p>v1</p>
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
