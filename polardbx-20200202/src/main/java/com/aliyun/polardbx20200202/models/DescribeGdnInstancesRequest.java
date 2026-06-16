// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeGdnInstancesRequest extends TeaModel {
    /**
     * <p>The message filter type.</p>
     * 
     * <strong>example:</strong>
     * <p>gdn_id、
     * polarx_id</p>
     */
    @NameInMap("FilterType")
    public String filterType;

    /**
     * <p>The filter value for querying resources.</p>
     * <p>This parameter is used together with FilterKey.</p>
     * 
     * <strong>example:</strong>
     * <p>gdn-<em><strong>、
     * pxc-</strong></em></p>
     */
    @NameInMap("FilterValue")
    public String filterValue;

    /**
     * <p>The GDN ID.</p>
     * 
     * <strong>example:</strong>
     * <p>gdn-***</p>
     */
    @NameInMap("GDNId")
    public String GDNId;

    /**
     * <p>The page number. The value must be a positive integer that does not exceed the maximum value of the Integer data type. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("PageNum")
    public String pageNum;

    /**
     * <p>The page size.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeGdnInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGdnInstancesRequest self = new DescribeGdnInstancesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeGdnInstancesRequest setFilterType(String filterType) {
        this.filterType = filterType;
        return this;
    }
    public String getFilterType() {
        return this.filterType;
    }

    public DescribeGdnInstancesRequest setFilterValue(String filterValue) {
        this.filterValue = filterValue;
        return this;
    }
    public String getFilterValue() {
        return this.filterValue;
    }

    public DescribeGdnInstancesRequest setGDNId(String GDNId) {
        this.GDNId = GDNId;
        return this;
    }
    public String getGDNId() {
        return this.GDNId;
    }

    public DescribeGdnInstancesRequest setPageNum(String pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public String getPageNum() {
        return this.pageNum;
    }

    public DescribeGdnInstancesRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeGdnInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
