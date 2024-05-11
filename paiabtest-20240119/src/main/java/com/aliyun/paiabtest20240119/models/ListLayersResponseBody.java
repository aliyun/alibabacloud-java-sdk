// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiabtest20240119.models;

import com.aliyun.tea.*;

public class ListLayersResponseBody extends TeaModel {
    @NameInMap("Layers")
    public java.util.List<ListLayersResponseBodyLayers> layers;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListLayersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLayersResponseBody self = new ListLayersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLayersResponseBody setLayers(java.util.List<ListLayersResponseBodyLayers> layers) {
        this.layers = layers;
        return this;
    }
    public java.util.List<ListLayersResponseBodyLayers> getLayers() {
        return this.layers;
    }

    public ListLayersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLayersResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListLayersResponseBodyLayers extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("DomainId")
        public String domainId;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        @NameInMap("GmtModifyTime")
        public String gmtModifyTime;

        @NameInMap("IsDefaultLayer")
        public Boolean isDefaultLayer;

        @NameInMap("LayerId")
        public String layerId;

        @NameInMap("Name")
        public String name;

        @NameInMap("ProjectId")
        public String projectId;

        @NameInMap("ProjectName")
        public String projectName;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        public static ListLayersResponseBodyLayers build(java.util.Map<String, ?> map) throws Exception {
            ListLayersResponseBodyLayers self = new ListLayersResponseBodyLayers();
            return TeaModel.build(map, self);
        }

        public ListLayersResponseBodyLayers setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListLayersResponseBodyLayers setDomainId(String domainId) {
            this.domainId = domainId;
            return this;
        }
        public String getDomainId() {
            return this.domainId;
        }

        public ListLayersResponseBodyLayers setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public ListLayersResponseBodyLayers setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public ListLayersResponseBodyLayers setGmtModifyTime(String gmtModifyTime) {
            this.gmtModifyTime = gmtModifyTime;
            return this;
        }
        public String getGmtModifyTime() {
            return this.gmtModifyTime;
        }

        public ListLayersResponseBodyLayers setIsDefaultLayer(Boolean isDefaultLayer) {
            this.isDefaultLayer = isDefaultLayer;
            return this;
        }
        public Boolean getIsDefaultLayer() {
            return this.isDefaultLayer;
        }

        public ListLayersResponseBodyLayers setLayerId(String layerId) {
            this.layerId = layerId;
            return this;
        }
        public String getLayerId() {
            return this.layerId;
        }

        public ListLayersResponseBodyLayers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListLayersResponseBodyLayers setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public ListLayersResponseBodyLayers setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public ListLayersResponseBodyLayers setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
