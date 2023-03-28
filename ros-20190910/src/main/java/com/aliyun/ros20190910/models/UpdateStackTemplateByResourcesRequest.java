// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class UpdateStackTemplateByResourcesRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that it is unique among different requests.</p>
     * <br>
     * <p>The token can be up to 64 characters in length and can contain letters, digits, hyphens (-), and underscores (\_).</p>
     * <br>
     * <p>For more information, see [How to ensure idempotence](~~134212~~).</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to only preview the corrected template in this request. Default value: false. Valid values:</p>
     * <br>
     * <p>*   true: returns the content of the corrected template and does not correct the template. After Resource Orchestration Service (ROS) compares the corrected template with the original template, ROS determines whether to execute the correction.</p>
     * <p>*   false: corrects the template to eliminate drift.</p>
     * <br>
     * <p>>  We recommend that you set the DryRun parameter to true to preview the corrected template. If the template content meets expectations, set the DryRun parameter to false to execute the correction.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The logical ID of resource.</p>
     */
    @NameInMap("LogicalResourceId")
    public java.util.List<String> logicalResourceId;

    /**
     * <p>The region ID of the stack. You can call the [DescribeRegions](~~131035~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the stack.</p>
     */
    @NameInMap("StackId")
    public String stackId;

    /**
     * <p>The format of the returned template. Default value: JSON. Valid values:</p>
     * <br>
     * <p>*   JSON</p>
     * <p>*   YAML</p>
     */
    @NameInMap("TemplateFormat")
    public String templateFormat;

    public static UpdateStackTemplateByResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateStackTemplateByResourcesRequest self = new UpdateStackTemplateByResourcesRequest();
        return TeaModel.build(map, self);
    }

    public UpdateStackTemplateByResourcesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateStackTemplateByResourcesRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpdateStackTemplateByResourcesRequest setLogicalResourceId(java.util.List<String> logicalResourceId) {
        this.logicalResourceId = logicalResourceId;
        return this;
    }
    public java.util.List<String> getLogicalResourceId() {
        return this.logicalResourceId;
    }

    public UpdateStackTemplateByResourcesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateStackTemplateByResourcesRequest setStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }
    public String getStackId() {
        return this.stackId;
    }

    public UpdateStackTemplateByResourcesRequest setTemplateFormat(String templateFormat) {
        this.templateFormat = templateFormat;
        return this;
    }
    public String getTemplateFormat() {
        return this.templateFormat;
    }

}
