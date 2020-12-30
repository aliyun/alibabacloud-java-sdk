// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320;

import com.aliyun.tea.*;
import com.aliyun.webplus20190320.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-beijing", "webplus.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "webplus.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-shanghai", "webplus.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "webplus.cn-hangzhou.aliyuncs.com"),
            new TeaPair("ap-northeast-1", "webplus.aliyuncs.com"),
            new TeaPair("ap-south-1", "webplus.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "webplus.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "webplus.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "webplus.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "webplus.aliyuncs.com"),
            new TeaPair("cn-chengdu", "webplus.aliyuncs.com"),
            new TeaPair("cn-hongkong", "webplus-vpc.cn-hongkong.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "webplus.aliyuncs.com"),
            new TeaPair("cn-qingdao", "webplus.aliyuncs.com"),
            new TeaPair("eu-central-1", "webplus.aliyuncs.com"),
            new TeaPair("eu-west-1", "webplus.aliyuncs.com"),
            new TeaPair("me-east-1", "webplus.aliyuncs.com"),
            new TeaPair("us-east-1", "webplus.aliyuncs.com"),
            new TeaPair("us-west-1", "webplus.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "webplus.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "webplus.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "webplus.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "webplus.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("webplus", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AbortChangeResponse abortChange(AbortChangeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.abortChangeWithOptions(request, headers, runtime);
    }

    public AbortChangeResponse abortChangeWithOptions(AbortChangeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.changeId)) {
            body.put("ChangeId", request.changeId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequestWithForm("AbortChange", "2019-03-20", "HTTPS", "POST", "AK", "/pop/v1/wam/change/abort", "json", req, runtime), new AbortChangeResponse());
    }

    public CreateAppEnvResponse createAppEnv(CreateAppEnvRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAppEnvWithOptions(request, headers, runtime);
    }

    public CreateAppEnvResponse createAppEnvWithOptions(CreateAppEnvRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.envName)) {
            body.put("EnvName", request.envName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.envDescription)) {
            body.put("EnvDescription", request.envDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stackId)) {
            body.put("StackId", request.stackId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pkgVersionId)) {
            body.put("PkgVersionId", request.pkgVersionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.optionSettings)) {
            body.put("OptionSettings", request.optionSettings);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.profileName)) {
            body.put("ProfileName", request.profileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEnvId)) {
            body.put("SourceEnvId", request.sourceEnvId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            body.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extraProperties)) {
            body.put("ExtraProperties", request.extraProperties);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequestWithForm("CreateAppEnv", "2019-03-20", "HTTPS", "POST", "AK", "/pop/v1/wam/appEnv", "json", req, runtime), new CreateAppEnvResponse());
    }

    public CreateApplicationResponse createApplication(CreateApplicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createApplicationWithOptions(request, headers, runtime);
    }

    public CreateApplicationResponse createApplicationWithOptions(CreateApplicationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            body.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appDescription)) {
            body.put("AppDescription", request.appDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.categoryName)) {
            body.put("CategoryName", request.categoryName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.usingSharedStorage)) {
            body.put("UsingSharedStorage", request.usingSharedStorage);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequestWithForm("CreateApplication", "2019-03-20", "HTTPS", "POST", "AK", "/pop/v1/wam/application", "json", req, runtime), new CreateApplicationResponse());
    }

    public CreateConfigTemplateResponse createConfigTemplate(CreateConfigTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createConfigTemplateWithOptions(request, headers, runtime);
    }

    public CreateConfigTemplateResponse createConfigTemplateWithOptions(CreateConfigTemplateRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.templateName)) {
            body.put("TemplateName", request.templateName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateDescription)) {
            body.put("TemplateDescription", request.templateDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stackId)) {
            body.put("StackId", request.stackId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceTemplateId)) {
            body.put("SourceTemplateId", request.sourceTemplateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEnvId)) {
            body.put("SourceEnvId", request.sourceEnvId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.profileName)) {
            body.put("ProfileName", request.profileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pkgVersionId)) {
            body.put("PkgVersionId", request.pkgVersionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.optionSettings)) {
            body.put("OptionSettings", request.optionSettings);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequestWithForm("CreateConfigTemplate", "2019-03-20", "HTTPS", "POST", "AK", "/pop/v1/wam/configTemplate", "json", req, runtime), new CreateConfigTemplateResponse());
    }

    public CreateOrderResponse createOrder(CreateOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createOrderWithOptions(request, headers, runtime);
    }

    public CreateOrderResponse createOrderWithOptions(CreateOrderRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.productName)) {
            body.put("ProductName", request.productName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequestWithForm("CreateOrder", "2019-03-20", "HTTPS", "POST", "AK", "/pop/v1/paas/createOrder", "json", req, runtime), new CreateOrderResponse());
    }

    public CreatePkgVersionResponse createPkgVersion(CreatePkgVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createPkgVersionWithOptions(request, headers, runtime);
    }

    public CreatePkgVersionResponse createPkgVersionWithOptions(CreatePkgVersionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pkgVersionLabel)) {
            body.put("PkgVersionLabel", request.pkgVersionLabel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pkgVersionDescription)) {
            body.put("PkgVersionDescription", request.pkgVersionDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.packageSource)) {
            body.put("PackageSource", request.packageSource);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequestWithForm("CreatePkgVersion", "2019-03-20", "HTTPS", "POST", "AK", "/pop/v1/wam/pkgVersion", "json", req, runtime), new CreatePkgVersionResponse());
    }

    public CreateStorageResponse createStorage() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createStorageWithOptions(headers, runtime);
    }

    public CreateStorageResponse createStorageWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("CreateStorage", "2019-03-20", "HTTPS", "POST", "AK", "/pop/v1/wam/storage", "json", req, runtime), new CreateStorageResponse());
    }

    public DeleteAppEnvResponse deleteAppEnv(DeleteAppEnvRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteAppEnvWithOptions(request, headers, runtime);
    }

    public DeleteAppEnvResponse deleteAppEnvWithOptions(DeleteAppEnvRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.envId)) {
            query.put("EnvId", request.envId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DeleteAppEnv", "2019-03-20", "HTTPS", "DELETE", "AK", "/pop/v1/wam/appEnv", "json", req, runtime), new DeleteAppEnvResponse());
    }

    public DeleteApplicationResponse deleteApplication(DeleteApplicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteApplicationWithOptions(request, headers, runtime);
    }

    public DeleteApplicationResponse deleteApplicationWithOptions(DeleteApplicationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DeleteApplication", "2019-03-20", "HTTPS", "DELETE", "AK", "/pop/v1/wam/application", "json", req, runtime), new DeleteApplicationResponse());
    }

    public DeleteChangeResponse deleteChange(DeleteChangeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteChangeWithOptions(request, headers, runtime);
    }

    public DeleteChangeResponse deleteChangeWithOptions(DeleteChangeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.changeId)) {
            query.put("ChangeId", request.changeId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DeleteChange", "2019-03-20", "HTTPS", "DELETE", "AK", "/pop/v1/wam/change", "json", req, runtime), new DeleteChangeResponse());
    }

    public DeleteConfigTemplateResponse deleteConfigTemplate(DeleteConfigTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteConfigTemplateWithOptions(request, headers, runtime);
    }

    public DeleteConfigTemplateResponse deleteConfigTemplateWithOptions(DeleteConfigTemplateRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DeleteConfigTemplate", "2019-03-20", "HTTPS", "DELETE", "AK", "/pop/v1/wam/configTemplate", "json", req, runtime), new DeleteConfigTemplateResponse());
    }

    public DeletePkgVersionResponse deletePkgVersion(DeletePkgVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deletePkgVersionWithOptions(request, headers, runtime);
    }

    public DeletePkgVersionResponse deletePkgVersionWithOptions(DeletePkgVersionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pkgVersionId)) {
            query.put("PkgVersionId", request.pkgVersionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DeletePkgVersion", "2019-03-20", "HTTPS", "DELETE", "AK", "/pop/v1/wam/pkgVersion", "json", req, runtime), new DeletePkgVersionResponse());
    }

    public DeployAppEnvResponse deployAppEnv(DeployAppEnvRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deployAppEnvWithOptions(request, headers, runtime);
    }

    public DeployAppEnvResponse deployAppEnvWithOptions(DeployAppEnvRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.envId)) {
            body.put("EnvId", request.envId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.batchSize)) {
            body.put("BatchSize", request.batchSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.batchPercent)) {
            body.put("BatchPercent", request.batchPercent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.batchInterval)) {
            body.put("BatchInterval", request.batchInterval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pauseBetweenBatches)) {
            body.put("PauseBetweenBatches", request.pauseBetweenBatches);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pkgVersionId)) {
            body.put("PkgVersionId", request.pkgVersionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequestWithForm("DeployAppEnv", "2019-03-20", "HTTPS", "POST", "AK", "/pop/v1/wam/appEnv/deploy", "json", req, runtime), new DeployAppEnvResponse());
    }

    public DescribeAppEnvInstanceHealthResponse describeAppEnvInstanceHealth(DescribeAppEnvInstanceHealthRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeAppEnvInstanceHealthWithOptions(request, headers, runtime);
    }

    public DescribeAppEnvInstanceHealthResponse describeAppEnvInstanceHealthWithOptions(DescribeAppEnvInstanceHealthRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.envId)) {
            query.put("EnvId", request.envId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DescribeAppEnvInstanceHealth", "2019-03-20", "HTTPS", "GET", "AK", "/pop/v1/wam/appEnv/instanceHealth", "json", req, runtime), new DescribeAppEnvInstanceHealthResponse());
    }

    public DescribeAppEnvsResponse describeAppEnvs(DescribeAppEnvsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeAppEnvsWithOptions(request, headers, runtime);
    }

    public DescribeAppEnvsResponse describeAppEnvsWithOptions(DescribeAppEnvsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.envId)) {
            query.put("EnvId", request.envId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includeTerminated)) {
            query.put("IncludeTerminated", request.includeTerminated);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.envName)) {
            query.put("EnvName", request.envName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.envSearch)) {
            query.put("EnvSearch", request.envSearch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recentUpdated)) {
            query.put("RecentUpdated", request.recentUpdated);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stackSearch)) {
            query.put("StackSearch", request.stackSearch);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DescribeAppEnvs", "2019-03-20", "HTTPS", "GET", "AK", "/pop/v1/wam/appEnv", "json", req, runtime), new DescribeAppEnvsResponse());
    }

    public DescribeAppEnvStatusResponse describeAppEnvStatus(DescribeAppEnvStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeAppEnvStatusWithOptions(request, headers, runtime);
    }

    public DescribeAppEnvStatusResponse describeAppEnvStatusWithOptions(DescribeAppEnvStatusRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.envId)) {
            query.put("EnvId", request.envId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DescribeAppEnvStatus", "2019-03-20", "HTTPS", "GET", "AK", "/pop/v1/wam/appEnv/status", "json", req, runtime), new DescribeAppEnvStatusResponse());
    }

    public DescribeApplicationsResponse describeApplications(DescribeApplicationsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeApplicationsWithOptions(request, headers, runtime);
    }

    public DescribeApplicationsResponse describeApplicationsWithOptions(DescribeApplicationsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appSearch)) {
            query.put("AppSearch", request.appSearch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.envSearch)) {
            query.put("EnvSearch", request.envSearch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stackSearch)) {
            query.put("StackSearch", request.stackSearch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.categorySearch)) {
            query.put("CategorySearch", request.categorySearch);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DescribeApplications", "2019-03-20", "HTTPS", "GET", "AK", "/pop/v1/wam/application", "json", req, runtime), new DescribeApplicationsResponse());
    }

    public DescribeCategoriesResponse describeCategories() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeCategoriesWithOptions(headers, runtime);
    }

    public DescribeCategoriesResponse describeCategoriesWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DescribeCategories", "2019-03-20", "HTTPS", "GET", "AK", "/pop/v1/wam/category", "json", req, runtime), new DescribeCategoriesResponse());
    }

    public DescribeChangeResponse describeChange(DescribeChangeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeChangeWithOptions(request, headers, runtime);
    }

    public DescribeChangeResponse describeChangeWithOptions(DescribeChangeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.envId)) {
            query.put("EnvId", request.envId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.changeId)) {
            query.put("ChangeId", request.changeId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DescribeChange", "2019-03-20", "HTTPS", "GET", "AK", "/pop/v1/wam/changeInfo", "json", req, runtime), new DescribeChangeResponse());
    }

    public DescribeChangesResponse describeChanges(DescribeChangesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeChangesWithOptions(request, headers, runtime);
    }

    public DescribeChangesResponse describeChangesWithOptions(DescribeChangesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.envId)) {
            query.put("EnvId", request.envId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.actionName)) {
            query.put("ActionName", request.actionName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DescribeChanges", "2019-03-20", "HTTPS", "GET", "AK", "/pop/v1/wam/change", "json", req, runtime), new DescribeChangesResponse());
    }

    public DescribeConfigIndexResponse describeConfigIndex(DescribeConfigIndexRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeConfigIndexWithOptions(request, headers, runtime);
    }

    public DescribeConfigIndexResponse describeConfigIndexWithOptions(DescribeConfigIndexRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.stackId)) {
            query.put("StackId", request.stackId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.envId)) {
            query.put("EnvId", request.envId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.profileName)) {
            query.put("ProfileName", request.profileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DescribeConfigIndex", "2019-03-20", "HTTPS", "GET", "AK", "/pop/v1/wam/config/configIndex", "json", req, runtime), new DescribeConfigIndexResponse());
    }

    public DescribeConfigOptionsResponse describeConfigOptions(DescribeConfigOptionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeConfigOptionsWithOptions(request, headers, runtime);
    }

    public DescribeConfigOptionsResponse describeConfigOptionsWithOptions(DescribeConfigOptionsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.stackId)) {
            query.put("StackId", request.stackId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.envId)) {
            query.put("EnvId", request.envId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.profileName)) {
            query.put("ProfileName", request.profileName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DescribeConfigOptions", "2019-03-20", "HTTPS", "GET", "AK", "/pop/v1/wam/config/configOption", "json", req, runtime), new DescribeConfigOptionsResponse());
    }

    public DescribeConfigSettingsResponse describeConfigSettings(DescribeConfigSettingsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeConfigSettingsWithOptions(request, headers, runtime);
    }

    public DescribeConfigSettingsResponse describeConfigSettingsWithOptions(DescribeConfigSettingsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.envId)) {
            query.put("EnvId", request.envId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pathName)) {
            query.put("PathName", request.pathName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.optionName)) {
            query.put("OptionName", request.optionName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DescribeConfigSettings", "2019-03-20", "HTTPS", "GET", "AK", "/pop/v1/wam/config/configSetting", "json", req, runtime), new DescribeConfigSettingsResponse());
    }

    public DescribeConfigTemplatesResponse describeConfigTemplates(DescribeConfigTemplatesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeConfigTemplatesWithOptions(request, headers, runtime);
    }

    public DescribeConfigTemplatesResponse describeConfigTemplatesWithOptions(DescribeConfigTemplatesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateName)) {
            query.put("TemplateName", request.templateName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateSearch)) {
            query.put("TemplateSearch", request.templateSearch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DescribeConfigTemplates", "2019-03-20", "HTTPS", "GET", "AK", "/pop/v1/wam/configTemplate", "json", req, runtime), new DescribeConfigTemplatesResponse());
    }

    public DescribeEnvResourceResponse describeEnvResource(DescribeEnvResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeEnvResourceWithOptions(request, headers, runtime);
    }

    public DescribeEnvResourceResponse describeEnvResourceWithOptions(DescribeEnvResourceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.envId)) {
            query.put("EnvId", request.envId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DescribeEnvResource", "2019-03-20", "HTTPS", "GET", "AK", "/pop/v1/wam/envResource", "json", req, runtime), new DescribeEnvResourceResponse());
    }

    public DescribeEventsResponse describeEvents(DescribeEventsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeEventsWithOptions(request, headers, runtime);
    }

    public DescribeEventsResponse describeEventsWithOptions(DescribeEventsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.envId)) {
            query.put("EnvId", request.envId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.changeId)) {
            query.put("ChangeId", request.changeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lastChangeEvents)) {
            query.put("LastChangeEvents", request.lastChangeEvents);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reverseByTimestamp)) {
            query.put("ReverseByTimestamp", request.reverseByTimestamp);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DescribeEvents", "2019-03-20", "HTTPS", "GET", "AK", "/pop/v1/wam/event", "json", req, runtime), new DescribeEventsResponse());
    }

    public DescribeGatherLogResultResponse describeGatherLogResult(DescribeGatherLogResultRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeGatherLogResultWithOptions(request, headers, runtime);
    }

    public DescribeGatherLogResultResponse describeGatherLogResultWithOptions(DescribeGatherLogResultRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.changeId)) {
            query.put("ChangeId", request.changeId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DescribeGatherLogResult", "2019-03-20", "HTTPS", "GET", "AK", "/pop/v1/wam/appEnv/gatherLog", "json", req, runtime), new DescribeGatherLogResultResponse());
    }

    public DescribeGatherStatsResultResponse describeGatherStatsResult(DescribeGatherStatsResultRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeGatherStatsResultWithOptions(request, headers, runtime);
    }

    public DescribeGatherStatsResultResponse describeGatherStatsResultWithOptions(DescribeGatherStatsResultRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.changeId)) {
            query.put("ChangeId", request.changeId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DescribeGatherStatsResult", "2019-03-20", "HTTPS", "GET", "AK", "/pop/v1/wam/appEnv/gatherStats", "json", req, runtime), new DescribeGatherStatsResultResponse());
    }

    public DescribeInstanceHealthResponse describeInstanceHealth(DescribeInstanceHealthRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeInstanceHealthWithOptions(request, headers, runtime);
    }

    public DescribeInstanceHealthResponse describeInstanceHealthWithOptions(DescribeInstanceHealthRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DescribeInstanceHealth", "2019-03-20", "HTTPS", "GET", "AK", "/pop/v1/wam/instance/health", "json", req, runtime), new DescribeInstanceHealthResponse());
    }

    public DescribePkgVersionsResponse describePkgVersions(DescribePkgVersionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describePkgVersionsWithOptions(request, headers, runtime);
    }

    public DescribePkgVersionsResponse describePkgVersionsWithOptions(DescribePkgVersionsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pkgVersionLabel)) {
            query.put("PkgVersionLabel", request.pkgVersionLabel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pkgVersionSearch)) {
            query.put("PkgVersionSearch", request.pkgVersionSearch);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DescribePkgVersions", "2019-03-20", "HTTPS", "GET", "AK", "/pop/v1/wam/pkgVersion", "json", req, runtime), new DescribePkgVersionsResponse());
    }

    public DescribePublicConfigTemplatesResponse describePublicConfigTemplates(DescribePublicConfigTemplatesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describePublicConfigTemplatesWithOptions(request, headers, runtime);
    }

    public DescribePublicConfigTemplatesResponse describePublicConfigTemplatesWithOptions(DescribePublicConfigTemplatesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.categoryName)) {
            query.put("CategoryName", request.categoryName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DescribePublicConfigTemplates", "2019-03-20", "HTTPS", "GET", "AK", "/pop/v1/wam/publicConfigTemplate", "json", req, runtime), new DescribePublicConfigTemplatesResponse());
    }

    public DescribeStacksResponse describeStacks(DescribeStacksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeStacksWithOptions(request, headers, runtime);
    }

    public DescribeStacksResponse describeStacksWithOptions(DescribeStacksRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.recommendedOnly)) {
            query.put("RecommendedOnly", request.recommendedOnly);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.categoryName)) {
            query.put("CategoryName", request.categoryName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DescribeStacks", "2019-03-20", "HTTPS", "GET", "AK", "/pop/v1/wam/stack", "json", req, runtime), new DescribeStacksResponse());
    }

    public DescribeStorageResponse describeStorage(DescribeStorageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeStorageWithOptions(request, headers, runtime);
    }

    public DescribeStorageResponse describeStorageWithOptions(DescribeStorageRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.usingSharedStorage)) {
            query.put("UsingSharedStorage", request.usingSharedStorage);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DescribeStorage", "2019-03-20", "HTTPS", "GET", "AK", "/pop/v1/wam/storage", "json", req, runtime), new DescribeStorageResponse());
    }

    public GatherAppEnvLogResponse gatherAppEnvLog(GatherAppEnvLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.gatherAppEnvLogWithOptions(request, headers, runtime);
    }

    public GatherAppEnvLogResponse gatherAppEnvLogWithOptions(GatherAppEnvLogRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.envId)) {
            body.put("EnvId", request.envId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetInstances)) {
            body.put("TargetInstances", request.targetInstances);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logPath)) {
            body.put("LogPath", request.logPath);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequestWithForm("GatherAppEnvLog", "2019-03-20", "HTTPS", "POST", "AK", "/pop/v1/wam/appEnv/gatherLog", "json", req, runtime), new GatherAppEnvLogResponse());
    }

    public GatherAppEnvStatsResponse gatherAppEnvStats(GatherAppEnvStatsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.gatherAppEnvStatsWithOptions(request, headers, runtime);
    }

    public GatherAppEnvStatsResponse gatherAppEnvStatsWithOptions(GatherAppEnvStatsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.envId)) {
            body.put("EnvId", request.envId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetInstances)) {
            body.put("TargetInstances", request.targetInstances);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequestWithForm("GatherAppEnvStats", "2019-03-20", "HTTPS", "POST", "AK", "/pop/v1/wam/appEnv/gatherStats", "json", req, runtime), new GatherAppEnvStatsResponse());
    }

    public PauseChangeResponse pauseChange(PauseChangeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pauseChangeWithOptions(request, headers, runtime);
    }

    public PauseChangeResponse pauseChangeWithOptions(PauseChangeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.changeId)) {
            body.put("ChangeId", request.changeId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequestWithForm("PauseChange", "2019-03-20", "HTTPS", "POST", "AK", "/pop/v1/wam/change/pause", "json", req, runtime), new PauseChangeResponse());
    }

    public RebuildAppEnvResponse rebuildAppEnv(RebuildAppEnvRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.rebuildAppEnvWithOptions(request, headers, runtime);
    }

    public RebuildAppEnvResponse rebuildAppEnvWithOptions(RebuildAppEnvRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.envId)) {
            body.put("EnvId", request.envId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequestWithForm("RebuildAppEnv", "2019-03-20", "HTTPS", "POST", "AK", "/pop/v1/wam/appEnv/rebuild", "json", req, runtime), new RebuildAppEnvResponse());
    }

    public RestartAppEnvResponse restartAppEnv(RestartAppEnvRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.restartAppEnvWithOptions(request, headers, runtime);
    }

    public RestartAppEnvResponse restartAppEnvWithOptions(RestartAppEnvRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.envId)) {
            body.put("EnvId", request.envId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.batchSize)) {
            body.put("BatchSize", request.batchSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.batchPercent)) {
            body.put("BatchPercent", request.batchPercent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.batchInterval)) {
            body.put("BatchInterval", request.batchInterval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pauseBetweenBatches)) {
            body.put("PauseBetweenBatches", request.pauseBetweenBatches);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequestWithForm("RestartAppEnv", "2019-03-20", "HTTPS", "POST", "AK", "/pop/v1/wam/appEnv/restart", "json", req, runtime), new RestartAppEnvResponse());
    }

    public ResumeChangeResponse resumeChange(ResumeChangeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.resumeChangeWithOptions(request, headers, runtime);
    }

    public ResumeChangeResponse resumeChangeWithOptions(ResumeChangeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.changeId)) {
            body.put("ChangeId", request.changeId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequestWithForm("ResumeChange", "2019-03-20", "HTTPS", "POST", "AK", "/pop/v1/wam/change/resume", "json", req, runtime), new ResumeChangeResponse());
    }

    public StartAppEnvResponse startAppEnv(StartAppEnvRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startAppEnvWithOptions(request, headers, runtime);
    }

    public StartAppEnvResponse startAppEnvWithOptions(StartAppEnvRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.envId)) {
            body.put("EnvId", request.envId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequestWithForm("StartAppEnv", "2019-03-20", "HTTPS", "POST", "AK", "/pop/v1/wam/appEnv/start", "json", req, runtime), new StartAppEnvResponse());
    }

    public StopAppEnvResponse stopAppEnv(StopAppEnvRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopAppEnvWithOptions(request, headers, runtime);
    }

    public StopAppEnvResponse stopAppEnvWithOptions(StopAppEnvRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.envId)) {
            body.put("EnvId", request.envId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequestWithForm("StopAppEnv", "2019-03-20", "HTTPS", "POST", "AK", "/pop/v1/wam/appEnv/stop", "json", req, runtime), new StopAppEnvResponse());
    }

    public TerminateAppEnvResponse terminateAppEnv(TerminateAppEnvRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.terminateAppEnvWithOptions(request, headers, runtime);
    }

    public TerminateAppEnvResponse terminateAppEnvWithOptions(TerminateAppEnvRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.envId)) {
            body.put("EnvId", request.envId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequestWithForm("TerminateAppEnv", "2019-03-20", "HTTPS", "POST", "AK", "/pop/v1/wam/appEnv/terminate", "json", req, runtime), new TerminateAppEnvResponse());
    }

    public UpdateAppEnvResponse updateAppEnv(UpdateAppEnvRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateAppEnvWithOptions(request, headers, runtime);
    }

    public UpdateAppEnvResponse updateAppEnvWithOptions(UpdateAppEnvRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.envDescription)) {
            body.put("EnvDescription", request.envDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.envId)) {
            body.put("EnvId", request.envId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pkgVersionId)) {
            body.put("PkgVersionId", request.pkgVersionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.optionSettings)) {
            body.put("OptionSettings", request.optionSettings);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stackId)) {
            body.put("StackId", request.stackId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extraProperties)) {
            body.put("ExtraProperties", request.extraProperties);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.batchSize)) {
            body.put("BatchSize", request.batchSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.batchPercent)) {
            body.put("BatchPercent", request.batchPercent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.batchInterval)) {
            body.put("BatchInterval", request.batchInterval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pauseBetweenBatches)) {
            body.put("PauseBetweenBatches", request.pauseBetweenBatches);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequestWithForm("UpdateAppEnv", "2019-03-20", "HTTPS", "PUT", "AK", "/pop/v1/wam/appEnv", "json", req, runtime), new UpdateAppEnvResponse());
    }

    public UpdateApplicationResponse updateApplication(UpdateApplicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateApplicationWithOptions(request, headers, runtime);
    }

    public UpdateApplicationResponse updateApplicationWithOptions(UpdateApplicationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appDescription)) {
            body.put("AppDescription", request.appDescription);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequestWithForm("UpdateApplication", "2019-03-20", "HTTPS", "PUT", "AK", "/pop/v1/wam/application", "json", req, runtime), new UpdateApplicationResponse());
    }

    public UpdateConfigTemplateResponse updateConfigTemplate(UpdateConfigTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateConfigTemplateWithOptions(request, headers, runtime);
    }

    public UpdateConfigTemplateResponse updateConfigTemplateWithOptions(UpdateConfigTemplateRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.templateDescription)) {
            body.put("TemplateDescription", request.templateDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            body.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.optionSettings)) {
            body.put("OptionSettings", request.optionSettings);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequestWithForm("UpdateConfigTemplate", "2019-03-20", "HTTPS", "PUT", "AK", "/pop/v1/wam/configTemplate", "json", req, runtime), new UpdateConfigTemplateResponse());
    }

    public ValidateConfigSettingResponse validateConfigSetting(ValidateConfigSettingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.validateConfigSettingWithOptions(request, headers, runtime);
    }

    public ValidateConfigSettingResponse validateConfigSettingWithOptions(ValidateConfigSettingRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.envId)) {
            body.put("EnvId", request.envId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            body.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stackId)) {
            body.put("StackId", request.stackId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.optionSettings)) {
            body.put("OptionSettings", request.optionSettings);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequestWithForm("ValidateConfigSetting", "2019-03-20", "HTTPS", "POST", "AK", "/pop/v1/wam/config/configSetting/validate", "json", req, runtime), new ValidateConfigSettingResponse());
    }
}
