// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodDomainConfigsRequest extends TeaModel {
    /**
     * <p>The name of the feature. Separate multiple names with commas (,). For more information, see the **Feature description** section.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The parameters of each feature.</p>
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
