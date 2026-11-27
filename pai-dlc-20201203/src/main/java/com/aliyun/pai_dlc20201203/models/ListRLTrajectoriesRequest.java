// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class ListRLTrajectoriesRequest extends TeaModel {
    /**
     * <p>The end time of the query window in UTC RFC3339 format. Default value: now.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-08-07T00:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The page number, starting from 1. This parameter must be provided together with PageSize. If neither is provided, the default values PageNumber=1 and PageSize=10 are used.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Maximum value: 1000. This parameter must be provided together with PageNumber. If neither is provided, the default value 10 is used.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The sample UID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3afcfbdf-3956-4ab2-b9cb-f9c204b8fc9c</p>
     */
    @NameInMap("PromptUid")
    public String promptUid;

    /**
     * <p>The start time of the query window in UTC RFC3339 format. Default value: EndTime-7d.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-08-04T00:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static ListRLTrajectoriesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRLTrajectoriesRequest self = new ListRLTrajectoriesRequest();
        return TeaModel.build(map, self);
    }

    public ListRLTrajectoriesRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListRLTrajectoriesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListRLTrajectoriesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListRLTrajectoriesRequest setPromptUid(String promptUid) {
        this.promptUid = promptUid;
        return this;
    }
    public String getPromptUid() {
        return this.promptUid;
    }

    public ListRLTrajectoriesRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
