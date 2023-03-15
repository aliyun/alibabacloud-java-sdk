// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class SetStackPolicyRequest extends TeaModel {
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
     * <p>The structure that contains the stack policy body. The stack policy body must be 1 to 16,384 bytes in length.</p>
     * <br>
     * <p>You can specify one of the StackPolicyBody and StackPolicyURL parameters, but you cannot specify both of them.</p>
     */
    @NameInMap("StackPolicyBody")
    public String stackPolicyBody;

    /**
     * <p>The URL for the file that contains the stack policy. The URL must point to a template located in an HTTP or HTTPS web server or an Alibaba Cloud OSS bucket. Examples: oss://ros/template/demo and oss://ros/template/demo?RegionId=cn-hangzhou. The template can be up to 16,384 bytes in length, and the URL can be up to 1,350 bytes in length.</p>
     * <br>
     * <p>>  If the region of the OSS bucket is not specified, the RegionId value is used.</p>
     * <br>
     * <p>You can specify one of the StackPolicyBody and StackPolicyURL parameters, but you cannot specify both of them.</p>
     */
    @NameInMap("StackPolicyURL")
    public String stackPolicyURL;

    public static SetStackPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        SetStackPolicyRequest self = new SetStackPolicyRequest();
        return TeaModel.build(map, self);
    }

    public SetStackPolicyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SetStackPolicyRequest setStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }
    public String getStackId() {
        return this.stackId;
    }

    public SetStackPolicyRequest setStackPolicyBody(String stackPolicyBody) {
        this.stackPolicyBody = stackPolicyBody;
        return this;
    }
    public String getStackPolicyBody() {
        return this.stackPolicyBody;
    }

    public SetStackPolicyRequest setStackPolicyURL(String stackPolicyURL) {
        this.stackPolicyURL = stackPolicyURL;
        return this;
    }
    public String getStackPolicyURL() {
        return this.stackPolicyURL;
    }

}
