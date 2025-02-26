// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class ListInstancesWithEcsInfoResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public java.util.List<ListInstancesWithEcsInfoResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>result: code=1 msg=(Request failed, status_code != 200)</p>
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
     * <p>319</p>
     */
    @NameInMap("total")
    public Long total;

    public static ListInstancesWithEcsInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstancesWithEcsInfoResponseBody self = new ListInstancesWithEcsInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstancesWithEcsInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListInstancesWithEcsInfoResponseBody setData(java.util.List<ListInstancesWithEcsInfoResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListInstancesWithEcsInfoResponseBodyData> getData() {
        return this.data;
    }

    public ListInstancesWithEcsInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListInstancesWithEcsInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInstancesWithEcsInfoResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListInstancesWithEcsInfoResponseBodyDataInstanceTag extends TeaModel {
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

        public static ListInstancesWithEcsInfoResponseBodyDataInstanceTag build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesWithEcsInfoResponseBodyDataInstanceTag self = new ListInstancesWithEcsInfoResponseBodyDataInstanceTag();
            return TeaModel.build(map, self);
        }

        public ListInstancesWithEcsInfoResponseBodyDataInstanceTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public ListInstancesWithEcsInfoResponseBodyDataInstanceTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class ListInstancesWithEcsInfoResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>cbf7a37bc905d4682a3338b3744810269</p>
         */
        @NameInMap("cluster_id")
        public String clusterId;

        /**
         * <strong>example:</strong>
         * <p>i-bp118piqcio9tiwgh84b</p>
         */
        @NameInMap("instance_id")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>allowed-repos-r2tzl</p>
         */
        @NameInMap("instance_name")
        public String instanceName;

        @NameInMap("instance_tag")
        public java.util.List<ListInstancesWithEcsInfoResponseBodyDataInstanceTag> instanceTag;

        /**
         * <strong>example:</strong>
         * <p>x86</p>
         */
        @NameInMap("os_arch")
        public String osArch;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("os_health_score")
        public String osHealthScore;

        /**
         * <strong>example:</strong>
         * <p>Alibaba Cloud Linux  3.2104 LTS 64bit</p>
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
         * <p>rg-xxxxxx</p>
         */
        @NameInMap("resource_group_id")
        public String resourceGroupId;

        /**
         * <strong>example:</strong>
         * <p>default resource group</p>
         */
        @NameInMap("resource_group_name")
        public String resourceGroupName;

        /**
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("status")
        public String status;

        public static ListInstancesWithEcsInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesWithEcsInfoResponseBodyData self = new ListInstancesWithEcsInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListInstancesWithEcsInfoResponseBodyData setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public ListInstancesWithEcsInfoResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListInstancesWithEcsInfoResponseBodyData setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public ListInstancesWithEcsInfoResponseBodyData setInstanceTag(java.util.List<ListInstancesWithEcsInfoResponseBodyDataInstanceTag> instanceTag) {
            this.instanceTag = instanceTag;
            return this;
        }
        public java.util.List<ListInstancesWithEcsInfoResponseBodyDataInstanceTag> getInstanceTag() {
            return this.instanceTag;
        }

        public ListInstancesWithEcsInfoResponseBodyData setOsArch(String osArch) {
            this.osArch = osArch;
            return this;
        }
        public String getOsArch() {
            return this.osArch;
        }

        public ListInstancesWithEcsInfoResponseBodyData setOsHealthScore(String osHealthScore) {
            this.osHealthScore = osHealthScore;
            return this;
        }
        public String getOsHealthScore() {
            return this.osHealthScore;
        }

        public ListInstancesWithEcsInfoResponseBodyData setOsName(String osName) {
            this.osName = osName;
            return this;
        }
        public String getOsName() {
            return this.osName;
        }

        public ListInstancesWithEcsInfoResponseBodyData setPrivateIp(String privateIp) {
            this.privateIp = privateIp;
            return this;
        }
        public String getPrivateIp() {
            return this.privateIp;
        }

        public ListInstancesWithEcsInfoResponseBodyData setPublicIp(String publicIp) {
            this.publicIp = publicIp;
            return this;
        }
        public String getPublicIp() {
            return this.publicIp;
        }

        public ListInstancesWithEcsInfoResponseBodyData setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListInstancesWithEcsInfoResponseBodyData setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = resourceGroupName;
            return this;
        }
        public String getResourceGroupName() {
            return this.resourceGroupName;
        }

        public ListInstancesWithEcsInfoResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
