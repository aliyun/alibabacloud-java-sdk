// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifySecurityCheckScheduleConfigRequest extends TeaModel {
    /**
     * <p>The days on which the automatic configuration check runs. You can specify multiple days. Separate multiple days with commas (,). Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: Monday</li>
     * <li><strong>2</strong>: Tuesday</li>
     * <li><strong>3</strong>: Wednesday</li>
     * <li><strong>4</strong>: Thursday</li>
     * <li><strong>5</strong>: Friday</li>
     * <li><strong>6</strong>: Saturday</li>
     * <li><strong>7</strong>: Sunday</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4,5,6</p>
     */
    @NameInMap("DaysOfWeek")
    public String daysOfWeek;

    /**
     * <p>The time period during which the automatic configuration check ends. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: 00:00 to 06:00</li>
     * <li><strong>6</strong>: 06:00 to 12:00</li>
     * <li><strong>12</strong>: 12:00 to 18:00</li>
     * <li><strong>18</strong>: 18:00 to 24:00</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("EndTime")
    public Integer endTime;

    /**
     * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The source IP address of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The time period during which the automatic configuration check starts. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: 00:00 to 06:00</li>
     * <li><strong>6</strong>: 06:00 to 12:00</li>
     * <li><strong>12</strong>: 12:00 to 18:00</li>
     * <li><strong>18</strong>: 18:00 to 24:00</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("StartTime")
    public Integer startTime;

    public static ModifySecurityCheckScheduleConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySecurityCheckScheduleConfigRequest self = new ModifySecurityCheckScheduleConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifySecurityCheckScheduleConfigRequest setDaysOfWeek(String daysOfWeek) {
        this.daysOfWeek = daysOfWeek;
        return this;
    }
    public String getDaysOfWeek() {
        return this.daysOfWeek;
    }

    public ModifySecurityCheckScheduleConfigRequest setEndTime(Integer endTime) {
        this.endTime = endTime;
        return this;
    }
    public Integer getEndTime() {
        return this.endTime;
    }

    public ModifySecurityCheckScheduleConfigRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ModifySecurityCheckScheduleConfigRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifySecurityCheckScheduleConfigRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public ModifySecurityCheckScheduleConfigRequest setStartTime(Integer startTime) {
        this.startTime = startTime;
        return this;
    }
    public Integer getStartTime() {
        return this.startTime;
    }

}
