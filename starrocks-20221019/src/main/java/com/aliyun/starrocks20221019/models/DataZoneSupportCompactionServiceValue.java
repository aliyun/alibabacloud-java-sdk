// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class DataZoneSupportCompactionServiceValue extends TeaModel {
    /**
     * <p>The availability zone ID.</p>
     */
    @NameInMap("zoneId")
    public String zoneId;

    /**
     * <p>The resource level.</p>
     */
    @NameInMap("resourceLevel")
    public String resourceLevel;

    /**
     * <p>Indicates whether this is the recommended option.</p>
     */
    @NameInMap("recommended")
    public Boolean recommended;

    public static DataZoneSupportCompactionServiceValue build(java.util.Map<String, ?> map) throws Exception {
        DataZoneSupportCompactionServiceValue self = new DataZoneSupportCompactionServiceValue();
        return TeaModel.build(map, self);
    }

    public DataZoneSupportCompactionServiceValue setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public DataZoneSupportCompactionServiceValue setResourceLevel(String resourceLevel) {
        this.resourceLevel = resourceLevel;
        return this;
    }
    public String getResourceLevel() {
        return this.resourceLevel;
    }

    public DataZoneSupportCompactionServiceValue setRecommended(Boolean recommended) {
        this.recommended = recommended;
        return this;
    }
    public Boolean getRecommended() {
        return this.recommended;
    }

}
