// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class ListPolicyAttachmentsRequest extends TeaModel {
    @NameInMap("Language")
    public String language;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PolicyName")
    public String policyName;

    @NameInMap("PolicyType")
    public String policyType;

    @NameInMap("PrincipalName")
    public String principalName;

    @NameInMap("PrincipalType")
    public String principalType;

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
