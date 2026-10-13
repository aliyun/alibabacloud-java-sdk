// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetAuthSummaryResponseBody extends TeaModel {
    /**
     * <p>Specifies whether pay-as-you-go authorization is allowed for new purchases. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: Not allowed.</li>
     * <li><strong>1</strong>: Allowed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AllowPartialBuy")
    public Integer allowPartialBuy;

    /**
     * <p>Specifies whether upgrading to pay-as-you-go authorization is allowed during an upgrade. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: Not allowed.</li>
     * <li><strong>1</strong>: Allowed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AllowUpgradePartialBuy")
    public Integer allowUpgradePartialBuy;

    /**
     * <p>Specifies whether to allow immediate unbinding of all bound assets. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: No.</li>
     * <li><strong>1</strong>: Yes.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AllowUserUnbind")
    public Integer allowUserUnbind;

    /**
     * <p>Specifies whether to automatically bind newly added assets when the subscription service for host and container security is activated. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: Disabled.</li>
     * <li><strong>1</strong>: Enabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AutoBind")
    public Integer autoBind;

    /**
     * <p>Specifies whether to verify the machine version for cluster nodes. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: No.</li>
     * <li><strong>1</strong>: Yes.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ClusterNodeCheck")
    public Integer clusterNodeCheck;

    /**
     * <p>Specifies whether default authorization is applied to all assets. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: No.</li>
     * <li><strong>1</strong>: Yes.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DefaultAuthToAll")
    public Integer defaultAuthToAll;

    /**
     * <p>The EDR authorization summary.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;BoundCount&quot;:&quot;0&quot;,&quot;PostPaidAutoBind&quot;:&quot;0&quot;,&quot;HybridPaidAutoBind&quot;:&quot;0&quot;}</p>
     */
    @NameInMap("EdrSummary")
    public GetAuthSummaryResponseBodyEdrSummary edrSummary;

    /**
     * <p>Specifies whether pre-bound asset configurations exist. Pre-binding refers to the asset binding configurations selected in advance during purchase. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: Does not exist.</li>
     * <li><strong>1</strong>: Exists.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("HasPreBindSetting")
    public Boolean hasPreBindSetting;

    /**
     * <p>The highest purchased edition of Security Center. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: Free Edition</li>
     * <li><strong>3</strong>: Enterprise Edition</li>
     * <li><strong>5</strong>: Advanced Edition</li>
     * <li><strong>6</strong>: Anti-virus Edition</li>
     * <li><strong>7</strong>: Ultimate Edition</li>
     * <li><strong>10</strong>: Value-added services only<blockquote>
     * <p>If a single edition is purchased, this value indicates the corresponding edition. If multiple editions are purchased, this value indicates the highest edition among the sub-editions.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("HighestVersion")
    public Integer highestVersion;

    /**
     * <p>The effective status of the binding. Valid values:</p>
     * <ul>
     * <li><strong>NORMAL</strong>: Valid.</li>
     * <li><strong>INVALID_NODE_VERSION</strong>: Invalid.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>INVALID_NODE_VERSION</p>
     */
    @NameInMap("InvalidBindStatus")
    public String invalidBindStatus;

    /**
     * <p>Specifies whether multiple versions are used. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: No.</li>
     * <li><strong>1</strong>: Yes.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("IsMultiVersion")
    public Integer isMultiVersion;

    /**
     * <p>The asset authorization statistics information.</p>
     */
    @NameInMap("Machine")
    public GetAuthSummaryResponseBodyMachine machine;

    /**
     * <p>The protection edition of the pay-as-you-go service for host and container security, which is the highest protection edition among all bound hosts. Valid values:  </p>
     * <ul>
     * <li><strong>1</strong>: Free Edition </li>
     * <li><strong>3</strong>: Enterprise Edition</li>
     * <li><strong>5</strong>: Advanced Edition</li>
     * <li><strong>6</strong>: Anti-virus Edition    </li>
     * <li><strong>7</strong>: Ultimate Edition</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("PostPaidHighestVersion")
    public String postPaidHighestVersion;

    /**
     * <p>Specifies whether to automatically bind newly added hosts for the pay-as-you-go service of host and container security. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: Disabled.</li>
     * <li><strong>1</strong>: Enabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PostPaidHostAutoBind")
    public String postPaidHostAutoBind;

    /**
     * <p>The edition to which newly added assets are automatically bound for the pay-as-you-go service of host and container security. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: Free Edition </li>
     * <li><strong>3</strong>: Enterprise Edition</li>
     * <li><strong>5</strong>: Advanced Edition</li>
     * <li><strong>6</strong>: Anti-virus Edition    </li>
     * <li><strong>7</strong>: Ultimate Edition</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("PostPaidHostAutoBindVersion")
    public String postPaidHostAutoBindVersion;

    /**
     * <p>The service authorization statistics for the pay-as-you-go service of host and container security.</p>
     */
    @NameInMap("PostPaidVersionSummary")
    public java.util.List<GetAuthSummaryResponseBodyPostPaidVersionSummary> postPaidVersionSummary;

    /**
     * <p>The ID of the request. This is a unique identifier generated by Alibaba Cloud for the request and can be used for troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>0B48AB3C-***-B9270EF46038</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The authorization usage statistics information.</p>
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

    public GetAuthSummaryResponseBody setClusterNodeCheck(Integer clusterNodeCheck) {
        this.clusterNodeCheck = clusterNodeCheck;
        return this;
    }
    public Integer getClusterNodeCheck() {
        return this.clusterNodeCheck;
    }

    public GetAuthSummaryResponseBody setDefaultAuthToAll(Integer defaultAuthToAll) {
        this.defaultAuthToAll = defaultAuthToAll;
        return this;
    }
    public Integer getDefaultAuthToAll() {
        return this.defaultAuthToAll;
    }

    public GetAuthSummaryResponseBody setEdrSummary(GetAuthSummaryResponseBodyEdrSummary edrSummary) {
        this.edrSummary = edrSummary;
        return this;
    }
    public GetAuthSummaryResponseBodyEdrSummary getEdrSummary() {
        return this.edrSummary;
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

    public GetAuthSummaryResponseBody setInvalidBindStatus(String invalidBindStatus) {
        this.invalidBindStatus = invalidBindStatus;
        return this;
    }
    public String getInvalidBindStatus() {
        return this.invalidBindStatus;
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

    public static class GetAuthSummaryResponseBodyEdrSummary extends TeaModel {
        /**
         * <p>The number of bound EDR authorizations.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("BoundCount")
        public String boundCount;

        /**
         * <p>The automatic binding status of hybrid billing EDR instances.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("HybridPaidAutoBind")
        public String hybridPaidAutoBind;

        /**
         * <p>The automatic binding status of pay-as-you-go EDR instances.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PostPaidAutoBind")
        public String postPaidAutoBind;

        public static GetAuthSummaryResponseBodyEdrSummary build(java.util.Map<String, ?> map) throws Exception {
            GetAuthSummaryResponseBodyEdrSummary self = new GetAuthSummaryResponseBodyEdrSummary();
            return TeaModel.build(map, self);
        }

        public GetAuthSummaryResponseBodyEdrSummary setBoundCount(String boundCount) {
            this.boundCount = boundCount;
            return this;
        }
        public String getBoundCount() {
            return this.boundCount;
        }

        public GetAuthSummaryResponseBodyEdrSummary setHybridPaidAutoBind(String hybridPaidAutoBind) {
            this.hybridPaidAutoBind = hybridPaidAutoBind;
            return this;
        }
        public String getHybridPaidAutoBind() {
            return this.hybridPaidAutoBind;
        }

        public GetAuthSummaryResponseBodyEdrSummary setPostPaidAutoBind(String postPaidAutoBind) {
            this.postPaidAutoBind = postPaidAutoBind;
            return this;
        }
        public String getPostPaidAutoBind() {
            return this.postPaidAutoBind;
        }

    }

    public static class GetAuthSummaryResponseBodyMachine extends TeaModel {
        /**
         * <p>The number of cores for assets bound with authorization.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("BindCoreCount")
        public Integer bindCoreCount;

        /**
         * <p>The number of bound assets.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("BindEcsCount")
        public Integer bindEcsCount;

        /**
         * <p>The number of cores for assets bound with pay-as-you-go authorization.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PostPaidBindCoreCount")
        public Integer postPaidBindCoreCount;

        /**
         * <p>The number of assets bound with pay-as-you-go authorization.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PostPaidBindEcsCount")
        public Integer postPaidBindEcsCount;

        /**
         * <p>The number of cores for assets with security risks.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("RiskCoreCount")
        public Integer riskCoreCount;

        /**
         * <p>The number of assets with security risks.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("RiskEcsCount")
        public Integer riskEcsCount;

        /**
         * <p>The total number of cores for all assets.</p>
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
         * <p>The number of cores for unbound assets.</p>
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
         * <p>The type of authorization consumed during binding. Valid values:</p>
         * <ul>
         * <li><strong>ASSET</strong>: Consumes the number of authorized assets.</li>
         * <li><strong>CORE</strong>: Consumes the number of authorized cores.</li>
         * <li><strong>ASSET_AND_CORE</strong>: Consumes both the number of authorized assets and the number of authorized cores.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ASSET</p>
         */
        @NameInMap("AuthBindType")
        public String authBindType;

        /**
         * <p>The number of free authorized cores.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("FreeCoreCount")
        public Integer freeCoreCount;

        /**
         * <p>The number of free authorized assets.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("FreeEcsCount")
        public Integer freeEcsCount;

        /**
         * <p>The category identifier of the free quota.</p>
         */
        @NameInMap("FreeType")
        public String freeType;

        /**
         * <p>The index of the current edition. A larger value indicates a higher edition, which is used for sorting. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Free Edition </li>
         * <li><strong>2</strong>: Anti-virus Edition    </li>
         * <li><strong>3</strong>: Advanced Edition</li>
         * <li><strong>4</strong>: Enterprise Edition</li>
         * <li><strong>5</strong>: Ultimate Edition</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Index")
        public Integer index;

        /**
         * <p>The number of used authorized cores.</p>
         * <blockquote>
         * <p>This parameter is valid only when AuthBindType is set to CORE or ASSET_AND_CORE.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("UsedCoreCount")
        public Long usedCoreCount;

        /**
         * <p>The number of used authorized assets.</p>
         * <blockquote>
         * <p>This parameter is valid only when AuthBindType is set to ASSET or ASSET_AND_CORE.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("UsedEcsCount")
        public Long usedEcsCount;

        /**
         * <p>The pay-as-you-go edition bound to the host assets. Valid values:  </p>
         * <ul>
         * <li><strong>1</strong>: Free Edition </li>
         * <li><strong>3</strong>: Enterprise Edition</li>
         * <li><strong>5</strong>: Advanced Edition</li>
         * <li><strong>6</strong>: Anti-virus Edition    </li>
         * <li><strong>7</strong>: Ultimate Edition</li>
         * </ul>
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

        public GetAuthSummaryResponseBodyPostPaidVersionSummary setFreeCoreCount(Integer freeCoreCount) {
            this.freeCoreCount = freeCoreCount;
            return this;
        }
        public Integer getFreeCoreCount() {
            return this.freeCoreCount;
        }

        public GetAuthSummaryResponseBodyPostPaidVersionSummary setFreeEcsCount(Integer freeEcsCount) {
            this.freeEcsCount = freeEcsCount;
            return this;
        }
        public Integer getFreeEcsCount() {
            return this.freeEcsCount;
        }

        public GetAuthSummaryResponseBodyPostPaidVersionSummary setFreeType(String freeType) {
            this.freeType = freeType;
            return this;
        }
        public String getFreeType() {
            return this.freeType;
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
         * <p>The type of authorization consumed during binding. Valid values:</p>
         * <ul>
         * <li>ASSET: Consumes the number of authorized assets.</li>
         * <li>CORE: Consumes the number of authorized cores.</li>
         * <li>ASSET_AND_CORE: Consumes both the number of authorized assets and the number of authorized cores.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ASSET</p>
         */
        @NameInMap("AuthBindType")
        public String authBindType;

        /**
         * <p>The index of the current edition. A larger value indicates a higher edition, which is used for sorting. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Free Edition </li>
         * <li><strong>2</strong>: Anti-virus Edition    </li>
         * <li><strong>3</strong>: Advanced Edition</li>
         * <li><strong>4</strong>: Enterprise Edition</li>
         * <li><strong>5</strong>: Ultimate Edition</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Index")
        public Integer index;

        /**
         * <p>The total number of authorized cores.</p>
         * <blockquote>
         * <p>This parameter is valid only when AuthBindType is set to CORE or ASSET_AND_CORE.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalCoreAuthCount")
        public Integer totalCoreAuthCount;

        /**
         * <p>The total number of authorized assets for the current edition.</p>
         * <blockquote>
         * <p>This parameter is valid only when AuthBindType is set to ASSET or ASSET_AND_CORE.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        /**
         * <p>The total number of authorized assets.</p>
         * <blockquote>
         * <p>This parameter is valid only when AuthBindType is set to ASSET or ASSET_AND_CORE.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalEcsAuthCount")
        public Integer totalEcsAuthCount;

        /**
         * <p>The number of unused authorized assets.</p>
         * <blockquote>
         * <p>This parameter is valid only when AuthBindType is set to ASSET or ASSET_AND_CORE.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("UnUsedCount")
        public Integer unUsedCount;

        /**
         * <p>The number of unused authorized cores.</p>
         * <blockquote>
         * <p>This parameter is valid only when AuthBindType is set to CORE or ASSET_AND_CORE.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("UnusedCoreAuthCount")
        public Integer unusedCoreAuthCount;

        /**
         * <p>The number of unused authorized assets.</p>
         * <blockquote>
         * <p>This parameter is valid only when AuthBindType is set to ASSET or ASSET_AND_CORE.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("UnusedEcsAuthCount")
        public Integer unusedEcsAuthCount;

        /**
         * <p>The number of used authorized cores.</p>
         * <blockquote>
         * <p>This parameter is valid only when AuthBindType is set to CORE or ASSET_AND_CORE.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("UsedCoreCount")
        public Integer usedCoreCount;

        /**
         * <p>The number of used authorized assets.</p>
         * <blockquote>
         * <p>This parameter is valid only when AuthBindType is set to ASSET or ASSET_AND_CORE.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("UsedEcsCount")
        public Integer usedEcsCount;

        /**
         * <p>The purchased edition of Security Center. Valid values:  </p>
         * <ul>
         * <li><strong>1</strong>: Free Edition </li>
         * <li><strong>3</strong>: Enterprise Edition</li>
         * <li><strong>5</strong>: Advanced Edition</li>
         * <li><strong>6</strong>: Anti-virus Edition    </li>
         * <li><strong>7</strong>: Ultimate Edition   </li>
         * <li><strong>8</strong>: Multiple editions   </li>
         * <li><strong>10</strong>: Value-added services only</li>
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
