// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20251111.models;

import com.aliyun.tea.*;

public class ListCampaignsRequest extends TeaModel {
    /**
     * <p>The earliest actual start time.</p>
     * 
     * <strong>example:</strong>
     * <p>1634054400000</p>
     */
    @NameInMap("ActualStartTimeFrom")
    public String actualStartTimeFrom;

    /**
     * <p>The latest actual start time.</p>
     * 
     * <strong>example:</strong>
     * <p>1634054400000</p>
     */
    @NameInMap("ActualStartTimeTo")
    public String actualStartTimeTo;

    /**
     * <p>The instance ID of the outbound robot.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a4274627-265f-4e14-b2d6-4ee7d4f8593e</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the campaign.</p>
     * 
     * <strong>example:</strong>
     * <p>SatisfactionSurvey</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The page number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The earliest planned start time.</p>
     * 
     * <strong>example:</strong>
     * <p>1634054400000</p>
     */
    @NameInMap("PlannedStartTimeFrom")
    public String plannedStartTimeFrom;

    /**
     * <p>The latest planned start time.</p>
     * 
     * <strong>example:</strong>
     * <p>1634054400000</p>
     */
    @NameInMap("PlannedStartTimeTo")
    public String plannedStartTimeTo;

    /**
     * <p>The status of the campaign.</p>
     * 
     * <strong>example:</strong>
     * <p>Completed</p>
     */
    @NameInMap("State")
    public String state;

    public static ListCampaignsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCampaignsRequest self = new ListCampaignsRequest();
        return TeaModel.build(map, self);
    }

    public ListCampaignsRequest setActualStartTimeFrom(String actualStartTimeFrom) {
        this.actualStartTimeFrom = actualStartTimeFrom;
        return this;
    }
    public String getActualStartTimeFrom() {
        return this.actualStartTimeFrom;
    }

    public ListCampaignsRequest setActualStartTimeTo(String actualStartTimeTo) {
        this.actualStartTimeTo = actualStartTimeTo;
        return this;
    }
    public String getActualStartTimeTo() {
        return this.actualStartTimeTo;
    }

    public ListCampaignsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListCampaignsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListCampaignsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListCampaignsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCampaignsRequest setPlannedStartTimeFrom(String plannedStartTimeFrom) {
        this.plannedStartTimeFrom = plannedStartTimeFrom;
        return this;
    }
    public String getPlannedStartTimeFrom() {
        return this.plannedStartTimeFrom;
    }

    public ListCampaignsRequest setPlannedStartTimeTo(String plannedStartTimeTo) {
        this.plannedStartTimeTo = plannedStartTimeTo;
        return this;
    }
    public String getPlannedStartTimeTo() {
        return this.plannedStartTimeTo;
    }

    public ListCampaignsRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

}
