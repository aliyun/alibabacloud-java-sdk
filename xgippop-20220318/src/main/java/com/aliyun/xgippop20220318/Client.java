// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xgippop20220318;

import com.aliyun.tea.*;
import com.aliyun.xgippop20220318.models.*;
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
        this._endpoint = this.getEndpoint("xgippop", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public CreateApplicationResponse createApplication(CreateApplicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createApplicationWithOptions(request, headers, runtime);
    }

    public CreateApplicationResponse createApplicationWithOptions(CreateApplicationRequest tmpReq, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateApplicationShrinkRequest request = new CreateApplicationShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.appTypeList)) {
            request.appTypeListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.appTypeList, "AppTypeList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.appingList)) {
            request.appingListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.appingList, "AppingList", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliUid)) {
            body.put("AliUid", request.aliUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            body.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appTypeListShrink)) {
            body.put("AppTypeList", request.appTypeListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appingListShrink)) {
            body.put("AppingList", request.appingListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemCode)) {
            body.put("ItemCode", request.itemCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            body.put("RequestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            body.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appIp)) {
            body.put("app_ip", request.appIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callerParentId)) {
            body.put("callerParentId", request.callerParentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callerType)) {
            body.put("callerType", request.callerType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callerUid)) {
            body.put("callerUid", request.callerUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resource)) {
            body.put("resource", request.resource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stsParentAccount)) {
            body.put("stsParentAccount", request.stsParentAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stsTokenCallerUid)) {
            body.put("stsTokenCallerUid", request.stsTokenCallerUid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateApplication"),
            new TeaPair("version", "2022-03-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/freeflow/CreateApplication"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateApplicationResponse());
    }

    public GetApplicationResponse getApplication(GetApplicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getApplicationWithOptions(request, headers, runtime);
    }

    public GetApplicationResponse getApplicationWithOptions(GetApplicationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appCode)) {
            query.put("AppCode", request.appCode);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliUid)) {
            body.put("AliUid", request.aliUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            body.put("RequestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resource)) {
            body.put("Resource", request.resource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            body.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("app_id", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callerParentId)) {
            body.put("callerParentId", request.callerParentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callerType)) {
            body.put("callerType", request.callerType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callerUid)) {
            body.put("callerUid", request.callerUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stsAccount)) {
            body.put("stsAccount", request.stsAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stsParentAccount)) {
            body.put("stsParentAccount", request.stsParentAccount);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetApplication"),
            new TeaPair("version", "2022-03-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/freeflow/GetApplication"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetApplicationResponse());
    }

    public GetFreeFlowStatusResponse getFreeFlowStatus(GetFreeFlowStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getFreeFlowStatusWithOptions(request, headers, runtime);
    }

    public GetFreeFlowStatusResponse getFreeFlowStatusWithOptions(GetFreeFlowStatusRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowProductId)) {
            body.put("FlowProductId", request.flowProductId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mobileNumber)) {
            body.put("MobileNumber", request.mobileNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.netType)) {
            body.put("NetType", request.netType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operator)) {
            body.put("Operator", request.operator);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.privateIP)) {
            body.put("PrivateIP", request.privateIP);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pseudoCode)) {
            body.put("PseudoCode", request.pseudoCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.publicIP)) {
            body.put("PublicIP", request.publicIP);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            body.put("RequestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            body.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.token)) {
            body.put("Token", request.token);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appIp)) {
            body.put("app_ip", request.appIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callerParentId)) {
            body.put("callerParentId", request.callerParentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callerType)) {
            body.put("callerType", request.callerType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callerUid)) {
            body.put("callerUid", request.callerUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resource)) {
            body.put("resource", request.resource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stsAccount)) {
            body.put("stsAccount", request.stsAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stsParentAccount)) {
            body.put("stsParentAccount", request.stsParentAccount);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFreeFlowStatus"),
            new TeaPair("version", "2022-03-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/freeflow/getFreeFlowStatus"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFreeFlowStatusResponse());
    }

    public ModifyApplicationResponse modifyApplication(ModifyApplicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyApplicationWithOptions(request, headers, runtime);
    }

    public ModifyApplicationResponse modifyApplicationWithOptions(ModifyApplicationRequest tmpReq, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifyApplicationShrinkRequest request = new ModifyApplicationShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.appTypeList)) {
            request.appTypeListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.appTypeList, "AppTypeList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.appingList)) {
            request.appingListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.appingList, "AppingList", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appCode)) {
            body.put("AppCode", request.appCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            body.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appTypeListShrink)) {
            body.put("AppTypeList", request.appTypeListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appingListShrink)) {
            body.put("AppingList", request.appingListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            body.put("RequestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            body.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appIp)) {
            body.put("app_ip", request.appIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callerParentId)) {
            body.put("callerParentId", request.callerParentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callerType)) {
            body.put("callerType", request.callerType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callerUid)) {
            body.put("callerUid", request.callerUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resource)) {
            body.put("resource", request.resource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stsParentAccount)) {
            body.put("stsParentAccount", request.stsParentAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stsTokenCallerUid)) {
            body.put("stsTokenCallerUid", request.stsTokenCallerUid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyApplication"),
            new TeaPair("version", "2022-03-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/freeflow/ModifyApplication"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyApplicationResponse());
    }

    public OrderQosServiceResponse orderQosService(OrderQosServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.orderQosServiceWithOptions(request, headers, runtime);
    }

    public OrderQosServiceResponse orderQosServiceWithOptions(OrderQosServiceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customerAccount)) {
            body.put("CustomerAccount", request.customerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customerQosRequestId)) {
            body.put("CustomerQosRequestId", request.customerQosRequestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.IPv6)) {
            body.put("IPv6", request.IPv6);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.privateIPv4)) {
            body.put("PrivateIPv4", request.privateIPv4);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.publicIPv4)) {
            body.put("PublicIPv4", request.publicIPv4);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.qosProductId)) {
            body.put("QosProductId", request.qosProductId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetIp)) {
            body.put("TargetIp", request.targetIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.token)) {
            body.put("Token", request.token);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OrderQosService"),
            new TeaPair("version", "2022-03-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/qos/orderQosService"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OrderQosServiceResponse());
    }
}
