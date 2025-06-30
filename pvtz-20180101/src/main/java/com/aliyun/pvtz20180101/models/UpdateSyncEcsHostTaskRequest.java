// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class UpdateSyncEcsHostTaskRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li>zh: Chinese</li>
     * <li>en: English</li>
     * </ul>
     * <p>Default value: en.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The regions to be synchronized.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Region")
    public java.util.List<UpdateSyncEcsHostTaskRequestRegion> region;

    /**
     * <p>The state of the hostname synchronization task. Valid values:</p>
     * <ul>
     * <li>ON: The task is started.</li>
     * <li>OFF: The task is ended.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ON</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The zone ID. This ID uniquely identifies the zone.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>df2d03865266bd9842306db586d3****</p>
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
         * <p>The user ID to which the region belongs. This parameter is used in cross-account synchronization scenarios.</p>
         * 
         * <strong>example:</strong>
         * <p>141339776561****</p>
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
