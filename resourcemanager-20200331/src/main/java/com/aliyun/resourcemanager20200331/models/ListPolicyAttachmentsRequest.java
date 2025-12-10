// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class ListPolicyAttachmentsRequest extends TeaModel {
    /**
     * <p>The language in which you want to return the description of the system policy. Valid values:</p>
     * <ul>
     * <li>en: English</li>
     * <li>zh-CN: Chinese</li>
     * <li>ja: Japanese</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>The page number.</p>
     * <p>Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * <p>Valid values: 1 to 100. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The name of the permission policy.</p>
     * <p>The name must be 1 to 128 characters in length and can contain letters, digits, and hyphen (-).</p>
     * 
     * <strong>example:</strong>
     * <p>AdministratorAccess</p>
     */
    @NameInMap("PolicyName")
    public String policyName;

    /**
     * <p>The type of the permission policy. If you do not configure this parameter, all types of policies are returned. Valid values:</p>
     * <ul>
     * <li>Custom</li>
     * <li>System</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>System</p>
     */
    @NameInMap("PolicyType")
    public String policyType;

    /**
     * <p>The name of the object to which you want to attach the permission policy.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:alice@demo.onaliyun.com">alice@demo.onaliyun.com</a></p>
     */
    @NameInMap("PrincipalName")
    public String principalName;

    /**
     * <p>The type of the object to which you want to attach the permission policy. If you do not configure this parameter, the system lists all types of objects. Valid values:</p>
     * <ul>
     * <li>IMSUser: RAM user</li>
     * <li>IMSGroup: RAM user group</li>
     * <li>ServiceRole: RAM role</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>IMSUser</p>
     */
    @NameInMap("PrincipalType")
    public String principalType;

    /**
     * <p>The ID of the resource group or the ID of the Alibaba Cloud account to which the resource group belongs. If you do not configure this parameter, the system lists all policy attachment records within the current account.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-001</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static ListPolicyAttachmentsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPolicyAttachmentsRequest self = new ListPolicyAttachmentsRequest();
        return TeaModel.build(map, self);
    }

    public ListPolicyAttachmentsRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public ListPolicyAttachmentsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListPolicyAttachmentsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPolicyAttachmentsRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    public String getPolicyName() {
        return this.policyName;
    }

    public ListPolicyAttachmentsRequest setPolicyType(String policyType) {
        this.policyType = policyType;
        return this;
    }
    public String getPolicyType() {
        return this.policyType;
    }

    public ListPolicyAttachmentsRequest setPrincipalName(String principalName) {
        this.principalName = principalName;
        return this;
    }
    public String getPrincipalName() {
        return this.principalName;
    }

    public ListPolicyAttachmentsRequest setPrincipalType(String principalType) {
        this.principalType = principalType;
        return this;
    }
    public String getPrincipalType() {
        return this.principalType;
    }

    public ListPolicyAttachmentsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
