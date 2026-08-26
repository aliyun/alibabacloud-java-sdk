// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321;

import com.aliyun.tea.*;
import com.aliyun.vod20170321.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
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
            new TeaPair("us-east-1", "vod.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "vod.cn-shenzhen.aliyuncs.com"),
            new TeaPair("cn-beijing", "vod.cn-beijing.aliyuncs.com"),
            new TeaPair("cn-shanghai", "vod.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-hongkong", "vod.cn-hongkong.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "vod.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-northeast-1", "vod.ap-northeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "vod.ap-southeast-5.aliyuncs.com"),
            new TeaPair("us-west-1", "vod.us-west-1.aliyuncs.com"),
            new TeaPair("eu-central-1", "vod.eu-central-1.aliyuncs.com"),
            new TeaPair("me-central-1", "vod.me-central-1.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "vod.cn-north-2-gov-1.aliyuncs.com")
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
     * <ul>
     * <li>Currently, this operation is supported in the following regions: <strong>China (Beijing)</strong>, <strong>China (Shanghai)</strong>, and <strong>Singapore</strong>.</li>
     * <li>&lt;props=&quot;china&quot;&gt;Before adding an AI template for automated review and smart thumbnail tasks, make sure that you have activated <a href="https://ai.aliyun.com/vi/censor">automated review</a> or <a href="https://ai.aliyun.com/vi/cover">smart thumbnail</a>.</li>
     * <li>&lt;props=&quot;intl&quot;&gt;Before adding an AI template for automated review and smart thumbnail tasks, make sure that you have activated automated review or smart thumbnail.</li>
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
     * <ul>
     * <li>Currently, this operation is supported in the following regions: <strong>China (Beijing)</strong>, <strong>China (Shanghai)</strong>, and <strong>Singapore</strong>.</li>
     * <li>&lt;props=&quot;china&quot;&gt;Before adding an AI template for automated review and smart thumbnail tasks, make sure that you have activated <a href="https://ai.aliyun.com/vi/censor">automated review</a> or <a href="https://ai.aliyun.com/vi/cover">smart thumbnail</a>.</li>
     * <li>&lt;props=&quot;intl&quot;&gt;Before adding an AI template for automated review and smart thumbnail tasks, make sure that you have activated automated review or smart thumbnail.</li>
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
     * <ul>
     * <li>Audio/video/image categories (<code>Type</code> set to <code>default</code>) support up to three levels, with a maximum of 100 subcategories per level. Short video material categories (<code>Type</code> set to <code>material</code>) support up to two levels, with a maximum of 100 subcategories per level.</li>
     * <li>After creating a category, you can assign it to media assets during upload or to already uploaded media assets. For more information, see <a href="https://help.aliyun.com/document_detail/86070.html">Media asset categories</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a category to classify audio, video, image, and short video materials stored in ApsaraVideo VOD, making resource discovery and management more efficient.</p>
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
     * <ul>
     * <li>Audio/video/image categories (<code>Type</code> set to <code>default</code>) support up to three levels, with a maximum of 100 subcategories per level. Short video material categories (<code>Type</code> set to <code>material</code>) support up to two levels, with a maximum of 100 subcategories per level.</li>
     * <li>After creating a category, you can assign it to media assets during upload or to already uploaded media assets. For more information, see <a href="https://help.aliyun.com/document_detail/86070.html">Media asset categories</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a category to classify audio, video, image, and short video materials stored in ApsaraVideo VOD, making resource discovery and management more efficient.</p>
     * 
     * @param request AddCategoryRequest
     * @return AddCategoryResponse
     */
    public AddCategoryResponse addCategory(AddCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addCategoryWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>For more information about online editing, see <a href="https://help.aliyun.com/document_detail/95482.html">Online editing</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an online editing project (video editing task).</p>
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
     * <b>description</b> :
     * <ul>
     * <li>For more information about online editing, see <a href="https://help.aliyun.com/document_detail/95482.html">Online editing</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an online editing project (video editing task).</p>
     * 
     * @param request AddEditingProjectRequest
     * @return AddEditingProjectResponse
     */
    public AddEditingProjectResponse addEditingProject(AddEditingProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addEditingProjectWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds one or more materials to an online editing project.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Adds one or more materials to an online editing project.</p>
     * 
     * @param request AddEditingProjectMaterialsRequest
     * @return AddEditingProjectMaterialsResponse
     */
    public AddEditingProjectMaterialsResponse addEditingProjectMaterials(AddEditingProjectMaterialsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addEditingProjectMaterialsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Transcoding template groups that are <strong>locked</strong> by the ApsaraVideo VOD backend do not support custom operations. You can call the <a href="~~GetTranscodeTemplateGroup~~">GetTranscodeTemplateGroup</a> operation to query the template configuration and check whether the template group is locked based on the Locked response parameter. You can call the <a href="~~UpdateTranscodeTemplateGroup~~">UpdateTranscodeTemplateGroup</a> operation to unlock the template before you modify it.</li>
     * <li>Because transcoding involves storage addresses of files, you cannot add a transcoding template group if no storage address is available. You can activate a <strong>VOD system bucket</strong> in the <strong>ApsaraVideo VOD console &gt; Configuration Management &gt; Media Asset Management Configuration &gt; Storage Management</strong> to obtain an available storage address.</li>
     * <li>You cannot add transcoding template configurations to a <strong>No Transcoding</strong> template group.</li>
     * <li>You must specify either <strong>TranscodeTemplateGroupId</strong> or <strong>Name</strong>.</li>
     * <li>You can create a maximum of 20 transcoding template groups.</li>
     * <li>You can add a maximum of 20 transcoding template configurations to a transcoding template group.</li>
     * <li>To generate adaptive bitrate streaming addresses through transcoding, you can add a maximum of 10 video packaging templates to a transcoding template group. If more than 10 templates are added, only individual stream addresses are generated instead of adaptive bitrate streaming addresses.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The maximum number of queries per second (QPS) per user for this operation is 5. If the number of calls per second exceeds the limit, throttling is triggered. This may affect your business. Manage your calls appropriately. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds transcoding configurations. You can create a transcoding template group or add transcoding templates to a specified template group.</p>
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
     * <ul>
     * <li>Transcoding template groups that are <strong>locked</strong> by the ApsaraVideo VOD backend do not support custom operations. You can call the <a href="~~GetTranscodeTemplateGroup~~">GetTranscodeTemplateGroup</a> operation to query the template configuration and check whether the template group is locked based on the Locked response parameter. You can call the <a href="~~UpdateTranscodeTemplateGroup~~">UpdateTranscodeTemplateGroup</a> operation to unlock the template before you modify it.</li>
     * <li>Because transcoding involves storage addresses of files, you cannot add a transcoding template group if no storage address is available. You can activate a <strong>VOD system bucket</strong> in the <strong>ApsaraVideo VOD console &gt; Configuration Management &gt; Media Asset Management Configuration &gt; Storage Management</strong> to obtain an available storage address.</li>
     * <li>You cannot add transcoding template configurations to a <strong>No Transcoding</strong> template group.</li>
     * <li>You must specify either <strong>TranscodeTemplateGroupId</strong> or <strong>Name</strong>.</li>
     * <li>You can create a maximum of 20 transcoding template groups.</li>
     * <li>You can add a maximum of 20 transcoding template configurations to a transcoding template group.</li>
     * <li>To generate adaptive bitrate streaming addresses through transcoding, you can add a maximum of 10 video packaging templates to a transcoding template group. If more than 10 templates are added, only individual stream addresses are generated instead of adaptive bitrate streaming addresses.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The maximum number of queries per second (QPS) per user for this operation is 5. If the number of calls per second exceeds the limit, throttling is triggered. This may affect your business. Manage your calls appropriately. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds transcoding configurations. You can create a transcoding template group or add transcoding templates to a specified template group.</p>
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
     * <ul>
     * <li>Currently, the only supported service address is <strong>China (Shanghai)</strong>.</li>
     * <li>Before creating an accelerated domain name, you must activate <a href="https://help.aliyun.com/document_detail/51512.html">ApsaraVideo VOD</a>, and the accelerated domain name must have a completed ICP filing. </li>
     * <li>Origin content that is not hosted on Alibaba Cloud requires review, which will be completed before the next business day.</li>
     * <li>You can submit only one accelerated domain name at a time. Each user can add up to 20 domain names.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds a domain name for CDN acceleration in ApsaraVideo VOD.</p>
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
     * <ul>
     * <li>Currently, the only supported service address is <strong>China (Shanghai)</strong>.</li>
     * <li>Before creating an accelerated domain name, you must activate <a href="https://help.aliyun.com/document_detail/51512.html">ApsaraVideo VOD</a>, and the accelerated domain name must have a completed ICP filing. </li>
     * <li>Origin content that is not hosted on Alibaba Cloud requires review, which will be completed before the next business day.</li>
     * <li>You can submit only one accelerated domain name at a time. Each user can add up to 20 domain names.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds a domain name for CDN acceleration in ApsaraVideo VOD.</p>
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
     * <p>Calls AddVodStorageForApp to enable a VOD system bucket for an ApsaraVideo VOD sub-application.
     *  <notice>Each sub-application can have at most one VOD system bucket enabled. If you specify an AppId that does not exist or an AppId that already has a VOD system bucket enabled, an error is returned.</notice>
     * <notice>To call this operation, the caller must have application administrator permissions (VODAppAdministratorAccess). The Alibaba Cloud account has application administrator permissions by default. An application administrator can call AttachAppPolicyToIdentity to grant application permissions to a RAM user or role.</notice></p>
     * 
     * <b>summary</b> : 
     * <p>Binds a storage bucket to a sub-application of ApsaraVideo VOD.</p>
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
     * <p>Calls AddVodStorageForApp to enable a VOD system bucket for an ApsaraVideo VOD sub-application.
     *  <notice>Each sub-application can have at most one VOD system bucket enabled. If you specify an AppId that does not exist or an AppId that already has a VOD system bucket enabled, an error is returned.</notice>
     * <notice>To call this operation, the caller must have application administrator permissions (VODAppAdministratorAccess). The Alibaba Cloud account has application administrator permissions by default. An application administrator can call AttachAppPolicyToIdentity to grant application permissions to a RAM user or role.</notice></p>
     * 
     * <b>summary</b> : 
     * <p>Binds a storage bucket to a sub-application of ApsaraVideo VOD.</p>
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
     * <ul>
     * <li>After adding a template, you can pass the snapshot or animated image template ID through the <a href="~~SubmitSnapshotJob~~">SubmitSnapshotJob</a> or <a href="~~SubmitDynamicImageJob~~">SubmitDynamicImageJob</a> operation to initiate a snapshot or animated image job.</li>
     * <li>You can receive <a href="https://help.aliyun.com/document_detail/57337.html">video snapshot completed</a> and <a href="https://help.aliyun.com/document_detail/143490.html">video animated image completed</a> callback messages through HTTP callbacks (compatible with HTTPS) or MNS callbacks. For more information, see <a href="https://help.aliyun.com/document_detail/55627.html">Callback methods</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds a snapshot or animated image template.</p>
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
     * <ul>
     * <li>After adding a template, you can pass the snapshot or animated image template ID through the <a href="~~SubmitSnapshotJob~~">SubmitSnapshotJob</a> or <a href="~~SubmitDynamicImageJob~~">SubmitDynamicImageJob</a> operation to initiate a snapshot or animated image job.</li>
     * <li>You can receive <a href="https://help.aliyun.com/document_detail/57337.html">video snapshot completed</a> and <a href="https://help.aliyun.com/document_detail/143490.html">video animated image completed</a> callback messages through HTTP callbacks (compatible with HTTPS) or MNS callbacks. For more information, see <a href="https://help.aliyun.com/document_detail/55627.html">Callback methods</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds a snapshot or animated image template.</p>
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
     * <ul>
     * <li>Call this operation to add an image watermark template (<code>Image</code>) or a text watermark template (<code>Text</code>). Image watermark templates support the following formats: static images (PNG) and animated images (GIF, APNG, MOV).</li>
     * <li>After adding a watermark template by calling this operation, call <a href="~~AddTranscodeTemplateGroup~~">AddTranscodeTemplateGroup</a> or <a href="~~UpdateTranscodeTemplateGroup~~">UpdateTranscodeTemplateGroup</a> to associate the watermark template with a transcoding template group for subsequent watermark transcoding.</li>
     * <li>For more information about adding image and text watermarks to videos, see <a href="https://help.aliyun.com/document_detail/99369.html">Video watermarks</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>To simplify watermark task processing, ApsaraVideo VOD consolidates complex watermark parameters such as position, size, font, and color into templates, each identified by a unique watermark template ID. Calls this operation to add an image or text watermark template.</p>
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
     * <ul>
     * <li>Call this operation to add an image watermark template (<code>Image</code>) or a text watermark template (<code>Text</code>). Image watermark templates support the following formats: static images (PNG) and animated images (GIF, APNG, MOV).</li>
     * <li>After adding a watermark template by calling this operation, call <a href="~~AddTranscodeTemplateGroup~~">AddTranscodeTemplateGroup</a> or <a href="~~UpdateTranscodeTemplateGroup~~">UpdateTranscodeTemplateGroup</a> to associate the watermark template with a transcoding template group for subsequent watermark transcoding.</li>
     * <li>For more information about adding image and text watermarks to videos, see <a href="https://help.aliyun.com/document_detail/99369.html">Video watermarks</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>To simplify watermark task processing, ApsaraVideo VOD consolidates complex watermark parameters such as position, size, font, and color into templates, each identified by a unique watermark template ID. Calls this operation to add an image or text watermark template.</p>
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
     * <p>Notice:  Each Resource Access Management (RAM) user or RAM role can be granted permissions on up to 10 applications.
     * Notice: You must have application administrator permissions to invoke this operation. For the first invocation, use your Alibaba Cloud account.</p>
     * </blockquote>
     * <ul>
     * <li>If the policy name is VODAppAdministratorAccess, AppId is optional. For other policies, AppId is required.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Invokes this operation to attach access permissions of an ApsaraVideo VOD application to a specified identity (Resource Access Management (RAM) user or RAM role).</p>
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
     * <p>Notice:  Each Resource Access Management (RAM) user or RAM role can be granted permissions on up to 10 applications.
     * Notice: You must have application administrator permissions to invoke this operation. For the first invocation, use your Alibaba Cloud account.</p>
     * </blockquote>
     * <ul>
     * <li>If the policy name is VODAppAdministratorAccess, AppId is optional. For other policies, AppId is required.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Invokes this operation to attach access permissions of an ApsaraVideo VOD application to a specified identity (Resource Access Management (RAM) user or RAM role).</p>
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
     * <ul>
     * <li>You can retrieve information about up to 20 audio or video files at a time.</li>
     * <li>After an audio or video file is uploaded, ApsaraVideo VOD analyzes the uploaded source file. Therefore, media asset information is generated asynchronously. You can configure an <a href="https://help.aliyun.com/document_detail/55627.html">event notification</a> for the <a href="https://help.aliyun.com/document_detail/99935.html">AudioVideoAnalysisComplete</a> event. After you receive the <a href="https://help.aliyun.com/document_detail/99935.html">AudioVideoAnalysisComplete</a> event notification, call this operation to retrieve the audio or video information.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the basic information and source file information of multiple media assets in a batch.</p>
     * 
     * @param request BatchGetMediaInfosRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchGetMediaInfosResponse
     */
    public BatchGetMediaInfosResponse batchGetMediaInfosWithOptions(BatchGetMediaInfosRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mediaIds)) {
            query.put("MediaIds", request.mediaIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.referenceIds)) {
            query.put("ReferenceIds", request.referenceIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchGetMediaInfos"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchGetMediaInfosResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can retrieve information about up to 20 audio or video files at a time.</li>
     * <li>After an audio or video file is uploaded, ApsaraVideo VOD analyzes the uploaded source file. Therefore, media asset information is generated asynchronously. You can configure an <a href="https://help.aliyun.com/document_detail/55627.html">event notification</a> for the <a href="https://help.aliyun.com/document_detail/99935.html">AudioVideoAnalysisComplete</a> event. After you receive the <a href="https://help.aliyun.com/document_detail/99935.html">AudioVideoAnalysisComplete</a> event notification, call this operation to retrieve the audio or video information.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the basic information and source file information of multiple media assets in a batch.</p>
     * 
     * @param request BatchGetMediaInfosRequest
     * @return BatchGetMediaInfosResponse
     */
    public BatchGetMediaInfosResponse batchGetMediaInfos(BatchGetMediaInfosRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchGetMediaInfosWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Currently, the only supported service region is <strong>China (Shanghai)</strong>.</li>
     * <li>You can configure up to 50 domain names at a time.</li>
     * <li>After you call this operation to configure certain features for domain names, a unique ConfigId is generated. You can use the ConfigId to update or delete domain name configurations. This operation does not return the ConfigId. To obtain the ConfigId, call the <a href="~~DescribeVodDomainConfigs~~">DescribeVodDomainConfigs</a> operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Configures multiple accelerated domain names in a batch.</p>
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
     * <ul>
     * <li>Currently, the only supported service region is <strong>China (Shanghai)</strong>.</li>
     * <li>You can configure up to 50 domain names at a time.</li>
     * <li>After you call this operation to configure certain features for domain names, a unique ConfigId is generated. You can use the ConfigId to update or delete domain name configurations. This operation does not return the ConfigId. To obtain the ConfigId, call the <a href="~~DescribeVodDomainConfigs~~">DescribeVodDomainConfigs</a> operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Configures multiple accelerated domain names in a batch.</p>
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
     * <ul>
     * <li>Currently, the only supported endpoint is <strong>China (Shanghai)</strong>.</li>
     * <li>If the account associated with the domain name has an overdue payment or the domain name is in an illegal state, you cannot call this operation to enable the ApsaraVideo VOD domain name.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Enables an accelerated domain name that is in the Disabled state.</p>
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
     * <ul>
     * <li>Currently, the only supported endpoint is <strong>China (Shanghai)</strong>.</li>
     * <li>If the account associated with the domain name has an overdue payment or the domain name is in an illegal state, you cannot call this operation to enable the ApsaraVideo VOD domain name.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Enables an accelerated domain name that is in the Disabled state.</p>
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
     * <ul>
     * <li>Currently, the only supported service address is <strong>China (Shanghai)</strong>.</li>
     * <li>After you pause the accelerated domain name, the domain name information is retained. Requests to the accelerated domain name are automatically redirected to the origin server.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Pauses domain name acceleration.</p>
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
     * <ul>
     * <li>Currently, the only supported service address is <strong>China (Shanghai)</strong>.</li>
     * <li>After you pause the accelerated domain name, the domain name information is retained. Requests to the accelerated domain name are automatically redirected to the origin server.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Pauses domain name acceleration.</p>
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
     * <ul>
     * <li>You can cancel only URL upload nodes whose status is <strong>Pending</strong>. You can call the <a href="https://help.aliyun.com/document_detail/106830.html">GetURLUploadInfos</a> operation to query the node status.</li>
     * <li>Upload nodes that have already started to execute cannot be canceled.</li>
     * <li>The request parameters JobIds and UploadUrls must have one specified. If both are specified, only JobIds is processed.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Cancels URL upload tasks that are in the queue.</p>
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
     * <ul>
     * <li>You can cancel only URL upload nodes whose status is <strong>Pending</strong>. You can call the <a href="https://help.aliyun.com/document_detail/106830.html">GetURLUploadInfos</a> operation to query the node status.</li>
     * <li>Upload nodes that have already started to execute cannot be canceled.</li>
     * <li>The request parameters JobIds and UploadUrls must have one specified. If both are specified, only JobIds is processed.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Cancels URL upload tasks that are in the queue.</p>
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
     * <p>Transfers a resource to another resource group.</p>
     * 
     * <b>summary</b> : 
     * <p>Transfers a resource to a different resource group.</p>
     * 
     * @param request ChangeResourceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChangeResourceGroupResponse
     */
    public ChangeResourceGroupResponse changeResourceGroupWithOptions(ChangeResourceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceRegionId)) {
            query.put("ResourceRegionId", request.resourceRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChangeResourceGroup"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChangeResourceGroupResponse());
    }

    /**
     * <b>description</b> :
     * <p>Transfers a resource to another resource group.</p>
     * 
     * <b>summary</b> : 
     * <p>Transfers a resource to a different resource group.</p>
     * 
     * @param request ChangeResourceGroupRequest
     * @return ChangeResourceGroupResponse
     */
    public ChangeResourceGroupResponse changeResourceGroup(ChangeResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.changeResourceGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Each account can create up to 10 applications. For more information, see <a href="https://help.aliyun.com/document_detail/113600.html">Multi-application development guide</a>.</p>
     * <h3>QPS limit</h3>
     * <p>The single-user QPS limit for this operation is 50 calls per second. If this limit is exceeded, the API call is throttled, which may affect your business. Call this operation appropriately. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limit</a>.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
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
     * <p>Each account can create up to 10 applications. For more information, see <a href="https://help.aliyun.com/document_detail/113600.html">Multi-application development guide</a>.</p>
     * <h3>QPS limit</h3>
     * <p>The single-user QPS limit for this operation is 50 calls per second. If this limit is exceeded, the API call is throttled, which may affect your business. Call this operation appropriately. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limit</a>.</p>
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
     * <p>Submits a manual review request to review media information such as videos and audio files.</p>
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
     * <p>Submits a manual review request to review media information such as videos and audio files.</p>
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
     * <ul>
     * <li><strong>Before using this operation, make sure that you understand the billing methods and pricing of ApsaraVideo VOD. Uploading media files to ApsaraVideo VOD incurs storage fees. For more information, see <a href="~~188308#section_e97_xrp_mzz~~">Media asset storage billing</a>. If you have enabled storage transfer acceleration, uploading media files to ApsaraVideo VOD also incurs upload acceleration fees. For more information, see <a href="~~188310#section_sta_zm2_tsv~~">Storage transfer acceleration billing</a>.</strong></li>
     * <li>This operation only obtains the upload URL and credential and creates basic media asset information. It does not upload files. For a complete example of uploading files by using the API, see <a href="https://help.aliyun.com/document_detail/476208.html">Upload media files by using the ApsaraVideo VOD API</a>.</li>
     * <li>If the upload credential expires (valid for 3000 seconds), call this operation again to obtain a new upload URL and credential.</li>
     * <li>You can configure callbacks to receive event notifications for <a href="https://help.aliyun.com/document_detail/103250.html">auxiliary media asset upload complete</a> to determine whether the upload is successful.</li>
     * <li>Obtaining the upload URL and credential is a core fundamental of ApsaraVideo VOD and a required step for every upload operation. ApsaraVideo VOD provides various upload methods, each with different requirements for obtaining the upload URL and credential. For more information, see the instructions in <a href="https://help.aliyun.com/document_detail/55397.html">Upload URLs and credentials</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>The upload URL and credential are provided by ApsaraVideo VOD to address authorization and security concerns, prevent malicious uploads, and enable automatic creation of a media asset ID (MediaId) for management and processing. For auxiliary media assets such as watermarks and subtitles, invoke this operation to obtain the upload credential and create the corresponding media asset information.</p>
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
     * <ul>
     * <li><strong>Before using this operation, make sure that you understand the billing methods and pricing of ApsaraVideo VOD. Uploading media files to ApsaraVideo VOD incurs storage fees. For more information, see <a href="~~188308#section_e97_xrp_mzz~~">Media asset storage billing</a>. If you have enabled storage transfer acceleration, uploading media files to ApsaraVideo VOD also incurs upload acceleration fees. For more information, see <a href="~~188310#section_sta_zm2_tsv~~">Storage transfer acceleration billing</a>.</strong></li>
     * <li>This operation only obtains the upload URL and credential and creates basic media asset information. It does not upload files. For a complete example of uploading files by using the API, see <a href="https://help.aliyun.com/document_detail/476208.html">Upload media files by using the ApsaraVideo VOD API</a>.</li>
     * <li>If the upload credential expires (valid for 3000 seconds), call this operation again to obtain a new upload URL and credential.</li>
     * <li>You can configure callbacks to receive event notifications for <a href="https://help.aliyun.com/document_detail/103250.html">auxiliary media asset upload complete</a> to determine whether the upload is successful.</li>
     * <li>Obtaining the upload URL and credential is a core fundamental of ApsaraVideo VOD and a required step for every upload operation. ApsaraVideo VOD provides various upload methods, each with different requirements for obtaining the upload URL and credential. For more information, see the instructions in <a href="https://help.aliyun.com/document_detail/55397.html">Upload URLs and credentials</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>The upload URL and credential are provided by ApsaraVideo VOD to address authorization and security concerns, prevent malicious uploads, and enable automatic creation of a media asset ID (MediaId) for management and processing. For auxiliary media assets such as watermarks and subtitles, invoke this operation to obtain the upload credential and create the corresponding media asset information.</p>
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
     * <ul>
     * <li><strong>Before using this operation, make sure that you understand the billing methods and pricing of ApsaraVideo VOD. Uploading media files to ApsaraVideo VOD incurs storage fees. For more information, see <a href="~~188308#section_e97_xrp_mzz~~">Media asset storage billing</a>. If you have enabled storage and transfer acceleration, uploading media files to ApsaraVideo VOD also incurs upload acceleration fees. For more information, see <a href="~~188310#section_sta_zm2_tsv~~">Storage and transfer acceleration billing</a>.</strong></li>
     * <li>This operation only retrieves the upload URL and credential and creates basic media asset information. It does not upload files. For a complete example of uploading files by calling API operations, see <a href="https://help.aliyun.com/document_detail/476208.html">Upload media files by using the ApsaraVideo VOD API</a>.</li>
     * <li>Refreshing the upload URL and credential is not supported for image uploads. If the image upload credential expires (the default validity period is 3000 seconds), call this operation again to obtain a new upload URL and credential.</li>
     * <li>You can configure callbacks to receive event notifications for <a href="https://help.aliyun.com/document_detail/91968.html">image upload completion</a> to determine whether the upload is successful.</li>
     * <li>Retrieving the upload URL and credential is a core operation of ApsaraVideo VOD and is required for every upload. ApsaraVideo VOD provides multiple upload methods, each with different requirements for retrieving the upload URL and credential. For more information, see <a href="https://help.aliyun.com/document_detail/55397.html">Upload URLs and credentials</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the upload URL and upload credential for uploading an image to ApsaraVideo VOD, and creates image information. ApsaraVideo VOD issues upload URLs and credentials to ensure authorization and security, prevent malicious uploads, and supports automatic creation of an image ID (ImageId) for management. You can invoke this operation to obtain the upload URL and credential and create image information.</p>
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
     * <ul>
     * <li><strong>Before using this operation, make sure that you understand the billing methods and pricing of ApsaraVideo VOD. Uploading media files to ApsaraVideo VOD incurs storage fees. For more information, see <a href="~~188308#section_e97_xrp_mzz~~">Media asset storage billing</a>. If you have enabled storage and transfer acceleration, uploading media files to ApsaraVideo VOD also incurs upload acceleration fees. For more information, see <a href="~~188310#section_sta_zm2_tsv~~">Storage and transfer acceleration billing</a>.</strong></li>
     * <li>This operation only retrieves the upload URL and credential and creates basic media asset information. It does not upload files. For a complete example of uploading files by calling API operations, see <a href="https://help.aliyun.com/document_detail/476208.html">Upload media files by using the ApsaraVideo VOD API</a>.</li>
     * <li>Refreshing the upload URL and credential is not supported for image uploads. If the image upload credential expires (the default validity period is 3000 seconds), call this operation again to obtain a new upload URL and credential.</li>
     * <li>You can configure callbacks to receive event notifications for <a href="https://help.aliyun.com/document_detail/91968.html">image upload completion</a> to determine whether the upload is successful.</li>
     * <li>Retrieving the upload URL and credential is a core operation of ApsaraVideo VOD and is required for every upload. ApsaraVideo VOD provides multiple upload methods, each with different requirements for retrieving the upload URL and credential. For more information, see <a href="https://help.aliyun.com/document_detail/55397.html">Upload URLs and credentials</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the upload URL and upload credential for uploading an image to ApsaraVideo VOD, and creates image information. ApsaraVideo VOD issues upload URLs and credentials to ensure authorization and security, prevent malicious uploads, and supports automatic creation of an image ID (ImageId) for management. You can invoke this operation to obtain the upload URL and credential and create image information.</p>
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
     * <ul>
     * <li><strong>Before you use this operation, make sure that you are familiar with the billing methods and pricing of ApsaraVideo VOD. Uploading media files to ApsaraVideo VOD incurs storage fees. For more information, see <a href="~~188308#section_e97_xrp_mzz~~">Media asset storage billing</a>. If you have enabled storage and transfer acceleration, uploading media files to ApsaraVideo VOD also incurs upload acceleration fees. For more information, see <a href="~~188310#section_sta_zm2_tsv~~">Storage and transfer acceleration billing</a>. Storage fees are calculated from the time when the file is uploaded. Acceleration fees are calculated when you perform upload operations after the feature is enabled. Simply calling this operation does not incur fees.</strong></li>
     * <li>Obtaining the upload URL and credential is the core foundation of ApsaraVideo VOD and is a required step for every upload operation. ApsaraVideo VOD provides multiple upload methods, each with different requirements for obtaining the upload URL and credential. For more information, see <a href="https://help.aliyun.com/document_detail/55397.html">Upload URLs and credentials</a>.</li>
     * <li>This operation is used only to obtain the upload URL and credential and create basic media asset information. It does not upload files. For a complete example of uploading files by using API operations, see <a href="https://help.aliyun.com/document_detail/476208.html">Upload media files by using the ApsaraVideo VOD API</a>.</li>
     * <li>This operation supports obtaining the upload URL and credential for both video and audio files. For more information, see <a href="https://help.aliyun.com/document_detail/55397.html">Upload URLs and credentials</a>.</li>
     * <li>If the upload credential expires (the default validity period is 3000 seconds), call the <a href="~~RefreshUploadVideo~~">RefreshUploadVideo</a> operation to obtain a new upload credential.</li>
     * <li>After the upload is complete, you can configure callbacks to receive <a href="https://help.aliyun.com/document_detail/55396.html">upload event notifications</a> or call the <a href="https://help.aliyun.com/document_detail/59624.html">GetMezzanineInfo</a> operation to check the file status and determine whether the upload is successful.</li>
     * <li>The VideoId parameter returned by this operation can be used for media asset lifecycle management or media processing.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>ApsaraVideo VOD issues the upload URL and upload credential to ensure authorization and security and prevent malicious uploads. During issuance, a media ID (MediaId), also called a video ID (VideoId), undergoes automatic creation for management. Invoke this operation to obtain the upload URL and upload credential, and create audio or video information.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.enableFirstFrameCover)) {
            query.put("EnableFirstFrameCover", request.enableFirstFrameCover);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            query.put("FileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSize)) {
            query.put("FileSize", request.fileSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.generateThumbnail)) {
            query.put("GenerateThumbnail", request.generateThumbnail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.referenceId)) {
            query.put("ReferenceId", request.referenceId);
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
     * <ul>
     * <li><strong>Before you use this operation, make sure that you are familiar with the billing methods and pricing of ApsaraVideo VOD. Uploading media files to ApsaraVideo VOD incurs storage fees. For more information, see <a href="~~188308#section_e97_xrp_mzz~~">Media asset storage billing</a>. If you have enabled storage and transfer acceleration, uploading media files to ApsaraVideo VOD also incurs upload acceleration fees. For more information, see <a href="~~188310#section_sta_zm2_tsv~~">Storage and transfer acceleration billing</a>. Storage fees are calculated from the time when the file is uploaded. Acceleration fees are calculated when you perform upload operations after the feature is enabled. Simply calling this operation does not incur fees.</strong></li>
     * <li>Obtaining the upload URL and credential is the core foundation of ApsaraVideo VOD and is a required step for every upload operation. ApsaraVideo VOD provides multiple upload methods, each with different requirements for obtaining the upload URL and credential. For more information, see <a href="https://help.aliyun.com/document_detail/55397.html">Upload URLs and credentials</a>.</li>
     * <li>This operation is used only to obtain the upload URL and credential and create basic media asset information. It does not upload files. For a complete example of uploading files by using API operations, see <a href="https://help.aliyun.com/document_detail/476208.html">Upload media files by using the ApsaraVideo VOD API</a>.</li>
     * <li>This operation supports obtaining the upload URL and credential for both video and audio files. For more information, see <a href="https://help.aliyun.com/document_detail/55397.html">Upload URLs and credentials</a>.</li>
     * <li>If the upload credential expires (the default validity period is 3000 seconds), call the <a href="~~RefreshUploadVideo~~">RefreshUploadVideo</a> operation to obtain a new upload credential.</li>
     * <li>After the upload is complete, you can configure callbacks to receive <a href="https://help.aliyun.com/document_detail/55396.html">upload event notifications</a> or call the <a href="https://help.aliyun.com/document_detail/59624.html">GetMezzanineInfo</a> operation to check the file status and determine whether the upload is successful.</li>
     * <li>The VideoId parameter returned by this operation can be used for media asset lifecycle management or media processing.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>ApsaraVideo VOD issues the upload URL and upload credential to ensure authorization and security and prevent malicious uploads. During issuance, a media ID (MediaId), also called a video ID (VideoId), undergoes automatic creation for management. Invoke this operation to obtain the upload URL and upload credential, and create audio or video information.</p>
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
     * <p>Invokes this operation to perform decryption on the CiphertextBlob in a KMS data key (DK).</p>
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
     * <p>Invokes this operation to perform decryption on the CiphertextBlob in a KMS data key (DK).</p>
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
     * <ul>
     * <li>Currently, this operation is supported in the following regions: <strong>China (Beijing)</strong> and <strong>China (Shanghai)</strong>.</li>
     * <li><strong>This operation only deletes AI image information and does not actually delete image files</strong>.</li>
     * <li>A maximum of 10 IDs can be deleted at a time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes AI image information.</p>
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
     * <ul>
     * <li>Currently, this operation is supported in the following regions: <strong>China (Beijing)</strong> and <strong>China (Shanghai)</strong>.</li>
     * <li><strong>This operation only deletes AI image information and does not actually delete image files</strong>.</li>
     * <li>A maximum of 10 IDs can be deleted at a time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes AI image information.</p>
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
     * <ul>
     * <li>Currently, this operation is supported in the following regions: <strong>China (Beijing)</strong>, <strong>China (Shanghai)</strong>, and <strong>Singapore</strong>.</li>
     * <li>An AI template that is set as the default template cannot be deleted.</li>
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
     * <ul>
     * <li>Currently, this operation is supported in the following regions: <strong>China (Beijing)</strong>, <strong>China (Shanghai)</strong>, and <strong>Singapore</strong>.</li>
     * <li>An AI template that is set as the default template cannot be deleted.</li>
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
     * <p>An application cannot be deleted if it contains resources.</p>
     * <h3>QPS limit</h3>
     * <p>The single-user QPS limit for this API is 10 calls per second. If this limit is exceeded, the API calls are throttled, which may affect your business. Call this API appropriately. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes application information.</p>
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
     * <p>An application cannot be deleted if it contains resources.</p>
     * <h3>QPS limit</h3>
     * <p>The single-user QPS limit for this API is 10 calls per second. If this limit is exceeded, the API calls are throttled, which may affect your business. Call this API appropriately. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes application information.</p>
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
     * <ul>
     * <li><strong>This operation physically deletes auxiliary media assets. Once deleted, they cannot be recovered. Proceed with caution.</strong></li>
     * <li>You can delete up to 20 auxiliary media assets at a time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes one or more auxiliary media assets that have been uploaded to ApsaraVideo VOD, such as watermark images, subtitle files, and materials.</p>
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
     * <ul>
     * <li><strong>This operation physically deletes auxiliary media assets. Once deleted, they cannot be recovered. Proceed with caution.</strong></li>
     * <li>You can delete up to 20 auxiliary media assets at a time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes one or more auxiliary media assets that have been uploaded to ApsaraVideo VOD, such as watermark images, subtitle files, and materials.</p>
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
     * <ul>
     * <li><strong>This operation deletes a category and all its subcategories (including second-level and third-level categories). Proceed with caution.</strong></li>
     * <li>If a category has been assigned to media assets, deleting the category also removes the category assignment from those media assets.</li>
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
     * <ul>
     * <li><strong>This operation deletes a category and all its subcategories (including second-level and third-level categories). Proceed with caution.</strong></li>
     * <li>If a category has been assigned to media assets, deleting the category also removes the category assignment from those media assets.</li>
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
     * <ul>
     * <li>This operation only deletes the association between animated stickers and videos. It does not delete the actual animated sticker files.</li>
     * <li>After the association is deleted, the deleted animated sticker information can no longer be queried by calling the <a href="https://help.aliyun.com/document_detail/180958.html">ListDynamicImage</a> operation.</li>
     * <li>If you do not specify <strong>DynamicImageIds</strong>, all animated stickers associated with the specified VideoId are deleted. However, if the video has more than 10 animated stickers, the deletion request is rejected.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The maximum queries per second (QPS) per user for this operation is 10. If the number of calls exceeds the limit, throttling is triggered. This may affect your business. Call this operation as needed. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes animated sticker information.</p>
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
     * <ul>
     * <li>This operation only deletes the association between animated stickers and videos. It does not delete the actual animated sticker files.</li>
     * <li>After the association is deleted, the deleted animated sticker information can no longer be queried by calling the <a href="https://help.aliyun.com/document_detail/180958.html">ListDynamicImage</a> operation.</li>
     * <li>If you do not specify <strong>DynamicImageIds</strong>, all animated stickers associated with the specified VideoId are deleted. However, if the video has more than 10 animated stickers, the deletion request is rejected.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The maximum queries per second (QPS) per user for this operation is 10. If the number of calls exceeds the limit, throttling is triggered. This may affect your business. Call this operation as needed. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes animated sticker information.</p>
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
     * <ul>
     * <li>Supports batch deletion.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes an online editing project.</p>
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
     * <ul>
     * <li>Supports batch deletion.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes an online editing project.</p>
     * 
     * @param request DeleteEditingProjectRequest
     * @return DeleteEditingProjectResponse
     */
    public DeleteEditingProjectResponse deleteEditingProject(DeleteEditingProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteEditingProjectWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes materials from an online editing project.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Deletes materials from an online editing project.</p>
     * 
     * @param request DeleteEditingProjectMaterialsRequest
     * @return DeleteEditingProjectMaterialsResponse
     */
    public DeleteEditingProjectMaterialsResponse deleteEditingProjectMaterials(DeleteEditingProjectMaterialsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteEditingProjectMaterialsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li><strong>When you call this operation to delete images, the source files are permanently deleted. This action is irreversible. Once deleted, the images cannot be recovered. Proceed with caution.</strong></li>
     * <li>When <strong>DeleteImageType</strong> is set to <strong>VideoId</strong>, <strong>VideoId</strong> and <strong>ImageType</strong> are available and required. </li>
     * <li>When <strong>DeleteImageType</strong> is set to <strong>ImageURL</strong>, <strong>ImageIds</strong> and <strong>ImageURLs</strong> are available and required. </li>
     * <li>After you call this operation to delete images, CDN caches may still exist in some cases, which means the image URLs may not become invalid immediately.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes images uploaded by users or images generated from video snapshots.</p>
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
     * <ul>
     * <li><strong>When you call this operation to delete images, the source files are permanently deleted. This action is irreversible. Once deleted, the images cannot be recovered. Proceed with caution.</strong></li>
     * <li>When <strong>DeleteImageType</strong> is set to <strong>VideoId</strong>, <strong>VideoId</strong> and <strong>ImageType</strong> are available and required. </li>
     * <li>When <strong>DeleteImageType</strong> is set to <strong>ImageURL</strong>, <strong>ImageIds</strong> and <strong>ImageURLs</strong> are available and required. </li>
     * <li>After you call this operation to delete images, CDN caches may still exist in some cases, which means the image URLs may not become invalid immediately.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes images uploaded by users or images generated from video snapshots.</p>
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
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/55627.html">Event notification development guide</a>.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes the callback method, callback URL, and event types of an event notification.</p>
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
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/55627.html">Event notification development guide</a>.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes the callback method, callback URL, and event types of an event notification.</p>
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
     * <p>Media processing operations in ApsaraVideo VOD (transcoding, snapshots, automated review, etc.) are performed on source files. Once a source file is deleted, subsequent media processing operations cannot be performed. Proceed with caution.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes the source files of multiple audio and video files at a time.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.referenceIds)) {
            query.put("ReferenceIds", request.referenceIds);
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
     * <p>Media processing operations in ApsaraVideo VOD (transcoding, snapshots, automated review, etc.) are performed on source files. Once a source file is deleted, subsequent media processing operations cannot be performed. Proceed with caution.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes the source files of multiple audio and video files at a time.</p>
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
     * <ul>
     * <li>When you use multipart upload, fragment files may be generated if the upload fails. These fragment files are automatically cleared after 7 days. After the upload is complete or fails, you can call this operation to manually clear the fragment files.</li>
     * <li>Calling this operation does not delete the original file or transcoded files. It only deletes fragment files generated during the upload process.</li>
     * <li>Calling the <a href="https://help.aliyun.com/document_detail/52837.html">DeleteVideo</a> operation deletes the complete video file, including fragment files.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes fragment files generated during upload.</p>
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
     * <ul>
     * <li>When you use multipart upload, fragment files may be generated if the upload fails. These fragment files are automatically cleared after 7 days. After the upload is complete or fails, you can call this operation to manually clear the fragment files.</li>
     * <li>Calling this operation does not delete the original file or transcoded files. It only deletes fragment files generated during the upload process.</li>
     * <li>Calling the <a href="https://help.aliyun.com/document_detail/52837.html">DeleteVideo</a> operation deletes the complete video file, including fragment files.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes fragment files generated during upload.</p>
     * 
     * @param request DeleteMultipartUploadRequest
     * @return DeleteMultipartUploadResponse
     */
    public DeleteMultipartUploadResponse deleteMultipartUpload(DeleteMultipartUploadRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteMultipartUploadWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>Batch deletion is supported.</p>
     * <h3>QPS limit</h3>
     * <p>A single user can perform a maximum of 50 queries per second (QPS). Throttling is triggered when the QPS limit is exceeded, which may affect your business. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes media stream (video stream or audio stream) information and storage files.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.referenceId)) {
            query.put("ReferenceId", request.referenceId);
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
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>Batch deletion is supported.</p>
     * <h3>QPS limit</h3>
     * <p>A single user can perform a maximum of 50 queries per second (QPS). Throttling is triggered when the QPS limit is exceeded, which may affect your business. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes media stream (video stream or audio stream) information and storage files.</p>
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
     * <ul>
     * <li>Default transcoding templates cannot be deleted. Remove the default designation before deleting them.</li>
     * <li>For security protection purposes, a locked transcoding template group cannot be added to, modified, or deleted. Call the <a href="~~GetTranscodeTemplateGroup~~">GetTranscodeTemplateGroup</a> operation to query the template configuration and check the Locked response parameter to determine whether the template group is locked. Call the <a href="~~UpdateTranscodeTemplateGroup~~">UpdateTranscodeTemplateGroup</a> operation to unlock the template before making changes.</li>
     * <li>If the ForceDelGroup parameter is empty or set to false, the TranscodeTemplateIds parameter is required.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes transcoding configurations. You can delete specific transcoding templates from a transcoding template group or force delete an entire transcoding template group.</p>
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
     * <ul>
     * <li>Default transcoding templates cannot be deleted. Remove the default designation before deleting them.</li>
     * <li>For security protection purposes, a locked transcoding template group cannot be added to, modified, or deleted. Call the <a href="~~GetTranscodeTemplateGroup~~">GetTranscodeTemplateGroup</a> operation to query the template configuration and check the Locked response parameter to determine whether the template group is locked. Call the <a href="~~UpdateTranscodeTemplateGroup~~">UpdateTranscodeTemplateGroup</a> operation to unlock the template before making changes.</li>
     * <li>If the ForceDelGroup parameter is empty or set to false, the TranscodeTemplateIds parameter is required.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes transcoding configurations. You can delete specific transcoding templates from a transcoding template group or force delete an entire transcoding template group.</p>
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
     * <h3>Usage notes</h3>
     * <ul>
     * <li><strong>This operation physically deletes videos. Deleted videos cannot be recovered. Proceed with caution.</strong></li>
     * <li>Batch deletion is supported.</li>
     * <li>When you delete a video, the source files are deleted, including the video source file, transcoded stream files, and thumbnails. However, the CDN cache is not refreshed through synchronization. If your business requires it, use the purge feature in the ApsaraVideo VOD console to clear stale data from the point of presence. Related operations: see <a href="https://help.aliyun.com/document_detail/86098.html">Purge and prefetch</a>.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The single-user QPS limit for this operation is 30 calls per second. If the limit is exceeded, the API invoke is throttled, which may affect your business. Invoke this operation appropriately. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes complete videos, including video source files, transcoded stream files, and thumbnails.</p>
     * 
     * @param request DeleteVideoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteVideoResponse
     */
    public DeleteVideoResponse deleteVideoWithOptions(DeleteVideoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.referenceIds)) {
            query.put("ReferenceIds", request.referenceIds);
        }

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
     * <h3>Usage notes</h3>
     * <ul>
     * <li><strong>This operation physically deletes videos. Deleted videos cannot be recovered. Proceed with caution.</strong></li>
     * <li>Batch deletion is supported.</li>
     * <li>When you delete a video, the source files are deleted, including the video source file, transcoded stream files, and thumbnails. However, the CDN cache is not refreshed through synchronization. If your business requires it, use the purge feature in the ApsaraVideo VOD console to clear stale data from the point of presence. Related operations: see <a href="https://help.aliyun.com/document_detail/86098.html">Purge and prefetch</a>.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The single-user QPS limit for this operation is 30 calls per second. If the limit is exceeded, the API invoke is throttled, which may affect your business. Invoke this operation appropriately. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes complete videos, including video source files, transcoded stream files, and thumbnails.</p>
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
     * <li>Currently, the only supported service region is <strong>China (Shanghai)</strong>.</li>
     * <li>This operation makes the domain name inaccessible. Proceed with caution. Before deleting the domain name, restore the A record of the domain name at your DNS service provider.</li>
     * <li>After the domain name is successfully deleted, all related records of the ApsaraVideo VOD domain name are deleted. If you only want to temporarily disable the domain name, use the <a href="https://help.aliyun.com/document_detail/120208.html">DisableVodDomainOffline</a> operation.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes an accelerated domain name that has been added for ApsaraVideo VOD.</p>
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
     * <li>Currently, the only supported service region is <strong>China (Shanghai)</strong>.</li>
     * <li>This operation makes the domain name inaccessible. Proceed with caution. Before deleting the domain name, restore the A record of the domain name at your DNS service provider.</li>
     * <li>After the domain name is successfully deleted, all related records of the ApsaraVideo VOD domain name are deleted. If you only want to temporarily disable the domain name, use the <a href="https://help.aliyun.com/document_detail/120208.html">DisableVodDomainOffline</a> operation.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes an accelerated domain name that has been added for ApsaraVideo VOD.</p>
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
     * <ul>
     * <li>Currently, the only supported service region is <strong>China (Shanghai)</strong>.</li>
     * <li>This operation causes the domain name to become inaccessible. Before deleting the domain name, restore the A record of the domain name at your DNS service provider.</li>
     * <li>After the domain name is successfully deleted, all related records of the ApsaraVideo VOD domain name are removed. If you only want to temporarily disable the domain name, use the <a href="https://help.aliyun.com/document_detail/120208.html">DisableVodRealtimeLogDelivery</a> operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes the configurations of a domain name for CDN acceleration in ApsaraVideo VOD.</p>
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
     * <ul>
     * <li>Currently, the only supported service region is <strong>China (Shanghai)</strong>.</li>
     * <li>This operation causes the domain name to become inaccessible. Before deleting the domain name, restore the A record of the domain name at your DNS service provider.</li>
     * <li>After the domain name is successfully deleted, all related records of the ApsaraVideo VOD domain name are removed. If you only want to temporarily disable the domain name, use the <a href="https://help.aliyun.com/document_detail/120208.html">DisableVodRealtimeLogDelivery</a> operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes the configurations of a domain name for CDN acceleration in ApsaraVideo VOD.</p>
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
     * <ul>
     * <li><strong>When you delete an image watermark template, the watermark source file is physically deleted and cannot be recovered. Proceed with caution.</strong></li>
     * <li>A watermark template that has been set as the default watermark template cannot be deleted. To delete it, call <a href="~~SetDefaultWatermark~~">SetDefaultWatermark</a> to set another watermark template as the default template to remove the default status, and then delete it.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes an image watermark template or text watermark template by watermark template ID.</p>
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
     * <ul>
     * <li><strong>When you delete an image watermark template, the watermark source file is physically deleted and cannot be recovered. Proceed with caution.</strong></li>
     * <li>A watermark template that has been set as the default watermark template cannot be deleted. To delete it, call <a href="~~SetDefaultWatermark~~">SetDefaultWatermark</a> to set another watermark template as the default template to remove the default status, and then delete it.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes an image watermark template or text watermark template by watermark template ID.</p>
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
     * <ul>
     * <li>Currently, this operation is supported only in the China (Shanghai) region.</li>
     * <li>If you do not specify StartTime and EndTime, this operation returns data for the past 7 days by default. If you specify StartTime and EndTime, this operation returns data for the specified time range.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the time-based distribution of audio and video media assets. The maximum time span between the start time and end time is six months.</p>
     * 
     * @param request DescribeMediaDistributionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeMediaDistributionResponse
     */
    public DescribeMediaDistributionResponse describeMediaDistributionWithOptions(DescribeMediaDistributionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
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
            new TeaPair("action", "DescribeMediaDistribution"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMediaDistributionResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Currently, this operation is supported only in the China (Shanghai) region.</li>
     * <li>If you do not specify StartTime and EndTime, this operation returns data for the past 7 days by default. If you specify StartTime and EndTime, this operation returns data for the specified time range.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the time-based distribution of audio and video media assets. The maximum time span between the start time and end time is six months.</p>
     * 
     * @param request DescribeMediaDistributionRequest
     * @return DescribeMediaDistributionResponse
     */
    public DescribeMediaDistributionResponse describeMediaDistribution(DescribeMediaDistributionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMediaDistributionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Currently, the only supported service region is <strong>China (Shanghai)</strong>.</li>
     * <li>You can query playback statistics for up to the top 1000 videos per day. The top video list is sorted in descending order by the number of views by default.</li>
     * <li>Only playback data collected through ApsaraVideo Player SDK is supported.</li>
     * <li>Based on UTC+8, playback statistics for the previous day are generated at 9:00 AM each day.</li>
     * <li>You can query data generated after January 1, 2018. The maximum time range for a query is 180 days.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves daily playback statistics for top videos, including the number of views, unique viewers, and total playback duration.</p>
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
     * <ul>
     * <li>Currently, the only supported service region is <strong>China (Shanghai)</strong>.</li>
     * <li>You can query playback statistics for up to the top 1000 videos per day. The top video list is sorted in descending order by the number of views by default.</li>
     * <li>Only playback data collected through ApsaraVideo Player SDK is supported.</li>
     * <li>Based on UTC+8, playback statistics for the previous day are generated at 9:00 AM each day.</li>
     * <li>You can query data generated after January 1, 2018. The maximum time range for a query is 180 days.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves daily playback statistics for top videos, including the number of views, unique viewers, and total playback duration.</p>
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
     * <ul>
     * <li>Currently, the only supported service region is <strong>China (Shanghai)</strong>.</li>
     * <li>Only playback data collected through ApsaraVideo Player SDK is supported.</li>
     * <li>Playback statistics for the previous day are generated at 9:00 AM (UTC+8) each day.</li>
     * <li>You can query data generated after 2018-01-01. The maximum time range between the start time and end time is 180 days.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves daily average playback statistics for a specified time range, including average playback duration and average playback count.</p>
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
     * <ul>
     * <li>Currently, the only supported service region is <strong>China (Shanghai)</strong>.</li>
     * <li>Only playback data collected through ApsaraVideo Player SDK is supported.</li>
     * <li>Playback statistics for the previous day are generated at 9:00 AM (UTC+8) each day.</li>
     * <li>You can query data generated after 2018-01-01. The maximum time range between the start time and end time is 180 days.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves daily average playback statistics for a specified time range, including average playback duration and average playback count.</p>
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
     * <ul>
     * <li>Currently, the only supported service region is <strong>China (Shanghai)</strong>.</li>
     * <li>Only playback data from ApsaraVideo Player SDK is supported.</li>
     * <li>Based on UTC+8, playback statistics for the previous day are generated at 9:00 AM each day.</li>
     * <li>Data after 2018-01-01 can be queried. The maximum time span between the start time and end time is 180 days.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the total daily playback statistics within a specified time range, including total play count, total unique viewers, total playback duration, and playback duration distribution.</p>
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
     * <ul>
     * <li>Currently, the only supported service region is <strong>China (Shanghai)</strong>.</li>
     * <li>Only playback data from ApsaraVideo Player SDK is supported.</li>
     * <li>Based on UTC+8, playback statistics for the previous day are generated at 9:00 AM each day.</li>
     * <li>Data after 2018-01-01 can be queried. The maximum time span between the start time and end time is 180 days.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the total daily playback statistics within a specified time range, including total play count, total unique viewers, total playback duration, and playback duration distribution.</p>
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
     * <ul>
     * <li>Currently, the service address supports only <strong>China (Shanghai)</strong>.</li>
     * <li>Only playback data of videos that use ApsaraVideo Player SDK and rank in the top 1,000 by daily playback count is supported.</li>
     * <li>Based on UTC+8, playback statistics for the previous day are generated at 9:00 AM each day.</li>
     * <li>Only data within the last 2 years (730 days) can be queried, and the maximum time span between the start time and end time is 180 days.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the daily playback statistics of a specified video within a specified time range. The statistics include total playback duration, number of playbacks, number of unique viewers, and playback duration distribution.</p>
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
     * <ul>
     * <li>Currently, the service address supports only <strong>China (Shanghai)</strong>.</li>
     * <li>Only playback data of videos that use ApsaraVideo Player SDK and rank in the top 1,000 by daily playback count is supported.</li>
     * <li>Based on UTC+8, playback statistics for the previous day are generated at 9:00 AM each day.</li>
     * <li>Only data within the last 2 years (730 days) can be queried, and the maximum time span between the start time and end time is 180 days.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the daily playback statistics of a specified video within a specified time range. The statistics include total playback duration, number of playbacks, number of unique viewers, and playback duration distribution.</p>
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
     * <ul>
     * <li>Currently, the service address supports only <strong>China (Shanghai)</strong>.</li>
     * <li>If the interval between the start time and end time is within 7 days, hourly data is returned. If the interval is greater than 7 days, daily data is returned. The maximum interval is 31 days.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries usage data of AI processing services such as automated review and media fingerprint.</p>
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
     * <ul>
     * <li>Currently, the service address supports only <strong>China (Shanghai)</strong>.</li>
     * <li>If the interval between the start time and end time is within 7 days, hourly data is returned. If the interval is greater than 7 days, daily data is returned. The maximum interval is 31 days.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries usage data of AI processing services such as automated review and media fingerprint.</p>
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
     * <ul>
     * <li>Currently, the service address is supported only in the <strong>China (Shanghai)</strong> region.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the certificate list information.</p>
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
     * <ul>
     * <li>Currently, the service address is supported only in the <strong>China (Shanghai)</strong> region.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the certificate list information.</p>
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
     * <ul>
     * <li>Currently, this operation is available only in the <strong>China (Shanghai)</strong> region.</li>
     * <li>Batch queries are supported. You can query data for up to 500 domain names at a time.</li>
     * <li>If you do not specify <code>StartTime</code> and <code>EndTime</code>, this operation returns data for the past 24 hours by default. If you specify <code>StartTime</code> and <code>EndTime</code>, this operation returns data for the specified time range.
     * <strong>Time granularity of returned data</strong>
     * If you specify <code>StartTime</code> and <code>EndTime</code> without Settings for <code>Interval</code>, the default time granularity of returned data, the queryable historical data time range, and the data latency are as follows:<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Time span per query</th>
     * <th>Queryable historical data time range</th>
     * <th>Data latency</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>Time span per query &lt; 3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>3 days ≤ Time span per query &lt; 31 days</td>
     * <td>186 days</td>
     * <td>Generally 3-4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>31 days ≤ Time span per query ≤ 90 days</td>
     * <td>366 days</td>
     * <td>Generally 4 hours, no more than 24 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Invokes this operation to query the bandwidth data of an accelerated domain name. Compared with the DescribeVodDomainRealTimeBpsData operation, this operation supports a longer time range for historical data queries (up to 366 days) but provides a larger data time granularity (minimum of 5 minutes) and higher data latency.</p>
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
     * <ul>
     * <li>Currently, this operation is available only in the <strong>China (Shanghai)</strong> region.</li>
     * <li>Batch queries are supported. You can query data for up to 500 domain names at a time.</li>
     * <li>If you do not specify <code>StartTime</code> and <code>EndTime</code>, this operation returns data for the past 24 hours by default. If you specify <code>StartTime</code> and <code>EndTime</code>, this operation returns data for the specified time range.
     * <strong>Time granularity of returned data</strong>
     * If you specify <code>StartTime</code> and <code>EndTime</code> without Settings for <code>Interval</code>, the default time granularity of returned data, the queryable historical data time range, and the data latency are as follows:<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Time span per query</th>
     * <th>Queryable historical data time range</th>
     * <th>Data latency</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>Time span per query &lt; 3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>3 days ≤ Time span per query &lt; 31 days</td>
     * <td>186 days</td>
     * <td>Generally 3-4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>31 days ≤ Time span per query ≤ 90 days</td>
     * <td>366 days</td>
     * <td>Generally 4 hours, no more than 24 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Invokes this operation to query the bandwidth data of an accelerated domain name. Compared with the DescribeVodDomainRealTimeBpsData operation, this operation supports a longer time range for historical data queries (up to 366 days) but provides a larger data time granularity (minimum of 5 minutes) and higher data latency.</p>
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
     * <ul>
     * <li>Currently, this operation is supported only in the <strong>China (Shanghai)</strong> region.</li>
     * <li>Batch queries are supported. You can query data of up to 500 domain names at a time.</li>
     * <li>If you do not specify <code>StartTime</code> and <code>EndTime</code>, this operation returns data of the last 24 hours by default. If you specify <code>StartTime</code> and <code>EndTime</code>, this operation returns data of the specified time range.
     * <strong>Time granularity of returned data</strong>
     * If you specify <code>StartTime</code> and <code>EndTime</code> without configuring <code>Interval</code>, the default time granularity, the maximum time range for historical data queries, and the data delay are as follows:<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Time range per query</th>
     * <th>Maximum time range for historical data queries</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>Time range per query &lt; 3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>3 days ≤ Time range per query &lt; 31 days</td>
     * <td>186 days</td>
     * <td>Typically 3 to 4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>31 days ≤ Time range per query ≤ 366 days</td>
     * <td>366 days</td>
     * <td>Typically 4 hours, up to 24 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries bandwidth data of accelerated domain names by protocol type.</p>
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
     * <ul>
     * <li>Currently, this operation is supported only in the <strong>China (Shanghai)</strong> region.</li>
     * <li>Batch queries are supported. You can query data of up to 500 domain names at a time.</li>
     * <li>If you do not specify <code>StartTime</code> and <code>EndTime</code>, this operation returns data of the last 24 hours by default. If you specify <code>StartTime</code> and <code>EndTime</code>, this operation returns data of the specified time range.
     * <strong>Time granularity of returned data</strong>
     * If you specify <code>StartTime</code> and <code>EndTime</code> without configuring <code>Interval</code>, the default time granularity, the maximum time range for historical data queries, and the data delay are as follows:<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Time range per query</th>
     * <th>Maximum time range for historical data queries</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>Time range per query &lt; 3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>3 days ≤ Time range per query &lt; 31 days</td>
     * <td>186 days</td>
     * <td>Typically 3 to 4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>31 days ≤ Time range per query ≤ 366 days</td>
     * <td>366 days</td>
     * <td>Typically 4 hours, up to 24 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries bandwidth data of accelerated domain names by protocol type.</p>
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
     * <p>Currently, the only supported service region is <strong>China (Shanghai)</strong>.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the certificate information of a specified accelerated domain name.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.heraApiAutoVersion)) {
            query.put("HeraApiAutoVersion", request.heraApiAutoVersion);
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
     * <p>Currently, the only supported service region is <strong>China (Shanghai)</strong>.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the certificate information of a specified accelerated domain name.</p>
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
     * <ul>
     * <li>Currently, the service address supports only <strong>China (Shanghai)</strong>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries domain name configurations. You can query multiple feature configurations in a single request.</p>
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
     * <ul>
     * <li>Currently, the service address supports only <strong>China (Shanghai)</strong>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries domain name configurations. You can query multiple feature configurations in a single request.</p>
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
     * <p>Currently, the China service address supports only <strong>China (Shanghai)</strong>.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the basic configuration information of a specified China domain name for video-on-demand (VOD) acceleration.</p>
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
     * <p>Currently, the China service address supports only <strong>China (Shanghai)</strong>.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the basic configuration information of a specified China domain name for video-on-demand (VOD) acceleration.</p>
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
     * <ul>
     * <li>Currently, this operation is supported only in the <strong>China (Shanghai)</strong> region.</li>
     * <li>Batch queries are supported. You can query data for up to 500 domain names at a time.</li>
     * <li>If you do not specify <code>StartTime</code> and <code>EndTime</code>, data from the past 24 hours is returned by default. If you specify <code>StartTime</code> and <code>EndTime</code>, data for the specified time range is returned.
     * <strong>Time granularity of returned data</strong>
     * If you specify <code>StartTime</code> and <code>EndTime</code> without setting <code>Interval</code>, the default time granularity, the maximum time range for historical data queries, and the data delay are as follows:<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Time span per query</th>
     * <th>Maximum time range for historical data queries</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>Time span per query &lt; 3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>3 days ≤ Time span per query &lt; 31 days</td>
     * <td>186 days</td>
     * <td>Generally 3 to 4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>31 days ≤ Time span per query ≤ 366 days</td>
     * <td>366 days</td>
     * <td>Generally 4 hours, up to 24 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the byte hit ratio (percentage of hit bytes) of an accelerated domain name.</p>
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
     * <ul>
     * <li>Currently, this operation is supported only in the <strong>China (Shanghai)</strong> region.</li>
     * <li>Batch queries are supported. You can query data for up to 500 domain names at a time.</li>
     * <li>If you do not specify <code>StartTime</code> and <code>EndTime</code>, data from the past 24 hours is returned by default. If you specify <code>StartTime</code> and <code>EndTime</code>, data for the specified time range is returned.
     * <strong>Time granularity of returned data</strong>
     * If you specify <code>StartTime</code> and <code>EndTime</code> without setting <code>Interval</code>, the default time granularity, the maximum time range for historical data queries, and the data delay are as follows:<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Time span per query</th>
     * <th>Maximum time range for historical data queries</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>Time span per query &lt; 3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>3 days ≤ Time span per query &lt; 31 days</td>
     * <td>186 days</td>
     * <td>Generally 3 to 4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>31 days ≤ Time span per query ≤ 366 days</td>
     * <td>366 days</td>
     * <td>Generally 4 hours, up to 24 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the byte hit ratio (percentage of hit bytes) of an accelerated domain name.</p>
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
     * <ul>
     * <li>Currently, the only supported service region is <strong>China (Shanghai)</strong>.</li>
     * <li>For details about log formats and latency, refer to <a href="https://help.aliyun.com/document_detail/86099.html">Log Management</a>.</li>
     * <li>If you do not specify StartTime and EndTime, log data from the past 24 hours is returned by default.</li>
     * <li>StartTime and EndTime must be specified together to query logs within the specified time range.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the download URLs of raw CDN access logs for a specified domain name.</p>
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
     * <ul>
     * <li>Currently, the only supported service region is <strong>China (Shanghai)</strong>.</li>
     * <li>For details about log formats and latency, refer to <a href="https://help.aliyun.com/document_detail/86099.html">Log Management</a>.</li>
     * <li>If you do not specify StartTime and EndTime, log data from the past 24 hours is returned by default.</li>
     * <li>StartTime and EndTime must be specified together to query logs within the specified time range.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the download URLs of raw CDN access logs for a specified domain name.</p>
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
     * <p><em>Three query methods are available:</em>*</p>
     * <ul>
     * <li>When both StartTime and EndTime are specified: if the difference between EndTime and StartTime is within 24 hours, the 95th percentile bandwidth of the day that contains StartTime is returned. Otherwise, the 95th percentile bandwidth of the month that contains StartTime is returned.</li>
     * <li>When both TimePoint and Cycle are specified, the 95th percentile bandwidth of the cycle that contains TimePoint is returned.</li>
     * <li>When StartTime and EndTime are specified with an additional Cycle parameter, the 95th percentile bandwidth for all specified cycles within the query range is returned.
     * If none of these three methods are specified, the 95th percentile bandwidth of the past 24 hours is returned by default.</li>
     * <li>Maximum query span: 90 days.</li>
     * <li>Minimum query granularity: 1 day.</li>
     * <li>Maximum query range: 90 days.</li>
     * <li>Maximum number of calls per user per second: 100.</li>
     * <li>Data unit: bit/s.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the 95th percentile bandwidth monitoring data for accelerated domain names.</p>
     * 
     * @param request DescribeVodDomainMax95BpsDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVodDomainMax95BpsDataResponse
     */
    public DescribeVodDomainMax95BpsDataResponse describeVodDomainMax95BpsDataWithOptions(DescribeVodDomainMax95BpsDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVodDomainMax95BpsData"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVodDomainMax95BpsDataResponse());
    }

    /**
     * <b>description</b> :
     * <p><em>Three query methods are available:</em>*</p>
     * <ul>
     * <li>When both StartTime and EndTime are specified: if the difference between EndTime and StartTime is within 24 hours, the 95th percentile bandwidth of the day that contains StartTime is returned. Otherwise, the 95th percentile bandwidth of the month that contains StartTime is returned.</li>
     * <li>When both TimePoint and Cycle are specified, the 95th percentile bandwidth of the cycle that contains TimePoint is returned.</li>
     * <li>When StartTime and EndTime are specified with an additional Cycle parameter, the 95th percentile bandwidth for all specified cycles within the query range is returned.
     * If none of these three methods are specified, the 95th percentile bandwidth of the past 24 hours is returned by default.</li>
     * <li>Maximum query span: 90 days.</li>
     * <li>Minimum query granularity: 1 day.</li>
     * <li>Maximum query range: 90 days.</li>
     * <li>Maximum number of calls per user per second: 100.</li>
     * <li>Data unit: bit/s.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the 95th percentile bandwidth monitoring data for accelerated domain names.</p>
     * 
     * @param request DescribeVodDomainMax95BpsDataRequest
     * @return DescribeVodDomainMax95BpsDataResponse
     */
    public DescribeVodDomainMax95BpsDataResponse describeVodDomainMax95BpsData(DescribeVodDomainMax95BpsDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodDomainMax95BpsDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Currently, this operation is supported only in the <strong>China (Shanghai)</strong> region.</li>
     * <li>Maximum call frequency per user: 100 calls per second.</li>
     * <li>If you do not specify StartTime and EndTime, this operation returns data from the last 24 hours. If you specify StartTime and EndTime, this operation returns data for the specified time range.
     * <strong>Supported time granularities</strong>
     * The Interval request parameter supports different data time granularities based on the maximum time range per query. The following table describes the queryable historical data time range and data latency for each time granularity:<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Queryable historical data time range</th>
     * <th>Data latency</th>
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
     * <td>Typically 3-4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>366 days</td>
     * <td>366 days</td>
     * <td>Typically 4 hours, no more than 24 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * <hr>
     * 
     * <b>summary</b> : 
     * <p>Queries the queries per second (QPS) of accelerated domain names at a 5-minute granularity. Data from the last 90 days is supported.</p>
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
     * <ul>
     * <li>Currently, this operation is supported only in the <strong>China (Shanghai)</strong> region.</li>
     * <li>Maximum call frequency per user: 100 calls per second.</li>
     * <li>If you do not specify StartTime and EndTime, this operation returns data from the last 24 hours. If you specify StartTime and EndTime, this operation returns data for the specified time range.
     * <strong>Supported time granularities</strong>
     * The Interval request parameter supports different data time granularities based on the maximum time range per query. The following table describes the queryable historical data time range and data latency for each time granularity:<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Queryable historical data time range</th>
     * <th>Data latency</th>
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
     * <td>Typically 3-4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>366 days</td>
     * <td>366 days</td>
     * <td>Typically 4 hours, no more than 24 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * <hr>
     * 
     * <b>summary</b> : 
     * <p>Queries the queries per second (QPS) of accelerated domain names at a 5-minute granularity. Data from the last 90 days is supported.</p>
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
     * <ul>
     * <li>Currently, this operation is supported only in the <strong>China (Shanghai)</strong> region.</li>
     * <li>Batch queries are supported. You can query data for up to 500 domain names at a time.</li>
     * <li>If you do not specify <code>StartTime</code> and <code>EndTime</code>, this operation returns data for the last hour by default. If you specify <code>StartTime</code> and <code>EndTime</code>, this operation returns data for the specified time range.
     * <strong>Time granularity of returned data</strong>
     * The time granularity of returned data varies based on the time range specified by <code>StartTime</code> and <code>EndTime</code>. The following table describes the queryable historical data time range and data latency for each time granularity:<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Time range per query</th>
     * <th>Queryable historical data time range</th>
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
     * <td>1 hour &lt; Time range per query &lt; 3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>3 days ≤ Time range per query &lt; 31 days</td>
     * <td>186 days</td>
     * <td>Generally 3 to 4 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Invokes this operation to query the bandwidth data of an accelerated domain name. Compared with the DescribeVodDomainBpsData operation, this operation supports a smaller time granularity (minimum of 1 minute), lower data latency (minimum of 5 minutes), but a shorter historical data time range (up to 186 days).</p>
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
     * <ul>
     * <li>Currently, this operation is supported only in the <strong>China (Shanghai)</strong> region.</li>
     * <li>Batch queries are supported. You can query data for up to 500 domain names at a time.</li>
     * <li>If you do not specify <code>StartTime</code> and <code>EndTime</code>, this operation returns data for the last hour by default. If you specify <code>StartTime</code> and <code>EndTime</code>, this operation returns data for the specified time range.
     * <strong>Time granularity of returned data</strong>
     * The time granularity of returned data varies based on the time range specified by <code>StartTime</code> and <code>EndTime</code>. The following table describes the queryable historical data time range and data latency for each time granularity:<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Time range per query</th>
     * <th>Queryable historical data time range</th>
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
     * <td>1 hour &lt; Time range per query &lt; 3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>3 days ≤ Time range per query &lt; 31 days</td>
     * <td>186 days</td>
     * <td>Generally 3 to 4 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Invokes this operation to query the bandwidth data of an accelerated domain name. Compared with the DescribeVodDomainBpsData operation, this operation supports a smaller time granularity (minimum of 1 minute), lower data latency (minimum of 5 minutes), but a shorter historical data time range (up to 186 days).</p>
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
     * <ul>
     * <li>Currently, this operation is supported only in the <strong>China (Shanghai)</strong> region.</li>
     * <li>Batch queries are supported. You can query data for up to 100 domain names at a time.</li>
     * <li>If you do not specify <code>StartTime</code> and <code>EndTime</code>, this operation returns data from the last hour by default. If you specify <code>StartTime</code> and <code>EndTime</code>, this operation returns data for the specified time range.
     * <strong>Time granularity of returned data</strong>
     * The time granularity of returned data varies based on the time range specified by <code>StartTime</code> and <code>EndTime</code>. The following table describes the queryable historical data range and data delay for each time granularity:<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Time range per query</th>
     * <th>Queryable historical data range</th>
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
     * <td>1 hour &lt; Time range per query &lt; 3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>3 days ≤ Time range per query &lt; 31 days</td>
     * <td>186 days</td>
     * <td>Typically 3 to 4 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the byte hit rate data of accelerated domain names. This operation supports a minimum time granularity of 1 minute, with a data delay of at least 5 minutes, and allows you to query data from the last 186 days.</p>
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
     * <ul>
     * <li>Currently, this operation is supported only in the <strong>China (Shanghai)</strong> region.</li>
     * <li>Batch queries are supported. You can query data for up to 100 domain names at a time.</li>
     * <li>If you do not specify <code>StartTime</code> and <code>EndTime</code>, this operation returns data from the last hour by default. If you specify <code>StartTime</code> and <code>EndTime</code>, this operation returns data for the specified time range.
     * <strong>Time granularity of returned data</strong>
     * The time granularity of returned data varies based on the time range specified by <code>StartTime</code> and <code>EndTime</code>. The following table describes the queryable historical data range and data delay for each time granularity:<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Time range per query</th>
     * <th>Queryable historical data range</th>
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
     * <td>1 hour &lt; Time range per query &lt; 3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>3 days ≤ Time range per query &lt; 31 days</td>
     * <td>186 days</td>
     * <td>Typically 3 to 4 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the byte hit rate data of accelerated domain names. This operation supports a minimum time granularity of 1 minute, with a data delay of at least 5 minutes, and allows you to query data from the last 186 days.</p>
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
     * <ul>
     * <li>Currently, this operation is available only in the <strong>China (Shanghai)</strong> region.</li>
     * <li>Batch queries are supported. You can query data for up to 20 domain names at a time.</li>
     * <li>The maximum time range per query (the time range between StartTime and EndTime) is 10 minutes, and data is returned at a time granularity of 1 minute.</li>
     * <li>Only data within the last 7 days can be queried.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries real-time access data for accelerated domain names, including QPS, bandwidth, and HTTP status code data within the last 7 days.</p>
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
     * <ul>
     * <li>Currently, this operation is available only in the <strong>China (Shanghai)</strong> region.</li>
     * <li>Batch queries are supported. You can query data for up to 20 domain names at a time.</li>
     * <li>The maximum time range per query (the time range between StartTime and EndTime) is 10 minutes, and data is returned at a time granularity of 1 minute.</li>
     * <li>Only data within the last 7 days can be queried.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries real-time access data for accelerated domain names, including QPS, bandwidth, and HTTP status code data within the last 7 days.</p>
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
     * <ul>
     * <li>Currently, this operation is available only in the <strong>China (Shanghai)</strong> region.</li>
     * <li>Batch queries are supported. You can query data for up to 100 domain names at a time.</li>
     * <li>If you do not specify <code>StartTime</code> and <code>EndTime</code>, this operation returns data from the last hour by default. If you specify <code>StartTime</code> and <code>EndTime</code>, this operation returns data for the specified time range.
     * <strong>Time granularity of returned data</strong>
     * The time granularity of returned data varies based on the time range specified by <code>StartTime</code> and <code>EndTime</code>. The following table describes the queryable historical data range and data delay for each time granularity:<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Time range per query</th>
     * <th>Queryable historical data range</th>
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
     * <td>1 hour &lt; Time range per query &lt; 3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>3 days ≤ Time range per query &lt; 31 days</td>
     * <td>186 days</td>
     * <td>Typically 3 to 4 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the total number and proportion of HTTP status codes for an accelerated domain name. This operation supports a minimum data time granularity of 1 minute, with a data delay of at least 5 minutes, and allows you to query data from the last 186 days.</p>
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
     * <ul>
     * <li>Currently, this operation is available only in the <strong>China (Shanghai)</strong> region.</li>
     * <li>Batch queries are supported. You can query data for up to 100 domain names at a time.</li>
     * <li>If you do not specify <code>StartTime</code> and <code>EndTime</code>, this operation returns data from the last hour by default. If you specify <code>StartTime</code> and <code>EndTime</code>, this operation returns data for the specified time range.
     * <strong>Time granularity of returned data</strong>
     * The time granularity of returned data varies based on the time range specified by <code>StartTime</code> and <code>EndTime</code>. The following table describes the queryable historical data range and data delay for each time granularity:<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Time range per query</th>
     * <th>Queryable historical data range</th>
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
     * <td>1 hour &lt; Time range per query &lt; 3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>3 days ≤ Time range per query &lt; 31 days</td>
     * <td>186 days</td>
     * <td>Typically 3 to 4 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the total number and proportion of HTTP status codes for an accelerated domain name. This operation supports a minimum data time granularity of 1 minute, with a data delay of at least 5 minutes, and allows you to query data from the last 186 days.</p>
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
     * <ul>
     * <li>Currently, this operation is available only in the <strong>China (Shanghai)</strong> region.</li>
     * <li>Batch queries are supported. You can query data for up to 500 domain names at a time.</li>
     * <li>If you do not specify <code>StartTime</code> and <code>EndTime</code>, this operation returns data from the last hour by default. If you specify <code>StartTime</code> and <code>EndTime</code>, this operation returns data for the specified time range.
     * <strong>Time granularity of returned data</strong>
     * The time granularity of returned data varies based on the time range specified by <code>StartTime</code> and <code>EndTime</code>. The following table describes the queryable historical data range and data delay for each time granularity:<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Time range per query</th>
     * <th>Queryable historical data range</th>
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
     * <td>1 hour &lt; Time range per query &lt; 3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>3 days ≤ Time range per query &lt; 31 days</td>
     * <td>186 days</td>
     * <td>Typically 3 to 4 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Invoke this operation to query the queries per second (QPS) data for access to an accelerated domain name. This operation supports a minimum data time granularity of 1 minute, with a data delay of at least 5 minutes, and allows you to query data from the last 186 days.</p>
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
     * <ul>
     * <li>Currently, this operation is available only in the <strong>China (Shanghai)</strong> region.</li>
     * <li>Batch queries are supported. You can query data for up to 500 domain names at a time.</li>
     * <li>If you do not specify <code>StartTime</code> and <code>EndTime</code>, this operation returns data from the last hour by default. If you specify <code>StartTime</code> and <code>EndTime</code>, this operation returns data for the specified time range.
     * <strong>Time granularity of returned data</strong>
     * The time granularity of returned data varies based on the time range specified by <code>StartTime</code> and <code>EndTime</code>. The following table describes the queryable historical data range and data delay for each time granularity:<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Time range per query</th>
     * <th>Queryable historical data range</th>
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
     * <td>1 hour &lt; Time range per query &lt; 3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>3 days ≤ Time range per query &lt; 31 days</td>
     * <td>186 days</td>
     * <td>Typically 3 to 4 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Invoke this operation to query the queries per second (QPS) data for access to an accelerated domain name. This operation supports a minimum data time granularity of 1 minute, with a data delay of at least 5 minutes, and allows you to query data from the last 186 days.</p>
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
     * <ul>
     * <li>Currently, this operation is supported only in the <strong>China (Shanghai)</strong> region.</li>
     * <li>Batch queries are supported. You can query data for up to 100 domain names at a time.</li>
     * <li>If you do not specify <code>StartTime</code> and <code>EndTime</code>, this operation returns data for the last 1 hour by default. If you specify <code>StartTime</code> and <code>EndTime</code>, this operation returns data for the specified time range.</li>
     * <li>The Go language uses the POST method by default. Manually change the request method to GET by declaring <code>request.Method=&quot;GET&quot;</code>.
     * <strong>Time granularity of returned data</strong>
     * The time granularity of returned data varies based on the time range specified by <code>StartTime</code> and <code>EndTime</code>. The following table describes the queryable historical data range and data latency for each time granularity:<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Time range per query</th>
     * <th>Queryable historical data range</th>
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
     * <td>1 hour &lt; Time range per query &lt; 3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>3 days ≤ Time range per query &lt; 31 days</td>
     * <td>186 days</td>
     * <td>Typically 3 to 4 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the request hit ratio data for an accelerated domain name. The minimum time granularity for data queried by this operation is 1 minute. The data latency is at least 5 minutes. You can query data for up to the last 186 days.</p>
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
     * <ul>
     * <li>Currently, this operation is supported only in the <strong>China (Shanghai)</strong> region.</li>
     * <li>Batch queries are supported. You can query data for up to 100 domain names at a time.</li>
     * <li>If you do not specify <code>StartTime</code> and <code>EndTime</code>, this operation returns data for the last 1 hour by default. If you specify <code>StartTime</code> and <code>EndTime</code>, this operation returns data for the specified time range.</li>
     * <li>The Go language uses the POST method by default. Manually change the request method to GET by declaring <code>request.Method=&quot;GET&quot;</code>.
     * <strong>Time granularity of returned data</strong>
     * The time granularity of returned data varies based on the time range specified by <code>StartTime</code> and <code>EndTime</code>. The following table describes the queryable historical data range and data latency for each time granularity:<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Time range per query</th>
     * <th>Queryable historical data range</th>
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
     * <td>1 hour &lt; Time range per query &lt; 3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>3 days ≤ Time range per query &lt; 31 days</td>
     * <td>186 days</td>
     * <td>Typically 3 to 4 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the request hit ratio data for an accelerated domain name. The minimum time granularity for data queried by this operation is 1 minute. The data latency is at least 5 minutes. You can query data for up to the last 186 days.</p>
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
     * <ul>
     * <li>The service address of this operation supports only <strong>China (Shanghai)</strong>.</li>
     * <li>Batch queries are supported. You can query data for up to 100 domain names at a time.</li>
     * <li>If you do not specify <code>StartTime</code> and <code>EndTime</code>, this operation returns data for the last hour by default. If you specify <code>StartTime</code> and <code>EndTime</code>, this operation returns data for the specified time range.
     * <strong>Time granularity of returned data</strong>
     * The time granularity of returned data varies based on the time range specified by <code>StartTime</code> and <code>EndTime</code>. The following table describes the queryable historical data range and data latency for each time granularity:<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Time range per query</th>
     * <th>Queryable historical data range</th>
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
     * <td>1 hour &lt; Time range per query &lt; 3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>3 days ≤ Time range per query &lt; 31 days</td>
     * <td>186 days</td>
     * <td>Generally 3 to 4 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Invokes this operation to query the traffic data of an accelerated domain name. Compared with the DescribeVodDomainTrafficData operation, this operation supports a smaller time granularity (minimum of 1 minute), lower data latency (minimum of 5 minutes), but a shorter historical data range (up to 186 days).</p>
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
     * <ul>
     * <li>The service address of this operation supports only <strong>China (Shanghai)</strong>.</li>
     * <li>Batch queries are supported. You can query data for up to 100 domain names at a time.</li>
     * <li>If you do not specify <code>StartTime</code> and <code>EndTime</code>, this operation returns data for the last hour by default. If you specify <code>StartTime</code> and <code>EndTime</code>, this operation returns data for the specified time range.
     * <strong>Time granularity of returned data</strong>
     * The time granularity of returned data varies based on the time range specified by <code>StartTime</code> and <code>EndTime</code>. The following table describes the queryable historical data range and data latency for each time granularity:<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Time range per query</th>
     * <th>Queryable historical data range</th>
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
     * <td>1 hour &lt; Time range per query &lt; 3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>3 days ≤ Time range per query &lt; 31 days</td>
     * <td>186 days</td>
     * <td>Generally 3 to 4 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Invokes this operation to query the traffic data of an accelerated domain name. Compared with the DescribeVodDomainTrafficData operation, this operation supports a smaller time granularity (minimum of 1 minute), lower data latency (minimum of 5 minutes), but a shorter historical data range (up to 186 days).</p>
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
     * <ul>
     * <li>Currently, this operation supports only the following service address: <strong>China (Shanghai)</strong>.</li>
     * <li>Batch query is supported. You can query data of up to 500 domain names at a time.</li>
     * <li>If you do not specify <code>StartTime</code> and <code>EndTime</code>, this operation returns data of the last 24 hours by default. If you specify <code>StartTime</code> and <code>EndTime</code>, this operation returns data of the specified time range.
     * <strong>Time granularity of returned data</strong>
     * Based on the time span specified by <code>StartTime</code> and <code>EndTime</code>, and when <code>Interval</code> is not set, the default time granularity of returned data, the queryable historical data time range, and data latency are as follows:<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Time span per query</th>
     * <th>Queryable historical data time range</th>
     * <th>Data latency</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>Time span per query &lt; 3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>3 days ≤ Time span per query &lt; 31 days</td>
     * <td>186 days</td>
     * <td>Generally 3 to 4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>31 days ≤ Time span per query ≤ 90 days</td>
     * <td>366 days</td>
     * <td>Generally 4 hours, no more than 24 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the request hit ratio (percentage of hit requests) of an accelerated domain name.</p>
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
     * <ul>
     * <li>Currently, this operation supports only the following service address: <strong>China (Shanghai)</strong>.</li>
     * <li>Batch query is supported. You can query data of up to 500 domain names at a time.</li>
     * <li>If you do not specify <code>StartTime</code> and <code>EndTime</code>, this operation returns data of the last 24 hours by default. If you specify <code>StartTime</code> and <code>EndTime</code>, this operation returns data of the specified time range.
     * <strong>Time granularity of returned data</strong>
     * Based on the time span specified by <code>StartTime</code> and <code>EndTime</code>, and when <code>Interval</code> is not set, the default time granularity of returned data, the queryable historical data time range, and data latency are as follows:<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Time span per query</th>
     * <th>Queryable historical data time range</th>
     * <th>Data latency</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>Time span per query &lt; 3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>3 days ≤ Time span per query &lt; 31 days</td>
     * <td>186 days</td>
     * <td>Generally 3 to 4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>31 days ≤ Time span per query ≤ 90 days</td>
     * <td>366 days</td>
     * <td>Generally 4 hours, no more than 24 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the request hit ratio (percentage of hit requests) of an accelerated domain name.</p>
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
     * <ul>
     * <li>Currently, this operation supports only the following service address: <strong>China (Shanghai)</strong>.</li>
     * <li>Batch queries are supported. You can query data for up to 500 domain names at a time.</li>
     * <li>If you do not specify <code>StartTime</code> and <code>EndTime</code>, this operation returns data from the past 24 hours by default. If you specify <code>StartTime</code> and <code>EndTime</code>, this operation returns data for the specified time range.
     * <strong>Time granularity of returned data</strong>
     * Based on the time span specified by <code>StartTime</code> and <code>EndTime</code>, and when <code>Interval</code> is not set, the default time granularity of returned data, the queryable historical data range, and data latency are as follows:<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Time span per query</th>
     * <th>Queryable historical data range</th>
     * <th>Data latency</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>Time span per query &lt; 3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>3 days ≤ Time span per query &lt; 31 days</td>
     * <td>186 days</td>
     * <td>Generally 3 to 4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>31 days ≤ Time span per query ≤ 366 days</td>
     * <td>366 days</td>
     * <td>Generally 4 hours, up to 24 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the back-to-origin bandwidth data of accelerated domain names.</p>
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
     * <ul>
     * <li>Currently, this operation supports only the following service address: <strong>China (Shanghai)</strong>.</li>
     * <li>Batch queries are supported. You can query data for up to 500 domain names at a time.</li>
     * <li>If you do not specify <code>StartTime</code> and <code>EndTime</code>, this operation returns data from the past 24 hours by default. If you specify <code>StartTime</code> and <code>EndTime</code>, this operation returns data for the specified time range.
     * <strong>Time granularity of returned data</strong>
     * Based on the time span specified by <code>StartTime</code> and <code>EndTime</code>, and when <code>Interval</code> is not set, the default time granularity of returned data, the queryable historical data range, and data latency are as follows:<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Time span per query</th>
     * <th>Queryable historical data range</th>
     * <th>Data latency</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>Time span per query &lt; 3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>3 days ≤ Time span per query &lt; 31 days</td>
     * <td>186 days</td>
     * <td>Generally 3 to 4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>31 days ≤ Time span per query ≤ 366 days</td>
     * <td>366 days</td>
     * <td>Generally 4 hours, up to 24 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the back-to-origin bandwidth data of accelerated domain names.</p>
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
     * <ul>
     * <li>Currently, this operation supports only the following service address: <strong>China (Shanghai)</strong>.</li>
     * <li>Batch queries are supported. You can query data for up to 500 domain names at a time.</li>
     * <li>If you do not specify <code>StartTime</code> and <code>EndTime</code>, this operation returns data from the past 24 hours by default. If you specify <code>StartTime</code> and <code>EndTime</code>, this operation returns data for the specified time range.
     * <strong>Time granularity of returned data</strong>
     * Based on the time span specified by <code>StartTime</code> and <code>EndTime</code>, and when <code>Interval</code> is not set at the same time, the default time granularity, the queryable historical data range, and data delay are as follows:<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Time span per query</th>
     * <th>Queryable historical data range</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>Time span per query &lt; 3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>3 days ≤ Time span per query &lt; 31 days</td>
     * <td>186 days</td>
     * <td>Generally 3 to 4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>31 days ≤ Time span per query ≤ 366 days</td>
     * <td>366 days</td>
     * <td>Generally 4 hours, up to 24 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the back-to-origin traffic data of accelerated domain names.</p>
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
     * <ul>
     * <li>Currently, this operation supports only the following service address: <strong>China (Shanghai)</strong>.</li>
     * <li>Batch queries are supported. You can query data for up to 500 domain names at a time.</li>
     * <li>If you do not specify <code>StartTime</code> and <code>EndTime</code>, this operation returns data from the past 24 hours by default. If you specify <code>StartTime</code> and <code>EndTime</code>, this operation returns data for the specified time range.
     * <strong>Time granularity of returned data</strong>
     * Based on the time span specified by <code>StartTime</code> and <code>EndTime</code>, and when <code>Interval</code> is not set at the same time, the default time granularity, the queryable historical data range, and data delay are as follows:<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Time span per query</th>
     * <th>Queryable historical data range</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>Time span per query &lt; 3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>3 days ≤ Time span per query &lt; 31 days</td>
     * <td>186 days</td>
     * <td>Generally 3 to 4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>31 days ≤ Time span per query ≤ 366 days</td>
     * <td>366 days</td>
     * <td>Generally 4 hours, up to 24 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the back-to-origin traffic data of accelerated domain names.</p>
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
     * <ul>
     * <li>The service address of this operation supports only <strong>China (Shanghai)</strong>.</li>
     * <li>Batch queries are supported. You can query data for up to 500 domain names at a time.</li>
     * <li>If you do not specify <code>StartTime</code> and <code>EndTime</code>, data of the last 24 hours is returned by default. If you specify <code>StartTime</code> and <code>EndTime</code>, data of the specified time range is returned.
     * <strong>Data time granularity of returned data</strong>
     * The following table describes the default data time granularity of returned data, the queryable historical data range, and the data latency based on the time span specified by <code>StartTime</code> and <code>EndTime</code> when <code>Interval</code> is not set:<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Time span per query</th>
     * <th>Queryable historical data range</th>
     * <th>Data latency</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>Time span per query &lt; 3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>3 days ≤ Time span per query &lt; 31 days</td>
     * <td>186 days</td>
     * <td>Typically 3 to 4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>31 days ≤ Time span per query ≤ 366 days</td>
     * <td>366 days</td>
     * <td>Typically 4 hours, up to 24 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Invokes this operation to query the traffic data of an accelerated domain name. Compared with the DescribeVodDomainRealTimeTrafficData operation, this operation supports a longer historical data query range (up to 366 days) but provides a larger data time granularity (minimum of 5 minutes) and higher data latency.</p>
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
     * <ul>
     * <li>The service address of this operation supports only <strong>China (Shanghai)</strong>.</li>
     * <li>Batch queries are supported. You can query data for up to 500 domain names at a time.</li>
     * <li>If you do not specify <code>StartTime</code> and <code>EndTime</code>, data of the last 24 hours is returned by default. If you specify <code>StartTime</code> and <code>EndTime</code>, data of the specified time range is returned.
     * <strong>Data time granularity of returned data</strong>
     * The following table describes the default data time granularity of returned data, the queryable historical data range, and the data latency based on the time span specified by <code>StartTime</code> and <code>EndTime</code> when <code>Interval</code> is not set:<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Time span per query</th>
     * <th>Queryable historical data range</th>
     * <th>Data latency</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>Time span per query &lt; 3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>3 days ≤ Time span per query &lt; 31 days</td>
     * <td>186 days</td>
     * <td>Typically 3 to 4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>31 days ≤ Time span per query ≤ 366 days</td>
     * <td>366 days</td>
     * <td>Typically 4 hours, up to 24 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Invokes this operation to query the traffic data of an accelerated domain name. Compared with the DescribeVodDomainRealTimeTrafficData operation, this operation supports a longer historical data query range (up to 366 days) but provides a larger data time granularity (minimum of 5 minutes) and higher data latency.</p>
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
     * <ul>
     * <li>Currently, the only supported service region is <strong>China (Shanghai)</strong>.</li>
     * <li>Batch domain name queries are supported. Separate multiple domain names with commas (,). You can query up to 100 domain names at a time. If this parameter is left empty, data for all domain names under the account is returned.</li>
     * <li>You can query data for up to the last year. The maximum time span for a single query is 3 months. If the query time range is 1 to 3 days, data is returned at hourly granularity. If the query time range is 4 days or more, data is returned at daily granularity.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries acceleration traffic or bandwidth usage data.</p>
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
     * <ul>
     * <li>Currently, the only supported service region is <strong>China (Shanghai)</strong>.</li>
     * <li>Batch domain name queries are supported. Separate multiple domain names with commas (,). You can query up to 100 domain names at a time. If this parameter is left empty, data for all domain names under the account is returned.</li>
     * <li>You can query data for up to the last year. The maximum time span for a single query is 3 months. If the query time range is 1 to 3 days, data is returned at hourly granularity. If the query time range is 4 days or more, data is returned at daily granularity.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries acceleration traffic or bandwidth usage data.</p>
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
     * <ul>
     * <li>Single user call frequency: 10 calls per second.
     * <strong>Supported time granularities</strong>:
     * The adaptive time granularity and the maximum time range for historical data queries vary based on the maximum time span per query.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time span per query</th>
     * <th>Maximum time range for historical data queries</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>1 hour</td>
     * <td>7 days</td>
     * <td>31 days</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>31 days</td>
     * <td>366 days</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the usage data of online editing in ApsaraVideo VOD.</p>
     * 
     * @param request DescribeVodEditingUsageDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVodEditingUsageDataResponse
     */
    public DescribeVodEditingUsageDataResponse describeVodEditingUsageDataWithOptions(DescribeVodEditingUsageDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.specification)) {
            query.put("Specification", request.specification);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVodEditingUsageData"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVodEditingUsageDataResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Single user call frequency: 10 calls per second.
     * <strong>Supported time granularities</strong>:
     * The adaptive time granularity and the maximum time range for historical data queries vary based on the maximum time span per query.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time span per query</th>
     * <th>Maximum time range for historical data queries</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>1 hour</td>
     * <td>7 days</td>
     * <td>31 days</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>31 days</td>
     * <td>366 days</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the usage data of online editing in ApsaraVideo VOD.</p>
     * 
     * @param request DescribeVodEditingUsageDataRequest
     * @return DescribeVodEditingUsageDataResponse
     */
    public DescribeVodEditingUsageDataResponse describeVodEditingUsageData(DescribeVodEditingUsageDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodEditingUsageDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Currently, this operation is available only in the <strong>China (Shanghai)</strong> region.</li>
     * <li>Only playback data collected by ApsaraVideo Player SDK is supported. Traffic statistics for audio-only streams are not supported.</li>
     * <li>Only data within the last 30 days can be queried.<blockquote>
     * <p>Notice: - Before calling this operation, make sure that ApsaraVideo Player SDK meets the following conditions:</p>
     * </blockquote>
     * <ul>
     * <li>Android Player SDK or iOS Player SDK<ul>
     * <li>The Player SDK version is 5.4.9.2 or later.</li>
     * <li>A License for the Player SDK has been obtained and integrated. For more information, see <a href="https://help.aliyun.com/document_detail/469166.html">License management</a>.</li>
     * <li>The event tracking log reporting feature of the Player SDK is enabled. By default, this feature is enabled in ApsaraVideo Player SDK. For more information, see <a href="~~311525#section-dc4-gp6-xk2~~">Create a player for Android</a> and <a href="~~313855#section-cmf-k7d-jg5~~">Create a player for iOS</a>.</li>
     * </ul>
     * </li>
     * <li>Web Player SDK<ul>
     * <li>The Player SDK version is 2.16.0 or later.</li>
     * <li>A License for <strong>Playback Quality Monitoring</strong> has been obtained and integrated. Submit the <a href="https://yida.alibaba-inc.com/o/webplayer#/">Web Player SDK value-added service application form</a> to apply. For the License integration method, see the <code>license</code> property in <a href="~~125572#section-3ty-gwp-6pa~~">Web SDK API reference</a>.</li>
     * <li>The event tracking log reporting feature of the Player SDK is enabled. By default, this feature is enabled in ApsaraVideo Player SDK.</li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves playback data of an audio or video file on a specified date by media ID (audio or video ID), including the number of unique visitors, average plays per user, total plays, average play duration per user, and total play duration.</p>
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
     * <ul>
     * <li>Currently, this operation is available only in the <strong>China (Shanghai)</strong> region.</li>
     * <li>Only playback data collected by ApsaraVideo Player SDK is supported. Traffic statistics for audio-only streams are not supported.</li>
     * <li>Only data within the last 30 days can be queried.<blockquote>
     * <p>Notice: - Before calling this operation, make sure that ApsaraVideo Player SDK meets the following conditions:</p>
     * </blockquote>
     * <ul>
     * <li>Android Player SDK or iOS Player SDK<ul>
     * <li>The Player SDK version is 5.4.9.2 or later.</li>
     * <li>A License for the Player SDK has been obtained and integrated. For more information, see <a href="https://help.aliyun.com/document_detail/469166.html">License management</a>.</li>
     * <li>The event tracking log reporting feature of the Player SDK is enabled. By default, this feature is enabled in ApsaraVideo Player SDK. For more information, see <a href="~~311525#section-dc4-gp6-xk2~~">Create a player for Android</a> and <a href="~~313855#section-cmf-k7d-jg5~~">Create a player for iOS</a>.</li>
     * </ul>
     * </li>
     * <li>Web Player SDK<ul>
     * <li>The Player SDK version is 2.16.0 or later.</li>
     * <li>A License for <strong>Playback Quality Monitoring</strong> has been obtained and integrated. Submit the <a href="https://yida.alibaba-inc.com/o/webplayer#/">Web Player SDK value-added service application form</a> to apply. For the License integration method, see the <code>license</code> property in <a href="~~125572#section-3ty-gwp-6pa~~">Web SDK API reference</a>.</li>
     * <li>The event tracking log reporting feature of the Player SDK is enabled. By default, this feature is enabled in ApsaraVideo Player SDK.</li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves playback data of an audio or video file on a specified date by media ID (audio or video ID), including the number of unique visitors, average plays per user, total plays, average play duration per user, and total play duration.</p>
     * 
     * @param request DescribeVodMediaPlayDataRequest
     * @return DescribeVodMediaPlayDataResponse
     */
    public DescribeVodMediaPlayDataResponse describeVodMediaPlayData(DescribeVodMediaPlayDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodMediaPlayDataWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries aggregated playback data of the player.</p>
     * 
     * @param request DescribeVodPlayerCollectDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVodPlayerCollectDataResponse
     */
    public DescribeVodPlayerCollectDataResponse describeVodPlayerCollectDataWithOptions(DescribeVodPlayerCollectDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.metrics)) {
            query.put("Metrics", request.metrics);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.os)) {
            query.put("Os", request.os);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.terminalType)) {
            query.put("TerminalType", request.terminalType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVodPlayerCollectData"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVodPlayerCollectDataResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries aggregated playback data of the player.</p>
     * 
     * @param request DescribeVodPlayerCollectDataRequest
     * @return DescribeVodPlayerCollectDataResponse
     */
    public DescribeVodPlayerCollectDataResponse describeVodPlayerCollectData(DescribeVodPlayerCollectDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodPlayerCollectDataWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the dimension metadata of the player.</p>
     * 
     * @param request DescribeVodPlayerDimensionDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVodPlayerDimensionDataResponse
     */
    public DescribeVodPlayerDimensionDataResponse describeVodPlayerDimensionDataWithOptions(DescribeVodPlayerDimensionDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dimension)) {
            query.put("Dimension", request.dimension);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
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
            new TeaPair("action", "DescribeVodPlayerDimensionData"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVodPlayerDimensionDataResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the dimension metadata of the player.</p>
     * 
     * @param request DescribeVodPlayerDimensionDataRequest
     * @return DescribeVodPlayerDimensionDataResponse
     */
    public DescribeVodPlayerDimensionDataResponse describeVodPlayerDimensionData(DescribeVodPlayerDimensionDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodPlayerDimensionDataWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries player metric data.</p>
     * 
     * @param request DescribeVodPlayerMetricDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVodPlayerMetricDataResponse
     */
    public DescribeVodPlayerMetricDataResponse describeVodPlayerMetricDataWithOptions(DescribeVodPlayerMetricDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filters)) {
            query.put("Filters", request.filters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metrics)) {
            query.put("Metrics", request.metrics);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.os)) {
            query.put("Os", request.os);
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

        if (!com.aliyun.teautil.Common.isUnset(request.terminalType)) {
            query.put("TerminalType", request.terminalType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.top)) {
            query.put("Top", request.top);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVodPlayerMetricData"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVodPlayerMetricDataResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries player metric data.</p>
     * 
     * @param request DescribeVodPlayerMetricDataRequest
     * @return DescribeVodPlayerMetricDataResponse
     */
    public DescribeVodPlayerMetricDataResponse describeVodPlayerMetricData(DescribeVodPlayerMetricDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodPlayerMetricDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Currently, this operation is supported only in the <strong>China (Shanghai)</strong> region.</li>
     * <li>The maximum time range for a single query (the time range between StartTime and EndTime) is 1 hour.
     * <strong>Supported time granularities</strong>
     * Based on the time range specified by <code>StartTime</code> and <code>EndTime</code>, the default data timestamp granularity, queryable historical data range, and data latency are as follows:<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Time range per query</th>
     * <th>Queryable historical data range</th>
     * <th>Data latency</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>≤ 1 hour</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries access data for an accelerated domain name by ISP or region, including bandwidth, average response rate, page views, cache hit ratio, and request hit ratio.</p>
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
     * <ul>
     * <li>Currently, this operation is supported only in the <strong>China (Shanghai)</strong> region.</li>
     * <li>The maximum time range for a single query (the time range between StartTime and EndTime) is 1 hour.
     * <strong>Supported time granularities</strong>
     * Based on the time range specified by <code>StartTime</code> and <code>EndTime</code>, the default data timestamp granularity, queryable historical data range, and data latency are as follows:<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Time range per query</th>
     * <th>Queryable historical data range</th>
     * <th>Data latency</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>≤ 1 hour</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries access data for an accelerated domain name by ISP or region, including bandwidth, average response rate, page views, cache hit ratio, and request hit ratio.</p>
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
     * <ul>
     * <li>Currently, the service address supports only <strong>China (Shanghai)</strong>.</li>
     * <li>Purge and prefetch operations include the <a href="https://help.aliyun.com/document_detail/69215.html">RefreshVodObjectCaches</a> purge operation and the <a href="https://help.aliyun.com/document_detail/69211.html">PreloadVodObjectCaches</a> prefetch operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the maximum number and remaining daily quota of URLs and directories for purge and prefetch operations.</p>
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
     * <ul>
     * <li>Currently, the service address supports only <strong>China (Shanghai)</strong>.</li>
     * <li>Purge and prefetch operations include the <a href="https://help.aliyun.com/document_detail/69215.html">RefreshVodObjectCaches</a> purge operation and the <a href="https://help.aliyun.com/document_detail/69211.html">PreloadVodObjectCaches</a> prefetch operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the maximum number and remaining daily quota of URLs and directories for purge and prefetch operations.</p>
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
     * <ul>
     * <li>Currently, the service address supports only <strong>China (Shanghai)</strong>.</li>
     * <li>If neither Taskid nor Objectpath is specified, the first page of data (20 entries) within the last 3 days is returned by default. Taskid and Objectpath can be specified at the same time.</li>
     * <li>When DomainName or Status is specified, ObjectType is required.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries whether purge and prefetch tasks have taken effect.</p>
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
     * <ul>
     * <li>Currently, the service address supports only <strong>China (Shanghai)</strong>.</li>
     * <li>If neither Taskid nor Objectpath is specified, the first page of data (20 entries) within the last 3 days is returned by default. Taskid and Objectpath can be specified at the same time.</li>
     * <li>When DomainName or Status is specified, ObjectType is required.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries whether purge and prefetch tasks have taken effect.</p>
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
     * <p>This operation currently supports only the <strong>China (Shanghai)</strong> region.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries certificate list information by domain name.</p>
     * 
     * @param request DescribeVodSSLCertificateListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVodSSLCertificateListResponse
     */
    public DescribeVodSSLCertificateListResponse describeVodSSLCertificateListWithOptions(DescribeVodSSLCertificateListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
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

        if (!com.aliyun.teautil.Common.isUnset(request.searchKeyword)) {
            query.put("SearchKeyword", request.searchKeyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVodSSLCertificateList"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVodSSLCertificateListResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation currently supports only the <strong>China (Shanghai)</strong> region.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries certificate list information by domain name.</p>
     * 
     * @param request DescribeVodSSLCertificateListRequest
     * @return DescribeVodSSLCertificateListResponse
     */
    public DescribeVodSSLCertificateListResponse describeVodSSLCertificateList(DescribeVodSSLCertificateListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodSSLCertificateListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Currently, the service address supports only <strong>China (Shanghai)</strong>.</li>
     * <li>If the interval between the start time and end time is within 7 days, hourly data is returned. If the interval is greater than 7 days, daily data is returned. The maximum interval is 31 days.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the usage of media asset management, including storage space and outbound storage traffic.</p>
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
     * <ul>
     * <li>Currently, the service address supports only <strong>China (Shanghai)</strong>.</li>
     * <li>If the interval between the start time and end time is within 7 days, hourly data is returned. If the interval is greater than 7 days, daily data is returned. The maximum interval is 31 days.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the usage of media asset management, including storage space and outbound storage traffic.</p>
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
     * <ul>
     * <li>Currently, the service is available only in the <strong>China (Shanghai)</strong> region.</li>
     * <li>If the query time range is within 7 days, hourly data is returned. If the query time range is greater than 7 days, daily data is returned. The maximum time range is 31 days.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the usage of tiered storage for media asset management.</p>
     * 
     * @param request DescribeVodTieringStorageDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVodTieringStorageDataResponse
     */
    public DescribeVodTieringStorageDataResponse describeVodTieringStorageDataWithOptions(DescribeVodTieringStorageDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
     * <ul>
     * <li>Currently, the service is available only in the <strong>China (Shanghai)</strong> region.</li>
     * <li>If the query time range is within 7 days, hourly data is returned. If the query time range is greater than 7 days, daily data is returned. The maximum time range is 31 days.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the usage of tiered storage for media asset management.</p>
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
     * <blockquote>
     * <ul>
     * <li>Currently, the service address supports only <strong>China (Shanghai)</strong>.</li>
     * <li>If the query time interval is within 7 days, data at the hour granularity is returned. If the query time interval is greater than 7 days, data at the day granularity is returned. The maximum interval is 31 days.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the retrieval data usage of tiered storage in media asset management.</p>
     * 
     * @param request DescribeVodTieringStorageRetrievalDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVodTieringStorageRetrievalDataResponse
     */
    public DescribeVodTieringStorageRetrievalDataResponse describeVodTieringStorageRetrievalDataWithOptions(DescribeVodTieringStorageRetrievalDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
     * <blockquote>
     * <ul>
     * <li>Currently, the service address supports only <strong>China (Shanghai)</strong>.</li>
     * <li>If the query time interval is within 7 days, data at the hour granularity is returned. If the query time interval is greater than 7 days, data at the day granularity is returned. The maximum interval is 31 days.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the retrieval data usage of tiered storage in media asset management.</p>
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
     * <ul>
     * <li>Currently, the only supported service region is <strong>China (Shanghai)</strong>.</li>
     * <li>If the interval between the start time and end time is within 7 days, hourly data is returned. If the interval is greater than 7 days, daily data is returned. The maximum interval is 31 days.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries transcoding usage data.</p>
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
     * <ul>
     * <li>Currently, the only supported service region is <strong>China (Shanghai)</strong>.</li>
     * <li>If the interval between the start time and end time is within 7 days, hourly data is returned. If the interval is greater than 7 days, daily data is returned. The maximum interval is 31 days.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries transcoding usage data.</p>
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
     * <ul>
     * <li>Supports fuzzy match filtering by domain name and filtering by domain name status.</li>
     * <li>This operation currently supports only the following region: <strong>China (Shanghai)</strong>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of all acceleration domain names under your account for ApsaraVideo VOD.</p>
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
     * <ul>
     * <li>Supports fuzzy match filtering by domain name and filtering by domain name status.</li>
     * <li>This operation currently supports only the following region: <strong>China (Shanghai)</strong>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of all acceleration domain names under your account for ApsaraVideo VOD.</p>
     * 
     * @param request DescribeVodUserDomainsRequest
     * @return DescribeVodUserDomainsResponse
     */
    public DescribeVodUserDomainsResponse describeVodUserDomains(DescribeVodUserDomainsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodUserDomainsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation is supported only in the China (Shanghai) region.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the IP list of a domain name.</p>
     * 
     * @param request DescribeVodUserVipsByDomainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVodUserVipsByDomainResponse
     */
    public DescribeVodUserVipsByDomainResponse describeVodUserVipsByDomainWithOptions(DescribeVodUserVipsByDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.available)) {
            query.put("Available", request.available);
        }

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
            new TeaPair("action", "DescribeVodUserVipsByDomain"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVodUserVipsByDomainResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation is supported only in the China (Shanghai) region.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the IP list of a domain name.</p>
     * 
     * @param request DescribeVodUserVipsByDomainRequest
     * @return DescribeVodUserVipsByDomainResponse
     */
    public DescribeVodUserVipsByDomainResponse describeVodUserVipsByDomain(DescribeVodUserVipsByDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodUserVipsByDomainWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Currently, this operation is supported only in the <strong>China (Shanghai)</strong> region.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the domain ownership verification content.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>Currently, this operation is supported only in the <strong>China (Shanghai)</strong> region.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the domain ownership verification content.</p>
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
     * <p>Notice: Each Resource Access Management (RAM) user or RAM role can be granted permissions for up to 10 applications.</p>
     * </blockquote>
     * <ul>
     * <li>If the policy name is <strong>VODAppAdministratorAccess</strong>, <strong>AppId</strong> is optional. For other policies, <strong>AppId</strong> is required.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Invokes this operation to revoke application authorization from a specified account identity (Resource Access Management (RAM) user or RAM role).</p>
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
     * <p>Notice: Each Resource Access Management (RAM) user or RAM role can be granted permissions for up to 10 applications.</p>
     * </blockquote>
     * <ul>
     * <li>If the policy name is <strong>VODAppAdministratorAccess</strong>, <strong>AppId</strong> is optional. For other policies, <strong>AppId</strong> is required.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Invokes this operation to revoke application authorization from a specified account identity (Resource Access Management (RAM) user or RAM role).</p>
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
     * <ul>
     * <li>To use the secure download feature, first enable the download feature in the ApsaraVideo VOD console and set the download method to secure download. For more information, see <a href="https://help.aliyun.com/document_detail/86107.html">Download settings</a>.</li>
     * <li>After generating a key for secure download, configure the key in ApsaraVideo Player SDK. For more information, see <a href="https://help.aliyun.com/document_detail/124735.html">Secure download</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Generates a key for secure download. The secure download feature of ApsaraVideo Player SDK encrypts videos downloaded to local devices by using a key file. The encrypted videos can only be decrypted and played by using the key file generated by the unique app that is bindable in advance. This effectively protects video content and prevents downloaded videos from being maliciously played or distributed.</p>
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
     * <ul>
     * <li>To use the secure download feature, first enable the download feature in the ApsaraVideo VOD console and set the download method to secure download. For more information, see <a href="https://help.aliyun.com/document_detail/86107.html">Download settings</a>.</li>
     * <li>After generating a key for secure download, configure the key in ApsaraVideo Player SDK. For more information, see <a href="https://help.aliyun.com/document_detail/124735.html">Secure download</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Generates a key for secure download. The secure download feature of ApsaraVideo Player SDK encrypts videos downloaded to local devices by using a key file. The encrypted videos can only be decrypted and played by using the key file generated by the unique app that is bindable in advance. This effectively protects video content and prevents downloaded videos from being maliciously played or distributed.</p>
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
     * <p>Invokes the operation to generate a random KMS data key (DK) for ApsaraVideo VOD HLS encryption.</p>
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
     * <p>Invokes the operation to generate a random KMS data key (DK) for ApsaraVideo VOD HLS encryption.</p>
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
     * <ul>
     * <li>Currently, this operation is supported in the following regions: <strong>China (Beijing)</strong> and <strong>China (Shanghai)</strong>.</li>
     * <li>Call the <a href="~~SubmitAIImageJob~~">SubmitAIImageJob</a> operation to submit an AI image processing task before you call this operation to query the list of AI image tasks.</li>
     * <li>You can query up to 10 AI image processing tasks at a time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of AI image processing tasks.</p>
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
     * <ul>
     * <li>Currently, this operation is supported in the following regions: <strong>China (Beijing)</strong> and <strong>China (Shanghai)</strong>.</li>
     * <li>Call the <a href="~~SubmitAIImageJob~~">SubmitAIImageJob</a> operation to submit an AI image processing task before you call this operation to query the list of AI image tasks.</li>
     * <li>You can query up to 10 AI image processing tasks at a time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of AI image processing tasks.</p>
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
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <ul>
     * <li>This operation is supported only in the Singapore region.</li>
     * <li>Image resources in automated review job results are retained in the free storage provided by ApsaraVideo VOD for only two weeks. After two weeks, the images are automatically deleted.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries an automated review job. After you submit an AI job, the job is processed asynchronously. You can call this operation to query job information in real time.</p>
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
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <ul>
     * <li>This operation is supported only in the Singapore region.</li>
     * <li>Image resources in automated review job results are retained in the free storage provided by ApsaraVideo VOD for only two weeks. After two weeks, the images are automatically deleted.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries an automated review job. After you submit an AI job, the job is processed asynchronously. You can call this operation to query job information in real time.</p>
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
     * <ul>
     * <li>Currently, this operation is supported in the following regions: <strong>China (Beijing)</strong>, <strong>China (Shanghai)</strong>, and <strong>Singapore</strong>.</li>
     * <li>Obtain the AI template ID first, and then call this operation to query the configuration information of the AI template.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries an AI template.</p>
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
     * <ul>
     * <li>Currently, this operation is supported in the following regions: <strong>China (Beijing)</strong>, <strong>China (Shanghai)</strong>, and <strong>Singapore</strong>.</li>
     * <li>Obtain the AI template ID first, and then call this operation to query the configuration information of the AI template.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries an AI template.</p>
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
     * <ul>
     * <li>Currently, this operation is supported in the following regions: <strong>China (Beijing)</strong> and <strong>China (Shanghai)</strong>.</li>
     * <li>Retrieves smart tagging results by video ID.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the results of smart tagging for a video.</p>
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
     * <ul>
     * <li>Currently, this operation is supported in the following regions: <strong>China (Beijing)</strong> and <strong>China (Shanghai)</strong>.</li>
     * <li>Retrieves smart tagging results by video ID.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the results of smart tagging for a video.</p>
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
     * <ul>
     * <li>Batch queries are supported.</li>
     * <li>AppIds supports a maximum of 10 IDs.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The single-user QPS limit for this operation is 100 calls per second. If the limit is exceeded, the API call is throttled, which may affect your business. Call this operation appropriately. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries application information by application ID.</p>
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
     * <ul>
     * <li>Batch queries are supported.</li>
     * <li>AppIds supports a maximum of 10 IDs.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The single-user QPS limit for this operation is 100 calls per second. If the limit is exceeded, the API call is throttled, which may affect your business. Call this operation appropriately. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries application information by application ID.</p>
     * 
     * @param request GetAppInfosRequest
     * @return GetAppInfosResponse
     */
    public GetAppInfosResponse getAppInfos(GetAppInfosRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAppInfosWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the playback key of an application.</p>
     * 
     * @param request GetAppPlayKeyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAppPlayKeyResponse
     */
    public GetAppPlayKeyResponse getAppPlayKeyWithOptions(GetAppPlayKeyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
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
            new TeaPair("action", "GetAppPlayKey"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAppPlayKeyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the playback key of an application.</p>
     * 
     * @param request GetAppPlayKeyRequest
     * @return GetAppPlayKeyResponse
     */
    public GetAppPlayKeyResponse getAppPlayKey(GetAppPlayKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAppPlayKeyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can retrieve information about up to 20 auxiliary media assets at a time.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the basic information and access URLs of multiple auxiliary media assets in a batch by specifying their IDs after the assets such as watermark images, subtitle files, and materials are uploaded to ApsaraVideo VOD.</p>
     * 
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
     * <b>description</b> :
     * <p>You can retrieve information about up to 20 auxiliary media assets at a time.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the basic information and access URLs of multiple auxiliary media assets in a batch by specifying their IDs after the assets such as watermark images, subtitle files, and materials are uploaded to ApsaraVideo VOD.</p>
     * 
     * @param request GetAttachedMediaInfoRequest
     * @return GetAttachedMediaInfoResponse
     */
    public GetAttachedMediaInfoResponse getAttachedMediaInfo(GetAttachedMediaInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAttachedMediaInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the history of manual review records.</p>
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
     * <p>Retrieves the history of manual review records.</p>
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
     * <p>Invokes this operation to perform a filtered query for specified categorization information by ID or type, and retrieves the list of its subcategories (next-level categories).</p>
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
     * <p>Invokes this operation to perform a filtered query for specified categorization information by ID or type, and retrieves the list of its subcategories (next-level categories).</p>
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
     * <ul>
     * <li>Currently, the service address of this operation only supports: <strong>China (Shanghai)</strong>.</li>
     * <li>Only data within the past 90 days can be queried (data starts from April 29, 2025).</li>
     * <li>The traffic data provided by this operation is raw traffic data. To align with billing traffic, multiply the data by a TCP coefficient of 1.1.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the full traffic data of media assets for a specified date and region. The data is generated based on CDN traffic logs and primarily reflects the traffic consumption of videos. The generated CSV file contains the following information: date, video ID, domain name, traffic, application ID, and category ID. You can download the file to your local machine for scenarios such as operational data analytics.</p>
     * 
     * @param request GetDailyPlayRegionStatisRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDailyPlayRegionStatisResponse
     */
    public GetDailyPlayRegionStatisResponse getDailyPlayRegionStatisWithOptions(GetDailyPlayRegionStatisRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.date)) {
            query.put("Date", request.date);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaRegion)) {
            query.put("MediaRegion", request.mediaRegion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDailyPlayRegionStatis"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDailyPlayRegionStatisResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Currently, the service address of this operation only supports: <strong>China (Shanghai)</strong>.</li>
     * <li>Only data within the past 90 days can be queried (data starts from April 29, 2025).</li>
     * <li>The traffic data provided by this operation is raw traffic data. To align with billing traffic, multiply the data by a TCP coefficient of 1.1.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the full traffic data of media assets for a specified date and region. The data is generated based on CDN traffic logs and primarily reflects the traffic consumption of videos. The generated CSV file contains the following information: date, video ID, domain name, traffic, application ID, and category ID. You can download the file to your local machine for scenarios such as operational data analytics.</p>
     * 
     * @param request GetDailyPlayRegionStatisRequest
     * @return GetDailyPlayRegionStatisResponse
     */
    public GetDailyPlayRegionStatisResponse getDailyPlayRegionStatis(GetDailyPlayRegionStatisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDailyPlayRegionStatisWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Currently, this operation is supported in the following regions: <strong>China (Beijing)</strong>, <strong>China (Shanghai)</strong>, and <strong>Singapore</strong>.</li>
     * <li>Currently, only the default AI template for automated review can be queried.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the default AI template.</p>
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
     * <ul>
     * <li>Currently, this operation is supported in the following regions: <strong>China (Beijing)</strong>, <strong>China (Shanghai)</strong>, and <strong>Singapore</strong>.</li>
     * <li>Currently, only the default AI template for automated review can be queried.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the default AI template.</p>
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
     * <ul>
     * <li>Currently, this operation is available only in the China (Shanghai) and China (Beijing) regions.</li>
     * <li>After you call the <a href="~~SubmitDigitalWatermarkExtractJob~~">SubmitDigitalWatermarkExtractJob</a> operation to extract the copyright watermark or tracing watermark from a video, call this operation to query the extracted watermark text.</li>
     * <li>Only watermark extraction jobs from the last 2 years can be queried.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the results of a digital watermarking (copyright watermark or tracing watermark) extraction job, including the job status and the successfully extracted watermark text.</p>
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
     * <ul>
     * <li>Currently, this operation is available only in the China (Shanghai) and China (Beijing) regions.</li>
     * <li>After you call the <a href="~~SubmitDigitalWatermarkExtractJob~~">SubmitDigitalWatermarkExtractJob</a> operation to extract the copyright watermark or tracing watermark from a video, call this operation to query the extracted watermark text.</li>
     * <li>Only watermark extraction jobs from the last 2 years can be queried.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the results of a digital watermarking (copyright watermark or tracing watermark) extraction job, including the job status and the successfully extracted watermark text.</p>
     * 
     * @param request GetDigitalWatermarkExtractResultRequest
     * @return GetDigitalWatermarkExtractResultResponse
     */
    public GetDigitalWatermarkExtractResultResponse getDigitalWatermarkExtractResult(GetDigitalWatermarkExtractResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDigitalWatermarkExtractResultWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of an online editing project (video editing task).</p>
     * 
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
     * <b>summary</b> : 
     * <p>Retrieves the details of an online editing project (video editing task).</p>
     * 
     * @param request GetEditingProjectRequest
     * @return GetEditingProjectResponse
     */
    public GetEditingProjectResponse getEditingProject(GetEditingProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getEditingProjectWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>During the editing process, materials can be added to the timeline but are not necessarily fully used.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the list of materials to be edited in an online editing project.</p>
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
     * <p>During the editing process, materials can be added to the timeline but are not necessarily fully used.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the list of materials to be edited in an online editing project.</p>
     * 
     * @param request GetEditingProjectMaterialsRequest
     * @return GetEditingProjectMaterialsResponse
     */
    public GetEditingProjectMaterialsResponse getEditingProjectMaterials(GetEditingProjectMaterialsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getEditingProjectMaterialsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation only supports querying information about images uploaded to ApsaraVideo VOD. To query information about snapshots generated from video snapshots, call the <a href="~~ListSnapshots~~">ListSnapshots</a> operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the basic information and access URL of an image by image ID after the image is uploaded to ApsaraVideo VOD.</p>
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
     * <b>description</b> :
     * <p>This operation only supports querying information about images uploaded to ApsaraVideo VOD. To query information about snapshots generated from video snapshots, call the <a href="~~ListSnapshots~~">ListSnapshots</a> operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the basic information and access URL of an image by image ID after the image is uploaded to ApsaraVideo VOD.</p>
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
     * <ul>
     * <li>This operation only supports querying information about images uploaded to ApsaraVideo VOD. To query information about snapshots generated from video snapshots, call the <a href="~~ListSnapshots~~">ListSnapshots</a> operation.</li>
     * <li>You can query information about up to 20 images at a time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the basic information and access URLs of multiple images by image ID after the images are uploaded to ApsaraVideo VOD.</p>
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
     * <ul>
     * <li>This operation only supports querying information about images uploaded to ApsaraVideo VOD. To query information about snapshots generated from video snapshots, call the <a href="~~ListSnapshots~~">ListSnapshots</a> operation.</li>
     * <li>You can query information about up to 20 images at a time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the basic information and access URLs of multiple images by image ID after the images are uploaded to ApsaraVideo VOD.</p>
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
     * <p><em>Usage notes</em>*
     * This operation supports querying asynchronous task data from the last 6 months. Supported task types: transcoding tasks, snapshot tasks, AI tasks, and workflow tasks.
     * <strong>QPS limit</strong>
     * The single-user QPS limit for this operation is 15 calls per second. If the limit is exceeded, API calls are throttled, which may affect your business. Call this operation appropriately. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limits</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of an asynchronous task by job ID.</p>
     * 
     * @param request GetJobDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetJobDetailResponse
     */
    public GetJobDetailResponse getJobDetailWithOptions(GetJobDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobType)) {
            query.put("JobType", request.jobType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetJobDetail"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetJobDetailResponse());
    }

    /**
     * <b>description</b> :
     * <p><em>Usage notes</em>*
     * This operation supports querying asynchronous task data from the last 6 months. Supported task types: transcoding tasks, snapshot tasks, AI tasks, and workflow tasks.
     * <strong>QPS limit</strong>
     * The single-user QPS limit for this operation is 15 calls per second. If the limit is exceeded, API calls are throttled, which may affect your business. Call this operation appropriately. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limits</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of an asynchronous task by job ID.</p>
     * 
     * @param request GetJobDetailRequest
     * @return GetJobDetailResponse
     */
    public GetJobDetailResponse getJobDetail(GetJobDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getJobDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the results of video AI analysis.</p>
     * 
     * @param request GetMediaAiAnalysisRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMediaAiAnalysisResponse
     */
    public GetMediaAiAnalysisResponse getMediaAiAnalysisWithOptions(GetMediaAiAnalysisRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authTimeout)) {
            query.put("AuthTimeout", request.authTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaId)) {
            query.put("MediaId", request.mediaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputType)) {
            query.put("OutputType", request.outputType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resultTypes)) {
            query.put("ResultTypes", request.resultTypes);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMediaAiAnalysis"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMediaAiAnalysisResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the results of video AI analysis.</p>
     * 
     * @param request GetMediaAiAnalysisRequest
     * @return GetMediaAiAnalysisResponse
     */
    public GetMediaAiAnalysisResponse getMediaAiAnalysis(GetMediaAiAnalysisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMediaAiAnalysisWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>&lt;props=&quot;china&quot;&gt;After automated review is complete, if you have configured the <a href="https://help.aliyun.com/document_detail/89576.html">Automated review complete</a> event notification, the callback URL is notified through a message callback. You can call this operation to query the details of audio review results.
     * &lt;props=&quot;intl&quot;&gt;</p>
     * <ul>
     * <li>This operation is supported only in the Singapore region.</li>
     * <li>After automated review is complete, if you have configured the <a href="https://help.aliyun.com/document_detail/89576.html">Automated review complete</a> event notification, the callback URL is notified through a message callback. You can call this operation to query the details of audio review results.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the details of audio automated review results.</p>
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
     * <h3>Usage notes</h3>
     * <p>&lt;props=&quot;china&quot;&gt;After automated review is complete, if you have configured the <a href="https://help.aliyun.com/document_detail/89576.html">Automated review complete</a> event notification, the callback URL is notified through a message callback. You can call this operation to query the details of audio review results.
     * &lt;props=&quot;intl&quot;&gt;</p>
     * <ul>
     * <li>This operation is supported only in the Singapore region.</li>
     * <li>After automated review is complete, if you have configured the <a href="https://help.aliyun.com/document_detail/89576.html">Automated review complete</a> event notification, the callback URL is notified through a message callback. You can call this operation to query the details of audio review results.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the details of audio automated review results.</p>
     * 
     * @param request GetMediaAuditAudioResultDetailRequest
     * @return GetMediaAuditAudioResultDetailResponse
     */
    public GetMediaAuditAudioResultDetailResponse getMediaAuditAudioResultDetail(GetMediaAuditAudioResultDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMediaAuditAudioResultDetailWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <h3>Usage notes</h3>
     * <p>This operation is supported only in the Singapore region.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 20 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. This may affect your business. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the summary of automated review results.</p>
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
     * <b>description</b> :
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <h3>Usage notes</h3>
     * <p>This operation is supported only in the Singapore region.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 20 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. This may affect your business. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the summary of automated review results.</p>
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
     * <li>By default, only the review screenshot details of violating and suspected violating content are returned. No results are returned for compliant videos and images.</li>
     * <li>The image resources of review results are retained in the free storage provided by ApsaraVideo VOD for only 2 weeks. After 2 weeks, the images are automatically deleted.
     * &lt;props=&quot;intl&quot;&gt;</li>
     * <li>This operation is supported only in the Singapore region.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the details of automated review results. You can call this operation to query the details of review results in real time.</p>
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
     * <li>By default, only the review screenshot details of violating and suspected violating content are returned. No results are returned for compliant videos and images.</li>
     * <li>The image resources of review results are retained in the free storage provided by ApsaraVideo VOD for only 2 weeks. After 2 weeks, the images are automatically deleted.
     * &lt;props=&quot;intl&quot;&gt;</li>
     * <li>This operation is supported only in the Singapore region.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the details of automated review results. You can call this operation to query the details of review results in real time.</p>
     * 
     * @param request GetMediaAuditResultDetailRequest
     * @return GetMediaAuditResultDetailResponse
     */
    public GetMediaAuditResultDetailResponse getMediaAuditResultDetail(GetMediaAuditResultDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMediaAuditResultDetailWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>By default, only screenshot details for violations and suspected violations are returned. No results are returned for compliant videos and images.
     * &lt;props=&quot;intl&quot;&gt;
     * This operation is supported only in the Singapore region.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the timestamps of all screenshots that contain violations.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>By default, only screenshot details for violations and suspected violations are returned. No results are returned for compliant videos and images.
     * &lt;props=&quot;intl&quot;&gt;
     * This operation is supported only in the Singapore region.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the timestamps of all screenshots that contain violations.</p>
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
     * <p>This operation is supported in the following regions: <strong>China (Beijing)</strong>, <strong>China (Shanghai)</strong>, and <strong>Singapore</strong>.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves media fingerprint results. After a media fingerprint job is complete, you can call this operation to query the results in real time.</p>
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
     * <p>This operation is supported in the following regions: <strong>China (Beijing)</strong>, <strong>China (Shanghai)</strong>, and <strong>Singapore</strong>.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves media fingerprint results. After a media fingerprint job is complete, you can call this operation to query the results in real time.</p>
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
     * <h3>Usage notes</h3>
     * <p>You can query task information for all audio or video files under a purge or prefetch task, or query task information for a specific audio or video file.</p>
     * <h3>QPS limit</h3>
     * <p>The single-user QPS limit for this operation is 50 calls per second. If the limit is exceeded, the API call is throttled, which may affect your business. Call this operation as needed. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries task information such as task status and filtering policies for a video purge or prefetch task.</p>
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
     * <h3>Usage notes</h3>
     * <p>You can query task information for all audio or video files under a purge or prefetch task, or query task information for a specific audio or video file.</p>
     * <h3>QPS limit</h3>
     * <p>The single-user QPS limit for this operation is 50 calls per second. If the limit is exceeded, the API call is throttled, which may affect your business. Call this operation as needed. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries task information such as task status and filtering policies for a video purge or prefetch task.</p>
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
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/55627.html">Event notification development guide</a>.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the callback method, callback URL, and event types of event notifications.</p>
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
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/55627.html">Event notification development guide</a>.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the callback method, callback URL, and event types of event notifications.</p>
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
     * <p>You can retrieve the complete source file information only after a video or audio stream is transcoded.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the source file information of an audio or video file, including the file URL, resolution, and bitrate.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.referenceId)) {
            query.put("ReferenceId", request.referenceId);
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
     * <p>You can retrieve the complete source file information only after a video or audio stream is transcoded.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the source file information of an audio or video file, including the file URL, resolution, and bitrate.</p>
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
     * <ul>
     * <li><strong>Before using this operation, make sure you fully understand the billing methods and pricing of ApsaraVideo VOD. Directly downloading or playing videos from ApsaraVideo VOD playback URLs incurs outbound traffic fees. If no accelerated domain name is configured, refer to <a href="~~188308#section-rwh-e88-f7j~~">Storage outbound traffic billing</a>. If an accelerated domain name is configured, refer to <a href="~~188308#section-c5t-oq9-15e~~">Acceleration service billing</a>. If you have enabled storage transfer acceleration, directly downloading or playing videos from ApsaraVideo VOD playback URLs also incurs download acceleration fees. For billing details, refer to <a href="~~188310#section_sta_zm2_tsv~~">Storage transfer acceleration billing</a>.</strong></li>
     * <li>Only videos in the Normal state (the Status field value is Normal) can be played. For more information about playback URL descriptions and usage limits, refer to <a href="https://help.aliyun.com/document_detail/57290.html">Audio and video playback</a>.</li>
     * <li>When the <a href="https://help.aliyun.com/document_detail/2392368.html">media storage</a> type is non-standard storage, set the StorageClass field of the PlayConfig parameter accordingly. For details, refer to <a href="~~86952#section-9g7-s9b-v7z~~">PlayConfig</a>.</li>
     * <li>If video playback is abnormal, call the <a href="~~GetMezzanineInfo~~">GetMezzanineInfo</a> operation to check whether the video source file information is correct.
     * &lt;props=&quot;china&quot;&gt;</li>
     * <li>To generate m3u8 tracing watermark video streams by calling this operation, submit a ticket to apply for activation. For information about how to submit a ticket, refer to <a href="https://help.aliyun.com/document_detail/464625.html">Contact us</a>. For more information about tracing watermarks, refer to <a href="https://help.aliyun.com/document_detail/2527021.html">Digital watermarking</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the playback URL of an audio or video file by providing the audio or video ID, which can then be played using ApsaraVideo Player or a third-party player such as a system-native, open-source, or custom-built player.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.codecName)) {
            query.put("CodecName", request.codecName);
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

        if (!com.aliyun.teautil.Common.isUnset(request.referenceId)) {
            query.put("ReferenceId", request.referenceId);
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
     * <ul>
     * <li><strong>Before using this operation, make sure you fully understand the billing methods and pricing of ApsaraVideo VOD. Directly downloading or playing videos from ApsaraVideo VOD playback URLs incurs outbound traffic fees. If no accelerated domain name is configured, refer to <a href="~~188308#section-rwh-e88-f7j~~">Storage outbound traffic billing</a>. If an accelerated domain name is configured, refer to <a href="~~188308#section-c5t-oq9-15e~~">Acceleration service billing</a>. If you have enabled storage transfer acceleration, directly downloading or playing videos from ApsaraVideo VOD playback URLs also incurs download acceleration fees. For billing details, refer to <a href="~~188310#section_sta_zm2_tsv~~">Storage transfer acceleration billing</a>.</strong></li>
     * <li>Only videos in the Normal state (the Status field value is Normal) can be played. For more information about playback URL descriptions and usage limits, refer to <a href="https://help.aliyun.com/document_detail/57290.html">Audio and video playback</a>.</li>
     * <li>When the <a href="https://help.aliyun.com/document_detail/2392368.html">media storage</a> type is non-standard storage, set the StorageClass field of the PlayConfig parameter accordingly. For details, refer to <a href="~~86952#section-9g7-s9b-v7z~~">PlayConfig</a>.</li>
     * <li>If video playback is abnormal, call the <a href="~~GetMezzanineInfo~~">GetMezzanineInfo</a> operation to check whether the video source file information is correct.
     * &lt;props=&quot;china&quot;&gt;</li>
     * <li>To generate m3u8 tracing watermark video streams by calling this operation, submit a ticket to apply for activation. For information about how to submit a ticket, refer to <a href="https://help.aliyun.com/document_detail/464625.html">Contact us</a>. For more information about tracing watermarks, refer to <a href="https://help.aliyun.com/document_detail/2527021.html">Digital watermarking</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the playback URL of an audio or video file by providing the audio or video ID, which can then be played using ApsaraVideo Player or a third-party player such as a system-native, open-source, or custom-built player.</p>
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
     * <ul>
     * <li>Because an audio or video file may be transcoded multiple times, this operation returns only the most recent transcoding summary.</li>
     * <li>Batch queries are supported. You can query the transcoding summaries of up to 10 audio or video files at a time.</li>
     * <li>To query historical transcoding task information, call the <a href="https://help.aliyun.com/document_detail/109120.html">ListTranscodeTask</a> operation.</li>
     * <li><strong>This operation supports querying transcoding task data only within the last year.</strong></li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries video transcoding summary of one or more audio or video files by their IDs, including video transcoding status and transcoding progress.</p>
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
     * <ul>
     * <li>Because an audio or video file may be transcoded multiple times, this operation returns only the most recent transcoding summary.</li>
     * <li>Batch queries are supported. You can query the transcoding summaries of up to 10 audio or video files at a time.</li>
     * <li>To query historical transcoding task information, call the <a href="https://help.aliyun.com/document_detail/109120.html">ListTranscodeTask</a> operation.</li>
     * <li><strong>This operation supports querying transcoding task data only within the last year.</strong></li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries video transcoding summary of one or more audio or video files by their IDs, including video transcoding status and transcoding progress.</p>
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
     * <h3>Usage notes</h3>
     * <p><strong>This operation only supports querying transcoding task data from the last year.</strong></p>
     * <h3>QPS limit</h3>
     * <p>A single user can perform a maximum of 15 queries per second (QPS). Throttling is triggered if this limit is exceeded, which may affect your business. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limits</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of transcoding jobs based on a transcoding task ID.</p>
     * 
     * @param request GetTranscodeTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTranscodeTaskResponse
     */
    public GetTranscodeTaskResponse getTranscodeTaskWithOptions(GetTranscodeTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobIds)) {
            query.put("JobIds", request.jobIds);
        }

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
     * <h3>Usage notes</h3>
     * <p><strong>This operation only supports querying transcoding task data from the last year.</strong></p>
     * <h3>QPS limit</h3>
     * <p>A single user can perform a maximum of 15 queries per second (QPS). Throttling is triggered if this limit is exceeded, which may affect your business. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limits</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of transcoding jobs based on a transcoding task ID.</p>
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
     * <p>Retrieves information about a single template group, including the configuration information of all transcoding templates in the group.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a transcoding configuration by transcoding template group ID.</p>
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
     * <p>Retrieves information about a single template group, including the configuration information of all transcoding templates in the group.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a transcoding configuration by transcoding template group ID.</p>
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
     * <ul>
     * <li>Retrieves URL upload information by using the JobId returned during URL-based upload or the URL used for upload. The information includes the URL upload status, UserData, creation time, and completion time.</li>
     * <li><strong>This operation only supports querying upload task data within the last year.</strong></li>
     * <li>This operation currently supports only the following service regions: <strong>China (Shanghai)</strong> and <strong>Singapore</strong>.</li>
     * <li>After you call the <a href="~~UploadMediaByURL~~">UploadMediaByURL</a> operation to upload a media file to ApsaraVideo VOD, you can call this operation to query the upload information of a specified media file by using the upload task IDs (<code>JobIds</code>) or the source file URLs (<code>UploadURLs</code>).</li>
     * <li>When calling this operation, you must specify either <code>JobIds</code> or <code>UploadURLs</code>. If both are specified, only <code>JobIds</code> is processed.</li>
     * <li>If the media upload fails, you can call this operation to view the error code and error message. If the media upload succeeds, you can call this operation to view the corresponding media ID.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves URL upload information.</p>
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
     * <ul>
     * <li>Retrieves URL upload information by using the JobId returned during URL-based upload or the URL used for upload. The information includes the URL upload status, UserData, creation time, and completion time.</li>
     * <li><strong>This operation only supports querying upload task data within the last year.</strong></li>
     * <li>This operation currently supports only the following service regions: <strong>China (Shanghai)</strong> and <strong>Singapore</strong>.</li>
     * <li>After you call the <a href="~~UploadMediaByURL~~">UploadMediaByURL</a> operation to upload a media file to ApsaraVideo VOD, you can call this operation to query the upload information of a specified media file by using the upload task IDs (<code>JobIds</code>) or the source file URLs (<code>UploadURLs</code>).</li>
     * <li>When calling this operation, you must specify either <code>JobIds</code> or <code>UploadURLs</code>. If both are specified, only <code>JobIds</code> is processed.</li>
     * <li>If the media upload fails, you can call this operation to view the error code and error message. If the media upload succeeds, you can call this operation to view the corresponding media ID.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves URL upload information.</p>
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
     * <ul>
     * <li>This operation only supports retrieving upload details of audio and video files.</li>
     * <li>If audio or video files are uploaded through the ApsaraVideo VOD console, you can use this operation to retrieve information such as the upload ratio. If audio or video files are uploaded by using the upload SDK, only the following versions of the <a href="https://help.aliyun.com/document_detail/52200.html">upload SDK</a> support this operation.<blockquote>
     * <p>Only the server upload SDK supports this operation. The client upload SDK does not support this operation. The server upload SDK version requirements are as follows:</p>
     * <ul>
     * <li>Java upload SDK: version ≥ 1.4.4</li>
     * <li>C++ upload SDK: version ≥ 1.0.0</li>
     * <li>PHP upload SDK: version ≥ 1.0.2</li>
     * <li>Python upload SDK: version ≥ 1.3.0</li>
     * </ul>
     * </blockquote>
     * </li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The single-user QPS limit for this operation is 100 calls per second. If the limit is exceeded, the API call is throttled, which may affect your business. Call this operation appropriately. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves media upload details by media ID, such as upload time, upload ratio, and upload source. Batch retrieval is supported.</p>
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
     * <ul>
     * <li>This operation only supports retrieving upload details of audio and video files.</li>
     * <li>If audio or video files are uploaded through the ApsaraVideo VOD console, you can use this operation to retrieve information such as the upload ratio. If audio or video files are uploaded by using the upload SDK, only the following versions of the <a href="https://help.aliyun.com/document_detail/52200.html">upload SDK</a> support this operation.<blockquote>
     * <p>Only the server upload SDK supports this operation. The client upload SDK does not support this operation. The server upload SDK version requirements are as follows:</p>
     * <ul>
     * <li>Java upload SDK: version ≥ 1.4.4</li>
     * <li>C++ upload SDK: version ≥ 1.0.0</li>
     * <li>PHP upload SDK: version ≥ 1.0.2</li>
     * <li>Python upload SDK: version ≥ 1.3.0</li>
     * </ul>
     * </blockquote>
     * </li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The single-user QPS limit for this operation is 100 calls per second. If the limit is exceeded, the API call is throttled, which may affect your business. Call this operation appropriately. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves media upload details by media ID, such as upload time, upload ratio, and upload source. Batch retrieval is supported.</p>
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
     * <p>After an audio or video file is uploaded, ApsaraVideo VOD analyzes the uploaded source file. Therefore, media asset information is generated asynchronously. You can configure an <a href="https://help.aliyun.com/document_detail/55627.html">event notification</a> for <a href="https://help.aliyun.com/document_detail/99935.html">AudioVideoAnalysisComplete</a>. After you receive the <a href="https://help.aliyun.com/document_detail/99935.html">AudioVideoAnalysisComplete</a> event notification, call this operation to retrieve the audio or video information.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the information about a single audio or video file by audio or video ID, including the title, description, duration, thumbnail URL, status, creation time, size, snapshots, category, and tags.</p>
     * 
     * @param request GetVideoInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetVideoInfoResponse
     */
    public GetVideoInfoResponse getVideoInfoWithOptions(GetVideoInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.referenceId)) {
            query.put("ReferenceId", request.referenceId);
        }

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
     * <p>After an audio or video file is uploaded, ApsaraVideo VOD analyzes the uploaded source file. Therefore, media asset information is generated asynchronously. You can configure an <a href="https://help.aliyun.com/document_detail/55627.html">event notification</a> for <a href="https://help.aliyun.com/document_detail/99935.html">AudioVideoAnalysisComplete</a>. After you receive the <a href="https://help.aliyun.com/document_detail/99935.html">AudioVideoAnalysisComplete</a> event notification, call this operation to retrieve the audio or video information.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the information about a single audio or video file by audio or video ID, including the title, description, duration, thumbnail URL, status, creation time, size, snapshots, category, and tags.</p>
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
     * <ul>
     * <li>You can retrieve information about up to 20 audio and video files at a time.</li>
     * <li>After an audio or video file is uploaded, ApsaraVideo VOD analyzes the uploaded source file. Therefore, media asset information is generated asynchronously. You can configure the <a href="https://help.aliyun.com/document_detail/99935.html">AudioVideoAnalysisComplete</a> <a href="https://help.aliyun.com/document_detail/55627.html">event notification</a>. After you receive the <a href="https://help.aliyun.com/document_detail/99935.html">AudioVideoAnalysisComplete</a> event notification, call this operation to retrieve the audio and video information.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the information about multiple audio and video files at a time by audio or video ID, including the title, description, duration, thumbnail URL, status, creation time, size, snapshots, category, and tags.</p>
     * 
     * @param request GetVideoInfosRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetVideoInfosResponse
     */
    public GetVideoInfosResponse getVideoInfosWithOptions(GetVideoInfosRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.referenceIds)) {
            query.put("ReferenceIds", request.referenceIds);
        }

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
     * <ul>
     * <li>You can retrieve information about up to 20 audio and video files at a time.</li>
     * <li>After an audio or video file is uploaded, ApsaraVideo VOD analyzes the uploaded source file. Therefore, media asset information is generated asynchronously. You can configure the <a href="https://help.aliyun.com/document_detail/99935.html">AudioVideoAnalysisComplete</a> <a href="https://help.aliyun.com/document_detail/55627.html">event notification</a>. After you receive the <a href="https://help.aliyun.com/document_detail/99935.html">AudioVideoAnalysisComplete</a> event notification, call this operation to retrieve the audio and video information.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the information about multiple audio and video files at a time by audio or video ID, including the title, description, duration, thumbnail URL, status, creation time, size, snapshots, category, and tags.</p>
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
     * <p>This operation retrieves up to <strong>5000</strong> audio and video files that match the specified filter conditions (such as video status and category ID). Specify StartTime and EndTime to retrieve data in batches. To query more audio and video files or traverse all audio and video information, see <a href="https://help.aliyun.com/document_detail/86044.html">Search for media information</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a list of audio and video information.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.referenceIds)) {
            query.put("ReferenceIds", request.referenceIds);
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
     * <p>This operation retrieves up to <strong>5000</strong> audio and video files that match the specified filter conditions (such as video status and category ID). Specify StartTime and EndTime to retrieve data in batches. To query more audio and video files or traverse all audio and video information, see <a href="https://help.aliyun.com/document_detail/86044.html">Search for media information</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a list of audio and video information.</p>
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
     * <ul>
     * <li>When using ApsaraVideo Player SDK (applicable to the PlayAuth playback method), call this operation to obtain the playback credential. ApsaraVideo Player SDK uses the playback credential to automatically obtain the playback URL for playback. For more information, see <a href="https://help.aliyun.com/document_detail/125579.html">ApsaraVideo Player SDK</a>.</li>
     * <li>If the playback credential expires, the playback URL cannot be obtained. You must obtain a new playback credential.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the playback credential (PlayAuth) for an audio or video file. ApsaraVideo Player SDK uses this credential to automatically obtain the playback URL. Because the playback credential has a validity period and is bound to a specific audio or video file, it cannot be shared or reused. An expired or invalid credential will cause playback failure. This playback method is suitable for audio and video playback scenarios that require high security.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.referenceId)) {
            query.put("ReferenceId", request.referenceId);
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
     * <ul>
     * <li>When using ApsaraVideo Player SDK (applicable to the PlayAuth playback method), call this operation to obtain the playback credential. ApsaraVideo Player SDK uses the playback credential to automatically obtain the playback URL for playback. For more information, see <a href="https://help.aliyun.com/document_detail/125579.html">ApsaraVideo Player SDK</a>.</li>
     * <li>If the playback credential expires, the playback URL cannot be obtained. You must obtain a new playback credential.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the playback credential (PlayAuth) for an audio or video file. ApsaraVideo Player SDK uses this credential to automatically obtain the playback URL. Because the playback credential has a validity period and is bound to a specific audio or video file, it cannot be shared or reused. An expired or invalid credential will cause playback failure. This playback method is suitable for audio and video playback scenarios that require high security.</p>
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
     * <p>Invokes this operation to query the parameter settings of a single image watermark template or text watermark template by watermark template ID, including the position, size, and display time of image watermarks, and the content, font, color, and position of text watermarks.</p>
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
     * <p>Invokes this operation to query the parameter settings of a single image watermark template or text watermark template by watermark template ID, including the position, size, and display time of image watermarks, and the content, font, color, and position of text watermarks.</p>
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
     * <ul>
     * <li><strong>Before you use this operation, make sure that you are familiar with the billing methods and pricing of ApsaraVideo VOD. Using workflows may incur fees for transcoding, encryption, automated review, and other services. For billing details, see <a href="https://help.aliyun.com/document_detail/188307.html">Billing overview</a>.</strong></li>
     * <li>You can call this operation to query workflow processing tasks. This operation currently supports only video understanding workflow task queries. Workflow tasks of other versions are not supported.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the execution information of a workflow task.</p>
     * 
     * @param request GetWorkflowTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetWorkflowTaskResponse
     */
    public GetWorkflowTaskResponse getWorkflowTaskWithOptions(GetWorkflowTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWorkflowTask"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWorkflowTaskResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li><strong>Before you use this operation, make sure that you are familiar with the billing methods and pricing of ApsaraVideo VOD. Using workflows may incur fees for transcoding, encryption, automated review, and other services. For billing details, see <a href="https://help.aliyun.com/document_detail/188307.html">Billing overview</a>.</strong></li>
     * <li>You can call this operation to query workflow processing tasks. This operation currently supports only video understanding workflow task queries. Workflow tasks of other versions are not supported.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the execution information of a workflow task.</p>
     * 
     * @param request GetWorkflowTaskRequest
     * @return GetWorkflowTaskResponse
     */
    public GetWorkflowTaskResponse getWorkflowTask(GetWorkflowTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWorkflowTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Currently, this operation is supported in the following regions: <strong>China (Beijing)</strong> and <strong>China (Shanghai)</strong>.</li>
     * <li>This operation can query AI image information of only a single video. <strong>Batch queries are not supported</strong>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the AI image information of a specified video.</p>
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
     * <ul>
     * <li>Currently, this operation is supported in the following regions: <strong>China (Beijing)</strong> and <strong>China (Shanghai)</strong>.</li>
     * <li>This operation can query AI image information of only a single video. <strong>Batch queries are not supported</strong>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the AI image information of a specified video.</p>
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
     * <ul>
     * <li>Regions that support media fingerprint: <strong>China (Beijing)</strong>, <strong>China (Shanghai)</strong>, and <strong>Singapore</strong>.</li>
     * <li>Regions that support intelligent tagging: <strong>China (Beijing)</strong> and <strong>China (Shanghai)</strong>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries intelligent tagging or media fingerprint jobs. After you submit an intelligent tagging or media fingerprint job, the job is processed asynchronously. You can call this operation to query job information in real time.</p>
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
     * <ul>
     * <li>Regions that support media fingerprint: <strong>China (Beijing)</strong>, <strong>China (Shanghai)</strong>, and <strong>Singapore</strong>.</li>
     * <li>Regions that support intelligent tagging: <strong>China (Beijing)</strong> and <strong>China (Shanghai)</strong>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries intelligent tagging or media fingerprint jobs. After you submit an intelligent tagging or media fingerprint job, the job is processed asynchronously. You can call this operation to query job information in real time.</p>
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
     * <ul>
     * <li>Currently, this operation is supported in the following regions: <strong>China (Beijing)</strong>, <strong>China (Shanghai)</strong>, and <strong>Singapore</strong>.</li>
     * <li>You can call this operation to query the list of AI templates of a specified type.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of AI templates.</p>
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
     * <ul>
     * <li>Currently, this operation is supported in the following regions: <strong>China (Beijing)</strong>, <strong>China (Shanghai)</strong>, and <strong>Singapore</strong>.</li>
     * <li>You can call this operation to query the list of AI templates of a specified type.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of AI templates.</p>
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
     * <h3>Usage notes</h3>
     * <p>You can filter applications by application status.</p>
     * <h3>QPS limit</h3>
     * <p>The single-user QPS limit for this operation is 30 calls per second. If the limit is exceeded, API calls are throttled, which may affect your business. Call this operation properly. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of applications that you are authorized to access based on specified filter conditions.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
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
     * <h3>Usage notes</h3>
     * <p>You can filter applications by application status.</p>
     * <h3>QPS limit</h3>
     * <p>The single-user QPS limit for this operation is 30 calls per second. If the limit is exceeded, API calls are throttled, which may affect your business. Call this operation properly. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of applications that you are authorized to access based on specified filter conditions.</p>
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
     * <ul>
     * <li>The <strong>IdentityType</strong> and <strong>IdentityName</strong> parameters take effect only when the caller invokes this operation with administrator permissions. Otherwise, only the application access policies granted to the current account identity are returned.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Invokes this operation to list the application permissions granted to a specified account identity (Resource Access Management (RAM) user or RAM role).</p>
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
     * <ul>
     * <li>The <strong>IdentityType</strong> and <strong>IdentityName</strong> parameters take effect only when the caller invokes this operation with administrator permissions. Otherwise, only the application access policies granted to the current account identity are returned.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Invokes this operation to list the application permissions granted to a specified account identity (Resource Access Management (RAM) user or RAM role).</p>
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
     * <p>Retrieves the list of China Chinese review security IPs.</p>
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
     * <p>Retrieves the list of China Chinese review security IPs.</p>
     * 
     * @param request ListAuditSecurityIpRequest
     * @return ListAuditSecurityIpResponse
     */
    public ListAuditSecurityIpResponse listAuditSecurityIp(ListAuditSecurityIpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAuditSecurityIpWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <ul>
     * <li>After animated image capturing for a video is complete, call this operation to obtain the animated image information of the video.</li>
     * <li>Animated image tasks can be initiated by calling an API operation (<a href="https://help.aliyun.com/document_detail/186842.html">SubmitDynamicImageJob</a>) or by using the console. For more information, see <a href="https://help.aliyun.com/document_detail/177484.html">Animated images</a>.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The QPS limit for a single user for this operation is 100 calls per second. If the limit is exceeded, the API call is throttled, which may affect your business. Call this operation appropriately. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limits</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of animated images for a video by video ID.</p>
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
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <ul>
     * <li>After animated image capturing for a video is complete, call this operation to obtain the animated image information of the video.</li>
     * <li>Animated image tasks can be initiated by calling an API operation (<a href="https://help.aliyun.com/document_detail/186842.html">SubmitDynamicImageJob</a>) or by using the console. For more information, see <a href="https://help.aliyun.com/document_detail/177484.html">Animated images</a>.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The QPS limit for a single user for this operation is 100 calls per second. If the limit is exceeded, the API call is throttled, which may affect your business. Call this operation appropriately. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limits</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of animated images for a video by video ID.</p>
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
     * <p><em>Usage notes</em>*</p>
     * <ul>
     * <li>To query detailed task information, call the <a href="https://help.aliyun.com/document_detail/2861326.html">GetJobDetail</a> operation.</li>
     * <li>This operation only supports querying asynchronous task data within the last 6 months. Supported task types: transcoding tasks, snapshot tasks, and AI tasks.
     * <strong>QPS limit</strong>
     * The single-user QPS limit for this operation is 15 calls per second. If the limit is exceeded, API calls are throttled, which may affect your business. Call this operation appropriately. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limit</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the historical task list based on a media asset ID.</p>
     * 
     * @param request ListJobInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListJobInfoResponse
     */
    public ListJobInfoResponse listJobInfoWithOptions(ListJobInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobType)) {
            query.put("JobType", request.jobType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaId)) {
            query.put("MediaId", request.mediaId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListJobInfo"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListJobInfoResponse());
    }

    /**
     * <b>description</b> :
     * <p><em>Usage notes</em>*</p>
     * <ul>
     * <li>To query detailed task information, call the <a href="https://help.aliyun.com/document_detail/2861326.html">GetJobDetail</a> operation.</li>
     * <li>This operation only supports querying asynchronous task data within the last 6 months. Supported task types: transcoding tasks, snapshot tasks, and AI tasks.
     * <strong>QPS limit</strong>
     * The single-user QPS limit for this operation is 15 calls per second. If the limit is exceeded, API calls are throttled, which may affect your business. Call this operation appropriately. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limit</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the historical task list based on a media asset ID.</p>
     * 
     * @param request ListJobInfoRequest
     * @return ListJobInfoResponse
     */
    public ListJobInfoResponse listJobInfo(ListJobInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listJobInfoWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>A maximum of 5,000 records that match the specified filter conditions can be retrieved.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the list of Live to VOD videos.</p>
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
     * <p>A maximum of 5,000 records that match the specified filter conditions can be retrieved.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the list of Live to VOD videos.</p>
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
     * <p>If multiple snapshot jobs have been initiated for a video, this operation returns only the data of the most recent successful snapshot job.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries snapshots generated by video snapshot jobs and thumbnail snapshots automatically generated by the system during video upload.</p>
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
     * <p>If multiple snapshot jobs have been initiated for a video, this operation returns only the data of the most recent successful snapshot job.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries snapshots generated by video snapshot jobs and thumbnail snapshots automatically generated by the system during video upload.</p>
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
     * <h3>Usage notes</h3>
     * <ul>
     * <li>To query detailed transcoding job information, call the <a href="https://help.aliyun.com/document_detail/109121.html">GetTranscodeTask</a> operation.</li>
     * <li><strong>This operation supports only querying transcoding task data within the last year.</strong></li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The single-user QPS limit for this operation is 15 calls per second. If the limit is exceeded, the API call is throttled, which may affect your business. Call this operation appropriately. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the historical transcoding task information of an audio or video file by its ID. This operation does not return specific job details.</p>
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
     * <h3>Usage notes</h3>
     * <ul>
     * <li>To query detailed transcoding job information, call the <a href="https://help.aliyun.com/document_detail/109121.html">GetTranscodeTask</a> operation.</li>
     * <li><strong>This operation supports only querying transcoding task data within the last year.</strong></li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The single-user QPS limit for this operation is 15 calls per second. If the limit is exceeded, the API call is throttled, which may affect your business. Call this operation appropriately. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the historical transcoding task information of an audio or video file by its ID. This operation does not return specific job details.</p>
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
     * <p>This operation does not return the transcoding template configuration information under each transcoding template group. You can call the <a href="https://help.aliyun.com/document_detail/102670.html">GetTranscodeTemplateGroup</a> operation to obtain the information.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of transcoding template configurations.</p>
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
     * <p>This operation does not return the transcoding template configuration information under each transcoding template group. You can call the <a href="https://help.aliyun.com/document_detail/102670.html">GetTranscodeTemplateGroup</a> operation to obtain the information.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of transcoding template configurations.</p>
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
     * <p>Queries the list of snapshot templates.</p>
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
     * <p>Queries the list of snapshot templates.</p>
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
     * <p>Invokes this operation to query the parameter settings of all image watermark templates and text watermark templates that have been added in the current service region, including the position, size, and display time of image watermarks, and the content, font, color, position, and other parameter settings of text watermarks.</p>
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
     * <p>Invokes this operation to query the parameter settings of all image watermark templates and text watermark templates that have been added in the current service region, including the position, size, and display time of image watermarks, and the content, font, color, position, and other parameter settings of text watermarks.</p>
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
     * <p>Invokes this operation to migrate resources such as media assets from one application to another. Application administrators can directly transfer resources. Resource Access Management (RAM) users or RAM roles must have write permissions on both the source and destination applications. Batch migration is supported.</p>
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
     * <p>Invokes this operation to migrate resources such as media assets from one application to another. Application administrators can directly transfer resources. Resource Access Management (RAM) users or RAM roles must have write permissions on both the source and destination applications. Batch migration is supported.</p>
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
     * <ul>
     * <li>Currently, the only supported service region is <strong>China (Shanghai)</strong>.</li>
     * <li>A maximum of 500 prefetch URL requests can be submitted per account per day. Directory-level prefetch is not supported.</li>
     * <li>The purge and prefetch operations include the <a href="~~RefreshVodObjectCaches~~">RefreshVodObjectCaches</a> purge operation and the <a href="~~PreloadVodObjectCaches~~">PreloadVodObjectCaches</a> prefetch operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Prefetches content from the origin server to L2 Cache nodes so that the first access directly hits the cache, reducing the load on the origin server.</p>
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
     * <ul>
     * <li>Currently, the only supported service region is <strong>China (Shanghai)</strong>.</li>
     * <li>A maximum of 500 prefetch URL requests can be submitted per account per day. Directory-level prefetch is not supported.</li>
     * <li>The purge and prefetch operations include the <a href="~~RefreshVodObjectCaches~~">RefreshVodObjectCaches</a> purge operation and the <a href="~~PreloadVodObjectCaches~~">PreloadVodObjectCaches</a> prefetch operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Prefetches content from the origin server to L2 Cache nodes so that the first access directly hits the cache, reducing the load on the origin server.</p>
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
     * <ul>
     * <li><strong>Before you use this operation, make sure that you are familiar with the billing methods and pricing of ApsaraVideo VOD. Online editing is a paid feature. For more information about billing, see <a href="~~188310#section-pyv-b8h-bo7~~">Video editing and production billing</a>.</strong></li>
     * <li>This is an <a href="https://help.aliyun.com/document_detail/3027551.html">asynchronous operation</a>. After you submit a task, the online editing project ID is returned (the video has not been produced yet, and the task enters a queue for asynchronous execution). The final result is sent through a callback notification. You can also call <a href="https://help.aliyun.com/document_detail/69052.html">GetEditingProject</a> to query the task status.</li>
     * <li>The video resources used in the online editing timeline can be materials in the material library or videos in the media library. If you use videos from the media library, make sure that their status is Normal.</li>
     * <li>Videos are produced based on ProjectId and Timeline. The logic is as follows:<ul>
     * <li>ProjectId and Timeline cannot both be empty. Otherwise, no basis exists to produce videos.</li>
     * <li>If ProjectId is empty and Timeline is not empty, an online editing project is automatically created with the specified Timeline. The materials referenced in the Timeline are extracted and set as the project materials. Then, video production begins.</li>
     * <li>If ProjectId is not empty and Timeline is empty, the most recently saved Timeline is retrieved based on ProjectId and used to produce videos.</li>
     * <li>If both ProjectId and Timeline are not empty, the specified Timeline is used to produce videos, and the corresponding online editing project is updated (Timeline and project materials). If other fields are specified, the corresponding project fields are also updated.</li>
     * </ul>
     * </li>
     * <li>The maximum number of tracks for video tracks, image tracks, and subtitle tracks is 100 each.</li>
     * <li>The total number of materials cannot exceed 200, and the total file size of materials cannot exceed 1 TB.</li>
     * <li>The region of the input or output bucket must be the same as the region where the ApsaraVideo VOD service is used.</li>
     * <li>When the output is a video, the following resolution limits apply to the finished video:<ul>
     * <li>Both the width and height must be at least 128 px.</li>
     * <li>Both the width and height must be at most 4096 px.</li>
     * <li>The short side must be at most 2160 px.</li>
     * </ul>
     * </li>
     * <li>After video production is complete, the video is automatically uploaded to ApsaraVideo VOD. Therefore, after video production is complete, ApsaraVideo VOD sends the <strong>ProduceMediaComplete</strong> and <strong>FileUploadComplete</strong> event notifications. After the produced video transcoding is complete, the <strong>single definition video transcoding complete</strong> and <strong>all definition video transcoding complete</strong> event notifications are sent.</li>
     * <li>You can also add effects to the produced video. For more details, see <a href="https://help.aliyun.com/document_detail/69082.html">Effects</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Produces one or more videos into a finished video. You can submit source videos directly through the timeline parameter, or create an online editing project first and then submit it for production.</p>
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
     * <ul>
     * <li><strong>Before you use this operation, make sure that you are familiar with the billing methods and pricing of ApsaraVideo VOD. Online editing is a paid feature. For more information about billing, see <a href="~~188310#section-pyv-b8h-bo7~~">Video editing and production billing</a>.</strong></li>
     * <li>This is an <a href="https://help.aliyun.com/document_detail/3027551.html">asynchronous operation</a>. After you submit a task, the online editing project ID is returned (the video has not been produced yet, and the task enters a queue for asynchronous execution). The final result is sent through a callback notification. You can also call <a href="https://help.aliyun.com/document_detail/69052.html">GetEditingProject</a> to query the task status.</li>
     * <li>The video resources used in the online editing timeline can be materials in the material library or videos in the media library. If you use videos from the media library, make sure that their status is Normal.</li>
     * <li>Videos are produced based on ProjectId and Timeline. The logic is as follows:<ul>
     * <li>ProjectId and Timeline cannot both be empty. Otherwise, no basis exists to produce videos.</li>
     * <li>If ProjectId is empty and Timeline is not empty, an online editing project is automatically created with the specified Timeline. The materials referenced in the Timeline are extracted and set as the project materials. Then, video production begins.</li>
     * <li>If ProjectId is not empty and Timeline is empty, the most recently saved Timeline is retrieved based on ProjectId and used to produce videos.</li>
     * <li>If both ProjectId and Timeline are not empty, the specified Timeline is used to produce videos, and the corresponding online editing project is updated (Timeline and project materials). If other fields are specified, the corresponding project fields are also updated.</li>
     * </ul>
     * </li>
     * <li>The maximum number of tracks for video tracks, image tracks, and subtitle tracks is 100 each.</li>
     * <li>The total number of materials cannot exceed 200, and the total file size of materials cannot exceed 1 TB.</li>
     * <li>The region of the input or output bucket must be the same as the region where the ApsaraVideo VOD service is used.</li>
     * <li>When the output is a video, the following resolution limits apply to the finished video:<ul>
     * <li>Both the width and height must be at least 128 px.</li>
     * <li>Both the width and height must be at most 4096 px.</li>
     * <li>The short side must be at most 2160 px.</li>
     * </ul>
     * </li>
     * <li>After video production is complete, the video is automatically uploaded to ApsaraVideo VOD. Therefore, after video production is complete, ApsaraVideo VOD sends the <strong>ProduceMediaComplete</strong> and <strong>FileUploadComplete</strong> event notifications. After the produced video transcoding is complete, the <strong>single definition video transcoding complete</strong> and <strong>all definition video transcoding complete</strong> event notifications are sent.</li>
     * <li>You can also add effects to the produced video. For more details, see <a href="https://help.aliyun.com/document_detail/69082.html">Effects</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Produces one or more videos into a finished video. You can submit source videos directly through the timeline parameter, or create an online editing project first and then submit it for production.</p>
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
     * <li>ApsaraVideo VOD provides resource purge and prefetch features. The purge feature deletes cached resources on points of presence and forces the points of presence to retrieve the latest resources from the origin server through back-to-origin requests. The prefetch feature allows you to download and cache popular resources to points of presence before peak hours to improve access efficiency.</li>
     * <li>This operation directly submits a refresh or prefetch node by audio or video ID and supports filtering by streaming format and definition, which allows you to refresh or prefetch specific streams as needed.</li>
     * <li>You can submit a refresh or prefetch node for up to 20 audio or video files at a time.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The QPS limit for a single user for this operation is 50 calls per second. If the limit is exceeded, the API invocation is throttled, which may affect your business. Invoke this operation properly. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Submits a refresh or prefetch task for audio or video files by audio or video ID.</p>
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
     * <li>ApsaraVideo VOD provides resource purge and prefetch features. The purge feature deletes cached resources on points of presence and forces the points of presence to retrieve the latest resources from the origin server through back-to-origin requests. The prefetch feature allows you to download and cache popular resources to points of presence before peak hours to improve access efficiency.</li>
     * <li>This operation directly submits a refresh or prefetch node by audio or video ID and supports filtering by streaming format and definition, which allows you to refresh or prefetch specific streams as needed.</li>
     * <li>You can submit a refresh or prefetch node for up to 20 audio or video files at a time.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The QPS limit for a single user for this operation is 50 calls per second. If the limit is exceeded, the API invocation is throttled, which may affect your business. Invoke this operation properly. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Submits a refresh or prefetch task for audio or video files by audio or video ID.</p>
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
     * <p>This operation can also be used to overwrite the source file of a video or audio file. This means that after you obtain the upload URL of the source file, you can upload the file again while keeping the audio or video ID unchanged. However, this may automatically trigger transcoding and snapshot capture if you have configured transcoding or snapshot capture upon upload. For more information, see <a href="https://help.aliyun.com/document_detail/55397.html">Upload URLs and credentials</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Refreshes the upload credential for a video file after the upload times out.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.referenceId)) {
            query.put("ReferenceId", request.referenceId);
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
     * <p>This operation can also be used to overwrite the source file of a video or audio file. This means that after you obtain the upload URL of the source file, you can upload the file again while keeping the audio or video ID unchanged. However, this may automatically trigger transcoding and snapshot capture if you have configured transcoding or snapshot capture upon upload. For more information, see <a href="https://help.aliyun.com/document_detail/55397.html">Upload URLs and credentials</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Refreshes the upload credential for a video file after the upload times out.</p>
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
     * <ul>
     * <li>Currently, the only supported service region is <strong>China (Shanghai)</strong>.</li>
     * <li>Each account can submit up to 2,000 URL purge requests and 100 directory purge requests per day.</li>
     * <li>Purge and prefetch operations include the <a href="https://help.aliyun.com/document_detail/69215.html">RefreshVodObjectCaches</a> purge operation and the <a href="https://help.aliyun.com/document_detail/69211.html">PreloadVodObjectCaches</a> prefetch operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Purges file content on nodes. Specifies URL content to purge on cache nodes, and supports batch URL purging.</p>
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
     * <ul>
     * <li>Currently, the only supported service region is <strong>China (Shanghai)</strong>.</li>
     * <li>Each account can submit up to 2,000 URL purge requests and 100 directory purge requests per day.</li>
     * <li>Purge and prefetch operations include the <a href="https://help.aliyun.com/document_detail/69215.html">RefreshVodObjectCaches</a> purge operation and the <a href="https://help.aliyun.com/document_detail/69211.html">PreloadVodObjectCaches</a> prefetch operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Purges file content on nodes. Specifies URL content to purge on cache nodes, and supports batch URL purging.</p>
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
     * <ul>
     * <li>For audio and video files already stored in an OSS bucket connected to ApsaraVideo VOD, you must call this operation to generate the associated data required by VOD before you can initiate transcoding, snapshotting, AI processing, and other operations on these files by media ID.</li>
     * <li>You can register up to <strong>10 OSS media files</strong> at a time, and all media files submitted in a single request must correspond to the same storage address.</li>
     * <li>For media files uploaded through VOD, if no transcoding template group ID is specified, the default template group is used for transcoding. In contrast, after media asset registration, transcoding is not automatically triggered if no transcoding template group ID is specified. If a transcoding template group ID is specified, transcoding is performed based on the specified template group.</li>
     * <li>If a media file is registered repeatedly, only the <strong>unique media ID associated with it</strong> is returned, and no other processing is performed.</li>
     * <li>Make sure that the media file you want to register has a valid file name extension. Otherwise, the registration fails.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Registers media assets. Existing media files stored in your own OSS bucket that is connected to ApsaraVideo VOD must be registered to generate the associated data required by VOD before you can use VOD features such as transcoding and snapshotting.</p>
     * 
     * @param request RegisterMediaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RegisterMediaResponse
     */
    public RegisterMediaResponse registerMediaWithOptions(RegisterMediaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.enableFirstFrameCover)) {
            query.put("EnableFirstFrameCover", request.enableFirstFrameCover);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.generateThumbnail)) {
            query.put("GenerateThumbnail", request.generateThumbnail);
        }

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
     * <ul>
     * <li>For audio and video files already stored in an OSS bucket connected to ApsaraVideo VOD, you must call this operation to generate the associated data required by VOD before you can initiate transcoding, snapshotting, AI processing, and other operations on these files by media ID.</li>
     * <li>You can register up to <strong>10 OSS media files</strong> at a time, and all media files submitted in a single request must correspond to the same storage address.</li>
     * <li>For media files uploaded through VOD, if no transcoding template group ID is specified, the default template group is used for transcoding. In contrast, after media asset registration, transcoding is not automatically triggered if no transcoding template group ID is specified. If a transcoding template group ID is specified, transcoding is performed based on the specified template group.</li>
     * <li>If a media file is registered repeatedly, only the <strong>unique media ID associated with it</strong> is returned, and no other processing is performed.</li>
     * <li>Make sure that the media file you want to register has a valid file name extension. Otherwise, the registration fails.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Registers media assets. Existing media files stored in your own OSS bucket that is connected to ApsaraVideo VOD must be registered to generate the associated data required by VOD before you can use VOD features such as transcoding and snapshotting.</p>
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
     * <ul>
     * <li>Make sure that you are familiar with the billing methods and pricing of ApsaraVideo VOD before you call this operation. Restoring media assets incurs storage fees. For more information, see <a href="~~188308#section-e97-xrp-mzz~~">Media asset storage billing</a>.</li>
     * <li>This operation applies only to Archive and Cold Archive audio and video files. After a file is restored, it can be accessed. The storage class of an audio or video file that is being restored cannot be changed.
     * Restoration generates retrieval traffic. After a Cold Archive audio or video file is restored, a Standard storage copy of the file is generated for access. The file copy incurs Standard storage fees until the restoration period ends.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Restores media assets from frozen storage.</p>
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
     * <ul>
     * <li>Make sure that you are familiar with the billing methods and pricing of ApsaraVideo VOD before you call this operation. Restoring media assets incurs storage fees. For more information, see <a href="~~188308#section-e97-xrp-mzz~~">Media asset storage billing</a>.</li>
     * <li>This operation applies only to Archive and Cold Archive audio and video files. After a file is restored, it can be accessed. The storage class of an audio or video file that is being restored cannot be changed.
     * Restoration generates retrieval traffic. After a Cold Archive audio or video file is restored, a Standard storage copy of the file is generated for access. The file copy incurs Standard storage fees until the restoration period ends.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Restores media assets from frozen storage.</p>
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
     * <p>Searches for online editing projects (video editing lists).</p>
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
     * <p>Searches for online editing projects (video editing lists).</p>
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
     * <p>For fields that support exact matching and fuzzy matching, when other query methods are used, the returned results follow the query method supported by the field. For example, if a field supports only fuzzy matching, results obtained through multi-value queries are also based on fuzzy matching.
     * The following describes the limits on the number of data records that can be retrieved:</p>
     * <ul>
     * <li>Method 1: Paged traversal
     *   For matched search results, you can set the pagination parameters PageNo (page number) and PageSize (number of records per page) to traverse up to 5,000 records. If the search results exceed 5,000 records, adjust the search conditions to narrow the result range. This method cannot traverse the complete dataset. To traverse more data, refer to Method 2.</li>
     * <li>Method 2: Full traversal (for audio and video searches only)
     * This method applies to video and audio content searches and supports traversing up to 2 million search results. If the number of search results exceeds 2 million, add more filter conditions to reduce the result count. When using this method, in addition to PageNo and PageSize, you must use the ScrollToken parameter for pagination. Each request supports traversing up to 100 records forward.
     * Using a PageSize of 20 as an example, the pagination logic is as follows:<ul>
     * <li>If PageNo is 1, you can query up to the next 5 pages of data.</li>
     * <li>If PageNo is 2, you can query up to the next 6 pages of data.
     * Set pagination parameters properly and choose the appropriate traversal method based on the result set size. If you need to page through more than 1,000 records, use Method 2 for faster and more convenient data processing.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Searches for media asset information such as videos, audio files, and images produced by ApsaraVideo VOD. You can use this operation with the media asset search protocol to perform multi-dimensional searches in ApsaraVideo VOD, including specifying return fields, exact matching, fuzzy matching, multi-value queries, range queries, and sort fields.</p>
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
     * <p>For fields that support exact matching and fuzzy matching, when other query methods are used, the returned results follow the query method supported by the field. For example, if a field supports only fuzzy matching, results obtained through multi-value queries are also based on fuzzy matching.
     * The following describes the limits on the number of data records that can be retrieved:</p>
     * <ul>
     * <li>Method 1: Paged traversal
     *   For matched search results, you can set the pagination parameters PageNo (page number) and PageSize (number of records per page) to traverse up to 5,000 records. If the search results exceed 5,000 records, adjust the search conditions to narrow the result range. This method cannot traverse the complete dataset. To traverse more data, refer to Method 2.</li>
     * <li>Method 2: Full traversal (for audio and video searches only)
     * This method applies to video and audio content searches and supports traversing up to 2 million search results. If the number of search results exceeds 2 million, add more filter conditions to reduce the result count. When using this method, in addition to PageNo and PageSize, you must use the ScrollToken parameter for pagination. Each request supports traversing up to 100 records forward.
     * Using a PageSize of 20 as an example, the pagination logic is as follows:<ul>
     * <li>If PageNo is 1, you can query up to the next 5 pages of data.</li>
     * <li>If PageNo is 2, you can query up to the next 6 pages of data.
     * Set pagination parameters properly and choose the appropriate traversal method based on the result set size. If you need to page through more than 1,000 records, use Method 2 for faster and more convenient data processing.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Searches for media asset information such as videos, audio files, and images produced by ApsaraVideo VOD. You can use this operation with the media asset search protocol to perform multi-dimensional searches in ApsaraVideo VOD, including specifying return fields, exact matching, fuzzy matching, multi-value queries, range queries, and sort fields.</p>
     * 
     * @param request SearchMediaRequest
     * @return SearchMediaResponse
     */
    public SearchMediaResponse searchMedia(SearchMediaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchMediaWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Sets the playback key for an application.</p>
     * 
     * @param request SetAppPlayKeyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetAppPlayKeyResponse
     */
    public SetAppPlayKeyResponse setAppPlayKeyWithOptions(SetAppPlayKeyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.playKey)) {
            query.put("PlayKey", request.playKey);
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
            new TeaPair("action", "SetAppPlayKey"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetAppPlayKeyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Sets the playback key for an application.</p>
     * 
     * @param request SetAppPlayKeyRequest
     * @return SetAppPlayKeyResponse
     */
    public SetAppPlayKeyResponse setAppPlayKey(SetAppPlayKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setAppPlayKeyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>When a video is in the Checking or Blocked state, only requests from review security IP addresses can play the video.</p>
     * 
     * <b>summary</b> : 
     * <p>Sets the review security IP addresses.</p>
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
     * <p>When a video is in the Checking or Blocked state, only requests from review security IP addresses can play the video.</p>
     * 
     * <b>summary</b> : 
     * <p>Sets the review security IP addresses.</p>
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
     * <p>Notice: If you access the cross-domain file through a domain name, purge the CDN cache for the update to take effect immediately. You can logon to the console to <a href="https://help.aliyun.com/document_detail/86098.html">purge files</a> or invoke the <a href="https://help.aliyun.com/document_detail/69215.html">Refresh Cache operation</a>.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Updates the content of the cross-domain file crossdomain.xml for ApsaraVideo VOD.</p>
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
     * <p>Notice: If you access the cross-domain file through a domain name, purge the CDN cache for the update to take effect immediately. You can logon to the console to <a href="https://help.aliyun.com/document_detail/86098.html">purge files</a> or invoke the <a href="https://help.aliyun.com/document_detail/69215.html">Refresh Cache operation</a>.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Updates the content of the cross-domain file crossdomain.xml for ApsaraVideo VOD.</p>
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
     * <ul>
     * <li>Currently, this operation is supported in the following regions: <strong>China (Beijing)</strong>, <strong>China (Shanghai)</strong>, and <strong>Singapore</strong>.</li>
     * <li>Obtain the AI template ID first, and then call this operation to set the template as the default AI template. A default AI template cannot be deleted.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Sets a default AI template.</p>
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
     * <ul>
     * <li>Currently, this operation is supported in the following regions: <strong>China (Beijing)</strong>, <strong>China (Shanghai)</strong>, and <strong>Singapore</strong>.</li>
     * <li>Obtain the AI template ID first, and then call this operation to set the template as the default AI template. A default AI template cannot be deleted.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Sets a default AI template.</p>
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
     * <p>Sets the default transcoding template group configuration.</p>
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
     * <p>Sets the default transcoding template group configuration.</p>
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
     * <p>Sets a specified watermark template as the default watermark template.</p>
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
     * <p>Sets a specified watermark template as the default watermark template.</p>
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
     * <p>Sets the materials to be edited for an online editing project.</p>
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
     * <p>Sets the materials to be edited for an online editing project.</p>
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
     * <p>HTTP callbacks and Simple Message Queue (formerly MNS) callbacks are supported. For more information, see <a href="https://help.aliyun.com/document_detail/55627.html">Event notifications</a>.</p>
     * <h3>QPS limit</h3>
     * <p>The single-user QPS limit for this operation is 15 calls per second. If the limit is exceeded, the API call is throttled, which may affect your business. Call this operation appropriately. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Sets the callback method, callback URL, and event types for event notifications.</p>
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
     * <p>HTTP callbacks and Simple Message Queue (formerly MNS) callbacks are supported. For more information, see <a href="https://help.aliyun.com/document_detail/55627.html">Event notifications</a>.</p>
     * <h3>QPS limit</h3>
     * <p>The single-user QPS limit for this operation is 15 calls per second. If the limit is exceeded, the API call is throttled, which may affect your business. Call this operation appropriately. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Sets the callback method, callback URL, and event types for event notifications.</p>
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
     * <ul>
     * <li>Currently, the service address supports only <strong>China (Shanghai)</strong>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Configures whether the certificate feature is enabled for a specified domain name and modifies certificate information.</p>
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
     * <ul>
     * <li>Currently, the service address supports only <strong>China (Shanghai)</strong>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Configures whether the certificate feature is enabled for a specified domain name and modifies certificate information.</p>
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
     * <ul>
     * <li>This operation currently supports only the <strong>China East 2 (Shanghai)</strong> region.</li>
     * <li>Maximum calls per user: 30 calls per second.</li>
     * <li>Request method: POST.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Sets whether the certificate feature is enabled for a specified domain name and updates the certificate information.</p>
     * 
     * @param request SetVodDomainSSLCertificateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetVodDomainSSLCertificateResponse
     */
    public SetVodDomainSSLCertificateResponse setVodDomainSSLCertificateWithOptions(SetVodDomainSSLCertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.certId)) {
            query.put("CertId", request.certId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certName)) {
            query.put("CertName", request.certName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certRegion)) {
            query.put("CertRegion", request.certRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certType)) {
            query.put("CertType", request.certType);
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
            new TeaPair("action", "SetVodDomainSSLCertificate"),
            new TeaPair("version", "2017-03-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetVodDomainSSLCertificateResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation currently supports only the <strong>China East 2 (Shanghai)</strong> region.</li>
     * <li>Maximum calls per user: 30 calls per second.</li>
     * <li>Request method: POST.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Sets whether the certificate feature is enabled for a specified domain name and updates the certificate information.</p>
     * 
     * @param request SetVodDomainSSLCertificateRequest
     * @return SetVodDomainSSLCertificateResponse
     */
    public SetVodDomainSSLCertificateResponse setVodDomainSSLCertificate(SetVodDomainSSLCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setVodDomainSSLCertificateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li><strong>Before you use this operation, make sure that you are familiar with the billing methods and pricing of ApsaraVideo VOD. Automated review is a paid feature. For billing details, &lt;props=&quot;china&quot;&gt;see <a href="~~188310#section-g7l-s3o-9ng~~">Automated review billing</a>.&lt;props=&quot;intl&quot;&gt;submit a ticket or contact your Alibaba Cloud account manager.</strong></li>
     * <li>&lt;props=&quot;china&quot;&gt;This operation is supported only in the <strong>China (Shanghai), China (Beijing), and Singapore</strong> regions.&lt;props=&quot;intl&quot;&gt;This operation is supported only in the Singapore region.</li>
     * <li>This is an <a href="https://help.aliyun.com/document_detail/3027551.html">asynchronous operation</a>. After you submit a task, the task ID is returned. At this point, the task is not complete and enters a queue for asynchronous execution. The final result is sent through a callback notification. You can also call <a href="https://help.aliyun.com/document_detail/454959.html">Query automated review job</a> to query the task status.</li>
     * <li>The size of a single image cannot exceed 20 MB. The height or width cannot exceed 30,000 px. The total number of pixels cannot exceed 250 million px.</li>
     * <li>(Recommended) The image resolution is at least 256 × 256 px. A lower resolution may affect the review results.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Submits an automated review task for an image. The task is asynchronously executed after it is submitted. The task may not be complete when the response is returned.</p>
     * 
     * @param request SubmitAIImageAuditJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitAIImageAuditJobResponse
     */
    public SubmitAIImageAuditJobResponse submitAIImageAuditJobWithOptions(SubmitAIImageAuditJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.censorProvider)) {
            query.put("CensorProvider", request.censorProvider);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageService)) {
            query.put("ImageService", request.imageService);
        }

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

        if (!com.aliyun.teautil.Common.isUnset(request.serviceParameters)) {
            query.put("ServiceParameters", request.serviceParameters);
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
     * <ul>
     * <li><strong>Before you use this operation, make sure that you are familiar with the billing methods and pricing of ApsaraVideo VOD. Automated review is a paid feature. For billing details, &lt;props=&quot;china&quot;&gt;see <a href="~~188310#section-g7l-s3o-9ng~~">Automated review billing</a>.&lt;props=&quot;intl&quot;&gt;submit a ticket or contact your Alibaba Cloud account manager.</strong></li>
     * <li>&lt;props=&quot;china&quot;&gt;This operation is supported only in the <strong>China (Shanghai), China (Beijing), and Singapore</strong> regions.&lt;props=&quot;intl&quot;&gt;This operation is supported only in the Singapore region.</li>
     * <li>This is an <a href="https://help.aliyun.com/document_detail/3027551.html">asynchronous operation</a>. After you submit a task, the task ID is returned. At this point, the task is not complete and enters a queue for asynchronous execution. The final result is sent through a callback notification. You can also call <a href="https://help.aliyun.com/document_detail/454959.html">Query automated review job</a> to query the task status.</li>
     * <li>The size of a single image cannot exceed 20 MB. The height or width cannot exceed 30,000 px. The total number of pixels cannot exceed 250 million px.</li>
     * <li>(Recommended) The image resolution is at least 256 × 256 px. A lower resolution may affect the review results.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Submits an automated review task for an image. The task is asynchronously executed after it is submitted. The task may not be complete when the response is returned.</p>
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
     * <ul>
     * <li>Currently, this operation is supported in the following regions: <strong>China (Beijing)</strong> and <strong>China (Shanghai)</strong>.</li>
     * <li>This is an <a href="https://help.aliyun.com/document_detail/3027551.html">asynchronous operation</a>. After you submit a task, the task ID is returned. The task is not yet complete at this point and enters a background queue for asynchronous execution. The final result is sent through a callback notification. You can also call <a href="https://help.aliyun.com/document_detail/186923.html">GetAIImageJobs</a> to query the task execution result.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Submits an AI image processing task.</p>
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
     * <ul>
     * <li>Currently, this operation is supported in the following regions: <strong>China (Beijing)</strong> and <strong>China (Shanghai)</strong>.</li>
     * <li>This is an <a href="https://help.aliyun.com/document_detail/3027551.html">asynchronous operation</a>. After you submit a task, the task ID is returned. The task is not yet complete at this point and enters a background queue for asynchronous execution. The final result is sent through a callback notification. You can also call <a href="https://help.aliyun.com/document_detail/186923.html">GetAIImageJobs</a> to query the task execution result.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Submits an AI image processing task.</p>
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
     * <ul>
     * <li><strong>Before using this operation, make sure that you fully understand the billing methods and pricing of ApsaraVideo VOD. Intelligent tagging and media fingerprint are paid features. For billing details, see <a href="~~188310#section-g7l-s3o-9ng~~">Video AI billing</a>.</strong></li>
     * <li>Regions supported by media fingerprint: <strong>China (Beijing)</strong>, <strong>China (Shanghai)</strong>, and <strong>Singapore</strong>. Regions supported by intelligent tagging: <strong>China (Beijing)</strong> and <strong>China (Shanghai)</strong>.</li>
     * <li>This is an <a href="https://help.aliyun.com/document_detail/3027551.html">asynchronous operation</a>. After you submit an AI job, the job ID is returned. The job is not yet complete at this point and enters a queue for asynchronous execution. We recommend that you configure the <a href="https://help.aliyun.com/document_detail/55627.html">event notification</a> feature and set the callback event to <strong>Video AI Processing Complete</strong> to obtain the final processing result. You can also call <a href="https://help.aliyun.com/document_detail/2861326.html">GetTaskDetail</a> to query the job status.</li>
     * <li>You must activate the media fingerprint or intelligent tagging service before you can call this operation to submit AI jobs. For more information, see <a href="https://help.aliyun.com/document_detail/101148.html">Video AI</a>.</li>
     * <li>When you use media fingerprint for the first time, provide your UID and region information and submit a ticket to apply for free activation of the fingerprint library. Otherwise, the media fingerprint feature will not work properly. For more information about how to submit a ticket, see <a href="https://help.aliyun.com/document_detail/464625.html">Contact us</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Submits an intelligent tagging or media fingerprint job.</p>
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
     * <ul>
     * <li><strong>Before using this operation, make sure that you fully understand the billing methods and pricing of ApsaraVideo VOD. Intelligent tagging and media fingerprint are paid features. For billing details, see <a href="~~188310#section-g7l-s3o-9ng~~">Video AI billing</a>.</strong></li>
     * <li>Regions supported by media fingerprint: <strong>China (Beijing)</strong>, <strong>China (Shanghai)</strong>, and <strong>Singapore</strong>. Regions supported by intelligent tagging: <strong>China (Beijing)</strong> and <strong>China (Shanghai)</strong>.</li>
     * <li>This is an <a href="https://help.aliyun.com/document_detail/3027551.html">asynchronous operation</a>. After you submit an AI job, the job ID is returned. The job is not yet complete at this point and enters a queue for asynchronous execution. We recommend that you configure the <a href="https://help.aliyun.com/document_detail/55627.html">event notification</a> feature and set the callback event to <strong>Video AI Processing Complete</strong> to obtain the final processing result. You can also call <a href="https://help.aliyun.com/document_detail/2861326.html">GetTaskDetail</a> to query the job status.</li>
     * <li>You must activate the media fingerprint or intelligent tagging service before you can call this operation to submit AI jobs. For more information, see <a href="https://help.aliyun.com/document_detail/101148.html">Video AI</a>.</li>
     * <li>When you use media fingerprint for the first time, provide your UID and region information and submit a ticket to apply for free activation of the fingerprint library. Otherwise, the media fingerprint feature will not work properly. For more information about how to submit a ticket, see <a href="https://help.aliyun.com/document_detail/464625.html">Contact us</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Submits an intelligent tagging or media fingerprint job.</p>
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
     * <ul>
     * <li><strong>Before using this operation, make sure that you are familiar with the billing methods and pricing of ApsaraVideo VOD. Automated review is a paid feature. For billing details, &lt;props=&quot;china&quot;&gt;refer to <a href="~~188310#section-g7l-s3o-9ng~~">Automated review billing</a>.&lt;props=&quot;intl&quot;&gt;submit a ticket or contact your Alibaba Cloud account manager.</strong></li>
     * <li>This operation currently supports only the <strong>Shanghai</strong>, <strong>Beijing</strong>, and <strong>Singapore</strong> regions.</li>
     * <li>This is an <a href="https://help.aliyun.com/document_detail/3027551.html">asynchronous operation</a>. After you submit a task, a task ID is returned. The task is not yet complete at this point and enters a queue for asynchronous execution. The final result is sent through a callback notification. You can also call <a href="https://help.aliyun.com/document_detail/454959.html">Query automated review job</a> to query the task status.</li>
     * <li>For the development guide on submitting automated review jobs, refer to <a href="https://help.aliyun.com/document_detail/101148.html">Automated review</a>.</li>
     * <li>After an automated review job is complete, the image resources generated during the job are retained for free for only two weeks in the VOD system bucket allocated by ApsaraVideo VOD. The images are automatically deleted after two weeks.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Submits an automated review job for audio and video files. The job is executed asynchronously after submission, and the job may not be complete when the response is returned.</p>
     * 
     * @param request SubmitAIMediaAuditJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitAIMediaAuditJobResponse
     */
    public SubmitAIMediaAuditJobResponse submitAIMediaAuditJobWithOptions(SubmitAIMediaAuditJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.censorProvider)) {
            query.put("CensorProvider", request.censorProvider);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaAuditConfiguration)) {
            query.put("MediaAuditConfiguration", request.mediaAuditConfiguration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaId)) {
            query.put("MediaId", request.mediaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaType)) {
            query.put("MediaType", request.mediaType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceParameters)) {
            query.put("ServiceParameters", request.serviceParameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.videoService)) {
            query.put("VideoService", request.videoService);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.voiceService)) {
            query.put("VoiceService", request.voiceService);
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
     * <ul>
     * <li><strong>Before using this operation, make sure that you are familiar with the billing methods and pricing of ApsaraVideo VOD. Automated review is a paid feature. For billing details, &lt;props=&quot;china&quot;&gt;refer to <a href="~~188310#section-g7l-s3o-9ng~~">Automated review billing</a>.&lt;props=&quot;intl&quot;&gt;submit a ticket or contact your Alibaba Cloud account manager.</strong></li>
     * <li>This operation currently supports only the <strong>Shanghai</strong>, <strong>Beijing</strong>, and <strong>Singapore</strong> regions.</li>
     * <li>This is an <a href="https://help.aliyun.com/document_detail/3027551.html">asynchronous operation</a>. After you submit a task, a task ID is returned. The task is not yet complete at this point and enters a queue for asynchronous execution. The final result is sent through a callback notification. You can also call <a href="https://help.aliyun.com/document_detail/454959.html">Query automated review job</a> to query the task status.</li>
     * <li>For the development guide on submitting automated review jobs, refer to <a href="https://help.aliyun.com/document_detail/101148.html">Automated review</a>.</li>
     * <li>After an automated review job is complete, the image resources generated during the job are retained for free for only two weeks in the VOD system bucket allocated by ApsaraVideo VOD. The images are automatically deleted after two weeks.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Submits an automated review job for audio and video files. The job is executed asynchronously after submission, and the job may not be complete when the response is returned.</p>
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
     * <ul>
     * <li><strong>Before using this operation, make sure that you fully understand the billing methods and pricing of ApsaraVideo VOD. Digital watermarking is a paid feature. Both the generation and extraction of digital watermarks incur fees. For billing details, see <a href="~~188310#62b9c940403se~~">Digital watermarking billing</a>.</strong></li>
     * <li>Currently, this operation is available only in the following regions: <strong>China (Shanghai)</strong> and <strong>China (Beijing)</strong>.</li>
     * <li>&lt;props=&quot;china&quot;&gt;For more information about the generation and extraction of digital watermarks, see <a href="https://help.aliyun.com/document_detail/2527021.html">Digital watermarking</a>.Before you submit a digital watermark extraction job, make sure that the following conditions are met:<ul>
     * <li>The video from which you want to extract the watermark has been uploaded to ApsaraVideo VOD.</li>
     * <li>The duration of the video from which you want to extract the watermark exceeds 6 minutes.</li>
     * </ul>
     * </li>
     * <li>After you submit a digital watermark extraction job, call the <a href="https://help.aliyun.com/document_detail/2587769.html">GetDigitalWatermarkExtractResult</a> operation to query the job result.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Submits a digital watermarking (copyright watermark or tracing watermark) extraction job to asynchronously extract a copyright watermark or tracing watermark.</p>
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
     * <ul>
     * <li><strong>Before using this operation, make sure that you fully understand the billing methods and pricing of ApsaraVideo VOD. Digital watermarking is a paid feature. Both the generation and extraction of digital watermarks incur fees. For billing details, see <a href="~~188310#62b9c940403se~~">Digital watermarking billing</a>.</strong></li>
     * <li>Currently, this operation is available only in the following regions: <strong>China (Shanghai)</strong> and <strong>China (Beijing)</strong>.</li>
     * <li>&lt;props=&quot;china&quot;&gt;For more information about the generation and extraction of digital watermarks, see <a href="https://help.aliyun.com/document_detail/2527021.html">Digital watermarking</a>.Before you submit a digital watermark extraction job, make sure that the following conditions are met:<ul>
     * <li>The video from which you want to extract the watermark has been uploaded to ApsaraVideo VOD.</li>
     * <li>The duration of the video from which you want to extract the watermark exceeds 6 minutes.</li>
     * </ul>
     * </li>
     * <li>After you submit a digital watermark extraction job, call the <a href="https://help.aliyun.com/document_detail/2587769.html">GetDigitalWatermarkExtractResult</a> operation to query the job result.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Submits a digital watermarking (copyright watermark or tracing watermark) extraction job to asynchronously extract a copyright watermark or tracing watermark.</p>
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
     * <h3>Usage notes</h3>
     * <ul>
     * <li>This is an <a href="https://help.aliyun.com/document_detail/3027551.html">asynchronous operation</a>. After you submit a task, the task ID is returned. The task is queued for asynchronous execution in the background. You can receive the final result through a callback notification or proactively query the task status by calling <a href="https://help.aliyun.com/document_detail/2861326.html">Get task details</a>.</li>
     * <li>You can submit an animated image job only for videos in the <strong>UploadSucc</strong>, <strong>Transcoding</strong>, <strong>Normal</strong>, <strong>Checking</strong>, or <strong>Blocked</strong> state.</li>
     * <li>Animated image production is billed as video transcoding at the same rate, based on resolution and duration. For more information, see <a href="https://help.aliyun.com/document_detail/188308.html">Media transcoding billing</a>.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The QPS limit for a single user on this operation is 30 calls per second. If the limit is exceeded, API calls are throttled, which may affect your business. Call this operation appropriately. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Submits a media animated image job for asynchronous processing.</p>
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
     * <h3>Usage notes</h3>
     * <ul>
     * <li>This is an <a href="https://help.aliyun.com/document_detail/3027551.html">asynchronous operation</a>. After you submit a task, the task ID is returned. The task is queued for asynchronous execution in the background. You can receive the final result through a callback notification or proactively query the task status by calling <a href="https://help.aliyun.com/document_detail/2861326.html">Get task details</a>.</li>
     * <li>You can submit an animated image job only for videos in the <strong>UploadSucc</strong>, <strong>Transcoding</strong>, <strong>Normal</strong>, <strong>Checking</strong>, or <strong>Blocked</strong> state.</li>
     * <li>Animated image production is billed as video transcoding at the same rate, based on resolution and duration. For more information, see <a href="https://help.aliyun.com/document_detail/188308.html">Media transcoding billing</a>.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The QPS limit for a single user on this operation is 30 calls per second. If the limit is exceeded, API calls are throttled, which may affect your business. Call this operation appropriately. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Submits a media animated image job for asynchronous processing.</p>
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
     * <p>Currently, this operation is supported in the following regions: <strong>China (Beijing)</strong>, <strong>China (Shanghai)</strong>, and <strong>Singapore</strong>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a media fingerprint job.</p>
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
     * <p>Currently, this operation is supported in the following regions: <strong>China (Beijing)</strong>, <strong>China (Shanghai)</strong>, and <strong>Singapore</strong>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a media fingerprint job.</p>
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
     * <ul>
     * <li>This is an <a href="https://help.aliyun.com/document_detail/3027551.html">asynchronous operation</a>. After you submit a task, the task ID is returned. The task is queued for asynchronous execution in the background. The final result is sent through a callback notification. You can also call <a href="https://help.aliyun.com/document_detail/2861326.html">GetTaskDetail</a> to query the task status.</li>
     * <li>Video preprocessing is essentially a transcoding process that generates videos that meet the playback requirements of the China Production Studio. Therefore, <strong>metering and billing</strong> information is generated. For billing details, see <a href="https://help.aliyun.com/document_detail/64531.html">China Production Studio fees</a>.</li>
     * <li>To meet the quality requirements of the China Production Studio for materials, videos in MP4 format with a short side of 360 must meet at least one of the following conditions before preprocessing can be initiated: the resolution exceeds 1920, the bit rate exceeds 6000 kbps, or the frame rate exceeds 25.</li>
     * <li>You can receive the <a href="https://help.aliyun.com/document_detail/55638.html">TranscodeComplete</a> callback message to obtain the processing result. When the callback message contains <strong>Preprocess=true</strong>, it indicates that the preprocessing is complete.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Transcodes a video by using a China Production Studio (China Production Studio) for preprocessing.</p>
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
     * <ul>
     * <li>This is an <a href="https://help.aliyun.com/document_detail/3027551.html">asynchronous operation</a>. After you submit a task, the task ID is returned. The task is queued for asynchronous execution in the background. The final result is sent through a callback notification. You can also call <a href="https://help.aliyun.com/document_detail/2861326.html">GetTaskDetail</a> to query the task status.</li>
     * <li>Video preprocessing is essentially a transcoding process that generates videos that meet the playback requirements of the China Production Studio. Therefore, <strong>metering and billing</strong> information is generated. For billing details, see <a href="https://help.aliyun.com/document_detail/64531.html">China Production Studio fees</a>.</li>
     * <li>To meet the quality requirements of the China Production Studio for materials, videos in MP4 format with a short side of 360 must meet at least one of the following conditions before preprocessing can be initiated: the resolution exceeds 1920, the bit rate exceeds 6000 kbps, or the frame rate exceeds 25.</li>
     * <li>You can receive the <a href="https://help.aliyun.com/document_detail/55638.html">TranscodeComplete</a> callback message to obtain the processing result. When the callback message contains <strong>Preprocess=true</strong>, it indicates that the preprocessing is complete.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Transcodes a video by using a China Production Studio (China Production Studio) for preprocessing.</p>
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
     * <ul>
     * <li>This is an <a href="https://help.aliyun.com/document_detail/3027551.html">asynchronous operation</a>. After you submit a task, the task ID is returned (the task is not yet complete and enters a queue for asynchronous execution). The final result is sent through a callback notification. You can also proactively query the task status by calling <a href="https://help.aliyun.com/document_detail/2861326.html">Get task details</a>.</li>
     * <li>Only JPG images are supported.</li>
     * <li>When the snapshot is complete, an event notification of <a href="https://help.aliyun.com/document_detail/57337.html">Video snapshot complete</a> with EventType=SnapshotComplete and SubType=SpecifiedTime is sent.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The QPS limit for a single user on this operation is 30 calls per second. If this limit is exceeded, the API call is throttled, which may affect your business. Call this operation appropriately. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Submits a video snapshot job to start asynchronous snapshot processing.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.referenceId)) {
            query.put("ReferenceId", request.referenceId);
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
     * <ul>
     * <li>This is an <a href="https://help.aliyun.com/document_detail/3027551.html">asynchronous operation</a>. After you submit a task, the task ID is returned (the task is not yet complete and enters a queue for asynchronous execution). The final result is sent through a callback notification. You can also proactively query the task status by calling <a href="https://help.aliyun.com/document_detail/2861326.html">Get task details</a>.</li>
     * <li>Only JPG images are supported.</li>
     * <li>When the snapshot is complete, an event notification of <a href="https://help.aliyun.com/document_detail/57337.html">Video snapshot complete</a> with EventType=SnapshotComplete and SubType=SpecifiedTime is sent.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The QPS limit for a single user on this operation is 30 calls per second. If this limit is exceeded, the API call is throttled, which may affect your business. Call this operation appropriately. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Submits a video snapshot job to start asynchronous snapshot processing.</p>
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
     * <h3>Usage notes</h3>
     * <ul>
     * <li><strong>Before you use this operation, make sure that you fully understand the billing methods and pricing of ApsaraVideo VOD. Transcoding is a paid feature. For more information about billing, see <a href="~~188308#section-ejb-nii-nqa~~">Transcoding billing</a>.</strong></li>
     * <li>This is an <a href="https://help.aliyun.com/document_detail/3027551.html">asynchronous operation</a>. After you submit a task, the task ID is returned. The task is not yet complete at this point and enters a queue for asynchronous execution. The final result is sent through a callback notification. You can also call <a href="https://help.aliyun.com/document_detail/454946.html">GetTranscodeTask</a> to query the task status.</li>
     * <li>Only videos in the <strong>UploadSucc</strong>, <strong>Normal</strong>, or <strong>Checking</strong> state can be transcoded.</li>
     * <li>To obtain transcoding results, configure callback messages: <a href="https://help.aliyun.com/document_detail/55636.html">SingleCompleteEvent</a> and <a href="https://help.aliyun.com/document_detail/55638.html">AllCompleteEvent</a>.</li>
     * <li>This operation supports dynamic replacement of subtitle URLs in HLS adaptive bitrate streaming packaging tasks. If the packaging task does not involve subtitle packaging, do not use this operation to initiate the task. Instead, specify the corresponding transcoding template group ID during video upload to automatically trigger the packaging process.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Submits a media transcoding job to start asynchronous transcoding.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.referenceId)) {
            query.put("ReferenceId", request.referenceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            query.put("SessionId", request.sessionId);
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
     * <h3>Usage notes</h3>
     * <ul>
     * <li><strong>Before you use this operation, make sure that you fully understand the billing methods and pricing of ApsaraVideo VOD. Transcoding is a paid feature. For more information about billing, see <a href="~~188308#section-ejb-nii-nqa~~">Transcoding billing</a>.</strong></li>
     * <li>This is an <a href="https://help.aliyun.com/document_detail/3027551.html">asynchronous operation</a>. After you submit a task, the task ID is returned. The task is not yet complete at this point and enters a queue for asynchronous execution. The final result is sent through a callback notification. You can also call <a href="https://help.aliyun.com/document_detail/454946.html">GetTranscodeTask</a> to query the task status.</li>
     * <li>Only videos in the <strong>UploadSucc</strong>, <strong>Normal</strong>, or <strong>Checking</strong> state can be transcoded.</li>
     * <li>To obtain transcoding results, configure callback messages: <a href="https://help.aliyun.com/document_detail/55636.html">SingleCompleteEvent</a> and <a href="https://help.aliyun.com/document_detail/55638.html">AllCompleteEvent</a>.</li>
     * <li>This operation supports dynamic replacement of subtitle URLs in HLS adaptive bitrate streaming packaging tasks. If the packaging task does not involve subtitle packaging, do not use this operation to initiate the task. Instead, specify the corresponding transcoding template group ID during video upload to automatically trigger the packaging process.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Submits a media transcoding job to start asynchronous transcoding.</p>
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
     * <ul>
     * <li><strong>Before using this operation, make sure that you fully understand the billing methods and pricing of ApsaraVideo VOD. Using workflows may incur fees for transcoding, encryption, automated review, and other services. For more information, see <a href="https://help.aliyun.com/document_detail/188307.html">Billing overview</a>.</strong></li>
     * <li>This operation is an <a href="https://help.aliyun.com/document_detail/3027551.html">asynchronous operation</a>. After you submit a task, a task ID is returned (the task is not yet complete and enters a background queue for asynchronous execution). The final result is sent through a callback notification. You can also call <a href="https://help.aliyun.com/document_detail/2861326.html">GetTask</a> to query the task status.</li>
     * <li>Call this operation to initiate a workflow processing task for a video. For more information about workflows, see <a href="https://help.aliyun.com/document_detail/115347.html">Workflow</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Initiates a VOD workflow for a video.</p>
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
     * <ul>
     * <li><strong>Before using this operation, make sure that you fully understand the billing methods and pricing of ApsaraVideo VOD. Using workflows may incur fees for transcoding, encryption, automated review, and other services. For more information, see <a href="https://help.aliyun.com/document_detail/188307.html">Billing overview</a>.</strong></li>
     * <li>This operation is an <a href="https://help.aliyun.com/document_detail/3027551.html">asynchronous operation</a>. After you submit a task, a task ID is returned (the task is not yet complete and enters a background queue for asynchronous execution). The final result is sent through a callback notification. You can also call <a href="https://help.aliyun.com/document_detail/2861326.html">GetTask</a> to query the task status.</li>
     * <li>Call this operation to initiate a workflow processing task for a video. For more information about workflows, see <a href="https://help.aliyun.com/document_detail/115347.html">Workflow</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Initiates a VOD workflow for a video.</p>
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
     * <ul>
     * <li>Currently, this operation is supported in the following regions: <strong>China (Beijing)</strong>, <strong>China (Shanghai)</strong>, and <strong>Singapore</strong>.</li>
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
     * <ul>
     * <li>Currently, this operation is supported in the following regions: <strong>China (Beijing)</strong>, <strong>China (Shanghai)</strong>, and <strong>Singapore</strong>.</li>
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
     * <p>After an application is created, you can call this operation to locate an application by its application ID and modify the name, description, and status of the application.</p>
     * <h3>QPS limit</h3>
     * <p>The single-user QPS limit for this operation is 30 calls per second. If the limit is exceeded, API calls are throttled, which may affect your business. Call this operation properly. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates application information.</p>
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
     * <p>After an application is created, you can call this operation to locate an application by its application ID and modify the name, description, and status of the application.</p>
     * <h3>QPS limit</h3>
     * <p>The single-user QPS limit for this operation is 30 calls per second. If the limit is exceeded, API calls are throttled, which may affect your business. Call this operation properly. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates application information.</p>
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
     * <p>You can update the information of up to 20 auxiliary media assets at a time.</p>
     * 
     * <b>summary</b> : 
     * <p>Batch updates the information of auxiliary media assets, such as title, description, tags, and category, by specifying the unique identifiers (IDs) of the auxiliary media assets that have been uploaded to ApsaraVideo VOD, including watermarked images, subtitle files, and other materials.</p>
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
     * <p>You can update the information of up to 20 auxiliary media assets at a time.</p>
     * 
     * <b>summary</b> : 
     * <p>Batch updates the information of auxiliary media assets, such as title, description, tags, and category, by specifying the unique identifiers (IDs) of the auxiliary media assets that have been uploaded to ApsaraVideo VOD, including watermarked images, subtitle files, and other materials.</p>
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
     * <p>After a category is created, you can call this operation to modify the name of the category. If the category has been annotated to some media assets, the category name annotated to those media assets is updated synchronously after the category name is modified.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the name of a category.</p>
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
     * <p>After a category is created, you can call this operation to modify the name of the category. If the category has been annotated to some media assets, the category name annotated to those media assets is updated synchronously after the category name is modified.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the name of a category.</p>
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
     * <p>Modifies an online editing project (video editing task).</p>
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
     * <p>Modifies an online editing project (video editing task).</p>
     * 
     * @param request UpdateEditingProjectRequest
     * @return UpdateEditingProjectResponse
     */
    public UpdateEditingProjectResponse updateEditingProject(UpdateEditingProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateEditingProjectWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation only supports modifying uploaded images. Modifying images generated from video snapshots is not supported.</li>
     * <li>You can modify the information of up to 20 images at a time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Batch modifies the title, description, tags, and category information of images by image ID after the images are uploaded to ApsaraVideo VOD.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>This operation only supports modifying uploaded images. Modifying images generated from video snapshots is not supported.</li>
     * <li>You can modify the information of up to 20 images at a time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Batch modifies the title, description, tags, and category information of images by image ID after the images are uploaded to ApsaraVideo VOD.</p>
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
     * <ul>
     * <li>Before using this operation, make sure that you fully understand the billing methods and pricing of ApsaraVideo VOD. Modifying the storage class of a media asset incurs storage fees. For billing details, see <a href="~~188308#section-e97-xrp-mzz~~">Media asset storage billing</a>.</li>
     * <li>Modifying the storage class is an <strong>asynchronous operation</strong>. A callback is sent to you after the entire operation is complete.</li>
     * <li>If the current storage class of a media asset is Archive or ColdArchive, calling this operation automatically triggers a restore. After the restore is complete, the storage class is modified. You do not need to manually call the RestoreMedia operation to restore the media asset. For ColdArchive media assets, you need to specify the restore priority. The default value is RestoreTier=Standard.</li>
     * <li>A media asset that is being modified cannot be modified again or be used for production or processing.</li>
     * <li>Media assets in non-Standard storage classes have minimum storage duration requirements: Infrequent Access/source file Infrequent Access requires at least 30 days. Archive/source file Archive requires at least 60 days. ColdArchive/source file ColdArchive requires at least 180 days. If the storage duration is insufficient, modifying the storage class incurs storage fees for the remaining days. For example, if you modify the storage class from Infrequent Access to Standard after 10 days of storage, you are charged for the remaining 20 days of Infrequent Access storage, totaling 30 days of Infrequent Access storage fees.</li>
     * <li><strong>Modifying the storage class of a self-managed bucket is not supported</strong>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the storage class of a media asset.</p>
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
     * <ul>
     * <li>Before using this operation, make sure that you fully understand the billing methods and pricing of ApsaraVideo VOD. Modifying the storage class of a media asset incurs storage fees. For billing details, see <a href="~~188308#section-e97-xrp-mzz~~">Media asset storage billing</a>.</li>
     * <li>Modifying the storage class is an <strong>asynchronous operation</strong>. A callback is sent to you after the entire operation is complete.</li>
     * <li>If the current storage class of a media asset is Archive or ColdArchive, calling this operation automatically triggers a restore. After the restore is complete, the storage class is modified. You do not need to manually call the RestoreMedia operation to restore the media asset. For ColdArchive media assets, you need to specify the restore priority. The default value is RestoreTier=Standard.</li>
     * <li>A media asset that is being modified cannot be modified again or be used for production or processing.</li>
     * <li>Media assets in non-Standard storage classes have minimum storage duration requirements: Infrequent Access/source file Infrequent Access requires at least 30 days. Archive/source file Archive requires at least 60 days. ColdArchive/source file ColdArchive requires at least 180 days. If the storage duration is insufficient, modifying the storage class incurs storage fees for the remaining days. For example, if you modify the storage class from Infrequent Access to Standard after 10 days of storage, you are charged for the remaining 20 days of Infrequent Access storage, totaling 30 days of Infrequent Access storage fees.</li>
     * <li><strong>Modifying the storage class of a self-managed bucket is not supported</strong>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the storage class of a media asset.</p>
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
     * <p>For security purposes, you cannot add, modify, or delete transcoding template groups that are in the locked state. You can call the <a href="~~GetTranscodeTemplateGroup~~">GetTranscodeTemplateGroup</a> operation to query the template configuration and check whether the template group is locked based on the Locked response parameter. Alternatively, you can call this operation to unlock the template group before you add, modify, or delete templates.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies transcoding configurations. You can modify the configuration of a specified transcoding template in a transcoding template group.</p>
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
     * <p>For security purposes, you cannot add, modify, or delete transcoding template groups that are in the locked state. You can call the <a href="~~GetTranscodeTemplateGroup~~">GetTranscodeTemplateGroup</a> operation to query the template configuration and check whether the template group is locked based on the Locked response parameter. Alternatively, you can call this operation to unlock the template group before you add, modify, or delete templates.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies transcoding configurations. You can modify the configuration of a specified transcoding template in a transcoding template group.</p>
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
     * <h3>Operation description</h3>
     * <p>This operation locates an audio or video file by video ID and supports modifying the title, tags, description, and other information of the file. If a parameter is specified, the corresponding field is updated. Otherwise, the field is not overwritten or updated.</p>
     * <h3>QPS limit</h3>
     * <p>A single user can perform a maximum of 100 queries per second (QPS). Throttling is triggered when the QPS limit is exceeded, which may affect your business. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the information about a single audio or video file.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.referenceId)) {
            query.put("ReferenceId", request.referenceId);
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
     * <h3>Operation description</h3>
     * <p>This operation locates an audio or video file by video ID and supports modifying the title, tags, description, and other information of the file. If a parameter is specified, the corresponding field is updated. Otherwise, the field is not overwritten or updated.</p>
     * <h3>QPS limit</h3>
     * <p>A single user can perform a maximum of 100 queries per second (QPS). Throttling is triggered when the QPS limit is exceeded, which may affect your business. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the information about a single audio or video file.</p>
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
     * <h3>Usage notes</h3>
     * <ul>
     * <li>Audio and video files are identified by their IDs. You can modify the title, tags, and description of audio and video files. If a parameter is specified, the corresponding field is updated. Otherwise, the field is not overwritten or updated.</li>
     * <li>You can modify the information about up to 20 audio and video files at a time.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The single-user QPS limit for this operation is 30 calls per second. If the limit is exceeded, the API call is throttled, which may affect your business. Call this operation properly. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the information about multiple audio and video files at a time.</p>
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
     * <h3>Usage notes</h3>
     * <ul>
     * <li>Audio and video files are identified by their IDs. You can modify the title, tags, and description of audio and video files. If a parameter is specified, the corresponding field is updated. Otherwise, the field is not overwritten or updated.</li>
     * <li>You can modify the information about up to 20 audio and video files at a time.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The single-user QPS limit for this operation is 30 calls per second. If the limit is exceeded, the API call is throttled, which may affect your business. Call this operation properly. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the information about multiple audio and video files at a time.</p>
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
     * <p>Modifies an accelerated domain name.</p>
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
     * <p>Modifies an accelerated domain name.</p>
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
     * <ul>
     * <li>After you invoke <a href="~~AddWatermark~~">AddWatermark</a> to add an image and text watermark template, you can invoke this operation to modify the name and watermark configuration of the template.</li>
     * <li>This operation does not support replacing the image in an image watermark template or modifying the template across templatetypes (such as changing an image watermark template to a text watermark template).</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the name and watermark configuration (WatermarkConfig) of an image and text watermark template that was added by calling the AddWatermark operation.</p>
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
     * <ul>
     * <li>After you invoke <a href="~~AddWatermark~~">AddWatermark</a> to add an image and text watermark template, you can invoke this operation to modify the name and watermark configuration of the template.</li>
     * <li>This operation does not support replacing the image in an image watermark template or modifying the template across templatetypes (such as changing an image watermark template to a text watermark template).</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the name and watermark configuration (WatermarkConfig) of an image and text watermark template that was added by calling the AddWatermark operation.</p>
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
     * <ul>
     * <li><strong>Before using this operation, make sure that you fully understand the billing methods and pricing of ApsaraVideo VOD. Uploading media files to ApsaraVideo VOD incurs storage fees. For billing details, see <a href="~~188308#section_e97_xrp_mzz~~">Media asset storage billing</a>. If you have enabled storage transfer acceleration, uploading media files to ApsaraVideo VOD also incurs upload acceleration fees. For billing details, see <a href="~~188310#section_sta_zm2_tsv~~">Storage transfer acceleration billing</a>.</strong></li>
     * <li>For the media file formats supported by this operation, see <a href="~~55396#section-e27-2rj-mde~~">Media formats</a>.</li>
     * <li>This operation is mainly applicable to scenarios where files are not stored on a local server or terminal and need to be uploaded through a URL with public network access.</li>
     * <li>This operation is an <a href="https://help.aliyun.com/document_detail/3027551.html">asynchronous upload operation</a>. It is not real-time and does not guarantee timeliness. Generally, the migration upload is completed within hours or even days after the node is submitted. If you have high timeliness requirements, use the upload SDK instead.</li>
     * <li>If a callback is configured, you will receive the <a href="https://help.aliyun.com/document_detail/86326.html">URL upload video complete</a> event notification after the upload is completed. You can call the <a href="https://help.aliyun.com/document_detail/106830.html">GetURLUploadInfos</a> operation to query the upload status.</li>
     * <li>After an upload node is submitted, an asynchronous node is generated in the cloud for execute. All URL upload nodes committed by users in the corresponding service region are queued for execute. The completion time is affected by the number of existing nodes. After the upload is completed, you can associate the URL with the video ID based on the information returned in the event notification (message callback).</li>
     * <li>This operation currently supports only the <strong>China (Shanghai)</strong>, <strong>China (Beijing)</strong>, <strong>China (Shenzhen)</strong>, <strong>Singapore</strong>, and <strong>US (Silicon Valley)</strong> regions.</li>
     * <li>Each time you commit an upload node for the same media file URL, a new media resource is generated in ApsaraVideo VOD (that is, a new media ID is generated).</li>
     * <li>If a single file exceeds 20 GB, the upload is failed. If you need to upload a single file larger than 20 GB, use the upload SDK. For more information, see <a href="https://help.aliyun.com/document_detail/52200.html">Overview of the upload SDK</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Pulls audio and video media files for upload based on source file URLs. Batch upload is supported.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.enableFirstFrameCover)) {
            query.put("EnableFirstFrameCover", request.enableFirstFrameCover);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.generateThumbnail)) {
            query.put("GenerateThumbnail", request.generateThumbnail);
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
     * <ul>
     * <li><strong>Before using this operation, make sure that you fully understand the billing methods and pricing of ApsaraVideo VOD. Uploading media files to ApsaraVideo VOD incurs storage fees. For billing details, see <a href="~~188308#section_e97_xrp_mzz~~">Media asset storage billing</a>. If you have enabled storage transfer acceleration, uploading media files to ApsaraVideo VOD also incurs upload acceleration fees. For billing details, see <a href="~~188310#section_sta_zm2_tsv~~">Storage transfer acceleration billing</a>.</strong></li>
     * <li>For the media file formats supported by this operation, see <a href="~~55396#section-e27-2rj-mde~~">Media formats</a>.</li>
     * <li>This operation is mainly applicable to scenarios where files are not stored on a local server or terminal and need to be uploaded through a URL with public network access.</li>
     * <li>This operation is an <a href="https://help.aliyun.com/document_detail/3027551.html">asynchronous upload operation</a>. It is not real-time and does not guarantee timeliness. Generally, the migration upload is completed within hours or even days after the node is submitted. If you have high timeliness requirements, use the upload SDK instead.</li>
     * <li>If a callback is configured, you will receive the <a href="https://help.aliyun.com/document_detail/86326.html">URL upload video complete</a> event notification after the upload is completed. You can call the <a href="https://help.aliyun.com/document_detail/106830.html">GetURLUploadInfos</a> operation to query the upload status.</li>
     * <li>After an upload node is submitted, an asynchronous node is generated in the cloud for execute. All URL upload nodes committed by users in the corresponding service region are queued for execute. The completion time is affected by the number of existing nodes. After the upload is completed, you can associate the URL with the video ID based on the information returned in the event notification (message callback).</li>
     * <li>This operation currently supports only the <strong>China (Shanghai)</strong>, <strong>China (Beijing)</strong>, <strong>China (Shenzhen)</strong>, <strong>Singapore</strong>, and <strong>US (Silicon Valley)</strong> regions.</li>
     * <li>Each time you commit an upload node for the same media file URL, a new media resource is generated in ApsaraVideo VOD (that is, a new media ID is generated).</li>
     * <li>If a single file exceeds 20 GB, the upload is failed. If you need to upload a single file larger than 20 GB, use the upload SDK. For more information, see <a href="https://help.aliyun.com/document_detail/52200.html">Overview of the upload SDK</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Pulls audio and video media files for upload based on source file URLs. Batch upload is supported.</p>
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
     * <ul>
     * <li><strong>Before using this operation, make sure that you fully understand the billing methods and pricing of ApsaraVideo VOD. Uploading media files to ApsaraVideo VOD incurs storage fees. For more information, see <a href="~~188308#section_e97_xrp_mzz~~">Media asset storage billing</a>. If you have enabled storage transmission acceleration, upload acceleration fees also apply. For more information, see <a href="~~188310#section_sta_zm2_tsv~~">Storage transmission acceleration billing</a>.</strong></li>
     * <li>This operation is currently supported only in the <strong>Shanghai</strong> and <strong>Singapore</strong> regions.</li>
     * <li>Call this operation to upload a transcoded stream file from external storage and mount it to the corresponding ApsaraVideo VOD media asset. The supported HDR types for transcoded streams are HDR, HDR10, HLG, DolbyVision, HDRVivid, and SDR+.</li>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/106830.html">GetURLUploadInfos</a> operation to query the upload status. After the upload is complete, you will receive the <a href="https://help.aliyun.com/document_detail/376427.html">URL upload transcoded stream complete</a> event notification.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Uploads a transcoded stream file from external storage and mounts it to the corresponding ApsaraVideo VOD media asset.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.uploadMetadata)) {
            query.put("UploadMetadata", request.uploadMetadata);
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
     * <ul>
     * <li><strong>Before using this operation, make sure that you fully understand the billing methods and pricing of ApsaraVideo VOD. Uploading media files to ApsaraVideo VOD incurs storage fees. For more information, see <a href="~~188308#section_e97_xrp_mzz~~">Media asset storage billing</a>. If you have enabled storage transmission acceleration, upload acceleration fees also apply. For more information, see <a href="~~188310#section_sta_zm2_tsv~~">Storage transmission acceleration billing</a>.</strong></li>
     * <li>This operation is currently supported only in the <strong>Shanghai</strong> and <strong>Singapore</strong> regions.</li>
     * <li>Call this operation to upload a transcoded stream file from external storage and mount it to the corresponding ApsaraVideo VOD media asset. The supported HDR types for transcoded streams are HDR, HDR10, HLG, DolbyVision, HDRVivid, and SDR+.</li>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/106830.html">GetURLUploadInfos</a> operation to query the upload status. After the upload is complete, you will receive the <a href="https://help.aliyun.com/document_detail/376427.html">URL upload transcoded stream complete</a> event notification.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Uploads a transcoded stream file from external storage and mounts it to the corresponding ApsaraVideo VOD media asset.</p>
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
     * <p>Currently, the service is supported only in the <strong>China (Shanghai)</strong> region.</p>
     * 
     * <b>summary</b> : 
     * <p>Calls this operation to verify domain name ownership.</p>
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
     * <p>Currently, the service is supported only in the <strong>China (Shanghai)</strong> region.</p>
     * 
     * <b>summary</b> : 
     * <p>Calls this operation to verify domain name ownership.</p>
     * 
     * @param request VerifyVodDomainOwnerRequest
     * @return VerifyVodDomainOwnerResponse
     */
    public VerifyVodDomainOwnerResponse verifyVodDomainOwner(VerifyVodDomainOwnerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.verifyVodDomainOwnerWithOptions(request, runtime);
    }
}
