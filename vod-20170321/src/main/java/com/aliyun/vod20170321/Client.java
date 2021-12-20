// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321;

import com.aliyun.tea.*;
import com.aliyun.vod20170321.models.*;
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
            new TeaPair("ap-northeast-2-pop", "vod.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "vod.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "vod.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "vod.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "vod.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "vod.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "vod.aliyuncs.com"),
            new TeaPair("cn-chengdu", "vod.aliyuncs.com"),
            new TeaPair("cn-edge-1", "vod.aliyuncs.com"),
            new TeaPair("cn-fujian", "vod.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "vod.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "vod.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "vod.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "vod.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "vod.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "vod.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "vod.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "vod.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "vod.aliyuncs.com"),
            new TeaPair("cn-hongkong", "vod.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "vod.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "vod.aliyuncs.com"),
            new TeaPair("cn-huhehaote-nebula-1", "vod.aliyuncs.com"),
            new TeaPair("cn-qingdao", "vod.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "vod.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "vod.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "vod.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "vod.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "vod.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "vod.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "vod.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "vod.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "vod.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "vod.aliyuncs.com"),
            new TeaPair("cn-wuhan", "vod.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "vod.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "vod.aliyuncs.com"),
            new TeaPair("cn-zhangbei", "vod.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "vod.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "vod.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "vod.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "vod.aliyuncs.com"),
            new TeaPair("eu-west-1", "vod.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "vod.aliyuncs.com"),
            new TeaPair("me-east-1", "vod.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "vod.aliyuncs.com"),
            new TeaPair("us-east-1", "vod.aliyuncs.com"),
            new TeaPair("us-west-1", "vod.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("vod", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AddAITemplateResponse addAITemplateWithOptions(AddAITemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("TemplateConfig", request.templateConfig);
        query.put("TemplateName", request.templateName);
        query.put("TemplateType", request.templateType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddAITemplate"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddAITemplateResponse());
    }

    public AddAITemplateResponse addAITemplate(AddAITemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addAITemplateWithOptions(request, runtime);
    }

    public AddCategoryResponse addCategoryWithOptions(AddCategoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CateName", request.cateName);
        query.put("ParentId", request.parentId);
        query.put("Type", request.type);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddCategory"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddCategoryResponse());
    }

    public AddCategoryResponse addCategory(AddCategoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addCategoryWithOptions(request, runtime);
    }

    public AddEditingProjectResponse addEditingProjectWithOptions(AddEditingProjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CoverURL", request.coverURL);
        query.put("Description", request.description);
        query.put("Division", request.division);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("Timeline", request.timeline);
        query.put("Title", request.title);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddEditingProject"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddEditingProjectResponse());
    }

    public AddEditingProjectResponse addEditingProject(AddEditingProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addEditingProjectWithOptions(request, runtime);
    }

    public AddTranscodeTemplateGroupResponse addTranscodeTemplateGroupWithOptions(AddTranscodeTemplateGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppId", request.appId);
        query.put("Name", request.name);
        query.put("TranscodeTemplateGroupId", request.transcodeTemplateGroupId);
        query.put("TranscodeTemplateList", request.transcodeTemplateList);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddTranscodeTemplateGroup"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddTranscodeTemplateGroupResponse());
    }

    public AddTranscodeTemplateGroupResponse addTranscodeTemplateGroup(AddTranscodeTemplateGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addTranscodeTemplateGroupWithOptions(request, runtime);
    }

    public AddVodDomainResponse addVodDomainWithOptions(AddVodDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CheckUrl", request.checkUrl);
        query.put("DomainName", request.domainName);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("Scope", request.scope);
        query.put("SecurityToken", request.securityToken);
        query.put("Sources", request.sources);
        query.put("TopLevelDomain", request.topLevelDomain);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddVodDomain"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddVodDomainResponse());
    }

    public AddVodDomainResponse addVodDomain(AddVodDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addVodDomainWithOptions(request, runtime);
    }

    public AddVodTemplateResponse addVodTemplateWithOptions(AddVodTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppId", request.appId);
        query.put("Name", request.name);
        query.put("TemplateConfig", request.templateConfig);
        query.put("TemplateType", request.templateType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddVodTemplate"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddVodTemplateResponse());
    }

    public AddVodTemplateResponse addVodTemplate(AddVodTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addVodTemplateWithOptions(request, runtime);
    }

    public AddWatermarkResponse addWatermarkWithOptions(AddWatermarkRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppId", request.appId);
        query.put("FileUrl", request.fileUrl);
        query.put("Name", request.name);
        query.put("Type", request.type);
        query.put("WatermarkConfig", request.watermarkConfig);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddWatermark"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddWatermarkResponse());
    }

    public AddWatermarkResponse addWatermark(AddWatermarkRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addWatermarkWithOptions(request, runtime);
    }

    public AttachAppPolicyToIdentityResponse attachAppPolicyToIdentityWithOptions(AttachAppPolicyToIdentityRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppId", request.appId);
        query.put("IdentityName", request.identityName);
        query.put("IdentityType", request.identityType);
        query.put("PolicyNames", request.policyNames);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AttachAppPolicyToIdentity"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AttachAppPolicyToIdentityResponse());
    }

    public AttachAppPolicyToIdentityResponse attachAppPolicyToIdentity(AttachAppPolicyToIdentityRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.attachAppPolicyToIdentityWithOptions(request, runtime);
    }

    public BatchSetVodDomainConfigsResponse batchSetVodDomainConfigsWithOptions(BatchSetVodDomainConfigsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DomainNames", request.domainNames);
        query.put("Functions", request.functions);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchSetVodDomainConfigs"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchSetVodDomainConfigsResponse());
    }

    public BatchSetVodDomainConfigsResponse batchSetVodDomainConfigs(BatchSetVodDomainConfigsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchSetVodDomainConfigsWithOptions(request, runtime);
    }

    public BatchStartVodDomainResponse batchStartVodDomainWithOptions(BatchStartVodDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DomainNames", request.domainNames);
        query.put("OwnerId", request.ownerId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchStartVodDomain"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchStartVodDomainResponse());
    }

    public BatchStartVodDomainResponse batchStartVodDomain(BatchStartVodDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchStartVodDomainWithOptions(request, runtime);
    }

    public BatchStopVodDomainResponse batchStopVodDomainWithOptions(BatchStopVodDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DomainNames", request.domainNames);
        query.put("OwnerId", request.ownerId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchStopVodDomain"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchStopVodDomainResponse());
    }

    public BatchStopVodDomainResponse batchStopVodDomain(BatchStopVodDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchStopVodDomainWithOptions(request, runtime);
    }

    public CancelUrlUploadJobsResponse cancelUrlUploadJobsWithOptions(CancelUrlUploadJobsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("JobIds", request.jobIds);
        query.put("UploadUrls", request.uploadUrls);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelUrlUploadJobs"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelUrlUploadJobsResponse());
    }

    public CancelUrlUploadJobsResponse cancelUrlUploadJobs(CancelUrlUploadJobsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cancelUrlUploadJobsWithOptions(request, runtime);
    }

    public CreateAppInfoResponse createAppInfoWithOptions(CreateAppInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppName", request.appName);
        query.put("Description", request.description);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAppInfo"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAppInfoResponse());
    }

    public CreateAppInfoResponse createAppInfo(CreateAppInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAppInfoWithOptions(request, runtime);
    }

    public CreateAuditResponse createAuditWithOptions(CreateAuditRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AuditContent", request.auditContent);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAudit"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAuditResponse());
    }

    public CreateAuditResponse createAudit(CreateAuditRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAuditWithOptions(request, runtime);
    }

    public CreateUploadAttachedMediaResponse createUploadAttachedMediaWithOptions(CreateUploadAttachedMediaRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppId", request.appId);
        query.put("BusinessType", request.businessType);
        query.put("CateIds", request.cateIds);
        query.put("Description", request.description);
        query.put("FileName", request.fileName);
        query.put("FileSize", request.fileSize);
        query.put("MediaExt", request.mediaExt);
        query.put("StorageLocation", request.storageLocation);
        query.put("Tags", request.tags);
        query.put("Title", request.title);
        query.put("UserData", request.userData);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateUploadAttachedMedia"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateUploadAttachedMediaResponse());
    }

    public CreateUploadAttachedMediaResponse createUploadAttachedMedia(CreateUploadAttachedMediaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createUploadAttachedMediaWithOptions(request, runtime);
    }

    public CreateUploadImageResponse createUploadImageWithOptions(CreateUploadImageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppId", request.appId);
        query.put("CateId", request.cateId);
        query.put("Description", request.description);
        query.put("ImageExt", request.imageExt);
        query.put("ImageType", request.imageType);
        query.put("StorageLocation", request.storageLocation);
        query.put("Tags", request.tags);
        query.put("Title", request.title);
        query.put("UserData", request.userData);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateUploadImage"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateUploadImageResponse());
    }

    public CreateUploadImageResponse createUploadImage(CreateUploadImageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createUploadImageWithOptions(request, runtime);
    }

    public CreateUploadVideoResponse createUploadVideoWithOptions(CreateUploadVideoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppId", request.appId);
        query.put("CateId", request.cateId);
        query.put("CoverURL", request.coverURL);
        query.put("Description", request.description);
        query.put("FileName", request.fileName);
        query.put("FileSize", request.fileSize);
        query.put("StorageLocation", request.storageLocation);
        query.put("Tags", request.tags);
        query.put("TemplateGroupId", request.templateGroupId);
        query.put("Title", request.title);
        query.put("UserData", request.userData);
        query.put("WorkflowId", request.workflowId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateUploadVideo"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateUploadVideoResponse());
    }

    public CreateUploadVideoResponse createUploadVideo(CreateUploadVideoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createUploadVideoWithOptions(request, runtime);
    }

    public CreateVodRealTimeLogDeliveryResponse createVodRealTimeLogDeliveryWithOptions(CreateVodRealTimeLogDeliveryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateVodRealTimeLogDelivery"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateVodRealTimeLogDeliveryResponse());
    }

    public CreateVodRealTimeLogDeliveryResponse createVodRealTimeLogDelivery(CreateVodRealTimeLogDeliveryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createVodRealTimeLogDeliveryWithOptions(request, runtime);
    }

    public DeleteAIImageInfosResponse deleteAIImageInfosWithOptions(DeleteAIImageInfosRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AIImageInfoIds", request.AIImageInfoIds);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAIImageInfos"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAIImageInfosResponse());
    }

    public DeleteAIImageInfosResponse deleteAIImageInfos(DeleteAIImageInfosRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAIImageInfosWithOptions(request, runtime);
    }

    public DeleteAITemplateResponse deleteAITemplateWithOptions(DeleteAITemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("TemplateId", request.templateId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAITemplate"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAITemplateResponse());
    }

    public DeleteAITemplateResponse deleteAITemplate(DeleteAITemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAITemplateWithOptions(request, runtime);
    }

    public DeleteAppInfoResponse deleteAppInfoWithOptions(DeleteAppInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppId", request.appId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAppInfo"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAppInfoResponse());
    }

    public DeleteAppInfoResponse deleteAppInfo(DeleteAppInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAppInfoWithOptions(request, runtime);
    }

    public DeleteAttachedMediaResponse deleteAttachedMediaWithOptions(DeleteAttachedMediaRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("MediaIds", request.mediaIds);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAttachedMedia"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAttachedMediaResponse());
    }

    public DeleteAttachedMediaResponse deleteAttachedMedia(DeleteAttachedMediaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAttachedMediaWithOptions(request, runtime);
    }

    public DeleteCategoryResponse deleteCategoryWithOptions(DeleteCategoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CateId", request.cateId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCategory"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCategoryResponse());
    }

    public DeleteCategoryResponse deleteCategory(DeleteCategoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteCategoryWithOptions(request, runtime);
    }

    public DeleteDynamicImageResponse deleteDynamicImageWithOptions(DeleteDynamicImageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DynamicImageIds", request.dynamicImageIds);
        query.put("VideoId", request.videoId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDynamicImage"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDynamicImageResponse());
    }

    public DeleteDynamicImageResponse deleteDynamicImage(DeleteDynamicImageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDynamicImageWithOptions(request, runtime);
    }

    public DeleteEditingProjectResponse deleteEditingProjectWithOptions(DeleteEditingProjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("ProjectIds", request.projectIds);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteEditingProject"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteEditingProjectResponse());
    }

    public DeleteEditingProjectResponse deleteEditingProject(DeleteEditingProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteEditingProjectWithOptions(request, runtime);
    }

    public DeleteImageResponse deleteImageWithOptions(DeleteImageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DeleteImageType", request.deleteImageType);
        query.put("ImageIds", request.imageIds);
        query.put("ImageType", request.imageType);
        query.put("ImageURLs", request.imageURLs);
        query.put("VideoId", request.videoId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteImage"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteImageResponse());
    }

    public DeleteImageResponse deleteImage(DeleteImageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteImageWithOptions(request, runtime);
    }

    public DeleteMessageCallbackResponse deleteMessageCallbackWithOptions(DeleteMessageCallbackRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppId", request.appId);
        query.put("OwnerAccount", request.ownerAccount);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMessageCallback"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMessageCallbackResponse());
    }

    public DeleteMessageCallbackResponse deleteMessageCallback(DeleteMessageCallbackRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteMessageCallbackWithOptions(request, runtime);
    }

    public DeleteMezzaninesResponse deleteMezzaninesWithOptions(DeleteMezzaninesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Force", request.force);
        query.put("VideoIds", request.videoIds);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMezzanines"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMezzaninesResponse());
    }

    public DeleteMezzaninesResponse deleteMezzanines(DeleteMezzaninesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteMezzaninesWithOptions(request, runtime);
    }

    public DeleteMultipartUploadResponse deleteMultipartUploadWithOptions(DeleteMultipartUploadRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("MediaId", request.mediaId);
        query.put("MediaType", request.mediaType);
        query.put("OwnerAccount", request.ownerAccount);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMultipartUpload"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMultipartUploadResponse());
    }

    public DeleteMultipartUploadResponse deleteMultipartUpload(DeleteMultipartUploadRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteMultipartUploadWithOptions(request, runtime);
    }

    public DeleteStreamResponse deleteStreamWithOptions(DeleteStreamRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("JobIds", request.jobIds);
        query.put("VideoId", request.videoId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteStream"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteStreamResponse());
    }

    public DeleteStreamResponse deleteStream(DeleteStreamRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteStreamWithOptions(request, runtime);
    }

    public DeleteTranscodeTemplateGroupResponse deleteTranscodeTemplateGroupWithOptions(DeleteTranscodeTemplateGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ForceDelGroup", request.forceDelGroup);
        query.put("TranscodeTemplateGroupId", request.transcodeTemplateGroupId);
        query.put("TranscodeTemplateIds", request.transcodeTemplateIds);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTranscodeTemplateGroup"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTranscodeTemplateGroupResponse());
    }

    public DeleteTranscodeTemplateGroupResponse deleteTranscodeTemplateGroup(DeleteTranscodeTemplateGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteTranscodeTemplateGroupWithOptions(request, runtime);
    }

    public DeleteVideoResponse deleteVideoWithOptions(DeleteVideoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("VideoIds", request.videoIds);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteVideo"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteVideoResponse());
    }

    public DeleteVideoResponse deleteVideo(DeleteVideoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteVideoWithOptions(request, runtime);
    }

    public DeleteVodDomainResponse deleteVodDomainWithOptions(DeleteVodDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DomainName", request.domainName);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteVodDomain"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteVodDomainResponse());
    }

    public DeleteVodDomainResponse deleteVodDomain(DeleteVodDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteVodDomainWithOptions(request, runtime);
    }

    public DeleteVodRealtimeLogDeliveryResponse deleteVodRealtimeLogDeliveryWithOptions(DeleteVodRealtimeLogDeliveryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteVodRealtimeLogDelivery"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteVodRealtimeLogDeliveryResponse());
    }

    public DeleteVodRealtimeLogDeliveryResponse deleteVodRealtimeLogDelivery(DeleteVodRealtimeLogDeliveryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteVodRealtimeLogDeliveryWithOptions(request, runtime);
    }

    public DeleteVodSpecificConfigResponse deleteVodSpecificConfigWithOptions(DeleteVodSpecificConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ConfigId", request.configId);
        query.put("DomainName", request.domainName);
        query.put("OwnerId", request.ownerId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteVodSpecificConfig"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteVodSpecificConfigResponse());
    }

    public DeleteVodSpecificConfigResponse deleteVodSpecificConfig(DeleteVodSpecificConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteVodSpecificConfigWithOptions(request, runtime);
    }

    public DeleteVodTemplateResponse deleteVodTemplateWithOptions(DeleteVodTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("VodTemplateId", request.vodTemplateId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteVodTemplate"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteVodTemplateResponse());
    }

    public DeleteVodTemplateResponse deleteVodTemplate(DeleteVodTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteVodTemplateWithOptions(request, runtime);
    }

    public DeleteWatermarkResponse deleteWatermarkWithOptions(DeleteWatermarkRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("WatermarkId", request.watermarkId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteWatermark"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteWatermarkResponse());
    }

    public DeleteWatermarkResponse deleteWatermark(DeleteWatermarkRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteWatermarkWithOptions(request, runtime);
    }

    public DescribePlayTopVideosResponse describePlayTopVideosWithOptions(DescribePlayTopVideosRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizDate", request.bizDate);
        query.put("OwnerId", request.ownerId);
        query.put("PageNo", request.pageNo);
        query.put("PageSize", request.pageSize);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePlayTopVideos"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePlayTopVideosResponse());
    }

    public DescribePlayTopVideosResponse describePlayTopVideos(DescribePlayTopVideosRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describePlayTopVideosWithOptions(request, runtime);
    }

    public DescribePlayUserAvgResponse describePlayUserAvgWithOptions(DescribePlayUserAvgRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("EndTime", request.endTime);
        query.put("OwnerId", request.ownerId);
        query.put("StartTime", request.startTime);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePlayUserAvg"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePlayUserAvgResponse());
    }

    public DescribePlayUserAvgResponse describePlayUserAvg(DescribePlayUserAvgRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describePlayUserAvgWithOptions(request, runtime);
    }

    public DescribePlayUserTotalResponse describePlayUserTotalWithOptions(DescribePlayUserTotalRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("EndTime", request.endTime);
        query.put("OwnerId", request.ownerId);
        query.put("StartTime", request.startTime);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePlayUserTotal"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePlayUserTotalResponse());
    }

    public DescribePlayUserTotalResponse describePlayUserTotal(DescribePlayUserTotalRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describePlayUserTotalWithOptions(request, runtime);
    }

    public DescribePlayVideoStatisResponse describePlayVideoStatisWithOptions(DescribePlayVideoStatisRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("EndTime", request.endTime);
        query.put("OwnerId", request.ownerId);
        query.put("StartTime", request.startTime);
        query.put("VideoId", request.videoId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePlayVideoStatis"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePlayVideoStatisResponse());
    }

    public DescribePlayVideoStatisResponse describePlayVideoStatis(DescribePlayVideoStatisRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describePlayVideoStatisWithOptions(request, runtime);
    }

    public DescribeVodAIDataResponse describeVodAIDataWithOptions(DescribeVodAIDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AIType", request.AIType);
        query.put("EndTime", request.endTime);
        query.put("OwnerId", request.ownerId);
        query.put("Region", request.region);
        query.put("StartTime", request.startTime);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVodAIData"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVodAIDataResponse());
    }

    public DescribeVodAIDataResponse describeVodAIData(DescribeVodAIDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVodAIDataWithOptions(request, runtime);
    }

    public DescribeVodCertificateListResponse describeVodCertificateListWithOptions(DescribeVodCertificateListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DomainName", request.domainName);
        query.put("OwnerId", request.ownerId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVodCertificateList"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVodCertificateListResponse());
    }

    public DescribeVodCertificateListResponse describeVodCertificateList(DescribeVodCertificateListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVodCertificateListWithOptions(request, runtime);
    }

    public DescribeVodDomainBpsDataResponse describeVodDomainBpsDataWithOptions(DescribeVodDomainBpsDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DomainName", request.domainName);
        query.put("EndTime", request.endTime);
        query.put("Interval", request.interval);
        query.put("IspNameEn", request.ispNameEn);
        query.put("LocationNameEn", request.locationNameEn);
        query.put("OwnerId", request.ownerId);
        query.put("StartTime", request.startTime);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVodDomainBpsData"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVodDomainBpsDataResponse());
    }

    public DescribeVodDomainBpsDataResponse describeVodDomainBpsData(DescribeVodDomainBpsDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVodDomainBpsDataWithOptions(request, runtime);
    }

    public DescribeVodDomainCertificateInfoResponse describeVodDomainCertificateInfoWithOptions(DescribeVodDomainCertificateInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DomainName", request.domainName);
        query.put("OwnerId", request.ownerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVodDomainCertificateInfo"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVodDomainCertificateInfoResponse());
    }

    public DescribeVodDomainCertificateInfoResponse describeVodDomainCertificateInfo(DescribeVodDomainCertificateInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVodDomainCertificateInfoWithOptions(request, runtime);
    }

    public DescribeVodDomainConfigsResponse describeVodDomainConfigsWithOptions(DescribeVodDomainConfigsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DomainName", request.domainName);
        query.put("FunctionNames", request.functionNames);
        query.put("OwnerId", request.ownerId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVodDomainConfigs"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVodDomainConfigsResponse());
    }

    public DescribeVodDomainConfigsResponse describeVodDomainConfigs(DescribeVodDomainConfigsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVodDomainConfigsWithOptions(request, runtime);
    }

    public DescribeVodDomainDetailResponse describeVodDomainDetailWithOptions(DescribeVodDomainDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DomainName", request.domainName);
        query.put("OwnerId", request.ownerId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVodDomainDetail"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVodDomainDetailResponse());
    }

    public DescribeVodDomainDetailResponse describeVodDomainDetail(DescribeVodDomainDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVodDomainDetailWithOptions(request, runtime);
    }

    public DescribeVodDomainLogResponse describeVodDomainLogWithOptions(DescribeVodDomainLogRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DomainName", request.domainName);
        query.put("EndTime", request.endTime);
        query.put("OwnerId", request.ownerId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("StartTime", request.startTime);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVodDomainLog"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVodDomainLogResponse());
    }

    public DescribeVodDomainLogResponse describeVodDomainLog(DescribeVodDomainLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVodDomainLogWithOptions(request, runtime);
    }

    public DescribeVodDomainRealtimeLogDeliveryResponse describeVodDomainRealtimeLogDeliveryWithOptions(DescribeVodDomainRealtimeLogDeliveryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVodDomainRealtimeLogDelivery"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVodDomainRealtimeLogDeliveryResponse());
    }

    public DescribeVodDomainRealtimeLogDeliveryResponse describeVodDomainRealtimeLogDelivery(DescribeVodDomainRealtimeLogDeliveryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVodDomainRealtimeLogDeliveryWithOptions(request, runtime);
    }

    public DescribeVodDomainSrcBpsDataResponse describeVodDomainSrcBpsDataWithOptions(DescribeVodDomainSrcBpsDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DomainName", request.domainName);
        query.put("EndTime", request.endTime);
        query.put("Interval", request.interval);
        query.put("OwnerId", request.ownerId);
        query.put("StartTime", request.startTime);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVodDomainSrcBpsData"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVodDomainSrcBpsDataResponse());
    }

    public DescribeVodDomainSrcBpsDataResponse describeVodDomainSrcBpsData(DescribeVodDomainSrcBpsDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVodDomainSrcBpsDataWithOptions(request, runtime);
    }

    public DescribeVodDomainTrafficDataResponse describeVodDomainTrafficDataWithOptions(DescribeVodDomainTrafficDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DomainName", request.domainName);
        query.put("EndTime", request.endTime);
        query.put("Interval", request.interval);
        query.put("IspNameEn", request.ispNameEn);
        query.put("LocationNameEn", request.locationNameEn);
        query.put("OwnerId", request.ownerId);
        query.put("StartTime", request.startTime);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVodDomainTrafficData"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVodDomainTrafficDataResponse());
    }

    public DescribeVodDomainTrafficDataResponse describeVodDomainTrafficData(DescribeVodDomainTrafficDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVodDomainTrafficDataWithOptions(request, runtime);
    }

    public DescribeVodDomainUsageDataResponse describeVodDomainUsageDataWithOptions(DescribeVodDomainUsageDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Area", request.area);
        query.put("DomainName", request.domainName);
        query.put("EndTime", request.endTime);
        query.put("Field", request.field);
        query.put("OwnerId", request.ownerId);
        query.put("StartTime", request.startTime);
        query.put("Type", request.type);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVodDomainUsageData"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVodDomainUsageDataResponse());
    }

    public DescribeVodDomainUsageDataResponse describeVodDomainUsageData(DescribeVodDomainUsageDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVodDomainUsageDataWithOptions(request, runtime);
    }

    public DescribeVodRefreshQuotaResponse describeVodRefreshQuotaWithOptions(DescribeVodRefreshQuotaRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVodRefreshQuota"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVodRefreshQuotaResponse());
    }

    public DescribeVodRefreshQuotaResponse describeVodRefreshQuota(DescribeVodRefreshQuotaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVodRefreshQuotaWithOptions(request, runtime);
    }

    public DescribeVodRefreshTasksResponse describeVodRefreshTasksWithOptions(DescribeVodRefreshTasksRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DomainName", request.domainName);
        query.put("EndTime", request.endTime);
        query.put("ObjectPath", request.objectPath);
        query.put("ObjectType", request.objectType);
        query.put("OwnerId", request.ownerId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("SecurityToken", request.securityToken);
        query.put("StartTime", request.startTime);
        query.put("Status", request.status);
        query.put("TaskId", request.taskId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVodRefreshTasks"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVodRefreshTasksResponse());
    }

    public DescribeVodRefreshTasksResponse describeVodRefreshTasks(DescribeVodRefreshTasksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVodRefreshTasksWithOptions(request, runtime);
    }

    public DescribeVodStorageDataResponse describeVodStorageDataWithOptions(DescribeVodStorageDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("EndTime", request.endTime);
        query.put("OwnerId", request.ownerId);
        query.put("Region", request.region);
        query.put("StartTime", request.startTime);
        query.put("Storage", request.storage);
        query.put("StorageType", request.storageType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVodStorageData"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVodStorageDataResponse());
    }

    public DescribeVodStorageDataResponse describeVodStorageData(DescribeVodStorageDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVodStorageDataWithOptions(request, runtime);
    }

    public DescribeVodTagResourcesResponse describeVodTagResourcesWithOptions(DescribeVodTagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceId", request.resourceId);
        query.put("ResourceType", request.resourceType);
        query.put("Tag", request.tag);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVodTagResources"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVodTagResourcesResponse());
    }

    public DescribeVodTagResourcesResponse describeVodTagResources(DescribeVodTagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVodTagResourcesWithOptions(request, runtime);
    }

    public DescribeVodTranscodeDataResponse describeVodTranscodeDataWithOptions(DescribeVodTranscodeDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("EndTime", request.endTime);
        query.put("Interval", request.interval);
        query.put("OwnerId", request.ownerId);
        query.put("Region", request.region);
        query.put("Specification", request.specification);
        query.put("StartTime", request.startTime);
        query.put("Storage", request.storage);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVodTranscodeData"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVodTranscodeDataResponse());
    }

    public DescribeVodTranscodeDataResponse describeVodTranscodeData(DescribeVodTranscodeDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVodTranscodeDataWithOptions(request, runtime);
    }

    public DescribeVodUserDomainsResponse describeVodUserDomainsWithOptions(DescribeVodUserDomainsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DomainName", request.domainName);
        query.put("DomainSearchType", request.domainSearchType);
        query.put("DomainStatus", request.domainStatus);
        query.put("OwnerId", request.ownerId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("SecurityToken", request.securityToken);
        query.put("Tag", request.tag);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVodUserDomains"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVodUserDomainsResponse());
    }

    public DescribeVodUserDomainsResponse describeVodUserDomains(DescribeVodUserDomainsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVodUserDomainsWithOptions(request, runtime);
    }

    public DescribeVodUserTagsResponse describeVodUserTagsWithOptions(DescribeVodUserTagsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVodUserTags"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVodUserTagsResponse());
    }

    public DescribeVodUserTagsResponse describeVodUserTags(DescribeVodUserTagsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVodUserTagsWithOptions(request, runtime);
    }

    public DescribeVodVerifyContentResponse describeVodVerifyContentWithOptions(DescribeVodVerifyContentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DomainName", request.domainName);
        query.put("OwnerId", request.ownerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVodVerifyContent"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVodVerifyContentResponse());
    }

    public DescribeVodVerifyContentResponse describeVodVerifyContent(DescribeVodVerifyContentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVodVerifyContentWithOptions(request, runtime);
    }

    public DetachAppPolicyFromIdentityResponse detachAppPolicyFromIdentityWithOptions(DetachAppPolicyFromIdentityRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppId", request.appId);
        query.put("IdentityName", request.identityName);
        query.put("IdentityType", request.identityType);
        query.put("PolicyNames", request.policyNames);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetachAppPolicyFromIdentity"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetachAppPolicyFromIdentityResponse());
    }

    public DetachAppPolicyFromIdentityResponse detachAppPolicyFromIdentity(DetachAppPolicyFromIdentityRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.detachAppPolicyFromIdentityWithOptions(request, runtime);
    }

    public DisableVodRealtimeLogDeliveryResponse disableVodRealtimeLogDeliveryWithOptions(DisableVodRealtimeLogDeliveryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableVodRealtimeLogDelivery"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableVodRealtimeLogDeliveryResponse());
    }

    public DisableVodRealtimeLogDeliveryResponse disableVodRealtimeLogDelivery(DisableVodRealtimeLogDeliveryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.disableVodRealtimeLogDeliveryWithOptions(request, runtime);
    }

    public EnableVodRealtimeLogDeliveryResponse enableVodRealtimeLogDeliveryWithOptions(EnableVodRealtimeLogDeliveryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableVodRealtimeLogDelivery"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableVodRealtimeLogDeliveryResponse());
    }

    public EnableVodRealtimeLogDeliveryResponse enableVodRealtimeLogDelivery(EnableVodRealtimeLogDeliveryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.enableVodRealtimeLogDeliveryWithOptions(request, runtime);
    }

    public GetAIImageJobsResponse getAIImageJobsWithOptions(GetAIImageJobsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("JobIds", request.jobIds);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAIImageJobs"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAIImageJobsResponse());
    }

    public GetAIImageJobsResponse getAIImageJobs(GetAIImageJobsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAIImageJobsWithOptions(request, runtime);
    }

    public GetAIMediaAuditJobResponse getAIMediaAuditJobWithOptions(GetAIMediaAuditJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("JobId", request.jobId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAIMediaAuditJob"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAIMediaAuditJobResponse());
    }

    public GetAIMediaAuditJobResponse getAIMediaAuditJob(GetAIMediaAuditJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAIMediaAuditJobWithOptions(request, runtime);
    }

    public GetAITemplateResponse getAITemplateWithOptions(GetAITemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("TemplateId", request.templateId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAITemplate"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAITemplateResponse());
    }

    public GetAITemplateResponse getAITemplate(GetAITemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAITemplateWithOptions(request, runtime);
    }

    public GetAIVideoTagResultResponse getAIVideoTagResultWithOptions(GetAIVideoTagResultRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("MediaId", request.mediaId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAIVideoTagResult"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAIVideoTagResultResponse());
    }

    public GetAIVideoTagResultResponse getAIVideoTagResult(GetAIVideoTagResultRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAIVideoTagResultWithOptions(request, runtime);
    }

    public GetAppInfosResponse getAppInfosWithOptions(GetAppInfosRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppIds", request.appIds);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAppInfos"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAppInfosResponse());
    }

    public GetAppInfosResponse getAppInfos(GetAppInfosRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAppInfosWithOptions(request, runtime);
    }

    public GetAttachedMediaInfoResponse getAttachedMediaInfoWithOptions(GetAttachedMediaInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AuthTimeout", request.authTimeout);
        query.put("MediaIds", request.mediaIds);
        query.put("OutputType", request.outputType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAttachedMediaInfo"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAttachedMediaInfoResponse());
    }

    public GetAttachedMediaInfoResponse getAttachedMediaInfo(GetAttachedMediaInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAttachedMediaInfoWithOptions(request, runtime);
    }

    public GetAuditHistoryResponse getAuditHistoryWithOptions(GetAuditHistoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("PageNo", request.pageNo);
        query.put("PageSize", request.pageSize);
        query.put("SortBy", request.sortBy);
        query.put("VideoId", request.videoId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAuditHistory"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAuditHistoryResponse());
    }

    public GetAuditHistoryResponse getAuditHistory(GetAuditHistoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAuditHistoryWithOptions(request, runtime);
    }

    public GetCategoriesResponse getCategoriesWithOptions(GetCategoriesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CateId", request.cateId);
        query.put("PageNo", request.pageNo);
        query.put("PageSize", request.pageSize);
        query.put("SortBy", request.sortBy);
        query.put("Type", request.type);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCategories"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCategoriesResponse());
    }

    public GetCategoriesResponse getCategories(GetCategoriesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getCategoriesWithOptions(request, runtime);
    }

    public GetDefaultAITemplateResponse getDefaultAITemplateWithOptions(GetDefaultAITemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("TemplateType", request.templateType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDefaultAITemplate"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDefaultAITemplateResponse());
    }

    public GetDefaultAITemplateResponse getDefaultAITemplate(GetDefaultAITemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDefaultAITemplateWithOptions(request, runtime);
    }

    public GetEditingProjectResponse getEditingProjectWithOptions(GetEditingProjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("ProjectId", request.projectId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEditingProject"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetEditingProjectResponse());
    }

    public GetEditingProjectResponse getEditingProject(GetEditingProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getEditingProjectWithOptions(request, runtime);
    }

    public GetEditingProjectMaterialsResponse getEditingProjectMaterialsWithOptions(GetEditingProjectMaterialsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("MaterialType", request.materialType);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("ProjectId", request.projectId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("Type", request.type);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEditingProjectMaterials"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetEditingProjectMaterialsResponse());
    }

    public GetEditingProjectMaterialsResponse getEditingProjectMaterials(GetEditingProjectMaterialsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getEditingProjectMaterialsWithOptions(request, runtime);
    }

    public GetImageInfoResponse getImageInfoWithOptions(GetImageInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AuthTimeout", request.authTimeout);
        query.put("ImageId", request.imageId);
        query.put("OutputType", request.outputType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetImageInfo"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetImageInfoResponse());
    }

    public GetImageInfoResponse getImageInfo(GetImageInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getImageInfoWithOptions(request, runtime);
    }

    public GetMediaAuditAudioResultDetailResponse getMediaAuditAudioResultDetailWithOptions(GetMediaAuditAudioResultDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("MediaId", request.mediaId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("PageNo", request.pageNo);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMediaAuditAudioResultDetail"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMediaAuditAudioResultDetailResponse());
    }

    public GetMediaAuditAudioResultDetailResponse getMediaAuditAudioResultDetail(GetMediaAuditAudioResultDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getMediaAuditAudioResultDetailWithOptions(request, runtime);
    }

    public GetMediaAuditResultResponse getMediaAuditResultWithOptions(GetMediaAuditResultRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("MediaId", request.mediaId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMediaAuditResult"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMediaAuditResultResponse());
    }

    public GetMediaAuditResultResponse getMediaAuditResult(GetMediaAuditResultRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getMediaAuditResultWithOptions(request, runtime);
    }

    public GetMediaAuditResultDetailResponse getMediaAuditResultDetailWithOptions(GetMediaAuditResultDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("MediaId", request.mediaId);
        query.put("PageNo", request.pageNo);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMediaAuditResultDetail"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMediaAuditResultDetailResponse());
    }

    public GetMediaAuditResultDetailResponse getMediaAuditResultDetail(GetMediaAuditResultDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getMediaAuditResultDetailWithOptions(request, runtime);
    }

    public GetMediaAuditResultTimelineResponse getMediaAuditResultTimelineWithOptions(GetMediaAuditResultTimelineRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("MediaId", request.mediaId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMediaAuditResultTimeline"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMediaAuditResultTimelineResponse());
    }

    public GetMediaAuditResultTimelineResponse getMediaAuditResultTimeline(GetMediaAuditResultTimelineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getMediaAuditResultTimelineWithOptions(request, runtime);
    }

    public GetMediaDNAResultResponse getMediaDNAResultWithOptions(GetMediaDNAResultRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("MediaId", request.mediaId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMediaDNAResult"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMediaDNAResultResponse());
    }

    public GetMediaDNAResultResponse getMediaDNAResult(GetMediaDNAResultRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getMediaDNAResultWithOptions(request, runtime);
    }

    public GetMessageCallbackResponse getMessageCallbackWithOptions(GetMessageCallbackRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppId", request.appId);
        query.put("OwnerAccount", request.ownerAccount);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMessageCallback"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMessageCallbackResponse());
    }

    public GetMessageCallbackResponse getMessageCallback(GetMessageCallbackRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getMessageCallbackWithOptions(request, runtime);
    }

    public GetMezzanineInfoResponse getMezzanineInfoWithOptions(GetMezzanineInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AdditionType", request.additionType);
        query.put("AuthTimeout", request.authTimeout);
        query.put("OutputType", request.outputType);
        query.put("VideoId", request.videoId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMezzanineInfo"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMezzanineInfoResponse());
    }

    public GetMezzanineInfoResponse getMezzanineInfo(GetMezzanineInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getMezzanineInfoWithOptions(request, runtime);
    }

    public GetPlayInfoResponse getPlayInfoWithOptions(GetPlayInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AdditionType", request.additionType);
        query.put("AuthTimeout", request.authTimeout);
        query.put("Definition", request.definition);
        query.put("Formats", request.formats);
        query.put("OutputType", request.outputType);
        query.put("PlayConfig", request.playConfig);
        query.put("ReAuthInfo", request.reAuthInfo);
        query.put("ResultType", request.resultType);
        query.put("StreamType", request.streamType);
        query.put("VideoId", request.videoId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPlayInfo"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPlayInfoResponse());
    }

    public GetPlayInfoResponse getPlayInfo(GetPlayInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getPlayInfoWithOptions(request, runtime);
    }

    public GetTranscodeSummaryResponse getTranscodeSummaryWithOptions(GetTranscodeSummaryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("VideoIds", request.videoIds);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTranscodeSummary"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTranscodeSummaryResponse());
    }

    public GetTranscodeSummaryResponse getTranscodeSummary(GetTranscodeSummaryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getTranscodeSummaryWithOptions(request, runtime);
    }

    public GetTranscodeTaskResponse getTranscodeTaskWithOptions(GetTranscodeTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("TranscodeTaskId", request.transcodeTaskId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTranscodeTask"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTranscodeTaskResponse());
    }

    public GetTranscodeTaskResponse getTranscodeTask(GetTranscodeTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getTranscodeTaskWithOptions(request, runtime);
    }

    public GetTranscodeTemplateGroupResponse getTranscodeTemplateGroupWithOptions(GetTranscodeTemplateGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("TranscodeTemplateGroupId", request.transcodeTemplateGroupId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTranscodeTemplateGroup"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTranscodeTemplateGroupResponse());
    }

    public GetTranscodeTemplateGroupResponse getTranscodeTemplateGroup(GetTranscodeTemplateGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getTranscodeTemplateGroupWithOptions(request, runtime);
    }

    public GetURLUploadInfosResponse getURLUploadInfosWithOptions(GetURLUploadInfosRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("JobIds", request.jobIds);
        query.put("UploadURLs", request.uploadURLs);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetURLUploadInfos"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetURLUploadInfosResponse());
    }

    public GetURLUploadInfosResponse getURLUploadInfos(GetURLUploadInfosRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getURLUploadInfosWithOptions(request, runtime);
    }

    public GetUploadDetailsResponse getUploadDetailsWithOptions(GetUploadDetailsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("MediaIds", request.mediaIds);
        query.put("MediaType", request.mediaType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUploadDetails"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUploadDetailsResponse());
    }

    public GetUploadDetailsResponse getUploadDetails(GetUploadDetailsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getUploadDetailsWithOptions(request, runtime);
    }

    public GetVideoInfoResponse getVideoInfoWithOptions(GetVideoInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("VideoId", request.videoId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetVideoInfo"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetVideoInfoResponse());
    }

    public GetVideoInfoResponse getVideoInfo(GetVideoInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getVideoInfoWithOptions(request, runtime);
    }

    public GetVideoInfosResponse getVideoInfosWithOptions(GetVideoInfosRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("VideoIds", request.videoIds);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetVideoInfos"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetVideoInfosResponse());
    }

    public GetVideoInfosResponse getVideoInfos(GetVideoInfosRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getVideoInfosWithOptions(request, runtime);
    }

    public GetVideoListResponse getVideoListWithOptions(GetVideoListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CateId", request.cateId);
        query.put("EndTime", request.endTime);
        query.put("PageNo", request.pageNo);
        query.put("PageSize", request.pageSize);
        query.put("SortBy", request.sortBy);
        query.put("StartTime", request.startTime);
        query.put("Status", request.status);
        query.put("StorageLocation", request.storageLocation);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetVideoList"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetVideoListResponse());
    }

    public GetVideoListResponse getVideoList(GetVideoListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getVideoListWithOptions(request, runtime);
    }

    public GetVideoPlayAuthResponse getVideoPlayAuthWithOptions(GetVideoPlayAuthRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ApiVersion", request.apiVersion);
        query.put("AuthInfoTimeout", request.authInfoTimeout);
        query.put("VideoId", request.videoId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetVideoPlayAuth"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetVideoPlayAuthResponse());
    }

    public GetVideoPlayAuthResponse getVideoPlayAuth(GetVideoPlayAuthRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getVideoPlayAuthWithOptions(request, runtime);
    }

    public GetVodTemplateResponse getVodTemplateWithOptions(GetVodTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("VodTemplateId", request.vodTemplateId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetVodTemplate"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetVodTemplateResponse());
    }

    public GetVodTemplateResponse getVodTemplate(GetVodTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getVodTemplateWithOptions(request, runtime);
    }

    public GetWatermarkResponse getWatermarkWithOptions(GetWatermarkRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("WatermarkId", request.watermarkId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWatermark"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWatermarkResponse());
    }

    public GetWatermarkResponse getWatermark(GetWatermarkRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getWatermarkWithOptions(request, runtime);
    }

    public ListAIImageInfoResponse listAIImageInfoWithOptions(ListAIImageInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("VideoId", request.videoId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAIImageInfo"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAIImageInfoResponse());
    }

    public ListAIImageInfoResponse listAIImageInfo(ListAIImageInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAIImageInfoWithOptions(request, runtime);
    }

    public ListAIJobResponse listAIJobWithOptions(ListAIJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("JobIds", request.jobIds);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAIJob"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAIJobResponse());
    }

    public ListAIJobResponse listAIJob(ListAIJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAIJobWithOptions(request, runtime);
    }

    public ListAITemplateResponse listAITemplateWithOptions(ListAITemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("TemplateType", request.templateType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAITemplate"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAITemplateResponse());
    }

    public ListAITemplateResponse listAITemplate(ListAITemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAITemplateWithOptions(request, runtime);
    }

    public ListAppInfoResponse listAppInfoWithOptions(ListAppInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("PageNo", request.pageNo);
        query.put("PageSize", request.pageSize);
        query.put("Status", request.status);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAppInfo"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAppInfoResponse());
    }

    public ListAppInfoResponse listAppInfo(ListAppInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAppInfoWithOptions(request, runtime);
    }

    public ListAppPoliciesForIdentityResponse listAppPoliciesForIdentityWithOptions(ListAppPoliciesForIdentityRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppId", request.appId);
        query.put("IdentityName", request.identityName);
        query.put("IdentityType", request.identityType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAppPoliciesForIdentity"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAppPoliciesForIdentityResponse());
    }

    public ListAppPoliciesForIdentityResponse listAppPoliciesForIdentity(ListAppPoliciesForIdentityRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAppPoliciesForIdentityWithOptions(request, runtime);
    }

    public ListAuditSecurityIpResponse listAuditSecurityIpWithOptions(ListAuditSecurityIpRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("SecurityGroupName", request.securityGroupName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAuditSecurityIp"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAuditSecurityIpResponse());
    }

    public ListAuditSecurityIpResponse listAuditSecurityIp(ListAuditSecurityIpRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAuditSecurityIpWithOptions(request, runtime);
    }

    public ListDynamicImageResponse listDynamicImageWithOptions(ListDynamicImageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("VideoId", request.videoId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDynamicImage"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDynamicImageResponse());
    }

    public ListDynamicImageResponse listDynamicImage(ListDynamicImageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDynamicImageWithOptions(request, runtime);
    }

    public ListLiveRecordVideoResponse listLiveRecordVideoWithOptions(ListLiveRecordVideoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppName", request.appName);
        query.put("DomainName", request.domainName);
        query.put("EndTime", request.endTime);
        query.put("PageNo", request.pageNo);
        query.put("PageSize", request.pageSize);
        query.put("SortBy", request.sortBy);
        query.put("StartTime", request.startTime);
        query.put("StreamName", request.streamName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListLiveRecordVideo"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListLiveRecordVideoResponse());
    }

    public ListLiveRecordVideoResponse listLiveRecordVideo(ListLiveRecordVideoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listLiveRecordVideoWithOptions(request, runtime);
    }

    public ListMediaDNADeleteJobResponse listMediaDNADeleteJobWithOptions(ListMediaDNADeleteJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("JobIds", request.jobIds);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMediaDNADeleteJob"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMediaDNADeleteJobResponse());
    }

    public ListMediaDNADeleteJobResponse listMediaDNADeleteJob(ListMediaDNADeleteJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listMediaDNADeleteJobWithOptions(request, runtime);
    }

    public ListSnapshotsResponse listSnapshotsWithOptions(ListSnapshotsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AuthTimeout", request.authTimeout);
        query.put("PageNo", request.pageNo);
        query.put("PageSize", request.pageSize);
        query.put("SnapshotType", request.snapshotType);
        query.put("VideoId", request.videoId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSnapshots"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSnapshotsResponse());
    }

    public ListSnapshotsResponse listSnapshots(ListSnapshotsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listSnapshotsWithOptions(request, runtime);
    }

    public ListTranscodeTaskResponse listTranscodeTaskWithOptions(ListTranscodeTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("EndTime", request.endTime);
        query.put("PageNo", request.pageNo);
        query.put("PageSize", request.pageSize);
        query.put("StartTime", request.startTime);
        query.put("VideoId", request.videoId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTranscodeTask"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTranscodeTaskResponse());
    }

    public ListTranscodeTaskResponse listTranscodeTask(ListTranscodeTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTranscodeTaskWithOptions(request, runtime);
    }

    public ListTranscodeTemplateGroupResponse listTranscodeTemplateGroupWithOptions(ListTranscodeTemplateGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppId", request.appId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTranscodeTemplateGroup"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTranscodeTemplateGroupResponse());
    }

    public ListTranscodeTemplateGroupResponse listTranscodeTemplateGroup(ListTranscodeTemplateGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTranscodeTemplateGroupWithOptions(request, runtime);
    }

    public ListVodRealtimeLogDeliveryDomainsResponse listVodRealtimeLogDeliveryDomainsWithOptions(ListVodRealtimeLogDeliveryDomainsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListVodRealtimeLogDeliveryDomains"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListVodRealtimeLogDeliveryDomainsResponse());
    }

    public ListVodRealtimeLogDeliveryDomainsResponse listVodRealtimeLogDeliveryDomains(ListVodRealtimeLogDeliveryDomainsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listVodRealtimeLogDeliveryDomainsWithOptions(request, runtime);
    }

    public ListVodRealtimeLogDeliveryInfosResponse listVodRealtimeLogDeliveryInfosWithOptions(ListVodRealtimeLogDeliveryInfosRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListVodRealtimeLogDeliveryInfos"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListVodRealtimeLogDeliveryInfosResponse());
    }

    public ListVodRealtimeLogDeliveryInfosResponse listVodRealtimeLogDeliveryInfos(ListVodRealtimeLogDeliveryInfosRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listVodRealtimeLogDeliveryInfosWithOptions(request, runtime);
    }

    public ListVodTemplateResponse listVodTemplateWithOptions(ListVodTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppId", request.appId);
        query.put("TemplateType", request.templateType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListVodTemplate"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListVodTemplateResponse());
    }

    public ListVodTemplateResponse listVodTemplate(ListVodTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listVodTemplateWithOptions(request, runtime);
    }

    public ListWatermarkResponse listWatermarkWithOptions(ListWatermarkRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppId", request.appId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListWatermark"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListWatermarkResponse());
    }

    public ListWatermarkResponse listWatermark(ListWatermarkRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listWatermarkWithOptions(request, runtime);
    }

    public MoveAppResourceResponse moveAppResourceWithOptions(MoveAppResourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ResourceIds", request.resourceIds);
        query.put("ResourceType", request.resourceType);
        query.put("TargetAppId", request.targetAppId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MoveAppResource"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MoveAppResourceResponse());
    }

    public MoveAppResourceResponse moveAppResource(MoveAppResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.moveAppResourceWithOptions(request, runtime);
    }

    public PreloadVodObjectCachesResponse preloadVodObjectCachesWithOptions(PreloadVodObjectCachesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ObjectPath", request.objectPath);
        query.put("OwnerId", request.ownerId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PreloadVodObjectCaches"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PreloadVodObjectCachesResponse());
    }

    public PreloadVodObjectCachesResponse preloadVodObjectCaches(PreloadVodObjectCachesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.preloadVodObjectCachesWithOptions(request, runtime);
    }

    public ProduceEditingProjectVideoResponse produceEditingProjectVideoWithOptions(ProduceEditingProjectVideoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CoverURL", request.coverURL);
        query.put("Description", request.description);
        query.put("MediaMetadata", request.mediaMetadata);
        query.put("OwnerId", request.ownerId);
        query.put("ProduceConfig", request.produceConfig);
        query.put("ProjectId", request.projectId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("Timeline", request.timeline);
        query.put("Title", request.title);
        query.put("UserData", request.userData);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ProduceEditingProjectVideo"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ProduceEditingProjectVideoResponse());
    }

    public ProduceEditingProjectVideoResponse produceEditingProjectVideo(ProduceEditingProjectVideoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.produceEditingProjectVideoWithOptions(request, runtime);
    }

    public RefreshUploadVideoResponse refreshUploadVideoWithOptions(RefreshUploadVideoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("VideoId", request.videoId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RefreshUploadVideo"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RefreshUploadVideoResponse());
    }

    public RefreshUploadVideoResponse refreshUploadVideo(RefreshUploadVideoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.refreshUploadVideoWithOptions(request, runtime);
    }

    public RefreshVodObjectCachesResponse refreshVodObjectCachesWithOptions(RefreshVodObjectCachesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ObjectPath", request.objectPath);
        query.put("ObjectType", request.objectType);
        query.put("OwnerId", request.ownerId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RefreshVodObjectCaches"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RefreshVodObjectCachesResponse());
    }

    public RefreshVodObjectCachesResponse refreshVodObjectCaches(RefreshVodObjectCachesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.refreshVodObjectCachesWithOptions(request, runtime);
    }

    public RegisterMediaResponse registerMediaWithOptions(RegisterMediaRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("RegisterMetadatas", request.registerMetadatas);
        query.put("TemplateGroupId", request.templateGroupId);
        query.put("UserData", request.userData);
        query.put("WorkflowId", request.workflowId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RegisterMedia"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RegisterMediaResponse());
    }

    public RegisterMediaResponse registerMedia(RegisterMediaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.registerMediaWithOptions(request, runtime);
    }

    public SearchEditingProjectResponse searchEditingProjectWithOptions(SearchEditingProjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("EndTime", request.endTime);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("PageNo", request.pageNo);
        query.put("PageSize", request.pageSize);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("SortBy", request.sortBy);
        query.put("StartTime", request.startTime);
        query.put("Status", request.status);
        query.put("Title", request.title);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchEditingProject"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchEditingProjectResponse());
    }

    public SearchEditingProjectResponse searchEditingProject(SearchEditingProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.searchEditingProjectWithOptions(request, runtime);
    }

    public SearchMediaResponse searchMediaWithOptions(SearchMediaRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Fields", request.fields);
        query.put("Match", request.match);
        query.put("PageNo", request.pageNo);
        query.put("PageSize", request.pageSize);
        query.put("ScrollToken", request.scrollToken);
        query.put("SearchType", request.searchType);
        query.put("SortBy", request.sortBy);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchMedia"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchMediaResponse());
    }

    public SearchMediaResponse searchMedia(SearchMediaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.searchMediaWithOptions(request, runtime);
    }

    public SetAuditSecurityIpResponse setAuditSecurityIpWithOptions(SetAuditSecurityIpRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Ips", request.ips);
        query.put("OperateMode", request.operateMode);
        query.put("SecurityGroupName", request.securityGroupName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetAuditSecurityIp"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetAuditSecurityIpResponse());
    }

    public SetAuditSecurityIpResponse setAuditSecurityIp(SetAuditSecurityIpRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setAuditSecurityIpWithOptions(request, runtime);
    }

    public SetCrossdomainContentResponse setCrossdomainContentWithOptions(SetCrossdomainContentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Content", request.content);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("ResourceRealOwnerId", request.resourceRealOwnerId);
        query.put("StorageLocation", request.storageLocation);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetCrossdomainContent"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetCrossdomainContentResponse());
    }

    public SetCrossdomainContentResponse setCrossdomainContent(SetCrossdomainContentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setCrossdomainContentWithOptions(request, runtime);
    }

    public SetDefaultAITemplateResponse setDefaultAITemplateWithOptions(SetDefaultAITemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("TemplateId", request.templateId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetDefaultAITemplate"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetDefaultAITemplateResponse());
    }

    public SetDefaultAITemplateResponse setDefaultAITemplate(SetDefaultAITemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setDefaultAITemplateWithOptions(request, runtime);
    }

    public SetDefaultTranscodeTemplateGroupResponse setDefaultTranscodeTemplateGroupWithOptions(SetDefaultTranscodeTemplateGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("TranscodeTemplateGroupId", request.transcodeTemplateGroupId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetDefaultTranscodeTemplateGroup"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetDefaultTranscodeTemplateGroupResponse());
    }

    public SetDefaultTranscodeTemplateGroupResponse setDefaultTranscodeTemplateGroup(SetDefaultTranscodeTemplateGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setDefaultTranscodeTemplateGroupWithOptions(request, runtime);
    }

    public SetDefaultWatermarkResponse setDefaultWatermarkWithOptions(SetDefaultWatermarkRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("WatermarkId", request.watermarkId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetDefaultWatermark"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetDefaultWatermarkResponse());
    }

    public SetDefaultWatermarkResponse setDefaultWatermark(SetDefaultWatermarkRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setDefaultWatermarkWithOptions(request, runtime);
    }

    public SetEditingProjectMaterialsResponse setEditingProjectMaterialsWithOptions(SetEditingProjectMaterialsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("MaterialIds", request.materialIds);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("ProjectId", request.projectId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetEditingProjectMaterials"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetEditingProjectMaterialsResponse());
    }

    public SetEditingProjectMaterialsResponse setEditingProjectMaterials(SetEditingProjectMaterialsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setEditingProjectMaterialsWithOptions(request, runtime);
    }

    public SetMessageCallbackResponse setMessageCallbackWithOptions(SetMessageCallbackRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppId", request.appId);
        query.put("AuthKey", request.authKey);
        query.put("AuthSwitch", request.authSwitch);
        query.put("CallbackType", request.callbackType);
        query.put("CallbackURL", request.callbackURL);
        query.put("EventTypeList", request.eventTypeList);
        query.put("MnsEndpoint", request.mnsEndpoint);
        query.put("MnsQueueName", request.mnsQueueName);
        query.put("OwnerAccount", request.ownerAccount);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetMessageCallback"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetMessageCallbackResponse());
    }

    public SetMessageCallbackResponse setMessageCallback(SetMessageCallbackRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setMessageCallbackWithOptions(request, runtime);
    }

    public SetVodDomainCertificateResponse setVodDomainCertificateWithOptions(SetVodDomainCertificateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CertName", request.certName);
        query.put("DomainName", request.domainName);
        query.put("OwnerId", request.ownerId);
        query.put("SSLPri", request.SSLPri);
        query.put("SSLProtocol", request.SSLProtocol);
        query.put("SSLPub", request.SSLPub);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetVodDomainCertificate"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetVodDomainCertificateResponse());
    }

    public SetVodDomainCertificateResponse setVodDomainCertificate(SetVodDomainCertificateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setVodDomainCertificateWithOptions(request, runtime);
    }

    public SubmitAIImageAuditJobResponse submitAIImageAuditJobWithOptions(SubmitAIImageAuditJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("MediaAuditConfiguration", request.mediaAuditConfiguration);
        query.put("MediaId", request.mediaId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("TemplateId", request.templateId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitAIImageAuditJob"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitAIImageAuditJobResponse());
    }

    public SubmitAIImageAuditJobResponse submitAIImageAuditJob(SubmitAIImageAuditJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitAIImageAuditJobWithOptions(request, runtime);
    }

    public SubmitAIImageJobResponse submitAIImageJobWithOptions(SubmitAIImageJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AIPipelineId", request.AIPipelineId);
        query.put("AITemplateId", request.AITemplateId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("UserData", request.userData);
        query.put("VideoId", request.videoId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitAIImageJob"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitAIImageJobResponse());
    }

    public SubmitAIImageJobResponse submitAIImageJob(SubmitAIImageJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitAIImageJobWithOptions(request, runtime);
    }

    public SubmitAIJobResponse submitAIJobWithOptions(SubmitAIJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Config", request.config);
        query.put("MediaId", request.mediaId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("Types", request.types);
        query.put("UserData", request.userData);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitAIJob"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitAIJobResponse());
    }

    public SubmitAIJobResponse submitAIJob(SubmitAIJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitAIJobWithOptions(request, runtime);
    }

    public SubmitAIMediaAuditJobResponse submitAIMediaAuditJobWithOptions(SubmitAIMediaAuditJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("MediaAuditConfiguration", request.mediaAuditConfiguration);
        query.put("MediaId", request.mediaId);
        query.put("MediaType", request.mediaType);
        query.put("TemplateId", request.templateId);
        query.put("UserData", request.userData);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitAIMediaAuditJob"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitAIMediaAuditJobResponse());
    }

    public SubmitAIMediaAuditJobResponse submitAIMediaAuditJob(SubmitAIMediaAuditJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitAIMediaAuditJobWithOptions(request, runtime);
    }

    public SubmitDynamicImageJobResponse submitDynamicImageJobWithOptions(SubmitDynamicImageJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DynamicImageTemplateId", request.dynamicImageTemplateId);
        query.put("OverrideParams", request.overrideParams);
        query.put("VideoId", request.videoId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitDynamicImageJob"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitDynamicImageJobResponse());
    }

    public SubmitDynamicImageJobResponse submitDynamicImageJob(SubmitDynamicImageJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitDynamicImageJobWithOptions(request, runtime);
    }

    public SubmitLiveEditingResponse submitLiveEditingWithOptions(SubmitLiveEditingRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppName", request.appName);
        query.put("Clips", request.clips);
        query.put("CoverURL", request.coverURL);
        query.put("Description", request.description);
        query.put("DomainName", request.domainName);
        query.put("MediaMetadata", request.mediaMetadata);
        query.put("OwnerId", request.ownerId);
        query.put("ProduceConfig", request.produceConfig);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("StreamName", request.streamName);
        query.put("Title", request.title);
        query.put("UserData", request.userData);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitLiveEditing"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitLiveEditingResponse());
    }

    public SubmitLiveEditingResponse submitLiveEditing(SubmitLiveEditingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitLiveEditingWithOptions(request, runtime);
    }

    public SubmitMediaDNADeleteJobResponse submitMediaDNADeleteJobWithOptions(SubmitMediaDNADeleteJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("MediaId", request.mediaId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitMediaDNADeleteJob"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitMediaDNADeleteJobResponse());
    }

    public SubmitMediaDNADeleteJobResponse submitMediaDNADeleteJob(SubmitMediaDNADeleteJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitMediaDNADeleteJobWithOptions(request, runtime);
    }

    public SubmitPreprocessJobsResponse submitPreprocessJobsWithOptions(SubmitPreprocessJobsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("PreprocessType", request.preprocessType);
        query.put("VideoId", request.videoId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitPreprocessJobs"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitPreprocessJobsResponse());
    }

    public SubmitPreprocessJobsResponse submitPreprocessJobs(SubmitPreprocessJobsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitPreprocessJobsWithOptions(request, runtime);
    }

    public SubmitSnapshotJobResponse submitSnapshotJobWithOptions(SubmitSnapshotJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Count", request.count);
        query.put("Height", request.height);
        query.put("Interval", request.interval);
        query.put("SnapshotTemplateId", request.snapshotTemplateId);
        query.put("SpecifiedOffsetTime", request.specifiedOffsetTime);
        query.put("SpriteSnapshotConfig", request.spriteSnapshotConfig);
        query.put("UserData", request.userData);
        query.put("VideoId", request.videoId);
        query.put("Width", request.width);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitSnapshotJob"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitSnapshotJobResponse());
    }

    public SubmitSnapshotJobResponse submitSnapshotJob(SubmitSnapshotJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitSnapshotJobWithOptions(request, runtime);
    }

    public SubmitTranscodeJobsResponse submitTranscodeJobsWithOptions(SubmitTranscodeJobsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("EncryptConfig", request.encryptConfig);
        query.put("OverrideParams", request.overrideParams);
        query.put("PipelineId", request.pipelineId);
        query.put("Priority", request.priority);
        query.put("TemplateGroupId", request.templateGroupId);
        query.put("UserData", request.userData);
        query.put("VideoId", request.videoId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitTranscodeJobs"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitTranscodeJobsResponse());
    }

    public SubmitTranscodeJobsResponse submitTranscodeJobs(SubmitTranscodeJobsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitTranscodeJobsWithOptions(request, runtime);
    }

    public SubmitWorkflowJobResponse submitWorkflowJobWithOptions(SubmitWorkflowJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("MediaId", request.mediaId);
        query.put("WorkflowId", request.workflowId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitWorkflowJob"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitWorkflowJobResponse());
    }

    public SubmitWorkflowJobResponse submitWorkflowJob(SubmitWorkflowJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitWorkflowJobWithOptions(request, runtime);
    }

    public TagVodResourcesResponse tagVodResourcesWithOptions(TagVodResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceId", request.resourceId);
        query.put("ResourceType", request.resourceType);
        query.put("Tag", request.tag);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TagVodResources"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TagVodResourcesResponse());
    }

    public TagVodResourcesResponse tagVodResources(TagVodResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.tagVodResourcesWithOptions(request, runtime);
    }

    public UnTagVodResourcesResponse unTagVodResourcesWithOptions(UnTagVodResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("All", request.all);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceId", request.resourceId);
        query.put("ResourceType", request.resourceType);
        query.put("TagKey", request.tagKey);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnTagVodResources"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnTagVodResourcesResponse());
    }

    public UnTagVodResourcesResponse unTagVodResources(UnTagVodResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unTagVodResourcesWithOptions(request, runtime);
    }

    public UpdateAITemplateResponse updateAITemplateWithOptions(UpdateAITemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("TemplateConfig", request.templateConfig);
        query.put("TemplateId", request.templateId);
        query.put("TemplateName", request.templateName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAITemplate"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAITemplateResponse());
    }

    public UpdateAITemplateResponse updateAITemplate(UpdateAITemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateAITemplateWithOptions(request, runtime);
    }

    public UpdateAppInfoResponse updateAppInfoWithOptions(UpdateAppInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppId", request.appId);
        query.put("AppName", request.appName);
        query.put("Description", request.description);
        query.put("Status", request.status);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAppInfo"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAppInfoResponse());
    }

    public UpdateAppInfoResponse updateAppInfo(UpdateAppInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateAppInfoWithOptions(request, runtime);
    }

    public UpdateAttachedMediaInfosResponse updateAttachedMediaInfosWithOptions(UpdateAttachedMediaInfosRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("UpdateContent", request.updateContent);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAttachedMediaInfos"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAttachedMediaInfosResponse());
    }

    public UpdateAttachedMediaInfosResponse updateAttachedMediaInfos(UpdateAttachedMediaInfosRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateAttachedMediaInfosWithOptions(request, runtime);
    }

    public UpdateCategoryResponse updateCategoryWithOptions(UpdateCategoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CateId", request.cateId);
        query.put("CateName", request.cateName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCategory"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCategoryResponse());
    }

    public UpdateCategoryResponse updateCategory(UpdateCategoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateCategoryWithOptions(request, runtime);
    }

    public UpdateEditingProjectResponse updateEditingProjectWithOptions(UpdateEditingProjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CoverURL", request.coverURL);
        query.put("Description", request.description);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("ProjectId", request.projectId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("Timeline", request.timeline);
        query.put("Title", request.title);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateEditingProject"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateEditingProjectResponse());
    }

    public UpdateEditingProjectResponse updateEditingProject(UpdateEditingProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateEditingProjectWithOptions(request, runtime);
    }

    public UpdateImageInfosResponse updateImageInfosWithOptions(UpdateImageInfosRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("UpdateContent", request.updateContent);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateImageInfos"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateImageInfosResponse());
    }

    public UpdateImageInfosResponse updateImageInfos(UpdateImageInfosRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateImageInfosWithOptions(request, runtime);
    }

    public UpdateStreamInfoResponse updateStreamInfoWithOptions(UpdateStreamInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("JobId", request.jobId);
        query.put("MediaId", request.mediaId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateStreamInfo"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateStreamInfoResponse());
    }

    public UpdateStreamInfoResponse updateStreamInfo(UpdateStreamInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateStreamInfoWithOptions(request, runtime);
    }

    public UpdateTranscodeTemplateGroupResponse updateTranscodeTemplateGroupWithOptions(UpdateTranscodeTemplateGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Locked", request.locked);
        query.put("Name", request.name);
        query.put("TranscodeTemplateGroupId", request.transcodeTemplateGroupId);
        query.put("TranscodeTemplateList", request.transcodeTemplateList);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTranscodeTemplateGroup"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTranscodeTemplateGroupResponse());
    }

    public UpdateTranscodeTemplateGroupResponse updateTranscodeTemplateGroup(UpdateTranscodeTemplateGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateTranscodeTemplateGroupWithOptions(request, runtime);
    }

    public UpdateVideoInfoResponse updateVideoInfoWithOptions(UpdateVideoInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CateId", request.cateId);
        query.put("CoverURL", request.coverURL);
        query.put("Description", request.description);
        query.put("Tags", request.tags);
        query.put("Title", request.title);
        query.put("VideoId", request.videoId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateVideoInfo"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateVideoInfoResponse());
    }

    public UpdateVideoInfoResponse updateVideoInfo(UpdateVideoInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateVideoInfoWithOptions(request, runtime);
    }

    public UpdateVideoInfosResponse updateVideoInfosWithOptions(UpdateVideoInfosRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("UpdateContent", request.updateContent);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateVideoInfos"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateVideoInfosResponse());
    }

    public UpdateVideoInfosResponse updateVideoInfos(UpdateVideoInfosRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateVideoInfosWithOptions(request, runtime);
    }

    public UpdateVodDomainResponse updateVodDomainWithOptions(UpdateVodDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DomainName", request.domainName);
        query.put("OwnerId", request.ownerId);
        query.put("SecurityToken", request.securityToken);
        query.put("Sources", request.sources);
        query.put("TopLevelDomain", request.topLevelDomain);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateVodDomain"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateVodDomainResponse());
    }

    public UpdateVodDomainResponse updateVodDomain(UpdateVodDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateVodDomainWithOptions(request, runtime);
    }

    public UpdateVodTemplateResponse updateVodTemplateWithOptions(UpdateVodTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Name", request.name);
        query.put("TemplateConfig", request.templateConfig);
        query.put("VodTemplateId", request.vodTemplateId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateVodTemplate"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateVodTemplateResponse());
    }

    public UpdateVodTemplateResponse updateVodTemplate(UpdateVodTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateVodTemplateWithOptions(request, runtime);
    }

    public UpdateWatermarkResponse updateWatermarkWithOptions(UpdateWatermarkRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Name", request.name);
        query.put("WatermarkConfig", request.watermarkConfig);
        query.put("WatermarkId", request.watermarkId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateWatermark"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateWatermarkResponse());
    }

    public UpdateWatermarkResponse updateWatermark(UpdateWatermarkRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateWatermarkWithOptions(request, runtime);
    }

    public UploadMediaByURLResponse uploadMediaByURLWithOptions(UploadMediaByURLRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppId", request.appId);
        query.put("StorageLocation", request.storageLocation);
        query.put("TemplateGroupId", request.templateGroupId);
        query.put("UploadMetadatas", request.uploadMetadatas);
        query.put("UploadURLs", request.uploadURLs);
        query.put("UserData", request.userData);
        query.put("WorkflowId", request.workflowId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UploadMediaByURL"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UploadMediaByURLResponse());
    }

    public UploadMediaByURLResponse uploadMediaByURL(UploadMediaByURLRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.uploadMediaByURLWithOptions(request, runtime);
    }

    public UploadStreamByURLResponse uploadStreamByURLWithOptions(UploadStreamByURLRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Definition", request.definition);
        query.put("FileExtension", request.fileExtension);
        query.put("HDRType", request.HDRType);
        query.put("MediaId", request.mediaId);
        query.put("StreamURL", request.streamURL);
        query.put("UserData", request.userData);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UploadStreamByURL"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UploadStreamByURLResponse());
    }

    public UploadStreamByURLResponse uploadStreamByURL(UploadStreamByURLRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.uploadStreamByURLWithOptions(request, runtime);
    }

    public VerifyVodDomainOwnerResponse verifyVodDomainOwnerWithOptions(VerifyVodDomainOwnerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DomainName", request.domainName);
        query.put("OwnerId", request.ownerId);
        query.put("VerifyType", request.verifyType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "VerifyVodDomainOwner"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new VerifyVodDomainOwnerResponse());
    }

    public VerifyVodDomainOwnerResponse verifyVodDomainOwner(VerifyVodDomainOwnerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.verifyVodDomainOwnerWithOptions(request, runtime);
    }
}
