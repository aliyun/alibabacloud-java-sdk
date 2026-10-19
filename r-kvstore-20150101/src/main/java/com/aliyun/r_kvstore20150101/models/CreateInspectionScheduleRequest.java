// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class CreateInspectionScheduleRequest extends TeaModel {
    /**
     * <p>The cron expression for the periodic scheduling.</p>
     * 
     * <strong>example:</strong>
     * <p>0 0 2 * * ?</p>
     */
    @NameInMap("CronExpression")
    public String cronExpression;

    /**
     * <p>The specified inspection items. The following inspection items are supported:</p>
     * <ul>
     * <li>RESOURCE_USAGE</li>
     * <li>BIGKEY</li>
     * <li>HOTKEY</li>
     * <li>PERFORMANCE_METRICS</li>
     * <li>SLOWLOG</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>RESOURCE_USAGE</p>
     */
    @NameInMap("InspectionItems")
    public String inspectionItems;

    /**
     * <p>The time window.</p>
     * 
     * <strong>example:</strong>
     * <p>1h</p>
     */
    @NameInMap("InspectionWindow")
    public String inspectionWindow;

    /**
     * <p>The O&amp;M Assistant instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ta-bp11iljddg37xxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The list of associated instance IDs.</p>
     * <blockquote>
     * <ul>
     * <li>Separate multiple instances with commas (,).</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>r-bp1zxszhcgatnx****</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIds;

    /**
     * <p>The report language.</p>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("ReportLanguage")
    public String reportLanguage;

    /**
     * <p>The name of the timed scheduling.</p>
     * 
     * <strong>example:</strong>
     * <p>test-sche</p>
     */
    @NameInMap("ScheduleName")
    public String scheduleName;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The time zone.</p>
     * 
     * <strong>example:</strong>
     * <p>Asia/Shanghai</p>
     */
    @NameInMap("Timezone")
    public String timezone;

    public static CreateInspectionScheduleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInspectionScheduleRequest self = new CreateInspectionScheduleRequest();
        return TeaModel.build(map, self);
    }

    public CreateInspectionScheduleRequest setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
        return this;
    }
    public String getCronExpression() {
        return this.cronExpression;
    }

    public CreateInspectionScheduleRequest setInspectionItems(String inspectionItems) {
        this.inspectionItems = inspectionItems;
        return this;
    }
    public String getInspectionItems() {
        return this.inspectionItems;
    }

    public CreateInspectionScheduleRequest setInspectionWindow(String inspectionWindow) {
        this.inspectionWindow = inspectionWindow;
        return this;
    }
    public String getInspectionWindow() {
        return this.inspectionWindow;
    }

    public CreateInspectionScheduleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateInspectionScheduleRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

    public CreateInspectionScheduleRequest setReportLanguage(String reportLanguage) {
        this.reportLanguage = reportLanguage;
        return this;
    }
    public String getReportLanguage() {
        return this.reportLanguage;
    }

    public CreateInspectionScheduleRequest setScheduleName(String scheduleName) {
        this.scheduleName = scheduleName;
        return this;
    }
    public String getScheduleName() {
        return this.scheduleName;
    }

    public CreateInspectionScheduleRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public CreateInspectionScheduleRequest setTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }
    public String getTimezone() {
        return this.timezone;
    }

}
