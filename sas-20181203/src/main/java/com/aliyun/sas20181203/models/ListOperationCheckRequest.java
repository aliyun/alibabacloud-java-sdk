// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListOperationCheckRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>23</p>
     */
    @NameInMap("CheckId")
    public Long checkId;

    /**
     * <strong>example:</strong>
     * <p>1719923175001</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("Lang")
    public String lang;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("OperationTaskInstances")
    public java.util.List<ListOperationCheckRequestOperationTaskInstances> operationTaskInstances;

    /**
     * <strong>example:</strong>
     * <p>1719923175000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>REPAIR</p>
     */
    @NameInMap("Type")
    public String type;

    public static ListOperationCheckRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOperationCheckRequest self = new ListOperationCheckRequest();
        return TeaModel.build(map, self);
    }

    public ListOperationCheckRequest setCheckId(Long checkId) {
        this.checkId = checkId;
        return this;
    }
    public Long getCheckId() {
        return this.checkId;
    }

    public ListOperationCheckRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListOperationCheckRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListOperationCheckRequest setOperationTaskInstances(java.util.List<ListOperationCheckRequestOperationTaskInstances> operationTaskInstances) {
        this.operationTaskInstances = operationTaskInstances;
        return this;
    }
    public java.util.List<ListOperationCheckRequestOperationTaskInstances> getOperationTaskInstances() {
        return this.operationTaskInstances;
    }

    public ListOperationCheckRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public ListOperationCheckRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class ListOperationCheckRequestOperationTaskInstances extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>r-bp1642ib4bg2bm****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>ALIYUN</p>
         */
        @NameInMap("Vendor")
        public String vendor;

        public static ListOperationCheckRequestOperationTaskInstances build(java.util.Map<String, ?> map) throws Exception {
            ListOperationCheckRequestOperationTaskInstances self = new ListOperationCheckRequestOperationTaskInstances();
            return TeaModel.build(map, self);
        }

        public ListOperationCheckRequestOperationTaskInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListOperationCheckRequestOperationTaskInstances setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListOperationCheckRequestOperationTaskInstances setVendor(String vendor) {
            this.vendor = vendor;
            return this;
        }
        public String getVendor() {
            return this.vendor;
        }

    }

}
