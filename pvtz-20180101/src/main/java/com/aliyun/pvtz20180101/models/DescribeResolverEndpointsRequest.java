// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DescribeResolverEndpointsRequest extends TeaModel {
    /**
     * <p>The keyword used to filter endpoints in %keyword% mode.</p>
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

    /**
     * <p>The state of the endpoint that you want to query. If you do not specify this parameter, all endpoints are returned. Valid values:</p>
     * <ul>
     * <li>SUCCESS: The endpoint works as expected.</li>
     * <li>INIT: The endpoint is being created.</li>
     * <li>FAILED: The endpoint fails to be created.</li>
     * <li>CHANGE_INIT: The endpoint is being modified.</li>
     * <li>CHANGE_FAILED: The endpoint fails to be modified.</li>
     * <li>EXCEPTION: The endpoint encounters an exception.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Status")
    public String status;

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
