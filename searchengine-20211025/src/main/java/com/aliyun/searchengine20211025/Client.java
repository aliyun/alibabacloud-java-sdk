// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025;

import com.aliyun.tea.*;
import com.aliyun.searchengine20211025.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("searchengine", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public BuildIndexResponse buildIndex(String instanceId, BuildIndexRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.buildIndexWithOptions(instanceId, request, headers, runtime);
    }

    public BuildIndexResponse buildIndexWithOptions(String instanceId, BuildIndexRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        instanceId = com.aliyun.openapiutil.Client.getEncodeParam(instanceId);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.body)) {
            body.put("body", request.body);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BuildIndex"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + instanceId + "/actions/build-index"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BuildIndexResponse());
    }

    public ChangeResourceGroupResponse changeResourceGroup(String instanceId, ChangeResourceGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.changeResourceGroupWithOptions(instanceId, request, headers, runtime);
    }

    public ChangeResourceGroupResponse changeResourceGroupWithOptions(String instanceId, ChangeResourceGroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        instanceId = com.aliyun.openapiutil.Client.getEncodeParam(instanceId);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.newResourceGroupId)) {
            body.put("newResourceGroupId", request.newResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            body.put("resourceType", request.resourceType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChangeResourceGroup"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + instanceId + "/actions/change-resource-group"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChangeResourceGroupResponse());
    }

    public CloneSqlInstanceResponse cloneSqlInstance(String instanceId, String database, String sqlInstanceId, CloneSqlInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cloneSqlInstanceWithOptions(instanceId, database, sqlInstanceId, request, headers, runtime);
    }

    public CloneSqlInstanceResponse cloneSqlInstanceWithOptions(String instanceId, String database, String sqlInstanceId, CloneSqlInstanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        instanceId = com.aliyun.openapiutil.Client.getEncodeParam(instanceId);
        database = com.aliyun.openapiutil.Client.getEncodeParam(database);
        sqlInstanceId = com.aliyun.openapiutil.Client.getEncodeParam(sqlInstanceId);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetFolderId)) {
            body.put("targetFolderId", request.targetFolderId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CloneSqlInstance"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + instanceId + "/sql-studio/databases/" + database + "/sql-instances/" + sqlInstanceId + "/actions/clone"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CloneSqlInstanceResponse());
    }

    public CreateClusterResponse createCluster(String instanceId, CreateClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createClusterWithOptions(instanceId, request, headers, runtime);
    }

    public CreateClusterResponse createClusterWithOptions(String instanceId, CreateClusterRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        instanceId = com.aliyun.openapiutil.Client.getEncodeParam(instanceId);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.body)) {
            body.put("body", request.body);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCluster"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + instanceId + "/clusters"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateClusterResponse());
    }

    public CreateDataSourceResponse createDataSource(String instanceId, CreateDataSourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDataSourceWithOptions(instanceId, request, headers, runtime);
    }

    public CreateDataSourceResponse createDataSourceWithOptions(String instanceId, CreateDataSourceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        instanceId = com.aliyun.openapiutil.Client.getEncodeParam(instanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("dryRun", request.dryRun);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.body)) {
            body.put("body", request.body);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDataSource"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + instanceId + "/data-sources"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDataSourceResponse());
    }

    public CreateFolderResponse createFolder(String instanceId, String database, CreateFolderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createFolderWithOptions(instanceId, database, request, headers, runtime);
    }

    public CreateFolderResponse createFolderWithOptions(String instanceId, String database, CreateFolderRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        instanceId = com.aliyun.openapiutil.Client.getEncodeParam(instanceId);
        database = com.aliyun.openapiutil.Client.getEncodeParam(database);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parent)) {
            body.put("parent", request.parent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("type", request.type);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFolder"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + instanceId + "/sql-studio/databases/" + database + "/folders"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFolderResponse());
    }

    public CreateIndexResponse createIndex(String instanceId, CreateIndexRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createIndexWithOptions(instanceId, request, headers, runtime);
    }

    public CreateIndexResponse createIndexWithOptions(String instanceId, CreateIndexRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        instanceId = com.aliyun.openapiutil.Client.getEncodeParam(instanceId);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.body)) {
            body.put("body", request.body);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateIndex"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + instanceId + "/indexes"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateIndexResponse());
    }

    public CreateInstanceResponse createInstance(CreateInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createInstanceWithOptions(request, headers, runtime);
    }

    public CreateInstanceResponse createInstanceWithOptions(CreateInstanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", request.body)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateInstance"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateInstanceResponse());
    }

    public CreateSqlInstanceResponse createSqlInstance(String instanceId, String database, CreateSqlInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSqlInstanceWithOptions(instanceId, database, request, headers, runtime);
    }

    public CreateSqlInstanceResponse createSqlInstanceWithOptions(String instanceId, String database, CreateSqlInstanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        instanceId = com.aliyun.openapiutil.Client.getEncodeParam(instanceId);
        database = com.aliyun.openapiutil.Client.getEncodeParam(database);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parent)) {
            body.put("parent", request.parent);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSqlInstance"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + instanceId + "/sql-studio/databases/" + database + "/sql-instances"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSqlInstanceResponse());
    }

    public DeleteAdvanceConfigResponse deleteAdvanceConfig(String instanceId, String configName) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteAdvanceConfigWithOptions(instanceId, configName, headers, runtime);
    }

    public DeleteAdvanceConfigResponse deleteAdvanceConfigWithOptions(String instanceId, String configName, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        instanceId = com.aliyun.openapiutil.Client.getEncodeParam(instanceId);
        configName = com.aliyun.openapiutil.Client.getEncodeParam(configName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAdvanceConfig"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + instanceId + "/advanced-configs/" + configName + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAdvanceConfigResponse());
    }

    public DeleteDataSourceResponse deleteDataSource(String instanceId, String dataSourceName) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteDataSourceWithOptions(instanceId, dataSourceName, headers, runtime);
    }

    public DeleteDataSourceResponse deleteDataSourceWithOptions(String instanceId, String dataSourceName, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        instanceId = com.aliyun.openapiutil.Client.getEncodeParam(instanceId);
        dataSourceName = com.aliyun.openapiutil.Client.getEncodeParam(dataSourceName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDataSource"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + instanceId + "/data-sources/" + dataSourceName + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDataSourceResponse());
    }

    public DeleteFolderResponse deleteFolder(String instanceId, String database, String folderId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteFolderWithOptions(instanceId, database, folderId, headers, runtime);
    }

    public DeleteFolderResponse deleteFolderWithOptions(String instanceId, String database, String folderId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        instanceId = com.aliyun.openapiutil.Client.getEncodeParam(instanceId);
        database = com.aliyun.openapiutil.Client.getEncodeParam(database);
        folderId = com.aliyun.openapiutil.Client.getEncodeParam(folderId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteFolder"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + instanceId + "/sql-studio/databases/" + database + "/folders/" + folderId + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteFolderResponse());
    }

    public DeleteIndexResponse deleteIndex(String instanceId, String indexName, DeleteIndexRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteIndexWithOptions(instanceId, indexName, request, headers, runtime);
    }

    public DeleteIndexResponse deleteIndexWithOptions(String instanceId, String indexName, DeleteIndexRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        instanceId = com.aliyun.openapiutil.Client.getEncodeParam(instanceId);
        indexName = com.aliyun.openapiutil.Client.getEncodeParam(indexName);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataSource)) {
            query.put("dataSource", request.dataSource);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteIndex"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + instanceId + "/indexes/" + indexName + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteIndexResponse());
    }

    public DeleteIndexVersionResponse deleteIndexVersion(String instanceId, String indexName, String versionName) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteIndexVersionWithOptions(instanceId, indexName, versionName, headers, runtime);
    }

    public DeleteIndexVersionResponse deleteIndexVersionWithOptions(String instanceId, String indexName, String versionName, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        instanceId = com.aliyun.openapiutil.Client.getEncodeParam(instanceId);
        indexName = com.aliyun.openapiutil.Client.getEncodeParam(indexName);
        versionName = com.aliyun.openapiutil.Client.getEncodeParam(versionName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteIndexVersion"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + instanceId + "/indexes/" + indexName + "/versions/" + versionName + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteIndexVersionResponse());
    }

    public DeleteInstanceResponse deleteInstance(String instanceId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteInstanceWithOptions(instanceId, headers, runtime);
    }

    public DeleteInstanceResponse deleteInstanceWithOptions(String instanceId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        instanceId = com.aliyun.openapiutil.Client.getEncodeParam(instanceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteInstance"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + instanceId + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteInstanceResponse());
    }

    public DeleteSqlInstanceResponse deleteSqlInstance(String instanceId, String database, String sqlInstanceId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteSqlInstanceWithOptions(instanceId, database, sqlInstanceId, headers, runtime);
    }

    public DeleteSqlInstanceResponse deleteSqlInstanceWithOptions(String instanceId, String database, String sqlInstanceId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        instanceId = com.aliyun.openapiutil.Client.getEncodeParam(instanceId);
        database = com.aliyun.openapiutil.Client.getEncodeParam(database);
        sqlInstanceId = com.aliyun.openapiutil.Client.getEncodeParam(sqlInstanceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSqlInstance"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + instanceId + "/sql-studio/databases/" + database + "/sql-instances/" + sqlInstanceId + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSqlInstanceResponse());
    }

    public ExecuteSqlInstanceResponse executeSqlInstance(String instanceId, String database, String sqlInstanceId, ExecuteSqlInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.executeSqlInstanceWithOptions(instanceId, database, sqlInstanceId, request, headers, runtime);
    }

    public ExecuteSqlInstanceResponse executeSqlInstanceWithOptions(String instanceId, String database, String sqlInstanceId, ExecuteSqlInstanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        instanceId = com.aliyun.openapiutil.Client.getEncodeParam(instanceId);
        database = com.aliyun.openapiutil.Client.getEncodeParam(database);
        sqlInstanceId = com.aliyun.openapiutil.Client.getEncodeParam(sqlInstanceId);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.combineParam)) {
            body.put("combineParam", request.combineParam);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            body.put("domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dynamicParam)) {
            body.put("dynamicParam", request.dynamicParam);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.kvpair)) {
            body.put("kvpair", request.kvpair);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            body.put("params", request.params);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.staticParam)) {
            body.put("staticParam", request.staticParam);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExecuteSqlInstance"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + instanceId + "/sql-studio/databases/" + database + "/sql-instances/" + sqlInstanceId + "/actions/execution"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExecuteSqlInstanceResponse());
    }

    public ForceSwitchResponse forceSwitch(String instanceId, String fsmId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.forceSwitchWithOptions(instanceId, fsmId, headers, runtime);
    }

    public ForceSwitchResponse forceSwitchWithOptions(String instanceId, String fsmId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        instanceId = com.aliyun.openapiutil.Client.getEncodeParam(instanceId);
        fsmId = com.aliyun.openapiutil.Client.getEncodeParam(fsmId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ForceSwitch"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + instanceId + "/force-switch/" + fsmId + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ForceSwitchResponse());
    }

    public GetAdvanceConfigResponse getAdvanceConfig(String instanceId, String configName) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAdvanceConfigWithOptions(instanceId, configName, headers, runtime);
    }

    public GetAdvanceConfigResponse getAdvanceConfigWithOptions(String instanceId, String configName, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        instanceId = com.aliyun.openapiutil.Client.getEncodeParam(instanceId);
        configName = com.aliyun.openapiutil.Client.getEncodeParam(configName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAdvanceConfig"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + instanceId + "/advanced-configs/" + configName + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAdvanceConfigResponse());
    }

    public GetAdvanceConfigFileResponse getAdvanceConfigFile(String instanceId, String configName, GetAdvanceConfigFileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAdvanceConfigFileWithOptions(instanceId, configName, request, headers, runtime);
    }

    public GetAdvanceConfigFileResponse getAdvanceConfigFileWithOptions(String instanceId, String configName, GetAdvanceConfigFileRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        instanceId = com.aliyun.openapiutil.Client.getEncodeParam(instanceId);
        configName = com.aliyun.openapiutil.Client.getEncodeParam(configName);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            query.put("fileName", request.fileName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAdvanceConfigFile"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + instanceId + "/advanced-configs/" + configName + "/file"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAdvanceConfigFileResponse());
    }

    public GetClusterResponse getCluster(String instanceId, String clusterName) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getClusterWithOptions(instanceId, clusterName, headers, runtime);
    }

    public GetClusterResponse getClusterWithOptions(String instanceId, String clusterName, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        instanceId = com.aliyun.openapiutil.Client.getEncodeParam(instanceId);
        clusterName = com.aliyun.openapiutil.Client.getEncodeParam(clusterName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCluster"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + instanceId + "/clusters/" + clusterName + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetClusterResponse());
    }

    public GetClusterInfoResponse getClusterInfo(String instanceId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getClusterInfoWithOptions(instanceId, headers, runtime);
    }

    public GetClusterInfoResponse getClusterInfoWithOptions(String instanceId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        instanceId = com.aliyun.openapiutil.Client.getEncodeParam(instanceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetClusterInfo"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + instanceId + "/cluster-info"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetClusterInfoResponse());
    }

    public GetClusterRunTimeInfoResponse getClusterRunTimeInfo(String instanceId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getClusterRunTimeInfoWithOptions(instanceId, headers, runtime);
    }

    public GetClusterRunTimeInfoResponse getClusterRunTimeInfoWithOptions(String instanceId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        instanceId = com.aliyun.openapiutil.Client.getEncodeParam(instanceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetClusterRunTimeInfo"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + instanceId + "/cluster-run-time-info"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetClusterRunTimeInfoResponse());
    }

    public GetDataSourceResponse getDataSource(String dataSourceName, String instanceId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDataSourceWithOptions(dataSourceName, instanceId, headers, runtime);
    }

    public GetDataSourceResponse getDataSourceWithOptions(String dataSourceName, String instanceId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        dataSourceName = com.aliyun.openapiutil.Client.getEncodeParam(dataSourceName);
        instanceId = com.aliyun.openapiutil.Client.getEncodeParam(instanceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDataSource"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + instanceId + "/data-sources/" + dataSourceName + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDataSourceResponse());
    }

    public GetDatabaseSchemaResponse getDatabaseSchema(String instanceId, String database, String tableName) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDatabaseSchemaWithOptions(instanceId, database, tableName, headers, runtime);
    }

    public GetDatabaseSchemaResponse getDatabaseSchemaWithOptions(String instanceId, String database, String tableName, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        instanceId = com.aliyun.openapiutil.Client.getEncodeParam(instanceId);
        database = com.aliyun.openapiutil.Client.getEncodeParam(database);
        tableName = com.aliyun.openapiutil.Client.getEncodeParam(tableName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDatabaseSchema"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + instanceId + "/sql-studio/databases/" + database + "/tables/" + tableName + "/schema"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDatabaseSchemaResponse());
    }

    public GetDeployGraphResponse getDeployGraph(String instanceId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDeployGraphWithOptions(instanceId, headers, runtime);
    }

    public GetDeployGraphResponse getDeployGraphWithOptions(String instanceId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        instanceId = com.aliyun.openapiutil.Client.getEncodeParam(instanceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDeployGraph"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + instanceId + "/deploy-graph"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDeployGraphResponse());
    }

    public GetFileResponse getFile(String instanceId, String indexName, String versionName, GetFileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getFileWithOptions(instanceId, indexName, versionName, request, headers, runtime);
    }

    public GetFileResponse getFileWithOptions(String instanceId, String indexName, String versionName, GetFileRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        instanceId = com.aliyun.openapiutil.Client.getEncodeParam(instanceId);
        indexName = com.aliyun.openapiutil.Client.getEncodeParam(indexName);
        versionName = com.aliyun.openapiutil.Client.getEncodeParam(versionName);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            query.put("fileName", request.fileName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFile"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + instanceId + "/indexes/" + indexName + "/versions/" + versionName + "/file"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFileResponse());
    }

    public GetIndexResponse getIndex(String instanceId, String indexName, GetIndexRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getIndexWithOptions(instanceId, indexName, request, headers, runtime);
    }

    public GetIndexResponse getIndexWithOptions(String instanceId, String indexName, GetIndexRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        instanceId = com.aliyun.openapiutil.Client.getEncodeParam(instanceId);
        indexName = com.aliyun.openapiutil.Client.getEncodeParam(indexName);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataSource)) {
            query.put("dataSource", request.dataSource);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetIndex"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + instanceId + "/indexes/" + indexName + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetIndexResponse());
    }

    public GetIndexVersionResponse getIndexVersion(String instanceId, String clusterName) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getIndexVersionWithOptions(instanceId, clusterName, headers, runtime);
    }

    public GetIndexVersionResponse getIndexVersionWithOptions(String instanceId, String clusterName, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        instanceId = com.aliyun.openapiutil.Client.getEncodeParam(instanceId);
        clusterName = com.aliyun.openapiutil.Client.getEncodeParam(clusterName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetIndexVersion"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + instanceId + "/clusters/" + clusterName + "/index-version"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetIndexVersionResponse());
    }

    public GetInstanceResponse getInstance(String instanceId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getInstanceWithOptions(instanceId, headers, runtime);
    }

    public GetInstanceResponse getInstanceWithOptions(String instanceId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        instanceId = com.aliyun.openapiutil.Client.getEncodeParam(instanceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstance"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + instanceId + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceResponse());
    }

    public GetInstanceQuotaResponse getInstanceQuota(String instanceId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getInstanceQuotaWithOptions(instanceId, headers, runtime);
    }

    public GetInstanceQuotaResponse getInstanceQuotaWithOptions(String instanceId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        instanceId = com.aliyun.openapiutil.Client.getEncodeParam(instanceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstanceQuota"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + instanceId + "/usedQuota"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceQuotaResponse());
    }

    public GetNodeConfigResponse getNodeConfig(String instanceId, GetNodeConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getNodeConfigWithOptions(instanceId, request, headers, runtime);
    }

    public GetNodeConfigResponse getNodeConfigWithOptions(String instanceId, GetNodeConfigRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        instanceId = com.aliyun.openapiutil.Client.getEncodeParam(instanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterName)) {
            query.put("clusterName", request.clusterName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceName)) {
            query.put("dataSourceName", request.dataSourceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableDeployId)) {
            query.put("tableDeployId", request.tableDeployId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetNodeConfig"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + instanceId + "/node-config"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetNodeConfigResponse());
    }

    public GetSqlInstanceResponse getSqlInstance(String instanceId, String database, String sqlInstanceId, GetSqlInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSqlInstanceWithOptions(instanceId, database, sqlInstanceId, request, headers, runtime);
    }

    public GetSqlInstanceResponse getSqlInstanceWithOptions(String instanceId, String database, String sqlInstanceId, GetSqlInstanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        instanceId = com.aliyun.openapiutil.Client.getEncodeParam(instanceId);
        database = com.aliyun.openapiutil.Client.getEncodeParam(database);
        sqlInstanceId = com.aliyun.openapiutil.Client.getEncodeParam(sqlInstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            query.put("version", request.version);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSqlInstance"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + instanceId + "/sql-studio/databases/" + database + "/sql-instances/" + sqlInstanceId + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSqlInstanceResponse());
    }

    public ListAdvanceConfigDirResponse listAdvanceConfigDir(String instanceId, String configName, ListAdvanceConfigDirRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAdvanceConfigDirWithOptions(instanceId, configName, request, headers, runtime);
    }

    public ListAdvanceConfigDirResponse listAdvanceConfigDirWithOptions(String instanceId, String configName, ListAdvanceConfigDirRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        instanceId = com.aliyun.openapiutil.Client.getEncodeParam(instanceId);
        configName = com.aliyun.openapiutil.Client.getEncodeParam(configName);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dirName)) {
            query.put("dirName", request.dirName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAdvanceConfigDir"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + instanceId + "/advanced-configs/" + configName + "/dir"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAdvanceConfigDirResponse());
    }

    public ListAdvanceConfigsResponse listAdvanceConfigs(String instanceId, ListAdvanceConfigsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAdvanceConfigsWithOptions(instanceId, request, headers, runtime);
    }

    public ListAdvanceConfigsResponse listAdvanceConfigsWithOptions(String instanceId, ListAdvanceConfigsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        instanceId = com.aliyun.openapiutil.Client.getEncodeParam(instanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAdvanceConfigs"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + instanceId + "/advanced-configs"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAdvanceConfigsResponse());
    }

    public ListClusterNamesResponse listClusterNames(String instanceId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listClusterNamesWithOptions(instanceId, headers, runtime);
    }

    public ListClusterNamesResponse listClusterNamesWithOptions(String instanceId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        instanceId = com.aliyun.openapiutil.Client.getEncodeParam(instanceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListClusterNames"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + instanceId + "/cluster-names"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListClusterNamesResponse());
    }

    public ListClusterTasksResponse listClusterTasks(String instanceId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listClusterTasksWithOptions(instanceId, headers, runtime);
    }

    public ListClusterTasksResponse listClusterTasksWithOptions(String instanceId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        instanceId = com.aliyun.openapiutil.Client.getEncodeParam(instanceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListClusterTasks"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + instanceId + "/cluster-tasks"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListClusterTasksResponse());
    }

    public ListClustersResponse listClusters(String instanceId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listClustersWithOptions(instanceId, headers, runtime);
    }

    public ListClustersResponse listClustersWithOptions(String instanceId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        instanceId = com.aliyun.openapiutil.Client.getEncodeParam(instanceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListClusters"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + instanceId + "/clusters"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListClustersResponse());
    }

    public ListDataSourceSchemasResponse listDataSourceSchemas(String instanceId, String dataSourceName) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDataSourceSchemasWithOptions(instanceId, dataSourceName, headers, runtime);
    }

    public ListDataSourceSchemasResponse listDataSourceSchemasWithOptions(String instanceId, String dataSourceName, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        instanceId = com.aliyun.openapiutil.Client.getEncodeParam(instanceId);
        dataSourceName = com.aliyun.openapiutil.Client.getEncodeParam(dataSourceName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataSourceSchemas"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + instanceId + "/data-sources/" + dataSourceName + "/schemas"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataSourceSchemasResponse());
    }

    public ListDataSourceTasksResponse listDataSourceTasks(String instanceId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDataSourceTasksWithOptions(instanceId, headers, runtime);
    }

    public ListDataSourceTasksResponse listDataSourceTasksWithOptions(String instanceId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        instanceId = com.aliyun.openapiutil.Client.getEncodeParam(instanceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataSourceTasks"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + instanceId + "/data-source-tasks"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataSourceTasksResponse());
    }

    public ListDataSourcesResponse listDataSources(String instanceId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDataSourcesWithOptions(instanceId, headers, runtime);
    }

    public ListDataSourcesResponse listDataSourcesWithOptions(String instanceId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        instanceId = com.aliyun.openapiutil.Client.getEncodeParam(instanceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataSources"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + instanceId + "/data-sources"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataSourcesResponse());
    }

    public ListDatabaseDataVersionsResponse listDatabaseDataVersions(String instanceId, String database, String tableName) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDatabaseDataVersionsWithOptions(instanceId, database, tableName, headers, runtime);
    }

    public ListDatabaseDataVersionsResponse listDatabaseDataVersionsWithOptions(String instanceId, String database, String tableName, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        instanceId = com.aliyun.openapiutil.Client.getEncodeParam(instanceId);
        database = com.aliyun.openapiutil.Client.getEncodeParam(database);
        tableName = com.aliyun.openapiutil.Client.getEncodeParam(tableName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDatabaseDataVersions"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + instanceId + "/sql-studio/databases/" + database + "/tables/" + tableName + "/data-version"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDatabaseDataVersionsResponse());
    }

    public ListDatabasesResponse listDatabases(String instanceId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDatabasesWithOptions(instanceId, headers, runtime);
    }

    public ListDatabasesResponse listDatabasesWithOptions(String instanceId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        instanceId = com.aliyun.openapiutil.Client.getEncodeParam(instanceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDatabases"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + instanceId + "/sql-studio/databases"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDatabasesResponse());
    }

    public ListIndexesResponse listIndexes(String instanceId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listIndexesWithOptions(instanceId, headers, runtime);
    }

    public ListIndexesResponse listIndexesWithOptions(String instanceId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        instanceId = com.aliyun.openapiutil.Client.getEncodeParam(instanceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListIndexes"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + instanceId + "/indexes"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListIndexesResponse());
    }

    public ListInstanceSpecsResponse listInstanceSpecs(String instanceId, ListInstanceSpecsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listInstanceSpecsWithOptions(instanceId, request, headers, runtime);
    }

    public ListInstanceSpecsResponse listInstanceSpecsWithOptions(String instanceId, ListInstanceSpecsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        instanceId = com.aliyun.openapiutil.Client.getEncodeParam(instanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInstanceSpecs"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + instanceId + "/specs"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInstanceSpecsResponse());
    }

    public ListInstancesResponse listInstances(ListInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listInstancesWithOptions(request, headers, runtime);
    }

    public ListInstancesResponse listInstancesWithOptions(ListInstancesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("instanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("resourceGroupId", request.resourceGroupId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInstances"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInstancesResponse());
    }

    public ListOnlineConfigsResponse listOnlineConfigs(String instanceId, String nodeName, ListOnlineConfigsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listOnlineConfigsWithOptions(instanceId, nodeName, request, headers, runtime);
    }

    public ListOnlineConfigsResponse listOnlineConfigsWithOptions(String instanceId, String nodeName, ListOnlineConfigsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        instanceId = com.aliyun.openapiutil.Client.getEncodeParam(instanceId);
        nodeName = com.aliyun.openapiutil.Client.getEncodeParam(nodeName);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("domain", request.domain);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListOnlineConfigs"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + instanceId + "/node/" + nodeName + "/online-configs"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListOnlineConfigsResponse());
    }

    public ListQueryResultResponse listQueryResult(String instanceId, ListQueryResultRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listQueryResultWithOptions(instanceId, request, headers, runtime);
    }

    public ListQueryResultResponse listQueryResultWithOptions(String instanceId, ListQueryResultRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        instanceId = com.aliyun.openapiutil.Client.getEncodeParam(instanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            query.put("query", request.query);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sql)) {
            query.put("sql", request.sql);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListQueryResult"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + instanceId + "/query"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListQueryResultResponse());
    }

    public ModifyAdvanceConfigFileResponse modifyAdvanceConfigFile(String instanceId, String configName, ModifyAdvanceConfigFileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyAdvanceConfigFileWithOptions(instanceId, configName, request, headers, runtime);
    }

    public ModifyAdvanceConfigFileResponse modifyAdvanceConfigFileWithOptions(String instanceId, String configName, ModifyAdvanceConfigFileRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        instanceId = com.aliyun.openapiutil.Client.getEncodeParam(instanceId);
        configName = com.aliyun.openapiutil.Client.getEncodeParam(configName);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            query.put("fileName", request.fileName);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.body)) {
            body.put("body", request.body);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyAdvanceConfigFile"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + instanceId + "/advanced-configs/" + configName + "/file"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyAdvanceConfigFileResponse());
    }

    public ModifyClusterDescResponse modifyClusterDesc(String instanceId, String clusterName, ModifyClusterDescRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyClusterDescWithOptions(instanceId, clusterName, request, headers, runtime);
    }

    public ModifyClusterDescResponse modifyClusterDescWithOptions(String instanceId, String clusterName, ModifyClusterDescRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        instanceId = com.aliyun.openapiutil.Client.getEncodeParam(instanceId);
        clusterName = com.aliyun.openapiutil.Client.getEncodeParam(clusterName);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.body)) {
            body.put("body", request.body);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyClusterDesc"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + instanceId + "/clusters/" + clusterName + "/desc"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyClusterDescResponse());
    }

    public ModifyClusterOfflineConfigResponse modifyClusterOfflineConfig(String instanceId, ModifyClusterOfflineConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyClusterOfflineConfigWithOptions(instanceId, request, headers, runtime);
    }

    public ModifyClusterOfflineConfigResponse modifyClusterOfflineConfigWithOptions(String instanceId, ModifyClusterOfflineConfigRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        instanceId = com.aliyun.openapiutil.Client.getEncodeParam(instanceId);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.body)) {
            body.put("body", request.body);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyClusterOfflineConfig"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + instanceId + "/cluster-offline-config"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyClusterOfflineConfigResponse());
    }

    public ModifyClusterOnlineConfigResponse modifyClusterOnlineConfig(String instanceId, ModifyClusterOnlineConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyClusterOnlineConfigWithOptions(instanceId, request, headers, runtime);
    }

    public ModifyClusterOnlineConfigResponse modifyClusterOnlineConfigWithOptions(String instanceId, ModifyClusterOnlineConfigRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        instanceId = com.aliyun.openapiutil.Client.getEncodeParam(instanceId);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.advancedConfigVersionId)) {
            body.put("advancedConfigVersionId", request.advancedConfigVersionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusters)) {
            body.put("clusters", request.clusters);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyClusterOnlineConfig"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + instanceId + "/cluster-online-config"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyClusterOnlineConfigResponse());
    }

    public ModifyDataSourceResponse modifyDataSource(String instanceId, String dataSourceName, ModifyDataSourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyDataSourceWithOptions(instanceId, dataSourceName, request, headers, runtime);
    }

    public ModifyDataSourceResponse modifyDataSourceWithOptions(String instanceId, String dataSourceName, ModifyDataSourceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        instanceId = com.aliyun.openapiutil.Client.getEncodeParam(instanceId);
        dataSourceName = com.aliyun.openapiutil.Client.getEncodeParam(dataSourceName);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("dryRun", request.dryRun);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.body)) {
            body.put("body", request.body);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDataSource"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + instanceId + "/data-sources/" + dataSourceName + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDataSourceResponse());
    }

    public ModifyFileResponse modifyFile(String instanceId, String indexName, String versionName, ModifyFileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyFileWithOptions(instanceId, indexName, versionName, request, headers, runtime);
    }

    public ModifyFileResponse modifyFileWithOptions(String instanceId, String indexName, String versionName, ModifyFileRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        instanceId = com.aliyun.openapiutil.Client.getEncodeParam(instanceId);
        indexName = com.aliyun.openapiutil.Client.getEncodeParam(indexName);
        versionName = com.aliyun.openapiutil.Client.getEncodeParam(versionName);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            query.put("fileName", request.fileName);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.body)) {
            body.put("body", request.body);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyFile"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + instanceId + "/indexes/" + indexName + "/versions/" + versionName + "/file"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyFileResponse());
    }

    public ModifyIndexVersionResponse modifyIndexVersion(String instanceId, String clusterName, ModifyIndexVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyIndexVersionWithOptions(instanceId, clusterName, request, headers, runtime);
    }

    public ModifyIndexVersionResponse modifyIndexVersionWithOptions(String instanceId, String clusterName, ModifyIndexVersionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        instanceId = com.aliyun.openapiutil.Client.getEncodeParam(instanceId);
        clusterName = com.aliyun.openapiutil.Client.getEncodeParam(clusterName);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.body)) {
            body.put("body", request.body);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyIndexVersion"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + instanceId + "/clusters/" + clusterName + "/index-version"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyIndexVersionResponse());
    }

    public ModifyNodeConfigResponse modifyNodeConfig(String instanceId, ModifyNodeConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyNodeConfigWithOptions(instanceId, request, headers, runtime);
    }

    public ModifyNodeConfigResponse modifyNodeConfigWithOptions(String instanceId, ModifyNodeConfigRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        instanceId = com.aliyun.openapiutil.Client.getEncodeParam(instanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterName)) {
            query.put("clusterName", request.clusterName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceName)) {
            query.put("dataSourceName", request.dataSourceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableDeployId)) {
            query.put("tableDeployId", request.tableDeployId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.body)) {
            body.put("body", request.body);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyNodeConfig"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + instanceId + "/node-config"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyNodeConfigResponse());
    }

    public ModifyOnlineConfigResponse modifyOnlineConfig(String instanceId, String nodeName, String indexName, ModifyOnlineConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyOnlineConfigWithOptions(instanceId, nodeName, indexName, request, headers, runtime);
    }

    public ModifyOnlineConfigResponse modifyOnlineConfigWithOptions(String instanceId, String nodeName, String indexName, ModifyOnlineConfigRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        instanceId = com.aliyun.openapiutil.Client.getEncodeParam(instanceId);
        nodeName = com.aliyun.openapiutil.Client.getEncodeParam(nodeName);
        indexName = com.aliyun.openapiutil.Client.getEncodeParam(indexName);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.body)) {
            body.put("body", request.body);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyOnlineConfig"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + instanceId + "/node/" + nodeName + "/online-configs/" + indexName + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyOnlineConfigResponse());
    }

    public ModifyPasswordResponse modifyPassword(String instanceId, ModifyPasswordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyPasswordWithOptions(instanceId, request, headers, runtime);
    }

    public ModifyPasswordResponse modifyPasswordWithOptions(String instanceId, ModifyPasswordRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        instanceId = com.aliyun.openapiutil.Client.getEncodeParam(instanceId);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.body)) {
            body.put("body", request.body);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyPassword"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + instanceId + "/password"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyPasswordResponse());
    }

    public PublishAdvanceConfigResponse publishAdvanceConfig(String instanceId, String configName, PublishAdvanceConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.publishAdvanceConfigWithOptions(instanceId, configName, request, headers, runtime);
    }

    public PublishAdvanceConfigResponse publishAdvanceConfigWithOptions(String instanceId, String configName, PublishAdvanceConfigRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        instanceId = com.aliyun.openapiutil.Client.getEncodeParam(instanceId);
        configName = com.aliyun.openapiutil.Client.getEncodeParam(configName);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.body)) {
            body.put("body", request.body);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PublishAdvanceConfig"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + instanceId + "/advanced-configs/" + configName + "/actions/publish"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PublishAdvanceConfigResponse());
    }

    public PublishIndexVersionResponse publishIndexVersion(String instanceId, String indexName, PublishIndexVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.publishIndexVersionWithOptions(instanceId, indexName, request, headers, runtime);
    }

    public PublishIndexVersionResponse publishIndexVersionWithOptions(String instanceId, String indexName, PublishIndexVersionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        instanceId = com.aliyun.openapiutil.Client.getEncodeParam(instanceId);
        indexName = com.aliyun.openapiutil.Client.getEncodeParam(indexName);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.body)) {
            body.put("body", request.body);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PublishIndexVersion"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + instanceId + "/indexes/" + indexName + "/actions/publish"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PublishIndexVersionResponse());
    }

    public RemoveClusterResponse removeCluster(String instanceId, String clusterName) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeClusterWithOptions(instanceId, clusterName, headers, runtime);
    }

    public RemoveClusterResponse removeClusterWithOptions(String instanceId, String clusterName, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        instanceId = com.aliyun.openapiutil.Client.getEncodeParam(instanceId);
        clusterName = com.aliyun.openapiutil.Client.getEncodeParam(clusterName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveCluster"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + instanceId + "/clusters/" + clusterName + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveClusterResponse());
    }

    public RenameFolderResponse renameFolder(String instanceId, String database, String folderId, RenameFolderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.renameFolderWithOptions(instanceId, database, folderId, request, headers, runtime);
    }

    public RenameFolderResponse renameFolderWithOptions(String instanceId, String database, String folderId, RenameFolderRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        instanceId = com.aliyun.openapiutil.Client.getEncodeParam(instanceId);
        database = com.aliyun.openapiutil.Client.getEncodeParam(database);
        folderId = com.aliyun.openapiutil.Client.getEncodeParam(folderId);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RenameFolder"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + instanceId + "/sql-studio/databases/" + database + "/folders/" + folderId + "/name"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RenameFolderResponse());
    }

    public StopTaskResponse stopTask(String instanceId, String fsmId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopTaskWithOptions(instanceId, fsmId, headers, runtime);
    }

    public StopTaskResponse stopTaskWithOptions(String instanceId, String fsmId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        instanceId = com.aliyun.openapiutil.Client.getEncodeParam(instanceId);
        fsmId = com.aliyun.openapiutil.Client.getEncodeParam(fsmId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopTask"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + instanceId + "/stop-task/" + fsmId + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopTaskResponse());
    }

    public UpdateInstanceResponse updateInstance(String instanceId, UpdateInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateInstanceWithOptions(instanceId, request, headers, runtime);
    }

    public UpdateInstanceResponse updateInstanceWithOptions(String instanceId, UpdateInstanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        instanceId = com.aliyun.openapiutil.Client.getEncodeParam(instanceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", request.body)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateInstance"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + instanceId + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateInstanceResponse());
    }

    public UpdateSqlInstanceContentResponse updateSqlInstanceContent(String instanceId, String database, String sqlInstanceId, UpdateSqlInstanceContentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSqlInstanceContentWithOptions(instanceId, database, sqlInstanceId, request, headers, runtime);
    }

    public UpdateSqlInstanceContentResponse updateSqlInstanceContentWithOptions(String instanceId, String database, String sqlInstanceId, UpdateSqlInstanceContentRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        instanceId = com.aliyun.openapiutil.Client.getEncodeParam(instanceId);
        database = com.aliyun.openapiutil.Client.getEncodeParam(database);
        sqlInstanceId = com.aliyun.openapiutil.Client.getEncodeParam(sqlInstanceId);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("content", request.content);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSqlInstanceContent"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + instanceId + "/sql-studio/databases/" + database + "/sql-instances/" + sqlInstanceId + "/content"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSqlInstanceContentResponse());
    }

    public UpdateSqlInstanceNameResponse updateSqlInstanceName(String instanceId, String database, String sqlInstanceId, UpdateSqlInstanceNameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSqlInstanceNameWithOptions(instanceId, database, sqlInstanceId, request, headers, runtime);
    }

    public UpdateSqlInstanceNameResponse updateSqlInstanceNameWithOptions(String instanceId, String database, String sqlInstanceId, UpdateSqlInstanceNameRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        instanceId = com.aliyun.openapiutil.Client.getEncodeParam(instanceId);
        database = com.aliyun.openapiutil.Client.getEncodeParam(database);
        sqlInstanceId = com.aliyun.openapiutil.Client.getEncodeParam(sqlInstanceId);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSqlInstanceName"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + instanceId + "/sql-studio/databases/" + database + "/sql-instances/" + sqlInstanceId + "/name"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSqlInstanceNameResponse());
    }

    public UpdateSqlInstanceParamsResponse updateSqlInstanceParams(String instanceId, String database, String sqlInstanceId, UpdateSqlInstanceParamsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSqlInstanceParamsWithOptions(instanceId, database, sqlInstanceId, request, headers, runtime);
    }

    public UpdateSqlInstanceParamsResponse updateSqlInstanceParamsWithOptions(String instanceId, String database, String sqlInstanceId, UpdateSqlInstanceParamsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        instanceId = com.aliyun.openapiutil.Client.getEncodeParam(instanceId);
        database = com.aliyun.openapiutil.Client.getEncodeParam(database);
        sqlInstanceId = com.aliyun.openapiutil.Client.getEncodeParam(sqlInstanceId);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.combineParam)) {
            body.put("combineParam", request.combineParam);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dynamicParam)) {
            body.put("dynamicParam", request.dynamicParam);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.kvpair)) {
            body.put("kvpair", request.kvpair);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            body.put("params", request.params);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.staticParam)) {
            body.put("staticParam", request.staticParam);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSqlInstanceParams"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + instanceId + "/sql-studio/databases/" + database + "/sql-instances/" + sqlInstanceId + "/params"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSqlInstanceParamsResponse());
    }
}
