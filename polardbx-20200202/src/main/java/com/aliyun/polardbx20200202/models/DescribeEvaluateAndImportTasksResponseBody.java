// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeEvaluateAndImportTasksResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeEvaluateAndImportTasksResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <strong>example:</strong>
     * <p>81519FDE-713B-****-B6F1-231479A4C9DB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("TotalNumber")
    public Long totalNumber;

    public static DescribeEvaluateAndImportTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEvaluateAndImportTasksResponseBody self = new DescribeEvaluateAndImportTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEvaluateAndImportTasksResponseBody setData(java.util.List<DescribeEvaluateAndImportTasksResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeEvaluateAndImportTasksResponseBodyData> getData() {
        return this.data;
    }

    public DescribeEvaluateAndImportTasksResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeEvaluateAndImportTasksResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeEvaluateAndImportTasksResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeEvaluateAndImportTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEvaluateAndImportTasksResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeEvaluateAndImportTasksResponseBody setTotalNumber(Long totalNumber) {
        this.totalNumber = totalNumber;
        return this;
    }
    public Long getTotalNumber() {
        return this.totalNumber;
    }

    public static class DescribeEvaluateAndImportTasksResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>26842</p>
         */
        @NameInMap("Bid")
        public String bid;

        /**
         * <strong>example:</strong>
         * <p>346650</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <strong>example:</strong>
         * <p>fase</p>
         */
        @NameInMap("Deleted")
        public Boolean deleted;

        /**
         * <strong>example:</strong>
         * <p>2025-01-08T15:00Z</p>
         */
        @NameInMap("GmtCreated")
        public Long gmtCreated;

        /**
         * <strong>example:</strong>
         * <p>2025-04-02T02:10:59Z</p>
         */
        @NameInMap("GmtModified")
        public Long gmtModified;

        /**
         * <strong>example:</strong>
         * <p>ap-northeast-1</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>cn-zhangjiakou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>e3plus_*****_prod</p>
         */
        @NameInMap("SlinkDstDb")
        public String slinkDstDb;

        /**
         * <strong>example:</strong>
         * <p>pxc-hzrehc****5zye</p>
         */
        @NameInMap("SlinkDstResId")
        public String slinkDstResId;

        /**
         * <strong>example:</strong>
         * <p>dts_temp_2_23</p>
         */
        @NameInMap("SlinkDstUserName")
        public String slinkDstUserName;

        /**
         * <strong>example:</strong>
         * <p>stock</p>
         */
        @NameInMap("SlinkSrcDb")
        public String slinkSrcDb;

        /**
         * <strong>example:</strong>
         * <p>drdshbga*****w4p</p>
         */
        @NameInMap("SlinkSrcResId")
        public String slinkSrcResId;

        /**
         * <strong>example:</strong>
         * <p>RDS_MYSQL</p>
         */
        @NameInMap("SlinkSrcResType")
        public String slinkSrcResType;

        /**
         * <strong>example:</strong>
         * <p>dtdba</p>
         */
        @NameInMap("SlinkSrcUserName")
        public String slinkSrcUserName;

        /**
         * <strong>example:</strong>
         * <p>DATA_IMPORT_RUNNING</p>
         */
        @NameInMap("SlinkStage")
        public String slinkStage;

        /**
         * <strong>example:</strong>
         * <p>IMPORT_NOT_BEGIN</p>
         */
        @NameInMap("SlinkStatus")
        public String slinkStatus;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("SlinkTaskDesc")
        public String slinkTaskDesc;

        /**
         * <strong>example:</strong>
         * <p>etx-szr2rr6i*****</p>
         */
        @NameInMap("SlinkTaskId")
        public String slinkTaskId;

        /**
         * <strong>example:</strong>
         * <p>evaluate_import</p>
         */
        @NameInMap("SlinkType")
        public String slinkType;

        public static DescribeEvaluateAndImportTasksResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeEvaluateAndImportTasksResponseBodyData self = new DescribeEvaluateAndImportTasksResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeEvaluateAndImportTasksResponseBodyData setBid(String bid) {
            this.bid = bid;
            return this;
        }
        public String getBid() {
            return this.bid;
        }

        public DescribeEvaluateAndImportTasksResponseBodyData setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public DescribeEvaluateAndImportTasksResponseBodyData setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public DescribeEvaluateAndImportTasksResponseBodyData setGmtCreated(Long gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public Long getGmtCreated() {
            return this.gmtCreated;
        }

        public DescribeEvaluateAndImportTasksResponseBodyData setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public DescribeEvaluateAndImportTasksResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeEvaluateAndImportTasksResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeEvaluateAndImportTasksResponseBodyData setSlinkDstDb(String slinkDstDb) {
            this.slinkDstDb = slinkDstDb;
            return this;
        }
        public String getSlinkDstDb() {
            return this.slinkDstDb;
        }

        public DescribeEvaluateAndImportTasksResponseBodyData setSlinkDstResId(String slinkDstResId) {
            this.slinkDstResId = slinkDstResId;
            return this;
        }
        public String getSlinkDstResId() {
            return this.slinkDstResId;
        }

        public DescribeEvaluateAndImportTasksResponseBodyData setSlinkDstUserName(String slinkDstUserName) {
            this.slinkDstUserName = slinkDstUserName;
            return this;
        }
        public String getSlinkDstUserName() {
            return this.slinkDstUserName;
        }

        public DescribeEvaluateAndImportTasksResponseBodyData setSlinkSrcDb(String slinkSrcDb) {
            this.slinkSrcDb = slinkSrcDb;
            return this;
        }
        public String getSlinkSrcDb() {
            return this.slinkSrcDb;
        }

        public DescribeEvaluateAndImportTasksResponseBodyData setSlinkSrcResId(String slinkSrcResId) {
            this.slinkSrcResId = slinkSrcResId;
            return this;
        }
        public String getSlinkSrcResId() {
            return this.slinkSrcResId;
        }

        public DescribeEvaluateAndImportTasksResponseBodyData setSlinkSrcResType(String slinkSrcResType) {
            this.slinkSrcResType = slinkSrcResType;
            return this;
        }
        public String getSlinkSrcResType() {
            return this.slinkSrcResType;
        }

        public DescribeEvaluateAndImportTasksResponseBodyData setSlinkSrcUserName(String slinkSrcUserName) {
            this.slinkSrcUserName = slinkSrcUserName;
            return this;
        }
        public String getSlinkSrcUserName() {
            return this.slinkSrcUserName;
        }

        public DescribeEvaluateAndImportTasksResponseBodyData setSlinkStage(String slinkStage) {
            this.slinkStage = slinkStage;
            return this;
        }
        public String getSlinkStage() {
            return this.slinkStage;
        }

        public DescribeEvaluateAndImportTasksResponseBodyData setSlinkStatus(String slinkStatus) {
            this.slinkStatus = slinkStatus;
            return this;
        }
        public String getSlinkStatus() {
            return this.slinkStatus;
        }

        public DescribeEvaluateAndImportTasksResponseBodyData setSlinkTaskDesc(String slinkTaskDesc) {
            this.slinkTaskDesc = slinkTaskDesc;
            return this;
        }
        public String getSlinkTaskDesc() {
            return this.slinkTaskDesc;
        }

        public DescribeEvaluateAndImportTasksResponseBodyData setSlinkTaskId(String slinkTaskId) {
            this.slinkTaskId = slinkTaskId;
            return this;
        }
        public String getSlinkTaskId() {
            return this.slinkTaskId;
        }

        public DescribeEvaluateAndImportTasksResponseBodyData setSlinkType(String slinkType) {
            this.slinkType = slinkType;
            return this;
        }
        public String getSlinkType() {
            return this.slinkType;
        }

    }

}
