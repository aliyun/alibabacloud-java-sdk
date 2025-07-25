// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DescribeResolverEndpointsRequest extends TeaModel {
    /**
     * <p>The keyword of the endpoint name, which is used for fuzzy searches.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li>zh: Chinese</li>
     * <li>en: English</li>
     * </ul>
     * <p>Default value: en.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The page number. Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values: 1 to 100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The state of the endpoint that you want to query. Valid values:</p>
     * <ul>
     * <li>SUCCESS: The endpoint works as expected.</li>
     * <li>INIT: The endpoint is being created.</li>
     * <li>FAILED: The endpoint failed to be created.</li>
     * <li>CHANGE_INIT: The endpoint is being modified.</li>
     * <li>CHANGE_FAILED: The endpoint failed to be modified.</li>
     * <li>EXCEPTION: The endpoint encountered an exception.</li>
     * </ul>
     * <blockquote>
     * <p> If you do not specify this parameter, endpoints in all states are returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The region ID of the outbound virtual private cloud (VPC).</p>
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
