// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListUnknownThreatDetectMachineRequest extends TeaModel {
    /**
     * <p>The page number of the current page in a paging query.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The status of the alert event. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: pending</li>
     * <li><strong>2</strong>: ignored</li>
     * <li><strong>4</strong>: confirmed</li>
     * <li><strong>8</strong>: marked as false positive</li>
     * <li><strong>16</strong>: processing</li>
     * <li><strong>32</strong>: handled</li>
     * <li><strong>64</strong>: expired</li>
     * <li><strong>604</strong>: marked as false positive by the system</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("EventStatus")
    public Integer eventStatus;

    /**
     * <p>The maximum number of entries to return on each page in a paging query.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The name or IP address of the server.</p>
     * 
     * <strong>example:</strong>
     * <p>test-ecs</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The running status of the server. Valid values:</p>
     * <ul>
     * <li><strong>monitoring</strong>: alerting</li>
     * <li><strong>blocking</strong>: blocking</li>
     * <li><strong>studying</strong>: learning</li>
     * <li><strong>study_finish</strong>: learning completed</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>studying</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The whitelist mode. Valid values:</p>
     * <ul>
     * <li><strong>hash</strong>: the hash of the process</li>
     * <li><strong>path</strong>: the path of the process</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>hash</p>
     */
    @NameInMap("StudyMode")
    public String studyMode;

    /**
     * <p>The end time of the time range when the model was created. The value is a UNIX timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1768891966346</p>
     */
    @NameInMap("StudyTimeEnd")
    public Long studyTimeEnd;

    /**
     * <p>The start time of the time range when the model was created. The value is a UNIX timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1768891966344</p>
     */
    @NameInMap("StudyTimeStart")
    public Long studyTimeStart;

    /**
     * <p>The UUID of the server.</p>
     * 
     * <strong>example:</strong>
     * <p>d2d94e8b-bb25-4744-8004-1e08a53c****</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    public static ListUnknownThreatDetectMachineRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUnknownThreatDetectMachineRequest self = new ListUnknownThreatDetectMachineRequest();
        return TeaModel.build(map, self);
    }

    public ListUnknownThreatDetectMachineRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListUnknownThreatDetectMachineRequest setEventStatus(Integer eventStatus) {
        this.eventStatus = eventStatus;
        return this;
    }
    public Integer getEventStatus() {
        return this.eventStatus;
    }

    public ListUnknownThreatDetectMachineRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListUnknownThreatDetectMachineRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public ListUnknownThreatDetectMachineRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListUnknownThreatDetectMachineRequest setStudyMode(String studyMode) {
        this.studyMode = studyMode;
        return this;
    }
    public String getStudyMode() {
        return this.studyMode;
    }

    public ListUnknownThreatDetectMachineRequest setStudyTimeEnd(Long studyTimeEnd) {
        this.studyTimeEnd = studyTimeEnd;
        return this;
    }
    public Long getStudyTimeEnd() {
        return this.studyTimeEnd;
    }

    public ListUnknownThreatDetectMachineRequest setStudyTimeStart(Long studyTimeStart) {
        this.studyTimeStart = studyTimeStart;
        return this;
    }
    public Long getStudyTimeStart() {
        return this.studyTimeStart;
    }

    public ListUnknownThreatDetectMachineRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
