// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetCurrentVersionPublishResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public GetCurrentVersionPublishResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1383B0DB-D5D6-4B0C-9E6B-75939C8E67FE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetCurrentVersionPublishResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCurrentVersionPublishResponseBody self = new GetCurrentVersionPublishResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCurrentVersionPublishResponseBody setData(GetCurrentVersionPublishResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetCurrentVersionPublishResponseBodyData getData() {
        return this.data;
    }

    public GetCurrentVersionPublishResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetCurrentVersionPublishResponseBodyData extends TeaModel {
        /**
         * <p>Indicates whether automatic upgrade is enabled. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: yes.</li>
         * <li><strong>0</strong>: no.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AutoUpgrade")
        public Integer autoUpgrade;

        /**
         * <p>Indicates whether you can enable custom upgrade for the Security Center agent. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("BigCustomer")
        public Boolean bigCustomer;

        /**
         * <p>The version of the Security Center agent.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.8</p>
         */
        @NameInMap("CurVersion")
        public String curVersion;

        /**
         * <p>The timestamp when the Security Center agent was forcibly upgraded.</p>
         * 
         * <strong>example:</strong>
         * <p>1732506308000</p>
         */
        @NameInMap("ForceUpgradeTime")
        public Long forceUpgradeTime;

        /**
         * <p>Indicates whether the canary release policy is enabled. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: yes.</li>
         * <li>.<strong>0</strong>: no.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("GraySwitchStatus")
        public Integer graySwitchStatus;

        /**
         * <p>The latest version of the Security Center agent.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.9</p>
         */
        @NameInMap("LatestVersion")
        public String latestVersion;

        /**
         * <p>The timestamp when the latest version of the Security Center agent was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1662639150000</p>
         */
        @NameInMap("LatestVersionCreate")
        public Long latestVersionCreate;

        /**
         * <p>The description of about the latest version.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("LatestVersionDesc")
        public String latestVersionDesc;

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
         * <p>1</p>
         */
        @NameInMap("PublishStatus")
        public Integer publishStatus;

        /**
         * <p>The destination version of the Security Center agent.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.9</p>
         */
        @NameInMap("UpgradeVersion")
        public String upgradeVersion;

        public static GetCurrentVersionPublishResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCurrentVersionPublishResponseBodyData self = new GetCurrentVersionPublishResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCurrentVersionPublishResponseBodyData setAutoUpgrade(Integer autoUpgrade) {
            this.autoUpgrade = autoUpgrade;
            return this;
        }
        public Integer getAutoUpgrade() {
            return this.autoUpgrade;
        }

        public GetCurrentVersionPublishResponseBodyData setBigCustomer(Boolean bigCustomer) {
            this.bigCustomer = bigCustomer;
            return this;
        }
        public Boolean getBigCustomer() {
            return this.bigCustomer;
        }

        public GetCurrentVersionPublishResponseBodyData setCurVersion(String curVersion) {
            this.curVersion = curVersion;
            return this;
        }
        public String getCurVersion() {
            return this.curVersion;
        }

        public GetCurrentVersionPublishResponseBodyData setForceUpgradeTime(Long forceUpgradeTime) {
            this.forceUpgradeTime = forceUpgradeTime;
            return this;
        }
        public Long getForceUpgradeTime() {
            return this.forceUpgradeTime;
        }

        public GetCurrentVersionPublishResponseBodyData setGraySwitchStatus(Integer graySwitchStatus) {
            this.graySwitchStatus = graySwitchStatus;
            return this;
        }
        public Integer getGraySwitchStatus() {
            return this.graySwitchStatus;
        }

        public GetCurrentVersionPublishResponseBodyData setLatestVersion(String latestVersion) {
            this.latestVersion = latestVersion;
            return this;
        }
        public String getLatestVersion() {
            return this.latestVersion;
        }

        public GetCurrentVersionPublishResponseBodyData setLatestVersionCreate(Long latestVersionCreate) {
            this.latestVersionCreate = latestVersionCreate;
            return this;
        }
        public Long getLatestVersionCreate() {
            return this.latestVersionCreate;
        }

        public GetCurrentVersionPublishResponseBodyData setLatestVersionDesc(String latestVersionDesc) {
            this.latestVersionDesc = latestVersionDesc;
            return this;
        }
        public String getLatestVersionDesc() {
            return this.latestVersionDesc;
        }

        public GetCurrentVersionPublishResponseBodyData setPublishStatus(Integer publishStatus) {
            this.publishStatus = publishStatus;
            return this;
        }
        public Integer getPublishStatus() {
            return this.publishStatus;
        }

        public GetCurrentVersionPublishResponseBodyData setUpgradeVersion(String upgradeVersion) {
            this.upgradeVersion = upgradeVersion;
            return this;
        }
        public String getUpgradeVersion() {
            return this.upgradeVersion;
        }

    }

}
