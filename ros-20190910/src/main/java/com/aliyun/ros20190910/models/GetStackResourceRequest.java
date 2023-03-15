// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetStackResourceRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that it is unique among different requests.</p>
     * <br>
     * <p>The token can be up to 64 characters in length, and can contain letters, digits, hyphens (-), and underscores (\_).</p>
     * <br>
     * <p>For more information, see [Ensure idempotence](~~134212~~).</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The logical ID of the resource defined in the template.</p>
     */
    @NameInMap("LogicalResourceId")
    public String logicalResourceId;

    /**
     * <p>The ID of the region to which the stack belongs. You can call the [DescribeRegions](~~131035~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceAttributes")
    public java.util.List<String> resourceAttributes;

    /**
     * <p>Specifies whether to query the resource properties. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     */
    @NameInMap("ShowResourceAttributes")
    public Boolean showResourceAttributes;

    /**
     * <p>The ID of the stack.</p>
     */
    @NameInMap("StackId")
    public String stackId;

    public static GetStackResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetStackResourceRequest self = new GetStackResourceRequest();
        return TeaModel.build(map, self);
    }

    public GetStackResourceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public GetStackResourceRequest setLogicalResourceId(String logicalResourceId) {
        this.logicalResourceId = logicalResourceId;
        return this;
    }
    public String getLogicalResourceId() {
        return this.logicalResourceId;
    }

    public GetStackResourceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetStackResourceRequest setResourceAttributes(java.util.List<String> resourceAttributes) {
        this.resourceAttributes = resourceAttributes;
        return this;
    }
    public java.util.List<String> getResourceAttributes() {
        return this.resourceAttributes;
    }

    public GetStackResourceRequest setShowResourceAttributes(Boolean showResourceAttributes) {
        this.showResourceAttributes = showResourceAttributes;
        return this;
    }
    public Boolean getShowResourceAttributes() {
        return this.showResourceAttributes;
    }

    public GetStackResourceRequest setStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }
    public String getStackId() {
        return this.stackId;
    }

}
