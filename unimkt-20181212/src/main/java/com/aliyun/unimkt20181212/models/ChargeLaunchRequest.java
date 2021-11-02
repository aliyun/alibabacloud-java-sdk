// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class ChargeLaunchRequest extends TeaModel {
    @NameInMap("AlipayOpenId")
    public String alipayOpenId;

    @NameInMap("ChannelId")
    public String channelId;

    @NameInMap("Extra")
    public String extra;

    @NameInMap("OuterCode")
    public String outerCode;

    public static ChargeLaunchRequest build(java.util.Map<String, ?> map) throws Exception {
        ChargeLaunchRequest self = new ChargeLaunchRequest();
        return TeaModel.build(map, self);
    }

    public ChargeLaunchRequest setAlipayOpenId(String alipayOpenId) {
        this.alipayOpenId = alipayOpenId;
        return this;
    }
    public String getAlipayOpenId() {
        return this.alipayOpenId;
    }

    public ChargeLaunchRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public ChargeLaunchRequest setExtra(String extra) {
        this.extra = extra;
        return this;
    }
    public String getExtra() {
        return this.extra;
    }

    public ChargeLaunchRequest setOuterCode(String outerCode) {
        this.outerCode = outerCode;
        return this;
    }
    public String getOuterCode() {
        return this.outerCode;
    }

}
