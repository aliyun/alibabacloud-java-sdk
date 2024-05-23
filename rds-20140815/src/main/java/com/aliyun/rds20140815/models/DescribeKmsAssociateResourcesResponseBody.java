// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeKmsAssociateResourcesResponseBody extends TeaModel {
    /**
     * <p>The information about the associated ApsaraDB RDS instances.</p>
     */
    @NameInMap("AssociateDBInstances")
    public java.util.List<DescribeKmsAssociateResourcesResponseBodyAssociateDBInstances> associateDBInstances;

    /**
     * <p>Indicates whether an associated RDS instance exists.</p>
     * <br>
     * <p>- **true**: Yes</p>
     * <p>- **false**: No</p>
     */
    @NameInMap("AssociateStatus")
    public Boolean associateStatus;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeKmsAssociateResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeKmsAssociateResourcesResponseBody self = new DescribeKmsAssociateResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeKmsAssociateResourcesResponseBody setAssociateDBInstances(java.util.List<DescribeKmsAssociateResourcesResponseBodyAssociateDBInstances> associateDBInstances) {
        this.associateDBInstances = associateDBInstances;
        return this;
    }
    public java.util.List<DescribeKmsAssociateResourcesResponseBodyAssociateDBInstances> getAssociateDBInstances() {
        return this.associateDBInstances;
    }

    public DescribeKmsAssociateResourcesResponseBody setAssociateStatus(Boolean associateStatus) {
        this.associateStatus = associateStatus;
        return this;
    }
    public Boolean getAssociateStatus() {
        return this.associateStatus;
    }

    public DescribeKmsAssociateResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeKmsAssociateResourcesResponseBodyAssociateDBInstances extends TeaModel {
        /**
         * <p>The instance ID.</p>
         */
        @NameInMap("DBInstanceName")
        public String DBInstanceName;

        /**
         * <p>The database engine. Valid values:</p>
         * <br>
         * <p>*   **MySQL**</p>
         * <p>*   **SQLServer**</p>
         * <p>*   **PostgreSQL**</p>
         */
        @NameInMap("Engine")
        public String engine;

        /**
         * <p>The purpose of the key. Valid values:</p>
         * <br>
         * <p>*   **DiskEncryption**: cloud disk encryption</p>
         * <p>*   **TDE**: transparent data encryption</p>
         */
        @NameInMap("KeyUsedBy")
        public String keyUsedBy;

        /**
         * <p>The state of the instance. Valid values:</p>
         * <br>
         * <p>*   **CREATING**: The instance is being created.</p>
         * <p>*   **ACTIVATION**: The instance is running.</p>
         * <p>*   **DELETING**: The instance is being deleted.</p>
         * <p>*   **RESTARTING**: The instance is being restarted.</p>
         * <p>*   **INS_MAINTAINING**: The configuration of the instance is being changed.</p>
         * <p>*   **INS_MAINTAINING**: The instance is being maintained.</p>
         * <p>*   **BACKUP_RECOVERING**: The instance is being restored.</p>
         * <p>*   **NET_MODIFYING**: The network type of the instance is being changed.</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeKmsAssociateResourcesResponseBodyAssociateDBInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeKmsAssociateResourcesResponseBodyAssociateDBInstances self = new DescribeKmsAssociateResourcesResponseBodyAssociateDBInstances();
            return TeaModel.build(map, self);
        }

        public DescribeKmsAssociateResourcesResponseBodyAssociateDBInstances setDBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

        public DescribeKmsAssociateResourcesResponseBodyAssociateDBInstances setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeKmsAssociateResourcesResponseBodyAssociateDBInstances setKeyUsedBy(String keyUsedBy) {
            this.keyUsedBy = keyUsedBy;
            return this;
        }
        public String getKeyUsedBy() {
            return this.keyUsedBy;
        }

        public DescribeKmsAssociateResourcesResponseBodyAssociateDBInstances setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
