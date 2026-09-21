// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class SaveSuspEventUserSettingRequest extends TeaModel {
    /**
     * <p>The source of the exception event data. Set the value to sas.</p>
     * 
     * <strong>example:</strong>
     * <p>sas</p>
     */
    @NameInMap("From")
    public String from;

    /**
     * <p>The alert level for alert notifications. Valid values:</p>
     * <ul>
     * <li><strong>remind</strong>: Reminder.</li>
     * <li><strong>suspicious</strong>: Suspicious.</li>
     * <li><strong>serious</strong>: Urgent.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>suspicious,serious,remind</p>
     */
    @NameInMap("LevelsOn")
    public String levelsOn;

    /**
     * <p>The ID of the member account in the resource directory.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to obtain this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>127608589417****</p>
     */
    @NameInMap("ResourceDirectoryAccountId")
    public Long resourceDirectoryAccountId;

    public static SaveSuspEventUserSettingRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveSuspEventUserSettingRequest self = new SaveSuspEventUserSettingRequest();
        return TeaModel.build(map, self);
    }

    public SaveSuspEventUserSettingRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public SaveSuspEventUserSettingRequest setLevelsOn(String levelsOn) {
        this.levelsOn = levelsOn;
        return this;
    }
    public String getLevelsOn() {
        return this.levelsOn;
    }

    public SaveSuspEventUserSettingRequest setResourceDirectoryAccountId(Long resourceDirectoryAccountId) {
        this.resourceDirectoryAccountId = resourceDirectoryAccountId;
        return this;
    }
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

}
