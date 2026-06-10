// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class ListInstancesResponseBody extends TeaModel {
    /**
     * <p>Status code  </p>
     * <ul>
     * <li><code>code == Success</code> indicates that authorization succeeded.  </li>
     * <li>Any other status code indicates that authorization failed. When authorization fails, check the <code>message</code> field for detailed error information.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SysomOpenAPI.ServerError</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>Return Result.</p>
     */
    @NameInMap("data")
    public java.util.List<ListInstancesResponseBodyData> data;

    /**
     * <p>Error message  </p>
     * <ul>
     * <li>If <code>code == Success</code>, this field is empty.  </li>
     * <li>Otherwise, this field contains the request error message.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Requests for llm service failed</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Request RequestId</p>
     * 
     * <strong>example:</strong>
     * <p>9515E5A0-8905-59B0-9BBF-5F0BE568C3A0</p>
     */
    @NameInMap("request_id")
    public String requestId;

    /**
     * <p>Total number of records</p>
     * 
     * <strong>example:</strong>
     * <p>623</p>
     */
    @NameInMap("total")
    public Long total;

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

    public ListInstancesResponseBody setData(java.util.List<ListInstancesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListInstancesResponseBodyData> getData() {
        return this.data;
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

    public ListInstancesResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListInstancesResponseBodyData extends TeaModel {
        /**
         * <p>Cluster ID</p>
         * 
         * <strong>example:</strong>
         * <p>c2218ca2b76ec45e7b7ee1693f6fcd374</p>
         */
        @NameInMap("cluster_id")
        public String clusterId;

        /**
         * <p>ECS instance ID</p>
         * 
         * <strong>example:</strong>
         * <p>i-wz9d00ut2ska3mlyhn6j</p>
         */
        @NameInMap("instance")
        public String instance;

        /**
         * <p>Milvus version of the instance</p>
         * 
         * <strong>example:</strong>
         * <p>5.10.134-16.1.an8.x86_64</p>
         */
        @NameInMap("kernel_version")
        public String kernelVersion;

        /**
         * <p>Metadata of the instance</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;uname&quot;: &quot;Linux&quot;,
         *     &quot;oncpu&quot;: &quot;off&quot;,
         *     &quot;release&quot;: &quot;5.10.134-16.3.al8.aarch64&quot;,
         *     &quot;monitor&quot;: &quot;on&quot;,
         *     &quot;version_id&quot;: &quot;3&quot;,
         *     &quot;version&quot;: &quot;3 (Soaring Falcon)&quot;,
         *     &quot;podNs&quot;: [</p>
         * <pre><code>],
         * &quot;machine&quot;: &quot;aarch64&quot;,
         * &quot;name&quot;: &quot;Alibaba Cloud Linux&quot;,
         * &quot;sysak&quot;: &quot;3.4.0-1&quot;,
         * &quot;id&quot;: &quot;alinux&quot;,
         * &quot;region&quot;: &quot;cn-hangzhou&quot;,
         * &quot;centos-release&quot;: &quot;Alibaba Cloud Linux release 3 (Soaring Falcon)&quot;
         * </code></pre>
         * <p>}</p>
         */
        @NameInMap("meta")
        public Object meta;

        /**
         * <p>Architecture of the ECS instance</p>
         * 
         * <strong>example:</strong>
         * <p>x86</p>
         */
        @NameInMap("os_arch")
        public String osArch;

        /**
         * <p>Health score of the instance</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("os_health_score")
        public String osHealthScore;

        /**
         * <p>Operating system name of the instance (retrieved from /etc/os-release)</p>
         * 
         * <strong>example:</strong>
         * <p>Anolis OS</p>
         */
        @NameInMap("os_name")
        public String osName;

        /**
         * <p>Operating system name ID of the instance (retrieved from /etc/os-release)</p>
         * 
         * <strong>example:</strong>
         * <p>anolis</p>
         */
        @NameInMap("os_name_id")
        public String osNameId;

        /**
         * <p>Operating system version of the instance (obtained from /etc/os-release)</p>
         * 
         * <strong>example:</strong>
         * <p>8.9</p>
         */
        @NameInMap("os_version")
        public String osVersion;

        /**
         * <p>Operating system version ID of the instance (retrieved from /etc/os-release)</p>
         * 
         * <strong>example:</strong>
         * <p>rhel fedora centos</p>
         */
        @NameInMap("os_version_id")
        public String osVersionId;

        /**
         * <p>Region where the instance is located</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("region")
        public String region;

        /**
         * <p>Status of the instance</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("status")
        public String status;

        public static ListInstancesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyData self = new ListInstancesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyData setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public ListInstancesResponseBodyData setInstance(String instance) {
            this.instance = instance;
            return this;
        }
        public String getInstance() {
            return this.instance;
        }

        public ListInstancesResponseBodyData setKernelVersion(String kernelVersion) {
            this.kernelVersion = kernelVersion;
            return this;
        }
        public String getKernelVersion() {
            return this.kernelVersion;
        }

        public ListInstancesResponseBodyData setMeta(Object meta) {
            this.meta = meta;
            return this;
        }
        public Object getMeta() {
            return this.meta;
        }

        public ListInstancesResponseBodyData setOsArch(String osArch) {
            this.osArch = osArch;
            return this;
        }
        public String getOsArch() {
            return this.osArch;
        }

        public ListInstancesResponseBodyData setOsHealthScore(String osHealthScore) {
            this.osHealthScore = osHealthScore;
            return this;
        }
        public String getOsHealthScore() {
            return this.osHealthScore;
        }

        public ListInstancesResponseBodyData setOsName(String osName) {
            this.osName = osName;
            return this;
        }
        public String getOsName() {
            return this.osName;
        }

        public ListInstancesResponseBodyData setOsNameId(String osNameId) {
            this.osNameId = osNameId;
            return this;
        }
        public String getOsNameId() {
            return this.osNameId;
        }

        public ListInstancesResponseBodyData setOsVersion(String osVersion) {
            this.osVersion = osVersion;
            return this;
        }
        public String getOsVersion() {
            return this.osVersion;
        }

        public ListInstancesResponseBodyData setOsVersionId(String osVersionId) {
            this.osVersionId = osVersionId;
            return this;
        }
        public String getOsVersionId() {
            return this.osVersionId;
        }

        public ListInstancesResponseBodyData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public ListInstancesResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
