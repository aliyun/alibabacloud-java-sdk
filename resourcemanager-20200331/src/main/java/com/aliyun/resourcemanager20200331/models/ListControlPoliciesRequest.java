// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class ListControlPoliciesRequest extends TeaModel {
    /**
     * <p>The language in which you want the description of the control policy to be returned. Valid values:</p>
     * <ul>
     * <li>zh-CN (default): Chinese.</li>
     * <li>en: English.</li>
     * <li>ja: Japanese.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is valid only for system control policies.</p>
     * </blockquote>
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
     * <p>The type of the control policy. Valid values:</p>
     * <ul>
     * <li>System: system control policy.</li>
     * <li>Custom: custom control policy.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>System</p>
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
