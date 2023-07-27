// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class RtcConfiguration extends TeaModel {
    @NameInMap("ID")
    public String ID;

    @NameInMap("RTC")
    public RTC RTC;

    public static RtcConfiguration build(java.util.Map<String, ?> map) throws Exception {
        RtcConfiguration self = new RtcConfiguration();
        return TeaModel.build(map, self);
    }

    public RtcConfiguration setID(String ID) {
        this.ID = ID;
        return this;
    }
    public String getID() {
        return this.ID;
    }

    public RtcConfiguration setRTC(RTC RTC) {
        this.RTC = RTC;
        return this;
    }
    public RTC getRTC() {
        return this.RTC;
    }

}
