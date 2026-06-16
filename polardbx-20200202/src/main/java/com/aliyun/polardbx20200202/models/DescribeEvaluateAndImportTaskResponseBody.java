// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeEvaluateAndImportTaskResponseBody extends TeaModel {
    /**
     * <p>The returned result.</p>
     */
    @NameInMap("Data")
    public DescribeEvaluateAndImportTaskResponseBodyData data;

    /**
     * <p>The response message. This parameter is empty when the request succeeds. If the request fails, an exception message is returned, such as an error code.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>73559800-****-11ec-bd40-99cfcff3fe1e</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
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
         * <p>The business ID of the import task.</p>
         * 
         * <strong>example:</strong>
         * <p>26842</p>
         */
        @NameInMap("Bid")
        public String bid;

        /**
         * <p>The summary information.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;{\&quot;structureImportResult\&quot;:{\&quot;status\&quot;:\&quot;finish\&quot;,\&quot;finishedNum\&quot;:382,\&quot;totalNum\&quot;:382,\&quot;percentage\&quot;:100},\&quot;switchTips\&quot;:\&quot;正向同步延迟较小时才允许开始正向切换\&quot;,\&quot;autoTableSuggestionSwitch\&quot;:false,\&quot;structureAlterationMap\&quot;:{},\&quot;acceptFilterMap\&quot;:{\&quot;fr_import\&quot;:[\&quot;dy_dr_new\&quot;],\&quot;e3plus_drp_prod_new\&quot;:[],\&quot;qbtong_prod\&quot;:[],\&quot;e3plus_account_prod\&quot;:[],\&quot;e3plus_drp_prod\&quot;:[]},\&quot;structChunkMap\&quot;:{},\&quot;count\&quot;:1,\&quot;requestId\&quot;:\&quot;9380D025-C9B1-51D6-A4B9-733C4879CC4A\&quot;}&quot;,</p>
         */
        @NameInMap("Context")
        public String context;

        /**
         * <p>The creator of the import task.</p>
         * 
         * <strong>example:</strong>
         * <p>346650</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <p>Indicates whether the import task is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Deleted")
        public Boolean deleted;

        /**
         * <p>The timestamp when the task was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-06-08T15:00Z</p>
         */
        @NameInMap("GmtCreated")
        public Long gmtCreated;

        /**
         * <p>The modification time in timestamp format.</p>
         * 
         * <strong>example:</strong>
         * <p>1605080537000</p>
         */
        @NameInMap("GmtModified")
        public Long gmtModified;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>76251</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The name of the slink destination database.</p>
         * 
         * <strong>example:</strong>
         * <p>fr_import</p>
         */
        @NameInMap("SlinkDstDb")
        public String slinkDstDb;

        /**
         * <p>The instance ID of the destination.</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-hzrehc60jz5zye</p>
         */
        @NameInMap("SlinkDstResId")
        public String slinkDstResId;

        /**
         * <p>The username for the data connection of the destination.</p>
         * 
         * <strong>example:</strong>
         * <p>dts_dtdba</p>
         */
        @NameInMap("SlinkDstUserName")
        public String slinkDstUserName;

        /**
         * <p>The name of the slink source database.</p>
         * 
         * <strong>example:</strong>
         * <p>fr_import</p>
         */
        @NameInMap("SlinkSrcDb")
        public String slinkSrcDb;

        /**
         * <p>The instance ID of the source.</p>
         * 
         * <strong>example:</strong>
         * <p>drdshbga69378w4p</p>
         */
        @NameInMap("SlinkSrcResId")
        public String slinkSrcResId;

        /**
         * <p>The resource type of the source.</p>
         * 
         * <strong>example:</strong>
         * <p>POLARX1</p>
         */
        @NameInMap("SlinkSrcResType")
        public String slinkSrcResType;

        /**
         * <p>The username for the data connection of the source.</p>
         * 
         * <strong>example:</strong>
         * <p>dtdba</p>
         */
        @NameInMap("SlinkSrcUserName")
        public String slinkSrcUserName;

        /**
         * <p>The stage of the synchronization.</p>
         * 
         * <strong>example:</strong>
         * <p>DATA_IMPORT_RUNNING</p>
         */
        @NameInMap("SlinkStage")
        public String slinkStage;

        /**
         * <p>The running status of the synchronization.</p>
         * 
         * <strong>example:</strong>
         * <p>IMPORT_RUNNING</p>
         */
        @NameInMap("SlinkStatus")
        public String slinkStatus;

        /**
         * <p>The description of the slink task.</p>
         * 
         * <strong>example:</strong>
         * <p>drdsprod_to_2.0</p>
         */
        @NameInMap("SlinkTaskDesc")
        public String slinkTaskDesc;

        /**
         * <p>The slink task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>etx-szr2rr6i*****</p>
         */
        @NameInMap("SlinkTaskId")
        public String slinkTaskId;

        /**
         * <p>The synchronization type.</p>
         * 
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
