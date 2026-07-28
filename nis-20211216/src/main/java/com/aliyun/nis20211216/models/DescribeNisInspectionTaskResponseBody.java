// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class DescribeNisInspectionTaskResponseBody extends TeaModel {
    /**
     * <p>The configuration of the inspected resources.</p>
     */
    @NameInMap("CheckResourceList")
    public java.util.List<DescribeNisInspectionTaskResponseBodyCheckResourceList> checkResourceList;

    /**
     * <p>The time when the task was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-07-01 10:00:57</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The inspection interval. The unit is <strong>day</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("InspectionInterval")
    public String inspectionInterval;

    /**
     * <p>The name of the inspection task.</p>
     * 
     * <strong>example:</strong>
     * <p>Default</p>
     */
    @NameInMap("InspectionName")
    public String inspectionName;

    /**
     * <p>The type of inspection plan for the task. Valid values: basic and customized.</p>
     * 
     * <strong>example:</strong>
     * <p>basic</p>
     */
    @NameInMap("InspectionProject")
    public String inspectionProject;

    /**
     * <p>The ID of the inspection task.</p>
     * 
     * <strong>example:</strong>
     * <p>ni-8svmpe0yso2bhzr7fh79</p>
     */
    @NameInMap("InspectionTaskId")
    public String inspectionTaskId;

    /**
     * <p>The time when the inspection task was triggered.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-07-01 15:15:57</p>
     */
    @NameInMap("InspectionTriggerTime")
    public String inspectionTriggerTime;

    /**
     * <p>The ID of the latest report.</p>
     * 
     * <strong>example:</strong>
     * <p>nir-7c3dd178738a429abe6d</p>
     */
    @NameInMap("LastUpdateReportId")
    public String lastUpdateReportId;

    /**
     * <p>The time when the task was last updated.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-07-01 10:00:59</p>
     */
    @NameInMap("LastUpdateTime")
    public String lastUpdateTime;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A7F0D6EC-E19E-58AC-AC9F-08036763960F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The running status of the task.</p>
     * <p>Creating</p>
     * <p>Active</p>
     * <p>Running</p>
     * <p>Inactive</p>
     * 
     * <strong>example:</strong>
     * <p>Active</p>
     */
    @NameInMap("Status")
    public String status;

    public static DescribeNisInspectionTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNisInspectionTaskResponseBody self = new DescribeNisInspectionTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNisInspectionTaskResponseBody setCheckResourceList(java.util.List<DescribeNisInspectionTaskResponseBodyCheckResourceList> checkResourceList) {
        this.checkResourceList = checkResourceList;
        return this;
    }
    public java.util.List<DescribeNisInspectionTaskResponseBodyCheckResourceList> getCheckResourceList() {
        return this.checkResourceList;
    }

    public DescribeNisInspectionTaskResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeNisInspectionTaskResponseBody setInspectionInterval(String inspectionInterval) {
        this.inspectionInterval = inspectionInterval;
        return this;
    }
    public String getInspectionInterval() {
        return this.inspectionInterval;
    }

    public DescribeNisInspectionTaskResponseBody setInspectionName(String inspectionName) {
        this.inspectionName = inspectionName;
        return this;
    }
    public String getInspectionName() {
        return this.inspectionName;
    }

    public DescribeNisInspectionTaskResponseBody setInspectionProject(String inspectionProject) {
        this.inspectionProject = inspectionProject;
        return this;
    }
    public String getInspectionProject() {
        return this.inspectionProject;
    }

    public DescribeNisInspectionTaskResponseBody setInspectionTaskId(String inspectionTaskId) {
        this.inspectionTaskId = inspectionTaskId;
        return this;
    }
    public String getInspectionTaskId() {
        return this.inspectionTaskId;
    }

    public DescribeNisInspectionTaskResponseBody setInspectionTriggerTime(String inspectionTriggerTime) {
        this.inspectionTriggerTime = inspectionTriggerTime;
        return this;
    }
    public String getInspectionTriggerTime() {
        return this.inspectionTriggerTime;
    }

    public DescribeNisInspectionTaskResponseBody setLastUpdateReportId(String lastUpdateReportId) {
        this.lastUpdateReportId = lastUpdateReportId;
        return this;
    }
    public String getLastUpdateReportId() {
        return this.lastUpdateReportId;
    }

    public DescribeNisInspectionTaskResponseBody setLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
        return this;
    }
    public String getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    public DescribeNisInspectionTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeNisInspectionTaskResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class DescribeNisInspectionTaskResponseBodyCheckResourceList extends TeaModel {
        /**
         * <p>The inspection rule.</p>
         * 
         * <strong>example:</strong>
         * <p>CheckAll</p>
         */
        @NameInMap("CheckScope")
        public String checkScope;

        /**
         * <p>The resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>EIP</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        public static DescribeNisInspectionTaskResponseBodyCheckResourceList build(java.util.Map<String, ?> map) throws Exception {
            DescribeNisInspectionTaskResponseBodyCheckResourceList self = new DescribeNisInspectionTaskResponseBodyCheckResourceList();
            return TeaModel.build(map, self);
        }

        public DescribeNisInspectionTaskResponseBodyCheckResourceList setCheckScope(String checkScope) {
            this.checkScope = checkScope;
            return this;
        }
        public String getCheckScope() {
            return this.checkScope;
        }

        public DescribeNisInspectionTaskResponseBodyCheckResourceList setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

}
