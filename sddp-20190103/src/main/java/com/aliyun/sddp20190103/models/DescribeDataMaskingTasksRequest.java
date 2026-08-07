// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeDataMaskingTasksRequest extends TeaModel {
    /**
     * <p>The page number for a paged query.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The service to which the destination data source belongs. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: MaxCompute.</li>
     * <li><strong>2</strong>: OSS.</li>
     * <li><strong>3</strong>: ADS.</li>
     * <li><strong>4</strong>: OTS.</li>
     * <li><strong>5</strong>: RDS.</li>
     * <li><strong>6</strong>: SELF_DB.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("DstType")
    public Integer dstType;

    /**
     * <p>The end time of the task creation period. Format: timestamp. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1583856000000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The language of the request and response. Default value: <strong>zh_cn</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh_cn</strong>: Chinese.</li>
     * <li><strong>en_us</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh_cn</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The maximum number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The keyword used to search for tasks. You can search by task name or task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("SearchKey")
    public String searchKey;

    /**
     * <p>The start time of the task creation period. Format: timestamp. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1582992000000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static DescribeDataMaskingTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataMaskingTasksRequest self = new DescribeDataMaskingTasksRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDataMaskingTasksRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeDataMaskingTasksRequest setDstType(Integer dstType) {
        this.dstType = dstType;
        return this;
    }
    public Integer getDstType() {
        return this.dstType;
    }

    public DescribeDataMaskingTasksRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeDataMaskingTasksRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeDataMaskingTasksRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDataMaskingTasksRequest setSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }
    public String getSearchKey() {
        return this.searchKey;
    }

    public DescribeDataMaskingTasksRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
