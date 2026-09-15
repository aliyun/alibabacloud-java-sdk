// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListAssetInfoPublishResponseBody extends TeaModel {
    /**
     * <p>The server list information.</p>
     */
    @NameInMap("AssetList")
    public java.util.List<ListAssetInfoPublishResponseBodyAssetList> assetList;

    /**
     * <p>The ID of the request. The ID is a unique identifier that Alibaba Cloud generates for the request. You can use the ID to troubleshoot issues.</p>
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
         * <p>The current client version.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.8</p>
         */
        @NameInMap("CurVersion")
        public String curVersion;

        /**
         * <p>The time of the last upgrade. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1724522400000</p>
         */
        @NameInMap("LastUpgradeTime")
        public Long lastUpgradeTime;

        /**
         * <p>The client release status. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Not started.</li>
         * <li><strong>1</strong>: Publishing.</li>
         * <li><strong>2</strong>: Publishing completed.</li>
         * <li><strong>3</strong>: Publishing paused.</li>
         * <li><strong>4</strong>: Force upgrading.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>Indicates whether the upgrade is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Enabled.</li>
         * <li><strong>false</strong>: Not enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("UpgradeEnable")
        public Boolean upgradeEnable;

        /**
         * <p>The UUID of the Security Center asset.</p>
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
