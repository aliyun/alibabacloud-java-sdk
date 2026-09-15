// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListOperationCheckRequest extends TeaModel {
    /**
     * <p>The check item ID.</p>
     * <blockquote>
     * <p>Call the <a href="~~ListCheckResult~~">ListCheckResult</a> operation to obtain this parameter.
     * This parameter is required. If you do not specify this parameter, the API returns a 400 error.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>23</p>
     */
    @NameInMap("CheckId")
    public Long checkId;

    /**
     * <p>The timestamp of the task end time to query. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1719923175001</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The language of the request and response. Default value: zh. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The information about the instances on which the operation is performed.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("OperationTaskInstances")
    public java.util.List<ListOperationCheckRequestOperationTaskInstances> operationTaskInstances;

    /**
     * <p>The timestamp of the task start time to query. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1719923175000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The task type. Valid values:</p>
     * <ul>
     * <li><strong>REPAIR</strong>: fix task</li>
     * <li><strong>ROLLBACK</strong>: rollback task</li>
     * </ul>
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
         * <p>The cloud asset instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>r-bp1642ib4bg2bm****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The asset vendor. Valid values:</p>
         * <ul>
         * <li><strong>ALIYUN</strong>: Alibaba Cloud</li>
         * </ul>
         * 
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
