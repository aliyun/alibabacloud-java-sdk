// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class ListPluginsInstancesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public java.util.List<ListPluginsInstancesResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>SysomOpenAPIException: SysomOpenAPI.InvalidParameter Invalid params, should be json string or dict</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>35F91AAB-5FDF-5A22-B211-C7C6B00817D0</p>
     */
    @NameInMap("request_id")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>42</p>
     */
    @NameInMap("total")
    public Long total;

    public static ListPluginsInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPluginsInstancesResponseBody self = new ListPluginsInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPluginsInstancesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListPluginsInstancesResponseBody setData(java.util.List<ListPluginsInstancesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListPluginsInstancesResponseBodyData> getData() {
        return this.data;
    }

    public ListPluginsInstancesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListPluginsInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPluginsInstancesResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListPluginsInstancesResponseBodyDataInstanceTag extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test_tag_key</p>
         */
        @NameInMap("tag_key")
        public String tagKey;

        /**
         * <strong>example:</strong>
         * <p>test_tag_value</p>
         */
        @NameInMap("tag_value")
        public String tagValue;

        public static ListPluginsInstancesResponseBodyDataInstanceTag build(java.util.Map<String, ?> map) throws Exception {
            ListPluginsInstancesResponseBodyDataInstanceTag self = new ListPluginsInstancesResponseBodyDataInstanceTag();
            return TeaModel.build(map, self);
        }

        public ListPluginsInstancesResponseBodyDataInstanceTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public ListPluginsInstancesResponseBodyDataInstanceTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class ListPluginsInstancesResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>i-bp118piqcio9tiwgh84b</p>
         */
        @NameInMap("instance_id")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>allowed-repos-qmf8w</p>
         */
        @NameInMap("instance_name")
        public String instanceName;

        @NameInMap("instance_tag")
        public java.util.List<ListPluginsInstancesResponseBodyDataInstanceTag> instanceTag;

        /**
         * <strong>example:</strong>
         * <p>Alibaba Cloud Linux  3.2104 LTS 64 bit</p>
         */
        @NameInMap("os_name")
        public String osName;

        /**
         * <strong>example:</strong>
         * <p>1.1.1.1</p>
         */
        @NameInMap("private_ip")
        public String privateIp;

        /**
         * <strong>example:</strong>
         * <p>1.1.1.1</p>
         */
        @NameInMap("public_ip")
        public String publicIp;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("region")
        public String region;

        /**
         * <strong>example:</strong>
         * <p>rg-xxxx</p>
         */
        @NameInMap("resource_group_id")
        public String resourceGroupId;

        /**
         * <strong>example:</strong>
         * <p>default resource group</p>
         */
        @NameInMap("resource_group_name")
        public String resourceGroupName;

        public static ListPluginsInstancesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListPluginsInstancesResponseBodyData self = new ListPluginsInstancesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListPluginsInstancesResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListPluginsInstancesResponseBodyData setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public ListPluginsInstancesResponseBodyData setInstanceTag(java.util.List<ListPluginsInstancesResponseBodyDataInstanceTag> instanceTag) {
            this.instanceTag = instanceTag;
            return this;
        }
        public java.util.List<ListPluginsInstancesResponseBodyDataInstanceTag> getInstanceTag() {
            return this.instanceTag;
        }

        public ListPluginsInstancesResponseBodyData setOsName(String osName) {
            this.osName = osName;
            return this;
        }
        public String getOsName() {
            return this.osName;
        }

        public ListPluginsInstancesResponseBodyData setPrivateIp(String privateIp) {
            this.privateIp = privateIp;
            return this;
        }
        public String getPrivateIp() {
            return this.privateIp;
        }

        public ListPluginsInstancesResponseBodyData setPublicIp(String publicIp) {
            this.publicIp = publicIp;
            return this;
        }
        public String getPublicIp() {
            return this.publicIp;
        }

        public ListPluginsInstancesResponseBodyData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public ListPluginsInstancesResponseBodyData setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListPluginsInstancesResponseBodyData setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = resourceGroupName;
            return this;
        }
        public String getResourceGroupName() {
            return this.resourceGroupName;
        }

    }

}
