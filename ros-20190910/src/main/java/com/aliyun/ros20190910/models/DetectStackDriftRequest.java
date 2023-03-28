// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class DetectStackDriftRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that it is unique among different requests.</p>
     * <br>
     * <p>The value can be up to 64 characters in length and can contain letters, digits, hyphens (-), and underscores (\_).</p>
     * <br>
     * <p>For more information, see [How to ensure idempotence](~~134212~~).</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

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

    public static DetectStackDriftRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectStackDriftRequest self = new DetectStackDriftRequest();
        return TeaModel.build(map, self);
    }

    public DetectStackDriftRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DetectStackDriftRequest setLogicalResourceId(java.util.List<String> logicalResourceId) {
        this.logicalResourceId = logicalResourceId;
        return this;
    }
    public java.util.List<String> getLogicalResourceId() {
        return this.logicalResourceId;
    }

    public DetectStackDriftRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DetectStackDriftRequest setStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }
    public String getStackId() {
        return this.stackId;
    }

}
