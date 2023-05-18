// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class ListPoliciesRequest extends TeaModel {
    /**
     * <p>The language that is used to return the description of the system policy. Valid values:</p>
     * <br>
     * <p>*   en: English</p>
     * <p>*   zh-CN: Chinese</p>
     * <p>*   ja: Japanese</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>The number of the page to return.</p>
     * <br>
     * <p>Pages start from page 1. Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     * <br>
     * <p>Valid values: 1 to 100. Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The type of the policy. If you do not specify this parameter, the system lists all types of policies. Valid values:</p>
     * <br>
     * <p>*   Custom: custom policy</p>
     * <p>*   System: system policy</p>
     */
    @NameInMap("PolicyType")
    public String policyType;

    public static ListPoliciesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPoliciesRequest self = new ListPoliciesRequest();
        return TeaModel.build(map, self);
    }

    public ListPoliciesRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public ListPoliciesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListPoliciesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPoliciesRequest setPolicyType(String policyType) {
        this.policyType = policyType;
        return this;
    }
    public String getPolicyType() {
        return this.policyType;
    }

}
