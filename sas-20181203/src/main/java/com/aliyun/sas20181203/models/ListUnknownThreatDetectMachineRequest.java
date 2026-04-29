// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListUnknownThreatDetectMachineRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>test-ecs</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <strong>example:</strong>
     * <p>studying</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>hash</p>
     */
    @NameInMap("StudyMode")
    public String studyMode;

    /**
     * <strong>example:</strong>
     * <p>1768891966346</p>
     */
    @NameInMap("StudyTimeEnd")
    public Long studyTimeEnd;

    /**
     * <strong>example:</strong>
     * <p>1768891966344</p>
     */
    @NameInMap("StudyTimeStart")
    public Long studyTimeStart;

    /**
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
