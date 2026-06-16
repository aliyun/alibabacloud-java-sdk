// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribePolarxDataNodesRequest extends TeaModel {
    /**
     * <p>The type of nodes to query. Valid values:</p>
     * <ul>
     * <li>all: queries both dn and gms nodes.</li>
     * <li>gms: queries only gms nodes.</li>
     * <li>dn: queries only dn nodes.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>dn</p>
     */
    @NameInMap("NodeType")
    public String nodeType;

    /**
     * <p>The page number. The value must be a positive integer that does not exceed the maximum value of the integer data type. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region in which the instance resides.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The keyword for filtering query results.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-bp1c5w4fx****2274</p>
     */
    @NameInMap("SearchKey")
    public String searchKey;

    public static DescribePolarxDataNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePolarxDataNodesRequest self = new DescribePolarxDataNodesRequest();
        return TeaModel.build(map, self);
    }

    public DescribePolarxDataNodesRequest setNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }
    public String getNodeType() {
        return this.nodeType;
    }

    public DescribePolarxDataNodesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribePolarxDataNodesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribePolarxDataNodesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribePolarxDataNodesRequest setSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }
    public String getSearchKey() {
        return this.searchKey;
    }

}
