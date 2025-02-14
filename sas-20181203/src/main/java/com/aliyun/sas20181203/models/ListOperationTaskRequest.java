// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListOperationTaskRequest extends TeaModel {
    /**
     * <p>The ID of the check item.</p>
     * <blockquote>
     * <p>You can call the <a href="~~ListCheckResult~~">ListCheckResult</a> API to obtain the check item ID.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>76</p>
     */
    @NameInMap("CheckId")
    public Long checkId;

    /**
     * <p>The page number to display in a paginated query.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>Set the language type for the request and response messages. The default value is <strong>zh</strong>. Values:</p>
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
     * <p>The instance information of the operation tasks to be queried.</p>
     */
    @NameInMap("OperationTaskInstances")
    public java.util.List<ListOperationTaskRequestOperationTaskInstances> operationTaskInstances;

    /**
     * <p>The maximum number of items to display per page in a paginated query.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>A list of task statuses. Multiple statuses should be separated by commas (,). Values:</p>
     * <ul>
     * <li><strong>INIT</strong>: Initialization</li>
     * <li><strong>FAIL</strong>: Processing failed</li>
     * <li><strong>THROTTLING</strong>: Repairing concurrently</li>
     * <li><strong>IN_BACKUP</strong>: Backing up</li>
     * <li><strong>BACKED_UP</strong>: Backed up</li>
     * <li><strong>BACKUP_FAIL</strong>: Backup failed</li>
     * <li><strong>REPAIRING</strong>: Repairing</li>
     * <li><strong>REPAIR_SUCCESS</strong>: Repair succeeded</li>
     * <li><strong>REPAIR_FAIL</strong>: Repair failed</li>
     * <li><strong>REPAIR_SUCCESS_VERIFYING</strong>: Verifying repair success</li>
     * <li><strong>REPAIR_SUCCESS_UNVERIFIED</strong>: Repair success verification failed</li>
     * <li><strong>REPAIR_SUCCESS_VERIFIED</strong>: Repair success verified</li>
     * <li><strong>REPAIR_RE_EXECUTE</strong>: Re-executing repair</li>
     * <li><strong>ROLL_BACKING</strong>: Rolling back</li>
     * <li><strong>ROLL_BACKED</strong>: Rolled back</li>
     * <li><strong>ROLL_BACK_FAIL</strong>: Rollback failed</li>
     * <li><strong>ROLL_BACK_INIT</strong>: Rollback initiated</li>
     * <li><strong>ROLL_BACK_VERIFYING</strong>: Verifying rollback success</li>
     * <li><strong>ROLL_BACK_UNVERIFIED</strong>: Rollback success verification failed</li>
     * <li><strong>ROLL_BACK_VERIFIED</strong>: Rollback success verified</li>
     * </ul>
     */
    @NameInMap("Statuses")
    public java.util.List<String> statuses;

    /**
     * <p>The ID of the task to be queried.</p>
     * 
     * <strong>example:</strong>
     * <p>d7b2acf8d362742123e4a84e1bf8****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The type of operation task to be queried:</p>
     * <ul>
     * <li>REPAIR: Repair</li>
     * <li>ROLLBACK: Rollback</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>REPAIR</p>
     */
    @NameInMap("Type")
    public String type;

    public static ListOperationTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOperationTaskRequest self = new ListOperationTaskRequest();
        return TeaModel.build(map, self);
    }

    public ListOperationTaskRequest setCheckId(Long checkId) {
        this.checkId = checkId;
        return this;
    }
    public Long getCheckId() {
        return this.checkId;
    }

    public ListOperationTaskRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListOperationTaskRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListOperationTaskRequest setOperationTaskInstances(java.util.List<ListOperationTaskRequestOperationTaskInstances> operationTaskInstances) {
        this.operationTaskInstances = operationTaskInstances;
        return this;
    }
    public java.util.List<ListOperationTaskRequestOperationTaskInstances> getOperationTaskInstances() {
        return this.operationTaskInstances;
    }

    public ListOperationTaskRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListOperationTaskRequest setStatuses(java.util.List<String> statuses) {
        this.statuses = statuses;
        return this;
    }
    public java.util.List<String> getStatuses() {
        return this.statuses;
    }

    public ListOperationTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public ListOperationTaskRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class ListOperationTaskRequestOperationTaskInstances extends TeaModel {
        /**
         * <p>The instance ID of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>am-bp1vy2yaj1nvx****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The ID of the region where the instance is located.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>Cloud asset vendor.</p>
         * 
         * <strong>example:</strong>
         * <p>ALIYUN</p>
         */
        @NameInMap("Vendor")
        public String vendor;

        public static ListOperationTaskRequestOperationTaskInstances build(java.util.Map<String, ?> map) throws Exception {
            ListOperationTaskRequestOperationTaskInstances self = new ListOperationTaskRequestOperationTaskInstances();
            return TeaModel.build(map, self);
        }

        public ListOperationTaskRequestOperationTaskInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListOperationTaskRequestOperationTaskInstances setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListOperationTaskRequestOperationTaskInstances setVendor(String vendor) {
            this.vendor = vendor;
            return this;
        }
        public String getVendor() {
            return this.vendor;
        }

    }

}
