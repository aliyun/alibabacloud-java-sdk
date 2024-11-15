// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_push20220225.models;

import com.aliyun.tea.*;

public class ChannelProperties extends TeaModel {
    @NameInMap("channelActivity")
    public String channelActivity;

    @NameInMap("channelFcm")
    public String channelFcm;

    @NameInMap("huaweiChannelCategory")
    public String huaweiChannelCategory;

    @NameInMap("huaweiChannelImportance")
    public String huaweiChannelImportance;

    /**
     * <strong>example:</strong>
     * <p>取值为&quot;NORMAL&quot;和&quot;HIGH&quot;,默认为”NORMAL”</p>
     */
    @NameInMap("huaweiMessageUrgency")
    public String huaweiMessageUrgency;

    @NameInMap("mainActivity")
    public String mainActivity;

    @NameInMap("oppoCategory")
    public String oppoCategory;

    @NameInMap("oppoChannelId")
    public String oppoChannelId;

    @NameInMap("oppoNotifyLevel")
    public String oppoNotifyLevel;

    /**
     * <strong>example:</strong>
     * <p>&quot;true&quot; ,默认为&quot;false&quot;，可不填</p>
     */
    @NameInMap("useHuaweiMessage")
    public String useHuaweiMessage;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("useHuaweiPlainMessage")
    public String useHuaweiPlainMessage;

    /**
     * <strong>example:</strong>
     * <p>&quot;true&quot;,默认&quot;false&quot;</p>
     */
    @NameInMap("vivoAddBadge")
    public String vivoAddBadge;

    @NameInMap("vivoCategory")
    public String vivoCategory;

    @NameInMap("vivoPushMode")
    public String vivoPushMode;

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

    public ChannelProperties setChannelFcm(String channelFcm) {
        this.channelFcm = channelFcm;
        return this;
    }
    public String getChannelFcm() {
        return this.channelFcm;
    }

    public ChannelProperties setHuaweiChannelCategory(String huaweiChannelCategory) {
        this.huaweiChannelCategory = huaweiChannelCategory;
        return this;
    }
    public String getHuaweiChannelCategory() {
        return this.huaweiChannelCategory;
    }

    public ChannelProperties setHuaweiChannelImportance(String huaweiChannelImportance) {
        this.huaweiChannelImportance = huaweiChannelImportance;
        return this;
    }
    public String getHuaweiChannelImportance() {
        return this.huaweiChannelImportance;
    }

    public ChannelProperties setHuaweiMessageUrgency(String huaweiMessageUrgency) {
        this.huaweiMessageUrgency = huaweiMessageUrgency;
        return this;
    }
    public String getHuaweiMessageUrgency() {
        return this.huaweiMessageUrgency;
    }

    public ChannelProperties setMainActivity(String mainActivity) {
        this.mainActivity = mainActivity;
        return this;
    }
    public String getMainActivity() {
        return this.mainActivity;
    }

    public ChannelProperties setOppoCategory(String oppoCategory) {
        this.oppoCategory = oppoCategory;
        return this;
    }
    public String getOppoCategory() {
        return this.oppoCategory;
    }

    public ChannelProperties setOppoChannelId(String oppoChannelId) {
        this.oppoChannelId = oppoChannelId;
        return this;
    }
    public String getOppoChannelId() {
        return this.oppoChannelId;
    }

    public ChannelProperties setOppoNotifyLevel(String oppoNotifyLevel) {
        this.oppoNotifyLevel = oppoNotifyLevel;
        return this;
    }
    public String getOppoNotifyLevel() {
        return this.oppoNotifyLevel;
    }

    public ChannelProperties setUseHuaweiMessage(String useHuaweiMessage) {
        this.useHuaweiMessage = useHuaweiMessage;
        return this;
    }
    public String getUseHuaweiMessage() {
        return this.useHuaweiMessage;
    }

    public ChannelProperties setUseHuaweiPlainMessage(String useHuaweiPlainMessage) {
        this.useHuaweiPlainMessage = useHuaweiPlainMessage;
        return this;
    }
    public String getUseHuaweiPlainMessage() {
        return this.useHuaweiPlainMessage;
    }

    public ChannelProperties setVivoAddBadge(String vivoAddBadge) {
        this.vivoAddBadge = vivoAddBadge;
        return this;
    }
    public String getVivoAddBadge() {
        return this.vivoAddBadge;
    }

    public ChannelProperties setVivoCategory(String vivoCategory) {
        this.vivoCategory = vivoCategory;
        return this;
    }
    public String getVivoCategory() {
        return this.vivoCategory;
    }

    public ChannelProperties setVivoPushMode(String vivoPushMode) {
        this.vivoPushMode = vivoPushMode;
        return this;
    }
    public String getVivoPushMode() {
        return this.vivoPushMode;
    }

    public ChannelProperties setXiaomiChannelId(String xiaomiChannelId) {
        this.xiaomiChannelId = xiaomiChannelId;
        return this;
    }
    public String getXiaomiChannelId() {
        return this.xiaomiChannelId;
    }

}
