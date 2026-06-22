// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListAccountsInResourceDirectoryResponseBody extends TeaModel {
    /**
     * <p>The list of member accounts in the resource directory.</p>
     */
    @NameInMap("Accounts")
    public java.util.List<ListAccountsInResourceDirectoryResponseBodyAccounts> accounts;

    /**
     * <p>The ID of the request. Alibaba Cloud generates a unique identifier for each request. You can use the ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>B7A839E8-70AE-591D-8D9E-C5419A2240DB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListAccountsInResourceDirectoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAccountsInResourceDirectoryResponseBody self = new ListAccountsInResourceDirectoryResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAccountsInResourceDirectoryResponseBody setAccounts(java.util.List<ListAccountsInResourceDirectoryResponseBodyAccounts> accounts) {
        this.accounts = accounts;
        return this;
    }
    public java.util.List<ListAccountsInResourceDirectoryResponseBodyAccounts> getAccounts() {
        return this.accounts;
    }

    public ListAccountsInResourceDirectoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAccountsInResourceDirectoryResponseBodyAccounts extends TeaModel {
        /**
         * <p>The Alibaba Cloud account ID of the member.</p>
         * 
         * <strong>example:</strong>
         * <p>180803538814****</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        /**
         * <p>This parameter is deprecated and does not need to be used.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("BuySas")
        @Deprecated
        public Integer buySas;

        /**
         * <p>Indicates whether a Security Center subscription instance is purchased. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("BuySasNew")
        public Boolean buySasNew;

        /**
         * <p>The billing method. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: upfront</li>
         * <li><strong>1</strong>: pay-as-you-go.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ChargeType")
        public Integer chargeType;

        /**
         * <p>The account name.</p>
         * 
         * <strong>example:</strong>
         * <p>abc**</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The ID of the folder in the resource directory.</p>
         * 
         * <strong>example:</strong>
         * <p>fd-cE2SQP****</p>
         */
        @NameInMap("FolderId")
        public String folderId;

        /**
         * <p>The instance purchase type. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: self-purchased</li>
         * <li><strong>1</strong>: allocated through multi-account management.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("InstanceBuyType")
        public Integer instanceBuyType;

        /**
         * <p>Indicates whether the account is the management account of the resource directory. Valid values:</p>
         * <ul>
         * <li><p><strong>yes</strong></p>
         * </li>
         * <li><p><strong>no</strong>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>no</p>
         */
        @NameInMap("IsMaAccount")
        public String isMaAccount;

        /**
         * <p>Indicates whether the account is marked as followed.</p>
         * 
         * <strong>example:</strong>
         * <p>no</p>
         */
        @NameInMap("IsMarked")
        public String isMarked;

        /**
         * <p>Indicates whether the account is a delegated administrator account of Security Center. Valid values:</p>
         * <ul>
         * <li><p><strong>yes</strong></p>
         * </li>
         * <li><p><strong>no</strong>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>no</p>
         */
        @NameInMap("IsSasDaAccount")
        public String isSasDaAccount;

        /**
         * <p>Indicates whether the account is a management account of Cloud Threat Detection and Response (CTDR). Valid values:</p>
         * <ul>
         * <li><p><strong>yes</strong></p>
         * </li>
         * <li><p><strong>no</strong>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>no</p>
         */
        @NameInMap("IsSiemControlAccount")
        public String isSiemControlAccount;

        /**
         * <p>Indicates whether the account is a delegated administrator account of Cloud Threat Detection and Response (CTDR). Valid values:</p>
         * <ul>
         * <li><p><strong>yes</strong></p>
         * </li>
         * <li><p><strong>no</strong>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>no</p>
         */
        @NameInMap("IsSiemDaAccount")
        public String isSiemDaAccount;

        /**
         * <p>The pay-as-you-go module switch. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: disabled</li>
         * <li><strong>1</strong>: enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PostBasicService")
        public Integer postBasicService;

        /**
         * <p>The status of pay-as-you-go module switches, in JsonString format. Valid values:</p>
         * <ul>
         * <li>Key:<ul>
         * <li><strong>VUL</strong>: vulnerability management module</li>
         * <li><strong>CSPM</strong>: Cloud Security Posture Management (CSPM) module</li>
         * <li><strong>AGENTLESS</strong>: agentless detection module</li>
         * <li><strong>SERVERLESS</strong>: serverless asset module</li>
         * <li><strong>CTDR</strong>: Cloud Threat Detection and Response (CTDR) module</li>
         * <li><strong>RASP</strong>: Runtime Application Self-Protection (RASP) module</li>
         * <li><strong>SDK</strong>: malicious file detection SDK module</li>
         * <li><strong>POST_HOST</strong>: host and container security module</li>
         * </ul>
         * </li>
         * <li>Value: 0 indicates disabled. 1 indicates enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;VUL\&quot;:0}</p>
         */
        @NameInMap("PostPayModuleSwitch")
        public String postPayModuleSwitch;

        /**
         * <p>The Security Center instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>postpay-sas-x5x3hy1ly***</p>
         */
        @NameInMap("SaleInstance")
        public String saleInstance;

        /**
         * <p>The purchased edition of Security Center. Valid values:</p>
         * <ul>
         * <li><strong>0</strong> or <strong>1</strong>: Free Edition</li>
         * <li><strong>2</strong> or <strong>3</strong>: Enterprise Edition  </li>
         * <li><strong>5</strong>: Premium Edition  </li>
         * <li><strong>6</strong>: Anti-virus Edition </li>
         * <li><strong>7</strong>: Ultimate Edition.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SasVersion")
        public String sasVersion;

        public static ListAccountsInResourceDirectoryResponseBodyAccounts build(java.util.Map<String, ?> map) throws Exception {
            ListAccountsInResourceDirectoryResponseBodyAccounts self = new ListAccountsInResourceDirectoryResponseBodyAccounts();
            return TeaModel.build(map, self);
        }

        public ListAccountsInResourceDirectoryResponseBodyAccounts setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        @Deprecated
        public ListAccountsInResourceDirectoryResponseBodyAccounts setBuySas(Integer buySas) {
            this.buySas = buySas;
            return this;
        }
        public Integer getBuySas() {
            return this.buySas;
        }

        public ListAccountsInResourceDirectoryResponseBodyAccounts setBuySasNew(Boolean buySasNew) {
            this.buySasNew = buySasNew;
            return this;
        }
        public Boolean getBuySasNew() {
            return this.buySasNew;
        }

        public ListAccountsInResourceDirectoryResponseBodyAccounts setChargeType(Integer chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public Integer getChargeType() {
            return this.chargeType;
        }

        public ListAccountsInResourceDirectoryResponseBodyAccounts setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListAccountsInResourceDirectoryResponseBodyAccounts setFolderId(String folderId) {
            this.folderId = folderId;
            return this;
        }
        public String getFolderId() {
            return this.folderId;
        }

        public ListAccountsInResourceDirectoryResponseBodyAccounts setInstanceBuyType(Integer instanceBuyType) {
            this.instanceBuyType = instanceBuyType;
            return this;
        }
        public Integer getInstanceBuyType() {
            return this.instanceBuyType;
        }

        public ListAccountsInResourceDirectoryResponseBodyAccounts setIsMaAccount(String isMaAccount) {
            this.isMaAccount = isMaAccount;
            return this;
        }
        public String getIsMaAccount() {
            return this.isMaAccount;
        }

        public ListAccountsInResourceDirectoryResponseBodyAccounts setIsMarked(String isMarked) {
            this.isMarked = isMarked;
            return this;
        }
        public String getIsMarked() {
            return this.isMarked;
        }

        public ListAccountsInResourceDirectoryResponseBodyAccounts setIsSasDaAccount(String isSasDaAccount) {
            this.isSasDaAccount = isSasDaAccount;
            return this;
        }
        public String getIsSasDaAccount() {
            return this.isSasDaAccount;
        }

        public ListAccountsInResourceDirectoryResponseBodyAccounts setIsSiemControlAccount(String isSiemControlAccount) {
            this.isSiemControlAccount = isSiemControlAccount;
            return this;
        }
        public String getIsSiemControlAccount() {
            return this.isSiemControlAccount;
        }

        public ListAccountsInResourceDirectoryResponseBodyAccounts setIsSiemDaAccount(String isSiemDaAccount) {
            this.isSiemDaAccount = isSiemDaAccount;
            return this;
        }
        public String getIsSiemDaAccount() {
            return this.isSiemDaAccount;
        }

        public ListAccountsInResourceDirectoryResponseBodyAccounts setPostBasicService(Integer postBasicService) {
            this.postBasicService = postBasicService;
            return this;
        }
        public Integer getPostBasicService() {
            return this.postBasicService;
        }

        public ListAccountsInResourceDirectoryResponseBodyAccounts setPostPayModuleSwitch(String postPayModuleSwitch) {
            this.postPayModuleSwitch = postPayModuleSwitch;
            return this;
        }
        public String getPostPayModuleSwitch() {
            return this.postPayModuleSwitch;
        }

        public ListAccountsInResourceDirectoryResponseBodyAccounts setSaleInstance(String saleInstance) {
            this.saleInstance = saleInstance;
            return this;
        }
        public String getSaleInstance() {
            return this.saleInstance;
        }

        public ListAccountsInResourceDirectoryResponseBodyAccounts setSasVersion(String sasVersion) {
            this.sasVersion = sasVersion;
            return this;
        }
        public String getSasVersion() {
            return this.sasVersion;
        }

    }

}
