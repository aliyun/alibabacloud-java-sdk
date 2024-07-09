// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class UpdateSyncEcsHostTaskRequest extends TeaModel {
    /**
     * <p>The language.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The information about regions to be synchronized.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Region")
    public java.util.List<UpdateSyncEcsHostTaskRequestRegion> region;

    /**
     * <p>The state of the task. Valid values:</p>
     * <ul>
     * <li>ON</li>
     * <li>OFF</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ON</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The zone ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test79afafec***********1d28f7889c</p>
     */
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
        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The Alibaba Cloud account to which the region belongs. This parameter is used in cross-account synchronization scenarios.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890</p>
         */
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
