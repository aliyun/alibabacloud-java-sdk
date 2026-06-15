// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class GetProjectResponseBody extends TeaModel {
    /**
     * <p>The project description.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a test.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The number of feature entities.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("FeatureEntityCount")
    public Integer featureEntityCount;

    /**
     * <p>The number of feature views.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("FeatureViewCount")
    public Integer featureViewCount;

    /**
     * <p>The creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-12-15T23:24:33.132+08:00</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    /**
     * <p>The modification time.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-12-15T23:24:33.132+08:00</p>
     */
    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    /**
     * <p>The number of models.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("ModelCount")
    public Integer modelCount;

    /**
     * <p>The project name.</p>
     * 
     * <strong>example:</strong>
     * <p>project1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The offline data source ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("OfflineDatasourceId")
    public String offlineDatasourceId;

    /**
     * <p>The offline data source name.</p>
     * 
     * <strong>example:</strong>
     * <p>datasource1</p>
     */
    @NameInMap("OfflineDatasourceName")
    public String offlineDatasourceName;

    /**
     * <p>The type of the offline data source. For example, <code>MaxCompute</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>MaxCompute</p>
     */
    @NameInMap("OfflineDatasourceType")
    public String offlineDatasourceType;

    /**
     * <p>The offline data lifecycle, in days.</p>
     * 
     * <strong>example:</strong>
     * <p>90</p>
     */
    @NameInMap("OfflineLifecycle")
    public Integer offlineLifecycle;

    /**
     * <p>The online data source ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("OnlineDatasourceId")
    public String onlineDatasourceId;

    /**
     * <p>The online data source name.</p>
     * 
     * <strong>example:</strong>
     * <p>datasource2</p>
     */
    @NameInMap("OnlineDatasourceName")
    public String onlineDatasourceName;

    /**
     * <p>The online data source type.</p>
     * <ul>
     * <li><p>Hologres</p>
     * </li>
     * <li><p>Redis</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Hologres</p>
     */
    @NameInMap("OnlineDatasourceType")
    public String onlineDatasourceType;

    /**
     * <p>The Alibaba Cloud account ID of the project owner.</p>
     * 
     * <strong>example:</strong>
     * <p>1232132543543****</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C33E160C-BFCA-5719-B958-942850E949F6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>35523</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static GetProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProjectResponseBody self = new GetProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProjectResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetProjectResponseBody setFeatureEntityCount(Integer featureEntityCount) {
        this.featureEntityCount = featureEntityCount;
        return this;
    }
    public Integer getFeatureEntityCount() {
        return this.featureEntityCount;
    }

    public GetProjectResponseBody setFeatureViewCount(Integer featureViewCount) {
        this.featureViewCount = featureViewCount;
        return this;
    }
    public Integer getFeatureViewCount() {
        return this.featureViewCount;
    }

    public GetProjectResponseBody setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public GetProjectResponseBody setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public GetProjectResponseBody setModelCount(Integer modelCount) {
        this.modelCount = modelCount;
        return this;
    }
    public Integer getModelCount() {
        return this.modelCount;
    }

    public GetProjectResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetProjectResponseBody setOfflineDatasourceId(String offlineDatasourceId) {
        this.offlineDatasourceId = offlineDatasourceId;
        return this;
    }
    public String getOfflineDatasourceId() {
        return this.offlineDatasourceId;
    }

    public GetProjectResponseBody setOfflineDatasourceName(String offlineDatasourceName) {
        this.offlineDatasourceName = offlineDatasourceName;
        return this;
    }
    public String getOfflineDatasourceName() {
        return this.offlineDatasourceName;
    }

    public GetProjectResponseBody setOfflineDatasourceType(String offlineDatasourceType) {
        this.offlineDatasourceType = offlineDatasourceType;
        return this;
    }
    public String getOfflineDatasourceType() {
        return this.offlineDatasourceType;
    }

    public GetProjectResponseBody setOfflineLifecycle(Integer offlineLifecycle) {
        this.offlineLifecycle = offlineLifecycle;
        return this;
    }
    public Integer getOfflineLifecycle() {
        return this.offlineLifecycle;
    }

    public GetProjectResponseBody setOnlineDatasourceId(String onlineDatasourceId) {
        this.onlineDatasourceId = onlineDatasourceId;
        return this;
    }
    public String getOnlineDatasourceId() {
        return this.onlineDatasourceId;
    }

    public GetProjectResponseBody setOnlineDatasourceName(String onlineDatasourceName) {
        this.onlineDatasourceName = onlineDatasourceName;
        return this;
    }
    public String getOnlineDatasourceName() {
        return this.onlineDatasourceName;
    }

    public GetProjectResponseBody setOnlineDatasourceType(String onlineDatasourceType) {
        this.onlineDatasourceType = onlineDatasourceType;
        return this;
    }
    public String getOnlineDatasourceType() {
        return this.onlineDatasourceType;
    }

    public GetProjectResponseBody setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public GetProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetProjectResponseBody setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
