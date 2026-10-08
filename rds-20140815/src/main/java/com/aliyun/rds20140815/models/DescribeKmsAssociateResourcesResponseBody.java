// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeKmsAssociateResourcesResponseBody extends TeaModel {
    /**
     * <p>The list of associated ApsaraDB RDS instances.</p>
     */
    @NameInMap("AssociateDBInstances")
    public java.util.List<DescribeKmsAssociateResourcesResponseBodyAssociateDBInstances> associateDBInstances;

    /**
     * <p>Indicates whether associated ApsaraDB RDS instances exist.</p>
     * <ul>
     * <li><strong>true</strong>: Associated instances exist.</li>
     * <li><strong>false</strong>: No associated instances exist.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AssociateStatus")
    public Boolean associateStatus;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>38F6B598-A6D7-508A-8401-12BB9936****</p>
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
         * 
         * <strong>example:</strong>
         * <p>pgm-bp16p6f68130****</p>
         */
        @NameInMap("DBInstanceName")
        public String DBInstanceName;

        /**
         * <p>The database engine. Valid values:</p>
         * <ul>
         * <li><strong>MySQL</strong></li>
         * <li><strong>SQLServer</strong></li>
         * <li><strong>PostgreSQL</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PostgreSQL</p>
         */
        @NameInMap("Engine")
        public String engine;

        /**
         * <p>The purpose of the key. Valid values:</p>
         * <ul>
         * <li><strong>DiskEncryption</strong>: cloud disk data encryption.</li>
         * <li><strong>TDE</strong>: transparent data encryption.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DiskEncryption</p>
         */
        @NameInMap("KeyUsedBy")
        public String keyUsedBy;

        /**
         * <p>The instance status. Valid values:</p>
         * <ul>
         * <li><strong>CREATING</strong>: The instance is being created.</li>
         * <li><strong>ACTIVATION</strong>: The instance is running.</li>
         * <li><strong>DELETING</strong>: The instance is being deleted.</li>
         * <li><strong>RESTARTING</strong>: The instance is being restarted.</li>
         * <li><strong>CLASS_CHANGING</strong>: The instance specifications are being changed.</li>
         * <li><strong>INS_MAINTAINING</strong>: The instance is being maintained.</li>
         * <li><strong>BACKUP_RECOVERING</strong>: A backup is being restored.</li>
         * <li><strong>NET_MODIFYING</strong>: The network is being changed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ACTIVATION</p>
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
