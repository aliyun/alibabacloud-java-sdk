// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class ListInstanceHealthResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SysomOpenAPI.ServerError</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public ListInstanceHealthResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>Query no data</p>
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
    public Integer total;

    public static ListInstanceHealthResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceHealthResponseBody self = new ListInstanceHealthResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstanceHealthResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListInstanceHealthResponseBody setData(ListInstanceHealthResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListInstanceHealthResponseBodyData getData() {
        return this.data;
    }

    public ListInstanceHealthResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListInstanceHealthResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInstanceHealthResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class ListInstanceHealthResponseBodyData extends TeaModel {
        @NameInMap("images")
        public java.util.List<String> images;

        /**
         * <strong>example:</strong>
         * <p>i-wz9d00ut2ska3mlyhn6j</p>
         */
        @NameInMap("instance")
        public String instance;

        /**
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("namespace")
        public String namespace;

        /**
         * <strong>example:</strong>
         * <p>test-pod</p>
         */
        @NameInMap("pod")
        public String pod;

        /**
         * <strong>example:</strong>
         * <p>cn-shenzhen</p>
         */
        @NameInMap("region_id")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("score")
        public Float score;

        /**
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("status")
        public String status;

        public static ListInstanceHealthResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceHealthResponseBodyData self = new ListInstanceHealthResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListInstanceHealthResponseBodyData setImages(java.util.List<String> images) {
            this.images = images;
            return this;
        }
        public java.util.List<String> getImages() {
            return this.images;
        }

        public ListInstanceHealthResponseBodyData setInstance(String instance) {
            this.instance = instance;
            return this;
        }
        public String getInstance() {
            return this.instance;
        }

        public ListInstanceHealthResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ListInstanceHealthResponseBodyData setPod(String pod) {
            this.pod = pod;
            return this;
        }
        public String getPod() {
            return this.pod;
        }

        public ListInstanceHealthResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListInstanceHealthResponseBodyData setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public ListInstanceHealthResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
