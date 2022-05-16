// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112;

import com.aliyun.tea.*;
import com.aliyun.paiplugin20220112.models.*;
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
        this._endpoint = this.getEndpoint("paiplugin", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * 注册运营活动。
     */
    public CreateCampaignResponse createCampaign(CreateCampaignRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createCampaignWithOptions(request, headers, runtime);
    }

    public CreateCampaignResponse createCampaignWithOptions(CreateCampaignRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            body.put("Remark", request.remark);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCampaign"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/campaigns"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCampaignResponse());
    }

    /**
     * 注册人群。
     */
    public CreateGroupResponse createGroup(CreateGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createGroupWithOptions(request, headers, runtime);
    }

    public CreateGroupResponse createGroupWithOptions(CreateGroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.algorithm)) {
            body.put("Algorithm", request.algorithm);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.column)) {
            body.put("Column", request.column);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            body.put("Filter", request.filter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inferenceJobId)) {
            body.put("InferenceJobId", request.inferenceJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumber)) {
            body.put("PhoneNumber", request.phoneNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.project)) {
            body.put("Project", request.project);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            body.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            body.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.table)) {
            body.put("Table", request.table);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.text)) {
            body.put("Text", request.text);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uri)) {
            body.put("Uri", request.uri);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateGroup"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/groups"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateGroupResponse());
    }

    /**
     * 注册预测任务。
     */
    public CreateInferenceJobResponse createInferenceJob(CreateInferenceJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createInferenceJobWithOptions(request, headers, runtime);
    }

    public CreateInferenceJobResponse createInferenceJobWithOptions(CreateInferenceJobRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.algorithm)) {
            body.put("Algorithm", request.algorithm);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.campaignId)) {
            body.put("CampaignId", request.campaignId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataPath)) {
            body.put("DataPath", request.dataPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            body.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetPath)) {
            body.put("TargetPath", request.targetPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trainingJobId)) {
            body.put("TrainingJobId", request.trainingJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userConfig)) {
            body.put("UserConfig", request.userConfig);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateInferenceJob"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/inference/jobs"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateInferenceJobResponse());
    }

    /**
     * 注册触达计划。
     */
    public CreateScheduleResponse createSchedule(CreateScheduleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createScheduleWithOptions(request, headers, runtime);
    }

    public CreateScheduleResponse createScheduleWithOptions(CreateScheduleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executeTime)) {
            body.put("ExecuteTime", request.executeTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            body.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repeatCycle)) {
            body.put("RepeatCycle", request.repeatCycle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repeatCycleUnit)) {
            body.put("RepeatCycleUnit", request.repeatCycleUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repeatTimes)) {
            body.put("RepeatTimes", request.repeatTimes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signName)) {
            body.put("SignName", request.signName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signatureId)) {
            body.put("SignatureId", request.signatureId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateCode)) {
            body.put("TemplateCode", request.templateCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            body.put("TemplateId", request.templateId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSchedule"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/schedules"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateScheduleResponse());
    }

    /**
     * 注册签名。
    
     */
    public CreateSignatureResponse createSignature(CreateSignatureRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSignatureWithOptions(request, headers, runtime);
    }

    public CreateSignatureResponse createSignatureWithOptions(CreateSignatureRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSignature"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/signatures"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSignatureResponse());
    }

    /**
     * 注册模板。
    
     */
    public CreateTemplateResponse createTemplate(CreateTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createTemplateWithOptions(request, headers, runtime);
    }

    public CreateTemplateResponse createTemplateWithOptions(CreateTemplateRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signature)) {
            body.put("Signature", request.signature);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signatureId)) {
            body.put("SignatureId", request.signatureId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTemplate"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/templates"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTemplateResponse());
    }

    /**
     * 注册训练任务。
    
     */
    public CreateTrainingJobResponse createTrainingJob(CreateTrainingJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createTrainingJobWithOptions(request, headers, runtime);
    }

    public CreateTrainingJobResponse createTrainingJobWithOptions(CreateTrainingJobRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.algorithm)) {
            body.put("Algorithm", request.algorithm);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.campaignId)) {
            body.put("CampaignId", request.campaignId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataPath)) {
            body.put("DataPath", request.dataPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            body.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userConfig)) {
            body.put("UserConfig", request.userConfig);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTrainingJob"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/training/jobs"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTrainingJobResponse());
    }

    /**
     * 删除运营活动
    
     */
    public DeleteCampaignResponse deleteCampaign(String Id) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteCampaignWithOptions(Id, headers, runtime);
    }

    public DeleteCampaignResponse deleteCampaignWithOptions(String Id, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        Id = com.aliyun.openapiutil.Client.getEncodeParam(Id);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCampaign"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/campaigns/" + Id + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCampaignResponse());
    }

    /**
     * 删除人群
    
     */
    public DeleteGroupResponse deleteGroup(String Id) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteGroupWithOptions(Id, headers, runtime);
    }

    public DeleteGroupResponse deleteGroupWithOptions(String Id, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        Id = com.aliyun.openapiutil.Client.getEncodeParam(Id);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteGroup"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/groups/" + Id + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteGroupResponse());
    }

    /**
     * 删除预测任务。
     */
    public DeleteInferenceJobResponse deleteInferenceJob(String Id) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteInferenceJobWithOptions(Id, headers, runtime);
    }

    public DeleteInferenceJobResponse deleteInferenceJobWithOptions(String Id, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        Id = com.aliyun.openapiutil.Client.getEncodeParam(Id);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteInferenceJob"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/inference/jobs/" + Id + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteInferenceJobResponse());
    }

    /**
     * 删除触达计划。
    
     */
    public DeleteScheduleResponse deleteSchedule(String Id) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteScheduleWithOptions(Id, headers, runtime);
    }

    public DeleteScheduleResponse deleteScheduleWithOptions(String Id, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        Id = com.aliyun.openapiutil.Client.getEncodeParam(Id);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSchedule"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/schedules/" + Id + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteScheduleResponse());
    }

    /**
     * 删除签名。
    
     */
    public DeleteSignatureResponse deleteSignature(String Id) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteSignatureWithOptions(Id, headers, runtime);
    }

    public DeleteSignatureResponse deleteSignatureWithOptions(String Id, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        Id = com.aliyun.openapiutil.Client.getEncodeParam(Id);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSignature"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/signatures/" + Id + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSignatureResponse());
    }

    /**
     * 删除模板
    
     */
    public DeleteTemplateResponse deleteTemplate(String Id) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteTemplateWithOptions(Id, headers, runtime);
    }

    public DeleteTemplateResponse deleteTemplateWithOptions(String Id, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        Id = com.aliyun.openapiutil.Client.getEncodeParam(Id);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTemplate"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/templates/" + Id + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTemplateResponse());
    }

    /**
     * 删除训练任务。
     */
    public DeleteTrainingJobResponse deleteTrainingJob(String Id) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteTrainingJobWithOptions(Id, headers, runtime);
    }

    public DeleteTrainingJobResponse deleteTrainingJobWithOptions(String Id, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        Id = com.aliyun.openapiutil.Client.getEncodeParam(Id);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTrainingJob"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/training/jobs/" + Id + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTrainingJobResponse());
    }

    /**
     * 获取算法详情。
     */
    public GetAlgorithmResponse getAlgorithm(String Id) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAlgorithmWithOptions(Id, headers, runtime);
    }

    public GetAlgorithmResponse getAlgorithmWithOptions(String Id, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        Id = com.aliyun.openapiutil.Client.getEncodeParam(Id);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAlgorithm"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/algorithms/" + Id + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAlgorithmResponse());
    }

    /**
     * 获取运营活动详情。
     */
    public GetCampaignResponse getCampaign(String Id) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getCampaignWithOptions(Id, headers, runtime);
    }

    public GetCampaignResponse getCampaignWithOptions(String Id, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        Id = com.aliyun.openapiutil.Client.getEncodeParam(Id);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCampaign"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/campaigns/" + Id + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCampaignResponse());
    }

    /**
     * 获取人群详情。
     */
    public GetGroupResponse getGroup(String Id) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getGroupWithOptions(Id, headers, runtime);
    }

    public GetGroupResponse getGroupWithOptions(String Id, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        Id = com.aliyun.openapiutil.Client.getEncodeParam(Id);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetGroup"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/groups/" + Id + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetGroupResponse());
    }

    /**
     * 获取预测任务详情。
     */
    public GetInferenceJobResponse getInferenceJob(String Id) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getInferenceJobWithOptions(Id, headers, runtime);
    }

    public GetInferenceJobResponse getInferenceJobWithOptions(String Id, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        Id = com.aliyun.openapiutil.Client.getEncodeParam(Id);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInferenceJob"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/inference/jobs/" + Id + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInferenceJobResponse());
    }

    /**
     * 获取短信配置。
     */
    public GetMessageConfigResponse getMessageConfig() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMessageConfigWithOptions(headers, runtime);
    }

    public GetMessageConfigResponse getMessageConfigWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMessageConfig"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/users/messageConfig"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMessageConfigResponse());
    }

    /**
     * 获取触达计划详情。
     */
    public GetScheduleResponse getSchedule(String Id) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getScheduleWithOptions(Id, headers, runtime);
    }

    public GetScheduleResponse getScheduleWithOptions(String Id, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        Id = com.aliyun.openapiutil.Client.getEncodeParam(Id);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSchedule"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/schedules/" + Id + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetScheduleResponse());
    }

    /**
     * 获取签名详情。
     */
    public GetSignatureResponse getSignature(String Id) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSignatureWithOptions(Id, headers, runtime);
    }

    public GetSignatureResponse getSignatureWithOptions(String Id, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        Id = com.aliyun.openapiutil.Client.getEncodeParam(Id);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSignature"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/signatures/" + Id + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSignatureResponse());
    }

    /**
     * 获取模板详情。
     */
    public GetTemplateResponse getTemplate(String Id) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTemplateWithOptions(Id, headers, runtime);
    }

    public GetTemplateResponse getTemplateWithOptions(String Id, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        Id = com.aliyun.openapiutil.Client.getEncodeParam(Id);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTemplate"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/templates/" + Id + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTemplateResponse());
    }

    /**
     * 获取训练任务详情。
     */
    public GetTrainingJobResponse getTrainingJob(String Id) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTrainingJobWithOptions(Id, headers, runtime);
    }

    public GetTrainingJobResponse getTrainingJobWithOptions(String Id, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        Id = com.aliyun.openapiutil.Client.getEncodeParam(Id);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTrainingJob"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/training/jobs/" + Id + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTrainingJobResponse());
    }

    /**
     * 获取账号状态。
     */
    public GetUserResponse getUser() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getUserWithOptions(headers, runtime);
    }

    public GetUserResponse getUserWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUser"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/users"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUserResponse());
    }

    /**
     * 获取算法列表。
     */
    public ListAlgorithmsResponse listAlgorithms(ListAlgorithmsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAlgorithmsWithOptions(request, headers, runtime);
    }

    public ListAlgorithmsResponse listAlgorithmsWithOptions(ListAlgorithmsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAlgorithms"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/algorithms"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAlgorithmsResponse());
    }

    /**
     * 获取运营活动列表。
     */
    public ListCampaignsResponse listCampaigns(ListCampaignsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listCampaignsWithOptions(request, headers, runtime);
    }

    public ListCampaignsResponse listCampaignsWithOptions(ListCampaignsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCampaigns"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/campaigns"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCampaignsResponse());
    }

    /**
     * 获取人群列表。
     */
    public ListGroupsResponse listGroups(ListGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listGroupsWithOptions(request, headers, runtime);
    }

    public ListGroupsResponse listGroupsWithOptions(ListGroupsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumber)) {
            query.put("PhoneNumber", request.phoneNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListGroups"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/groups"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListGroupsResponse());
    }

    /**
     * 获取预测任务列表。
     */
    public ListInferenceJobsResponse listInferenceJobs(ListInferenceJobsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listInferenceJobsWithOptions(request, headers, runtime);
    }

    public ListInferenceJobsResponse listInferenceJobsWithOptions(ListInferenceJobsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.campaignId)) {
            query.put("CampaignId", request.campaignId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInferenceJobs"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/inference/jobs"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInferenceJobsResponse());
    }

    /**
     * 获取短信发送统计列表。
    获取短信发送统计数据，可按指定条件获取分类别详细数据，返回数据按日期顺序排列，发送统计为空的日期默认不返回。
    发送数据在48小时内会随实际短信发送状态不断更新，最终数据以48小时后数据为准。
     */
    public ListMessageMetricsResponse listMessageMetrics(ListMessageMetricsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listMessageMetricsWithOptions(request, headers, runtime);
    }

    public ListMessageMetricsResponse listMessageMetricsWithOptions(ListMessageMetricsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleId)) {
            query.put("ScheduleId", request.scheduleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signature)) {
            query.put("Signature", request.signature);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signatureId)) {
            query.put("SignatureId", request.signatureId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateCode)) {
            query.put("TemplateCode", request.templateCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateType)) {
            query.put("TemplateType", request.templateType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMessageMetrics"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/messages/metrics"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMessageMetricsResponse());
    }

    /**
     * 查询短信发送详情列表。
     */
    public ListMessagesResponse listMessages(ListMessagesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listMessagesWithOptions(request, headers, runtime);
    }

    public ListMessagesResponse listMessagesWithOptions(ListMessagesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.datetime)) {
            query.put("Datetime", request.datetime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.errorCode)) {
            query.put("ErrorCode", request.errorCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.messageId)) {
            query.put("MessageId", request.messageId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            query.put("RequestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleId)) {
            query.put("ScheduleId", request.scheduleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signature)) {
            query.put("Signature", request.signature);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signatureId)) {
            query.put("SignatureId", request.signatureId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateCode)) {
            query.put("TemplateCode", request.templateCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateType)) {
            query.put("TemplateType", request.templateType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMessages"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/messages"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMessagesResponse());
    }

    /**
     * 获取触达计划列表。
     */
    public ListSchedulesResponse listSchedules(ListSchedulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSchedulesWithOptions(request, headers, runtime);
    }

    public ListSchedulesResponse listSchedulesWithOptions(ListSchedulesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSchedules"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/schedules"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSchedulesResponse());
    }

    /**
     * 获取签名列表。
     */
    public ListSignaturesResponse listSignatures(ListSignaturesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSignaturesWithOptions(request, headers, runtime);
    }

    public ListSignaturesResponse listSignaturesWithOptions(ListSignaturesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSignatures"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/signatures"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSignaturesResponse());
    }

    /**
     * 获取模板列表。
     */
    public ListTemplatesResponse listTemplates(ListTemplatesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTemplatesWithOptions(request, headers, runtime);
    }

    public ListTemplatesResponse listTemplatesWithOptions(ListTemplatesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            query.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTemplates"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/templates"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTemplatesResponse());
    }

    /**
     * 获取训练任务列表。
     */
    public ListTrainingJobsResponse listTrainingJobs(ListTrainingJobsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTrainingJobsWithOptions(request, headers, runtime);
    }

    public ListTrainingJobsResponse listTrainingJobsWithOptions(ListTrainingJobsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.campaignId)) {
            query.put("CampaignId", request.campaignId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTrainingJobs"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/training/jobs"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTrainingJobsResponse());
    }

    /**
     * 发送短信。
     */
    public SendMessageResponse sendMessage(SendMessageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.sendMessageWithOptions(request, headers, runtime);
    }

    public SendMessageResponse sendMessageWithOptions(SendMessageRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            body.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outIds)) {
            body.put("OutIds", request.outIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumbers)) {
            body.put("PhoneNumbers", request.phoneNumbers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleId)) {
            body.put("ScheduleId", request.scheduleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signName)) {
            body.put("SignName", request.signName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signatureId)) {
            body.put("SignatureId", request.signatureId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smsUpExtendCodes)) {
            body.put("SmsUpExtendCodes", request.smsUpExtendCodes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateCode)) {
            body.put("TemplateCode", request.templateCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            body.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateParams)) {
            body.put("TemplateParams", request.templateParams);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SendMessage"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/messages"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SendMessageResponse());
    }

    /**
     * 短信回执。
     */
    public SmsReportResponse smsReport(SmsReportRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.smsReportWithOptions(request, headers, runtime);
    }

    public SmsReportResponse smsReportWithOptions(SmsReportRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.teautil.Common.toArray(request.body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SmsReport"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/recall/report"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SmsReportResponse());
    }

    /**
     * 短信上行。
     */
    public SmsUpResponse smsUp(SmsUpRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.smsUpWithOptions(request, headers, runtime);
    }

    public SmsUpResponse smsUpWithOptions(SmsUpRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.teautil.Common.toArray(request.body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SmsUp"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/recall/up"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SmsUpResponse());
    }

    /**
     * 更新运营活动
     */
    public UpdateCampaignResponse updateCampaign(String Id, UpdateCampaignRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateCampaignWithOptions(Id, request, headers, runtime);
    }

    public UpdateCampaignResponse updateCampaignWithOptions(String Id, UpdateCampaignRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        Id = com.aliyun.openapiutil.Client.getEncodeParam(Id);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            body.put("Remark", request.remark);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCampaign"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/campaigns/" + Id + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCampaignResponse());
    }

    /**
     * 更新回执Url。
    
     */
    public UpdateReportUrlResponse updateReportUrl(UpdateReportUrlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateReportUrlWithOptions(request, headers, runtime);
    }

    public UpdateReportUrlResponse updateReportUrlWithOptions(UpdateReportUrlRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            body.put("Url", request.url);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateReportUrl"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/users/reportUrl"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateReportUrlResponse());
    }

    /**
     * 更新上行Url。
     */
    public UpdateUploadUrlResponse updateUploadUrl(UpdateUploadUrlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateUploadUrlWithOptions(request, headers, runtime);
    }

    public UpdateUploadUrlResponse updateUploadUrlWithOptions(UpdateUploadUrlRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            body.put("Url", request.url);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateUploadUrl"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/users/uploadUrl"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateUploadUrlResponse());
    }
}
