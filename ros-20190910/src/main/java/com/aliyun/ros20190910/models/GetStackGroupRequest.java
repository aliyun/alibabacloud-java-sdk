// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetStackGroupRequest extends TeaModel {
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
     * <p>The ID of the stack group.</p>
     * <blockquote>
     * <p>You must specify only one of the StackGroupName and StackGroupId parameters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>fd0ddef9-9540-4b42-a464-94f77835****</p>
     */
    @NameInMap("StackGroupId")
    public String stackGroupId;

    /**
     * <p>The name of the stack group. The name must be unique within a region. The name can be up to 255 characters in length, and must start with a digit or a letter. It can contain digits, letters, hyphens (-), and underscores (_).</p>
     * <blockquote>
     * <p>You must specify only one of the StackGroupName and StackGroupId parameters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>MyStackGroup</p>
     */
    @NameInMap("StackGroupName")
    public String stackGroupName;

    public static GetStackGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        GetStackGroupRequest self = new GetStackGroupRequest();
        return TeaModel.build(map, self);
    }

    public GetStackGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetStackGroupRequest setStackGroupId(String stackGroupId) {
        this.stackGroupId = stackGroupId;
        return this;
    }
    public String getStackGroupId() {
        return this.stackGroupId;
    }

    public GetStackGroupRequest setStackGroupName(String stackGroupName) {
        this.stackGroupName = stackGroupName;
        return this;
    }
    public String getStackGroupName() {
        return this.stackGroupName;
    }

}
