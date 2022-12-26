// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class SaveSuspEventUserSettingRequest extends TeaModel {
    @NameInMap("From")
    public String from;

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
