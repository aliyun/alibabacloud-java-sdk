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
     * <p>The quota alerting feature has been upgraded and this API operation will be deprecated. Use the CloudMonitor API operations <a href="https://help.aliyun.com/document_detail/2513316.html">PutResourceMetricRules</a> and <a href="https://help.aliyun.com/document_detail/2513302.html">PutMetricRuleTargets</a> to create alert rules for the new version of quota alerting.
     * For more information about how to use API operations to manage the new version of quota alerting, see <a href="https://help.aliyun.com/document_detail/2863234.html">Manage new quota alerts by using API operations</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an alert rule for a quota item.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.originalContext)) {
            body.put("OriginalContext", request.originalContext);
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
     * <p>The quota alerting feature has been upgraded and this API operation will be deprecated. Use the CloudMonitor API operations <a href="https://help.aliyun.com/document_detail/2513316.html">PutResourceMetricRules</a> and <a href="https://help.aliyun.com/document_detail/2513302.html">PutMetricRuleTargets</a> to create alert rules for the new version of quota alerting.
     * For more information about how to use API operations to manage the new version of quota alerting, see <a href="https://help.aliyun.com/document_detail/2863234.html">Manage new quota alerts by using API operations</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an alert rule for a quota item.</p>
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
     * <blockquote>
     * <p>After you create a quota increase request, you can call the <a href="https://help.aliyun.com/document_detail/440568.html">ListQuotaApplications</a> operation to view the approval result. If the value of <code>Status</code> is <code>Agree</code>, the request is approved.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates a quota increase request.</p>
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
     * <blockquote>
     * <p>After you create a quota increase request, you can call the <a href="https://help.aliyun.com/document_detail/440568.html">ListQuotaApplications</a> operation to view the approval result. If the value of <code>Status</code> is <code>Agree</code>, the request is approved.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates a quota increase request.</p>
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
     * <h3>Limits</h3>
     * <p>A single application can include a maximum of 10 quota items.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates batch quota increase applications for members in a resource folder. When you add a quota item to a quota template, only new members in the resource folder autocommit quota increase applications, and existing members remain unchanged. To increase quotas for existing members by using a quota template, you can select the quota template to commit batch quota increase applications for multiple members in the resource folder. Only the administrator account of the resource folder can create batch quota applications.</p>
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
     * <h3>Limits</h3>
     * <p>A single application can include a maximum of 10 quota items.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates batch quota increase applications for members in a resource folder. When you add a quota item to a quota template, only new members in the resource folder autocommit quota increase applications, and existing members remain unchanged. To increase quotas for existing members by using a quota template, you can select the quota template to commit batch quota increase applications for multiple members in the resource folder. Only the administrator account of the resource folder can create batch quota applications.</p>
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
     * <h3>Before you begin</h3>
     * <p>Make sure that the status of the quota template is enabled (that is, <code>ServiceStatus</code> is <code>1</code>).
     * Call the <a href="https://help.aliyun.com/document_detail/450407.html">GetQuotaTemplateServiceStatus</a> operation to query the status of the quota template. If the <code>ServiceStatus</code> of the quota template is <code>0</code> (not configured) or <code>-1</code> (disabled), call the <a href="https://help.aliyun.com/document_detail/450406.html">ModifyQuotaTemplateServiceStatus</a> operation to change the status to <code>1</code> (enabled).</p>
     * <h3>Usage notes</h3>
     * <p>After you create a quota template, you can call the <a href="https://help.aliyun.com/document_detail/2584864.html">ListQuotaApplicationsForTemplate</a> operation to view the approval result. If <code>Status</code> is displayed as <code>Agree</code>, the application is approved.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a quota template. After the management account creates a quota template, the template automatically submits quota increase applications for new members added to the resource directory. Existing members remain unaffected. You can use a quota template to apply for increases to multiple quota items at a time, improving the efficiency and automation of quota management across the organization. Only the management account of a resource directory can create a quota template.</p>
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
     * <h3>Before you begin</h3>
     * <p>Make sure that the status of the quota template is enabled (that is, <code>ServiceStatus</code> is <code>1</code>).
     * Call the <a href="https://help.aliyun.com/document_detail/450407.html">GetQuotaTemplateServiceStatus</a> operation to query the status of the quota template. If the <code>ServiceStatus</code> of the quota template is <code>0</code> (not configured) or <code>-1</code> (disabled), call the <a href="https://help.aliyun.com/document_detail/450406.html">ModifyQuotaTemplateServiceStatus</a> operation to change the status to <code>1</code> (enabled).</p>
     * <h3>Usage notes</h3>
     * <p>After you create a quota template, you can call the <a href="https://help.aliyun.com/document_detail/2584864.html">ListQuotaApplicationsForTemplate</a> operation to view the approval result. If <code>Status</code> is displayed as <code>Agree</code>, the application is approved.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a quota template. After the management account creates a quota template, the template automatically submits quota increase applications for new members added to the resource directory. Existing members remain unaffected. You can use a quota template to apply for increases to multiple quota items at a time, improving the efficiency and automation of quota management across the organization. Only the management account of a resource directory can create a quota template.</p>
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
     * <p>The quota alerting feature has been upgraded, and this API operation will be deprecated soon. This API operation can only delete legacy quota usage alerts. To delete new-version quota usage alerts, use the CloudMonitor API operations <a href="https://help.aliyun.com/document_detail/2513295.html">DeleteMetricRules</a> and <a href="https://help.aliyun.com/document_detail/2513294.html">DeleteMetricRuleTargets</a>.
     * For more information about managing new-version quota alerts by using API operations, see <a href="https://help.aliyun.com/document_detail/2863234.html">Manage new-version quota alerts by using API operations</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a quota usage alert.</p>
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
     * <p>The quota alerting feature has been upgraded, and this API operation will be deprecated soon. This API operation can only delete legacy quota usage alerts. To delete new-version quota usage alerts, use the CloudMonitor API operations <a href="https://help.aliyun.com/document_detail/2513295.html">DeleteMetricRules</a> and <a href="https://help.aliyun.com/document_detail/2513294.html">DeleteMetricRuleTargets</a>.
     * For more information about managing new-version quota alerts by using API operations, see <a href="https://help.aliyun.com/document_detail/2863234.html">Manage new-version quota alerts by using API operations</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a quota usage alert.</p>
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
     * <p>Deletes a quota template. After the management account deletes a quota template, the template no longer automatically submits quota increase requests for new members added to the resource directory. Only the management account of the resource directory can delete quota templates.</p>
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
     * <p>Deletes a quota template. After the management account deletes a quota template, the template no longer automatically submits quota increase requests for new members added to the resource directory. Only the management account of the resource directory can delete quota templates.</p>
     * 
     * @param request DeleteTemplateQuotaItemRequest
     * @return DeleteTemplateQuotaItemResponse
     */
    public DeleteTemplateQuotaItemResponse deleteTemplateQuotaItem(DeleteTemplateQuotaItemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteTemplateQuotaItemWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the quota details of a specified cloud service.</p>
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
     * <b>summary</b> : 
     * <p>Queries the quota details of a specified cloud service.</p>
     * 
     * @param request GetProductQuotaRequest
     * @return GetProductQuotaResponse
     */
    public GetProductQuotaResponse getProductQuota(GetProductQuotaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getProductQuotaWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of the quota dimensions supported by the target cloud service.</p>
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
     * <b>summary</b> : 
     * <p>Queries the details of the quota dimensions supported by the target cloud service.</p>
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
     * <p>The quota alert feature has been upgraded. This API operation will be deprecated soon. This API operation can only query the details of legacy quota usage alerts. To query the details of new-version quota usage alerts, use the CloudMonitor API operation <a href="https://help.aliyun.com/document_detail/2513291.html">DescribeMetricRuleList</a>. For more information about how to use API operations to manage new-version quota alerts, see <a href="https://help.aliyun.com/document_detail/2863234.html">Use API operations to manage new-version quota alerts</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a specified quota alert.</p>
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
     * <p>The quota alert feature has been upgraded. This API operation will be deprecated soon. This API operation can only query the details of legacy quota usage alerts. To query the details of new-version quota usage alerts, use the CloudMonitor API operation <a href="https://help.aliyun.com/document_detail/2513291.html">DescribeMetricRuleList</a>. For more information about how to use API operations to manage new-version quota alerts, see <a href="https://help.aliyun.com/document_detail/2863234.html">Use API operations to manage new-version quota alerts</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a specified quota alert.</p>
     * 
     * @param request GetQuotaAlarmRequest
     * @return GetQuotaAlarmResponse
     */
    public GetQuotaAlarmResponse getQuotaAlarm(GetQuotaAlarmRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getQuotaAlarmWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a quota increase application.</p>
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
     * <b>summary</b> : 
     * <p>Queries the details of a quota increase application.</p>
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
     * <h3>Before you begin</h3>
     * <p>Make sure that you have created a quota increase application. For more information, see <a href="https://help.aliyun.com/document_detail/440566.html">CreateQuotaApplication</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the approval information of a quota application, including the average approval time, whether approval reminders are supported, and the approval reminder interval.</p>
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
     * <h3>Before you begin</h3>
     * <p>Make sure that you have created a quota increase application. For more information, see <a href="https://help.aliyun.com/document_detail/440566.html">CreateQuotaApplication</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the approval information of a quota application, including the average approval time, whether approval reminders are supported, and the approval reminder interval.</p>
     * 
     * @param request GetQuotaApplicationApprovalRequest
     * @return GetQuotaApplicationApprovalResponse
     */
    public GetQuotaApplicationApprovalResponse getQuotaApplicationApproval(GetQuotaApplicationApprovalRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getQuotaApplicationApprovalWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The default status of a quota template is unset (that is, <code>ServiceStatus</code> is <code>0</code>). You can use the features of the quota template only when its status is enabled (that is, <code>ServiceStatus</code> is <code>1</code>).</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the status of the quota template.</p>
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
     * <b>description</b> :
     * <p>The default status of a quota template is unset (that is, <code>ServiceStatus</code> is <code>0</code>). You can use the features of the quota template only when its status is enabled (that is, <code>ServiceStatus</code> is <code>1</code>).</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the status of the quota template.</p>
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
     * <p>获取配额使用率概览</p>
     * 
     * @param request GetQuotaUtilizationOverviewRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetQuotaUtilizationOverviewResponse
     */
    public GetQuotaUtilizationOverviewResponse getQuotaUtilizationOverviewWithOptions(GetQuotaUtilizationOverviewRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.quotaCategory)) {
            body.put("QuotaCategory", request.quotaCategory);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetQuotaUtilizationOverview"),
            new TeaPair("version", "2020-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetQuotaUtilizationOverviewResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取配额使用率概览</p>
     * 
     * @param request GetQuotaUtilizationOverviewRequest
     * @return GetQuotaUtilizationOverviewResponse
     */
    public GetQuotaUtilizationOverviewResponse getQuotaUtilizationOverview(GetQuotaUtilizationOverviewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getQuotaUtilizationOverviewWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The quota alert feature has been upgraded and this API operation will be deprecated. This API operation can only query the history of legacy quota usage alerts. To query the history of new quota usage alerts, use the CloudMonitor API operations <a href="https://help.aliyun.com/document_detail/2513275.html">DescribeAlertLogCount</a> and <a href="https://help.aliyun.com/document_detail/2513276.html">DescribeAlertLogList</a>. For more information about how to use API operations to manage new quota alerts, see <a href="https://help.aliyun.com/document_detail/2863234.html">Use API operations to manage new quota alerts</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the history of quota alerts.</p>
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
     * <b>description</b> :
     * <p>The quota alert feature has been upgraded and this API operation will be deprecated. This API operation can only query the history of legacy quota usage alerts. To query the history of new quota usage alerts, use the CloudMonitor API operations <a href="https://help.aliyun.com/document_detail/2513275.html">DescribeAlertLogCount</a> and <a href="https://help.aliyun.com/document_detail/2513276.html">DescribeAlertLogList</a>. For more information about how to use API operations to manage new quota alerts, see <a href="https://help.aliyun.com/document_detail/2863234.html">Use API operations to manage new quota alerts</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the history of quota alerts.</p>
     * 
     * @param request ListAlarmHistoriesRequest
     * @return ListAlarmHistoriesResponse
     */
    public ListAlarmHistoriesResponse listAlarmHistories(ListAlarmHistoriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAlarmHistoriesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of quotas associated with a specific quota. Some quotas are interdependent and should be increased simultaneously.</p>
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
     * <b>summary</b> : 
     * <p>Queries the list of quotas associated with a specific quota. Some quotas are interdependent and should be increased simultaneously.</p>
     * 
     * @param request ListDependentQuotasRequest
     * @return ListDependentQuotasResponse
     */
    public ListDependentQuotasResponse listDependentQuotas(ListDependentQuotasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDependentQuotasWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>This operation queries the dimension groups of a specified Alibaba Cloud service.</p>
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
     * <b>summary</b> : 
     * <p>This operation queries the dimension groups of a specified Alibaba Cloud service.</p>
     * 
     * @param request ListProductDimensionGroupsRequest
     * @return ListProductDimensionGroupsResponse
     */
    public ListProductDimensionGroupsResponse listProductDimensionGroups(ListProductDimensionGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listProductDimensionGroupsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the quota dimensions supported by the specified cloud service.</p>
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
     * <b>summary</b> : 
     * <p>Queries the quota dimensions supported by the specified cloud service.</p>
     * 
     * @param request ListProductQuotaDimensionsRequest
     * @return ListProductQuotaDimensionsResponse
     */
    public ListProductQuotaDimensionsResponse listProductQuotaDimensions(ListProductQuotaDimensionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listProductQuotaDimensionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the quotas of a specified cloud service.</p>
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
     * <b>summary</b> : 
     * <p>Queries the quotas of a specified cloud service.</p>
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
     * <p>The query results are the same as those in <a href="https://help.aliyun.com/document_detail/182368.html">Alibaba Cloud services supported by Quota Center</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of Alibaba Cloud services supported by Quota Center.</p>
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
     * <p>The query results are the same as those in <a href="https://help.aliyun.com/document_detail/182368.html">Alibaba Cloud services supported by Quota Center</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of Alibaba Cloud services supported by Quota Center.</p>
     * 
     * @param request ListProductsRequest
     * @return ListProductsResponse
     */
    public ListProductsResponse listProducts(ListProductsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listProductsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The quota alert feature has been upgraded. This API operation is scheduled for deprecation and queries only earlier-version quota usage alerts. To query new-version quota usage alerts, call the CloudMonitor API operation <a href="https://help.aliyun.com/document_detail/2513291.html">DescribeMetricRuleList</a>. For more information about how to manage new-version quota alerts using API operations, see <a href="https://help.aliyun.com/document_detail/2863234.html">Use API operations to manage new-version quota alerts</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries quota usage alerts.</p>
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
     * <b>description</b> :
     * <p>The quota alert feature has been upgraded. This API operation is scheduled for deprecation and queries only earlier-version quota usage alerts. To query new-version quota usage alerts, call the CloudMonitor API operation <a href="https://help.aliyun.com/document_detail/2513291.html">DescribeMetricRuleList</a>. For more information about how to manage new-version quota alerts using API operations, see <a href="https://help.aliyun.com/document_detail/2863234.html">Use API operations to manage new-version quota alerts</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries quota usage alerts.</p>
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
     * <b>summary</b> : 
     * <p>Queries the list of quota increase applications.</p>
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
     * <b>summary</b> : 
     * <p>Queries the list of quota increase applications.</p>
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
     * <p>Queries the details of quota increase applications for a member in a resource directory.</p>
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
     * <p>Queries the details of quota increase applications for a member in a resource directory.</p>
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
     * <p>Queries the history of batch requests for member quotas submitted using a quota template.</p>
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
     * <p>Queries the history of batch requests for member quotas submitted using a quota template.</p>
     * 
     * @param request ListQuotaApplicationsForTemplateRequest
     * @return ListQuotaApplicationsForTemplateResponse
     */
    public ListQuotaApplicationsForTemplateResponse listQuotaApplicationsForTemplate(ListQuotaApplicationsForTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listQuotaApplicationsForTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列举配额使用率报告</p>
     * 
     * @param request ListQuotaUtilizationReportRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListQuotaUtilizationReportResponse
     */
    public ListQuotaUtilizationReportResponse listQuotaUtilizationReportWithOptions(ListQuotaUtilizationReportRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.adjustable)) {
            body.put("Adjustable", request.adjustable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyWords)) {
            body.put("KeyWords", request.keyWords);
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

        if (!com.aliyun.teautil.Common.isUnset(request.quotaCategory)) {
            body.put("QuotaCategory", request.quotaCategory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.quotaRegionId)) {
            body.put("QuotaRegionId", request.quotaRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.utilizationStatuses)) {
            body.put("UtilizationStatuses", request.utilizationStatuses);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListQuotaUtilizationReport"),
            new TeaPair("version", "2020-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListQuotaUtilizationReportResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列举配额使用率报告</p>
     * 
     * @param request ListQuotaUtilizationReportRequest
     * @return ListQuotaUtilizationReportResponse
     */
    public ListQuotaUtilizationReportResponse listQuotaUtilizationReport(ListQuotaUtilizationReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listQuotaUtilizationReportWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Prerequisites</h3>
     * <p>A resource directory is enabled. For more information, see <a href="https://help.aliyun.com/document_detail/604185.html">EnableResourceDirectory</a>.</p>
     * <h3><a href="#"></a>Usage notes</h3>
     * <p>If the <code>ServiceStatus</code> parameter is set to <code>0</code> or <code>-1</code>, you can call this operation to set the parameter to <code>1</code>. Then, you can call the <a href="https://help.aliyun.com/document_detail/450615.html">CreateTemplateQuotaItem</a> operation to create a quota template.</p>
     * 
     * <b>summary</b> : 
     * <p>Changes the status of a quota template. By default, the quota template is not configured. If the management account of a resource directory uses a quota template for the first time, you must enable the quota template. Only the management account of a resource directory can change the status of quota templates.</p>
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
     * <p>Changes the status of a quota template. By default, the quota template is not configured. If the management account of a resource directory uses a quota template for the first time, you must enable the quota template. Only the management account of a resource directory can change the status of quota templates.</p>
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
     * <p>Only the administrator account of a resource directory can modify a quota template. Modifications to a quota template apply only to new members that are added to the resource directory and do not affect existing members.</p>
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
     * <p>Only the administrator account of a resource directory can modify a quota template. Modifications to a quota template apply only to new members that are added to the resource directory and do not affect existing members.</p>
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
     * <p>This operation applies only to quota applications that support reminders. In the GetQuotaApplicationApproval response, the <code>SupportReminder</code> parameter for these applications is <code>true</code>.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Sends a reminder for a quota application that is pending approval.</p>
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
     * <p>This operation applies only to quota applications that support reminders. In the GetQuotaApplicationApproval response, the <code>SupportReminder</code> parameter for these applications is <code>true</code>.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Sends a reminder for a quota application that is pending approval.</p>
     * 
     * @param request RemindQuotaApplicationApprovalRequest
     * @return RemindQuotaApplicationApprovalResponse
     */
    public RemindQuotaApplicationApprovalResponse remindQuotaApplicationApproval(RemindQuotaApplicationApprovalRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.remindQuotaApplicationApprovalWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>发起配额使用率报告查询</p>
     * 
     * @param request StartQuotaUtilizationReportRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartQuotaUtilizationReportResponse
     */
    public StartQuotaUtilizationReportResponse startQuotaUtilizationReportWithOptions(StartQuotaUtilizationReportRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartQuotaUtilizationReport"),
            new TeaPair("version", "2020-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartQuotaUtilizationReportResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>发起配额使用率报告查询</p>
     * 
     * @param request StartQuotaUtilizationReportRequest
     * @return StartQuotaUtilizationReportResponse
     */
    public StartQuotaUtilizationReportResponse startQuotaUtilizationReport(StartQuotaUtilizationReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startQuotaUtilizationReportWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API operation is deprecated because the quota alert feature has been upgraded. To modify information about new quota usage alerts, use the CloudMonitor API operations <a href="https://help.aliyun.com/document_detail/2513316.html">PutResourceMetricRules</a> and <a href="https://help.aliyun.com/document_detail/2513302.html">PutMetricRuleTargets</a>. For more information about using API operations to manage new quota alerts, see <a href="https://help.aliyun.com/document_detail/2863234.html">Use API operations to manage new quota alerts</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies quota alert information.</p>
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
     * <p>This API operation is deprecated because the quota alert feature has been upgraded. To modify information about new quota usage alerts, use the CloudMonitor API operations <a href="https://help.aliyun.com/document_detail/2513316.html">PutResourceMetricRules</a> and <a href="https://help.aliyun.com/document_detail/2513302.html">PutMetricRuleTargets</a>. For more information about using API operations to manage new quota alerts, see <a href="https://help.aliyun.com/document_detail/2863234.html">Use API operations to manage new quota alerts</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies quota alert information.</p>
     * 
     * @param request UpdateQuotaAlarmRequest
     * @return UpdateQuotaAlarmResponse
     */
    public UpdateQuotaAlarmResponse updateQuotaAlarm(UpdateQuotaAlarmRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateQuotaAlarmWithOptions(request, runtime);
    }
}
