// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeHistoryEventsStatRequest extends TeaModel {
    /**
     * <p>The archive status of the events. Valid values:</p>
     * <ul>
     * <li>Archived: Archived.</li>
     * <li>UnArchived: Unarchived.</li>
     * <li>All: All.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>All</p>
     */
    @NameInMap("ArchiveStatus")
    public String archiveStatus;

    /**
     * <p>The start time of the time range for the task start time. Specify the time in the YYYY-MM-DDThh:mm:ssZ format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-02T11:31:03Z</p>
     */
    @NameInMap("FromStartTime")
    public String fromStartTime;

    /**
     * <p>The ID of the region where the events are located.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The end time of the time range for the task start time. Specify the time in the YYYY-MM-DDThh:mm:ssZ format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-03T12:31:03Z</p>
     */
    @NameInMap("ToStartTime")
    public String toStartTime;

    public static DescribeHistoryEventsStatRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeHistoryEventsStatRequest self = new DescribeHistoryEventsStatRequest();
        return TeaModel.build(map, self);
    }

    public DescribeHistoryEventsStatRequest setArchiveStatus(String archiveStatus) {
        this.archiveStatus = archiveStatus;
        return this;
    }
    public String getArchiveStatus() {
        return this.archiveStatus;
    }

    public DescribeHistoryEventsStatRequest setFromStartTime(String fromStartTime) {
        this.fromStartTime = fromStartTime;
        return this;
    }
    public String getFromStartTime() {
        return this.fromStartTime;
    }

    public DescribeHistoryEventsStatRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeHistoryEventsStatRequest setToStartTime(String toStartTime) {
        this.toStartTime = toStartTime;
        return this;
    }
    public String getToStartTime() {
        return this.toStartTime;
    }

}
