// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListAccountsInResourceDirectoryResponseBody extends TeaModel {
    /**
     * <p>La liste des comptes membres dans le répertoire de ressources.</p>
     */
    @NameInMap("Accounts")
    public java.util.List<ListAccountsInResourceDirectoryResponseBodyAccounts> accounts;

    /**
     * <p>L\&quot;identifiant de la requête. Il s\&quot;agit d\&quot;un identifiant unique généré par Alibaba Cloud pour la requête. Vous pouvez l\&quot;utiliser pour le dépannage.</p>
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
         * <p>L\&quot;identifiant de compte Alibaba Cloud du membre.</p>
         * 
         * <strong>example:</strong>
         * <p>180803538814****</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        /**
         * <p>Ce paramètre est obsolète et ne doit plus être utilisé.</p>
         * 
         * <strong>example:</strong>
         * <p>true.</p>
         */
        @NameInMap("BuySas")
        @Deprecated
        public Integer buySas;

        /**
         * <p>Indique si une instance Security Center en abonnement a été souscrite. Valeurs valides :</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true.</p>
         */
        @NameInMap("BuySasNew")
        public Boolean buySasNew;

        /**
         * <p>Le mode de facturation de l\&quot;abonnement. Valeurs valides :</p>
         * <ul>
         * <li><strong>0</strong> : prépayé</li>
         * <li><strong>1</strong> : paiement à l\&quot;usage.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ChargeType")
        public Integer chargeType;

        /**
         * <p>Le nom du compte.</p>
         * 
         * <strong>example:</strong>
         * <p>abc**</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>L\&quot;identifiant du dossier dans le répertoire de ressources.</p>
         * 
         * <strong>example:</strong>
         * <p>fd-cE2SQP****</p>
         */
        @NameInMap("FolderId")
        public String folderId;

        /**
         * <p>Le type d\&quot;achat de l\&quot;instance. Valeurs valides :</p>
         * <ul>
         * <li><strong>0</strong> : achat direct</li>
         * <li><strong>1</strong> : alloué via la gestion multi-comptes.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("InstanceBuyType")
        public Integer instanceBuyType;

        /**
         * <p>Indique si le compte est le compte de gestion du répertoire de ressources. Valeurs valides :</p>
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
         * <p>Indique si le compte est marqué comme suivi.</p>
         * 
         * <strong>example:</strong>
         * <p>no</p>
         */
        @NameInMap("IsMarked")
        public String isMarked;

        /**
         * <p>Indique si le compte est un compte administrateur délégué de Security Center. Valeurs valides :</p>
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
         * <p>Indique si le compte est un compte de gestion de Cloud Threat Detection and Response (CTDR). Valeurs valides :</p>
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
         * <p>Indique si le compte est un compte administrateur délégué de Cloud Threat Detection and Response (CTDR). Valeurs valides :</p>
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
         * <p>Le commutateur de module à paiement à l\&quot;usage. Valeurs valides :</p>
         * <ul>
         * <li><strong>0</strong> : désactivé</li>
         * <li><strong>1</strong> : activé.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PostBasicService")
        public Integer postBasicService;

        /**
         * <p>L\&quot;état des commutateurs de modules à paiement à l\&quot;usage, au format JsonString. Valeurs valides :</p>
         * <ul>
         * <li>Clé :<ul>
         * <li><strong>VUL</strong> : module de gestion des vulnérabilités</li>
         * <li><strong>CSPM</strong> : module Cloud Security Posture Management (CSPM)</li>
         * <li><strong>AGENTLESS</strong> : module de détection sans agent</li>
         * <li><strong>SERVERLESS</strong> : module de ressources serverless</li>
         * <li><strong>CTDR</strong> : module Cloud Threat Detection and Response (CTDR)</li>
         * <li><strong>RASP</strong> : module Runtime Application Self-Protection (RASP)</li>
         * <li><strong>SDK</strong> : module SDK de détection de fichiers malveillants</li>
         * <li><strong>POST_HOST</strong> : module de sécurité des hôtes et des conteneurs</li>
         * </ul>
         * </li>
         * <li>Valeur : 0 indique désactivé. 1 indique activé.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;VUL\&quot;:0}</p>
         */
        @NameInMap("PostPayModuleSwitch")
        public String postPayModuleSwitch;

        /**
         * <p>L\&quot;identifiant de l\&quot;instance Security Center.</p>
         * 
         * <strong>example:</strong>
         * <p>postpay-sas-x5x3hy1ly***</p>
         */
        @NameInMap("SaleInstance")
        public String saleInstance;

        /**
         * <p>L\&quot;édition souscrite de Security Center. Valeurs valides :</p>
         * <ul>
         * <li><strong>0</strong> ou <strong>1</strong> : Édition gratuite</li>
         * <li><strong>2</strong> ou <strong>3</strong> : Édition Enterprise  </li>
         * <li><strong>5</strong> : Édition Premium  </li>
         * <li><strong>6</strong> : Édition Anti-virus </li>
         * <li><strong>7</strong> : Édition Ultimate.</li>
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
