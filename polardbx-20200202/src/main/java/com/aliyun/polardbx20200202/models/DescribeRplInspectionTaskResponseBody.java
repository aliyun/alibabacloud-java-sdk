// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeRplInspectionTaskResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeRplInspectionTaskResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeRplInspectionTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRplInspectionTaskResponseBody self = new DescribeRplInspectionTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRplInspectionTaskResponseBody setData(DescribeRplInspectionTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeRplInspectionTaskResponseBodyData getData() {
        return this.data;
    }

    public DescribeRplInspectionTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeRplInspectionTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRplInspectionTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeRplInspectionTaskResponseBodyDataInspectionTaskList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2025-09-25T02:36:20.000+0000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p>For database: wms ,Found SIMPLE sequences in 1.0. PolarDB-X 2.0 does not support SIMPLE sequence any more， please use show sequence to check them.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>10142</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>slinktaskid。</p>
         * 
         * <strong>example:</strong>
         * <p>etx-hzrez23btmb6aq</p>
         */
        @NameInMap("SlinkTaskId")
        public String slinkTaskId;

        /**
         * <strong>example:</strong>
         * <p>CONNECTIVITY</p>
         */
        @NameInMap("Stage")
        public String stage;

        /**
         * <strong>example:</strong>
         * <p>SUCCEEDED</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>2025-09-23T03:25:21.000+0000</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static DescribeRplInspectionTaskResponseBodyDataInspectionTaskList build(java.util.Map<String, ?> map) throws Exception {
            DescribeRplInspectionTaskResponseBodyDataInspectionTaskList self = new DescribeRplInspectionTaskResponseBodyDataInspectionTaskList();
            return TeaModel.build(map, self);
        }

        public DescribeRplInspectionTaskResponseBodyDataInspectionTaskList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeRplInspectionTaskResponseBodyDataInspectionTaskList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeRplInspectionTaskResponseBodyDataInspectionTaskList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeRplInspectionTaskResponseBodyDataInspectionTaskList setSlinkTaskId(String slinkTaskId) {
            this.slinkTaskId = slinkTaskId;
            return this;
        }
        public String getSlinkTaskId() {
            return this.slinkTaskId;
        }

        public DescribeRplInspectionTaskResponseBodyDataInspectionTaskList setStage(String stage) {
            this.stage = stage;
            return this;
        }
        public String getStage() {
            return this.stage;
        }

        public DescribeRplInspectionTaskResponseBodyDataInspectionTaskList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeRplInspectionTaskResponseBodyDataInspectionTaskList setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class DescribeRplInspectionTaskResponseBodyData extends TeaModel {
        @NameInMap("InspectionTaskList")
        public java.util.List<DescribeRplInspectionTaskResponseBodyDataInspectionTaskList> inspectionTaskList;

        /**
         * <strong>example:</strong>
         * <p>PRE_CHECK</p>
         */
        @NameInMap("SlinkStage")
        public String slinkStage;

        public static DescribeRplInspectionTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeRplInspectionTaskResponseBodyData self = new DescribeRplInspectionTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeRplInspectionTaskResponseBodyData setInspectionTaskList(java.util.List<DescribeRplInspectionTaskResponseBodyDataInspectionTaskList> inspectionTaskList) {
            this.inspectionTaskList = inspectionTaskList;
            return this;
        }
        public java.util.List<DescribeRplInspectionTaskResponseBodyDataInspectionTaskList> getInspectionTaskList() {
            return this.inspectionTaskList;
        }

        public DescribeRplInspectionTaskResponseBodyData setSlinkStage(String slinkStage) {
            this.slinkStage = slinkStage;
            return this;
        }
        public String getSlinkStage() {
            return this.slinkStage;
        }

    }

}
