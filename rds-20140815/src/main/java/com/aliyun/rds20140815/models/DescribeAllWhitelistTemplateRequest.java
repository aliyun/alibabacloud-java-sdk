// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeAllWhitelistTemplateRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable fuzzy search. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("FuzzySearch")
    public Boolean fuzzySearch;

    /**
     * <p>The number of entries to return on each page. Enumerated valid values: 10, 30, and 50.</p>
     */
    @NameInMap("MaxRecordsPerPage")
    public Integer maxRecordsPerPage;

    /**
     * <p>The page number.</p>
     */
    @NameInMap("PageNumbers")
    public Integer pageNumbers;

    /**
     * <p>The resource group ID. For more information about resource groups, see related documentation.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The name of the IP whitelist template. If you specify this parameter when you perform a fuzzy search, you can call the [DescribeWhitelistTemplate](~~2412074~~) operation.</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    public static DescribeAllWhitelistTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAllWhitelistTemplateRequest self = new DescribeAllWhitelistTemplateRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAllWhitelistTemplateRequest setFuzzySearch(Boolean fuzzySearch) {
        this.fuzzySearch = fuzzySearch;
        return this;
    }
    public Boolean getFuzzySearch() {
        return this.fuzzySearch;
    }

    public DescribeAllWhitelistTemplateRequest setMaxRecordsPerPage(Integer maxRecordsPerPage) {
        this.maxRecordsPerPage = maxRecordsPerPage;
        return this;
    }
    public Integer getMaxRecordsPerPage() {
        return this.maxRecordsPerPage;
    }

    public DescribeAllWhitelistTemplateRequest setPageNumbers(Integer pageNumbers) {
        this.pageNumbers = pageNumbers;
        return this;
    }
    public Integer getPageNumbers() {
        return this.pageNumbers;
    }

    public DescribeAllWhitelistTemplateRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeAllWhitelistTemplateRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeAllWhitelistTemplateRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeAllWhitelistTemplateRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

}
