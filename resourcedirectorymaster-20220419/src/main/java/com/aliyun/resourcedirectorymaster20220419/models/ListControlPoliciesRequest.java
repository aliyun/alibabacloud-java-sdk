// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class ListControlPoliciesRequest extends TeaModel {
    /**
     * <p>The language in which you want to return the descriptions of the access control policies. Valid values:</p>
     * <ul>
     * <li>zh-CN (default value): Chinese</li>
     * <li>en: English</li>
     * <li>ja: Japanese</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is available only for system access control policies.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>The page number.</p>
     * <p>Page starts from page 1. Default value: 1.</p>
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
     * <p>The type of the access control policies. Valid values:</p>
     * <ul>
     * <li>System: system access control policy</li>
     * <li>Custom: custom access control policy</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>System</p>
     */
    @NameInMap("PolicyType")
    public String policyType;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<ListControlPoliciesRequestTag> tag;

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

    public ListControlPoliciesRequest setTag(java.util.List<ListControlPoliciesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListControlPoliciesRequestTag> getTag() {
        return this.tag;
    }

    public static class ListControlPoliciesRequestTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>tag_key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>tag_value</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListControlPoliciesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListControlPoliciesRequestTag self = new ListControlPoliciesRequestTag();
            return TeaModel.build(map, self);
        }

        public ListControlPoliciesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListControlPoliciesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
