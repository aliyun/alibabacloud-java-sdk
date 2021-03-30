// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20200805;

import com.aliyun.tea.*;
import com.aliyun.quickbi_public20200805.models.*;
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

    public AddRowLevelByTagResponse addRowLevelByTagWithOptions(AddRowLevelByTagRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DatasetId", request.datasetId);
        query.put("ColumnIds", request.columnIds);
        query.put("Tags", request.tags);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddRowLevelByTag"),
            new TeaPair("version", "2020-08-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddRowLevelByTagResponse());
    }

    public AddRowLevelByTagResponse addRowLevelByTag(AddRowLevelByTagRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addRowLevelByTagWithOptions(request, runtime);
    }

    public AddRowLevelPermissionResponse addRowLevelPermissionWithOptions(AddRowLevelPermissionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DatasetId", request.datasetId);
        query.put("TargetIds", request.targetIds);
        query.put("TargetType", request.targetType);
        query.put("ColumnIds", request.columnIds);
        query.put("ColumnValues", request.columnValues);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddRowLevelPermission"),
            new TeaPair("version", "2020-08-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddRowLevelPermissionResponse());
    }

    public AddRowLevelPermissionResponse addRowLevelPermission(AddRowLevelPermissionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addRowLevelPermissionWithOptions(request, runtime);
    }

    public DeleteRowLevelByTagResponse deleteRowLevelByTagWithOptions(DeleteRowLevelByTagRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DatasetId", request.datasetId);
        query.put("ColumnIds", request.columnIds);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRowLevelByTag"),
            new TeaPair("version", "2020-08-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRowLevelByTagResponse());
    }

    public DeleteRowLevelByTagResponse deleteRowLevelByTag(DeleteRowLevelByTagRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteRowLevelByTagWithOptions(request, runtime);
    }

    public DeleteRowLevelPermissionResponse deleteRowLevelPermissionWithOptions(DeleteRowLevelPermissionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DatasetId", request.datasetId);
        query.put("ColumnIds", request.columnIds);
        query.put("TargetIds", request.targetIds);
        query.put("TargetTypes", request.targetTypes);
        query.put("DeleteType", request.deleteType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRowLevelPermission"),
            new TeaPair("version", "2020-08-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRowLevelPermissionResponse());
    }

    public DeleteRowLevelPermissionResponse deleteRowLevelPermission(DeleteRowLevelPermissionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteRowLevelPermissionWithOptions(request, runtime);
    }

    public QueryDatasetRowLevelPermissionInfoResponse queryDatasetRowLevelPermissionInfoWithOptions(QueryDatasetRowLevelPermissionInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DatasetId", request.datasetId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryDatasetRowLevelPermissionInfo"),
            new TeaPair("version", "2020-08-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryDatasetRowLevelPermissionInfoResponse());
    }

    public QueryDatasetRowLevelPermissionInfoResponse queryDatasetRowLevelPermissionInfo(QueryDatasetRowLevelPermissionInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDatasetRowLevelPermissionInfoWithOptions(request, runtime);
    }

    public SwitchColumnRowLevelControlResponse switchColumnRowLevelControlWithOptions(SwitchColumnRowLevelControlRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DatasetId", request.datasetId);
        query.put("ColumnIds", request.columnIds);
        query.put("Open", request.open);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SwitchColumnRowLevelControl"),
            new TeaPair("version", "2020-08-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SwitchColumnRowLevelControlResponse());
    }

    public SwitchColumnRowLevelControlResponse switchColumnRowLevelControl(SwitchColumnRowLevelControlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.switchColumnRowLevelControlWithOptions(request, runtime);
    }

    public SwitchDatasetRowLevelControlResponse switchDatasetRowLevelControlWithOptions(SwitchDatasetRowLevelControlRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DatasetId", request.datasetId);
        query.put("Open", request.open);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SwitchDatasetRowLevelControl"),
            new TeaPair("version", "2020-08-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SwitchDatasetRowLevelControlResponse());
    }

    public SwitchDatasetRowLevelControlResponse switchDatasetRowLevelControl(SwitchDatasetRowLevelControlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.switchDatasetRowLevelControlWithOptions(request, runtime);
    }

    public SwitchRowLevelTypeResponse switchRowLevelTypeWithOptions(SwitchRowLevelTypeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DatasetId", request.datasetId);
        query.put("Type", request.type);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SwitchRowLevelType"),
            new TeaPair("version", "2020-08-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SwitchRowLevelTypeResponse());
    }

    public SwitchRowLevelTypeResponse switchRowLevelType(SwitchRowLevelTypeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.switchRowLevelTypeWithOptions(request, runtime);
    }
}
