// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class SaveSuspEventUserSettingRequest extends TeaModel {
    /**
     * <p>The data source of the exception. Set the value to sas.</p>
     * 
     * <strong>example:</strong>
     * <p>sas</p>
     */
    @NameInMap("From")
    public String from;

    /**
     * <p>The severities of alert notifications. Valid values:</p>
     * <ul>
     * <li><strong>remind</strong></li>
     * <li><strong>suspicious</strong></li>
     * <li><strong>serious</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>suspicious,serious,remind</p>
     */
    @NameInMap("LevelsOn")
    public String levelsOn;

    public static SaveSuspEventUserSettingRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveSuspEventUserSettingRequest self = new SaveSuspEventUserSettingRequest();
        return TeaModel.build(map, self);
    }

    public SaveSuspEventUserSettingRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public SaveSuspEventUserSettingRequest setLevelsOn(String levelsOn) {
        this.levelsOn = levelsOn;
        return this;
    }
    public String getLevelsOn() {
        return this.levelsOn;
    }

}
