// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class DescribeNisInspectionReportStatusResponseBody extends TeaModel {
    /**
     * <p>The end time.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-07-18 15:13:07</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The type of inspection plan used for the task.</p>
     * 
     * <strong>example:</strong>
     * <p>basic</p>
     */
    @NameInMap("InspectionProject")
    public String inspectionProject;

    /**
     * <p>The ID of the inspection report.</p>
     * 
     * <strong>example:</strong>
     * <p>nir-2ca527b8de114ba4afb9</p>
     */
    @NameInMap("InspectionReportId")
    public String inspectionReportId;

    /**
     * <p>The ID of the inspection task.</p>
     * 
     * <strong>example:</strong>
     * <p>ni-8svmpe0yso****r7fh79</p>
     */
    @NameInMap("InspectionTaskId")
    public String inspectionTaskId;

    /**
     * <p>The name of the inspection task.</p>
     * 
     * <strong>example:</strong>
     * <p>Default</p>
     */
    @NameInMap("InspectionTaskName")
    public String inspectionTaskName;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A7F0D6EC-E19E-58AC-AC9F-08036763960F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The start time.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-07-18 15:12:28</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The status of the inspection report.</p>
     * 
     * <strong>example:</strong>
     * <p>Finish</p>
     */
    @NameInMap("Status")
    public String status;

    public static DescribeNisInspectionReportStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNisInspectionReportStatusResponseBody self = new DescribeNisInspectionReportStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNisInspectionReportStatusResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeNisInspectionReportStatusResponseBody setInspectionProject(String inspectionProject) {
        this.inspectionProject = inspectionProject;
        return this;
    }
    public String getInspectionProject() {
        return this.inspectionProject;
    }

    public DescribeNisInspectionReportStatusResponseBody setInspectionReportId(String inspectionReportId) {
        this.inspectionReportId = inspectionReportId;
        return this;
    }
    public String getInspectionReportId() {
        return this.inspectionReportId;
    }

    public DescribeNisInspectionReportStatusResponseBody setInspectionTaskId(String inspectionTaskId) {
        this.inspectionTaskId = inspectionTaskId;
        return this;
    }
    public String getInspectionTaskId() {
        return this.inspectionTaskId;
    }

    public DescribeNisInspectionReportStatusResponseBody setInspectionTaskName(String inspectionTaskName) {
        this.inspectionTaskName = inspectionTaskName;
        return this;
    }
    public String getInspectionTaskName() {
        return this.inspectionTaskName;
    }

    public DescribeNisInspectionReportStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeNisInspectionReportStatusResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeNisInspectionReportStatusResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
