// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateFileProtectEventStatusRequest extends TeaModel {
    /**
     * <p>The list of alert notification levels.</p>
     */
    @NameInMap("AlertLevels")
    public java.util.List<Integer> alertLevels;

    /**
     * <p>The end timestamp of the query.</p>
     * 
     * <strong>example:</strong>
     * <p>1649040221</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The list of event IDs.</p>
     */
    @NameInMap("Id")
    public java.util.List<Long> id;

    /**
     * <p>The ID of the asset instance.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp1g6wxdwps7s9dz****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the asset instance.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The public IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>120.27.XX.XX</p>
     */
    @NameInMap("InternetIp")
    public String internetIp;

    /**
     * <p>The internal IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>172.26.XX.XX</p>
     */
    @NameInMap("IntranetIp")
    public String intranetIp;

    /**
     * <p>The type of operation performed on the file. Valid values:</p>
     * <ul>
     * <li><strong>DELETE</strong>: Deletes a file.</li>
     * <li><strong>WRITE</strong>: Writes to a file.</li>
     * <li><strong>READ</strong>: Reads a file.</li>
     * <li><strong>RENAME</strong>: Renames a file.</li>
     * <li><strong>CHOWN</strong>: Changes the file owner and associated file group.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>READ</p>
     */
    @NameInMap("Operation")
    public String operation;

    /**
     * <p>The rule name.</p>
     * 
     * <strong>example:</strong>
     * <p>tetsRule</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>Specifies whether to select all items across pages. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Selected.</li>
     * <li><strong>false</strong>: Not selected.</li>
     * </ul>
     */
    @NameInMap("SelectAllAcrossPages")
    public Boolean selectAllAcrossPages;

    /**
     * <p>The start timestamp of the query.</p>
     * 
     * <strong>example:</strong>
     * <p>1680919232000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The event handling status.</p>
     * <ul>
     * <li><strong>0</strong>: Unhandled</li>
     * <li><strong>1</strong>: Manually handled</li>
     * <li><strong>2</strong>: Added to whitelist</li>
     * <li><strong>3</strong>: Ignored</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <p>The UUID of the server.</p>
     * 
     * <strong>example:</strong>
     * <p>eb2c782e-64f2-4590-a86c-d90164df****</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    public static UpdateFileProtectEventStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFileProtectEventStatusRequest self = new UpdateFileProtectEventStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFileProtectEventStatusRequest setAlertLevels(java.util.List<Integer> alertLevels) {
        this.alertLevels = alertLevels;
        return this;
    }
    public java.util.List<Integer> getAlertLevels() {
        return this.alertLevels;
    }

    public UpdateFileProtectEventStatusRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public UpdateFileProtectEventStatusRequest setId(java.util.List<Long> id) {
        this.id = id;
        return this;
    }
    public java.util.List<Long> getId() {
        return this.id;
    }

    public UpdateFileProtectEventStatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateFileProtectEventStatusRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public UpdateFileProtectEventStatusRequest setInternetIp(String internetIp) {
        this.internetIp = internetIp;
        return this;
    }
    public String getInternetIp() {
        return this.internetIp;
    }

    public UpdateFileProtectEventStatusRequest setIntranetIp(String intranetIp) {
        this.intranetIp = intranetIp;
        return this;
    }
    public String getIntranetIp() {
        return this.intranetIp;
    }

    public UpdateFileProtectEventStatusRequest setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

    public UpdateFileProtectEventStatusRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public UpdateFileProtectEventStatusRequest setSelectAllAcrossPages(Boolean selectAllAcrossPages) {
        this.selectAllAcrossPages = selectAllAcrossPages;
        return this;
    }
    public Boolean getSelectAllAcrossPages() {
        return this.selectAllAcrossPages;
    }

    public UpdateFileProtectEventStatusRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public UpdateFileProtectEventStatusRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public UpdateFileProtectEventStatusRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
