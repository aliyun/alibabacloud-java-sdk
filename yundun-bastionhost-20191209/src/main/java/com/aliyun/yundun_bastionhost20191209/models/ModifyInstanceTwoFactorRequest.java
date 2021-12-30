// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ModifyInstanceTwoFactorRequest extends TeaModel {
    @NameInMap("DingTalkConfig")
    public String dingTalkConfig;

    @NameInMap("EnableTwoFactor")
    public String enableTwoFactor;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("MessageLanguage")
    public String messageLanguage;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SkipTwoFactorTime")
    public String skipTwoFactorTime;

    @NameInMap("TwoFactorMethods")
    public String twoFactorMethods;

    public static ModifyInstanceTwoFactorRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceTwoFactorRequest self = new ModifyInstanceTwoFactorRequest();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceTwoFactorRequest setDingTalkConfig(String dingTalkConfig) {
        this.dingTalkConfig = dingTalkConfig;
        return this;
    }
    public String getDingTalkConfig() {
        return this.dingTalkConfig;
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

    public ModifyInstanceTwoFactorRequest setMessageLanguage(String messageLanguage) {
        this.messageLanguage = messageLanguage;
        return this;
    }
    public String getMessageLanguage() {
        return this.messageLanguage;
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
