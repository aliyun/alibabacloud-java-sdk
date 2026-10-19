// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class ModifyInspectionScheduleRequest extends TeaModel {
    /**
     * <p>The cron expression.</p>
     * 
     * <strong>example:</strong>
     * <p>0 0 2 * * ?</p>
     */
    @NameInMap("CronExpression")
    public String cronExpression;

    /**
     * <p>Specifies whether to start the scheduled task. Default value: true.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Enabled")
    public Long enabled;

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
     * <p>HOTKEY</p>
     */
    @NameInMap("InspectionItems")
    public String inspectionItems;

    /**
     * <p>1h</p>
     * 
     * <strong>example:</strong>
     * <p>1h</p>
     */
    @NameInMap("InspectionWindow")
    public String inspectionWindow;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>r-bp1zxszhcgatnx****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The list of associated instance IDs.</p>
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
     * <p>The ID of the timed scheduling.</p>
     * 
     * <strong>example:</strong>
     * <p>sch-4dfb08ddf9f84855bacca35axxx</p>
     */
    @NameInMap("ScheduleId")
    public String scheduleId;

    /**
     * <p>The name of the timed scheduling.</p>
     * 
     * <strong>example:</strong>
     * <p>test-sche</p>
     */
    @NameInMap("ScheduleName")
    public String scheduleName;

    /**
     * <p>The time zone.</p>
     * 
     * <strong>example:</strong>
     * <p>Asia/Shanghai</p>
     */
    @NameInMap("Timezone")
    public String timezone;

    public static ModifyInspectionScheduleRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInspectionScheduleRequest self = new ModifyInspectionScheduleRequest();
        return TeaModel.build(map, self);
    }

    public ModifyInspectionScheduleRequest setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
        return this;
    }
    public String getCronExpression() {
        return this.cronExpression;
    }

    public ModifyInspectionScheduleRequest setEnabled(Long enabled) {
        this.enabled = enabled;
        return this;
    }
    public Long getEnabled() {
        return this.enabled;
    }

    public ModifyInspectionScheduleRequest setInspectionItems(String inspectionItems) {
        this.inspectionItems = inspectionItems;
        return this;
    }
    public String getInspectionItems() {
        return this.inspectionItems;
    }

    public ModifyInspectionScheduleRequest setInspectionWindow(String inspectionWindow) {
        this.inspectionWindow = inspectionWindow;
        return this;
    }
    public String getInspectionWindow() {
        return this.inspectionWindow;
    }

    public ModifyInspectionScheduleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyInspectionScheduleRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

    public ModifyInspectionScheduleRequest setReportLanguage(String reportLanguage) {
        this.reportLanguage = reportLanguage;
        return this;
    }
    public String getReportLanguage() {
        return this.reportLanguage;
    }

    public ModifyInspectionScheduleRequest setScheduleId(String scheduleId) {
        this.scheduleId = scheduleId;
        return this;
    }
    public String getScheduleId() {
        return this.scheduleId;
    }

    public ModifyInspectionScheduleRequest setScheduleName(String scheduleName) {
        this.scheduleName = scheduleName;
        return this;
    }
    public String getScheduleName() {
        return this.scheduleName;
    }

    public ModifyInspectionScheduleRequest setTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }
    public String getTimezone() {
        return this.timezone;
    }

}
