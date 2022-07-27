// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class UpdateApplicationGroupResponseBody extends TeaModel {
    @NameInMap("ApplicationGroup")
    public UpdateApplicationGroupResponseBodyApplicationGroup applicationGroup;

    @NameInMap("RequestId")
    public String requestId;

    public static UpdateApplicationGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateApplicationGroupResponseBody self = new UpdateApplicationGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateApplicationGroupResponseBody setApplicationGroup(UpdateApplicationGroupResponseBodyApplicationGroup applicationGroup) {
        this.applicationGroup = applicationGroup;
        return this;
    }
    public UpdateApplicationGroupResponseBodyApplicationGroup getApplicationGroup() {
        return this.applicationGroup;
    }

    public UpdateApplicationGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateApplicationGroupResponseBodyApplicationGroup extends TeaModel {
        @NameInMap("ApplicationName")
        public String applicationName;

        @NameInMap("CreatedDate")
        public String createdDate;

        @NameInMap("DeployRegionId")
        public String deployRegionId;

        @NameInMap("Description")
        public String description;

        @NameInMap("ImportTagKey")
        public String importTagKey;

        @NameInMap("ImportTagValue")
        public String importTagValue;

        @NameInMap("Name")
        public String name;

        @NameInMap("UpdatedDate")
        public String updatedDate;

        public static UpdateApplicationGroupResponseBodyApplicationGroup build(java.util.Map<String, ?> map) throws Exception {
            UpdateApplicationGroupResponseBodyApplicationGroup self = new UpdateApplicationGroupResponseBodyApplicationGroup();
            return TeaModel.build(map, self);
        }

        public UpdateApplicationGroupResponseBodyApplicationGroup setApplicationName(String applicationName) {
            this.applicationName = applicationName;
            return this;
        }
        public String getApplicationName() {
            return this.applicationName;
        }

        public UpdateApplicationGroupResponseBodyApplicationGroup setCreatedDate(String createdDate) {
            this.createdDate = createdDate;
            return this;
        }
        public String getCreatedDate() {
            return this.createdDate;
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

        public UpdateApplicationGroupResponseBodyApplicationGroup setImportTagKey(String importTagKey) {
            this.importTagKey = importTagKey;
            return this;
        }
        public String getImportTagKey() {
            return this.importTagKey;
        }

        public UpdateApplicationGroupResponseBodyApplicationGroup setImportTagValue(String importTagValue) {
            this.importTagValue = importTagValue;
            return this;
        }
        public String getImportTagValue() {
            return this.importTagValue;
        }

        public UpdateApplicationGroupResponseBodyApplicationGroup setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateApplicationGroupResponseBodyApplicationGroup setUpdatedDate(String updatedDate) {
            this.updatedDate = updatedDate;
            return this;
        }
        public String getUpdatedDate() {
            return this.updatedDate;
        }

    }

}
