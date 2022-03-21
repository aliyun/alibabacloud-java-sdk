// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rmcore20220121.models;

import com.aliyun.tea.*;

public class GetUnditerminedRequestResponseBody extends TeaModel {
    @NameInMap("AccountId")
    public String accountId;

    @NameInMap("ApiName")
    public String apiName;

    @NameInMap("Context")
    public String context;

    @NameInMap("GmtCreate")
    public String gmtCreate;

    @NameInMap("GmtModified")
    public String gmtModified;

    @NameInMap("OperationType")
    public String operationType;

    @NameInMap("OriginContext")
    public String originContext;

    @NameInMap("OriginRequestId")
    public String originRequestId;

    @NameInMap("Product")
    public String product;

    @NameInMap("RegionId")
    public String regionId;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RequestTime")
    public String requestTime;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceId")
    public String resourceId;

    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("Service")
    public String service;

    @NameInMap("Status")
    public String status;

    @NameInMap("Version")
    public String version;

    public static GetUnditerminedRequestResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUnditerminedRequestResponseBody self = new GetUnditerminedRequestResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUnditerminedRequestResponseBody setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public GetUnditerminedRequestResponseBody setApiName(String apiName) {
        this.apiName = apiName;
        return this;
    }
    public String getApiName() {
        return this.apiName;
    }

    public GetUnditerminedRequestResponseBody setContext(String context) {
        this.context = context;
        return this;
    }
    public String getContext() {
        return this.context;
    }

    public GetUnditerminedRequestResponseBody setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public GetUnditerminedRequestResponseBody setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public GetUnditerminedRequestResponseBody setOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }
    public String getOperationType() {
        return this.operationType;
    }

    public GetUnditerminedRequestResponseBody setOriginContext(String originContext) {
        this.originContext = originContext;
        return this;
    }
    public String getOriginContext() {
        return this.originContext;
    }

    public GetUnditerminedRequestResponseBody setOriginRequestId(String originRequestId) {
        this.originRequestId = originRequestId;
        return this;
    }
    public String getOriginRequestId() {
        return this.originRequestId;
    }

    public GetUnditerminedRequestResponseBody setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public GetUnditerminedRequestResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetUnditerminedRequestResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUnditerminedRequestResponseBody setRequestTime(String requestTime) {
        this.requestTime = requestTime;
        return this;
    }
    public String getRequestTime() {
        return this.requestTime;
    }

    public GetUnditerminedRequestResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public GetUnditerminedRequestResponseBody setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public GetUnditerminedRequestResponseBody setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public GetUnditerminedRequestResponseBody setService(String service) {
        this.service = service;
        return this;
    }
    public String getService() {
        return this.service;
    }

    public GetUnditerminedRequestResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetUnditerminedRequestResponseBody setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
