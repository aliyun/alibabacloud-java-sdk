// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.serverless20210924;

import com.aliyun.tea.*;
import com.aliyun.serverless20210924.models.*;
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
        this._endpoint = this.getEndpoint("serverless", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public CreateApplicationResponse createApplication(CreateApplicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createApplicationWithOptions(request, headers, runtime);
    }

    public CreateApplicationResponse createApplicationWithOptions(CreateApplicationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(TeaModel.buildMap(request.body)))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateApplication"),
            new TeaPair("version", "2021-09-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/apis/serverlessdeployment/v1/applications"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateApplicationResponse());
    }

    public CreateReleaseResponse createRelease(String appName, CreateReleaseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createReleaseWithOptions(appName, request, headers, runtime);
    }

    public CreateReleaseResponse createReleaseWithOptions(String appName, CreateReleaseRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        appName = com.aliyun.openapiutil.Client.getEncodeParam(appName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(TeaModel.buildMap(request.body)))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRelease"),
            new TeaPair("version", "2021-09-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/apis/serverlessdeployment/v1/applications/" + appName + "/releases"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateReleaseResponse());
    }

    public DeleteApplicationResponse deleteApplication(String name) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteApplicationWithOptions(name, headers, runtime);
    }

    public DeleteApplicationResponse deleteApplicationWithOptions(String name, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        name = com.aliyun.openapiutil.Client.getEncodeParam(name);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteApplication"),
            new TeaPair("version", "2021-09-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/apis/serverlessdeployment/v1/applications/" + name + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "string")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteApplicationResponse());
    }

    public DeleteTemplateResponse deleteTemplate(String name, DeleteTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteTemplateWithOptions(name, request, headers, runtime);
    }

    public DeleteTemplateResponse deleteTemplateWithOptions(String name, DeleteTemplateRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        name = com.aliyun.openapiutil.Client.getEncodeParam(name);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            query.put("version", request.version);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTemplate"),
            new TeaPair("version", "2021-09-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/apis/serverlessdeployment/v1/templates/" + name + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTemplateResponse());
    }

    public GetApplicationResponse getApplication(String name) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getApplicationWithOptions(name, headers, runtime);
    }

    public GetApplicationResponse getApplicationWithOptions(String name, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        name = com.aliyun.openapiutil.Client.getEncodeParam(name);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetApplication"),
            new TeaPair("version", "2021-09-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/apis/serverlessdeployment/v1/applications/" + name + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetApplicationResponse());
    }

    public GetEnvironmentResponse getEnvironment(String name) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getEnvironmentWithOptions(name, headers, runtime);
    }

    public GetEnvironmentResponse getEnvironmentWithOptions(String name, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        name = com.aliyun.openapiutil.Client.getEncodeParam(name);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEnvironment"),
            new TeaPair("version", "2021-09-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/apis/serverlessdeployment/v1/environments/" + name + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetEnvironmentResponse());
    }

    public GetReleaseResponse getRelease(String appName, String versionId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getReleaseWithOptions(appName, versionId, headers, runtime);
    }

    public GetReleaseResponse getReleaseWithOptions(String appName, String versionId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        appName = com.aliyun.openapiutil.Client.getEncodeParam(appName);
        versionId = com.aliyun.openapiutil.Client.getEncodeParam(versionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRelease"),
            new TeaPair("version", "2021-09-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/apis/serverlessdeployment/v1/applications/" + appName + "/releases/" + versionId + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetReleaseResponse());
    }

    public GetServiceResponse getService(String name) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getServiceWithOptions(name, headers, runtime);
    }

    public GetServiceResponse getServiceWithOptions(String name, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        name = com.aliyun.openapiutil.Client.getEncodeParam(name);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetService"),
            new TeaPair("version", "2021-09-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/apis/serverlessdeployment/v1/services/" + name + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetServiceResponse());
    }

    public GetTemplateResponse getTemplate(String name, GetTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTemplateWithOptions(name, request, headers, runtime);
    }

    public GetTemplateResponse getTemplateWithOptions(String name, GetTemplateRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        name = com.aliyun.openapiutil.Client.getEncodeParam(name);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            query.put("version", request.version);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTemplate"),
            new TeaPair("version", "2021-09-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/apis/serverlessdeployment/v1/templates/" + name + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTemplateResponse());
    }

    public ListEnvironmentRevisionsResponse listEnvironmentRevisions(ListEnvironmentRevisionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listEnvironmentRevisionsWithOptions(request, headers, runtime);
    }

    public ListEnvironmentRevisionsResponse listEnvironmentRevisionsWithOptions(ListEnvironmentRevisionsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.environmentName)) {
            query.put("environmentName", request.environmentName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEnvironmentRevisions"),
            new TeaPair("version", "2021-09-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/apis/serverlessdeployment/v1/environmentrevisions/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "array")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEnvironmentRevisionsResponse());
    }

    public ListEnvironmentsResponse listEnvironments() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listEnvironmentsWithOptions(headers, runtime);
    }

    public ListEnvironmentsResponse listEnvironmentsWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEnvironments"),
            new TeaPair("version", "2021-09-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/apis/serverlessdeployment/v1/environments/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "array")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEnvironmentsResponse());
    }

    public ListServiceRevisionsResponse listServiceRevisions(ListServiceRevisionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listServiceRevisionsWithOptions(request, headers, runtime);
    }

    public ListServiceRevisionsResponse listServiceRevisionsWithOptions(ListServiceRevisionsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            query.put("serviceName", request.serviceName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListServiceRevisions"),
            new TeaPair("version", "2021-09-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/apis/serverlessdeployment/v1/servicerevisions/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "array")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListServiceRevisionsResponse());
    }

    public ListServicesResponse listServices() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listServicesWithOptions(headers, runtime);
    }

    public ListServicesResponse listServicesWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListServices"),
            new TeaPair("version", "2021-09-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/apis/serverlessdeployment/v1/services/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "array")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListServicesResponse());
    }

    public ListTemplateRevisionsResponse listTemplateRevisions(ListTemplateRevisionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTemplateRevisionsWithOptions(request, headers, runtime);
    }

    public ListTemplateRevisionsResponse listTemplateRevisionsWithOptions(ListTemplateRevisionsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.templateName)) {
            query.put("templateName", request.templateName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateVersion)) {
            query.put("templateVersion", request.templateVersion);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTemplateRevisions"),
            new TeaPair("version", "2021-09-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/apis/serverlessdeployment/v1/templaterevisions/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "array")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTemplateRevisionsResponse());
    }

    public ListTemplatesResponse listTemplates(ListTemplatesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTemplatesWithOptions(request, headers, runtime);
    }

    public ListTemplatesResponse listTemplatesWithOptions(ListTemplatesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTemplates"),
            new TeaPair("version", "2021-09-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/apis/serverlessdeployment/v1/templates/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "array")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTemplatesResponse());
    }

    public PutEnvironmentResponse putEnvironment(String name, PutEnvironmentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.putEnvironmentWithOptions(name, request, headers, runtime);
    }

    public PutEnvironmentResponse putEnvironmentWithOptions(String name, PutEnvironmentRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        name = com.aliyun.openapiutil.Client.getEncodeParam(name);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(TeaModel.buildMap(request.body)))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutEnvironment"),
            new TeaPair("version", "2021-09-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/apis/serverlessdeployment/v1/environments/" + name + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PutEnvironmentResponse());
    }

    public PutServiceResponse putService(String name, PutServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.putServiceWithOptions(name, request, headers, runtime);
    }

    public PutServiceResponse putServiceWithOptions(String name, PutServiceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        name = com.aliyun.openapiutil.Client.getEncodeParam(name);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(TeaModel.buildMap(request.body)))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutService"),
            new TeaPair("version", "2021-09-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/apis/serverlessdeployment/v1/services/" + name + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PutServiceResponse());
    }

    public PutTemplateResponse putTemplate(String name, PutTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.putTemplateWithOptions(name, request, headers, runtime);
    }

    public PutTemplateResponse putTemplateWithOptions(String name, PutTemplateRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        name = com.aliyun.openapiutil.Client.getEncodeParam(name);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            query.put("version", request.version);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(TeaModel.buildMap(request.body)))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutTemplate"),
            new TeaPair("version", "2021-09-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/apis/serverlessdeployment/v1/templates/" + name + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PutTemplateResponse());
    }

    public UpdateApplicationResponse updateApplication(String name, UpdateApplicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateApplicationWithOptions(name, request, headers, runtime);
    }

    public UpdateApplicationResponse updateApplicationWithOptions(String name, UpdateApplicationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        name = com.aliyun.openapiutil.Client.getEncodeParam(name);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(TeaModel.buildMap(request.body)))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateApplication"),
            new TeaPair("version", "2021-09-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/apis/serverlessdeployment/v1/applications/" + name + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateApplicationResponse());
    }
}
