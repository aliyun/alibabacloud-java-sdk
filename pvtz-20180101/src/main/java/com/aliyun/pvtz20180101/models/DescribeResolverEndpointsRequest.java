// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DescribeResolverEndpointsRequest extends TeaModel {
    /**
     * <p>The keyword for the endpoint name. A fuzzy search is performed.</p>
     * 
     * <strong>example:</strong>
     * <p>Endpoint-test</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><p>zh: Chinese.</p>
     * </li>
     * <li><p>en: English.</p>
     * </li>
     * </ul>
     * <p>Default value: en</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The page number for a paged query. The value starts from 1. The default value is 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. The maximum value is 100. The default value is 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The status of the endpoint. Valid values:</p>
     * <ul>
     * <li><p>SUCCESS: The endpoint is working as expected.</p>
     * </li>
     * <li><p>INIT: The endpoint is being created.</p>
     * </li>
     * <li><p>FAILED: The endpoint failed to be created.</p>
     * </li>
     * <li><p>CHANGE_INIT: The endpoint is being modified.</p>
     * </li>
     * <li><p>CHANGE_FAILED: The endpoint failed to be modified.</p>
     * </li>
     * <li><p>EXCEPTION: The endpoint is not working as expected.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If you do not specify this parameter, endpoints in all states are returned. If you specify this parameter, only endpoints in the specified state are returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The ID of the region where the outbound virtual private cloud (VPC) is located.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-zhangjiakou</p>
     */
    @NameInMap("VpcRegionId")
    public String vpcRegionId;

    public static DescribeResolverEndpointsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeResolverEndpointsRequest self = new DescribeResolverEndpointsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeResolverEndpointsRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public DescribeResolverEndpointsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeResolverEndpointsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeResolverEndpointsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeResolverEndpointsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeResolverEndpointsRequest setVpcRegionId(String vpcRegionId) {
        this.vpcRegionId = vpcRegionId;
        return this;
    }
    public String getVpcRegionId() {
        return this.vpcRegionId;
    }

}
