// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodDomainConfigsRequest extends TeaModel {
    /**
     * <p>The accelerated domain name for ApsaraVideo VOD. Only a single domain name can be queried at a time.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.example.com">www.example.com</a></p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The feature names. You can query multiple feature configurations in a single request. Separate multiple feature names with commas (,). For the features supported by accelerated domain names for ApsaraVideo VOD and their names, see <a href="https://help.aliyun.com/document_detail/2411639.html">Feature functions for domain name configuration</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>filetype_based_ttl_set,set_req_host_header</p>
     */
    @NameInMap("FunctionNames")
    public String functionNames;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribeVodDomainConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainConfigsRequest self = new DescribeVodDomainConfigsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVodDomainConfigsRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeVodDomainConfigsRequest setFunctionNames(String functionNames) {
        this.functionNames = functionNames;
        return this;
    }
    public String getFunctionNames() {
        return this.functionNames;
    }

    public DescribeVodDomainConfigsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeVodDomainConfigsRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
