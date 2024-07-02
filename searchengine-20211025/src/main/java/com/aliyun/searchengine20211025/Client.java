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
     * <b>description</b> :
     * <h2>Method</h2>
     * <pre><code>POST
     * </code></pre>
     * <h2>URI</h2>
     * <pre><code>/openapi/ha3/instances/{instanceId}/actions/build-index
     * </code></pre>
     * 
     * <b>summary</b> : 
     * <p>Triggers reindexing.</p>
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
     * <b>description</b> :
     * <h2>Method</h2>
     * <pre><code>POST
     * </code></pre>
     * <h2>URI</h2>
     * <pre><code>/openapi/ha3/instances/{instanceId}/actions/build-index
     * </code></pre>
     * 
     * <b>summary</b> : 
     * <p>Triggers reindexing.</p>
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
     * <b>summary</b> : 
     * <p>更换实例资源组</p>
     * 
     * @param request ChangeResourceGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChangeResourceGroupResponse
     */
    public ChangeResourceGroupResponse changeResourceGroupWithOptions(String instanceId, ChangeResourceGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.newResourceGroupId)) {
            body.put("newResourceGroupId", request.newResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            body.put("resourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChangeResourceGroup"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/actions/change-resource-group"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChangeResourceGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更换实例资源组</p>
     * 
     * @param request ChangeResourceGroupRequest
     * @return ChangeResourceGroupResponse
     */
    public ChangeResourceGroupResponse changeResourceGroup(String instanceId, ChangeResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.changeResourceGroupWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * @param request CloneSqlInstanceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CloneSqlInstanceResponse
     */
    public CloneSqlInstanceResponse cloneSqlInstanceWithOptions(String instanceId, String database, String sqlInstanceId, CloneSqlInstanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetFolderId)) {
            body.put("targetFolderId", request.targetFolderId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CloneSqlInstance"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/sql-studio/databases/" + com.aliyun.openapiutil.Client.getEncodeParam(database) + "/sql-instances/" + com.aliyun.openapiutil.Client.getEncodeParam(sqlInstanceId) + "/actions/clone"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CloneSqlInstanceResponse());
    }

    /**
     * @param request CloneSqlInstanceRequest
     * @return CloneSqlInstanceResponse
     */
    public CloneSqlInstanceResponse cloneSqlInstance(String instanceId, String database, String sqlInstanceId, CloneSqlInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cloneSqlInstanceWithOptions(instanceId, database, sqlInstanceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Method</h3>
     * <p><code>POST</code></p>
     * <h3>URI</h3>
     * <p><code>/openapi/ha3/instances/{instanceId}/clusters</code></p>
     * 
     * <b>summary</b> : 
     * <p>Creates a cluster.</p>
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
     * <b>description</b> :
     * <h3>Method</h3>
     * <p><code>POST</code></p>
     * <h3>URI</h3>
     * <p><code>/openapi/ha3/instances/{instanceId}/clusters</code></p>
     * 
     * <b>summary</b> : 
     * <p>Creates a cluster.</p>
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
     * @param request CreateConfigDirRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateConfigDirResponse
     */
    public CreateConfigDirResponse createConfigDirWithOptions(String instanceId, String configName, CreateConfigDirRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dirName)) {
            body.put("dirName", request.dirName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentFullPath)) {
            body.put("parentFullPath", request.parentFullPath);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateConfigDir"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/advanced-configs/" + com.aliyun.openapiutil.Client.getEncodeParam(configName) + "/dir"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateConfigDirResponse());
    }

    /**
     * @param request CreateConfigDirRequest
     * @return CreateConfigDirResponse
     */
    public CreateConfigDirResponse createConfigDir(String instanceId, String configName, CreateConfigDirRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createConfigDirWithOptions(instanceId, configName, request, headers, runtime);
    }

    /**
     * @param request CreateConfigFileRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateConfigFileResponse
     */
    public CreateConfigFileResponse createConfigFileWithOptions(String instanceId, String configName, CreateConfigFileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            body.put("fileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossPath)) {
            body.put("ossPath", request.ossPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentFullPath)) {
            body.put("parentFullPath", request.parentFullPath);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateConfigFile"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/advanced-configs/" + com.aliyun.openapiutil.Client.getEncodeParam(configName) + "/file"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateConfigFileResponse());
    }

    /**
     * @param request CreateConfigFileRequest
     * @return CreateConfigFileResponse
     */
    public CreateConfigFileResponse createConfigFile(String instanceId, String configName, CreateConfigFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createConfigFileWithOptions(instanceId, configName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates data sources.</p>
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
     * <b>summary</b> : 
     * <p>Creates data sources.</p>
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
     * @param request CreateFolderRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateFolderResponse
     */
    public CreateFolderResponse createFolderWithOptions(String instanceId, String database, CreateFolderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFolder"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/sql-studio/databases/" + com.aliyun.openapiutil.Client.getEncodeParam(database) + "/folders"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFolderResponse());
    }

    /**
     * @param request CreateFolderRequest
     * @return CreateFolderResponse
     */
    public CreateFolderResponse createFolder(String instanceId, String database, CreateFolderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createFolderWithOptions(instanceId, database, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Method</h3>
     * <pre><code class="language-java">POST
     * </code></pre>
     * <h3>URI</h3>
     * <pre><code class="language-java">/openapi/ha3/instances/{instanceId}/indexes
     * </code></pre>
     * 
     * <b>summary</b> : 
     * <p>Creates an index.</p>
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
        if (!com.aliyun.teautil.Common.isUnset(request.buildParallelNum)) {
            body.put("buildParallelNum", request.buildParallelNum);
        }

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

        if (!com.aliyun.teautil.Common.isUnset(request.mergeParallelNum)) {
            body.put("mergeParallelNum", request.mergeParallelNum);
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
     * <b>description</b> :
     * <h3>Method</h3>
     * <pre><code class="language-java">POST
     * </code></pre>
     * <h3>URI</h3>
     * <pre><code class="language-java">/openapi/ha3/instances/{instanceId}/indexes
     * </code></pre>
     * 
     * <b>summary</b> : 
     * <p>Creates an index.</p>
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
     * <b>description</b> :
     * <h3>Method</h3>
     * <p><code>POST</code></p>
     * <h3>URI</h3>
     * <p><code>/api/instances?dryRun=false</code></p>
     * 
     * <b>summary</b> : 
     * <p>Creates a Havenask instance.</p>
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
     * <b>description</b> :
     * <h3>Method</h3>
     * <p><code>POST</code></p>
     * <h3>URI</h3>
     * <p><code>/api/instances?dryRun=false</code></p>
     * 
     * <b>summary</b> : 
     * <p>Creates a Havenask instance.</p>
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
     * <b>summary</b> : 
     * <p>开通公网域名</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePublicUrlResponse
     */
    public CreatePublicUrlResponse createPublicUrlWithOptions(String instanceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePublicUrl"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/public-url"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePublicUrlResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>开通公网域名</p>
     * @return CreatePublicUrlResponse
     */
    public CreatePublicUrlResponse createPublicUrl(String instanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createPublicUrlWithOptions(instanceId, headers, runtime);
    }

    /**
     * @param request CreateSqlInstanceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSqlInstanceResponse
     */
    public CreateSqlInstanceResponse createSqlInstanceWithOptions(String instanceId, String database, CreateSqlInstanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parent)) {
            body.put("parent", request.parent);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSqlInstance"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/sql-studio/databases/" + com.aliyun.openapiutil.Client.getEncodeParam(database) + "/sql-instances"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSqlInstanceResponse());
    }

    /**
     * @param request CreateSqlInstanceRequest
     * @return CreateSqlInstanceResponse
     */
    public CreateSqlInstanceResponse createSqlInstance(String instanceId, String database, CreateSqlInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSqlInstanceWithOptions(instanceId, database, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建索引V2</p>
     * 
     * @param request CreateTableRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTableResponse
     */
    public CreateTableResponse createTableWithOptions(String instanceId, CreateTableRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("dryRun", request.dryRun);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataProcessConfig)) {
            body.put("dataProcessConfig", request.dataProcessConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataProcessorCount)) {
            body.put("dataProcessorCount", request.dataProcessorCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSource)) {
            body.put("dataSource", request.dataSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fieldSchema)) {
            body.put("fieldSchema", request.fieldSchema);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.partitionCount)) {
            body.put("partitionCount", request.partitionCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.primaryKey)) {
            body.put("primaryKey", request.primaryKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rawSchema)) {
            body.put("rawSchema", request.rawSchema);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vectorIndex)) {
            body.put("vectorIndex", request.vectorIndex);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTable"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/tables"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTableResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建索引V2</p>
     * 
     * @param request CreateTableRequest
     * @return CreateTableResponse
     */
    public CreateTableResponse createTable(String instanceId, CreateTableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createTableWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Method</h2>
     * <pre><code>DELETE
     * </code></pre>
     * <h2>URI</h2>
     * <pre><code>/openapi/ha3/instances/{instanceId}/advanced-configs/{configName}
     * </code></pre>
     * 
     * <b>summary</b> : 
     * <p>Deletes the details about advanced configurations.</p>
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
     * <b>description</b> :
     * <h2>Method</h2>
     * <pre><code>DELETE
     * </code></pre>
     * <h2>URI</h2>
     * <pre><code>/openapi/ha3/instances/{instanceId}/advanced-configs/{configName}
     * </code></pre>
     * 
     * <b>summary</b> : 
     * <p>Deletes the details about advanced configurations.</p>
     * @return DeleteAdvanceConfigResponse
     */
    public DeleteAdvanceConfigResponse deleteAdvanceConfig(String instanceId, String configName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteAdvanceConfigWithOptions(instanceId, configName, headers, runtime);
    }

    /**
     * @param request DeleteConfigDirRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteConfigDirResponse
     */
    public DeleteConfigDirResponse deleteConfigDirWithOptions(String instanceId, String configName, DeleteConfigDirRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dirName)) {
            query.put("dirName", request.dirName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentFullPath)) {
            query.put("parentFullPath", request.parentFullPath);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteConfigDir"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/advanced-configs/" + com.aliyun.openapiutil.Client.getEncodeParam(configName) + "/dir"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteConfigDirResponse());
    }

    /**
     * @param request DeleteConfigDirRequest
     * @return DeleteConfigDirResponse
     */
    public DeleteConfigDirResponse deleteConfigDir(String instanceId, String configName, DeleteConfigDirRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteConfigDirWithOptions(instanceId, configName, request, headers, runtime);
    }

    /**
     * @param request DeleteConfigFileRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteConfigFileResponse
     */
    public DeleteConfigFileResponse deleteConfigFileWithOptions(String instanceId, String configName, DeleteConfigFileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            query.put("fileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentFullPath)) {
            query.put("parentFullPath", request.parentFullPath);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteConfigFile"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/advanced-configs/" + com.aliyun.openapiutil.Client.getEncodeParam(configName) + "/file"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteConfigFileResponse());
    }

    /**
     * @param request DeleteConfigFileRequest
     * @return DeleteConfigFileResponse
     */
    public DeleteConfigFileResponse deleteConfigFile(String instanceId, String configName, DeleteConfigFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteConfigFileWithOptions(instanceId, configName, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Method</h2>
     * <p><code>DELETE</code></p>
     * <h2>URI</h2>
     * <p><code>/openapi/ha3/instances/{instanceId}/data-sources/{dataSourceName}</code></p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a specified data source.</p>
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
     * <b>description</b> :
     * <h2>Method</h2>
     * <p><code>DELETE</code></p>
     * <h2>URI</h2>
     * <p><code>/openapi/ha3/instances/{instanceId}/data-sources/{dataSourceName}</code></p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a specified data source.</p>
     * @return DeleteDataSourceResponse
     */
    public DeleteDataSourceResponse deleteDataSource(String instanceId, String dataSourceName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteDataSourceWithOptions(instanceId, dataSourceName, headers, runtime);
    }

    /**
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteFolderResponse
     */
    public DeleteFolderResponse deleteFolderWithOptions(String instanceId, String database, String folderId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteFolder"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/sql-studio/databases/" + com.aliyun.openapiutil.Client.getEncodeParam(database) + "/folders/" + com.aliyun.openapiutil.Client.getEncodeParam(folderId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteFolderResponse());
    }

    /**
     * @return DeleteFolderResponse
     */
    public DeleteFolderResponse deleteFolder(String instanceId, String database, String folderId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteFolderWithOptions(instanceId, database, folderId, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Method</h2>
     * <pre><code>DELETE
     * </code></pre>
     * <h2>URI</h2>
     * <pre><code>/openapi/ha3/instances/{instanceId}/indexes/{indexName}?dataSource=xxx
     * </code></pre>
     * 
     * <b>summary</b> : 
     * <p>Deletes an index.</p>
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
     * <b>description</b> :
     * <h2>Method</h2>
     * <pre><code>DELETE
     * </code></pre>
     * <h2>URI</h2>
     * <pre><code>/openapi/ha3/instances/{instanceId}/indexes/{indexName}?dataSource=xxx
     * </code></pre>
     * 
     * <b>summary</b> : 
     * <p>Deletes an index.</p>
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
     * <b>description</b> :
     * <h2>Method</h2>
     * <pre><code>DELETE
     * </code></pre>
     * <h2>URI</h2>
     * <pre><code>/openapi/ha3/instances/{instanceId}/indexes/{indexName}/versions/{versionName}
     * </code></pre>
     * 
     * <b>summary</b> : 
     * <p>Deletes the version of an index.</p>
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
     * <b>description</b> :
     * <h2>Method</h2>
     * <pre><code>DELETE
     * </code></pre>
     * <h2>URI</h2>
     * <pre><code>/openapi/ha3/instances/{instanceId}/indexes/{indexName}/versions/{versionName}
     * </code></pre>
     * 
     * <b>summary</b> : 
     * <p>Deletes the version of an index.</p>
     * @return DeleteIndexVersionResponse
     */
    public DeleteIndexVersionResponse deleteIndexVersion(String instanceId, String indexName, String versionName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteIndexVersionWithOptions(instanceId, indexName, versionName, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Method</h3>
     * <p><code>DELETE</code></p>
     * <h3>URI</h3>
     * <p><code>/openapi/ha3/instances/{instanceId}</code></p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a specified instance.</p>
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
     * <b>description</b> :
     * <h3>Method</h3>
     * <p><code>DELETE</code></p>
     * <h3>URI</h3>
     * <p><code>/openapi/ha3/instances/{instanceId}</code></p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a specified instance.</p>
     * @return DeleteInstanceResponse
     */
    public DeleteInstanceResponse deleteInstance(String instanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteInstanceWithOptions(instanceId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除公网域名</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeletePublicUrlResponse
     */
    public DeletePublicUrlResponse deletePublicUrlWithOptions(String instanceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeletePublicUrl"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/public-url"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePublicUrlResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除公网域名</p>
     * @return DeletePublicUrlResponse
     */
    public DeletePublicUrlResponse deletePublicUrl(String instanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deletePublicUrlWithOptions(instanceId, headers, runtime);
    }

    /**
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSqlInstanceResponse
     */
    public DeleteSqlInstanceResponse deleteSqlInstanceWithOptions(String instanceId, String database, String sqlInstanceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSqlInstance"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/sql-studio/databases/" + com.aliyun.openapiutil.Client.getEncodeParam(database) + "/sql-instances/" + com.aliyun.openapiutil.Client.getEncodeParam(sqlInstanceId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSqlInstanceResponse());
    }

    /**
     * @return DeleteSqlInstanceResponse
     */
    public DeleteSqlInstanceResponse deleteSqlInstance(String instanceId, String database, String sqlInstanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteSqlInstanceWithOptions(instanceId, database, sqlInstanceId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除索引表V2</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteTableResponse
     */
    public DeleteTableResponse deleteTableWithOptions(String instanceId, String tableName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTable"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/tables/" + com.aliyun.openapiutil.Client.getEncodeParam(tableName) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTableResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除索引表V2</p>
     * @return DeleteTableResponse
     */
    public DeleteTableResponse deleteTable(String instanceId, String tableName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteTableWithOptions(instanceId, tableName, headers, runtime);
    }

    /**
     * @param request DescribeRegionsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("acceptLanguage", request.acceptLanguage);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRegions"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/regions"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRegionsResponse());
    }

    /**
     * @param request DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeRegionsWithOptions(request, headers, runtime);
    }

    /**
     * @param request ExecuteSqlInstanceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExecuteSqlInstanceResponse
     */
    public ExecuteSqlInstanceResponse executeSqlInstanceWithOptions(String instanceId, String database, String sqlInstanceId, ExecuteSqlInstanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExecuteSqlInstance"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/sql-studio/databases/" + com.aliyun.openapiutil.Client.getEncodeParam(database) + "/sql-instances/" + com.aliyun.openapiutil.Client.getEncodeParam(sqlInstanceId) + "/actions/execution"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExecuteSqlInstanceResponse());
    }

    /**
     * @param request ExecuteSqlInstanceRequest
     * @return ExecuteSqlInstanceResponse
     */
    public ExecuteSqlInstanceResponse executeSqlInstance(String instanceId, String database, String sqlInstanceId, ExecuteSqlInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.executeSqlInstanceWithOptions(instanceId, database, sqlInstanceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>\### Method</p>
     * <pre><code class="language-java">PUT
     * </code></pre>
     * <h3>URI</h3>
     * <pre><code class="language-java">/openapi/ha3/instances/{instanceId}/force-switch/{fsmId}
     * </code></pre>
     * 
     * <b>summary</b> : 
     * <p>Performs a forced switchover.</p>
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
     * <b>description</b> :
     * <p>\### Method</p>
     * <pre><code class="language-java">PUT
     * </code></pre>
     * <h3>URI</h3>
     * <pre><code class="language-java">/openapi/ha3/instances/{instanceId}/force-switch/{fsmId}
     * </code></pre>
     * 
     * <b>summary</b> : 
     * <p>Performs a forced switchover.</p>
     * @return ForceSwitchResponse
     */
    public ForceSwitchResponse forceSwitch(String instanceId, String fsmId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.forceSwitchWithOptions(instanceId, fsmId, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Method</h2>
     * <pre><code>GET
     * </code></pre>
     * <h2>URI</h2>
     * <pre><code>/openapi/ha3/instances/{instanceId}/advanced-configs/{configName}
     * </code></pre>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about a dictionary.</p>
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
     * <b>description</b> :
     * <h2>Method</h2>
     * <pre><code>GET
     * </code></pre>
     * <h2>URI</h2>
     * <pre><code>/openapi/ha3/instances/{instanceId}/advanced-configs/{configName}
     * </code></pre>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about a dictionary.</p>
     * 
     * @param request GetAdvanceConfigRequest
     * @return GetAdvanceConfigResponse
     */
    public GetAdvanceConfigResponse getAdvanceConfig(String instanceId, String configName, GetAdvanceConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAdvanceConfigWithOptions(instanceId, configName, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Method</h2>
     * <pre><code>GET
     * </code></pre>
     * <h2>URI</h2>
     * <pre><code>/openapi/ha3/instances/{instanceId}/advanced-configs/{configName}/file?fileName={fileName}
     * </code></pre>
     * 
     * <b>summary</b> : 
     * <p>Obtains the information in a specified advanced configuration file.</p>
     * 
     * @param request GetAdvanceConfigFileRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAdvanceConfigFileResponse
     */
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

    /**
     * <b>description</b> :
     * <h2>Method</h2>
     * <pre><code>GET
     * </code></pre>
     * <h2>URI</h2>
     * <pre><code>/openapi/ha3/instances/{instanceId}/advanced-configs/{configName}/file?fileName={fileName}
     * </code></pre>
     * 
     * <b>summary</b> : 
     * <p>Obtains the information in a specified advanced configuration file.</p>
     * 
     * @param request GetAdvanceConfigFileRequest
     * @return GetAdvanceConfigFileResponse
     */
    public GetAdvanceConfigFileResponse getAdvanceConfigFile(String instanceId, String configName, GetAdvanceConfigFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAdvanceConfigFileWithOptions(instanceId, configName, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Method</h3>
     * <p><code>GET</code></p>
     * <h3>URI</h3>
     * <p><code>/openapi/ha3/instance/{instanceId}/clusters/{clusterName}</code></p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a cluster.</p>
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
     * <b>description</b> :
     * <h3>Method</h3>
     * <p><code>GET</code></p>
     * <h3>URI</h3>
     * <p><code>/openapi/ha3/instance/{instanceId}/clusters/{clusterName}</code></p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a cluster.</p>
     * @return GetClusterResponse
     */
    public GetClusterResponse getCluster(String instanceId, String clusterName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getClusterWithOptions(instanceId, clusterName, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Method</h3>
     * <p>GET</p>
     * <h3>URI</h3>
     * <p>/openapi/ha3/instances/{instanceId}/cluster-run-time-info</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the runtime information about a specified cluster.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetClusterRunTimeInfoResponse
     */
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

    /**
     * <b>description</b> :
     * <h3>Method</h3>
     * <p>GET</p>
     * <h3>URI</h3>
     * <p>/openapi/ha3/instances/{instanceId}/cluster-run-time-info</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the runtime information about a specified cluster.</p>
     * @return GetClusterRunTimeInfoResponse
     */
    public GetClusterRunTimeInfoResponse getClusterRunTimeInfo(String instanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getClusterRunTimeInfoWithOptions(instanceId, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Method</h3>
     * <p><code>GET</code></p>
     * <h3>URI</h3>
     * <p><code>/openapi/ha3/instances/{instanceId}/data-sources/{dataSourceName}</code></p>
     * 
     * <b>summary</b> : 
     * <p>Obtains a data source.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDataSourceResponse
     */
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

    /**
     * <b>description</b> :
     * <h3>Method</h3>
     * <p><code>GET</code></p>
     * <h3>URI</h3>
     * <p><code>/openapi/ha3/instances/{instanceId}/data-sources/{dataSourceName}</code></p>
     * 
     * <b>summary</b> : 
     * <p>Obtains a data source.</p>
     * @return GetDataSourceResponse
     */
    public GetDataSourceResponse getDataSource(String instanceId, String dataSourceName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDataSourceWithOptions(instanceId, dataSourceName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取数据源部署信息</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDataSourceDeployResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>获取数据源部署信息</p>
     * @return GetDataSourceDeployResponse
     */
    public GetDataSourceDeployResponse getDataSourceDeploy(String instanceId, String deployName, String dataSourceName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDataSourceDeployWithOptions(instanceId, deployName, dataSourceName, headers, runtime);
    }

    /**
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDatabaseSchemaResponse
     */
    public GetDatabaseSchemaResponse getDatabaseSchemaWithOptions(String instanceId, String database, String tableName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDatabaseSchema"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/sql-studio/databases/" + com.aliyun.openapiutil.Client.getEncodeParam(database) + "/tables/" + com.aliyun.openapiutil.Client.getEncodeParam(tableName) + "/schema"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDatabaseSchemaResponse());
    }

    /**
     * @return GetDatabaseSchemaResponse
     */
    public GetDatabaseSchemaResponse getDatabaseSchema(String instanceId, String database, String tableName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDatabaseSchemaWithOptions(instanceId, database, tableName, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Method</h2>
     * <p>GET</p>
     * <h2>URI</h2>
     * <pre><code class="language-java">/openapi/ha3/instances/{instanceId}/deploy-graph
     * </code></pre>
     * 
     * <b>summary</b> : 
     * <p>Displays the overview of the deployment.</p>
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
     * <b>description</b> :
     * <h2>Method</h2>
     * <p>GET</p>
     * <h2>URI</h2>
     * <pre><code class="language-java">/openapi/ha3/instances/{instanceId}/deploy-graph
     * </code></pre>
     * 
     * <b>summary</b> : 
     * <p>Displays the overview of the deployment.</p>
     * @return GetDeployGraphResponse
     */
    public GetDeployGraphResponse getDeployGraph(String instanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDeployGraphWithOptions(instanceId, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Method</h2>
     * <pre><code>GET
     * </code></pre>
     * <h2>URI</h2>
     * <pre><code>/openapi/ha3/instances/{instanceId}/indexes/{indexName}/versions/{versionName}/file?fileName=/root/test.txt
     * </code></pre>
     * 
     * <b>summary</b> : 
     * <p>Queries details about the version information of an index table.</p>
     * 
     * @param request GetFileRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetFileResponse
     */
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

    /**
     * <b>description</b> :
     * <h2>Method</h2>
     * <pre><code>GET
     * </code></pre>
     * <h2>URI</h2>
     * <pre><code>/openapi/ha3/instances/{instanceId}/indexes/{indexName}/versions/{versionName}/file?fileName=/root/test.txt
     * </code></pre>
     * 
     * <b>summary</b> : 
     * <p>Queries details about the version information of an index table.</p>
     * 
     * @param request GetFileRequest
     * @return GetFileResponse
     */
    public GetFileResponse getFile(String instanceId, String indexName, String versionName, GetFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getFileWithOptions(instanceId, indexName, versionName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about an index version.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetIndexResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries the information about an index version.</p>
     * @return GetIndexResponse
     */
    public GetIndexResponse getIndex(String instanceId, String indexName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getIndexWithOptions(instanceId, indexName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取索引在线生效策略</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetIndexOnlineStrategyResponse
     */
    public GetIndexOnlineStrategyResponse getIndexOnlineStrategyWithOptions(String instanceId, String dataSourceName, String deployName, String indexName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetIndexOnlineStrategy"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/data-sources/" + com.aliyun.openapiutil.Client.getEncodeParam(dataSourceName) + "/deploys/" + com.aliyun.openapiutil.Client.getEncodeParam(deployName) + "/indexes/" + com.aliyun.openapiutil.Client.getEncodeParam(indexName) + "/online-strategy"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetIndexOnlineStrategyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取索引在线生效策略</p>
     * @return GetIndexOnlineStrategyResponse
     */
    public GetIndexOnlineStrategyResponse getIndexOnlineStrategy(String instanceId, String dataSourceName, String deployName, String indexName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getIndexOnlineStrategyWithOptions(instanceId, dataSourceName, deployName, indexName, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Method</h2>
     * <pre><code>GET
     * </code></pre>
     * <h2>URI</h2>
     * <pre><code>/openapi/ha3/instances/{instanceId}/clusters/{clusterName}/index-version
     * </code></pre>
     * 
     * <b>summary</b> : 
     * <p>Obtains the information about index versions that the current index version can be rolled back to.</p>
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
     * <b>description</b> :
     * <h2>Method</h2>
     * <pre><code>GET
     * </code></pre>
     * <h2>URI</h2>
     * <pre><code>/openapi/ha3/instances/{instanceId}/clusters/{clusterName}/index-version
     * </code></pre>
     * 
     * <b>summary</b> : 
     * <p>Obtains the information about index versions that the current index version can be rolled back to.</p>
     * @return GetIndexVersionResponse
     */
    public GetIndexVersionResponse getIndexVersion(String instanceId, String clusterName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getIndexVersionWithOptions(instanceId, clusterName, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Method</h3>
     * <p><code>GET</code></p>
     * <h3>URI</h3>
     * <p><code>/openapi/ha3/instances/{instanceId}</code></p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of an instance based on a specified instance ID.</p>
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
     * <b>description</b> :
     * <h3>Method</h3>
     * <p><code>GET</code></p>
     * <h3>URI</h3>
     * <p><code>/openapi/ha3/instances/{instanceId}</code></p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of an instance based on a specified instance ID.</p>
     * @return GetInstanceResponse
     */
    public GetInstanceResponse getInstance(String instanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getInstanceWithOptions(instanceId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Gets the configuration information of a node.</p>
     * 
     * @param request GetNodeConfigRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetNodeConfigResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Gets the configuration information of a node.</p>
     * 
     * @param request GetNodeConfigRequest
     * @return GetNodeConfigResponse
     */
    public GetNodeConfigResponse getNodeConfig(String instanceId, GetNodeConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getNodeConfigWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * @param request GetSqlInstanceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSqlInstanceResponse
     */
    public GetSqlInstanceResponse getSqlInstanceWithOptions(String instanceId, String database, String sqlInstanceId, GetSqlInstanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            query.put("version", request.version);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSqlInstance"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/sql-studio/databases/" + com.aliyun.openapiutil.Client.getEncodeParam(database) + "/sql-instances/" + com.aliyun.openapiutil.Client.getEncodeParam(sqlInstanceId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSqlInstanceResponse());
    }

    /**
     * @param request GetSqlInstanceRequest
     * @return GetSqlInstanceResponse
     */
    public GetSqlInstanceResponse getSqlInstance(String instanceId, String database, String sqlInstanceId, GetSqlInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSqlInstanceWithOptions(instanceId, database, sqlInstanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取索引表信息V2</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTableResponse
     */
    public GetTableResponse getTableWithOptions(String instanceId, String tableName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTable"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/tables/" + com.aliyun.openapiutil.Client.getEncodeParam(tableName) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTableResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取索引表信息V2</p>
     * @return GetTableResponse
     */
    public GetTableResponse getTable(String instanceId, String tableName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTableWithOptions(instanceId, tableName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>根据generationId获取某个索引版本状态V2</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTableGenerationResponse
     */
    public GetTableGenerationResponse getTableGenerationWithOptions(String instanceId, String tableName, String generationId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTableGeneration"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/tables/" + com.aliyun.openapiutil.Client.getEncodeParam(tableName) + "/index_versions/" + com.aliyun.openapiutil.Client.getEncodeParam(generationId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTableGenerationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>根据generationId获取某个索引版本状态V2</p>
     * @return GetTableGenerationResponse
     */
    public GetTableGenerationResponse getTableGeneration(String instanceId, String tableName, String generationId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTableGenerationWithOptions(instanceId, tableName, generationId, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Method</h2>
     * <p><code>GET</code></p>
     * <h2>URI</h2>
     * <p><code>/openapi/ha3/instances/{instanceId}/advanced-configs/{configName}/dir?dirName={dirName}</code></p>
     * 
     * <b>summary</b> : 
     * <p>Obtains the file list in an advanced configuration directory.</p>
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
     * <b>description</b> :
     * <h2>Method</h2>
     * <p><code>GET</code></p>
     * <h2>URI</h2>
     * <p><code>/openapi/ha3/instances/{instanceId}/advanced-configs/{configName}/dir?dirName={dirName}</code></p>
     * 
     * <b>summary</b> : 
     * <p>Obtains the file list in an advanced configuration directory.</p>
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
     * <b>description</b> :
     * <h2>Sample requests</h2>
     * <p><code>GET /openapi/ha3/instances/ose-test1/advanced-configs</code></p>
     * 
     * <b>summary</b> : 
     * <p>Obtains a list of advanced configurations.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.newMode)) {
            query.put("newMode", request.newMode);
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
     * <b>description</b> :
     * <h2>Sample requests</h2>
     * <p><code>GET /openapi/ha3/instances/ose-test1/advanced-configs</code></p>
     * 
     * <b>summary</b> : 
     * <p>Obtains a list of advanced configurations.</p>
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
     * <b>description</b> :
     * <h3>Method</h3>
     * <p>GET</p>
     * <h3>URI</h3>
     * <p>/openapi/ha3/instances/{instanceId}/cluster-names</p>
     * 
     * <b>summary</b> : 
     * <p>Queries cluster names.</p>
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
     * <b>description</b> :
     * <h3>Method</h3>
     * <p>GET</p>
     * <h3>URI</h3>
     * <p>/openapi/ha3/instances/{instanceId}/cluster-names</p>
     * 
     * <b>summary</b> : 
     * <p>Queries cluster names.</p>
     * @return ListClusterNamesResponse
     */
    public ListClusterNamesResponse listClusterNames() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listClusterNamesWithOptions(headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Method</h3>
     * <pre><code class="language-java">GET
     * </code></pre>
     * <h3>URI</h3>
     * <pre><code class="language-java">/openapi/ha3/instances/{instanceId}/cluster-tasks
     * </code></pre>
     * 
     * <b>summary</b> : 
     * <p>Displays cluster tasks .</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListClusterTasksResponse
     */
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

    /**
     * <b>description</b> :
     * <h3>Method</h3>
     * <pre><code class="language-java">GET
     * </code></pre>
     * <h3>URI</h3>
     * <pre><code class="language-java">/openapi/ha3/instances/{instanceId}/cluster-tasks
     * </code></pre>
     * 
     * <b>summary</b> : 
     * <p>Displays cluster tasks .</p>
     * @return ListClusterTasksResponse
     */
    public ListClusterTasksResponse listClusterTasks(String instanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listClusterTasksWithOptions(instanceId, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Method</h3>
     * <pre><code class="language-java">GET
     * </code></pre>
     * <h3>URI</h3>
     * <pre><code class="language-java">/openapi/ha3/instances/{instanceId}/clusters
     * </code></pre>
     * 
     * <b>summary</b> : 
     * <p>Queries clusters.</p>
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
     * <b>description</b> :
     * <h3>Method</h3>
     * <pre><code class="language-java">GET
     * </code></pre>
     * <h3>URI</h3>
     * <pre><code class="language-java">/openapi/ha3/instances/{instanceId}/clusters
     * </code></pre>
     * 
     * <b>summary</b> : 
     * <p>Queries clusters.</p>
     * @return ListClustersResponse
     */
    public ListClustersResponse listClusters(String instanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listClustersWithOptions(instanceId, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Method</h2>
     * <p><code>GET</code></p>
     * <h2>URI</h2>
     * <p><code>/openapi/ha3/instances/{instanceId}/data-sources/{dataSourceName}/schemas</code></p>
     * 
     * <b>summary</b> : 
     * <p>Obtains the schema information of a specified data source.</p>
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
     * <b>description</b> :
     * <h2>Method</h2>
     * <p><code>GET</code></p>
     * <h2>URI</h2>
     * <p><code>/openapi/ha3/instances/{instanceId}/data-sources/{dataSourceName}/schemas</code></p>
     * 
     * <b>summary</b> : 
     * <p>Obtains the schema information of a specified data source.</p>
     * @return ListDataSourceSchemasResponse
     */
    public ListDataSourceSchemasResponse listDataSourceSchemas(String instanceId, String dataSourceName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDataSourceSchemasWithOptions(instanceId, dataSourceName, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Method</h3>
     * <pre><code class="language-java">GET
     * </code></pre>
     * <h3>URI</h3>
     * <pre><code class="language-java">/openapi/ha3/instances/{instanceId}/data-source-tasks
     * </code></pre>
     * 
     * <b>summary</b> : 
     * <p>Displays data source tasks.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataSourceTasksResponse
     */
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

    /**
     * <b>description</b> :
     * <h3>Method</h3>
     * <pre><code class="language-java">GET
     * </code></pre>
     * <h3>URI</h3>
     * <pre><code class="language-java">/openapi/ha3/instances/{instanceId}/data-source-tasks
     * </code></pre>
     * 
     * <b>summary</b> : 
     * <p>Displays data source tasks.</p>
     * @return ListDataSourceTasksResponse
     */
    public ListDataSourceTasksResponse listDataSourceTasks(String instanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDataSourceTasksWithOptions(instanceId, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Method</h2>
     * <p><code>GET</code></p>
     * <h2>URI</h2>
     * <p><code>/openapi/ha3/instances/{instanceId}/data-sources</code></p>
     * 
     * <b>summary</b> : 
     * <p>Obtains the list of data sources.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataSourcesResponse
     */
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

    /**
     * <b>description</b> :
     * <h2>Method</h2>
     * <p><code>GET</code></p>
     * <h2>URI</h2>
     * <p><code>/openapi/ha3/instances/{instanceId}/data-sources</code></p>
     * 
     * <b>summary</b> : 
     * <p>Obtains the list of data sources.</p>
     * @return ListDataSourcesResponse
     */
    public ListDataSourcesResponse listDataSources(String instanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDataSourcesWithOptions(instanceId, headers, runtime);
    }

    /**
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDatabasesResponse
     */
    public ListDatabasesResponse listDatabasesWithOptions(String instanceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDatabases"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/sql-studio/databases"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDatabasesResponse());
    }

    /**
     * @return ListDatabasesResponse
     */
    public ListDatabasesResponse listDatabases(String instanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDatabasesWithOptions(instanceId, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Method</h3>
     * <p><code>GET</code></p>
     * <h3>URI</h3>
     * <p><code>/openapi/ha3/instances/{instanceId}/data-sources/{dataSourceName}/generations?domainName={domainName}</code></p>
     * 
     * <b>summary</b> : 
     * <p>Obtains the data restoration version of a data source.</p>
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
     * <b>description</b> :
     * <h3>Method</h3>
     * <p><code>GET</code></p>
     * <h3>URI</h3>
     * <p><code>/openapi/ha3/instances/{instanceId}/data-sources/{dataSourceName}/generations?domainName={domainName}</code></p>
     * 
     * <b>summary</b> : 
     * <p>Obtains the data restoration version of a data source.</p>
     * 
     * @param request ListDateSourceGenerationsRequest
     * @return ListDateSourceGenerationsResponse
     */
    public ListDateSourceGenerationsResponse listDateSourceGenerations(String instanceId, String dataSourceName, ListDateSourceGenerationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDateSourceGenerationsWithOptions(instanceId, dataSourceName, request, headers, runtime);
    }

    /**
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListIndexRecoverRecordsResponse
     */
    public ListIndexRecoverRecordsResponse listIndexRecoverRecordsWithOptions(String indexName, String instanceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListIndexRecoverRecords"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/indexes/" + com.aliyun.openapiutil.Client.getEncodeParam(indexName) + "/actions/list-recover-records"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListIndexRecoverRecordsResponse());
    }

    /**
     * @return ListIndexRecoverRecordsResponse
     */
    public ListIndexRecoverRecordsResponse listIndexRecoverRecords(String indexName, String instanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listIndexRecoverRecordsWithOptions(indexName, instanceId, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Method</h2>
     * <pre><code>GET
     * </code></pre>
     * <h2>URI</h2>
     * <pre><code>/openapi/ha3/instances/{instanceId}/indexes
     * </code></pre>
     * 
     * <b>summary</b> : 
     * <p>Obtains the index list.</p>
     * 
     * @param request ListIndexesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListIndexesResponse
     */
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

    /**
     * <b>description</b> :
     * <h2>Method</h2>
     * <pre><code>GET
     * </code></pre>
     * <h2>URI</h2>
     * <pre><code>/openapi/ha3/instances/{instanceId}/indexes
     * </code></pre>
     * 
     * <b>summary</b> : 
     * <p>Obtains the index list.</p>
     * 
     * @param request ListIndexesRequest
     * @return ListIndexesResponse
     */
    public ListIndexesResponse listIndexes(String instanceId, ListIndexesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listIndexesWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Method</h3>
     * <p><code>GET</code></p>
     * <h3>URI</h3>
     * <p><code>/openapi/ha3/instances/{instanceId}/specs?type=qrs</code></p>
     * 
     * <b>summary</b> : 
     * <p>Queries instances.</p>
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
     * <b>description</b> :
     * <h3>Method</h3>
     * <p><code>GET</code></p>
     * <h3>URI</h3>
     * <p><code>/openapi/ha3/instances/{instanceId}/specs?type=qrs</code></p>
     * 
     * <b>summary</b> : 
     * <p>Queries instances.</p>
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
     * <b>description</b> :
     * <h3>Method</h3>
     * <p><code>GET</code></p>
     * <h3>URI</h3>
     * <p><code>/openapi/[code]/instances</code></p>
     * 
     * <b>summary</b> : 
     * <p>Queries instances.</p>
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
     * <b>description</b> :
     * <h3>Method</h3>
     * <p><code>GET</code></p>
     * <h3>URI</h3>
     * <p><code>/openapi/[code]/instances</code></p>
     * 
     * <b>summary</b> : 
     * <p>Queries instances.</p>
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
     * @param request ListLogsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListLogsResponse
     */
    public ListLogsResponse listLogsWithOptions(String instanceId, ListLogsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("pageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            query.put("query", request.query);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("startTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListLogs"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/logs"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListLogsResponse());
    }

    /**
     * @param request ListLogsRequest
     * @return ListLogsResponse
     */
    public ListLogsResponse listLogs(String instanceId, ListLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listLogsWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Method</h3>
     * <pre><code class="language-java">GET
     * </code></pre>
     * <h3>URI</h3>
     * <pre><code class="language-java">/openapi/ha3/instances/{instanceId}/node/{nodeName}/online-configs?domain={domain}
     * </code></pre>
     * 
     * <b>summary</b> : 
     * <p>Obtains the details of online configurations.</p>
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
     * <b>description</b> :
     * <h3>Method</h3>
     * <pre><code class="language-java">GET
     * </code></pre>
     * <h3>URI</h3>
     * <pre><code class="language-java">/openapi/ha3/instances/{instanceId}/node/{nodeName}/online-configs?domain={domain}
     * </code></pre>
     * 
     * <b>summary</b> : 
     * <p>Obtains the details of online configurations.</p>
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
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPausePolicysResponse
     */
    public ListPausePolicysResponse listPausePolicysWithOptions(String instanceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPausePolicys"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/pause-policies"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPausePolicysResponse());
    }

    /**
     * @return ListPausePolicysResponse
     */
    public ListPausePolicysResponse listPausePolicys(String instanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPausePolicysWithOptions(instanceId, headers, runtime);
    }

    /**
     * @param request ListPostQueryResultRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPostQueryResultResponse
     */
    public ListPostQueryResultResponse listPostQueryResultWithOptions(String instanceId, ListPostQueryResultRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.address)) {
            query.put("address", request.address);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
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
            new TeaPair("action", "ListPostQueryResult"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/query"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPostQueryResultResponse());
    }

    /**
     * @param request ListPostQueryResultRequest
     * @return ListPostQueryResultResponse
     */
    public ListPostQueryResultResponse listPostQueryResult(String instanceId, ListPostQueryResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPostQueryResultWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Method</h3>
     * <p><code>GET</code></p>
     * <h3>URI</h3>
     * <p><code>/openapi/ha3/instances/{instanceId}/query?query=xxxx</code></p>
     * 
     * <b>summary</b> : 
     * <p>Queries the query result.</p>
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
     * <b>description</b> :
     * <h3>Method</h3>
     * <p><code>GET</code></p>
     * <h3>URI</h3>
     * <p><code>/openapi/ha3/instances/{instanceId}/query?query=xxxx</code></p>
     * 
     * <b>summary</b> : 
     * <p>Queries the query result.</p>
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
     * @param request ListRestQueryResultRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRestQueryResultResponse
     */
    public ListRestQueryResultResponse listRestQueryResultWithOptions(String instanceId, ListRestQueryResultRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.address)) {
            query.put("address", request.address);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.indexName)) {
            body.put("indexName", request.indexName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            body.put("query", request.query);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRestQueryResult"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/rest-query"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRestQueryResultResponse());
    }

    /**
     * @param request ListRestQueryResultRequest
     * @return ListRestQueryResultResponse
     */
    public ListRestQueryResultResponse listRestQueryResult(String instanceId, ListRestQueryResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRestQueryResultWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>通过数据源配置获取schema信息</p>
     * 
     * @param request ListSchemasRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSchemasResponse
     */
    public ListSchemasResponse listSchemasWithOptions(String instanceId, ListSchemasRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessKey)) {
            query.put("accessKey", request.accessKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accessSecret)) {
            query.put("accessSecret", request.accessSecret);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpoint)) {
            query.put("endpoint", request.endpoint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.partition)) {
            query.put("partition", request.partition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.project)) {
            query.put("project", request.project);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.table)) {
            query.put("table", request.table);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSchemas"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/schemas"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSchemasResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>通过数据源配置获取schema信息</p>
     * 
     * @param request ListSchemasRequest
     * @return ListSchemasResponse
     */
    public ListSchemasResponse listSchemas(String instanceId, ListSchemasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSchemasWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取索引generation列表V2</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTableGenerationsResponse
     */
    public ListTableGenerationsResponse listTableGenerationsWithOptions(String instanceId, String tableName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTableGenerations"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/tables/" + com.aliyun.openapiutil.Client.getEncodeParam(tableName) + "/index_versions"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTableGenerationsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取索引generation列表V2</p>
     * @return ListTableGenerationsResponse
     */
    public ListTableGenerationsResponse listTableGenerations(String instanceId, String tableName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTableGenerationsWithOptions(instanceId, tableName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取索引列表V2</p>
     * 
     * @param request ListTablesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTablesResponse
     */
    public ListTablesResponse listTablesWithOptions(String instanceId, ListTablesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "ListTables"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/tables"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTablesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取索引列表V2</p>
     * 
     * @param request ListTablesRequest
     * @return ListTablesResponse
     */
    public ListTablesResponse listTables(String instanceId, ListTablesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTablesWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查标签接口</p>
     * 
     * @param tmpReq ListTagResourcesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListTagResourcesShrinkRequest request = new ListTagResourcesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.resourceId)) {
            request.resourceIdShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.resourceId, "resourceId", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tag)) {
            request.tagShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tag, "tag", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceIdShrink)) {
            query.put("resourceId", request.resourceIdShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("resourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagShrink)) {
            query.put("tag", request.tagShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTagResources"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/resource-tags"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTagResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查标签接口</p>
     * 
     * @param request ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTagResourcesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取集群任务列表（数据源+集群）</p>
     * 
     * @param request ListTasksRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTasksResponse
     */
    public ListTasksResponse listTasksWithOptions(String instanceId, ListTasksRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.end)) {
            query.put("end", request.end);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.start)) {
            query.put("start", request.start);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTasks"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/tasks"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTasksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取集群任务列表（数据源+集群）</p>
     * 
     * @param request ListTasksRequest
     * @return ListTasksResponse
     */
    public ListTasksResponse listTasks(String instanceId, ListTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTasksWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * @param request ListVectorQueryResultRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListVectorQueryResultResponse
     */
    public ListVectorQueryResultResponse listVectorQueryResultWithOptions(String instanceId, ListVectorQueryResultRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.address)) {
            query.put("address", request.address);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryType)) {
            query.put("queryType", request.queryType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vectorQueryType)) {
            query.put("vectorQueryType", request.vectorQueryType);
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
            new TeaPair("action", "ListVectorQueryResult"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/vector-query"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListVectorQueryResultResponse());
    }

    /**
     * @param request ListVectorQueryResultRequest
     * @return ListVectorQueryResultResponse
     */
    public ListVectorQueryResultResponse listVectorQueryResult(String instanceId, ListVectorQueryResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listVectorQueryResultWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * @param request ModifyAdvanceConfigRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyAdvanceConfigResponse
     */
    public ModifyAdvanceConfigResponse modifyAdvanceConfigWithOptions(String instanceId, String configName, ModifyAdvanceConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contentType)) {
            body.put("contentType", request.contentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desc)) {
            body.put("desc", request.desc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.files)) {
            body.put("files", request.files);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.updateTime)) {
            body.put("updateTime", request.updateTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyAdvanceConfig"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/advanced-configs/" + com.aliyun.openapiutil.Client.getEncodeParam(configName) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyAdvanceConfigResponse());
    }

    /**
     * @param request ModifyAdvanceConfigRequest
     * @return ModifyAdvanceConfigResponse
     */
    public ModifyAdvanceConfigResponse modifyAdvanceConfig(String instanceId, String configName, ModifyAdvanceConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyAdvanceConfigWithOptions(instanceId, configName, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Method</h2>
     * <pre><code>put
     * </code></pre>
     * <h2>URI</h2>
     * <pre><code>/openapi/ha3/instances/{instanceId}/advanced-configs/{configName}/file?fileName={fileName}
     * </code></pre>
     * 
     * <b>summary</b> : 
     * <p>Modifies the advanced configurations.</p>
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
     * <b>description</b> :
     * <h2>Method</h2>
     * <pre><code>put
     * </code></pre>
     * <h2>URI</h2>
     * <pre><code>/openapi/ha3/instances/{instanceId}/advanced-configs/{configName}/file?fileName={fileName}
     * </code></pre>
     * 
     * <b>summary</b> : 
     * <p>Modifies the advanced configurations.</p>
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
     * <b>description</b> :
     * <h3>Method</h3>
     * <p><code>PUT</code></p>
     * <h3>URI</h3>
     * <p><code>/openapi/ha3/instances/{instanceId}/clusters/{clusterName}/desc</code></p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the description of a specified cluster.</p>
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
     * <b>description</b> :
     * <h3>Method</h3>
     * <p><code>PUT</code></p>
     * <h3>URI</h3>
     * <p><code>/openapi/ha3/instances/{instanceId}/clusters/{clusterName}/desc</code></p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the description of a specified cluster.</p>
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
     * <b>description</b> :
     * <h2>Request syntax</h2>
     * <pre><code>PUT /openapi/ha3/instances/{instanceId}/cluster-offline-config
     * </code></pre>
     * 
     * <b>summary</b> : 
     * <p>Modifies the configuration information of a cluster.</p>
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
     * <b>description</b> :
     * <h2>Request syntax</h2>
     * <pre><code>PUT /openapi/ha3/instances/{instanceId}/cluster-offline-config
     * </code></pre>
     * 
     * <b>summary</b> : 
     * <p>Modifies the configuration information of a cluster.</p>
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
     * <b>description</b> :
     * <h3>Method</h3>
     * <p><code>PUT</code></p>
     * <h3>URI</h3>
     * <p><code>/openapi/ha3/instances/{instanceId}/cluster-online-config</code></p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the online configurations of a cluster.</p>
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
     * <b>description</b> :
     * <h3>Method</h3>
     * <p><code>PUT</code></p>
     * <h3>URI</h3>
     * <p><code>/openapi/ha3/instances/{instanceId}/cluster-online-config</code></p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the online configurations of a cluster.</p>
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
     * <b>summary</b> : 
     * <p>修改数据源部署信息</p>
     * 
     * @param request ModifyDataSourceDeployRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDataSourceDeployResponse
     */
    public ModifyDataSourceDeployResponse modifyDataSourceDeployWithOptions(String instanceId, String deployName, String dataSourceName, ModifyDataSourceDeployRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("dryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.generationId)) {
            query.put("generationId", request.generationId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoBuildIndex)) {
            body.put("autoBuildIndex", request.autoBuildIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extend)) {
            body.put("extend", request.extend);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.processor)) {
            body.put("processor", request.processor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storage)) {
            body.put("storage", request.storage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.swift)) {
            body.put("swift", request.swift);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDataSourceDeploy"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/data-sources/" + com.aliyun.openapiutil.Client.getEncodeParam(dataSourceName) + "/deploys/" + com.aliyun.openapiutil.Client.getEncodeParam(deployName) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDataSourceDeployResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改数据源部署信息</p>
     * 
     * @param request ModifyDataSourceDeployRequest
     * @return ModifyDataSourceDeployResponse
     */
    public ModifyDataSourceDeployResponse modifyDataSourceDeploy(String instanceId, String deployName, String dataSourceName, ModifyDataSourceDeployRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyDataSourceDeployWithOptions(instanceId, deployName, dataSourceName, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Method</h2>
     * <pre><code>PUT
     * </code></pre>
     * <h2>URI</h2>
     * <pre><code>/openapi/ha3/instances/{instanceId}/indexes/{indexName}/versions/{versionName}/file?fileName=/root/test.txt
     * </code></pre>
     * 
     * <b>summary</b> : 
     * <p>Modifies a file.</p>
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
     * <b>description</b> :
     * <h2>Method</h2>
     * <pre><code>PUT
     * </code></pre>
     * <h2>URI</h2>
     * <pre><code>/openapi/ha3/instances/{instanceId}/indexes/{indexName}/versions/{versionName}/file?fileName=/root/test.txt
     * </code></pre>
     * 
     * <b>summary</b> : 
     * <p>Modifies a file.</p>
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
     * @param request ModifyIndexRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyIndexResponse
     */
    public ModifyIndexResponse modifyIndexWithOptions(String instanceId, String indexName, ModifyIndexRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("dryRun", request.dryRun);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.buildParallelNum)) {
            body.put("buildParallelNum", request.buildParallelNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cluster)) {
            body.put("cluster", request.cluster);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterConfigName)) {
            body.put("clusterConfigName", request.clusterConfigName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.config)) {
            body.put("config", request.config);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSource)) {
            body.put("dataSource", request.dataSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceInfo)) {
            body.put("dataSourceInfo", request.dataSourceInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            body.put("domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mergeParallelNum)) {
            body.put("mergeParallelNum", request.mergeParallelNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.partition)) {
            body.put("partition", request.partition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pushMode)) {
            body.put("pushMode", request.pushMode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyIndex"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/indexes/" + com.aliyun.openapiutil.Client.getEncodeParam(indexName) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyIndexResponse());
    }

    /**
     * @param request ModifyIndexRequest
     * @return ModifyIndexResponse
     */
    public ModifyIndexResponse modifyIndex(String instanceId, String indexName, ModifyIndexRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyIndexWithOptions(instanceId, indexName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改索引在线策略</p>
     * 
     * @param request ModifyIndexOnlineStrategyRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyIndexOnlineStrategyResponse
     */
    public ModifyIndexOnlineStrategyResponse modifyIndexOnlineStrategyWithOptions(String instanceId, String dataSourceName, String deployName, String indexName, ModifyIndexOnlineStrategyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.changeRate)) {
            body.put("changeRate", request.changeRate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyIndexOnlineStrategy"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/data-sources/" + com.aliyun.openapiutil.Client.getEncodeParam(dataSourceName) + "/deploys/" + com.aliyun.openapiutil.Client.getEncodeParam(deployName) + "/indexes/" + com.aliyun.openapiutil.Client.getEncodeParam(indexName) + "/online-strategy"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyIndexOnlineStrategyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改索引在线策略</p>
     * 
     * @param request ModifyIndexOnlineStrategyRequest
     * @return ModifyIndexOnlineStrategyResponse
     */
    public ModifyIndexOnlineStrategyResponse modifyIndexOnlineStrategy(String instanceId, String dataSourceName, String deployName, String indexName, ModifyIndexOnlineStrategyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyIndexOnlineStrategyWithOptions(instanceId, dataSourceName, deployName, indexName, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Method</h3>
     * <p><code>PUT</code></p>
     * <h3>URI</h3>
     * <p><code>/openapi/ha3/instances/{instanceId}/index-partition</code></p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the information about index partitions.</p>
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
     * <b>description</b> :
     * <h3>Method</h3>
     * <p><code>PUT</code></p>
     * <h3>URI</h3>
     * <p><code>/openapi/ha3/instances/{instanceId}/index-partition</code></p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the information about index partitions.</p>
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
     * <b>description</b> :
     * <h2>Method</h2>
     * <pre><code>PUT
     * </code></pre>
     * <h2>URI</h2>
     * <pre><code>/openapi/ha3/instances/{instanceId}/clusters/{clusterName}/index-version
     * </code></pre>
     * 
     * <b>summary</b> : 
     * <p>Modifies the index version of a cluster (an index version rollback).</p>
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
     * <b>description</b> :
     * <h2>Method</h2>
     * <pre><code>PUT
     * </code></pre>
     * <h2>URI</h2>
     * <pre><code>/openapi/ha3/instances/{instanceId}/clusters/{clusterName}/index-version
     * </code></pre>
     * 
     * <b>summary</b> : 
     * <p>Modifies the index version of a cluster (an index version rollback).</p>
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
     * <b>description</b> :
     * <h3>Method</h3>
     * <pre><code class="language-java">PUT
     * </code></pre>
     * <h3>URI</h3>
     * <pre><code class="language-java">/openapi/ha3/instances/{instanceId}/node-config?type=qrs&amp;name=test
     * </code></pre>
     * 
     * <b>summary</b> : 
     * <p>Modifies the configurations of a node.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.flowRatio)) {
            body.put("flowRatio", request.flowRatio);
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
     * <b>description</b> :
     * <h3>Method</h3>
     * <pre><code class="language-java">PUT
     * </code></pre>
     * <h3>URI</h3>
     * <pre><code class="language-java">/openapi/ha3/instances/{instanceId}/node-config?type=qrs&amp;name=test
     * </code></pre>
     * 
     * <b>summary</b> : 
     * <p>Modifies the configurations of a node.</p>
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
     * <b>description</b> :
     * <h3>Method</h3>
     * <pre><code class="language-java">put
     * </code></pre>
     * <h3>URI</h3>
     * <pre><code class="language-java">/openapi/ha3/instances/{instanceId}/node/{nodeName}/online-configs/{indexName}
     * </code></pre>
     * 
     * <b>summary</b> : 
     * <p>Modifies online configurations.</p>
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
     * <b>description</b> :
     * <h3>Method</h3>
     * <pre><code class="language-java">put
     * </code></pre>
     * <h3>URI</h3>
     * <pre><code class="language-java">/openapi/ha3/instances/{instanceId}/node/{nodeName}/online-configs/{indexName}
     * </code></pre>
     * 
     * <b>summary</b> : 
     * <p>Modifies online configurations.</p>
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
     * <b>description</b> :
     * <h3>Method</h3>
     * <p><code>PUT</code></p>
     * <h3>URI</h3>
     * <p><code>/openapi/ha3/instances/{instanceId}/password</code></p>
     * 
     * <b>summary</b> : 
     * <p>修改实例的密码</p>
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
     * <b>description</b> :
     * <h3>Method</h3>
     * <p><code>PUT</code></p>
     * <h3>URI</h3>
     * <p><code>/openapi/ha3/instances/{instanceId}/password</code></p>
     * 
     * <b>summary</b> : 
     * <p>修改实例的密码</p>
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
     * @param request ModifyPausePolicyRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyPausePolicyResponse
     */
    public ModifyPausePolicyResponse modifyPausePolicyWithOptions(String instanceId, ModifyPausePolicyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "ModifyPausePolicy"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/pause-policies"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyPausePolicyResponse());
    }

    /**
     * @param request ModifyPausePolicyRequest
     * @return ModifyPausePolicyResponse
     */
    public ModifyPausePolicyResponse modifyPausePolicy(String instanceId, ModifyPausePolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyPausePolicyWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改公网域名访问白名单</p>
     * 
     * @param request ModifyPublicUrlIpListRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyPublicUrlIpListResponse
     */
    public ModifyPublicUrlIpListResponse modifyPublicUrlIpListWithOptions(String instanceId, ModifyPublicUrlIpListRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "ModifyPublicUrlIpList"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/public-url-ip-list"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyPublicUrlIpListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改公网域名访问白名单</p>
     * 
     * @param request ModifyPublicUrlIpListRequest
     * @return ModifyPublicUrlIpListResponse
     */
    public ModifyPublicUrlIpListResponse modifyPublicUrlIpList(String instanceId, ModifyPublicUrlIpListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyPublicUrlIpListWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改索引V2</p>
     * 
     * @param request ModifyTableRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyTableResponse
     */
    public ModifyTableResponse modifyTableWithOptions(String instanceId, String tableName, ModifyTableRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("dryRun", request.dryRun);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataProcessConfig)) {
            body.put("dataProcessConfig", request.dataProcessConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSource)) {
            body.put("dataSource", request.dataSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fieldSchema)) {
            body.put("fieldSchema", request.fieldSchema);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.partitionCount)) {
            body.put("partitionCount", request.partitionCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.primaryKey)) {
            body.put("primaryKey", request.primaryKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rawSchema)) {
            body.put("rawSchema", request.rawSchema);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vectorIndex)) {
            body.put("vectorIndex", request.vectorIndex);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyTable"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/tables/" + com.aliyun.openapiutil.Client.getEncodeParam(tableName) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyTableResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改索引V2</p>
     * 
     * @param request ModifyTableRequest
     * @return ModifyTableResponse
     */
    public ModifyTableResponse modifyTable(String instanceId, String tableName, ModifyTableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyTableWithOptions(instanceId, tableName, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Method</h2>
     * <pre><code>POST
     * </code></pre>
     * <h2>URI</h2>
     * <pre><code>/openapi/ha3/instances/{instanceId}/advanced-configs/{configName}/actions/publish
     * </code></pre>
     * 
     * <b>summary</b> : 
     * <p>Publishes a version of advanced configurations.</p>
     * 
     * @param request PublishAdvanceConfigRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return PublishAdvanceConfigResponse
     */
    public PublishAdvanceConfigResponse publishAdvanceConfigWithOptions(String instanceId, String configName, PublishAdvanceConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.desc)) {
            body.put("desc", request.desc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.files)) {
            body.put("files", request.files);
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
     * <b>description</b> :
     * <h2>Method</h2>
     * <pre><code>POST
     * </code></pre>
     * <h2>URI</h2>
     * <pre><code>/openapi/ha3/instances/{instanceId}/advanced-configs/{configName}/actions/publish
     * </code></pre>
     * 
     * <b>summary</b> : 
     * <p>Publishes a version of advanced configurations.</p>
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
     * <b>description</b> :
     * <h2>Method</h2>
     * <pre><code>POST
     * </code></pre>
     * <h2>URI</h2>
     * <pre><code>/openapi/ha3/instances/{instanceId}/indexes/{indexName}/actions/publish
     * </code></pre>
     * 
     * <b>summary</b> : 
     * <p>Publishes a specified index version.</p>
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
     * <b>description</b> :
     * <h2>Method</h2>
     * <pre><code>POST
     * </code></pre>
     * <h2>URI</h2>
     * <pre><code>/openapi/ha3/instances/{instanceId}/indexes/{indexName}/actions/publish
     * </code></pre>
     * 
     * <b>summary</b> : 
     * <p>Publishes a specified index version.</p>
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
     * @param request PushDocumentsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return PushDocumentsResponse
     */
    public PushDocumentsResponse pushDocumentsWithOptions(String instanceId, String dataSourceName, PushDocumentsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pkField)) {
            query.put("pkField", request.pkField);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PushDocuments"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/data-sources/" + com.aliyun.openapiutil.Client.getEncodeParam(dataSourceName) + "/actions/bulk"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PushDocumentsResponse());
    }

    /**
     * @param request PushDocumentsRequest
     * @return PushDocumentsResponse
     */
    public PushDocumentsResponse pushDocuments(String instanceId, String dataSourceName, PushDocumentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pushDocumentsWithOptions(instanceId, dataSourceName, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Method</h3>
     * <p><code>POST</code></p>
     * <h3>URI</h3>
     * <p><code>/openapi/ha3/instances/{instanceId}/recover-index</code></p>
     * 
     * <b>summary</b> : 
     * <p>Restores data from an index.</p>
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
     * <b>description</b> :
     * <h3>Method</h3>
     * <p><code>POST</code></p>
     * <h3>URI</h3>
     * <p><code>/openapi/ha3/instances/{instanceId}/recover-index</code></p>
     * 
     * <b>summary</b> : 
     * <p>Restores data from an index.</p>
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
     * <b>summary</b> : 
     * <p>索引重建V2</p>
     * 
     * @param request ReindexRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReindexResponse
     */
    public ReindexResponse reindexWithOptions(String instanceId, String tableName, ReindexRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataTimeSec)) {
            body.put("dataTimeSec", request.dataTimeSec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossDataPath)) {
            body.put("ossDataPath", request.ossDataPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.partition)) {
            body.put("partition", request.partition);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Reindex"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/tables/" + com.aliyun.openapiutil.Client.getEncodeParam(tableName) + "/reindex"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReindexResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>索引重建V2</p>
     * 
     * @param request ReindexRequest
     * @return ReindexResponse
     */
    public ReindexResponse reindex(String instanceId, String tableName, ReindexRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.reindexWithOptions(instanceId, tableName, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Method</h3>
     * <pre><code class="language-java">DELETE
     * </code></pre>
     * <h3>URI</h3>
     * <pre><code class="language-java">/openapi/ha3/instances/{instanceId}/clusters/{clusterName}
     * </code></pre>
     * 
     * <b>summary</b> : 
     * <p>Deletes a cluster.</p>
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
     * <b>description</b> :
     * <h3>Method</h3>
     * <pre><code class="language-java">DELETE
     * </code></pre>
     * <h3>URI</h3>
     * <pre><code class="language-java">/openapi/ha3/instances/{instanceId}/clusters/{clusterName}
     * </code></pre>
     * 
     * <b>summary</b> : 
     * <p>Deletes a cluster.</p>
     * @return RemoveClusterResponse
     */
    public RemoveClusterResponse removeCluster(String instanceId, String clusterName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeClusterWithOptions(instanceId, clusterName, headers, runtime);
    }

    /**
     * @param request RenameFolderRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RenameFolderResponse
     */
    public RenameFolderResponse renameFolderWithOptions(String instanceId, String database, String folderId, RenameFolderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RenameFolder"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/sql-studio/databases/" + com.aliyun.openapiutil.Client.getEncodeParam(database) + "/folders/" + com.aliyun.openapiutil.Client.getEncodeParam(folderId) + "/name"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RenameFolderResponse());
    }

    /**
     * @param request RenameFolderRequest
     * @return RenameFolderResponse
     */
    public RenameFolderResponse renameFolder(String instanceId, String database, String folderId, RenameFolderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.renameFolderWithOptions(instanceId, database, folderId, request, headers, runtime);
    }

    /**
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartIndexResponse
     */
    public StartIndexResponse startIndexWithOptions(String instanceId, String indexName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartIndex"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/indexes/" + com.aliyun.openapiutil.Client.getEncodeParam(indexName) + "/startIndex"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartIndexResponse());
    }

    /**
     * @return StartIndexResponse
     */
    public StartIndexResponse startIndex(String instanceId, String indexName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startIndexWithOptions(instanceId, indexName, headers, runtime);
    }

    /**
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopIndexResponse
     */
    public StopIndexResponse stopIndexWithOptions(String instanceId, String indexName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopIndex"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/indexes/" + com.aliyun.openapiutil.Client.getEncodeParam(indexName) + "/stopIndex"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopIndexResponse());
    }

    /**
     * @return StopIndexResponse
     */
    public StopIndexResponse stopIndex(String instanceId, String indexName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopIndexWithOptions(instanceId, indexName, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Method</h3>
     * <pre><code class="language-java">PUT
     * </code></pre>
     * <h3>URI</h3>
     * <pre><code class="language-java">/openapi/ha3/instances/{instanceId}/stop-task/{fsmId}
     * </code></pre>
     * 
     * <b>summary</b> : 
     * <p>Stops an FSM task.</p>
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
     * <b>description</b> :
     * <h3>Method</h3>
     * <pre><code class="language-java">PUT
     * </code></pre>
     * <h3>URI</h3>
     * <pre><code class="language-java">/openapi/ha3/instances/{instanceId}/stop-task/{fsmId}
     * </code></pre>
     * 
     * <b>summary</b> : 
     * <p>Stops an FSM task.</p>
     * @return StopTaskResponse
     */
    public StopTaskResponse stopTask(String instanceId, String fsmId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopTaskWithOptions(instanceId, fsmId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>打标签接口</p>
     * 
     * @param request TagResourcesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            body.put("resourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            body.put("resourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            body.put("tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TagResources"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/resource-tags"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TagResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>打标签接口</p>
     * 
     * @param request TagResourcesRequest
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.tagResourcesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删标签接口</p>
     * 
     * @param tmpReq UntagResourcesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UntagResourcesResponse
     */
    public UntagResourcesResponse untagResourcesWithOptions(UntagResourcesRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UntagResourcesShrinkRequest request = new UntagResourcesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.resourceId)) {
            request.resourceIdShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.resourceId, "resourceId", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tagKey)) {
            request.tagKeyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tagKey, "tagKey", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.all)) {
            query.put("all", request.all);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceIdShrink)) {
            query.put("resourceId", request.resourceIdShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("resourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagKeyShrink)) {
            query.put("tagKey", request.tagKeyShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UntagResources"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/resource-tags"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UntagResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删标签接口</p>
     * 
     * @param request UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.untagResourcesWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Method</h3>
     * <p><code>PUT</code></p>
     * <h3>URI</h3>
     * <p><code>/openapi/ha3/instances/{instanceId}</code></p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the configuration of a specified instance.</p>
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
     * <b>description</b> :
     * <h3>Method</h3>
     * <p><code>PUT</code></p>
     * <h3>URI</h3>
     * <p><code>/openapi/ha3/instances/{instanceId}</code></p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the configuration of a specified instance.</p>
     * 
     * @param request UpdateInstanceRequest
     * @return UpdateInstanceResponse
     */
    public UpdateInstanceResponse updateInstance(String instanceId, UpdateInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateInstanceWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * @param request UpdateSqlInstanceContentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSqlInstanceContentResponse
     */
    public UpdateSqlInstanceContentResponse updateSqlInstanceContentWithOptions(String instanceId, String database, String sqlInstanceId, UpdateSqlInstanceContentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("content", request.content);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSqlInstanceContent"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/sql-studio/databases/" + com.aliyun.openapiutil.Client.getEncodeParam(database) + "/sql-instances/" + com.aliyun.openapiutil.Client.getEncodeParam(sqlInstanceId) + "/content"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSqlInstanceContentResponse());
    }

    /**
     * @param request UpdateSqlInstanceContentRequest
     * @return UpdateSqlInstanceContentResponse
     */
    public UpdateSqlInstanceContentResponse updateSqlInstanceContent(String instanceId, String database, String sqlInstanceId, UpdateSqlInstanceContentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSqlInstanceContentWithOptions(instanceId, database, sqlInstanceId, request, headers, runtime);
    }

    /**
     * @param request UpdateSqlInstanceNameRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSqlInstanceNameResponse
     */
    public UpdateSqlInstanceNameResponse updateSqlInstanceNameWithOptions(String instanceId, String database, String sqlInstanceId, UpdateSqlInstanceNameRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSqlInstanceName"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/sql-studio/databases/" + com.aliyun.openapiutil.Client.getEncodeParam(database) + "/sql-instances/" + com.aliyun.openapiutil.Client.getEncodeParam(sqlInstanceId) + "/name"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSqlInstanceNameResponse());
    }

    /**
     * @param request UpdateSqlInstanceNameRequest
     * @return UpdateSqlInstanceNameResponse
     */
    public UpdateSqlInstanceNameResponse updateSqlInstanceName(String instanceId, String database, String sqlInstanceId, UpdateSqlInstanceNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSqlInstanceNameWithOptions(instanceId, database, sqlInstanceId, request, headers, runtime);
    }

    /**
     * @param request UpdateSqlInstanceParamsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSqlInstanceParamsResponse
     */
    public UpdateSqlInstanceParamsResponse updateSqlInstanceParamsWithOptions(String instanceId, String database, String sqlInstanceId, UpdateSqlInstanceParamsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSqlInstanceParams"),
            new TeaPair("version", "2021-10-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ha3/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/sql-studio/databases/" + com.aliyun.openapiutil.Client.getEncodeParam(database) + "/sql-instances/" + com.aliyun.openapiutil.Client.getEncodeParam(sqlInstanceId) + "/params"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSqlInstanceParamsResponse());
    }

    /**
     * @param request UpdateSqlInstanceParamsRequest
     * @return UpdateSqlInstanceParamsResponse
     */
    public UpdateSqlInstanceParamsResponse updateSqlInstanceParams(String instanceId, String database, String sqlInstanceId, UpdateSqlInstanceParamsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSqlInstanceParamsWithOptions(instanceId, database, sqlInstanceId, request, headers, runtime);
    }
}
