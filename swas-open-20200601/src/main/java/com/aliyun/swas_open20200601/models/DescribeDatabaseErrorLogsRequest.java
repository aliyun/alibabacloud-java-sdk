// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class DescribeDatabaseErrorLogsRequest extends TeaModel {
    /**
     * <p>The ID of the Simple Database Service instance.</p>
     */
    @NameInMap("DatabaseInstanceId")
    public String databaseInstanceId;

    /**
     * <p>The end of the time range to query. Specify the time in the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mmZ format. The time must be in UTC. The end time must be later than the start time.</p>
     * <br>
     * <p>> The time displayed in the Simple Application Server console is in the format of UTC+8.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The page number.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID of the Simple Database Service instance.</p>
     * <br>
     * <p>You can call the [ListRegions](~~189315~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The beginning of the time range to query. Specify the time in the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mmZ format. The time must be in UTC.</p>
     * <br>
     * <p>> The time displayed in the Simple Application Server console is in the format of UTC+8.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDatabaseErrorLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDatabaseErrorLogsRequest self = new DescribeDatabaseErrorLogsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDatabaseErrorLogsRequest setDatabaseInstanceId(String databaseInstanceId) {
        this.databaseInstanceId = databaseInstanceId;
        return this;
    }
    public String getDatabaseInstanceId() {
        return this.databaseInstanceId;
    }

    public DescribeDatabaseErrorLogsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDatabaseErrorLogsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDatabaseErrorLogsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDatabaseErrorLogsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDatabaseErrorLogsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
