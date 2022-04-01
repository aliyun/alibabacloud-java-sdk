// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331;

import com.aliyun.tea.*;
import com.aliyun.taihao20210331.models.*;
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
        this._endpoint = this.getEndpoint("taihao", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AddClusterApplicationResponse addClusterApplicationWithOptions(AddClusterApplicationRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AddClusterApplicationShrinkRequest request = new AddClusterApplicationShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.addApplicationParam))) {
            request.addApplicationParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.addApplicationParam), "addApplicationParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addApplicationParamShrink)) {
            body.put("addApplicationParam", request.addApplicationParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddClusterApplication"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddClusterApplicationResponse());
    }

    public AddClusterApplicationResponse addClusterApplication(AddClusterApplicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addClusterApplicationWithOptions(request, runtime);
    }

    public AddSuspendPointOnWorkflowInstanceResponse addSuspendPointOnWorkflowInstanceWithOptions(AddSuspendPointOnWorkflowInstanceRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AddSuspendPointOnWorkflowInstanceShrinkRequest request = new AddSuspendPointOnWorkflowInstanceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.addSuspendOnWorkflowInstanceParam))) {
            request.addSuspendOnWorkflowInstanceParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.addSuspendOnWorkflowInstanceParam), "addSuspendOnWorkflowInstanceParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addSuspendOnWorkflowInstanceParamShrink)) {
            body.put("addSuspendOnWorkflowInstanceParam", request.addSuspendOnWorkflowInstanceParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddSuspendPointOnWorkflowInstance"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddSuspendPointOnWorkflowInstanceResponse());
    }

    public AddSuspendPointOnWorkflowInstanceResponse addSuspendPointOnWorkflowInstance(AddSuspendPointOnWorkflowInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addSuspendPointOnWorkflowInstanceWithOptions(request, runtime);
    }

    public CancelClusterOrdersResponse cancelClusterOrdersWithOptions(CancelClusterOrdersRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CancelClusterOrdersShrinkRequest request = new CancelClusterOrdersShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.cancelClusterOrdersParam))) {
            request.cancelClusterOrdersParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.cancelClusterOrdersParam), "cancelClusterOrdersParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cancelClusterOrdersParamShrink)) {
            body.put("cancelClusterOrdersParam", request.cancelClusterOrdersParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelClusterOrders"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelClusterOrdersResponse());
    }

    public CancelClusterOrdersResponse cancelClusterOrders(CancelClusterOrdersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cancelClusterOrdersWithOptions(request, runtime);
    }

    public ComAlibabaTccResponse comAlibabaTccWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ComAlibabaTcc"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ComAlibabaTccResponse());
    }

    public ComAlibabaTccResponse comAlibabaTcc() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.comAlibabaTccWithOptions(runtime);
    }

    public CreateAutoScalingPolicyResponse createAutoScalingPolicyWithOptions(CreateAutoScalingPolicyRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateAutoScalingPolicyShrinkRequest request = new CreateAutoScalingPolicyShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.createAutoScalingPolicyParam))) {
            request.createAutoScalingPolicyParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.createAutoScalingPolicyParam), "createAutoScalingPolicyParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.createAutoScalingPolicyParamShrink)) {
            body.put("createAutoScalingPolicyParam", request.createAutoScalingPolicyParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAutoScalingPolicy"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAutoScalingPolicyResponse());
    }

    public CreateAutoScalingPolicyResponse createAutoScalingPolicy(CreateAutoScalingPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAutoScalingPolicyWithOptions(request, runtime);
    }

    public CreateAutoScalingRuleResponse createAutoScalingRuleWithOptions(CreateAutoScalingRuleRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateAutoScalingRuleShrinkRequest request = new CreateAutoScalingRuleShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.createAutoScalingRuleParam))) {
            request.createAutoScalingRuleParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.createAutoScalingRuleParam), "createAutoScalingRuleParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.createAutoScalingRuleParamShrink)) {
            body.put("createAutoScalingRuleParam", request.createAutoScalingRuleParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAutoScalingRule"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAutoScalingRuleResponse());
    }

    public CreateAutoScalingRuleResponse createAutoScalingRule(CreateAutoScalingRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAutoScalingRuleWithOptions(request, runtime);
    }

    public CreateBindingAckClusterResponse createBindingAckClusterWithOptions(CreateBindingAckClusterRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateBindingAckClusterShrinkRequest request = new CreateBindingAckClusterShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.createBindingAckClusterParam))) {
            request.createBindingAckClusterParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.createBindingAckClusterParam), "createBindingAckClusterParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.createBindingAckClusterParamShrink)) {
            body.put("createBindingAckClusterParam", request.createBindingAckClusterParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateBindingAckCluster"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateBindingAckClusterResponse());
    }

    public CreateBindingAckClusterResponse createBindingAckCluster(CreateBindingAckClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createBindingAckClusterWithOptions(request, runtime);
    }

    public CreateClusterResponse createClusterWithOptions(CreateClusterRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateClusterShrinkRequest request = new CreateClusterShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.createClusterParam))) {
            request.createClusterParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.createClusterParam), "createClusterParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.createClusterParamShrink)) {
            body.put("createClusterParam", request.createClusterParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCluster"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateClusterResponse());
    }

    public CreateClusterResponse createCluster(CreateClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createClusterWithOptions(request, runtime);
    }

    public CreateClusterNodeGroupResponse createClusterNodeGroupWithOptions(CreateClusterNodeGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.createClusterNodeGroupParam))) {
            bodyFlat.put("createClusterNodeGroupParam", request.createClusterNodeGroupParam);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateClusterNodeGroup"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateClusterNodeGroupResponse());
    }

    public CreateClusterNodeGroupResponse createClusterNodeGroup(CreateClusterNodeGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createClusterNodeGroupWithOptions(request, runtime);
    }

    public CreateClusterScriptResponse createClusterScriptWithOptions(CreateClusterScriptRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateClusterScriptShrinkRequest request = new CreateClusterScriptShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.createClusterScriptParam))) {
            request.createClusterScriptParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.createClusterScriptParam), "createClusterScriptParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.createClusterScriptParamShrink)) {
            body.put("createClusterScriptParam", request.createClusterScriptParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateClusterScript"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateClusterScriptResponse());
    }

    public CreateClusterScriptResponse createClusterScript(CreateClusterScriptRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createClusterScriptWithOptions(request, runtime);
    }

    public CreateClusterUserResponse createClusterUserWithOptions(CreateClusterUserRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateClusterUserShrinkRequest request = new CreateClusterUserShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.createClusterUserParam))) {
            request.createClusterUserParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.createClusterUserParam), "createClusterUserParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.createClusterUserParamShrink)) {
            body.put("createClusterUserParam", request.createClusterUserParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateClusterUser"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateClusterUserResponse());
    }

    public CreateClusterUserResponse createClusterUser(CreateClusterUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createClusterUserWithOptions(request, runtime);
    }

    public CreateFullClusterResponse createFullClusterWithOptions(CreateFullClusterRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateFullClusterShrinkRequest request = new CreateFullClusterShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.createFullClusterParam))) {
            request.createFullClusterParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.createFullClusterParam), "createFullClusterParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.createFullClusterParamShrink)) {
            body.put("createFullClusterParam", request.createFullClusterParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFullCluster"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFullClusterResponse());
    }

    public CreateFullClusterResponse createFullCluster(CreateFullClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createFullClusterWithOptions(request, runtime);
    }

    public CreateFullClusterByMainVersionResponse createFullClusterByMainVersionWithOptions(CreateFullClusterByMainVersionRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateFullClusterByMainVersionShrinkRequest request = new CreateFullClusterByMainVersionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.createFullClusterByMainVersionParam))) {
            request.createFullClusterByMainVersionParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.createFullClusterByMainVersionParam), "createFullClusterByMainVersionParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.createFullClusterByMainVersionParamShrink)) {
            body.put("createFullClusterByMainVersionParam", request.createFullClusterByMainVersionParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFullClusterByMainVersion"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFullClusterByMainVersionResponse());
    }

    public CreateFullClusterByMainVersionResponse createFullClusterByMainVersion(CreateFullClusterByMainVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createFullClusterByMainVersionWithOptions(request, runtime);
    }

    public CreateMainVersionResponse createMainVersionWithOptions(CreateMainVersionRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateMainVersionShrinkRequest request = new CreateMainVersionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.createMainVersionParam))) {
            request.createMainVersionParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.createMainVersionParam), "CreateMainVersionParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.createMainVersionParamShrink)) {
            body.put("CreateMainVersionParam", request.createMainVersionParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMainVersion"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMainVersionResponse());
    }

    public CreateMainVersionResponse createMainVersion(CreateMainVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createMainVersionWithOptions(request, runtime);
    }

    public CreateStackApplicationResponse createStackApplicationWithOptions(CreateStackApplicationRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateStackApplicationShrinkRequest request = new CreateStackApplicationShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.createStackApplicationParam))) {
            request.createStackApplicationParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.createStackApplicationParam), "createStackApplicationParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.createStackApplicationParamShrink)) {
            body.put("createStackApplicationParam", request.createStackApplicationParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateStackApplication"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateStackApplicationResponse());
    }

    public CreateStackApplicationResponse createStackApplication(CreateStackApplicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createStackApplicationWithOptions(request, runtime);
    }

    public DecreaseNodeGroupResponse decreaseNodeGroupWithOptions(DecreaseNodeGroupRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DecreaseNodeGroupShrinkRequest request = new DecreaseNodeGroupShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.decreaseNodeGroupParam))) {
            request.decreaseNodeGroupParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.decreaseNodeGroupParam), "DecreaseNodeGroupParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.decreaseNodeGroupParamShrink)) {
            body.put("DecreaseNodeGroupParam", request.decreaseNodeGroupParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DecreaseNodeGroup"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DecreaseNodeGroupResponse());
    }

    public DecreaseNodeGroupResponse decreaseNodeGroup(DecreaseNodeGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.decreaseNodeGroupWithOptions(request, runtime);
    }

    public DeleteAutoScalingPolicyResponse deleteAutoScalingPolicyWithOptions(DeleteAutoScalingPolicyRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteAutoScalingPolicyShrinkRequest request = new DeleteAutoScalingPolicyShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.deleteAutoScalingPolicyParam))) {
            request.deleteAutoScalingPolicyParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.deleteAutoScalingPolicyParam), "deleteAutoScalingPolicyParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deleteAutoScalingPolicyParamShrink)) {
            body.put("deleteAutoScalingPolicyParam", request.deleteAutoScalingPolicyParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAutoScalingPolicy"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAutoScalingPolicyResponse());
    }

    public DeleteAutoScalingPolicyResponse deleteAutoScalingPolicy(DeleteAutoScalingPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAutoScalingPolicyWithOptions(request, runtime);
    }

    public DeleteAutoScalingRuleResponse deleteAutoScalingRuleWithOptions(DeleteAutoScalingRuleRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteAutoScalingRuleShrinkRequest request = new DeleteAutoScalingRuleShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.deleteAutoScalingRuleParam))) {
            request.deleteAutoScalingRuleParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.deleteAutoScalingRuleParam), "deleteAutoScalingRuleParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deleteAutoScalingRuleParamShrink)) {
            body.put("deleteAutoScalingRuleParam", request.deleteAutoScalingRuleParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAutoScalingRule"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAutoScalingRuleResponse());
    }

    public DeleteAutoScalingRuleResponse deleteAutoScalingRule(DeleteAutoScalingRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAutoScalingRuleWithOptions(request, runtime);
    }

    public DeleteClusterNodeGroupResponse deleteClusterNodeGroupWithOptions(DeleteClusterNodeGroupRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteClusterNodeGroupShrinkRequest request = new DeleteClusterNodeGroupShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.deleteNodeGroupParam))) {
            request.deleteNodeGroupParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.deleteNodeGroupParam), "deleteNodeGroupParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deleteNodeGroupParamShrink)) {
            body.put("deleteNodeGroupParam", request.deleteNodeGroupParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteClusterNodeGroup"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteClusterNodeGroupResponse());
    }

    public DeleteClusterNodeGroupResponse deleteClusterNodeGroup(DeleteClusterNodeGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteClusterNodeGroupWithOptions(request, runtime);
    }

    public DeleteClusterScriptResponse deleteClusterScriptWithOptions(DeleteClusterScriptRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteClusterScriptShrinkRequest request = new DeleteClusterScriptShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.deleteClusterScriptParam))) {
            request.deleteClusterScriptParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.deleteClusterScriptParam), "deleteClusterScriptParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deleteClusterScriptParamShrink)) {
            body.put("deleteClusterScriptParam", request.deleteClusterScriptParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteClusterScript"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteClusterScriptResponse());
    }

    public DeleteClusterScriptResponse deleteClusterScript(DeleteClusterScriptRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteClusterScriptWithOptions(request, runtime);
    }

    public DeleteClusterUserResponse deleteClusterUserWithOptions(DeleteClusterUserRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteClusterUserShrinkRequest request = new DeleteClusterUserShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.deleteClusterUserParam))) {
            request.deleteClusterUserParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.deleteClusterUserParam), "deleteClusterUserParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deleteClusterUserParamShrink)) {
            body.put("deleteClusterUserParam", request.deleteClusterUserParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteClusterUser"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteClusterUserResponse());
    }

    public DeleteClusterUserResponse deleteClusterUser(DeleteClusterUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteClusterUserWithOptions(request, runtime);
    }

    public DeleteKubeCustomerResourceResponse deleteKubeCustomerResourceWithOptions(DeleteKubeCustomerResourceRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteKubeCustomerResourceShrinkRequest request = new DeleteKubeCustomerResourceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.deleteKubeCustomerResourcesParam))) {
            request.deleteKubeCustomerResourcesParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.deleteKubeCustomerResourcesParam), "deleteKubeCustomerResourcesParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deleteKubeCustomerResourcesParamShrink)) {
            body.put("deleteKubeCustomerResourcesParam", request.deleteKubeCustomerResourcesParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteKubeCustomerResource"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteKubeCustomerResourceResponse());
    }

    public DeleteKubeCustomerResourceResponse deleteKubeCustomerResource(DeleteKubeCustomerResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteKubeCustomerResourceWithOptions(request, runtime);
    }

    public DeleteKubeNativeResourcesResponse deleteKubeNativeResourcesWithOptions(DeleteKubeNativeResourcesRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteKubeNativeResourcesShrinkRequest request = new DeleteKubeNativeResourcesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.deleteKubeNativeResourcesParam))) {
            request.deleteKubeNativeResourcesParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.deleteKubeNativeResourcesParam), "deleteKubeNativeResourcesParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deleteKubeNativeResourcesParamShrink)) {
            body.put("deleteKubeNativeResourcesParam", request.deleteKubeNativeResourcesParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteKubeNativeResources"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteKubeNativeResourcesResponse());
    }

    public DeleteKubeNativeResourcesResponse deleteKubeNativeResources(DeleteKubeNativeResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteKubeNativeResourcesWithOptions(request, runtime);
    }

    public DeleteStackApplicationResponse deleteStackApplicationWithOptions(DeleteStackApplicationRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteStackApplicationShrinkRequest request = new DeleteStackApplicationShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.deleteStackApplicationParam))) {
            request.deleteStackApplicationParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.deleteStackApplicationParam), "deleteStackApplicationParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deleteStackApplicationParamShrink)) {
            body.put("deleteStackApplicationParam", request.deleteStackApplicationParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteStackApplication"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteStackApplicationResponse());
    }

    public DeleteStackApplicationResponse deleteStackApplication(DeleteStackApplicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteStackApplicationWithOptions(request, runtime);
    }

    public DeployApplicationsResponse deployApplicationsWithOptions(DeployApplicationsRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeployApplicationsShrinkRequest request = new DeployApplicationsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.deployApplicationParam))) {
            request.deployApplicationParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.deployApplicationParam), "deployApplicationParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deployApplicationParamShrink)) {
            body.put("deployApplicationParam", request.deployApplicationParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeployApplications"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeployApplicationsResponse());
    }

    public DeployApplicationsResponse deployApplications(DeployApplicationsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deployApplicationsWithOptions(request, runtime);
    }

    public DisableAutoScalingPolicyResponse disableAutoScalingPolicyWithOptions(DisableAutoScalingPolicyRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DisableAutoScalingPolicyShrinkRequest request = new DisableAutoScalingPolicyShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.disableAutoScalingPolicyParam))) {
            request.disableAutoScalingPolicyParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.disableAutoScalingPolicyParam), "disableAutoScalingPolicyParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.disableAutoScalingPolicyParamShrink)) {
            body.put("disableAutoScalingPolicyParam", request.disableAutoScalingPolicyParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableAutoScalingPolicy"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableAutoScalingPolicyResponse());
    }

    public DisableAutoScalingPolicyResponse disableAutoScalingPolicy(DisableAutoScalingPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.disableAutoScalingPolicyWithOptions(request, runtime);
    }

    public EnableAutoScalingPolicyResponse enableAutoScalingPolicyWithOptions(EnableAutoScalingPolicyRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        EnableAutoScalingPolicyShrinkRequest request = new EnableAutoScalingPolicyShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.enableAutoScalingPolicyParam))) {
            request.enableAutoScalingPolicyParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.enableAutoScalingPolicyParam), "enableAutoScalingPolicyParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.enableAutoScalingPolicyParamShrink)) {
            body.put("enableAutoScalingPolicyParam", request.enableAutoScalingPolicyParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableAutoScalingPolicy"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableAutoScalingPolicyResponse());
    }

    public EnableAutoScalingPolicyResponse enableAutoScalingPolicy(EnableAutoScalingPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.enableAutoScalingPolicyWithOptions(request, runtime);
    }

    public ExecuteClusterScriptResponse executeClusterScriptWithOptions(ExecuteClusterScriptRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ExecuteClusterScriptShrinkRequest request = new ExecuteClusterScriptShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.executeClusterScriptParam))) {
            request.executeClusterScriptParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.executeClusterScriptParam), "executeClusterScriptParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.executeClusterScriptParamShrink)) {
            body.put("executeClusterScriptParam", request.executeClusterScriptParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExecuteClusterScript"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExecuteClusterScriptResponse());
    }

    public ExecuteClusterScriptResponse executeClusterScript(ExecuteClusterScriptRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.executeClusterScriptWithOptions(request, runtime);
    }

    public GetApplicationActionsResponse getApplicationActionsWithOptions(GetApplicationActionsRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetApplicationActionsShrinkRequest request = new GetApplicationActionsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.getApplicationActionsParam))) {
            request.getApplicationActionsParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.getApplicationActionsParam), "getApplicationActionsParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.getApplicationActionsParamShrink)) {
            body.put("getApplicationActionsParam", request.getApplicationActionsParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetApplicationActions"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetApplicationActionsResponse());
    }

    public GetApplicationActionsResponse getApplicationActions(GetApplicationActionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getApplicationActionsWithOptions(request, runtime);
    }

    public GetAutoScalingActivityResponse getAutoScalingActivityWithOptions(GetAutoScalingActivityRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetAutoScalingActivityShrinkRequest request = new GetAutoScalingActivityShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.getAutoScalingActivityParam))) {
            request.getAutoScalingActivityParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.getAutoScalingActivityParam), "getAutoScalingActivityParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.getAutoScalingActivityParamShrink)) {
            body.put("getAutoScalingActivityParam", request.getAutoScalingActivityParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAutoScalingActivity"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAutoScalingActivityResponse());
    }

    public GetAutoScalingActivityResponse getAutoScalingActivity(GetAutoScalingActivityRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAutoScalingActivityWithOptions(request, runtime);
    }

    public GetAutoScalingPolicyResponse getAutoScalingPolicyWithOptions(GetAutoScalingPolicyRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetAutoScalingPolicyShrinkRequest request = new GetAutoScalingPolicyShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.getAutoScalingPolicyParam))) {
            request.getAutoScalingPolicyParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.getAutoScalingPolicyParam), "getAutoScalingPolicyParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.getAutoScalingPolicyParamShrink)) {
            body.put("getAutoScalingPolicyParam", request.getAutoScalingPolicyParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAutoScalingPolicy"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAutoScalingPolicyResponse());
    }

    public GetAutoScalingPolicyResponse getAutoScalingPolicy(GetAutoScalingPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAutoScalingPolicyWithOptions(request, runtime);
    }

    public GetClusterResponse getClusterWithOptions(GetClusterRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetClusterShrinkRequest request = new GetClusterShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.clusterBaseParam))) {
            request.clusterBaseParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.clusterBaseParam), "clusterBaseParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterBaseParamShrink)) {
            body.put("clusterBaseParam", request.clusterBaseParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCluster"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetClusterResponse());
    }

    public GetClusterResponse getCluster(GetClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getClusterWithOptions(request, runtime);
    }

    public GetClusterOperationResponse getClusterOperationWithOptions(GetClusterOperationRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetClusterOperationShrinkRequest request = new GetClusterOperationShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.getClusterOperationParam))) {
            request.getClusterOperationParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.getClusterOperationParam), "getClusterOperationParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.getClusterOperationParamShrink)) {
            body.put("getClusterOperationParam", request.getClusterOperationParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetClusterOperation"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetClusterOperationResponse());
    }

    public GetClusterOperationResponse getClusterOperation(GetClusterOperationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getClusterOperationWithOptions(request, runtime);
    }

    public GetClusterOperationNodeResponse getClusterOperationNodeWithOptions(GetClusterOperationNodeRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetClusterOperationNodeShrinkRequest request = new GetClusterOperationNodeShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.getClusterOperationNodeParam))) {
            request.getClusterOperationNodeParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.getClusterOperationNodeParam), "getClusterOperationNodeParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.getClusterOperationNodeParamShrink)) {
            body.put("getClusterOperationNodeParam", request.getClusterOperationNodeParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetClusterOperationNode"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetClusterOperationNodeResponse());
    }

    public GetClusterOperationNodeResponse getClusterOperationNode(GetClusterOperationNodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getClusterOperationNodeWithOptions(request, runtime);
    }

    public GetClusterOperationTaskLogResponse getClusterOperationTaskLogWithOptions(GetClusterOperationTaskLogRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetClusterOperationTaskLogShrinkRequest request = new GetClusterOperationTaskLogShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.getClusterOperationTaskLogParam))) {
            request.getClusterOperationTaskLogParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.getClusterOperationTaskLogParam), "getClusterOperationTaskLogParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.getClusterOperationTaskLogParamShrink)) {
            body.put("getClusterOperationTaskLogParam", request.getClusterOperationTaskLogParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetClusterOperationTaskLog"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetClusterOperationTaskLogResponse());
    }

    public GetClusterOperationTaskLogResponse getClusterOperationTaskLog(GetClusterOperationTaskLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getClusterOperationTaskLogWithOptions(request, runtime);
    }

    public GetClusterScriptDetailResponse getClusterScriptDetailWithOptions(GetClusterScriptDetailRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetClusterScriptDetailShrinkRequest request = new GetClusterScriptDetailShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.getClusterScriptDetailParam))) {
            request.getClusterScriptDetailParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.getClusterScriptDetailParam), "getClusterScriptDetailParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.getClusterScriptDetailParamShrink)) {
            body.put("getClusterScriptDetailParam", request.getClusterScriptDetailParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetClusterScriptDetail"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetClusterScriptDetailResponse());
    }

    public GetClusterScriptDetailResponse getClusterScriptDetail(GetClusterScriptDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getClusterScriptDetailWithOptions(request, runtime);
    }

    public GetConfigTagsResponse getConfigTagsWithOptions(GetConfigTagsRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetConfigTagsShrinkRequest request = new GetConfigTagsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.getConfigTagsParam))) {
            request.getConfigTagsParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.getConfigTagsParam), "getConfigTagsParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.getConfigTagsParamShrink)) {
            body.put("getConfigTagsParam", request.getConfigTagsParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetConfigTags"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetConfigTagsResponse());
    }

    public GetConfigTagsResponse getConfigTags(GetConfigTagsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getConfigTagsWithOptions(request, runtime);
    }

    public GetDependApplicationsResponse getDependApplicationsWithOptions(GetDependApplicationsRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetDependApplicationsShrinkRequest request = new GetDependApplicationsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.getDependApplicationsParam))) {
            request.getDependApplicationsParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.getDependApplicationsParam), "getDependApplicationsParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.getDependApplicationsParamShrink)) {
            body.put("getDependApplicationsParam", request.getDependApplicationsParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDependApplications"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDependApplicationsResponse());
    }

    public GetDependApplicationsResponse getDependApplications(GetDependApplicationsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDependApplicationsWithOptions(request, runtime);
    }

    public GetMainVersionDetailResponse getMainVersionDetailWithOptions(GetMainVersionDetailRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetMainVersionDetailShrinkRequest request = new GetMainVersionDetailShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.getMainVersionDetailParam))) {
            request.getMainVersionDetailParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.getMainVersionDetailParam), "getMainVersionDetailParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.getMainVersionDetailParamShrink)) {
            body.put("getMainVersionDetailParam", request.getMainVersionDetailParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMainVersionDetail"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMainVersionDetailResponse());
    }

    public GetMainVersionDetailResponse getMainVersionDetail(GetMainVersionDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getMainVersionDetailWithOptions(request, runtime);
    }

    public GetReportResponse getReportWithOptions(GetReportRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetReportShrinkRequest request = new GetReportShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.getReportParam))) {
            request.getReportParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.getReportParam), "getReportParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.getReportParamShrink)) {
            body.put("getReportParam", request.getReportParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetReport"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetReportResponse());
    }

    public GetReportResponse getReport(GetReportRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getReportWithOptions(request, runtime);
    }

    public GetReportDataResponse getReportDataWithOptions(GetReportDataRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetReportDataShrinkRequest request = new GetReportDataShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.getReportDataParam))) {
            request.getReportDataParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.getReportDataParam), "getReportDataParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.getReportDataParamShrink)) {
            body.put("getReportDataParam", request.getReportDataParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetReportData"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetReportDataResponse());
    }

    public GetReportDataResponse getReportData(GetReportDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getReportDataWithOptions(request, runtime);
    }

    public GetStackApplicationResponse getStackApplicationWithOptions(GetStackApplicationRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetStackApplicationShrinkRequest request = new GetStackApplicationShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.getStackApplicationParam))) {
            request.getStackApplicationParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.getStackApplicationParam), "getStackApplicationParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.getStackApplicationParamShrink)) {
            body.put("getStackApplicationParam", request.getStackApplicationParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetStackApplication"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetStackApplicationResponse());
    }

    public GetStackApplicationResponse getStackApplication(GetStackApplicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getStackApplicationWithOptions(request, runtime);
    }

    public GetWorkflowDefinitionResponse getWorkflowDefinitionWithOptions(GetWorkflowDefinitionRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetWorkflowDefinitionShrinkRequest request = new GetWorkflowDefinitionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.getWorkflowDefinitionParam))) {
            request.getWorkflowDefinitionParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.getWorkflowDefinitionParam), "getWorkflowDefinitionParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.getWorkflowDefinitionParamShrink)) {
            body.put("getWorkflowDefinitionParam", request.getWorkflowDefinitionParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWorkflowDefinition"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWorkflowDefinitionResponse());
    }

    public GetWorkflowDefinitionResponse getWorkflowDefinition(GetWorkflowDefinitionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getWorkflowDefinitionWithOptions(request, runtime);
    }

    public GetWorkflowInstanceResponse getWorkflowInstanceWithOptions(GetWorkflowInstanceRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetWorkflowInstanceShrinkRequest request = new GetWorkflowInstanceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.getWorkflowInstanceParam))) {
            request.getWorkflowInstanceParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.getWorkflowInstanceParam), "getWorkflowInstanceParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.getWorkflowInstanceParamShrink)) {
            body.put("getWorkflowInstanceParam", request.getWorkflowInstanceParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWorkflowInstance"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWorkflowInstanceResponse());
    }

    public GetWorkflowInstanceResponse getWorkflowInstance(GetWorkflowInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getWorkflowInstanceWithOptions(request, runtime);
    }

    public IncreaseNodeGroupResponse increaseNodeGroupWithOptions(IncreaseNodeGroupRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        IncreaseNodeGroupShrinkRequest request = new IncreaseNodeGroupShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.increaseNodeGroupParam))) {
            request.increaseNodeGroupParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.increaseNodeGroupParam), "increaseNodeGroupParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.increaseNodeGroupParamShrink)) {
            body.put("increaseNodeGroupParam", request.increaseNodeGroupParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "IncreaseNodeGroup"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new IncreaseNodeGroupResponse());
    }

    public IncreaseNodeGroupResponse increaseNodeGroup(IncreaseNodeGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.increaseNodeGroupWithOptions(request, runtime);
    }

    public IncreaseNodeGroupDiskResponse increaseNodeGroupDiskWithOptions(IncreaseNodeGroupDiskRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        IncreaseNodeGroupDiskShrinkRequest request = new IncreaseNodeGroupDiskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.increaseDiskParam))) {
            request.increaseDiskParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.increaseDiskParam), "increaseDiskParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.increaseDiskParamShrink)) {
            body.put("increaseDiskParam", request.increaseDiskParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "IncreaseNodeGroupDisk"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new IncreaseNodeGroupDiskResponse());
    }

    public IncreaseNodeGroupDiskResponse increaseNodeGroupDisk(IncreaseNodeGroupDiskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.increaseNodeGroupDiskWithOptions(request, runtime);
    }

    public JoinResourceGroupResponse joinResourceGroupWithOptions(JoinResourceGroupRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        JoinResourceGroupShrinkRequest request = new JoinResourceGroupShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.joinResourceGroupParam))) {
            request.joinResourceGroupParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.joinResourceGroupParam), "joinResourceGroupParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.joinResourceGroupParamShrink)) {
            body.put("joinResourceGroupParam", request.joinResourceGroupParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "JoinResourceGroup"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new JoinResourceGroupResponse());
    }

    public JoinResourceGroupResponse joinResourceGroup(JoinResourceGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.joinResourceGroupWithOptions(request, runtime);
    }

    public ListAckClusterNodePoolsResponse listAckClusterNodePoolsWithOptions(ListAckClusterNodePoolsRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListAckClusterNodePoolsShrinkRequest request = new ListAckClusterNodePoolsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.listAckClusterNodePoolsParam))) {
            request.listAckClusterNodePoolsParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.listAckClusterNodePoolsParam), "listAckClusterNodePoolsParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.listAckClusterNodePoolsParamShrink)) {
            body.put("listAckClusterNodePoolsParam", request.listAckClusterNodePoolsParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAckClusterNodePools"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAckClusterNodePoolsResponse());
    }

    public ListAckClusterNodePoolsResponse listAckClusterNodePools(ListAckClusterNodePoolsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAckClusterNodePoolsWithOptions(request, runtime);
    }

    public ListAckClusterNodesResponse listAckClusterNodesWithOptions(ListAckClusterNodesRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListAckClusterNodesShrinkRequest request = new ListAckClusterNodesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.listAckClusterNodesParam))) {
            request.listAckClusterNodesParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.listAckClusterNodesParam), "listAckClusterNodesParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.listAckClusterNodesParamShrink)) {
            body.put("listAckClusterNodesParam", request.listAckClusterNodesParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAckClusterNodes"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAckClusterNodesResponse());
    }

    public ListAckClusterNodesResponse listAckClusterNodes(ListAckClusterNodesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAckClusterNodesWithOptions(request, runtime);
    }

    public ListApplicationMetaResponse listApplicationMetaWithOptions(ListApplicationMetaRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListApplicationMetaShrinkRequest request = new ListApplicationMetaShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.listApplicationMetaParam))) {
            request.listApplicationMetaParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.listApplicationMetaParam), "listApplicationMetaParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.listApplicationMetaParamShrink)) {
            body.put("listApplicationMetaParam", request.listApplicationMetaParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListApplicationMeta"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListApplicationMetaResponse());
    }

    public ListApplicationMetaResponse listApplicationMeta(ListApplicationMetaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listApplicationMetaWithOptions(request, runtime);
    }

    public ListApplicationsResponse listApplicationsWithOptions(ListApplicationsRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListApplicationsShrinkRequest request = new ListApplicationsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.listApplicationsParam))) {
            request.listApplicationsParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.listApplicationsParam), "listApplicationsParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.listApplicationsParamShrink)) {
            body.put("listApplicationsParam", request.listApplicationsParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListApplications"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListApplicationsResponse());
    }

    public ListApplicationsResponse listApplications(ListApplicationsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listApplicationsWithOptions(request, runtime);
    }

    public ListAutoScalingActivitiesResponse listAutoScalingActivitiesWithOptions(ListAutoScalingActivitiesRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListAutoScalingActivitiesShrinkRequest request = new ListAutoScalingActivitiesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.listAutoScalingActivitiesParam))) {
            request.listAutoScalingActivitiesParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.listAutoScalingActivitiesParam), "listAutoScalingActivitiesParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.listAutoScalingActivitiesParamShrink)) {
            body.put("listAutoScalingActivitiesParam", request.listAutoScalingActivitiesParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAutoScalingActivities"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAutoScalingActivitiesResponse());
    }

    public ListAutoScalingActivitiesResponse listAutoScalingActivities(ListAutoScalingActivitiesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAutoScalingActivitiesWithOptions(request, runtime);
    }

    public ListAutoScalingMetricsResponse listAutoScalingMetricsWithOptions(ListAutoScalingMetricsRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListAutoScalingMetricsShrinkRequest request = new ListAutoScalingMetricsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.listAutoScalingMetricsParam))) {
            request.listAutoScalingMetricsParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.listAutoScalingMetricsParam), "listAutoScalingMetricsParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.listAutoScalingMetricsParamShrink)) {
            body.put("listAutoScalingMetricsParam", request.listAutoScalingMetricsParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAutoScalingMetrics"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAutoScalingMetricsResponse());
    }

    public ListAutoScalingMetricsResponse listAutoScalingMetrics(ListAutoScalingMetricsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAutoScalingMetricsWithOptions(request, runtime);
    }

    public ListAutoScalingPoliciesResponse listAutoScalingPoliciesWithOptions(ListAutoScalingPoliciesRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListAutoScalingPoliciesShrinkRequest request = new ListAutoScalingPoliciesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.listAutoScalingPoliciesParam))) {
            request.listAutoScalingPoliciesParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.listAutoScalingPoliciesParam), "listAutoScalingPoliciesParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.listAutoScalingPoliciesParamShrink)) {
            body.put("listAutoScalingPoliciesParam", request.listAutoScalingPoliciesParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAutoScalingPolicies"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAutoScalingPoliciesResponse());
    }

    public ListAutoScalingPoliciesResponse listAutoScalingPolicies(ListAutoScalingPoliciesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAutoScalingPoliciesWithOptions(request, runtime);
    }

    public ListAutoScalingRulesResponse listAutoScalingRulesWithOptions(ListAutoScalingRulesRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListAutoScalingRulesShrinkRequest request = new ListAutoScalingRulesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.listAutoScalingRulesParam))) {
            request.listAutoScalingRulesParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.listAutoScalingRulesParam), "listAutoScalingRulesParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.listAutoScalingRulesParamShrink)) {
            body.put("listAutoScalingRulesParam", request.listAutoScalingRulesParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAutoScalingRules"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAutoScalingRulesResponse());
    }

    public ListAutoScalingRulesResponse listAutoScalingRules(ListAutoScalingRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAutoScalingRulesWithOptions(request, runtime);
    }

    public ListClusterAckByAckInstanceIdsResponse listClusterAckByAckInstanceIdsWithOptions(ListClusterAckByAckInstanceIdsRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListClusterAckByAckInstanceIdsShrinkRequest request = new ListClusterAckByAckInstanceIdsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.listClusterAckByInstanceIdsParam))) {
            request.listClusterAckByInstanceIdsParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.listClusterAckByInstanceIdsParam), "listClusterAckByInstanceIdsParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.listClusterAckByInstanceIdsParamShrink)) {
            body.put("listClusterAckByInstanceIdsParam", request.listClusterAckByInstanceIdsParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListClusterAckByAckInstanceIds"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListClusterAckByAckInstanceIdsResponse());
    }

    public ListClusterAckByAckInstanceIdsResponse listClusterAckByAckInstanceIds(ListClusterAckByAckInstanceIdsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listClusterAckByAckInstanceIdsWithOptions(request, runtime);
    }

    public ListClusterAckByClusterIdsResponse listClusterAckByClusterIdsWithOptions(ListClusterAckByClusterIdsRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListClusterAckByClusterIdsShrinkRequest request = new ListClusterAckByClusterIdsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.listClusterAckClusterByClusterIdsParam))) {
            request.listClusterAckClusterByClusterIdsParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.listClusterAckClusterByClusterIdsParam), "listClusterAckClusterByClusterIdsParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.listClusterAckClusterByClusterIdsParamShrink)) {
            body.put("listClusterAckClusterByClusterIdsParam", request.listClusterAckClusterByClusterIdsParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListClusterAckByClusterIds"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListClusterAckByClusterIdsResponse());
    }

    public ListClusterAckByClusterIdsResponse listClusterAckByClusterIds(ListClusterAckByClusterIdsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listClusterAckByClusterIdsWithOptions(request, runtime);
    }

    public ListClusterNodeGroupResponse listClusterNodeGroupWithOptions(ListClusterNodeGroupRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListClusterNodeGroupShrinkRequest request = new ListClusterNodeGroupShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.listClusterNodeGroupsParam))) {
            request.listClusterNodeGroupsParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.listClusterNodeGroupsParam), "listClusterNodeGroupsParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.listClusterNodeGroupsParamShrink)) {
            body.put("listClusterNodeGroupsParam", request.listClusterNodeGroupsParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListClusterNodeGroup"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListClusterNodeGroupResponse());
    }

    public ListClusterNodeGroupResponse listClusterNodeGroup(ListClusterNodeGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listClusterNodeGroupWithOptions(request, runtime);
    }

    public ListClusterOperationNodesResponse listClusterOperationNodesWithOptions(ListClusterOperationNodesRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListClusterOperationNodesShrinkRequest request = new ListClusterOperationNodesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.listClusterOperationNodesParam))) {
            request.listClusterOperationNodesParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.listClusterOperationNodesParam), "listClusterOperationNodesParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.listClusterOperationNodesParamShrink)) {
            body.put("listClusterOperationNodesParam", request.listClusterOperationNodesParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListClusterOperationNodes"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListClusterOperationNodesResponse());
    }

    public ListClusterOperationNodesResponse listClusterOperationNodes(ListClusterOperationNodesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listClusterOperationNodesWithOptions(request, runtime);
    }

    public ListClusterOperationTasksResponse listClusterOperationTasksWithOptions(ListClusterOperationTasksRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListClusterOperationTasksShrinkRequest request = new ListClusterOperationTasksShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.listClusterOperationTasksParam))) {
            request.listClusterOperationTasksParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.listClusterOperationTasksParam), "listClusterOperationTasksParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.listClusterOperationTasksParamShrink)) {
            body.put("listClusterOperationTasksParam", request.listClusterOperationTasksParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListClusterOperationTasks"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListClusterOperationTasksResponse());
    }

    public ListClusterOperationTasksResponse listClusterOperationTasks(ListClusterOperationTasksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listClusterOperationTasksWithOptions(request, runtime);
    }

    public ListClusterOperationsResponse listClusterOperationsWithOptions(ListClusterOperationsRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListClusterOperationsShrinkRequest request = new ListClusterOperationsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.listClusterOperationsParam))) {
            request.listClusterOperationsParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.listClusterOperationsParam), "listClusterOperationsParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.listClusterOperationsParamShrink)) {
            body.put("listClusterOperationsParam", request.listClusterOperationsParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListClusterOperations"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListClusterOperationsResponse());
    }

    public ListClusterOperationsResponse listClusterOperations(ListClusterOperationsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listClusterOperationsWithOptions(request, runtime);
    }

    public ListClusterOrdersResponse listClusterOrdersWithOptions(ListClusterOrdersRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListClusterOrdersShrinkRequest request = new ListClusterOrdersShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.listClusterOrdersParam))) {
            request.listClusterOrdersParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.listClusterOrdersParam), "listClusterOrdersParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.listClusterOrdersParamShrink)) {
            body.put("listClusterOrdersParam", request.listClusterOrdersParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListClusterOrders"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListClusterOrdersResponse());
    }

    public ListClusterOrdersResponse listClusterOrders(ListClusterOrdersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listClusterOrdersWithOptions(request, runtime);
    }

    public ListClusterScriptsResponse listClusterScriptsWithOptions(ListClusterScriptsRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListClusterScriptsShrinkRequest request = new ListClusterScriptsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.listClusterScriptsParam))) {
            request.listClusterScriptsParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.listClusterScriptsParam), "listClusterScriptsParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.listClusterScriptsParamShrink)) {
            body.put("listClusterScriptsParam", request.listClusterScriptsParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListClusterScripts"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListClusterScriptsResponse());
    }

    public ListClusterScriptsResponse listClusterScripts(ListClusterScriptsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listClusterScriptsWithOptions(request, runtime);
    }

    public ListClusterUsersResponse listClusterUsersWithOptions(ListClusterUsersRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListClusterUsersShrinkRequest request = new ListClusterUsersShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.listClusterUsersParam))) {
            request.listClusterUsersParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.listClusterUsersParam), "listClusterUsersParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.listClusterUsersParamShrink)) {
            body.put("listClusterUsersParam", request.listClusterUsersParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListClusterUsers"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListClusterUsersResponse());
    }

    public ListClusterUsersResponse listClusterUsers(ListClusterUsersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listClusterUsersWithOptions(request, runtime);
    }

    public ListClustersResponse listClustersWithOptions(ListClustersRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListClustersShrinkRequest request = new ListClustersShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.listClustersParam))) {
            request.listClustersParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.listClustersParam), "listClustersParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.listClustersParamShrink)) {
            body.put("listClustersParam", request.listClustersParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListClusters"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListClustersResponse());
    }

    public ListClustersResponse listClusters(ListClustersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listClustersWithOptions(request, runtime);
    }

    public ListComponentInstancesResponse listComponentInstancesWithOptions(ListComponentInstancesRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListComponentInstancesShrinkRequest request = new ListComponentInstancesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.listComponentInstancesParam))) {
            request.listComponentInstancesParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.listComponentInstancesParam), "listComponentInstancesParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.listComponentInstancesParamShrink)) {
            body.put("listComponentInstancesParam", request.listComponentInstancesParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListComponentInstances"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListComponentInstancesResponse());
    }

    public ListComponentInstancesResponse listComponentInstances(ListComponentInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listComponentInstancesWithOptions(request, runtime);
    }

    public ListComponentsResponse listComponentsWithOptions(ListComponentsRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListComponentsShrinkRequest request = new ListComponentsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.listComponentsParam))) {
            request.listComponentsParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.listComponentsParam), "listComponentsParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.listComponentsParamShrink)) {
            body.put("listComponentsParam", request.listComponentsParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListComponents"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListComponentsResponse());
    }

    public ListComponentsResponse listComponents(ListComponentsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listComponentsWithOptions(request, runtime);
    }

    public ListConfigFilesResponse listConfigFilesWithOptions(ListConfigFilesRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListConfigFilesShrinkRequest request = new ListConfigFilesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.listConfigFilesParam))) {
            request.listConfigFilesParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.listConfigFilesParam), "listConfigFilesParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.listConfigFilesParamShrink)) {
            body.put("listConfigFilesParam", request.listConfigFilesParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListConfigFiles"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListConfigFilesResponse());
    }

    public ListConfigFilesResponse listConfigFiles(ListConfigFilesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listConfigFilesWithOptions(request, runtime);
    }

    public ListConfigHistoryResponse listConfigHistoryWithOptions(ListConfigHistoryRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListConfigHistoryShrinkRequest request = new ListConfigHistoryShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.listConfigHistoryParam))) {
            request.listConfigHistoryParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.listConfigHistoryParam), "listConfigHistoryParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.listConfigHistoryParamShrink)) {
            body.put("listConfigHistoryParam", request.listConfigHistoryParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListConfigHistory"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListConfigHistoryResponse());
    }

    public ListConfigHistoryResponse listConfigHistory(ListConfigHistoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listConfigHistoryWithOptions(request, runtime);
    }

    public ListConfigVersionsResponse listConfigVersionsWithOptions(ListConfigVersionsRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListConfigVersionsShrinkRequest request = new ListConfigVersionsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.listConfigVersionsParam))) {
            request.listConfigVersionsParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.listConfigVersionsParam), "listConfigVersionsParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.listConfigVersionsParamShrink)) {
            body.put("listConfigVersionsParam", request.listConfigVersionsParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListConfigVersions"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListConfigVersionsResponse());
    }

    public ListConfigVersionsResponse listConfigVersions(ListConfigVersionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listConfigVersionsWithOptions(request, runtime);
    }

    public ListConfigsResponse listConfigsWithOptions(ListConfigsRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListConfigsShrinkRequest request = new ListConfigsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.listConfigsParam))) {
            request.listConfigsParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.listConfigsParam), "listConfigsParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.listConfigsParamShrink)) {
            body.put("listConfigsParam", request.listConfigsParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListConfigs"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListConfigsResponse());
    }

    public ListConfigsResponse listConfigs(ListConfigsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listConfigsWithOptions(request, runtime);
    }

    public ListKubeCustomerResourceResponse listKubeCustomerResourceWithOptions(ListKubeCustomerResourceRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListKubeCustomerResourceShrinkRequest request = new ListKubeCustomerResourceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.listKubeCustomerResourcesParam))) {
            request.listKubeCustomerResourcesParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.listKubeCustomerResourcesParam), "listKubeCustomerResourcesParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.listKubeCustomerResourcesParamShrink)) {
            body.put("listKubeCustomerResourcesParam", request.listKubeCustomerResourcesParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListKubeCustomerResource"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListKubeCustomerResourceResponse());
    }

    public ListKubeCustomerResourceResponse listKubeCustomerResource(ListKubeCustomerResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listKubeCustomerResourceWithOptions(request, runtime);
    }

    public ListKubeNativeResourcesResponse listKubeNativeResourcesWithOptions(ListKubeNativeResourcesRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListKubeNativeResourcesShrinkRequest request = new ListKubeNativeResourcesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.listKubeNativeResourcesParam))) {
            request.listKubeNativeResourcesParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.listKubeNativeResourcesParam), "listKubeNativeResourcesParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.listKubeNativeResourcesParamShrink)) {
            body.put("listKubeNativeResourcesParam", request.listKubeNativeResourcesParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListKubeNativeResources"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListKubeNativeResourcesResponse());
    }

    public ListKubeNativeResourcesResponse listKubeNativeResources(ListKubeNativeResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listKubeNativeResourcesWithOptions(request, runtime);
    }

    public ListMainVersionsResponse listMainVersionsWithOptions(ListMainVersionsRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListMainVersionsShrinkRequest request = new ListMainVersionsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.listMainVersionsParam))) {
            request.listMainVersionsParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.listMainVersionsParam), "listMainVersionsParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.listMainVersionsParamShrink)) {
            body.put("listMainVersionsParam", request.listMainVersionsParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMainVersions"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMainVersionsResponse());
    }

    public ListMainVersionsResponse listMainVersions(ListMainVersionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listMainVersionsWithOptions(request, runtime);
    }

    public ListNodeDisksResponse listNodeDisksWithOptions(ListNodeDisksRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListNodeDisksShrinkRequest request = new ListNodeDisksShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.listNodeDiskParam))) {
            request.listNodeDiskParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.listNodeDiskParam), "listNodeDiskParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.listNodeDiskParamShrink)) {
            body.put("listNodeDiskParam", request.listNodeDiskParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListNodeDisks"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListNodeDisksResponse());
    }

    public ListNodeDisksResponse listNodeDisks(ListNodeDisksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listNodeDisksWithOptions(request, runtime);
    }

    public ListNodeGroupMetaResponse listNodeGroupMetaWithOptions(ListNodeGroupMetaRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListNodeGroupMetaShrinkRequest request = new ListNodeGroupMetaShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.listNodeGroupMetaParam))) {
            request.listNodeGroupMetaParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.listNodeGroupMetaParam), "listNodeGroupMetaParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.listNodeGroupMetaParamShrink)) {
            body.put("listNodeGroupMetaParam", request.listNodeGroupMetaParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListNodeGroupMeta"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListNodeGroupMetaResponse());
    }

    public ListNodeGroupMetaResponse listNodeGroupMeta(ListNodeGroupMetaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listNodeGroupMetaWithOptions(request, runtime);
    }

    public ListNodesResponse listNodesWithOptions(ListNodesRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListNodesShrinkRequest request = new ListNodesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.listNodeParam))) {
            request.listNodeParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.listNodeParam), "listNodeParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.listNodeParamShrink)) {
            body.put("listNodeParam", request.listNodeParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListNodes"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListNodesResponse());
    }

    public ListNodesResponse listNodes(ListNodesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listNodesWithOptions(request, runtime);
    }

    public ListOnKubeDedicatedNodesResponse listOnKubeDedicatedNodesWithOptions(ListOnKubeDedicatedNodesRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListOnKubeDedicatedNodesShrinkRequest request = new ListOnKubeDedicatedNodesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.listOnKubeDedicatedNodesParam))) {
            request.listOnKubeDedicatedNodesParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.listOnKubeDedicatedNodesParam), "listOnKubeDedicatedNodesParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.listOnKubeDedicatedNodesParamShrink)) {
            body.put("listOnKubeDedicatedNodesParam", request.listOnKubeDedicatedNodesParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListOnKubeDedicatedNodes"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListOnKubeDedicatedNodesResponse());
    }

    public ListOnKubeDedicatedNodesResponse listOnKubeDedicatedNodes(ListOnKubeDedicatedNodesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listOnKubeDedicatedNodesWithOptions(request, runtime);
    }

    public ListReportsResponse listReportsWithOptions(ListReportsRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListReportsShrinkRequest request = new ListReportsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.listReportsParam))) {
            request.listReportsParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.listReportsParam), "listReportsParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.listReportsParamShrink)) {
            body.put("listReportsParam", request.listReportsParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListReports"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListReportsResponse());
    }

    public ListReportsResponse listReports(ListReportsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listReportsWithOptions(request, runtime);
    }

    public ListResourceHealthResponse listResourceHealthWithOptions(ListResourceHealthRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListResourceHealthShrinkRequest request = new ListResourceHealthShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.listResourceHealthParam))) {
            request.listResourceHealthParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.listResourceHealthParam), "listResourceHealthParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.listResourceHealthParamShrink)) {
            body.put("listResourceHealthParam", request.listResourceHealthParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListResourceHealth"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListResourceHealthResponse());
    }

    public ListResourceHealthResponse listResourceHealth(ListResourceHealthRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listResourceHealthWithOptions(request, runtime);
    }

    public ListResourceHealthInspectionsResponse listResourceHealthInspectionsWithOptions(ListResourceHealthInspectionsRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListResourceHealthInspectionsShrinkRequest request = new ListResourceHealthInspectionsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.listResourceHealthInspectionsParam))) {
            request.listResourceHealthInspectionsParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.listResourceHealthInspectionsParam), "listResourceHealthInspectionsParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.listResourceHealthInspectionsParamShrink)) {
            body.put("listResourceHealthInspectionsParam", request.listResourceHealthInspectionsParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListResourceHealthInspections"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListResourceHealthInspectionsResponse());
    }

    public ListResourceHealthInspectionsResponse listResourceHealthInspections(ListResourceHealthInspectionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listResourceHealthInspectionsWithOptions(request, runtime);
    }

    public ListStackApplicationsResponse listStackApplicationsWithOptions(ListStackApplicationsRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListStackApplicationsShrinkRequest request = new ListStackApplicationsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.listStackApplicationParam))) {
            request.listStackApplicationParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.listStackApplicationParam), "listStackApplicationParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.listStackApplicationParamShrink)) {
            body.put("listStackApplicationParam", request.listStackApplicationParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListStackApplications"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListStackApplicationsResponse());
    }

    public ListStackApplicationsResponse listStackApplications(ListStackApplicationsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listStackApplicationsWithOptions(request, runtime);
    }

    public ListWorkflowActivityInstancesResponse listWorkflowActivityInstancesWithOptions(ListWorkflowActivityInstancesRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListWorkflowActivityInstancesShrinkRequest request = new ListWorkflowActivityInstancesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.listWorkflowActivityInstancesParam))) {
            request.listWorkflowActivityInstancesParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.listWorkflowActivityInstancesParam), "listWorkflowActivityInstancesParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.listWorkflowActivityInstancesParamShrink)) {
            body.put("listWorkflowActivityInstancesParam", request.listWorkflowActivityInstancesParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListWorkflowActivityInstances"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListWorkflowActivityInstancesResponse());
    }

    public ListWorkflowActivityInstancesResponse listWorkflowActivityInstances(ListWorkflowActivityInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listWorkflowActivityInstancesWithOptions(request, runtime);
    }

    public ModifyPrepayInstanceSpecResponse modifyPrepayInstanceSpecWithOptions(ModifyPrepayInstanceSpecRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifyPrepayInstanceSpecShrinkRequest request = new ModifyPrepayInstanceSpecShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.modifyPrepayInstanceSpecParam))) {
            request.modifyPrepayInstanceSpecParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.modifyPrepayInstanceSpecParam), "modifyPrepayInstanceSpecParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.modifyPrepayInstanceSpecParamShrink)) {
            body.put("modifyPrepayInstanceSpecParam", request.modifyPrepayInstanceSpecParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyPrepayInstanceSpec"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyPrepayInstanceSpecResponse());
    }

    public ModifyPrepayInstanceSpecResponse modifyPrepayInstanceSpec(ModifyPrepayInstanceSpecRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyPrepayInstanceSpecWithOptions(request, runtime);
    }

    public PlanPortalGetResponse planPortalGetWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PlanPortalGet"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PlanPortalGetResponse());
    }

    public PlanPortalGetResponse planPortalGet() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.planPortalGetWithOptions(runtime);
    }

    public QueryGrafanaDataResponse queryGrafanaDataWithOptions(QueryGrafanaDataRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryGrafanaDataShrinkRequest request = new QueryGrafanaDataShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.getGrafanaDataParam))) {
            request.getGrafanaDataParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.getGrafanaDataParam), "getGrafanaDataParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.getGrafanaDataParamShrink)) {
            body.put("getGrafanaDataParam", request.getGrafanaDataParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryGrafanaData"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryGrafanaDataResponse());
    }

    public QueryGrafanaDataResponse queryGrafanaData(QueryGrafanaDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryGrafanaDataWithOptions(request, runtime);
    }

    public RefreshStackApplicationResponse refreshStackApplicationWithOptions(RefreshStackApplicationRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RefreshStackApplicationShrinkRequest request = new RefreshStackApplicationShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.refreshStackApplicationParam))) {
            request.refreshStackApplicationParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.refreshStackApplicationParam), "refreshStackApplicationParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.refreshStackApplicationParamShrink)) {
            body.put("refreshStackApplicationParam", request.refreshStackApplicationParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RefreshStackApplication"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RefreshStackApplicationResponse());
    }

    public RefreshStackApplicationResponse refreshStackApplication(RefreshStackApplicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.refreshStackApplicationWithOptions(request, runtime);
    }

    public RegisterClusterAckResourceResponse registerClusterAckResourceWithOptions(RegisterClusterAckResourceRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RegisterClusterAckResourceShrinkRequest request = new RegisterClusterAckResourceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.registerClusterAckResourceParam))) {
            request.registerClusterAckResourceParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.registerClusterAckResourceParam), "registerClusterAckResourceParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.registerClusterAckResourceParamShrink)) {
            body.put("registerClusterAckResourceParam", request.registerClusterAckResourceParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RegisterClusterAckResource"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RegisterClusterAckResourceResponse());
    }

    public RegisterClusterAckResourceResponse registerClusterAckResource(RegisterClusterAckResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.registerClusterAckResourceWithOptions(request, runtime);
    }

    public RegisterProductRoleResponse registerProductRoleWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RegisterProductRole"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RegisterProductRoleResponse());
    }

    public RegisterProductRoleResponse registerProductRole() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.registerProductRoleWithOptions(runtime);
    }

    public ReleaseBindingAckClusterResponse releaseBindingAckClusterWithOptions(ReleaseBindingAckClusterRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ReleaseBindingAckClusterShrinkRequest request = new ReleaseBindingAckClusterShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.releaseBindingAckClusterParam))) {
            request.releaseBindingAckClusterParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.releaseBindingAckClusterParam), "releaseBindingAckClusterParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.releaseBindingAckClusterParamShrink)) {
            body.put("releaseBindingAckClusterParam", request.releaseBindingAckClusterParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReleaseBindingAckCluster"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReleaseBindingAckClusterResponse());
    }

    public ReleaseBindingAckClusterResponse releaseBindingAckCluster(ReleaseBindingAckClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.releaseBindingAckClusterWithOptions(request, runtime);
    }

    public ReleaseClusterResponse releaseClusterWithOptions(ReleaseClusterRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ReleaseClusterShrinkRequest request = new ReleaseClusterShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.releaseClusterParam))) {
            request.releaseClusterParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.releaseClusterParam), "releaseClusterParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.releaseClusterParamShrink)) {
            body.put("releaseClusterParam", request.releaseClusterParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReleaseCluster"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReleaseClusterResponse());
    }

    public ReleaseClusterResponse releaseCluster(ReleaseClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.releaseClusterWithOptions(request, runtime);
    }

    public ReleaseOnEcsClusterResponse releaseOnEcsClusterWithOptions(ReleaseOnEcsClusterRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ReleaseOnEcsClusterShrinkRequest request = new ReleaseOnEcsClusterShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.releaseOnEcsClusterParam))) {
            request.releaseOnEcsClusterParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.releaseOnEcsClusterParam), "ReleaseOnEcsClusterParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.releaseOnEcsClusterParamShrink)) {
            body.put("ReleaseOnEcsClusterParam", request.releaseOnEcsClusterParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReleaseOnEcsCluster"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReleaseOnEcsClusterResponse());
    }

    public ReleaseOnEcsClusterResponse releaseOnEcsCluster(ReleaseOnEcsClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.releaseOnEcsClusterWithOptions(request, runtime);
    }

    public RemoveSuspendPointOnWorkflowInstanceResponse removeSuspendPointOnWorkflowInstanceWithOptions(RemoveSuspendPointOnWorkflowInstanceRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RemoveSuspendPointOnWorkflowInstanceShrinkRequest request = new RemoveSuspendPointOnWorkflowInstanceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.removeSuspendPointOnWorkflowInstanceParam))) {
            request.removeSuspendPointOnWorkflowInstanceParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.removeSuspendPointOnWorkflowInstanceParam), "removeSuspendPointOnWorkflowInstanceParam", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.removeSuspendPointOnWorkflowInstanceParamShrink)) {
            query.put("removeSuspendPointOnWorkflowInstanceParam", request.removeSuspendPointOnWorkflowInstanceParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveSuspendPointOnWorkflowInstance"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveSuspendPointOnWorkflowInstanceResponse());
    }

    public RemoveSuspendPointOnWorkflowInstanceResponse removeSuspendPointOnWorkflowInstance(RemoveSuspendPointOnWorkflowInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeSuspendPointOnWorkflowInstanceWithOptions(request, runtime);
    }

    public RestartWorkflowInstanceResponse restartWorkflowInstanceWithOptions(RestartWorkflowInstanceRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RestartWorkflowInstanceShrinkRequest request = new RestartWorkflowInstanceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.restartWorkflowInstanceParam))) {
            request.restartWorkflowInstanceParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.restartWorkflowInstanceParam), "restartWorkflowInstanceParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.restartWorkflowInstanceParamShrink)) {
            body.put("restartWorkflowInstanceParam", request.restartWorkflowInstanceParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RestartWorkflowInstance"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RestartWorkflowInstanceResponse());
    }

    public RestartWorkflowInstanceResponse restartWorkflowInstance(RestartWorkflowInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.restartWorkflowInstanceWithOptions(request, runtime);
    }

    public ResumeWorkflowInstanceResponse resumeWorkflowInstanceWithOptions(ResumeWorkflowInstanceRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ResumeWorkflowInstanceShrinkRequest request = new ResumeWorkflowInstanceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.resumeWorkflowInstanceParam))) {
            request.resumeWorkflowInstanceParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.resumeWorkflowInstanceParam), "resumeWorkflowInstanceParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resumeWorkflowInstanceParamShrink)) {
            body.put("resumeWorkflowInstanceParam", request.resumeWorkflowInstanceParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResumeWorkflowInstance"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResumeWorkflowInstanceResponse());
    }

    public ResumeWorkflowInstanceResponse resumeWorkflowInstance(ResumeWorkflowInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.resumeWorkflowInstanceWithOptions(request, runtime);
    }

    public RetryClusterOperationResponse retryClusterOperationWithOptions(RetryClusterOperationRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RetryClusterOperationShrinkRequest request = new RetryClusterOperationShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.retryClusterOperationParam))) {
            request.retryClusterOperationParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.retryClusterOperationParam), "retryClusterOperationParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.retryClusterOperationParamShrink)) {
            body.put("retryClusterOperationParam", request.retryClusterOperationParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RetryClusterOperation"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RetryClusterOperationResponse());
    }

    public RetryClusterOperationResponse retryClusterOperation(RetryClusterOperationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.retryClusterOperationWithOptions(request, runtime);
    }

    public RetryClusterOperationTaskResponse retryClusterOperationTaskWithOptions(RetryClusterOperationTaskRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RetryClusterOperationTaskShrinkRequest request = new RetryClusterOperationTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.retryClusterOperationTaskParam))) {
            request.retryClusterOperationTaskParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.retryClusterOperationTaskParam), "retryClusterOperationTaskParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.retryClusterOperationTaskParamShrink)) {
            body.put("retryClusterOperationTaskParam", request.retryClusterOperationTaskParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RetryClusterOperationTask"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RetryClusterOperationTaskResponse());
    }

    public RetryClusterOperationTaskResponse retryClusterOperationTask(RetryClusterOperationTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.retryClusterOperationTaskWithOptions(request, runtime);
    }

    public RetryWorkflowInstanceResponse retryWorkflowInstanceWithOptions(RetryWorkflowInstanceRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RetryWorkflowInstanceShrinkRequest request = new RetryWorkflowInstanceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.retryWorkflowInstanceParam))) {
            request.retryWorkflowInstanceParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.retryWorkflowInstanceParam), "retryWorkflowInstanceParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.retryWorkflowInstanceParamShrink)) {
            body.put("retryWorkflowInstanceParam", request.retryWorkflowInstanceParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RetryWorkflowInstance"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RetryWorkflowInstanceResponse());
    }

    public RetryWorkflowInstanceResponse retryWorkflowInstance(RetryWorkflowInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.retryWorkflowInstanceWithOptions(request, runtime);
    }

    public RollbackWorkflowInstanceResponse rollbackWorkflowInstanceWithOptions(RollbackWorkflowInstanceRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RollbackWorkflowInstanceShrinkRequest request = new RollbackWorkflowInstanceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.rollbackWorkflowInstanceParam))) {
            request.rollbackWorkflowInstanceParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.rollbackWorkflowInstanceParam), "rollbackWorkflowInstanceParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.rollbackWorkflowInstanceParamShrink)) {
            body.put("rollbackWorkflowInstanceParam", request.rollbackWorkflowInstanceParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RollbackWorkflowInstance"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RollbackWorkflowInstanceResponse());
    }

    public RollbackWorkflowInstanceResponse rollbackWorkflowInstance(RollbackWorkflowInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.rollbackWorkflowInstanceWithOptions(request, runtime);
    }

    public RunActionResponse runActionWithOptions(RunActionRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RunActionShrinkRequest request = new RunActionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.runActionParam))) {
            request.runActionParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.runActionParam), "runActionParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.runActionParamShrink)) {
            body.put("runActionParam", request.runActionParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RunAction"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RunActionResponse());
    }

    public RunActionResponse runAction(RunActionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.runActionWithOptions(request, runtime);
    }

    public SignalWorkflowInstanceResponse signalWorkflowInstanceWithOptions(SignalWorkflowInstanceRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SignalWorkflowInstanceShrinkRequest request = new SignalWorkflowInstanceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.signalWorkflowInstanceParam))) {
            request.signalWorkflowInstanceParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.signalWorkflowInstanceParam), "SignalWorkflowInstanceParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.signalWorkflowInstanceParamShrink)) {
            body.put("SignalWorkflowInstanceParam", request.signalWorkflowInstanceParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SignalWorkflowInstance"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SignalWorkflowInstanceResponse());
    }

    public SignalWorkflowInstanceResponse signalWorkflowInstance(SignalWorkflowInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.signalWorkflowInstanceWithOptions(request, runtime);
    }

    public SkipClusterOperationTaskResponse skipClusterOperationTaskWithOptions(SkipClusterOperationTaskRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SkipClusterOperationTaskShrinkRequest request = new SkipClusterOperationTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.skipClusterOperationTaskParam))) {
            request.skipClusterOperationTaskParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.skipClusterOperationTaskParam), "skipClusterOperationTaskParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.skipClusterOperationTaskParamShrink)) {
            body.put("skipClusterOperationTaskParam", request.skipClusterOperationTaskParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SkipClusterOperationTask"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SkipClusterOperationTaskResponse());
    }

    public SkipClusterOperationTaskResponse skipClusterOperationTask(SkipClusterOperationTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.skipClusterOperationTaskWithOptions(request, runtime);
    }

    public SkipWorkflowInstanceResponse skipWorkflowInstanceWithOptions(SkipWorkflowInstanceRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SkipWorkflowInstanceShrinkRequest request = new SkipWorkflowInstanceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.skipWorkflowInstanceParam))) {
            request.skipWorkflowInstanceParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.skipWorkflowInstanceParam), "skipWorkflowInstanceParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.skipWorkflowInstanceParamShrink)) {
            body.put("skipWorkflowInstanceParam", request.skipWorkflowInstanceParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SkipWorkflowInstance"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SkipWorkflowInstanceResponse());
    }

    public SkipWorkflowInstanceResponse skipWorkflowInstance(SkipWorkflowInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.skipWorkflowInstanceWithOptions(request, runtime);
    }

    public SuspendWorkflowInstanceResponse suspendWorkflowInstanceWithOptions(SuspendWorkflowInstanceRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SuspendWorkflowInstanceShrinkRequest request = new SuspendWorkflowInstanceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.suspendWorkflowInstanceParam))) {
            request.suspendWorkflowInstanceParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.suspendWorkflowInstanceParam), "suspendWorkflowInstanceParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.suspendWorkflowInstanceParamShrink)) {
            body.put("suspendWorkflowInstanceParam", request.suspendWorkflowInstanceParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SuspendWorkflowInstance"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SuspendWorkflowInstanceResponse());
    }

    public SuspendWorkflowInstanceResponse suspendWorkflowInstance(SuspendWorkflowInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.suspendWorkflowInstanceWithOptions(request, runtime);
    }

    public TerminateClusterOperationResponse terminateClusterOperationWithOptions(TerminateClusterOperationRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        TerminateClusterOperationShrinkRequest request = new TerminateClusterOperationShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.terminateClusterOperationParam))) {
            request.terminateClusterOperationParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.terminateClusterOperationParam), "terminateClusterOperationParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.terminateClusterOperationParamShrink)) {
            body.put("terminateClusterOperationParam", request.terminateClusterOperationParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TerminateClusterOperation"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TerminateClusterOperationResponse());
    }

    public TerminateClusterOperationResponse terminateClusterOperation(TerminateClusterOperationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.terminateClusterOperationWithOptions(request, runtime);
    }

    public TerminateWorkflowInstanceResponse terminateWorkflowInstanceWithOptions(TerminateWorkflowInstanceRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        TerminateWorkflowInstanceShrinkRequest request = new TerminateWorkflowInstanceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.terminateWorkflowInstanceParam))) {
            request.terminateWorkflowInstanceParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.terminateWorkflowInstanceParam), "terminateWorkflowInstanceParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.terminateWorkflowInstanceParamShrink)) {
            body.put("terminateWorkflowInstanceParam", request.terminateWorkflowInstanceParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TerminateWorkflowInstance"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TerminateWorkflowInstanceResponse());
    }

    public TerminateWorkflowInstanceResponse terminateWorkflowInstance(TerminateWorkflowInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.terminateWorkflowInstanceWithOptions(request, runtime);
    }

    public UnRegisterClusterAckResourceResponse unRegisterClusterAckResourceWithOptions(UnRegisterClusterAckResourceRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UnRegisterClusterAckResourceShrinkRequest request = new UnRegisterClusterAckResourceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.unRegisterClusterAckResourceParam))) {
            request.unRegisterClusterAckResourceParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.unRegisterClusterAckResourceParam), "unRegisterClusterAckResourceParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.unRegisterClusterAckResourceParamShrink)) {
            body.put("unRegisterClusterAckResourceParam", request.unRegisterClusterAckResourceParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnRegisterClusterAckResource"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnRegisterClusterAckResourceResponse());
    }

    public UnRegisterClusterAckResourceResponse unRegisterClusterAckResource(UnRegisterClusterAckResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unRegisterClusterAckResourceWithOptions(request, runtime);
    }

    public UniversalOpsResponse universalOpsWithOptions(UniversalOpsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiName)) {
            query.put("apiName", request.apiName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.payload)) {
            body.put("payload", request.payload);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UniversalOps"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UniversalOpsResponse());
    }

    public UniversalOpsResponse universalOps(UniversalOpsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.universalOpsWithOptions(request, runtime);
    }

    public UpdateAckClusterNodePoolsResponse updateAckClusterNodePoolsWithOptions(UpdateAckClusterNodePoolsRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateAckClusterNodePoolsShrinkRequest request = new UpdateAckClusterNodePoolsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.updateAckClusterNodePoolsParam))) {
            request.updateAckClusterNodePoolsParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.updateAckClusterNodePoolsParam), "updateAckClusterNodePoolsParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.updateAckClusterNodePoolsParamShrink)) {
            body.put("updateAckClusterNodePoolsParam", request.updateAckClusterNodePoolsParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAckClusterNodePools"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAckClusterNodePoolsResponse());
    }

    public UpdateAckClusterNodePoolsResponse updateAckClusterNodePools(UpdateAckClusterNodePoolsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateAckClusterNodePoolsWithOptions(request, runtime);
    }

    public UpdateAckClusterNodesResponse updateAckClusterNodesWithOptions(UpdateAckClusterNodesRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateAckClusterNodesShrinkRequest request = new UpdateAckClusterNodesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.updateAckClusterNodesParam))) {
            request.updateAckClusterNodesParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.updateAckClusterNodesParam), "updateAckClusterNodesParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.updateAckClusterNodesParamShrink)) {
            body.put("updateAckClusterNodesParam", request.updateAckClusterNodesParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAckClusterNodes"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAckClusterNodesResponse());
    }

    public UpdateAckClusterNodesResponse updateAckClusterNodes(UpdateAckClusterNodesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateAckClusterNodesWithOptions(request, runtime);
    }

    public UpdateAutoScalingPolicyResponse updateAutoScalingPolicyWithOptions(UpdateAutoScalingPolicyRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateAutoScalingPolicyShrinkRequest request = new UpdateAutoScalingPolicyShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.updateAutoScalingPolicyParam))) {
            request.updateAutoScalingPolicyParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.updateAutoScalingPolicyParam), "updateAutoScalingPolicyParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.updateAutoScalingPolicyParamShrink)) {
            body.put("updateAutoScalingPolicyParam", request.updateAutoScalingPolicyParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAutoScalingPolicy"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAutoScalingPolicyResponse());
    }

    public UpdateAutoScalingPolicyResponse updateAutoScalingPolicy(UpdateAutoScalingPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateAutoScalingPolicyWithOptions(request, runtime);
    }

    public UpdateAutoScalingRuleResponse updateAutoScalingRuleWithOptions(UpdateAutoScalingRuleRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateAutoScalingRuleShrinkRequest request = new UpdateAutoScalingRuleShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.updateAutoScalingRuleParam))) {
            request.updateAutoScalingRuleParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.updateAutoScalingRuleParam), "updateAutoScalingRuleParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.updateAutoScalingRuleParamShrink)) {
            body.put("updateAutoScalingRuleParam", request.updateAutoScalingRuleParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAutoScalingRule"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAutoScalingRuleResponse());
    }

    public UpdateAutoScalingRuleResponse updateAutoScalingRule(UpdateAutoScalingRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateAutoScalingRuleWithOptions(request, runtime);
    }

    public UpdateClusterAttributeResponse updateClusterAttributeWithOptions(UpdateClusterAttributeRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateClusterAttributeShrinkRequest request = new UpdateClusterAttributeShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.param))) {
            request.paramShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.param), "param", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.paramShrink)) {
            query.put("param", request.paramShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateClusterAttribute"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateClusterAttributeResponse());
    }

    public UpdateClusterAttributeResponse updateClusterAttribute(UpdateClusterAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateClusterAttributeWithOptions(request, runtime);
    }

    public UpdateClusterNodeGroupResponse updateClusterNodeGroupWithOptions(UpdateClusterNodeGroupRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateClusterNodeGroupShrinkRequest request = new UpdateClusterNodeGroupShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.updateClusterNodeGroupParam))) {
            request.updateClusterNodeGroupParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.updateClusterNodeGroupParam), "updateClusterNodeGroupParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.updateClusterNodeGroupParamShrink)) {
            body.put("updateClusterNodeGroupParam", request.updateClusterNodeGroupParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateClusterNodeGroup"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateClusterNodeGroupResponse());
    }

    public UpdateClusterNodeGroupResponse updateClusterNodeGroup(UpdateClusterNodeGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateClusterNodeGroupWithOptions(request, runtime);
    }

    public UpdateClusterScriptResponse updateClusterScriptWithOptions(UpdateClusterScriptRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateClusterScriptShrinkRequest request = new UpdateClusterScriptShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.updateClusterScriptParam))) {
            request.updateClusterScriptParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.updateClusterScriptParam), "updateClusterScriptParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.updateClusterScriptParamShrink)) {
            body.put("updateClusterScriptParam", request.updateClusterScriptParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateClusterScript"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateClusterScriptResponse());
    }

    public UpdateClusterScriptResponse updateClusterScript(UpdateClusterScriptRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateClusterScriptWithOptions(request, runtime);
    }

    public UpdateClusterUserResponse updateClusterUserWithOptions(UpdateClusterUserRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateClusterUserShrinkRequest request = new UpdateClusterUserShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.updateClusterUserParam))) {
            request.updateClusterUserParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.updateClusterUserParam), "updateClusterUserParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.updateClusterUserParamShrink)) {
            body.put("updateClusterUserParam", request.updateClusterUserParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateClusterUser"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateClusterUserResponse());
    }

    public UpdateClusterUserResponse updateClusterUser(UpdateClusterUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateClusterUserWithOptions(request, runtime);
    }

    public UpdateConfigResponse updateConfigWithOptions(UpdateConfigRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateConfigShrinkRequest request = new UpdateConfigShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.updateConfigParam))) {
            request.updateConfigParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.updateConfigParam), "updateConfigParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.updateConfigParamShrink)) {
            body.put("updateConfigParam", request.updateConfigParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateConfig"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateConfigResponse());
    }

    public UpdateConfigResponse updateConfig(UpdateConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateConfigWithOptions(request, runtime);
    }

    public UpdateOnKubeDedicatedNodesResponse updateOnKubeDedicatedNodesWithOptions(UpdateOnKubeDedicatedNodesRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateOnKubeDedicatedNodesShrinkRequest request = new UpdateOnKubeDedicatedNodesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.updateOnKubeDedicatedNodesParam))) {
            request.updateOnKubeDedicatedNodesParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.updateOnKubeDedicatedNodesParam), "updateOnKubeDedicatedNodesParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.updateOnKubeDedicatedNodesParamShrink)) {
            body.put("updateOnKubeDedicatedNodesParam", request.updateOnKubeDedicatedNodesParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateOnKubeDedicatedNodes"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateOnKubeDedicatedNodesResponse());
    }

    public UpdateOnKubeDedicatedNodesResponse updateOnKubeDedicatedNodes(UpdateOnKubeDedicatedNodesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateOnKubeDedicatedNodesWithOptions(request, runtime);
    }

    public UpdateSecurityModeResponse updateSecurityModeWithOptions(UpdateSecurityModeRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateSecurityModeShrinkRequest request = new UpdateSecurityModeShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.updateClusterSecurityModeParam))) {
            request.updateClusterSecurityModeParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.updateClusterSecurityModeParam), "updateClusterSecurityModeParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.updateClusterSecurityModeParamShrink)) {
            body.put("updateClusterSecurityModeParam", request.updateClusterSecurityModeParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSecurityMode"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSecurityModeResponse());
    }

    public UpdateSecurityModeResponse updateSecurityMode(UpdateSecurityModeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateSecurityModeWithOptions(request, runtime);
    }

    public UpdateOnKubeDedicatedNodePoolsResponse updateOnKubeDedicatedNodePoolsWithOptions(UpdateOnKubeDedicatedNodePoolsRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateOnKubeDedicatedNodePoolsShrinkRequest request = new UpdateOnKubeDedicatedNodePoolsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.updateOnKubeDedicatedNodePoolsParam))) {
            request.updateOnKubeDedicatedNodePoolsParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.updateOnKubeDedicatedNodePoolsParam), "updateOnKubeDedicatedNodePoolsParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.updateOnKubeDedicatedNodePoolsParamShrink)) {
            body.put("updateOnKubeDedicatedNodePoolsParam", request.updateOnKubeDedicatedNodePoolsParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "updateOnKubeDedicatedNodePools"),
            new TeaPair("version", "2021-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateOnKubeDedicatedNodePoolsResponse());
    }

    public UpdateOnKubeDedicatedNodePoolsResponse updateOnKubeDedicatedNodePools(UpdateOnKubeDedicatedNodePoolsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateOnKubeDedicatedNodePoolsWithOptions(request, runtime);
    }
}
