// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_push20220225.models;

import com.aliyun.tea.*;

public class ChannelProperties extends TeaModel {
    @NameInMap("channelActivity")
    public String channelActivity;

    @NameInMap("mainActivity")
    public String mainActivity;

    @NameInMap("oppoChannelId")
    public String oppoChannelId;

    @NameInMap("vivoClassification")
    public String vivoClassification;

    @NameInMap("xiaomiChannelId")
    public String xiaomiChannelId;

    public static ChannelProperties build(java.util.Map<String, ?> map) throws Exception {
        ChannelProperties self = new ChannelProperties();
        return TeaModel.build(map, self);
    }

    public ChannelProperties setChannelActivity(String channelActivity) {
        this.channelActivity = channelActivity;
        return this;
    }
    public String getChannelActivity() {
        return this.channelActivity;
    }

    public ChannelProperties setMainActivity(String mainActivity) {
        this.mainActivity = mainActivity;
        return this;
    }
    public String getMainActivity() {
        return this.mainActivity;
    }

    public ChannelProperties setOppoChannelId(String oppoChannelId) {
        this.oppoChannelId = oppoChannelId;
        return this;
    }
    public String getOppoChannelId() {
        return this.oppoChannelId;
    }

    public ChannelProperties setVivoClassification(String vivoClassification) {
        this.vivoClassification = vivoClassification;
        return this;
    }
    public String getVivoClassification() {
        return this.vivoClassification;
    }

    public ChannelProperties setXiaomiChannelId(String xiaomiChannelId) {
        this.xiaomiChannelId = xiaomiChannelId;
        return this;
    }
    public String getXiaomiChannelId() {
        return this.xiaomiChannelId;
    }

}
