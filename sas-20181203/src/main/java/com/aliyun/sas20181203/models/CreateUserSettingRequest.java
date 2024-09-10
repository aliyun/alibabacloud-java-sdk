// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateUserSettingRequest extends TeaModel {
    /**
     * <p>The severities of alerts.</p>
     * 
     * <strong>example:</strong>
     * <p>high,low</p>
     */
    @NameInMap("AlertLevels")
    public String alertLevels;

    /**
     * <p>The number of days during which you want to retain invalid alerts.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("InvalidWarningKeepDays")
    public Integer invalidWarningKeepDays;

    /**
     * <p>The source IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>112.48.16.***</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    public static CreateUserSettingRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUserSettingRequest self = new CreateUserSettingRequest();
        return TeaModel.build(map, self);
    }

    public CreateUserSettingRequest setAlertLevels(String alertLevels) {
        this.alertLevels = alertLevels;
        return this;
    }
    public String getAlertLevels() {
        return this.alertLevels;
    }

    public CreateUserSettingRequest setInvalidWarningKeepDays(Integer invalidWarningKeepDays) {
        this.invalidWarningKeepDays = invalidWarningKeepDays;
        return this;
    }
    public Integer getInvalidWarningKeepDays() {
        return this.invalidWarningKeepDays;
    }

    public CreateUserSettingRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
