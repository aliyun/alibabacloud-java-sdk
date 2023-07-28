// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class UpdateApplicationShrinkRequest extends TeaModel {
    @NameInMap("AlarmConfig")
    public String alarmConfigShrink;

    @NameInMap("DeleteAlarmRulesBeforeUpdate")
    public Boolean deleteAlarmRulesBeforeUpdate;

    /**
     * <p>The description to be updated for the application.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The application name.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The region ID. Set the value to cn-hangzhou.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tags")
    public String tagsShrink;

    public static UpdateApplicationShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateApplicationShrinkRequest self = new UpdateApplicationShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateApplicationShrinkRequest setAlarmConfigShrink(String alarmConfigShrink) {
        this.alarmConfigShrink = alarmConfigShrink;
        return this;
    }
    public String getAlarmConfigShrink() {
        return this.alarmConfigShrink;
    }

    public UpdateApplicationShrinkRequest setDeleteAlarmRulesBeforeUpdate(Boolean deleteAlarmRulesBeforeUpdate) {
        this.deleteAlarmRulesBeforeUpdate = deleteAlarmRulesBeforeUpdate;
        return this;
    }
    public Boolean getDeleteAlarmRulesBeforeUpdate() {
        return this.deleteAlarmRulesBeforeUpdate;
    }

    public UpdateApplicationShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateApplicationShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateApplicationShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateApplicationShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

}
