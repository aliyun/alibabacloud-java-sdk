// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025;

import com.aliyun.tea.*;
import com.aliyun.searchengine20211025.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
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

    /**
      * ## Method
      *     POST
      * ## URI
      *     /openapi/ha3/instances/{instanceId}/actions/build-index
      *
      * @param request BuildIndexRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return BuildIndexResponse
     */
    public BuildIndexResponse buildIndexWithOptions(String instanceId, BuildIndexRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.buildMode)) {
            body.put("buildMode", request.buildMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceName)) {
            body.put("dataSourceName", request.dataSourceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceType)) {
            body.put("dataSourceType", request.dataSourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataTimeSec)) {
            body.put("dataTimeSec", request.dataTimeSec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            body.put("domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.generation)) {
            body.put("generation", request.generation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.partition)) {
            body.put("partition", request.partition);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BuildIndex"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/actions/build-index"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BuildIndexResponse());
    }

    /**
      * ## Method
      *     POST
      * ## URI
      *     /openapi/ha3/instances/{instanceId}/actions/build-index
      *
      * @param request BuildIndexRequest
      * @return BuildIndexResponse
     */
    public BuildIndexResponse buildIndex(String instanceId, BuildIndexRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.buildIndexWithOptions(instanceId, request, headers, runtime);
    }

    /**
      * ### Method
      * `POST`
      * ### URI
      * `/openapi/ha3/instances/{instanceId}/clusters`
      *
      * @param request CreateClusterRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return CreateClusterResponse
     */
    public CreateClusterResponse createClusterWithOptions(String instanceId, CreateClusterRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoLoad)) {
            body.put("autoLoad", request.autoLoad);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataNode)) {
            body.put("dataNode", request.dataNode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryNode)) {
            body.put("queryNode", request.queryNode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCluster"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/clusters"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateClusterResponse());
    }

    /**
      * ### Method
      * `POST`
      * ### URI
      * `/openapi/ha3/instances/{instanceId}/clusters`
      *
      * @param request CreateClusterRequest
      * @return CreateClusterResponse
     */
    public CreateClusterResponse createCluster(String instanceId, CreateClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createClusterWithOptions(instanceId, request, headers, runtime);
    }

    /**
      * The result returned
      *
      * @param request CreateDataSourceRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return CreateDataSourceResponse
     */
    public CreateDataSourceResponse createDataSourceWithOptions(String instanceId, CreateDataSourceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("dryRun", request.dryRun);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoBuildIndex)) {
            body.put("autoBuildIndex", request.autoBuildIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.config)) {
            body.put("config", request.config);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            body.put("domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.saroConfig)) {
            body.put("saroConfig", request.saroConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDataSource"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/data-sources"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDataSourceResponse());
    }

    /**
      * The result returned
      *
      * @param request CreateDataSourceRequest
      * @return CreateDataSourceResponse
     */
    public CreateDataSourceResponse createDataSource(String instanceId, CreateDataSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDataSourceWithOptions(instanceId, request, headers, runtime);
    }

    /**
      * ### Method
      * ```java
      * POST
      * ```
      * ### URI
      * ```java
      * /openapi/ha3/instances/{instanceId}/indexes
      * ```
      *
      * @param request CreateIndexRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return CreateIndexResponse
     */
    public CreateIndexResponse createIndexWithOptions(String instanceId, CreateIndexRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("dryRun", request.dryRun);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSource)) {
            body.put("dataSource", request.dataSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceInfo)) {
            body.put("dataSourceInfo", request.dataSourceInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            body.put("domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extend)) {
            body.put("extend", request.extend);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.partition)) {
            body.put("partition", request.partition);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateIndex"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/indexes"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateIndexResponse());
    }

    /**
      * ### Method
      * ```java
      * POST
      * ```
      * ### URI
      * ```java
      * /openapi/ha3/instances/{instanceId}/indexes
      * ```
      *
      * @param request CreateIndexRequest
      * @return CreateIndexResponse
     */
    public CreateIndexResponse createIndex(String instanceId, CreateIndexRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createIndexWithOptions(instanceId, request, headers, runtime);
    }

    /**
      * ### Method
      * `POST`
      * ### URI
      * `/api/instances?dryRun=false`
      *
      * @param request CreateInstanceRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return CreateInstanceResponse
     */
    public CreateInstanceResponse createInstanceWithOptions(CreateInstanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.chargeType)) {
            body.put("chargeType", request.chargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.components)) {
            body.put("components", request.components);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            body.put("order", request.order);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * ### Method
      * `POST`
      * ### URI
      * `/api/instances?dryRun=false`
      *
      * @param request CreateInstanceRequest
      * @return CreateInstanceResponse
     */
    public CreateInstanceResponse createInstance(CreateInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createInstanceWithOptions(request, headers, runtime);
    }

    /**
      * ## Method
      *     DELETE
      * ## URI
      *     /openapi/ha3/instances/{instanceId}/advanced-configs/{configName}
      *
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return DeleteAdvanceConfigResponse
     */
    public DeleteAdvanceConfigResponse deleteAdvanceConfigWithOptions(String instanceId, String configName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAdvanceConfig"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/advanced-configs/" + com.aliyun.openapiutil.Client.getEncodeParam(configName) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAdvanceConfigResponse());
    }

    /**
      * ## Method
      *     DELETE
      * ## URI
      *     /openapi/ha3/instances/{instanceId}/advanced-configs/{configName}
      *
      * @return DeleteAdvanceConfigResponse
     */
    public DeleteAdvanceConfigResponse deleteAdvanceConfig(String instanceId, String configName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteAdvanceConfigWithOptions(instanceId, configName, headers, runtime);
    }

    /**
      * ## Method
      * `DELETE`
      * ## URI
      * `/openapi/ha3/instances/{instanceId}/data-sources/{dataSourceName}`
      *
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return DeleteDataSourceResponse
     */
    public DeleteDataSourceResponse deleteDataSourceWithOptions(String instanceId, String dataSourceName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDataSource"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/data-sources/" + com.aliyun.openapiutil.Client.getEncodeParam(dataSourceName) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDataSourceResponse());
    }

    /**
      * ## Method
      * `DELETE`
      * ## URI
      * `/openapi/ha3/instances/{instanceId}/data-sources/{dataSourceName}`
      *
      * @return DeleteDataSourceResponse
     */
    public DeleteDataSourceResponse deleteDataSource(String instanceId, String dataSourceName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteDataSourceWithOptions(instanceId, dataSourceName, headers, runtime);
    }

    /**
      * The information about the index
      *
      * @param request DeleteIndexRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return DeleteIndexResponse
     */
    public DeleteIndexResponse deleteIndexWithOptions(String instanceId, String indexName, DeleteIndexRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataSource)) {
            query.put("dataSource", request.dataSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deleteDataSource)) {
            query.put("deleteDataSource", request.deleteDataSource);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteIndex"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/indexes/" + com.aliyun.openapiutil.Client.getEncodeParam(indexName) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteIndexResponse());
    }

    /**
      * The information about the index
      *
      * @param request DeleteIndexRequest
      * @return DeleteIndexResponse
     */
    public DeleteIndexResponse deleteIndex(String instanceId, String indexName, DeleteIndexRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteIndexWithOptions(instanceId, indexName, request, headers, runtime);
    }

    /**
      * The result
      *
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return DeleteIndexVersionResponse
     */
    public DeleteIndexVersionResponse deleteIndexVersionWithOptions(String instanceId, String indexName, String versionName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteIndexVersion"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/indexes/" + com.aliyun.openapiutil.Client.getEncodeParam(indexName) + "/versions/" + com.aliyun.openapiutil.Client.getEncodeParam(versionName) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteIndexVersionResponse());
    }

    /**
      * The result
      *
      * @return DeleteIndexVersionResponse
     */
    public DeleteIndexVersionResponse deleteIndexVersion(String instanceId, String indexName, String versionName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteIndexVersionWithOptions(instanceId, indexName, versionName, headers, runtime);
    }

    /**
      * The result returned
      *
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return DeleteInstanceResponse
     */
    public DeleteInstanceResponse deleteInstanceWithOptions(String instanceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteInstance"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteInstanceResponse());
    }

    /**
      * The result returned
      *
      * @return DeleteInstanceResponse
     */
    public DeleteInstanceResponse deleteInstance(String instanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteInstanceWithOptions(instanceId, headers, runtime);
    }

    /**
      * \\### Method
      * ```java
      * PUT
      * ```
      * ### URI
      * ```java
      * /openapi/ha3/instances/{instanceId}/force-switch/{fsmId}
      * ```
      *
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return ForceSwitchResponse
     */
    public ForceSwitchResponse forceSwitchWithOptions(String instanceId, String fsmId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ForceSwitch"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/force-switch/" + com.aliyun.openapiutil.Client.getEncodeParam(fsmId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ForceSwitchResponse());
    }

    /**
      * \\### Method
      * ```java
      * PUT
      * ```
      * ### URI
      * ```java
      * /openapi/ha3/instances/{instanceId}/force-switch/{fsmId}
      * ```
      *
      * @return ForceSwitchResponse
     */
    public ForceSwitchResponse forceSwitch(String instanceId, String fsmId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.forceSwitchWithOptions(instanceId, fsmId, headers, runtime);
    }

    /**
      * ## Method
      *     GET
      * ## URI
      *     /openapi/ha3/instances/{instanceId}/advanced-configs/{configName}
      *
      * @param request GetAdvanceConfigRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetAdvanceConfigResponse
     */
    public GetAdvanceConfigResponse getAdvanceConfigWithOptions(String instanceId, String configName, GetAdvanceConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAdvanceConfig"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/advanced-configs/" + com.aliyun.openapiutil.Client.getEncodeParam(configName) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAdvanceConfigResponse());
    }

    /**
      * ## Method
      *     GET
      * ## URI
      *     /openapi/ha3/instances/{instanceId}/advanced-configs/{configName}
      *
      * @param request GetAdvanceConfigRequest
      * @return GetAdvanceConfigResponse
     */
    public GetAdvanceConfigResponse getAdvanceConfig(String instanceId, String configName, GetAdvanceConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAdvanceConfigWithOptions(instanceId, configName, request, headers, runtime);
    }

    public GetAdvanceConfigFileResponse getAdvanceConfigFileWithOptions(String instanceId, String configName, GetAdvanceConfigFileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            query.put("fileName", request.fileName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAdvanceConfigFile"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/advanced-configs/" + com.aliyun.openapiutil.Client.getEncodeParam(configName) + "/file"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAdvanceConfigFileResponse());
    }

    public GetAdvanceConfigFileResponse getAdvanceConfigFile(String instanceId, String configName, GetAdvanceConfigFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAdvanceConfigFileWithOptions(instanceId, configName, request, headers, runtime);
    }

    /**
      * ### Method
      * `GET`
      * ### URI
      * `/openapi/ha3/instance/{instanceId}/clusters/{clusterName}`
      *
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetClusterResponse
     */
    public GetClusterResponse getClusterWithOptions(String instanceId, String clusterName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCluster"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(clusterName) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetClusterResponse());
    }

    /**
      * ### Method
      * `GET`
      * ### URI
      * `/openapi/ha3/instance/{instanceId}/clusters/{clusterName}`
      *
      * @return GetClusterResponse
     */
    public GetClusterResponse getCluster(String instanceId, String clusterName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getClusterWithOptions(instanceId, clusterName, headers, runtime);
    }

    public GetClusterRunTimeInfoResponse getClusterRunTimeInfoWithOptions(String instanceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetClusterRunTimeInfo"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/cluster-run-time-info"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetClusterRunTimeInfoResponse());
    }

    public GetClusterRunTimeInfoResponse getClusterRunTimeInfo(String instanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getClusterRunTimeInfoWithOptions(instanceId, headers, runtime);
    }

    public GetDataSourceResponse getDataSourceWithOptions(String instanceId, String dataSourceName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDataSource"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/data-sources/" + com.aliyun.openapiutil.Client.getEncodeParam(dataSourceName) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDataSourceResponse());
    }

    public GetDataSourceResponse getDataSource(String instanceId, String dataSourceName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDataSourceWithOptions(instanceId, dataSourceName, headers, runtime);
    }

    public GetDataSourceDeployResponse getDataSourceDeployWithOptions(String instanceId, String deployName, String dataSourceName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDataSourceDeploy"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/data-sources/" + com.aliyun.openapiutil.Client.getEncodeParam(dataSourceName) + "/deploys/" + com.aliyun.openapiutil.Client.getEncodeParam(deployName) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDataSourceDeployResponse());
    }

    public GetDataSourceDeployResponse getDataSourceDeploy(String instanceId, String deployName, String dataSourceName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDataSourceDeployWithOptions(instanceId, deployName, dataSourceName, headers, runtime);
    }

    /**
      * ### Sample requests
      * ```java
      * GET /openapi/ha3/instances/{instanceId}/deploy-graph
      * ```
      *
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetDeployGraphResponse
     */
    public GetDeployGraphResponse getDeployGraphWithOptions(String instanceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDeployGraph"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/deploy-graph"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDeployGraphResponse());
    }

    /**
      * ### Sample requests
      * ```java
      * GET /openapi/ha3/instances/{instanceId}/deploy-graph
      * ```
      *
      * @return GetDeployGraphResponse
     */
    public GetDeployGraphResponse getDeployGraph(String instanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDeployGraphWithOptions(instanceId, headers, runtime);
    }

    public GetFileResponse getFileWithOptions(String instanceId, String indexName, String versionName, GetFileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            query.put("fileName", request.fileName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFile"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/indexes/" + com.aliyun.openapiutil.Client.getEncodeParam(indexName) + "/versions/" + com.aliyun.openapiutil.Client.getEncodeParam(versionName) + "/file"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFileResponse());
    }

    public GetFileResponse getFile(String instanceId, String indexName, String versionName, GetFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getFileWithOptions(instanceId, indexName, versionName, request, headers, runtime);
    }

    public GetIndexResponse getIndexWithOptions(String instanceId, String indexName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetIndex"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/indexes/" + com.aliyun.openapiutil.Client.getEncodeParam(indexName) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetIndexResponse());
    }

    public GetIndexResponse getIndex(String instanceId, String indexName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getIndexWithOptions(instanceId, indexName, headers, runtime);
    }

    /**
      * ## Examples
      * Sample requests
      *     GET  /openapi/ha3/instances/ha3_instance_id_1/clusters/cluster1/index-version
      *
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetIndexVersionResponse
     */
    public GetIndexVersionResponse getIndexVersionWithOptions(String instanceId, String clusterName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetIndexVersion"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(clusterName) + "/index-version"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetIndexVersionResponse());
    }

    /**
      * ## Examples
      * Sample requests
      *     GET  /openapi/ha3/instances/ha3_instance_id_1/clusters/cluster1/index-version
      *
      * @return GetIndexVersionResponse
     */
    public GetIndexVersionResponse getIndexVersion(String instanceId, String clusterName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getIndexVersionWithOptions(instanceId, clusterName, headers, runtime);
    }

    /**
      * The billing method.
      *
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetInstanceResponse
     */
    public GetInstanceResponse getInstanceWithOptions(String instanceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstance"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceResponse());
    }

    /**
      * The billing method.
      *
      * @return GetInstanceResponse
     */
    public GetInstanceResponse getInstance(String instanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getInstanceWithOptions(instanceId, headers, runtime);
    }

    public GetNodeConfigResponse getNodeConfigWithOptions(String instanceId, GetNodeConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterName)) {
            query.put("clusterName", request.clusterName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetNodeConfig"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/node-config"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetNodeConfigResponse());
    }

    public GetNodeConfigResponse getNodeConfig(String instanceId, GetNodeConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getNodeConfigWithOptions(instanceId, request, headers, runtime);
    }

    /**
      * ## Sample requests
      * `GET /openapi/ha3/instances/ose-test1/advanced-configs`
      *
      * @param request ListAdvanceConfigDirRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListAdvanceConfigDirResponse
     */
    public ListAdvanceConfigDirResponse listAdvanceConfigDirWithOptions(String instanceId, String configName, ListAdvanceConfigDirRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dirName)) {
            query.put("dirName", request.dirName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAdvanceConfigDir"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/advanced-configs/" + com.aliyun.openapiutil.Client.getEncodeParam(configName) + "/dir"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAdvanceConfigDirResponse());
    }

    /**
      * ## Sample requests
      * `GET /openapi/ha3/instances/ose-test1/advanced-configs`
      *
      * @param request ListAdvanceConfigDirRequest
      * @return ListAdvanceConfigDirResponse
     */
    public ListAdvanceConfigDirResponse listAdvanceConfigDir(String instanceId, String configName, ListAdvanceConfigDirRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAdvanceConfigDirWithOptions(instanceId, configName, request, headers, runtime);
    }

    /**
      * http
      *
      * @param request ListAdvanceConfigsRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListAdvanceConfigsResponse
     */
    public ListAdvanceConfigsResponse listAdvanceConfigsWithOptions(String instanceId, ListAdvanceConfigsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceName)) {
            query.put("dataSourceName", request.dataSourceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.indexName)) {
            query.put("indexName", request.indexName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAdvanceConfigs"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/advanced-configs"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAdvanceConfigsResponse());
    }

    /**
      * http
      *
      * @param request ListAdvanceConfigsRequest
      * @return ListAdvanceConfigsResponse
     */
    public ListAdvanceConfigsResponse listAdvanceConfigs(String instanceId, ListAdvanceConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAdvanceConfigsWithOptions(instanceId, request, headers, runtime);
    }

    /**
      * ### Sample requests
      * ```java
      * GET /openapi/ha3/instances/ha3_instance_name/cluster-names
      * ```
      *
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListClusterNamesResponse
     */
    public ListClusterNamesResponse listClusterNamesWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListClusterNames"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/cluster-names"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListClusterNamesResponse());
    }

    /**
      * ### Sample requests
      * ```java
      * GET /openapi/ha3/instances/ha3_instance_name/cluster-names
      * ```
      *
      * @return ListClusterNamesResponse
     */
    public ListClusterNamesResponse listClusterNames() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listClusterNamesWithOptions(headers, runtime);
    }

    public ListClusterTasksResponse listClusterTasksWithOptions(String instanceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListClusterTasks"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/cluster-tasks"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListClusterTasksResponse());
    }

    public ListClusterTasksResponse listClusterTasks(String instanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listClusterTasksWithOptions(instanceId, headers, runtime);
    }

    /**
      * http
      *
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListClustersResponse
     */
    public ListClustersResponse listClustersWithOptions(String instanceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListClusters"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/clusters"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListClustersResponse());
    }

    /**
      * http
      *
      * @return ListClustersResponse
     */
    public ListClustersResponse listClusters(String instanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listClustersWithOptions(instanceId, headers, runtime);
    }

    /**
      * Obtains the schema information of a specified data source.
      *
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListDataSourceSchemasResponse
     */
    public ListDataSourceSchemasResponse listDataSourceSchemasWithOptions(String instanceId, String dataSourceName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataSourceSchemas"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/data-sources/" + com.aliyun.openapiutil.Client.getEncodeParam(dataSourceName) + "/schemas"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataSourceSchemasResponse());
    }

    /**
      * Obtains the schema information of a specified data source.
      *
      * @return ListDataSourceSchemasResponse
     */
    public ListDataSourceSchemasResponse listDataSourceSchemas(String instanceId, String dataSourceName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDataSourceSchemasWithOptions(instanceId, dataSourceName, headers, runtime);
    }

    public ListDataSourceTasksResponse listDataSourceTasksWithOptions(String instanceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataSourceTasks"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/data-source-tasks"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataSourceTasksResponse());
    }

    public ListDataSourceTasksResponse listDataSourceTasks(String instanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDataSourceTasksWithOptions(instanceId, headers, runtime);
    }

    public ListDataSourcesResponse listDataSourcesWithOptions(String instanceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataSources"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/data-sources"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataSourcesResponse());
    }

    public ListDataSourcesResponse listDataSources(String instanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDataSourcesWithOptions(instanceId, headers, runtime);
    }

    /**
      * ### Method
      * `GET`
      * ### URI
      * `/openapi/ha3/instances/{instanceId}/data-sources/{dataSourceName}/generations?domainName={domainName}`
      *
      * @param request ListDateSourceGenerationsRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListDateSourceGenerationsResponse
     */
    public ListDateSourceGenerationsResponse listDateSourceGenerationsWithOptions(String instanceId, String dataSourceName, ListDateSourceGenerationsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("domainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.validStatus)) {
            query.put("validStatus", request.validStatus);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDateSourceGenerations"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/data-sources/" + com.aliyun.openapiutil.Client.getEncodeParam(dataSourceName) + "/generations"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDateSourceGenerationsResponse());
    }

    /**
      * ### Method
      * `GET`
      * ### URI
      * `/openapi/ha3/instances/{instanceId}/data-sources/{dataSourceName}/generations?domainName={domainName}`
      *
      * @param request ListDateSourceGenerationsRequest
      * @return ListDateSourceGenerationsResponse
     */
    public ListDateSourceGenerationsResponse listDateSourceGenerations(String instanceId, String dataSourceName, ListDateSourceGenerationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDateSourceGenerationsWithOptions(instanceId, dataSourceName, request, headers, runtime);
    }

    public ListIndexesResponse listIndexesWithOptions(String instanceId, ListIndexesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.newMode)) {
            query.put("newMode", request.newMode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListIndexes"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/indexes"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListIndexesResponse());
    }

    public ListIndexesResponse listIndexes(String instanceId, ListIndexesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listIndexesWithOptions(instanceId, request, headers, runtime);
    }

    /**
      * ### Method
      * `GET`
      * ### URI
      * `/openapi/ha3/instances/{instanceId}/specs?type=qrs`
      *
      * @param request ListInstanceSpecsRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListInstanceSpecsResponse
     */
    public ListInstanceSpecsResponse listInstanceSpecsWithOptions(String instanceId, ListInstanceSpecsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInstanceSpecs"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/specs"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInstanceSpecsResponse());
    }

    /**
      * ### Method
      * `GET`
      * ### URI
      * `/openapi/ha3/instances/{instanceId}/specs?type=qrs`
      *
      * @param request ListInstanceSpecsRequest
      * @return ListInstanceSpecsResponse
     */
    public ListInstanceSpecsResponse listInstanceSpecs(String instanceId, ListInstanceSpecsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listInstanceSpecsWithOptions(instanceId, request, headers, runtime);
    }

    /**
      * Indicates whether an overdue payment is involved
      *
      * @param tmpReq ListInstancesRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListInstancesResponse
     */
    public ListInstancesResponse listInstancesWithOptions(ListInstancesRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListInstancesShrinkRequest request = new ListInstancesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "tags", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.edition)) {
            query.put("edition", request.edition);
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

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            query.put("tags", request.tagsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * Indicates whether an overdue payment is involved
      *
      * @param request ListInstancesRequest
      * @return ListInstancesResponse
     */
    public ListInstancesResponse listInstances(ListInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listInstancesWithOptions(request, headers, runtime);
    }

    /**
      * \\### Sample requests
      * ```java
      * GET  /openapi/ha3/instances/ha-test1/node/ihome_searcher/online-configs?domain=pre_ea120
      * ```
      *
      * @param request ListOnlineConfigsRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListOnlineConfigsResponse
     */
    public ListOnlineConfigsResponse listOnlineConfigsWithOptions(String instanceId, String nodeName, ListOnlineConfigsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("domain", request.domain);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListOnlineConfigs"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/node/" + com.aliyun.openapiutil.Client.getEncodeParam(nodeName) + "/online-configs"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListOnlineConfigsResponse());
    }

    /**
      * \\### Sample requests
      * ```java
      * GET  /openapi/ha3/instances/ha-test1/node/ihome_searcher/online-configs?domain=pre_ea120
      * ```
      *
      * @param request ListOnlineConfigsRequest
      * @return ListOnlineConfigsResponse
     */
    public ListOnlineConfigsResponse listOnlineConfigs(String instanceId, String nodeName, ListOnlineConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listOnlineConfigsWithOptions(instanceId, nodeName, request, headers, runtime);
    }

    /**
      * The ID of the instance
      *
      * @param request ListQueryResultRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListQueryResultResponse
     */
    public ListQueryResultResponse listQueryResultWithOptions(String instanceId, ListQueryResultRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            query.put("query", request.query);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sql)) {
            query.put("sql", request.sql);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListQueryResult"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/query"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListQueryResultResponse());
    }

    /**
      * The ID of the instance
      *
      * @param request ListQueryResultRequest
      * @return ListQueryResultResponse
     */
    public ListQueryResultResponse listQueryResult(String instanceId, ListQueryResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listQueryResultWithOptions(instanceId, request, headers, runtime);
    }

    /**
      * ## Method
      *     put
      * ## URI
      *     /openapi/ha3/instances/{instanceId}/advanced-configs/{configName}/file?fileName={fileName}
      *
      * @param request ModifyAdvanceConfigFileRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return ModifyAdvanceConfigFileResponse
     */
    public ModifyAdvanceConfigFileResponse modifyAdvanceConfigFileWithOptions(String instanceId, String configName, ModifyAdvanceConfigFileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            query.put("fileName", request.fileName);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.variables)) {
            body.put("variables", request.variables);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyAdvanceConfigFile"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/advanced-configs/" + com.aliyun.openapiutil.Client.getEncodeParam(configName) + "/file"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyAdvanceConfigFileResponse());
    }

    /**
      * ## Method
      *     put
      * ## URI
      *     /openapi/ha3/instances/{instanceId}/advanced-configs/{configName}/file?fileName={fileName}
      *
      * @param request ModifyAdvanceConfigFileRequest
      * @return ModifyAdvanceConfigFileResponse
     */
    public ModifyAdvanceConfigFileResponse modifyAdvanceConfigFile(String instanceId, String configName, ModifyAdvanceConfigFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyAdvanceConfigFileWithOptions(instanceId, configName, request, headers, runtime);
    }

    /**
      * ### Method
      * `PUT`
      * ### URI
      * `/openapi/ha3/instances/{instanceId}/clusters/{clusterName}/desc`
      *
      * @param request ModifyClusterDescRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return ModifyClusterDescResponse
     */
    public ModifyClusterDescResponse modifyClusterDescWithOptions(String instanceId, String clusterName, ModifyClusterDescRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.body)) {
            body.put("body", request.body);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyClusterDesc"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(clusterName) + "/desc"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyClusterDescResponse());
    }

    /**
      * ### Method
      * `PUT`
      * ### URI
      * `/openapi/ha3/instances/{instanceId}/clusters/{clusterName}/desc`
      *
      * @param request ModifyClusterDescRequest
      * @return ModifyClusterDescResponse
     */
    public ModifyClusterDescResponse modifyClusterDesc(String instanceId, String clusterName, ModifyClusterDescRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyClusterDescWithOptions(instanceId, clusterName, request, headers, runtime);
    }

    /**
      * ## Request syntax
      *     PUT /openapi/ha3/instances/{instanceId}/cluster-offline-config
      *     ...
      *
      * @param request ModifyClusterOfflineConfigRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return ModifyClusterOfflineConfigResponse
     */
    public ModifyClusterOfflineConfigResponse modifyClusterOfflineConfigWithOptions(String instanceId, ModifyClusterOfflineConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.buildMode)) {
            body.put("buildMode", request.buildMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.config)) {
            body.put("config", request.config);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceName)) {
            body.put("dataSourceName", request.dataSourceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceType)) {
            body.put("dataSourceType", request.dataSourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataTimeSec)) {
            body.put("dataTimeSec", request.dataTimeSec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            body.put("domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.generation)) {
            body.put("generation", request.generation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.partition)) {
            body.put("partition", request.partition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pushMode)) {
            body.put("pushMode", request.pushMode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyClusterOfflineConfig"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/cluster-offline-config"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyClusterOfflineConfigResponse());
    }

    /**
      * ## Request syntax
      *     PUT /openapi/ha3/instances/{instanceId}/cluster-offline-config
      *     ...
      *
      * @param request ModifyClusterOfflineConfigRequest
      * @return ModifyClusterOfflineConfigResponse
     */
    public ModifyClusterOfflineConfigResponse modifyClusterOfflineConfig(String instanceId, ModifyClusterOfflineConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyClusterOfflineConfigWithOptions(instanceId, request, headers, runtime);
    }

    /**
      * ### Method
      * `PUT`
      * ### URI
      * `/openapi/ha3/instances/{instanceId}/cluster-online-config`
      *
      * @param request ModifyClusterOnlineConfigRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return ModifyClusterOnlineConfigResponse
     */
    public ModifyClusterOnlineConfigResponse modifyClusterOnlineConfigWithOptions(String instanceId, ModifyClusterOnlineConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusters)) {
            body.put("clusters", request.clusters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.config)) {
            body.put("config", request.config);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyClusterOnlineConfig"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/cluster-online-config"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyClusterOnlineConfigResponse());
    }

    /**
      * ### Method
      * `PUT`
      * ### URI
      * `/openapi/ha3/instances/{instanceId}/cluster-online-config`
      *
      * @param request ModifyClusterOnlineConfigRequest
      * @return ModifyClusterOnlineConfigResponse
     */
    public ModifyClusterOnlineConfigResponse modifyClusterOnlineConfig(String instanceId, ModifyClusterOnlineConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyClusterOnlineConfigWithOptions(instanceId, request, headers, runtime);
    }

    /**
      * The result returned
      *
      * @param request ModifyDataSourceRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return ModifyDataSourceResponse
     */
    public ModifyDataSourceResponse modifyDataSourceWithOptions(String instanceId, String dataSourceName, ModifyDataSourceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("dryRun", request.dryRun);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.body)) {
            body.put("body", request.body);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDataSource"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/data-sources/" + com.aliyun.openapiutil.Client.getEncodeParam(dataSourceName) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDataSourceResponse());
    }

    /**
      * The result returned
      *
      * @param request ModifyDataSourceRequest
      * @return ModifyDataSourceResponse
     */
    public ModifyDataSourceResponse modifyDataSource(String instanceId, String dataSourceName, ModifyDataSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyDataSourceWithOptions(instanceId, dataSourceName, request, headers, runtime);
    }

    /**
      * ### Method
      * ~~~
      * PUT
      * ~~~
      * ### URI
      * ~~~
      * /openapi/ha3/instances/{instanceId}/indexes/{indexName}/versions/{versionName}/file?fileName=/root/test.txt
      * ~~~
      *
      * @param request ModifyFileRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return ModifyFileResponse
     */
    public ModifyFileResponse modifyFileWithOptions(String instanceId, String indexName, String versionName, ModifyFileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            query.put("fileName", request.fileName);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.partition)) {
            body.put("partition", request.partition);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyFile"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/indexes/" + com.aliyun.openapiutil.Client.getEncodeParam(indexName) + "/versions/" + com.aliyun.openapiutil.Client.getEncodeParam(versionName) + "/file"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyFileResponse());
    }

    /**
      * ### Method
      * ~~~
      * PUT
      * ~~~
      * ### URI
      * ~~~
      * /openapi/ha3/instances/{instanceId}/indexes/{indexName}/versions/{versionName}/file?fileName=/root/test.txt
      * ~~~
      *
      * @param request ModifyFileRequest
      * @return ModifyFileResponse
     */
    public ModifyFileResponse modifyFile(String instanceId, String indexName, String versionName, ModifyFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyFileWithOptions(instanceId, indexName, versionName, request, headers, runtime);
    }

    /**
      * The information about each index.
      *
      * @param request ModifyIndexPartitionRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return ModifyIndexPartitionResponse
     */
    public ModifyIndexPartitionResponse modifyIndexPartitionWithOptions(String instanceId, ModifyIndexPartitionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceName)) {
            body.put("dataSourceName", request.dataSourceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            body.put("domainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.generation)) {
            body.put("generation", request.generation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.indexInfos)) {
            body.put("indexInfos", request.indexInfos);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyIndexPartition"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/index-partition"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyIndexPartitionResponse());
    }

    /**
      * The information about each index.
      *
      * @param request ModifyIndexPartitionRequest
      * @return ModifyIndexPartitionResponse
     */
    public ModifyIndexPartitionResponse modifyIndexPartition(String instanceId, ModifyIndexPartitionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyIndexPartitionWithOptions(instanceId, request, headers, runtime);
    }

    /**
      * ## Method
      *     PUT
      * ## URI
      *     /openapi/ha3/instances/{instanceId}/clusters/{clusterName}/index-version
      *
      * @param request ModifyIndexVersionRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return ModifyIndexVersionResponse
     */
    public ModifyIndexVersionResponse modifyIndexVersionWithOptions(String instanceId, String clusterName, ModifyIndexVersionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.teautil.Common.toArray(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyIndexVersion"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(clusterName) + "/index-version"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyIndexVersionResponse());
    }

    /**
      * ## Method
      *     PUT
      * ## URI
      *     /openapi/ha3/instances/{instanceId}/clusters/{clusterName}/index-version
      *
      * @param request ModifyIndexVersionRequest
      * @return ModifyIndexVersionResponse
     */
    public ModifyIndexVersionResponse modifyIndexVersion(String instanceId, String clusterName, ModifyIndexVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyIndexVersionWithOptions(instanceId, clusterName, request, headers, runtime);
    }

    /**
      * ### Method
      *  ~~~
      * PUT
      * ~~~
      * ### URI
      * ~~~
      * /openapi/ha3/instances/{instanceId}/node-config?type=qrs&name=test
      * ~~~
      *
      * @param request ModifyNodeConfigRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return ModifyNodeConfigResponse
     */
    public ModifyNodeConfigResponse modifyNodeConfigWithOptions(String instanceId, ModifyNodeConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
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

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.active)) {
            body.put("active", request.active);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataDuplicateNumber)) {
            body.put("dataDuplicateNumber", request.dataDuplicateNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataFragmentNumber)) {
            body.put("dataFragmentNumber", request.dataFragmentNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minServicePercent)) {
            body.put("minServicePercent", request.minServicePercent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.published)) {
            body.put("published", request.published);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyNodeConfig"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/node-config"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyNodeConfigResponse());
    }

    /**
      * ### Method
      *  ~~~
      * PUT
      * ~~~
      * ### URI
      * ~~~
      * /openapi/ha3/instances/{instanceId}/node-config?type=qrs&name=test
      * ~~~
      *
      * @param request ModifyNodeConfigRequest
      * @return ModifyNodeConfigResponse
     */
    public ModifyNodeConfigResponse modifyNodeConfig(String instanceId, ModifyNodeConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyNodeConfigWithOptions(instanceId, request, headers, runtime);
    }

    /**
      * ### Method
      * ```java
      * put
      * ```
      * ### URI
      * ```java
      * /openapi/ha3/instances/{instanceId}/node/{nodeName}/online-configs/{indexName}
      * ```
      *
      * @param request ModifyOnlineConfigRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return ModifyOnlineConfigResponse
     */
    public ModifyOnlineConfigResponse modifyOnlineConfigWithOptions(String instanceId, String nodeName, String indexName, ModifyOnlineConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.body)) {
            body.put("body", request.body);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyOnlineConfig"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/node/" + com.aliyun.openapiutil.Client.getEncodeParam(nodeName) + "/online-configs/" + com.aliyun.openapiutil.Client.getEncodeParam(indexName) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyOnlineConfigResponse());
    }

    /**
      * ### Method
      * ```java
      * put
      * ```
      * ### URI
      * ```java
      * /openapi/ha3/instances/{instanceId}/node/{nodeName}/online-configs/{indexName}
      * ```
      *
      * @param request ModifyOnlineConfigRequest
      * @return ModifyOnlineConfigResponse
     */
    public ModifyOnlineConfigResponse modifyOnlineConfig(String instanceId, String nodeName, String indexName, ModifyOnlineConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyOnlineConfigWithOptions(instanceId, nodeName, indexName, request, headers, runtime);
    }

    /**
      * ### Method
      * `PUT`
      * ### URI
      * `/openapi/ha3/instances/{instanceId}/password`
      *
      * @param request ModifyPasswordRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return ModifyPasswordResponse
     */
    public ModifyPasswordResponse modifyPasswordWithOptions(String instanceId, ModifyPasswordRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            body.put("password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.username)) {
            body.put("username", request.username);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyPassword"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/password"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyPasswordResponse());
    }

    /**
      * ### Method
      * `PUT`
      * ### URI
      * `/openapi/ha3/instances/{instanceId}/password`
      *
      * @param request ModifyPasswordRequest
      * @return ModifyPasswordResponse
     */
    public ModifyPasswordResponse modifyPassword(String instanceId, ModifyPasswordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyPasswordWithOptions(instanceId, request, headers, runtime);
    }

    /**
      * ## Method
      * ~~~
      * POST
      * ~~~
      * ## URI
      * ~~~
      * /openapi/ha3/instances/{instanceId}/advanced-configs/{configName}/actions/publish
      * ~~~
      *
      * @param request PublishAdvanceConfigRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return PublishAdvanceConfigResponse
     */
    public PublishAdvanceConfigResponse publishAdvanceConfigWithOptions(String instanceId, String configName, PublishAdvanceConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.body)) {
            body.put("body", request.body);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PublishAdvanceConfig"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/advanced-configs/" + com.aliyun.openapiutil.Client.getEncodeParam(configName) + "/actions/publish"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PublishAdvanceConfigResponse());
    }

    /**
      * ## Method
      * ~~~
      * POST
      * ~~~
      * ## URI
      * ~~~
      * /openapi/ha3/instances/{instanceId}/advanced-configs/{configName}/actions/publish
      * ~~~
      *
      * @param request PublishAdvanceConfigRequest
      * @return PublishAdvanceConfigResponse
     */
    public PublishAdvanceConfigResponse publishAdvanceConfig(String instanceId, String configName, PublishAdvanceConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.publishAdvanceConfigWithOptions(instanceId, configName, request, headers, runtime);
    }

    /**
      * The information about the index
      *
      * @param request PublishIndexVersionRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return PublishIndexVersionResponse
     */
    public PublishIndexVersionResponse publishIndexVersionWithOptions(String instanceId, String indexName, PublishIndexVersionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.body)) {
            body.put("body", request.body);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PublishIndexVersion"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/indexes/" + com.aliyun.openapiutil.Client.getEncodeParam(indexName) + "/actions/publish"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PublishIndexVersionResponse());
    }

    /**
      * The information about the index
      *
      * @param request PublishIndexVersionRequest
      * @return PublishIndexVersionResponse
     */
    public PublishIndexVersionResponse publishIndexVersion(String instanceId, String indexName, PublishIndexVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.publishIndexVersionWithOptions(instanceId, indexName, request, headers, runtime);
    }

    /**
      * ### Method
      * `POST`
      * ### URI
      * `/openapi/ha3/instances/{instanceId}/recover-index`
      *
      * @param request RecoverIndexRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return RecoverIndexResponse
     */
    public RecoverIndexResponse recoverIndexWithOptions(String instanceId, RecoverIndexRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.buildDeployId)) {
            body.put("buildDeployId", request.buildDeployId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceName)) {
            body.put("dataSourceName", request.dataSourceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.generation)) {
            body.put("generation", request.generation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.indexName)) {
            body.put("indexName", request.indexName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecoverIndex"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/recover-index"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecoverIndexResponse());
    }

    /**
      * ### Method
      * `POST`
      * ### URI
      * `/openapi/ha3/instances/{instanceId}/recover-index`
      *
      * @param request RecoverIndexRequest
      * @return RecoverIndexResponse
     */
    public RecoverIndexResponse recoverIndex(String instanceId, RecoverIndexRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.recoverIndexWithOptions(instanceId, request, headers, runtime);
    }

    /**
      * The result
      *
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return RemoveClusterResponse
     */
    public RemoveClusterResponse removeClusterWithOptions(String instanceId, String clusterName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveCluster"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(clusterName) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveClusterResponse());
    }

    /**
      * The result
      *
      * @return RemoveClusterResponse
     */
    public RemoveClusterResponse removeCluster(String instanceId, String clusterName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeClusterWithOptions(instanceId, clusterName, headers, runtime);
    }

    /**
      * The information about the index
      *
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return StopTaskResponse
     */
    public StopTaskResponse stopTaskWithOptions(String instanceId, String fsmId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopTask"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/stop-task/" + com.aliyun.openapiutil.Client.getEncodeParam(fsmId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopTaskResponse());
    }

    /**
      * The information about the index
      *
      * @return StopTaskResponse
     */
    public StopTaskResponse stopTask(String instanceId, String fsmId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopTaskWithOptions(instanceId, fsmId, headers, runtime);
    }

    /**
      * ### Method
      * `PUT`
      * ### URI
      * `/openapi/ha3/instances/{instanceId}`
      *
      * @param request UpdateInstanceRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return UpdateInstanceResponse
     */
    public UpdateInstanceResponse updateInstanceWithOptions(String instanceId, UpdateInstanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.components)) {
            body.put("components", request.components);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderType)) {
            body.put("orderType", request.orderType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateInstance"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateInstanceResponse());
    }

    /**
      * ### Method
      * `PUT`
      * ### URI
      * `/openapi/ha3/instances/{instanceId}`
      *
      * @param request UpdateInstanceRequest
      * @return UpdateInstanceResponse
     */
    public UpdateInstanceResponse updateInstance(String instanceId, UpdateInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateInstanceWithOptions(instanceId, request, headers, runtime);
    }
}
