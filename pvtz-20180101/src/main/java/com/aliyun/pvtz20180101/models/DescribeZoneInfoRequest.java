// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DescribeZoneInfoRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>Zone ID。</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static DescribeZoneInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeZoneInfoRequest self = new DescribeZoneInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeZoneInfoRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeZoneInfoRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
