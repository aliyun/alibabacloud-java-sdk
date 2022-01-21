// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oms20160615;

import com.aliyun.tea.*;
import com.aliyun.oms20160615.models.*;
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
            new TeaPair("ap-southeast-1", "oms.ap-southeast-1.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "pre-oms.cn-hangzhou.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("oms", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public CheckReadyFlagResponse checkReadyFlagWithOptions(CheckReadyFlagRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cycles)) {
            query.put("Cycles", request.cycles);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataType)) {
            query.put("DataType", request.dataType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainCode)) {
            query.put("DomainCode", request.domainCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckReadyFlag"),
            new TeaPair("version", "2016-06-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckReadyFlagResponse());
    }

    public CheckReadyFlagResponse checkReadyFlag(CheckReadyFlagRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkReadyFlagWithOptions(request, runtime);
    }

    public DeleteDomainPartResponse deleteDomainPartWithOptions(DeleteDomainPartRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataType)) {
            query.put("DataType", request.dataType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainCode)) {
            query.put("DomainCode", request.domainCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.part)) {
            query.put("Part", request.part);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDomainPart"),
            new TeaPair("version", "2016-06-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDomainPartResponse());
    }

    public DeleteDomainPartResponse deleteDomainPart(DeleteDomainPartRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDomainPartWithOptions(request, runtime);
    }

    public DeleteDomainPartByProxyResponse deleteDomainPartByProxyWithOptions(DeleteDomainPartByProxyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataType)) {
            query.put("DataType", request.dataType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainCode)) {
            query.put("DomainCode", request.domainCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.part)) {
            query.put("Part", request.part);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDomainPartByProxy"),
            new TeaPair("version", "2016-06-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDomainPartByProxyResponse());
    }

    public DeleteDomainPartByProxyResponse deleteDomainPartByProxy(DeleteDomainPartByProxyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDomainPartByProxyWithOptions(request, runtime);
    }

    public GetAccessPolicyConfigResponse getAccessPolicyConfigWithOptions(GetAccessPolicyConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAccessPolicyConfig"),
            new TeaPair("version", "2016-06-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAccessPolicyConfigResponse());
    }

    public GetAccessPolicyConfigResponse getAccessPolicyConfig(GetAccessPolicyConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAccessPolicyConfigWithOptions(request, runtime);
    }

    public GetDomainConfigResponse getDomainConfigWithOptions(GetDomainConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDomainConfig"),
            new TeaPair("version", "2016-06-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDomainConfigResponse());
    }

    public GetDomainConfigResponse getDomainConfig(GetDomainConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDomainConfigWithOptions(request, runtime);
    }

    public GetDomainPartResponse getDomainPartWithOptions(GetDomainPartRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDomainPart"),
            new TeaPair("version", "2016-06-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDomainPartResponse());
    }

    public GetDomainPartResponse getDomainPart(GetDomainPartRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDomainPartWithOptions(request, runtime);
    }

    public GetDomainPartByProxyResponse getDomainPartByProxyWithOptions(GetDomainPartByProxyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.compressEnable)) {
            query.put("CompressEnable", request.compressEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataType)) {
            query.put("DataType", request.dataType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainCode)) {
            query.put("DomainCode", request.domainCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.part)) {
            query.put("Part", request.part);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDomainPartByProxy"),
            new TeaPair("version", "2016-06-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDomainPartByProxyResponse());
    }

    public GetDomainPartByProxyResponse getDomainPartByProxy(GetDomainPartByProxyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDomainPartByProxyWithOptions(request, runtime);
    }

    public GetDomainPartConfigResponse getDomainPartConfigWithOptions(GetDomainPartConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDomainPartConfig"),
            new TeaPair("version", "2016-06-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDomainPartConfigResponse());
    }

    public GetDomainPartConfigResponse getDomainPartConfig(GetDomainPartConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDomainPartConfigWithOptions(request, runtime);
    }

    public GetMeasureDataResponse getMeasureDataWithOptions(GetMeasureDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiType)) {
            query.put("ApiType", request.apiType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.compressEnable)) {
            query.put("CompressEnable", request.compressEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataType)) {
            query.put("DataType", request.dataType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainCode)) {
            query.put("DomainCode", request.domainCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            query.put("Filter", request.filter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResult)) {
            query.put("MaxResult", request.maxResult);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryField)) {
            query.put("QueryField", request.queryField);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMeasureData"),
            new TeaPair("version", "2016-06-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMeasureDataResponse());
    }

    public GetMeasureDataResponse getMeasureData(GetMeasureDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getMeasureDataWithOptions(request, runtime);
    }

    public GetOpenApiConfigResponse getOpenApiConfigWithOptions(GetOpenApiConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOpenApiConfig"),
            new TeaPair("version", "2016-06-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOpenApiConfigResponse());
    }

    public GetOpenApiConfigResponse getOpenApiConfig(GetOpenApiConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getOpenApiConfigWithOptions(request, runtime);
    }

    public GetReadyFlagResponse getReadyFlagWithOptions(GetReadyFlagRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetReadyFlag"),
            new TeaPair("version", "2016-06-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetReadyFlagResponse());
    }

    public GetReadyFlagResponse getReadyFlag(GetReadyFlagRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getReadyFlagWithOptions(request, runtime);
    }

    public GetReadyFlagAlertConfigResponse getReadyFlagAlertConfigWithOptions(GetReadyFlagAlertConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetReadyFlagAlertConfig"),
            new TeaPair("version", "2016-06-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetReadyFlagAlertConfigResponse());
    }

    public GetReadyFlagAlertConfigResponse getReadyFlagAlertConfig(GetReadyFlagAlertConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getReadyFlagAlertConfigWithOptions(request, runtime);
    }

    public GetReadyFlagByProxyResponse getReadyFlagByProxyWithOptions(GetReadyFlagByProxyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiType)) {
            query.put("ApiType", request.apiType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.compressEnable)) {
            query.put("CompressEnable", request.compressEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataType)) {
            query.put("DataType", request.dataType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainCode)) {
            query.put("DomainCode", request.domainCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            query.put("Filter", request.filter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResult)) {
            query.put("MaxResult", request.maxResult);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetReadyFlagByProxy"),
            new TeaPair("version", "2016-06-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetReadyFlagByProxyResponse());
    }

    public GetReadyFlagByProxyResponse getReadyFlagByProxy(GetReadyFlagByProxyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getReadyFlagByProxyWithOptions(request, runtime);
    }

    public PutDomainPartResponse putDomainPartWithOptions(PutDomainPartRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.compressed)) {
            query.put("Compressed", request.compressed);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.data)) {
            query.put("Data", request.data);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataType)) {
            query.put("DataType", request.dataType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainCode)) {
            query.put("DomainCode", request.domainCode);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutDomainPart"),
            new TeaPair("version", "2016-06-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PutDomainPartResponse());
    }

    public PutDomainPartResponse putDomainPart(PutDomainPartRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.putDomainPartWithOptions(request, runtime);
    }

    public PutDomainPartByProxyResponse putDomainPartByProxyWithOptions(PutDomainPartByProxyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.compressed)) {
            query.put("Compressed", request.compressed);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.data)) {
            query.put("Data", request.data);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataType)) {
            query.put("DataType", request.dataType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainCode)) {
            query.put("DomainCode", request.domainCode);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutDomainPartByProxy"),
            new TeaPair("version", "2016-06-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PutDomainPartByProxyResponse());
    }

    public PutDomainPartByProxyResponse putDomainPartByProxy(PutDomainPartByProxyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.putDomainPartByProxyWithOptions(request, runtime);
    }

    public PutMeasureDataResponse putMeasureDataWithOptions(PutMeasureDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiType)) {
            query.put("ApiType", request.apiType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.compressed)) {
            query.put("Compressed", request.compressed);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.data)) {
            query.put("Data", request.data);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataType)) {
            query.put("DataType", request.dataType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainCode)) {
            query.put("DomainCode", request.domainCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            query.put("Filter", request.filter);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutMeasureData"),
            new TeaPair("version", "2016-06-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PutMeasureDataResponse());
    }

    public PutMeasureDataResponse putMeasureData(PutMeasureDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.putMeasureDataWithOptions(request, runtime);
    }

    public PutMeasureDataByProxyResponse putMeasureDataByProxyWithOptions(PutMeasureDataByProxyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiType)) {
            query.put("ApiType", request.apiType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.compressed)) {
            query.put("Compressed", request.compressed);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.data)) {
            query.put("Data", request.data);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataType)) {
            query.put("DataType", request.dataType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainCode)) {
            query.put("DomainCode", request.domainCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            query.put("Filter", request.filter);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutMeasureDataByProxy"),
            new TeaPair("version", "2016-06-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PutMeasureDataByProxyResponse());
    }

    public PutMeasureDataByProxyResponse putMeasureDataByProxy(PutMeasureDataByProxyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.putMeasureDataByProxyWithOptions(request, runtime);
    }

    public PutReadyFlagResponse putReadyFlagWithOptions(PutReadyFlagRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiType)) {
            query.put("ApiType", request.apiType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.compressed)) {
            query.put("Compressed", request.compressed);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.data)) {
            query.put("Data", request.data);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataType)) {
            query.put("DataType", request.dataType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainCode)) {
            query.put("DomainCode", request.domainCode);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutReadyFlag"),
            new TeaPair("version", "2016-06-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PutReadyFlagResponse());
    }

    public PutReadyFlagResponse putReadyFlag(PutReadyFlagRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.putReadyFlagWithOptions(request, runtime);
    }

    public PutReadyFlagByProxyResponse putReadyFlagByProxyWithOptions(PutReadyFlagByProxyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiType)) {
            query.put("ApiType", request.apiType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.compressed)) {
            query.put("Compressed", request.compressed);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.data)) {
            query.put("Data", request.data);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataType)) {
            query.put("DataType", request.dataType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainCode)) {
            query.put("DomainCode", request.domainCode);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutReadyFlagByProxy"),
            new TeaPair("version", "2016-06-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PutReadyFlagByProxyResponse());
    }

    public PutReadyFlagByProxyResponse putReadyFlagByProxy(PutReadyFlagByProxyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.putReadyFlagByProxyWithOptions(request, runtime);
    }
}
