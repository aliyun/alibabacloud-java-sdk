// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ListRenderingInstanceGatewayResponseBody extends TeaModel {
    /**
     * <p>A list of custom gateway information.</p>
     */
    @NameInMap("GatewayConfigurationInfos")
    public java.util.List<ListRenderingInstanceGatewayResponseBodyGatewayConfigurationInfos> gatewayConfigurationInfos;

    /**
     * <p>The page number of the query results list</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The number of entries on the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    public static ListRenderingInstanceGatewayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRenderingInstanceGatewayResponseBody self = new ListRenderingInstanceGatewayResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRenderingInstanceGatewayResponseBody setGatewayConfigurationInfos(java.util.List<ListRenderingInstanceGatewayResponseBodyGatewayConfigurationInfos> gatewayConfigurationInfos) {
        this.gatewayConfigurationInfos = gatewayConfigurationInfos;
        return this;
    }
    public java.util.List<ListRenderingInstanceGatewayResponseBodyGatewayConfigurationInfos> getGatewayConfigurationInfos() {
        return this.gatewayConfigurationInfos;
    }

    public ListRenderingInstanceGatewayResponseBody setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ListRenderingInstanceGatewayResponseBody setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListRenderingInstanceGatewayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRenderingInstanceGatewayResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class ListRenderingInstanceGatewayResponseBodyGatewayConfigurationInfos extends TeaModel {
        /**
         * <p>The time when the cloud application service instance was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-10-15 10:19:13</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The ID of the custom gateway instance.</p>
         * 
         * <strong>example:</strong>
         * <p>render-xxx</p>
         */
        @NameInMap("GatewayInstanceId")
        public String gatewayInstanceId;

        /**
         * <p>The ID of the cloud application service instance.</p>
         * 
         * <strong>example:</strong>
         * <p>render-342012a227dc4ddf91f024639e43051a</p>
         */
        @NameInMap("RenderingInstanceId")
        public String renderingInstanceId;

        /**
         * <p>The status of the custom gateway. Valid values:</p>
         * <ol>
         * <li><p>Transitional states: creating, deleting</p>
         * </li>
         * <li><p>Desired states: available, failed</p>
         * </li>
         * </ol>
         * 
         * <strong>example:</strong>
         * <p>available</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The time when the information was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-11-02 12:08:26</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static ListRenderingInstanceGatewayResponseBodyGatewayConfigurationInfos build(java.util.Map<String, ?> map) throws Exception {
            ListRenderingInstanceGatewayResponseBodyGatewayConfigurationInfos self = new ListRenderingInstanceGatewayResponseBodyGatewayConfigurationInfos();
            return TeaModel.build(map, self);
        }

        public ListRenderingInstanceGatewayResponseBodyGatewayConfigurationInfos setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListRenderingInstanceGatewayResponseBodyGatewayConfigurationInfos setGatewayInstanceId(String gatewayInstanceId) {
            this.gatewayInstanceId = gatewayInstanceId;
            return this;
        }
        public String getGatewayInstanceId() {
            return this.gatewayInstanceId;
        }

        public ListRenderingInstanceGatewayResponseBodyGatewayConfigurationInfos setRenderingInstanceId(String renderingInstanceId) {
            this.renderingInstanceId = renderingInstanceId;
            return this;
        }
        public String getRenderingInstanceId() {
            return this.renderingInstanceId;
        }

        public ListRenderingInstanceGatewayResponseBodyGatewayConfigurationInfos setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListRenderingInstanceGatewayResponseBodyGatewayConfigurationInfos setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
