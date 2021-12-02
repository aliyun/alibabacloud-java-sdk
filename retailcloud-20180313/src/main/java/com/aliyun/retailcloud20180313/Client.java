// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313;

import com.aliyun.tea.*;
import com.aliyun.retailcloud20180313.models.*;
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
            new TeaPair("ap-northeast-1", "retailcloud.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "retailcloud.aliyuncs.com"),
            new TeaPair("ap-south-1", "retailcloud.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "retailcloud.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "retailcloud.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "retailcloud.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "retailcloud.aliyuncs.com"),
            new TeaPair("cn-beijing", "retailcloud.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "retailcloud.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "retailcloud.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "retailcloud.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "retailcloud.aliyuncs.com"),
            new TeaPair("cn-chengdu", "retailcloud.aliyuncs.com"),
            new TeaPair("cn-edge-1", "retailcloud.aliyuncs.com"),
            new TeaPair("cn-fujian", "retailcloud.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "retailcloud.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "retailcloud.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "retailcloud.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "retailcloud.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "retailcloud.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "retailcloud.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "retailcloud.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "retailcloud.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "retailcloud.aliyuncs.com"),
            new TeaPair("cn-hongkong", "retailcloud.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "retailcloud.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "retailcloud.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "retailcloud.aliyuncs.com"),
            new TeaPair("cn-qingdao", "retailcloud.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "retailcloud.aliyuncs.com"),
            new TeaPair("cn-shanghai", "retailcloud.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "retailcloud.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "retailcloud.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "retailcloud.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "retailcloud.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "retailcloud.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "retailcloud.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "retailcloud.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "retailcloud.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "retailcloud.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "retailcloud.aliyuncs.com"),
            new TeaPair("cn-wuhan", "retailcloud.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "retailcloud.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "retailcloud.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "retailcloud.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "retailcloud.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "retailcloud.aliyuncs.com"),
            new TeaPair("eu-central-1", "retailcloud.aliyuncs.com"),
            new TeaPair("eu-west-1", "retailcloud.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "retailcloud.aliyuncs.com"),
            new TeaPair("me-east-1", "retailcloud.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "retailcloud.aliyuncs.com"),
            new TeaPair("us-east-1", "retailcloud.aliyuncs.com"),
            new TeaPair("us-west-1", "retailcloud.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("retailcloud", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AddClusterNodeResponse addClusterNodeWithOptions(AddClusterNodeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClusterInstanceId", request.clusterInstanceId);
        query.put("EcsInstanceIdList", request.ecsInstanceIdList);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddClusterNode"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddClusterNodeResponse());
    }

    public AddClusterNodeResponse addClusterNode(AddClusterNodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addClusterNodeWithOptions(request, runtime);
    }

    public AllocatePodConfigResponse allocatePodConfigWithOptions(AllocatePodConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppId", request.appId);
        query.put("EnvId", request.envId);
        query.put("RequestId", request.requestId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AllocatePodConfig"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AllocatePodConfigResponse());
    }

    public AllocatePodConfigResponse allocatePodConfig(AllocatePodConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.allocatePodConfigWithOptions(request, runtime);
    }

    public BatchAddServersResponse batchAddServersWithOptions(BatchAddServersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("InstanceId", request.instanceId);
        query.put("RegionId", request.regionId);
        query.put("Sign", request.sign);
        query.put("VpcId", request.vpcId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchAddServers"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchAddServersResponse());
    }

    public BatchAddServersResponse batchAddServers(BatchAddServersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchAddServersWithOptions(request, runtime);
    }

    public BindGroupResponse bindGroupWithOptions(BindGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppId", request.appId);
        query.put("BizCode", request.bizCode);
        query.put("Name", request.name);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BindGroup"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BindGroupResponse());
    }

    public BindGroupResponse bindGroup(BindGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.bindGroupWithOptions(request, runtime);
    }

    public BindNodeLabelResponse bindNodeLabelWithOptions(BindNodeLabelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClusterId", request.clusterId);
        query.put("InstanceId", request.instanceId);
        query.put("LabelKey", request.labelKey);
        query.put("LabelValue", request.labelValue);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BindNodeLabel"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BindNodeLabelResponse());
    }

    public BindNodeLabelResponse bindNodeLabel(BindNodeLabelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.bindNodeLabelWithOptions(request, runtime);
    }

    public CloseDeployOrderResponse closeDeployOrderWithOptions(CloseDeployOrderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DeployOrderId", request.deployOrderId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CloseDeployOrder"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CloseDeployOrderResponse());
    }

    public CloseDeployOrderResponse closeDeployOrder(CloseDeployOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.closeDeployOrderWithOptions(request, runtime);
    }

    public CreateAccountResponse createAccountWithOptions(CreateAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAccount"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAccountResponse());
    }

    public CreateAccountResponse createAccount(CreateAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAccountWithOptions(request, runtime);
    }

    public CreateAppResponse createAppWithOptions(CreateAppRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateApp"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAppResponse());
    }

    public CreateAppResponse createApp(CreateAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAppWithOptions(request, runtime);
    }

    public CreateAppGroupResponse createAppGroupWithOptions(CreateAppGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAppGroup"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAppGroupResponse());
    }

    public CreateAppGroupResponse createAppGroup(CreateAppGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAppGroupWithOptions(request, runtime);
    }

    public CreateAppMonitorsResponse createAppMonitorsWithOptions(CreateAppMonitorsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AlarmTemplateId", request.alarmTemplateId);
        query.put("EnvType", request.envType);
        query.put("MainUserId", request.mainUserId);
        query.put("SilenceTime", request.silenceTime);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAppMonitors"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAppMonitorsResponse());
    }

    public CreateAppMonitorsResponse createAppMonitors(CreateAppMonitorsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAppMonitorsWithOptions(request, runtime);
    }

    public CreateAppResourceAllocResponse createAppResourceAllocWithOptions(CreateAppResourceAllocRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppEnvId", request.appEnvId);
        query.put("AppId", request.appId);
        query.put("ClusterId", request.clusterId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAppResourceAlloc"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAppResourceAllocResponse());
    }

    public CreateAppResourceAllocResponse createAppResourceAlloc(CreateAppResourceAllocRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAppResourceAllocWithOptions(request, runtime);
    }

    public CreateClusterResponse createClusterWithOptions(CreateClusterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BusinessCode", request.businessCode);
        query.put("CloudMonitorFlags", request.cloudMonitorFlags);
        query.put("ClusterEnvType", request.clusterEnvType);
        query.put("ClusterId", request.clusterId);
        query.put("ClusterTitle", request.clusterTitle);
        query.put("ClusterType", request.clusterType);
        query.put("CreateWithArmsIntegration", request.createWithArmsIntegration);
        query.put("CreateWithLogIntegration", request.createWithLogIntegration);
        query.put("KeyPair", request.keyPair);
        query.put("NetPlug", request.netPlug);
        query.put("Password", request.password);
        query.put("PodCIDR", request.podCIDR);
        query.put("PrivateZone", request.privateZone);
        query.put("PublicSlb", request.publicSlb);
        query.put("RegionId", request.regionId);
        query.put("RegionName", request.regionName);
        query.put("ServiceCIDR", request.serviceCIDR);
        query.put("SnatEntry", request.snatEntry);
        query.put("VpcId", request.vpcId);
        query.put("Vswitchids", request.vswitchids);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCluster"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateClusterResponse());
    }

    public CreateClusterResponse createCluster(CreateClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createClusterWithOptions(request, runtime);
    }

    public CreateDbResponse createDbWithOptions(CreateDbRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDb"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDbResponse());
    }

    public CreateDbResponse createDb(CreateDbRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDbWithOptions(request, runtime);
    }

    public CreateDeployConfigResponse createDeployConfigWithOptions(CreateDeployConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppId", request.appId);
        query.put("CodePath", request.codePath);
        query.put("ConfigMap", request.configMap);
        query.put("ConfigMapList", request.configMapList);
        query.put("CronJob", request.cronJob);
        query.put("Deployment", request.deployment);
        query.put("EnvType", request.envType);
        query.put("Name", request.name);
        query.put("SecretList", request.secretList);
        query.put("StatefulSet", request.statefulSet);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDeployConfig"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDeployConfigResponse());
    }

    public CreateDeployConfigResponse createDeployConfig(CreateDeployConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDeployConfigWithOptions(request, runtime);
    }

    public CreateEciConfigResponse createEciConfigWithOptions(CreateEciConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppEnvId", request.appEnvId);
        query.put("EipBandwidth", request.eipBandwidth);
        query.put("EnableEciSchedulePolicy", request.enableEciSchedulePolicy);
        query.put("MirrorCache", request.mirrorCache);
        query.put("NormalInstanceLimit", request.normalInstanceLimit);
        query.put("ScheduleVirtualNode", request.scheduleVirtualNode);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateEciConfig"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateEciConfigResponse());
    }

    public CreateEciConfigResponse createEciConfig(CreateEciConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createEciConfigWithOptions(request, runtime);
    }

    public CreateEnvironmentResponse createEnvironmentWithOptions(CreateEnvironmentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppId", request.appId);
        query.put("AppSchemaId", request.appSchemaId);
        query.put("ClusterId", request.clusterId);
        query.put("EnvName", request.envName);
        query.put("EnvType", request.envType);
        query.put("Region", request.region);
        query.put("Replicas", request.replicas);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateEnvironment"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateEnvironmentResponse());
    }

    public CreateEnvironmentResponse createEnvironment(CreateEnvironmentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createEnvironmentWithOptions(request, runtime);
    }

    public CreateNodeLabelResponse createNodeLabelWithOptions(CreateNodeLabelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClusterId", request.clusterId);
        query.put("LabelKey", request.labelKey);
        query.put("LabelValue", request.labelValue);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateNodeLabel"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateNodeLabelResponse());
    }

    public CreateNodeLabelResponse createNodeLabel(CreateNodeLabelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createNodeLabelWithOptions(request, runtime);
    }

    public CreatePersistentVolumeResponse createPersistentVolumeWithOptions(CreatePersistentVolumeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePersistentVolume"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePersistentVolumeResponse());
    }

    public CreatePersistentVolumeResponse createPersistentVolume(CreatePersistentVolumeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createPersistentVolumeWithOptions(request, runtime);
    }

    public CreatePersistentVolumeClaimResponse createPersistentVolumeClaimWithOptions(CreatePersistentVolumeClaimRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccessModes", request.accessModes);
        query.put("AppId", request.appId);
        query.put("Capacity", request.capacity);
        query.put("EnvId", request.envId);
        query.put("Name", request.name);
        query.put("StorageClass", request.storageClass);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePersistentVolumeClaim"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePersistentVolumeClaimResponse());
    }

    public CreatePersistentVolumeClaimResponse createPersistentVolumeClaim(CreatePersistentVolumeClaimRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createPersistentVolumeClaimWithOptions(request, runtime);
    }

    public CreateServiceResponse createServiceWithOptions(CreateServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("EnvId", request.envId);
        query.put("Headless", request.headless);
        query.put("K8sServiceId", request.k8sServiceId);
        query.put("Name", request.name);
        query.put("ServiceType", request.serviceType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateService"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateServiceResponse());
    }

    public CreateServiceResponse createService(CreateServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createServiceWithOptions(request, runtime);
    }

    public CreateSlbAPResponse createSlbAPWithOptions(CreateSlbAPRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CookieTimeout", request.cookieTimeout);
        query.put("EnvId", request.envId);
        query.put("EstablishedTimeout", request.establishedTimeout);
        query.put("ListenerPort", request.listenerPort);
        query.put("Name", request.name);
        query.put("Protocol", request.protocol);
        query.put("RealServerPort", request.realServerPort);
        query.put("SlbId", request.slbId);
        query.put("SslCertId", request.sslCertId);
        query.put("StickySession", request.stickySession);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSlbAP"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSlbAPResponse());
    }

    public CreateSlbAPResponse createSlbAP(CreateSlbAPRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSlbAPWithOptions(request, runtime);
    }

    public DeleteAppDetailResponse deleteAppDetailWithOptions(DeleteAppDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAppDetail"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAppDetailResponse());
    }

    public DeleteAppDetailResponse deleteAppDetail(DeleteAppDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAppDetailWithOptions(request, runtime);
    }

    public DeleteAppEnvironmentResponse deleteAppEnvironmentWithOptions(DeleteAppEnvironmentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppId", request.appId);
        query.put("EnvId", request.envId);
        query.put("Force", request.force);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAppEnvironment"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAppEnvironmentResponse());
    }

    public DeleteAppEnvironmentResponse deleteAppEnvironment(DeleteAppEnvironmentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAppEnvironmentWithOptions(request, runtime);
    }

    public DeleteAppGroupResponse deleteAppGroupWithOptions(DeleteAppGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Force", request.force);
        query.put("GroupId", request.groupId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAppGroup"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAppGroupResponse());
    }

    public DeleteAppGroupResponse deleteAppGroup(DeleteAppGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAppGroupWithOptions(request, runtime);
    }

    public DeleteAppResourceAllocResponse deleteAppResourceAllocWithOptions(DeleteAppResourceAllocRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppEnvId", request.appEnvId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAppResourceAlloc"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAppResourceAllocResponse());
    }

    public DeleteAppResourceAllocResponse deleteAppResourceAlloc(DeleteAppResourceAllocRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAppResourceAllocWithOptions(request, runtime);
    }

    public DeleteClusterResponse deleteClusterWithOptions(DeleteClusterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClusterInstanceId", request.clusterInstanceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCluster"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteClusterResponse());
    }

    public DeleteClusterResponse deleteCluster(DeleteClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteClusterWithOptions(request, runtime);
    }

    public DeleteDatabaseResponse deleteDatabaseWithOptions(DeleteDatabaseRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDatabase"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDatabaseResponse());
    }

    public DeleteDatabaseResponse deleteDatabase(DeleteDatabaseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDatabaseWithOptions(request, runtime);
    }

    public DeleteDeployConfigResponse deleteDeployConfigWithOptions(DeleteDeployConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("SchemaId", request.schemaId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDeployConfig"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDeployConfigResponse());
    }

    public DeleteDeployConfigResponse deleteDeployConfig(DeleteDeployConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDeployConfigWithOptions(request, runtime);
    }

    public DeleteNodeLabelResponse deleteNodeLabelWithOptions(DeleteNodeLabelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClusterId", request.clusterId);
        query.put("Force", request.force);
        query.put("LabelKey", request.labelKey);
        query.put("LabelValue", request.labelValue);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteNodeLabel"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteNodeLabelResponse());
    }

    public DeleteNodeLabelResponse deleteNodeLabel(DeleteNodeLabelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteNodeLabelWithOptions(request, runtime);
    }

    public DeletePersistentVolumeResponse deletePersistentVolumeWithOptions(DeletePersistentVolumeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeletePersistentVolume"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePersistentVolumeResponse());
    }

    public DeletePersistentVolumeResponse deletePersistentVolume(DeletePersistentVolumeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deletePersistentVolumeWithOptions(request, runtime);
    }

    public DeletePersistentVolumeClaimResponse deletePersistentVolumeClaimWithOptions(DeletePersistentVolumeClaimRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppId", request.appId);
        query.put("EnvId", request.envId);
        query.put("PersistentVolumeClaimName", request.persistentVolumeClaimName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeletePersistentVolumeClaim"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePersistentVolumeClaimResponse());
    }

    public DeletePersistentVolumeClaimResponse deletePersistentVolumeClaim(DeletePersistentVolumeClaimRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deletePersistentVolumeClaimWithOptions(request, runtime);
    }

    public DeleteRdsAccountResponse deleteRdsAccountWithOptions(DeleteRdsAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRdsAccount"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRdsAccountResponse());
    }

    public DeleteRdsAccountResponse deleteRdsAccount(DeleteRdsAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteRdsAccountWithOptions(request, runtime);
    }

    public DeleteServiceResponse deleteServiceWithOptions(DeleteServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ServiceId", request.serviceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteService"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteServiceResponse());
    }

    public DeleteServiceResponse deleteService(DeleteServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteServiceWithOptions(request, runtime);
    }

    public DeleteSlbAPResponse deleteSlbAPWithOptions(DeleteSlbAPRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("SlbAPId", request.slbAPId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSlbAP"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSlbAPResponse());
    }

    public DeleteSlbAPResponse deleteSlbAP(DeleteSlbAPRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteSlbAPWithOptions(request, runtime);
    }

    public DeployAppResponse deployAppWithOptions(DeployAppRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ArmsFlag", request.armsFlag);
        query.put("ContainerImageList", request.containerImageList);
        query.put("DefaultPacketOfAppGroup", request.defaultPacketOfAppGroup);
        query.put("DeployPacketId", request.deployPacketId);
        query.put("DeployPacketUrl", request.deployPacketUrl);
        query.put("Description", request.description);
        query.put("EnvId", request.envId);
        query.put("InitContainerImageList", request.initContainerImageList);
        query.put("Name", request.name);
        query.put("PauseType", request.pauseType);
        query.put("TotalPartitions", request.totalPartitions);
        query.put("UpdateStrategyType", request.updateStrategyType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeployApp"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeployAppResponse());
    }

    public DeployAppResponse deployApp(DeployAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deployAppWithOptions(request, runtime);
    }

    public DescribeAppDetailResponse describeAppDetailWithOptions(DescribeAppDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppId", request.appId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAppDetail"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAppDetailResponse());
    }

    public DescribeAppDetailResponse describeAppDetail(DescribeAppDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAppDetailWithOptions(request, runtime);
    }

    public DescribeAppEnvironmentDetailResponse describeAppEnvironmentDetailWithOptions(DescribeAppEnvironmentDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAppEnvironmentDetail"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAppEnvironmentDetailResponse());
    }

    public DescribeAppEnvironmentDetailResponse describeAppEnvironmentDetail(DescribeAppEnvironmentDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAppEnvironmentDetailWithOptions(request, runtime);
    }

    public DescribeAppMonitorMetricResponse describeAppMonitorMetricWithOptions(DescribeAppMonitorMetricRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppId", request.appId);
        query.put("DeployOrderId", request.deployOrderId);
        query.put("EndTime", request.endTime);
        query.put("EnvId", request.envId);
        query.put("Metric", request.metric);
        query.put("PodName", request.podName);
        query.put("StartTime", request.startTime);
        query.put("Type", request.type);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAppMonitorMetric"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAppMonitorMetricResponse());
    }

    public DescribeAppMonitorMetricResponse describeAppMonitorMetric(DescribeAppMonitorMetricRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAppMonitorMetricWithOptions(request, runtime);
    }

    public DescribeAppResourceAllocResponse describeAppResourceAllocWithOptions(DescribeAppResourceAllocRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAppResourceAlloc"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAppResourceAllocResponse());
    }

    public DescribeAppResourceAllocResponse describeAppResourceAlloc(DescribeAppResourceAllocRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAppResourceAllocWithOptions(request, runtime);
    }

    public DescribeClusterDetailResponse describeClusterDetailWithOptions(DescribeClusterDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClusterInstanceId", request.clusterInstanceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeClusterDetail"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeClusterDetailResponse());
    }

    public DescribeClusterDetailResponse describeClusterDetail(DescribeClusterDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeClusterDetailWithOptions(request, runtime);
    }

    public DescribeDatabasesResponse describeDatabasesWithOptions(DescribeDatabasesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDatabases"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDatabasesResponse());
    }

    public DescribeDatabasesResponse describeDatabases(DescribeDatabasesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDatabasesWithOptions(request, runtime);
    }

    public DescribeDeployOrderDetailResponse describeDeployOrderDetailWithOptions(DescribeDeployOrderDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DeployOrderId", request.deployOrderId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDeployOrderDetail"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDeployOrderDetailResponse());
    }

    public DescribeDeployOrderDetailResponse describeDeployOrderDetail(DescribeDeployOrderDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDeployOrderDetailWithOptions(request, runtime);
    }

    public DescribeEciConfigResponse describeEciConfigWithOptions(DescribeEciConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEciConfig"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEciConfigResponse());
    }

    public DescribeEciConfigResponse describeEciConfig(DescribeEciConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeEciConfigWithOptions(request, runtime);
    }

    public DescribeEventMonitorListResponse describeEventMonitorListWithOptions(DescribeEventMonitorListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppId", request.appId);
        query.put("EndTime", request.endTime);
        query.put("EnvId", request.envId);
        query.put("EventLevel", request.eventLevel);
        query.put("EventType", request.eventType);
        query.put("PageNum", request.pageNum);
        query.put("PageSize", request.pageSize);
        query.put("PodName", request.podName);
        query.put("StartTime", request.startTime);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEventMonitorList"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEventMonitorListResponse());
    }

    public DescribeEventMonitorListResponse describeEventMonitorList(DescribeEventMonitorListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeEventMonitorListWithOptions(request, runtime);
    }

    public DescribeJobLogResponse describeJobLogWithOptions(DescribeJobLogRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeJobLog"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeJobLogResponse());
    }

    public DescribeJobLogResponse describeJobLog(DescribeJobLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeJobLogWithOptions(request, runtime);
    }

    public DescribePodContainerLogListResponse describePodContainerLogListWithOptions(DescribePodContainerLogListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppId", request.appId);
        query.put("EnvId", request.envId);
        query.put("Line", request.line);
        query.put("PodName", request.podName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePodContainerLogList"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePodContainerLogListResponse());
    }

    public DescribePodContainerLogListResponse describePodContainerLogList(DescribePodContainerLogListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describePodContainerLogListWithOptions(request, runtime);
    }

    public DescribePodEventsResponse describePodEventsWithOptions(DescribePodEventsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppInstId", request.appInstId);
        query.put("DeployOrderId", request.deployOrderId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePodEvents"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePodEventsResponse());
    }

    public DescribePodEventsResponse describePodEvents(DescribePodEventsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describePodEventsWithOptions(request, runtime);
    }

    public DescribePodLogResponse describePodLogWithOptions(DescribePodLogRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePodLog"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePodLogResponse());
    }

    public DescribePodLogResponse describePodLog(DescribePodLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describePodLogWithOptions(request, runtime);
    }

    public DescribeRdsAccountsResponse describeRdsAccountsWithOptions(DescribeRdsAccountsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRdsAccounts"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRdsAccountsResponse());
    }

    public DescribeRdsAccountsResponse describeRdsAccounts(DescribeRdsAccountsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRdsAccountsWithOptions(request, runtime);
    }

    public DescribeServiceDetailResponse describeServiceDetailWithOptions(DescribeServiceDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ServiceId", request.serviceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeServiceDetail"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeServiceDetailResponse());
    }

    public DescribeServiceDetailResponse describeServiceDetail(DescribeServiceDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeServiceDetailWithOptions(request, runtime);
    }

    public DescribeSlbAPDetailResponse describeSlbAPDetailWithOptions(DescribeSlbAPDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("SlbAPId", request.slbAPId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSlbAPDetail"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSlbAPDetailResponse());
    }

    public DescribeSlbAPDetailResponse describeSlbAPDetail(DescribeSlbAPDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSlbAPDetailWithOptions(request, runtime);
    }

    public GetInstTransInfoResponse getInstTransInfoWithOptions(GetInstTransInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstTransInfo"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstTransInfoResponse());
    }

    public GetInstTransInfoResponse getInstTransInfo(GetInstTransInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getInstTransInfoWithOptions(request, runtime);
    }

    public GetRdsBackUpResponse getRdsBackUpWithOptions(GetRdsBackUpRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRdsBackUp"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRdsBackUpResponse());
    }

    public GetRdsBackUpResponse getRdsBackUp(GetRdsBackUpRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getRdsBackUpWithOptions(request, runtime);
    }

    public GrantDbToAccountResponse grantDbToAccountWithOptions(GrantDbToAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GrantDbToAccount"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GrantDbToAccountResponse());
    }

    public GrantDbToAccountResponse grantDbToAccount(GrantDbToAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.grantDbToAccountWithOptions(request, runtime);
    }

    public ListAppResponse listAppWithOptions(ListAppRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListApp"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAppResponse());
    }

    public ListAppResponse listApp(ListAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAppWithOptions(request, runtime);
    }

    public ListAppCmsGroupsResponse listAppCmsGroupsWithOptions(ListAppCmsGroupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAppCmsGroups"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAppCmsGroupsResponse());
    }

    public ListAppCmsGroupsResponse listAppCmsGroups(ListAppCmsGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAppCmsGroupsWithOptions(request, runtime);
    }

    public ListAppEnvironmentResponse listAppEnvironmentWithOptions(ListAppEnvironmentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAppEnvironment"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAppEnvironmentResponse());
    }

    public ListAppEnvironmentResponse listAppEnvironment(ListAppEnvironmentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAppEnvironmentWithOptions(request, runtime);
    }

    public ListAppGroupResponse listAppGroupWithOptions(ListAppGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizCode", request.bizCode);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAppGroup"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAppGroupResponse());
    }

    public ListAppGroupResponse listAppGroup(ListAppGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAppGroupWithOptions(request, runtime);
    }

    public ListAppGroupMappingResponse listAppGroupMappingWithOptions(ListAppGroupMappingRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizCode", request.bizCode);
        query.put("Name", request.name);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAppGroupMapping"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAppGroupMappingResponse());
    }

    public ListAppGroupMappingResponse listAppGroupMapping(ListAppGroupMappingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAppGroupMappingWithOptions(request, runtime);
    }

    public ListAppInstanceResponse listAppInstanceWithOptions(ListAppInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAppInstance"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAppInstanceResponse());
    }

    public ListAppInstanceResponse listAppInstance(ListAppInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAppInstanceWithOptions(request, runtime);
    }

    public ListAppResourceAllocsResponse listAppResourceAllocsWithOptions(ListAppResourceAllocsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAppResourceAllocs"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAppResourceAllocsResponse());
    }

    public ListAppResourceAllocsResponse listAppResourceAllocs(ListAppResourceAllocsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAppResourceAllocsWithOptions(request, runtime);
    }

    public ListAvailableClusterNodeResponse listAvailableClusterNodeWithOptions(ListAvailableClusterNodeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAvailableClusterNode"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAvailableClusterNodeResponse());
    }

    public ListAvailableClusterNodeResponse listAvailableClusterNode(ListAvailableClusterNodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAvailableClusterNodeWithOptions(request, runtime);
    }

    public ListClusterResponse listClusterWithOptions(ListClusterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCluster"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListClusterResponse());
    }

    public ListClusterResponse listCluster(ListClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listClusterWithOptions(request, runtime);
    }

    public ListClusterNodeResponse listClusterNodeWithOptions(ListClusterNodeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListClusterNode"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListClusterNodeResponse());
    }

    public ListClusterNodeResponse listClusterNode(ListClusterNodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listClusterNodeWithOptions(request, runtime);
    }

    public ListDeployConfigResponse listDeployConfigWithOptions(ListDeployConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppId", request.appId);
        query.put("EnvType", request.envType);
        query.put("Id", request.id);
        query.put("Name", request.name);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDeployConfig"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDeployConfigResponse());
    }

    public ListDeployConfigResponse listDeployConfig(ListDeployConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDeployConfigWithOptions(request, runtime);
    }

    public ListDeployOrdersResponse listDeployOrdersWithOptions(ListDeployOrdersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppId", request.appId);
        query.put("DeployCategory", request.deployCategory);
        query.put("DeployType", request.deployType);
        query.put("EndTimeGreaterThan", request.endTimeGreaterThan);
        query.put("EndTimeGreaterThanOrEqualTo", request.endTimeGreaterThanOrEqualTo);
        query.put("EndTimeLessThan", request.endTimeLessThan);
        query.put("EndTimeLessThanOrEqualTo", request.endTimeLessThanOrEqualTo);
        query.put("EnvId", request.envId);
        query.put("EnvType", request.envType);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("PartitionType", request.partitionType);
        query.put("PauseType", request.pauseType);
        query.put("StartTimeGreaterThan", request.startTimeGreaterThan);
        query.put("StartTimeGreaterThanOrEqualTo", request.startTimeGreaterThanOrEqualTo);
        query.put("StartTimeLessThan", request.startTimeLessThan);
        query.put("StartTimeLessThanOrEqualTo", request.startTimeLessThanOrEqualTo);
        query.put("Status", request.status);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDeployOrders"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDeployOrdersResponse());
    }

    public ListDeployOrdersResponse listDeployOrders(ListDeployOrdersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDeployOrdersWithOptions(request, runtime);
    }

    public ListJobHistoriesResponse listJobHistoriesWithOptions(ListJobHistoriesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListJobHistories"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListJobHistoriesResponse());
    }

    public ListJobHistoriesResponse listJobHistories(ListJobHistoriesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listJobHistoriesWithOptions(request, runtime);
    }

    public ListNodeLabelBindingsResponse listNodeLabelBindingsWithOptions(ListNodeLabelBindingsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListNodeLabelBindings"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListNodeLabelBindingsResponse());
    }

    public ListNodeLabelBindingsResponse listNodeLabelBindings(ListNodeLabelBindingsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listNodeLabelBindingsWithOptions(request, runtime);
    }

    public ListNodeLabelsResponse listNodeLabelsWithOptions(ListNodeLabelsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClusterId", request.clusterId);
        query.put("LabelKey", request.labelKey);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListNodeLabels"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListNodeLabelsResponse());
    }

    public ListNodeLabelsResponse listNodeLabels(ListNodeLabelsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listNodeLabelsWithOptions(request, runtime);
    }

    public ListPersistentVolumeResponse listPersistentVolumeWithOptions(ListPersistentVolumeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPersistentVolume"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPersistentVolumeResponse());
    }

    public ListPersistentVolumeResponse listPersistentVolume(ListPersistentVolumeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listPersistentVolumeWithOptions(request, runtime);
    }

    public ListPersistentVolumeClaimResponse listPersistentVolumeClaimWithOptions(ListPersistentVolumeClaimRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppId", request.appId);
        query.put("EnvId", request.envId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPersistentVolumeClaim"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPersistentVolumeClaimResponse());
    }

    public ListPersistentVolumeClaimResponse listPersistentVolumeClaim(ListPersistentVolumeClaimRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listPersistentVolumeClaimWithOptions(request, runtime);
    }

    public ListPodsResponse listPodsWithOptions(ListPodsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DeployOrderId", request.deployOrderId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPods"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPodsResponse());
    }

    public ListPodsResponse listPods(ListPodsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listPodsWithOptions(request, runtime);
    }

    public ListServicesResponse listServicesWithOptions(ListServicesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppId", request.appId);
        query.put("EnvId", request.envId);
        query.put("Name", request.name);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("ServiceType", request.serviceType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListServices"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListServicesResponse());
    }

    public ListServicesResponse listServices(ListServicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listServicesWithOptions(request, runtime);
    }

    public ListSlbAPsResponse listSlbAPsWithOptions(ListSlbAPsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppId", request.appId);
        query.put("EnvId", request.envId);
        query.put("Name", request.name);
        query.put("NetworkMode", request.networkMode);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("SlbId", request.slbId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSlbAPs"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSlbAPsResponse());
    }

    public ListSlbAPsResponse listSlbAPs(ListSlbAPsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listSlbAPsWithOptions(request, runtime);
    }

    public ListUsersResponse listUsersWithOptions(ListUsersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUsers"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUsersResponse());
    }

    public ListUsersResponse listUsers(ListUsersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listUsersWithOptions(request, runtime);
    }

    public ModifyServiceResponse modifyServiceWithOptions(ModifyServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Name", request.name);
        query.put("ServiceId", request.serviceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyService"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyServiceResponse());
    }

    public ModifyServiceResponse modifyService(ModifyServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyServiceWithOptions(request, runtime);
    }

    public ModifySlbAPResponse modifySlbAPWithOptions(ModifySlbAPRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CookieTimeout", request.cookieTimeout);
        query.put("EstablishedTimeout", request.establishedTimeout);
        query.put("Name", request.name);
        query.put("RealServerPort", request.realServerPort);
        query.put("SlbAPId", request.slbAPId);
        query.put("SslCertId", request.sslCertId);
        query.put("StickySession", request.stickySession);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifySlbAP"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifySlbAPResponse());
    }

    public ModifySlbAPResponse modifySlbAP(ModifySlbAPRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifySlbAPWithOptions(request, runtime);
    }

    public QueryClusterDetailResponse queryClusterDetailWithOptions(QueryClusterDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryClusterDetail"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryClusterDetailResponse());
    }

    public QueryClusterDetailResponse queryClusterDetail(QueryClusterDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryClusterDetailWithOptions(request, runtime);
    }

    public RebuildAppInstanceResponse rebuildAppInstanceWithOptions(RebuildAppInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppId", request.appId);
        query.put("AppInstanceId", request.appInstanceId);
        query.put("EnvId", request.envId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RebuildAppInstance"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RebuildAppInstanceResponse());
    }

    public RebuildAppInstanceResponse rebuildAppInstance(RebuildAppInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.rebuildAppInstanceWithOptions(request, runtime);
    }

    public RemoveClusterNodeResponse removeClusterNodeWithOptions(RemoveClusterNodeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClusterInstanceId", request.clusterInstanceId);
        query.put("EcsInstanceIdList", request.ecsInstanceIdList);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveClusterNode"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveClusterNodeResponse());
    }

    public RemoveClusterNodeResponse removeClusterNode(RemoveClusterNodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeClusterNodeWithOptions(request, runtime);
    }

    public ResetAccountPasswordResponse resetAccountPasswordWithOptions(ResetAccountPasswordRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResetAccountPassword"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResetAccountPasswordResponse());
    }

    public ResetAccountPasswordResponse resetAccountPassword(ResetAccountPasswordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.resetAccountPasswordWithOptions(request, runtime);
    }

    public ResourceStatusNotifyResponse resourceStatusNotifyWithOptions(ResourceStatusNotifyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResourceStatusNotify"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResourceStatusNotifyResponse());
    }

    public ResourceStatusNotifyResponse resourceStatusNotify(ResourceStatusNotifyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.resourceStatusNotifyWithOptions(request, runtime);
    }

    public ResumeDeployResponse resumeDeployWithOptions(ResumeDeployRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DeployOrderId", request.deployOrderId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResumeDeploy"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResumeDeployResponse());
    }

    public ResumeDeployResponse resumeDeploy(ResumeDeployRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.resumeDeployWithOptions(request, runtime);
    }

    public ScaleAppResponse scaleAppWithOptions(ScaleAppRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("EnvId", request.envId);
        query.put("Replicas", request.replicas);
        query.put("TotalPartitions", request.totalPartitions);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ScaleApp"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ScaleAppResponse());
    }

    public ScaleAppResponse scaleApp(ScaleAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.scaleAppWithOptions(request, runtime);
    }

    public SetDeployPauseTypeResponse setDeployPauseTypeWithOptions(SetDeployPauseTypeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DeployOrderId", request.deployOrderId);
        query.put("DeployPauseType", request.deployPauseType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetDeployPauseType"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetDeployPauseTypeResponse());
    }

    public SetDeployPauseTypeResponse setDeployPauseType(SetDeployPauseTypeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setDeployPauseTypeWithOptions(request, runtime);
    }

    public SubmitInfoResponse submitInfoWithOptions(SubmitInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CallerUid", request.callerUid);
        query.put("MainUserId", request.mainUserId);
        query.put("RequestId", request.requestId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitInfo"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitInfoResponse());
    }

    public SubmitInfoResponse submitInfo(SubmitInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitInfoWithOptions(request, runtime);
    }

    public SyncPodInfoResponse syncPodInfoWithOptions(SyncPodInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("PodName", request.podName);
        query.put("Reason", request.reason);
        query.put("RequestId", request.requestId);
        query.put("SideCarType", request.sideCarType);
        query.put("Status", request.status);
        query.put("TaskId", request.taskId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SyncPodInfo"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SyncPodInfoResponse());
    }

    public SyncPodInfoResponse syncPodInfo(SyncPodInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.syncPodInfoWithOptions(request, runtime);
    }

    public UnbindGroupResponse unbindGroupWithOptions(UnbindGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppId", request.appId);
        query.put("BizCode", request.bizCode);
        query.put("Name", request.name);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnbindGroup"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnbindGroupResponse());
    }

    public UnbindGroupResponse unbindGroup(UnbindGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unbindGroupWithOptions(request, runtime);
    }

    public UnbindNodeLabelResponse unbindNodeLabelWithOptions(UnbindNodeLabelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClusterId", request.clusterId);
        query.put("InstanceId", request.instanceId);
        query.put("LabelKey", request.labelKey);
        query.put("LabelValue", request.labelValue);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnbindNodeLabel"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnbindNodeLabelResponse());
    }

    public UnbindNodeLabelResponse unbindNodeLabel(UnbindNodeLabelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unbindNodeLabelWithOptions(request, runtime);
    }

    public UpdateAppResponse updateAppWithOptions(UpdateAppRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateApp"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAppResponse());
    }

    public UpdateAppResponse updateApp(UpdateAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateAppWithOptions(request, runtime);
    }

    public UpdateAppMonitorsResponse updateAppMonitorsWithOptions(UpdateAppMonitorsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAppMonitors"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAppMonitorsResponse());
    }

    public UpdateAppMonitorsResponse updateAppMonitors(UpdateAppMonitorsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateAppMonitorsWithOptions(request, runtime);
    }

    public UpdateDeployConfigResponse updateDeployConfigWithOptions(UpdateDeployConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppId", request.appId);
        query.put("CodePath", request.codePath);
        query.put("ConfigMap", request.configMap);
        query.put("ConfigMapList", request.configMapList);
        query.put("CronJob", request.cronJob);
        query.put("Deployment", request.deployment);
        query.put("Id", request.id);
        query.put("SecretList", request.secretList);
        query.put("StatefulSet", request.statefulSet);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDeployConfig"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDeployConfigResponse());
    }

    public UpdateDeployConfigResponse updateDeployConfig(UpdateDeployConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateDeployConfigWithOptions(request, runtime);
    }

    public UpdateEciConfigResponse updateEciConfigWithOptions(UpdateEciConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppEnvId", request.appEnvId);
        query.put("EipBandwidth", request.eipBandwidth);
        query.put("EnableEciSchedulePolicy", request.enableEciSchedulePolicy);
        query.put("MirrorCache", request.mirrorCache);
        query.put("NormalInstanceLimit", request.normalInstanceLimit);
        query.put("ScheduleVirtualNode", request.scheduleVirtualNode);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateEciConfig"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateEciConfigResponse());
    }

    public UpdateEciConfigResponse updateEciConfig(UpdateEciConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateEciConfigWithOptions(request, runtime);
    }

    public UpdateEnvironmentResponse updateEnvironmentWithOptions(UpdateEnvironmentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppEnvId", request.appEnvId);
        query.put("AppId", request.appId);
        query.put("AppSchemaId", request.appSchemaId);
        query.put("Replicas", request.replicas);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateEnvironment"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateEnvironmentResponse());
    }

    public UpdateEnvironmentResponse updateEnvironment(UpdateEnvironmentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateEnvironmentWithOptions(request, runtime);
    }
}
