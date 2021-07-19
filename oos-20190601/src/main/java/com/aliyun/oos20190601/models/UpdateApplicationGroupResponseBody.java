// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class UpdateApplicationGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ApplicationGroup")
    public UpdateApplicationGroupResponseBodyApplicationGroup applicationGroup;

    public static UpdateApplicationGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateApplicationGroupResponseBody self = new UpdateApplicationGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateApplicationGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateApplicationGroupResponseBody setApplicationGroup(UpdateApplicationGroupResponseBodyApplicationGroup applicationGroup) {
        this.applicationGroup = applicationGroup;
        return this;
    }
    public UpdateApplicationGroupResponseBodyApplicationGroup getApplicationGroup() {
        return this.applicationGroup;
    }

    public static class UpdateApplicationGroupResponseBodyApplicationGroup extends TeaModel {
        @NameInMap("DeployRegionId")
        public String deployRegionId;

        @NameInMap("Description")
        public String description;

        @NameInMap("UpdatedDate")
        public String updatedDate;

        @NameInMap("CreatedDate")
        public String createdDate;

        @NameInMap("ApplicationName")
        public String applicationName;

        @NameInMap("Name")
        public String name;

        @NameInMap("Environment")
        public String environment;

        @NameInMap("CreateType")
        public String createType;

        @NameInMap("ScalingGroupId")
        public String scalingGroupId;

        @NameInMap("ImportClusterId")
        public String importClusterId;

        public static UpdateApplicationGroupResponseBodyApplicationGroup build(java.util.Map<String, ?> map) throws Exception {
            UpdateApplicationGroupResponseBodyApplicationGroup self = new UpdateApplicationGroupResponseBodyApplicationGroup();
            return TeaModel.build(map, self);
        }

        public UpdateApplicationGroupResponseBodyApplicationGroup setDeployRegionId(String deployRegionId) {
            this.deployRegionId = deployRegionId;
            return this;
        }
        public String getDeployRegionId() {
            return this.deployRegionId;
        }

        public UpdateApplicationGroupResponseBodyApplicationGroup setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateApplicationGroupResponseBodyApplicationGroup setUpdatedDate(String updatedDate) {
            this.updatedDate = updatedDate;
            return this;
        }
        public String getUpdatedDate() {
            return this.updatedDate;
        }

        public UpdateApplicationGroupResponseBodyApplicationGroup setCreatedDate(String createdDate) {
            this.createdDate = createdDate;
            return this;
        }
        public String getCreatedDate() {
            return this.createdDate;
        }

        public UpdateApplicationGroupResponseBodyApplicationGroup setApplicationName(String applicationName) {
            this.applicationName = applicationName;
            return this;
        }
        public String getApplicationName() {
            return this.applicationName;
        }

        public UpdateApplicationGroupResponseBodyApplicationGroup setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateApplicationGroupResponseBodyApplicationGroup setEnvironment(String environment) {
            this.environment = environment;
            return this;
        }
        public String getEnvironment() {
            return this.environment;
        }

        public UpdateApplicationGroupResponseBodyApplicationGroup setCreateType(String createType) {
            this.createType = createType;
            return this;
        }
        public String getCreateType() {
            return this.createType;
        }

        public UpdateApplicationGroupResponseBodyApplicationGroup setScalingGroupId(String scalingGroupId) {
            this.scalingGroupId = scalingGroupId;
            return this;
        }
        public String getScalingGroupId() {
            return this.scalingGroupId;
        }

        public UpdateApplicationGroupResponseBodyApplicationGroup setImportClusterId(String importClusterId) {
            this.importClusterId = importClusterId;
            return this;
        }
        public String getImportClusterId() {
            return this.importClusterId;
        }

    }

}
