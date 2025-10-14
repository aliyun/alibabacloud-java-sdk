// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeEvaluateAndImportTaskResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeEvaluateAndImportTaskResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>73559800-****-11ec-bd40-99cfcff3fe1e</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeEvaluateAndImportTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEvaluateAndImportTaskResponseBody self = new DescribeEvaluateAndImportTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEvaluateAndImportTaskResponseBody setData(DescribeEvaluateAndImportTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeEvaluateAndImportTaskResponseBodyData getData() {
        return this.data;
    }

    public DescribeEvaluateAndImportTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeEvaluateAndImportTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEvaluateAndImportTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeEvaluateAndImportTaskResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>26842</p>
         */
        @NameInMap("Bid")
        public String bid;

        @NameInMap("Context")
        public String context;

        /**
         * <strong>example:</strong>
         * <p>346650</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Deleted")
        public Boolean deleted;

        /**
         * <strong>example:</strong>
         * <p>2025-06-08T15:00Z</p>
         */
        @NameInMap("GmtCreated")
        public Long gmtCreated;

        /**
         * <strong>example:</strong>
         * <p>1605080537000</p>
         */
        @NameInMap("GmtModified")
        public Long gmtModified;

        /**
         * <strong>example:</strong>
         * <p>76251</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>fr_import</p>
         */
        @NameInMap("SlinkDstDb")
        public String slinkDstDb;

        /**
         * <strong>example:</strong>
         * <p>pxc-hzrehc60jz5zye</p>
         */
        @NameInMap("SlinkDstResId")
        public String slinkDstResId;

        /**
         * <strong>example:</strong>
         * <p>dts_dtdba</p>
         */
        @NameInMap("SlinkDstUserName")
        public String slinkDstUserName;

        /**
         * <strong>example:</strong>
         * <p>fr_import</p>
         */
        @NameInMap("SlinkSrcDb")
        public String slinkSrcDb;

        /**
         * <strong>example:</strong>
         * <p>drdshbga69378w4p</p>
         */
        @NameInMap("SlinkSrcResId")
        public String slinkSrcResId;

        /**
         * <strong>example:</strong>
         * <p>POLARX1</p>
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
         * <p>IMPORT_RUNNING</p>
         */
        @NameInMap("SlinkStatus")
        public String slinkStatus;

        /**
         * <strong>example:</strong>
         * <p>drdsprod_to_2.0</p>
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

        public static DescribeEvaluateAndImportTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeEvaluateAndImportTaskResponseBodyData self = new DescribeEvaluateAndImportTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeEvaluateAndImportTaskResponseBodyData setBid(String bid) {
            this.bid = bid;
            return this;
        }
        public String getBid() {
            return this.bid;
        }

        public DescribeEvaluateAndImportTaskResponseBodyData setContext(String context) {
            this.context = context;
            return this;
        }
        public String getContext() {
            return this.context;
        }

        public DescribeEvaluateAndImportTaskResponseBodyData setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public DescribeEvaluateAndImportTaskResponseBodyData setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public DescribeEvaluateAndImportTaskResponseBodyData setGmtCreated(Long gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public Long getGmtCreated() {
            return this.gmtCreated;
        }

        public DescribeEvaluateAndImportTaskResponseBodyData setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public DescribeEvaluateAndImportTaskResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeEvaluateAndImportTaskResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeEvaluateAndImportTaskResponseBodyData setSlinkDstDb(String slinkDstDb) {
            this.slinkDstDb = slinkDstDb;
            return this;
        }
        public String getSlinkDstDb() {
            return this.slinkDstDb;
        }

        public DescribeEvaluateAndImportTaskResponseBodyData setSlinkDstResId(String slinkDstResId) {
            this.slinkDstResId = slinkDstResId;
            return this;
        }
        public String getSlinkDstResId() {
            return this.slinkDstResId;
        }

        public DescribeEvaluateAndImportTaskResponseBodyData setSlinkDstUserName(String slinkDstUserName) {
            this.slinkDstUserName = slinkDstUserName;
            return this;
        }
        public String getSlinkDstUserName() {
            return this.slinkDstUserName;
        }

        public DescribeEvaluateAndImportTaskResponseBodyData setSlinkSrcDb(String slinkSrcDb) {
            this.slinkSrcDb = slinkSrcDb;
            return this;
        }
        public String getSlinkSrcDb() {
            return this.slinkSrcDb;
        }

        public DescribeEvaluateAndImportTaskResponseBodyData setSlinkSrcResId(String slinkSrcResId) {
            this.slinkSrcResId = slinkSrcResId;
            return this;
        }
        public String getSlinkSrcResId() {
            return this.slinkSrcResId;
        }

        public DescribeEvaluateAndImportTaskResponseBodyData setSlinkSrcResType(String slinkSrcResType) {
            this.slinkSrcResType = slinkSrcResType;
            return this;
        }
        public String getSlinkSrcResType() {
            return this.slinkSrcResType;
        }

        public DescribeEvaluateAndImportTaskResponseBodyData setSlinkSrcUserName(String slinkSrcUserName) {
            this.slinkSrcUserName = slinkSrcUserName;
            return this;
        }
        public String getSlinkSrcUserName() {
            return this.slinkSrcUserName;
        }

        public DescribeEvaluateAndImportTaskResponseBodyData setSlinkStage(String slinkStage) {
            this.slinkStage = slinkStage;
            return this;
        }
        public String getSlinkStage() {
            return this.slinkStage;
        }

        public DescribeEvaluateAndImportTaskResponseBodyData setSlinkStatus(String slinkStatus) {
            this.slinkStatus = slinkStatus;
            return this;
        }
        public String getSlinkStatus() {
            return this.slinkStatus;
        }

        public DescribeEvaluateAndImportTaskResponseBodyData setSlinkTaskDesc(String slinkTaskDesc) {
            this.slinkTaskDesc = slinkTaskDesc;
            return this;
        }
        public String getSlinkTaskDesc() {
            return this.slinkTaskDesc;
        }

        public DescribeEvaluateAndImportTaskResponseBodyData setSlinkTaskId(String slinkTaskId) {
            this.slinkTaskId = slinkTaskId;
            return this;
        }
        public String getSlinkTaskId() {
            return this.slinkTaskId;
        }

        public DescribeEvaluateAndImportTaskResponseBodyData setSlinkType(String slinkType) {
            this.slinkType = slinkType;
            return this;
        }
        public String getSlinkType() {
            return this.slinkType;
        }

    }

}
