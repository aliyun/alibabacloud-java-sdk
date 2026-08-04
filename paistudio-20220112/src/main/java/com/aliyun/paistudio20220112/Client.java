// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112;

import com.aliyun.tea.*;
import com.aliyun.paistudio20220112.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-beijing", "pai.cn-beijing.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "pai.cn-hangzhou.data.aliyun.com"),
            new TeaPair("cn-shanghai", "pai.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "pai.cn-shenzhen.aliyuncs.com"),
            new TeaPair("cn-hongkong", "pai.cn-hongkong.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "pai.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "pai.ap-southeast-2.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "pai.ap-southeast-3.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "pai.ap-southeast-5.aliyuncs.com"),
            new TeaPair("us-east-1", "pai.us-east-1.aliyuncs.com"),
            new TeaPair("us-west-1", "pai.us-west-1.aliyuncs.com"),
            new TeaPair("eu-central-1", "pai.eu-central-1.aliyuncs.com"),
            new TeaPair("ap-south-1", "pai.ap-south-1.aliyuncs.com"),
            new TeaPair("me-east-1", "pai.me-east-1.aliyuncs.com"),
            new TeaPair("ap-northeast-1", "pai.ap-northeast-1.aliyuncs.com"),
            new TeaPair("cn-qingdao", "pai.cn-qingdao.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "pai.cn-shanghai-finance-1.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "pai.cn-wulanchabu.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "pai.cn-zhangjiakou.aliyuncs.com"),
            new TeaPair("us-southeast-1", "pai.us-southeast-1.aliyuncs.com"),
            new TeaPair("cn-zhongwei", "pai.cn-zhongwei.aliyuncs.com"),
            new TeaPair("cn-guangzhou", "pai.cn-guangzhou.aliyuncs.com"),
            new TeaPair("ap-southeast-8", "pai.ap-southeast-8.aliyuncs.com"),
            new TeaPair("ap-northeast-2", "pai.ap-northeast-2.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("paistudio", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>Checks the connection to the instance container.</p>
     * 
     * @param request CheckInstanceWebTerminalRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckInstanceWebTerminalResponse
     */
    public CheckInstanceWebTerminalResponse checkInstanceWebTerminalWithOptions(String TrainingJobId, String InstanceId, CheckInstanceWebTerminalRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.checkInfo)) {
            body.put("CheckInfo", request.checkInfo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckInstanceWebTerminal"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/trainingjobs/" + com.aliyun.openapiutil.Client.getEncodeParam(TrainingJobId) + "/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/webterminals/action/check"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckInstanceWebTerminalResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Checks the connection to the instance container.</p>
     * 
     * @param request CheckInstanceWebTerminalRequest
     * @return CheckInstanceWebTerminalResponse
     */
    public CheckInstanceWebTerminalResponse checkInstanceWebTerminal(String TrainingJobId, String InstanceId, CheckInstanceWebTerminalRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkInstanceWebTerminalWithOptions(TrainingJobId, InstanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an algorithm.</p>
     * 
     * @param request CreateAlgorithmRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAlgorithmResponse
     */
    public CreateAlgorithmResponse createAlgorithmWithOptions(CreateAlgorithmRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.algorithmDescription)) {
            body.put("AlgorithmDescription", request.algorithmDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.algorithmName)) {
            body.put("AlgorithmName", request.algorithmName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            body.put("DisplayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAlgorithm"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/algorithms"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAlgorithmResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an algorithm.</p>
     * 
     * @param request CreateAlgorithmRequest
     * @return CreateAlgorithmResponse
     */
    public CreateAlgorithmResponse createAlgorithm(CreateAlgorithmRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAlgorithmWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a version of an algorithm.</p>
     * 
     * @param tmpReq CreateAlgorithmVersionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAlgorithmVersionResponse
     */
    public CreateAlgorithmVersionResponse createAlgorithmVersionWithOptions(String AlgorithmId, String AlgorithmVersion, CreateAlgorithmVersionRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateAlgorithmVersionShrinkRequest request = new CreateAlgorithmVersionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.algorithmSpec)) {
            request.algorithmSpecShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.algorithmSpec, "AlgorithmSpec", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.algorithmSpecShrink)) {
            body.put("AlgorithmSpec", request.algorithmSpecShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAlgorithmVersion"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/algorithms/" + com.aliyun.openapiutil.Client.getEncodeParam(AlgorithmId) + "/versions/" + com.aliyun.openapiutil.Client.getEncodeParam(AlgorithmVersion) + ""),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAlgorithmVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a version of an algorithm.</p>
     * 
     * @param request CreateAlgorithmVersionRequest
     * @return CreateAlgorithmVersionResponse
     */
    public CreateAlgorithmVersionResponse createAlgorithmVersion(String AlgorithmId, String AlgorithmVersion, CreateAlgorithmVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAlgorithmVersionWithOptions(AlgorithmId, AlgorithmVersion, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can create a link to access the container of the instance.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateInstanceWebTerminalResponse
     */
    public CreateInstanceWebTerminalResponse createInstanceWebTerminalWithOptions(String TrainingJobId, String InstanceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateInstanceWebTerminal"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/trainingjobs/" + com.aliyun.openapiutil.Client.getEncodeParam(TrainingJobId) + "/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/webterminals"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateInstanceWebTerminalResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can create a link to access the container of the instance.</p>
     * @return CreateInstanceWebTerminalResponse
     */
    public CreateInstanceWebTerminalResponse createInstanceWebTerminal(String TrainingJobId, String InstanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createInstanceWebTerminalWithOptions(TrainingJobId, InstanceId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Call the <code>CreateQuota</code> operation to create a quota.</p>
     * 
     * @param request CreateQuotaRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateQuotaResponse
     */
    public CreateQuotaResponse createQuotaWithOptions(CreateQuotaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.allocateStrategy)) {
            body.put("AllocateStrategy", request.allocateStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterSpec)) {
            body.put("ClusterSpec", request.clusterSpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labels)) {
            body.put("Labels", request.labels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.min)) {
            body.put("Min", request.min);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentQuotaId)) {
            body.put("ParentQuotaId", request.parentQuotaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queueStrategy)) {
            body.put("QueueStrategy", request.queueStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.quotaConfig)) {
            body.put("QuotaConfig", request.quotaConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.quotaName)) {
            body.put("QuotaName", request.quotaName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupIds)) {
            body.put("ResourceGroupIds", request.resourceGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            body.put("ResourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateQuota"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/quotas"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateQuotaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Call the <code>CreateQuota</code> operation to create a quota.</p>
     * 
     * @param request CreateQuotaRequest
     * @return CreateQuotaResponse
     */
    public CreateQuotaResponse createQuota(CreateQuotaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createQuotaWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Use the CreateResourceGroup operation to create a resource group.</p>
     * 
     * @param request CreateResourceGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateResourceGroupResponse
     */
    public CreateResourceGroupResponse createResourceGroupWithOptions(CreateResourceGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.computingResourceProvider)) {
            body.put("ComputingResourceProvider", request.computingResourceProvider);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            body.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            body.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userVpc)) {
            body.put("UserVpc", request.userVpc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            body.put("Version", request.version);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateResourceGroup"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/resources"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateResourceGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Use the CreateResourceGroup operation to create a resource group.</p>
     * 
     * @param request CreateResourceGroupRequest
     * @return CreateResourceGroupResponse
     */
    public CreateResourceGroupResponse createResourceGroup(CreateResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createResourceGroupWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a training job.</p>
     * 
     * @param request CreateTrainingJobRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTrainingJobResponse
     */
    public CreateTrainingJobResponse createTrainingJobWithOptions(CreateTrainingJobRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.algorithmName)) {
            body.put("AlgorithmName", request.algorithmName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.algorithmProvider)) {
            body.put("AlgorithmProvider", request.algorithmProvider);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.algorithmSpec)) {
            body.put("AlgorithmSpec", request.algorithmSpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.algorithmVersion)) {
            body.put("AlgorithmVersion", request.algorithmVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.assignNodeSpec)) {
            body.put("AssignNodeSpec", request.assignNodeSpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.codeDir)) {
            body.put("CodeDir", request.codeDir);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.computeResource)) {
            body.put("ComputeResource", request.computeResource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.credentialConfig)) {
            body.put("CredentialConfig", request.credentialConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.environments)) {
            body.put("Environments", request.environments);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.experimentConfig)) {
            body.put("ExperimentConfig", request.experimentConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hyperParameters)) {
            body.put("HyperParameters", request.hyperParameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputChannels)) {
            body.put("InputChannels", request.inputChannels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labels)) {
            body.put("Labels", request.labels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputChannels)) {
            body.put("OutputChannels", request.outputChannels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            body.put("Priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pythonRequirements)) {
            body.put("PythonRequirements", request.pythonRequirements);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleArn)) {
            body.put("RoleArn", request.roleArn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduler)) {
            body.put("Scheduler", request.scheduler);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.settings)) {
            body.put("Settings", request.settings);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trainingJobDescription)) {
            body.put("TrainingJobDescription", request.trainingJobDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trainingJobName)) {
            body.put("TrainingJobName", request.trainingJobName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userVpc)) {
            body.put("UserVpc", request.userVpc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTrainingJob"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/trainingjobs"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTrainingJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a training job.</p>
     * 
     * @param request CreateTrainingJobRequest
     * @return CreateTrainingJobResponse
     */
    public CreateTrainingJobResponse createTrainingJob(CreateTrainingJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createTrainingJobWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an algorithm.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAlgorithmResponse
     */
    public DeleteAlgorithmResponse deleteAlgorithmWithOptions(String AlgorithmId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAlgorithm"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/algorithms/" + com.aliyun.openapiutil.Client.getEncodeParam(AlgorithmId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAlgorithmResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an algorithm.</p>
     * @return DeleteAlgorithmResponse
     */
    public DeleteAlgorithmResponse deleteAlgorithm(String AlgorithmId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteAlgorithmWithOptions(AlgorithmId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an algorithm version.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAlgorithmVersionResponse
     */
    public DeleteAlgorithmVersionResponse deleteAlgorithmVersionWithOptions(String AlgorithmId, String AlgorithmVersion, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAlgorithmVersion"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/algorithms/" + com.aliyun.openapiutil.Client.getEncodeParam(AlgorithmId) + "/versions/" + com.aliyun.openapiutil.Client.getEncodeParam(AlgorithmVersion) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAlgorithmVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an algorithm version.</p>
     * @return DeleteAlgorithmVersionResponse
     */
    public DeleteAlgorithmVersionResponse deleteAlgorithmVersion(String AlgorithmId, String AlgorithmVersion) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteAlgorithmVersionWithOptions(AlgorithmId, AlgorithmVersion, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a machine group.</p>
     * 
     * @deprecated OpenAPI DeleteMachineGroup is deprecated
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteMachineGroupResponse
     */
    @Deprecated
    // Deprecated
    public DeleteMachineGroupResponse deleteMachineGroupWithOptions(String MachineGroupID, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMachineGroup"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/resources/machinegroups/" + com.aliyun.openapiutil.Client.getEncodeParam(MachineGroupID) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMachineGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a machine group.</p>
     * 
     * @deprecated OpenAPI DeleteMachineGroup is deprecated
     * @return DeleteMachineGroupResponse
     */
    @Deprecated
    // Deprecated
    public DeleteMachineGroupResponse deleteMachineGroup(String MachineGroupID) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteMachineGroupWithOptions(MachineGroupID, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can delete a resource quota by using DeleteQuota.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteQuotaResponse
     */
    public DeleteQuotaResponse deleteQuotaWithOptions(String QuotaId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteQuota"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/quotas/" + com.aliyun.openapiutil.Client.getEncodeParam(QuotaId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteQuotaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can delete a resource quota by using DeleteQuota.</p>
     * @return DeleteQuotaResponse
     */
    public DeleteQuotaResponse deleteQuota(String QuotaId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteQuotaWithOptions(QuotaId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a resource group.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteResourceGroupResponse
     */
    public DeleteResourceGroupResponse deleteResourceGroupWithOptions(String ResourceGroupID, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteResourceGroup"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/resources/" + com.aliyun.openapiutil.Client.getEncodeParam(ResourceGroupID) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteResourceGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a resource group.</p>
     * @return DeleteResourceGroupResponse
     */
    public DeleteResourceGroupResponse deleteResourceGroup(String ResourceGroupID) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteResourceGroupWithOptions(ResourceGroupID, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes the specified machine group from a resource group.</p>
     * 
     * @deprecated OpenAPI DeleteResourceGroupMachineGroup is deprecated
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteResourceGroupMachineGroupResponse
     */
    @Deprecated
    // Deprecated
    public DeleteResourceGroupMachineGroupResponse deleteResourceGroupMachineGroupWithOptions(String MachineGroupID, String ResourceGroupID, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteResourceGroupMachineGroup"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/resources/" + com.aliyun.openapiutil.Client.getEncodeParam(ResourceGroupID) + "/machinegroups/" + com.aliyun.openapiutil.Client.getEncodeParam(MachineGroupID) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteResourceGroupMachineGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes the specified machine group from a resource group.</p>
     * 
     * @deprecated OpenAPI DeleteResourceGroupMachineGroup is deprecated
     * @return DeleteResourceGroupMachineGroupResponse
     */
    @Deprecated
    // Deprecated
    public DeleteResourceGroupMachineGroupResponse deleteResourceGroupMachineGroup(String MachineGroupID, String ResourceGroupID) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteResourceGroupMachineGroupWithOptions(MachineGroupID, ResourceGroupID, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a training task.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteTrainingJobResponse
     */
    public DeleteTrainingJobResponse deleteTrainingJobWithOptions(String TrainingJobId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTrainingJob"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/trainingjobs/" + com.aliyun.openapiutil.Client.getEncodeParam(TrainingJobId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTrainingJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a training task.</p>
     * @return DeleteTrainingJobResponse
     */
    public DeleteTrainingJobResponse deleteTrainingJob(String TrainingJobId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteTrainingJobWithOptions(TrainingJobId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes the labels of a training task.</p>
     * 
     * @param request DeleteTrainingJobLabelsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteTrainingJobLabelsResponse
     */
    public DeleteTrainingJobLabelsResponse deleteTrainingJobLabelsWithOptions(String TrainingJobId, DeleteTrainingJobLabelsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keys)) {
            query.put("Keys", request.keys);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTrainingJobLabels"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/trainingjobs/" + com.aliyun.openapiutil.Client.getEncodeParam(TrainingJobId) + "/labels"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTrainingJobLabelsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes the labels of a training task.</p>
     * 
     * @param request DeleteTrainingJobLabelsRequest
     * @return DeleteTrainingJobLabelsResponse
     */
    public DeleteTrainingJobLabelsResponse deleteTrainingJobLabels(String TrainingJobId, DeleteTrainingJobLabelsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteTrainingJobLabelsWithOptions(TrainingJobId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves algorithm details.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAlgorithmResponse
     */
    public GetAlgorithmResponse getAlgorithmWithOptions(String AlgorithmId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAlgorithm"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/algorithms/" + com.aliyun.openapiutil.Client.getEncodeParam(AlgorithmId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAlgorithmResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves algorithm details.</p>
     * @return GetAlgorithmResponse
     */
    public GetAlgorithmResponse getAlgorithm(String AlgorithmId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAlgorithmWithOptions(AlgorithmId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieve details about an algorithm version.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAlgorithmVersionResponse
     */
    public GetAlgorithmVersionResponse getAlgorithmVersionWithOptions(String AlgorithmId, String AlgorithmVersion, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAlgorithmVersion"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/algorithms/" + com.aliyun.openapiutil.Client.getEncodeParam(AlgorithmId) + "/versions/" + com.aliyun.openapiutil.Client.getEncodeParam(AlgorithmVersion) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAlgorithmVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieve details about an algorithm version.</p>
     * @return GetAlgorithmVersionResponse
     */
    public GetAlgorithmVersionResponse getAlgorithmVersion(String AlgorithmId, String AlgorithmVersion) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAlgorithmVersionWithOptions(AlgorithmId, AlgorithmVersion, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of a specific machine group.</p>
     * 
     * @deprecated OpenAPI GetMachineGroup is deprecated
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMachineGroupResponse
     */
    @Deprecated
    // Deprecated
    public GetMachineGroupResponse getMachineGroupWithOptions(String MachineGroupID, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMachineGroup"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/resources/machinegroups/" + com.aliyun.openapiutil.Client.getEncodeParam(MachineGroupID) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMachineGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of a specific machine group.</p>
     * 
     * @deprecated OpenAPI GetMachineGroup is deprecated
     * @return GetMachineGroupResponse
     */
    @Deprecated
    // Deprecated
    public GetMachineGroupResponse getMachineGroup(String MachineGroupID) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMachineGroupWithOptions(MachineGroupID, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call the GetNodeMetrics operation to obtain the metric information of resource group nodes.</p>
     * 
     * @deprecated OpenAPI GetNodeMetrics is deprecated
     * 
     * @param request GetNodeMetricsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetNodeMetricsResponse
     */
    @Deprecated
    // Deprecated
    public GetNodeMetricsResponse getNodeMetricsWithOptions(String ResourceGroupID, String MetricType, GetNodeMetricsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.GPUType)) {
            query.put("GPUType", request.GPUType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeStep)) {
            query.put("TimeStep", request.timeStep);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.verbose)) {
            query.put("Verbose", request.verbose);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetNodeMetrics"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/resources/" + com.aliyun.openapiutil.Client.getEncodeParam(ResourceGroupID) + "/nodemetrics/" + com.aliyun.openapiutil.Client.getEncodeParam(MetricType) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetNodeMetricsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can call the GetNodeMetrics operation to obtain the metric information of resource group nodes.</p>
     * 
     * @deprecated OpenAPI GetNodeMetrics is deprecated
     * 
     * @param request GetNodeMetricsRequest
     * @return GetNodeMetricsResponse
     */
    @Deprecated
    // Deprecated
    public GetNodeMetricsResponse getNodeMetrics(String ResourceGroupID, String MetricType, GetNodeMetricsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getNodeMetricsWithOptions(ResourceGroupID, MetricType, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Call GetQuota to retrieve the details of a resource quota. This helps you monitor current resource usage for effective resource management and planning.</p>
     * 
     * @param request GetQuotaRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetQuotaResponse
     */
    public GetQuotaResponse getQuotaWithOptions(String QuotaId, GetQuotaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.verbose)) {
            query.put("Verbose", request.verbose);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.withNodeMeta)) {
            query.put("WithNodeMeta", request.withNodeMeta);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetQuota"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/quotas/" + com.aliyun.openapiutil.Client.getEncodeParam(QuotaId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetQuotaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Call GetQuota to retrieve the details of a resource quota. This helps you monitor current resource usage for effective resource management and planning.</p>
     * 
     * @param request GetQuotaRequest
     * @return GetQuotaResponse
     */
    public GetQuotaResponse getQuota(String QuotaId, GetQuotaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getQuotaWithOptions(QuotaId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p><code>GetResourceGroup</code> retrieves details for a resource group.</p>
     * 
     * @param tmpReq GetResourceGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetResourceGroupResponse
     */
    public GetResourceGroupResponse getResourceGroupWithOptions(String ResourceGroupID, GetResourceGroupRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetResourceGroupShrinkRequest request = new GetResourceGroupShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tag)) {
            request.tagShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tag, "Tag", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.isAIWorkspaceDataEnabled)) {
            query.put("IsAIWorkspaceDataEnabled", request.isAIWorkspaceDataEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagShrink)) {
            query.put("Tag", request.tagShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetResourceGroup"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/resources/" + com.aliyun.openapiutil.Client.getEncodeParam(ResourceGroupID) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetResourceGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p><code>GetResourceGroup</code> retrieves details for a resource group.</p>
     * 
     * @param request GetResourceGroupRequest
     * @return GetResourceGroupResponse
     */
    public GetResourceGroupResponse getResourceGroup(String ResourceGroupID, GetResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getResourceGroupWithOptions(ResourceGroupID, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Call GetResourceGroupMachineGroup to retrieve the details of a machine group.</p>
     * 
     * @param tmpReq GetResourceGroupMachineGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetResourceGroupMachineGroupResponse
     */
    public GetResourceGroupMachineGroupResponse getResourceGroupMachineGroupWithOptions(String MachineGroupID, String ResourceGroupID, GetResourceGroupMachineGroupRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetResourceGroupMachineGroupShrinkRequest request = new GetResourceGroupMachineGroupShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tag)) {
            request.tagShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tag, "Tag", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tagShrink)) {
            query.put("Tag", request.tagShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetResourceGroupMachineGroup"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/resources/" + com.aliyun.openapiutil.Client.getEncodeParam(ResourceGroupID) + "/machinegroups/" + com.aliyun.openapiutil.Client.getEncodeParam(MachineGroupID) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetResourceGroupMachineGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Call GetResourceGroupMachineGroup to retrieve the details of a machine group.</p>
     * 
     * @param request GetResourceGroupMachineGroupRequest
     * @return GetResourceGroupMachineGroupResponse
     */
    public GetResourceGroupMachineGroupResponse getResourceGroupMachineGroup(String MachineGroupID, String ResourceGroupID, GetResourceGroupMachineGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getResourceGroupMachineGroupWithOptions(MachineGroupID, ResourceGroupID, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call the GetResourceGroupRequest operation to obtain the number of resources that have been allocated to a resource group.</p>
     * 
     * @deprecated OpenAPI GetResourceGroupRequest is deprecated
     * 
     * @param request GetResourceGroupRequestRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetResourceGroupRequestResponse
     */
    @Deprecated
    // Deprecated
    public GetResourceGroupRequestResponse getResourceGroupRequestWithOptions(GetResourceGroupRequestRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.podStatus)) {
            query.put("PodStatus", request.podStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupID)) {
            query.put("ResourceGroupID", request.resourceGroupID);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetResourceGroupRequest"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/resources/data/request"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetResourceGroupRequestResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can call the GetResourceGroupRequest operation to obtain the number of resources that have been allocated to a resource group.</p>
     * 
     * @deprecated OpenAPI GetResourceGroupRequest is deprecated
     * 
     * @param request GetResourceGroupRequestRequest
     * @return GetResourceGroupRequestResponse
     */
    @Deprecated
    // Deprecated
    public GetResourceGroupRequestResponse getResourceGroupRequest(GetResourceGroupRequestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getResourceGroupRequestWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call GetResourceGroupTotal to get the total resources of a Resource Group.</p>
     * 
     * @param request GetResourceGroupTotalRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetResourceGroupTotalResponse
     */
    public GetResourceGroupTotalResponse getResourceGroupTotalWithOptions(GetResourceGroupTotalRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupID)) {
            query.put("ResourceGroupID", request.resourceGroupID);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetResourceGroupTotal"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/resources/data/total"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetResourceGroupTotalResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can call GetResourceGroupTotal to get the total resources of a Resource Group.</p>
     * 
     * @param request GetResourceGroupTotalRequest
     * @return GetResourceGroupTotalResponse
     */
    public GetResourceGroupTotalResponse getResourceGroupTotal(GetResourceGroupTotalRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getResourceGroupTotalWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the historical prices of spot instances.</p>
     * 
     * @param request GetSpotPriceHistoryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSpotPriceHistoryResponse
     */
    public GetSpotPriceHistoryResponse getSpotPriceHistoryWithOptions(String InstanceType, GetSpotPriceHistoryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spotDuration)) {
            query.put("SpotDuration", request.spotDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSpotPriceHistory"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/spots/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceType) + "/pricehistory"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSpotPriceHistoryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the historical prices of spot instances.</p>
     * 
     * @param request GetSpotPriceHistoryRequest
     * @return GetSpotPriceHistoryResponse
     */
    public GetSpotPriceHistoryResponse getSpotPriceHistory(String InstanceType, GetSpotPriceHistoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSpotPriceHistoryWithOptions(InstanceType, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains a share token for a training task.</p>
     * 
     * @param request GetTokenRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTokenResponse
     */
    public GetTokenResponse getTokenWithOptions(GetTokenRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.expireTime)) {
            query.put("ExpireTime", request.expireTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trainingJobId)) {
            query.put("TrainingJobId", request.trainingJobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetToken"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/tokens"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTokenResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains a share token for a training task.</p>
     * 
     * @param request GetTokenRequest
     * @return GetTokenResponse
     */
    public GetTokenResponse getToken(GetTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTokenWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of a training job.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTrainingJobResponse
     */
    public GetTrainingJobResponse getTrainingJobWithOptions(String TrainingJobId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTrainingJob"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/trainingjobs/" + com.aliyun.openapiutil.Client.getEncodeParam(TrainingJobId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTrainingJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of a training job.</p>
     * @return GetTrainingJobResponse
     */
    public GetTrainingJobResponse getTrainingJob(String TrainingJobId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTrainingJobWithOptions(TrainingJobId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the runtime fault error message of a training node.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTrainingJobErrorInfoResponse
     */
    public GetTrainingJobErrorInfoResponse getTrainingJobErrorInfoWithOptions(String TrainingJobId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTrainingJobErrorInfo"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/trainingjobs/" + com.aliyun.openapiutil.Client.getEncodeParam(TrainingJobId) + "/errorinfo"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTrainingJobErrorInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the runtime fault error message of a training node.</p>
     * @return GetTrainingJobErrorInfoResponse
     */
    public GetTrainingJobErrorInfoResponse getTrainingJobErrorInfo(String TrainingJobId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTrainingJobErrorInfoWithOptions(TrainingJobId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the latest metrics for a training task.</p>
     * 
     * @param request GetTrainingJobLatestMetricsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTrainingJobLatestMetricsResponse
     */
    public GetTrainingJobLatestMetricsResponse getTrainingJobLatestMetricsWithOptions(String TrainingJobId, GetTrainingJobLatestMetricsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.names)) {
            query.put("Names", request.names);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTrainingJobLatestMetrics"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/trainingjobs/" + com.aliyun.openapiutil.Client.getEncodeParam(TrainingJobId) + "/latestmetrics"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTrainingJobLatestMetricsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the latest metrics for a training task.</p>
     * 
     * @param request GetTrainingJobLatestMetricsRequest
     * @return GetTrainingJobLatestMetricsResponse
     */
    public GetTrainingJobLatestMetricsResponse getTrainingJobLatestMetrics(String TrainingJobId, GetTrainingJobLatestMetricsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTrainingJobLatestMetricsWithOptions(TrainingJobId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves metric data at the user dimension.</p>
     * 
     * @deprecated OpenAPI GetUserViewMetrics is deprecated
     * 
     * @param request GetUserViewMetricsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUserViewMetricsResponse
     */
    @Deprecated
    // Deprecated
    public GetUserViewMetricsResponse getUserViewMetricsWithOptions(String ResourceGroupID, GetUserViewMetricsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeStep)) {
            query.put("TimeStep", request.timeStep);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUserViewMetrics"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/resources/" + com.aliyun.openapiutil.Client.getEncodeParam(ResourceGroupID) + "/usermetrics"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUserViewMetricsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves metric data at the user dimension.</p>
     * 
     * @deprecated OpenAPI GetUserViewMetrics is deprecated
     * 
     * @param request GetUserViewMetricsRequest
     * @return GetUserViewMetricsResponse
     */
    @Deprecated
    // Deprecated
    public GetUserViewMetricsResponse getUserViewMetrics(String ResourceGroupID, GetUserViewMetricsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getUserViewMetricsWithOptions(ResourceGroupID, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieve a list of algorithm version details.</p>
     * 
     * @param request ListAlgorithmVersionsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAlgorithmVersionsResponse
     */
    public ListAlgorithmVersionsResponse listAlgorithmVersionsWithOptions(String AlgorithmId, ListAlgorithmVersionsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAlgorithmVersions"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/algorithms/" + com.aliyun.openapiutil.Client.getEncodeParam(AlgorithmId) + "/versions"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAlgorithmVersionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieve a list of algorithm version details.</p>
     * 
     * @param request ListAlgorithmVersionsRequest
     * @return ListAlgorithmVersionsResponse
     */
    public ListAlgorithmVersionsResponse listAlgorithmVersions(String AlgorithmId, ListAlgorithmVersionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAlgorithmVersionsWithOptions(AlgorithmId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists algorithm details.</p>
     * 
     * @param request ListAlgorithmsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAlgorithmsResponse
     */
    public ListAlgorithmsResponse listAlgorithmsWithOptions(ListAlgorithmsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.algorithmId)) {
            query.put("AlgorithmId", request.algorithmId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.algorithmName)) {
            query.put("AlgorithmName", request.algorithmName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.algorithmProvider)) {
            query.put("AlgorithmProvider", request.algorithmProvider);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAlgorithms"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/algorithms"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAlgorithmsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Lists algorithm details.</p>
     * 
     * @param request ListAlgorithmsRequest
     * @return ListAlgorithmsResponse
     */
    public ListAlgorithmsResponse listAlgorithms(ListAlgorithmsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAlgorithmsWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This feature is currently available only on the Lingjun AI Computing Service platform and is accessible to customers through a whitelist.</li>
     * <li><code>NodeName</code> and <code>ResourceGroupId</code> are required parameters that represent the node name and the ID of the resource group to which the node belongs.</li>
     * <li>Optional parameters include <code>OversoldTypes</code> and <code>GPUIndexes</code>, which are used to further filter or specify conditions.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves detailed information about all pods on a specified node.</p>
     * 
     * @param request ListNodePodsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListNodePodsResponse
     */
    public ListNodePodsResponse listNodePodsWithOptions(String NodeId, ListNodePodsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.GPUIndexes)) {
            query.put("GPUIndexes", request.GPUIndexes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.oversoldTypes)) {
            query.put("OversoldTypes", request.oversoldTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListNodePods"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/nodes/" + com.aliyun.openapiutil.Client.getEncodeParam(NodeId) + "/Pods"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListNodePodsResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This feature is currently available only on the Lingjun AI Computing Service platform and is accessible to customers through a whitelist.</li>
     * <li><code>NodeName</code> and <code>ResourceGroupId</code> are required parameters that represent the node name and the ID of the resource group to which the node belongs.</li>
     * <li>Optional parameters include <code>OversoldTypes</code> and <code>GPUIndexes</code>, which are used to further filter or specify conditions.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves detailed information about all pods on a specified node.</p>
     * 
     * @param request ListNodePodsRequest
     * @return ListNodePodsResponse
     */
    public ListNodePodsResponse listNodePods(String NodeId, ListNodePodsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listNodePodsWithOptions(NodeId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Description</h2>
     * <ul>
     * <li>Lists the node types that match the specified filter criteria.</li>
     * <li>You must specify either the <code>ResourceGroupIds</code> or <code>QuotaId</code> parameter. The specified resource group IDs or quota ID must belong to the requesting user.</li>
     * <li>You can filter the results by using parameters such as accelerator type and GPU type.</li>
     * <li>The response includes details and statistics for each node type, indicating the availability of your resources.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Lists the available node types.</p>
     * 
     * @param request ListNodeTypesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListNodeTypesResponse
     */
    public ListNodeTypesResponse listNodeTypesWithOptions(ListNodeTypesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceleratorType)) {
            query.put("AcceleratorType", request.acceleratorType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.GPUType)) {
            query.put("GPUType", request.GPUType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeTypes)) {
            query.put("NodeTypes", request.nodeTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.quotaId)) {
            query.put("QuotaId", request.quotaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupIds)) {
            query.put("ResourceGroupIds", request.resourceGroupIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListNodeTypes"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/nodetypes"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListNodeTypesResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Description</h2>
     * <ul>
     * <li>Lists the node types that match the specified filter criteria.</li>
     * <li>You must specify either the <code>ResourceGroupIds</code> or <code>QuotaId</code> parameter. The specified resource group IDs or quota ID must belong to the requesting user.</li>
     * <li>You can filter the results by using parameters such as accelerator type and GPU type.</li>
     * <li>The response includes details and statistics for each node type, indicating the availability of your resources.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Lists the available node types.</p>
     * 
     * @param request ListNodeTypesRequest
     * @return ListNodeTypesResponse
     */
    public ListNodeTypesResponse listNodeTypes(ListNodeTypesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listNodeTypesWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>ListNodes retrieves resource nodes that match specified filter conditions.</p>
     * 
     * <b>summary</b> : 
     * <p>Returns a list of resource nodes.</p>
     * 
     * @param tmpReq ListNodesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListNodesResponse
     */
    public ListNodesResponse listNodesWithOptions(ListNodesRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListNodesShrinkRequest request = new ListNodesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.healthCount)) {
            request.healthCountShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.healthCount, "HealthCount", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.healthRate)) {
            request.healthRateShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.healthRate, "HealthRate", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceleratorType)) {
            query.put("AcceleratorType", request.acceleratorType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.availabilityZone)) {
            query.put("AvailabilityZone", request.availabilityZone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cliqueID)) {
            query.put("CliqueID", request.cliqueID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.diskPL)) {
            query.put("DiskPL", request.diskPL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterByQuotaId)) {
            query.put("FilterByQuotaId", request.filterByQuotaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterByResourceGroupIds)) {
            query.put("FilterByResourceGroupIds", request.filterByResourceGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.GPUType)) {
            query.put("GPUType", request.GPUType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCountShrink)) {
            query.put("HealthCount", request.healthCountShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthRateShrink)) {
            query.put("HealthRate", request.healthRateShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hyperNode)) {
            query.put("HyperNode", request.hyperNode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hyperZone)) {
            query.put("HyperZone", request.hyperZone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.layoutMode)) {
            query.put("LayoutMode", request.layoutMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.machineGroupIds)) {
            query.put("MachineGroupIds", request.machineGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeNames)) {
            query.put("NodeNames", request.nodeNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeStatuses)) {
            query.put("NodeStatuses", request.nodeStatuses);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeTypes)) {
            query.put("NodeTypes", request.nodeTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderInstanceIds)) {
            query.put("OrderInstanceIds", request.orderInstanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderStatuses)) {
            query.put("OrderStatuses", request.orderStatuses);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paymentType)) {
            query.put("PaymentType", request.paymentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.podNum)) {
            query.put("PodNum", request.podNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.quotaId)) {
            query.put("QuotaId", request.quotaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reasonCodes)) {
            query.put("ReasonCodes", request.reasonCodes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupIds)) {
            query.put("ResourceGroupIds", request.resourceGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupName)) {
            query.put("ResourceGroupName", request.resourceGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.verbose)) {
            query.put("Verbose", request.verbose);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workloadNum)) {
            query.put("WorkloadNum", request.workloadNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListNodes"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/nodes"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListNodesResponse());
    }

    /**
     * <b>description</b> :
     * <p>ListNodes retrieves resource nodes that match specified filter conditions.</p>
     * 
     * <b>summary</b> : 
     * <p>Returns a list of resource nodes.</p>
     * 
     * @param request ListNodesRequest
     * @return ListNodesResponse
     */
    public ListNodesResponse listNodes(ListNodesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listNodesWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Retrieves the resource usage of users in a specified quota.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists users within a quota and their resource usage.</p>
     * 
     * @param request ListQuotaActiveUserUsagesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListQuotaActiveUserUsagesResponse
     */
    public ListQuotaActiveUserUsagesResponse listQuotaActiveUserUsagesWithOptions(String QuotaId, ListQuotaActiveUserUsagesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.selfOnly)) {
            query.put("SelfOnly", request.selfOnly);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.username)) {
            query.put("Username", request.username);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workloadCount)) {
            query.put("WorkloadCount", request.workloadCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListQuotaActiveUserUsages"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/quotas/" + com.aliyun.openapiutil.Client.getEncodeParam(QuotaId) + "/activeuserusages"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListQuotaActiveUserUsagesResponse());
    }

    /**
     * <b>description</b> :
     * <p>Retrieves the resource usage of users in a specified quota.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists users within a quota and their resource usage.</p>
     * 
     * @param request ListQuotaActiveUserUsagesRequest
     * @return ListQuotaActiveUserUsagesResponse
     */
    public ListQuotaActiveUserUsagesResponse listQuotaActiveUserUsages(String QuotaId, ListQuotaActiveUserUsagesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listQuotaActiveUserUsagesWithOptions(QuotaId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of workloads associated with a specific quota.</p>
     * 
     * @param request ListQuotaWorkloadsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListQuotaWorkloadsResponse
     */
    public ListQuotaWorkloadsResponse listQuotaWorkloadsWithOptions(String QuotaId, ListQuotaWorkloadsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.beforeWorkloadId)) {
            query.put("BeforeWorkloadId", request.beforeWorkloadId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gmtDequeuedTimeRange)) {
            query.put("GmtDequeuedTimeRange", request.gmtDequeuedTimeRange);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gmtEnqueuedTimeRange)) {
            query.put("GmtEnqueuedTimeRange", request.gmtEnqueuedTimeRange);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gmtPositionModifiedTimeRange)) {
            query.put("GmtPositionModifiedTimeRange", request.gmtPositionModifiedTimeRange);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeName)) {
            query.put("NodeName", request.nodeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.position)) {
            query.put("Position", request.position);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            query.put("Priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.showOwn)) {
            query.put("ShowOwn", request.showOwn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subQuotaIds)) {
            query.put("SubQuotaIds", request.subQuotaIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useOversoldResource)) {
            query.put("UseOversoldResource", request.useOversoldResource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userIds)) {
            query.put("UserIds", request.userIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.withHistoricalData)) {
            query.put("WithHistoricalData", request.withHistoricalData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workloadCreatedTimeRange)) {
            query.put("WorkloadCreatedTimeRange", request.workloadCreatedTimeRange);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workloadIds)) {
            query.put("WorkloadIds", request.workloadIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workloadNames)) {
            query.put("WorkloadNames", request.workloadNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workloadStatuses)) {
            query.put("WorkloadStatuses", request.workloadStatuses);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workloadType)) {
            query.put("WorkloadType", request.workloadType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceIds)) {
            query.put("WorkspaceIds", request.workspaceIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListQuotaWorkloads"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/quotas/" + com.aliyun.openapiutil.Client.getEncodeParam(QuotaId) + "/workloads"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListQuotaWorkloadsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of workloads associated with a specific quota.</p>
     * 
     * @param request ListQuotaWorkloadsRequest
     * @return ListQuotaWorkloadsResponse
     */
    public ListQuotaWorkloadsResponse listQuotaWorkloads(String QuotaId, ListQuotaWorkloadsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listQuotaWorkloadsWithOptions(QuotaId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists quotas.</p>
     * 
     * @param request ListQuotasRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListQuotasResponse
     */
    public ListQuotasResponse listQuotasWithOptions(ListQuotasRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterType)) {
            query.put("ClusterType", request.clusterType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.GPUType)) {
            query.put("GPUType", request.GPUType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hasResource)) {
            query.put("HasResource", request.hasResource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labels)) {
            query.put("Labels", request.labels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.layoutMode)) {
            query.put("LayoutMode", request.layoutMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentQuotaId)) {
            query.put("ParentQuotaId", request.parentQuotaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.quotaIds)) {
            query.put("QuotaIds", request.quotaIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.quotaName)) {
            query.put("QuotaName", request.quotaName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statuses)) {
            query.put("Statuses", request.statuses);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.verbose)) {
            query.put("Verbose", request.verbose);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versions)) {
            query.put("Versions", request.versions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceIds)) {
            query.put("WorkspaceIds", request.workspaceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceName)) {
            query.put("WorkspaceName", request.workspaceName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListQuotas"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/quotas/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListQuotasResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Lists quotas.</p>
     * 
     * @param request ListQuotasRequest
     * @return ListQuotasResponse
     */
    public ListQuotasResponse listQuotas(ListQuotasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listQuotasWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of machine groups in a specified resource group.</p>
     * 
     * @param request ListResourceGroupMachineGroupsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListResourceGroupMachineGroupsResponse
     */
    public ListResourceGroupMachineGroupsResponse listResourceGroupMachineGroupsWithOptions(String ResourceGroupID, ListResourceGroupMachineGroupsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.creatorID)) {
            query.put("CreatorID", request.creatorID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.diskPL)) {
            query.put("DiskPL", request.diskPL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecsSpec)) {
            query.put("EcsSpec", request.ecsSpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.machineGroupIDs)) {
            query.put("MachineGroupIDs", request.machineGroupIDs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderInstanceId)) {
            query.put("OrderInstanceId", request.orderInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paymentDuration)) {
            query.put("PaymentDuration", request.paymentDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paymentDurationUnit)) {
            query.put("PaymentDurationUnit", request.paymentDurationUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paymentType)) {
            query.put("PaymentType", request.paymentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListResourceGroupMachineGroups"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/resources/" + com.aliyun.openapiutil.Client.getEncodeParam(ResourceGroupID) + "/machinegroups"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListResourceGroupMachineGroupsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of machine groups in a specified resource group.</p>
     * 
     * @param request ListResourceGroupMachineGroupsRequest
     * @return ListResourceGroupMachineGroupsResponse
     */
    public ListResourceGroupMachineGroupsResponse listResourceGroupMachineGroups(String ResourceGroupID, ListResourceGroupMachineGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listResourceGroupMachineGroupsWithOptions(ResourceGroupID, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Currently, AI computing resource groups (including ECS and Lingjun intelligent computing resources) are available only in specific regions. For a list of supported regions, see <a href="https://help.aliyun.com/document_detail/143986.html">AI computing resource management</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Call this operation to list resource groups for ECS or Lingjun intelligent computing resources.</p>
     * 
     * @param request ListResourceGroupsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListResourceGroupsResponse
     */
    public ListResourceGroupsResponse listResourceGroupsWithOptions(ListResourceGroupsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.computingResourceProvider)) {
            query.put("ComputingResourceProvider", request.computingResourceProvider);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hasResource)) {
            query.put("HasResource", request.hasResource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupIDs)) {
            query.put("ResourceGroupIDs", request.resourceGroupIDs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.showAll)) {
            query.put("ShowAll", request.showAll);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versions)) {
            query.put("Versions", request.versions);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListResourceGroups"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/resources"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListResourceGroupsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Currently, AI computing resource groups (including ECS and Lingjun intelligent computing resources) are available only in specific regions. For a list of supported regions, see <a href="https://help.aliyun.com/document_detail/143986.html">AI computing resource management</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Call this operation to list resource groups for ECS or Lingjun intelligent computing resources.</p>
     * 
     * @param request ListResourceGroupsRequest
     * @return ListResourceGroupsResponse
     */
    public ListResourceGroupsResponse listResourceGroups(ListResourceGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listResourceGroupsWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Specify at least one of the following parameters to query for resources.</p>
     * <ul>
     * <li>ResourceId.N</li>
     * <li>Tag.N (Tag.N.Key and Tag.N.Value)
     * If you specify both parameters, the operation returns only resources that match both criteria.</li>
     * <li>Tag.N and ResourceId.N</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Tag query API.</p>
     * 
     * @param tmpReq ListTagResourcesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListTagResourcesShrinkRequest request = new ListTagResourcesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.resourceId)) {
            request.resourceIdShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.resourceId, "ResourceId", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tag)) {
            request.tagShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tag, "Tag", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceIdShrink)) {
            query.put("ResourceId", request.resourceIdShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagShrink)) {
            query.put("Tag", request.tagShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTagResources"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/tags"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTagResourcesResponse());
    }

    /**
     * <b>description</b> :
     * <p>Specify at least one of the following parameters to query for resources.</p>
     * <ul>
     * <li>ResourceId.N</li>
     * <li>Tag.N (Tag.N.Key and Tag.N.Value)
     * If you specify both parameters, the operation returns only resources that match both criteria.</li>
     * <li>Tag.N and ResourceId.N</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Tag query API.</p>
     * 
     * @param request ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTagResourcesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieve events for a specific training task to gain detailed insight into the training process.</p>
     * 
     * @param request ListTrainingJobEventsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTrainingJobEventsResponse
     */
    public ListTrainingJobEventsResponse listTrainingJobEventsWithOptions(String TrainingJobId, ListTrainingJobEventsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
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
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTrainingJobEvents"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/trainingjobs/" + com.aliyun.openapiutil.Client.getEncodeParam(TrainingJobId) + "/events"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTrainingJobEventsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieve events for a specific training task to gain detailed insight into the training process.</p>
     * 
     * @param request ListTrainingJobEventsRequest
     * @return ListTrainingJobEventsResponse
     */
    public ListTrainingJobEventsResponse listTrainingJobEvents(String TrainingJobId, ListTrainingJobEventsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTrainingJobEventsWithOptions(TrainingJobId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieve events for a training job instance.</p>
     * 
     * @param request ListTrainingJobInstanceEventsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTrainingJobInstanceEventsResponse
     */
    public ListTrainingJobInstanceEventsResponse listTrainingJobInstanceEventsWithOptions(String TrainingJobId, String InstanceId, ListTrainingJobInstanceEventsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
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
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTrainingJobInstanceEvents"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/trainingjobs/" + com.aliyun.openapiutil.Client.getEncodeParam(TrainingJobId) + "/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/events"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTrainingJobInstanceEventsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieve events for a training job instance.</p>
     * 
     * @param request ListTrainingJobInstanceEventsRequest
     * @return ListTrainingJobInstanceEventsResponse
     */
    public ListTrainingJobInstanceEventsResponse listTrainingJobInstanceEvents(String TrainingJobId, String InstanceId, ListTrainingJobInstanceEventsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTrainingJobInstanceEventsWithOptions(TrainingJobId, InstanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieve monitoring metrics for training job instances.</p>
     * 
     * @param request ListTrainingJobInstanceMetricsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTrainingJobInstanceMetricsResponse
     */
    public ListTrainingJobInstanceMetricsResponse listTrainingJobInstanceMetricsWithOptions(String TrainingJobId, ListTrainingJobInstanceMetricsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricType)) {
            query.put("MetricType", request.metricType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeStep)) {
            query.put("TimeStep", request.timeStep);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTrainingJobInstanceMetrics"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/trainingjobs/" + com.aliyun.openapiutil.Client.getEncodeParam(TrainingJobId) + "/instancemetrics"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTrainingJobInstanceMetricsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieve monitoring metrics for training job instances.</p>
     * 
     * @param request ListTrainingJobInstanceMetricsRequest
     * @return ListTrainingJobInstanceMetricsResponse
     */
    public ListTrainingJobInstanceMetricsResponse listTrainingJobInstanceMetrics(String TrainingJobId, ListTrainingJobInstanceMetricsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTrainingJobInstanceMetricsWithOptions(TrainingJobId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the logs for a training task.</p>
     * 
     * @param request ListTrainingJobLogsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTrainingJobLogsResponse
     */
    public ListTrainingJobLogsResponse listTrainingJobLogsWithOptions(String TrainingJobId, ListTrainingJobLogsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
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

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workerId)) {
            query.put("WorkerId", request.workerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTrainingJobLogs"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/trainingjobs/" + com.aliyun.openapiutil.Client.getEncodeParam(TrainingJobId) + "/logs"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTrainingJobLogsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the logs for a training task.</p>
     * 
     * @param request ListTrainingJobLogsRequest
     * @return ListTrainingJobLogsResponse
     */
    public ListTrainingJobLogsResponse listTrainingJobLogs(String TrainingJobId, ListTrainingJobLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTrainingJobLogsWithOptions(TrainingJobId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieve monitoring data for a training task.</p>
     * 
     * @param request ListTrainingJobMetricsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTrainingJobMetricsResponse
     */
    public ListTrainingJobMetricsResponse listTrainingJobMetricsWithOptions(String TrainingJobId, ListTrainingJobMetricsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
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
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTrainingJobMetrics"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/trainingjobs/" + com.aliyun.openapiutil.Client.getEncodeParam(TrainingJobId) + "/metrics"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTrainingJobMetricsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieve monitoring data for a training task.</p>
     * 
     * @param request ListTrainingJobMetricsRequest
     * @return ListTrainingJobMetricsResponse
     */
    public ListTrainingJobMetricsResponse listTrainingJobMetrics(String TrainingJobId, ListTrainingJobMetricsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTrainingJobMetricsWithOptions(TrainingJobId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves information about the output models of a training job.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTrainingJobOutputModelsResponse
     */
    public ListTrainingJobOutputModelsResponse listTrainingJobOutputModelsWithOptions(String TrainingJobId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTrainingJobOutputModels"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/trainingjobs/" + com.aliyun.openapiutil.Client.getEncodeParam(TrainingJobId) + "/outputmodels"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTrainingJobOutputModelsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves information about the output models of a training job.</p>
     * @return ListTrainingJobOutputModelsResponse
     */
    public ListTrainingJobOutputModelsResponse listTrainingJobOutputModels(String TrainingJobId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTrainingJobOutputModelsWithOptions(TrainingJobId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of training jobs.</p>
     * 
     * @param tmpReq ListTrainingJobsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTrainingJobsResponse
     */
    public ListTrainingJobsResponse listTrainingJobsWithOptions(ListTrainingJobsRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListTrainingJobsShrinkRequest request = new ListTrainingJobsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.labels)) {
            request.labelsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.labels, "Labels", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.algorithmName)) {
            query.put("AlgorithmName", request.algorithmName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.algorithmProvider)) {
            query.put("AlgorithmProvider", request.algorithmProvider);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isTempAlgo)) {
            query.put("IsTempAlgo", request.isTempAlgo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labelsShrink)) {
            query.put("Labels", request.labelsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
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

        if (!com.aliyun.teautil.Common.isUnset(request.trainingJobId)) {
            query.put("TrainingJobId", request.trainingJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trainingJobName)) {
            query.put("TrainingJobName", request.trainingJobName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTrainingJobs"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/trainingjobs"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTrainingJobsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of training jobs.</p>
     * 
     * @param request ListTrainingJobsRequest
     * @return ListTrainingJobsResponse
     */
    public ListTrainingJobsResponse listTrainingJobs(ListTrainingJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTrainingJobsWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Use OperateNode to manage a specified resource node. Supported operations include disabling or enabling scheduling.</p>
     * 
     * <b>summary</b> : 
     * <p>Use OperateNode to manage nodes.</p>
     * 
     * @param request OperateNodeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return OperateNodeResponse
     */
    public OperateNodeResponse operateNodeWithOptions(String NodeId, OperateNodeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.operation)) {
            body.put("Operation", request.operation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operationParameters)) {
            body.put("OperationParameters", request.operationParameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            body.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OperateNode"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/nodes/" + com.aliyun.openapiutil.Client.getEncodeParam(NodeId) + ""),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OperateNodeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Use OperateNode to manage a specified resource node. Supported operations include disabling or enabling scheduling.</p>
     * 
     * <b>summary</b> : 
     * <p>Use OperateNode to manage nodes.</p>
     * 
     * @param request OperateNodeRequest
     * @return OperateNodeResponse
     */
    public OperateNodeResponse operateNode(String NodeId, OperateNodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.operateNodeWithOptions(NodeId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Use ScaleQuota to scale resource quotas.</p>
     * 
     * @param request ScaleQuotaRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ScaleQuotaResponse
     */
    public ScaleQuotaResponse scaleQuotaWithOptions(String QuotaId, ScaleQuotaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.min)) {
            body.put("Min", request.min);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupIds)) {
            body.put("ResourceGroupIds", request.resourceGroupIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ScaleQuota"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/quotas/" + com.aliyun.openapiutil.Client.getEncodeParam(QuotaId) + "/action/scale"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ScaleQuotaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Use ScaleQuota to scale resource quotas.</p>
     * 
     * @param request ScaleQuotaRequest
     * @return ScaleQuotaResponse
     */
    public ScaleQuotaResponse scaleQuota(String QuotaId, ScaleQuotaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.scaleQuotaWithOptions(QuotaId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Stops a training task.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopTrainingJobResponse
     */
    public StopTrainingJobResponse stopTrainingJobWithOptions(String TrainingJobId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopTrainingJob"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/trainingjobs/" + com.aliyun.openapiutil.Client.getEncodeParam(TrainingJobId) + "/stop"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopTrainingJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Stops a training task.</p>
     * @return StopTrainingJobResponse
     */
    public StopTrainingJobResponse stopTrainingJob(String TrainingJobId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopTrainingJobWithOptions(TrainingJobId, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Alibaba Cloud checks the number of existing tags on the resource before attaching a new tag. If the limit is exceeded, an error message is returned.</p>
     * 
     * <b>summary</b> : 
     * <p>Attaches tags to resources.</p>
     * 
     * @param request TagResourcesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            body.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            body.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            body.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TagResources"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/tags"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TagResourcesResponse());
    }

    /**
     * <b>description</b> :
     * <p>Alibaba Cloud checks the number of existing tags on the resource before attaching a new tag. If the limit is exceeded, an error message is returned.</p>
     * 
     * <b>summary</b> : 
     * <p>Attaches tags to resources.</p>
     * 
     * @param request TagResourcesRequest
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.tagResourcesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Detach tags from a list of specified resources. If a tag is no longer attached to any resource after detachment, Alibaba Cloud deletes it automatically.</p>
     * 
     * @param tmpReq UntagResourcesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UntagResourcesResponse
     */
    public UntagResourcesResponse untagResourcesWithOptions(UntagResourcesRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UntagResourcesShrinkRequest request = new UntagResourcesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.resourceId)) {
            request.resourceIdShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.resourceId, "ResourceId", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tagKey)) {
            request.tagKeyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tagKey, "TagKey", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.all)) {
            query.put("All", request.all);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceIdShrink)) {
            query.put("ResourceId", request.resourceIdShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagKeyShrink)) {
            query.put("TagKey", request.tagKeyShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UntagResources"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/tags"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UntagResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Detach tags from a list of specified resources. If a tag is no longer attached to any resource after detachment, Alibaba Cloud deletes it automatically.</p>
     * 
     * @param request UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.untagResourcesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates an algorithm.</p>
     * 
     * @param request UpdateAlgorithmRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAlgorithmResponse
     */
    public UpdateAlgorithmResponse updateAlgorithmWithOptions(String AlgorithmId, UpdateAlgorithmRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.algorithmDescription)) {
            body.put("AlgorithmDescription", request.algorithmDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            body.put("DisplayName", request.displayName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAlgorithm"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/algorithms/" + com.aliyun.openapiutil.Client.getEncodeParam(AlgorithmId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAlgorithmResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates an algorithm.</p>
     * 
     * @param request UpdateAlgorithmRequest
     * @return UpdateAlgorithmResponse
     */
    public UpdateAlgorithmResponse updateAlgorithm(String AlgorithmId, UpdateAlgorithmRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateAlgorithmWithOptions(AlgorithmId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates an algorithm version.</p>
     * 
     * @param tmpReq UpdateAlgorithmVersionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAlgorithmVersionResponse
     */
    public UpdateAlgorithmVersionResponse updateAlgorithmVersionWithOptions(String AlgorithmId, String AlgorithmVersion, UpdateAlgorithmVersionRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateAlgorithmVersionShrinkRequest request = new UpdateAlgorithmVersionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.algorithmSpec)) {
            request.algorithmSpecShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.algorithmSpec, "AlgorithmSpec", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.algorithmSpecShrink)) {
            body.put("AlgorithmSpec", request.algorithmSpecShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAlgorithmVersion"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/algorithms/" + com.aliyun.openapiutil.Client.getEncodeParam(AlgorithmId) + "/versions/" + com.aliyun.openapiutil.Client.getEncodeParam(AlgorithmVersion) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAlgorithmVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates an algorithm version.</p>
     * 
     * @param request UpdateAlgorithmVersionRequest
     * @return UpdateAlgorithmVersionResponse
     */
    public UpdateAlgorithmVersionResponse updateAlgorithmVersion(String AlgorithmId, String AlgorithmVersion, UpdateAlgorithmVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateAlgorithmVersionWithOptions(AlgorithmId, AlgorithmVersion, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the information of a resource quota.</p>
     * 
     * @param request UpdateQuotaRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateQuotaResponse
     */
    public UpdateQuotaResponse updateQuotaWithOptions(String QuotaId, UpdateQuotaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labels)) {
            body.put("Labels", request.labels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.propagateDefaultGPUDriver)) {
            body.put("PropagateDefaultGPUDriver", request.propagateDefaultGPUDriver);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queueStrategy)) {
            body.put("QueueStrategy", request.queueStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.quotaConfig)) {
            body.put("QuotaConfig", request.quotaConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.quotaName)) {
            body.put("QuotaName", request.quotaName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateQuota"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/quotas/" + com.aliyun.openapiutil.Client.getEncodeParam(QuotaId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateQuotaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the information of a resource quota.</p>
     * 
     * @param request UpdateQuotaRequest
     * @return UpdateQuotaResponse
     */
    public UpdateQuotaResponse updateQuota(String QuotaId, UpdateQuotaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateQuotaWithOptions(QuotaId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Use UpdateResourceGroup to update resource group information.</p>
     * 
     * @param request UpdateResourceGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateResourceGroupResponse
     */
    public UpdateResourceGroupResponse updateResourceGroupWithOptions(String ResourceGroupID, UpdateResourceGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.unbind)) {
            body.put("Unbind", request.unbind);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userVpc)) {
            body.put("UserVpc", request.userVpc);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateResourceGroup"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/resources/" + com.aliyun.openapiutil.Client.getEncodeParam(ResourceGroupID) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateResourceGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Use UpdateResourceGroup to update resource group information.</p>
     * 
     * @param request UpdateResourceGroupRequest
     * @return UpdateResourceGroupResponse
     */
    public UpdateResourceGroupResponse updateResourceGroup(String ResourceGroupID, UpdateResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateResourceGroupWithOptions(ResourceGroupID, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the labels of a training task.</p>
     * 
     * @param request UpdateTrainingJobLabelsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateTrainingJobLabelsResponse
     */
    public UpdateTrainingJobLabelsResponse updateTrainingJobLabelsWithOptions(String TrainingJobId, UpdateTrainingJobLabelsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.labels)) {
            body.put("Labels", request.labels);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTrainingJobLabels"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/trainingjobs/" + com.aliyun.openapiutil.Client.getEncodeParam(TrainingJobId) + "/labels"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTrainingJobLabelsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the labels of a training task.</p>
     * 
     * @param request UpdateTrainingJobLabelsRequest
     * @return UpdateTrainingJobLabelsResponse
     */
    public UpdateTrainingJobLabelsResponse updateTrainingJobLabels(String TrainingJobId, UpdateTrainingJobLabelsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateTrainingJobLabelsWithOptions(TrainingJobId, request, headers, runtime);
    }
}
