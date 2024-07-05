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
     * <b>description</b> :
     * <p>  Regions that support this operation: <strong>China (Beijing)</strong>, <strong>China (Shanghai)</strong>, and <strong>Singapore</strong>.</p>
     * <ul>
     * <li>Before you add an AI template for automated review and smart thumbnail tasks, make sure that <a href="https://ai.aliyun.com/vi/censor">automated review</a> and <a href="https://ai.aliyun.com/vi/cover">smart thumbnail</a> are enabled.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds an AI template for automated review and smart thumbnail tasks.</p>
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
     * <b>description</b> :
     * <p>  Regions that support this operation: <strong>China (Beijing)</strong>, <strong>China (Shanghai)</strong>, and <strong>Singapore</strong>.</p>
     * <ul>
     * <li>Before you add an AI template for automated review and smart thumbnail tasks, make sure that <a href="https://ai.aliyun.com/vi/censor">automated review</a> and <a href="https://ai.aliyun.com/vi/cover">smart thumbnail</a> are enabled.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds an AI template for automated review and smart thumbnail tasks.</p>
     * 
     * @param request AddAITemplateRequest
     * @return AddAITemplateResponse
     */
    public AddAITemplateResponse addAITemplate(AddAITemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addAITemplateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can create a maximum of 3 levels of categories for audio, video, and image files and 2 levels of categories for short video materials. Each category level can contain a maximum of 100 subcategories. To create categories for audio and video files, set <code>Type</code> to <code>default</code>. To create categories for short video materials, set <code>Type</code> to <code>material</code>.</p>
     * <ul>
     * <li>After you create a category, you can categorize media resources during upload or categorize the uploaded media resources. For more information, see <a href="https://help.aliyun.com/document_detail/86070.html">Manage video categories</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a video category. You can call this operation to categorize media assets including audio or video files, images, and short video materials in ApsaraVideo VOD. This simplifies the query and management of media assets.</p>
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
     * <b>description</b> :
     * <p>  You can create a maximum of 3 levels of categories for audio, video, and image files and 2 levels of categories for short video materials. Each category level can contain a maximum of 100 subcategories. To create categories for audio and video files, set <code>Type</code> to <code>default</code>. To create categories for short video materials, set <code>Type</code> to <code>material</code>.</p>
     * <ul>
     * <li>After you create a category, you can categorize media resources during upload or categorize the uploaded media resources. For more information, see <a href="https://help.aliyun.com/document_detail/86070.html">Manage video categories</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a video category. You can call this operation to categorize media assets including audio or video files, images, and short video materials in ApsaraVideo VOD. This simplifies the query and management of media assets.</p>
     * 
     * @param request AddCategoryRequest
     * @return AddCategoryResponse
     */
    public AddCategoryResponse addCategory(AddCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addCategoryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an online editing project.</p>
     * 
     * @param request AddEditingProjectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddEditingProjectResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Creates an online editing project.</p>
     * 
     * @param request AddEditingProjectRequest
     * @return AddEditingProjectResponse
     */
    public AddEditingProjectResponse addEditingProject(AddEditingProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addEditingProjectWithOptions(request, runtime);
    }

    /**
     * @param request AddEditingProjectMaterialsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddEditingProjectMaterialsResponse
     */
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

    /**
     * @param request AddEditingProjectMaterialsRequest
     * @return AddEditingProjectMaterialsResponse
     */
    public AddEditingProjectMaterialsResponse addEditingProjectMaterials(AddEditingProjectMaterialsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addEditingProjectMaterialsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You cannot perform custom operations on transcoding template groups that are <strong>locked</strong> in the ApsaraVideo VOD console. You can call the <a href="~~GetTranscodeTemplateGroup~~">GetTranscodeTemplateGroup</a> operation to query the information about a transcoding template group and check whether the transcoding template group is locked based on the value of the Locked parameter. You can call the <a href="~~UpdateTranscodeTemplateGroup~~">UpdateTranscodeTemplateGroup</a> operation to unlock a transcoding template group if it is locked. Then, you can perform custom operations on the transcoding template group.</p>
     * <ul>
     * <li>An Object Storage Service (OSS) bucket is required to store files that are used for transcoding. You cannot create a transcoding template group if no bucket is available. To activate a bucket, perform the following operations: Log on to the ApsaraVideo VOD console. In the left-side navigation pane, choose <strong>Configuration Management &gt; Media Management &gt; Storage</strong>. On the <strong>Storage</strong> page, activate the bucket that is allocated by ApsaraVideo VOD.</li>
     * <li>You cannot add transcoding templates to the <strong>No Transcoding</strong> template group.</li>
     * <li>You can create a maximum of 20 transcoding template groups.</li>
     * <li>You can add a maximum of 20 transcoding templates to a transcoding template group.</li>
     * <li>If you want to generate a URL for adaptive bitrate streaming, you can add video packaging templates to a transcoding template group. You can add a maximum of 10 video packaging templates to a transcoding template group. If you add more than 10 video packaging templates, URLs of the video transcoded based on the video packaging templates are generated but the URL for adaptive bitrate streaming is not generated.</li>
     * </ul>
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to five times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limits</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a transcoding template group or adds transcoding templates to a transcoding template group.</p>
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
     * <b>description</b> :
     * <p>  You cannot perform custom operations on transcoding template groups that are <strong>locked</strong> in the ApsaraVideo VOD console. You can call the <a href="~~GetTranscodeTemplateGroup~~">GetTranscodeTemplateGroup</a> operation to query the information about a transcoding template group and check whether the transcoding template group is locked based on the value of the Locked parameter. You can call the <a href="~~UpdateTranscodeTemplateGroup~~">UpdateTranscodeTemplateGroup</a> operation to unlock a transcoding template group if it is locked. Then, you can perform custom operations on the transcoding template group.</p>
     * <ul>
     * <li>An Object Storage Service (OSS) bucket is required to store files that are used for transcoding. You cannot create a transcoding template group if no bucket is available. To activate a bucket, perform the following operations: Log on to the ApsaraVideo VOD console. In the left-side navigation pane, choose <strong>Configuration Management &gt; Media Management &gt; Storage</strong>. On the <strong>Storage</strong> page, activate the bucket that is allocated by ApsaraVideo VOD.</li>
     * <li>You cannot add transcoding templates to the <strong>No Transcoding</strong> template group.</li>
     * <li>You can create a maximum of 20 transcoding template groups.</li>
     * <li>You can add a maximum of 20 transcoding templates to a transcoding template group.</li>
     * <li>If you want to generate a URL for adaptive bitrate streaming, you can add video packaging templates to a transcoding template group. You can add a maximum of 10 video packaging templates to a transcoding template group. If you add more than 10 video packaging templates, URLs of the video transcoded based on the video packaging templates are generated but the URL for adaptive bitrate streaming is not generated.</li>
     * </ul>
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to five times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limits</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a transcoding template group or adds transcoding templates to a transcoding template group.</p>
     * 
     * @param request AddTranscodeTemplateGroupRequest
     * @return AddTranscodeTemplateGroupResponse
     */
    public AddTranscodeTemplateGroupResponse addTranscodeTemplateGroup(AddTranscodeTemplateGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addTranscodeTemplateGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  This operation is available only in the <strong>China (Shanghai)</strong> region.</p>
     * <ul>
     * <li>Before you add a domain name to accelerate, you must activate ApsaraVideo VOD and apply for an Internet content provider (ICP) filing for the domain name. For more information about how to activate ApsaraVideo VOD, see <a href="https://help.aliyun.com/document_detail/51512.html">Activate ApsaraVideo VOD</a>.</li>
     * <li>If the content on the origin server is not stored on Alibaba Cloud, the content must be reviewed by Alibaba Cloud. The review will be complete by the end of the next business day after you submit an application.</li>
     * <li>You can add only one domain name to accelerate in a request. You can add a maximum of 20 accelerated domain names within an Alibaba Cloud account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds a domain name to accelerate in ApsaraVideo VOD.</p>
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
     * <b>description</b> :
     * <p>  This operation is available only in the <strong>China (Shanghai)</strong> region.</p>
     * <ul>
     * <li>Before you add a domain name to accelerate, you must activate ApsaraVideo VOD and apply for an Internet content provider (ICP) filing for the domain name. For more information about how to activate ApsaraVideo VOD, see <a href="https://help.aliyun.com/document_detail/51512.html">Activate ApsaraVideo VOD</a>.</li>
     * <li>If the content on the origin server is not stored on Alibaba Cloud, the content must be reviewed by Alibaba Cloud. The review will be complete by the end of the next business day after you submit an application.</li>
     * <li>You can add only one domain name to accelerate in a request. You can add a maximum of 20 accelerated domain names within an Alibaba Cloud account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds a domain name to accelerate in ApsaraVideo VOD.</p>
     * 
     * @param request AddVodDomainRequest
     * @return AddVodDomainResponse
     */
    public AddVodDomainResponse addVodDomain(AddVodDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addVodDomainWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to add a buckets to an ApsaraVideo VOD applications.</p>
     * <blockquote>
     * <p>You can add only one ApsaraVideo VOD bucket for each application. If you specify an AppId that does not exist or the ID of an application for which an VOD bucket is enabled, an error is returned.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Binds a storage bucket to one or more applications in ApsaraVideo VOD.</p>
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
     * <b>description</b> :
     * <p>You can call this operation to add a buckets to an ApsaraVideo VOD applications.</p>
     * <blockquote>
     * <p>You can add only one ApsaraVideo VOD bucket for each application. If you specify an AppId that does not exist or the ID of an application for which an VOD bucket is enabled, an error is returned.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Binds a storage bucket to one or more applications in ApsaraVideo VOD.</p>
     * 
     * @param request AddVodStorageForAppRequest
     * @return AddVodStorageForAppResponse
     */
    public AddVodStorageForAppResponse addVodStorageForApp(AddVodStorageForAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addVodStorageForAppWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  After you add a snapshot template, you can call the <a href="https://help.aliyun.com/document_detail/72213.html">SubmitSnapshotJob</a> operation and specify the template ID to submit a snapshot job.</p>
     * <ul>
     * <li>You can use the HTTP (HTTPS compatible) callback or MNS callback method to receive the <a href="https://help.aliyun.com/document_detail/57337.html">SnapshotComplete</a> callback. For more information, see <a href="https://help.aliyun.com/document_detail/55627.html">Overview</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds a snapshot template or frame animation template.</p>
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
     * <b>description</b> :
     * <p>  After you add a snapshot template, you can call the <a href="https://help.aliyun.com/document_detail/72213.html">SubmitSnapshotJob</a> operation and specify the template ID to submit a snapshot job.</p>
     * <ul>
     * <li>You can use the HTTP (HTTPS compatible) callback or MNS callback method to receive the <a href="https://help.aliyun.com/document_detail/57337.html">SnapshotComplete</a> callback. For more information, see <a href="https://help.aliyun.com/document_detail/55627.html">Overview</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds a snapshot template or frame animation template.</p>
     * 
     * @param request AddVodTemplateRequest
     * @return AddVodTemplateResponse
     */
    public AddVodTemplateResponse addVodTemplate(AddVodTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addVodTemplateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to create an <code>Image</code> watermark template or a <code>Text</code> watermark template. You can use static images in the PNG format or dynamic images in the GIF, APNG, and MOV formats as image watermarks.</p>
     * <ul>
     * <li>After you call this operation to create a watermark template, you must call the <a href="~~AddTranscodeTemplateGroup~~">AddTranscodeTemplateGroup</a> or <a href="~~UpdateTranscodeTemplateGroup~~">UpdateTranscodeTemplateGroup</a> operation to associate the watermark template with a transcoding template group. This way, you can add watermarks to videos during transcoding.</li>
     * <li>For more information, see <a href="https://help.aliyun.com/document_detail/99369.html">Video watermarks</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an image or text watermark. ApsaraVideo VOD allows you to create watermark templates to reuse your parameter configurations such as watermark position, size, font, and color. Each watermark template is assigned a unique ID. This simplifies the progress of creating watermark tasks.</p>
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
     * <b>description</b> :
     * <p>  You can call this operation to create an <code>Image</code> watermark template or a <code>Text</code> watermark template. You can use static images in the PNG format or dynamic images in the GIF, APNG, and MOV formats as image watermarks.</p>
     * <ul>
     * <li>After you call this operation to create a watermark template, you must call the <a href="~~AddTranscodeTemplateGroup~~">AddTranscodeTemplateGroup</a> or <a href="~~UpdateTranscodeTemplateGroup~~">UpdateTranscodeTemplateGroup</a> operation to associate the watermark template with a transcoding template group. This way, you can add watermarks to videos during transcoding.</li>
     * <li>For more information, see <a href="https://help.aliyun.com/document_detail/99369.html">Video watermarks</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an image or text watermark. ApsaraVideo VOD allows you to create watermark templates to reuse your parameter configurations such as watermark position, size, font, and color. Each watermark template is assigned a unique ID. This simplifies the progress of creating watermark tasks.</p>
     * 
     * @param request AddWatermarkRequest
     * @return AddWatermarkResponse
     */
    public AddWatermarkResponse addWatermark(AddWatermarkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addWatermarkWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can grant a RAM user or RAM role permissions to access up to 10 applications.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Grants a RAM user or RAM role permissions to access ApsaraVideo VOD applications.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>You can grant a RAM user or RAM role permissions to access up to 10 applications.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Grants a RAM user or RAM role permissions to access ApsaraVideo VOD applications.</p>
     * 
     * @param request AttachAppPolicyToIdentityRequest
     * @return AttachAppPolicyToIdentityResponse
     */
    public AttachAppPolicyToIdentityResponse attachAppPolicyToIdentity(AttachAppPolicyToIdentityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.attachAppPolicyToIdentityWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This operation is available only in the <strong>China (Shanghai)</strong> region.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Configures one or more domain names for CDN.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>This operation is available only in the <strong>China (Shanghai)</strong> region.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Configures one or more domain names for CDN.</p>
     * 
     * @param request BatchSetVodDomainConfigsRequest
     * @return BatchSetVodDomainConfigsResponse
     */
    public BatchSetVodDomainConfigsResponse batchSetVodDomainConfigs(BatchSetVodDomainConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchSetVodDomainConfigsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  This operation is available only in the <strong>China (Shanghai)</strong> region.</p>
     * <ul>
     * <li>If the domain name that you want to enable is invalid or your Alibaba Cloud account has overdue payments, you cannot call this operation to enable the domain name.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Enables accelerated domain names that are in the disabled state.</p>
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
     * <b>description</b> :
     * <p>  This operation is available only in the <strong>China (Shanghai)</strong> region.</p>
     * <ul>
     * <li>If the domain name that you want to enable is invalid or your Alibaba Cloud account has overdue payments, you cannot call this operation to enable the domain name.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Enables accelerated domain names that are in the disabled state.</p>
     * 
     * @param request BatchStartVodDomainRequest
     * @return BatchStartVodDomainResponse
     */
    public BatchStartVodDomainResponse batchStartVodDomain(BatchStartVodDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchStartVodDomainWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  This operation is available only in the <strong>China (Shanghai)</strong> region.</p>
     * <ul>
     * <li>After you disable an accelerated domain name, the information about the domain name is retained. The system automatically reroutes all the requests that are destined for the domain name to the origin server.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Disables accelerated domain names.</p>
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
     * <b>description</b> :
     * <p>  This operation is available only in the <strong>China (Shanghai)</strong> region.</p>
     * <ul>
     * <li>After you disable an accelerated domain name, the information about the domain name is retained. The system automatically reroutes all the requests that are destined for the domain name to the origin server.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Disables accelerated domain names.</p>
     * 
     * @param request BatchStopVodDomainRequest
     * @return BatchStopVodDomainResponse
     */
    public BatchStopVodDomainResponse batchStopVodDomain(BatchStopVodDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchStopVodDomainWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can cancel only URL-based upload jobs in the <strong>Pending</strong> state. You can query the status of a URL-based upload job by calling the <a href="https://help.aliyun.com/document_detail/106830.html">GetURLUploadInfos</a> operation.</p>
     * <ul>
     * <li>You cannot cancel an upload job that already starts.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Cancels URL-based upload jobs in the queue.</p>
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
     * <b>description</b> :
     * <p>  You can cancel only URL-based upload jobs in the <strong>Pending</strong> state. You can query the status of a URL-based upload job by calling the <a href="https://help.aliyun.com/document_detail/106830.html">GetURLUploadInfos</a> operation.</p>
     * <ul>
     * <li>You cannot cancel an upload job that already starts.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Cancels URL-based upload jobs in the queue.</p>
     * 
     * @param request CancelUrlUploadJobsRequest
     * @return CancelUrlUploadJobsResponse
     */
    public CancelUrlUploadJobsResponse cancelUrlUploadJobs(CancelUrlUploadJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelUrlUploadJobsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can create up to 10 applications within an Alibaba Cloud account. For more information, see <a href="https://help.aliyun.com/document_detail/113600.html">Multi-application service</a>.</p>
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limits on API operations in ApsaraVideo VOD</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an application.</p>
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
     * <b>description</b> :
     * <p>You can create up to 10 applications within an Alibaba Cloud account. For more information, see <a href="https://help.aliyun.com/document_detail/113600.html">Multi-application service</a>.</p>
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limits on API operations in ApsaraVideo VOD</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an application.</p>
     * 
     * @param request CreateAppInfoRequest
     * @return CreateAppInfoResponse
     */
    public CreateAppInfoResponse createAppInfo(CreateAppInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAppInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Performs manual review on media files, such as audio and video files.</p>
     * 
     * @param request CreateAuditRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAuditResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Performs manual review on media files, such as audio and video files.</p>
     * 
     * @param request CreateAuditRequest
     * @return CreateAuditResponse
     */
    public CreateAuditResponse createAudit(CreateAuditRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAuditWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  <strong>Make sure that you understand the billing method and price of ApsaraVideo VOD before you call this operation. You are charged storage fees after you upload media files to ApsaraVideo VOD. For more information, see <a href="~~188308#section_e97_xrp_mzz~~">Billing of media asset storage</a>. If you have activated the acceleration service, you are charged acceleration fees when you upload media files to ApsaraVideo VOD. For more information, see <a href="~~188310#section_sta_zm2_tsv~~">Billing of acceleration traffic</a>.</strong></p>
     * <ul>
     * <li>You must obtain a URL and a credential before you upload an image to ApsaraVideo VOD. ApsaraVideo VOD provides multiple upload methods. You can upload auxiliary media assets by using SDKs for upload from servers, SDKs for upload from clients, URLs of auxiliary media assets, Object Storage Service (OSS) API, or OSS SDKs. Each upload method has different requirements for obtaining upload URLs and credentials. For more information, see the &quot;Usage notes&quot; section of the <a href="https://help.aliyun.com/document_detail/55397.html">Upload URLs and credentials</a> topic.</li>
     * <li>If the upload credential expires, you can call this operation to obtain a new upload URL and credential. The default validity period of an upload credential is 3,000 seconds.</li>
     * <li>You can configure a callback to receive an <a href="https://help.aliyun.com/document_detail/103250.html">AttachedMediaUploadComplete</a> event notification to determine whether the upload is successful.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Obtains a URL and a credential for uploading an auxiliary media asset, such as a watermark, subtitle, or material.</p>
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
     * <b>description</b> :
     * <p>  <strong>Make sure that you understand the billing method and price of ApsaraVideo VOD before you call this operation. You are charged storage fees after you upload media files to ApsaraVideo VOD. For more information, see <a href="~~188308#section_e97_xrp_mzz~~">Billing of media asset storage</a>. If you have activated the acceleration service, you are charged acceleration fees when you upload media files to ApsaraVideo VOD. For more information, see <a href="~~188310#section_sta_zm2_tsv~~">Billing of acceleration traffic</a>.</strong></p>
     * <ul>
     * <li>You must obtain a URL and a credential before you upload an image to ApsaraVideo VOD. ApsaraVideo VOD provides multiple upload methods. You can upload auxiliary media assets by using SDKs for upload from servers, SDKs for upload from clients, URLs of auxiliary media assets, Object Storage Service (OSS) API, or OSS SDKs. Each upload method has different requirements for obtaining upload URLs and credentials. For more information, see the &quot;Usage notes&quot; section of the <a href="https://help.aliyun.com/document_detail/55397.html">Upload URLs and credentials</a> topic.</li>
     * <li>If the upload credential expires, you can call this operation to obtain a new upload URL and credential. The default validity period of an upload credential is 3,000 seconds.</li>
     * <li>You can configure a callback to receive an <a href="https://help.aliyun.com/document_detail/103250.html">AttachedMediaUploadComplete</a> event notification to determine whether the upload is successful.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Obtains a URL and a credential for uploading an auxiliary media asset, such as a watermark, subtitle, or material.</p>
     * 
     * @param request CreateUploadAttachedMediaRequest
     * @return CreateUploadAttachedMediaResponse
     */
    public CreateUploadAttachedMediaResponse createUploadAttachedMedia(CreateUploadAttachedMediaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createUploadAttachedMediaWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  <strong>Make sure that you understand the billing method and price of ApsaraVideo VOD before you call this operation. You are charged storage fees after you upload media files to ApsaraVideo VOD. For more information, see <a href="~~188308#section_e97_xrp_mzz~~">Billing of media asset storage</a>. If you have activated the acceleration service, you are charged acceleration fees when you upload media files to ApsaraVideo VOD. For more information, see <a href="~~188310#section_sta_zm2_tsv~~">Billing of acceleration traffic</a>.</strong></p>
     * <ul>
     * <li>You must obtain a URL and a credential before you upload an image to ApsaraVideo VOD. ApsaraVideo VOD provides multiple upload methods. You can upload files by using server upload SDKs, client upload SDKs, URLs, Object Storage Service (OSS) API, or OSS SDKs. Each upload method has different requirements for obtaining upload URLs and credentials. For more information, see the &quot;Usage notes&quot; section of the <a href="https://help.aliyun.com/document_detail/55397.html">Upload URLs and credentials</a> topic.</li>
     * <li>You cannot refresh the upload URL or credential when you upload images. If the image upload credential expires, you can call this operation to obtain a new upload URL and credential. By default, the validity period of an image upload credential is 3,000 seconds.</li>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/98467.html">CreateUploadAttachedMedia</a> operation to upload image watermarks.</li>
     * <li>You can configure a callback for <a href="https://help.aliyun.com/document_detail/91968.html">ImageUploadComplete</a> to receive notifications about the image upload status.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries a URL and a credential for uploading an image.</p>
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
     * <b>description</b> :
     * <p>  <strong>Make sure that you understand the billing method and price of ApsaraVideo VOD before you call this operation. You are charged storage fees after you upload media files to ApsaraVideo VOD. For more information, see <a href="~~188308#section_e97_xrp_mzz~~">Billing of media asset storage</a>. If you have activated the acceleration service, you are charged acceleration fees when you upload media files to ApsaraVideo VOD. For more information, see <a href="~~188310#section_sta_zm2_tsv~~">Billing of acceleration traffic</a>.</strong></p>
     * <ul>
     * <li>You must obtain a URL and a credential before you upload an image to ApsaraVideo VOD. ApsaraVideo VOD provides multiple upload methods. You can upload files by using server upload SDKs, client upload SDKs, URLs, Object Storage Service (OSS) API, or OSS SDKs. Each upload method has different requirements for obtaining upload URLs and credentials. For more information, see the &quot;Usage notes&quot; section of the <a href="https://help.aliyun.com/document_detail/55397.html">Upload URLs and credentials</a> topic.</li>
     * <li>You cannot refresh the upload URL or credential when you upload images. If the image upload credential expires, you can call this operation to obtain a new upload URL and credential. By default, the validity period of an image upload credential is 3,000 seconds.</li>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/98467.html">CreateUploadAttachedMedia</a> operation to upload image watermarks.</li>
     * <li>You can configure a callback for <a href="https://help.aliyun.com/document_detail/91968.html">ImageUploadComplete</a> to receive notifications about the image upload status.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries a URL and a credential for uploading an image.</p>
     * 
     * @param request CreateUploadImageRequest
     * @return CreateUploadImageResponse
     */
    public CreateUploadImageResponse createUploadImage(CreateUploadImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createUploadImageWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  <strong>Make sure that you understand the billing method and prices of ApsaraVideo VOD before you call this operation. You are charged storage fees after you upload media files to ApsaraVideo VOD. For more information, see <a href="~~188308#section_e97_xrp_mzz~~">Billing of media asset storage</a>. If you have activated the acceleration service, you are charged acceleration fees when you upload media files to ApsaraVideo VOD. For more information, see <a href="~~188310#section_sta_zm2_tsv~~">Billing of acceleration traffic</a>.</strong></p>
     * <ul>
     * <li>You can call this operation to obtain upload URLs and credentials for video and audio files. For more information, see <a href="https://help.aliyun.com/document_detail/55397.html">Upload URLs and credentials</a>.</li>
     * <li>You can call this operation only to obtain the upload URLs and credentials for media files and create media assets in ApsaraVideo VOD. You cannot call this operation to upload media files. For more information about how to upload media files by calling API operations, see <a href="https://help.aliyun.com/document_detail/476208.html">Upload media files by calling API operations</a>.</li>
     * <li>If the upload credential expires, call the <a href="https://help.aliyun.com/document_detail/55408.html">RefreshUploadVideo</a> operation to obtain a new upload credential. The default validity period of an upload credential is 3,000 seconds.</li>
     * <li>You can configure a callback to receive an <a href="https://help.aliyun.com/document_detail/55396.html">event notification</a> when an audio or video file is uploaded. Alternatively, after you upload an audio or video file, you can call the <a href="https://help.aliyun.com/document_detail/59624.html">GetMezzanineInfo</a> operation to determine whether the upload is successful based on the value of the Status response parameter.</li>
     * <li>The VideoId parameter that is returned after you call this operation can be used for media processing or lifecycle management of media assets.</li>
     * <li>You must obtain a URL and a credential before you upload a media file to ApsaraVideo VOD. ApsaraVideo VOD supports multiple upload methods. Each method has different requirements on upload URLs and credentials. For more information, see <a href="https://help.aliyun.com/document_detail/55397.html">Upload URLs and credentials</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Obtains the upload URLs and credentials for media files and creates media assets in ApsaraVideo VOD.</p>
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
     * <b>description</b> :
     * <p>  <strong>Make sure that you understand the billing method and prices of ApsaraVideo VOD before you call this operation. You are charged storage fees after you upload media files to ApsaraVideo VOD. For more information, see <a href="~~188308#section_e97_xrp_mzz~~">Billing of media asset storage</a>. If you have activated the acceleration service, you are charged acceleration fees when you upload media files to ApsaraVideo VOD. For more information, see <a href="~~188310#section_sta_zm2_tsv~~">Billing of acceleration traffic</a>.</strong></p>
     * <ul>
     * <li>You can call this operation to obtain upload URLs and credentials for video and audio files. For more information, see <a href="https://help.aliyun.com/document_detail/55397.html">Upload URLs and credentials</a>.</li>
     * <li>You can call this operation only to obtain the upload URLs and credentials for media files and create media assets in ApsaraVideo VOD. You cannot call this operation to upload media files. For more information about how to upload media files by calling API operations, see <a href="https://help.aliyun.com/document_detail/476208.html">Upload media files by calling API operations</a>.</li>
     * <li>If the upload credential expires, call the <a href="https://help.aliyun.com/document_detail/55408.html">RefreshUploadVideo</a> operation to obtain a new upload credential. The default validity period of an upload credential is 3,000 seconds.</li>
     * <li>You can configure a callback to receive an <a href="https://help.aliyun.com/document_detail/55396.html">event notification</a> when an audio or video file is uploaded. Alternatively, after you upload an audio or video file, you can call the <a href="https://help.aliyun.com/document_detail/59624.html">GetMezzanineInfo</a> operation to determine whether the upload is successful based on the value of the Status response parameter.</li>
     * <li>The VideoId parameter that is returned after you call this operation can be used for media processing or lifecycle management of media assets.</li>
     * <li>You must obtain a URL and a credential before you upload a media file to ApsaraVideo VOD. ApsaraVideo VOD supports multiple upload methods. Each method has different requirements on upload URLs and credentials. For more information, see <a href="https://help.aliyun.com/document_detail/55397.html">Upload URLs and credentials</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Obtains the upload URLs and credentials for media files and creates media assets in ApsaraVideo VOD.</p>
     * 
     * @param request CreateUploadVideoRequest
     * @return CreateUploadVideoResponse
     */
    public CreateUploadVideoResponse createUploadVideo(CreateUploadVideoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createUploadVideoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Decrypts the ciphertext specified by CiphertextBlob in the Key Management Service (KMS) data key.</p>
     * 
     * @param request DecryptKMSDataKeyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DecryptKMSDataKeyResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Decrypts the ciphertext specified by CiphertextBlob in the Key Management Service (KMS) data key.</p>
     * 
     * @param request DecryptKMSDataKeyRequest
     * @return DecryptKMSDataKeyResponse
     */
    public DecryptKMSDataKeyResponse decryptKMSDataKey(DecryptKMSDataKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.decryptKMSDataKeyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Regions that support this operation: <strong>China (Beijing)</strong> and <strong>China (Shanghai)</strong>.</p>
     * <ul>
     * <li>This operation deletes only information about images that are submitted for AI processing. The image files are not deleted.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes the information about one or more images that are submitted for AI processing.</p>
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
     * <b>description</b> :
     * <p>  Regions that support this operation: <strong>China (Beijing)</strong> and <strong>China (Shanghai)</strong>.</p>
     * <ul>
     * <li>This operation deletes only information about images that are submitted for AI processing. The image files are not deleted.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes the information about one or more images that are submitted for AI processing.</p>
     * 
     * @param request DeleteAIImageInfosRequest
     * @return DeleteAIImageInfosResponse
     */
    public DeleteAIImageInfosResponse deleteAIImageInfos(DeleteAIImageInfosRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAIImageInfosWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Regions that support this operation: <strong>China (Beijing)</strong>, <strong>China (Shanghai)</strong>, and <strong>Singapore</strong>.</p>
     * <ul>
     * <li>You cannot delete an AI template that is set as the default template.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes an AI template.</p>
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
     * <b>description</b> :
     * <p>  Regions that support this operation: <strong>China (Beijing)</strong>, <strong>China (Shanghai)</strong>, and <strong>Singapore</strong>.</p>
     * <ul>
     * <li>You cannot delete an AI template that is set as the default template.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes an AI template.</p>
     * 
     * @param request DeleteAITemplateRequest
     * @return DeleteAITemplateResponse
     */
    public DeleteAITemplateResponse deleteAITemplate(DeleteAITemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAITemplateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Application with resources can not be deleted.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an application.</p>
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
     * <b>description</b> :
     * <p>Application with resources can not be deleted.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an application.</p>
     * 
     * @param request DeleteAppInfoRequest
     * @return DeleteAppInfoResponse
     */
    public DeleteAppInfoResponse deleteAppInfo(DeleteAppInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAppInfoWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  This operation physically deletes auxiliary media assets. You cannot recover the auxiliary media assets that you deleted. Exercise caution when you call this operation.</p>
     * <ul>
     * <li>You can delete a maximum of 20 auxiliary media assets in one request.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes auxiliary media assets.</p>
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
     * <b>description</b> :
     * <p>  This operation physically deletes auxiliary media assets. You cannot recover the auxiliary media assets that you deleted. Exercise caution when you call this operation.</p>
     * <ul>
     * <li>You can delete a maximum of 20 auxiliary media assets in one request.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes auxiliary media assets.</p>
     * 
     * @param request DeleteAttachedMediaRequest
     * @return DeleteAttachedMediaResponse
     */
    public DeleteAttachedMediaResponse deleteAttachedMedia(DeleteAttachedMediaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAttachedMediaWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  <strong>After you call this operation to delete a category, all subcategories including level 2 and level 3 categories are deleted at the same time. Exercise caution when you call this operation.</strong></p>
     * <ul>
     * <li>If you have classified specific media resources to a category, the category names labeled on these media resources are automatically deleted when you delete the category.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a category and its subcategories.</p>
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
     * <b>description</b> :
     * <p>  <strong>After you call this operation to delete a category, all subcategories including level 2 and level 3 categories are deleted at the same time. Exercise caution when you call this operation.</strong></p>
     * <ul>
     * <li>If you have classified specific media resources to a category, the category names labeled on these media resources are automatically deleted when you delete the category.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a category and its subcategories.</p>
     * 
     * @param request DeleteCategoryRequest
     * @return DeleteCategoryResponse
     */
    public DeleteCategoryResponse deleteCategory(DeleteCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCategoryWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This operation deletes only the information about animated stickers, but not the animated stickers themselves.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes the information about animated stickers.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>This operation deletes only the information about animated stickers, but not the animated stickers themselves.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes the information about animated stickers.</p>
     * 
     * @param request DeleteDynamicImageRequest
     * @return DeleteDynamicImageResponse
     */
    public DeleteDynamicImageResponse deleteDynamicImage(DeleteDynamicImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDynamicImageWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to delete multiple online editing projects at a time.</p>
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 20 times per second per account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limits on API operations in ApsaraVideo VOD</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes online editing projects.</p>
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
     * <b>description</b> :
     * <p>You can call this operation to delete multiple online editing projects at a time.</p>
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 20 times per second per account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limits on API operations in ApsaraVideo VOD</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes online editing projects.</p>
     * 
     * @param request DeleteEditingProjectRequest
     * @return DeleteEditingProjectResponse
     */
    public DeleteEditingProjectResponse deleteEditingProject(DeleteEditingProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteEditingProjectWithOptions(request, runtime);
    }

    /**
     * @param request DeleteEditingProjectMaterialsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteEditingProjectMaterialsResponse
     */
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

    /**
     * @param request DeleteEditingProjectMaterialsRequest
     * @return DeleteEditingProjectMaterialsResponse
     */
    public DeleteEditingProjectMaterialsResponse deleteEditingProjectMaterials(DeleteEditingProjectMaterialsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteEditingProjectMaterialsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  After you call this operation to delete an image, the source file is permanently deleted and cannot be recovered. If some images are cached on Alibaba Cloud CDN points of presence (POPs), the image URLs do not immediately become invalid.</p>
     * <ul>
     * <li>You can call this operation to delete uploaded images and video snapshots.</li>
     * </ul>
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limits on API operations in ApsaraVideo VOD</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes uploaded images and video snapshots that are automatically captured.</p>
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
     * <b>description</b> :
     * <p>  After you call this operation to delete an image, the source file is permanently deleted and cannot be recovered. If some images are cached on Alibaba Cloud CDN points of presence (POPs), the image URLs do not immediately become invalid.</p>
     * <ul>
     * <li>You can call this operation to delete uploaded images and video snapshots.</li>
     * </ul>
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limits on API operations in ApsaraVideo VOD</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes uploaded images and video snapshots that are automatically captured.</p>
     * 
     * @param request DeleteImageRequest
     * @return DeleteImageResponse
     */
    public DeleteImageResponse deleteImage(DeleteImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteImageWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/55627.html">Overview</a>.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes the callback method, callback URL, and event type of an event notification.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/55627.html">Overview</a>.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes the callback method, callback URL, and event type of an event notification.</p>
     * 
     * @param request DeleteMessageCallbackRequest
     * @return DeleteMessageCallbackResponse
     */
    public DeleteMessageCallbackResponse deleteMessageCallback(DeleteMessageCallbackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteMessageCallbackWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>All media processing operations in ApsaraVideo VOD, such as transcoding, snapshot capture, and content moderation, are performed based on source files. If you delete the source files, you cannot perform media processing operations. Exercise caution when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes one or more source files at a time.</p>
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
     * <b>description</b> :
     * <p>All media processing operations in ApsaraVideo VOD, such as transcoding, snapshot capture, and content moderation, are performed based on source files. If you delete the source files, you cannot perform media processing operations. Exercise caution when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes one or more source files at a time.</p>
     * 
     * @param request DeleteMezzaninesRequest
     * @return DeleteMezzaninesResponse
     */
    public DeleteMezzaninesResponse deleteMezzanines(DeleteMezzaninesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteMezzaninesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  During multipart upload, useless parts may be retained if the upload fails. These useless parts are automatically deleted after 7 days. You can call this operation to delete the generated parts after the upload is successful or fails.</p>
     * <ul>
     * <li>This operation does not delete the source file or transcoded file, but deletes only the parts generated during the upload.</li>
     * <li>If you call the <a href="https://help.aliyun.com/document_detail/52837.html">DeleteVideo</a> operation, the entire video file is deleted, including the generated parts.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes the parts generated during an upload.</p>
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
     * <b>description</b> :
     * <p>  During multipart upload, useless parts may be retained if the upload fails. These useless parts are automatically deleted after 7 days. You can call this operation to delete the generated parts after the upload is successful or fails.</p>
     * <ul>
     * <li>This operation does not delete the source file or transcoded file, but deletes only the parts generated during the upload.</li>
     * <li>If you call the <a href="https://help.aliyun.com/document_detail/52837.html">DeleteVideo</a> operation, the entire video file is deleted, including the generated parts.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes the parts generated during an upload.</p>
     * 
     * @param request DeleteMultipartUploadRequest
     * @return DeleteMultipartUploadResponse
     */
    public DeleteMultipartUploadResponse deleteMultipartUpload(DeleteMultipartUploadRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteMultipartUploadWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes one or more video or audio streams and their storage files at a time.</p>
     * 
     * @param request DeleteStreamRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteStreamResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Deletes one or more video or audio streams and their storage files at a time.</p>
     * 
     * @param request DeleteStreamRequest
     * @return DeleteStreamResponse
     */
    public DeleteStreamResponse deleteStream(DeleteStreamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteStreamWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You cannot call this operation to delete the default transcoding template. You can delete the transcoding template when it is no longer specified as the default one.</p>
     * <ul>
     * <li>For security purposes, you cannot add, modify, or delete transcoding templates in a transcoding template group that is locked. To check whether a transcoding template group is locked, call the <a href="~~GetTranscodeTemplateGroup~~">GetTranscodeTemplateGroup</a> operation and obtain the Locked parameter from the response. To modify transcoding templates within a locked transcoding template group, you must call the <a href="~~UpdateTranscodeTemplateGroup~~">UpdateTranscodeTemplateGroup</a> operation to unlock the transcoding template group first.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes one or more transcoding templates from a transcoding template group or forcibly deletes a transcoding template group.</p>
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
     * <b>description</b> :
     * <p>  You cannot call this operation to delete the default transcoding template. You can delete the transcoding template when it is no longer specified as the default one.</p>
     * <ul>
     * <li>For security purposes, you cannot add, modify, or delete transcoding templates in a transcoding template group that is locked. To check whether a transcoding template group is locked, call the <a href="~~GetTranscodeTemplateGroup~~">GetTranscodeTemplateGroup</a> operation and obtain the Locked parameter from the response. To modify transcoding templates within a locked transcoding template group, you must call the <a href="~~UpdateTranscodeTemplateGroup~~">UpdateTranscodeTemplateGroup</a> operation to unlock the transcoding template group first.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes one or more transcoding templates from a transcoding template group or forcibly deletes a transcoding template group.</p>
     * 
     * @param request DeleteTranscodeTemplateGroupRequest
     * @return DeleteTranscodeTemplateGroupResponse
     */
    public DeleteTranscodeTemplateGroupResponse deleteTranscodeTemplateGroup(DeleteTranscodeTemplateGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteTranscodeTemplateGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  This operation physically deletes videos. Deleted videos cannot be recovered. Exercise caution when you call this operation.</p>
     * <ul>
     * <li>You can call this operation to delete multiple videos at a time.</li>
     * <li>When you delete a video, its source file, transcoded stream file, and thumbnail screenshot are also deleted. However, the Alibaba Cloud Content Delivery Network (CDN) cache is not refreshed simultaneously. You can use the refresh feature in the ApsaraVideo VOD console to clear garbage data on CDN nodes. For more information, see <a href="https://help.aliyun.com/document_detail/86098.html">Refresh and prefetch</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes one or more videos at a time, including their mezzanine files, transcoded stream files, and thumbnail snapshots.</p>
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
     * <b>description</b> :
     * <p>  This operation physically deletes videos. Deleted videos cannot be recovered. Exercise caution when you call this operation.</p>
     * <ul>
     * <li>You can call this operation to delete multiple videos at a time.</li>
     * <li>When you delete a video, its source file, transcoded stream file, and thumbnail screenshot are also deleted. However, the Alibaba Cloud Content Delivery Network (CDN) cache is not refreshed simultaneously. You can use the refresh feature in the ApsaraVideo VOD console to clear garbage data on CDN nodes. For more information, see <a href="https://help.aliyun.com/document_detail/86098.html">Refresh and prefetch</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes one or more videos at a time, including their mezzanine files, transcoded stream files, and thumbnail snapshots.</p>
     * 
     * @param request DeleteVideoRequest
     * @return DeleteVideoResponse
     */
    public DeleteVideoResponse deleteVideo(DeleteVideoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteVideoWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>This operation is available only in the <strong>China (Shanghai)</strong> region.</li>
     * <li>After a domain name for CDN is removed from ApsaraVideo VOD, the domain name becomes unavailable. Proceed with caution. We recommend that you restore the A record at your DNS service provider before you remove the domain name for CDN.</li>
     * <li>After you call this operation to remove a domain name for CDN from ApsaraVideo VOD, all records that are related to the domain name are deleted. If you only want to disable a domain name for CDN, call the <a href="https://help.aliyun.com/document_detail/120208.html">BatchStopVodDomain</a> operation.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Removes a domain name for CDN from ApsaraVideo VOD.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>This operation is available only in the <strong>China (Shanghai)</strong> region.</li>
     * <li>After a domain name for CDN is removed from ApsaraVideo VOD, the domain name becomes unavailable. Proceed with caution. We recommend that you restore the A record at your DNS service provider before you remove the domain name for CDN.</li>
     * <li>After you call this operation to remove a domain name for CDN from ApsaraVideo VOD, all records that are related to the domain name are deleted. If you only want to disable a domain name for CDN, call the <a href="https://help.aliyun.com/document_detail/120208.html">BatchStopVodDomain</a> operation.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Removes a domain name for CDN from ApsaraVideo VOD.</p>
     * 
     * @param request DeleteVodDomainRequest
     * @return DeleteVodDomainResponse
     */
    public DeleteVodDomainResponse deleteVodDomain(DeleteVodDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteVodDomainWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>This operation is available only in the <strong>China (Shanghai)</strong> region.</li>
     * <li>After the configurations of a domain name for CDN are deleted, the domain name becomes unavailable. We recommend that you restore the A record at your DNS service provider before you delete the configurations of the domain name for CDN.</li>
     * <li>After you call this operation to delete the configurations of a domain name for CDN, all records that are related to the domain name are deleted. If you only want to disable a domain name for CDN, call the <a href="https://help.aliyun.com/document_detail/120208.html">BatchStopVodDomain</a> operation.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes the configurations of a domain name for CDN.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>This operation is available only in the <strong>China (Shanghai)</strong> region.</li>
     * <li>After the configurations of a domain name for CDN are deleted, the domain name becomes unavailable. We recommend that you restore the A record at your DNS service provider before you delete the configurations of the domain name for CDN.</li>
     * <li>After you call this operation to delete the configurations of a domain name for CDN, all records that are related to the domain name are deleted. If you only want to disable a domain name for CDN, call the <a href="https://help.aliyun.com/document_detail/120208.html">BatchStopVodDomain</a> operation.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes the configurations of a domain name for CDN.</p>
     * 
     * @param request DeleteVodSpecificConfigRequest
     * @return DeleteVodSpecificConfigResponse
     */
    public DeleteVodSpecificConfigResponse deleteVodSpecificConfig(DeleteVodSpecificConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteVodSpecificConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a snapshot template.</p>
     * 
     * @param request DeleteVodTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteVodTemplateResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Deletes a snapshot template.</p>
     * 
     * @param request DeleteVodTemplateRequest
     * @return DeleteVodTemplateResponse
     */
    public DeleteVodTemplateResponse deleteVodTemplate(DeleteVodTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteVodTemplateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  <strong>After you delete an image watermark template, the source watermark file is physically deleted and cannot be restored. Exercise caution when you call this operation.</strong></p>
     * <ul>
     * <li>You cannot delete the default watermark template. To delete a default watermark template, call the <a href="~~SetDefaultWatermark~~">SetDefaultWatermark</a> operation to set another watermark template as the default one.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes an image watermark or text watermark template.</p>
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
     * <b>description</b> :
     * <p>  <strong>After you delete an image watermark template, the source watermark file is physically deleted and cannot be restored. Exercise caution when you call this operation.</strong></p>
     * <ul>
     * <li>You cannot delete the default watermark template. To delete a default watermark template, call the <a href="~~SetDefaultWatermark~~">SetDefaultWatermark</a> operation to set another watermark template as the default one.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes an image watermark or text watermark template.</p>
     * 
     * @param request DeleteWatermarkRequest
     * @return DeleteWatermarkResponse
     */
    public DeleteWatermarkResponse deleteWatermark(DeleteWatermarkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteWatermarkWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>This operation is available only in the <strong>China (Shanghai)</strong> region.</li>
     * <li>You can query playback statistics on top 1,000 videos at most on a specified day. By default, top videos are sorted in descending order based on video views.</li>
     * <li>You can call this operation to query only playback statistics collected on videos that are played by using ApsaraVideo Player SDKs.</li>
     * <li>Playback statistics for the previous day are generated at 09:00 on the current day, in UTC+8.</li>
     * <li>You can query data that is generated since January 1, 2018. The maximum time range to query is 180 days.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries daily playback statistics on top videos, including video views, unique visitors, and total playback duration.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>This operation is available only in the <strong>China (Shanghai)</strong> region.</li>
     * <li>You can query playback statistics on top 1,000 videos at most on a specified day. By default, top videos are sorted in descending order based on video views.</li>
     * <li>You can call this operation to query only playback statistics collected on videos that are played by using ApsaraVideo Player SDKs.</li>
     * <li>Playback statistics for the previous day are generated at 09:00 on the current day, in UTC+8.</li>
     * <li>You can query data that is generated since January 1, 2018. The maximum time range to query is 180 days.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries daily playback statistics on top videos, including video views, unique visitors, and total playback duration.</p>
     * 
     * @param request DescribePlayTopVideosRequest
     * @return DescribePlayTopVideosResponse
     */
    public DescribePlayTopVideosResponse describePlayTopVideos(DescribePlayTopVideosRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePlayTopVideosWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>This operation is available only in the <strong>China (Shanghai)</strong> region.</li>
     * <li>You can call this operation to query only playback statistics collected on videos that are played by using ApsaraVideo Player SDKs.</li>
     * <li>Playback statistics for the previous day are generated at 09:00 on the current day, in UTC+8.</li>
     * <li>You can query data that is generated since January 1, 2018. The maximum time range to query is 180 days.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the statistics on average playback each day in a specified time range.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>This operation is available only in the <strong>China (Shanghai)</strong> region.</li>
     * <li>You can call this operation to query only playback statistics collected on videos that are played by using ApsaraVideo Player SDKs.</li>
     * <li>Playback statistics for the previous day are generated at 09:00 on the current day, in UTC+8.</li>
     * <li>You can query data that is generated since January 1, 2018. The maximum time range to query is 180 days.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the statistics on average playback each day in a specified time range.</p>
     * 
     * @param request DescribePlayUserAvgRequest
     * @return DescribePlayUserAvgResponse
     */
    public DescribePlayUserAvgResponse describePlayUserAvg(DescribePlayUserAvgRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePlayUserAvgWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  This operation is available only in the <strong>China (Shanghai)</strong> region.</p>
     * <ul>
     * <li>You can call this operation to query only playback statistics collected on videos that are played by using ApsaraVideo Player SDKs.</li>
     * <li>Playback statistics for the current day are generated at 09:00 (UTC+8) on the next day.</li>
     * <li>You can query data that is generated since January 1, 2018. The maximum time range to query is 180 days.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the daily playback statistics in a specified time range.</p>
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
     * <b>description</b> :
     * <p>  This operation is available only in the <strong>China (Shanghai)</strong> region.</p>
     * <ul>
     * <li>You can call this operation to query only playback statistics collected on videos that are played by using ApsaraVideo Player SDKs.</li>
     * <li>Playback statistics for the current day are generated at 09:00 (UTC+8) on the next day.</li>
     * <li>You can query data that is generated since January 1, 2018. The maximum time range to query is 180 days.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the daily playback statistics in a specified time range.</p>
     * 
     * @param request DescribePlayUserTotalRequest
     * @return DescribePlayUserTotalResponse
     */
    public DescribePlayUserTotalResponse describePlayUserTotal(DescribePlayUserTotalRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePlayUserTotalWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  This operation is available only in the <strong>China (Shanghai)</strong> region.</p>
     * <ul>
     * <li>You can call this operation to query only playback statistics collected on videos that are played by using ApsaraVideo Player SDKs.</li>
     * <li>Playback statistics for the current day are generated at 09:00 (UTC+8) on the next day.</li>
     * <li>You can query only data in the last 730 days. The maximum time range to query is 180 days.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries daily playback statistics on a video in the specified time range.</p>
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
     * <b>description</b> :
     * <p>  This operation is available only in the <strong>China (Shanghai)</strong> region.</p>
     * <ul>
     * <li>You can call this operation to query only playback statistics collected on videos that are played by using ApsaraVideo Player SDKs.</li>
     * <li>Playback statistics for the current day are generated at 09:00 (UTC+8) on the next day.</li>
     * <li>You can query only data in the last 730 days. The maximum time range to query is 180 days.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries daily playback statistics on a video in the specified time range.</p>
     * 
     * @param request DescribePlayVideoStatisRequest
     * @return DescribePlayVideoStatisResponse
     */
    public DescribePlayVideoStatisResponse describePlayVideoStatis(DescribePlayVideoStatisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePlayVideoStatisWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>This operation is available only in the <strong>China (Shanghai)</strong> region.</li>
     * <li>If the time range to query is less than or equal to seven days, the system returns the statistics collected on an hourly basis. If the time range to query is greater than seven days, the system returns the statistics collected on a daily basis. The maximum time range that you can specify to query is 31 days.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the statistics on video AI of different types, such as automated review and media fingerprinting.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>This operation is available only in the <strong>China (Shanghai)</strong> region.</li>
     * <li>If the time range to query is less than or equal to seven days, the system returns the statistics collected on an hourly basis. If the time range to query is greater than seven days, the system returns the statistics collected on a daily basis. The maximum time range that you can specify to query is 31 days.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the statistics on video AI of different types, such as automated review and media fingerprinting.</p>
     * 
     * @param request DescribeVodAIDataRequest
     * @return DescribeVodAIDataResponse
     */
    public DescribeVodAIDataResponse describeVodAIData(DescribeVodAIDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodAIDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This operation is available only in the <strong>China (Shanghai)</strong> region.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the certificates of a specified domain name for CDN or all the domain names for CDN within your Alibaba Cloud account.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>This operation is available only in the <strong>China (Shanghai)</strong> region.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the certificates of a specified domain name for CDN or all the domain names for CDN within your Alibaba Cloud account.</p>
     * 
     * @param request DescribeVodCertificateListRequest
     * @return DescribeVodCertificateListResponse
     */
    public DescribeVodCertificateListResponse describeVodCertificateList(DescribeVodCertificateListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodCertificateListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>If you specify neither the StartTime parameter nor the EndTime parameter, the data in the last 24 hours is queried. Alternatively, you can specify both the StartTime and EndTime parameters to query data that is generated in the specified duration. You can query data for the last 90 days at most.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the bandwidth for one or more specified domain names for CDN.</p>
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
     * <b>description</b> :
     * <p>If you specify neither the StartTime parameter nor the EndTime parameter, the data in the last 24 hours is queried. Alternatively, you can specify both the StartTime and EndTime parameters to query data that is generated in the specified duration. You can query data for the last 90 days at most.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the bandwidth for one or more specified domain names for CDN.</p>
     * 
     * @param request DescribeVodDomainBpsDataRequest
     * @return DescribeVodDomainBpsDataResponse
     */
    public DescribeVodDomainBpsDataResponse describeVodDomainBpsData(DescribeVodDomainBpsDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodDomainBpsDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this API operation up to 20 times per second per account. If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range. Time granularity
     * The time granularity supported by Interval, the maximum time period within which historical data is available, and the data delay vary based on the time range to query, as described in the following table.</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>15 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>3 to 4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>90 days</td>
     * <td>366 days</td>
     * <td>4 hours in most cases, not more than 24 hours</td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Queries the bandwidth data by protocol.</p>
     * 
     * @param request DescribeVodDomainBpsDataByLayerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVodDomainBpsDataByLayerResponse
     */
    public DescribeVodDomainBpsDataByLayerResponse describeVodDomainBpsDataByLayerWithOptions(DescribeVodDomainBpsDataByLayerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.layer)) {
            query.put("Layer", request.layer);
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
            new TeaPair("action", "DescribeVodDomainBpsDataByLayer"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVodDomainBpsDataByLayerResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this API operation up to 20 times per second per account. If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range. Time granularity
     * The time granularity supported by Interval, the maximum time period within which historical data is available, and the data delay vary based on the time range to query, as described in the following table.</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>15 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>3 to 4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>90 days</td>
     * <td>366 days</td>
     * <td>4 hours in most cases, not more than 24 hours</td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Queries the bandwidth data by protocol.</p>
     * 
     * @param request DescribeVodDomainBpsDataByLayerRequest
     * @return DescribeVodDomainBpsDataByLayerResponse
     */
    public DescribeVodDomainBpsDataByLayerResponse describeVodDomainBpsDataByLayer(DescribeVodDomainBpsDataByLayerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodDomainBpsDataByLayerWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation is available only in the <strong>China (Shanghai)</strong> region.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the certificate information about an accelerated domain name.</p>
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
     * <b>description</b> :
     * <p>This operation is available only in the <strong>China (Shanghai)</strong> region.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the certificate information about an accelerated domain name.</p>
     * 
     * @param request DescribeVodDomainCertificateInfoRequest
     * @return DescribeVodDomainCertificateInfoResponse
     */
    public DescribeVodDomainCertificateInfoResponse describeVodDomainCertificateInfo(DescribeVodDomainCertificateInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodDomainCertificateInfoWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This operation is available only in the <strong>China (Shanghai)</strong> region.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the configurations of a domain name for CDN. You can query the configurations of multiple features at a time.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>This operation is available only in the <strong>China (Shanghai)</strong> region.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the configurations of a domain name for CDN. You can query the configurations of multiple features at a time.</p>
     * 
     * @param request DescribeVodDomainConfigsRequest
     * @return DescribeVodDomainConfigsResponse
     */
    public DescribeVodDomainConfigsResponse describeVodDomainConfigs(DescribeVodDomainConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodDomainConfigsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This operation is available only in the <strong>China (Shanghai)</strong> region.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the basic information about a specified domain name for CDN.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>This operation is available only in the <strong>China (Shanghai)</strong> region.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the basic information about a specified domain name for CDN.</p>
     * 
     * @param request DescribeVodDomainDetailRequest
     * @return DescribeVodDomainDetailResponse
     */
    public DescribeVodDomainDetailResponse describeVodDomainDetail(DescribeVodDomainDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodDomainDetailWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation is supported only in the <strong>China (Shanghai)</strong> region.</p>
     * <ul>
     * <li>You can specify a maximum of 500 accelerated domain names.</li>
     * <li>If you specify neither <code>StartTime</code> nor <code>EndTime</code>, the data of the last 24 hours is queried. You can specify both <code>StartTime</code> and <code>EndTime</code> parameters to query data of a specified time range.
     * <strong>Time granularity</strong>
     * The time granularity varies with the time range specified by the <code>StartTime</code> and <code>EndTime</code> parameters. The following table describes the time period within which historical data is available and the data delay when you do not set <code>Interval</code>.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>Time range per query &#x3C; 3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>3 days ≤ Time range per query &#x3C; 31 days</td>
     * <td>186 days</td>
     * <td>3 to 4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>31 days ≤ Time span of a single query ≤ 366 days</td>
     * <td>366 days</td>
     * <td>4 hours in most cases, not more than 24 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the byte hit ratios of accelerated domain names. Byte hit ratios are measured in percentage.</p>
     * 
     * @param request DescribeVodDomainHitRateDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVodDomainHitRateDataResponse
     */
    public DescribeVodDomainHitRateDataResponse describeVodDomainHitRateDataWithOptions(DescribeVodDomainHitRateDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DescribeVodDomainHitRateData"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVodDomainHitRateDataResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation is supported only in the <strong>China (Shanghai)</strong> region.</p>
     * <ul>
     * <li>You can specify a maximum of 500 accelerated domain names.</li>
     * <li>If you specify neither <code>StartTime</code> nor <code>EndTime</code>, the data of the last 24 hours is queried. You can specify both <code>StartTime</code> and <code>EndTime</code> parameters to query data of a specified time range.
     * <strong>Time granularity</strong>
     * The time granularity varies with the time range specified by the <code>StartTime</code> and <code>EndTime</code> parameters. The following table describes the time period within which historical data is available and the data delay when you do not set <code>Interval</code>.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>Time range per query &#x3C; 3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>3 days ≤ Time range per query &#x3C; 31 days</td>
     * <td>186 days</td>
     * <td>3 to 4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>31 days ≤ Time span of a single query ≤ 366 days</td>
     * <td>366 days</td>
     * <td>4 hours in most cases, not more than 24 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the byte hit ratios of accelerated domain names. Byte hit ratios are measured in percentage.</p>
     * 
     * @param request DescribeVodDomainHitRateDataRequest
     * @return DescribeVodDomainHitRateDataResponse
     */
    public DescribeVodDomainHitRateDataResponse describeVodDomainHitRateData(DescribeVodDomainHitRateDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodDomainHitRateDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  This operation is available only in the <strong>China (Shanghai)</strong> region.</p>
     * <ul>
     * <li>For more information about the log format and latency, see <a href="https://help.aliyun.com/document_detail/86099.html">Download logs</a>.</li>
     * <li>If you specify neither StartTime nor EndTime, the log data in the previous 24 hours is queried.</li>
     * <li>You can specify both StartTime and EndTime to query the log data that is generated in the specified time range.</li>
     * </ul>
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limits on API operations</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about the CDN access logs for a domain name, including the log path.</p>
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
     * <b>description</b> :
     * <p>  This operation is available only in the <strong>China (Shanghai)</strong> region.</p>
     * <ul>
     * <li>For more information about the log format and latency, see <a href="https://help.aliyun.com/document_detail/86099.html">Download logs</a>.</li>
     * <li>If you specify neither StartTime nor EndTime, the log data in the previous 24 hours is queried.</li>
     * <li>You can specify both StartTime and EndTime to query the log data that is generated in the specified time range.</li>
     * </ul>
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limits on API operations</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about the CDN access logs for a domain name, including the log path.</p>
     * 
     * @param request DescribeVodDomainLogRequest
     * @return DescribeVodDomainLogResponse
     */
    public DescribeVodDomainLogResponse describeVodDomainLog(DescribeVodDomainLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodDomainLogWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range.
     * <strong>Time granularity</strong>
     * The time granularity varies with the time range specified by the Interval parameter. The following table describes the time period within which historical data is available and the data delay.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>3 to 4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>366 days</td>
     * <td>366 days</td>
     * <td>4 hours in most cases, not more than 24 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * <hr>
     * 
     * <b>summary</b> : 
     * <p>Queries the number of queries per second (QPS) for one or more accelerated domain names. Data is collected every 5 minutes. You can query data collected in the last 90 days.</p>
     * 
     * @param request DescribeVodDomainQpsDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVodDomainQpsDataResponse
     */
    public DescribeVodDomainQpsDataResponse describeVodDomainQpsDataWithOptions(DescribeVodDomainQpsDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DescribeVodDomainQpsData"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVodDomainQpsDataResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range.
     * <strong>Time granularity</strong>
     * The time granularity varies with the time range specified by the Interval parameter. The following table describes the time period within which historical data is available and the data delay.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>3 to 4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>366 days</td>
     * <td>366 days</td>
     * <td>4 hours in most cases, not more than 24 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * <hr>
     * 
     * <b>summary</b> : 
     * <p>Queries the number of queries per second (QPS) for one or more accelerated domain names. Data is collected every 5 minutes. You can query data collected in the last 90 days.</p>
     * 
     * @param request DescribeVodDomainQpsDataRequest
     * @return DescribeVodDomainQpsDataResponse
     */
    public DescribeVodDomainQpsDataResponse describeVodDomainQpsData(DescribeVodDomainQpsDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodDomainQpsDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation is supported only in the <strong>China (Shanghai)</strong> region.</p>
     * <ul>
     * <li>You can specify a maximum of 500 accelerated domain names.</li>
     * <li>If you specify neither <code>StartTime</code> nor <code>EndTime</code>, the data of the last 1 hour is queried. You can specify both <code>StartTime</code> and <code>EndTime</code> parameters to query data of a specified time range.
     * <strong>Time granularity</strong>
     * The time granularity varies with the time range specified by the <code>StartTime</code> and <code>EndTime</code> parameters. The following table describes the time period within which historical data is available and the data delay.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>1 minute</td>
     * <td>Time range per query ≤ 1 hour</td>
     * <td>7 days</td>
     * <td>5 minutes</td>
     * </tr>
     * <tr>
     * <td>5 minutes</td>
     * <td>1 Hour &#x3C; Time range per query ≤ 3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>3 days &#x3C; Time range per query ≤ 31 days</td>
     * <td>186 days</td>
     * <td>3 to 4 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the bandwidth data for one or more accelerated domains. The minimum time granularity is 1 minute. The minimum data latency is 5 minutes. You can query data in the last 186 days. Compared with the DescribeVodDomainBpsData operation, this operation provides a smaller time granularity, lower data latency, and allows you to query historical data within a shorter time period.</p>
     * 
     * @param request DescribeVodDomainRealTimeBpsDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVodDomainRealTimeBpsDataResponse
     */
    public DescribeVodDomainRealTimeBpsDataResponse describeVodDomainRealTimeBpsDataWithOptions(DescribeVodDomainRealTimeBpsDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVodDomainRealTimeBpsData"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVodDomainRealTimeBpsDataResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation is supported only in the <strong>China (Shanghai)</strong> region.</p>
     * <ul>
     * <li>You can specify a maximum of 500 accelerated domain names.</li>
     * <li>If you specify neither <code>StartTime</code> nor <code>EndTime</code>, the data of the last 1 hour is queried. You can specify both <code>StartTime</code> and <code>EndTime</code> parameters to query data of a specified time range.
     * <strong>Time granularity</strong>
     * The time granularity varies with the time range specified by the <code>StartTime</code> and <code>EndTime</code> parameters. The following table describes the time period within which historical data is available and the data delay.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>1 minute</td>
     * <td>Time range per query ≤ 1 hour</td>
     * <td>7 days</td>
     * <td>5 minutes</td>
     * </tr>
     * <tr>
     * <td>5 minutes</td>
     * <td>1 Hour &#x3C; Time range per query ≤ 3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>3 days &#x3C; Time range per query ≤ 31 days</td>
     * <td>186 days</td>
     * <td>3 to 4 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the bandwidth data for one or more accelerated domains. The minimum time granularity is 1 minute. The minimum data latency is 5 minutes. You can query data in the last 186 days. Compared with the DescribeVodDomainBpsData operation, this operation provides a smaller time granularity, lower data latency, and allows you to query historical data within a shorter time period.</p>
     * 
     * @param request DescribeVodDomainRealTimeBpsDataRequest
     * @return DescribeVodDomainRealTimeBpsDataResponse
     */
    public DescribeVodDomainRealTimeBpsDataResponse describeVodDomainRealTimeBpsData(DescribeVodDomainRealTimeBpsDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodDomainRealTimeBpsDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation is supported only in the <strong>China (Shanghai)</strong> region.</p>
     * <ul>
     * <li>You can specify a maximum of 100 accelerated domain names.</li>
     * <li>If you specify neither <code>StartTime</code> nor <code>EndTime</code>, the data of the last 1 hour is queried. You can specify both <code>StartTime</code> and <code>EndTime</code> parameters to query data of a specified time range.
     * <strong>Time granularity</strong>
     * The time granularity varies with the time range specified by the <code>StartTime</code> and <code>EndTime</code> parameters. The following table describes the time period within which historical data is available and the data delay.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>1 minute</td>
     * <td>Time range per query ≤ 1 hour</td>
     * <td>7 days</td>
     * <td>5 minutes</td>
     * </tr>
     * <tr>
     * <td>5 minutes</td>
     * <td>1 Hour &#x3C; Time range per query ≤ 3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>3 days &#x3C; Time range per query ≤ 31 days</td>
     * <td>186 days</td>
     * <td>3 to 4 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the byte hit ratio for one or more accelerated domains. The minimum time granularity is 1 minute. The minimum data latency is 5 minutes. You can query data in the last 186 days.</p>
     * 
     * @param request DescribeVodDomainRealTimeByteHitRateDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVodDomainRealTimeByteHitRateDataResponse
     */
    public DescribeVodDomainRealTimeByteHitRateDataResponse describeVodDomainRealTimeByteHitRateDataWithOptions(DescribeVodDomainRealTimeByteHitRateDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVodDomainRealTimeByteHitRateData"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVodDomainRealTimeByteHitRateDataResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation is supported only in the <strong>China (Shanghai)</strong> region.</p>
     * <ul>
     * <li>You can specify a maximum of 100 accelerated domain names.</li>
     * <li>If you specify neither <code>StartTime</code> nor <code>EndTime</code>, the data of the last 1 hour is queried. You can specify both <code>StartTime</code> and <code>EndTime</code> parameters to query data of a specified time range.
     * <strong>Time granularity</strong>
     * The time granularity varies with the time range specified by the <code>StartTime</code> and <code>EndTime</code> parameters. The following table describes the time period within which historical data is available and the data delay.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>1 minute</td>
     * <td>Time range per query ≤ 1 hour</td>
     * <td>7 days</td>
     * <td>5 minutes</td>
     * </tr>
     * <tr>
     * <td>5 minutes</td>
     * <td>1 Hour &#x3C; Time range per query ≤ 3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>3 days &#x3C; Time range per query ≤ 31 days</td>
     * <td>186 days</td>
     * <td>3 to 4 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the byte hit ratio for one or more accelerated domains. The minimum time granularity is 1 minute. The minimum data latency is 5 minutes. You can query data in the last 186 days.</p>
     * 
     * @param request DescribeVodDomainRealTimeByteHitRateDataRequest
     * @return DescribeVodDomainRealTimeByteHitRateDataResponse
     */
    public DescribeVodDomainRealTimeByteHitRateDataResponse describeVodDomainRealTimeByteHitRateData(DescribeVodDomainRealTimeByteHitRateDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodDomainRealTimeByteHitRateDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can query data within the last seven days. Data is collected every minute. You can call this API operation up to 10 times per second per account.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries real-time monitoring data of one or more accelerated domain names.</p>
     * 
     * @param request DescribeVodDomainRealTimeDetailDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVodDomainRealTimeDetailDataResponse
     */
    public DescribeVodDomainRealTimeDetailDataResponse describeVodDomainRealTimeDetailDataWithOptions(DescribeVodDomainRealTimeDetailDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVodDomainRealTimeDetailData"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVodDomainRealTimeDetailDataResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can query data within the last seven days. Data is collected every minute. You can call this API operation up to 10 times per second per account.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries real-time monitoring data of one or more accelerated domain names.</p>
     * 
     * @param request DescribeVodDomainRealTimeDetailDataRequest
     * @return DescribeVodDomainRealTimeDetailDataResponse
     */
    public DescribeVodDomainRealTimeDetailDataResponse describeVodDomainRealTimeDetailData(DescribeVodDomainRealTimeDetailDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodDomainRealTimeDetailDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation is supported only in the <strong>China (Shanghai)</strong> region.</p>
     * <ul>
     * <li>You can specify a maximum of 100 accelerated domain names.</li>
     * <li>If you specify neither <code>StartTime</code> nor <code>EndTime</code>, the data of the last 1 hour is queried. You can specify both <code>StartTime</code> and <code>EndTime</code> parameters to query data of a specified time range.
     * <strong>Time granularity</strong>
     * The time granularity varies with the time range specified by the <code>StartTime</code> and <code>EndTime</code> parameters. The following table describes the time period within which historical data is available and the data delay.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Time range per query</th>
     * <th>Historical data available (days)</th>
     * <th>Data latency</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>1 minute</td>
     * <td>Time range per query ≤ 1 hour</td>
     * <td>7 days</td>
     * <td>5 minutes</td>
     * </tr>
     * <tr>
     * <td>5 minutes</td>
     * <td>1 hour &#x3C; Time range per query &#x3C; 3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>3 days ≤ Time range per query &#x3C; 31 days</td>
     * <td>186 days</td>
     * <td>3 to 4 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the total number of HTTP status codes and proportion of each HTTP status code for one or more accelerated domains. The minimum time granularity is 1 minute. The minimum data latency is 5 minutes. You can query data in the last 186 days.</p>
     * 
     * @param request DescribeVodDomainRealTimeHttpCodeDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVodDomainRealTimeHttpCodeDataResponse
     */
    public DescribeVodDomainRealTimeHttpCodeDataResponse describeVodDomainRealTimeHttpCodeDataWithOptions(DescribeVodDomainRealTimeHttpCodeDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
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
            new TeaPair("action", "DescribeVodDomainRealTimeHttpCodeData"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVodDomainRealTimeHttpCodeDataResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation is supported only in the <strong>China (Shanghai)</strong> region.</p>
     * <ul>
     * <li>You can specify a maximum of 100 accelerated domain names.</li>
     * <li>If you specify neither <code>StartTime</code> nor <code>EndTime</code>, the data of the last 1 hour is queried. You can specify both <code>StartTime</code> and <code>EndTime</code> parameters to query data of a specified time range.
     * <strong>Time granularity</strong>
     * The time granularity varies with the time range specified by the <code>StartTime</code> and <code>EndTime</code> parameters. The following table describes the time period within which historical data is available and the data delay.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Time range per query</th>
     * <th>Historical data available (days)</th>
     * <th>Data latency</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>1 minute</td>
     * <td>Time range per query ≤ 1 hour</td>
     * <td>7 days</td>
     * <td>5 minutes</td>
     * </tr>
     * <tr>
     * <td>5 minutes</td>
     * <td>1 hour &#x3C; Time range per query &#x3C; 3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>3 days ≤ Time range per query &#x3C; 31 days</td>
     * <td>186 days</td>
     * <td>3 to 4 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the total number of HTTP status codes and proportion of each HTTP status code for one or more accelerated domains. The minimum time granularity is 1 minute. The minimum data latency is 5 minutes. You can query data in the last 186 days.</p>
     * 
     * @param request DescribeVodDomainRealTimeHttpCodeDataRequest
     * @return DescribeVodDomainRealTimeHttpCodeDataResponse
     */
    public DescribeVodDomainRealTimeHttpCodeDataResponse describeVodDomainRealTimeHttpCodeData(DescribeVodDomainRealTimeHttpCodeDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodDomainRealTimeHttpCodeDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation is supported only in the <strong>China (Shanghai)</strong> region.</p>
     * <ul>
     * <li>You can specify a maximum of 500 accelerated domain names.</li>
     * <li>If you specify neither <code>StartTime</code> nor <code>EndTime</code>, the data of the last 1 hour is queried. You can specify both <code>StartTime</code> and <code>EndTime</code> parameters to query data of a specified time range.
     * <strong>Time granularity</strong>
     * The time granularity varies with the time range specified by the <code>StartTime</code> and <code>EndTime</code> parameters. The following table describes the time period within which historical data is available and the data delay.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>1 minute</td>
     * <td>Time range per query ≤ 1 hour</td>
     * <td>7 days</td>
     * <td>5 minutes</td>
     * </tr>
     * <tr>
     * <td>5 minutes</td>
     * <td>1 Hour &#x3C; Time range per query ≤ 3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>3 days &#x3C; Time range per query ≤ 31 days</td>
     * <td>186 days</td>
     * <td>3 to 4 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the number of queries per second (QPS) for one or more accelerated domains. The minimum time granularity is 1 minute. The minimum data latency is 5 minutes. You can query data in the last 186 days.</p>
     * 
     * @param request DescribeVodDomainRealTimeQpsDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVodDomainRealTimeQpsDataResponse
     */
    public DescribeVodDomainRealTimeQpsDataResponse describeVodDomainRealTimeQpsDataWithOptions(DescribeVodDomainRealTimeQpsDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVodDomainRealTimeQpsData"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVodDomainRealTimeQpsDataResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation is supported only in the <strong>China (Shanghai)</strong> region.</p>
     * <ul>
     * <li>You can specify a maximum of 500 accelerated domain names.</li>
     * <li>If you specify neither <code>StartTime</code> nor <code>EndTime</code>, the data of the last 1 hour is queried. You can specify both <code>StartTime</code> and <code>EndTime</code> parameters to query data of a specified time range.
     * <strong>Time granularity</strong>
     * The time granularity varies with the time range specified by the <code>StartTime</code> and <code>EndTime</code> parameters. The following table describes the time period within which historical data is available and the data delay.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>1 minute</td>
     * <td>Time range per query ≤ 1 hour</td>
     * <td>7 days</td>
     * <td>5 minutes</td>
     * </tr>
     * <tr>
     * <td>5 minutes</td>
     * <td>1 Hour &#x3C; Time range per query ≤ 3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>3 days &#x3C; Time range per query ≤ 31 days</td>
     * <td>186 days</td>
     * <td>3 to 4 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the number of queries per second (QPS) for one or more accelerated domains. The minimum time granularity is 1 minute. The minimum data latency is 5 minutes. You can query data in the last 186 days.</p>
     * 
     * @param request DescribeVodDomainRealTimeQpsDataRequest
     * @return DescribeVodDomainRealTimeQpsDataResponse
     */
    public DescribeVodDomainRealTimeQpsDataResponse describeVodDomainRealTimeQpsData(DescribeVodDomainRealTimeQpsDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodDomainRealTimeQpsDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation is supported only in the <strong>China (Shanghai)</strong> region.</p>
     * <ul>
     * <li>You can specify a maximum of 100 accelerated domain names.</li>
     * <li>If you specify neither <code>StartTime</code> nor <code>EndTime</code>, the data of the last 1 hour is queried. You can specify both <code>StartTime</code> and <code>EndTime</code> parameters to query data of a specified time range.</li>
     * <li>By default, the POST method is used for Go. To use the FET method, you must declare <code>request.Method=&quot;GET&quot;</code>.
     * <strong>Time granularity</strong>
     * The time granularity varies with the time range specified by the <code>StartTime</code> and <code>EndTime</code> parameters. The following table describes the time period within which historical data is available and the data delay.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>1 minute</td>
     * <td>Time range per query ≤ 1 hour</td>
     * <td>7 days</td>
     * <td>5 minutes</td>
     * </tr>
     * <tr>
     * <td>5 minutes</td>
     * <td>1 hour &#x3C; Time range per query &#x3C; 3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>3 days ≤ Time range per query &#x3C; 31 days</td>
     * <td>186 days</td>
     * <td>3 to 4 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the request hit ratio data for one or more accelerated domain names. The minimum time granularity is 1 minute. The minimum data latency is 5 minutes. You can query data in the last 186 days.</p>
     * 
     * @param request DescribeVodDomainRealTimeReqHitRateDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVodDomainRealTimeReqHitRateDataResponse
     */
    public DescribeVodDomainRealTimeReqHitRateDataResponse describeVodDomainRealTimeReqHitRateDataWithOptions(DescribeVodDomainRealTimeReqHitRateDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVodDomainRealTimeReqHitRateData"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVodDomainRealTimeReqHitRateDataResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation is supported only in the <strong>China (Shanghai)</strong> region.</p>
     * <ul>
     * <li>You can specify a maximum of 100 accelerated domain names.</li>
     * <li>If you specify neither <code>StartTime</code> nor <code>EndTime</code>, the data of the last 1 hour is queried. You can specify both <code>StartTime</code> and <code>EndTime</code> parameters to query data of a specified time range.</li>
     * <li>By default, the POST method is used for Go. To use the FET method, you must declare <code>request.Method=&quot;GET&quot;</code>.
     * <strong>Time granularity</strong>
     * The time granularity varies with the time range specified by the <code>StartTime</code> and <code>EndTime</code> parameters. The following table describes the time period within which historical data is available and the data delay.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>1 minute</td>
     * <td>Time range per query ≤ 1 hour</td>
     * <td>7 days</td>
     * <td>5 minutes</td>
     * </tr>
     * <tr>
     * <td>5 minutes</td>
     * <td>1 hour &#x3C; Time range per query &#x3C; 3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>3 days ≤ Time range per query &#x3C; 31 days</td>
     * <td>186 days</td>
     * <td>3 to 4 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the request hit ratio data for one or more accelerated domain names. The minimum time granularity is 1 minute. The minimum data latency is 5 minutes. You can query data in the last 186 days.</p>
     * 
     * @param request DescribeVodDomainRealTimeReqHitRateDataRequest
     * @return DescribeVodDomainRealTimeReqHitRateDataResponse
     */
    public DescribeVodDomainRealTimeReqHitRateDataResponse describeVodDomainRealTimeReqHitRateData(DescribeVodDomainRealTimeReqHitRateDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodDomainRealTimeReqHitRateDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation is supported only in the <strong>China (Shanghai)</strong> region.</p>
     * <ul>
     * <li>You can specify a maximum of 100 accelerated domain names.</li>
     * <li>If you specify neither <code>StartTime</code> nor <code>EndTime</code>, the data of the last 1 hour is queried. You can specify both <code>StartTime</code> and <code>EndTime</code> parameters to query data of a specified time range.
     * <strong>Time granularity</strong>
     * The time granularity varies with the time range specified by the <code>StartTime</code> and <code>EndTime</code> parameters. The following table describes the time period within which historical data is available and the data delay.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>1 minute</td>
     * <td>Time range per query ≤ 1 hour</td>
     * <td>7 days</td>
     * <td>5 minutes</td>
     * </tr>
     * <tr>
     * <td>5 minutes</td>
     * <td>1 Hour &#x3C; Time range per query ≤ 3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>3 days &#x3C; Time range per query ≤ 31 days</td>
     * <td>186 days</td>
     * <td>3 to 4 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the traffic data for one or more accelerated domains. The minimum time granularity is 1 minute. The minimum data latency is 5 minutes. You can query data in the last 186 days. Compared with the DescribeVodDomainTrafficData operation, this operation provides a smaller time granularity, lower data latency, and allows you to query historical data within a shorter time period.</p>
     * 
     * @param request DescribeVodDomainRealTimeTrafficDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVodDomainRealTimeTrafficDataResponse
     */
    public DescribeVodDomainRealTimeTrafficDataResponse describeVodDomainRealTimeTrafficDataWithOptions(DescribeVodDomainRealTimeTrafficDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
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
            new TeaPair("action", "DescribeVodDomainRealTimeTrafficData"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVodDomainRealTimeTrafficDataResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation is supported only in the <strong>China (Shanghai)</strong> region.</p>
     * <ul>
     * <li>You can specify a maximum of 100 accelerated domain names.</li>
     * <li>If you specify neither <code>StartTime</code> nor <code>EndTime</code>, the data of the last 1 hour is queried. You can specify both <code>StartTime</code> and <code>EndTime</code> parameters to query data of a specified time range.
     * <strong>Time granularity</strong>
     * The time granularity varies with the time range specified by the <code>StartTime</code> and <code>EndTime</code> parameters. The following table describes the time period within which historical data is available and the data delay.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>1 minute</td>
     * <td>Time range per query ≤ 1 hour</td>
     * <td>7 days</td>
     * <td>5 minutes</td>
     * </tr>
     * <tr>
     * <td>5 minutes</td>
     * <td>1 Hour &#x3C; Time range per query ≤ 3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>3 days &#x3C; Time range per query ≤ 31 days</td>
     * <td>186 days</td>
     * <td>3 to 4 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the traffic data for one or more accelerated domains. The minimum time granularity is 1 minute. The minimum data latency is 5 minutes. You can query data in the last 186 days. Compared with the DescribeVodDomainTrafficData operation, this operation provides a smaller time granularity, lower data latency, and allows you to query historical data within a shorter time period.</p>
     * 
     * @param request DescribeVodDomainRealTimeTrafficDataRequest
     * @return DescribeVodDomainRealTimeTrafficDataResponse
     */
    public DescribeVodDomainRealTimeTrafficDataResponse describeVodDomainRealTimeTrafficData(DescribeVodDomainRealTimeTrafficDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodDomainRealTimeTrafficDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation is supported only in the <strong>China (Shanghai)</strong> region.</p>
     * <ul>
     * <li>You can specify a maximum of 500 accelerated domain names.</li>
     * <li>If you specify neither <code>StartTime</code> nor <code>EndTime</code>, the data of the last 24 hours is queried. You can specify both <code>StartTime</code> and <code>EndTime</code> parameters to query data of a specified time range.
     * <strong>Time granularity</strong>
     * The time granularity varies with the time range specified by the <code>StartTime</code> and <code>EndTime</code> parameters. The following table describes the time period within which historical data is available and the data delay when you do not set <code>Interval</code>.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>Time range per query &#x3C; 3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>3 days ≤ Time range per query &#x3C; 31 days</td>
     * <td>186 days</td>
     * <td>3 to 4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>31 days ≤ Time range per query ≤ 90 days</td>
     * <td>366 days</td>
     * <td>4 hours in most cases, not more than 24 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the byte hit ratio for one or more accelerated domains. Request hit ratios are measured in percentage.</p>
     * 
     * @param request DescribeVodDomainReqHitRateDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVodDomainReqHitRateDataResponse
     */
    public DescribeVodDomainReqHitRateDataResponse describeVodDomainReqHitRateDataWithOptions(DescribeVodDomainReqHitRateDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVodDomainReqHitRateData"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVodDomainReqHitRateDataResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation is supported only in the <strong>China (Shanghai)</strong> region.</p>
     * <ul>
     * <li>You can specify a maximum of 500 accelerated domain names.</li>
     * <li>If you specify neither <code>StartTime</code> nor <code>EndTime</code>, the data of the last 24 hours is queried. You can specify both <code>StartTime</code> and <code>EndTime</code> parameters to query data of a specified time range.
     * <strong>Time granularity</strong>
     * The time granularity varies with the time range specified by the <code>StartTime</code> and <code>EndTime</code> parameters. The following table describes the time period within which historical data is available and the data delay when you do not set <code>Interval</code>.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>Time range per query &#x3C; 3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>3 days ≤ Time range per query &#x3C; 31 days</td>
     * <td>186 days</td>
     * <td>3 to 4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>31 days ≤ Time range per query ≤ 90 days</td>
     * <td>366 days</td>
     * <td>4 hours in most cases, not more than 24 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the byte hit ratio for one or more accelerated domains. Request hit ratios are measured in percentage.</p>
     * 
     * @param request DescribeVodDomainReqHitRateDataRequest
     * @return DescribeVodDomainReqHitRateDataResponse
     */
    public DescribeVodDomainReqHitRateDataResponse describeVodDomainReqHitRateData(DescribeVodDomainReqHitRateDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodDomainReqHitRateDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation is supported only in the <strong>China (Shanghai)</strong> region.</p>
     * <ul>
     * <li>You can specify a maximum of 500 accelerated domain names.</li>
     * <li>If you specify neither <code>StartTime</code> nor <code>EndTime</code>, the data of the last 24 hours is queried. You can specify both <code>StartTime</code> and <code>EndTime</code> parameters to query data of a specified time range.
     * <strong>Time granularity</strong>
     * The time granularity varies with the time range specified by the <code>StartTime</code> and <code>EndTime</code> parameters. The following table describes the time period within which historical data is available and the data delay when you do not set <code>Interval</code>.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>Time range per query &#x3C; 3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>3 days ≤ Time range per query &#x3C; 31 days</td>
     * <td>186 days</td>
     * <td>3 to 4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>31 days ≤ Time span of a single query ≤ 366 days</td>
     * <td>366 days</td>
     * <td>4 hours in most cases, not more than 24 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the bandwidth data during back-to-origin routing for one or more accelerated domain names.</p>
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
     * <b>description</b> :
     * <p>This operation is supported only in the <strong>China (Shanghai)</strong> region.</p>
     * <ul>
     * <li>You can specify a maximum of 500 accelerated domain names.</li>
     * <li>If you specify neither <code>StartTime</code> nor <code>EndTime</code>, the data of the last 24 hours is queried. You can specify both <code>StartTime</code> and <code>EndTime</code> parameters to query data of a specified time range.
     * <strong>Time granularity</strong>
     * The time granularity varies with the time range specified by the <code>StartTime</code> and <code>EndTime</code> parameters. The following table describes the time period within which historical data is available and the data delay when you do not set <code>Interval</code>.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>Time range per query &#x3C; 3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>3 days ≤ Time range per query &#x3C; 31 days</td>
     * <td>186 days</td>
     * <td>3 to 4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>31 days ≤ Time span of a single query ≤ 366 days</td>
     * <td>366 days</td>
     * <td>4 hours in most cases, not more than 24 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the bandwidth data during back-to-origin routing for one or more accelerated domain names.</p>
     * 
     * @param request DescribeVodDomainSrcBpsDataRequest
     * @return DescribeVodDomainSrcBpsDataResponse
     */
    public DescribeVodDomainSrcBpsDataResponse describeVodDomainSrcBpsData(DescribeVodDomainSrcBpsDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodDomainSrcBpsDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation is available only in the <strong>China (Shanghai)</strong> region.</p>
     * <ul>
     * <li>ApsaraVideo VOD stores the origin traffic data for 90 days before the data is deleted.</li>
     * <li>If you do not set the <code>StartTime</code> or <code>EndTime</code> parameter, the request returns the data collected in the last 24 hours. If you set both the <code>StartTime</code> and <code>EndTime</code> parameters, the request returns the data collected within the specified time range.</li>
     * <li>You can specify a maximum of 500 domain names in a request. Separate multiple domain names with commas (,). If you specify multiple domain names in a request, aggregation results are returned.</li>
     * </ul>
     * <h3>Time granularity</h3>
     * <p>The time granularity supported by the Interval parameter varies based on the time range per query specified by using <code>StartTime</code> and <code>EndTime</code>. The following table describes the time period within which historical data is available and the data delay.</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Time range per query (days)</th>
     * <th>Historical data available (days)</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>(0, 3\]</td>
     * <td>93</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>(3, 31\]</td>
     * <td>186</td>
     * <td>4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>(31, 366\]</td>
     * <td>366</td>
     * <td>04:00 on the next day</td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Queries origin traffic data for accelerated domain names in ApsaraVideo VOD. The traffic is measured in bytes.</p>
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
     * <b>description</b> :
     * <p>This operation is available only in the <strong>China (Shanghai)</strong> region.</p>
     * <ul>
     * <li>ApsaraVideo VOD stores the origin traffic data for 90 days before the data is deleted.</li>
     * <li>If you do not set the <code>StartTime</code> or <code>EndTime</code> parameter, the request returns the data collected in the last 24 hours. If you set both the <code>StartTime</code> and <code>EndTime</code> parameters, the request returns the data collected within the specified time range.</li>
     * <li>You can specify a maximum of 500 domain names in a request. Separate multiple domain names with commas (,). If you specify multiple domain names in a request, aggregation results are returned.</li>
     * </ul>
     * <h3>Time granularity</h3>
     * <p>The time granularity supported by the Interval parameter varies based on the time range per query specified by using <code>StartTime</code> and <code>EndTime</code>. The following table describes the time period within which historical data is available and the data delay.</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Time range per query (days)</th>
     * <th>Historical data available (days)</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>(0, 3\]</td>
     * <td>93</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>(3, 31\]</td>
     * <td>186</td>
     * <td>4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>(31, 366\]</td>
     * <td>366</td>
     * <td>04:00 on the next day</td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Queries origin traffic data for accelerated domain names in ApsaraVideo VOD. The traffic is measured in bytes.</p>
     * 
     * @param request DescribeVodDomainSrcTrafficDataRequest
     * @return DescribeVodDomainSrcTrafficDataResponse
     */
    public DescribeVodDomainSrcTrafficDataResponse describeVodDomainSrcTrafficData(DescribeVodDomainSrcTrafficDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodDomainSrcTrafficDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation is supported only in the <strong>China (Shanghai)</strong> region.</p>
     * <ul>
     * <li>You can specify a maximum of 500 accelerated domain names.</li>
     * <li>If you specify neither <code>StartTime</code> nor <code>EndTime</code>, the data of the last 24 hour is queried. You can specify both <code>StartTime</code> and <code>EndTime</code> parameters to query data of a specified time range.
     * <strong>Time granularity</strong>
     * The time granularity varies with the time range specified by the <code>StartTime</code> and <code>EndTime</code> parameters. The following table describes the time period within which historical data is available and the data delay when you do not set <code>Interval</code>.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>Time range per query &#x3C; 3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>3 days ≤ Time range per query &#x3C; 31 days</td>
     * <td>186 days</td>
     * <td>3 to 4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>31 days ≤ Time range per query ≤ 366 days</td>
     * <td>366 days</td>
     * <td>4 hours in most cases, not more than 24 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the traffic data for one or more accelerated domains. The minimum time granularity is 5 minutes. You can query data in the last 366 days. Compared with the DescribeVodDomainRealTimeTrafficData operation, this operation provides a greater time granularity, higher data latency, but allows you to query historical data within a longer time period.</p>
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
     * <b>description</b> :
     * <p>This operation is supported only in the <strong>China (Shanghai)</strong> region.</p>
     * <ul>
     * <li>You can specify a maximum of 500 accelerated domain names.</li>
     * <li>If you specify neither <code>StartTime</code> nor <code>EndTime</code>, the data of the last 24 hour is queried. You can specify both <code>StartTime</code> and <code>EndTime</code> parameters to query data of a specified time range.
     * <strong>Time granularity</strong>
     * The time granularity varies with the time range specified by the <code>StartTime</code> and <code>EndTime</code> parameters. The following table describes the time period within which historical data is available and the data delay when you do not set <code>Interval</code>.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>Time range per query &#x3C; 3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>3 days ≤ Time range per query &#x3C; 31 days</td>
     * <td>186 days</td>
     * <td>3 to 4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>31 days ≤ Time range per query ≤ 366 days</td>
     * <td>366 days</td>
     * <td>4 hours in most cases, not more than 24 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the traffic data for one or more accelerated domains. The minimum time granularity is 5 minutes. You can query data in the last 366 days. Compared with the DescribeVodDomainRealTimeTrafficData operation, this operation provides a greater time granularity, higher data latency, but allows you to query historical data within a longer time period.</p>
     * 
     * @param request DescribeVodDomainTrafficDataRequest
     * @return DescribeVodDomainTrafficDataResponse
     */
    public DescribeVodDomainTrafficDataResponse describeVodDomainTrafficData(DescribeVodDomainTrafficDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodDomainTrafficDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  This operation is available only in the <strong>China (Shanghai)</strong> region.</p>
     * <ul>
     * <li>You can specify up to 100 accelerated domain names in a request. Separate multiple domain names with commas (,). If you do not specify an accelerated domain name, the data of all accelerated domain names within your Alibaba Cloud account is returned.</li>
     * <li>You can query data in the last year. The maximum time range that can be queried is three months. If you specify a time range of one to three days, the system returns data on an hourly basis. If you specify a time range of four days or more, the system returns data on a daily basis.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the traffic or bandwidth data of one or more accelerated domain names.</p>
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
     * <b>description</b> :
     * <p>  This operation is available only in the <strong>China (Shanghai)</strong> region.</p>
     * <ul>
     * <li>You can specify up to 100 accelerated domain names in a request. Separate multiple domain names with commas (,). If you do not specify an accelerated domain name, the data of all accelerated domain names within your Alibaba Cloud account is returned.</li>
     * <li>You can query data in the last year. The maximum time range that can be queried is three months. If you specify a time range of one to three days, the system returns data on an hourly basis. If you specify a time range of four days or more, the system returns data on a daily basis.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the traffic or bandwidth data of one or more accelerated domain names.</p>
     * 
     * @param request DescribeVodDomainUsageDataRequest
     * @return DescribeVodDomainUsageDataResponse
     */
    public DescribeVodDomainUsageDataResponse describeVodDomainUsageData(DescribeVodDomainUsageDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodDomainUsageDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  This operation is available only in the <strong>China (Shanghai)</strong> region.</p>
     * <ul>
     * <li>Playback data in ApsaraVideo Player SDK is collected based on media IDs.</li>
     * <li>Before you call this operation, make sure that the following requirements are met:<ul>
     * <li>ApsaraVideo Player SDK for Android or iOS<ul>
     * <li>ApsaraVideo Player SDK for Android or iOS V5.4.9.2 or later is used.</li>
     * <li>A license for ApsaraVideo Player SDK is obtained. For more information, see <a href="https://help.aliyun.com/document_detail/469166.html">Manage licenses</a>.</li>
     * <li>The log reporting feature is enabled. By default, the feature is enabled for ApsaraVideo Player SDKs. For more information, see <a href="~~311525#section-dc4-gp6-xk2~~">Integrate ApsaraVideo Player SDK for Android</a> and <a href="~~313855#section-cmf-k7d-jg5~~">Integrate ApsaraVideo Player SDK for iOS</a>.</li>
     * </ul>
     * </li>
     * <li>ApsaraVideo Player SDK for Web<ul>
     * <li>ApsaraVideo Player SDK for Web V2.16.0 or later is used.</li>
     * <li>A license for <strong>playback quality monitoring</strong> is obtained. To apply for the license, <a href="https://yida.alibaba-inc.com/o/webplayer#/">submit a request on Yida to enable value-added features for ApsaraVideo Player SDK for Web</a>. For more information, see the description of the <code>license</code> parameter in the <a href="~~125572#section-3ty-gwp-6pa~~">API operations</a> topic.</li>
     * <li>The log reporting feature is enabled. By default, the feature is enabled for ApsaraVideo Player SDKs.</li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the playback statistics based on the media ID. You can call this operation to query information such as the number of visits, average video views per viewer, total number of views, average playback duration per viewer, and total playback duration.</p>
     * 
     * @param request DescribeVodMediaPlayDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVodMediaPlayDataResponse
     */
    public DescribeVodMediaPlayDataResponse describeVodMediaPlayDataWithOptions(DescribeVodMediaPlayDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mediaId)) {
            query.put("MediaId", request.mediaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderName)) {
            query.put("OrderName", request.orderName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderType)) {
            query.put("OrderType", request.orderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.os)) {
            query.put("Os", request.os);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.playDate)) {
            query.put("PlayDate", request.playDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.terminalType)) {
            query.put("TerminalType", request.terminalType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVodMediaPlayData"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVodMediaPlayDataResponse());
    }

    /**
     * <b>description</b> :
     * <p>  This operation is available only in the <strong>China (Shanghai)</strong> region.</p>
     * <ul>
     * <li>Playback data in ApsaraVideo Player SDK is collected based on media IDs.</li>
     * <li>Before you call this operation, make sure that the following requirements are met:<ul>
     * <li>ApsaraVideo Player SDK for Android or iOS<ul>
     * <li>ApsaraVideo Player SDK for Android or iOS V5.4.9.2 or later is used.</li>
     * <li>A license for ApsaraVideo Player SDK is obtained. For more information, see <a href="https://help.aliyun.com/document_detail/469166.html">Manage licenses</a>.</li>
     * <li>The log reporting feature is enabled. By default, the feature is enabled for ApsaraVideo Player SDKs. For more information, see <a href="~~311525#section-dc4-gp6-xk2~~">Integrate ApsaraVideo Player SDK for Android</a> and <a href="~~313855#section-cmf-k7d-jg5~~">Integrate ApsaraVideo Player SDK for iOS</a>.</li>
     * </ul>
     * </li>
     * <li>ApsaraVideo Player SDK for Web<ul>
     * <li>ApsaraVideo Player SDK for Web V2.16.0 or later is used.</li>
     * <li>A license for <strong>playback quality monitoring</strong> is obtained. To apply for the license, <a href="https://yida.alibaba-inc.com/o/webplayer#/">submit a request on Yida to enable value-added features for ApsaraVideo Player SDK for Web</a>. For more information, see the description of the <code>license</code> parameter in the <a href="~~125572#section-3ty-gwp-6pa~~">API operations</a> topic.</li>
     * <li>The log reporting feature is enabled. By default, the feature is enabled for ApsaraVideo Player SDKs.</li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the playback statistics based on the media ID. You can call this operation to query information such as the number of visits, average video views per viewer, total number of views, average playback duration per viewer, and total playback duration.</p>
     * 
     * @param request DescribeVodMediaPlayDataRequest
     * @return DescribeVodMediaPlayDataResponse
     */
    public DescribeVodMediaPlayDataResponse describeVodMediaPlayData(DescribeVodMediaPlayDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodMediaPlayDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The data is collected every 5 minutes. You can call this API operation up to 20 times per second per account. Time granularity
     * The time granularity supported by Interval, the maximum time period within which historical data is available, and the data delay vary based on the time range to query, as described in the following table.</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>1 hour</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Queries the bandwidth data by Internet service provider (ISP) and region.</p>
     * 
     * @param request DescribeVodRangeDataByLocateAndIspServiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVodRangeDataByLocateAndIspServiceResponse
     */
    public DescribeVodRangeDataByLocateAndIspServiceResponse describeVodRangeDataByLocateAndIspServiceWithOptions(DescribeVodRangeDataByLocateAndIspServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
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
            new TeaPair("action", "DescribeVodRangeDataByLocateAndIspService"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVodRangeDataByLocateAndIspServiceResponse());
    }

    /**
     * <b>description</b> :
     * <p>The data is collected every 5 minutes. You can call this API operation up to 20 times per second per account. Time granularity
     * The time granularity supported by Interval, the maximum time period within which historical data is available, and the data delay vary based on the time range to query, as described in the following table.</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>1 hour</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Queries the bandwidth data by Internet service provider (ISP) and region.</p>
     * 
     * @param request DescribeVodRangeDataByLocateAndIspServiceRequest
     * @return DescribeVodRangeDataByLocateAndIspServiceResponse
     */
    public DescribeVodRangeDataByLocateAndIspServiceResponse describeVodRangeDataByLocateAndIspService(DescribeVodRangeDataByLocateAndIspServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodRangeDataByLocateAndIspServiceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>This operation is available only in the <strong>China (Shanghai)</strong> region.</li>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/69215.html">RefreshVodObjectCaches</a> operation to refresh content and the <a href="https://help.aliyun.com/document_detail/69211.html">PreloadVodObjectCaches</a> operation to prefetch content.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the maximum number and remaining number of requests to refresh or prefetch files on the current day. You can prefetch files based on URLs and refresh files based on URLs or directories.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>This operation is available only in the <strong>China (Shanghai)</strong> region.</li>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/69215.html">RefreshVodObjectCaches</a> operation to refresh content and the <a href="https://help.aliyun.com/document_detail/69211.html">PreloadVodObjectCaches</a> operation to prefetch content.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the maximum number and remaining number of requests to refresh or prefetch files on the current day. You can prefetch files based on URLs and refresh files based on URLs or directories.</p>
     * 
     * @param request DescribeVodRefreshQuotaRequest
     * @return DescribeVodRefreshQuotaResponse
     */
    public DescribeVodRefreshQuotaResponse describeVodRefreshQuota(DescribeVodRefreshQuotaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodRefreshQuotaWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>This operation is available only in the <strong>China (Shanghai)</strong> region.</li>
     * <li>If you do not specify the TaskId or ObjectPath parameter, the data in the last three days is returned on the first page. By default, one page displays a maximum of 20 entries. You can specify the TaskId and ObjectPath parameters at the same time.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about one or more refresh or prefetch tasks.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>This operation is available only in the <strong>China (Shanghai)</strong> region.</li>
     * <li>If you do not specify the TaskId or ObjectPath parameter, the data in the last three days is returned on the first page. By default, one page displays a maximum of 20 entries. You can specify the TaskId and ObjectPath parameters at the same time.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about one or more refresh or prefetch tasks.</p>
     * 
     * @param request DescribeVodRefreshTasksRequest
     * @return DescribeVodRefreshTasksResponse
     */
    public DescribeVodRefreshTasksResponse describeVodRefreshTasks(DescribeVodRefreshTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodRefreshTasksWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>This operation is available only in the <strong>China (Shanghai)</strong> region.</li>
     * <li>If the time range to query is less than or equal to seven days, the system returns the statistics collected on an hourly basis. If the time range to query is greater than seven days, the system returns the statistics collected on a daily basis. The maximum time range that you can specify to query is 31 days.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the usage of storage-related resources, including the storage volume and outbound traffic.</p>
     * 
     * @param request DescribeVodStorageDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVodStorageDataResponse
     */
    public DescribeVodStorageDataResponse describeVodStorageDataWithOptions(DescribeVodStorageDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
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
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>This operation is available only in the <strong>China (Shanghai)</strong> region.</li>
     * <li>If the time range to query is less than or equal to seven days, the system returns the statistics collected on an hourly basis. If the time range to query is greater than seven days, the system returns the statistics collected on a daily basis. The maximum time range that you can specify to query is 31 days.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the usage of storage-related resources, including the storage volume and outbound traffic.</p>
     * 
     * @param request DescribeVodStorageDataRequest
     * @return DescribeVodStorageDataResponse
     */
    public DescribeVodStorageDataResponse describeVodStorageData(DescribeVodStorageDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodStorageDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  This operation is available only in the <strong>China (Shanghai)</strong> region.</p>
     * <ul>
     * <li>If you specify a time range within 7 days, the request returns the data based on hours. If you specify a time range longer than 7 days, the request returns the data based on days. The maximum time range is 31 days.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the usage of tiered storage for media assets.</p>
     * 
     * @param request DescribeVodTieringStorageDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVodTieringStorageDataResponse
     */
    public DescribeVodTieringStorageDataResponse describeVodTieringStorageDataWithOptions(DescribeVodTieringStorageDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.storageClass)) {
            query.put("StorageClass", request.storageClass);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVodTieringStorageData"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVodTieringStorageDataResponse());
    }

    /**
     * <b>description</b> :
     * <p>  This operation is available only in the <strong>China (Shanghai)</strong> region.</p>
     * <ul>
     * <li>If you specify a time range within 7 days, the request returns the data based on hours. If you specify a time range longer than 7 days, the request returns the data based on days. The maximum time range is 31 days.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the usage of tiered storage for media assets.</p>
     * 
     * @param request DescribeVodTieringStorageDataRequest
     * @return DescribeVodTieringStorageDataResponse
     */
    public DescribeVodTieringStorageDataResponse describeVodTieringStorageData(DescribeVodTieringStorageDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodTieringStorageDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  This operation is available only in the <strong>China (Shanghai)</strong> region.</p>
     * <ul>
     * <li>If you specify a time range within 7 days, the request returns the data based on hours. If you specify a time range longer than 7 days, the request returns the data based on days. The maximum time range is 31 days.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the data retrieval from tiered storage.</p>
     * 
     * @param request DescribeVodTieringStorageRetrievalDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVodTieringStorageRetrievalDataResponse
     */
    public DescribeVodTieringStorageRetrievalDataResponse describeVodTieringStorageRetrievalDataWithOptions(DescribeVodTieringStorageRetrievalDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.storageClass)) {
            query.put("StorageClass", request.storageClass);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVodTieringStorageRetrievalData"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVodTieringStorageRetrievalDataResponse());
    }

    /**
     * <b>description</b> :
     * <p>  This operation is available only in the <strong>China (Shanghai)</strong> region.</p>
     * <ul>
     * <li>If you specify a time range within 7 days, the request returns the data based on hours. If you specify a time range longer than 7 days, the request returns the data based on days. The maximum time range is 31 days.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the data retrieval from tiered storage.</p>
     * 
     * @param request DescribeVodTieringStorageRetrievalDataRequest
     * @return DescribeVodTieringStorageRetrievalDataResponse
     */
    public DescribeVodTieringStorageRetrievalDataResponse describeVodTieringStorageRetrievalData(DescribeVodTieringStorageRetrievalDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodTieringStorageRetrievalDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  This operation is available only in the <strong>China (Shanghai)</strong> region.</p>
     * <ul>
     * <li>If the time range to query is less than or equal to seven days, the system returns the statistics collected on an hourly basis. If the time range to query is greater than seven days, the system returns the statistics collected on a daily basis. The maximum time range that you can specify to query is 31 days.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the transcoding statistics.</p>
     * 
     * @param request DescribeVodTranscodeDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVodTranscodeDataResponse
     */
    public DescribeVodTranscodeDataResponse describeVodTranscodeDataWithOptions(DescribeVodTranscodeDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
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
     * <b>description</b> :
     * <p>  This operation is available only in the <strong>China (Shanghai)</strong> region.</p>
     * <ul>
     * <li>If the time range to query is less than or equal to seven days, the system returns the statistics collected on an hourly basis. If the time range to query is greater than seven days, the system returns the statistics collected on a daily basis. The maximum time range that you can specify to query is 31 days.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the transcoding statistics.</p>
     * 
     * @param request DescribeVodTranscodeDataRequest
     * @return DescribeVodTranscodeDataResponse
     */
    public DescribeVodTranscodeDataResponse describeVodTranscodeData(DescribeVodTranscodeDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodTranscodeDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can filter domain names by name and status. Fuzzy match is supported for domain name-based query.</p>
     * <ul>
     * <li>This operation is available only in the China (Shanghai) region.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the domain names for CDN within your Alibaba Cloud account.</p>
     * 
     * @param request DescribeVodUserDomainsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVodUserDomainsResponse
     */
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

    /**
     * <b>description</b> :
     * <p>  You can filter domain names by name and status. Fuzzy match is supported for domain name-based query.</p>
     * <ul>
     * <li>This operation is available only in the China (Shanghai) region.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the domain names for CDN within your Alibaba Cloud account.</p>
     * 
     * @param request DescribeVodUserDomainsRequest
     * @return DescribeVodUserDomainsResponse
     */
    public DescribeVodUserDomainsResponse describeVodUserDomains(DescribeVodUserDomainsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodUserDomainsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the ownership verification content.</p>
     * 
     * @param request DescribeVodVerifyContentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVodVerifyContentResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries the ownership verification content.</p>
     * 
     * @param request DescribeVodVerifyContentRequest
     * @return DescribeVodVerifyContentResponse
     */
    public DescribeVodVerifyContentResponse describeVodVerifyContent(DescribeVodVerifyContentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodVerifyContentWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> You can grant a maximum of 10 application permissions to a RAM user or RAM role.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Revokes application permissions from the specified identity. The identity may a RAM user or RAM role.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p> You can grant a maximum of 10 application permissions to a RAM user or RAM role.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Revokes application permissions from the specified identity. The identity may a RAM user or RAM role.</p>
     * 
     * @param request DetachAppPolicyFromIdentityRequest
     * @return DetachAppPolicyFromIdentityResponse
     */
    public DetachAppPolicyFromIdentityResponse detachAppPolicyFromIdentity(DetachAppPolicyFromIdentityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detachAppPolicyFromIdentityWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  To use the secure download feature, you must enable the download feature in the ApsaraVideo VOD console and set the download method to secure download. For more information, see <a href="https://help.aliyun.com/document_detail/86107.html">Configure download settings</a>.</p>
     * <ul>
     * <li>After you generate a key for secure download, you must configure the key in ApsaraVideo Player SDK. For more information, see <a href="https://help.aliyun.com/document_detail/124735.html">Secure download</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Generates a key for secure download. ApsaraVideo Player SDK provides the secure download feature. Videos that are downloaded to your local device in this mode are encrypted. You can play the encrypted videos only by using the key file generated from the app that you specified. Secure download protects your videos from malicious playback or distribution.</p>
     * 
     * @param request GenerateDownloadSecretKeyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GenerateDownloadSecretKeyResponse
     */
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

    /**
     * <b>description</b> :
     * <p>  To use the secure download feature, you must enable the download feature in the ApsaraVideo VOD console and set the download method to secure download. For more information, see <a href="https://help.aliyun.com/document_detail/86107.html">Configure download settings</a>.</p>
     * <ul>
     * <li>After you generate a key for secure download, you must configure the key in ApsaraVideo Player SDK. For more information, see <a href="https://help.aliyun.com/document_detail/124735.html">Secure download</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Generates a key for secure download. ApsaraVideo Player SDK provides the secure download feature. Videos that are downloaded to your local device in this mode are encrypted. You can play the encrypted videos only by using the key file generated from the app that you specified. Secure download protects your videos from malicious playback or distribution.</p>
     * 
     * @param request GenerateDownloadSecretKeyRequest
     * @return GenerateDownloadSecretKeyResponse
     */
    public GenerateDownloadSecretKeyResponse generateDownloadSecretKey(GenerateDownloadSecretKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.generateDownloadSecretKeyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Generates a random Key Management Service (KMS) data key used for HLS encryption in ApsaraVideo VOD.</p>
     * 
     * @param request GenerateKMSDataKeyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GenerateKMSDataKeyResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Generates a random Key Management Service (KMS) data key used for HLS encryption in ApsaraVideo VOD.</p>
     * 
     * @param request GenerateKMSDataKeyRequest
     * @return GenerateKMSDataKeyResponse
     */
    public GenerateKMSDataKeyResponse generateKMSDataKey(GenerateKMSDataKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.generateKMSDataKeyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Regions that support this operation: <strong>China (Beijing)</strong> and <strong>China (Shanghai)</strong>.</p>
     * <ul>
     * <li>Call the <a href="~~SubmitAIImageJob~~">SubmitAIImageJob</a> operation to submit image AI processing jobs before you call this operation to query image AI processing jobs.</li>
     * <li>You can query a maximum of 10 jobs of image AI processing in one request.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries jobs of image AI processing.</p>
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
     * <b>description</b> :
     * <p>  Regions that support this operation: <strong>China (Beijing)</strong> and <strong>China (Shanghai)</strong>.</p>
     * <ul>
     * <li>Call the <a href="~~SubmitAIImageJob~~">SubmitAIImageJob</a> operation to submit image AI processing jobs before you call this operation to query image AI processing jobs.</li>
     * <li>You can query a maximum of 10 jobs of image AI processing in one request.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries jobs of image AI processing.</p>
     * 
     * @param request GetAIImageJobsRequest
     * @return GetAIImageJobsResponse
     */
    public GetAIImageJobsResponse getAIImageJobs(GetAIImageJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAIImageJobsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>ApsaraVideo VOD stores the snapshots of the intelligent review results free of charge for two weeks. After this period, the snapshots are automatically deleted.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about an intelligent review job. After the job is submitted, it is processed asynchronously. You can call this operation to query the job information in real time.</p>
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
     * <b>description</b> :
     * <p>ApsaraVideo VOD stores the snapshots of the intelligent review results free of charge for two weeks. After this period, the snapshots are automatically deleted.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about an intelligent review job. After the job is submitted, it is processed asynchronously. You can call this operation to query the job information in real time.</p>
     * 
     * @param request GetAIMediaAuditJobRequest
     * @return GetAIMediaAuditJobResponse
     */
    public GetAIMediaAuditJobResponse getAIMediaAuditJob(GetAIMediaAuditJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAIMediaAuditJobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Regions that support this operation: <strong>China (Beijing)</strong>, <strong>China (Shanghai)</strong>, and <strong>Singapore</strong>.</p>
     * <ul>
     * <li>Before you call this operation to query details of an AI template, you must obtain the ID of the AI template.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of an AI template.</p>
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
     * <b>description</b> :
     * <p>  Regions that support this operation: <strong>China (Beijing)</strong>, <strong>China (Shanghai)</strong>, and <strong>Singapore</strong>.</p>
     * <ul>
     * <li>Before you call this operation to query details of an AI template, you must obtain the ID of the AI template.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of an AI template.</p>
     * 
     * @param request GetAITemplateRequest
     * @return GetAITemplateResponse
     */
    public GetAITemplateResponse getAITemplate(GetAITemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAITemplateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Regions that support this operation: <strong>China (Beijing)</strong>, <strong>China (Shanghai)</strong>, and <strong>Singapore</strong>.</p>
     * <ul>
     * <li>You can obtain the smart tagging results by using the video ID.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the results of smart tagging jobs.</p>
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
     * <b>description</b> :
     * <p>  Regions that support this operation: <strong>China (Beijing)</strong>, <strong>China (Shanghai)</strong>, and <strong>Singapore</strong>.</p>
     * <ul>
     * <li>You can obtain the smart tagging results by using the video ID.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the results of smart tagging jobs.</p>
     * 
     * @param request GetAIVideoTagResultRequest
     * @return GetAIVideoTagResultResponse
     */
    public GetAIVideoTagResultResponse getAIVideoTagResult(GetAIVideoTagResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAIVideoTagResultWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can specify multiple accelerated domain names in a request.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about one or more applications based on application IDs.</p>
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
     * <b>description</b> :
     * <p>You can specify multiple accelerated domain names in a request.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about one or more applications based on application IDs.</p>
     * 
     * @param request GetAppInfosRequest
     * @return GetAppInfosResponse
     */
    public GetAppInfosResponse getAppInfos(GetAppInfosRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAppInfosWithOptions(request, runtime);
    }

    /**
     * @param request GetAttachedMediaInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAttachedMediaInfoResponse
     */
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

    /**
     * @param request GetAttachedMediaInfoRequest
     * @return GetAttachedMediaInfoResponse
     */
    public GetAttachedMediaInfoResponse getAttachedMediaInfo(GetAttachedMediaInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAttachedMediaInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the manual review history.</p>
     * 
     * @param request GetAuditHistoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAuditHistoryResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries the manual review history.</p>
     * 
     * @param request GetAuditHistoryRequest
     * @return GetAuditHistoryResponse
     */
    public GetAuditHistoryResponse getAuditHistory(GetAuditHistoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAuditHistoryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a specific category and its subcategories based on the ID or type of the category.</p>
     * 
     * @param request GetCategoriesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCategoriesResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a specific category and its subcategories based on the ID or type of the category.</p>
     * 
     * @param request GetCategoriesRequest
     * @return GetCategoriesResponse
     */
    public GetCategoriesResponse getCategories(GetCategoriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCategoriesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Regions that support this operation: <strong>China (Beijing)</strong>, <strong>China (Shanghai)</strong>, and <strong>Singapore</strong>.</p>
     * <ul>
     * <li>You can query information only about the default AI template for automated review.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries information about the default AI template.</p>
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
     * <b>description</b> :
     * <p>  Regions that support this operation: <strong>China (Beijing)</strong>, <strong>China (Shanghai)</strong>, and <strong>Singapore</strong>.</p>
     * <ul>
     * <li>You can query information only about the default AI template for automated review.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries information about the default AI template.</p>
     * 
     * @param request GetDefaultAITemplateRequest
     * @return GetDefaultAITemplateResponse
     */
    public GetDefaultAITemplateResponse getDefaultAITemplate(GetDefaultAITemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDefaultAITemplateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  This operation is supported only in the China (Shanghai) and China (Beijing) regions.</p>
     * <ul>
     * <li>You can call this operation to query the watermark content after you call the <a href="~~SubmitDigitalWatermarkExtractJob~~">SubmitDigitalWatermarkExtractJob</a> operation to extract the copyright or user-tracing watermark in a video.</li>
     * <li>You can query watermark content extracted only from watermark extraction jobs that are submitted in the last 2 years.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the results of a digital watermark extraction job. You can call this operation to obtain information such as the job status and the content of the copyright or user-tracing watermark.</p>
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
     * <b>description</b> :
     * <p>  This operation is supported only in the China (Shanghai) and China (Beijing) regions.</p>
     * <ul>
     * <li>You can call this operation to query the watermark content after you call the <a href="~~SubmitDigitalWatermarkExtractJob~~">SubmitDigitalWatermarkExtractJob</a> operation to extract the copyright or user-tracing watermark in a video.</li>
     * <li>You can query watermark content extracted only from watermark extraction jobs that are submitted in the last 2 years.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the results of a digital watermark extraction job. You can call this operation to obtain information such as the job status and the content of the copyright or user-tracing watermark.</p>
     * 
     * @param request GetDigitalWatermarkExtractResultRequest
     * @return GetDigitalWatermarkExtractResultResponse
     */
    public GetDigitalWatermarkExtractResultResponse getDigitalWatermarkExtractResult(GetDigitalWatermarkExtractResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDigitalWatermarkExtractResultWithOptions(request, runtime);
    }

    /**
     * @param request GetEditingProjectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetEditingProjectResponse
     */
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

    /**
     * @param request GetEditingProjectRequest
     * @return GetEditingProjectResponse
     */
    public GetEditingProjectResponse getEditingProject(GetEditingProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getEditingProjectWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>During editing, you can add materials to the timeline, but some of them may not be used.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries materials to be edited for an online editing project.</p>
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
     * <b>description</b> :
     * <p>During editing, you can add materials to the timeline, but some of them may not be used.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries materials to be edited for an online editing project.</p>
     * 
     * @param request GetEditingProjectMaterialsRequest
     * @return GetEditingProjectMaterialsResponse
     */
    public GetEditingProjectMaterialsResponse getEditingProjectMaterials(GetEditingProjectMaterialsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getEditingProjectMaterialsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the basic information about an image based on the image ID. The basic information includes the title, type, creation time, and tags of the image.</p>
     * 
     * @param request GetImageInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetImageInfoResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries the basic information about an image based on the image ID. The basic information includes the title, type, creation time, and tags of the image.</p>
     * 
     * @param request GetImageInfoRequest
     * @return GetImageInfoResponse
     */
    public GetImageInfoResponse getImageInfo(GetImageInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getImageInfoWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the basic information about multiple images at a time, such as the image title, type, creation time, tags, and URL.</p>
     * <h3>Limits</h3>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limit on an API operation in ApsaraVideo Live</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the basic information about multiple images at a time.</p>
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
     * <b>description</b> :
     * <p>You can call this operation to query the basic information about multiple images at a time, such as the image title, type, creation time, tags, and URL.</p>
     * <h3>Limits</h3>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limit on an API operation in ApsaraVideo Live</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the basic information about multiple images at a time.</p>
     * 
     * @param request GetImageInfosRequest
     * @return GetImageInfosResponse
     */
    public GetImageInfosResponse getImageInfos(GetImageInfosRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getImageInfosWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>If notifications for the <a href="https://help.aliyun.com/document_detail/89576.html">CreateAuditComplete</a> event are configured, event notifications are sent to the callback URL after automated review is complete. You can call this operation to query the details of audio review results.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of audio review results.</p>
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
     * <b>description</b> :
     * <p>If notifications for the <a href="https://help.aliyun.com/document_detail/89576.html">CreateAuditComplete</a> event are configured, event notifications are sent to the callback URL after automated review is complete. You can call this operation to query the details of audio review results.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of audio review results.</p>
     * 
     * @param request GetMediaAuditAudioResultDetailRequest
     * @return GetMediaAuditAudioResultDetailResponse
     */
    public GetMediaAuditAudioResultDetailResponse getMediaAuditAudioResultDetail(GetMediaAuditAudioResultDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMediaAuditAudioResultDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the summary of automated review results.</p>
     * 
     * @param request GetMediaAuditResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMediaAuditResultResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries the summary of automated review results.</p>
     * 
     * @param request GetMediaAuditResultRequest
     * @return GetMediaAuditResultResponse
     */
    public GetMediaAuditResultResponse getMediaAuditResult(GetMediaAuditResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMediaAuditResultWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>By default, only details of snapshots that violate content regulations and potentially violate content regulations are returned.</li>
     * <li>ApsaraVideo VOD stores the snapshots in the automated review results free of charge for two weeks. After this period, the snapshots are automatically deleted.</li>
     * </ul>
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
     * <b>description</b> :
     * <ul>
     * <li>By default, only details of snapshots that violate content regulations and potentially violate content regulations are returned.</li>
     * <li>ApsaraVideo VOD stores the snapshots in the automated review results free of charge for two weeks. After this period, the snapshots are automatically deleted.</li>
     * </ul>
     * 
     * @param request GetMediaAuditResultDetailRequest
     * @return GetMediaAuditResultDetailResponse
     */
    public GetMediaAuditResultDetailResponse getMediaAuditResultDetail(GetMediaAuditResultDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMediaAuditResultDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the timelines of all snapshots that violate content regulations.</p>
     * 
     * @param request GetMediaAuditResultTimelineRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMediaAuditResultTimelineResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries the timelines of all snapshots that violate content regulations.</p>
     * 
     * @param request GetMediaAuditResultTimelineRequest
     * @return GetMediaAuditResultTimelineResponse
     */
    public GetMediaAuditResultTimelineResponse getMediaAuditResultTimeline(GetMediaAuditResultTimelineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMediaAuditResultTimelineWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Regions that support this operation: <strong>China (Beijing)</strong>, <strong>China (Shanghai)</strong>, and <strong>Singapore</strong>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a media fingerprinting result. After a media fingerprinting job is complete, you can call this operation to query the media fingerprinting result.</p>
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
     * <b>description</b> :
     * <p>Regions that support this operation: <strong>China (Beijing)</strong>, <strong>China (Shanghai)</strong>, and <strong>Singapore</strong>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a media fingerprinting result. After a media fingerprinting job is complete, you can call this operation to query the media fingerprinting result.</p>
     * 
     * @param request GetMediaDNAResultRequest
     * @return GetMediaDNAResultResponse
     */
    public GetMediaDNAResultResponse getMediaDNAResult(GetMediaDNAResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMediaDNAResultWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can query the information about all media files or a specific media file in a refresh or prefetch job.</p>
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limits on API operations in ApsaraVideo VoD</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about media refresh or prefetch jobs, such as the job status and filtering conditions.</p>
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
     * <b>description</b> :
     * <p>You can query the information about all media files or a specific media file in a refresh or prefetch job.</p>
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limits on API operations in ApsaraVideo VoD</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about media refresh or prefetch jobs, such as the job status and filtering conditions.</p>
     * 
     * @param request GetMediaRefreshJobsRequest
     * @return GetMediaRefreshJobsResponse
     */
    public GetMediaRefreshJobsResponse getMediaRefreshJobs(GetMediaRefreshJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMediaRefreshJobsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/55627.html">Event notification</a>.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the callback method, callback URL, and event type for event notifications.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/55627.html">Event notification</a>.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the callback method, callback URL, and event type for event notifications.</p>
     * 
     * @param request GetMessageCallbackRequest
     * @return GetMessageCallbackResponse
     */
    public GetMessageCallbackResponse getMessageCallback(GetMessageCallbackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMessageCallbackWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can obtain complete information about the source file only after a stream is transcoded.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about the mezzanine file of an audio or video. The information includes the mezzanine file URL, resolution, and bitrate of the audio or video.</p>
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
     * <b>description</b> :
     * <p>You can obtain complete information about the source file only after a stream is transcoded.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about the mezzanine file of an audio or video. The information includes the mezzanine file URL, resolution, and bitrate of the audio or video.</p>
     * 
     * @param request GetMezzanineInfoRequest
     * @return GetMezzanineInfoResponse
     */
    public GetMezzanineInfoResponse getMezzanineInfo(GetMezzanineInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMezzanineInfoWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  <strong>Make sure that you understand the billing method and price of ApsaraVideo VOD before you call this operation. You are charged for outbound traffic when you download or play videos based on URLs in ApsaraVideo VOD. For more information about billing of outbound traffic, see <a href="~~188308#section-rwh-e88-f7j~~">Billing of outbound traffic</a>. If you have configured an accelerated domain name, see <a href="~~188308#section-c5t-oq9-15e~~">Billing of the acceleration service</a>. If you have activated the acceleration service, you are charged acceleration fees when you upload media files to ApsaraVideo VOD. For more information, see <a href="~~188310#section_sta_zm2_tsv~~">Billing of acceleration traffic</a>.</strong></p>
     * <ul>
     * <li>Only videos whose Status is Normal can be played. For more information, see <a href="https://help.aliyun.com/document_detail/57290.html">Overview</a>.</li>
     * <li>If video playback fails, you can call the <a href="~~GetMezzanineInfo~~">GetMezzanineInfo</a> operation to check whether the video source information is correct.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the playback URL of a video or audio file by its ID. After you obtain the playback URL of a file stored in ApsaraVideo VOD, you can use ApsaraVideo Player SDK for URL-based playback or use a third-party player such as a system player, open-source player, or self-developed player to play the file.</p>
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
     * <b>description</b> :
     * <p>  <strong>Make sure that you understand the billing method and price of ApsaraVideo VOD before you call this operation. You are charged for outbound traffic when you download or play videos based on URLs in ApsaraVideo VOD. For more information about billing of outbound traffic, see <a href="~~188308#section-rwh-e88-f7j~~">Billing of outbound traffic</a>. If you have configured an accelerated domain name, see <a href="~~188308#section-c5t-oq9-15e~~">Billing of the acceleration service</a>. If you have activated the acceleration service, you are charged acceleration fees when you upload media files to ApsaraVideo VOD. For more information, see <a href="~~188310#section_sta_zm2_tsv~~">Billing of acceleration traffic</a>.</strong></p>
     * <ul>
     * <li>Only videos whose Status is Normal can be played. For more information, see <a href="https://help.aliyun.com/document_detail/57290.html">Overview</a>.</li>
     * <li>If video playback fails, you can call the <a href="~~GetMezzanineInfo~~">GetMezzanineInfo</a> operation to check whether the video source information is correct.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the playback URL of a video or audio file by its ID. After you obtain the playback URL of a file stored in ApsaraVideo VOD, you can use ApsaraVideo Player SDK for URL-based playback or use a third-party player such as a system player, open-source player, or self-developed player to play the file.</p>
     * 
     * @param request GetPlayInfoRequest
     * @return GetPlayInfoResponse
     */
    public GetPlayInfoResponse getPlayInfo(GetPlayInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPlayInfoWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  An audio or video file may be transcoded multiple times. This operation returns only the latest transcoding summary.</p>
     * <ul>
     * <li>You can query transcoding summaries for a maximum of 10 audio and video files in one request.</li>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/109120.html">ListTranscodeTask</a> operation to query historical transcoding tasks.</li>
     * <li>**You can call this operation to query information only about transcoding tasks created within the past year.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries transcoding summaries of audio and video files based on the file ID. A transcoding summary includes the status and progress of transcoding.</p>
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
     * <b>description</b> :
     * <p>  An audio or video file may be transcoded multiple times. This operation returns only the latest transcoding summary.</p>
     * <ul>
     * <li>You can query transcoding summaries for a maximum of 10 audio and video files in one request.</li>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/109120.html">ListTranscodeTask</a> operation to query historical transcoding tasks.</li>
     * <li>**You can call this operation to query information only about transcoding tasks created within the past year.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries transcoding summaries of audio and video files based on the file ID. A transcoding summary includes the status and progress of transcoding.</p>
     * 
     * @param request GetTranscodeSummaryRequest
     * @return GetTranscodeSummaryResponse
     */
    public GetTranscodeSummaryResponse getTranscodeSummary(GetTranscodeSummaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTranscodeSummaryWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query only transcoding tasks created within the past year.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries details about transcoding jobs based on the transcoding task ID.</p>
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
     * <b>description</b> :
     * <p>You can call this operation to query only transcoding tasks created within the past year.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries details about transcoding jobs based on the transcoding task ID.</p>
     * 
     * @param request GetTranscodeTaskRequest
     * @return GetTranscodeTaskResponse
     */
    public GetTranscodeTaskResponse getTranscodeTask(GetTranscodeTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTranscodeTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation returns information about the specified transcoding template group and the configurations of all the transcoding templates in the group.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a transcoding template group based on the template group ID.</p>
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
     * <b>description</b> :
     * <p>This operation returns information about the specified transcoding template group and the configurations of all the transcoding templates in the group.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a transcoding template group based on the template group ID.</p>
     * 
     * @param request GetTranscodeTemplateGroupRequest
     * @return GetTranscodeTemplateGroupResponse
     */
    public GetTranscodeTemplateGroupResponse getTranscodeTemplateGroup(GetTranscodeTemplateGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTranscodeTemplateGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can query the information about a URL-based upload job by specifying the upload URL or using the job ID returned when you upload media files. The information includes the status of the upload job, custom configurations, the time when the job was created, and the time when the job was complete.
     * If the upload fails, you can view the error code and error message. If the upload is successful, you can obtain the video ID.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about URL-based upload jobs.</p>
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
     * <b>description</b> :
     * <p>You can query the information about a URL-based upload job by specifying the upload URL or using the job ID returned when you upload media files. The information includes the status of the upload job, custom configurations, the time when the job was created, and the time when the job was complete.
     * If the upload fails, you can view the error code and error message. If the upload is successful, you can obtain the video ID.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about URL-based upload jobs.</p>
     * 
     * @param request GetURLUploadInfosRequest
     * @return GetURLUploadInfosResponse
     */
    public GetURLUploadInfosResponse getURLUploadInfos(GetURLUploadInfosRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getURLUploadInfosWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to obtain the upload details only about audio and video files.</p>
     * <ul>
     * <li>If you use the ApsaraVideo VOD console to upload audio and video files, you can call this operation to query information such as the upload ratio. If you use an upload SDK to upload audio and video files, make sure that the version of the <a href="https://help.aliyun.com/document_detail/52200.html">upload SDK</a> meets one of the following requirements:<ul>
     * <li>The version of the upload SDK for Java is 1.4.4 or later.</li>
     * <li>The version of the upload SDK for C++ is 1.0.0 or later.</li>
     * <li>The version of the upload SDK for PHP is 1.0.2 or later.</li>
     * <li>The version of the upload SDK for Python is 1.3.0 or later.</li>
     * <li>The version of the upload SDK for JavaScript is 1.4.0 or later.</li>
     * <li>The version of the upload SDK for Android is 1.5.0 or later.</li>
     * <li>The version of the upload SDK for iOS is 1.5.0 or later.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the upload details, such as the upload time, upload ratio, and upload source, about one or more media files based on the media IDs.</p>
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
     * <b>description</b> :
     * <p>  You can call this operation to obtain the upload details only about audio and video files.</p>
     * <ul>
     * <li>If you use the ApsaraVideo VOD console to upload audio and video files, you can call this operation to query information such as the upload ratio. If you use an upload SDK to upload audio and video files, make sure that the version of the <a href="https://help.aliyun.com/document_detail/52200.html">upload SDK</a> meets one of the following requirements:<ul>
     * <li>The version of the upload SDK for Java is 1.4.4 or later.</li>
     * <li>The version of the upload SDK for C++ is 1.0.0 or later.</li>
     * <li>The version of the upload SDK for PHP is 1.0.2 or later.</li>
     * <li>The version of the upload SDK for Python is 1.3.0 or later.</li>
     * <li>The version of the upload SDK for JavaScript is 1.4.0 or later.</li>
     * <li>The version of the upload SDK for Android is 1.5.0 or later.</li>
     * <li>The version of the upload SDK for iOS is 1.5.0 or later.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the upload details, such as the upload time, upload ratio, and upload source, about one or more media files based on the media IDs.</p>
     * 
     * @param request GetUploadDetailsRequest
     * @return GetUploadDetailsResponse
     */
    public GetUploadDetailsResponse getUploadDetails(GetUploadDetailsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUploadDetailsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>After a media file is uploaded, ApsaraVideo VOD processes the source file. Then, information about the media file is asynchronously generated. You can configure notifications for the <a href="https://help.aliyun.com/document_detail/99935.html">VideoAnalysisComplete</a> event and call this operation to query information about a media file after you receive notifications for the <a href="https://help.aliyun.com/document_detail/99935.html">VideoAnalysisComplete</a> event. For more information, see <a href="https://help.aliyun.com/document_detail/55627.html">Overview</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries information such as the title, description, duration, thumbnail URL, status, creation time, size, snapshots, category, and tags about a single audio or video files based on the ID.</p>
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
     * <b>description</b> :
     * <p>After a media file is uploaded, ApsaraVideo VOD processes the source file. Then, information about the media file is asynchronously generated. You can configure notifications for the <a href="https://help.aliyun.com/document_detail/99935.html">VideoAnalysisComplete</a> event and call this operation to query information about a media file after you receive notifications for the <a href="https://help.aliyun.com/document_detail/99935.html">VideoAnalysisComplete</a> event. For more information, see <a href="https://help.aliyun.com/document_detail/55627.html">Overview</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries information such as the title, description, duration, thumbnail URL, status, creation time, size, snapshots, category, and tags about a single audio or video files based on the ID.</p>
     * 
     * @param request GetVideoInfoRequest
     * @return GetVideoInfoResponse
     */
    public GetVideoInfoResponse getVideoInfo(GetVideoInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getVideoInfoWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can specify up to 20 audio or video file IDs in each request.</p>
     * <ul>
     * <li>After a media file is uploaded, ApsaraVideo VOD processes the source file. Then, information about the media file is asynchronously generated. You can configure notifications for the <a href="https://help.aliyun.com/document_detail/99935.html">VideoAnalysisComplete</a> event and call this operation to query information about a media file after you receive notifications for the <a href="https://help.aliyun.com/document_detail/99935.html">VideoAnalysisComplete</a> event. For more information, see <a href="https://help.aliyun.com/document_detail/55627.html">Overview</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries information such as the title, description, duration, thumbnail URL, status, creation time, size, snapshots, category, and tags about multiple audio or video files based on IDs.</p>
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
     * <b>description</b> :
     * <p>  You can specify up to 20 audio or video file IDs in each request.</p>
     * <ul>
     * <li>After a media file is uploaded, ApsaraVideo VOD processes the source file. Then, information about the media file is asynchronously generated. You can configure notifications for the <a href="https://help.aliyun.com/document_detail/99935.html">VideoAnalysisComplete</a> event and call this operation to query information about a media file after you receive notifications for the <a href="https://help.aliyun.com/document_detail/99935.html">VideoAnalysisComplete</a> event. For more information, see <a href="https://help.aliyun.com/document_detail/55627.html">Overview</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries information such as the title, description, duration, thumbnail URL, status, creation time, size, snapshots, category, and tags about multiple audio or video files based on IDs.</p>
     * 
     * @param request GetVideoInfosRequest
     * @return GetVideoInfosResponse
     */
    public GetVideoInfosResponse getVideoInfos(GetVideoInfosRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getVideoInfosWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query information about media files based on the filter conditions that you specify, such as video status and category ID. Information about a maximum of <strong>5,000</strong> media files can be returned for each request. We recommend that you set the StartTime and EndTime parameters to specify a time range for each request. For more information about how to query information about more media files or even all media files, see <a href="https://help.aliyun.com/document_detail/86044.html">SearchMedia</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries information about media files.</p>
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
     * <b>description</b> :
     * <p>You can call this operation to query information about media files based on the filter conditions that you specify, such as video status and category ID. Information about a maximum of <strong>5,000</strong> media files can be returned for each request. We recommend that you set the StartTime and EndTime parameters to specify a time range for each request. For more information about how to query information about more media files or even all media files, see <a href="https://help.aliyun.com/document_detail/86044.html">SearchMedia</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries information about media files.</p>
     * 
     * @param request GetVideoListRequest
     * @return GetVideoListResponse
     */
    public GetVideoListResponse getVideoList(GetVideoListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getVideoListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to obtain a playback credential when you use ApsaraVideo Player SDK to play a media file based on PlayAuth. The credential is used to obtain the playback URL. For more information, see <a href="https://help.aliyun.com/document_detail/125579.html">ApsaraVideo Player SDK</a>.</p>
     * <ul>
     * <li>You cannot obtain the playback URL of a video by using a credential that has expired. A new credential is required.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the credential required for media playback. ApsaraVideo Player SDK automatically obtains the playback URL based on the playback credential. Each playback credential can be used to obtain the playback URL only for a specific video in a specific period of time. You cannot obtain the playback URL if the credential expires or is incorrect. You can use PlayAuth-based playback when you require high security for audio and video playback.</p>
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
     * <b>description</b> :
     * <p>  You can call this operation to obtain a playback credential when you use ApsaraVideo Player SDK to play a media file based on PlayAuth. The credential is used to obtain the playback URL. For more information, see <a href="https://help.aliyun.com/document_detail/125579.html">ApsaraVideo Player SDK</a>.</p>
     * <ul>
     * <li>You cannot obtain the playback URL of a video by using a credential that has expired. A new credential is required.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the credential required for media playback. ApsaraVideo Player SDK automatically obtains the playback URL based on the playback credential. Each playback credential can be used to obtain the playback URL only for a specific video in a specific period of time. You cannot obtain the playback URL if the credential expires or is incorrect. You can use PlayAuth-based playback when you require high security for audio and video playback.</p>
     * 
     * @param request GetVideoPlayAuthRequest
     * @return GetVideoPlayAuthResponse
     */
    public GetVideoPlayAuthResponse getVideoPlayAuth(GetVideoPlayAuthRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getVideoPlayAuthWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a single snapshot template.</p>
     * 
     * @param request GetVodTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetVodTemplateResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries a single snapshot template.</p>
     * 
     * @param request GetVodTemplateRequest
     * @return GetVodTemplateResponse
     */
    public GetVodTemplateResponse getVodTemplate(GetVodTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getVodTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about an image or text watermark based on the watermark template ID. You can call this operation to obtain information such as the position, size, and display time of an image watermark or the content, position, font, and font color of a text watermark.</p>
     * 
     * @param request GetWatermarkRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetWatermarkResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries the information about an image or text watermark based on the watermark template ID. You can call this operation to obtain information such as the position, size, and display time of an image watermark or the content, position, font, and font color of a text watermark.</p>
     * 
     * @param request GetWatermarkRequest
     * @return GetWatermarkResponse
     */
    public GetWatermarkResponse getWatermark(GetWatermarkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWatermarkWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Regions that support this operation: <strong>China (Beijing)</strong> and <strong>China (Shanghai)</strong>.</p>
     * <ul>
     * <li>You can call this operation to query AI processing results about images of a specified video. Images of different videos cannot be queried in one request.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the AI processing results about the images of a specified video.</p>
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
     * <b>description</b> :
     * <p>  Regions that support this operation: <strong>China (Beijing)</strong> and <strong>China (Shanghai)</strong>.</p>
     * <ul>
     * <li>You can call this operation to query AI processing results about images of a specified video. Images of different videos cannot be queried in one request.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the AI processing results about the images of a specified video.</p>
     * 
     * @param request ListAIImageInfoRequest
     * @return ListAIImageInfoResponse
     */
    public ListAIImageInfoResponse listAIImageInfo(ListAIImageInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAIImageInfoWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Regions that support this operation: <strong>China (Beijing)</strong>, <strong>China (Shanghai)</strong>, and <strong>Singapore</strong>.</p>
     * <ul>
     * <li>You can call this operation to query video fingerprinting jobs and smart tagging jobs.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries AI jobs. After a job is submitted, ApsaraVideo VOD asynchronously processes the job. You can call this operation to query the job information in real time.</p>
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
     * <b>description</b> :
     * <p>  Regions that support this operation: <strong>China (Beijing)</strong>, <strong>China (Shanghai)</strong>, and <strong>Singapore</strong>.</p>
     * <ul>
     * <li>You can call this operation to query video fingerprinting jobs and smart tagging jobs.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries AI jobs. After a job is submitted, ApsaraVideo VOD asynchronously processes the job. You can call this operation to query the job information in real time.</p>
     * 
     * @param request ListAIJobRequest
     * @return ListAIJobResponse
     */
    public ListAIJobResponse listAIJob(ListAIJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAIJobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Regions that support this operation: <strong>China (Beijing)</strong>, <strong>China (Shanghai)</strong>, and <strong>Singapore</strong>.</p>
     * <ul>
     * <li>You can call this operation to query AI templates of a specified type.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries AI templates.</p>
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
     * <b>description</b> :
     * <p>  Regions that support this operation: <strong>China (Beijing)</strong>, <strong>China (Shanghai)</strong>, and <strong>Singapore</strong>.</p>
     * <ul>
     * <li>You can call this operation to query AI templates of a specified type.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries AI templates.</p>
     * 
     * @param request ListAITemplateRequest
     * @return ListAITemplateResponse
     */
    public ListAITemplateResponse listAITemplate(ListAITemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAITemplateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Supports filtering queries by application status.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the applications that you are authorized to manage based on query conditions.</p>
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
     * <b>description</b> :
     * <p>Supports filtering queries by application status.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the applications that you are authorized to manage based on query conditions.</p>
     * 
     * @param request ListAppInfoRequest
     * @return ListAppInfoResponse
     */
    public ListAppInfoResponse listAppInfo(ListAppInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAppInfoWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>The IdentityType and IdentityName parameters take effect only when an identity assumes the application administrator role to call this operation. Otherwise, only application policies that are attached to the current identity are returned.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the application policies that are attached to the specified identity. The identity may be a RAM user or RAM role.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>The IdentityType and IdentityName parameters take effect only when an identity assumes the application administrator role to call this operation. Otherwise, only application policies that are attached to the current identity are returned.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the application policies that are attached to the specified identity. The identity may be a RAM user or RAM role.</p>
     * 
     * @param request ListAppPoliciesForIdentityRequest
     * @return ListAppPoliciesForIdentityResponse
     */
    public ListAppPoliciesForIdentityResponse listAppPoliciesForIdentity(ListAppPoliciesForIdentityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAppPoliciesForIdentityWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the IP addresses in a review security group.</p>
     * 
     * @param request ListAuditSecurityIpRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAuditSecurityIpResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries the IP addresses in a review security group.</p>
     * 
     * @param request ListAuditSecurityIpRequest
     * @return ListAuditSecurityIpResponse
     */
    public ListAuditSecurityIpResponse listAuditSecurityIp(ListAuditSecurityIpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAuditSecurityIpWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about animated stickers of a video based on the video ID.</p>
     * 
     * @param request ListDynamicImageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDynamicImageResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries the information about animated stickers of a video based on the video ID.</p>
     * 
     * @param request ListDynamicImageRequest
     * @return ListDynamicImageResponse
     */
    public ListDynamicImageResponse listDynamicImage(ListDynamicImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDynamicImageWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can query up to 5,000 videos based on the specified filter condition.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries live-to-VOD videos.</p>
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
     * <b>description</b> :
     * <p>You can query up to 5,000 videos based on the specified filter condition.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries live-to-VOD videos.</p>
     * 
     * @param request ListLiveRecordVideoRequest
     * @return ListLiveRecordVideoResponse
     */
    public ListLiveRecordVideoResponse listLiveRecordVideo(ListLiveRecordVideoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listLiveRecordVideoWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>If multiple snapshots of a video exist, the data of the latest snapshot is returned.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the snapshots that are captured from the specified media.</p>
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
     * <b>description</b> :
     * <p>If multiple snapshots of a video exist, the data of the latest snapshot is returned.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the snapshots that are captured from the specified media.</p>
     * 
     * @param request ListSnapshotsRequest
     * @return ListSnapshotsResponse
     */
    public ListSnapshotsResponse listSnapshots(ListSnapshotsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSnapshotsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can call the <a href="https://help.aliyun.com/document_detail/109121.html">GetTranscodeTask</a> operation to query details about transcoding jobs.</p>
     * <ul>
     * <li><strong>You can call this operation to query only transcoding tasks created within the past year.</strong></li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries transcoding tasks based on the media ID. This operation does not return specific job information.</p>
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
     * <b>description</b> :
     * <p>  You can call the <a href="https://help.aliyun.com/document_detail/109121.html">GetTranscodeTask</a> operation to query details about transcoding jobs.</p>
     * <ul>
     * <li><strong>You can call this operation to query only transcoding tasks created within the past year.</strong></li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries transcoding tasks based on the media ID. This operation does not return specific job information.</p>
     * 
     * @param request ListTranscodeTaskRequest
     * @return ListTranscodeTaskResponse
     */
    public ListTranscodeTaskResponse listTranscodeTask(ListTranscodeTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTranscodeTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This operation does not return the configurations of transcoding templates in each transcoding template group. To query the configurations of transcoding templates in a specific transcoding template group, call the <a href="https://help.aliyun.com/document_detail/102670.html">GetTranscodeTemplateGroup</a> operation.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries transcoding template groups.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>This operation does not return the configurations of transcoding templates in each transcoding template group. To query the configurations of transcoding templates in a specific transcoding template group, call the <a href="https://help.aliyun.com/document_detail/102670.html">GetTranscodeTemplateGroup</a> operation.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries transcoding template groups.</p>
     * 
     * @param request ListTranscodeTemplateGroupRequest
     * @return ListTranscodeTemplateGroupResponse
     */
    public ListTranscodeTemplateGroupResponse listTranscodeTemplateGroup(ListTranscodeTemplateGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTranscodeTemplateGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries snapshot templates.</p>
     * 
     * @param request ListVodTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListVodTemplateResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries snapshot templates.</p>
     * 
     * @param request ListVodTemplateRequest
     * @return ListVodTemplateResponse
     */
    public ListVodTemplateResponse listVodTemplate(ListVodTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listVodTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the configuration information about all image and text watermark templates in a region. You can call this operation to obtain information such as the position, size, and display time of image watermarks or the content, position, font, and font color of text watermarks.</p>
     * 
     * @param request ListWatermarkRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListWatermarkResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries the configuration information about all image and text watermark templates in a region. You can call this operation to obtain information such as the position, size, and display time of image watermarks or the content, position, font, and font color of text watermarks.</p>
     * 
     * @param request ListWatermarkRequest
     * @return ListWatermarkResponse
     */
    public ListWatermarkResponse listWatermark(ListWatermarkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listWatermarkWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Migrates resources between applications. The application administrator can directly migrate resources between applications. Resource Access Management (RAM) users or RAM roles must obtain the write permissions on the source and destination applications before they migrate resources between applications. Multiple resources can be migrated at a time.</p>
     * 
     * @param request MoveAppResourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return MoveAppResourceResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Migrates resources between applications. The application administrator can directly migrate resources between applications. Resource Access Management (RAM) users or RAM roles must obtain the write permissions on the source and destination applications before they migrate resources between applications. Multiple resources can be migrated at a time.</p>
     * 
     * @param request MoveAppResourceRequest
     * @return MoveAppResourceResponse
     */
    public MoveAppResourceResponse moveAppResource(MoveAppResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.moveAppResourceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>This operation is available only in the <strong>China (Shanghai)</strong> region.</li>
     * <li>You can submit a maximum of 500 requests to prefetch resources based on URLs each day by using an Alibaba Cloud account. You cannot prefetch resources based on directories.</li>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/69215.html">RefreshVodObjectCaches</a> operation to refresh content and the <a href="https://help.aliyun.com/document_detail/69211.htmll">PreloadVodObjectCaches</a> operation to prefetch content.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Prefetches resources from an origin server to L2 nodes. Users can directly hit the cache upon their first visits. This way, workloads on the origin server can be reduced.</p>
     * 
     * @param request PreloadVodObjectCachesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PreloadVodObjectCachesResponse
     */
    public PreloadVodObjectCachesResponse preloadVodObjectCachesWithOptions(PreloadVodObjectCachesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.area)) {
            query.put("Area", request.area);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.l2Preload)) {
            query.put("L2Preload", request.l2Preload);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.objectPath)) {
            query.put("ObjectPath", request.objectPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.withHeader)) {
            query.put("WithHeader", request.withHeader);
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
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>This operation is available only in the <strong>China (Shanghai)</strong> region.</li>
     * <li>You can submit a maximum of 500 requests to prefetch resources based on URLs each day by using an Alibaba Cloud account. You cannot prefetch resources based on directories.</li>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/69215.html">RefreshVodObjectCaches</a> operation to refresh content and the <a href="https://help.aliyun.com/document_detail/69211.htmll">PreloadVodObjectCaches</a> operation to prefetch content.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Prefetches resources from an origin server to L2 nodes. Users can directly hit the cache upon their first visits. This way, workloads on the origin server can be reduced.</p>
     * 
     * @param request PreloadVodObjectCachesRequest
     * @return PreloadVodObjectCachesResponse
     */
    public PreloadVodObjectCachesResponse preloadVodObjectCaches(PreloadVodObjectCachesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.preloadVodObjectCachesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  <strong>Make sure that you understand the billing methods and price of ApsaraVideo VOD before you call this operation. You are charged for using the online editing feature. For more information, see <a href="~~188310#section-pyv-b8h-bo7~~">Billing</a>.</strong></p>
     * <ul>
     * <li>This operation returns only the submission result of a video production task. When the submission result is returned, video production may still be in progress. After a video production task is submitted, the task is queued in the background for asynchronous processing.</li>
     * <li>The source files that are used in the timeline of an online editing project can be materials directly uploaded to the online project or selected from the media asset library.</li>
     * <li>Videos are produced based on ProjectId and Timeline. The following content describes the parameter configurations:<ul>
     * <li>You must specify ProjectId or Timeline. If you leave both parameters empty, the video cannot be produced.</li>
     * <li>If you specify Timeline and leave ProjectId empty, the system automatically creates an online editing project based on Timeline and adds the materials specified in the Timeline to the project to produce videos.</li>
     * <li>If you specify ProjectId and leave Timeline empty, the system automatically uses the latest timeline information of the project to produce videos.</li>
     * <li>If you specify both ProjectId and Timeline, the system automatically uses the timeline information that you specified to produce videos and updates the project timeline and materials. You can also specify other parameters to update the corresponding information about the online editing project.</li>
     * </ul>
     * </li>
     * <li>After a video is produced, the video is automatically uploaded to ApsaraVideo VOD. Then, the <strong>ProduceMediaComplete</strong> and <strong>FileUploadComplete</strong> event notifications are sent to you. After the produced video is transcoded, the <strong>StreamTranscodeComplete</strong> and <strong>TranscodeComplete</strong> event notifications are sent to you.</li>
     * <li>You can add special effects to the video. For more information, see <a href="https://help.aliyun.com/document_detail/69082.html">Special effects</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Produces a video from one or more source files. You can directly specify source files by configuring the Timeline parameter. Alternatively, you can specify source files after you create an online editing project.</p>
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
     * <b>description</b> :
     * <p>  <strong>Make sure that you understand the billing methods and price of ApsaraVideo VOD before you call this operation. You are charged for using the online editing feature. For more information, see <a href="~~188310#section-pyv-b8h-bo7~~">Billing</a>.</strong></p>
     * <ul>
     * <li>This operation returns only the submission result of a video production task. When the submission result is returned, video production may still be in progress. After a video production task is submitted, the task is queued in the background for asynchronous processing.</li>
     * <li>The source files that are used in the timeline of an online editing project can be materials directly uploaded to the online project or selected from the media asset library.</li>
     * <li>Videos are produced based on ProjectId and Timeline. The following content describes the parameter configurations:<ul>
     * <li>You must specify ProjectId or Timeline. If you leave both parameters empty, the video cannot be produced.</li>
     * <li>If you specify Timeline and leave ProjectId empty, the system automatically creates an online editing project based on Timeline and adds the materials specified in the Timeline to the project to produce videos.</li>
     * <li>If you specify ProjectId and leave Timeline empty, the system automatically uses the latest timeline information of the project to produce videos.</li>
     * <li>If you specify both ProjectId and Timeline, the system automatically uses the timeline information that you specified to produce videos and updates the project timeline and materials. You can also specify other parameters to update the corresponding information about the online editing project.</li>
     * </ul>
     * </li>
     * <li>After a video is produced, the video is automatically uploaded to ApsaraVideo VOD. Then, the <strong>ProduceMediaComplete</strong> and <strong>FileUploadComplete</strong> event notifications are sent to you. After the produced video is transcoded, the <strong>StreamTranscodeComplete</strong> and <strong>TranscodeComplete</strong> event notifications are sent to you.</li>
     * <li>You can add special effects to the video. For more information, see <a href="https://help.aliyun.com/document_detail/69082.html">Special effects</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Produces a video from one or more source files. You can directly specify source files by configuring the Timeline parameter. Alternatively, you can specify source files after you create an online editing project.</p>
     * 
     * @param request ProduceEditingProjectVideoRequest
     * @return ProduceEditingProjectVideoResponse
     */
    public ProduceEditingProjectVideoResponse produceEditingProjectVideo(ProduceEditingProjectVideoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.produceEditingProjectVideoWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>ApsaraVideo VOD allows you to refresh and prefetch resources. The refresh feature forces the point of presence (POP) to clear cached resources and retrieve the latest resources from origin servers. The prefetch feature allows the POP to retrieve frequently accessed resources from origin servers during off-peak hours. This increases the cache hit ratio.</li>
     * <li>You can call this operation to submit refresh or prefetch tasks based on the media ID. You can also specify the format and resolution of the media streams to refresh or prefetch based on your business requirements.</li>
     * <li>You can submit a maximum of 20 refresh or prefetch tasks at a time.</li>
     * </ul>
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limits on API operations in ApsaraVideo VoD</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Submits media refresh or prefetch tasks based on the media IDs.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>ApsaraVideo VOD allows you to refresh and prefetch resources. The refresh feature forces the point of presence (POP) to clear cached resources and retrieve the latest resources from origin servers. The prefetch feature allows the POP to retrieve frequently accessed resources from origin servers during off-peak hours. This increases the cache hit ratio.</li>
     * <li>You can call this operation to submit refresh or prefetch tasks based on the media ID. You can also specify the format and resolution of the media streams to refresh or prefetch based on your business requirements.</li>
     * <li>You can submit a maximum of 20 refresh or prefetch tasks at a time.</li>
     * </ul>
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limits on API operations in ApsaraVideo VoD</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Submits media refresh or prefetch tasks based on the media IDs.</p>
     * 
     * @param request RefreshMediaPlayUrlsRequest
     * @return RefreshMediaPlayUrlsResponse
     */
    public RefreshMediaPlayUrlsResponse refreshMediaPlayUrls(RefreshMediaPlayUrlsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.refreshMediaPlayUrlsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can also call this operation to overwrite the source file of an audio or video file. After you call this operation, the system obtains the upload URL and uploads a new source file without changing the ID of the audio or video file. If you have configured transcoding or snapshot capture for the upload, the transcoding or snapshot capture job is automatically triggered. For more information, see <a href="https://help.aliyun.com/document_detail/55397.html">Upload URLs and credentials</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains a new upload credential after a file failed to be uploaded.</p>
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
     * <b>description</b> :
     * <p>You can also call this operation to overwrite the source file of an audio or video file. After you call this operation, the system obtains the upload URL and uploads a new source file without changing the ID of the audio or video file. If you have configured transcoding or snapshot capture for the upload, the transcoding or snapshot capture job is automatically triggered. For more information, see <a href="https://help.aliyun.com/document_detail/55397.html">Upload URLs and credentials</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains a new upload credential after a file failed to be uploaded.</p>
     * 
     * @param request RefreshUploadVideoRequest
     * @return RefreshUploadVideoResponse
     */
    public RefreshUploadVideoResponse refreshUploadVideo(RefreshUploadVideoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.refreshUploadVideoWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  This operation is available only in the <strong>China (Shanghai)</strong> region.</p>
     * <ul>
     * <li>You can submit a maximum of 2,000 requests to refresh resources based on URLs and 100 requests to refresh resources based on directories each day by using an Alibaba Cloud account.</li>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/69215.html">RefreshVodObjectCaches</a> operation to refresh content and the <a href="https://help.aliyun.com/document_detail/69211.html">PreloadVodObjectCaches</a> operation to prefetch content.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Refreshes files on Alibaba Cloud CDN nodes. You can refresh multiple files at a time based on URLs.</p>
     * 
     * @param request RefreshVodObjectCachesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RefreshVodObjectCachesResponse
     */
    public RefreshVodObjectCachesResponse refreshVodObjectCachesWithOptions(RefreshVodObjectCachesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.force)) {
            query.put("Force", request.force);
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
     * <b>description</b> :
     * <p>  This operation is available only in the <strong>China (Shanghai)</strong> region.</p>
     * <ul>
     * <li>You can submit a maximum of 2,000 requests to refresh resources based on URLs and 100 requests to refresh resources based on directories each day by using an Alibaba Cloud account.</li>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/69215.html">RefreshVodObjectCaches</a> operation to refresh content and the <a href="https://help.aliyun.com/document_detail/69211.html">PreloadVodObjectCaches</a> operation to prefetch content.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Refreshes files on Alibaba Cloud CDN nodes. You can refresh multiple files at a time based on URLs.</p>
     * 
     * @param request RefreshVodObjectCachesRequest
     * @return RefreshVodObjectCachesResponse
     */
    public RefreshVodObjectCachesResponse refreshVodObjectCaches(RefreshVodObjectCachesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.refreshVodObjectCachesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  After you add an OSS bucket to ApsaraVideo VOD, you must register media files in the OSS bucket to generate the required information. Then, you can use media IDs for features such as transcoding, snapshot capture, and AI processing.use features such as xxx on media files by specifying their IDs?</p>
     * <ul>
     * <li>You can register up to 10 media files in an OSS bucket in a request. The media files must be stored in the same bucket.</li>
     * <li>If you do not specify a transcoding template group ID when you upload a media file to ApsaraVideo VOD, the media file is automatically transcoded based on the default template group. If you do not specify a transcoding template group ID after you register a media file, the media file is not automatically transcoded. The registered media files are automatically transcoded only if you specify a transcoding template group ID.</li>
     * <li>If the media file that you want to register has been registered, this operation returns only the unique media ID that is associated with the media file. No further operation is performed.</li>
     * <li>Make sure that the media file that you want to register has a valid suffix. Otherwise, the registration fails.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Registers media files. After you add an Object Storage Service (OSS) bucket to ApsaraVideo VOD, you must register the media files in the bucket to generate the required information before you use features such as transcoding and snapshot capture on the media files.</p>
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
     * <b>description</b> :
     * <p>  After you add an OSS bucket to ApsaraVideo VOD, you must register media files in the OSS bucket to generate the required information. Then, you can use media IDs for features such as transcoding, snapshot capture, and AI processing.use features such as xxx on media files by specifying their IDs?</p>
     * <ul>
     * <li>You can register up to 10 media files in an OSS bucket in a request. The media files must be stored in the same bucket.</li>
     * <li>If you do not specify a transcoding template group ID when you upload a media file to ApsaraVideo VOD, the media file is automatically transcoded based on the default template group. If you do not specify a transcoding template group ID after you register a media file, the media file is not automatically transcoded. The registered media files are automatically transcoded only if you specify a transcoding template group ID.</li>
     * <li>If the media file that you want to register has been registered, this operation returns only the unique media ID that is associated with the media file. No further operation is performed.</li>
     * <li>Make sure that the media file that you want to register has a valid suffix. Otherwise, the registration fails.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Registers media files. After you add an Object Storage Service (OSS) bucket to ApsaraVideo VOD, you must register the media files in the bucket to generate the required information before you use features such as transcoding and snapshot capture on the media files.</p>
     * 
     * @param request RegisterMediaRequest
     * @return RegisterMediaResponse
     */
    public RegisterMediaResponse registerMedia(RegisterMediaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.registerMediaWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to restore only Archive and Cold Archive audio and video files. You can access the audio and video files after the files are restored. You cannot change the storage class of an audio or video file that is being restored. You are charged for the retrieval traffic generated during restoration. After a Cold Archive audio or video file is restored, a Standard replica of the file is generated for access. You are charged for the storage of the replica before the file returns to the frozen state.</p>
     * 
     * <b>summary</b> : 
     * <p>Restores media assets.</p>
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
     * <b>description</b> :
     * <p>You can call this operation to restore only Archive and Cold Archive audio and video files. You can access the audio and video files after the files are restored. You cannot change the storage class of an audio or video file that is being restored. You are charged for the retrieval traffic generated during restoration. After a Cold Archive audio or video file is restored, a Standard replica of the file is generated for access. You are charged for the storage of the replica before the file returns to the frozen state.</p>
     * 
     * <b>summary</b> : 
     * <p>Restores media assets.</p>
     * 
     * @param request RestoreMediaRequest
     * @return RestoreMediaResponse
     */
    public RestoreMediaResponse restoreMedia(RestoreMediaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.restoreMediaWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries online editing projects.</p>
     * 
     * @param request SearchEditingProjectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SearchEditingProjectResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries online editing projects.</p>
     * 
     * @param request SearchEditingProjectRequest
     * @return SearchEditingProjectResponse
     */
    public SearchEditingProjectResponse searchEditingProject(SearchEditingProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchEditingProjectWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The maximum number of data records that you can query varies based on the method used to query the data. You can use the following methods to query data:</p>
     * <ul>
     * <li>Method 1: Traverse data by page
     * You can use the PageNo and PageSize parameters to traverse up to 5,000 data records that meet the specified filter condition. PageNo specifies the page number and PageSize specifies the number of data records displayed on a page. If the number of data records that meet the specified filter condition exceeds 5,000, change the filter conditions to narrow down the results. You cannot use this method to traverse all data records. If you want to traverse more data records, use Method 2.</li>
     * <li>Method 2: Traverse all data (available only for audio and video files)
     * You can use this method to traverse up to 2 million data records related to audio and video files. If the number of data records that meet the specified filter condition exceeds 2 million, change the filter conditions to narrow down the results. To traverse data page by page, you must set the PageNo, PageSize, and ScrollToken parameters. The total number of data records from the current page to the target page cannot exceed 100. For example, you set PageSize to 20. The following content describes the traverse logic:<ul>
     * <li>When the PageNo parameter is set to 1, you can traverse data records from page 1 to page 5.</li>
     * <li>When the PageNo parameter is set to 2, you can traverse data records from page 2 to page 6.
     * Make sure that you set the appropriate page number and page size, and use a traverse method based on the number of results that meet your filter condition.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries information about videos, audio, images, and auxiliary media assets. You can call this operation and specify the search protocol to query media assets based on the return fields, fields used for exact match, fields used for fuzzy match, fields used for a multi-value query, fields used for a range query, and sort fields.</p>
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
     * <b>description</b> :
     * <p>The maximum number of data records that you can query varies based on the method used to query the data. You can use the following methods to query data:</p>
     * <ul>
     * <li>Method 1: Traverse data by page
     * You can use the PageNo and PageSize parameters to traverse up to 5,000 data records that meet the specified filter condition. PageNo specifies the page number and PageSize specifies the number of data records displayed on a page. If the number of data records that meet the specified filter condition exceeds 5,000, change the filter conditions to narrow down the results. You cannot use this method to traverse all data records. If you want to traverse more data records, use Method 2.</li>
     * <li>Method 2: Traverse all data (available only for audio and video files)
     * You can use this method to traverse up to 2 million data records related to audio and video files. If the number of data records that meet the specified filter condition exceeds 2 million, change the filter conditions to narrow down the results. To traverse data page by page, you must set the PageNo, PageSize, and ScrollToken parameters. The total number of data records from the current page to the target page cannot exceed 100. For example, you set PageSize to 20. The following content describes the traverse logic:<ul>
     * <li>When the PageNo parameter is set to 1, you can traverse data records from page 1 to page 5.</li>
     * <li>When the PageNo parameter is set to 2, you can traverse data records from page 2 to page 6.
     * Make sure that you set the appropriate page number and page size, and use a traverse method based on the number of results that meet your filter condition.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries information about videos, audio, images, and auxiliary media assets. You can call this operation and specify the search protocol to query media assets based on the return fields, fields used for exact match, fields used for fuzzy match, fields used for a multi-value query, fields used for a range query, and sort fields.</p>
     * 
     * @param request SearchMediaRequest
     * @return SearchMediaResponse
     */
    public SearchMediaResponse searchMedia(SearchMediaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchMediaWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can play videos in the Checking or Blocked state only from the IP addresses that are added to review security groups.</p>
     * 
     * <b>summary</b> : 
     * <p>Manages the IP addresses in review security groups.</p>
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
     * <b>description</b> :
     * <p>You can play videos in the Checking or Blocked state only from the IP addresses that are added to review security groups.</p>
     * 
     * <b>summary</b> : 
     * <p>Manages the IP addresses in review security groups.</p>
     * 
     * @param request SetAuditSecurityIpRequest
     * @return SetAuditSecurityIpResponse
     */
    public SetAuditSecurityIpResponse setAuditSecurityIp(SetAuditSecurityIpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setAuditSecurityIpWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>After you use the cross-domain policy file to update the resources on the origin server, you must refresh the resources that are cached on Alibaba Cloud CDN nodes. You can use the ApsaraVideo VOD console to refresh resources. For more information, see <a href="https://help.aliyun.com/document_detail/86098.html">Refresh and prefetch</a>. Alternatively, you can call the <a href="https://help.aliyun.com/document_detail/69215.html">RefreshVodObjectCaches</a> operation to refresh resources.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Updates the cross-domain policy file crossdomain.xml.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>After you use the cross-domain policy file to update the resources on the origin server, you must refresh the resources that are cached on Alibaba Cloud CDN nodes. You can use the ApsaraVideo VOD console to refresh resources. For more information, see <a href="https://help.aliyun.com/document_detail/86098.html">Refresh and prefetch</a>. Alternatively, you can call the <a href="https://help.aliyun.com/document_detail/69215.html">RefreshVodObjectCaches</a> operation to refresh resources.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Updates the cross-domain policy file crossdomain.xml.</p>
     * 
     * @param request SetCrossdomainContentRequest
     * @return SetCrossdomainContentResponse
     */
    public SetCrossdomainContentResponse setCrossdomainContent(SetCrossdomainContentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setCrossdomainContentWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Specifies an AI template as the default template.</p>
     * 
     * <b>summary</b> : 
     * <p>Specifies an AI template as the default template.</p>
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
     * <b>description</b> :
     * <p>Specifies an AI template as the default template.</p>
     * 
     * <b>summary</b> : 
     * <p>Specifies an AI template as the default template.</p>
     * 
     * @param request SetDefaultAITemplateRequest
     * @return SetDefaultAITemplateResponse
     */
    public SetDefaultAITemplateResponse setDefaultAITemplate(SetDefaultAITemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setDefaultAITemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Specifies a transcoding template group as the default one.</p>
     * 
     * @param request SetDefaultTranscodeTemplateGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetDefaultTranscodeTemplateGroupResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Specifies a transcoding template group as the default one.</p>
     * 
     * @param request SetDefaultTranscodeTemplateGroupRequest
     * @return SetDefaultTranscodeTemplateGroupResponse
     */
    public SetDefaultTranscodeTemplateGroupResponse setDefaultTranscodeTemplateGroup(SetDefaultTranscodeTemplateGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setDefaultTranscodeTemplateGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Sets a watermark template as the default one.</p>
     * 
     * @param request SetDefaultWatermarkRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetDefaultWatermarkResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Sets a watermark template as the default one.</p>
     * 
     * @param request SetDefaultWatermarkRequest
     * @return SetDefaultWatermarkResponse
     */
    public SetDefaultWatermarkResponse setDefaultWatermark(SetDefaultWatermarkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setDefaultWatermarkWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Specifies the media assets that you want to edit in an online editing project.</p>
     * 
     * @param request SetEditingProjectMaterialsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetEditingProjectMaterialsResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Specifies the media assets that you want to edit in an online editing project.</p>
     * 
     * @param request SetEditingProjectMaterialsRequest
     * @return SetEditingProjectMaterialsResponse
     */
    public SetEditingProjectMaterialsResponse setEditingProjectMaterials(SetEditingProjectMaterialsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setEditingProjectMaterialsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>HTTP callbacks and MNS callbacks are supported. For more information, see <a href="https://help.aliyun.com/document_detail/55627.html">Overview</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Sets the callback method, callback URL, and event type of an event notification.</p>
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
     * <b>description</b> :
     * <p>HTTP callbacks and MNS callbacks are supported. For more information, see <a href="https://help.aliyun.com/document_detail/55627.html">Overview</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Sets the callback method, callback URL, and event type of an event notification.</p>
     * 
     * @param request SetMessageCallbackRequest
     * @return SetMessageCallbackResponse
     */
    public SetMessageCallbackResponse setMessageCallback(SetMessageCallbackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setMessageCallbackWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This operation is available only in the <strong>China (Shanghai)</strong> region.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Enables or disables the certificate of a domain name and modifies the certificate information.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>This operation is available only in the <strong>China (Shanghai)</strong> region.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Enables or disables the certificate of a domain name and modifies the certificate information.</p>
     * 
     * @param request SetVodDomainCertificateRequest
     * @return SetVodDomainCertificateResponse
     */
    public SetVodDomainCertificateResponse setVodDomainCertificate(SetVodDomainCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setVodDomainCertificateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation is available only in the Singapore region.</p>
     * 
     * <b>summary</b> : 
     * <p>Submits an automated review job for an image. After the job is submitted, the job is processed in an asynchronous manner. The operation may return a response before the job is complete.</p>
     * 
     * @param request SubmitAIImageAuditJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitAIImageAuditJobResponse
     */
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

    /**
     * <b>description</b> :
     * <p>This operation is available only in the Singapore region.</p>
     * 
     * <b>summary</b> : 
     * <p>Submits an automated review job for an image. After the job is submitted, the job is processed in an asynchronous manner. The operation may return a response before the job is complete.</p>
     * 
     * @param request SubmitAIImageAuditJobRequest
     * @return SubmitAIImageAuditJobResponse
     */
    public SubmitAIImageAuditJobResponse submitAIImageAuditJob(SubmitAIImageAuditJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitAIImageAuditJobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Regions that support this operation: <strong>China (Beijing)</strong> and <strong>China (Shanghai)</strong>.</p>
     * <ul>
     * <li>After you call this operation, you can call the <a href="https://help.aliyun.com/document_detail/186923.html">GetAIImageJobs</a> operation to query the job execution result.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Submits jobs of image AI processing.</p>
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
     * <b>description</b> :
     * <p>  Regions that support this operation: <strong>China (Beijing)</strong> and <strong>China (Shanghai)</strong>.</p>
     * <ul>
     * <li>After you call this operation, you can call the <a href="https://help.aliyun.com/document_detail/186923.html">GetAIImageJobs</a> operation to query the job execution result.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Submits jobs of image AI processing.</p>
     * 
     * @param request SubmitAIImageJobRequest
     * @return SubmitAIImageJobResponse
     */
    public SubmitAIImageJobResponse submitAIImageJob(SubmitAIImageJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitAIImageJobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  <strong>Make sure that you understand the billing method and price of ApsaraVideo VOD before you call this operation. You are charged for using the smart tagging and video fingerprinting features. For more information, see <a href="~~188310#section-g7l-s3o-9ng~~">Billing of video AI</a>.</strong></p>
     * <ul>
     * <li>Regions that support the video fingerprinting feature: <strong>China (Beijing)</strong>, <strong>China (Shanghai)</strong>, and <strong>Singapore</strong>. Regions that support the smart tagging feature: <strong>China (Beijing)</strong> and <strong>China (Shanghai)</strong>.</li>
     * <li>You need to enable the video fingerprinting feature or the smart tagging feature before you can call this operation to submit jobs. For more information, see <a href="https://help.aliyun.com/document_detail/101148.html">Video AI</a>.</li>
     * <li>If this is the first time you use the video fingerprinting feature, you must <a href="https://yida.alibaba-inc.com/o/ticketapply">submit a ticket</a> to apply for using the media fingerprint library for free. Otherwise, the video fingerprinting feature will be affected.</li>
     * <li>After you submit an AI job, ApsaraVideo VOD asynchronously processes the job. The operation may return a response before the job is complete. You can configure the <a href="https://help.aliyun.com/document_detail/55627.html">Event Notification</a> feature and set the callback event to <strong>AI Processing Completed</strong>. After you receive the event notification, you can query the execution result of the AI job.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Submits a smart tagging or video fingerprinting job.</p>
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
     * <b>description</b> :
     * <p>  <strong>Make sure that you understand the billing method and price of ApsaraVideo VOD before you call this operation. You are charged for using the smart tagging and video fingerprinting features. For more information, see <a href="~~188310#section-g7l-s3o-9ng~~">Billing of video AI</a>.</strong></p>
     * <ul>
     * <li>Regions that support the video fingerprinting feature: <strong>China (Beijing)</strong>, <strong>China (Shanghai)</strong>, and <strong>Singapore</strong>. Regions that support the smart tagging feature: <strong>China (Beijing)</strong> and <strong>China (Shanghai)</strong>.</li>
     * <li>You need to enable the video fingerprinting feature or the smart tagging feature before you can call this operation to submit jobs. For more information, see <a href="https://help.aliyun.com/document_detail/101148.html">Video AI</a>.</li>
     * <li>If this is the first time you use the video fingerprinting feature, you must <a href="https://yida.alibaba-inc.com/o/ticketapply">submit a ticket</a> to apply for using the media fingerprint library for free. Otherwise, the video fingerprinting feature will be affected.</li>
     * <li>After you submit an AI job, ApsaraVideo VOD asynchronously processes the job. The operation may return a response before the job is complete. You can configure the <a href="https://help.aliyun.com/document_detail/55627.html">Event Notification</a> feature and set the callback event to <strong>AI Processing Completed</strong>. After you receive the event notification, you can query the execution result of the AI job.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Submits a smart tagging or video fingerprinting job.</p>
     * 
     * @param request SubmitAIJobRequest
     * @return SubmitAIJobResponse
     */
    public SubmitAIJobResponse submitAIJob(SubmitAIJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitAIJobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  <strong>Make sure that you understand the billing methods and price of ApsaraVideo VOD before you call this operation. You are charged for using the automated review feature. For more information about billing, submit a ticket or contact your account manager.</strong></p>
     * <ul>
     * <li>You can call this operation only in the <strong>China (Shanghai)</strong>, <strong>China (Beijing)</strong>, and <strong>Singapore</strong> regions.</li>
     * <li>For more information, see <a href="https://help.aliyun.com/document_detail/101148.html">Automated review</a>.</li>
     * <li>After an automated review job is complete, the images generated during the review are stored in the VOD bucket for two weeks free of charge. The images are automatically deleted after two weeks.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Submits an automated review job for a media file. After the job is submitted, ApsaraVideo VOD asynchronously processes the job. Therefore, the operation may return a response before the job is complete.</p>
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
     * <b>description</b> :
     * <p>  <strong>Make sure that you understand the billing methods and price of ApsaraVideo VOD before you call this operation. You are charged for using the automated review feature. For more information about billing, submit a ticket or contact your account manager.</strong></p>
     * <ul>
     * <li>You can call this operation only in the <strong>China (Shanghai)</strong>, <strong>China (Beijing)</strong>, and <strong>Singapore</strong> regions.</li>
     * <li>For more information, see <a href="https://help.aliyun.com/document_detail/101148.html">Automated review</a>.</li>
     * <li>After an automated review job is complete, the images generated during the review are stored in the VOD bucket for two weeks free of charge. The images are automatically deleted after two weeks.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Submits an automated review job for a media file. After the job is submitted, ApsaraVideo VOD asynchronously processes the job. Therefore, the operation may return a response before the job is complete.</p>
     * 
     * @param request SubmitAIMediaAuditJobRequest
     * @return SubmitAIMediaAuditJobResponse
     */
    public SubmitAIMediaAuditJobResponse submitAIMediaAuditJob(SubmitAIMediaAuditJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitAIMediaAuditJobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  <strong>Make sure that you understand the billing methods and price of ApsaraVideo VOD before you call this operation. You are charged for generating and extracting digital watermarks. For more information, see <a href="~~188310#62b9c940403se~~">Billing</a>.</strong></p>
     * <ul>
     * <li>This operation is supported only in the <strong>China (Shanghai)</strong> and <strong>China (Beijing)</strong> regions.</li>
     * <li>Before you submit a digital watermark extraction job, make sure that the following conditions are met:<ul>
     * <li>The video from which you want to extract the watermark is uploaded to the ApsaraVideo VOD.</li>
     * <li>The video from which you want to extract the watermark is longer than 6 minutes.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Submits a digital watermark extraction job. You can call this operation to asynchronously extract a copyright watermark or user-tracing watermark.</p>
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
     * <b>description</b> :
     * <p>  <strong>Make sure that you understand the billing methods and price of ApsaraVideo VOD before you call this operation. You are charged for generating and extracting digital watermarks. For more information, see <a href="~~188310#62b9c940403se~~">Billing</a>.</strong></p>
     * <ul>
     * <li>This operation is supported only in the <strong>China (Shanghai)</strong> and <strong>China (Beijing)</strong> regions.</li>
     * <li>Before you submit a digital watermark extraction job, make sure that the following conditions are met:<ul>
     * <li>The video from which you want to extract the watermark is uploaded to the ApsaraVideo VOD.</li>
     * <li>The video from which you want to extract the watermark is longer than 6 minutes.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Submits a digital watermark extraction job. You can call this operation to asynchronously extract a copyright watermark or user-tracing watermark.</p>
     * 
     * @param request SubmitDigitalWatermarkExtractJobRequest
     * @return SubmitDigitalWatermarkExtractJobResponse
     */
    public SubmitDigitalWatermarkExtractJobResponse submitDigitalWatermarkExtractJob(SubmitDigitalWatermarkExtractJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitDigitalWatermarkExtractJobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can capture a part of a video and generate animated images only when the video is in the <strong>Uploaded</strong>, <strong>Transcoding</strong>, <strong>Normal</strong>, <strong>Reviewing</strong>, or <strong>Flagged</strong> state.</p>
     * <ul>
     * <li>The fees for frame animation are included in your video transcoding bill. You are charged based on the output resolution and the duration. For more information, see <a href="https://help.aliyun.com/document_detail/188308.html">Billing of basic services</a>.</li>
     * </ul>
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 30 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limit on API operations</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Submits a frame animation job and starts asynchronous processing.</p>
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
     * <b>description</b> :
     * <p>  You can capture a part of a video and generate animated images only when the video is in the <strong>Uploaded</strong>, <strong>Transcoding</strong>, <strong>Normal</strong>, <strong>Reviewing</strong>, or <strong>Flagged</strong> state.</p>
     * <ul>
     * <li>The fees for frame animation are included in your video transcoding bill. You are charged based on the output resolution and the duration. For more information, see <a href="https://help.aliyun.com/document_detail/188308.html">Billing of basic services</a>.</li>
     * </ul>
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 30 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limit on API operations</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Submits a frame animation job and starts asynchronous processing.</p>
     * 
     * @param request SubmitDynamicImageJobRequest
     * @return SubmitDynamicImageJobResponse
     */
    public SubmitDynamicImageJobResponse submitDynamicImageJob(SubmitDynamicImageJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitDynamicImageJobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Regions that support this operation: <strong>China (Beijing)</strong>, <strong>China (Shanghai)</strong>, and <strong>Singapore</strong>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a video fingerprinting job.</p>
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
     * <b>description</b> :
     * <p>Regions that support this operation: <strong>China (Beijing)</strong>, <strong>China (Shanghai)</strong>, and <strong>Singapore</strong>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a video fingerprinting job.</p>
     * 
     * @param request SubmitMediaDNADeleteJobRequest
     * @return SubmitMediaDNADeleteJobResponse
     */
    public SubmitMediaDNADeleteJobResponse submitMediaDNADeleteJob(SubmitMediaDNADeleteJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitMediaDNADeleteJobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  During video preprocessing, videos are transcoded to meet the playback requirements of the production studio. Therefore, you are <strong>charged</strong> for video preprocessing. You can submit a ticket for information about the <strong>production studio</strong> service.</p>
     * <ul>
     * <li>You can obtain the preprocessing result in the <a href="https://help.aliyun.com/document_detail/55638.html">TranscodeComplete</a> event notification. If the value of the <strong>Preprocess</strong> parameter is true in the event notification, the video is preprocessed.</li>
     * </ul>
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
     * <b>description</b> :
     * <p>  During video preprocessing, videos are transcoded to meet the playback requirements of the production studio. Therefore, you are <strong>charged</strong> for video preprocessing. You can submit a ticket for information about the <strong>production studio</strong> service.</p>
     * <ul>
     * <li>You can obtain the preprocessing result in the <a href="https://help.aliyun.com/document_detail/55638.html">TranscodeComplete</a> event notification. If the value of the <strong>Preprocess</strong> parameter is true in the event notification, the video is preprocessed.</li>
     * </ul>
     * 
     * @param request SubmitPreprocessJobsRequest
     * @return SubmitPreprocessJobsResponse
     */
    public SubmitPreprocessJobsResponse submitPreprocessJobs(SubmitPreprocessJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitPreprocessJobsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Only snapshots in the JPG format are generated.</p>
     * <ul>
     * <li>After a snapshot is captured, the <a href="https://help.aliyun.com/document_detail/57337.html">SnapshotComplete</a> callback is fired and EventType=SnapshotComplete, SubType=SpecifiedTime is returned.</li>
     * </ul>
     * <h3><a href="#qps-"></a>QPS limits</h3>
     * <p>You can call this operation up to 30 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limits</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Submits a snapshot job for a video and starts asynchronous snapshot processing.</p>
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
     * <b>description</b> :
     * <p>  Only snapshots in the JPG format are generated.</p>
     * <ul>
     * <li>After a snapshot is captured, the <a href="https://help.aliyun.com/document_detail/57337.html">SnapshotComplete</a> callback is fired and EventType=SnapshotComplete, SubType=SpecifiedTime is returned.</li>
     * </ul>
     * <h3><a href="#qps-"></a>QPS limits</h3>
     * <p>You can call this operation up to 30 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limits</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Submits a snapshot job for a video and starts asynchronous snapshot processing.</p>
     * 
     * @param request SubmitSnapshotJobRequest
     * @return SubmitSnapshotJobResponse
     */
    public SubmitSnapshotJobResponse submitSnapshotJob(SubmitSnapshotJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitSnapshotJobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Usage notes</h3>
     * <ul>
     * <li><strong>Make sure that you understand the billing methods and prices of ApsaraVideo VOD before you call this operation. For more information about billing of the transcoding feature, see <a href="~~188308#section-ejb-nii-nqa~~">Billing of basic services</a>.</strong></li>
     * <li>You can transcode a video only in the Uploaded, Normal, or Reviewing state.</li>
     * <li>You can obtain the transcoding results from the <a href="https://help.aliyun.com/document_detail/55636.html">StreamTranscodeComplete</a> or <a href="https://help.aliyun.com/document_detail/55638.html">TranscodeComplete</a> callback.</li>
     * <li>You can call this operation to dynamically override the subtitle URL in an HTTP Live Streaming (HLS) packaging task. If the packaging task does not contain subtitles, we recommend that you specify the ID of the specific packaging template group when you upload the video instead of calling this operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Submits a transcoding job to start transcoding in an asynchronous manner.</p>
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
     * <b>description</b> :
     * <h3><a href="#"></a>Usage notes</h3>
     * <ul>
     * <li><strong>Make sure that you understand the billing methods and prices of ApsaraVideo VOD before you call this operation. For more information about billing of the transcoding feature, see <a href="~~188308#section-ejb-nii-nqa~~">Billing of basic services</a>.</strong></li>
     * <li>You can transcode a video only in the Uploaded, Normal, or Reviewing state.</li>
     * <li>You can obtain the transcoding results from the <a href="https://help.aliyun.com/document_detail/55636.html">StreamTranscodeComplete</a> or <a href="https://help.aliyun.com/document_detail/55638.html">TranscodeComplete</a> callback.</li>
     * <li>You can call this operation to dynamically override the subtitle URL in an HTTP Live Streaming (HLS) packaging task. If the packaging task does not contain subtitles, we recommend that you specify the ID of the specific packaging template group when you upload the video instead of calling this operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Submits a transcoding job to start transcoding in an asynchronous manner.</p>
     * 
     * @param request SubmitTranscodeJobsRequest
     * @return SubmitTranscodeJobsResponse
     */
    public SubmitTranscodeJobsResponse submitTranscodeJobs(SubmitTranscodeJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitTranscodeJobsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p><strong>Make sure that you understand the billing method and price of ApsaraVideo VOD before you call this operation. When you use workflows to process videos, you may be charged for transcoding, encryption, and automated review. For more information, see <a href="https://help.aliyun.com/document_detail/188307.html">Billing overview</a>.</strong></p>
     * <ul>
     * <li>You can call this operation to initiate a VOD workflow to process media files. For more information, see <a href="https://help.aliyun.com/document_detail/115347.html">Workflows</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Initiates a workflow to process media files.</p>
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
     * <b>description</b> :
     * <p><strong>Make sure that you understand the billing method and price of ApsaraVideo VOD before you call this operation. When you use workflows to process videos, you may be charged for transcoding, encryption, and automated review. For more information, see <a href="https://help.aliyun.com/document_detail/188307.html">Billing overview</a>.</strong></p>
     * <ul>
     * <li>You can call this operation to initiate a VOD workflow to process media files. For more information, see <a href="https://help.aliyun.com/document_detail/115347.html">Workflows</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Initiates a workflow to process media files.</p>
     * 
     * @param request SubmitWorkflowJobRequest
     * @return SubmitWorkflowJobResponse
     */
    public SubmitWorkflowJobResponse submitWorkflowJob(SubmitWorkflowJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitWorkflowJobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Regions that support this operation: <strong>China (Beijing)</strong>, <strong>China (Shanghai)</strong>, and <strong>Singapore</strong>.</p>
     * <ul>
     * <li>After you call the <a href="https://help.aliyun.com/document_detail/102930.html">AddAITemplate</a> operation to add an AI template, you can call this operation to modify the AI template.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies an AI template.</p>
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
     * <b>description</b> :
     * <p>  Regions that support this operation: <strong>China (Beijing)</strong>, <strong>China (Shanghai)</strong>, and <strong>Singapore</strong>.</p>
     * <ul>
     * <li>After you call the <a href="https://help.aliyun.com/document_detail/102930.html">AddAITemplate</a> operation to add an AI template, you can call this operation to modify the AI template.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies an AI template.</p>
     * 
     * @param request UpdateAITemplateRequest
     * @return UpdateAITemplateResponse
     */
    public UpdateAITemplateResponse updateAITemplate(UpdateAITemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAITemplateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>QPS limit</h2>
     * <p>A single user can perform a maximum of 30 queries per second (QPS). Throttling is triggered when the number of calls per second exceeds the QPS limit. The throttling may affect your business. Thus, we recommend that you observe the QPS limit on this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the information about an application.</p>
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
     * <b>description</b> :
     * <h2>QPS limit</h2>
     * <p>A single user can perform a maximum of 30 queries per second (QPS). Throttling is triggered when the number of calls per second exceeds the QPS limit. The throttling may affect your business. Thus, we recommend that you observe the QPS limit on this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the information about an application.</p>
     * 
     * @param request UpdateAppInfoRequest
     * @return UpdateAppInfoResponse
     */
    public UpdateAppInfoResponse updateAppInfo(UpdateAppInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAppInfoWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The specific parameter of an auxiliary media asset is updated only when a new value is passed in the parameter.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the information about multiple auxiliary media assets at a time.</p>
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
     * <b>description</b> :
     * <p>The specific parameter of an auxiliary media asset is updated only when a new value is passed in the parameter.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the information about multiple auxiliary media assets at a time.</p>
     * 
     * @param request UpdateAttachedMediaInfosRequest
     * @return UpdateAttachedMediaInfosResponse
     */
    public UpdateAttachedMediaInfosResponse updateAttachedMediaInfos(UpdateAttachedMediaInfosRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAttachedMediaInfosWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>After you create a category, you can call this operation to modify the name of the category. If you have classified specific media resources to this category, the category names that are labeled on the media resources are automatically updated.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies a video category.</p>
     * 
     * @param request UpdateCategoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateCategoryResponse
     */
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

    /**
     * <b>description</b> :
     * <p>After you create a category, you can call this operation to modify the name of the category. If you have classified specific media resources to this category, the category names that are labeled on the media resources are automatically updated.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies a video category.</p>
     * 
     * @param request UpdateCategoryRequest
     * @return UpdateCategoryResponse
     */
    public UpdateCategoryResponse updateCategory(UpdateCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCategoryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies an online editing project.</p>
     * 
     * @param request UpdateEditingProjectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateEditingProjectResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Modifies an online editing project.</p>
     * 
     * @param request UpdateEditingProjectRequest
     * @return UpdateEditingProjectResponse
     */
    public UpdateEditingProjectResponse updateEditingProject(UpdateEditingProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateEditingProjectWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the information about one or more images at a time.</p>
     * 
     * @param request UpdateImageInfosRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateImageInfosResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Modifies the information about one or more images at a time.</p>
     * 
     * @param request UpdateImageInfosRequest
     * @return UpdateImageInfosResponse
     */
    public UpdateImageInfosResponse updateImageInfos(UpdateImageInfosRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateImageInfosWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  This operation is an asynchronous operation. You can call this operation to modify the storage classes of media assets. After the storage class is modified, a callback notification is sent.</p>
     * <ul>
     * <li>If the storage class of the media asset is Archive or Cold Archive and you call this operation to modify the storage class of the media asset, the media asset is automatically restored before the storage class is modified. You do not need to call the RestoreMedia operation to restore the media asset. You must specify the restoration priority for Cold Archive objects. Default configuration: RestoreTier=Standard.</li>
     * <li>Media assets whose storage classes are being modified cannot be used or processed.</li>
     * <li>Non-Standard objects have minimum storage durations. If an object is stored for less than the minimum storage duration, the storage class of the object cannot be changed. The following content describes the minimum storage durations for objects in different storage classes: IA or IA storage for source files: 30 days, Archive or Archive storage for source files: 60 days, Cold Archive or Cold Archive for source files: 180 days.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the storage classes of media assets.</p>
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
     * <b>description</b> :
     * <p>  This operation is an asynchronous operation. You can call this operation to modify the storage classes of media assets. After the storage class is modified, a callback notification is sent.</p>
     * <ul>
     * <li>If the storage class of the media asset is Archive or Cold Archive and you call this operation to modify the storage class of the media asset, the media asset is automatically restored before the storage class is modified. You do not need to call the RestoreMedia operation to restore the media asset. You must specify the restoration priority for Cold Archive objects. Default configuration: RestoreTier=Standard.</li>
     * <li>Media assets whose storage classes are being modified cannot be used or processed.</li>
     * <li>Non-Standard objects have minimum storage durations. If an object is stored for less than the minimum storage duration, the storage class of the object cannot be changed. The following content describes the minimum storage durations for objects in different storage classes: IA or IA storage for source files: 30 days, Archive or Archive storage for source files: 60 days, Cold Archive or Cold Archive for source files: 180 days.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the storage classes of media assets.</p>
     * 
     * @param request UpdateMediaStorageClassRequest
     * @return UpdateMediaStorageClassResponse
     */
    public UpdateMediaStorageClassResponse updateMediaStorageClass(UpdateMediaStorageClassRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateMediaStorageClassWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For security purposes, you cannot add, modify, or delete transcoding templates in a transcoding template group that is locked. You can call the <a href="~~GetTranscodeTemplateGroup~~">GetTranscodeTemplateGroup</a> operation to query the configurations of a transcoding template group, check whether the transcoding template group is locked by using the response parameter Locked, and unlock the transcoding template group before you perform operations such as add, modify, and delete transcoding templates.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the configurations of a transcoding template group or configurations of transcoding templates in the transcoding template group.</p>
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
     * <b>description</b> :
     * <p>For security purposes, you cannot add, modify, or delete transcoding templates in a transcoding template group that is locked. You can call the <a href="~~GetTranscodeTemplateGroup~~">GetTranscodeTemplateGroup</a> operation to query the configurations of a transcoding template group, check whether the transcoding template group is locked by using the response parameter Locked, and unlock the transcoding template group before you perform operations such as add, modify, and delete transcoding templates.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the configurations of a transcoding template group or configurations of transcoding templates in the transcoding template group.</p>
     * 
     * @param request UpdateTranscodeTemplateGroupRequest
     * @return UpdateTranscodeTemplateGroupResponse
     */
    public UpdateTranscodeTemplateGroupResponse updateTranscodeTemplateGroup(UpdateTranscodeTemplateGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateTranscodeTemplateGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The specific parameter of a video is updated only when a new value is passed in the parameter.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the information about a video.</p>
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
     * <b>description</b> :
     * <p>The specific parameter of a video is updated only when a new value is passed in the parameter.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the information about a video.</p>
     * 
     * @param request UpdateVideoInfoRequest
     * @return UpdateVideoInfoResponse
     */
    public UpdateVideoInfoResponse updateVideoInfo(UpdateVideoInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateVideoInfoWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The specific parameter of a video is updated only when a new value is passed in the parameter.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the information about multiple videos at a time.</p>
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
     * <b>description</b> :
     * <p>The specific parameter of a video is updated only when a new value is passed in the parameter.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the information about multiple videos at a time.</p>
     * 
     * @param request UpdateVideoInfosRequest
     * @return UpdateVideoInfosResponse
     */
    public UpdateVideoInfosResponse updateVideoInfos(UpdateVideoInfosRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateVideoInfosWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This operation is available only in the <strong>China (Shanghai)</strong> region.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Modifies a specific accelerated domain name.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>This operation is available only in the <strong>China (Shanghai)</strong> region.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Modifies a specific accelerated domain name.</p>
     * 
     * @param request UpdateVodDomainRequest
     * @return UpdateVodDomainResponse
     */
    public UpdateVodDomainResponse updateVodDomain(UpdateVodDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateVodDomainWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a snapshot template.</p>
     * 
     * @param request UpdateVodTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateVodTemplateResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Modifies a snapshot template.</p>
     * 
     * @param request UpdateVodTemplateRequest
     * @return UpdateVodTemplateResponse
     */
    public UpdateVodTemplateResponse updateVodTemplate(UpdateVodTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateVodTemplateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can modify the name and configurations of the watermark template after you call the <a href="~~AddWatermark~~">AddWatermark</a> operation to create a watermark template.</p>
     * <ul>
     * <li>You cannot call this operation to change the image in an image watermark template.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the name and configurations of a watermark template after you create a watermark template.</p>
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
     * <b>description</b> :
     * <p>  You can modify the name and configurations of the watermark template after you call the <a href="~~AddWatermark~~">AddWatermark</a> operation to create a watermark template.</p>
     * <ul>
     * <li>You cannot call this operation to change the image in an image watermark template.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the name and configurations of a watermark template after you create a watermark template.</p>
     * 
     * @param request UpdateWatermarkRequest
     * @return UpdateWatermarkResponse
     */
    public UpdateWatermarkResponse updateWatermark(UpdateWatermarkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateWatermarkWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to upload media files that are not stored on a local server or device and must be uploaded based on URLs over the Internet.</p>
     * <ul>
     * <li>The URL-based upload jobs are asynchronous. After you submit a URL-based upload job by calling this operation, it may take hours, even days to complete. If you require high timeliness, we recommend that you use the upload SDK.</li>
     * <li>If you configure callbacks, you can receive an <a href="https://help.aliyun.com/document_detail/86326.html">UploadByURLComplete</a> event notification after the media file is uploaded. You can query the upload status by calling the <a href="https://help.aliyun.com/document_detail/106830.html">GetURLUploadInfos</a> operation.</li>
     * <li>After you submit an upload job, the job is asynchronously processed on the cloud. All URL-based upload jobs that are submitted in each region are queued. The waiting time for the upload job depends on the number of queued jobs. After the upload job is complete, you can associate the playback URL included in the callback with the media ID.</li>
     * <li>You can call this operation only in the <strong>China (Shanghai)</strong> and <strong>Singapore</strong> regions.</li>
     * <li>Every time you submit a URL-based upload job, a new media ID is generated in ApsaraVideo VOD.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Uploads media files based on URLs.</p>
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
     * <b>description</b> :
     * <p>  You can call this operation to upload media files that are not stored on a local server or device and must be uploaded based on URLs over the Internet.</p>
     * <ul>
     * <li>The URL-based upload jobs are asynchronous. After you submit a URL-based upload job by calling this operation, it may take hours, even days to complete. If you require high timeliness, we recommend that you use the upload SDK.</li>
     * <li>If you configure callbacks, you can receive an <a href="https://help.aliyun.com/document_detail/86326.html">UploadByURLComplete</a> event notification after the media file is uploaded. You can query the upload status by calling the <a href="https://help.aliyun.com/document_detail/106830.html">GetURLUploadInfos</a> operation.</li>
     * <li>After you submit an upload job, the job is asynchronously processed on the cloud. All URL-based upload jobs that are submitted in each region are queued. The waiting time for the upload job depends on the number of queued jobs. After the upload job is complete, you can associate the playback URL included in the callback with the media ID.</li>
     * <li>You can call this operation only in the <strong>China (Shanghai)</strong> and <strong>Singapore</strong> regions.</li>
     * <li>Every time you submit a URL-based upload job, a new media ID is generated in ApsaraVideo VOD.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Uploads media files based on URLs.</p>
     * 
     * @param request UploadMediaByURLRequest
     * @return UploadMediaByURLResponse
     */
    public UploadMediaByURLResponse uploadMediaByURL(UploadMediaByURLRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.uploadMediaByURLWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  <strong>Make sure that you understand the billing method and price of ApsaraVideo VOD before you call this operation. You are charged storage fees after you upload media files to ApsaraVideo VOD. For more information, see <a href="~~188308#section_e97_xrp_mzz~~">Billing of media asset storage</a>. If you have activated the acceleration service, you are charged acceleration fees when you upload media files to ApsaraVideo VOD. For more information, see <a href="~~188310#section_sta_zm2_tsv~~">Billing of acceleration traffic</a>.</strong></p>
     * <ul>
     * <li>This operation is available only in the <strong>China (Shanghai)</strong> and <strong>Singapore</strong> regions.</li>
     * <li>You can call this operation to upload transcoded streams to ApsaraVideo VOD from external storage. The following HDR types of transcoded streams are supported: HDR, HDR 10, HLG, Dolby Vision, HDR Vivid, and SDR+.</li>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/106830.html">GetURLUploadInfos</a> operation to query the upload status. After the upload is complete, the callback of the <a href="https://help.aliyun.com/document_detail/376427.html">UploadByURLComplete</a> event is returned.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Uploads transcoded streams to ApsaraVideo VOD from external storage.</p>
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
     * <b>description</b> :
     * <p>  <strong>Make sure that you understand the billing method and price of ApsaraVideo VOD before you call this operation. You are charged storage fees after you upload media files to ApsaraVideo VOD. For more information, see <a href="~~188308#section_e97_xrp_mzz~~">Billing of media asset storage</a>. If you have activated the acceleration service, you are charged acceleration fees when you upload media files to ApsaraVideo VOD. For more information, see <a href="~~188310#section_sta_zm2_tsv~~">Billing of acceleration traffic</a>.</strong></p>
     * <ul>
     * <li>This operation is available only in the <strong>China (Shanghai)</strong> and <strong>Singapore</strong> regions.</li>
     * <li>You can call this operation to upload transcoded streams to ApsaraVideo VOD from external storage. The following HDR types of transcoded streams are supported: HDR, HDR 10, HLG, Dolby Vision, HDR Vivid, and SDR+.</li>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/106830.html">GetURLUploadInfos</a> operation to query the upload status. After the upload is complete, the callback of the <a href="https://help.aliyun.com/document_detail/376427.html">UploadByURLComplete</a> event is returned.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Uploads transcoded streams to ApsaraVideo VOD from external storage.</p>
     * 
     * @param request UploadStreamByURLRequest
     * @return UploadStreamByURLResponse
     */
    public UploadStreamByURLResponse uploadStreamByURL(UploadStreamByURLRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.uploadStreamByURLWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation is available only in the <strong>China (Shanghai)</strong> region.</p>
     * 
     * <b>summary</b> : 
     * <p>Verifies the ownership of a specified domain name.</p>
     * 
     * @param request VerifyVodDomainOwnerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return VerifyVodDomainOwnerResponse
     */
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

    /**
     * <b>description</b> :
     * <p>This operation is available only in the <strong>China (Shanghai)</strong> region.</p>
     * 
     * <b>summary</b> : 
     * <p>Verifies the ownership of a specified domain name.</p>
     * 
     * @param request VerifyVodDomainOwnerRequest
     * @return VerifyVodDomainOwnerResponse
     */
    public VerifyVodDomainOwnerResponse verifyVodDomainOwner(VerifyVodDomainOwnerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.verifyVodDomainOwnerWithOptions(request, runtime);
    }
}
