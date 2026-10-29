// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeVsDevicesDataRequest extends TeaModel {
    /**
     * <p>The end time of the data to retrieve. The end time must be later than the start time.</p>
     * <blockquote>
     * <ul>
     * <li>Specify the time in the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time must be in UTC.</li>
     * <li>The minimum data granularity is 5 minutes.</li>
     * <li>If you do not specify this parameter, the data of the last 24 hours is retrieved by default.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2022-01-30T16:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>348*****174-cn-qingdao</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The start time of the data to retrieve.    </p>
     * <blockquote>
     * <ul>
     * <li>Specify the time in the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time must be in UTC.</li>
     * <li>The minimum data granularity is 5 minutes.</li>
     * <li>If you do not specify this parameter, the data of the last 24 hours is retrieved by default.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2022-01-04T16:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeVsDevicesDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVsDevicesDataRequest self = new DescribeVsDevicesDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVsDevicesDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeVsDevicesDataRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeVsDevicesDataRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeVsDevicesDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
