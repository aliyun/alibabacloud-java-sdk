// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321;

import com.aliyun.tea.*;
import com.aliyun.vod20170321.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._signatureAlgorithm = "v2";
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-hangzhou", "vod.cn-shanghai.aliyuncs.com"),
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
            new TeaPair("cn-hangzhou-bj-b01", "vod.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "vod.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "vod.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "vod.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "vod.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "vod.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "vod.aliyuncs.com"),
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
            new TeaPair("cn-zhangjiakou-na62-a01", "vod.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "vod.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "vod.aliyuncs.com"),
            new TeaPair("me-east-1", "vod.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "vod.aliyuncs.com"),
            new TeaPair("us-east-1", "vod.aliyuncs.com")
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

    /**
      * *   Regions that support this operation: **China (Beijing)**, **China (Shanghai)**, and **Singapore**.
      * *   Before you add an AI template for automated review and smart thumbnail tasks, make sure that [automated review](https://ai.aliyun.com/vi/censor) and [smart thumbnail](https://ai.aliyun.com/vi/cover) are enabled.
      *
      * @param request AddAITemplateRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return AddAITemplateResponse
     */
    public AddAITemplateResponse addAITemplateWithOptions(AddAITemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.templateConfig)) {
            query.put("TemplateConfig", request.templateConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateName)) {
            query.put("TemplateName", request.templateName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateType)) {
            query.put("TemplateType", request.templateType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * *   Regions that support this operation: **China (Beijing)**, **China (Shanghai)**, and **Singapore**.
      * *   Before you add an AI template for automated review and smart thumbnail tasks, make sure that [automated review](https://ai.aliyun.com/vi/censor) and [smart thumbnail](https://ai.aliyun.com/vi/cover) are enabled.
      *
      * @param request AddAITemplateRequest
      * @return AddAITemplateResponse
     */
    public AddAITemplateResponse addAITemplate(AddAITemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addAITemplateWithOptions(request, runtime);
    }

    /**
      * A maximum of three category levels can be created. Each category can contain up to 100 subcategories.
      *
      * @param request AddCategoryRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return AddCategoryResponse
     */
    public AddCategoryResponse addCategoryWithOptions(AddCategoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cateName)) {
            query.put("CateName", request.cateName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentId)) {
            query.put("ParentId", request.parentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * A maximum of three category levels can be created. Each category can contain up to 100 subcategories.
      *
      * @param request AddCategoryRequest
      * @return AddCategoryResponse
     */
    public AddCategoryResponse addCategory(AddCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addCategoryWithOptions(request, runtime);
    }

    public AddEditingProjectResponse addEditingProjectWithOptions(AddEditingProjectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.coverURL)) {
            query.put("CoverURL", request.coverURL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.division)) {
            query.put("Division", request.division);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeline)) {
            query.put("Timeline", request.timeline);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            query.put("Title", request.title);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addEditingProjectWithOptions(request, runtime);
    }

    public AddEditingProjectMaterialsResponse addEditingProjectMaterialsWithOptions(AddEditingProjectMaterialsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.materialIds)) {
            query.put("MaterialIds", request.materialIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.materialType)) {
            query.put("MaterialType", request.materialType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddEditingProjectMaterials"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddEditingProjectMaterialsResponse());
    }

    public AddEditingProjectMaterialsResponse addEditingProjectMaterials(AddEditingProjectMaterialsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addEditingProjectMaterialsWithOptions(request, runtime);
    }

    /**
      * *   You cannot perform custom operations on transcoding template groups that are **locked** in the ApsaraVideo VOD console. You can call the [GetTranscodeTemplateGroup](~~GetTranscodeTemplateGroup~~) operation to query the information about a transcoding template group and check whether the transcoding template group is locked based on the value of the Locked parameter. You can call the [UpdateTranscodeTemplateGroup](~~UpdateTranscodeTemplateGroup~~) operation to unlock a transcoding template group if it is locked. Then, you can perform custom operations on the transcoding template group.
      * *   An Object Storage Service (OSS) bucket is required to store files that are used for transcoding. You cannot create a transcoding template group if no bucket is available. To activate a bucket, perform the following operations: Log on to the ApsaraVideo VOD console. In the left-side navigation pane, choose **Configuration Management > Media Management > Storage**. On the **Storage** page, activate the bucket that is allocated by ApsaraVideo VOD.
      * *   You cannot add transcoding templates to the **No Transcoding** template group.
      * *   You can create a maximum of 20 transcoding template groups.
      * *   You can add a maximum of 20 transcoding templates to a transcoding template group.
      * *   If you want to generate a URL for adaptive bitrate streaming, you can add video packaging templates to a transcoding template group. You can add a maximum of 10 video packaging templates to a transcoding template group. If you add more than 10 video packaging templates, URLs of the video transcoded based on the video packaging templates are generated but the URL for adaptive bitrate streaming is not generated.
      * ### QPS limits
      * You can call this operation up to five times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see [QPS limits](~~342790~~).
      *
      * @param request AddTranscodeTemplateGroupRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return AddTranscodeTemplateGroupResponse
     */
    public AddTranscodeTemplateGroupResponse addTranscodeTemplateGroupWithOptions(AddTranscodeTemplateGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transcodeTemplateGroupId)) {
            query.put("TranscodeTemplateGroupId", request.transcodeTemplateGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transcodeTemplateList)) {
            query.put("TranscodeTemplateList", request.transcodeTemplateList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * *   You cannot perform custom operations on transcoding template groups that are **locked** in the ApsaraVideo VOD console. You can call the [GetTranscodeTemplateGroup](~~GetTranscodeTemplateGroup~~) operation to query the information about a transcoding template group and check whether the transcoding template group is locked based on the value of the Locked parameter. You can call the [UpdateTranscodeTemplateGroup](~~UpdateTranscodeTemplateGroup~~) operation to unlock a transcoding template group if it is locked. Then, you can perform custom operations on the transcoding template group.
      * *   An Object Storage Service (OSS) bucket is required to store files that are used for transcoding. You cannot create a transcoding template group if no bucket is available. To activate a bucket, perform the following operations: Log on to the ApsaraVideo VOD console. In the left-side navigation pane, choose **Configuration Management > Media Management > Storage**. On the **Storage** page, activate the bucket that is allocated by ApsaraVideo VOD.
      * *   You cannot add transcoding templates to the **No Transcoding** template group.
      * *   You can create a maximum of 20 transcoding template groups.
      * *   You can add a maximum of 20 transcoding templates to a transcoding template group.
      * *   If you want to generate a URL for adaptive bitrate streaming, you can add video packaging templates to a transcoding template group. You can add a maximum of 10 video packaging templates to a transcoding template group. If you add more than 10 video packaging templates, URLs of the video transcoded based on the video packaging templates are generated but the URL for adaptive bitrate streaming is not generated.
      * ### QPS limits
      * You can call this operation up to five times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see [QPS limits](~~342790~~).
      *
      * @param request AddTranscodeTemplateGroupRequest
      * @return AddTranscodeTemplateGroupResponse
     */
    public AddTranscodeTemplateGroupResponse addTranscodeTemplateGroup(AddTranscodeTemplateGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addTranscodeTemplateGroupWithOptions(request, runtime);
    }

    /**
      * *   This operation is available only in the **China (Shanghai)** region.
      * *   Before you add a domain name to accelerate, you must activate ApsaraVideo VOD and apply for an Internet content provider (ICP) filing for the domain name. For more information about how to activate ApsaraVideo VOD, see [Activate ApsaraVideo VOD](~~51512~~).
      * *   If the content on the origin server is not stored on Alibaba Cloud, the content must be reviewed by Alibaba Cloud. The review will be complete by the end of the next business day after you submit an application.
      * *   You can add only one domain name to accelerate in a request. You can add a maximum of 20 accelerated domain names within an Alibaba Cloud account.
      *
      * @param request AddVodDomainRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return AddVodDomainResponse
     */
    public AddVodDomainResponse addVodDomainWithOptions(AddVodDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.checkUrl)) {
            query.put("CheckUrl", request.checkUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scope)) {
            query.put("Scope", request.scope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sources)) {
            query.put("Sources", request.sources);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topLevelDomain)) {
            query.put("TopLevelDomain", request.topLevelDomain);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * *   This operation is available only in the **China (Shanghai)** region.
      * *   Before you add a domain name to accelerate, you must activate ApsaraVideo VOD and apply for an Internet content provider (ICP) filing for the domain name. For more information about how to activate ApsaraVideo VOD, see [Activate ApsaraVideo VOD](~~51512~~).
      * *   If the content on the origin server is not stored on Alibaba Cloud, the content must be reviewed by Alibaba Cloud. The review will be complete by the end of the next business day after you submit an application.
      * *   You can add only one domain name to accelerate in a request. You can add a maximum of 20 accelerated domain names within an Alibaba Cloud account.
      *
      * @param request AddVodDomainRequest
      * @return AddVodDomainResponse
     */
    public AddVodDomainResponse addVodDomain(AddVodDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addVodDomainWithOptions(request, runtime);
    }

    /**
      * You can call this operation to add a buckets to an ApsaraVideo VOD applications.
      * > You can add only one ApsaraVideo VOD bucket for each application. If you specify an AppId that does not exist or the ID of an application for which an VOD bucket is enabled, an error is returned.
      *
      * @param request AddVodStorageForAppRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return AddVodStorageForAppResponse
     */
    public AddVodStorageForAppResponse addVodStorageForAppWithOptions(AddVodStorageForAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageLocation)) {
            query.put("StorageLocation", request.storageLocation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageType)) {
            query.put("StorageType", request.storageType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddVodStorageForApp"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddVodStorageForAppResponse());
    }

    /**
      * You can call this operation to add a buckets to an ApsaraVideo VOD applications.
      * > You can add only one ApsaraVideo VOD bucket for each application. If you specify an AppId that does not exist or the ID of an application for which an VOD bucket is enabled, an error is returned.
      *
      * @param request AddVodStorageForAppRequest
      * @return AddVodStorageForAppResponse
     */
    public AddVodStorageForAppResponse addVodStorageForApp(AddVodStorageForAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addVodStorageForAppWithOptions(request, runtime);
    }

    /**
      * > *   After you create a snapshot template, you can specify the ID of the snapshot template in the request of the [SubmitSnapshotJob](~~72213~~) operation to take snapshots.
      * > *   You can receive the [SnapshotComplete](~~57337~~) event notification by using an HTTP or HTTPS URL or in Message Service (MNS). For more information, see [Overview](~~55627~~).
      *
      * @param request AddVodTemplateRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return AddVodTemplateResponse
     */
    public AddVodTemplateResponse addVodTemplateWithOptions(AddVodTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateConfig)) {
            query.put("TemplateConfig", request.templateConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateType)) {
            query.put("TemplateType", request.templateType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * > *   After you create a snapshot template, you can specify the ID of the snapshot template in the request of the [SubmitSnapshotJob](~~72213~~) operation to take snapshots.
      * > *   You can receive the [SnapshotComplete](~~57337~~) event notification by using an HTTP or HTTPS URL or in Message Service (MNS). For more information, see [Overview](~~55627~~).
      *
      * @param request AddVodTemplateRequest
      * @return AddVodTemplateResponse
     */
    public AddVodTemplateResponse addVodTemplate(AddVodTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addVodTemplateWithOptions(request, runtime);
    }

    /**
      * > ApsaraVideo VOD supports static image watermarks such as PNG files and dynamic image watermarks such as GIF, APNG, and MOV files.
      *
      * @param request AddWatermarkRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return AddWatermarkResponse
     */
    public AddWatermarkResponse addWatermarkWithOptions(AddWatermarkRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileUrl)) {
            query.put("FileUrl", request.fileUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.watermarkConfig)) {
            query.put("WatermarkConfig", request.watermarkConfig);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * > ApsaraVideo VOD supports static image watermarks such as PNG files and dynamic image watermarks such as GIF, APNG, and MOV files.
      *
      * @param request AddWatermarkRequest
      * @return AddWatermarkResponse
     */
    public AddWatermarkResponse addWatermark(AddWatermarkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addWatermarkWithOptions(request, runtime);
    }

    /**
      * > You can grant a RAM user or RAM role permissions to access up to 10 applications.
      *
      * @param request AttachAppPolicyToIdentityRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return AttachAppPolicyToIdentityResponse
     */
    public AttachAppPolicyToIdentityResponse attachAppPolicyToIdentityWithOptions(AttachAppPolicyToIdentityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identityName)) {
            query.put("IdentityName", request.identityName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identityType)) {
            query.put("IdentityType", request.identityType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyNames)) {
            query.put("PolicyNames", request.policyNames);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * > You can grant a RAM user or RAM role permissions to access up to 10 applications.
      *
      * @param request AttachAppPolicyToIdentityRequest
      * @return AttachAppPolicyToIdentityResponse
     */
    public AttachAppPolicyToIdentityResponse attachAppPolicyToIdentity(AttachAppPolicyToIdentityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.attachAppPolicyToIdentityWithOptions(request, runtime);
    }

    /**
      * > This operation is available only in the **China (Shanghai)** region.
      *
      * @param request BatchSetVodDomainConfigsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return BatchSetVodDomainConfigsResponse
     */
    public BatchSetVodDomainConfigsResponse batchSetVodDomainConfigsWithOptions(BatchSetVodDomainConfigsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainNames)) {
            query.put("DomainNames", request.domainNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.functions)) {
            query.put("Functions", request.functions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * > This operation is available only in the **China (Shanghai)** region.
      *
      * @param request BatchSetVodDomainConfigsRequest
      * @return BatchSetVodDomainConfigsResponse
     */
    public BatchSetVodDomainConfigsResponse batchSetVodDomainConfigs(BatchSetVodDomainConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchSetVodDomainConfigsWithOptions(request, runtime);
    }

    /**
      * *   This operation is available only in the **China (Shanghai)** region.
      * *   If the domain name that you want to enable is invalid or your Alibaba Cloud account has overdue payments, you cannot call this operation to enable the domain name.
      *
      * @param request BatchStartVodDomainRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return BatchStartVodDomainResponse
     */
    public BatchStartVodDomainResponse batchStartVodDomainWithOptions(BatchStartVodDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainNames)) {
            query.put("DomainNames", request.domainNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * *   This operation is available only in the **China (Shanghai)** region.
      * *   If the domain name that you want to enable is invalid or your Alibaba Cloud account has overdue payments, you cannot call this operation to enable the domain name.
      *
      * @param request BatchStartVodDomainRequest
      * @return BatchStartVodDomainResponse
     */
    public BatchStartVodDomainResponse batchStartVodDomain(BatchStartVodDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchStartVodDomainWithOptions(request, runtime);
    }

    /**
      * *   This operation is available only in the **China (Shanghai)** region.
      * *   After you disable an accelerated domain name, the information about the domain name is retained. The system automatically reroutes all the requests that are destined for the domain name to the origin server.
      *
      * @param request BatchStopVodDomainRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return BatchStopVodDomainResponse
     */
    public BatchStopVodDomainResponse batchStopVodDomainWithOptions(BatchStopVodDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainNames)) {
            query.put("DomainNames", request.domainNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * *   This operation is available only in the **China (Shanghai)** region.
      * *   After you disable an accelerated domain name, the information about the domain name is retained. The system automatically reroutes all the requests that are destined for the domain name to the origin server.
      *
      * @param request BatchStopVodDomainRequest
      * @return BatchStopVodDomainResponse
     */
    public BatchStopVodDomainResponse batchStopVodDomain(BatchStopVodDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchStopVodDomainWithOptions(request, runtime);
    }

    /**
      * *   You can cancel only URL-based upload jobs in the **Pending** state. You can query the status of a URL-based upload job by calling the [GetURLUploadInfos](~~106830~~) operation.
      * *   You cannot cancel an upload job that already starts.
      *
      * @param request CancelUrlUploadJobsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return CancelUrlUploadJobsResponse
     */
    public CancelUrlUploadJobsResponse cancelUrlUploadJobsWithOptions(CancelUrlUploadJobsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobIds)) {
            query.put("JobIds", request.jobIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uploadUrls)) {
            query.put("UploadUrls", request.uploadUrls);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * *   You can cancel only URL-based upload jobs in the **Pending** state. You can query the status of a URL-based upload job by calling the [GetURLUploadInfos](~~106830~~) operation.
      * *   You cannot cancel an upload job that already starts.
      *
      * @param request CancelUrlUploadJobsRequest
      * @return CancelUrlUploadJobsResponse
     */
    public CancelUrlUploadJobsResponse cancelUrlUploadJobs(CancelUrlUploadJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelUrlUploadJobsWithOptions(request, runtime);
    }

    /**
      * You can create up to 10 applications within an Alibaba Cloud account. For more information, see [Multi-application service](~~113600~~).
      * ### QPS limits
      * You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see [QPS limits on API operations in ApsaraVideo VOD](~~342790~~).
      *
      * @param request CreateAppInfoRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return CreateAppInfoResponse
     */
    public CreateAppInfoResponse createAppInfoWithOptions(CreateAppInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * You can create up to 10 applications within an Alibaba Cloud account. For more information, see [Multi-application service](~~113600~~).
      * ### QPS limits
      * You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see [QPS limits on API operations in ApsaraVideo VOD](~~342790~~).
      *
      * @param request CreateAppInfoRequest
      * @return CreateAppInfoResponse
     */
    public CreateAppInfoResponse createAppInfo(CreateAppInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAppInfoWithOptions(request, runtime);
    }

    public CreateAuditResponse createAuditWithOptions(CreateAuditRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.auditContent)) {
            query.put("AuditContent", request.auditContent);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAuditWithOptions(request, runtime);
    }

    /**
      * *   **Make sure that you understand the billing method and price of ApsaraVideo VOD before you call this operation. You are charged storage fees after you upload media files to ApsaraVideo VOD. For more information, see [Billing of media asset storage](~~188308#section_e97\\_xrp_mzz~~). If you have activated the acceleration service, you are charged acceleration fees when you upload media files to ApsaraVideo VOD. For more information, see [Billing of acceleration traffic](~~188310#section_sta_zm2\\_tsv~~).**
      * *   You must obtain a URL and a credential before you upload an image to ApsaraVideo VOD. ApsaraVideo VOD provides multiple upload methods. You can upload auxiliary media assets by using SDKs for upload from servers, SDKs for upload from clients, URLs of auxiliary media assets, Object Storage Service (OSS) API, or OSS SDKs. Each upload method has different requirements for obtaining upload URLs and credentials. For more information, see the "Usage notes" section of the [Upload URLs and credentials](~~55397~~) topic.
      * *   If the upload credential expires, you can call this operation to obtain a new upload URL and credential. The default validity period of an upload credential is 3,000 seconds.
      * *   You can configure a callback to receive an [AttachedMediaUploadComplete](~~103250~~) event notification to determine whether the upload is successful.
      *
      * @param request CreateUploadAttachedMediaRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return CreateUploadAttachedMediaResponse
     */
    public CreateUploadAttachedMediaResponse createUploadAttachedMediaWithOptions(CreateUploadAttachedMediaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.businessType)) {
            query.put("BusinessType", request.businessType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cateIds)) {
            query.put("CateIds", request.cateIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            query.put("FileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSize)) {
            query.put("FileSize", request.fileSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaExt)) {
            query.put("MediaExt", request.mediaExt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageLocation)) {
            query.put("StorageLocation", request.storageLocation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            query.put("Title", request.title);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * *   **Make sure that you understand the billing method and price of ApsaraVideo VOD before you call this operation. You are charged storage fees after you upload media files to ApsaraVideo VOD. For more information, see [Billing of media asset storage](~~188308#section_e97\\_xrp_mzz~~). If you have activated the acceleration service, you are charged acceleration fees when you upload media files to ApsaraVideo VOD. For more information, see [Billing of acceleration traffic](~~188310#section_sta_zm2\\_tsv~~).**
      * *   You must obtain a URL and a credential before you upload an image to ApsaraVideo VOD. ApsaraVideo VOD provides multiple upload methods. You can upload auxiliary media assets by using SDKs for upload from servers, SDKs for upload from clients, URLs of auxiliary media assets, Object Storage Service (OSS) API, or OSS SDKs. Each upload method has different requirements for obtaining upload URLs and credentials. For more information, see the "Usage notes" section of the [Upload URLs and credentials](~~55397~~) topic.
      * *   If the upload credential expires, you can call this operation to obtain a new upload URL and credential. The default validity period of an upload credential is 3,000 seconds.
      * *   You can configure a callback to receive an [AttachedMediaUploadComplete](~~103250~~) event notification to determine whether the upload is successful.
      *
      * @param request CreateUploadAttachedMediaRequest
      * @return CreateUploadAttachedMediaResponse
     */
    public CreateUploadAttachedMediaResponse createUploadAttachedMedia(CreateUploadAttachedMediaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createUploadAttachedMediaWithOptions(request, runtime);
    }

    /**
      * *   **Make sure that you understand the billing method and price of ApsaraVideo VOD before you call this operation. You are charged storage fees after you upload media files to ApsaraVideo VOD. For more information, see [Billing of media asset storage](~~188308#section_e97\\_xrp_mzz~~). If you have activated the acceleration service, you are charged acceleration fees when you upload media files to ApsaraVideo VOD. For more information, see [Billing of acceleration traffic](~~188310#section_sta_zm2\\_tsv~~).**
      * *   You must obtain a URL and a credential before you upload an image to ApsaraVideo VOD. ApsaraVideo VOD provides multiple upload methods. You can upload files by using server upload SDKs, client upload SDKs, URLs, Object Storage Service (OSS) API, or OSS SDKs. Each upload method has different requirements for obtaining upload URLs and credentials. For more information, see the "Usage notes" section of the [Upload URLs and credentials](~~55397~~) topic.
      * *   You cannot refresh the upload URL or credential when you upload images. If the image upload credential expires, you can call this operation to obtain a new upload URL and credential. By default, the validity period of an image upload credential is 3,000 seconds.
      * *   You can call the [CreateUploadAttachedMedia](~~98467~~) operation to upload image watermarks.
      * *   You can configure a callback for [ImageUploadComplete](~~91968~~) to receive notifications about the image upload status.
      *
      * @param request CreateUploadImageRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return CreateUploadImageResponse
     */
    public CreateUploadImageResponse createUploadImageWithOptions(CreateUploadImageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cateId)) {
            query.put("CateId", request.cateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageExt)) {
            query.put("ImageExt", request.imageExt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageType)) {
            query.put("ImageType", request.imageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originalFileName)) {
            query.put("OriginalFileName", request.originalFileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageLocation)) {
            query.put("StorageLocation", request.storageLocation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            query.put("Title", request.title);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * *   **Make sure that you understand the billing method and price of ApsaraVideo VOD before you call this operation. You are charged storage fees after you upload media files to ApsaraVideo VOD. For more information, see [Billing of media asset storage](~~188308#section_e97\\_xrp_mzz~~). If you have activated the acceleration service, you are charged acceleration fees when you upload media files to ApsaraVideo VOD. For more information, see [Billing of acceleration traffic](~~188310#section_sta_zm2\\_tsv~~).**
      * *   You must obtain a URL and a credential before you upload an image to ApsaraVideo VOD. ApsaraVideo VOD provides multiple upload methods. You can upload files by using server upload SDKs, client upload SDKs, URLs, Object Storage Service (OSS) API, or OSS SDKs. Each upload method has different requirements for obtaining upload URLs and credentials. For more information, see the "Usage notes" section of the [Upload URLs and credentials](~~55397~~) topic.
      * *   You cannot refresh the upload URL or credential when you upload images. If the image upload credential expires, you can call this operation to obtain a new upload URL and credential. By default, the validity period of an image upload credential is 3,000 seconds.
      * *   You can call the [CreateUploadAttachedMedia](~~98467~~) operation to upload image watermarks.
      * *   You can configure a callback for [ImageUploadComplete](~~91968~~) to receive notifications about the image upload status.
      *
      * @param request CreateUploadImageRequest
      * @return CreateUploadImageResponse
     */
    public CreateUploadImageResponse createUploadImage(CreateUploadImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createUploadImageWithOptions(request, runtime);
    }

    /**
      * *   **Make sure that you understand the billing method and prices of ApsaraVideo VOD before you call this operation. You are charged storage fees after you upload media files to ApsaraVideo VOD. For more information, see [Billing of media asset storage](~~188308#section_e97\\_xrp_mzz~~). If you have activated the acceleration service, you are charged acceleration fees when you upload media files to ApsaraVideo VOD. For more information, see [Billing of acceleration traffic](~~188310#section_sta_zm2\\_tsv~~).**
      * *   You can call this operation to obtain upload URLs and credentials for video and audio files. For more information, see [Upload URLs and credentials](~~55397~~).
      * *   You can call this operation only to obtain the upload URLs and credentials for media files and create media assets in ApsaraVideo VOD. You cannot call this operation to upload media files. For more information about how to upload media files by calling API operations, see [Upload media files by calling API operations](~~476208~~).
      * *   If the upload credential expires, call the [RefreshUploadVideo](~~55408~~) operation to obtain a new upload credential. The default validity period of an upload credential is 3,000 seconds.
      * *   You can configure a callback to receive an [event notification](~~55396~~) when an audio or video file is uploaded. Alternatively, after you upload an audio or video file, you can call the [GetMezzanineInfo](~~59624~~) operation to determine whether the upload is successful based on the value of the Status response parameter.
      * *   The VideoId parameter that is returned after you call this operation can be used for media processing or lifecycle management of media assets.
      * *   You must obtain a URL and a credential before you upload a media file to ApsaraVideo VOD. ApsaraVideo VOD supports multiple upload methods. Each method has different requirements on upload URLs and credentials. For more information, see [Upload URLs and credentials](~~55397~~).
      *
      * @param request CreateUploadVideoRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return CreateUploadVideoResponse
     */
    public CreateUploadVideoResponse createUploadVideoWithOptions(CreateUploadVideoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cateId)) {
            query.put("CateId", request.cateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.coverURL)) {
            query.put("CoverURL", request.coverURL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            query.put("FileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSize)) {
            query.put("FileSize", request.fileSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageLocation)) {
            query.put("StorageLocation", request.storageLocation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateGroupId)) {
            query.put("TemplateGroupId", request.templateGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            query.put("Title", request.title);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workflowId)) {
            query.put("WorkflowId", request.workflowId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * *   **Make sure that you understand the billing method and prices of ApsaraVideo VOD before you call this operation. You are charged storage fees after you upload media files to ApsaraVideo VOD. For more information, see [Billing of media asset storage](~~188308#section_e97\\_xrp_mzz~~). If you have activated the acceleration service, you are charged acceleration fees when you upload media files to ApsaraVideo VOD. For more information, see [Billing of acceleration traffic](~~188310#section_sta_zm2\\_tsv~~).**
      * *   You can call this operation to obtain upload URLs and credentials for video and audio files. For more information, see [Upload URLs and credentials](~~55397~~).
      * *   You can call this operation only to obtain the upload URLs and credentials for media files and create media assets in ApsaraVideo VOD. You cannot call this operation to upload media files. For more information about how to upload media files by calling API operations, see [Upload media files by calling API operations](~~476208~~).
      * *   If the upload credential expires, call the [RefreshUploadVideo](~~55408~~) operation to obtain a new upload credential. The default validity period of an upload credential is 3,000 seconds.
      * *   You can configure a callback to receive an [event notification](~~55396~~) when an audio or video file is uploaded. Alternatively, after you upload an audio or video file, you can call the [GetMezzanineInfo](~~59624~~) operation to determine whether the upload is successful based on the value of the Status response parameter.
      * *   The VideoId parameter that is returned after you call this operation can be used for media processing or lifecycle management of media assets.
      * *   You must obtain a URL and a credential before you upload a media file to ApsaraVideo VOD. ApsaraVideo VOD supports multiple upload methods. Each method has different requirements on upload URLs and credentials. For more information, see [Upload URLs and credentials](~~55397~~).
      *
      * @param request CreateUploadVideoRequest
      * @return CreateUploadVideoResponse
     */
    public CreateUploadVideoResponse createUploadVideo(CreateUploadVideoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createUploadVideoWithOptions(request, runtime);
    }

    public DecryptKMSDataKeyResponse decryptKMSDataKeyWithOptions(DecryptKMSDataKeyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cipherText)) {
            query.put("CipherText", request.cipherText);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DecryptKMSDataKey"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DecryptKMSDataKeyResponse());
    }

    public DecryptKMSDataKeyResponse decryptKMSDataKey(DecryptKMSDataKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.decryptKMSDataKeyWithOptions(request, runtime);
    }

    /**
      * *   Regions that support this operation: **China (Beijing)** and **China (Shanghai)**.
      * *   This operation deletes only information about images that are submitted for AI processing. The image files are not deleted.
      *
      * @param request DeleteAIImageInfosRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DeleteAIImageInfosResponse
     */
    public DeleteAIImageInfosResponse deleteAIImageInfosWithOptions(DeleteAIImageInfosRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.AIImageInfoIds)) {
            query.put("AIImageInfoIds", request.AIImageInfoIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * *   Regions that support this operation: **China (Beijing)** and **China (Shanghai)**.
      * *   This operation deletes only information about images that are submitted for AI processing. The image files are not deleted.
      *
      * @param request DeleteAIImageInfosRequest
      * @return DeleteAIImageInfosResponse
     */
    public DeleteAIImageInfosResponse deleteAIImageInfos(DeleteAIImageInfosRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAIImageInfosWithOptions(request, runtime);
    }

    /**
      * *   Regions that support this operation: **China (Beijing)**, **China (Shanghai)**, and **Singapore**.
      * *   You cannot delete an AI template that is set as the default template.
      *
      * @param request DeleteAITemplateRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DeleteAITemplateResponse
     */
    public DeleteAITemplateResponse deleteAITemplateWithOptions(DeleteAITemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * *   Regions that support this operation: **China (Beijing)**, **China (Shanghai)**, and **Singapore**.
      * *   You cannot delete an AI template that is set as the default template.
      *
      * @param request DeleteAITemplateRequest
      * @return DeleteAITemplateResponse
     */
    public DeleteAITemplateResponse deleteAITemplate(DeleteAITemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAITemplateWithOptions(request, runtime);
    }

    /**
      * Application with resources can not be deleted.
      *
      * @param request DeleteAppInfoRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DeleteAppInfoResponse
     */
    public DeleteAppInfoResponse deleteAppInfoWithOptions(DeleteAppInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * Application with resources can not be deleted.
      *
      * @param request DeleteAppInfoRequest
      * @return DeleteAppInfoResponse
     */
    public DeleteAppInfoResponse deleteAppInfo(DeleteAppInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAppInfoWithOptions(request, runtime);
    }

    /**
      * This operation physically deletes auxiliary media assets. Deleted auxiliary media assets cannot be recovered. Exercise caution when you call this operation.
      *
      * @param request DeleteAttachedMediaRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DeleteAttachedMediaResponse
     */
    public DeleteAttachedMediaResponse deleteAttachedMediaWithOptions(DeleteAttachedMediaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mediaIds)) {
            query.put("MediaIds", request.mediaIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * This operation physically deletes auxiliary media assets. Deleted auxiliary media assets cannot be recovered. Exercise caution when you call this operation.
      *
      * @param request DeleteAttachedMediaRequest
      * @return DeleteAttachedMediaResponse
     */
    public DeleteAttachedMediaResponse deleteAttachedMedia(DeleteAttachedMediaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAttachedMediaWithOptions(request, runtime);
    }

    /**
      * > If a video category is deleted, its subcategories, including level 2 and level 3 categories, are also deleted. Exercise caution when you call this operation.
      *
      * @param request DeleteCategoryRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DeleteCategoryResponse
     */
    public DeleteCategoryResponse deleteCategoryWithOptions(DeleteCategoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cateId)) {
            query.put("CateId", request.cateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * > If a video category is deleted, its subcategories, including level 2 and level 3 categories, are also deleted. Exercise caution when you call this operation.
      *
      * @param request DeleteCategoryRequest
      * @return DeleteCategoryResponse
     */
    public DeleteCategoryResponse deleteCategory(DeleteCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCategoryWithOptions(request, runtime);
    }

    /**
      * > This operation deletes only the information about animated stickers, but not the animated stickers themselves.
      *
      * @param request DeleteDynamicImageRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DeleteDynamicImageResponse
     */
    public DeleteDynamicImageResponse deleteDynamicImageWithOptions(DeleteDynamicImageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dynamicImageIds)) {
            query.put("DynamicImageIds", request.dynamicImageIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.videoId)) {
            query.put("VideoId", request.videoId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * > This operation deletes only the information about animated stickers, but not the animated stickers themselves.
      *
      * @param request DeleteDynamicImageRequest
      * @return DeleteDynamicImageResponse
     */
    public DeleteDynamicImageResponse deleteDynamicImage(DeleteDynamicImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDynamicImageWithOptions(request, runtime);
    }

    /**
      * You can call this operation to delete multiple online editing projects at a time.
      * ### QPS limits
      * You can call this operation up to 20 times per second per account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see [QPS limits on API operations in ApsaraVideo VOD](~~342790~~).
      *
      * @param request DeleteEditingProjectRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DeleteEditingProjectResponse
     */
    public DeleteEditingProjectResponse deleteEditingProjectWithOptions(DeleteEditingProjectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectIds)) {
            query.put("ProjectIds", request.projectIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * You can call this operation to delete multiple online editing projects at a time.
      * ### QPS limits
      * You can call this operation up to 20 times per second per account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see [QPS limits on API operations in ApsaraVideo VOD](~~342790~~).
      *
      * @param request DeleteEditingProjectRequest
      * @return DeleteEditingProjectResponse
     */
    public DeleteEditingProjectResponse deleteEditingProject(DeleteEditingProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteEditingProjectWithOptions(request, runtime);
    }

    public DeleteEditingProjectMaterialsResponse deleteEditingProjectMaterialsWithOptions(DeleteEditingProjectMaterialsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.materialIds)) {
            query.put("MaterialIds", request.materialIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.materialType)) {
            query.put("MaterialType", request.materialType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteEditingProjectMaterials"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteEditingProjectMaterialsResponse());
    }

    public DeleteEditingProjectMaterialsResponse deleteEditingProjectMaterials(DeleteEditingProjectMaterialsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteEditingProjectMaterialsWithOptions(request, runtime);
    }

    /**
      * *   After you call this operation to delete an image, the source file is permanently deleted and cannot be recovered. If some images are cached on Alibaba Cloud CDN points of presence (POPs), the image URLs do not immediately become invalid.
      * *   You can call this operation to delete uploaded images and video snapshots.
      * ### QPS limits
      * You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see [QPS limits on API operations in ApsaraVideo VOD](~~342790~~).
      *
      * @param request DeleteImageRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DeleteImageResponse
     */
    public DeleteImageResponse deleteImageWithOptions(DeleteImageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deleteImageType)) {
            query.put("DeleteImageType", request.deleteImageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageIds)) {
            query.put("ImageIds", request.imageIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageType)) {
            query.put("ImageType", request.imageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageURLs)) {
            query.put("ImageURLs", request.imageURLs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.videoId)) {
            query.put("VideoId", request.videoId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * *   After you call this operation to delete an image, the source file is permanently deleted and cannot be recovered. If some images are cached on Alibaba Cloud CDN points of presence (POPs), the image URLs do not immediately become invalid.
      * *   You can call this operation to delete uploaded images and video snapshots.
      * ### QPS limits
      * You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see [QPS limits on API operations in ApsaraVideo VOD](~~342790~~).
      *
      * @param request DeleteImageRequest
      * @return DeleteImageResponse
     */
    public DeleteImageResponse deleteImage(DeleteImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteImageWithOptions(request, runtime);
    }

    /**
      * > For more information, see [Overview](~~55627~~).
      *
      * @param request DeleteMessageCallbackRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DeleteMessageCallbackResponse
     */
    public DeleteMessageCallbackResponse deleteMessageCallbackWithOptions(DeleteMessageCallbackRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * > For more information, see [Overview](~~55627~~).
      *
      * @param request DeleteMessageCallbackRequest
      * @return DeleteMessageCallbackResponse
     */
    public DeleteMessageCallbackResponse deleteMessageCallback(DeleteMessageCallbackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteMessageCallbackWithOptions(request, runtime);
    }

    /**
      * All media processing operations in ApsaraVideo VOD, such as transcoding, snapshot capture, and content moderation, are performed on mezzanine files. If you delete the mezzanine files, you cannot perform follow-up media processing operations. Exercise caution when you call this operation.
      *
      * @param request DeleteMezzaninesRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DeleteMezzaninesResponse
     */
    public DeleteMezzaninesResponse deleteMezzaninesWithOptions(DeleteMezzaninesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.force)) {
            query.put("Force", request.force);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.videoIds)) {
            query.put("VideoIds", request.videoIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * All media processing operations in ApsaraVideo VOD, such as transcoding, snapshot capture, and content moderation, are performed on mezzanine files. If you delete the mezzanine files, you cannot perform follow-up media processing operations. Exercise caution when you call this operation.
      *
      * @param request DeleteMezzaninesRequest
      * @return DeleteMezzaninesResponse
     */
    public DeleteMezzaninesResponse deleteMezzanines(DeleteMezzaninesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteMezzaninesWithOptions(request, runtime);
    }

    /**
      * * In a multipart upload, fragments may be generated if the upload fails. In most cases, the fragments are automatically deleted after seven days. You can call this operation to delete the generated fragments after the upload is successful or fails.
      * * This operation does not delete the source file or transcoded file, but deletes only the fragments generated during the upload.
      * * If you call the [DeleteVideo](~~52837~~) operation, the entire video file is deleted, including the generated fragments.
      *
      * @param request DeleteMultipartUploadRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DeleteMultipartUploadResponse
     */
    public DeleteMultipartUploadResponse deleteMultipartUploadWithOptions(DeleteMultipartUploadRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mediaId)) {
            query.put("MediaId", request.mediaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaType)) {
            query.put("MediaType", request.mediaType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * * In a multipart upload, fragments may be generated if the upload fails. In most cases, the fragments are automatically deleted after seven days. You can call this operation to delete the generated fragments after the upload is successful or fails.
      * * This operation does not delete the source file or transcoded file, but deletes only the fragments generated during the upload.
      * * If you call the [DeleteVideo](~~52837~~) operation, the entire video file is deleted, including the generated fragments.
      *
      * @param request DeleteMultipartUploadRequest
      * @return DeleteMultipartUploadResponse
     */
    public DeleteMultipartUploadResponse deleteMultipartUpload(DeleteMultipartUploadRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteMultipartUploadWithOptions(request, runtime);
    }

    public DeleteStreamResponse deleteStreamWithOptions(DeleteStreamRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobIds)) {
            query.put("JobIds", request.jobIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.videoId)) {
            query.put("VideoId", request.videoId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteStreamWithOptions(request, runtime);
    }

    /**
      * *   You cannot call this operation to delete the default transcoding template. You can delete the transcoding template when it is no longer specified as the default one.
      * *   For security purposes, you cannot add, modify, or delete transcoding templates in a transcoding template group that is locked. To check whether a transcoding template group is locked, call the [GetTranscodeTemplateGroup](~~GetTranscodeTemplateGroup~~) operation and obtain the Locked parameter from the response. To modify transcoding templates within a locked transcoding template group, you must call the [UpdateTranscodeTemplateGroup](~~UpdateTranscodeTemplateGroup~~) operation to unlock the transcoding template group first.
      *
      * @param request DeleteTranscodeTemplateGroupRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DeleteTranscodeTemplateGroupResponse
     */
    public DeleteTranscodeTemplateGroupResponse deleteTranscodeTemplateGroupWithOptions(DeleteTranscodeTemplateGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.forceDelGroup)) {
            query.put("ForceDelGroup", request.forceDelGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transcodeTemplateGroupId)) {
            query.put("TranscodeTemplateGroupId", request.transcodeTemplateGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transcodeTemplateIds)) {
            query.put("TranscodeTemplateIds", request.transcodeTemplateIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * *   You cannot call this operation to delete the default transcoding template. You can delete the transcoding template when it is no longer specified as the default one.
      * *   For security purposes, you cannot add, modify, or delete transcoding templates in a transcoding template group that is locked. To check whether a transcoding template group is locked, call the [GetTranscodeTemplateGroup](~~GetTranscodeTemplateGroup~~) operation and obtain the Locked parameter from the response. To modify transcoding templates within a locked transcoding template group, you must call the [UpdateTranscodeTemplateGroup](~~UpdateTranscodeTemplateGroup~~) operation to unlock the transcoding template group first.
      *
      * @param request DeleteTranscodeTemplateGroupRequest
      * @return DeleteTranscodeTemplateGroupResponse
     */
    public DeleteTranscodeTemplateGroupResponse deleteTranscodeTemplateGroup(DeleteTranscodeTemplateGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteTranscodeTemplateGroupWithOptions(request, runtime);
    }

    /**
      * *   This operation physically deletes videos. Deleted videos cannot be recovered. Exercise caution when you call this operation.
      * *   You can call this operation to delete multiple videos at a time.
      * *   When you delete a video, its source file, transcoded stream file, and thumbnail screenshot are also deleted. However, the Alibaba Cloud Content Delivery Network (CDN) cache is not refreshed simultaneously. You can use the refresh feature in the ApsaraVideo VOD console to clear garbage data on CDN nodes. For more information, see [Refresh and prefetch](~~86098~~).
      *
      * @param request DeleteVideoRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DeleteVideoResponse
     */
    public DeleteVideoResponse deleteVideoWithOptions(DeleteVideoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.videoIds)) {
            query.put("VideoIds", request.videoIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * *   This operation physically deletes videos. Deleted videos cannot be recovered. Exercise caution when you call this operation.
      * *   You can call this operation to delete multiple videos at a time.
      * *   When you delete a video, its source file, transcoded stream file, and thumbnail screenshot are also deleted. However, the Alibaba Cloud Content Delivery Network (CDN) cache is not refreshed simultaneously. You can use the refresh feature in the ApsaraVideo VOD console to clear garbage data on CDN nodes. For more information, see [Refresh and prefetch](~~86098~~).
      *
      * @param request DeleteVideoRequest
      * @return DeleteVideoResponse
     */
    public DeleteVideoResponse deleteVideo(DeleteVideoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteVideoWithOptions(request, runtime);
    }

    /**
      * > *   This operation is available only in the **China (Shanghai)** region.
      * > *   After a domain name for CDN is removed from ApsaraVideo VOD, the domain name becomes unavailable. Proceed with caution. We recommend that you restore the A record at your DNS service provider before you remove the domain name for CDN.
      * > *   After you call this operation to remove a domain name for CDN from ApsaraVideo VOD, all records that are related to the domain name are deleted. If you only want to disable a domain name for CDN, call the [BatchStopVodDomain](~~120208~~) operation.
      *
      * @param request DeleteVodDomainRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DeleteVodDomainResponse
     */
    public DeleteVodDomainResponse deleteVodDomainWithOptions(DeleteVodDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * > *   This operation is available only in the **China (Shanghai)** region.
      * > *   After a domain name for CDN is removed from ApsaraVideo VOD, the domain name becomes unavailable. Proceed with caution. We recommend that you restore the A record at your DNS service provider before you remove the domain name for CDN.
      * > *   After you call this operation to remove a domain name for CDN from ApsaraVideo VOD, all records that are related to the domain name are deleted. If you only want to disable a domain name for CDN, call the [BatchStopVodDomain](~~120208~~) operation.
      *
      * @param request DeleteVodDomainRequest
      * @return DeleteVodDomainResponse
     */
    public DeleteVodDomainResponse deleteVodDomain(DeleteVodDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteVodDomainWithOptions(request, runtime);
    }

    /**
      * > *   This operation is available only in the **China (Shanghai)** region.
      * > *   After the configurations of a domain name for CDN are deleted, the domain name becomes unavailable. We recommend that you restore the A record at your DNS service provider before you delete the configurations of the domain name for CDN.
      * > *   After you call this operation to delete the configurations of a domain name for CDN, all records that are related to the domain name are deleted. If you only want to disable a domain name for CDN, call the [BatchStopVodDomain](~~120208~~) operation.
      *
      * @param request DeleteVodSpecificConfigRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DeleteVodSpecificConfigResponse
     */
    public DeleteVodSpecificConfigResponse deleteVodSpecificConfigWithOptions(DeleteVodSpecificConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configId)) {
            query.put("ConfigId", request.configId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.env)) {
            query.put("Env", request.env);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * > *   This operation is available only in the **China (Shanghai)** region.
      * > *   After the configurations of a domain name for CDN are deleted, the domain name becomes unavailable. We recommend that you restore the A record at your DNS service provider before you delete the configurations of the domain name for CDN.
      * > *   After you call this operation to delete the configurations of a domain name for CDN, all records that are related to the domain name are deleted. If you only want to disable a domain name for CDN, call the [BatchStopVodDomain](~~120208~~) operation.
      *
      * @param request DeleteVodSpecificConfigRequest
      * @return DeleteVodSpecificConfigResponse
     */
    public DeleteVodSpecificConfigResponse deleteVodSpecificConfig(DeleteVodSpecificConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteVodSpecificConfigWithOptions(request, runtime);
    }

    public DeleteVodTemplateResponse deleteVodTemplateWithOptions(DeleteVodTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.vodTemplateId)) {
            query.put("VodTemplateId", request.vodTemplateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteVodTemplateWithOptions(request, runtime);
    }

    /**
      * > *   The default watermark cannot be deleted.
      * > *   If you delete a watermark, its mezzanine file is also physically deleted and cannot be recovered.
      *
      * @param request DeleteWatermarkRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DeleteWatermarkResponse
     */
    public DeleteWatermarkResponse deleteWatermarkWithOptions(DeleteWatermarkRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.watermarkId)) {
            query.put("WatermarkId", request.watermarkId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * > *   The default watermark cannot be deleted.
      * > *   If you delete a watermark, its mezzanine file is also physically deleted and cannot be recovered.
      *
      * @param request DeleteWatermarkRequest
      * @return DeleteWatermarkResponse
     */
    public DeleteWatermarkResponse deleteWatermark(DeleteWatermarkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteWatermarkWithOptions(request, runtime);
    }

    /**
      * > *   This operation is available only in the **China (Shanghai)** region.
      * > *   You can query playback statistics on top 1,000 videos at most on a specified day. By default, top videos are sorted in descending order based on video views.
      * > *   You can call this operation to query only playback statistics collected on videos that are played by using ApsaraVideo Player SDKs.
      * > *   Playback statistics for the previous day are generated at 09:00 on the current day, in UTC+8.
      * > *   You can query data that is generated since January 1, 2018. The maximum time range to query is 180 days.
      *
      * @param request DescribePlayTopVideosRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribePlayTopVideosResponse
     */
    public DescribePlayTopVideosResponse describePlayTopVideosWithOptions(DescribePlayTopVideosRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizDate)) {
            query.put("BizDate", request.bizDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * > *   This operation is available only in the **China (Shanghai)** region.
      * > *   You can query playback statistics on top 1,000 videos at most on a specified day. By default, top videos are sorted in descending order based on video views.
      * > *   You can call this operation to query only playback statistics collected on videos that are played by using ApsaraVideo Player SDKs.
      * > *   Playback statistics for the previous day are generated at 09:00 on the current day, in UTC+8.
      * > *   You can query data that is generated since January 1, 2018. The maximum time range to query is 180 days.
      *
      * @param request DescribePlayTopVideosRequest
      * @return DescribePlayTopVideosResponse
     */
    public DescribePlayTopVideosResponse describePlayTopVideos(DescribePlayTopVideosRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePlayTopVideosWithOptions(request, runtime);
    }

    /**
      * > *   This operation is available only in the **China (Shanghai)** region.
      * > *   You can call this operation to query only playback statistics collected on videos that are played by using ApsaraVideo Player SDKs.
      * > *   Playback statistics for the previous day are generated at 09:00 on the current day, in UTC+8.
      * > *   You can query data that is generated since January 1, 2018. The maximum time range to query is 180 days.
      *
      * @param request DescribePlayUserAvgRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribePlayUserAvgResponse
     */
    public DescribePlayUserAvgResponse describePlayUserAvgWithOptions(DescribePlayUserAvgRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * > *   This operation is available only in the **China (Shanghai)** region.
      * > *   You can call this operation to query only playback statistics collected on videos that are played by using ApsaraVideo Player SDKs.
      * > *   Playback statistics for the previous day are generated at 09:00 on the current day, in UTC+8.
      * > *   You can query data that is generated since January 1, 2018. The maximum time range to query is 180 days.
      *
      * @param request DescribePlayUserAvgRequest
      * @return DescribePlayUserAvgResponse
     */
    public DescribePlayUserAvgResponse describePlayUserAvg(DescribePlayUserAvgRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePlayUserAvgWithOptions(request, runtime);
    }

    /**
      * *   This operation is available only in the **China (Shanghai)** region.
      * *   You can call this operation to query only playback statistics collected on videos that are played by using ApsaraVideo Player SDKs.
      * *   Playback statistics for the current day are generated at 09:00 (UTC+8) on the next day.
      * *   You can query data that is generated since January 1, 2018. The maximum time range to query is 180 days.
      *
      * @param request DescribePlayUserTotalRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribePlayUserTotalResponse
     */
    public DescribePlayUserTotalResponse describePlayUserTotalWithOptions(DescribePlayUserTotalRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * *   This operation is available only in the **China (Shanghai)** region.
      * *   You can call this operation to query only playback statistics collected on videos that are played by using ApsaraVideo Player SDKs.
      * *   Playback statistics for the current day are generated at 09:00 (UTC+8) on the next day.
      * *   You can query data that is generated since January 1, 2018. The maximum time range to query is 180 days.
      *
      * @param request DescribePlayUserTotalRequest
      * @return DescribePlayUserTotalResponse
     */
    public DescribePlayUserTotalResponse describePlayUserTotal(DescribePlayUserTotalRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePlayUserTotalWithOptions(request, runtime);
    }

    /**
      * *   This operation is available only in the **China (Shanghai)** region.
      * *   You can call this operation to query only playback statistics collected on videos that are played by using ApsaraVideo Player SDKs.
      * *   Playback statistics for the current day are generated at 09:00 (UTC+8) on the next day.
      * *   You can query only data in the last 730 days. The maximum time range to query is 180 days.
      *
      * @param request DescribePlayVideoStatisRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribePlayVideoStatisResponse
     */
    public DescribePlayVideoStatisResponse describePlayVideoStatisWithOptions(DescribePlayVideoStatisRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.videoId)) {
            query.put("VideoId", request.videoId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * *   This operation is available only in the **China (Shanghai)** region.
      * *   You can call this operation to query only playback statistics collected on videos that are played by using ApsaraVideo Player SDKs.
      * *   Playback statistics for the current day are generated at 09:00 (UTC+8) on the next day.
      * *   You can query only data in the last 730 days. The maximum time range to query is 180 days.
      *
      * @param request DescribePlayVideoStatisRequest
      * @return DescribePlayVideoStatisResponse
     */
    public DescribePlayVideoStatisResponse describePlayVideoStatis(DescribePlayVideoStatisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePlayVideoStatisWithOptions(request, runtime);
    }

    /**
      * > *   This operation is available only in the **China (Shanghai)** region.
      * >*   If the time range to query is less than or equal to seven days, the system returns the statistics collected on an hourly basis. If the time range to query is greater than seven days, the system returns the statistics collected on a daily basis. The maximum time range that you can specify to query is 31 days.
      *
      * @param request DescribeVodAIDataRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeVodAIDataResponse
     */
    public DescribeVodAIDataResponse describeVodAIDataWithOptions(DescribeVodAIDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.AIType)) {
            query.put("AIType", request.AIType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * > *   This operation is available only in the **China (Shanghai)** region.
      * >*   If the time range to query is less than or equal to seven days, the system returns the statistics collected on an hourly basis. If the time range to query is greater than seven days, the system returns the statistics collected on a daily basis. The maximum time range that you can specify to query is 31 days.
      *
      * @param request DescribeVodAIDataRequest
      * @return DescribeVodAIDataResponse
     */
    public DescribeVodAIDataResponse describeVodAIData(DescribeVodAIDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodAIDataWithOptions(request, runtime);
    }

    /**
      * > This operation is available only in the **China (Shanghai)** region.
      *
      * @param request DescribeVodCertificateListRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeVodCertificateListResponse
     */
    public DescribeVodCertificateListResponse describeVodCertificateListWithOptions(DescribeVodCertificateListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * > This operation is available only in the **China (Shanghai)** region.
      *
      * @param request DescribeVodCertificateListRequest
      * @return DescribeVodCertificateListResponse
     */
    public DescribeVodCertificateListResponse describeVodCertificateList(DescribeVodCertificateListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodCertificateListWithOptions(request, runtime);
    }

    /**
      * If you specify neither the StartTime parameter nor the EndTime parameter, the data in the last 24 hours is queried. Alternatively, you can specify both the StartTime and EndTime parameters to query data that is generated in the specified duration. You can query data for the last 90 days at most.
      *
      * @param request DescribeVodDomainBpsDataRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeVodDomainBpsDataResponse
     */
    public DescribeVodDomainBpsDataResponse describeVodDomainBpsDataWithOptions(DescribeVodDomainBpsDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ispNameEn)) {
            query.put("IspNameEn", request.ispNameEn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.locationNameEn)) {
            query.put("LocationNameEn", request.locationNameEn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * If you specify neither the StartTime parameter nor the EndTime parameter, the data in the last 24 hours is queried. Alternatively, you can specify both the StartTime and EndTime parameters to query data that is generated in the specified duration. You can query data for the last 90 days at most.
      *
      * @param request DescribeVodDomainBpsDataRequest
      * @return DescribeVodDomainBpsDataResponse
     */
    public DescribeVodDomainBpsDataResponse describeVodDomainBpsData(DescribeVodDomainBpsDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodDomainBpsDataWithOptions(request, runtime);
    }

    /**
      * > This operation is available only in the **China (Shanghai)** region.
      *
      * @param request DescribeVodDomainCertificateInfoRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeVodDomainCertificateInfoResponse
     */
    public DescribeVodDomainCertificateInfoResponse describeVodDomainCertificateInfoWithOptions(DescribeVodDomainCertificateInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * > This operation is available only in the **China (Shanghai)** region.
      *
      * @param request DescribeVodDomainCertificateInfoRequest
      * @return DescribeVodDomainCertificateInfoResponse
     */
    public DescribeVodDomainCertificateInfoResponse describeVodDomainCertificateInfo(DescribeVodDomainCertificateInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodDomainCertificateInfoWithOptions(request, runtime);
    }

    /**
      * > This operation is available only in the **China (Shanghai)** region.
      *
      * @param request DescribeVodDomainConfigsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeVodDomainConfigsResponse
     */
    public DescribeVodDomainConfigsResponse describeVodDomainConfigsWithOptions(DescribeVodDomainConfigsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.functionNames)) {
            query.put("FunctionNames", request.functionNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * > This operation is available only in the **China (Shanghai)** region.
      *
      * @param request DescribeVodDomainConfigsRequest
      * @return DescribeVodDomainConfigsResponse
     */
    public DescribeVodDomainConfigsResponse describeVodDomainConfigs(DescribeVodDomainConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodDomainConfigsWithOptions(request, runtime);
    }

    /**
      * > This operation is available only in the **China (Shanghai)** region.
      *
      * @param request DescribeVodDomainDetailRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeVodDomainDetailResponse
     */
    public DescribeVodDomainDetailResponse describeVodDomainDetailWithOptions(DescribeVodDomainDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * > This operation is available only in the **China (Shanghai)** region.
      *
      * @param request DescribeVodDomainDetailRequest
      * @return DescribeVodDomainDetailResponse
     */
    public DescribeVodDomainDetailResponse describeVodDomainDetail(DescribeVodDomainDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodDomainDetailWithOptions(request, runtime);
    }

    /**
      * *   This operation is available only in the **China (Shanghai)** region.
      * *   For more information about the log format and latency, see [Download logs](~~86099~~).
      * *   If you specify neither StartTime nor EndTime, the log data in the previous 24 hours is queried.
      * *   You can specify both StartTime and EndTime to query the log data that is generated in the specified time range.
      * ### [](#qps)QPS limits
      * You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see [QPS limits on API operations](~~342790~~).
      *
      * @param request DescribeVodDomainLogRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeVodDomainLogResponse
     */
    public DescribeVodDomainLogResponse describeVodDomainLogWithOptions(DescribeVodDomainLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * *   This operation is available only in the **China (Shanghai)** region.
      * *   For more information about the log format and latency, see [Download logs](~~86099~~).
      * *   If you specify neither StartTime nor EndTime, the log data in the previous 24 hours is queried.
      * *   You can specify both StartTime and EndTime to query the log data that is generated in the specified time range.
      * ### [](#qps)QPS limits
      * You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see [QPS limits on API operations](~~342790~~).
      *
      * @param request DescribeVodDomainLogRequest
      * @return DescribeVodDomainLogResponse
     */
    public DescribeVodDomainLogResponse describeVodDomainLog(DescribeVodDomainLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodDomainLogWithOptions(request, runtime);
    }

    /**
      * * This operation is available only in the **China (Shanghai)** region.
      * * ApsaraVideo VOD stores the origin bandwidth data for 90 days before the data is deleted.
      * * If you do not set the `StartTime` or `EndTime` parameter, the request returns the data collected in the last 24 hours. If you set both the `StartTime` and `EndTime` parameters, the request returns the data collected within the specified time range.
      * * You can specify a maximum of 500 domain names in a request. Separate multiple domain names with commas (,). If you specify multiple domain names in a request, aggregation results are returned.
      * ### Time granularity
      * The time granularity supported by the Interval parameter varies based on the time range per query specified by using `StartTime` and `EndTime`. The following table describes the time period within which historical data is available and the data delay.
      * |Time granularity|Time range per query (days)|Historical data available (days)|Data delay|
      * |---|---|---|---|
      * |5 minutes|(0, 3\\]|93|15 minutes|
      * |1 hour|(3, 31\\]|186|4 hours|
      * |1 day|(31, 366\\]|366|04:00 on the next day|
      *
      * @param request DescribeVodDomainSrcBpsDataRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeVodDomainSrcBpsDataResponse
     */
    public DescribeVodDomainSrcBpsDataResponse describeVodDomainSrcBpsDataWithOptions(DescribeVodDomainSrcBpsDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * * This operation is available only in the **China (Shanghai)** region.
      * * ApsaraVideo VOD stores the origin bandwidth data for 90 days before the data is deleted.
      * * If you do not set the `StartTime` or `EndTime` parameter, the request returns the data collected in the last 24 hours. If you set both the `StartTime` and `EndTime` parameters, the request returns the data collected within the specified time range.
      * * You can specify a maximum of 500 domain names in a request. Separate multiple domain names with commas (,). If you specify multiple domain names in a request, aggregation results are returned.
      * ### Time granularity
      * The time granularity supported by the Interval parameter varies based on the time range per query specified by using `StartTime` and `EndTime`. The following table describes the time period within which historical data is available and the data delay.
      * |Time granularity|Time range per query (days)|Historical data available (days)|Data delay|
      * |---|---|---|---|
      * |5 minutes|(0, 3\\]|93|15 minutes|
      * |1 hour|(3, 31\\]|186|4 hours|
      * |1 day|(31, 366\\]|366|04:00 on the next day|
      *
      * @param request DescribeVodDomainSrcBpsDataRequest
      * @return DescribeVodDomainSrcBpsDataResponse
     */
    public DescribeVodDomainSrcBpsDataResponse describeVodDomainSrcBpsData(DescribeVodDomainSrcBpsDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodDomainSrcBpsDataWithOptions(request, runtime);
    }

    /**
      * * This operation is available only in the **China (Shanghai)** region.
      * * ApsaraVideo VOD stores the origin traffic data for 90 days before the data is deleted.
      * * If you do not set the `StartTime` or `EndTime` parameter, the request returns the data collected in the last 24 hours. If you set both the `StartTime` and `EndTime` parameters, the request returns the data collected within the specified time range.
      * * You can specify a maximum of 500 domain names in a request. Separate multiple domain names with commas (,). If you specify multiple domain names in a request, aggregation results are returned.
      * ### Time granularity
      * The time granularity supported by the Interval parameter varies based on the time range per query specified by using `StartTime` and `EndTime`. The following table describes the time period within which historical data is available and the data delay.
      * |Time granularity|Time range per query (days)|Historical data available (days)|Data delay|
      * |---|---|---|---|
      * |5 minutes|(0, 3\\]|93|15 minutes|
      * |1 hour|(3, 31\\]|186|4 hours|
      * |1 day|(31, 366\\]|366|04:00 on the next day|
      *
      * @param request DescribeVodDomainSrcTrafficDataRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeVodDomainSrcTrafficDataResponse
     */
    public DescribeVodDomainSrcTrafficDataResponse describeVodDomainSrcTrafficDataWithOptions(DescribeVodDomainSrcTrafficDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVodDomainSrcTrafficData"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVodDomainSrcTrafficDataResponse());
    }

    /**
      * * This operation is available only in the **China (Shanghai)** region.
      * * ApsaraVideo VOD stores the origin traffic data for 90 days before the data is deleted.
      * * If you do not set the `StartTime` or `EndTime` parameter, the request returns the data collected in the last 24 hours. If you set both the `StartTime` and `EndTime` parameters, the request returns the data collected within the specified time range.
      * * You can specify a maximum of 500 domain names in a request. Separate multiple domain names with commas (,). If you specify multiple domain names in a request, aggregation results are returned.
      * ### Time granularity
      * The time granularity supported by the Interval parameter varies based on the time range per query specified by using `StartTime` and `EndTime`. The following table describes the time period within which historical data is available and the data delay.
      * |Time granularity|Time range per query (days)|Historical data available (days)|Data delay|
      * |---|---|---|---|
      * |5 minutes|(0, 3\\]|93|15 minutes|
      * |1 hour|(3, 31\\]|186|4 hours|
      * |1 day|(31, 366\\]|366|04:00 on the next day|
      *
      * @param request DescribeVodDomainSrcTrafficDataRequest
      * @return DescribeVodDomainSrcTrafficDataResponse
     */
    public DescribeVodDomainSrcTrafficDataResponse describeVodDomainSrcTrafficData(DescribeVodDomainSrcTrafficDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodDomainSrcTrafficDataWithOptions(request, runtime);
    }

    /**
      * *   This operation is available only in the **China (Shanghai)** region.
      * *   You can specify multiple accelerated domain names in a request.
      * *   If you do not specify the StartTime or EndTime parameter, data of the last 24 hours is returned. You can specify the StartTime and EndTime parameters to query data that is generated in the specified time range. You can query data of the last 90 days.
      * ### QPS limit
      * You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see [QPS limit on API operations](~~342790~~).
      *
      * @param request DescribeVodDomainTrafficDataRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeVodDomainTrafficDataResponse
     */
    public DescribeVodDomainTrafficDataResponse describeVodDomainTrafficDataWithOptions(DescribeVodDomainTrafficDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ispNameEn)) {
            query.put("IspNameEn", request.ispNameEn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.locationNameEn)) {
            query.put("LocationNameEn", request.locationNameEn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * *   This operation is available only in the **China (Shanghai)** region.
      * *   You can specify multiple accelerated domain names in a request.
      * *   If you do not specify the StartTime or EndTime parameter, data of the last 24 hours is returned. You can specify the StartTime and EndTime parameters to query data that is generated in the specified time range. You can query data of the last 90 days.
      * ### QPS limit
      * You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see [QPS limit on API operations](~~342790~~).
      *
      * @param request DescribeVodDomainTrafficDataRequest
      * @return DescribeVodDomainTrafficDataResponse
     */
    public DescribeVodDomainTrafficDataResponse describeVodDomainTrafficData(DescribeVodDomainTrafficDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodDomainTrafficDataWithOptions(request, runtime);
    }

    /**
      * *   This operation is available only in the **China (Shanghai)** region.
      * *   You can specify up to 100 accelerated domain names in a request. Separate multiple domain names with commas (,). If you do not specify an accelerated domain name, the data of all accelerated domain names within your Alibaba Cloud account is returned.
      * *   You can query data in the last year. The maximum time range that can be queried is three months. If you specify a time range of one to three days, the system returns data on an hourly basis. If you specify a time range of four days or more, the system returns data on a daily basis.
      *
      * @param request DescribeVodDomainUsageDataRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeVodDomainUsageDataResponse
     */
    public DescribeVodDomainUsageDataResponse describeVodDomainUsageDataWithOptions(DescribeVodDomainUsageDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.area)) {
            query.put("Area", request.area);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.field)) {
            query.put("Field", request.field);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * *   This operation is available only in the **China (Shanghai)** region.
      * *   You can specify up to 100 accelerated domain names in a request. Separate multiple domain names with commas (,). If you do not specify an accelerated domain name, the data of all accelerated domain names within your Alibaba Cloud account is returned.
      * *   You can query data in the last year. The maximum time range that can be queried is three months. If you specify a time range of one to three days, the system returns data on an hourly basis. If you specify a time range of four days or more, the system returns data on a daily basis.
      *
      * @param request DescribeVodDomainUsageDataRequest
      * @return DescribeVodDomainUsageDataResponse
     */
    public DescribeVodDomainUsageDataResponse describeVodDomainUsageData(DescribeVodDomainUsageDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodDomainUsageDataWithOptions(request, runtime);
    }

    /**
      * > *   This operation is available only in the **China (Shanghai)** region.
      * > *   You can call the [RefreshVodObjectCaches](~~69215~~) operation to refresh content and the [PreloadVodObjectCaches](~~69211~~) operation to prefetch content.
      *
      * @param request DescribeVodRefreshQuotaRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeVodRefreshQuotaResponse
     */
    public DescribeVodRefreshQuotaResponse describeVodRefreshQuotaWithOptions(DescribeVodRefreshQuotaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * > *   This operation is available only in the **China (Shanghai)** region.
      * > *   You can call the [RefreshVodObjectCaches](~~69215~~) operation to refresh content and the [PreloadVodObjectCaches](~~69211~~) operation to prefetch content.
      *
      * @param request DescribeVodRefreshQuotaRequest
      * @return DescribeVodRefreshQuotaResponse
     */
    public DescribeVodRefreshQuotaResponse describeVodRefreshQuota(DescribeVodRefreshQuotaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodRefreshQuotaWithOptions(request, runtime);
    }

    /**
      * > *   This operation is available only in the **China (Shanghai)** region.
      * >*   If you do not specify the TaskId or ObjectPath parameter, the data in the last three days is returned on the first page. By default, one page displays a maximum of 20 entries. You can specify the TaskId and ObjectPath parameters at the same time.
      *
      * @param request DescribeVodRefreshTasksRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeVodRefreshTasksResponse
     */
    public DescribeVodRefreshTasksResponse describeVodRefreshTasksWithOptions(DescribeVodRefreshTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.objectPath)) {
            query.put("ObjectPath", request.objectPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.objectType)) {
            query.put("ObjectType", request.objectType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * > *   This operation is available only in the **China (Shanghai)** region.
      * >*   If you do not specify the TaskId or ObjectPath parameter, the data in the last three days is returned on the first page. By default, one page displays a maximum of 20 entries. You can specify the TaskId and ObjectPath parameters at the same time.
      *
      * @param request DescribeVodRefreshTasksRequest
      * @return DescribeVodRefreshTasksResponse
     */
    public DescribeVodRefreshTasksResponse describeVodRefreshTasks(DescribeVodRefreshTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodRefreshTasksWithOptions(request, runtime);
    }

    /**
      * > *   This operation is available only in the **China (Shanghai)** region.
      * >*   If the time range to query is less than or equal to seven days, the system returns the statistics collected on an hourly basis. If the time range to query is greater than seven days, the system returns the statistics collected on a daily basis. The maximum time range that you can specify to query is 31 days.
      *
      * @param request DescribeVodStorageDataRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeVodStorageDataResponse
     */
    public DescribeVodStorageDataResponse describeVodStorageDataWithOptions(DescribeVodStorageDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storage)) {
            query.put("Storage", request.storage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageType)) {
            query.put("StorageType", request.storageType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * > *   This operation is available only in the **China (Shanghai)** region.
      * >*   If the time range to query is less than or equal to seven days, the system returns the statistics collected on an hourly basis. If the time range to query is greater than seven days, the system returns the statistics collected on a daily basis. The maximum time range that you can specify to query is 31 days.
      *
      * @param request DescribeVodStorageDataRequest
      * @return DescribeVodStorageDataResponse
     */
    public DescribeVodStorageDataResponse describeVodStorageData(DescribeVodStorageDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodStorageDataWithOptions(request, runtime);
    }

    /**
      * *   This operation is available only in the **China (Shanghai)** region.
      * *   If the time range to query is less than or equal to seven days, the system returns the statistics collected on an hourly basis. If the time range to query is greater than seven days, the system returns the statistics collected on a daily basis. The maximum time range that you can specify to query is 31 days.
      *
      * @param request DescribeVodTranscodeDataRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeVodTranscodeDataResponse
     */
    public DescribeVodTranscodeDataResponse describeVodTranscodeDataWithOptions(DescribeVodTranscodeDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.specification)) {
            query.put("Specification", request.specification);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storage)) {
            query.put("Storage", request.storage);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * *   This operation is available only in the **China (Shanghai)** region.
      * *   If the time range to query is less than or equal to seven days, the system returns the statistics collected on an hourly basis. If the time range to query is greater than seven days, the system returns the statistics collected on a daily basis. The maximum time range that you can specify to query is 31 days.
      *
      * @param request DescribeVodTranscodeDataRequest
      * @return DescribeVodTranscodeDataResponse
     */
    public DescribeVodTranscodeDataResponse describeVodTranscodeData(DescribeVodTranscodeDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodTranscodeDataWithOptions(request, runtime);
    }

    public DescribeVodUserDomainsResponse describeVodUserDomainsWithOptions(DescribeVodUserDomainsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainSearchType)) {
            query.put("DomainSearchType", request.domainSearchType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainStatus)) {
            query.put("DomainStatus", request.domainStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodUserDomainsWithOptions(request, runtime);
    }

    public DescribeVodVerifyContentResponse describeVodVerifyContentWithOptions(DescribeVodVerifyContentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodVerifyContentWithOptions(request, runtime);
    }

    /**
      * You can grant a maximum of 10 application permissions to a RAM user or RAM role.
      *
      * @param request DetachAppPolicyFromIdentityRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DetachAppPolicyFromIdentityResponse
     */
    public DetachAppPolicyFromIdentityResponse detachAppPolicyFromIdentityWithOptions(DetachAppPolicyFromIdentityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identityName)) {
            query.put("IdentityName", request.identityName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identityType)) {
            query.put("IdentityType", request.identityType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyNames)) {
            query.put("PolicyNames", request.policyNames);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * You can grant a maximum of 10 application permissions to a RAM user or RAM role.
      *
      * @param request DetachAppPolicyFromIdentityRequest
      * @return DetachAppPolicyFromIdentityResponse
     */
    public DetachAppPolicyFromIdentityResponse detachAppPolicyFromIdentity(DetachAppPolicyFromIdentityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detachAppPolicyFromIdentityWithOptions(request, runtime);
    }

    public GenerateDownloadSecretKeyResponse generateDownloadSecretKeyWithOptions(GenerateDownloadSecretKeyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appDecryptKey)) {
            query.put("AppDecryptKey", request.appDecryptKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appIdentification)) {
            query.put("AppIdentification", request.appIdentification);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GenerateDownloadSecretKey"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GenerateDownloadSecretKeyResponse());
    }

    public GenerateDownloadSecretKeyResponse generateDownloadSecretKey(GenerateDownloadSecretKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.generateDownloadSecretKeyWithOptions(request, runtime);
    }

    public GenerateKMSDataKeyResponse generateKMSDataKeyWithOptions(GenerateKMSDataKeyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GenerateKMSDataKey"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GenerateKMSDataKeyResponse());
    }

    public GenerateKMSDataKeyResponse generateKMSDataKey(GenerateKMSDataKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.generateKMSDataKeyWithOptions(request, runtime);
    }

    /**
      * *   Regions that support this operation: **China (Beijing)** and **China (Shanghai)**.
      * *   Call the [SubmitAIImageJob](~~SubmitAIImageJob~~) operation to submit image AI processing jobs before you call this operation to query image AI processing jobs.
      * *   You can query a maximum of 10 jobs of image AI processing in one request.
      *
      * @param request GetAIImageJobsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetAIImageJobsResponse
     */
    public GetAIImageJobsResponse getAIImageJobsWithOptions(GetAIImageJobsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobIds)) {
            query.put("JobIds", request.jobIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * *   Regions that support this operation: **China (Beijing)** and **China (Shanghai)**.
      * *   Call the [SubmitAIImageJob](~~SubmitAIImageJob~~) operation to submit image AI processing jobs before you call this operation to query image AI processing jobs.
      * *   You can query a maximum of 10 jobs of image AI processing in one request.
      *
      * @param request GetAIImageJobsRequest
      * @return GetAIImageJobsResponse
     */
    public GetAIImageJobsResponse getAIImageJobs(GetAIImageJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAIImageJobsWithOptions(request, runtime);
    }

    /**
      * ApsaraVideo VOD stores the snapshots of the intelligent review results free of charge for two weeks. After this period, the snapshots are automatically deleted.
      *
      * @param request GetAIMediaAuditJobRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetAIMediaAuditJobResponse
     */
    public GetAIMediaAuditJobResponse getAIMediaAuditJobWithOptions(GetAIMediaAuditJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * ApsaraVideo VOD stores the snapshots of the intelligent review results free of charge for two weeks. After this period, the snapshots are automatically deleted.
      *
      * @param request GetAIMediaAuditJobRequest
      * @return GetAIMediaAuditJobResponse
     */
    public GetAIMediaAuditJobResponse getAIMediaAuditJob(GetAIMediaAuditJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAIMediaAuditJobWithOptions(request, runtime);
    }

    /**
      * *   Regions that support this operation: **China (Beijing)**, **China (Shanghai)**, and **Singapore**.
      * *   Before you call this operation to query details of an AI template, you must obtain the ID of the AI template.
      *
      * @param request GetAITemplateRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetAITemplateResponse
     */
    public GetAITemplateResponse getAITemplateWithOptions(GetAITemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * *   Regions that support this operation: **China (Beijing)**, **China (Shanghai)**, and **Singapore**.
      * *   Before you call this operation to query details of an AI template, you must obtain the ID of the AI template.
      *
      * @param request GetAITemplateRequest
      * @return GetAITemplateResponse
     */
    public GetAITemplateResponse getAITemplate(GetAITemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAITemplateWithOptions(request, runtime);
    }

    /**
      * *   Regions that support this operation: **China (Beijing)**, **China (Shanghai)**, and **Singapore**.
      * *   You can obtain the smart tagging results by using the video ID.
      *
      * @param request GetAIVideoTagResultRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetAIVideoTagResultResponse
     */
    public GetAIVideoTagResultResponse getAIVideoTagResultWithOptions(GetAIVideoTagResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mediaId)) {
            query.put("MediaId", request.mediaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * *   Regions that support this operation: **China (Beijing)**, **China (Shanghai)**, and **Singapore**.
      * *   You can obtain the smart tagging results by using the video ID.
      *
      * @param request GetAIVideoTagResultRequest
      * @return GetAIVideoTagResultResponse
     */
    public GetAIVideoTagResultResponse getAIVideoTagResult(GetAIVideoTagResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAIVideoTagResultWithOptions(request, runtime);
    }

    /**
      * Supports batch query.
      *
      * @param request GetAppInfosRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetAppInfosResponse
     */
    public GetAppInfosResponse getAppInfosWithOptions(GetAppInfosRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appIds)) {
            query.put("AppIds", request.appIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * Supports batch query.
      *
      * @param request GetAppInfosRequest
      * @return GetAppInfosResponse
     */
    public GetAppInfosResponse getAppInfos(GetAppInfosRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAppInfosWithOptions(request, runtime);
    }

    public GetAttachedMediaInfoResponse getAttachedMediaInfoWithOptions(GetAttachedMediaInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authTimeout)) {
            query.put("AuthTimeout", request.authTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaIds)) {
            query.put("MediaIds", request.mediaIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputType)) {
            query.put("OutputType", request.outputType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAttachedMediaInfoWithOptions(request, runtime);
    }

    public GetAuditHistoryResponse getAuditHistoryWithOptions(GetAuditHistoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.videoId)) {
            query.put("VideoId", request.videoId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAuditHistoryWithOptions(request, runtime);
    }

    public GetCategoriesResponse getCategoriesWithOptions(GetCategoriesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cateId)) {
            query.put("CateId", request.cateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCategoriesWithOptions(request, runtime);
    }

    /**
      * *   Regions that support this operation: **China (Beijing)**, **China (Shanghai)**, and **Singapore**.
      * *   You can query information only about the default AI template for automated review.
      *
      * @param request GetDefaultAITemplateRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetDefaultAITemplateResponse
     */
    public GetDefaultAITemplateResponse getDefaultAITemplateWithOptions(GetDefaultAITemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.templateType)) {
            query.put("TemplateType", request.templateType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * *   Regions that support this operation: **China (Beijing)**, **China (Shanghai)**, and **Singapore**.
      * *   You can query information only about the default AI template for automated review.
      *
      * @param request GetDefaultAITemplateRequest
      * @return GetDefaultAITemplateResponse
     */
    public GetDefaultAITemplateResponse getDefaultAITemplate(GetDefaultAITemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDefaultAITemplateWithOptions(request, runtime);
    }

    /**
      * *   You can call this operation to query the results of digital watermark extraction jobs that are created in the last two years.
      *
      * @param request GetDigitalWatermarkExtractResultRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetDigitalWatermarkExtractResultResponse
     */
    public GetDigitalWatermarkExtractResultResponse getDigitalWatermarkExtractResultWithOptions(GetDigitalWatermarkExtractResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.extractType)) {
            query.put("ExtractType", request.extractType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaId)) {
            query.put("MediaId", request.mediaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDigitalWatermarkExtractResult"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDigitalWatermarkExtractResultResponse());
    }

    /**
      * *   You can call this operation to query the results of digital watermark extraction jobs that are created in the last two years.
      *
      * @param request GetDigitalWatermarkExtractResultRequest
      * @return GetDigitalWatermarkExtractResultResponse
     */
    public GetDigitalWatermarkExtractResultResponse getDigitalWatermarkExtractResult(GetDigitalWatermarkExtractResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDigitalWatermarkExtractResultWithOptions(request, runtime);
    }

    public GetEditingProjectResponse getEditingProjectWithOptions(GetEditingProjectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getEditingProjectWithOptions(request, runtime);
    }

    /**
      * During editing, you can add materials to the timeline, but some of them may not be used.
      *
      * @param request GetEditingProjectMaterialsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetEditingProjectMaterialsResponse
     */
    public GetEditingProjectMaterialsResponse getEditingProjectMaterialsWithOptions(GetEditingProjectMaterialsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.materialType)) {
            query.put("MaterialType", request.materialType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * During editing, you can add materials to the timeline, but some of them may not be used.
      *
      * @param request GetEditingProjectMaterialsRequest
      * @return GetEditingProjectMaterialsResponse
     */
    public GetEditingProjectMaterialsResponse getEditingProjectMaterials(GetEditingProjectMaterialsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getEditingProjectMaterialsWithOptions(request, runtime);
    }

    public GetImageInfoResponse getImageInfoWithOptions(GetImageInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authTimeout)) {
            query.put("AuthTimeout", request.authTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            query.put("ImageId", request.imageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputType)) {
            query.put("OutputType", request.outputType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getImageInfoWithOptions(request, runtime);
    }

    /**
      * You can call this operation to query the basic information about multiple images at a time, such as the image title, type, creation time, tags, and URL.
      * ### Limits
      * You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see [QPS limit on an API operation in ApsaraVideo Live](~~342790~~).
      *
      * @param request GetImageInfosRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetImageInfosResponse
     */
    public GetImageInfosResponse getImageInfosWithOptions(GetImageInfosRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authTimeout)) {
            query.put("AuthTimeout", request.authTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageIds)) {
            query.put("ImageIds", request.imageIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputType)) {
            query.put("OutputType", request.outputType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetImageInfos"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetImageInfosResponse());
    }

    /**
      * You can call this operation to query the basic information about multiple images at a time, such as the image title, type, creation time, tags, and URL.
      * ### Limits
      * You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see [QPS limit on an API operation in ApsaraVideo Live](~~342790~~).
      *
      * @param request GetImageInfosRequest
      * @return GetImageInfosResponse
     */
    public GetImageInfosResponse getImageInfos(GetImageInfosRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getImageInfosWithOptions(request, runtime);
    }

    /**
      * If notifications for the [CreateAuditComplete](~~89576~~) event are configured, event notifications are sent to the callback URL after automated review is complete. You can call this operation to query the details of audio review results.
      *
      * @param request GetMediaAuditAudioResultDetailRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetMediaAuditAudioResultDetailResponse
     */
    public GetMediaAuditAudioResultDetailResponse getMediaAuditAudioResultDetailWithOptions(GetMediaAuditAudioResultDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mediaId)) {
            query.put("MediaId", request.mediaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * If notifications for the [CreateAuditComplete](~~89576~~) event are configured, event notifications are sent to the callback URL after automated review is complete. You can call this operation to query the details of audio review results.
      *
      * @param request GetMediaAuditAudioResultDetailRequest
      * @return GetMediaAuditAudioResultDetailResponse
     */
    public GetMediaAuditAudioResultDetailResponse getMediaAuditAudioResultDetail(GetMediaAuditAudioResultDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMediaAuditAudioResultDetailWithOptions(request, runtime);
    }

    public GetMediaAuditResultResponse getMediaAuditResultWithOptions(GetMediaAuditResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mediaId)) {
            query.put("MediaId", request.mediaId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMediaAuditResultWithOptions(request, runtime);
    }

    /**
      * - By default, only details of snapshots that violate content regulations and potentially violate content regulations are returned.
      * - ApsaraVideo VOD stores the snapshots in the automated review results free of charge for two weeks. After this period, the snapshots are automatically deleted.
      *
      * @param request GetMediaAuditResultDetailRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetMediaAuditResultDetailResponse
     */
    public GetMediaAuditResultDetailResponse getMediaAuditResultDetailWithOptions(GetMediaAuditResultDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mediaId)) {
            query.put("MediaId", request.mediaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * - By default, only details of snapshots that violate content regulations and potentially violate content regulations are returned.
      * - ApsaraVideo VOD stores the snapshots in the automated review results free of charge for two weeks. After this period, the snapshots are automatically deleted.
      *
      * @param request GetMediaAuditResultDetailRequest
      * @return GetMediaAuditResultDetailResponse
     */
    public GetMediaAuditResultDetailResponse getMediaAuditResultDetail(GetMediaAuditResultDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMediaAuditResultDetailWithOptions(request, runtime);
    }

    public GetMediaAuditResultTimelineResponse getMediaAuditResultTimelineWithOptions(GetMediaAuditResultTimelineRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mediaId)) {
            query.put("MediaId", request.mediaId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMediaAuditResultTimelineWithOptions(request, runtime);
    }

    /**
      * Regions that support this operation: **China (Beijing)**, **China (Shanghai)**, and **Singapore**.
      *
      * @param request GetMediaDNAResultRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetMediaDNAResultResponse
     */
    public GetMediaDNAResultResponse getMediaDNAResultWithOptions(GetMediaDNAResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mediaId)) {
            query.put("MediaId", request.mediaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * Regions that support this operation: **China (Beijing)**, **China (Shanghai)**, and **Singapore**.
      *
      * @param request GetMediaDNAResultRequest
      * @return GetMediaDNAResultResponse
     */
    public GetMediaDNAResultResponse getMediaDNAResult(GetMediaDNAResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMediaDNAResultWithOptions(request, runtime);
    }

    /**
      * You can query the information about all media files or a specific media file in a refresh or prefetch job.
      * ### QPS limits
      * You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see [QPS limits on API operations in ApsaraVideo VoD](~~342790~~).
      *
      * @param request GetMediaRefreshJobsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetMediaRefreshJobsResponse
     */
    public GetMediaRefreshJobsResponse getMediaRefreshJobsWithOptions(GetMediaRefreshJobsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMediaRefreshJobs"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMediaRefreshJobsResponse());
    }

    /**
      * You can query the information about all media files or a specific media file in a refresh or prefetch job.
      * ### QPS limits
      * You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see [QPS limits on API operations in ApsaraVideo VoD](~~342790~~).
      *
      * @param request GetMediaRefreshJobsRequest
      * @return GetMediaRefreshJobsResponse
     */
    public GetMediaRefreshJobsResponse getMediaRefreshJobs(GetMediaRefreshJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMediaRefreshJobsWithOptions(request, runtime);
    }

    /**
      * > For more information, see [Event notification](~~55627~~).
      *
      * @param request GetMessageCallbackRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetMessageCallbackResponse
     */
    public GetMessageCallbackResponse getMessageCallbackWithOptions(GetMessageCallbackRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * > For more information, see [Event notification](~~55627~~).
      *
      * @param request GetMessageCallbackRequest
      * @return GetMessageCallbackResponse
     */
    public GetMessageCallbackResponse getMessageCallback(GetMessageCallbackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMessageCallbackWithOptions(request, runtime);
    }

    /**
      * You can obtain complete information about the source file only after a stream is transcoded.
      *
      * @param request GetMezzanineInfoRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetMezzanineInfoResponse
     */
    public GetMezzanineInfoResponse getMezzanineInfoWithOptions(GetMezzanineInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.additionType)) {
            query.put("AdditionType", request.additionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authTimeout)) {
            query.put("AuthTimeout", request.authTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputType)) {
            query.put("OutputType", request.outputType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.videoId)) {
            query.put("VideoId", request.videoId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * You can obtain complete information about the source file only after a stream is transcoded.
      *
      * @param request GetMezzanineInfoRequest
      * @return GetMezzanineInfoResponse
     */
    public GetMezzanineInfoResponse getMezzanineInfo(GetMezzanineInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMezzanineInfoWithOptions(request, runtime);
    }

    /**
      * *   **Make sure that you understand the billing method and price of ApsaraVideo VOD before you call this operation. You are charged for outbound traffic when you download or play videos based on URLs in ApsaraVideo VOD. For more information about billing of outbound traffic, see [Billing of outbound traffic](~~188308#section-rwh-e88-f7j~~). If you have configured an accelerated domain name, see [Billing of the acceleration service](~~188308#section-c5t-oq9-15e~~). If you have activated the acceleration service, you are charged acceleration fees when you upload media files to ApsaraVideo VOD. For more information, see [Billing of acceleration traffic](~~188310#section_sta_zm2\\_tsv~~).**
      * *   You can use the ID of a media file to query the playback URL of the file. After you integrate ApsaraVideo Player SDK for URL-based playback or a third-party player, you can use the obtained playback URLs to play audio and video files.
      * *   Only videos whose Status is Normal can be played. The Status parameter in the response indicates the status of the video. For more information, see [Overview](~~57290~~).
      * *   If video playback fails, you can call the [GetMezzanineInfo](~~GetMezzanineInfo~~) operation to check whether the video source information is correct.
      *
      * @param request GetPlayInfoRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetPlayInfoResponse
     */
    public GetPlayInfoResponse getPlayInfoWithOptions(GetPlayInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.additionType)) {
            query.put("AdditionType", request.additionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authTimeout)) {
            query.put("AuthTimeout", request.authTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.definition)) {
            query.put("Definition", request.definition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.digitalWatermarkType)) {
            query.put("DigitalWatermarkType", request.digitalWatermarkType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.formats)) {
            query.put("Formats", request.formats);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputType)) {
            query.put("OutputType", request.outputType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.playConfig)) {
            query.put("PlayConfig", request.playConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reAuthInfo)) {
            query.put("ReAuthInfo", request.reAuthInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resultType)) {
            query.put("ResultType", request.resultType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.streamType)) {
            query.put("StreamType", request.streamType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trace)) {
            query.put("Trace", request.trace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.videoId)) {
            query.put("VideoId", request.videoId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * *   **Make sure that you understand the billing method and price of ApsaraVideo VOD before you call this operation. You are charged for outbound traffic when you download or play videos based on URLs in ApsaraVideo VOD. For more information about billing of outbound traffic, see [Billing of outbound traffic](~~188308#section-rwh-e88-f7j~~). If you have configured an accelerated domain name, see [Billing of the acceleration service](~~188308#section-c5t-oq9-15e~~). If you have activated the acceleration service, you are charged acceleration fees when you upload media files to ApsaraVideo VOD. For more information, see [Billing of acceleration traffic](~~188310#section_sta_zm2\\_tsv~~).**
      * *   You can use the ID of a media file to query the playback URL of the file. After you integrate ApsaraVideo Player SDK for URL-based playback or a third-party player, you can use the obtained playback URLs to play audio and video files.
      * *   Only videos whose Status is Normal can be played. The Status parameter in the response indicates the status of the video. For more information, see [Overview](~~57290~~).
      * *   If video playback fails, you can call the [GetMezzanineInfo](~~GetMezzanineInfo~~) operation to check whether the video source information is correct.
      *
      * @param request GetPlayInfoRequest
      * @return GetPlayInfoResponse
     */
    public GetPlayInfoResponse getPlayInfo(GetPlayInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPlayInfoWithOptions(request, runtime);
    }

    /**
      * *   A media file may be transcoded multiple times. This operation returns only the latest transcoding summary.
      * *   You can query transcoding summaries for a maximum of 10 media files in one request.
      * *   You can call the [ListTranscodeTask](~~109120~~) operation to query historical transcoding tasks.
      * *   **You can call this operation to query information only about transcoding tasks created within the past year.**
      *
      * @param request GetTranscodeSummaryRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetTranscodeSummaryResponse
     */
    public GetTranscodeSummaryResponse getTranscodeSummaryWithOptions(GetTranscodeSummaryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.videoIds)) {
            query.put("VideoIds", request.videoIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * *   A media file may be transcoded multiple times. This operation returns only the latest transcoding summary.
      * *   You can query transcoding summaries for a maximum of 10 media files in one request.
      * *   You can call the [ListTranscodeTask](~~109120~~) operation to query historical transcoding tasks.
      * *   **You can call this operation to query information only about transcoding tasks created within the past year.**
      *
      * @param request GetTranscodeSummaryRequest
      * @return GetTranscodeSummaryResponse
     */
    public GetTranscodeSummaryResponse getTranscodeSummary(GetTranscodeSummaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTranscodeSummaryWithOptions(request, runtime);
    }

    /**
      * You can call this operation to query only transcoding tasks created within the past year.
      *
      * @param request GetTranscodeTaskRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetTranscodeTaskResponse
     */
    public GetTranscodeTaskResponse getTranscodeTaskWithOptions(GetTranscodeTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.transcodeTaskId)) {
            query.put("TranscodeTaskId", request.transcodeTaskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * You can call this operation to query only transcoding tasks created within the past year.
      *
      * @param request GetTranscodeTaskRequest
      * @return GetTranscodeTaskResponse
     */
    public GetTranscodeTaskResponse getTranscodeTask(GetTranscodeTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTranscodeTaskWithOptions(request, runtime);
    }

    /**
      * >  This operation returns the information about the specified transcoding template group and the configurations of all the transcoding templates in the group.
      *
      * @param request GetTranscodeTemplateGroupRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetTranscodeTemplateGroupResponse
     */
    public GetTranscodeTemplateGroupResponse getTranscodeTemplateGroupWithOptions(GetTranscodeTemplateGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.transcodeTemplateGroupId)) {
            query.put("TranscodeTemplateGroupId", request.transcodeTemplateGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * >  This operation returns the information about the specified transcoding template group and the configurations of all the transcoding templates in the group.
      *
      * @param request GetTranscodeTemplateGroupRequest
      * @return GetTranscodeTemplateGroupResponse
     */
    public GetTranscodeTemplateGroupResponse getTranscodeTemplateGroup(GetTranscodeTemplateGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTranscodeTemplateGroupWithOptions(request, runtime);
    }

    /**
      * You can query the information about a URL-based upload job by specifying the upload URL or using the job ID returned when you upload media files. The information includes the status of the upload job, custom configurations, the time when the job was created, and the time when the job was complete.
      * If the upload fails, you can view the error code and error message. If the upload is successful, you can obtain the video ID.
      *
      * @param request GetURLUploadInfosRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetURLUploadInfosResponse
     */
    public GetURLUploadInfosResponse getURLUploadInfosWithOptions(GetURLUploadInfosRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobIds)) {
            query.put("JobIds", request.jobIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uploadURLs)) {
            query.put("UploadURLs", request.uploadURLs);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * You can query the information about a URL-based upload job by specifying the upload URL or using the job ID returned when you upload media files. The information includes the status of the upload job, custom configurations, the time when the job was created, and the time when the job was complete.
      * If the upload fails, you can view the error code and error message. If the upload is successful, you can obtain the video ID.
      *
      * @param request GetURLUploadInfosRequest
      * @return GetURLUploadInfosResponse
     */
    public GetURLUploadInfosResponse getURLUploadInfos(GetURLUploadInfosRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getURLUploadInfosWithOptions(request, runtime);
    }

    /**
      * *   You can call this operation to obtain the upload details only about audio and video files.
      * *   If you use the ApsaraVideo VOD console to upload audio and video files, you can call this operation to query information such as the upload ratio. If you use an upload SDK to upload audio and video files, make sure that the version of the [upload SDK](~~52200~~) meets one of the following requirements:
      *     *   The version of the upload SDK for Java is 1.4.4 or later.
      *     *   The version of the upload SDK for C++ is 1.0.0 or later.
      *     *   The version of the upload SDK for PHP is 1.0.2 or later.
      *     *   The version of the upload SDK for Python is 1.3.0 or later.
      *     *   The version of the upload SDK for JavaScript is 1.4.0 or later.
      *     *   The version of the upload SDK for Android is 1.5.0 or later.
      *     *   The version of the upload SDK for iOS is 1.5.0 or later.
      *
      * @param request GetUploadDetailsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetUploadDetailsResponse
     */
    public GetUploadDetailsResponse getUploadDetailsWithOptions(GetUploadDetailsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mediaIds)) {
            query.put("MediaIds", request.mediaIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaType)) {
            query.put("MediaType", request.mediaType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * *   You can call this operation to obtain the upload details only about audio and video files.
      * *   If you use the ApsaraVideo VOD console to upload audio and video files, you can call this operation to query information such as the upload ratio. If you use an upload SDK to upload audio and video files, make sure that the version of the [upload SDK](~~52200~~) meets one of the following requirements:
      *     *   The version of the upload SDK for Java is 1.4.4 or later.
      *     *   The version of the upload SDK for C++ is 1.0.0 or later.
      *     *   The version of the upload SDK for PHP is 1.0.2 or later.
      *     *   The version of the upload SDK for Python is 1.3.0 or later.
      *     *   The version of the upload SDK for JavaScript is 1.4.0 or later.
      *     *   The version of the upload SDK for Android is 1.5.0 or later.
      *     *   The version of the upload SDK for iOS is 1.5.0 or later.
      *
      * @param request GetUploadDetailsRequest
      * @return GetUploadDetailsResponse
     */
    public GetUploadDetailsResponse getUploadDetails(GetUploadDetailsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUploadDetailsWithOptions(request, runtime);
    }

    /**
      * The video snapshot URLs.
      * > This operation returns only data about the snapshots that are captured when you upload a video. The snapshot data includes data of the thumbnail and snapshot data that is generated based on the workflow setting. To query the snapshot data that is generated after the video is uploaded, call the [ListSnapshots](~~ListSnapshots~~) operation. For more information, see [Video snapshots](~~99368~~).
      *
      * @param request GetVideoInfoRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetVideoInfoResponse
     */
    public GetVideoInfoResponse getVideoInfoWithOptions(GetVideoInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.videoId)) {
            query.put("VideoId", request.videoId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * The video snapshot URLs.
      * > This operation returns only data about the snapshots that are captured when you upload a video. The snapshot data includes data of the thumbnail and snapshot data that is generated based on the workflow setting. To query the snapshot data that is generated after the video is uploaded, call the [ListSnapshots](~~ListSnapshots~~) operation. For more information, see [Video snapshots](~~99368~~).
      *
      * @param request GetVideoInfoRequest
      * @return GetVideoInfoResponse
     */
    public GetVideoInfoResponse getVideoInfo(GetVideoInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getVideoInfoWithOptions(request, runtime);
    }

    /**
      * *   You can call this operation to obtain basic information about multiple media files based on media IDs. The basic information includes the title, description, duration, thumbnail URL, status, creation time, size, snapshots, category, and tags.
      * *   After a media file is uploaded, ApsaraVideo VOD processes the source file. Then, information about the media file is asynchronously generated. You can configure notifications for the **VideoAnalysisComplete** event and call this operation to query information about a media file after you receive notifications for the **VideoAnalysisComplete** event. For more information, see [Overview](~~55627~~).
      *
      * @param request GetVideoInfosRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetVideoInfosResponse
     */
    public GetVideoInfosResponse getVideoInfosWithOptions(GetVideoInfosRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.videoIds)) {
            query.put("VideoIds", request.videoIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * *   You can call this operation to obtain basic information about multiple media files based on media IDs. The basic information includes the title, description, duration, thumbnail URL, status, creation time, size, snapshots, category, and tags.
      * *   After a media file is uploaded, ApsaraVideo VOD processes the source file. Then, information about the media file is asynchronously generated. You can configure notifications for the **VideoAnalysisComplete** event and call this operation to query information about a media file after you receive notifications for the **VideoAnalysisComplete** event. For more information, see [Overview](~~55627~~).
      *
      * @param request GetVideoInfosRequest
      * @return GetVideoInfosResponse
     */
    public GetVideoInfosResponse getVideoInfos(GetVideoInfosRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getVideoInfosWithOptions(request, runtime);
    }

    /**
      * You can call this operation to query information about media files based on the filter conditions that you specify, such as video status and category ID. Information about a maximum of **5,000** media files can be returned for each request. We recommend that you set the StartTime and EndTime parameters to specify a time range for each request. For more information about how to query information about more media files or even all media files, see [SearchMedia](~~86044~~).
      *
      * @param request GetVideoListRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetVideoListResponse
     */
    public GetVideoListResponse getVideoListWithOptions(GetVideoListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cateId)) {
            query.put("CateId", request.cateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageLocation)) {
            query.put("StorageLocation", request.storageLocation);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * You can call this operation to query information about media files based on the filter conditions that you specify, such as video status and category ID. Information about a maximum of **5,000** media files can be returned for each request. We recommend that you set the StartTime and EndTime parameters to specify a time range for each request. For more information about how to query information about more media files or even all media files, see [SearchMedia](~~86044~~).
      *
      * @param request GetVideoListRequest
      * @return GetVideoListResponse
     */
    public GetVideoListResponse getVideoList(GetVideoListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getVideoListWithOptions(request, runtime);
    }

    /**
      * ###
      * *   You can call this operation to obtain a playback credential when you use ApsaraVideo Player SDK to play a media file based on PlayAuth. The credential is used to obtain the playback URL.
      * *   You cannot obtain the playback URL of a video by using a credential that has expired. A new credential is required.
      * ### QPS limit
      * You can call this operation up to 360 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see [QPS limit on API operations](~~342790~~).
      *
      * @param request GetVideoPlayAuthRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetVideoPlayAuthResponse
     */
    public GetVideoPlayAuthResponse getVideoPlayAuthWithOptions(GetVideoPlayAuthRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiVersion)) {
            query.put("ApiVersion", request.apiVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authInfoTimeout)) {
            query.put("AuthInfoTimeout", request.authInfoTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.videoId)) {
            query.put("VideoId", request.videoId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * ###
      * *   You can call this operation to obtain a playback credential when you use ApsaraVideo Player SDK to play a media file based on PlayAuth. The credential is used to obtain the playback URL.
      * *   You cannot obtain the playback URL of a video by using a credential that has expired. A new credential is required.
      * ### QPS limit
      * You can call this operation up to 360 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see [QPS limit on API operations](~~342790~~).
      *
      * @param request GetVideoPlayAuthRequest
      * @return GetVideoPlayAuthResponse
     */
    public GetVideoPlayAuthResponse getVideoPlayAuth(GetVideoPlayAuthRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getVideoPlayAuthWithOptions(request, runtime);
    }

    public GetVodTemplateResponse getVodTemplateWithOptions(GetVodTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.vodTemplateId)) {
            query.put("VodTemplateId", request.vodTemplateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getVodTemplateWithOptions(request, runtime);
    }

    public GetWatermarkResponse getWatermarkWithOptions(GetWatermarkRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.watermarkId)) {
            query.put("WatermarkId", request.watermarkId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWatermarkWithOptions(request, runtime);
    }

    /**
      * *   Regions that support this operation: **China (Beijing)** and **China (Shanghai)**.
      * *   You can call this operation to query AI processing results about images of a specified video. Images of different videos cannot be queried in one request.
      *
      * @param request ListAIImageInfoRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListAIImageInfoResponse
     */
    public ListAIImageInfoResponse listAIImageInfoWithOptions(ListAIImageInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.videoId)) {
            query.put("VideoId", request.videoId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * *   Regions that support this operation: **China (Beijing)** and **China (Shanghai)**.
      * *   You can call this operation to query AI processing results about images of a specified video. Images of different videos cannot be queried in one request.
      *
      * @param request ListAIImageInfoRequest
      * @return ListAIImageInfoResponse
     */
    public ListAIImageInfoResponse listAIImageInfo(ListAIImageInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAIImageInfoWithOptions(request, runtime);
    }

    /**
      * *   Regions that support this operation: **China (Beijing)**, **China (Shanghai)**, and **Singapore**.
      * *   You can call this operation to query video fingerprinting jobs and smart tagging jobs.
      *
      * @param request ListAIJobRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListAIJobResponse
     */
    public ListAIJobResponse listAIJobWithOptions(ListAIJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobIds)) {
            query.put("JobIds", request.jobIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * *   Regions that support this operation: **China (Beijing)**, **China (Shanghai)**, and **Singapore**.
      * *   You can call this operation to query video fingerprinting jobs and smart tagging jobs.
      *
      * @param request ListAIJobRequest
      * @return ListAIJobResponse
     */
    public ListAIJobResponse listAIJob(ListAIJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAIJobWithOptions(request, runtime);
    }

    /**
      * *   Regions that support this operation: **China (Beijing)**, **China (Shanghai)**, and **Singapore**.
      * *   You can call this operation to query AI templates of a specified type.
      *
      * @param request ListAITemplateRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListAITemplateResponse
     */
    public ListAITemplateResponse listAITemplateWithOptions(ListAITemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.templateType)) {
            query.put("TemplateType", request.templateType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * *   Regions that support this operation: **China (Beijing)**, **China (Shanghai)**, and **Singapore**.
      * *   You can call this operation to query AI templates of a specified type.
      *
      * @param request ListAITemplateRequest
      * @return ListAITemplateResponse
     */
    public ListAITemplateResponse listAITemplate(ListAITemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAITemplateWithOptions(request, runtime);
    }

    /**
      * Supports filtering queries by application status.
      *
      * @param request ListAppInfoRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListAppInfoResponse
     */
    public ListAppInfoResponse listAppInfoWithOptions(ListAppInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * Supports filtering queries by application status.
      *
      * @param request ListAppInfoRequest
      * @return ListAppInfoResponse
     */
    public ListAppInfoResponse listAppInfo(ListAppInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAppInfoWithOptions(request, runtime);
    }

    /**
      * > The IdentityType and IdentityName parameters take effect only when an identity assumes the application administrator role to call this operation. Otherwise, only application policies that are attached to the current identity are returned.
      *
      * @param request ListAppPoliciesForIdentityRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListAppPoliciesForIdentityResponse
     */
    public ListAppPoliciesForIdentityResponse listAppPoliciesForIdentityWithOptions(ListAppPoliciesForIdentityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identityName)) {
            query.put("IdentityName", request.identityName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identityType)) {
            query.put("IdentityType", request.identityType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * > The IdentityType and IdentityName parameters take effect only when an identity assumes the application administrator role to call this operation. Otherwise, only application policies that are attached to the current identity are returned.
      *
      * @param request ListAppPoliciesForIdentityRequest
      * @return ListAppPoliciesForIdentityResponse
     */
    public ListAppPoliciesForIdentityResponse listAppPoliciesForIdentity(ListAppPoliciesForIdentityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAppPoliciesForIdentityWithOptions(request, runtime);
    }

    public ListAuditSecurityIpResponse listAuditSecurityIpWithOptions(ListAuditSecurityIpRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.securityGroupName)) {
            query.put("SecurityGroupName", request.securityGroupName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAuditSecurityIpWithOptions(request, runtime);
    }

    public ListDynamicImageResponse listDynamicImageWithOptions(ListDynamicImageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.videoId)) {
            query.put("VideoId", request.videoId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDynamicImageWithOptions(request, runtime);
    }

    /**
      * You can query a maximum of 5,000 videos based on the specified filter condition.
      *
      * @param request ListLiveRecordVideoRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListLiveRecordVideoResponse
     */
    public ListLiveRecordVideoResponse listLiveRecordVideoWithOptions(ListLiveRecordVideoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.streamName)) {
            query.put("StreamName", request.streamName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * You can query a maximum of 5,000 videos based on the specified filter condition.
      *
      * @param request ListLiveRecordVideoRequest
      * @return ListLiveRecordVideoResponse
     */
    public ListLiveRecordVideoResponse listLiveRecordVideo(ListLiveRecordVideoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listLiveRecordVideoWithOptions(request, runtime);
    }

    /**
      * If multiple snapshots of a video exist, the data of the latest snapshot is returned.
      *
      * @param request ListSnapshotsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListSnapshotsResponse
     */
    public ListSnapshotsResponse listSnapshotsWithOptions(ListSnapshotsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authTimeout)) {
            query.put("AuthTimeout", request.authTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snapshotType)) {
            query.put("SnapshotType", request.snapshotType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.videoId)) {
            query.put("VideoId", request.videoId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * If multiple snapshots of a video exist, the data of the latest snapshot is returned.
      *
      * @param request ListSnapshotsRequest
      * @return ListSnapshotsResponse
     */
    public ListSnapshotsResponse listSnapshots(ListSnapshotsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSnapshotsWithOptions(request, runtime);
    }

    /**
      * *   You can call the [GetTranscodeTask](~~109121~~) operation to query details about transcoding jobs.
      * *   **You can call this operation to query only transcoding tasks created within the past year.**
      *
      * @param request ListTranscodeTaskRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListTranscodeTaskResponse
     */
    public ListTranscodeTaskResponse listTranscodeTaskWithOptions(ListTranscodeTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.videoId)) {
            query.put("VideoId", request.videoId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * *   You can call the [GetTranscodeTask](~~109121~~) operation to query details about transcoding jobs.
      * *   **You can call this operation to query only transcoding tasks created within the past year.**
      *
      * @param request ListTranscodeTaskRequest
      * @return ListTranscodeTaskResponse
     */
    public ListTranscodeTaskResponse listTranscodeTask(ListTranscodeTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTranscodeTaskWithOptions(request, runtime);
    }

    /**
      * > This operation does not return the configurations of transcoding templates in each transcoding template group. To query the configurations of transcoding templates in a specific transcoding template group, call the [GetTranscodeTemplateGroup](~~102670~~) operation.
      *
      * @param request ListTranscodeTemplateGroupRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListTranscodeTemplateGroupResponse
     */
    public ListTranscodeTemplateGroupResponse listTranscodeTemplateGroupWithOptions(ListTranscodeTemplateGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * > This operation does not return the configurations of transcoding templates in each transcoding template group. To query the configurations of transcoding templates in a specific transcoding template group, call the [GetTranscodeTemplateGroup](~~102670~~) operation.
      *
      * @param request ListTranscodeTemplateGroupRequest
      * @return ListTranscodeTemplateGroupResponse
     */
    public ListTranscodeTemplateGroupResponse listTranscodeTemplateGroup(ListTranscodeTemplateGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTranscodeTemplateGroupWithOptions(request, runtime);
    }

    public ListVodTemplateResponse listVodTemplateWithOptions(ListVodTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateType)) {
            query.put("TemplateType", request.templateType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listVodTemplateWithOptions(request, runtime);
    }

    public ListWatermarkResponse listWatermarkWithOptions(ListWatermarkRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listWatermarkWithOptions(request, runtime);
    }

    public MoveAppResourceResponse moveAppResourceWithOptions(MoveAppResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceIds)) {
            query.put("ResourceIds", request.resourceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetAppId)) {
            query.put("TargetAppId", request.targetAppId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.moveAppResourceWithOptions(request, runtime);
    }

    /**
      * > *   This operation is available only in the **China (Shanghai)** region.
      * > *   You can submit a maximum of 500 requests to prefetch resources based on URLs each day by using an Alibaba Cloud account. You cannot prefetch resources based on directories.
      * > *   You can call the [RefreshVodObjectCaches](~~69215~~) operation to refresh content and the [PreloadVodObjectCaches](~~69211~~l) operation to prefetch content.
      *
      * @param request PreloadVodObjectCachesRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return PreloadVodObjectCachesResponse
     */
    public PreloadVodObjectCachesResponse preloadVodObjectCachesWithOptions(PreloadVodObjectCachesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.objectPath)) {
            query.put("ObjectPath", request.objectPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * > *   This operation is available only in the **China (Shanghai)** region.
      * > *   You can submit a maximum of 500 requests to prefetch resources based on URLs each day by using an Alibaba Cloud account. You cannot prefetch resources based on directories.
      * > *   You can call the [RefreshVodObjectCaches](~~69215~~) operation to refresh content and the [PreloadVodObjectCaches](~~69211~~l) operation to prefetch content.
      *
      * @param request PreloadVodObjectCachesRequest
      * @return PreloadVodObjectCachesResponse
     */
    public PreloadVodObjectCachesResponse preloadVodObjectCaches(PreloadVodObjectCachesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.preloadVodObjectCachesWithOptions(request, runtime);
    }

    /**
      * *   This operation returns only the submission result of a video production task. When the submission result is returned, video production may still be in progress. After a video production task is submitted, the task is queued in the background for asynchronous processing.
      * *   The source files that are used in the timeline of an online editing project can be materials directly uploaded to the online project or selected from the media asset library.
      * *   Videos are produced based on ProjectId and Timeline. The following rules apply when you specify the parameters:
      *     *   You must specify at least one of the ProjectId and Timeline parameters. Otherwise, video production fails.
      *     *   If you specify only the Timeline parameter, the system automatically creates an online editing project based on the specified timeline. Then, the system uses the source files specified in the timeline to produce videos.
      *     *   If you specify only the ProjectId parameter, the system obtains the latest timeline data of the specified project to produce videos.
      *     *   If you specify both the ProjectId and Timeline parameters, the system produces videos based on the specified timeline and updates the timeline data for the specified online editing project. You can also specify other parameters to update the corresponding information about the online editing project.
      * *   After a video is produced, the video is automatically uploaded to ApsaraVideo VOD. Then, the **ProduceMediaComplete** and **FileUploadComplete** event notifications are sent to you. After the produced video is transcoded, the **StreamTranscodeComplete** and **TranscodeComplete** event notifications are sent to you.
      * *   You can add special effects to the video. For more information, see [Special effects](~~69082~~).
      * ### QPS limits
      * You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see [QPS limits on API operations in ApsaraVideo VOD](~~342790~~).
      *
      * @param request ProduceEditingProjectVideoRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ProduceEditingProjectVideoResponse
     */
    public ProduceEditingProjectVideoResponse produceEditingProjectVideoWithOptions(ProduceEditingProjectVideoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.coverURL)) {
            query.put("CoverURL", request.coverURL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaMetadata)) {
            query.put("MediaMetadata", request.mediaMetadata);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.produceConfig)) {
            query.put("ProduceConfig", request.produceConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeline)) {
            query.put("Timeline", request.timeline);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            query.put("Title", request.title);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * *   This operation returns only the submission result of a video production task. When the submission result is returned, video production may still be in progress. After a video production task is submitted, the task is queued in the background for asynchronous processing.
      * *   The source files that are used in the timeline of an online editing project can be materials directly uploaded to the online project or selected from the media asset library.
      * *   Videos are produced based on ProjectId and Timeline. The following rules apply when you specify the parameters:
      *     *   You must specify at least one of the ProjectId and Timeline parameters. Otherwise, video production fails.
      *     *   If you specify only the Timeline parameter, the system automatically creates an online editing project based on the specified timeline. Then, the system uses the source files specified in the timeline to produce videos.
      *     *   If you specify only the ProjectId parameter, the system obtains the latest timeline data of the specified project to produce videos.
      *     *   If you specify both the ProjectId and Timeline parameters, the system produces videos based on the specified timeline and updates the timeline data for the specified online editing project. You can also specify other parameters to update the corresponding information about the online editing project.
      * *   After a video is produced, the video is automatically uploaded to ApsaraVideo VOD. Then, the **ProduceMediaComplete** and **FileUploadComplete** event notifications are sent to you. After the produced video is transcoded, the **StreamTranscodeComplete** and **TranscodeComplete** event notifications are sent to you.
      * *   You can add special effects to the video. For more information, see [Special effects](~~69082~~).
      * ### QPS limits
      * You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see [QPS limits on API operations in ApsaraVideo VOD](~~342790~~).
      *
      * @param request ProduceEditingProjectVideoRequest
      * @return ProduceEditingProjectVideoResponse
     */
    public ProduceEditingProjectVideoResponse produceEditingProjectVideo(ProduceEditingProjectVideoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.produceEditingProjectVideoWithOptions(request, runtime);
    }

    /**
      * - ApsaraVideo VOD allows you to refresh and prefetch resources. The refresh feature forces the point of presence (POP) to clear cached resources and retrieve the latest resources from origin servers. The prefetch feature allows the POP to retrieve frequently accessed resources from origin servers during off-peak hours. This increases the cache hit ratio.
      * - You can call this operation to submit refresh or prefetch tasks based on the media ID. You can also specify the format and resolution of the media streams to refresh or prefetch based on your business requirements.
      * - You can submit a maximum of 20 refresh or prefetch tasks at a time.
      * ### QPS limits
      * You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see [QPS limits on API operations in ApsaraVideo VoD](~~342790~~).
      *
      * @param request RefreshMediaPlayUrlsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return RefreshMediaPlayUrlsResponse
     */
    public RefreshMediaPlayUrlsResponse refreshMediaPlayUrlsWithOptions(RefreshMediaPlayUrlsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.definitions)) {
            query.put("Definitions", request.definitions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.formats)) {
            query.put("Formats", request.formats);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaIds)) {
            query.put("MediaIds", request.mediaIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resultType)) {
            query.put("ResultType", request.resultType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sliceCount)) {
            query.put("SliceCount", request.sliceCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sliceFlag)) {
            query.put("SliceFlag", request.sliceFlag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.streamType)) {
            query.put("StreamType", request.streamType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            query.put("TaskType", request.taskType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RefreshMediaPlayUrls"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RefreshMediaPlayUrlsResponse());
    }

    /**
      * - ApsaraVideo VOD allows you to refresh and prefetch resources. The refresh feature forces the point of presence (POP) to clear cached resources and retrieve the latest resources from origin servers. The prefetch feature allows the POP to retrieve frequently accessed resources from origin servers during off-peak hours. This increases the cache hit ratio.
      * - You can call this operation to submit refresh or prefetch tasks based on the media ID. You can also specify the format and resolution of the media streams to refresh or prefetch based on your business requirements.
      * - You can submit a maximum of 20 refresh or prefetch tasks at a time.
      * ### QPS limits
      * You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see [QPS limits on API operations in ApsaraVideo VoD](~~342790~~).
      *
      * @param request RefreshMediaPlayUrlsRequest
      * @return RefreshMediaPlayUrlsResponse
     */
    public RefreshMediaPlayUrlsResponse refreshMediaPlayUrls(RefreshMediaPlayUrlsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.refreshMediaPlayUrlsWithOptions(request, runtime);
    }

    /**
      * If you want to overwrite a video or audio source file, you can obtain the upload URL of the source file by calling this operation. Then, you can upload a new source file without changing the video or audio ID. However, the file overwriting may automatically trigger transcoding and snapshot jobs if these jobs are configured. For more information, see [Upload URLs and credentials](~~55397~~).
      *
      * @param request RefreshUploadVideoRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return RefreshUploadVideoResponse
     */
    public RefreshUploadVideoResponse refreshUploadVideoWithOptions(RefreshUploadVideoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.videoId)) {
            query.put("VideoId", request.videoId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * If you want to overwrite a video or audio source file, you can obtain the upload URL of the source file by calling this operation. Then, you can upload a new source file without changing the video or audio ID. However, the file overwriting may automatically trigger transcoding and snapshot jobs if these jobs are configured. For more information, see [Upload URLs and credentials](~~55397~~).
      *
      * @param request RefreshUploadVideoRequest
      * @return RefreshUploadVideoResponse
     */
    public RefreshUploadVideoResponse refreshUploadVideo(RefreshUploadVideoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.refreshUploadVideoWithOptions(request, runtime);
    }

    /**
      * *   This operation is available only in the **China (Shanghai)** region.
      * *   You can submit a maximum of 2,000 requests to refresh resources based on URLs and 100 requests to refresh resources based on directories each day by using an Alibaba Cloud account.
      * *   You can call the [RefreshVodObjectCaches](~~69215~~) operation to refresh content and the [PreloadVodObjectCaches](~~69211~~) operation to prefetch content.
      *
      * @param request RefreshVodObjectCachesRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return RefreshVodObjectCachesResponse
     */
    public RefreshVodObjectCachesResponse refreshVodObjectCachesWithOptions(RefreshVodObjectCachesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.objectPath)) {
            query.put("ObjectPath", request.objectPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.objectType)) {
            query.put("ObjectType", request.objectType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * *   This operation is available only in the **China (Shanghai)** region.
      * *   You can submit a maximum of 2,000 requests to refresh resources based on URLs and 100 requests to refresh resources based on directories each day by using an Alibaba Cloud account.
      * *   You can call the [RefreshVodObjectCaches](~~69215~~) operation to refresh content and the [PreloadVodObjectCaches](~~69211~~) operation to prefetch content.
      *
      * @param request RefreshVodObjectCachesRequest
      * @return RefreshVodObjectCachesResponse
     */
    public RefreshVodObjectCachesResponse refreshVodObjectCaches(RefreshVodObjectCachesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.refreshVodObjectCachesWithOptions(request, runtime);
    }

    /**
      * After you store an audio or video file in an Object Storage Service (OSS) bucket that is used for ApsaraVideo VOD, you can call the RegisterMedia operation to register the media file. After the media file is registered, you can use the media ID associated with the media file to submit transcoding jobs and snapshot jobs in ApsaraVideo VOD. For more information, see [SubmitTranscodeJobs](~~68570~~) and [SubmitSnapshotJob](~~72213~~).
      * > *   You can register up to 10 OSS media files that have the same storage location at a time.
      * > *   If you use the ApsaraVideo VOD console to upload a media file and do not specify a transcoding template group ID, ApsaraVideo VOD uses the default transcoding template group to transcode the media file. However, if you do not specify a transcoding template group ID when you call the RegisterMedia operation, ApsaraVideo VOD does not automatically transcode the media file after the media file is registered. If you specify a transcoding template group ID, ApsaraVideo VOD uses the specified transcoding template group to transcode the media file.
      * > *   If the media file that you want to register is registered before, this operation returns only the unique media ID that is associated with the media file. No further processing is performed.
      *
      * @param request RegisterMediaRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return RegisterMediaResponse
     */
    public RegisterMediaResponse registerMediaWithOptions(RegisterMediaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.registerMetadatas)) {
            query.put("RegisterMetadatas", request.registerMetadatas);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateGroupId)) {
            query.put("TemplateGroupId", request.templateGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workflowId)) {
            query.put("WorkflowId", request.workflowId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * After you store an audio or video file in an Object Storage Service (OSS) bucket that is used for ApsaraVideo VOD, you can call the RegisterMedia operation to register the media file. After the media file is registered, you can use the media ID associated with the media file to submit transcoding jobs and snapshot jobs in ApsaraVideo VOD. For more information, see [SubmitTranscodeJobs](~~68570~~) and [SubmitSnapshotJob](~~72213~~).
      * > *   You can register up to 10 OSS media files that have the same storage location at a time.
      * > *   If you use the ApsaraVideo VOD console to upload a media file and do not specify a transcoding template group ID, ApsaraVideo VOD uses the default transcoding template group to transcode the media file. However, if you do not specify a transcoding template group ID when you call the RegisterMedia operation, ApsaraVideo VOD does not automatically transcode the media file after the media file is registered. If you specify a transcoding template group ID, ApsaraVideo VOD uses the specified transcoding template group to transcode the media file.
      * > *   If the media file that you want to register is registered before, this operation returns only the unique media ID that is associated with the media file. No further processing is performed.
      *
      * @param request RegisterMediaRequest
      * @return RegisterMediaResponse
     */
    public RegisterMediaResponse registerMedia(RegisterMediaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.registerMediaWithOptions(request, runtime);
    }

    /**
      * You can call this operation to restore only Archive and Cold Archive audio and video files. You can access the audio and video files after the files are restored. You cannot change the storage class of an audio or video file that is being restored. You are charged for the retrieval traffic generated during restoration. After a Cold Archive audio or video file is restored, a Standard replica of the file is generated for access. You are charged for the storage of the replica before the file returns to the frozen state.
      *
      * @param request RestoreMediaRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return RestoreMediaResponse
     */
    public RestoreMediaResponse restoreMediaWithOptions(RestoreMediaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mediaIds)) {
            query.put("MediaIds", request.mediaIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.restoreDays)) {
            query.put("RestoreDays", request.restoreDays);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.restoreTier)) {
            query.put("RestoreTier", request.restoreTier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scope)) {
            query.put("Scope", request.scope);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RestoreMedia"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RestoreMediaResponse());
    }

    /**
      * You can call this operation to restore only Archive and Cold Archive audio and video files. You can access the audio and video files after the files are restored. You cannot change the storage class of an audio or video file that is being restored. You are charged for the retrieval traffic generated during restoration. After a Cold Archive audio or video file is restored, a Standard replica of the file is generated for access. You are charged for the storage of the replica before the file returns to the frozen state.
      *
      * @param request RestoreMediaRequest
      * @return RestoreMediaResponse
     */
    public RestoreMediaResponse restoreMedia(RestoreMediaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.restoreMediaWithOptions(request, runtime);
    }

    public SearchEditingProjectResponse searchEditingProjectWithOptions(SearchEditingProjectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            query.put("Title", request.title);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchEditingProjectWithOptions(request, runtime);
    }

    /**
      * The maximum number of data records that you can query is limited based on the method used to query the data. You can use the following methods to query data:
      * *   Method 1: You must use the PageNo and PageSize parameters for the first 5,000 data records that meet the specified filter condition. This allows you to traverse data page by page. If the number of data records that meet the specified filter condition exceeds 5,000, use Method 2.
      * *   Method 2: This method applies only to the data of video and audio files. To traverse all the data records that meet the specified filter condition, you must set the PageNo, PageSize, and ScrollToken parameters to traverse data page by page. The total number of data records from the current page to the target page cannot exceed 1,200. Assume that the PageSize parameter is set to **20**:
      *     *   When the PageNo parameter is set to **1**, you can scroll forward to traverse data records from page 1 to page **60** at most.
      *     *   When the PageNo parameter is set to **2**, you can scroll forward to traverse data records from page 2 to page **61** at most.
      *     *   When the PageNo parameter is set to **61**, you can scroll backward to traverse data records from page 61 to page **2** at most or scroll forward to traverse data records from page 61 to page **120** at most.
      *
      * @param request SearchMediaRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return SearchMediaResponse
     */
    public SearchMediaResponse searchMediaWithOptions(SearchMediaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fields)) {
            query.put("Fields", request.fields);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.match)) {
            query.put("Match", request.match);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scrollToken)) {
            query.put("ScrollToken", request.scrollToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchType)) {
            query.put("SearchType", request.searchType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * The maximum number of data records that you can query is limited based on the method used to query the data. You can use the following methods to query data:
      * *   Method 1: You must use the PageNo and PageSize parameters for the first 5,000 data records that meet the specified filter condition. This allows you to traverse data page by page. If the number of data records that meet the specified filter condition exceeds 5,000, use Method 2.
      * *   Method 2: This method applies only to the data of video and audio files. To traverse all the data records that meet the specified filter condition, you must set the PageNo, PageSize, and ScrollToken parameters to traverse data page by page. The total number of data records from the current page to the target page cannot exceed 1,200. Assume that the PageSize parameter is set to **20**:
      *     *   When the PageNo parameter is set to **1**, you can scroll forward to traverse data records from page 1 to page **60** at most.
      *     *   When the PageNo parameter is set to **2**, you can scroll forward to traverse data records from page 2 to page **61** at most.
      *     *   When the PageNo parameter is set to **61**, you can scroll backward to traverse data records from page 61 to page **2** at most or scroll forward to traverse data records from page 61 to page **120** at most.
      *
      * @param request SearchMediaRequest
      * @return SearchMediaResponse
     */
    public SearchMediaResponse searchMedia(SearchMediaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchMediaWithOptions(request, runtime);
    }

    /**
      * > You can play videos in the Checking or Blocked state only from the IP addresses that are added to review security groups.
      *
      * @param request SetAuditSecurityIpRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return SetAuditSecurityIpResponse
     */
    public SetAuditSecurityIpResponse setAuditSecurityIpWithOptions(SetAuditSecurityIpRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ips)) {
            query.put("Ips", request.ips);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operateMode)) {
            query.put("OperateMode", request.operateMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityGroupName)) {
            query.put("SecurityGroupName", request.securityGroupName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * > You can play videos in the Checking or Blocked state only from the IP addresses that are added to review security groups.
      *
      * @param request SetAuditSecurityIpRequest
      * @return SetAuditSecurityIpResponse
     */
    public SetAuditSecurityIpResponse setAuditSecurityIp(SetAuditSecurityIpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setAuditSecurityIpWithOptions(request, runtime);
    }

    /**
      * > After you use the cross-domain policy file to update the resources on the origin server, you must refresh the resources that are cached on Alibaba Cloud CDN nodes. You can use the ApsaraVideo VOD console to refresh resources. For more information, see [Refresh and prefetch](~~86098~~). Alternatively, you can call the [RefreshVodObjectCaches](~~69215~~) operation to refresh resources.
      *
      * @param request SetCrossdomainContentRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return SetCrossdomainContentResponse
     */
    public SetCrossdomainContentResponse setCrossdomainContentWithOptions(SetCrossdomainContentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            query.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceRealOwnerId)) {
            query.put("ResourceRealOwnerId", request.resourceRealOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageLocation)) {
            query.put("StorageLocation", request.storageLocation);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * > After you use the cross-domain policy file to update the resources on the origin server, you must refresh the resources that are cached on Alibaba Cloud CDN nodes. You can use the ApsaraVideo VOD console to refresh resources. For more information, see [Refresh and prefetch](~~86098~~). Alternatively, you can call the [RefreshVodObjectCaches](~~69215~~) operation to refresh resources.
      *
      * @param request SetCrossdomainContentRequest
      * @return SetCrossdomainContentResponse
     */
    public SetCrossdomainContentResponse setCrossdomainContent(SetCrossdomainContentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setCrossdomainContentWithOptions(request, runtime);
    }

    /**
      * *   Regions that support this operation: **China (Beijing)**, **China (Shanghai)**, and **Singapore**.
      * *   Before you can call this operation to specify an AI template as the default template, you must obtain the ID of the AI template. You cannot delete an AI template that is set as the default template.
      *
      * @param request SetDefaultAITemplateRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return SetDefaultAITemplateResponse
     */
    public SetDefaultAITemplateResponse setDefaultAITemplateWithOptions(SetDefaultAITemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * *   Regions that support this operation: **China (Beijing)**, **China (Shanghai)**, and **Singapore**.
      * *   Before you can call this operation to specify an AI template as the default template, you must obtain the ID of the AI template. You cannot delete an AI template that is set as the default template.
      *
      * @param request SetDefaultAITemplateRequest
      * @return SetDefaultAITemplateResponse
     */
    public SetDefaultAITemplateResponse setDefaultAITemplate(SetDefaultAITemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setDefaultAITemplateWithOptions(request, runtime);
    }

    public SetDefaultTranscodeTemplateGroupResponse setDefaultTranscodeTemplateGroupWithOptions(SetDefaultTranscodeTemplateGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.transcodeTemplateGroupId)) {
            query.put("TranscodeTemplateGroupId", request.transcodeTemplateGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setDefaultTranscodeTemplateGroupWithOptions(request, runtime);
    }

    public SetDefaultWatermarkResponse setDefaultWatermarkWithOptions(SetDefaultWatermarkRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.watermarkId)) {
            query.put("WatermarkId", request.watermarkId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setDefaultWatermarkWithOptions(request, runtime);
    }

    public SetEditingProjectMaterialsResponse setEditingProjectMaterialsWithOptions(SetEditingProjectMaterialsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.materialIds)) {
            query.put("MaterialIds", request.materialIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setEditingProjectMaterialsWithOptions(request, runtime);
    }

    /**
      * ## Usage note
      * ApsaraVideo VOD supports the HTTP and MNS callback methods. For more information, see [Event notification](~~55627~~).
      *
      * @param request SetMessageCallbackRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return SetMessageCallbackResponse
     */
    public SetMessageCallbackResponse setMessageCallbackWithOptions(SetMessageCallbackRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authKey)) {
            query.put("AuthKey", request.authKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authSwitch)) {
            query.put("AuthSwitch", request.authSwitch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callbackType)) {
            query.put("CallbackType", request.callbackType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callbackURL)) {
            query.put("CallbackURL", request.callbackURL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventTypeList)) {
            query.put("EventTypeList", request.eventTypeList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mnsEndpoint)) {
            query.put("MnsEndpoint", request.mnsEndpoint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mnsQueueName)) {
            query.put("MnsQueueName", request.mnsQueueName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * ## Usage note
      * ApsaraVideo VOD supports the HTTP and MNS callback methods. For more information, see [Event notification](~~55627~~).
      *
      * @param request SetMessageCallbackRequest
      * @return SetMessageCallbackResponse
     */
    public SetMessageCallbackResponse setMessageCallback(SetMessageCallbackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setMessageCallbackWithOptions(request, runtime);
    }

    /**
      * > This operation is available only in the **China (Shanghai)** region.
      *
      * @param request SetVodDomainCertificateRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return SetVodDomainCertificateResponse
     */
    public SetVodDomainCertificateResponse setVodDomainCertificateWithOptions(SetVodDomainCertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.certName)) {
            query.put("CertName", request.certName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.SSLPri)) {
            query.put("SSLPri", request.SSLPri);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.SSLProtocol)) {
            query.put("SSLProtocol", request.SSLProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.SSLPub)) {
            query.put("SSLPub", request.SSLPub);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * > This operation is available only in the **China (Shanghai)** region.
      *
      * @param request SetVodDomainCertificateRequest
      * @return SetVodDomainCertificateResponse
     */
    public SetVodDomainCertificateResponse setVodDomainCertificate(SetVodDomainCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setVodDomainCertificateWithOptions(request, runtime);
    }

    public SubmitAIImageAuditJobResponse submitAIImageAuditJobWithOptions(SubmitAIImageAuditJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mediaAuditConfiguration)) {
            query.put("MediaAuditConfiguration", request.mediaAuditConfiguration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaId)) {
            query.put("MediaId", request.mediaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitAIImageAuditJobWithOptions(request, runtime);
    }

    /**
      * *   Regions that support this operation: **China (Beijing)** and **China (Shanghai)**.
      * *   After you call this operation, you can call the [GetAIImageJobs](~~186923~~) operation to query the job execution result.
      *
      * @param request SubmitAIImageJobRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return SubmitAIImageJobResponse
     */
    public SubmitAIImageJobResponse submitAIImageJobWithOptions(SubmitAIImageJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.AIPipelineId)) {
            query.put("AIPipelineId", request.AIPipelineId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.AITemplateId)) {
            query.put("AITemplateId", request.AITemplateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.videoId)) {
            query.put("VideoId", request.videoId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * *   Regions that support this operation: **China (Beijing)** and **China (Shanghai)**.
      * *   After you call this operation, you can call the [GetAIImageJobs](~~186923~~) operation to query the job execution result.
      *
      * @param request SubmitAIImageJobRequest
      * @return SubmitAIImageJobResponse
     */
    public SubmitAIImageJobResponse submitAIImageJob(SubmitAIImageJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitAIImageJobWithOptions(request, runtime);
    }

    /**
      * *   **Make sure that you understand the billing method and price of ApsaraVideo VOD before you call this operation. You are charged for using the smart tagging and video fingerprinting features. For more information, see [Billing of video AI](~~188310#section-g7l-s3o-9ng~~).**
      * *   Regions that support the video fingerprinting feature: **China (Beijing)**, **China (Shanghai)**, and **Singapore**. Regions that support the smart tagging feature: **China (Beijing)** and **China (Shanghai)**.
      * *   You need to enable the video fingerprinting feature or the smart tagging feature before you can call this operation to submit jobs. For more information, see [Video AI](~~101148~~).
      * *   If this is the first time you use the video fingerprinting feature, you must [submit a ticket](https://yida.alibaba-inc.com/o/ticketapply) to apply for using the media fingerprint library for free. Otherwise, the video fingerprinting feature will be affected.
      * *   After you submit an AI job, ApsaraVideo VOD asynchronously processes the job. The operation may return a response before the job is complete. You can configure the [Event Notification](~~55627~~) feature and set the callback event to **AI Processing Completed**. After you receive the event notification, you can query the execution result of the AI job.
      *
      * @param request SubmitAIJobRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return SubmitAIJobResponse
     */
    public SubmitAIJobResponse submitAIJobWithOptions(SubmitAIJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.config)) {
            query.put("Config", request.config);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaId)) {
            query.put("MediaId", request.mediaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.types)) {
            query.put("Types", request.types);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * *   **Make sure that you understand the billing method and price of ApsaraVideo VOD before you call this operation. You are charged for using the smart tagging and video fingerprinting features. For more information, see [Billing of video AI](~~188310#section-g7l-s3o-9ng~~).**
      * *   Regions that support the video fingerprinting feature: **China (Beijing)**, **China (Shanghai)**, and **Singapore**. Regions that support the smart tagging feature: **China (Beijing)** and **China (Shanghai)**.
      * *   You need to enable the video fingerprinting feature or the smart tagging feature before you can call this operation to submit jobs. For more information, see [Video AI](~~101148~~).
      * *   If this is the first time you use the video fingerprinting feature, you must [submit a ticket](https://yida.alibaba-inc.com/o/ticketapply) to apply for using the media fingerprint library for free. Otherwise, the video fingerprinting feature will be affected.
      * *   After you submit an AI job, ApsaraVideo VOD asynchronously processes the job. The operation may return a response before the job is complete. You can configure the [Event Notification](~~55627~~) feature and set the callback event to **AI Processing Completed**. After you receive the event notification, you can query the execution result of the AI job.
      *
      * @param request SubmitAIJobRequest
      * @return SubmitAIJobResponse
     */
    public SubmitAIJobResponse submitAIJob(SubmitAIJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitAIJobWithOptions(request, runtime);
    }

    /**
      * *   **Make sure that you understand the billing methods and price of ApsaraVideo VOD before you call this operation. You are charged for using the automated review feature. For more information about billing, submit a ticket or contact your account manager.**
      * *   You can call this operation only in the **China (Shanghai)**, **China (Beijing)**, and **Singapore** regions.
      * *   For more information, see [Automated review](~~101148~~).
      * *   After an automated review job is complete, the images generated during the review are stored in the VOD bucket for two weeks free of charge. The images are automatically deleted after two weeks.
      *
      * @param request SubmitAIMediaAuditJobRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return SubmitAIMediaAuditJobResponse
     */
    public SubmitAIMediaAuditJobResponse submitAIMediaAuditJobWithOptions(SubmitAIMediaAuditJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mediaAuditConfiguration)) {
            query.put("MediaAuditConfiguration", request.mediaAuditConfiguration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaId)) {
            query.put("MediaId", request.mediaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaType)) {
            query.put("MediaType", request.mediaType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * *   **Make sure that you understand the billing methods and price of ApsaraVideo VOD before you call this operation. You are charged for using the automated review feature. For more information about billing, submit a ticket or contact your account manager.**
      * *   You can call this operation only in the **China (Shanghai)**, **China (Beijing)**, and **Singapore** regions.
      * *   For more information, see [Automated review](~~101148~~).
      * *   After an automated review job is complete, the images generated during the review are stored in the VOD bucket for two weeks free of charge. The images are automatically deleted after two weeks.
      *
      * @param request SubmitAIMediaAuditJobRequest
      * @return SubmitAIMediaAuditJobResponse
     */
    public SubmitAIMediaAuditJobResponse submitAIMediaAuditJob(SubmitAIMediaAuditJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitAIMediaAuditJobWithOptions(request, runtime);
    }

    /**
      * *   **Make sure that you understand the billing method and price of ApsaraVideo VOD before you call this operation. You are charged for using the digital watermark feature. For more information about billing, see [Billing of digital watermarks](~~188310#section-rcb-x9z-6p1~~).**
      * *   You must upload the video from which you want to extract the digital watermark to ApsaraVideo VOD.
      * *   The duration of the video from which you want to extract the digital watermark must exceed 3 minutes.
      *
      * @param request SubmitDigitalWatermarkExtractJobRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return SubmitDigitalWatermarkExtractJobResponse
     */
    public SubmitDigitalWatermarkExtractJobResponse submitDigitalWatermarkExtractJobWithOptions(SubmitDigitalWatermarkExtractJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.extractType)) {
            query.put("ExtractType", request.extractType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaId)) {
            query.put("MediaId", request.mediaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitDigitalWatermarkExtractJob"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitDigitalWatermarkExtractJobResponse());
    }

    /**
      * *   **Make sure that you understand the billing method and price of ApsaraVideo VOD before you call this operation. You are charged for using the digital watermark feature. For more information about billing, see [Billing of digital watermarks](~~188310#section-rcb-x9z-6p1~~).**
      * *   You must upload the video from which you want to extract the digital watermark to ApsaraVideo VOD.
      * *   The duration of the video from which you want to extract the digital watermark must exceed 3 minutes.
      *
      * @param request SubmitDigitalWatermarkExtractJobRequest
      * @return SubmitDigitalWatermarkExtractJobResponse
     */
    public SubmitDigitalWatermarkExtractJobResponse submitDigitalWatermarkExtractJob(SubmitDigitalWatermarkExtractJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitDigitalWatermarkExtractJobWithOptions(request, runtime);
    }

    /**
      * *   You can capture a part of a video and generate animated images only when the video is in the **Uploaded**, **Transcoding**, **Normal**, **Reviewing**, or **Flagged** state.
      * *   The fees for frame animation are included in your video transcoding bill. You are charged based on the output resolution and the duration. For more information, see [Billing of basic services](~~188308~~).
      * ### QPS limits
      * You can call this operation up to 30 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see [QPS limit on API operations](~~342790~~).
      *
      * @param request SubmitDynamicImageJobRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return SubmitDynamicImageJobResponse
     */
    public SubmitDynamicImageJobResponse submitDynamicImageJobWithOptions(SubmitDynamicImageJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dynamicImageTemplateId)) {
            query.put("DynamicImageTemplateId", request.dynamicImageTemplateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.overrideParams)) {
            query.put("OverrideParams", request.overrideParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.videoId)) {
            query.put("VideoId", request.videoId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * *   You can capture a part of a video and generate animated images only when the video is in the **Uploaded**, **Transcoding**, **Normal**, **Reviewing**, or **Flagged** state.
      * *   The fees for frame animation are included in your video transcoding bill. You are charged based on the output resolution and the duration. For more information, see [Billing of basic services](~~188308~~).
      * ### QPS limits
      * You can call this operation up to 30 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see [QPS limit on API operations](~~342790~~).
      *
      * @param request SubmitDynamicImageJobRequest
      * @return SubmitDynamicImageJobResponse
     */
    public SubmitDynamicImageJobResponse submitDynamicImageJob(SubmitDynamicImageJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitDynamicImageJobWithOptions(request, runtime);
    }

    /**
      * Regions that support this operation: **China (Beijing)**, **China (Shanghai)**, and **Singapore**.
      *
      * @param request SubmitMediaDNADeleteJobRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return SubmitMediaDNADeleteJobResponse
     */
    public SubmitMediaDNADeleteJobResponse submitMediaDNADeleteJobWithOptions(SubmitMediaDNADeleteJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mediaId)) {
            query.put("MediaId", request.mediaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * Regions that support this operation: **China (Beijing)**, **China (Shanghai)**, and **Singapore**.
      *
      * @param request SubmitMediaDNADeleteJobRequest
      * @return SubmitMediaDNADeleteJobResponse
     */
    public SubmitMediaDNADeleteJobResponse submitMediaDNADeleteJob(SubmitMediaDNADeleteJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitMediaDNADeleteJobWithOptions(request, runtime);
    }

    /**
      * *   During video preprocessing, videos are transcoded to meet the playback requirements of the production studio. Therefore, you are **charged** for video preprocessing. You can submit a ticket for information about the **production studio** service.
      *  *   You can obtain the preprocessing result in the [TranscodeComplete](~~55638~~) event notification. If the value of the **Preprocess** parameter is true in the event notification, the video is preprocessed.
      *
      * @param request SubmitPreprocessJobsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return SubmitPreprocessJobsResponse
     */
    public SubmitPreprocessJobsResponse submitPreprocessJobsWithOptions(SubmitPreprocessJobsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.preprocessType)) {
            query.put("PreprocessType", request.preprocessType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.videoId)) {
            query.put("VideoId", request.videoId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * *   During video preprocessing, videos are transcoded to meet the playback requirements of the production studio. Therefore, you are **charged** for video preprocessing. You can submit a ticket for information about the **production studio** service.
      *  *   You can obtain the preprocessing result in the [TranscodeComplete](~~55638~~) event notification. If the value of the **Preprocess** parameter is true in the event notification, the video is preprocessed.
      *
      * @param request SubmitPreprocessJobsRequest
      * @return SubmitPreprocessJobsResponse
     */
    public SubmitPreprocessJobsResponse submitPreprocessJobs(SubmitPreprocessJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitPreprocessJobsWithOptions(request, runtime);
    }

    /**
      * > *   Only snapshots in the JPG format are generated.
      * > *   After a snapshot job is complete, ApsaraVideo VOD sends a [SnapshotComplete](~~57337~~) event notification that contains EventType=SnapshotComplete and SubType=SpecifiedTime.
      *
      * @param tmpReq SubmitSnapshotJobRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return SubmitSnapshotJobResponse
     */
    public SubmitSnapshotJobResponse submitSnapshotJobWithOptions(SubmitSnapshotJobRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SubmitSnapshotJobShrinkRequest request = new SubmitSnapshotJobShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.specifiedOffsetTimes)) {
            request.specifiedOffsetTimesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.specifiedOffsetTimes, "SpecifiedOffsetTimes", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.count)) {
            query.put("Count", request.count);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.height)) {
            query.put("Height", request.height);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snapshotTemplateId)) {
            query.put("SnapshotTemplateId", request.snapshotTemplateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.specifiedOffsetTime)) {
            query.put("SpecifiedOffsetTime", request.specifiedOffsetTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.specifiedOffsetTimesShrink)) {
            query.put("SpecifiedOffsetTimes", request.specifiedOffsetTimesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spriteSnapshotConfig)) {
            query.put("SpriteSnapshotConfig", request.spriteSnapshotConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.videoId)) {
            query.put("VideoId", request.videoId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.width)) {
            query.put("Width", request.width);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * > *   Only snapshots in the JPG format are generated.
      * > *   After a snapshot job is complete, ApsaraVideo VOD sends a [SnapshotComplete](~~57337~~) event notification that contains EventType=SnapshotComplete and SubType=SpecifiedTime.
      *
      * @param request SubmitSnapshotJobRequest
      * @return SubmitSnapshotJobResponse
     */
    public SubmitSnapshotJobResponse submitSnapshotJob(SubmitSnapshotJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitSnapshotJobWithOptions(request, runtime);
    }

    /**
      * ### [](#)Usage notes
      * *   **Make sure that you understand the billing methods and prices of ApsaraVideo VOD before you call this operation. For more information about billing of the transcoding feature, see [Billing of basic services](~~188308#section-ejb-nii-nqa~~).**
      * *   You can transcode a video only in the Uploaded, Normal, or Reviewing state.
      * *   You can obtain the transcoding results from the [StreamTranscodeComplete](~~55636~~) or [TranscodeComplete](~~55638~~) callback.
      * *   You can call this operation to dynamically override the subtitle URL in an HTTP Live Streaming (HLS) packaging task. If the packaging task does not contain subtitles, we recommend that you specify the ID of the specific packaging template group when you upload the video instead of calling this operation.
      *
      * @param request SubmitTranscodeJobsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return SubmitTranscodeJobsResponse
     */
    public SubmitTranscodeJobsResponse submitTranscodeJobsWithOptions(SubmitTranscodeJobsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.encryptConfig)) {
            query.put("EncryptConfig", request.encryptConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.overrideParams)) {
            query.put("OverrideParams", request.overrideParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pipelineId)) {
            query.put("PipelineId", request.pipelineId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            query.put("Priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateGroupId)) {
            query.put("TemplateGroupId", request.templateGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.videoId)) {
            query.put("VideoId", request.videoId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * ### [](#)Usage notes
      * *   **Make sure that you understand the billing methods and prices of ApsaraVideo VOD before you call this operation. For more information about billing of the transcoding feature, see [Billing of basic services](~~188308#section-ejb-nii-nqa~~).**
      * *   You can transcode a video only in the Uploaded, Normal, or Reviewing state.
      * *   You can obtain the transcoding results from the [StreamTranscodeComplete](~~55636~~) or [TranscodeComplete](~~55638~~) callback.
      * *   You can call this operation to dynamically override the subtitle URL in an HTTP Live Streaming (HLS) packaging task. If the packaging task does not contain subtitles, we recommend that you specify the ID of the specific packaging template group when you upload the video instead of calling this operation.
      *
      * @param request SubmitTranscodeJobsRequest
      * @return SubmitTranscodeJobsResponse
     */
    public SubmitTranscodeJobsResponse submitTranscodeJobs(SubmitTranscodeJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitTranscodeJobsWithOptions(request, runtime);
    }

    /**
      * * **Make sure that you understand the billing method and price of ApsaraVideo VOD before you call this operation. When you use workflows to process videos, you may be charged for transcoding, encryption, and automated review. For more information, see [Billing overview](~~188307~~).**
      * * You can call this operation to initiate a VOD workflow to process media files. For more information, see [Workflows](~~115347~~).
      *
      * @param request SubmitWorkflowJobRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return SubmitWorkflowJobResponse
     */
    public SubmitWorkflowJobResponse submitWorkflowJobWithOptions(SubmitWorkflowJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mediaId)) {
            query.put("MediaId", request.mediaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workflowId)) {
            query.put("WorkflowId", request.workflowId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * * **Make sure that you understand the billing method and price of ApsaraVideo VOD before you call this operation. When you use workflows to process videos, you may be charged for transcoding, encryption, and automated review. For more information, see [Billing overview](~~188307~~).**
      * * You can call this operation to initiate a VOD workflow to process media files. For more information, see [Workflows](~~115347~~).
      *
      * @param request SubmitWorkflowJobRequest
      * @return SubmitWorkflowJobResponse
     */
    public SubmitWorkflowJobResponse submitWorkflowJob(SubmitWorkflowJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitWorkflowJobWithOptions(request, runtime);
    }

    /**
      * *   Regions that support this operation: **China (Beijing)**, **China (Shanghai)**, and **Singapore**.
      * *   After you call the [AddAITemplate](~~102930~~) operation to add an AI template, you can call this operation to modify the AI template.
      *
      * @param request UpdateAITemplateRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return UpdateAITemplateResponse
     */
    public UpdateAITemplateResponse updateAITemplateWithOptions(UpdateAITemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.templateConfig)) {
            query.put("TemplateConfig", request.templateConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateName)) {
            query.put("TemplateName", request.templateName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * *   Regions that support this operation: **China (Beijing)**, **China (Shanghai)**, and **Singapore**.
      * *   After you call the [AddAITemplate](~~102930~~) operation to add an AI template, you can call this operation to modify the AI template.
      *
      * @param request UpdateAITemplateRequest
      * @return UpdateAITemplateResponse
     */
    public UpdateAITemplateResponse updateAITemplate(UpdateAITemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAITemplateWithOptions(request, runtime);
    }

    /**
      * ## QPS limit
      * A single user can perform a maximum of 30 queries per second (QPS). Throttling is triggered when the number of calls per second exceeds the QPS limit. The throttling may affect your business. Thus, we recommend that you observe the QPS limit on this operation.
      *
      * @param request UpdateAppInfoRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return UpdateAppInfoResponse
     */
    public UpdateAppInfoResponse updateAppInfoWithOptions(UpdateAppInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * ## QPS limit
      * A single user can perform a maximum of 30 queries per second (QPS). Throttling is triggered when the number of calls per second exceeds the QPS limit. The throttling may affect your business. Thus, we recommend that you observe the QPS limit on this operation.
      *
      * @param request UpdateAppInfoRequest
      * @return UpdateAppInfoResponse
     */
    public UpdateAppInfoResponse updateAppInfo(UpdateAppInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAppInfoWithOptions(request, runtime);
    }

    /**
      * The specific parameter of an auxiliary media asset is updated only when a new value is passed in the parameter.
      *
      * @param request UpdateAttachedMediaInfosRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return UpdateAttachedMediaInfosResponse
     */
    public UpdateAttachedMediaInfosResponse updateAttachedMediaInfosWithOptions(UpdateAttachedMediaInfosRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.updateContent)) {
            query.put("UpdateContent", request.updateContent);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * The specific parameter of an auxiliary media asset is updated only when a new value is passed in the parameter.
      *
      * @param request UpdateAttachedMediaInfosRequest
      * @return UpdateAttachedMediaInfosResponse
     */
    public UpdateAttachedMediaInfosResponse updateAttachedMediaInfos(UpdateAttachedMediaInfosRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAttachedMediaInfosWithOptions(request, runtime);
    }

    public UpdateCategoryResponse updateCategoryWithOptions(UpdateCategoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cateId)) {
            query.put("CateId", request.cateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cateName)) {
            query.put("CateName", request.cateName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCategoryWithOptions(request, runtime);
    }

    public UpdateEditingProjectResponse updateEditingProjectWithOptions(UpdateEditingProjectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.coverURL)) {
            query.put("CoverURL", request.coverURL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeline)) {
            query.put("Timeline", request.timeline);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            query.put("Title", request.title);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateEditingProjectWithOptions(request, runtime);
    }

    public UpdateImageInfosResponse updateImageInfosWithOptions(UpdateImageInfosRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.updateContent)) {
            query.put("UpdateContent", request.updateContent);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateImageInfosWithOptions(request, runtime);
    }

    /**
      * UpdateMediaStorageClass is an asynchronous operation. You can call this operation to modify the storage classes of media assets. After the storage class is modified, a callback notification is sent.
      * If the storage class of a media asset is Archive or Cold Archive, the media asset is automatically restored when you call this operation. After the media asset is restored, the storage class is modified. To restore the media asset, you do not need to call the RestoreMedia operation. To modify the storage class of a Cold Archive media asset, you must specify the restoration priority. By default, the restoration priority is set to Standard.
      * Media assets whose storage classes are being modified cannot be used or processed.
      * The media assets that are not of the Standard storage class have a limit on storage duration. If the storage duration does not meet the following requirements, you cannot change the storage classes: Infrequent Access (IA) media assets or source files are stored for at least 30 days, Archive media assets or source files are stored for at least 60 days, and Cold Archive media assets or source files are stored for at least 180 days.
      *
      * @param request UpdateMediaStorageClassRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return UpdateMediaStorageClassResponse
     */
    public UpdateMediaStorageClassResponse updateMediaStorageClassWithOptions(UpdateMediaStorageClassRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.allowUpdateWithoutTimeLimit)) {
            query.put("AllowUpdateWithoutTimeLimit", request.allowUpdateWithoutTimeLimit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaIds)) {
            query.put("MediaIds", request.mediaIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.restoreTier)) {
            query.put("RestoreTier", request.restoreTier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scope)) {
            query.put("Scope", request.scope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageClass)) {
            query.put("StorageClass", request.storageClass);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateMediaStorageClass"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateMediaStorageClassResponse());
    }

    /**
      * UpdateMediaStorageClass is an asynchronous operation. You can call this operation to modify the storage classes of media assets. After the storage class is modified, a callback notification is sent.
      * If the storage class of a media asset is Archive or Cold Archive, the media asset is automatically restored when you call this operation. After the media asset is restored, the storage class is modified. To restore the media asset, you do not need to call the RestoreMedia operation. To modify the storage class of a Cold Archive media asset, you must specify the restoration priority. By default, the restoration priority is set to Standard.
      * Media assets whose storage classes are being modified cannot be used or processed.
      * The media assets that are not of the Standard storage class have a limit on storage duration. If the storage duration does not meet the following requirements, you cannot change the storage classes: Infrequent Access (IA) media assets or source files are stored for at least 30 days, Archive media assets or source files are stored for at least 60 days, and Cold Archive media assets or source files are stored for at least 180 days.
      *
      * @param request UpdateMediaStorageClassRequest
      * @return UpdateMediaStorageClassResponse
     */
    public UpdateMediaStorageClassResponse updateMediaStorageClass(UpdateMediaStorageClassRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateMediaStorageClassWithOptions(request, runtime);
    }

    /**
      * > *   You cannot add, modify, or remove transcoding templates in a transcoding template group that is locked in the ApsaraVideo VOD console. To manage such transcoding template groups, contact the ApsaraVideo VOD technical support.
      * > *   You can call the GetTranscodeTemplateGroup operation to query the configurations of a transcoding template group and check whether the transcoding template group is locked by using the response parameter Locked.
      *
      * @param request UpdateTranscodeTemplateGroupRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return UpdateTranscodeTemplateGroupResponse
     */
    public UpdateTranscodeTemplateGroupResponse updateTranscodeTemplateGroupWithOptions(UpdateTranscodeTemplateGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.locked)) {
            query.put("Locked", request.locked);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transcodeTemplateGroupId)) {
            query.put("TranscodeTemplateGroupId", request.transcodeTemplateGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transcodeTemplateList)) {
            query.put("TranscodeTemplateList", request.transcodeTemplateList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * > *   You cannot add, modify, or remove transcoding templates in a transcoding template group that is locked in the ApsaraVideo VOD console. To manage such transcoding template groups, contact the ApsaraVideo VOD technical support.
      * > *   You can call the GetTranscodeTemplateGroup operation to query the configurations of a transcoding template group and check whether the transcoding template group is locked by using the response parameter Locked.
      *
      * @param request UpdateTranscodeTemplateGroupRequest
      * @return UpdateTranscodeTemplateGroupResponse
     */
    public UpdateTranscodeTemplateGroupResponse updateTranscodeTemplateGroup(UpdateTranscodeTemplateGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateTranscodeTemplateGroupWithOptions(request, runtime);
    }

    /**
      * The specific parameter of a video is updated only when a new value is passed in the parameter.
      *
      * @param request UpdateVideoInfoRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return UpdateVideoInfoResponse
     */
    public UpdateVideoInfoResponse updateVideoInfoWithOptions(UpdateVideoInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cateId)) {
            query.put("CateId", request.cateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.coverURL)) {
            query.put("CoverURL", request.coverURL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            query.put("Title", request.title);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.videoId)) {
            query.put("VideoId", request.videoId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * The specific parameter of a video is updated only when a new value is passed in the parameter.
      *
      * @param request UpdateVideoInfoRequest
      * @return UpdateVideoInfoResponse
     */
    public UpdateVideoInfoResponse updateVideoInfo(UpdateVideoInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateVideoInfoWithOptions(request, runtime);
    }

    /**
      * The specific parameter of a video is updated only when a new value is passed in the parameter.
      *
      * @param request UpdateVideoInfosRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return UpdateVideoInfosResponse
     */
    public UpdateVideoInfosResponse updateVideoInfosWithOptions(UpdateVideoInfosRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.updateContent)) {
            query.put("UpdateContent", request.updateContent);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * The specific parameter of a video is updated only when a new value is passed in the parameter.
      *
      * @param request UpdateVideoInfosRequest
      * @return UpdateVideoInfosResponse
     */
    public UpdateVideoInfosResponse updateVideoInfos(UpdateVideoInfosRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateVideoInfosWithOptions(request, runtime);
    }

    /**
      * > This operation is available only in the **China (Shanghai)** region.
      *
      * @param request UpdateVodDomainRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return UpdateVodDomainResponse
     */
    public UpdateVodDomainResponse updateVodDomainWithOptions(UpdateVodDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sources)) {
            query.put("Sources", request.sources);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topLevelDomain)) {
            query.put("TopLevelDomain", request.topLevelDomain);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * > This operation is available only in the **China (Shanghai)** region.
      *
      * @param request UpdateVodDomainRequest
      * @return UpdateVodDomainResponse
     */
    public UpdateVodDomainResponse updateVodDomain(UpdateVodDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateVodDomainWithOptions(request, runtime);
    }

    public UpdateVodTemplateResponse updateVodTemplateWithOptions(UpdateVodTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateConfig)) {
            query.put("TemplateConfig", request.templateConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vodTemplateId)) {
            query.put("VodTemplateId", request.vodTemplateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateVodTemplateWithOptions(request, runtime);
    }

    /**
      * You can modify only the name and configurations of a watermark.
      *
      * @param request UpdateWatermarkRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return UpdateWatermarkResponse
     */
    public UpdateWatermarkResponse updateWatermarkWithOptions(UpdateWatermarkRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.watermarkConfig)) {
            query.put("WatermarkConfig", request.watermarkConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.watermarkId)) {
            query.put("WatermarkId", request.watermarkId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * You can modify only the name and configurations of a watermark.
      *
      * @param request UpdateWatermarkRequest
      * @return UpdateWatermarkResponse
     */
    public UpdateWatermarkResponse updateWatermark(UpdateWatermarkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateWatermarkWithOptions(request, runtime);
    }

    /**
      * *   You can call this operation to upload media files that are not stored on a local server or device and must be uploaded based on URLs over the Internet.
      * *   The URL-based upload jobs are asynchronous. After you submit a URL-based upload job by calling this operation, it may take hours, even days to complete. If you require high timeliness, we recommend that you use the upload SDK.
      * *   If you configure callbacks, you can receive an [UploadByURLComplete](~~86326~~) event notification after the media file is uploaded. You can query the upload status by calling the [GetURLUploadInfos](~~106830~~) operation.
      * *   After you submit an upload job, the job is asynchronously processed on the cloud. All URL-based upload jobs that are submitted in each region are queued. The waiting time for the upload job depends on the number of queued jobs. After the upload job is complete, you can associate the playback URL included in the callback with the media ID.
      * *   You can call this operation only in the **China (Shanghai)** and **Singapore** regions.
      * *   Every time you submit a URL-based upload job, a new media ID is generated in ApsaraVideo VOD.
      *
      * @param request UploadMediaByURLRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return UploadMediaByURLResponse
     */
    public UploadMediaByURLResponse uploadMediaByURLWithOptions(UploadMediaByURLRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            query.put("SessionId", request.sessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageLocation)) {
            query.put("StorageLocation", request.storageLocation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateGroupId)) {
            query.put("TemplateGroupId", request.templateGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uploadMetadatas)) {
            query.put("UploadMetadatas", request.uploadMetadatas);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uploadURLs)) {
            query.put("UploadURLs", request.uploadURLs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workflowId)) {
            query.put("WorkflowId", request.workflowId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * *   You can call this operation to upload media files that are not stored on a local server or device and must be uploaded based on URLs over the Internet.
      * *   The URL-based upload jobs are asynchronous. After you submit a URL-based upload job by calling this operation, it may take hours, even days to complete. If you require high timeliness, we recommend that you use the upload SDK.
      * *   If you configure callbacks, you can receive an [UploadByURLComplete](~~86326~~) event notification after the media file is uploaded. You can query the upload status by calling the [GetURLUploadInfos](~~106830~~) operation.
      * *   After you submit an upload job, the job is asynchronously processed on the cloud. All URL-based upload jobs that are submitted in each region are queued. The waiting time for the upload job depends on the number of queued jobs. After the upload job is complete, you can associate the playback URL included in the callback with the media ID.
      * *   You can call this operation only in the **China (Shanghai)** and **Singapore** regions.
      * *   Every time you submit a URL-based upload job, a new media ID is generated in ApsaraVideo VOD.
      *
      * @param request UploadMediaByURLRequest
      * @return UploadMediaByURLResponse
     */
    public UploadMediaByURLResponse uploadMediaByURL(UploadMediaByURLRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.uploadMediaByURLWithOptions(request, runtime);
    }

    /**
      * *   **Make sure that you understand the billing method and price of ApsaraVideo VOD before you call this operation. You are charged storage fees after you upload media files to ApsaraVideo VOD. For more information, see [Billing of media asset storage](~~188308#section_e97\\_xrp_mzz~~). If you have activated the acceleration service, you are charged acceleration fees when you upload media files to ApsaraVideo VOD. For more information, see [Billing of acceleration traffic](~~188310#section_sta_zm2\\_tsv~~).**
      * *   This operation is available only in the **China (Shanghai)** and **Singapore** regions.
      * *   You can call this operation to upload transcoded streams to ApsaraVideo VOD from external storage. The following HDR types of transcoded streams are supported: HDR, HDR 10, HLG, Dolby Vision, HDR Vivid, and SDR+.
      * *   You can call the [GetURLUploadInfos](~~106830~~) operation to query the upload status. After the upload is complete, the callback of the [UploadByURLComplete](~~376427~~) event is returned.
      *
      * @param request UploadStreamByURLRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return UploadStreamByURLResponse
     */
    public UploadStreamByURLResponse uploadStreamByURLWithOptions(UploadStreamByURLRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.definition)) {
            query.put("Definition", request.definition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileExtension)) {
            query.put("FileExtension", request.fileExtension);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.HDRType)) {
            query.put("HDRType", request.HDRType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaId)) {
            query.put("MediaId", request.mediaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.streamURL)) {
            query.put("StreamURL", request.streamURL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * *   **Make sure that you understand the billing method and price of ApsaraVideo VOD before you call this operation. You are charged storage fees after you upload media files to ApsaraVideo VOD. For more information, see [Billing of media asset storage](~~188308#section_e97\\_xrp_mzz~~). If you have activated the acceleration service, you are charged acceleration fees when you upload media files to ApsaraVideo VOD. For more information, see [Billing of acceleration traffic](~~188310#section_sta_zm2\\_tsv~~).**
      * *   This operation is available only in the **China (Shanghai)** and **Singapore** regions.
      * *   You can call this operation to upload transcoded streams to ApsaraVideo VOD from external storage. The following HDR types of transcoded streams are supported: HDR, HDR 10, HLG, Dolby Vision, HDR Vivid, and SDR+.
      * *   You can call the [GetURLUploadInfos](~~106830~~) operation to query the upload status. After the upload is complete, the callback of the [UploadByURLComplete](~~376427~~) event is returned.
      *
      * @param request UploadStreamByURLRequest
      * @return UploadStreamByURLResponse
     */
    public UploadStreamByURLResponse uploadStreamByURL(UploadStreamByURLRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.uploadStreamByURLWithOptions(request, runtime);
    }

    public VerifyVodDomainOwnerResponse verifyVodDomainOwnerWithOptions(VerifyVodDomainOwnerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.verifyType)) {
            query.put("VerifyType", request.verifyType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.verifyVodDomainOwnerWithOptions(request, runtime);
    }
}
