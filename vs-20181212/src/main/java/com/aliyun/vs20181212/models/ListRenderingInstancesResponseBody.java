// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ListRenderingInstancesResponseBody extends TeaModel {
    @NameInMap("RenderingInstances")
    public java.util.List<ListRenderingInstancesResponseBodyRenderingInstances> renderingInstances;

    /**
     * <strong>example:</strong>
     * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListRenderingInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRenderingInstancesResponseBody self = new ListRenderingInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRenderingInstancesResponseBody setRenderingInstances(java.util.List<ListRenderingInstancesResponseBodyRenderingInstances> renderingInstances) {
        this.renderingInstances = renderingInstances;
        return this;
    }
    public java.util.List<ListRenderingInstancesResponseBodyRenderingInstances> getRenderingInstances() {
        return this.renderingInstances;
    }

    public ListRenderingInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRenderingInstancesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListRenderingInstancesResponseBodyRenderingInstances extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2023-11-17T02:18:04Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <strong>example:</strong>
         * <p>render-9f8c57355d224ad7beaf95e145f22111</p>
         */
        @NameInMap("RenderingInstanceId")
        public String renderingInstanceId;

        /**
         * <strong>example:</strong>
         * <p>crs.cp.l1</p>
         */
        @NameInMap("RenderingSpec")
        public String renderingSpec;

        public static ListRenderingInstancesResponseBodyRenderingInstances build(java.util.Map<String, ?> map) throws Exception {
            ListRenderingInstancesResponseBodyRenderingInstances self = new ListRenderingInstancesResponseBodyRenderingInstances();
            return TeaModel.build(map, self);
        }

        public ListRenderingInstancesResponseBodyRenderingInstances setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListRenderingInstancesResponseBodyRenderingInstances setRenderingInstanceId(String renderingInstanceId) {
            this.renderingInstanceId = renderingInstanceId;
            return this;
        }
        public String getRenderingInstanceId() {
            return this.renderingInstanceId;
        }

        public ListRenderingInstancesResponseBodyRenderingInstances setRenderingSpec(String renderingSpec) {
            this.renderingSpec = renderingSpec;
            return this;
        }
        public String getRenderingSpec() {
            return this.renderingSpec;
        }

    }

}
