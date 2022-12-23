// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodUserDomainsRequest extends TeaModel {
    // The domain name. The value of this parameter is used as a filter condition for a fuzzy match.
    @NameInMap("DomainName")
    public String domainName;

    // The search method. Valid values:
    // *   **fuzzy_match**: fuzzy match. This is the default value.
    // *   **pre_match**: prefix match.
    // *   **suf_match**: suffix match.
    // *   **full_match**: exact match.
    @NameInMap("DomainSearchType")
    public String domainSearchType;

    // The status of the domain name. The value of this parameter is used as a condition to filter domain names. Value values:
    // *   **online**: indicates that the domain name is enabled.
    // *   **offline**: indicates that the domain name is disabled.
    // *   **configuring**: indicates that the domain name is being configured.
    // *   **configure_failed**: indicates that the domain name failed to be configured.
    // *   **checking**: indicates that the domain name is under review.
    // *   **check_failed**: indicates that the domain name failed the review.
    @NameInMap("DomainStatus")
    public String domainStatus;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The number of the page to return.
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // The number of entries to return on each page. Default value: **20**. Maximum value: **50**. Valid values: integers in the range of **1** to **50**.
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SecurityToken")
    public String securityToken;

    // Tag.
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
        // The key of tag N. Valid values of N: **1** to **20**.
        // 
        // If you do not specify this parameter, all tag keys are queried.
        @NameInMap("Key")
        public String key;

        // The value of tag N. Valid values of N: **1** to **20**.
        // 
        // If you do not specify this parameter, all tag values are queried.
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
