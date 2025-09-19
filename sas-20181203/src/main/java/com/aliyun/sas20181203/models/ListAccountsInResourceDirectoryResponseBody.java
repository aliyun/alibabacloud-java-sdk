// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListAccountsInResourceDirectoryResponseBody extends TeaModel {
    /**
     * <p>The members in the resource directory.</p>
     */
    @NameInMap("Accounts")
    public java.util.List<ListAccountsInResourceDirectoryResponseBodyAccounts> accounts;

    /**
     * <p>The request ID.</p>
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

        @NameInMap("BuySas")
        @Deprecated
        public Integer buySas;

        @NameInMap("BuySasNew")
        public Boolean buySasNew;

        @NameInMap("ChargeType")
        public Integer chargeType;

        /**
         * <p>The name of the member.</p>
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

        @NameInMap("InstanceBuyType")
        public Integer instanceBuyType;

        /**
         * <p>Indicates whether the member is an administrator account of the resource directory. Valid values:</p>
         * <ul>
         * <li><strong>yes</strong></li>
         * <li><strong>no</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>no</p>
         */
        @NameInMap("IsMaAccount")
        public String isMaAccount;

        /**
         * <p>Indicates whether the member is marked as followed.</p>
         * 
         * <strong>example:</strong>
         * <p>no</p>
         */
        @NameInMap("IsMarked")
        public String isMarked;

        /**
         * <p>Indicates whether the member is a delegated administrator account of Security Center. Valid values:</p>
         * <ul>
         * <li><strong>yes</strong></li>
         * <li><strong>no</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>no</p>
         */
        @NameInMap("IsSasDaAccount")
        public String isSasDaAccount;

        /**
         * <p>Indicates whether the member is an account of the threat analysis and response feature. Valid values:</p>
         * <ul>
         * <li><strong>yes</strong></li>
         * <li><strong>no</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>no</p>
         */
        @NameInMap("IsSiemControlAccount")
        public String isSiemControlAccount;

        /**
         * <p>Indicates whether the member is a delegated administrator account of the threat analysis and response feature. Valid values:</p>
         * <ul>
         * <li><strong>yes</strong></li>
         * <li><strong>no</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>no</p>
         */
        @NameInMap("IsSiemDaAccount")
        public String isSiemDaAccount;

        @NameInMap("PostPayModuleSwitch")
        public String postPayModuleSwitch;

        @NameInMap("SaleInstance")
        public String saleInstance;

        /**
         * <p>The edition of Security Center that you use. Valid value:</p>
         * <ul>
         * <li><strong>0</strong> or <strong>1</strong>: Basic</li>
         * <li><strong>2</strong> or <strong>3</strong>: Enterprise</li>
         * <li><strong>5</strong>: Advanced</li>
         * <li><strong>6</strong>: Anti-virus</li>
         * <li><strong>7</strong>: Ultimate</li>
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
