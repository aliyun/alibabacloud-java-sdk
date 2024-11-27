// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ModifyInstanceTwoFactorRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable two-factor authentication. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: yes</li>
     * <li><strong>false</strong>: no</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableTwoFactor")
    public String enableTwoFactor;

    /**
     * <p>The ID of the bastion host.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to query the ID of the bastion host.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bastionhost-cn-st220aw****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region ID of the bastion host.</p>
     * <blockquote>
     * <p>For more information about the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The duration within which two-factor authentication is not required after a user passes two-factor authentication. Valid values: 0 to 168. Unit: hours. If you set this parameter to 0, the user must pass two-factor authentication every time the user logs on to the bastion host.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SkipTwoFactorTime")
    public String skipTwoFactorTime;

    /**
     * <p>The method used to send a verification code for two-factor authentication. If EnableTwoFactor is set to true, you must specify at least one method. Valid values:</p>
     * <ul>
     * <li><strong>sms:</strong> text message.</li>
     * <li><strong>email</strong>: email.</li>
     * <li><strong>dingtalk</strong>: notice in DingTalk.</li>
     * <li><strong>totp</strong>: one-time password (OTP) token.</li>
     * <li><strong>gmusbkey</strong>: SM-based USB key.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[&quot;sms&quot;]</p>
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
