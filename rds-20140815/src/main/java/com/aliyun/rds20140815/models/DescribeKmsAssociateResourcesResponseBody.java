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
     * <ul>
     * <li><strong>true</strong>: Yes</li>
     * <li><strong>false</strong>: No</li>
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
     * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
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
         * <li><strong>DiskEncryption</strong>: cloud disk encryption</li>
         * <li><strong>TDE</strong>: transparent data encryption</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DiskEncryption</p>
         */
        @NameInMap("KeyUsedBy")
        public String keyUsedBy;

        /**
         * <p>The state of the instance. Valid values:</p>
         * <ul>
         * <li><strong>CREATING</strong>: The instance is being created.</li>
         * <li><strong>ACTIVATION</strong>: The instance is running.</li>
         * <li><strong>DELETING</strong>: The instance is being deleted.</li>
         * <li><strong>RESTARTING</strong>: The instance is being restarted.</li>
         * <li><strong>INS_MAINTAINING</strong>: The configuration of the instance is being changed.</li>
         * <li><strong>INS_MAINTAINING</strong>: The instance is being maintained.</li>
         * <li><strong>BACKUP_RECOVERING</strong>: The instance is being restored.</li>
         * <li><strong>NET_MODIFYING</strong>: The network type of the instance is being changed.</li>
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
