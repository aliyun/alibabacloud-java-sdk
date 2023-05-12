// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class UpdateSyncEcsHostTaskRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("Region")
    public java.util.List<UpdateSyncEcsHostTaskRequestRegion> region;

    @NameInMap("Status")
    public String status;

    @NameInMap("ZoneId")
    public String zoneId;

    public static UpdateSyncEcsHostTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSyncEcsHostTaskRequest self = new UpdateSyncEcsHostTaskRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSyncEcsHostTaskRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateSyncEcsHostTaskRequest setRegion(java.util.List<UpdateSyncEcsHostTaskRequestRegion> region) {
        this.region = region;
        return this;
    }
    public java.util.List<UpdateSyncEcsHostTaskRequestRegion> getRegion() {
        return this.region;
    }

    public UpdateSyncEcsHostTaskRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdateSyncEcsHostTaskRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class UpdateSyncEcsHostTaskRequestRegion extends TeaModel {
        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("UserId")
        public Long userId;

        public static UpdateSyncEcsHostTaskRequestRegion build(java.util.Map<String, ?> map) throws Exception {
            UpdateSyncEcsHostTaskRequestRegion self = new UpdateSyncEcsHostTaskRequestRegion();
            return TeaModel.build(map, self);
        }

        public UpdateSyncEcsHostTaskRequestRegion setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public UpdateSyncEcsHostTaskRequestRegion setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

    }

}
