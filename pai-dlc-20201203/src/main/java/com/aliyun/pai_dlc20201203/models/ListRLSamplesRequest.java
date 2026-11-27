// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class ListRLSamplesRequest extends TeaModel {
    /**
     * <p>The end time of the query window in UTC RFC 3339 format. Default value: now.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-08-07T00:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The page number, starting from 1. This parameter must be specified together with PageSize. If neither parameter is specified, the default values PageNumber=1 and PageSize=10 are used.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Maximum value: 1000. This parameter must be specified together with PageNumber. If neither parameter is specified, the default value 10 is used.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The start time of the query window in UTC RFC 3339 format. Default value: EndTime-7d.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-08-04T00:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static ListRLSamplesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRLSamplesRequest self = new ListRLSamplesRequest();
        return TeaModel.build(map, self);
    }

    public ListRLSamplesRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListRLSamplesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListRLSamplesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListRLSamplesRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
