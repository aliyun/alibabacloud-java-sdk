// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class ListControlPoliciesRequest extends TeaModel {
    /**
     * <p>The language in which you want to return the descriptions of the access control policies. Valid values:</p>
     * <br>
     * <p>- zh-CN (default value): Chinese</p>
     * <p>- en: English</p>
     * <p>- ja: Japanese</p>
     * <br>
     * <p>>  This parameter is valid only for system access control policies.</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>The number of the page to return. </p>
     * <br>
     * <p>Page start from page 1. Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. </p>
     * <br>
     * <p>Valid values: 1 to 100. Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The type of the access control policy. Valid values:</p>
     * <br>
     * <p>- System: system access control policy</p>
     * <p>- Custom: custom access control policy</p>
     */
    @NameInMap("PolicyType")
    public String policyType;

    public static ListControlPoliciesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListControlPoliciesRequest self = new ListControlPoliciesRequest();
        return TeaModel.build(map, self);
    }

    public ListControlPoliciesRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public ListControlPoliciesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListControlPoliciesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListControlPoliciesRequest setPolicyType(String policyType) {
        this.policyType = policyType;
        return this;
    }
    public String getPolicyType() {
        return this.policyType;
    }

}
