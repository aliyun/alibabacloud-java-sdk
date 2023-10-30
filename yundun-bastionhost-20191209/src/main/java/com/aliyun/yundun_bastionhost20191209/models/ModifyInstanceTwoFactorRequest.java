// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ModifyInstanceTwoFactorRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable two-factor authentication. Valid values:</p>
     * <br>
     * <p>*   **true**: enables two-factor authentication.</p>
     * <p>*   **false**: disables two-factor authentication.</p>
     */
    @NameInMap("EnableTwoFactor")
    public String enableTwoFactor;

    /**
     * <p>The ID of the bastion host.</p>
     * <br>
     * <p>>  You can call the [DescribeInstances](~~153281~~) operation to query the ID of the bastion host.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region ID of the bastion host.</p>
     * <br>
     * <p>>  For more information about the mapping between region IDs and region names, see [Regions and zones](~~40654~~).</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("SkipTwoFactorTime")
    public String skipTwoFactorTime;

    /**
     * <p>One or more methods that are used to send a verification code if two-factor authentication is enabled. If you set the EnableTwoFactor parameter to true, you must specify at least one method. Valid values:</p>
     * <br>
     * <p>*   **sms**: text message</p>
     * <p>*   **email**: email</p>
     * <p>*   **dingtalk**: Notice in DingTalk</p>
     */
    @NameInMap("TwoFactorMethods")
    public String twoFactorMethods;

    public static ModifyInstanceTwoFactorRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceTwoFactorRequest self = new ModifyInstanceTwoFactorRequest();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceTwoFactorRequest setEnableTwoFactor(String enableTwoFactor) {
        this.enableTwoFactor = enableTwoFactor;
        return this;
    }
    public String getEnableTwoFactor() {
        return this.enableTwoFactor;
    }

    public ModifyInstanceTwoFactorRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyInstanceTwoFactorRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyInstanceTwoFactorRequest setSkipTwoFactorTime(String skipTwoFactorTime) {
        this.skipTwoFactorTime = skipTwoFactorTime;
        return this;
    }
    public String getSkipTwoFactorTime() {
        return this.skipTwoFactorTime;
    }

    public ModifyInstanceTwoFactorRequest setTwoFactorMethods(String twoFactorMethods) {
        this.twoFactorMethods = twoFactorMethods;
        return this;
    }
    public String getTwoFactorMethods() {
        return this.twoFactorMethods;
    }

}
