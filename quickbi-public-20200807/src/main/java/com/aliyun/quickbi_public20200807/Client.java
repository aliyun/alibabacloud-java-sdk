// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20200807;

import com.aliyun.tea.*;
import com.aliyun.quickbi_public20200807.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "central";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-hangzhou", "quickbi-public-share.aliyuncs.com"),
            new TeaPair("cn-hongkong", "quickbi-public-share.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "quickbi-public-share.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "quickbi-public-share.aliyuncs.com"),
            new TeaPair("eu-central-1", "quickbi-public-share.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("quickbi-public", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
    }


    public String getEndpoint(String productId, String regionId, String endpointRule, String network, String suffix, java.util.Map<String, String> endpointMap, String endpoint) throws Exception {
        if (!com.aliyun.teautil.Common.empty(endpoint)) {
            return endpoint;
        }

        if (!com.aliyun.teautil.Common.isUnset(endpointMap) && !com.aliyun.teautil.Common.empty(endpointMap.get(regionId))) {
            return endpointMap.get(regionId);
        }

        return com.aliyun.endpointutil.Client.getEndpointRules(productId, regionId, endpointRule, network, suffix);
    }

    public CheckReadableResponse checkReadableWithOptions(CheckReadableRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("WorksId", request.worksId);
        query.put("UserId", request.userId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckReadable"),
            new TeaPair("version", "2020-08-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckReadableResponse());
    }

    public CheckReadableResponse checkReadable(CheckReadableRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkReadableWithOptions(request, runtime);
    }

    public QueryEmbeddedInfoResponse queryEmbeddedInfoWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryEmbeddedInfo"),
            new TeaPair("version", "2020-08-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryEmbeddedInfoResponse());
    }

    public QueryEmbeddedInfoResponse queryEmbeddedInfo() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryEmbeddedInfoWithOptions(runtime);
    }

    public QueryEmbeddedStausResponse queryEmbeddedStausWithOptions(QueryEmbeddedStausRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("WorksId", request.worksId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryEmbeddedStaus"),
            new TeaPair("version", "2020-08-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryEmbeddedStausResponse());
    }

    public QueryEmbeddedStausResponse queryEmbeddedStaus(QueryEmbeddedStausRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryEmbeddedStausWithOptions(request, runtime);
    }

    public QueryReadableResourcesListByUserIdResponse queryReadableResourcesListByUserIdWithOptions(QueryReadableResourcesListByUserIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("UserId", request.userId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryReadableResourcesListByUserId"),
            new TeaPair("version", "2020-08-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryReadableResourcesListByUserIdResponse());
    }

    public QueryReadableResourcesListByUserIdResponse queryReadableResourcesListByUserId(QueryReadableResourcesListByUserIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryReadableResourcesListByUserIdWithOptions(request, runtime);
    }

    public QueryWorksByOrganizationResponse queryWorksByOrganizationWithOptions(QueryWorksByOrganizationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("WorksType", request.worksType);
        query.put("Status", request.status);
        query.put("ThirdPartAuthFlag", request.thirdPartAuthFlag);
        query.put("PageNum", request.pageNum);
        query.put("PageSize", request.pageSize);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryWorksByOrganization"),
            new TeaPair("version", "2020-08-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryWorksByOrganizationResponse());
    }

    public QueryWorksByOrganizationResponse queryWorksByOrganization(QueryWorksByOrganizationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryWorksByOrganizationWithOptions(request, runtime);
    }

    public QueryWorksByWorkspaceResponse queryWorksByWorkspaceWithOptions(QueryWorksByWorkspaceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("WorkspaceId", request.workspaceId);
        query.put("WorksType", request.worksType);
        query.put("Status", request.status);
        query.put("ThirdPartAuthFlag", request.thirdPartAuthFlag);
        query.put("PageNum", request.pageNum);
        query.put("PageSize", request.pageSize);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryWorksByWorkspace"),
            new TeaPair("version", "2020-08-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryWorksByWorkspaceResponse());
    }

    public QueryWorksByWorkspaceResponse queryWorksByWorkspace(QueryWorksByWorkspaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryWorksByWorkspaceWithOptions(request, runtime);
    }

    public UpdateEmbeddedStatusResponse updateEmbeddedStatusWithOptions(UpdateEmbeddedStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("WorksId", request.worksId);
        query.put("ThirdPartAuthFlag", request.thirdPartAuthFlag);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateEmbeddedStatus"),
            new TeaPair("version", "2020-08-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateEmbeddedStatusResponse());
    }

    public UpdateEmbeddedStatusResponse updateEmbeddedStatus(UpdateEmbeddedStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateEmbeddedStatusWithOptions(request, runtime);
    }
}
