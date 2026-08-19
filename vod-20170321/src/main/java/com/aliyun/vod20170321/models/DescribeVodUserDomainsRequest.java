// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodUserDomainsRequest extends TeaModel {
    /**
     * <p>The accelerated domain name for ApsaraVideo VOD. Fuzzy match filtering is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>example.aliyundoc.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The domain name query type. Valid values:</p>
     * <ul>
     * <li><strong>fuzzy_match</strong> (default): fuzzy match.</li>
     * <li><strong>pre_match</strong>: prefix match.</li>
     * <li><strong>suf_match</strong>: suffix match.</li>
     * <li><strong>full_match</strong>: exact match.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>fuzzy_match</p>
     */
    @NameInMap("DomainSearchType")
    public String domainSearchType;

    /**
     * <p>The domain name status filter. Valid values:</p>
     * <ul>
     * <li><strong>online</strong>: Enabled.</li>
     * <li><strong>offline</strong>: Disabled.</li>
     * <li><strong>configuring</strong>: Being configured.</li>
     * <li><strong>configure_failed</strong>: Configuration failed.</li>
     * <li><strong>checking</strong>: Being reviewed.</li>
     * <li><strong>check_failed</strong>: Review failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>online</p>
     */
    @NameInMap("DomainStatus")
    public String domainStatus;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The number of the page to return.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: <strong>20</strong>. Maximum value: <strong>50</strong>. Valid values: any integer from <strong>1</strong> to <strong>50</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The tags.</p>
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
         * <p>The tag key. Valid values of N: <strong>1</strong> to <strong>20</strong>.</p>
         * <p>By default, all tag keys are queried.</p>
         * 
         * <strong>example:</strong>
         * <p>key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. Valid values of N: <strong>1</strong> to <strong>20</strong>.</p>
         * <p>By default, all tag values are queried.</p>
         * 
         * <strong>example:</strong>
         * <p>value</p>
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
