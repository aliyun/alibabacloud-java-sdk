// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodUserDomainsRequest extends TeaModel {
    /**
     * <p>The domain name. The value of this parameter is used as a filter condition for a fuzzy match.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The search method. Valid values:</p>
     * <p>*   **fuzzy_match**: fuzzy match. This is the default value.</p>
     * <p>*   **pre_match**: prefix match.</p>
     * <p>*   **suf_match**: suffix match.</p>
     * <p>*   **full_match**: exact match.</p>
     */
    @NameInMap("DomainSearchType")
    public String domainSearchType;

    /**
     * <p>The status of the domain name. The value of this parameter is used as a condition to filter domain names. Value values:</p>
     * <p>*   **online**: indicates that the domain name is enabled.</p>
     * <p>*   **offline**: indicates that the domain name is disabled.</p>
     * <p>*   **configuring**: indicates that the domain name is being configured.</p>
     * <p>*   **configure_failed**: indicates that the domain name failed to be configured.</p>
     * <p>*   **checking**: indicates that the domain name is under review.</p>
     * <p>*   **check_failed**: indicates that the domain name failed the review.</p>
     */
    @NameInMap("DomainStatus")
    public String domainStatus;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The number of the page to return.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Default value: **20**. Maximum value: **50**. Valid values: integers in the range of **1** to **50**.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>Tag.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeVodUserDomainsRequestTag> tag;

    public static DescribeVodUserDomainsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodUserDomainsRequest self = new DescribeVodUserDomainsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVodUserDomainsRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeVodUserDomainsRequest setDomainSearchType(String domainSearchType) {
        this.domainSearchType = domainSearchType;
        return this;
    }
    public String getDomainSearchType() {
        return this.domainSearchType;
    }

    public DescribeVodUserDomainsRequest setDomainStatus(String domainStatus) {
        this.domainStatus = domainStatus;
        return this;
    }
    public String getDomainStatus() {
        return this.domainStatus;
    }

    public DescribeVodUserDomainsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeVodUserDomainsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeVodUserDomainsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeVodUserDomainsRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeVodUserDomainsRequest setTag(java.util.List<DescribeVodUserDomainsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeVodUserDomainsRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeVodUserDomainsRequestTag extends TeaModel {
        /**
         * <p>The key of tag N. Valid values of N: **1** to **20**.</p>
         * <br>
         * <p>If you do not specify this parameter, all tag keys are queried.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N. Valid values of N: **1** to **20**.</p>
         * <br>
         * <p>If you do not specify this parameter, all tag values are queried.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeVodUserDomainsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodUserDomainsRequestTag self = new DescribeVodUserDomainsRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeVodUserDomainsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeVodUserDomainsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
