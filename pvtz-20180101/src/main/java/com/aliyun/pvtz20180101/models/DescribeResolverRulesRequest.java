// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DescribeResolverRulesRequest extends TeaModel {
    /**
     * <p>The ID of the outbound endpoint.</p>
     * 
     * <strong>example:</strong>
     * <p>hra2**</p>
     */
    @NameInMap("EndpointId")
    public String endpointId;

    /**
     * <p>The keyword used to filter forwarding rules in %keyword% mode.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The language.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>Specifies whether to return additional information. Default value: false.</p>
     * <ul>
     * <li>If you set this parameter to true, additional information, such as the virtual private clouds (VPCs) that are associated with the queried forwarding rule, is returned.</li>
     * <li>If you set this parameter to false, no additional information is returned.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("NeedDetailAttributes")
    public Boolean needDetailAttributes;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 20. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
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
