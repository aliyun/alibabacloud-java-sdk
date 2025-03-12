// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetAuthSummaryResponseBody extends TeaModel {
    /**
     * <p>Indicates whether you can purchase protection quota on demand when you purchase Security Center. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: no</li>
     * <li><strong>1</strong>: yes</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AllowPartialBuy")
    public Integer allowPartialBuy;

    /**
     * <p>Indicates whether you can purchase protection quota on demand after an upgrade. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: no</li>
     * <li><strong>1</strong>: yes</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AllowUpgradePartialBuy")
    public Integer allowUpgradePartialBuy;

    /**
     * <p>Indicates whether all bound assets can be immediately unbound. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: no</li>
     * <li><strong>1</strong>: yes</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AllowUserUnbind")
    public Integer allowUserUnbind;

    /**
     * <p>Indicates whether automatic binding is enabled. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: disabled</li>
     * <li><strong>1</strong>: enabled</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AutoBind")
    public Integer autoBind;

    /**
     * <p>Indicates whether the protection quota is supported for all assets. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: no</li>
     * <li><strong>1</strong>: yes</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DefaultAuthToAll")
    public Integer defaultAuthToAll;

    /**
     * <p>Indicates whether pre-bound assets exist. If you select assets to bind when you purchase Security Center, pre-bound assets exist. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: no</li>
     * <li><strong>1</strong>: yes</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("HasPreBindSetting")
    public Boolean hasPreBindSetting;

    /**
     * <p>The most advanced edition that is used. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: Basic edition</li>
     * <li><strong>3</strong>: Enterprise edition</li>
     * <li><strong>5</strong>: Advanced edition</li>
     * <li><strong>6</strong>: Anti-virus edition</li>
     * <li><strong>7</strong>: Ultimate edition</li>
     * <li><strong>10</strong>: Value-added Plan edition</li>
     * </ul>
     * <blockquote>
     * <p> If you purchase Security Center Multi-edition, the value indicates the most advanced edition that is used. Otherwise, the value indicates the specific edition that is purchased.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("HighestVersion")
    public Integer highestVersion;

    /**
     * <p>Indicates whether Security Center Multi-edition is purchased. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: no</li>
     * <li><strong>1</strong>: yes</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("IsMultiVersion")
    public Integer isMultiVersion;

    /**
     * <p>The statistics of the protection quota for assets.</p>
     */
    @NameInMap("Machine")
    public GetAuthSummaryResponseBodyMachine machine;

    /**
     * <p>Activate the pay-as-you-go service protection version for hosts and container security, which is the highest protection version among all bound hosts. Values:   - <strong>1</strong>: Free Edition  - <strong>3</strong>: Enterprise Edition - <strong>5</strong>: Advanced Edition - <strong>6</strong>: Antivirus Edition     - <strong>7</strong>: Flagship Edition</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("PostPaidHighestVersion")
    public String postPaidHighestVersion;

    /**
     * <p>The pay-as-you-go service for host and container security adds an automatic binding identifier for new hosts, with values: - <strong>0</strong>: Off - <strong>1</strong>: On</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PostPaidHostAutoBind")
    public String postPaidHostAutoBind;

    /**
     * <p>The version for the pay-as-you-go service of host and container security to automatically bind new assets, with values: - <strong>1</strong>: Free Edition - <strong>3</strong>: Enterprise Edition - <strong>5</strong>: Advanced Edition - <strong>6</strong>: Antivirus Edition - <strong>7</strong>: Flagship Edition</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("PostPaidHostAutoBindVersion")
    public String postPaidHostAutoBindVersion;

    /**
     * <p>Statistics on pay-as-you-go service authorization for host and container security.</p>
     */
    @NameInMap("PostPaidVersionSummary")
    public java.util.List<GetAuthSummaryResponseBodyPostPaidVersionSummary> postPaidVersionSummary;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0B48AB3C-***-B9270EF46038</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The quota consumption statistics.</p>
     */
    @NameInMap("VersionSummary")
    public java.util.List<GetAuthSummaryResponseBodyVersionSummary> versionSummary;

    public static GetAuthSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAuthSummaryResponseBody self = new GetAuthSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAuthSummaryResponseBody setAllowPartialBuy(Integer allowPartialBuy) {
        this.allowPartialBuy = allowPartialBuy;
        return this;
    }
    public Integer getAllowPartialBuy() {
        return this.allowPartialBuy;
    }

    public GetAuthSummaryResponseBody setAllowUpgradePartialBuy(Integer allowUpgradePartialBuy) {
        this.allowUpgradePartialBuy = allowUpgradePartialBuy;
        return this;
    }
    public Integer getAllowUpgradePartialBuy() {
        return this.allowUpgradePartialBuy;
    }

    public GetAuthSummaryResponseBody setAllowUserUnbind(Integer allowUserUnbind) {
        this.allowUserUnbind = allowUserUnbind;
        return this;
    }
    public Integer getAllowUserUnbind() {
        return this.allowUserUnbind;
    }

    public GetAuthSummaryResponseBody setAutoBind(Integer autoBind) {
        this.autoBind = autoBind;
        return this;
    }
    public Integer getAutoBind() {
        return this.autoBind;
    }

    public GetAuthSummaryResponseBody setDefaultAuthToAll(Integer defaultAuthToAll) {
        this.defaultAuthToAll = defaultAuthToAll;
        return this;
    }
    public Integer getDefaultAuthToAll() {
        return this.defaultAuthToAll;
    }

    public GetAuthSummaryResponseBody setHasPreBindSetting(Boolean hasPreBindSetting) {
        this.hasPreBindSetting = hasPreBindSetting;
        return this;
    }
    public Boolean getHasPreBindSetting() {
        return this.hasPreBindSetting;
    }

    public GetAuthSummaryResponseBody setHighestVersion(Integer highestVersion) {
        this.highestVersion = highestVersion;
        return this;
    }
    public Integer getHighestVersion() {
        return this.highestVersion;
    }

    public GetAuthSummaryResponseBody setIsMultiVersion(Integer isMultiVersion) {
        this.isMultiVersion = isMultiVersion;
        return this;
    }
    public Integer getIsMultiVersion() {
        return this.isMultiVersion;
    }

    public GetAuthSummaryResponseBody setMachine(GetAuthSummaryResponseBodyMachine machine) {
        this.machine = machine;
        return this;
    }
    public GetAuthSummaryResponseBodyMachine getMachine() {
        return this.machine;
    }

    public GetAuthSummaryResponseBody setPostPaidHighestVersion(String postPaidHighestVersion) {
        this.postPaidHighestVersion = postPaidHighestVersion;
        return this;
    }
    public String getPostPaidHighestVersion() {
        return this.postPaidHighestVersion;
    }

    public GetAuthSummaryResponseBody setPostPaidHostAutoBind(String postPaidHostAutoBind) {
        this.postPaidHostAutoBind = postPaidHostAutoBind;
        return this;
    }
    public String getPostPaidHostAutoBind() {
        return this.postPaidHostAutoBind;
    }

    public GetAuthSummaryResponseBody setPostPaidHostAutoBindVersion(String postPaidHostAutoBindVersion) {
        this.postPaidHostAutoBindVersion = postPaidHostAutoBindVersion;
        return this;
    }
    public String getPostPaidHostAutoBindVersion() {
        return this.postPaidHostAutoBindVersion;
    }

    public GetAuthSummaryResponseBody setPostPaidVersionSummary(java.util.List<GetAuthSummaryResponseBodyPostPaidVersionSummary> postPaidVersionSummary) {
        this.postPaidVersionSummary = postPaidVersionSummary;
        return this;
    }
    public java.util.List<GetAuthSummaryResponseBodyPostPaidVersionSummary> getPostPaidVersionSummary() {
        return this.postPaidVersionSummary;
    }

    public GetAuthSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAuthSummaryResponseBody setVersionSummary(java.util.List<GetAuthSummaryResponseBodyVersionSummary> versionSummary) {
        this.versionSummary = versionSummary;
        return this;
    }
    public java.util.List<GetAuthSummaryResponseBodyVersionSummary> getVersionSummary() {
        return this.versionSummary;
    }

    public static class GetAuthSummaryResponseBodyMachine extends TeaModel {
        /**
         * <p>The number of cores of the assets that are bound to Security Center.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("BindCoreCount")
        public Integer bindCoreCount;

        /**
         * <p>The number of the assets that are bound to Security Center.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("BindEcsCount")
        public Integer bindEcsCount;

        /**
         * <p>Bind the number of cores for postpaid authorization assets.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PostPaidBindCoreCount")
        public Integer postPaidBindCoreCount;

        /**
         * <p>The number of assets bound to the postpaid authorization.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PostPaidBindEcsCount")
        public Integer postPaidBindEcsCount;

        /**
         * <p>The number of cores of the assets that are at risk.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("RiskCoreCount")
        public Integer riskCoreCount;

        /**
         * <p>The number of the assets that are at risk.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("RiskEcsCount")
        public Integer riskEcsCount;

        /**
         * <p>The total number of asset cores.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalCoreCount")
        public Integer totalCoreCount;

        /**
         * <p>The total number of assets.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalEcsCount")
        public Integer totalEcsCount;

        /**
         * <p>The number of cores of unbound assets.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("UnBindCoreCount")
        public Integer unBindCoreCount;

        /**
         * <p>The number of unbound assets.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("UnBindEcsCount")
        public Integer unBindEcsCount;

        public static GetAuthSummaryResponseBodyMachine build(java.util.Map<String, ?> map) throws Exception {
            GetAuthSummaryResponseBodyMachine self = new GetAuthSummaryResponseBodyMachine();
            return TeaModel.build(map, self);
        }

        public GetAuthSummaryResponseBodyMachine setBindCoreCount(Integer bindCoreCount) {
            this.bindCoreCount = bindCoreCount;
            return this;
        }
        public Integer getBindCoreCount() {
            return this.bindCoreCount;
        }

        public GetAuthSummaryResponseBodyMachine setBindEcsCount(Integer bindEcsCount) {
            this.bindEcsCount = bindEcsCount;
            return this;
        }
        public Integer getBindEcsCount() {
            return this.bindEcsCount;
        }

        public GetAuthSummaryResponseBodyMachine setPostPaidBindCoreCount(Integer postPaidBindCoreCount) {
            this.postPaidBindCoreCount = postPaidBindCoreCount;
            return this;
        }
        public Integer getPostPaidBindCoreCount() {
            return this.postPaidBindCoreCount;
        }

        public GetAuthSummaryResponseBodyMachine setPostPaidBindEcsCount(Integer postPaidBindEcsCount) {
            this.postPaidBindEcsCount = postPaidBindEcsCount;
            return this;
        }
        public Integer getPostPaidBindEcsCount() {
            return this.postPaidBindEcsCount;
        }

        public GetAuthSummaryResponseBodyMachine setRiskCoreCount(Integer riskCoreCount) {
            this.riskCoreCount = riskCoreCount;
            return this;
        }
        public Integer getRiskCoreCount() {
            return this.riskCoreCount;
        }

        public GetAuthSummaryResponseBodyMachine setRiskEcsCount(Integer riskEcsCount) {
            this.riskEcsCount = riskEcsCount;
            return this;
        }
        public Integer getRiskEcsCount() {
            return this.riskEcsCount;
        }

        public GetAuthSummaryResponseBodyMachine setTotalCoreCount(Integer totalCoreCount) {
            this.totalCoreCount = totalCoreCount;
            return this;
        }
        public Integer getTotalCoreCount() {
            return this.totalCoreCount;
        }

        public GetAuthSummaryResponseBodyMachine setTotalEcsCount(Integer totalEcsCount) {
            this.totalEcsCount = totalEcsCount;
            return this;
        }
        public Integer getTotalEcsCount() {
            return this.totalEcsCount;
        }

        public GetAuthSummaryResponseBodyMachine setUnBindCoreCount(Integer unBindCoreCount) {
            this.unBindCoreCount = unBindCoreCount;
            return this;
        }
        public Integer getUnBindCoreCount() {
            return this.unBindCoreCount;
        }

        public GetAuthSummaryResponseBodyMachine setUnBindEcsCount(Integer unBindEcsCount) {
            this.unBindEcsCount = unBindEcsCount;
            return this;
        }
        public Integer getUnBindEcsCount() {
            return this.unBindEcsCount;
        }

    }

    public static class GetAuthSummaryResponseBodyPostPaidVersionSummary extends TeaModel {
        /**
         * <p>The type of authorization consumed during binding, with values: - <strong>ASSET</strong>: Consumes the number of authorized devices - <strong>CORE</strong>: Consumes the number of authorized cores - <strong>ASSET_AND_CORE</strong>: Consumes both the number of authorized devices and cores.</p>
         * 
         * <strong>example:</strong>
         * <p>ASSET</p>
         */
        @NameInMap("AuthBindType")
        public String authBindType;

        /**
         * <p>Current version index, the higher the number, the newer the version, used for sorting. Values: - <strong>1</strong>: Free Edition - <strong>2</strong>: Anti-virus Edition - <strong>3</strong>: Advanced Edition - <strong>4</strong>: Enterprise Edition - <strong>5</strong>: Flagship Edition</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Index")
        public Integer index;

        /**
         * <p>Number of authorized cores used. &gt; This parameter is valid when AuthBindType is set to CORE or ASSET_AND_CORE.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("UsedCoreCount")
        public Long usedCoreCount;

        /**
         * <p>Number of authorized devices used. &gt; This parameter is valid when AuthBindType is ASSET or ASSET_AND_CORE.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("UsedEcsCount")
        public Long usedEcsCount;

        /**
         * <p>Bound host assets with postpaid versions, values:   - <strong>1</strong>: Free version  - <strong>3</strong>: Enterprise version - <strong>5</strong>: Advanced version - <strong>6</strong>: Anti-virus version     - <strong>7</strong>: Flagship version</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Version")
        public Integer version;

        public static GetAuthSummaryResponseBodyPostPaidVersionSummary build(java.util.Map<String, ?> map) throws Exception {
            GetAuthSummaryResponseBodyPostPaidVersionSummary self = new GetAuthSummaryResponseBodyPostPaidVersionSummary();
            return TeaModel.build(map, self);
        }

        public GetAuthSummaryResponseBodyPostPaidVersionSummary setAuthBindType(String authBindType) {
            this.authBindType = authBindType;
            return this;
        }
        public String getAuthBindType() {
            return this.authBindType;
        }

        public GetAuthSummaryResponseBodyPostPaidVersionSummary setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public GetAuthSummaryResponseBodyPostPaidVersionSummary setUsedCoreCount(Long usedCoreCount) {
            this.usedCoreCount = usedCoreCount;
            return this;
        }
        public Long getUsedCoreCount() {
            return this.usedCoreCount;
        }

        public GetAuthSummaryResponseBodyPostPaidVersionSummary setUsedEcsCount(Long usedEcsCount) {
            this.usedEcsCount = usedEcsCount;
            return this;
        }
        public Long getUsedEcsCount() {
            return this.usedEcsCount;
        }

        public GetAuthSummaryResponseBodyPostPaidVersionSummary setVersion(Integer version) {
            this.version = version;
            return this;
        }
        public Integer getVersion() {
            return this.version;
        }

    }

    public static class GetAuthSummaryResponseBodyVersionSummary extends TeaModel {
        /**
         * <p>The type of the quota that is consumed. Valid values:</p>
         * <ul>
         * <li>ASSET: quota of servers.</li>
         * <li>CORE: quota of server cores.</li>
         * <li>ASSET_AND_CORE: both.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ASSET</p>
         */
        @NameInMap("AuthBindType")
        public String authBindType;

        /**
         * <p>The index of the current edition. The smaller the value, the higher the edition. The index is used for sorting.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Index")
        public Integer index;

        /**
         * <p>The total quota of server cores.</p>
         * <blockquote>
         * <p> This parameter takes effect only if AuthBindType is set to CORE or ASSET_AND_CORE.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalCoreAuthCount")
        public Integer totalCoreAuthCount;

        /**
         * <p>The total quota of servers in the current edition.</p>
         * <blockquote>
         * <p> This parameter takes effect only if AuthBindType is set to ASSET or ASSET_AND_CORE.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        /**
         * <p>The total quota of servers.</p>
         * <blockquote>
         * <p> This parameter takes effect only if AuthBindType is set to ASSET or ASSET_AND_CORE.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalEcsAuthCount")
        public Integer totalEcsAuthCount;

        /**
         * <p>The remaining quota of servers.</p>
         * <blockquote>
         * <p> This parameter takes effect only if AuthBindType is set to ASSET or ASSET_AND_CORE.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("UnUsedCount")
        public Integer unUsedCount;

        /**
         * <p>The remaining quota of server cores.</p>
         * <blockquote>
         * <p> This parameter takes effect only if AuthBindType is set to CORE or ASSET_AND_CORE.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("UnusedCoreAuthCount")
        public Integer unusedCoreAuthCount;

        /**
         * <p>The remaining quota of servers.</p>
         * <blockquote>
         * <p> This parameter takes effect only if AuthBindType is set to ASSET or ASSET_AND_CORE.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("UnusedEcsAuthCount")
        public Integer unusedEcsAuthCount;

        /**
         * <p>The consumed quota of server cores.</p>
         * <blockquote>
         * <p> This parameter takes effect only if AuthBindType is set to CORE or ASSET_AND_CORE.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("UsedCoreCount")
        public Integer usedCoreCount;

        /**
         * <p>The used quota of servers.</p>
         * <blockquote>
         * <p> This parameter takes effect only if AuthBindType is set to ASSET or ASSET_AND_CORE.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("UsedEcsCount")
        public Integer usedEcsCount;

        /**
         * <p>The edition of purchased Security Center. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Basic edition</li>
         * <li><strong>3</strong>: Enterprise edition</li>
         * <li><strong>5</strong>: Advanced edition</li>
         * <li><strong>6</strong>: Anti-virus edition</li>
         * <li><strong>7</strong>: Ultimate edition</li>
         * <li><strong>8</strong>: Multi-edition</li>
         * <li><strong>10</strong>: Value-added Plan edition</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Version")
        public Integer version;

        public static GetAuthSummaryResponseBodyVersionSummary build(java.util.Map<String, ?> map) throws Exception {
            GetAuthSummaryResponseBodyVersionSummary self = new GetAuthSummaryResponseBodyVersionSummary();
            return TeaModel.build(map, self);
        }

        public GetAuthSummaryResponseBodyVersionSummary setAuthBindType(String authBindType) {
            this.authBindType = authBindType;
            return this;
        }
        public String getAuthBindType() {
            return this.authBindType;
        }

        public GetAuthSummaryResponseBodyVersionSummary setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public GetAuthSummaryResponseBodyVersionSummary setTotalCoreAuthCount(Integer totalCoreAuthCount) {
            this.totalCoreAuthCount = totalCoreAuthCount;
            return this;
        }
        public Integer getTotalCoreAuthCount() {
            return this.totalCoreAuthCount;
        }

        public GetAuthSummaryResponseBodyVersionSummary setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public GetAuthSummaryResponseBodyVersionSummary setTotalEcsAuthCount(Integer totalEcsAuthCount) {
            this.totalEcsAuthCount = totalEcsAuthCount;
            return this;
        }
        public Integer getTotalEcsAuthCount() {
            return this.totalEcsAuthCount;
        }

        public GetAuthSummaryResponseBodyVersionSummary setUnUsedCount(Integer unUsedCount) {
            this.unUsedCount = unUsedCount;
            return this;
        }
        public Integer getUnUsedCount() {
            return this.unUsedCount;
        }

        public GetAuthSummaryResponseBodyVersionSummary setUnusedCoreAuthCount(Integer unusedCoreAuthCount) {
            this.unusedCoreAuthCount = unusedCoreAuthCount;
            return this;
        }
        public Integer getUnusedCoreAuthCount() {
            return this.unusedCoreAuthCount;
        }

        public GetAuthSummaryResponseBodyVersionSummary setUnusedEcsAuthCount(Integer unusedEcsAuthCount) {
            this.unusedEcsAuthCount = unusedEcsAuthCount;
            return this;
        }
        public Integer getUnusedEcsAuthCount() {
            return this.unusedEcsAuthCount;
        }

        public GetAuthSummaryResponseBodyVersionSummary setUsedCoreCount(Integer usedCoreCount) {
            this.usedCoreCount = usedCoreCount;
            return this;
        }
        public Integer getUsedCoreCount() {
            return this.usedCoreCount;
        }

        public GetAuthSummaryResponseBodyVersionSummary setUsedEcsCount(Integer usedEcsCount) {
            this.usedEcsCount = usedEcsCount;
            return this;
        }
        public Integer getUsedEcsCount() {
            return this.usedEcsCount;
        }

        public GetAuthSummaryResponseBodyVersionSummary setVersion(Integer version) {
            this.version = version;
            return this;
        }
        public Integer getVersion() {
            return this.version;
        }

    }

}
