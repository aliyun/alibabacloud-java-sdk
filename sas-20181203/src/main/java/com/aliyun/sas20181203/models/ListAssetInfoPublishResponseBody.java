// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListAssetInfoPublishResponseBody extends TeaModel {
    /**
     * <p>The servers.</p>
     */
    @NameInMap("AssetList")
    public java.util.List<ListAssetInfoPublishResponseBodyAssetList> assetList;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3956048F-9D73-5EDB-834B-4827BB483977</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListAssetInfoPublishResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAssetInfoPublishResponseBody self = new ListAssetInfoPublishResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAssetInfoPublishResponseBody setAssetList(java.util.List<ListAssetInfoPublishResponseBodyAssetList> assetList) {
        this.assetList = assetList;
        return this;
    }
    public java.util.List<ListAssetInfoPublishResponseBodyAssetList> getAssetList() {
        return this.assetList;
    }

    public ListAssetInfoPublishResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAssetInfoPublishResponseBodyAssetList extends TeaModel {
        /**
         * <p>The version of the Security Center agent.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.8</p>
         */
        @NameInMap("CurVersion")
        public String curVersion;

        /**
         * <p>The time when the Security Center agent was last upgraded.</p>
         * 
         * <strong>example:</strong>
         * <p>1724522400000</p>
         */
        @NameInMap("LastUpgradeTime")
        public Long lastUpgradeTime;

        /**
         * <p>The publish status of the Security Center agent. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: not started.</li>
         * <li><strong>1</strong>: publishing.</li>
         * <li><strong>2</strong>: published.</li>
         * <li><strong>3</strong>: publish suspended.</li>
         * <li><strong>4</strong>: forcibly upgrading.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>Indicates whether automatic upgrade is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("UpgradeEnable")
        public Boolean upgradeEnable;

        /**
         * <p>The UUID of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>2a98f149-0256-414c-a29a-a69f8a75****</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        public static ListAssetInfoPublishResponseBodyAssetList build(java.util.Map<String, ?> map) throws Exception {
            ListAssetInfoPublishResponseBodyAssetList self = new ListAssetInfoPublishResponseBodyAssetList();
            return TeaModel.build(map, self);
        }

        public ListAssetInfoPublishResponseBodyAssetList setCurVersion(String curVersion) {
            this.curVersion = curVersion;
            return this;
        }
        public String getCurVersion() {
            return this.curVersion;
        }

        public ListAssetInfoPublishResponseBodyAssetList setLastUpgradeTime(Long lastUpgradeTime) {
            this.lastUpgradeTime = lastUpgradeTime;
            return this;
        }
        public Long getLastUpgradeTime() {
            return this.lastUpgradeTime;
        }

        public ListAssetInfoPublishResponseBodyAssetList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListAssetInfoPublishResponseBodyAssetList setUpgradeEnable(Boolean upgradeEnable) {
            this.upgradeEnable = upgradeEnable;
            return this;
        }
        public Boolean getUpgradeEnable() {
            return this.upgradeEnable;
        }

        public ListAssetInfoPublishResponseBodyAssetList setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
