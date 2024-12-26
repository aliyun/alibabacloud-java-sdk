// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ListRenderingDataPackagesResponseBody extends TeaModel {
    @NameInMap("DataPackages")
    public java.util.List<ListRenderingDataPackagesResponseBodyDataPackages> dataPackages;

    /**
     * <p>Id of the request</p>
     * 
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

    public static ListRenderingDataPackagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRenderingDataPackagesResponseBody self = new ListRenderingDataPackagesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRenderingDataPackagesResponseBody setDataPackages(java.util.List<ListRenderingDataPackagesResponseBodyDataPackages> dataPackages) {
        this.dataPackages = dataPackages;
        return this;
    }
    public java.util.List<ListRenderingDataPackagesResponseBodyDataPackages> getDataPackages() {
        return this.dataPackages;
    }

    public ListRenderingDataPackagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRenderingDataPackagesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListRenderingDataPackagesResponseBodyDataPackages extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2024-10-15T10:23:06+08:00</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <strong>example:</strong>
         * <p>dp-449ea3d16c0841b8bf33ec5bbc86a152</p>
         */
        @NameInMap("DataPackageId")
        public String dataPackageId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>render-342012a227dc4ddf91f024639e43051a</p>
         */
        @NameInMap("RenderingInstanceId")
        public String renderingInstanceId;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Size")
        public Integer size;

        /**
         * <strong>example:</strong>
         * <p>available</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>2024-12-06T02:03:59Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static ListRenderingDataPackagesResponseBodyDataPackages build(java.util.Map<String, ?> map) throws Exception {
            ListRenderingDataPackagesResponseBodyDataPackages self = new ListRenderingDataPackagesResponseBodyDataPackages();
            return TeaModel.build(map, self);
        }

        public ListRenderingDataPackagesResponseBodyDataPackages setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListRenderingDataPackagesResponseBodyDataPackages setDataPackageId(String dataPackageId) {
            this.dataPackageId = dataPackageId;
            return this;
        }
        public String getDataPackageId() {
            return this.dataPackageId;
        }

        public ListRenderingDataPackagesResponseBodyDataPackages setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListRenderingDataPackagesResponseBodyDataPackages setRenderingInstanceId(String renderingInstanceId) {
            this.renderingInstanceId = renderingInstanceId;
            return this;
        }
        public String getRenderingInstanceId() {
            return this.renderingInstanceId;
        }

        public ListRenderingDataPackagesResponseBodyDataPackages setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public ListRenderingDataPackagesResponseBodyDataPackages setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListRenderingDataPackagesResponseBodyDataPackages setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
