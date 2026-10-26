// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20260120.models;

import com.aliyun.tea.*;

public class ListDataAssetAccountsRequest extends TeaModel {
    /**
     * <p>The database account name. The system filters accounts by the exact account name.</p>
     * 
     * <strong>example:</strong>
     * <p>app_reader</p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>The authentication database of the MongoDB account. This parameter is used to distinguish accounts with the same name in different authentication databases.</p>
     * 
     * <strong>example:</strong>
     * <p>admin</p>
     */
    @NameInMap("AuthDb")
    public String authDb;

    /**
     * <p>The column encryption access permissions. Valid values:</p>
     * <ul>
     * <li>fullAccess: plaintext access</li>
     * <li>restrictedAccess: restricted access</li>
     * <li>noneAccess: decryption prohibited. This value applies only to ApsaraDB RDS for MySQL instances whose current effective key mode is client_key.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>fullAccess</p>
     */
    @NameInMap("AuthRole")
    public String authRole;

    /**
     * <p>The business scenario for the query. Set this parameter to DataMasking for the column encryption scenario. Note that the value is case-sensitive.</p>
     * 
     * <strong>example:</strong>
     * <p>DataMasking</p>
     */
    @NameInMap("BizType")
    public String bizType;

    /**
     * <p>The page number of the current page. Pages start from 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The database instance ID. You can obtain this value from the Items[].InstanceId parameter in the response of the ListDataMaskingInstances operation.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-2ze1abcdefgh****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The language of the response message. Valid values:</p>
     * <ul>
     * <li>zh: Chinese</li>
     * <li>en: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The number of entries to return on each page. Keep other filter conditions consistent when querying the next page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The cloud service code. Column encryption supports RDS, POLARDB, and PolarDBX2. If ProductId is also specified, the two parameters must match.</p>
     * 
     * <strong>example:</strong>
     * <p>RDS</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The list of cloud service type IDs. Separate multiple values with commas (,). For the column encryption scenario, the valid values are 5 (RDS), 8 (POLARDB), and 27 (PolarDBX2).</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("ProductIds")
    public String productIds;

    public static ListDataAssetAccountsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataAssetAccountsRequest self = new ListDataAssetAccountsRequest();
        return TeaModel.build(map, self);
    }

    public ListDataAssetAccountsRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public ListDataAssetAccountsRequest setAuthDb(String authDb) {
        this.authDb = authDb;
        return this;
    }
    public String getAuthDb() {
        return this.authDb;
    }

    public ListDataAssetAccountsRequest setAuthRole(String authRole) {
        this.authRole = authRole;
        return this;
    }
    public String getAuthRole() {
        return this.authRole;
    }

    public ListDataAssetAccountsRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public ListDataAssetAccountsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListDataAssetAccountsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListDataAssetAccountsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListDataAssetAccountsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDataAssetAccountsRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public ListDataAssetAccountsRequest setProductIds(String productIds) {
        this.productIds = productIds;
        return this;
    }
    public String getProductIds() {
        return this.productIds;
    }

}
