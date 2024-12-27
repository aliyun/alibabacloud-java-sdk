// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class ListInstancesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SysomOpenAPI.ServerError</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public java.util.List<ListInstancesResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>Requests for llm service failed</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>9515E5A0-8905-59B0-9BBF-5F0BE568C3A0</p>
     */
    @NameInMap("request_id")
    public String requestId;

    /**
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
        @NameInMap("cluster_id")
        public String clusterId;

        @NameInMap("instance")
        public String instance;

        @NameInMap("kernel_version")
        public String kernelVersion;

        @NameInMap("meta")
        public Object meta;

        @NameInMap("os_arch")
        public String osArch;

        @NameInMap("os_health_score")
        public String osHealthScore;

        @NameInMap("os_name")
        public String osName;

        @NameInMap("os_name_id")
        public String osNameId;

        @NameInMap("os_version")
        public String osVersion;

        @NameInMap("os_version_id")
        public String osVersionId;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("region")
        public String region;

        /**
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
