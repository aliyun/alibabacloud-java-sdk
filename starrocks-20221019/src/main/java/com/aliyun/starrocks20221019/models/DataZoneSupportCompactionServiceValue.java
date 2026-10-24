// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class DataZoneSupportCompactionServiceValue extends TeaModel {
    /**
     * <p>The zone ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-*******n-f</p>
     */
    @NameInMap("zoneId")
    public String zoneId;

    /**
     * <p>The resource level.</p>
     * 
     * <strong>example:</strong>
     * <p>MEDIUM</p>
     */
    @NameInMap("resourceLevel")
    public String resourceLevel;

    /**
     * <p>Indicates whether the configuration is recommended.</p>
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
