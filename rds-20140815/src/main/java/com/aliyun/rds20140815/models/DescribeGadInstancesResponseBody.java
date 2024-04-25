// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeGadInstancesResponseBody extends TeaModel {
    /**
     * <p>The details about the global active database cluster.</p>
     */
    @NameInMap("GadInstances")
    public java.util.List<DescribeGadInstancesResponseBodyGadInstances> gadInstances;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeGadInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGadInstancesResponseBody self = new DescribeGadInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGadInstancesResponseBody setGadInstances(java.util.List<DescribeGadInstancesResponseBodyGadInstances> gadInstances) {
        this.gadInstances = gadInstances;
        return this;
    }
    public java.util.List<DescribeGadInstancesResponseBodyGadInstances> getGadInstances() {
        return this.gadInstances;
    }

    public DescribeGadInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeGadInstancesResponseBodyGadInstancesGadInstanceMembers extends TeaModel {
        /**
         * <p>The ID of the node.</p>
         */
        @NameInMap("DBInstanceID")
        public String DBInstanceID;

        /**
         * <p>A JSON array that consists of the details about the Data Transmission Service (DTS) synchronization task.</p>
         * <br>
         * <p>>  Each unit node (secondary node) synchronizes data from the central node (primary node) by using DTS. This parameter contains the synchronization link ID and request ID of DTS.</p>
         */
        @NameInMap("DtsInstance")
        public String dtsInstance;

        /**
         * <p>The database engine that is run by the node.</p>
         * <br>
         * <p>>  The value of this parameter is fixed as **mysql**.</p>
         */
        @NameInMap("Engine")
        public String engine;

        /**
         * <p>The database engine version that is run by the node.</p>
         */
        @NameInMap("EngineVersion")
        public String engineVersion;

        /**
         * <p>The ID of the region where the node resides.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The resource group ID.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The type of the node. Valid values:</p>
         * <br>
         * <p>*   **CENTRAL**: The node is a central node. Each global active database cluster has only one central node. All unit nodes synchronize data from the central node.</p>
         * <p>*   **UNIT**: The node is a unit node. Each global active database cluster can have up to 10 unit nodes. All unit nodes synchronize data from the central node.</p>
         */
        @NameInMap("Role")
        public String role;

        /**
         * <p>The node status. Valid values:</p>
         * <br>
         * <p>*   **activation**: The node is running.</p>
         * <p>*   **creating**: The node is being created.</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeGadInstancesResponseBodyGadInstancesGadInstanceMembers build(java.util.Map<String, ?> map) throws Exception {
            DescribeGadInstancesResponseBodyGadInstancesGadInstanceMembers self = new DescribeGadInstancesResponseBodyGadInstancesGadInstanceMembers();
            return TeaModel.build(map, self);
        }

        public DescribeGadInstancesResponseBodyGadInstancesGadInstanceMembers setDBInstanceID(String DBInstanceID) {
            this.DBInstanceID = DBInstanceID;
            return this;
        }
        public String getDBInstanceID() {
            return this.DBInstanceID;
        }

        public DescribeGadInstancesResponseBodyGadInstancesGadInstanceMembers setDtsInstance(String dtsInstance) {
            this.dtsInstance = dtsInstance;
            return this;
        }
        public String getDtsInstance() {
            return this.dtsInstance;
        }

        public DescribeGadInstancesResponseBodyGadInstancesGadInstanceMembers setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeGadInstancesResponseBodyGadInstancesGadInstanceMembers setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public DescribeGadInstancesResponseBodyGadInstancesGadInstanceMembers setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeGadInstancesResponseBodyGadInstancesGadInstanceMembers setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeGadInstancesResponseBodyGadInstancesGadInstanceMembers setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public DescribeGadInstancesResponseBodyGadInstancesGadInstanceMembers setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeGadInstancesResponseBodyGadInstances extends TeaModel {
        /**
         * <p>The time when the global active database cluster was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The name of the cluster.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The information about each node in the cluster.</p>
         */
        @NameInMap("GadInstanceMembers")
        public java.util.List<DescribeGadInstancesResponseBodyGadInstancesGadInstanceMembers> gadInstanceMembers;

        /**
         * <p>The ID of the global active database cluster.</p>
         */
        @NameInMap("GadInstanceName")
        public String gadInstanceName;

        /**
         * <p>The time when the most recent modification was made to the global active database cluster. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.</p>
         */
        @NameInMap("ModificationTime")
        public String modificationTime;

        /**
         * <p>The database engine that is run by the global active database cluster.</p>
         * <br>
         * <p>>  The value of this parameter is fixed as **mysql**.</p>
         */
        @NameInMap("Service")
        public String service;

        /**
         * <p>The status of the cluster. Valid values:</p>
         * <br>
         * <p>*   **activation**: The cluster is running.</p>
         * <p>*   **creating**: The cluster is being created.</p>
         * <p>*   **replica_adding**: Nodes are being added to the cluster.</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeGadInstancesResponseBodyGadInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeGadInstancesResponseBodyGadInstances self = new DescribeGadInstancesResponseBodyGadInstances();
            return TeaModel.build(map, self);
        }

        public DescribeGadInstancesResponseBodyGadInstances setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeGadInstancesResponseBodyGadInstances setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeGadInstancesResponseBodyGadInstances setGadInstanceMembers(java.util.List<DescribeGadInstancesResponseBodyGadInstancesGadInstanceMembers> gadInstanceMembers) {
            this.gadInstanceMembers = gadInstanceMembers;
            return this;
        }
        public java.util.List<DescribeGadInstancesResponseBodyGadInstancesGadInstanceMembers> getGadInstanceMembers() {
            return this.gadInstanceMembers;
        }

        public DescribeGadInstancesResponseBodyGadInstances setGadInstanceName(String gadInstanceName) {
            this.gadInstanceName = gadInstanceName;
            return this;
        }
        public String getGadInstanceName() {
            return this.gadInstanceName;
        }

        public DescribeGadInstancesResponseBodyGadInstances setModificationTime(String modificationTime) {
            this.modificationTime = modificationTime;
            return this;
        }
        public String getModificationTime() {
            return this.modificationTime;
        }

        public DescribeGadInstancesResponseBodyGadInstances setService(String service) {
            this.service = service;
            return this;
        }
        public String getService() {
            return this.service;
        }

        public DescribeGadInstancesResponseBodyGadInstances setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
