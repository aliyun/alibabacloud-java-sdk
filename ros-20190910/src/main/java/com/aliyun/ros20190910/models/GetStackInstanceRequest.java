// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetStackInstanceRequest extends TeaModel {
    /**
     * <p>Specifies whether to return the Outputs parameter. The Outputs parameter specifies the outputs of the stack. Valid values:</p>
     * <ul>
     * <li>Enabled: returns the Outputs parameter.</li>
     * <li>Disabled (default): does not return the Outputs parameter.</li>
     * </ul>
     * <blockquote>
     * <p> The Outputs parameter requires a long period of time to calculate. If you do not require the outputs of the stack, we recommend that you set OutputOption to Disabled to improve the response speed of the API operation.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Disabled</p>
     */
    @NameInMap("OutputOption")
    public String outputOption;

    /**
     * <p>The region ID of the stack group. You can call the <a href="https://help.aliyun.com/document_detail/131035.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The name of the stack group. The name must be unique within a region.\
     * The name can be up to 255 characters in length, and can contain digits, letters, hyphens (-), and underscores (_). It must start with a digit or letter.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MyStackGroup</p>
     */
    @NameInMap("StackGroupName")
    public String stackGroupName;

    /**
     * <p>The ID of the destination account to which the stack belongs.</p>
     * <ul>
     * <li>If the stack group is granted self-managed permissions, the stack belongs to an Alibaba Cloud account.</li>
     * <li>If the stack group is granted service-managed permissions, the stack belongs to a member in a resource directory.</li>
     * </ul>
     * <blockquote>
     * <p>For more information about the destination account, see <a href="https://help.aliyun.com/document_detail/154578.html">Overview</a>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>151266687691****</p>
     */
    @NameInMap("StackInstanceAccountId")
    public String stackInstanceAccountId;

    /**
     * <p>The region ID of the stack.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("StackInstanceRegionId")
    public String stackInstanceRegionId;

    public static GetStackInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetStackInstanceRequest self = new GetStackInstanceRequest();
        return TeaModel.build(map, self);
    }

    public GetStackInstanceRequest setOutputOption(String outputOption) {
        this.outputOption = outputOption;
        return this;
    }
    public String getOutputOption() {
        return this.outputOption;
    }

    public GetStackInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetStackInstanceRequest setStackGroupName(String stackGroupName) {
        this.stackGroupName = stackGroupName;
        return this;
    }
    public String getStackGroupName() {
        return this.stackGroupName;
    }

    public GetStackInstanceRequest setStackInstanceAccountId(String stackInstanceAccountId) {
        this.stackInstanceAccountId = stackInstanceAccountId;
        return this;
    }
    public String getStackInstanceAccountId() {
        return this.stackInstanceAccountId;
    }

    public GetStackInstanceRequest setStackInstanceRegionId(String stackInstanceRegionId) {
        this.stackInstanceRegionId = stackInstanceRegionId;
        return this;
    }
    public String getStackInstanceRegionId() {
        return this.stackInstanceRegionId;
    }

}
