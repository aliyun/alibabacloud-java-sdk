// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226;

import com.aliyun.tea.*;
import com.aliyun.outboundbot20191226.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("outboundbot", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <b>summary</b> : 
     * <p>创建外呼任务</p>
     * 
     * @param request AssignJobsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AssignJobsResponse
     */
    public AssignJobsResponse assignJobsWithOptions(AssignJobsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callingNumber)) {
            query.put("CallingNumber", request.callingNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isAsynchrony)) {
            query.put("IsAsynchrony", request.isAsynchrony);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobDataParsingTaskId)) {
            query.put("JobDataParsingTaskId", request.jobDataParsingTaskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobGroupId)) {
            query.put("JobGroupId", request.jobGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobsJson)) {
            query.put("JobsJson", request.jobsJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rosterType)) {
            query.put("RosterType", request.rosterType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strategyJson)) {
            query.put("StrategyJson", request.strategyJson);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AssignJobs"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AssignJobsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建外呼任务</p>
     * 
     * @param request AssignJobsRequest
     * @return AssignJobsResponse
     */
    public AssignJobsResponse assignJobs(AssignJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.assignJobsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>异步创建外呼任务</p>
     * 
     * @param tmpReq AssignJobsAsyncRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AssignJobsAsyncResponse
     */
    public AssignJobsAsyncResponse assignJobsAsyncWithOptions(AssignJobsAsyncRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AssignJobsAsyncShrinkRequest request = new AssignJobsAsyncShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.callingNumber)) {
            request.callingNumberShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.callingNumber, "CallingNumber", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.jobsJson)) {
            request.jobsJsonShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.jobsJson, "JobsJson", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callingNumberShrink)) {
            body.put("CallingNumber", request.callingNumberShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobGroupId)) {
            body.put("JobGroupId", request.jobGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobsJsonShrink)) {
            body.put("JobsJson", request.jobsJsonShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strategyJson)) {
            body.put("StrategyJson", request.strategyJson);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AssignJobsAsync"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AssignJobsAsyncResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>异步创建外呼任务</p>
     * 
     * @param request AssignJobsAsyncRequest
     * @return AssignJobsAsyncResponse
     */
    public AssignJobsAsyncResponse assignJobsAsync(AssignJobsAsyncRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.assignJobsAsyncWithOptions(request, runtime);
    }

    /**
     * @param request CancelJobsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelJobsResponse
     */
    public CancelJobsResponse cancelJobsWithOptions(CancelJobsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.all)) {
            query.put("All", request.all);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobGroupId)) {
            query.put("JobGroupId", request.jobGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobReferenceId)) {
            query.put("JobReferenceId", request.jobReferenceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scenarioId)) {
            query.put("ScenarioId", request.scenarioId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelJobs"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelJobsResponse());
    }

    /**
     * @param request CancelJobsRequest
     * @return CancelJobsResponse
     */
    public CancelJobsResponse cancelJobs(CancelJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelJobsWithOptions(request, runtime);
    }

    /**
     * @param request ChangeResourceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChangeResourceGroupResponse
     */
    public ChangeResourceGroupResponse changeResourceGroupWithOptions(ChangeResourceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.newResourceGroupId)) {
            query.put("NewResourceGroupId", request.newResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChangeResourceGroup"),
            new TeaPair("version", "2019-12-26"),
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
     * @param request ChangeResourceGroupRequest
     * @return ChangeResourceGroupResponse
     */
    public ChangeResourceGroupResponse changeResourceGroup(ChangeResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.changeResourceGroupWithOptions(request, runtime);
    }

    /**
     * @param request CreateAgentProfileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAgentProfileResponse
     */
    public CreateAgentProfileResponse createAgentProfileWithOptions(CreateAgentProfileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentProfileTemplateId)) {
            body.put("AgentProfileTemplateId", request.agentProfileTemplateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appIp)) {
            body.put("AppIp", request.appIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.faqCategoryIds)) {
            body.put("FaqCategoryIds", request.faqCategoryIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instructionJson)) {
            body.put("InstructionJson", request.instructionJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labelsJson)) {
            body.put("LabelsJson", request.labelsJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.model)) {
            body.put("Model", request.model);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelConfig)) {
            body.put("ModelConfig", request.modelConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prompt)) {
            body.put("Prompt", request.prompt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promptJson)) {
            body.put("PromptJson", request.promptJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scenario)) {
            body.put("Scenario", request.scenario);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptId)) {
            body.put("ScriptId", request.scriptId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.variablesJson)) {
            body.put("VariablesJson", request.variablesJson);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAgentProfile"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAgentProfileResponse());
    }

    /**
     * @param request CreateAgentProfileRequest
     * @return CreateAgentProfileResponse
     */
    public CreateAgentProfileResponse createAgentProfile(CreateAgentProfileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAgentProfileWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建标注任务</p>
     * 
     * @param tmpReq CreateAnnotationMissionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAnnotationMissionResponse
     */
    public CreateAnnotationMissionResponse createAnnotationMissionWithOptions(CreateAnnotationMissionRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateAnnotationMissionShrinkRequest request = new CreateAnnotationMissionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.annotationMissionDebugDataSourceList)) {
            request.annotationMissionDebugDataSourceListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.annotationMissionDebugDataSourceList, "AnnotationMissionDebugDataSourceList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentId)) {
            query.put("AgentId", request.agentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.annotationMissionDataSourceType)) {
            query.put("AnnotationMissionDataSourceType", request.annotationMissionDataSourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.annotationMissionDebugDataSourceListShrink)) {
            query.put("AnnotationMissionDebugDataSourceList", request.annotationMissionDebugDataSourceListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.annotationMissionDebugDataSourceListJsonString)) {
            query.put("AnnotationMissionDebugDataSourceListJsonString", request.annotationMissionDebugDataSourceListJsonString);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.annotationMissionName)) {
            query.put("AnnotationMissionName", request.annotationMissionName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chatbotId)) {
            query.put("ChatbotId", request.chatbotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.conversationTimeEndFilter)) {
            query.put("ConversationTimeEndFilter", request.conversationTimeEndFilter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.conversationTimeStartFilter)) {
            query.put("ConversationTimeStartFilter", request.conversationTimeStartFilter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.excludeOtherSession)) {
            query.put("ExcludeOtherSession", request.excludeOtherSession);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.finished)) {
            query.put("Finished", request.finished);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.samplingCount)) {
            query.put("SamplingCount", request.samplingCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.samplingRate)) {
            query.put("SamplingRate", request.samplingRate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.samplingType)) {
            query.put("SamplingType", request.samplingType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptId)) {
            query.put("ScriptId", request.scriptId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionEndReasonFilterList)) {
            query.put("SessionEndReasonFilterList", request.sessionEndReasonFilterList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionEndReasonFilterListJsonString)) {
            query.put("SessionEndReasonFilterListJsonString", request.sessionEndReasonFilterListJsonString);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAnnotationMission"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAnnotationMissionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建标注任务</p>
     * 
     * @param request CreateAnnotationMissionRequest
     * @return CreateAnnotationMissionResponse
     */
    public CreateAnnotationMissionResponse createAnnotationMission(CreateAnnotationMissionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAnnotationMissionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建任务</p>
     * 
     * @param request CreateBatchJobsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateBatchJobsResponse
     */
    public CreateBatchJobsResponse createBatchJobsWithOptions(CreateBatchJobsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.batchJobDescription)) {
            query.put("BatchJobDescription", request.batchJobDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.batchJobName)) {
            query.put("BatchJobName", request.batchJobName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callingNumber)) {
            query.put("CallingNumber", request.callingNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobFilePath)) {
            query.put("JobFilePath", request.jobFilePath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scenarioId)) {
            query.put("ScenarioId", request.scenarioId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptId)) {
            query.put("ScriptId", request.scriptId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strategyJson)) {
            query.put("StrategyJson", request.strategyJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.submitted)) {
            query.put("Submitted", request.submitted);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateBatchJobs"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateBatchJobsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建任务</p>
     * 
     * @param request CreateBatchJobsRequest
     * @return CreateBatchJobsResponse
     */
    public CreateBatchJobsResponse createBatchJobs(CreateBatchJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createBatchJobsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>CreateBatchRepeatJob</p>
     * 
     * @param request CreateBatchRepeatJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateBatchRepeatJobResponse
     */
    public CreateBatchRepeatJobResponse createBatchRepeatJobWithOptions(CreateBatchRepeatJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callingNumber)) {
            query.put("CallingNumber", request.callingNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterStatus)) {
            query.put("FilterStatus", request.filterStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flashSmsExtras)) {
            query.put("FlashSmsExtras", request.flashSmsExtras);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minConcurrency)) {
            query.put("MinConcurrency", request.minConcurrency);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            query.put("Priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recallCallingNumber)) {
            query.put("RecallCallingNumber", request.recallCallingNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recallStrategyJson)) {
            query.put("RecallStrategyJson", request.recallStrategyJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ringingDuration)) {
            query.put("RingingDuration", request.ringingDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptId)) {
            query.put("ScriptId", request.scriptId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceGroupId)) {
            query.put("SourceGroupId", request.sourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strategyJson)) {
            query.put("StrategyJson", request.strategyJson);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateBatchRepeatJob"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateBatchRepeatJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>CreateBatchRepeatJob</p>
     * 
     * @param request CreateBatchRepeatJobRequest
     * @return CreateBatchRepeatJobResponse
     */
    public CreateBatchRepeatJobResponse createBatchRepeatJob(CreateBatchRepeatJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createBatchRepeatJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>CreateBeebotIntent</p>
     * 
     * @param tmpReq CreateBeebotIntentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateBeebotIntentResponse
     */
    public CreateBeebotIntentResponse createBeebotIntentWithOptions(CreateBeebotIntentRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateBeebotIntentShrinkRequest request = new CreateBeebotIntentShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.intentDefinition)) {
            request.intentDefinitionShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.intentDefinition, "IntentDefinition", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.intentDefinitionShrink)) {
            query.put("IntentDefinition", request.intentDefinitionShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptId)) {
            query.put("ScriptId", request.scriptId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateBeebotIntent"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateBeebotIntentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>CreateBeebotIntent</p>
     * 
     * @param request CreateBeebotIntentRequest
     * @return CreateBeebotIntentResponse
     */
    public CreateBeebotIntentResponse createBeebotIntent(CreateBeebotIntentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createBeebotIntentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>CreateBeebotIntentLgf</p>
     * 
     * @param tmpReq CreateBeebotIntentLgfRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateBeebotIntentLgfResponse
     */
    public CreateBeebotIntentLgfResponse createBeebotIntentLgfWithOptions(CreateBeebotIntentLgfRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateBeebotIntentLgfShrinkRequest request = new CreateBeebotIntentLgfShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.lgfDefinition)) {
            request.lgfDefinitionShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.lgfDefinition, "LgfDefinition", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lgfDefinitionShrink)) {
            query.put("LgfDefinition", request.lgfDefinitionShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptId)) {
            query.put("ScriptId", request.scriptId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateBeebotIntentLgf"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateBeebotIntentLgfResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>CreateBeebotIntentLgf</p>
     * 
     * @param request CreateBeebotIntentLgfRequest
     * @return CreateBeebotIntentLgfResponse
     */
    public CreateBeebotIntentLgfResponse createBeebotIntentLgf(CreateBeebotIntentLgfRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createBeebotIntentLgfWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>CreateBeebotIntentUserSay</p>
     * 
     * @param tmpReq CreateBeebotIntentUserSayRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateBeebotIntentUserSayResponse
     */
    public CreateBeebotIntentUserSayResponse createBeebotIntentUserSayWithOptions(CreateBeebotIntentUserSayRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateBeebotIntentUserSayShrinkRequest request = new CreateBeebotIntentUserSayShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userSayDefinition)) {
            request.userSayDefinitionShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userSayDefinition, "UserSayDefinition", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptId)) {
            query.put("ScriptId", request.scriptId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userSayDefinitionShrink)) {
            query.put("UserSayDefinition", request.userSayDefinitionShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateBeebotIntentUserSay"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateBeebotIntentUserSayResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>CreateBeebotIntentUserSay</p>
     * 
     * @param request CreateBeebotIntentUserSayRequest
     * @return CreateBeebotIntentUserSayResponse
     */
    public CreateBeebotIntentUserSayResponse createBeebotIntentUserSay(CreateBeebotIntentUserSayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createBeebotIntentUserSayWithOptions(request, runtime);
    }

    /**
     * @param request CreateDialogueFlowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDialogueFlowResponse
     */
    public CreateDialogueFlowResponse createDialogueFlowWithOptions(CreateDialogueFlowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dialogueFlowType)) {
            query.put("DialogueFlowType", request.dialogueFlowType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dialogueName)) {
            query.put("DialogueName", request.dialogueName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptId)) {
            query.put("ScriptId", request.scriptId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDialogueFlow"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDialogueFlowResponse());
    }

    /**
     * @param request CreateDialogueFlowRequest
     * @return CreateDialogueFlowResponse
     */
    public CreateDialogueFlowResponse createDialogueFlow(CreateDialogueFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDialogueFlowWithOptions(request, runtime);
    }

    /**
     * @param request CreateDownloadUrlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDownloadUrlResponse
     */
    public CreateDownloadUrlResponse createDownloadUrlWithOptions(CreateDownloadUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDownloadUrl"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDownloadUrlResponse());
    }

    /**
     * @param request CreateDownloadUrlRequest
     * @return CreateDownloadUrlResponse
     */
    public CreateDownloadUrlResponse createDownloadUrl(CreateDownloadUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDownloadUrlWithOptions(request, runtime);
    }

    /**
     * @param request CreateGlobalQuestionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateGlobalQuestionResponse
     */
    public CreateGlobalQuestionResponse createGlobalQuestionWithOptions(CreateGlobalQuestionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.answers)) {
            query.put("Answers", request.answers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.globalQuestionName)) {
            query.put("GlobalQuestionName", request.globalQuestionName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.globalQuestionType)) {
            query.put("GlobalQuestionType", request.globalQuestionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.questions)) {
            query.put("Questions", request.questions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptId)) {
            query.put("ScriptId", request.scriptId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateGlobalQuestion"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateGlobalQuestionResponse());
    }

    /**
     * @param request CreateGlobalQuestionRequest
     * @return CreateGlobalQuestionResponse
     */
    public CreateGlobalQuestionResponse createGlobalQuestion(CreateGlobalQuestionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createGlobalQuestionWithOptions(request, runtime);
    }

    /**
     * @param request CreateInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateInstanceResponse
     */
    public CreateInstanceResponse createInstanceWithOptions(CreateInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callingNumber)) {
            query.put("CallingNumber", request.callingNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceDescription)) {
            query.put("InstanceDescription", request.instanceDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxConcurrentConversation)) {
            query.put("MaxConcurrentConversation", request.maxConcurrentConversation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nluServiceType)) {
            query.put("NluServiceType", request.nluServiceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateInstance"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateInstanceResponse());
    }

    /**
     * @param request CreateInstanceRequest
     * @return CreateInstanceResponse
     */
    public CreateInstanceResponse createInstance(CreateInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建实例绑定号码</p>
     * 
     * @param request CreateInstanceBindNumberRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateInstanceBindNumberResponse
     */
    public CreateInstanceBindNumberResponse createInstanceBindNumberWithOptions(CreateInstanceBindNumberRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceList)) {
            query.put("InstanceList", request.instanceList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.number)) {
            query.put("Number", request.number);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateInstanceBindNumber"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateInstanceBindNumberResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建实例绑定号码</p>
     * 
     * @param request CreateInstanceBindNumberRequest
     * @return CreateInstanceBindNumberResponse
     */
    public CreateInstanceBindNumberResponse createInstanceBindNumber(CreateInstanceBindNumberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createInstanceBindNumberWithOptions(request, runtime);
    }

    /**
     * @param request CreateIntentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateIntentResponse
     */
    public CreateIntentResponse createIntentWithOptions(CreateIntentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.intentDescription)) {
            query.put("IntentDescription", request.intentDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.intentName)) {
            query.put("IntentName", request.intentName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keywords)) {
            query.put("Keywords", request.keywords);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptId)) {
            query.put("ScriptId", request.scriptId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.utterances)) {
            query.put("Utterances", request.utterances);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateIntent"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateIntentResponse());
    }

    /**
     * @param request CreateIntentRequest
     * @return CreateIntentResponse
     */
    public CreateIntentResponse createIntent(CreateIntentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createIntentWithOptions(request, runtime);
    }

    /**
     * @param request CreateJobDataParsingTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateJobDataParsingTaskResponse
     */
    public CreateJobDataParsingTaskResponse createJobDataParsingTaskWithOptions(CreateJobDataParsingTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobFilePath)) {
            query.put("JobFilePath", request.jobFilePath);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateJobDataParsingTask"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateJobDataParsingTaskResponse());
    }

    /**
     * @param request CreateJobDataParsingTaskRequest
     * @return CreateJobDataParsingTaskResponse
     */
    public CreateJobDataParsingTaskResponse createJobDataParsingTask(CreateJobDataParsingTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createJobDataParsingTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建任务组</p>
     * 
     * @param request CreateJobGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateJobGroupResponse
     */
    public CreateJobGroupResponse createJobGroupWithOptions(CreateJobGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callingNumber)) {
            query.put("CallingNumber", request.callingNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flashSmsExtras)) {
            query.put("FlashSmsExtras", request.flashSmsExtras);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobGroupDescription)) {
            query.put("JobGroupDescription", request.jobGroupDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobGroupName)) {
            query.put("JobGroupName", request.jobGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minConcurrency)) {
            query.put("MinConcurrency", request.minConcurrency);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            query.put("Priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recallCallingNumber)) {
            query.put("RecallCallingNumber", request.recallCallingNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recallStrategyJson)) {
            query.put("RecallStrategyJson", request.recallStrategyJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ringingDuration)) {
            query.put("RingingDuration", request.ringingDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scenarioId)) {
            query.put("ScenarioId", request.scenarioId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptId)) {
            query.put("ScriptId", request.scriptId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strategyJson)) {
            query.put("StrategyJson", request.strategyJson);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateJobGroup"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateJobGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建任务组</p>
     * 
     * @param request CreateJobGroupRequest
     * @return CreateJobGroupResponse
     */
    public CreateJobGroupResponse createJobGroup(CreateJobGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createJobGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建任务组到处任务</p>
     * 
     * @param request CreateJobGroupExportTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateJobGroupExportTaskResponse
     */
    public CreateJobGroupExportTaskResponse createJobGroupExportTaskWithOptions(CreateJobGroupExportTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobGroupId)) {
            query.put("JobGroupId", request.jobGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.option)) {
            query.put("Option", request.option);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateJobGroupExportTask"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateJobGroupExportTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建任务组到处任务</p>
     * 
     * @param request CreateJobGroupExportTaskRequest
     * @return CreateJobGroupExportTaskResponse
     */
    public CreateJobGroupExportTaskResponse createJobGroupExportTask(CreateJobGroupExportTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createJobGroupExportTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>新建场景</p>
     * 
     * @param request CreateScriptRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateScriptResponse
     */
    public CreateScriptResponse createScriptWithOptions(CreateScriptRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentId)) {
            query.put("AgentId", request.agentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.agentLlm)) {
            query.put("AgentLlm", request.agentLlm);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.asrConfig)) {
            query.put("AsrConfig", request.asrConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chatbotId)) {
            query.put("ChatbotId", request.chatbotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.emotionEnable)) {
            query.put("EmotionEnable", request.emotionEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.industry)) {
            query.put("Industry", request.industry);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.longWaitEnable)) {
            query.put("LongWaitEnable", request.longWaitEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.miniPlaybackEnable)) {
            query.put("MiniPlaybackEnable", request.miniPlaybackEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newBargeInEnable)) {
            query.put("NewBargeInEnable", request.newBargeInEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nluAccessType)) {
            query.put("NluAccessType", request.nluAccessType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nluEngine)) {
            query.put("NluEngine", request.nluEngine);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scene)) {
            query.put("Scene", request.scene);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptContent)) {
            query.put("ScriptContent", request.scriptContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptDescription)) {
            query.put("ScriptDescription", request.scriptDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptName)) {
            query.put("ScriptName", request.scriptName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptNluProfileJsonString)) {
            query.put("ScriptNluProfileJsonString", request.scriptNluProfileJsonString);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptWaveform)) {
            query.put("ScriptWaveform", request.scriptWaveform);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ttsConfig)) {
            query.put("TtsConfig", request.ttsConfig);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateScript"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateScriptResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>新建场景</p>
     * 
     * @param request CreateScriptRequest
     * @return CreateScriptResponse
     */
    public CreateScriptResponse createScript(CreateScriptRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createScriptWithOptions(request, runtime);
    }

    /**
     * @param request CreateScriptWaveformRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateScriptWaveformResponse
     */
    public CreateScriptWaveformResponse createScriptWaveformWithOptions(CreateScriptWaveformRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileId)) {
            query.put("FileId", request.fileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            query.put("FileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptContent)) {
            query.put("ScriptContent", request.scriptContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptId)) {
            query.put("ScriptId", request.scriptId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateScriptWaveform"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateScriptWaveformResponse());
    }

    /**
     * @param request CreateScriptWaveformRequest
     * @return CreateScriptWaveformResponse
     */
    public CreateScriptWaveformResponse createScriptWaveform(CreateScriptWaveformRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createScriptWaveformWithOptions(request, runtime);
    }

    /**
     * @param request CreateTagRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTagResponse
     */
    public CreateTagResponse createTagWithOptions(CreateTagRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptId)) {
            query.put("ScriptId", request.scriptId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagGroup)) {
            query.put("TagGroup", request.tagGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagName)) {
            query.put("TagName", request.tagName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTag"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTagResponse());
    }

    /**
     * @param request CreateTagRequest
     * @return CreateTagResponse
     */
    public CreateTagResponse createTag(CreateTagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTagWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>外呼历史导出</p>
     * 
     * @param request CreateTaskExportTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTaskExportTaskResponse
     */
    public CreateTaskExportTaskResponse createTaskExportTaskWithOptions(CreateTaskExportTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTaskExportTask"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTaskExportTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>外呼历史导出</p>
     * 
     * @param request CreateTaskExportTaskRequest
     * @return CreateTaskExportTaskResponse
     */
    public CreateTaskExportTaskResponse createTaskExportTask(CreateTaskExportTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTaskExportTaskWithOptions(request, runtime);
    }

    /**
     * @param tmpReq DeleteAgentProfilesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAgentProfilesResponse
     */
    public DeleteAgentProfilesResponse deleteAgentProfilesWithOptions(DeleteAgentProfilesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteAgentProfilesShrinkRequest request = new DeleteAgentProfilesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.agentProfileIds)) {
            request.agentProfileIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.agentProfileIds, "AgentProfileIds", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentProfileIdsShrink)) {
            body.put("AgentProfileIds", request.agentProfileIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appIp)) {
            body.put("AppIp", request.appIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAgentProfiles"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAgentProfilesResponse());
    }

    /**
     * @param request DeleteAgentProfilesRequest
     * @return DeleteAgentProfilesResponse
     */
    public DeleteAgentProfilesResponse deleteAgentProfiles(DeleteAgentProfilesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAgentProfilesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>清空归属地号码库</p>
     * 
     * @param request DeleteAllNumberDistrictInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAllNumberDistrictInfoResponse
     */
    public DeleteAllNumberDistrictInfoResponse deleteAllNumberDistrictInfoWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAllNumberDistrictInfo"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAllNumberDistrictInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>清空归属地号码库</p>
     * @return DeleteAllNumberDistrictInfoResponse
     */
    public DeleteAllNumberDistrictInfoResponse deleteAllNumberDistrictInfo() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAllNumberDistrictInfoWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>DeleteBeebotIntent</p>
     * 
     * @param request DeleteBeebotIntentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteBeebotIntentResponse
     */
    public DeleteBeebotIntentResponse deleteBeebotIntentWithOptions(DeleteBeebotIntentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.intentId)) {
            query.put("IntentId", request.intentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptId)) {
            query.put("ScriptId", request.scriptId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteBeebotIntent"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteBeebotIntentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>DeleteBeebotIntent</p>
     * 
     * @param request DeleteBeebotIntentRequest
     * @return DeleteBeebotIntentResponse
     */
    public DeleteBeebotIntentResponse deleteBeebotIntent(DeleteBeebotIntentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteBeebotIntentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>DeleteBeebotIntentLgf</p>
     * 
     * @param request DeleteBeebotIntentLgfRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteBeebotIntentLgfResponse
     */
    public DeleteBeebotIntentLgfResponse deleteBeebotIntentLgfWithOptions(DeleteBeebotIntentLgfRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.intentId)) {
            query.put("IntentId", request.intentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lgfId)) {
            query.put("LgfId", request.lgfId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptId)) {
            query.put("ScriptId", request.scriptId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteBeebotIntentLgf"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteBeebotIntentLgfResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>DeleteBeebotIntentLgf</p>
     * 
     * @param request DeleteBeebotIntentLgfRequest
     * @return DeleteBeebotIntentLgfResponse
     */
    public DeleteBeebotIntentLgfResponse deleteBeebotIntentLgf(DeleteBeebotIntentLgfRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteBeebotIntentLgfWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>DeleteBeebotIntentUserSay</p>
     * 
     * @param request DeleteBeebotIntentUserSayRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteBeebotIntentUserSayResponse
     */
    public DeleteBeebotIntentUserSayResponse deleteBeebotIntentUserSayWithOptions(DeleteBeebotIntentUserSayRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.intentId)) {
            query.put("IntentId", request.intentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptId)) {
            query.put("ScriptId", request.scriptId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userSayId)) {
            query.put("UserSayId", request.userSayId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteBeebotIntentUserSay"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteBeebotIntentUserSayResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>DeleteBeebotIntentUserSay</p>
     * 
     * @param request DeleteBeebotIntentUserSayRequest
     * @return DeleteBeebotIntentUserSayResponse
     */
    public DeleteBeebotIntentUserSayResponse deleteBeebotIntentUserSay(DeleteBeebotIntentUserSayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteBeebotIntentUserSayWithOptions(request, runtime);
    }

    /**
     * @param request DeleteContactBlockListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteContactBlockListResponse
     */
    public DeleteContactBlockListResponse deleteContactBlockListWithOptions(DeleteContactBlockListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactBlockListId)) {
            query.put("ContactBlockListId", request.contactBlockListId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operator)) {
            query.put("Operator", request.operator);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteContactBlockList"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteContactBlockListResponse());
    }

    /**
     * @param request DeleteContactBlockListRequest
     * @return DeleteContactBlockListResponse
     */
    public DeleteContactBlockListResponse deleteContactBlockList(DeleteContactBlockListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteContactBlockListWithOptions(request, runtime);
    }

    /**
     * @param request DeleteContactWhiteListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteContactWhiteListResponse
     */
    public DeleteContactWhiteListResponse deleteContactWhiteListWithOptions(DeleteContactWhiteListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactWhiteListId)) {
            query.put("ContactWhiteListId", request.contactWhiteListId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operator)) {
            query.put("Operator", request.operator);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteContactWhiteList"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteContactWhiteListResponse());
    }

    /**
     * @param request DeleteContactWhiteListRequest
     * @return DeleteContactWhiteListResponse
     */
    public DeleteContactWhiteListResponse deleteContactWhiteList(DeleteContactWhiteListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteContactWhiteListWithOptions(request, runtime);
    }

    /**
     * @param request DeleteDialogueFlowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDialogueFlowResponse
     */
    public DeleteDialogueFlowResponse deleteDialogueFlowWithOptions(DeleteDialogueFlowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dialogueFlowId)) {
            query.put("DialogueFlowId", request.dialogueFlowId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptId)) {
            query.put("ScriptId", request.scriptId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDialogueFlow"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDialogueFlowResponse());
    }

    /**
     * @param request DeleteDialogueFlowRequest
     * @return DeleteDialogueFlowResponse
     */
    public DeleteDialogueFlowResponse deleteDialogueFlow(DeleteDialogueFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDialogueFlowWithOptions(request, runtime);
    }

    /**
     * @param request DeleteGlobalQuestionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteGlobalQuestionResponse
     */
    public DeleteGlobalQuestionResponse deleteGlobalQuestionWithOptions(DeleteGlobalQuestionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.globalQuestionId)) {
            query.put("GlobalQuestionId", request.globalQuestionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptId)) {
            query.put("ScriptId", request.scriptId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteGlobalQuestion"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteGlobalQuestionResponse());
    }

    /**
     * @param request DeleteGlobalQuestionRequest
     * @return DeleteGlobalQuestionResponse
     */
    public DeleteGlobalQuestionResponse deleteGlobalQuestion(DeleteGlobalQuestionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteGlobalQuestionWithOptions(request, runtime);
    }

    /**
     * @param request DeleteInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteInstanceResponse
     */
    public DeleteInstanceResponse deleteInstanceWithOptions(DeleteInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteInstance"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteInstanceResponse());
    }

    /**
     * @param request DeleteInstanceRequest
     * @return DeleteInstanceResponse
     */
    public DeleteInstanceResponse deleteInstance(DeleteInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteInstanceWithOptions(request, runtime);
    }

    /**
     * @param request DeleteIntentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteIntentResponse
     */
    public DeleteIntentResponse deleteIntentWithOptions(DeleteIntentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.intentId)) {
            query.put("IntentId", request.intentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptId)) {
            query.put("ScriptId", request.scriptId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteIntent"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteIntentResponse());
    }

    /**
     * @param request DeleteIntentRequest
     * @return DeleteIntentResponse
     */
    public DeleteIntentResponse deleteIntent(DeleteIntentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteIntentWithOptions(request, runtime);
    }

    /**
     * @param request DeleteJobGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteJobGroupResponse
     */
    public DeleteJobGroupResponse deleteJobGroupWithOptions(DeleteJobGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobGroupId)) {
            query.put("JobGroupId", request.jobGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteJobGroup"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteJobGroupResponse());
    }

    /**
     * @param request DeleteJobGroupRequest
     * @return DeleteJobGroupResponse
     */
    public DeleteJobGroupResponse deleteJobGroup(DeleteJobGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteJobGroupWithOptions(request, runtime);
    }

    /**
     * @param request DeleteOutboundCallNumberRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteOutboundCallNumberResponse
     */
    public DeleteOutboundCallNumberResponse deleteOutboundCallNumberWithOptions(DeleteOutboundCallNumberRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outboundCallNumberId)) {
            query.put("OutboundCallNumberId", request.outboundCallNumberId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteOutboundCallNumber"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteOutboundCallNumberResponse());
    }

    /**
     * @param request DeleteOutboundCallNumberRequest
     * @return DeleteOutboundCallNumberResponse
     */
    public DeleteOutboundCallNumberResponse deleteOutboundCallNumber(DeleteOutboundCallNumberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteOutboundCallNumberWithOptions(request, runtime);
    }

    /**
     * @param request DeleteScriptRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteScriptResponse
     */
    public DeleteScriptResponse deleteScriptWithOptions(DeleteScriptRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptId)) {
            query.put("ScriptId", request.scriptId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteScript"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteScriptResponse());
    }

    /**
     * @param request DeleteScriptRequest
     * @return DeleteScriptResponse
     */
    public DeleteScriptResponse deleteScript(DeleteScriptRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteScriptWithOptions(request, runtime);
    }

    /**
     * @param request DeleteScriptRecordingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteScriptRecordingResponse
     */
    public DeleteScriptRecordingResponse deleteScriptRecordingWithOptions(DeleteScriptRecordingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptId)) {
            query.put("ScriptId", request.scriptId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uuidsJson)) {
            query.put("UuidsJson", request.uuidsJson);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteScriptRecording"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteScriptRecordingResponse());
    }

    /**
     * @param request DeleteScriptRecordingRequest
     * @return DeleteScriptRecordingResponse
     */
    public DeleteScriptRecordingResponse deleteScriptRecording(DeleteScriptRecordingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteScriptRecordingWithOptions(request, runtime);
    }

    /**
     * @param request DeleteScriptWaveformRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteScriptWaveformResponse
     */
    public DeleteScriptWaveformResponse deleteScriptWaveformWithOptions(DeleteScriptWaveformRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptId)) {
            query.put("ScriptId", request.scriptId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptWaveformId)) {
            query.put("ScriptWaveformId", request.scriptWaveformId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteScriptWaveform"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteScriptWaveformResponse());
    }

    /**
     * @param request DeleteScriptWaveformRequest
     * @return DeleteScriptWaveformResponse
     */
    public DeleteScriptWaveformResponse deleteScriptWaveform(DeleteScriptWaveformRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteScriptWaveformWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <hr>
     * 
     * <b>summary</b> : 
     * <p>DescribeBeebotIntent</p>
     * 
     * @param request DescribeBeebotIntentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeBeebotIntentResponse
     */
    public DescribeBeebotIntentResponse describeBeebotIntentWithOptions(DescribeBeebotIntentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.intentId)) {
            query.put("IntentId", request.intentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptId)) {
            query.put("ScriptId", request.scriptId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeBeebotIntent"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeBeebotIntentResponse());
    }

    /**
     * <b>description</b> :
     * <hr>
     * 
     * <b>summary</b> : 
     * <p>DescribeBeebotIntent</p>
     * 
     * @param request DescribeBeebotIntentRequest
     * @return DescribeBeebotIntentResponse
     */
    public DescribeBeebotIntentResponse describeBeebotIntent(DescribeBeebotIntentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBeebotIntentWithOptions(request, runtime);
    }

    /**
     * @param request DescribeDialogueNodeStatisticsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDialogueNodeStatisticsResponse
     */
    public DescribeDialogueNodeStatisticsResponse describeDialogueNodeStatisticsWithOptions(DescribeDialogueNodeStatisticsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobGroupId)) {
            query.put("JobGroupId", request.jobGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("Limit", request.limit);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDialogueNodeStatistics"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDialogueNodeStatisticsResponse());
    }

    /**
     * @param request DescribeDialogueNodeStatisticsRequest
     * @return DescribeDialogueNodeStatisticsResponse
     */
    public DescribeDialogueNodeStatisticsResponse describeDialogueNodeStatistics(DescribeDialogueNodeStatisticsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDialogueNodeStatisticsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>DescribeDsReports</p>
     * 
     * @param request DescribeDsReportsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDsReportsResponse
     */
    public DescribeDsReportsResponse describeDsReportsWithOptions(DescribeDsReportsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobGroupId)) {
            query.put("JobGroupId", request.jobGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDsReports"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDsReportsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>DescribeDsReports</p>
     * 
     * @param request DescribeDsReportsRequest
     * @return DescribeDsReportsResponse
     */
    public DescribeDsReportsResponse describeDsReports(DescribeDsReportsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDsReportsWithOptions(request, runtime);
    }

    /**
     * @param request DescribeGlobalQuestionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeGlobalQuestionResponse
     */
    public DescribeGlobalQuestionResponse describeGlobalQuestionWithOptions(DescribeGlobalQuestionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.globalQuestionId)) {
            query.put("GlobalQuestionId", request.globalQuestionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptId)) {
            query.put("ScriptId", request.scriptId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeGlobalQuestion"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeGlobalQuestionResponse());
    }

    /**
     * @param request DescribeGlobalQuestionRequest
     * @return DescribeGlobalQuestionResponse
     */
    public DescribeGlobalQuestionResponse describeGlobalQuestion(DescribeGlobalQuestionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeGlobalQuestionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>任务组数据统计</p>
     * 
     * @param request DescribeGroupExecutingInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeGroupExecutingInfoResponse
     */
    public DescribeGroupExecutingInfoResponse describeGroupExecutingInfoWithOptions(DescribeGroupExecutingInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobGroupId)) {
            query.put("JobGroupId", request.jobGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeGroupExecutingInfo"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeGroupExecutingInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>任务组数据统计</p>
     * 
     * @param request DescribeGroupExecutingInfoRequest
     * @return DescribeGroupExecutingInfoResponse
     */
    public DescribeGroupExecutingInfoResponse describeGroupExecutingInfo(DescribeGroupExecutingInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeGroupExecutingInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>DescribeInstance</p>
     * 
     * @param request DescribeInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInstanceResponse
     */
    public DescribeInstanceResponse describeInstanceWithOptions(DescribeInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstance"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>DescribeInstance</p>
     * 
     * @param request DescribeInstanceRequest
     * @return DescribeInstanceResponse
     */
    public DescribeInstanceResponse describeInstance(DescribeInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceWithOptions(request, runtime);
    }

    /**
     * @param request DescribeIntentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeIntentResponse
     */
    public DescribeIntentResponse describeIntentWithOptions(DescribeIntentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.intentId)) {
            query.put("IntentId", request.intentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptId)) {
            query.put("ScriptId", request.scriptId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeIntent"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeIntentResponse());
    }

    /**
     * @param request DescribeIntentRequest
     * @return DescribeIntentResponse
     */
    public DescribeIntentResponse describeIntent(DescribeIntentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeIntentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>DescribeIntentStatistics</p>
     * 
     * @param request DescribeIntentStatisticsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeIntentStatisticsResponse
     */
    public DescribeIntentStatisticsResponse describeIntentStatisticsWithOptions(DescribeIntentStatisticsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobGroupId)) {
            query.put("JobGroupId", request.jobGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("Limit", request.limit);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeIntentStatistics"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeIntentStatisticsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>DescribeIntentStatistics</p>
     * 
     * @param request DescribeIntentStatisticsRequest
     * @return DescribeIntentStatisticsResponse
     */
    public DescribeIntentStatisticsResponse describeIntentStatistics(DescribeIntentStatisticsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeIntentStatisticsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取job信息</p>
     * 
     * @param request DescribeJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeJobResponse
     */
    public DescribeJobResponse describeJobWithOptions(DescribeJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.withScript)) {
            query.put("WithScript", request.withScript);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeJob"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取job信息</p>
     * 
     * @param request DescribeJobRequest
     * @return DescribeJobResponse
     */
    public DescribeJobResponse describeJob(DescribeJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeJobWithOptions(request, runtime);
    }

    /**
     * @param request DescribeJobDataParsingTaskProgressRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeJobDataParsingTaskProgressResponse
     */
    public DescribeJobDataParsingTaskProgressResponse describeJobDataParsingTaskProgressWithOptions(DescribeJobDataParsingTaskProgressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobDataParsingTaskId)) {
            query.put("JobDataParsingTaskId", request.jobDataParsingTaskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeJobDataParsingTaskProgress"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeJobDataParsingTaskProgressResponse());
    }

    /**
     * @param request DescribeJobDataParsingTaskProgressRequest
     * @return DescribeJobDataParsingTaskProgressResponse
     */
    public DescribeJobDataParsingTaskProgressResponse describeJobDataParsingTaskProgress(DescribeJobDataParsingTaskProgressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeJobDataParsingTaskProgressWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>DescribeJobGroup</p>
     * 
     * @param request DescribeJobGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeJobGroupResponse
     */
    public DescribeJobGroupResponse describeJobGroupWithOptions(DescribeJobGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.briefTypes)) {
            query.put("BriefTypes", request.briefTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobGroupId)) {
            query.put("JobGroupId", request.jobGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeJobGroup"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeJobGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>DescribeJobGroup</p>
     * 
     * @param request DescribeJobGroupRequest
     * @return DescribeJobGroupResponse
     */
    public DescribeJobGroupResponse describeJobGroup(DescribeJobGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeJobGroupWithOptions(request, runtime);
    }

    /**
     * @param request DescribeJobGroupExportTaskProgressRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeJobGroupExportTaskProgressResponse
     */
    public DescribeJobGroupExportTaskProgressResponse describeJobGroupExportTaskProgressWithOptions(DescribeJobGroupExportTaskProgressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeJobGroupExportTaskProgress"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeJobGroupExportTaskProgressResponse());
    }

    /**
     * @param request DescribeJobGroupExportTaskProgressRequest
     * @return DescribeJobGroupExportTaskProgressResponse
     */
    public DescribeJobGroupExportTaskProgressResponse describeJobGroupExportTaskProgress(DescribeJobGroupExportTaskProgressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeJobGroupExportTaskProgressWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取场景信息</p>
     * 
     * @param request DescribeScriptRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeScriptResponse
     */
    public DescribeScriptResponse describeScriptWithOptions(DescribeScriptRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptId)) {
            query.put("ScriptId", request.scriptId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeScript"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeScriptResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取场景信息</p>
     * 
     * @param request DescribeScriptRequest
     * @return DescribeScriptResponse
     */
    public DescribeScriptResponse describeScript(DescribeScriptRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeScriptWithOptions(request, runtime);
    }

    /**
     * @param request DescribeScriptVoiceConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeScriptVoiceConfigResponse
     */
    public DescribeScriptVoiceConfigResponse describeScriptVoiceConfigWithOptions(DescribeScriptVoiceConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptId)) {
            query.put("ScriptId", request.scriptId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptVoiceConfigId)) {
            query.put("ScriptVoiceConfigId", request.scriptVoiceConfigId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeScriptVoiceConfig"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeScriptVoiceConfigResponse());
    }

    /**
     * @param request DescribeScriptVoiceConfigRequest
     * @return DescribeScriptVoiceConfigResponse
     */
    public DescribeScriptVoiceConfigResponse describeScriptVoiceConfig(DescribeScriptVoiceConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeScriptVoiceConfigWithOptions(request, runtime);
    }

    /**
     * @param request DescribeTTSConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTTSConfigResponse
     */
    public DescribeTTSConfigResponse describeTTSConfigWithOptions(DescribeTTSConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptId)) {
            query.put("ScriptId", request.scriptId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTTSConfig"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTTSConfigResponse());
    }

    /**
     * @param request DescribeTTSConfigRequest
     * @return DescribeTTSConfigResponse
     */
    public DescribeTTSConfigResponse describeTTSConfig(DescribeTTSConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTTSConfigWithOptions(request, runtime);
    }

    /**
     * @param request DescribeTTSDemoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTTSDemoResponse
     */
    public DescribeTTSDemoResponse describeTTSDemoWithOptions(DescribeTTSDemoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessKey)) {
            query.put("AccessKey", request.accessKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aliCustomizedVoice)) {
            query.put("AliCustomizedVoice", request.aliCustomizedVoice);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appKey)) {
            query.put("AppKey", request.appKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.engine)) {
            query.put("Engine", request.engine);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nlsServiceType)) {
            query.put("NlsServiceType", request.nlsServiceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pitchRate)) {
            query.put("PitchRate", request.pitchRate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptId)) {
            query.put("ScriptId", request.scriptId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secretKey)) {
            query.put("SecretKey", request.secretKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.speechRate)) {
            query.put("SpeechRate", request.speechRate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.text)) {
            query.put("Text", request.text);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.voice)) {
            query.put("Voice", request.voice);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.volume)) {
            query.put("Volume", request.volume);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTTSDemo"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTTSDemoResponse());
    }

    /**
     * @param request DescribeTTSDemoRequest
     * @return DescribeTTSDemoResponse
     */
    public DescribeTTSDemoResponse describeTTSDemo(DescribeTTSDemoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTTSDemoWithOptions(request, runtime);
    }

    /**
     * @param request DescribeTagHitsSummaryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTagHitsSummaryResponse
     */
    public DescribeTagHitsSummaryResponse describeTagHitsSummaryWithOptions(DescribeTagHitsSummaryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobGroupId)) {
            query.put("JobGroupId", request.jobGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTagHitsSummary"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTagHitsSummaryResponse());
    }

    /**
     * @param request DescribeTagHitsSummaryRequest
     * @return DescribeTagHitsSummaryResponse
     */
    public DescribeTagHitsSummaryResponse describeTagHitsSummary(DescribeTagHitsSummaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTagHitsSummaryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>号码绑定实例列表</p>
     * 
     * @param request DescribeTenantBindNumberRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTenantBindNumberResponse
     */
    public DescribeTenantBindNumberResponse describeTenantBindNumberWithOptions(DescribeTenantBindNumberRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.number)) {
            query.put("Number", request.number);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTenantBindNumber"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTenantBindNumberResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>号码绑定实例列表</p>
     * 
     * @param request DescribeTenantBindNumberRequest
     * @return DescribeTenantBindNumberResponse
     */
    public DescribeTenantBindNumberResponse describeTenantBindNumber(DescribeTenantBindNumberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTenantBindNumberWithOptions(request, runtime);
    }

    /**
     * @param request DialogueRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DialogueResponse
     */
    public DialogueResponse dialogueWithOptions(DialogueRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.actionKey)) {
            query.put("ActionKey", request.actionKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.actionParams)) {
            query.put("ActionParams", request.actionParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callId)) {
            query.put("CallId", request.callId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callType)) {
            query.put("CallType", request.callType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.calledNumber)) {
            query.put("CalledNumber", request.calledNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callingNumber)) {
            query.put("CallingNumber", request.callingNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scenarioId)) {
            query.put("ScenarioId", request.scenarioId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptId)) {
            query.put("ScriptId", request.scriptId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.utterance)) {
            query.put("Utterance", request.utterance);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Dialogue"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DialogueResponse());
    }

    /**
     * @param request DialogueRequest
     * @return DialogueResponse
     */
    public DialogueResponse dialogue(DialogueRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.dialogueWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>DownloadRecording</p>
     * 
     * @param request DownloadRecordingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DownloadRecordingResponse
     */
    public DownloadRecordingResponse downloadRecordingWithOptions(DownloadRecordingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needVoiceSliceRecording)) {
            query.put("NeedVoiceSliceRecording", request.needVoiceSliceRecording);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DownloadRecording"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DownloadRecordingResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>DownloadRecording</p>
     * 
     * @param request DownloadRecordingRequest
     * @return DownloadRecordingResponse
     */
    public DownloadRecordingResponse downloadRecording(DownloadRecordingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.downloadRecordingWithOptions(request, runtime);
    }

    /**
     * @param request DownloadScriptRecordingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DownloadScriptRecordingResponse
     */
    public DownloadScriptRecordingResponse downloadScriptRecordingWithOptions(DownloadScriptRecordingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptId)) {
            query.put("ScriptId", request.scriptId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uuid)) {
            query.put("Uuid", request.uuid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DownloadScriptRecording"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DownloadScriptRecordingResponse());
    }

    /**
     * @param request DownloadScriptRecordingRequest
     * @return DownloadScriptRecordingResponse
     */
    public DownloadScriptRecordingResponse downloadScriptRecording(DownloadScriptRecordingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.downloadScriptRecordingWithOptions(request, runtime);
    }

    /**
     * @param request DuplicateScriptRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DuplicateScriptResponse
     */
    public DuplicateScriptResponse duplicateScriptWithOptions(DuplicateScriptRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceScriptId)) {
            query.put("SourceScriptId", request.sourceScriptId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DuplicateScript"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DuplicateScriptResponse());
    }

    /**
     * @param request DuplicateScriptRequest
     * @return DuplicateScriptResponse
     */
    public DuplicateScriptResponse duplicateScript(DuplicateScriptRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.duplicateScriptWithOptions(request, runtime);
    }

    /**
     * @param request ExportScriptRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExportScriptResponse
     */
    public ExportScriptResponse exportScriptWithOptions(ExportScriptRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptId)) {
            query.put("ScriptId", request.scriptId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExportScript"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExportScriptResponse());
    }

    /**
     * @param request ExportScriptRequest
     * @return ExportScriptResponse
     */
    public ExportScriptResponse exportScript(ExportScriptRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.exportScriptWithOptions(request, runtime);
    }

    /**
     * @param request GenerateUploadUrlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GenerateUploadUrlResponse
     */
    public GenerateUploadUrlResponse generateUploadUrlWithOptions(GenerateUploadUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            query.put("FileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.key)) {
            query.put("Key", request.key);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GenerateUploadUrl"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GenerateUploadUrlResponse());
    }

    /**
     * @param request GenerateUploadUrlRequest
     * @return GenerateUploadUrlResponse
     */
    public GenerateUploadUrlResponse generateUploadUrl(GenerateUploadUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.generateUploadUrlWithOptions(request, runtime);
    }

    /**
     * @param request GetAfterAnswerDelayPlaybackRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAfterAnswerDelayPlaybackResponse
     */
    public GetAfterAnswerDelayPlaybackResponse getAfterAnswerDelayPlaybackWithOptions(GetAfterAnswerDelayPlaybackRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.entryId)) {
            query.put("EntryId", request.entryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strategyLevel)) {
            query.put("StrategyLevel", request.strategyLevel);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAfterAnswerDelayPlayback"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAfterAnswerDelayPlaybackResponse());
    }

    /**
     * @param request GetAfterAnswerDelayPlaybackRequest
     * @return GetAfterAnswerDelayPlaybackResponse
     */
    public GetAfterAnswerDelayPlaybackResponse getAfterAnswerDelayPlayback(GetAfterAnswerDelayPlaybackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAfterAnswerDelayPlaybackWithOptions(request, runtime);
    }

    /**
     * @param request GetAgentProfileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAgentProfileResponse
     */
    public GetAgentProfileResponse getAgentProfileWithOptions(GetAgentProfileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentProfileId)) {
            body.put("AgentProfileId", request.agentProfileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appIp)) {
            body.put("AppIp", request.appIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAgentProfile"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAgentProfileResponse());
    }

    /**
     * @param request GetAgentProfileRequest
     * @return GetAgentProfileResponse
     */
    public GetAgentProfileResponse getAgentProfile(GetAgentProfileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAgentProfileWithOptions(request, runtime);
    }

    /**
     * @param request GetAgentProfileTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAgentProfileTemplateResponse
     */
    public GetAgentProfileTemplateResponse getAgentProfileTemplateWithOptions(GetAgentProfileTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentProfileTemplateId)) {
            body.put("AgentProfileTemplateId", request.agentProfileTemplateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appIp)) {
            body.put("AppIp", request.appIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAgentProfileTemplate"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAgentProfileTemplateResponse());
    }

    /**
     * @param request GetAgentProfileTemplateRequest
     * @return GetAgentProfileTemplateResponse
     */
    public GetAgentProfileTemplateResponse getAgentProfileTemplate(GetAgentProfileTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAgentProfileTemplateWithOptions(request, runtime);
    }

    /**
     * @param request GetAnnotationMissionSummaryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAnnotationMissionSummaryResponse
     */
    public GetAnnotationMissionSummaryResponse getAnnotationMissionSummaryWithOptions(GetAnnotationMissionSummaryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.annotationMissionId)) {
            query.put("AnnotationMissionId", request.annotationMissionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAnnotationMissionSummary"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAnnotationMissionSummaryResponse());
    }

    /**
     * @param request GetAnnotationMissionSummaryRequest
     * @return GetAnnotationMissionSummaryResponse
     */
    public GetAnnotationMissionSummaryResponse getAnnotationMissionSummary(GetAnnotationMissionSummaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAnnotationMissionSummaryWithOptions(request, runtime);
    }

    /**
     * @param request GetAnnotationMissionTagInfoListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAnnotationMissionTagInfoListResponse
     */
    public GetAnnotationMissionTagInfoListResponse getAnnotationMissionTagInfoListWithOptions(GetAnnotationMissionTagInfoListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            query.put("PageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAnnotationMissionTagInfoList"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAnnotationMissionTagInfoListResponse());
    }

    /**
     * @param request GetAnnotationMissionTagInfoListRequest
     * @return GetAnnotationMissionTagInfoListResponse
     */
    public GetAnnotationMissionTagInfoListResponse getAnnotationMissionTagInfoList(GetAnnotationMissionTagInfoListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAnnotationMissionTagInfoListWithOptions(request, runtime);
    }

    /**
     * @param request GetAsrServerInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAsrServerInfoResponse
     */
    public GetAsrServerInfoResponse getAsrServerInfoWithOptions(GetAsrServerInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.entryId)) {
            query.put("EntryId", request.entryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strategyLevel)) {
            query.put("StrategyLevel", request.strategyLevel);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAsrServerInfo"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAsrServerInfoResponse());
    }

    /**
     * @param request GetAsrServerInfoRequest
     * @return GetAsrServerInfoResponse
     */
    public GetAsrServerInfoResponse getAsrServerInfo(GetAsrServerInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAsrServerInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取异步外呼任务上传结果</p>
     * 
     * @param request GetAssignJobsAsyncResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAssignJobsAsyncResultResponse
     */
    public GetAssignJobsAsyncResultResponse getAssignJobsAsyncResultWithOptions(GetAssignJobsAsyncResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.asyncTaskId)) {
            query.put("AsyncTaskId", request.asyncTaskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAssignJobsAsyncResult"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAssignJobsAsyncResultResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取异步外呼任务上传结果</p>
     * 
     * @param request GetAssignJobsAsyncResultRequest
     * @return GetAssignJobsAsyncResultResponse
     */
    public GetAssignJobsAsyncResultResponse getAssignJobsAsyncResult(GetAssignJobsAsyncResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAssignJobsAsyncResultWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取系统策略配置</p>
     * 
     * @param request GetBaseStrategyPeriodRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetBaseStrategyPeriodResponse
     */
    public GetBaseStrategyPeriodResponse getBaseStrategyPeriodWithOptions(GetBaseStrategyPeriodRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.entryId)) {
            query.put("EntryId", request.entryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strategyLevel)) {
            query.put("StrategyLevel", request.strategyLevel);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBaseStrategyPeriod"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBaseStrategyPeriodResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取系统策略配置</p>
     * 
     * @param request GetBaseStrategyPeriodRequest
     * @return GetBaseStrategyPeriodResponse
     */
    public GetBaseStrategyPeriodResponse getBaseStrategyPeriod(GetBaseStrategyPeriodRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getBaseStrategyPeriodWithOptions(request, runtime);
    }

    /**
     * @param request GetConcurrentConversationQuotaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetConcurrentConversationQuotaResponse
     */
    public GetConcurrentConversationQuotaResponse getConcurrentConversationQuotaWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetConcurrentConversationQuota"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetConcurrentConversationQuotaResponse());
    }

    /**
     * @return GetConcurrentConversationQuotaResponse
     */
    public GetConcurrentConversationQuotaResponse getConcurrentConversationQuota() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getConcurrentConversationQuotaWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>GetContactBlockList</p>
     * 
     * @param request GetContactBlockListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetContactBlockListResponse
     */
    public GetContactBlockListResponse getContactBlockListWithOptions(GetContactBlockListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.countTotalRow)) {
            query.put("CountTotalRow", request.countTotalRow);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetContactBlockList"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetContactBlockListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>GetContactBlockList</p>
     * 
     * @param request GetContactBlockListRequest
     * @return GetContactBlockListResponse
     */
    public GetContactBlockListResponse getContactBlockList(GetContactBlockListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getContactBlockListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>GetContactWhiteList</p>
     * 
     * @param request GetContactWhiteListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetContactWhiteListResponse
     */
    public GetContactWhiteListResponse getContactWhiteListWithOptions(GetContactWhiteListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.countTotalRow)) {
            query.put("CountTotalRow", request.countTotalRow);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetContactWhiteList"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetContactWhiteListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>GetContactWhiteList</p>
     * 
     * @param request GetContactWhiteListRequest
     * @return GetContactWhiteListResponse
     */
    public GetContactWhiteListResponse getContactWhiteList(GetContactWhiteListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getContactWhiteListWithOptions(request, runtime);
    }

    /**
     * @param request GetCurrentConcurrencyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCurrentConcurrencyResponse
     */
    public GetCurrentConcurrencyResponse getCurrentConcurrencyWithOptions(GetCurrentConcurrencyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCurrentConcurrency"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCurrentConcurrencyResponse());
    }

    /**
     * @param request GetCurrentConcurrencyRequest
     * @return GetCurrentConcurrencyResponse
     */
    public GetCurrentConcurrencyResponse getCurrentConcurrency(GetCurrentConcurrencyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCurrentConcurrencyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>GetEmptyNumberNoMoreCallsInfo</p>
     * 
     * @param request GetEmptyNumberNoMoreCallsInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetEmptyNumberNoMoreCallsInfoResponse
     */
    public GetEmptyNumberNoMoreCallsInfoResponse getEmptyNumberNoMoreCallsInfoWithOptions(GetEmptyNumberNoMoreCallsInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.entryId)) {
            query.put("EntryId", request.entryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strategyLevel)) {
            query.put("StrategyLevel", request.strategyLevel);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEmptyNumberNoMoreCallsInfo"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetEmptyNumberNoMoreCallsInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>GetEmptyNumberNoMoreCallsInfo</p>
     * 
     * @param request GetEmptyNumberNoMoreCallsInfoRequest
     * @return GetEmptyNumberNoMoreCallsInfoResponse
     */
    public GetEmptyNumberNoMoreCallsInfoResponse getEmptyNumberNoMoreCallsInfo(GetEmptyNumberNoMoreCallsInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getEmptyNumberNoMoreCallsInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取上传信息</p>
     * 
     * @param request GetJobDataUploadParamsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetJobDataUploadParamsResponse
     */
    public GetJobDataUploadParamsResponse getJobDataUploadParamsWithOptions(GetJobDataUploadParamsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.busiType)) {
            query.put("BusiType", request.busiType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            query.put("FileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.path)) {
            query.put("Path", request.path);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uniqueId)) {
            query.put("UniqueId", request.uniqueId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetJobDataUploadParams"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetJobDataUploadParamsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取上传信息</p>
     * 
     * @param request GetJobDataUploadParamsRequest
     * @return GetJobDataUploadParamsResponse
     */
    public GetJobDataUploadParamsResponse getJobDataUploadParams(GetJobDataUploadParamsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getJobDataUploadParamsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>GetMaxAttemptsPerDay</p>
     * 
     * @param request GetMaxAttemptsPerDayRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMaxAttemptsPerDayResponse
     */
    public GetMaxAttemptsPerDayResponse getMaxAttemptsPerDayWithOptions(GetMaxAttemptsPerDayRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.entryId)) {
            query.put("EntryId", request.entryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strategyLevel)) {
            query.put("StrategyLevel", request.strategyLevel);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMaxAttemptsPerDay"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMaxAttemptsPerDayResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>GetMaxAttemptsPerDay</p>
     * 
     * @param request GetMaxAttemptsPerDayRequest
     * @return GetMaxAttemptsPerDayResponse
     */
    public GetMaxAttemptsPerDayResponse getMaxAttemptsPerDay(GetMaxAttemptsPerDayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMaxAttemptsPerDayWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取号码库模板下载链接</p>
     * 
     * @param request GetNumberDistrictInfoTemplateDownloadUrlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetNumberDistrictInfoTemplateDownloadUrlResponse
     */
    public GetNumberDistrictInfoTemplateDownloadUrlResponse getNumberDistrictInfoTemplateDownloadUrlWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetNumberDistrictInfoTemplateDownloadUrl"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetNumberDistrictInfoTemplateDownloadUrlResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取号码库模板下载链接</p>
     * @return GetNumberDistrictInfoTemplateDownloadUrlResponse
     */
    public GetNumberDistrictInfoTemplateDownloadUrlResponse getNumberDistrictInfoTemplateDownloadUrl() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getNumberDistrictInfoTemplateDownloadUrlWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>GetRealtimeConcurrencyReport</p>
     * 
     * @param request GetRealtimeConcurrencyReportRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRealtimeConcurrencyReportResponse
     */
    public GetRealtimeConcurrencyReportResponse getRealtimeConcurrencyReportWithOptions(GetRealtimeConcurrencyReportRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRealtimeConcurrencyReport"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRealtimeConcurrencyReportResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>GetRealtimeConcurrencyReport</p>
     * 
     * @param request GetRealtimeConcurrencyReportRequest
     * @return GetRealtimeConcurrencyReportResponse
     */
    public GetRealtimeConcurrencyReportResponse getRealtimeConcurrencyReport(GetRealtimeConcurrencyReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRealtimeConcurrencyReportWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>GetSummaryInfo</p>
     * 
     * @param request GetSummaryInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSummaryInfoResponse
     */
    public GetSummaryInfoResponse getSummaryInfoWithOptions(GetSummaryInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceIdList)) {
            query.put("InstanceIdList", request.instanceIdList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSummaryInfo"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSummaryInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>GetSummaryInfo</p>
     * 
     * @param request GetSummaryInfoRequest
     * @return GetSummaryInfoResponse
     */
    public GetSummaryInfoResponse getSummaryInfo(GetSummaryInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSummaryInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>根据TaskId获取Task信息</p>
     * 
     * @param request GetTaskByUuidRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTaskByUuidResponse
     */
    public GetTaskByUuidResponse getTaskByUuidWithOptions(GetTaskByUuidRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTaskByUuid"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTaskByUuidResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>根据TaskId获取Task信息</p>
     * 
     * @param request GetTaskByUuidRequest
     * @return GetTaskByUuidResponse
     */
    public GetTaskByUuidResponse getTaskByUuid(GetTaskByUuidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTaskByUuidWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>GetVersion</p>
     * 
     * @param request GetVersionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetVersionResponse
     */
    public GetVersionResponse getVersionWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetVersion"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>GetVersion</p>
     * @return GetVersionResponse
     */
    public GetVersionResponse getVersion() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getVersionWithOptions(runtime);
    }

    /**
     * @param request ImportScriptRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ImportScriptResponse
     */
    public ImportScriptResponse importScriptWithOptions(ImportScriptRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nluEngine)) {
            query.put("NluEngine", request.nluEngine);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signatureUrl)) {
            query.put("SignatureUrl", request.signatureUrl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ImportScript"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ImportScriptResponse());
    }

    /**
     * @param request ImportScriptRequest
     * @return ImportScriptResponse
     */
    public ImportScriptResponse importScript(ImportScriptRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.importScriptWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>InflightTaskTimeout</p>
     * 
     * @param request InflightTaskTimeoutRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return InflightTaskTimeoutResponse
     */
    public InflightTaskTimeoutResponse inflightTaskTimeoutWithOptions(InflightTaskTimeoutRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceOwnerId)) {
            query.put("InstanceOwnerId", request.instanceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InflightTaskTimeout"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InflightTaskTimeoutResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>InflightTaskTimeout</p>
     * 
     * @param request InflightTaskTimeoutRequest
     * @return InflightTaskTimeoutResponse
     */
    public InflightTaskTimeoutResponse inflightTaskTimeout(InflightTaskTimeoutRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.inflightTaskTimeoutWithOptions(request, runtime);
    }

    /**
     * @param request ListAgentProfilesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAgentProfilesResponse
     */
    public ListAgentProfilesResponse listAgentProfilesWithOptions(ListAgentProfilesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appIp)) {
            body.put("AppIp", request.appIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptId)) {
            body.put("ScriptId", request.scriptId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAgentProfiles"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAgentProfilesResponse());
    }

    /**
     * @param request ListAgentProfilesRequest
     * @return ListAgentProfilesResponse
     */
    public ListAgentProfilesResponse listAgentProfiles(ListAgentProfilesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAgentProfilesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>租户绑定号码列表</p>
     * 
     * @param request ListAllTenantBindNumberBindingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAllTenantBindNumberBindingResponse
     */
    public ListAllTenantBindNumberBindingResponse listAllTenantBindNumberBindingWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAllTenantBindNumberBinding"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAllTenantBindNumberBindingResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>租户绑定号码列表</p>
     * @return ListAllTenantBindNumberBindingResponse
     */
    public ListAllTenantBindNumberBindingResponse listAllTenantBindNumberBinding() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAllTenantBindNumberBindingWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>标注中心</p>
     * 
     * @param request ListAnnotationMissionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAnnotationMissionResponse
     */
    public ListAnnotationMissionResponse listAnnotationMissionWithOptions(ListAnnotationMissionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.annotationMissionId)) {
            query.put("AnnotationMissionId", request.annotationMissionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.annotationMissionName)) {
            query.put("AnnotationMissionName", request.annotationMissionName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.annotationStatusListFilter)) {
            query.put("AnnotationStatusListFilter", request.annotationStatusListFilter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.annotationStatusListStringFilter)) {
            query.put("AnnotationStatusListStringFilter", request.annotationStatusListStringFilter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createTimeEndFilter)) {
            query.put("CreateTimeEndFilter", request.createTimeEndFilter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createTimeStartFilter)) {
            query.put("CreateTimeStartFilter", request.createTimeStartFilter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            query.put("PageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAnnotationMission"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAnnotationMissionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>标注中心</p>
     * 
     * @param request ListAnnotationMissionRequest
     * @return ListAnnotationMissionResponse
     */
    public ListAnnotationMissionResponse listAnnotationMission(ListAnnotationMissionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAnnotationMissionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ListAnnotationMissionSession</p>
     * 
     * @param request ListAnnotationMissionSessionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAnnotationMissionSessionResponse
     */
    public ListAnnotationMissionSessionResponse listAnnotationMissionSessionWithOptions(ListAnnotationMissionSessionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.annotationMissionId)) {
            query.put("AnnotationMissionId", request.annotationMissionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.annotationMissionSessionId)) {
            query.put("AnnotationMissionSessionId", request.annotationMissionSessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.environment)) {
            query.put("Environment", request.environment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includeStatusListJsonString)) {
            query.put("IncludeStatusListJsonString", request.includeStatusListJsonString);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            query.put("PageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAnnotationMissionSession"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAnnotationMissionSessionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>ListAnnotationMissionSession</p>
     * 
     * @param request ListAnnotationMissionSessionRequest
     * @return ListAnnotationMissionSessionResponse
     */
    public ListAnnotationMissionSessionResponse listAnnotationMissionSession(ListAnnotationMissionSessionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAnnotationMissionSessionWithOptions(request, runtime);
    }

    /**
     * @param request ListApiPluginsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListApiPluginsResponse
     */
    public ListApiPluginsResponse listApiPluginsWithOptions(ListApiPluginsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uuidsJson)) {
            query.put("UuidsJson", request.uuidsJson);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListApiPlugins"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListApiPluginsResponse());
    }

    /**
     * @param request ListApiPluginsRequest
     * @return ListApiPluginsResponse
     */
    public ListApiPluginsResponse listApiPlugins(ListApiPluginsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listApiPluginsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ListBeebotIntent</p>
     * 
     * @param request ListBeebotIntentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListBeebotIntentResponse
     */
    public ListBeebotIntentResponse listBeebotIntentWithOptions(ListBeebotIntentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.intentName)) {
            query.put("IntentName", request.intentName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptId)) {
            query.put("ScriptId", request.scriptId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListBeebotIntent"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListBeebotIntentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>ListBeebotIntent</p>
     * 
     * @param request ListBeebotIntentRequest
     * @return ListBeebotIntentResponse
     */
    public ListBeebotIntentResponse listBeebotIntent(ListBeebotIntentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listBeebotIntentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ListBeebotIntentLgf</p>
     * 
     * @param request ListBeebotIntentLgfRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListBeebotIntentLgfResponse
     */
    public ListBeebotIntentLgfResponse listBeebotIntentLgfWithOptions(ListBeebotIntentLgfRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.intentId)) {
            query.put("IntentId", request.intentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lgfText)) {
            query.put("LgfText", request.lgfText);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptId)) {
            query.put("ScriptId", request.scriptId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListBeebotIntentLgf"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListBeebotIntentLgfResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>ListBeebotIntentLgf</p>
     * 
     * @param request ListBeebotIntentLgfRequest
     * @return ListBeebotIntentLgfResponse
     */
    public ListBeebotIntentLgfResponse listBeebotIntentLgf(ListBeebotIntentLgfRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listBeebotIntentLgfWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ListBeebotIntentUserSay</p>
     * 
     * @param request ListBeebotIntentUserSayRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListBeebotIntentUserSayResponse
     */
    public ListBeebotIntentUserSayResponse listBeebotIntentUserSayWithOptions(ListBeebotIntentUserSayRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            query.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.intentId)) {
            query.put("IntentId", request.intentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptId)) {
            query.put("ScriptId", request.scriptId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListBeebotIntentUserSay"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListBeebotIntentUserSayResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>ListBeebotIntentUserSay</p>
     * 
     * @param request ListBeebotIntentUserSayRequest
     * @return ListBeebotIntentUserSayResponse
     */
    public ListBeebotIntentUserSayResponse listBeebotIntentUserSay(ListBeebotIntentUserSayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listBeebotIntentUserSayWithOptions(request, runtime);
    }

    /**
     * @param request ListChatbotInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListChatbotInstancesResponse
     */
    public ListChatbotInstancesResponse listChatbotInstancesWithOptions(ListChatbotInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListChatbotInstances"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListChatbotInstancesResponse());
    }

    /**
     * @param request ListChatbotInstancesRequest
     * @return ListChatbotInstancesResponse
     */
    public ListChatbotInstancesResponse listChatbotInstances(ListChatbotInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listChatbotInstancesWithOptions(request, runtime);
    }

    /**
     * @param request ListDialogueFlowsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDialogueFlowsResponse
     */
    public ListDialogueFlowsResponse listDialogueFlowsWithOptions(ListDialogueFlowsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptId)) {
            query.put("ScriptId", request.scriptId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDialogueFlows"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDialogueFlowsResponse());
    }

    /**
     * @param request ListDialogueFlowsRequest
     * @return ListDialogueFlowsResponse
     */
    public ListDialogueFlowsResponse listDialogueFlows(ListDialogueFlowsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDialogueFlowsWithOptions(request, runtime);
    }

    /**
     * @param request ListDownloadTasksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDownloadTasksResponse
     */
    public ListDownloadTasksResponse listDownloadTasksWithOptions(ListDownloadTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDownloadTasks"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDownloadTasksResponse());
    }

    /**
     * @param request ListDownloadTasksRequest
     * @return ListDownloadTasksResponse
     */
    public ListDownloadTasksResponse listDownloadTasks(ListDownloadTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDownloadTasksWithOptions(request, runtime);
    }

    /**
     * @param request ListFlashSmsTemplatesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListFlashSmsTemplatesResponse
     */
    public ListFlashSmsTemplatesResponse listFlashSmsTemplatesWithOptions(ListFlashSmsTemplatesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFlashSmsTemplates"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFlashSmsTemplatesResponse());
    }

    /**
     * @param request ListFlashSmsTemplatesRequest
     * @return ListFlashSmsTemplatesResponse
     */
    public ListFlashSmsTemplatesResponse listFlashSmsTemplates(ListFlashSmsTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listFlashSmsTemplatesWithOptions(request, runtime);
    }

    /**
     * @param request ListGlobalQuestionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListGlobalQuestionsResponse
     */
    public ListGlobalQuestionsResponse listGlobalQuestionsWithOptions(ListGlobalQuestionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptId)) {
            query.put("ScriptId", request.scriptId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListGlobalQuestions"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListGlobalQuestionsResponse());
    }

    /**
     * @param request ListGlobalQuestionsRequest
     * @return ListGlobalQuestionsResponse
     */
    public ListGlobalQuestionsResponse listGlobalQuestions(ListGlobalQuestionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listGlobalQuestionsWithOptions(request, runtime);
    }

    /**
     * @param request ListInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListInstancesResponse
     */
    public ListInstancesResponse listInstancesWithOptions(ListInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInstances"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInstancesResponse());
    }

    /**
     * @param request ListInstancesRequest
     * @return ListInstancesResponse
     */
    public ListInstancesResponse listInstances(ListInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listInstancesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>意图列表</p>
     * 
     * @param request ListIntentionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListIntentionsResponse
     */
    public ListIntentionsResponse listIntentionsWithOptions(ListIntentionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.annotationMissionDataSourceType)) {
            query.put("AnnotationMissionDataSourceType", request.annotationMissionDataSourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.botId)) {
            query.put("BotId", request.botId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.environment)) {
            query.put("Environment", request.environment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.intentId)) {
            query.put("IntentId", request.intentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            query.put("PageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptId)) {
            query.put("ScriptId", request.scriptId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userNick)) {
            query.put("UserNick", request.userNick);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListIntentions"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListIntentionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>意图列表</p>
     * 
     * @param request ListIntentionsRequest
     * @return ListIntentionsResponse
     */
    public ListIntentionsResponse listIntentions(ListIntentionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listIntentionsWithOptions(request, runtime);
    }

    /**
     * @param request ListIntentsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListIntentsResponse
     */
    public ListIntentsResponse listIntentsWithOptions(ListIntentsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptId)) {
            query.put("ScriptId", request.scriptId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListIntents"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListIntentsResponse());
    }

    /**
     * @param request ListIntentsRequest
     * @return ListIntentsResponse
     */
    public ListIntentsResponse listIntents(ListIntentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listIntentsWithOptions(request, runtime);
    }

    /**
     * @param request ListJobGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListJobGroupsResponse
     */
    public ListJobGroupsResponse listJobGroupsWithOptions(ListJobGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.asyncQuery)) {
            query.put("AsyncQuery", request.asyncQuery);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobGroupStatusFilter)) {
            query.put("JobGroupStatusFilter", request.jobGroupStatusFilter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.onlyMinConcurrencyEnabled)) {
            query.put("OnlyMinConcurrencyEnabled", request.onlyMinConcurrencyEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchText)) {
            query.put("SearchText", request.searchText);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListJobGroups"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListJobGroupsResponse());
    }

    /**
     * @param request ListJobGroupsRequest
     * @return ListJobGroupsResponse
     */
    public ListJobGroupsResponse listJobGroups(ListJobGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listJobGroupsWithOptions(request, runtime);
    }

    /**
     * @param request ListJobGroupsAsyncRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListJobGroupsAsyncResponse
     */
    public ListJobGroupsAsyncResponse listJobGroupsAsyncWithOptions(ListJobGroupsAsyncRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListJobGroupsAsync"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListJobGroupsAsyncResponse());
    }

    /**
     * @param request ListJobGroupsAsyncRequest
     * @return ListJobGroupsAsyncResponse
     */
    public ListJobGroupsAsyncResponse listJobGroupsAsync(ListJobGroupsAsyncRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listJobGroupsAsyncWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ListJobs</p>
     * 
     * @param request ListJobsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListJobsResponse
     */
    public ListJobsResponse listJobsWithOptions(ListJobsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListJobs"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListJobsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>ListJobs</p>
     * 
     * @param request ListJobsRequest
     * @return ListJobsResponse
     */
    public ListJobsResponse listJobs(ListJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listJobsWithOptions(request, runtime);
    }

    /**
     * @param request ListJobsByGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListJobsByGroupResponse
     */
    public ListJobsByGroupResponse listJobsByGroupWithOptions(ListJobsByGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobFailureReason)) {
            query.put("JobFailureReason", request.jobFailureReason);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobGroupId)) {
            query.put("JobGroupId", request.jobGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobStatus)) {
            query.put("JobStatus", request.jobStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListJobsByGroup"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListJobsByGroupResponse());
    }

    /**
     * @param request ListJobsByGroupRequest
     * @return ListJobsByGroupResponse
     */
    public ListJobsByGroupResponse listJobsByGroup(ListJobsByGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listJobsByGroupWithOptions(request, runtime);
    }

    /**
     * @param request ListOutboundCallNumbersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListOutboundCallNumbersResponse
     */
    public ListOutboundCallNumbersResponse listOutboundCallNumbersWithOptions(ListOutboundCallNumbersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListOutboundCallNumbers"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListOutboundCallNumbersResponse());
    }

    /**
     * @param request ListOutboundCallNumbersRequest
     * @return ListOutboundCallNumbersResponse
     */
    public ListOutboundCallNumbersResponse listOutboundCallNumbers(ListOutboundCallNumbersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listOutboundCallNumbersWithOptions(request, runtime);
    }

    /**
     * @param request ListResourceTagsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListResourceTagsResponse
     */
    public ListResourceTagsResponse listResourceTagsWithOptions(ListResourceTagsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListResourceTags"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListResourceTagsResponse());
    }

    /**
     * @param request ListResourceTagsRequest
     * @return ListResourceTagsResponse
     */
    public ListResourceTagsResponse listResourceTags(ListResourceTagsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listResourceTagsWithOptions(request, runtime);
    }

    /**
     * @param request ListScriptPublishHistoriesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListScriptPublishHistoriesResponse
     */
    public ListScriptPublishHistoriesResponse listScriptPublishHistoriesWithOptions(ListScriptPublishHistoriesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptId)) {
            query.put("ScriptId", request.scriptId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListScriptPublishHistories"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListScriptPublishHistoriesResponse());
    }

    /**
     * @param request ListScriptPublishHistoriesRequest
     * @return ListScriptPublishHistoriesResponse
     */
    public ListScriptPublishHistoriesResponse listScriptPublishHistories(ListScriptPublishHistoriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listScriptPublishHistoriesWithOptions(request, runtime);
    }

    /**
     * @param request ListScriptRecordingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListScriptRecordingResponse
     */
    public ListScriptRecordingResponse listScriptRecordingWithOptions(ListScriptRecordingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.refIdsJson)) {
            query.put("RefIdsJson", request.refIdsJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptId)) {
            query.put("ScriptId", request.scriptId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.search)) {
            query.put("Search", request.search);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statesJson)) {
            query.put("StatesJson", request.statesJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uuidsJson)) {
            query.put("UuidsJson", request.uuidsJson);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListScriptRecording"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListScriptRecordingResponse());
    }

    /**
     * @param request ListScriptRecordingRequest
     * @return ListScriptRecordingResponse
     */
    public ListScriptRecordingResponse listScriptRecording(ListScriptRecordingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listScriptRecordingWithOptions(request, runtime);
    }

    /**
     * @param request ListScriptVoiceConfigsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListScriptVoiceConfigsResponse
     */
    public ListScriptVoiceConfigsResponse listScriptVoiceConfigsWithOptions(ListScriptVoiceConfigsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptId)) {
            query.put("ScriptId", request.scriptId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListScriptVoiceConfigs"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListScriptVoiceConfigsResponse());
    }

    /**
     * @param request ListScriptVoiceConfigsRequest
     * @return ListScriptVoiceConfigsResponse
     */
    public ListScriptVoiceConfigsResponse listScriptVoiceConfigs(ListScriptVoiceConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listScriptVoiceConfigsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <ul>
     * <li></li>
     * </ul>
     * 
     * @param request ListScriptsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListScriptsResponse
     */
    public ListScriptsResponse listScriptsWithOptions(ListScriptsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nluEngine)) {
            query.put("NluEngine", request.nluEngine);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptName)) {
            query.put("ScriptName", request.scriptName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListScripts"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListScriptsResponse());
    }

    /**
     * <b>summary</b> : 
     * <ul>
     * <li></li>
     * </ul>
     * 
     * @param request ListScriptsRequest
     * @return ListScriptsResponse
     */
    public ListScriptsResponse listScripts(ListScriptsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listScriptsWithOptions(request, runtime);
    }

    /**
     * @param request ListTagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTagResources"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTagResourcesResponse());
    }

    /**
     * @param request ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    /**
     * @param request ListTagsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTagsResponse
     */
    public ListTagsResponse listTagsWithOptions(ListTagsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptId)) {
            query.put("ScriptId", request.scriptId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTags"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTagsResponse());
    }

    /**
     * @param request ListTagsRequest
     * @return ListTagsResponse
     */
    public ListTagsResponse listTags(ListTagsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagsWithOptions(request, runtime);
    }

    /**
     * @param tmpReq ModifyAgentProfileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyAgentProfileResponse
     */
    public ModifyAgentProfileResponse modifyAgentProfileWithOptions(ModifyAgentProfileRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifyAgentProfileShrinkRequest request = new ModifyAgentProfileShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.faqCategoryIds)) {
            request.faqCategoryIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.faqCategoryIds, "FaqCategoryIds", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentProfileId)) {
            body.put("AgentProfileId", request.agentProfileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apiPluginJson)) {
            body.put("ApiPluginJson", request.apiPluginJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.faqCategoryIdsShrink)) {
            body.put("FaqCategoryIds", request.faqCategoryIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instructionJson)) {
            body.put("InstructionJson", request.instructionJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labelsJson)) {
            body.put("LabelsJson", request.labelsJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.model)) {
            body.put("Model", request.model);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelConfig)) {
            body.put("ModelConfig", request.modelConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prompt)) {
            body.put("Prompt", request.prompt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promptJson)) {
            body.put("PromptJson", request.promptJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scenario)) {
            body.put("Scenario", request.scenario);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.variablesJson)) {
            body.put("VariablesJson", request.variablesJson);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyAgentProfile"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyAgentProfileResponse());
    }

    /**
     * @param request ModifyAgentProfileRequest
     * @return ModifyAgentProfileResponse
     */
    public ModifyAgentProfileResponse modifyAgentProfile(ModifyAgentProfileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAgentProfileWithOptions(request, runtime);
    }

    /**
     * @param request ModifyAnnotationMissionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyAnnotationMissionResponse
     */
    public ModifyAnnotationMissionResponse modifyAnnotationMissionWithOptions(ModifyAnnotationMissionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.annotationMissionId)) {
            query.put("AnnotationMissionId", request.annotationMissionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.annotationMissionName)) {
            query.put("AnnotationMissionName", request.annotationMissionName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.annotationStatus)) {
            query.put("AnnotationStatus", request.annotationStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.delete)) {
            query.put("Delete", request.delete);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyAnnotationMission"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyAnnotationMissionResponse());
    }

    /**
     * @param request ModifyAnnotationMissionRequest
     * @return ModifyAnnotationMissionResponse
     */
    public ModifyAnnotationMissionResponse modifyAnnotationMission(ModifyAnnotationMissionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAnnotationMissionWithOptions(request, runtime);
    }

    /**
     * @param request ModifyBatchJobsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyBatchJobsResponse
     */
    public ModifyBatchJobsResponse modifyBatchJobsWithOptions(ModifyBatchJobsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.batchJobName)) {
            query.put("BatchJobName", request.batchJobName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callingNumber)) {
            query.put("CallingNumber", request.callingNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobFilePath)) {
            query.put("JobFilePath", request.jobFilePath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobGroupId)) {
            query.put("JobGroupId", request.jobGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scenarioId)) {
            query.put("ScenarioId", request.scenarioId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptId)) {
            query.put("ScriptId", request.scriptId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strategyJson)) {
            query.put("StrategyJson", request.strategyJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.submitted)) {
            query.put("Submitted", request.submitted);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyBatchJobs"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyBatchJobsResponse());
    }

    /**
     * @param request ModifyBatchJobsRequest
     * @return ModifyBatchJobsResponse
     */
    public ModifyBatchJobsResponse modifyBatchJobs(ModifyBatchJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyBatchJobsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ModifyBeebotIntent</p>
     * 
     * @param tmpReq ModifyBeebotIntentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyBeebotIntentResponse
     */
    public ModifyBeebotIntentResponse modifyBeebotIntentWithOptions(ModifyBeebotIntentRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifyBeebotIntentShrinkRequest request = new ModifyBeebotIntentShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.intentDefinition)) {
            request.intentDefinitionShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.intentDefinition, "IntentDefinition", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.intentDefinitionShrink)) {
            query.put("IntentDefinition", request.intentDefinitionShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.intentId)) {
            query.put("IntentId", request.intentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptId)) {
            query.put("ScriptId", request.scriptId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyBeebotIntent"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyBeebotIntentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>ModifyBeebotIntent</p>
     * 
     * @param request ModifyBeebotIntentRequest
     * @return ModifyBeebotIntentResponse
     */
    public ModifyBeebotIntentResponse modifyBeebotIntent(ModifyBeebotIntentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyBeebotIntentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ModifyBeebotIntentLgf</p>
     * 
     * @param tmpReq ModifyBeebotIntentLgfRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyBeebotIntentLgfResponse
     */
    public ModifyBeebotIntentLgfResponse modifyBeebotIntentLgfWithOptions(ModifyBeebotIntentLgfRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifyBeebotIntentLgfShrinkRequest request = new ModifyBeebotIntentLgfShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.lgfDefinition)) {
            request.lgfDefinitionShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.lgfDefinition, "LgfDefinition", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lgfDefinitionShrink)) {
            query.put("LgfDefinition", request.lgfDefinitionShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lgfId)) {
            query.put("LgfId", request.lgfId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptId)) {
            query.put("ScriptId", request.scriptId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyBeebotIntentLgf"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyBeebotIntentLgfResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>ModifyBeebotIntentLgf</p>
     * 
     * @param request ModifyBeebotIntentLgfRequest
     * @return ModifyBeebotIntentLgfResponse
     */
    public ModifyBeebotIntentLgfResponse modifyBeebotIntentLgf(ModifyBeebotIntentLgfRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyBeebotIntentLgfWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ModifyBeebotIntentUserSay</p>
     * 
     * @param tmpReq ModifyBeebotIntentUserSayRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyBeebotIntentUserSayResponse
     */
    public ModifyBeebotIntentUserSayResponse modifyBeebotIntentUserSayWithOptions(ModifyBeebotIntentUserSayRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifyBeebotIntentUserSayShrinkRequest request = new ModifyBeebotIntentUserSayShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userSayDefinition)) {
            request.userSayDefinitionShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userSayDefinition, "UserSayDefinition", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptId)) {
            query.put("ScriptId", request.scriptId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userSayDefinitionShrink)) {
            query.put("UserSayDefinition", request.userSayDefinitionShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userSayId)) {
            query.put("UserSayId", request.userSayId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyBeebotIntentUserSay"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyBeebotIntentUserSayResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>ModifyBeebotIntentUserSay</p>
     * 
     * @param request ModifyBeebotIntentUserSayRequest
     * @return ModifyBeebotIntentUserSayResponse
     */
    public ModifyBeebotIntentUserSayResponse modifyBeebotIntentUserSay(ModifyBeebotIntentUserSayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyBeebotIntentUserSayWithOptions(request, runtime);
    }

    /**
     * @param request ModifyDialogueFlowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDialogueFlowResponse
     */
    public ModifyDialogueFlowResponse modifyDialogueFlowWithOptions(ModifyDialogueFlowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dialogueFlowDefinition)) {
            query.put("DialogueFlowDefinition", request.dialogueFlowDefinition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dialogueFlowId)) {
            query.put("DialogueFlowId", request.dialogueFlowId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isDrafted)) {
            query.put("IsDrafted", request.isDrafted);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptId)) {
            query.put("ScriptId", request.scriptId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDialogueFlow"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDialogueFlowResponse());
    }

    /**
     * @param request ModifyDialogueFlowRequest
     * @return ModifyDialogueFlowResponse
     */
    public ModifyDialogueFlowResponse modifyDialogueFlow(ModifyDialogueFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDialogueFlowWithOptions(request, runtime);
    }

    /**
     * @param request ModifyEmptyNumberNoMoreCallsInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyEmptyNumberNoMoreCallsInfoResponse
     */
    public ModifyEmptyNumberNoMoreCallsInfoResponse modifyEmptyNumberNoMoreCallsInfoWithOptions(ModifyEmptyNumberNoMoreCallsInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.emptyNumberNoMoreCalls)) {
            query.put("EmptyNumberNoMoreCalls", request.emptyNumberNoMoreCalls);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entryId)) {
            query.put("EntryId", request.entryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strategyLevel)) {
            query.put("StrategyLevel", request.strategyLevel);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyEmptyNumberNoMoreCallsInfo"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyEmptyNumberNoMoreCallsInfoResponse());
    }

    /**
     * @param request ModifyEmptyNumberNoMoreCallsInfoRequest
     * @return ModifyEmptyNumberNoMoreCallsInfoResponse
     */
    public ModifyEmptyNumberNoMoreCallsInfoResponse modifyEmptyNumberNoMoreCallsInfo(ModifyEmptyNumberNoMoreCallsInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyEmptyNumberNoMoreCallsInfoWithOptions(request, runtime);
    }

    /**
     * @param request ModifyGlobalQuestionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyGlobalQuestionResponse
     */
    public ModifyGlobalQuestionResponse modifyGlobalQuestionWithOptions(ModifyGlobalQuestionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.answers)) {
            query.put("Answers", request.answers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.globalQuestionId)) {
            query.put("GlobalQuestionId", request.globalQuestionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.globalQuestionName)) {
            query.put("GlobalQuestionName", request.globalQuestionName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.globalQuestionType)) {
            query.put("GlobalQuestionType", request.globalQuestionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.questions)) {
            query.put("Questions", request.questions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptId)) {
            query.put("ScriptId", request.scriptId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyGlobalQuestion"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyGlobalQuestionResponse());
    }

    /**
     * @param request ModifyGlobalQuestionRequest
     * @return ModifyGlobalQuestionResponse
     */
    public ModifyGlobalQuestionResponse modifyGlobalQuestion(ModifyGlobalQuestionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyGlobalQuestionWithOptions(request, runtime);
    }

    /**
     * @param request ModifyInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyInstanceResponse
     */
    public ModifyInstanceResponse modifyInstanceWithOptions(ModifyInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callingNumber)) {
            query.put("CallingNumber", request.callingNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceDescription)) {
            query.put("InstanceDescription", request.instanceDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxConcurrentConversation)) {
            query.put("MaxConcurrentConversation", request.maxConcurrentConversation);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyInstance"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyInstanceResponse());
    }

    /**
     * @param request ModifyInstanceRequest
     * @return ModifyInstanceResponse
     */
    public ModifyInstanceResponse modifyInstance(ModifyInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyInstanceWithOptions(request, runtime);
    }

    /**
     * @param request ModifyIntentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyIntentResponse
     */
    public ModifyIntentResponse modifyIntentWithOptions(ModifyIntentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.intentDescription)) {
            query.put("IntentDescription", request.intentDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.intentId)) {
            query.put("IntentId", request.intentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.intentName)) {
            query.put("IntentName", request.intentName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keywords)) {
            query.put("Keywords", request.keywords);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptId)) {
            query.put("ScriptId", request.scriptId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.utterances)) {
            query.put("Utterances", request.utterances);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyIntent"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyIntentResponse());
    }

    /**
     * @param request ModifyIntentRequest
     * @return ModifyIntentResponse
     */
    public ModifyIntentResponse modifyIntent(ModifyIntentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyIntentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改任务组</p>
     * 
     * @param request ModifyJobGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyJobGroupResponse
     */
    public ModifyJobGroupResponse modifyJobGroupWithOptions(ModifyJobGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callingNumber)) {
            query.put("CallingNumber", request.callingNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flashSmsExtras)) {
            query.put("FlashSmsExtras", request.flashSmsExtras);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobGroupId)) {
            query.put("JobGroupId", request.jobGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobGroupStatus)) {
            query.put("JobGroupStatus", request.jobGroupStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minConcurrency)) {
            query.put("MinConcurrency", request.minConcurrency);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            query.put("Priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recallCallingNumber)) {
            query.put("RecallCallingNumber", request.recallCallingNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recallStrategyJson)) {
            query.put("RecallStrategyJson", request.recallStrategyJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ringingDuration)) {
            query.put("RingingDuration", request.ringingDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scenarioId)) {
            query.put("ScenarioId", request.scenarioId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptId)) {
            query.put("ScriptId", request.scriptId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strategyJson)) {
            query.put("StrategyJson", request.strategyJson);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyJobGroup"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyJobGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改任务组</p>
     * 
     * @param request ModifyJobGroupRequest
     * @return ModifyJobGroupResponse
     */
    public ModifyJobGroupResponse modifyJobGroup(ModifyJobGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyJobGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ModifyOutboundCallNumber</p>
     * 
     * @param request ModifyOutboundCallNumberRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyOutboundCallNumberResponse
     */
    public ModifyOutboundCallNumberResponse modifyOutboundCallNumberWithOptions(ModifyOutboundCallNumberRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.number)) {
            query.put("Number", request.number);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outboundCallNumberId)) {
            query.put("OutboundCallNumberId", request.outboundCallNumberId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rateLimitCount)) {
            query.put("RateLimitCount", request.rateLimitCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rateLimitPeriod)) {
            query.put("RateLimitPeriod", request.rateLimitPeriod);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyOutboundCallNumber"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyOutboundCallNumberResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>ModifyOutboundCallNumber</p>
     * 
     * @param request ModifyOutboundCallNumberRequest
     * @return ModifyOutboundCallNumberResponse
     */
    public ModifyOutboundCallNumberResponse modifyOutboundCallNumber(ModifyOutboundCallNumberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyOutboundCallNumberWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改场景</p>
     * 
     * @param request ModifyScriptRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyScriptResponse
     */
    public ModifyScriptResponse modifyScriptWithOptions(ModifyScriptRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentId)) {
            query.put("AgentId", request.agentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.agentLlm)) {
            query.put("AgentLlm", request.agentLlm);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.asrConfig)) {
            query.put("AsrConfig", request.asrConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chatConfig)) {
            query.put("ChatConfig", request.chatConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chatbotId)) {
            query.put("ChatbotId", request.chatbotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.emotionEnable)) {
            query.put("EmotionEnable", request.emotionEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.industry)) {
            query.put("Industry", request.industry);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labelConfig)) {
            query.put("LabelConfig", request.labelConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.longWaitEnable)) {
            query.put("LongWaitEnable", request.longWaitEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.miniPlaybackConfigListJsonString)) {
            query.put("MiniPlaybackConfigListJsonString", request.miniPlaybackConfigListJsonString);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.miniPlaybackEnable)) {
            query.put("MiniPlaybackEnable", request.miniPlaybackEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newBargeInEnable)) {
            query.put("NewBargeInEnable", request.newBargeInEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nlsConfig)) {
            query.put("NlsConfig", request.nlsConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nluAccessType)) {
            query.put("NluAccessType", request.nluAccessType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nluEngine)) {
            query.put("NluEngine", request.nluEngine);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scene)) {
            query.put("Scene", request.scene);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptContent)) {
            query.put("ScriptContent", request.scriptContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptDescription)) {
            query.put("ScriptDescription", request.scriptDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptId)) {
            query.put("ScriptId", request.scriptId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptName)) {
            query.put("ScriptName", request.scriptName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptWaveform)) {
            query.put("ScriptWaveform", request.scriptWaveform);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ttsConfig)) {
            query.put("TtsConfig", request.ttsConfig);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyScript"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyScriptResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改场景</p>
     * 
     * @param request ModifyScriptRequest
     * @return ModifyScriptResponse
     */
    public ModifyScriptResponse modifyScript(ModifyScriptRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyScriptWithOptions(request, runtime);
    }

    /**
     * @param request ModifyScriptVoiceConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyScriptVoiceConfigResponse
     */
    public ModifyScriptVoiceConfigResponse modifyScriptVoiceConfigWithOptions(ModifyScriptVoiceConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptId)) {
            query.put("ScriptId", request.scriptId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptVoiceConfigId)) {
            query.put("ScriptVoiceConfigId", request.scriptVoiceConfigId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptWaveformRelation)) {
            query.put("ScriptWaveformRelation", request.scriptWaveformRelation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyScriptVoiceConfig"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyScriptVoiceConfigResponse());
    }

    /**
     * @param request ModifyScriptVoiceConfigRequest
     * @return ModifyScriptVoiceConfigResponse
     */
    public ModifyScriptVoiceConfigResponse modifyScriptVoiceConfig(ModifyScriptVoiceConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyScriptVoiceConfigWithOptions(request, runtime);
    }

    /**
     * @param request ModifyTTSConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyTTSConfigResponse
     */
    public ModifyTTSConfigResponse modifyTTSConfigWithOptions(ModifyTTSConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appKey)) {
            query.put("AppKey", request.appKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nlsServiceType)) {
            query.put("NlsServiceType", request.nlsServiceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pitchRate)) {
            query.put("PitchRate", request.pitchRate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptId)) {
            query.put("ScriptId", request.scriptId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.speechRate)) {
            query.put("SpeechRate", request.speechRate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.voice)) {
            query.put("Voice", request.voice);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.volume)) {
            query.put("Volume", request.volume);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyTTSConfig"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyTTSConfigResponse());
    }

    /**
     * @param request ModifyTTSConfigRequest
     * @return ModifyTTSConfigResponse
     */
    public ModifyTTSConfigResponse modifyTTSConfig(ModifyTTSConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyTTSConfigWithOptions(request, runtime);
    }

    /**
     * @param request ModifyTagGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyTagGroupsResponse
     */
    public ModifyTagGroupsResponse modifyTagGroupsWithOptions(ModifyTagGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptId)) {
            query.put("ScriptId", request.scriptId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagGroups)) {
            query.put("TagGroups", request.tagGroups);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyTagGroups"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyTagGroupsResponse());
    }

    /**
     * @param request ModifyTagGroupsRequest
     * @return ModifyTagGroupsResponse
     */
    public ModifyTagGroupsResponse modifyTagGroups(ModifyTagGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyTagGroupsWithOptions(request, runtime);
    }

    /**
     * @param request PublishScriptRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PublishScriptResponse
     */
    public PublishScriptResponse publishScriptWithOptions(PublishScriptRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptId)) {
            query.put("ScriptId", request.scriptId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PublishScript"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PublishScriptResponse());
    }

    /**
     * @param request PublishScriptRequest
     * @return PublishScriptResponse
     */
    public PublishScriptResponse publishScript(PublishScriptRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.publishScriptWithOptions(request, runtime);
    }

    /**
     * @param request PublishScriptForDebugRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PublishScriptForDebugResponse
     */
    public PublishScriptForDebugResponse publishScriptForDebugWithOptions(PublishScriptForDebugRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptId)) {
            query.put("ScriptId", request.scriptId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PublishScriptForDebug"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PublishScriptForDebugResponse());
    }

    /**
     * @param request PublishScriptForDebugRequest
     * @return PublishScriptForDebugResponse
     */
    public PublishScriptForDebugResponse publishScriptForDebug(PublishScriptForDebugRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.publishScriptForDebugWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>QueryJobs</p>
     * 
     * @param request QueryJobsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryJobsResponse
     */
    public QueryJobsResponse queryJobsWithOptions(QueryJobsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactName)) {
            query.put("ContactName", request.contactName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobGroupId)) {
            query.put("JobGroupId", request.jobGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumber)) {
            query.put("PhoneNumber", request.phoneNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scenarioId)) {
            query.put("ScenarioId", request.scenarioId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeAlignment)) {
            query.put("TimeAlignment", request.timeAlignment);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryJobs"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryJobsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>QueryJobs</p>
     * 
     * @param request QueryJobsRequest
     * @return QueryJobsResponse
     */
    public QueryJobsResponse queryJobs(QueryJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryJobsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取外呼任务结果信息</p>
     * 
     * @param request QueryJobsWithResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryJobsWithResultResponse
     */
    public QueryJobsWithResultResponse queryJobsWithResultWithOptions(QueryJobsWithResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endActualTimeFilter)) {
            query.put("EndActualTimeFilter", request.endActualTimeFilter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hasAnsweredFilter)) {
            query.put("HasAnsweredFilter", request.hasAnsweredFilter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hasHangUpByRejectionFilter)) {
            query.put("HasHangUpByRejectionFilter", request.hasHangUpByRejectionFilter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hasReachedEndOfFlowFilter)) {
            query.put("HasReachedEndOfFlowFilter", request.hasReachedEndOfFlowFilter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobFailureReasonsFilter)) {
            query.put("JobFailureReasonsFilter", request.jobFailureReasonsFilter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobGroupId)) {
            query.put("JobGroupId", request.jobGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobStatusFilter)) {
            query.put("JobStatusFilter", request.jobStatusFilter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labelsJson)) {
            query.put("LabelsJson", request.labelsJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryText)) {
            query.put("QueryText", request.queryText);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startActualTimeFilter)) {
            query.put("StartActualTimeFilter", request.startActualTimeFilter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskStatusFilter)) {
            query.put("TaskStatusFilter", request.taskStatusFilter);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryJobsWithResult"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryJobsWithResultResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取外呼任务结果信息</p>
     * 
     * @param request QueryJobsWithResultRequest
     * @return QueryJobsWithResultResponse
     */
    public QueryJobsWithResultResponse queryJobsWithResult(QueryJobsWithResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryJobsWithResultWithOptions(request, runtime);
    }

    /**
     * @param request QueryScriptWaveformsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryScriptWaveformsResponse
     */
    public QueryScriptWaveformsResponse queryScriptWaveformsWithOptions(QueryScriptWaveformsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptContent)) {
            query.put("ScriptContent", request.scriptContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptId)) {
            query.put("ScriptId", request.scriptId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryScriptWaveforms"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryScriptWaveformsResponse());
    }

    /**
     * @param request QueryScriptWaveformsRequest
     * @return QueryScriptWaveformsResponse
     */
    public QueryScriptWaveformsResponse queryScriptWaveforms(QueryScriptWaveformsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryScriptWaveformsWithOptions(request, runtime);
    }

    /**
     * @param request QueryScriptsByStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryScriptsByStatusResponse
     */
    public QueryScriptsByStatusResponse queryScriptsByStatusWithOptions(QueryScriptsByStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statusList)) {
            query.put("StatusList", request.statusList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryScriptsByStatus"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryScriptsByStatusResponse());
    }

    /**
     * @param request QueryScriptsByStatusRequest
     * @return QueryScriptsByStatusResponse
     */
    public QueryScriptsByStatusResponse queryScriptsByStatus(QueryScriptsByStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryScriptsByStatusWithOptions(request, runtime);
    }

    /**
     * @param request RecordFailureRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RecordFailureResponse
     */
    public RecordFailureResponse recordFailureWithOptions(RecordFailureRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.actualTime)) {
            query.put("ActualTime", request.actualTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callId)) {
            query.put("CallId", request.callId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.calledNumber)) {
            query.put("CalledNumber", request.calledNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callingNumber)) {
            query.put("CallingNumber", request.callingNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dispositionCode)) {
            query.put("DispositionCode", request.dispositionCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.exceptionCodes)) {
            query.put("ExceptionCodes", request.exceptionCodes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecordFailure"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecordFailureResponse());
    }

    /**
     * @param request RecordFailureRequest
     * @return RecordFailureResponse
     */
    public RecordFailureResponse recordFailure(RecordFailureRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recordFailureWithOptions(request, runtime);
    }

    /**
     * @param request ResumeJobsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResumeJobsResponse
     */
    public ResumeJobsResponse resumeJobsWithOptions(ResumeJobsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.all)) {
            query.put("All", request.all);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobGroupId)) {
            query.put("JobGroupId", request.jobGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobReferenceId)) {
            query.put("JobReferenceId", request.jobReferenceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scenarioId)) {
            query.put("ScenarioId", request.scenarioId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResumeJobs"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResumeJobsResponse());
    }

    /**
     * @param request ResumeJobsRequest
     * @return ResumeJobsResponse
     */
    public ResumeJobsResponse resumeJobs(ResumeJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resumeJobsWithOptions(request, runtime);
    }

    /**
     * @param request RollbackScriptRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RollbackScriptResponse
     */
    public RollbackScriptResponse rollbackScriptWithOptions(RollbackScriptRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rollbackVersion)) {
            query.put("RollbackVersion", request.rollbackVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptId)) {
            query.put("ScriptId", request.scriptId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RollbackScript"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RollbackScriptResponse());
    }

    /**
     * @param request RollbackScriptRequest
     * @return RollbackScriptResponse
     */
    public RollbackScriptResponse rollbackScript(RollbackScriptRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.rollbackScriptWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>保存接听后延迟播报时间</p>
     * 
     * @param request SaveAfterAnswerDelayPlaybackRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveAfterAnswerDelayPlaybackResponse
     */
    public SaveAfterAnswerDelayPlaybackResponse saveAfterAnswerDelayPlaybackWithOptions(SaveAfterAnswerDelayPlaybackRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.afterAnswerDelayPlayback)) {
            query.put("AfterAnswerDelayPlayback", request.afterAnswerDelayPlayback);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entryId)) {
            query.put("EntryId", request.entryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strategyLevel)) {
            query.put("StrategyLevel", request.strategyLevel);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveAfterAnswerDelayPlayback"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveAfterAnswerDelayPlaybackResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>保存接听后延迟播报时间</p>
     * 
     * @param request SaveAfterAnswerDelayPlaybackRequest
     * @return SaveAfterAnswerDelayPlaybackResponse
     */
    public SaveAfterAnswerDelayPlaybackResponse saveAfterAnswerDelayPlayback(SaveAfterAnswerDelayPlaybackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveAfterAnswerDelayPlaybackWithOptions(request, runtime);
    }

    /**
     * @param request SaveAnnotationMissionSessionListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveAnnotationMissionSessionListResponse
     */
    public SaveAnnotationMissionSessionListResponse saveAnnotationMissionSessionListWithOptions(SaveAnnotationMissionSessionListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentId)) {
            query.put("AgentId", request.agentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.annotationMissionDataSourceType)) {
            query.put("AnnotationMissionDataSourceType", request.annotationMissionDataSourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.annotationMissionSessionList)) {
            query.put("AnnotationMissionSessionList", request.annotationMissionSessionList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.annotationMissionSessionListJsonString)) {
            query.put("AnnotationMissionSessionListJsonString", request.annotationMissionSessionListJsonString);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.environment)) {
            query.put("Environment", request.environment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userNick)) {
            query.put("UserNick", request.userNick);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveAnnotationMissionSessionList"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveAnnotationMissionSessionListResponse());
    }

    /**
     * @param request SaveAnnotationMissionSessionListRequest
     * @return SaveAnnotationMissionSessionListResponse
     */
    public SaveAnnotationMissionSessionListResponse saveAnnotationMissionSessionList(SaveAnnotationMissionSessionListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveAnnotationMissionSessionListWithOptions(request, runtime);
    }

    /**
     * @param request SaveAnnotationMissionTagInfoListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveAnnotationMissionTagInfoListResponse
     */
    public SaveAnnotationMissionTagInfoListResponse saveAnnotationMissionTagInfoListWithOptions(SaveAnnotationMissionTagInfoListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.annotationMissionTagInfoList)) {
            query.put("AnnotationMissionTagInfoList", request.annotationMissionTagInfoList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.annotationMissionTagInfoListJsonString)) {
            query.put("AnnotationMissionTagInfoListJsonString", request.annotationMissionTagInfoListJsonString);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reset)) {
            query.put("Reset", request.reset);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveAnnotationMissionTagInfoList"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveAnnotationMissionTagInfoListResponse());
    }

    /**
     * @param request SaveAnnotationMissionTagInfoListRequest
     * @return SaveAnnotationMissionTagInfoListResponse
     */
    public SaveAnnotationMissionTagInfoListResponse saveAnnotationMissionTagInfoList(SaveAnnotationMissionTagInfoListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveAnnotationMissionTagInfoListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>编辑基础策略有效时间窗口</p>
     * 
     * @param request SaveBaseStrategyPeriodRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveBaseStrategyPeriodResponse
     */
    public SaveBaseStrategyPeriodResponse saveBaseStrategyPeriodWithOptions(SaveBaseStrategyPeriodRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.entryId)) {
            query.put("EntryId", request.entryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.onlyWeekdays)) {
            query.put("OnlyWeekdays", request.onlyWeekdays);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.onlyWorkdays)) {
            query.put("OnlyWorkdays", request.onlyWorkdays);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strategyLevel)) {
            query.put("StrategyLevel", request.strategyLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workingTime)) {
            query.put("WorkingTime", request.workingTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workingTimeFramesJson)) {
            query.put("WorkingTimeFramesJson", request.workingTimeFramesJson);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveBaseStrategyPeriod"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveBaseStrategyPeriodResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>编辑基础策略有效时间窗口</p>
     * 
     * @param request SaveBaseStrategyPeriodRequest
     * @return SaveBaseStrategyPeriodResponse
     */
    public SaveBaseStrategyPeriodResponse saveBaseStrategyPeriod(SaveBaseStrategyPeriodRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveBaseStrategyPeriodWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>保存外呼黑名单列表</p>
     * 
     * @param request SaveContactBlockListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveContactBlockListResponse
     */
    public SaveContactBlockListResponse saveContactBlockListWithOptions(SaveContactBlockListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactBlockListList)) {
            query.put("ContactBlockListList", request.contactBlockListList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactBlockListsJson)) {
            query.put("ContactBlockListsJson", request.contactBlockListsJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveContactBlockList"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveContactBlockListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>保存外呼黑名单列表</p>
     * 
     * @param request SaveContactBlockListRequest
     * @return SaveContactBlockListResponse
     */
    public SaveContactBlockListResponse saveContactBlockList(SaveContactBlockListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveContactBlockListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>保存外呼白名单</p>
     * 
     * @param request SaveContactWhiteListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveContactWhiteListResponse
     */
    public SaveContactWhiteListResponse saveContactWhiteListWithOptions(SaveContactWhiteListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactWhiteListList)) {
            query.put("ContactWhiteListList", request.contactWhiteListList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactWhiteListsJson)) {
            query.put("ContactWhiteListsJson", request.contactWhiteListsJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveContactWhiteList"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveContactWhiteListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>保存外呼白名单</p>
     * 
     * @param request SaveContactWhiteListRequest
     * @return SaveContactWhiteListResponse
     */
    public SaveContactWhiteListResponse saveContactWhiteList(SaveContactWhiteListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveContactWhiteListWithOptions(request, runtime);
    }

    /**
     * @param request SaveEffectiveDaysRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveEffectiveDaysResponse
     */
    public SaveEffectiveDaysResponse saveEffectiveDaysWithOptions(SaveEffectiveDaysRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.effectiveDays)) {
            query.put("EffectiveDays", request.effectiveDays);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entryId)) {
            query.put("EntryId", request.entryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strategyLevel)) {
            query.put("StrategyLevel", request.strategyLevel);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveEffectiveDays"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveEffectiveDaysResponse());
    }

    /**
     * @param request SaveEffectiveDaysRequest
     * @return SaveEffectiveDaysResponse
     */
    public SaveEffectiveDaysResponse saveEffectiveDays(SaveEffectiveDaysRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveEffectiveDaysWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>保存每日最大外呼量</p>
     * 
     * @param request SaveMaxAttemptsPerDayRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveMaxAttemptsPerDayResponse
     */
    public SaveMaxAttemptsPerDayResponse saveMaxAttemptsPerDayWithOptions(SaveMaxAttemptsPerDayRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.entryId)) {
            query.put("EntryId", request.entryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxAttemptsPerDay)) {
            query.put("MaxAttemptsPerDay", request.maxAttemptsPerDay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strategyLevel)) {
            query.put("StrategyLevel", request.strategyLevel);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveMaxAttemptsPerDay"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveMaxAttemptsPerDayResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>保存每日最大外呼量</p>
     * 
     * @param request SaveMaxAttemptsPerDayRequest
     * @return SaveMaxAttemptsPerDayResponse
     */
    public SaveMaxAttemptsPerDayResponse saveMaxAttemptsPerDay(SaveMaxAttemptsPerDayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveMaxAttemptsPerDayWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>外呼历史查询</p>
     * 
     * @param request SearchTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SearchTaskResponse
     */
    public SearchTaskResponse searchTaskWithOptions(SearchTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchTask"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>外呼历史查询</p>
     * 
     * @param request SearchTaskRequest
     * @return SearchTaskResponse
     */
    public SearchTaskResponse searchTask(SearchTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>开启一个任务</p>
     * 
     * @param request StartJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartJobResponse
     */
    public StartJobResponse startJobWithOptions(StartJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callingNumber)) {
            query.put("CallingNumber", request.callingNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobGroupId)) {
            query.put("JobGroupId", request.jobGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobJson)) {
            query.put("JobJson", request.jobJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scenarioId)) {
            query.put("ScenarioId", request.scenarioId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptId)) {
            query.put("ScriptId", request.scriptId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartJob"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>开启一个任务</p>
     * 
     * @param request StartJobRequest
     * @return StartJobResponse
     */
    public StartJobResponse startJob(StartJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startJobWithOptions(request, runtime);
    }

    /**
     * @param request SubmitBatchJobsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitBatchJobsResponse
     */
    public SubmitBatchJobsResponse submitBatchJobsWithOptions(SubmitBatchJobsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobGroupId)) {
            query.put("JobGroupId", request.jobGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitBatchJobs"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitBatchJobsResponse());
    }

    /**
     * @param request SubmitBatchJobsRequest
     * @return SubmitBatchJobsResponse
     */
    public SubmitBatchJobsResponse submitBatchJobs(SubmitBatchJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitBatchJobsWithOptions(request, runtime);
    }

    /**
     * @param request SubmitRecordingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitRecordingResponse
     */
    public SubmitRecordingResponse submitRecordingWithOptions(SubmitRecordingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mergedRecording)) {
            query.put("MergedRecording", request.mergedRecording);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceRecording)) {
            query.put("ResourceRecording", request.resourceRecording);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitRecording"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitRecordingResponse());
    }

    /**
     * @param request SubmitRecordingRequest
     * @return SubmitRecordingResponse
     */
    public SubmitRecordingResponse submitRecording(SubmitRecordingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitRecordingWithOptions(request, runtime);
    }

    /**
     * @param request SubmitScriptReviewRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitScriptReviewResponse
     */
    public SubmitScriptReviewResponse submitScriptReviewWithOptions(SubmitScriptReviewRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.from)) {
            query.put("From", request.from);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptId)) {
            query.put("ScriptId", request.scriptId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitScriptReview"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitScriptReviewResponse());
    }

    /**
     * @param request SubmitScriptReviewRequest
     * @return SubmitScriptReviewResponse
     */
    public SubmitScriptReviewResponse submitScriptReview(SubmitScriptReviewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitScriptReviewWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>止呼</p>
     * 
     * @param request SuspendCallRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SuspendCallResponse
     */
    public SuspendCallResponse suspendCallWithOptions(SuspendCallRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.calledNumbers)) {
            query.put("CalledNumbers", request.calledNumbers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SuspendCall"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SuspendCallResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>止呼</p>
     * 
     * @param request SuspendCallRequest
     * @return SuspendCallResponse
     */
    public SuspendCallResponse suspendCall(SuspendCallRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.suspendCallWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>SuspendCallWithFile</p>
     * 
     * @param request SuspendCallWithFileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SuspendCallWithFileResponse
     */
    public SuspendCallWithFileResponse suspendCallWithFileWithOptions(SuspendCallWithFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filePath)) {
            query.put("FilePath", request.filePath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SuspendCallWithFile"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SuspendCallWithFileResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>SuspendCallWithFile</p>
     * 
     * @param request SuspendCallWithFileRequest
     * @return SuspendCallWithFileResponse
     */
    public SuspendCallWithFileResponse suspendCallWithFile(SuspendCallWithFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.suspendCallWithFileWithOptions(request, runtime);
    }

    /**
     * @param request SuspendJobsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SuspendJobsResponse
     */
    public SuspendJobsResponse suspendJobsWithOptions(SuspendJobsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.all)) {
            query.put("All", request.all);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobGroupId)) {
            query.put("JobGroupId", request.jobGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobReferenceId)) {
            query.put("JobReferenceId", request.jobReferenceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scenarioId)) {
            query.put("ScenarioId", request.scenarioId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SuspendJobs"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SuspendJobsResponse());
    }

    /**
     * @param request SuspendJobsRequest
     * @return SuspendJobsResponse
     */
    public SuspendJobsResponse suspendJobs(SuspendJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.suspendJobsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li></li>
     * </ul>
     * 
     * @param request TagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TagResources"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TagResourcesResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li></li>
     * </ul>
     * 
     * @param request TagResourcesRequest
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>TaskPreparing</p>
     * 
     * @param request TaskPreparingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TaskPreparingResponse
     */
    public TaskPreparingResponse taskPreparingWithOptions(TaskPreparingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceOwnerId)) {
            query.put("InstanceOwnerId", request.instanceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TaskPreparing"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TaskPreparingResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>TaskPreparing</p>
     * 
     * @param request TaskPreparingRequest
     * @return TaskPreparingResponse
     */
    public TaskPreparingResponse taskPreparing(TaskPreparingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.taskPreparingWithOptions(request, runtime);
    }

    /**
     * @param request TerminateCallRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TerminateCallResponse
     */
    public TerminateCallResponse terminateCallWithOptions(TerminateCallRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callId)) {
            query.put("CallId", request.callId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TerminateCall"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TerminateCallResponse());
    }

    /**
     * @param request TerminateCallRequest
     * @return TerminateCallResponse
     */
    public TerminateCallResponse terminateCall(TerminateCallRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.terminateCallWithOptions(request, runtime);
    }

    /**
     * @param request UntagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UntagResourcesResponse
     */
    public UntagResourcesResponse untagResourcesWithOptions(UntagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.all)) {
            query.put("All", request.all);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagKey)) {
            query.put("TagKey", request.tagKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UntagResources"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UntagResourcesResponse());
    }

    /**
     * @param request UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.untagResourcesWithOptions(request, runtime);
    }

    /**
     * @param request UploadScriptRecordingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UploadScriptRecordingResponse
     */
    public UploadScriptRecordingResponse uploadScriptRecordingWithOptions(UploadScriptRecordingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            query.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileId)) {
            query.put("FileId", request.fileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            query.put("FileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptId)) {
            query.put("ScriptId", request.scriptId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UploadScriptRecording"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UploadScriptRecordingResponse());
    }

    /**
     * @param request UploadScriptRecordingRequest
     * @return UploadScriptRecordingResponse
     */
    public UploadScriptRecordingResponse uploadScriptRecording(UploadScriptRecordingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.uploadScriptRecordingWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <hr>
     * 
     * <b>summary</b> : 
     * <p>WithdrawScriptReview</p>
     * 
     * @param request WithdrawScriptReviewRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return WithdrawScriptReviewResponse
     */
    public WithdrawScriptReviewResponse withdrawScriptReviewWithOptions(WithdrawScriptReviewRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptId)) {
            query.put("ScriptId", request.scriptId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "WithdrawScriptReview"),
            new TeaPair("version", "2019-12-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new WithdrawScriptReviewResponse());
    }

    /**
     * <b>description</b> :
     * <hr>
     * 
     * <b>summary</b> : 
     * <p>WithdrawScriptReview</p>
     * 
     * @param request WithdrawScriptReviewRequest
     * @return WithdrawScriptReviewResponse
     */
    public WithdrawScriptReviewResponse withdrawScriptReview(WithdrawScriptReviewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.withdrawScriptReviewWithOptions(request, runtime);
    }
}
