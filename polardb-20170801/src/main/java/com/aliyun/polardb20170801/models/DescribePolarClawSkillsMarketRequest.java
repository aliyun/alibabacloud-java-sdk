// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribePolarClawSkillsMarketRequest extends TeaModel {
    /**
     * <p>The sorting condition. DOWNLOAD_COUNT indicates sorting by download count.</p>
     * 
     * <strong>example:</strong>
     * <p>DOWNLOAD_COUNT</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values:</p>
     * <ul>
     * <li><strong>30</strong></li>
     * <li><strong>50</strong></li>
     * <li><strong>100</strong></li>
     * </ul>
     * <p>Default value: <strong>30</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/98041.html">DescribeRegions</a> operation to query all available regions for the current account, including region IDs.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The skill name to search by.</p>
     * 
     * <strong>example:</strong>
     * <p>polarclawhub</p>
     */
    @NameInMap("SearchBySkillName")
    public String searchBySkillName;

    /**
     * <p>The tag name to search by.</p>
     * 
     * <strong>example:</strong>
     * <p>PolarDB</p>
     */
    @NameInMap("SearchByTagName")
    public String searchByTagName;

    /**
     * <p>The source of the skill. SELF indicates private skills of the current user, and PUBLIC indicates public skills.</p>
     * 
     * <strong>example:</strong>
     * <p>PUBLIC</p>
     */
    @NameInMap("Source")
    public String source;

    public static DescribePolarClawSkillsMarketRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePolarClawSkillsMarketRequest self = new DescribePolarClawSkillsMarketRequest();
        return TeaModel.build(map, self);
    }

    public DescribePolarClawSkillsMarketRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public DescribePolarClawSkillsMarketRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribePolarClawSkillsMarketRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribePolarClawSkillsMarketRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribePolarClawSkillsMarketRequest setSearchBySkillName(String searchBySkillName) {
        this.searchBySkillName = searchBySkillName;
        return this;
    }
    public String getSearchBySkillName() {
        return this.searchBySkillName;
    }

    public DescribePolarClawSkillsMarketRequest setSearchByTagName(String searchByTagName) {
        this.searchByTagName = searchByTagName;
        return this;
    }
    public String getSearchByTagName() {
        return this.searchByTagName;
    }

    public DescribePolarClawSkillsMarketRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
