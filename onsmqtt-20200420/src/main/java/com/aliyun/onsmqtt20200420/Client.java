// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420;

import com.aliyun.tea.*;
import com.aliyun.onsmqtt20200420.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("onsmqtt", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public ApplyTokenResponse applyTokenWithOptions(ApplyTokenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ApplyToken", "2020-04-20", "HTTPS", "POST", "AK", "json", req, runtime), new ApplyTokenResponse());
    }

    public ApplyTokenResponse applyToken(ApplyTokenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.applyTokenWithOptions(request, runtime);
    }

    public BatchQuerySessionByClientIdsResponse batchQuerySessionByClientIdsWithOptions(BatchQuerySessionByClientIdsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BatchQuerySessionByClientIds", "2020-04-20", "HTTPS", "POST", "AK", "json", req, runtime), new BatchQuerySessionByClientIdsResponse());
    }

    public BatchQuerySessionByClientIdsResponse batchQuerySessionByClientIds(BatchQuerySessionByClientIdsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchQuerySessionByClientIdsWithOptions(request, runtime);
    }

    public CreateGroupIdResponse createGroupIdWithOptions(CreateGroupIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateGroupId", "2020-04-20", "HTTPS", "POST", "AK", "json", req, runtime), new CreateGroupIdResponse());
    }

    public CreateGroupIdResponse createGroupId(CreateGroupIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createGroupIdWithOptions(request, runtime);
    }

    public DeleteGroupIdResponse deleteGroupIdWithOptions(DeleteGroupIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteGroupId", "2020-04-20", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteGroupIdResponse());
    }

    public DeleteGroupIdResponse deleteGroupId(DeleteGroupIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteGroupIdWithOptions(request, runtime);
    }

    public GetDeviceCredentialResponse getDeviceCredentialWithOptions(GetDeviceCredentialRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetDeviceCredential", "2020-04-20", "HTTPS", "POST", "AK", "json", req, runtime), new GetDeviceCredentialResponse());
    }

    public GetDeviceCredentialResponse getDeviceCredential(GetDeviceCredentialRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDeviceCredentialWithOptions(request, runtime);
    }

    public ListGroupIdResponse listGroupIdWithOptions(ListGroupIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListGroupId", "2020-04-20", "HTTPS", "POST", "AK", "json", req, runtime), new ListGroupIdResponse());
    }

    public ListGroupIdResponse listGroupId(ListGroupIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listGroupIdWithOptions(request, runtime);
    }

    public QueryMqttTraceDeviceResponse queryMqttTraceDeviceWithOptions(QueryMqttTraceDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryMqttTraceDevice", "2020-04-20", "HTTPS", "POST", "AK", "json", req, runtime), new QueryMqttTraceDeviceResponse());
    }

    public QueryMqttTraceDeviceResponse queryMqttTraceDevice(QueryMqttTraceDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryMqttTraceDeviceWithOptions(request, runtime);
    }

    public QueryMqttTraceMessageOfClientResponse queryMqttTraceMessageOfClientWithOptions(QueryMqttTraceMessageOfClientRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryMqttTraceMessageOfClient", "2020-04-20", "HTTPS", "POST", "AK", "json", req, runtime), new QueryMqttTraceMessageOfClientResponse());
    }

    public QueryMqttTraceMessageOfClientResponse queryMqttTraceMessageOfClient(QueryMqttTraceMessageOfClientRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryMqttTraceMessageOfClientWithOptions(request, runtime);
    }

    public QueryMqttTraceMessagePublishResponse queryMqttTraceMessagePublishWithOptions(QueryMqttTraceMessagePublishRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryMqttTraceMessagePublish", "2020-04-20", "HTTPS", "POST", "AK", "json", req, runtime), new QueryMqttTraceMessagePublishResponse());
    }

    public QueryMqttTraceMessagePublishResponse queryMqttTraceMessagePublish(QueryMqttTraceMessagePublishRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryMqttTraceMessagePublishWithOptions(request, runtime);
    }

    public QueryMqttTraceMessageSubscribeResponse queryMqttTraceMessageSubscribeWithOptions(QueryMqttTraceMessageSubscribeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryMqttTraceMessageSubscribe", "2020-04-20", "HTTPS", "POST", "AK", "json", req, runtime), new QueryMqttTraceMessageSubscribeResponse());
    }

    public QueryMqttTraceMessageSubscribeResponse queryMqttTraceMessageSubscribe(QueryMqttTraceMessageSubscribeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryMqttTraceMessageSubscribeWithOptions(request, runtime);
    }

    public QuerySessionByClientIdResponse querySessionByClientIdWithOptions(QuerySessionByClientIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QuerySessionByClientId", "2020-04-20", "HTTPS", "POST", "AK", "json", req, runtime), new QuerySessionByClientIdResponse());
    }

    public QuerySessionByClientIdResponse querySessionByClientId(QuerySessionByClientIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.querySessionByClientIdWithOptions(request, runtime);
    }

    public QueryTokenResponse queryTokenWithOptions(QueryTokenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryToken", "2020-04-20", "HTTPS", "POST", "AK", "json", req, runtime), new QueryTokenResponse());
    }

    public QueryTokenResponse queryToken(QueryTokenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryTokenWithOptions(request, runtime);
    }

    public RefreshDeviceCredentialResponse refreshDeviceCredentialWithOptions(RefreshDeviceCredentialRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RefreshDeviceCredential", "2020-04-20", "HTTPS", "POST", "AK", "json", req, runtime), new RefreshDeviceCredentialResponse());
    }

    public RefreshDeviceCredentialResponse refreshDeviceCredential(RefreshDeviceCredentialRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.refreshDeviceCredentialWithOptions(request, runtime);
    }

    public RegisterDeviceCredentialResponse registerDeviceCredentialWithOptions(RegisterDeviceCredentialRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RegisterDeviceCredential", "2020-04-20", "HTTPS", "POST", "AK", "json", req, runtime), new RegisterDeviceCredentialResponse());
    }

    public RegisterDeviceCredentialResponse registerDeviceCredential(RegisterDeviceCredentialRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.registerDeviceCredentialWithOptions(request, runtime);
    }

    public RevokeTokenResponse revokeTokenWithOptions(RevokeTokenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RevokeToken", "2020-04-20", "HTTPS", "POST", "AK", "json", req, runtime), new RevokeTokenResponse());
    }

    public RevokeTokenResponse revokeToken(RevokeTokenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.revokeTokenWithOptions(request, runtime);
    }

    public SendMessageResponse sendMessageWithOptions(SendMessageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SendMessage", "2020-04-20", "HTTPS", "POST", "AK", "json", req, runtime), new SendMessageResponse());
    }

    public SendMessageResponse sendMessage(SendMessageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.sendMessageWithOptions(request, runtime);
    }

    public UnRegisterDeviceCredentialResponse unRegisterDeviceCredentialWithOptions(UnRegisterDeviceCredentialRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UnRegisterDeviceCredential", "2020-04-20", "HTTPS", "POST", "AK", "json", req, runtime), new UnRegisterDeviceCredentialResponse());
    }

    public UnRegisterDeviceCredentialResponse unRegisterDeviceCredential(UnRegisterDeviceCredentialRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unRegisterDeviceCredentialWithOptions(request, runtime);
    }
}
