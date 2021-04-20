// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class SetAiotStorageInfoShrinkRequest extends TeaModel {
    @NameInMap("EventAlarmMq")
    public String eventAlarmMqShrink;

    @NameInMap("EventAlarmPictureStorage")
    public String eventAlarmPictureStorageShrink;

    public static SetAiotStorageInfoShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SetAiotStorageInfoShrinkRequest self = new SetAiotStorageInfoShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SetAiotStorageInfoShrinkRequest setEventAlarmMqShrink(String eventAlarmMqShrink) {
        this.eventAlarmMqShrink = eventAlarmMqShrink;
        return this;
    }
    public String getEventAlarmMqShrink() {
        return this.eventAlarmMqShrink;
    }

    public SetAiotStorageInfoShrinkRequest setEventAlarmPictureStorageShrink(String eventAlarmPictureStorageShrink) {
        this.eventAlarmPictureStorageShrink = eventAlarmPictureStorageShrink;
        return this;
    }
    public String getEventAlarmPictureStorageShrink() {
        return this.eventAlarmPictureStorageShrink;
    }

}
