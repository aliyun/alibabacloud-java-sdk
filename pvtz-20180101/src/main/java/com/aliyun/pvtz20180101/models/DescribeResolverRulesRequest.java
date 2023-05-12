// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DescribeResolverRulesRequest extends TeaModel {
    @NameInMap("EndpointId")
    public String endpointId;

    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("NeedDetailAttributes")
    public Boolean needDetailAttributes;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeResolverRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeResolverRulesRequest self = new DescribeResolverRulesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeResolverRulesRequest setEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }
    public String getEndpointId() {
        return this.endpointId;
    }

    public DescribeResolverRulesRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public DescribeResolverRulesRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeResolverRulesRequest setNeedDetailAttributes(Boolean needDetailAttributes) {
        this.needDetailAttributes = needDetailAttributes;
        return this;
    }
    public Boolean getNeedDetailAttributes() {
        return this.needDetailAttributes;
    }

    public DescribeResolverRulesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeResolverRulesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
