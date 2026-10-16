// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class ListPolicyAttachmentsRequest extends TeaModel {
    /**
     * <p>The language type. The description of the system access policy is returned in the specified language.</p>
     * <ul>
     * <li>en: English.</li>
     * <li>zh-CN: Chinese.</li>
     * <li>ja: Japanese.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>The page number.</p>
     * <p>Minimum value: 1. Default value: 1.</p>
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
     * <p>Policy Name of the access policy.</p>
     * <p>Policy Name must be 1 to 128 characters in length and can contain letters, digits, and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>AdministratorAccess</p>
     */
    @NameInMap("PolicyName")
    public String policyName;

    /**
     * <p>The type of the access policy. If this parameter is left empty, all types of access policies are listed.</p>
     * <ul>
     * <li>Custom: custom policy.</li>
     * <li>System: system policy.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>System</p>
     */
    @NameInMap("PolicyType")
    public String policyType;

    /**
     * <p>The name of the principal.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:alice@demo.onaliyun.com">alice@demo.onaliyun.com</a></p>
     */
    @NameInMap("PrincipalName")
    public String principalName;

    /**
     * <p>The authorization object type. If this parameter is left empty, all types of authorization objects are listed.</p>
     * <ul>
     * <li>IMSUser: Resource Access Management (RAM) user.</li>
     * <li>IMSGroup: RAM user group.</li>
     * <li>ServiceRole: RAM role.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>IMSUser</p>
     */
    @NameInMap("PrincipalType")
    public String principalType;

    /**
     * <p>The ID of the resource group or the Alibaba Cloud account ID to which the resource group belongs. If this parameter is left empty, all authorization records under the current account are listed.</p>
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
