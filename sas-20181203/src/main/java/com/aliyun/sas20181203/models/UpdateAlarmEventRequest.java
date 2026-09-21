// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateAlarmEventRequest extends TeaModel {
    /**
     * <p>The list of alert event IDs.</p>
     * <p>You can call ListHoneypotAlarmEvents to obtain valid alert event IDs. Before calling this operation, ensure that honeypots are deployed and honeypot alert event data exists.</p>
     * <p>This parameter is required. If this parameter is not specified, the API returns HTTP 400 with the error code IllegalParam.</p>
     */
    @NameInMap("AlarmEventIdList")
    public java.util.List<Long> alarmEventIdList;

    /**
     * <p>The language of the request and response. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese.</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The processing method for the alert event. Valid values:</p>
     * <ul>
     * <li><strong>manual_handled</strong>: Handled.</li>
     * <li><strong>ignore</strong>: Ignored.</li>
     * <li><strong>cancel_ignore</strong>: Removed from the whitelist.</li>
     * </ul>
     * <p>This parameter is required. If this parameter is not specified, the API returns HTTP 400 with the error code IllegalParam.</p>
     * 
     * <strong>example:</strong>
     * <p>ignore</p>
     */
    @NameInMap("OperationCode")
    public String operationCode;

    /**
     * <p>The Alibaba Cloud account ID of the member accounts in the resource folder.</p>
     * <blockquote>
     * <p>You can invoke the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to obtain this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>127608589417****</p>
     */
    @NameInMap("ResourceDirectoryAccountId")
    public Long resourceDirectoryAccountId;

    public static UpdateAlarmEventRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAlarmEventRequest self = new UpdateAlarmEventRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAlarmEventRequest setAlarmEventIdList(java.util.List<Long> alarmEventIdList) {
        this.alarmEventIdList = alarmEventIdList;
        return this;
    }
    public java.util.List<Long> getAlarmEventIdList() {
        return this.alarmEventIdList;
    }

    public UpdateAlarmEventRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateAlarmEventRequest setOperationCode(String operationCode) {
        this.operationCode = operationCode;
        return this;
    }
    public String getOperationCode() {
        return this.operationCode;
    }

    public UpdateAlarmEventRequest setResourceDirectoryAccountId(Long resourceDirectoryAccountId) {
        this.resourceDirectoryAccountId = resourceDirectoryAccountId;
        return this;
    }
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

}
