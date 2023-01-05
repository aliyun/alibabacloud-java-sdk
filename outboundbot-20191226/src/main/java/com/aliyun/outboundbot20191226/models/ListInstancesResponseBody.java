// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ListInstancesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Instances")
    public java.util.List<ListInstancesResponseBodyInstances> instances;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstancesResponseBody self = new ListInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstancesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListInstancesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListInstancesResponseBody setInstances(java.util.List<ListInstancesResponseBodyInstances> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<ListInstancesResponseBodyInstances> getInstances() {
        return this.instances;
    }

    public ListInstancesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInstancesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListInstancesResponseBodyInstancesResourceTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ListInstancesResponseBodyInstancesResourceTags build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyInstancesResourceTags self = new ListInstancesResponseBodyInstancesResourceTags();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyInstancesResourceTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListInstancesResponseBodyInstancesResourceTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListInstancesResponseBodyInstances extends TeaModel {
        @NameInMap("CreationTime")
        public Long creationTime;

        @NameInMap("CreatorId")
        public Long creatorId;

        @NameInMap("CreatorName")
        public String creatorName;

        @NameInMap("InstanceDescription")
        public String instanceDescription;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("IsPreset")
        public Boolean isPreset;

        @NameInMap("MaxConcurrentConversation")
        public Integer maxConcurrentConversation;

        @NameInMap("OwnerName")
        public String ownerName;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("ResourceTags")
        public java.util.List<ListInstancesResponseBodyInstancesResourceTags> resourceTags;

        public static ListInstancesResponseBodyInstances build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyInstances self = new ListInstancesResponseBodyInstances();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyInstances setCreationTime(Long creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public Long getCreationTime() {
            return this.creationTime;
        }

        public ListInstancesResponseBodyInstances setCreatorId(Long creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public Long getCreatorId() {
            return this.creatorId;
        }

        public ListInstancesResponseBodyInstances setCreatorName(String creatorName) {
            this.creatorName = creatorName;
            return this;
        }
        public String getCreatorName() {
            return this.creatorName;
        }

        public ListInstancesResponseBodyInstances setInstanceDescription(String instanceDescription) {
            this.instanceDescription = instanceDescription;
            return this;
        }
        public String getInstanceDescription() {
            return this.instanceDescription;
        }

        public ListInstancesResponseBodyInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListInstancesResponseBodyInstances setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public ListInstancesResponseBodyInstances setIsPreset(Boolean isPreset) {
            this.isPreset = isPreset;
            return this;
        }
        public Boolean getIsPreset() {
            return this.isPreset;
        }

        public ListInstancesResponseBodyInstances setMaxConcurrentConversation(Integer maxConcurrentConversation) {
            this.maxConcurrentConversation = maxConcurrentConversation;
            return this;
        }
        public Integer getMaxConcurrentConversation() {
            return this.maxConcurrentConversation;
        }

        public ListInstancesResponseBodyInstances setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public ListInstancesResponseBodyInstances setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListInstancesResponseBodyInstances setResourceTags(java.util.List<ListInstancesResponseBodyInstancesResourceTags> resourceTags) {
            this.resourceTags = resourceTags;
            return this;
        }
        public java.util.List<ListInstancesResponseBodyInstancesResourceTags> getResourceTags() {
            return this.resourceTags;
        }

    }

}
