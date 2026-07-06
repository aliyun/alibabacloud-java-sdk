// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tablestore20201209.models;

import com.aliyun.tea.*;

public class ListAgentStoragesResponseBody extends TeaModel {
    /**
     * <p>The list of agent storage information.</p>
     */
    @NameInMap("AgentStorages")
    public java.util.List<ListAgentStoragesResponseBodyAgentStorages> agentStorages;

    /**
     * <p>The pagination token for querying subsequent pages. This parameter has a value only when not all tag resources are returned. If the total number of expected tag resources exceeds the MaxResults value, use this token to retrieve the next page.</p>
     * 
     * <strong>example:</strong>
     * <p>CAESCG15aC1xxxxx</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID, which can be used for troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>39871ED2-62C0-578F-A32E-B88072D5582F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of agent storages returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListAgentStoragesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAgentStoragesResponseBody self = new ListAgentStoragesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAgentStoragesResponseBody setAgentStorages(java.util.List<ListAgentStoragesResponseBodyAgentStorages> agentStorages) {
        this.agentStorages = agentStorages;
        return this;
    }
    public java.util.List<ListAgentStoragesResponseBodyAgentStorages> getAgentStorages() {
        return this.agentStorages;
    }

    public ListAgentStoragesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAgentStoragesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAgentStoragesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListAgentStoragesResponseBodyAgentStorages extends TeaModel {
        /**
         * <p>The description of the agent storage.</p>
         * 
         * <strong>example:</strong>
         * <p>description for agent storage</p>
         */
        @NameInMap("AgentStorageDescription")
        public String agentStorageDescription;

        /**
         * <p>The name of the agent storage, which is a unique key.</p>
         * 
         * <strong>example:</strong>
         * <p>agent-test</p>
         */
        @NameInMap("AgentStorageName")
        public String agentStorageName;

        /**
         * <p>The specification of the agent storage.</p>
         * 
         * <strong>example:</strong>
         * <p>SSD</p>
         */
        @NameInMap("AgentStorageSpecification")
        public String agentStorageSpecification;

        /**
         * <p>The status of the agent storage. Valid values:</p>
         * <ul>
         * <li>normal: Normal.</li>
         * <li>forbidden: Disabled.</li>
         * <li>deleting: Being released.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("AgentStorageStatus")
        public String agentStorageStatus;

        /**
         * <p>The alias of the agent storage.</p>
         * 
         * <strong>example:</strong>
         * <p>btnots</p>
         */
        @NameInMap("AliasName")
        public String aliasName;

        /**
         * <p>The time when the agent storage was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-04-16T06:02:59Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The region ID of the agent storage.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai-cloudspe</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmxh4em5jnbcd</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>13542356466</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static ListAgentStoragesResponseBodyAgentStorages build(java.util.Map<String, ?> map) throws Exception {
            ListAgentStoragesResponseBodyAgentStorages self = new ListAgentStoragesResponseBodyAgentStorages();
            return TeaModel.build(map, self);
        }

        public ListAgentStoragesResponseBodyAgentStorages setAgentStorageDescription(String agentStorageDescription) {
            this.agentStorageDescription = agentStorageDescription;
            return this;
        }
        public String getAgentStorageDescription() {
            return this.agentStorageDescription;
        }

        public ListAgentStoragesResponseBodyAgentStorages setAgentStorageName(String agentStorageName) {
            this.agentStorageName = agentStorageName;
            return this;
        }
        public String getAgentStorageName() {
            return this.agentStorageName;
        }

        public ListAgentStoragesResponseBodyAgentStorages setAgentStorageSpecification(String agentStorageSpecification) {
            this.agentStorageSpecification = agentStorageSpecification;
            return this;
        }
        public String getAgentStorageSpecification() {
            return this.agentStorageSpecification;
        }

        public ListAgentStoragesResponseBodyAgentStorages setAgentStorageStatus(String agentStorageStatus) {
            this.agentStorageStatus = agentStorageStatus;
            return this;
        }
        public String getAgentStorageStatus() {
            return this.agentStorageStatus;
        }

        public ListAgentStoragesResponseBodyAgentStorages setAliasName(String aliasName) {
            this.aliasName = aliasName;
            return this;
        }
        public String getAliasName() {
            return this.aliasName;
        }

        public ListAgentStoragesResponseBodyAgentStorages setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListAgentStoragesResponseBodyAgentStorages setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListAgentStoragesResponseBodyAgentStorages setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListAgentStoragesResponseBodyAgentStorages setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
