// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class GetProjectResponseBody extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("FeatureEntityCount")
    public Integer featureEntityCount;

    @NameInMap("FeatureViewCount")
    public Integer featureViewCount;

    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    @NameInMap("ModelCount")
    public Integer modelCount;

    @NameInMap("Name")
    public String name;

    @NameInMap("OfflineDatasourceId")
    public String offlineDatasourceId;

    @NameInMap("OfflineDatasourceName")
    public String offlineDatasourceName;

    @NameInMap("OfflineDatasourceType")
    public String offlineDatasourceType;

    @NameInMap("OfflineLifecycle")
    public Integer offlineLifecycle;

    @NameInMap("OnlineDatasourceId")
    public String onlineDatasourceId;

    @NameInMap("OnlineDatasourceName")
    public String onlineDatasourceName;

    @NameInMap("OnlineDatasourceType")
    public String onlineDatasourceType;

    @NameInMap("Owner")
    public String owner;

    @NameInMap("RequestId")
    public String requestId;

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

}
