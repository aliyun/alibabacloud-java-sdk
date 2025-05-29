// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ListRenderingProjectInstancesResponseBody extends TeaModel {
    @NameInMap("RenderingInstances")
    public java.util.List<ListRenderingProjectInstancesResponseBodyRenderingInstances> renderingInstances;

    /**
     * <strong>example:</strong>
     * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListRenderingProjectInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRenderingProjectInstancesResponseBody self = new ListRenderingProjectInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRenderingProjectInstancesResponseBody setRenderingInstances(java.util.List<ListRenderingProjectInstancesResponseBodyRenderingInstances> renderingInstances) {
        this.renderingInstances = renderingInstances;
        return this;
    }
    public java.util.List<ListRenderingProjectInstancesResponseBodyRenderingInstances> getRenderingInstances() {
        return this.renderingInstances;
    }

    public ListRenderingProjectInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRenderingProjectInstancesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListRenderingProjectInstancesResponseBodyRenderingInstancesStateInfo extends TeaModel {
        @NameInMap("Comment")
        public String comment;

        /**
         * <strong>example:</strong>
         * <p>InUse</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <strong>example:</strong>
         * <p>2024-11-11T18:19:04+08:00</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static ListRenderingProjectInstancesResponseBodyRenderingInstancesStateInfo build(java.util.Map<String, ?> map) throws Exception {
            ListRenderingProjectInstancesResponseBodyRenderingInstancesStateInfo self = new ListRenderingProjectInstancesResponseBodyRenderingInstancesStateInfo();
            return TeaModel.build(map, self);
        }

        public ListRenderingProjectInstancesResponseBodyRenderingInstancesStateInfo setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ListRenderingProjectInstancesResponseBodyRenderingInstancesStateInfo setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListRenderingProjectInstancesResponseBodyRenderingInstancesStateInfo setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class ListRenderingProjectInstancesResponseBodyRenderingInstances extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2024-09-11T18:19:04+08:00</p>
         */
        @NameInMap("AssociationTime")
        public String associationTime;

        /**
         * <strong>example:</strong>
         * <p>render-9f8c57355d224ad7beaf95e145f22111</p>
         */
        @NameInMap("RenderingInstanceId")
        public String renderingInstanceId;

        @NameInMap("StateInfo")
        public ListRenderingProjectInstancesResponseBodyRenderingInstancesStateInfo stateInfo;

        public static ListRenderingProjectInstancesResponseBodyRenderingInstances build(java.util.Map<String, ?> map) throws Exception {
            ListRenderingProjectInstancesResponseBodyRenderingInstances self = new ListRenderingProjectInstancesResponseBodyRenderingInstances();
            return TeaModel.build(map, self);
        }

        public ListRenderingProjectInstancesResponseBodyRenderingInstances setAssociationTime(String associationTime) {
            this.associationTime = associationTime;
            return this;
        }
        public String getAssociationTime() {
            return this.associationTime;
        }

        public ListRenderingProjectInstancesResponseBodyRenderingInstances setRenderingInstanceId(String renderingInstanceId) {
            this.renderingInstanceId = renderingInstanceId;
            return this;
        }
        public String getRenderingInstanceId() {
            return this.renderingInstanceId;
        }

        public ListRenderingProjectInstancesResponseBodyRenderingInstances setStateInfo(ListRenderingProjectInstancesResponseBodyRenderingInstancesStateInfo stateInfo) {
            this.stateInfo = stateInfo;
            return this;
        }
        public ListRenderingProjectInstancesResponseBodyRenderingInstancesStateInfo getStateInfo() {
            return this.stateInfo;
        }

    }

}
