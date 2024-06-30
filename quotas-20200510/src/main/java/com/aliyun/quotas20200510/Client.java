// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510;

import com.aliyun.tea.*;
import com.aliyun.quotas20200510.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "central";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("quotas", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>The ID of the alert.</p>
     * 
     * <b>summary</b> : 
     * <p>The value of the quota dimension.
     * The value range of N varies based on the number of dimensions that are supported by the related Alibaba Cloud service.</p>
     * <blockquote>
     * <p>This parameter is required if you set the ProductCode parameter to ecs, ecs-spec, actiontrail, or ess.</p>
     * </blockquote>
     * 
     * @param request CreateQuotaAlarmRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateQuotaAlarmResponse
     */
    public CreateQuotaAlarmResponse createQuotaAlarmWithOptions(CreateQuotaAlarmRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alarmName)) {
            body.put("AlarmName", request.alarmName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            body.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.quotaActionCode)) {
            body.put("QuotaActionCode", request.quotaActionCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.quotaDimensions)) {
            body.put("QuotaDimensions", request.quotaDimensions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.threshold)) {
            body.put("Threshold", request.threshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thresholdPercent)) {
            body.put("ThresholdPercent", request.thresholdPercent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thresholdType)) {
            body.put("ThresholdType", request.thresholdType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.webHook)) {
            body.put("WebHook", request.webHook);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateQuotaAlarm"),
            new TeaPair("version", "2020-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateQuotaAlarmResponse());
    }

    /**
     * <b>description</b> :
     * <p>The ID of the alert.</p>
     * 
     * <b>summary</b> : 
     * <p>The value of the quota dimension.
     * The value range of N varies based on the number of dimensions that are supported by the related Alibaba Cloud service.</p>
     * <blockquote>
     * <p>This parameter is required if you set the ProductCode parameter to ecs, ecs-spec, actiontrail, or ess.</p>
     * </blockquote>
     * 
     * @param request CreateQuotaAlarmRequest
     * @return CreateQuotaAlarmResponse
     */
    public CreateQuotaAlarmResponse createQuotaAlarm(CreateQuotaAlarmRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createQuotaAlarmWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>In this example, the operation is called to submit an application to increase the value of a quota whose ID is <code>q_security-groups</code> and whose name is Maximum Number of Security Groups. The quota belongs to Elastic Compute Service (ECS). The expected value of the quota is <code>804</code>, the application reason is <code>Scale Out</code>, and the ID of the region to which the quota belongs is <code>cn-hangzhou</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Submits an application to increase a quota.</p>
     * 
     * @param request CreateQuotaApplicationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateQuotaApplicationResponse
     */
    public CreateQuotaApplicationResponse createQuotaApplicationWithOptions(CreateQuotaApplicationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.auditMode)) {
            body.put("AuditMode", request.auditMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desireValue)) {
            body.put("DesireValue", request.desireValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dimensions)) {
            body.put("Dimensions", request.dimensions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.effectiveTime)) {
            body.put("EffectiveTime", request.effectiveTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.envLanguage)) {
            body.put("EnvLanguage", request.envLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expireTime)) {
            body.put("ExpireTime", request.expireTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.noticeType)) {
            body.put("NoticeType", request.noticeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            body.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.quotaActionCode)) {
            body.put("QuotaActionCode", request.quotaActionCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.quotaCategory)) {
            body.put("QuotaCategory", request.quotaCategory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reason)) {
            body.put("Reason", request.reason);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateQuotaApplication"),
            new TeaPair("version", "2020-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateQuotaApplicationResponse());
    }

    /**
     * <b>description</b> :
     * <p>In this example, the operation is called to submit an application to increase the value of a quota whose ID is <code>q_security-groups</code> and whose name is Maximum Number of Security Groups. The quota belongs to Elastic Compute Service (ECS). The expected value of the quota is <code>804</code>, the application reason is <code>Scale Out</code>, and the ID of the region to which the quota belongs is <code>cn-hangzhou</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Submits an application to increase a quota.</p>
     * 
     * @param request CreateQuotaApplicationRequest
     * @return CreateQuotaApplicationResponse
     */
    public CreateQuotaApplicationResponse createQuotaApplication(CreateQuotaApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createQuotaApplicationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>QPS limit</h3>
     * <p>You can add a maximum of 10 quota items to a quota template at a time.</p>
     * 
     * <b>summary</b> : 
     * <p>Submits a quota increase application. After you add a quota item to a quota template, the system automatically submits quota applications only for new members in the resource directory. The quota values for existing members remain unchanged. If you want to increase the quota values of existing members, you can submit a quota application for the members by applying quota templates to the members.</p>
     * 
     * @param request CreateQuotaApplicationsForTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateQuotaApplicationsForTemplateResponse
     */
    public CreateQuotaApplicationsForTemplateResponse createQuotaApplicationsForTemplateWithOptions(CreateQuotaApplicationsForTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunUids)) {
            body.put("AliyunUids", request.aliyunUids);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desireValue)) {
            body.put("DesireValue", request.desireValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dimensions)) {
            body.put("Dimensions", request.dimensions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.effectiveTime)) {
            body.put("EffectiveTime", request.effectiveTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.envLanguage)) {
            body.put("EnvLanguage", request.envLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expireTime)) {
            body.put("ExpireTime", request.expireTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.noticeType)) {
            body.put("NoticeType", request.noticeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            body.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.quotaActionCode)) {
            body.put("QuotaActionCode", request.quotaActionCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.quotaCategory)) {
            body.put("QuotaCategory", request.quotaCategory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reason)) {
            body.put("Reason", request.reason);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateQuotaApplicationsForTemplate"),
            new TeaPair("version", "2020-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateQuotaApplicationsForTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>QPS limit</h3>
     * <p>You can add a maximum of 10 quota items to a quota template at a time.</p>
     * 
     * <b>summary</b> : 
     * <p>Submits a quota increase application. After you add a quota item to a quota template, the system automatically submits quota applications only for new members in the resource directory. The quota values for existing members remain unchanged. If you want to increase the quota values of existing members, you can submit a quota application for the members by applying quota templates to the members.</p>
     * 
     * @param request CreateQuotaApplicationsForTemplateRequest
     * @return CreateQuotaApplicationsForTemplateResponse
     */
    public CreateQuotaApplicationsForTemplateResponse createQuotaApplicationsForTemplate(CreateQuotaApplicationsForTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createQuotaApplicationsForTemplateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Prerequisites</h3>
     * <p>You must set the <code>ServiceStatus</code> parameter to <code>1</code>. This ensures that the quota template is enabled.
     * You can call the <a href="https://help.aliyun.com/document_detail/450407.html">GetQuotaTemplateServiceStatus</a> operation to query the status of a quota template. If the <code>ServiceStatus</code> parameter is set to <code>0</code> or <code>-1</code>, you must call the <a href="https://help.aliyun.com/document_detail/450406.html">ModifyQuotaTemplateServiceStatus</a> operation to set the ServiceStatus parameter to <code>1</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a quota template by using the management account of a resource directory. After you create a quota template, if a member is added to the resource directory, the quota template automatically submits a quota increase request for the member. The quota values for existing members remain unchanged. You can use a quota template to apply for increases on multiple quotas at the same time. This automated approach improves the efficiency of quota management across your organization.</p>
     * 
     * @param request CreateTemplateQuotaItemRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTemplateQuotaItemResponse
     */
    public CreateTemplateQuotaItemResponse createTemplateQuotaItemWithOptions(CreateTemplateQuotaItemRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.desireValue)) {
            body.put("DesireValue", request.desireValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dimensions)) {
            body.put("Dimensions", request.dimensions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.effectiveTime)) {
            body.put("EffectiveTime", request.effectiveTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.envLanguage)) {
            body.put("EnvLanguage", request.envLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expireTime)) {
            body.put("ExpireTime", request.expireTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.noticeType)) {
            body.put("NoticeType", request.noticeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            body.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.quotaActionCode)) {
            body.put("QuotaActionCode", request.quotaActionCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.quotaCategory)) {
            body.put("QuotaCategory", request.quotaCategory);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTemplateQuotaItem"),
            new TeaPair("version", "2020-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTemplateQuotaItemResponse());
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Prerequisites</h3>
     * <p>You must set the <code>ServiceStatus</code> parameter to <code>1</code>. This ensures that the quota template is enabled.
     * You can call the <a href="https://help.aliyun.com/document_detail/450407.html">GetQuotaTemplateServiceStatus</a> operation to query the status of a quota template. If the <code>ServiceStatus</code> parameter is set to <code>0</code> or <code>-1</code>, you must call the <a href="https://help.aliyun.com/document_detail/450406.html">ModifyQuotaTemplateServiceStatus</a> operation to set the ServiceStatus parameter to <code>1</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a quota template by using the management account of a resource directory. After you create a quota template, if a member is added to the resource directory, the quota template automatically submits a quota increase request for the member. The quota values for existing members remain unchanged. You can use a quota template to apply for increases on multiple quotas at the same time. This automated approach improves the efficiency of quota management across your organization.</p>
     * 
     * @param request CreateTemplateQuotaItemRequest
     * @return CreateTemplateQuotaItemResponse
     */
    public CreateTemplateQuotaItemResponse createTemplateQuotaItem(CreateTemplateQuotaItemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTemplateQuotaItemWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>In this example, the operation is called to delete a quota alert whose ID is <code>6b512ab7-da3a-4142-b529-2b2a9294****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a quota alert.</p>
     * 
     * @param request DeleteQuotaAlarmRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteQuotaAlarmResponse
     */
    public DeleteQuotaAlarmResponse deleteQuotaAlarmWithOptions(DeleteQuotaAlarmRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alarmId)) {
            body.put("AlarmId", request.alarmId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteQuotaAlarm"),
            new TeaPair("version", "2020-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteQuotaAlarmResponse());
    }

    /**
     * <b>description</b> :
     * <p>In this example, the operation is called to delete a quota alert whose ID is <code>6b512ab7-da3a-4142-b529-2b2a9294****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a quota alert.</p>
     * 
     * @param request DeleteQuotaAlarmRequest
     * @return DeleteQuotaAlarmResponse
     */
    public DeleteQuotaAlarmResponse deleteQuotaAlarm(DeleteQuotaAlarmRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteQuotaAlarmWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a quota template by using the management account of a resource directory. After you delete a quota template, if a member is added to the resource directory, the quota template no longer automatically submits a quota increase request for the member.</p>
     * 
     * @param request DeleteTemplateQuotaItemRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteTemplateQuotaItemResponse
     */
    public DeleteTemplateQuotaItemResponse deleteTemplateQuotaItemWithOptions(DeleteTemplateQuotaItemRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTemplateQuotaItem"),
            new TeaPair("version", "2020-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTemplateQuotaItemResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a quota template by using the management account of a resource directory. After you delete a quota template, if a member is added to the resource directory, the quota template no longer automatically submits a quota increase request for the member.</p>
     * 
     * @param request DeleteTemplateQuotaItemRequest
     * @return DeleteTemplateQuotaItemResponse
     */
    public DeleteTemplateQuotaItemResponse deleteTemplateQuotaItem(DeleteTemplateQuotaItemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteTemplateQuotaItemWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>In this example, the operation is called to query the details of a quota whose ID is <code>q_security-groups</code> and whose name is Maximum Number of Security Groups. This quota belongs to Elastic Compute Service (ECS). The query result shows the details of the quota. The details include the name, ID, description, quota value, used quota, unit, and dimension of the quota. In this example, the quota name is <code>Maximum Number of Security Groups</code>. The quota ID is <code>q_security-groups</code>. The description is <code>The maximum number of security groups that can be created for the current account</code>. The quota value is <code>801</code>. The used quota is <code>26</code>. The quota unit is <code>Number of security groups</code>. The quota dimension is <code>{&quot;regionId&quot;:&quot;cn-hangzhou&quot;}</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of the specified quota.</p>
     * 
     * @param request GetProductQuotaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetProductQuotaResponse
     */
    public GetProductQuotaResponse getProductQuotaWithOptions(GetProductQuotaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dimensions)) {
            body.put("Dimensions", request.dimensions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            body.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.quotaActionCode)) {
            body.put("QuotaActionCode", request.quotaActionCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetProductQuota"),
            new TeaPair("version", "2020-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetProductQuotaResponse());
    }

    /**
     * <b>description</b> :
     * <p>In this example, the operation is called to query the details of a quota whose ID is <code>q_security-groups</code> and whose name is Maximum Number of Security Groups. This quota belongs to Elastic Compute Service (ECS). The query result shows the details of the quota. The details include the name, ID, description, quota value, used quota, unit, and dimension of the quota. In this example, the quota name is <code>Maximum Number of Security Groups</code>. The quota ID is <code>q_security-groups</code>. The description is <code>The maximum number of security groups that can be created for the current account</code>. The quota value is <code>801</code>. The used quota is <code>26</code>. The quota unit is <code>Number of security groups</code>. The quota dimension is <code>{&quot;regionId&quot;:&quot;cn-hangzhou&quot;}</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of the specified quota.</p>
     * 
     * @param request GetProductQuotaRequest
     * @return GetProductQuotaResponse
     */
    public GetProductQuotaResponse getProductQuota(GetProductQuotaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getProductQuotaWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>In this example, the operation is called to query the details of a quota dimension whose key is <code>regionId</code>. The quota dimension belongs to Elastic Compute Service (ECS) Quotas by Instance Type whose service code is ecs-spec. The following query results are returned:</p>
     * <ul>
     * <li>The values of the quota dimension include <code>cn-shenzhen</code>, <code>cn-beijing</code>, and <code>cn-hangzhou</code>.</li>
     * <li>The name of the quota dimension is <code>region</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a quota dimension that is supported by an Alibaba Cloud service.</p>
     * 
     * @param request GetProductQuotaDimensionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetProductQuotaDimensionResponse
     */
    public GetProductQuotaDimensionResponse getProductQuotaDimensionWithOptions(GetProductQuotaDimensionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dependentDimensions)) {
            body.put("DependentDimensions", request.dependentDimensions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dimensionKey)) {
            body.put("DimensionKey", request.dimensionKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            body.put("ProductCode", request.productCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetProductQuotaDimension"),
            new TeaPair("version", "2020-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetProductQuotaDimensionResponse());
    }

    /**
     * <b>description</b> :
     * <p>In this example, the operation is called to query the details of a quota dimension whose key is <code>regionId</code>. The quota dimension belongs to Elastic Compute Service (ECS) Quotas by Instance Type whose service code is ecs-spec. The following query results are returned:</p>
     * <ul>
     * <li>The values of the quota dimension include <code>cn-shenzhen</code>, <code>cn-beijing</code>, and <code>cn-hangzhou</code>.</li>
     * <li>The name of the quota dimension is <code>region</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a quota dimension that is supported by an Alibaba Cloud service.</p>
     * 
     * @param request GetProductQuotaDimensionRequest
     * @return GetProductQuotaDimensionResponse
     */
    public GetProductQuotaDimensionResponse getProductQuotaDimension(GetProductQuotaDimensionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getProductQuotaDimensionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>In this example, the operation is called to query the details of a quota alert whose ID is <code>78d7e436-4b25-4897-84b5-d7b656bb****</code>. The details of the alert are returned. The query result includes the alert ID, alert name, alert contact, and the time when the quota alert was created.</p>
     * 
     * <b>summary</b> : 
     * <p>In this example, the operation is called to query the details of a quota alert. The details of the alert are returned. The query results include the alert ID, alert name, alert contact, and time when the quota alert was created.</p>
     * 
     * @param request GetQuotaAlarmRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetQuotaAlarmResponse
     */
    public GetQuotaAlarmResponse getQuotaAlarmWithOptions(GetQuotaAlarmRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alarmId)) {
            body.put("AlarmId", request.alarmId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetQuotaAlarm"),
            new TeaPair("version", "2020-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetQuotaAlarmResponse());
    }

    /**
     * <b>description</b> :
     * <p>In this example, the operation is called to query the details of a quota alert whose ID is <code>78d7e436-4b25-4897-84b5-d7b656bb****</code>. The details of the alert are returned. The query result includes the alert ID, alert name, alert contact, and the time when the quota alert was created.</p>
     * 
     * <b>summary</b> : 
     * <p>In this example, the operation is called to query the details of a quota alert. The details of the alert are returned. The query results include the alert ID, alert name, alert contact, and time when the quota alert was created.</p>
     * 
     * @param request GetQuotaAlarmRequest
     * @return GetQuotaAlarmResponse
     */
    public GetQuotaAlarmResponse getQuotaAlarm(GetQuotaAlarmRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getQuotaAlarmWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>In this example, the operation is called to query the details about an application whose ID is <code>d314d6ae-867d-484c-9009-3d421a80****</code>. The query result shows the details about the application. The details include the application ID, application time, expected quota value, and application result.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details about a specified application that is submitted to increase a quota.</p>
     * 
     * @param request GetQuotaApplicationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetQuotaApplicationResponse
     */
    public GetQuotaApplicationResponse getQuotaApplicationWithOptions(GetQuotaApplicationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            body.put("ApplicationId", request.applicationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetQuotaApplication"),
            new TeaPair("version", "2020-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetQuotaApplicationResponse());
    }

    /**
     * <b>description</b> :
     * <p>In this example, the operation is called to query the details about an application whose ID is <code>d314d6ae-867d-484c-9009-3d421a80****</code>. The query result shows the details about the application. The details include the application ID, application time, expected quota value, and application result.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details about a specified application that is submitted to increase a quota.</p>
     * 
     * @param request GetQuotaApplicationRequest
     * @return GetQuotaApplicationResponse
     */
    public GetQuotaApplicationResponse getQuotaApplication(GetQuotaApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getQuotaApplicationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Prerequisites</h3>
     * <p>Make sure that you have created an application for quota increase. For more information, see <a href="https://help.aliyun.com/document_detail/440566.html">CreateQuotaApplication</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about quota application approval, such as the average amount of time required for approval, whether approval reminders are supported, and the interval between two consecutive approval reminders.</p>
     * 
     * @param request GetQuotaApplicationApprovalRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetQuotaApplicationApprovalResponse
     */
    public GetQuotaApplicationApprovalResponse getQuotaApplicationApprovalWithOptions(GetQuotaApplicationApprovalRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            body.put("ApplicationId", request.applicationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetQuotaApplicationApproval"),
            new TeaPair("version", "2020-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetQuotaApplicationApprovalResponse());
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Prerequisites</h3>
     * <p>Make sure that you have created an application for quota increase. For more information, see <a href="https://help.aliyun.com/document_detail/440566.html">CreateQuotaApplication</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about quota application approval, such as the average amount of time required for approval, whether approval reminders are supported, and the interval between two consecutive approval reminders.</p>
     * 
     * @param request GetQuotaApplicationApprovalRequest
     * @return GetQuotaApplicationApprovalResponse
     */
    public GetQuotaApplicationApprovalResponse getQuotaApplicationApproval(GetQuotaApplicationApprovalRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getQuotaApplicationApprovalWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the status of a quota template.</p>
     * 
     * @param request GetQuotaTemplateServiceStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetQuotaTemplateServiceStatusResponse
     */
    public GetQuotaTemplateServiceStatusResponse getQuotaTemplateServiceStatusWithOptions(GetQuotaTemplateServiceStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceDirectoryId)) {
            body.put("ResourceDirectoryId", request.resourceDirectoryId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetQuotaTemplateServiceStatus"),
            new TeaPair("version", "2020-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetQuotaTemplateServiceStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the status of a quota template.</p>
     * 
     * @param request GetQuotaTemplateServiceStatusRequest
     * @return GetQuotaTemplateServiceStatusResponse
     */
    public GetQuotaTemplateServiceStatusResponse getQuotaTemplateServiceStatus(GetQuotaTemplateServiceStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getQuotaTemplateServiceStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the alert records.</p>
     * 
     * @param request ListAlarmHistoriesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAlarmHistoriesResponse
     */
    public ListAlarmHistoriesResponse listAlarmHistoriesWithOptions(ListAlarmHistoriesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alarmId)) {
            body.put("AlarmId", request.alarmId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            body.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            body.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAlarmHistories"),
            new TeaPair("version", "2020-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAlarmHistoriesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the alert records.</p>
     * 
     * @param request ListAlarmHistoriesRequest
     * @return ListAlarmHistoriesResponse
     */
    public ListAlarmHistoriesResponse listAlarmHistories(ListAlarmHistoriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAlarmHistoriesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>In this example, the operation is called to query the quotas on which a Container Service for Kubernetes (ACK) quota whose ID is <code>q_i5uzm3</code> depends. This quota is the maximum number of nodes that can be created in an ACK cluster. The query result indicates that the specified quota depends on the following three quotas:</p>
     * <ul>
     * <li>An Elastic Compute Service (ECS) quota whose ID is <code>q_elastic-network-interfaces</code>. This quota is the maximum number of ENIs (Secondary ENIs) that can be owned by an Alibaba Cloud account. The quota is available in the following regions: <code>cn-shenzhen</code>, <code>cn-beijing</code>, and <code>cn-hangzhou</code>.</li>
     * <li>A Server Load Balancer (SLB) quota whose ID is <code>q_fh20b0</code>. This quota is the number of servers that can be attached to the backend of an SLB instance.</li>
     * <li>An SLB quota whose ID is <code>q_3mmbsp</code>. This quota is the number of SLB instances that can be owned by an Alibaba Cloud account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the quotas on which a specified quota depends.</p>
     * 
     * @param request ListDependentQuotasRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDependentQuotasResponse
     */
    public ListDependentQuotasResponse listDependentQuotasWithOptions(ListDependentQuotasRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            body.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.quotaActionCode)) {
            body.put("QuotaActionCode", request.quotaActionCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDependentQuotas"),
            new TeaPair("version", "2020-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDependentQuotasResponse());
    }

    /**
     * <b>description</b> :
     * <p>In this example, the operation is called to query the quotas on which a Container Service for Kubernetes (ACK) quota whose ID is <code>q_i5uzm3</code> depends. This quota is the maximum number of nodes that can be created in an ACK cluster. The query result indicates that the specified quota depends on the following three quotas:</p>
     * <ul>
     * <li>An Elastic Compute Service (ECS) quota whose ID is <code>q_elastic-network-interfaces</code>. This quota is the maximum number of ENIs (Secondary ENIs) that can be owned by an Alibaba Cloud account. The quota is available in the following regions: <code>cn-shenzhen</code>, <code>cn-beijing</code>, and <code>cn-hangzhou</code>.</li>
     * <li>A Server Load Balancer (SLB) quota whose ID is <code>q_fh20b0</code>. This quota is the number of servers that can be attached to the backend of an SLB instance.</li>
     * <li>An SLB quota whose ID is <code>q_3mmbsp</code>. This quota is the number of SLB instances that can be owned by an Alibaba Cloud account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the quotas on which a specified quota depends.</p>
     * 
     * @param request ListDependentQuotasRequest
     * @return ListDependentQuotasResponse
     */
    public ListDependentQuotasResponse listDependentQuotas(ListDependentQuotasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDependentQuotasWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to call the ListProductDimensionGroups operation to query the dimension groups of Object Storage Service (OSS). In this example, a dimension group is returned. The group name is <code>OSS_Group</code>, the group code is <code>oss_wf1ngqmd7q</code>, and the group key is <code>chargeType</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the dimension groups of an Alibaba Cloud service.</p>
     * 
     * @param request ListProductDimensionGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListProductDimensionGroupsResponse
     */
    public ListProductDimensionGroupsResponse listProductDimensionGroupsWithOptions(ListProductDimensionGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProductDimensionGroups"),
            new TeaPair("version", "2020-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProductDimensionGroupsResponse());
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to call the ListProductDimensionGroups operation to query the dimension groups of Object Storage Service (OSS). In this example, a dimension group is returned. The group name is <code>OSS_Group</code>, the group code is <code>oss_wf1ngqmd7q</code>, and the group key is <code>chargeType</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the dimension groups of an Alibaba Cloud service.</p>
     * 
     * @param request ListProductDimensionGroupsRequest
     * @return ListProductDimensionGroupsResponse
     */
    public ListProductDimensionGroupsResponse listProductDimensionGroups(ListProductDimensionGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listProductDimensionGroupsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>In this example, the operation is called to query the quota dimensions that are supported by Elastic Compute Service (ECS). The query results show all the quota dimensions that are supported by ECS.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the quota dimensions that are supported by the specified Alibaba Cloud service.</p>
     * 
     * @param request ListProductQuotaDimensionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListProductQuotaDimensionsResponse
     */
    public ListProductQuotaDimensionsResponse listProductQuotaDimensionsWithOptions(ListProductQuotaDimensionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            body.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.quotaCategory)) {
            body.put("QuotaCategory", request.quotaCategory);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProductQuotaDimensions"),
            new TeaPair("version", "2020-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProductQuotaDimensionsResponse());
    }

    /**
     * <b>description</b> :
     * <p>In this example, the operation is called to query the quota dimensions that are supported by Elastic Compute Service (ECS). The query results show all the quota dimensions that are supported by ECS.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the quota dimensions that are supported by the specified Alibaba Cloud service.</p>
     * 
     * @param request ListProductQuotaDimensionsRequest
     * @return ListProductQuotaDimensionsResponse
     */
    public ListProductQuotaDimensionsResponse listProductQuotaDimensions(ListProductQuotaDimensionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listProductQuotaDimensionsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>In this example, the operation is called to query the quotas whose instance type is <code>ecs.g5.2xlarge</code>. The quotas belong to Elastic Compute Service (ECS) Quotas by Instance Type. The query result includes the name, ID, unit, dimensions, and cycle of each quota.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the quotas of a specific Alibaba Cloud service.</p>
     * 
     * @param request ListProductQuotasRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListProductQuotasResponse
     */
    public ListProductQuotasResponse listProductQuotasWithOptions(ListProductQuotasRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dimensions)) {
            body.put("Dimensions", request.dimensions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupCode)) {
            body.put("GroupCode", request.groupCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyWord)) {
            body.put("KeyWord", request.keyWord);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            body.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.quotaActionCode)) {
            body.put("QuotaActionCode", request.quotaActionCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.quotaCategory)) {
            body.put("QuotaCategory", request.quotaCategory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortField)) {
            body.put("SortField", request.sortField);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortOrder)) {
            body.put("SortOrder", request.sortOrder);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProductQuotas"),
            new TeaPair("version", "2020-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProductQuotasResponse());
    }

    /**
     * <b>description</b> :
     * <p>In this example, the operation is called to query the quotas whose instance type is <code>ecs.g5.2xlarge</code>. The quotas belong to Elastic Compute Service (ECS) Quotas by Instance Type. The query result includes the name, ID, unit, dimensions, and cycle of each quota.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the quotas of a specific Alibaba Cloud service.</p>
     * 
     * @param request ListProductQuotasRequest
     * @return ListProductQuotasResponse
     */
    public ListProductQuotasResponse listProductQuotas(ListProductQuotasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listProductQuotasWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The services in the query result are the same as the services listed in <a href="https://help.aliyun.com/document_detail/182368.html">Alibaba Cloud services that support Quota Center</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the Alibaba Cloud services that support Quota Center.</p>
     * 
     * @param request ListProductsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListProductsResponse
     */
    public ListProductsResponse listProductsWithOptions(ListProductsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProducts"),
            new TeaPair("version", "2020-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProductsResponse());
    }

    /**
     * <b>description</b> :
     * <p>The services in the query result are the same as the services listed in <a href="https://help.aliyun.com/document_detail/182368.html">Alibaba Cloud services that support Quota Center</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the Alibaba Cloud services that support Quota Center.</p>
     * 
     * @param request ListProductsRequest
     * @return ListProductsResponse
     */
    public ListProductsResponse listProducts(ListProductsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listProductsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries quota alerts.</p>
     * 
     * @param request ListQuotaAlarmsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListQuotaAlarmsResponse
     */
    public ListQuotaAlarmsResponse listQuotaAlarmsWithOptions(ListQuotaAlarmsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alarmName)) {
            body.put("AlarmName", request.alarmName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            body.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.quotaActionCode)) {
            body.put("QuotaActionCode", request.quotaActionCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.quotaDimensions)) {
            body.put("QuotaDimensions", request.quotaDimensions);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListQuotaAlarms"),
            new TeaPair("version", "2020-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListQuotaAlarmsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries quota alerts.</p>
     * 
     * @param request ListQuotaAlarmsRequest
     * @return ListQuotaAlarmsResponse
     */
    public ListQuotaAlarmsResponse listQuotaAlarms(ListQuotaAlarmsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listQuotaAlarmsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries quota templates by using the management account of a resource directory.</p>
     * 
     * @param request ListQuotaApplicationTemplatesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListQuotaApplicationTemplatesResponse
     */
    public ListQuotaApplicationTemplatesResponse listQuotaApplicationTemplatesWithOptions(ListQuotaApplicationTemplatesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dimensions)) {
            body.put("Dimensions", request.dimensions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            body.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.quotaActionCode)) {
            body.put("QuotaActionCode", request.quotaActionCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.quotaCategory)) {
            body.put("QuotaCategory", request.quotaCategory);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListQuotaApplicationTemplates"),
            new TeaPair("version", "2020-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListQuotaApplicationTemplatesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries quota templates by using the management account of a resource directory.</p>
     * 
     * @param request ListQuotaApplicationTemplatesRequest
     * @return ListQuotaApplicationTemplatesResponse
     */
    public ListQuotaApplicationTemplatesResponse listQuotaApplicationTemplates(ListQuotaApplicationTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listQuotaApplicationTemplatesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>In this example, the operation is called to query the details of an application that is submitted to increase a quota whose ID is <code>q_i5uzm3</code> and whose name is Maximum Number of Nodes. This quota belongs to Container Service for Kubernetes (ACK). The query result shows the details of the application. The details include the application ID, application time, requested quota, and application result. In this example, the application ID is <code>b926571d-cc09-4711-b547-58a615f0****</code>. The application time is <code>2021-01-15T09:13:53Z</code>. The expected quota value is <code>101</code>. The application result is <code>Agree</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of an application that is submitted to increase a quota.</p>
     * 
     * @param request ListQuotaApplicationsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListQuotaApplicationsResponse
     */
    public ListQuotaApplicationsResponse listQuotaApplicationsWithOptions(ListQuotaApplicationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dimensions)) {
            body.put("Dimensions", request.dimensions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyWord)) {
            body.put("KeyWord", request.keyWord);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            body.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.quotaActionCode)) {
            body.put("QuotaActionCode", request.quotaActionCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.quotaCategory)) {
            body.put("QuotaCategory", request.quotaCategory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListQuotaApplications"),
            new TeaPair("version", "2020-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListQuotaApplicationsResponse());
    }

    /**
     * <b>description</b> :
     * <p>In this example, the operation is called to query the details of an application that is submitted to increase a quota whose ID is <code>q_i5uzm3</code> and whose name is Maximum Number of Nodes. This quota belongs to Container Service for Kubernetes (ACK). The query result shows the details of the application. The details include the application ID, application time, requested quota, and application result. In this example, the application ID is <code>b926571d-cc09-4711-b547-58a615f0****</code>. The application time is <code>2021-01-15T09:13:53Z</code>. The expected quota value is <code>101</code>. The application result is <code>Agree</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of an application that is submitted to increase a quota.</p>
     * 
     * @param request ListQuotaApplicationsRequest
     * @return ListQuotaApplicationsResponse
     */
    public ListQuotaApplicationsResponse listQuotaApplications(ListQuotaApplicationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listQuotaApplicationsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a quota increase application for member accounts in a resource directory.</p>
     * 
     * @param request ListQuotaApplicationsDetailForTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListQuotaApplicationsDetailForTemplateResponse
     */
    public ListQuotaApplicationsDetailForTemplateResponse listQuotaApplicationsDetailForTemplateWithOptions(ListQuotaApplicationsDetailForTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunUid)) {
            body.put("AliyunUid", request.aliyunUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.batchQuotaApplicationId)) {
            body.put("BatchQuotaApplicationId", request.batchQuotaApplicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            body.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.quotaActionCode)) {
            body.put("QuotaActionCode", request.quotaActionCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.quotaCategory)) {
            body.put("QuotaCategory", request.quotaCategory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListQuotaApplicationsDetailForTemplate"),
            new TeaPair("version", "2020-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListQuotaApplicationsDetailForTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a quota increase application for member accounts in a resource directory.</p>
     * 
     * @param request ListQuotaApplicationsDetailForTemplateRequest
     * @return ListQuotaApplicationsDetailForTemplateResponse
     */
    public ListQuotaApplicationsDetailForTemplateResponse listQuotaApplicationsDetailForTemplate(ListQuotaApplicationsDetailForTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listQuotaApplicationsDetailForTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the application records of a quota template that is used to apply for quotas for member accounts.</p>
     * 
     * @param request ListQuotaApplicationsForTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListQuotaApplicationsForTemplateResponse
     */
    public ListQuotaApplicationsForTemplateResponse listQuotaApplicationsForTemplateWithOptions(ListQuotaApplicationsForTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applyEndTime)) {
            body.put("ApplyEndTime", request.applyEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applyStartTime)) {
            body.put("ApplyStartTime", request.applyStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.batchQuotaApplicationId)) {
            body.put("BatchQuotaApplicationId", request.batchQuotaApplicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            body.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.quotaActionCode)) {
            body.put("QuotaActionCode", request.quotaActionCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.quotaCategory)) {
            body.put("QuotaCategory", request.quotaCategory);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListQuotaApplicationsForTemplate"),
            new TeaPair("version", "2020-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListQuotaApplicationsForTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the application records of a quota template that is used to apply for quotas for member accounts.</p>
     * 
     * @param request ListQuotaApplicationsForTemplateRequest
     * @return ListQuotaApplicationsForTemplateResponse
     */
    public ListQuotaApplicationsForTemplateResponse listQuotaApplicationsForTemplate(ListQuotaApplicationsForTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listQuotaApplicationsForTemplateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Prerequisites</h3>
     * <p>A resource directory is enabled. For more information, see <a href="https://help.aliyun.com/document_detail/604185.html">EnableResourceDirectory</a>.</p>
     * <h3><a href="#"></a>Usage notes</h3>
     * <p>If the <code>ServiceStatus</code> parameter is set to <code>0</code> or <code>-1</code>, you can call this operation to set the parameter to <code>1</code>. Then, you can call the <a href="https://help.aliyun.com/document_detail/450615.html">CreateTemplateQuotaItem</a> operation to create a quota template.</p>
     * 
     * <b>summary</b> : 
     * <p>Changes the status of a quota template. By default, the quota template is not configured. If the management account of a resource directory uses a quota template for the first time, you must enable the quota template.</p>
     * 
     * @param request ModifyQuotaTemplateServiceStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyQuotaTemplateServiceStatusResponse
     */
    public ModifyQuotaTemplateServiceStatusResponse modifyQuotaTemplateServiceStatusWithOptions(ModifyQuotaTemplateServiceStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.serviceStatus)) {
            body.put("ServiceStatus", request.serviceStatus);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyQuotaTemplateServiceStatus"),
            new TeaPair("version", "2020-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyQuotaTemplateServiceStatusResponse());
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Prerequisites</h3>
     * <p>A resource directory is enabled. For more information, see <a href="https://help.aliyun.com/document_detail/604185.html">EnableResourceDirectory</a>.</p>
     * <h3><a href="#"></a>Usage notes</h3>
     * <p>If the <code>ServiceStatus</code> parameter is set to <code>0</code> or <code>-1</code>, you can call this operation to set the parameter to <code>1</code>. Then, you can call the <a href="https://help.aliyun.com/document_detail/450615.html">CreateTemplateQuotaItem</a> operation to create a quota template.</p>
     * 
     * <b>summary</b> : 
     * <p>Changes the status of a quota template. By default, the quota template is not configured. If the management account of a resource directory uses a quota template for the first time, you must enable the quota template.</p>
     * 
     * @param request ModifyQuotaTemplateServiceStatusRequest
     * @return ModifyQuotaTemplateServiceStatusResponse
     */
    public ModifyQuotaTemplateServiceStatusResponse modifyQuotaTemplateServiceStatus(ModifyQuotaTemplateServiceStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyQuotaTemplateServiceStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>The ID of the quota template.</p>
     * 
     * @param request ModifyTemplateQuotaItemRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyTemplateQuotaItemResponse
     */
    public ModifyTemplateQuotaItemResponse modifyTemplateQuotaItemWithOptions(ModifyTemplateQuotaItemRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.quotaCategory)) {
            query.put("QuotaCategory", request.quotaCategory);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.desireValue)) {
            body.put("DesireValue", request.desireValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dimensions)) {
            body.put("Dimensions", request.dimensions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.effectiveTime)) {
            body.put("EffectiveTime", request.effectiveTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.envLanguage)) {
            body.put("EnvLanguage", request.envLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expireTime)) {
            body.put("ExpireTime", request.expireTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.noticeType)) {
            body.put("NoticeType", request.noticeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            body.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.quotaActionCode)) {
            body.put("QuotaActionCode", request.quotaActionCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyTemplateQuotaItem"),
            new TeaPair("version", "2020-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyTemplateQuotaItemResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>The ID of the quota template.</p>
     * 
     * @param request ModifyTemplateQuotaItemRequest
     * @return ModifyTemplateQuotaItemResponse
     */
    public ModifyTemplateQuotaItemResponse modifyTemplateQuotaItem(ModifyTemplateQuotaItemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyTemplateQuotaItemWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> You can call this operation to enable the approval reminder feature for quota applications that support this feature. To check whether this feature is supported, you can view the value of <code>SupportReminder</code> in the GetQuotaApplicationApproval operation. If the value of SupportReminder is <code>true</code>, this feature is supported.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Reminds the approver of a quota application to review the application. This operation is applicable to quota applications that support the approval reminding feature.</p>
     * 
     * @param request RemindQuotaApplicationApprovalRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemindQuotaApplicationApprovalResponse
     */
    public RemindQuotaApplicationApprovalResponse remindQuotaApplicationApprovalWithOptions(RemindQuotaApplicationApprovalRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            body.put("ApplicationId", request.applicationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemindQuotaApplicationApproval"),
            new TeaPair("version", "2020-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemindQuotaApplicationApprovalResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> You can call this operation to enable the approval reminder feature for quota applications that support this feature. To check whether this feature is supported, you can view the value of <code>SupportReminder</code> in the GetQuotaApplicationApproval operation. If the value of SupportReminder is <code>true</code>, this feature is supported.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Reminds the approver of a quota application to review the application. This operation is applicable to quota applications that support the approval reminding feature.</p>
     * 
     * @param request RemindQuotaApplicationApprovalRequest
     * @return RemindQuotaApplicationApprovalResponse
     */
    public RemindQuotaApplicationApprovalResponse remindQuotaApplicationApproval(RemindQuotaApplicationApprovalRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.remindQuotaApplicationApprovalWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>In this example, the operation is called to modify the information about a quota alert whose ID is <code>a2efa7fc-832f-47bb-8054-39e28012****</code> and whose name is <code>rules</code>. The alert threshold is changed from <code>150</code> to <code>160</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies a quota alert rule.</p>
     * 
     * @param request UpdateQuotaAlarmRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateQuotaAlarmResponse
     */
    public UpdateQuotaAlarmResponse updateQuotaAlarmWithOptions(UpdateQuotaAlarmRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alarmId)) {
            body.put("AlarmId", request.alarmId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alarmName)) {
            body.put("AlarmName", request.alarmName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.threshold)) {
            body.put("Threshold", request.threshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thresholdPercent)) {
            body.put("ThresholdPercent", request.thresholdPercent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thresholdType)) {
            body.put("ThresholdType", request.thresholdType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.webHook)) {
            body.put("WebHook", request.webHook);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateQuotaAlarm"),
            new TeaPair("version", "2020-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateQuotaAlarmResponse());
    }

    /**
     * <b>description</b> :
     * <p>In this example, the operation is called to modify the information about a quota alert whose ID is <code>a2efa7fc-832f-47bb-8054-39e28012****</code> and whose name is <code>rules</code>. The alert threshold is changed from <code>150</code> to <code>160</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies a quota alert rule.</p>
     * 
     * @param request UpdateQuotaAlarmRequest
     * @return UpdateQuotaAlarmResponse
     */
    public UpdateQuotaAlarmResponse updateQuotaAlarm(UpdateQuotaAlarmRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateQuotaAlarmWithOptions(request, runtime);
    }
}
