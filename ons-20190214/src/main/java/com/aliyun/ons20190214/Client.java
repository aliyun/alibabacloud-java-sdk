// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214;

import com.aliyun.tea.*;
import com.aliyun.ons20190214.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("ap-northeast-2-pop", "ons.ap-northeast-1.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "ons.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "ons.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "ons.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "ons.aliyuncs.com"),
            new TeaPair("cn-edge-1", "ons.aliyuncs.com"),
            new TeaPair("cn-fujian", "ons.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "ons.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "ons.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "ons.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "ons.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "ons.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "ons.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "ons.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "ons.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "ons.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "ons.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "ons.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "ons.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "ons.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "ons.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "ons.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "ons.aliyuncs.com"),
            new TeaPair("cn-wuhan", "ons.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "ons.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "ons.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "ons.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "ons.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "ons.ap-northeast-1.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "ons.ap-northeast-1.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("ons", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListTagResources", "2019-02-14", "HTTPS", "POST", "AK", "json", req, runtime), new ListTagResourcesResponse());
    }

    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    public OnsConsumerAccumulateResponse onsConsumerAccumulateWithOptions(OnsConsumerAccumulateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("OnsConsumerAccumulate", "2019-02-14", "HTTPS", "POST", "AK", "json", req, runtime), new OnsConsumerAccumulateResponse());
    }

    public OnsConsumerAccumulateResponse onsConsumerAccumulate(OnsConsumerAccumulateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.onsConsumerAccumulateWithOptions(request, runtime);
    }

    public OnsConsumerGetConnectionResponse onsConsumerGetConnectionWithOptions(OnsConsumerGetConnectionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("OnsConsumerGetConnection", "2019-02-14", "HTTPS", "POST", "AK", "json", req, runtime), new OnsConsumerGetConnectionResponse());
    }

    public OnsConsumerGetConnectionResponse onsConsumerGetConnection(OnsConsumerGetConnectionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.onsConsumerGetConnectionWithOptions(request, runtime);
    }

    public OnsConsumerResetOffsetResponse onsConsumerResetOffsetWithOptions(OnsConsumerResetOffsetRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("OnsConsumerResetOffset", "2019-02-14", "HTTPS", "POST", "AK", "json", req, runtime), new OnsConsumerResetOffsetResponse());
    }

    public OnsConsumerResetOffsetResponse onsConsumerResetOffset(OnsConsumerResetOffsetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.onsConsumerResetOffsetWithOptions(request, runtime);
    }

    public OnsConsumerStatusResponse onsConsumerStatusWithOptions(OnsConsumerStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("OnsConsumerStatus", "2019-02-14", "HTTPS", "POST", "AK", "json", req, runtime), new OnsConsumerStatusResponse());
    }

    public OnsConsumerStatusResponse onsConsumerStatus(OnsConsumerStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.onsConsumerStatusWithOptions(request, runtime);
    }

    public OnsConsumerTimeSpanResponse onsConsumerTimeSpanWithOptions(OnsConsumerTimeSpanRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("OnsConsumerTimeSpan", "2019-02-14", "HTTPS", "POST", "AK", "json", req, runtime), new OnsConsumerTimeSpanResponse());
    }

    public OnsConsumerTimeSpanResponse onsConsumerTimeSpan(OnsConsumerTimeSpanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.onsConsumerTimeSpanWithOptions(request, runtime);
    }

    public OnsDLQMessageGetByIdResponse onsDLQMessageGetByIdWithOptions(OnsDLQMessageGetByIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("OnsDLQMessageGetById", "2019-02-14", "HTTPS", "POST", "AK", "json", req, runtime), new OnsDLQMessageGetByIdResponse());
    }

    public OnsDLQMessageGetByIdResponse onsDLQMessageGetById(OnsDLQMessageGetByIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.onsDLQMessageGetByIdWithOptions(request, runtime);
    }

    public OnsDLQMessagePageQueryByGroupIdResponse onsDLQMessagePageQueryByGroupIdWithOptions(OnsDLQMessagePageQueryByGroupIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("OnsDLQMessagePageQueryByGroupId", "2019-02-14", "HTTPS", "POST", "AK", "json", req, runtime), new OnsDLQMessagePageQueryByGroupIdResponse());
    }

    public OnsDLQMessagePageQueryByGroupIdResponse onsDLQMessagePageQueryByGroupId(OnsDLQMessagePageQueryByGroupIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.onsDLQMessagePageQueryByGroupIdWithOptions(request, runtime);
    }

    public OnsDLQMessageResendByIdResponse onsDLQMessageResendByIdWithOptions(OnsDLQMessageResendByIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("OnsDLQMessageResendById", "2019-02-14", "HTTPS", "POST", "AK", "json", req, runtime), new OnsDLQMessageResendByIdResponse());
    }

    public OnsDLQMessageResendByIdResponse onsDLQMessageResendById(OnsDLQMessageResendByIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.onsDLQMessageResendByIdWithOptions(request, runtime);
    }

    public OnsGroupConsumerUpdateResponse onsGroupConsumerUpdateWithOptions(OnsGroupConsumerUpdateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("OnsGroupConsumerUpdate", "2019-02-14", "HTTPS", "POST", "AK", "json", req, runtime), new OnsGroupConsumerUpdateResponse());
    }

    public OnsGroupConsumerUpdateResponse onsGroupConsumerUpdate(OnsGroupConsumerUpdateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.onsGroupConsumerUpdateWithOptions(request, runtime);
    }

    public OnsGroupCreateResponse onsGroupCreateWithOptions(OnsGroupCreateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("OnsGroupCreate", "2019-02-14", "HTTPS", "POST", "AK", "json", req, runtime), new OnsGroupCreateResponse());
    }

    public OnsGroupCreateResponse onsGroupCreate(OnsGroupCreateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.onsGroupCreateWithOptions(request, runtime);
    }

    public OnsGroupDeleteResponse onsGroupDeleteWithOptions(OnsGroupDeleteRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("OnsGroupDelete", "2019-02-14", "HTTPS", "POST", "AK", "json", req, runtime), new OnsGroupDeleteResponse());
    }

    public OnsGroupDeleteResponse onsGroupDelete(OnsGroupDeleteRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.onsGroupDeleteWithOptions(request, runtime);
    }

    public OnsGroupListResponse onsGroupListWithOptions(OnsGroupListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("OnsGroupList", "2019-02-14", "HTTPS", "POST", "AK", "json", req, runtime), new OnsGroupListResponse());
    }

    public OnsGroupListResponse onsGroupList(OnsGroupListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.onsGroupListWithOptions(request, runtime);
    }

    public OnsGroupSubDetailResponse onsGroupSubDetailWithOptions(OnsGroupSubDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("OnsGroupSubDetail", "2019-02-14", "HTTPS", "POST", "AK", "json", req, runtime), new OnsGroupSubDetailResponse());
    }

    public OnsGroupSubDetailResponse onsGroupSubDetail(OnsGroupSubDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.onsGroupSubDetailWithOptions(request, runtime);
    }

    public OnsInstanceBaseInfoResponse onsInstanceBaseInfoWithOptions(OnsInstanceBaseInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("OnsInstanceBaseInfo", "2019-02-14", "HTTPS", "POST", "AK", "json", req, runtime), new OnsInstanceBaseInfoResponse());
    }

    public OnsInstanceBaseInfoResponse onsInstanceBaseInfo(OnsInstanceBaseInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.onsInstanceBaseInfoWithOptions(request, runtime);
    }

    public OnsInstanceCreateResponse onsInstanceCreateWithOptions(OnsInstanceCreateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("OnsInstanceCreate", "2019-02-14", "HTTPS", "POST", "AK", "json", req, runtime), new OnsInstanceCreateResponse());
    }

    public OnsInstanceCreateResponse onsInstanceCreate(OnsInstanceCreateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.onsInstanceCreateWithOptions(request, runtime);
    }

    public OnsInstanceDeleteResponse onsInstanceDeleteWithOptions(OnsInstanceDeleteRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("OnsInstanceDelete", "2019-02-14", "HTTPS", "POST", "AK", "json", req, runtime), new OnsInstanceDeleteResponse());
    }

    public OnsInstanceDeleteResponse onsInstanceDelete(OnsInstanceDeleteRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.onsInstanceDeleteWithOptions(request, runtime);
    }

    public OnsInstanceInServiceListResponse onsInstanceInServiceListWithOptions(OnsInstanceInServiceListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("OnsInstanceInServiceList", "2019-02-14", "HTTPS", "POST", "AK", "json", req, runtime), new OnsInstanceInServiceListResponse());
    }

    public OnsInstanceInServiceListResponse onsInstanceInServiceList(OnsInstanceInServiceListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.onsInstanceInServiceListWithOptions(request, runtime);
    }

    public OnsInstanceUpdateResponse onsInstanceUpdateWithOptions(OnsInstanceUpdateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("OnsInstanceUpdate", "2019-02-14", "HTTPS", "POST", "AK", "json", req, runtime), new OnsInstanceUpdateResponse());
    }

    public OnsInstanceUpdateResponse onsInstanceUpdate(OnsInstanceUpdateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.onsInstanceUpdateWithOptions(request, runtime);
    }

    public OnsMessageGetByKeyResponse onsMessageGetByKeyWithOptions(OnsMessageGetByKeyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("OnsMessageGetByKey", "2019-02-14", "HTTPS", "POST", "AK", "json", req, runtime), new OnsMessageGetByKeyResponse());
    }

    public OnsMessageGetByKeyResponse onsMessageGetByKey(OnsMessageGetByKeyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.onsMessageGetByKeyWithOptions(request, runtime);
    }

    public OnsMessageGetByMsgIdResponse onsMessageGetByMsgIdWithOptions(OnsMessageGetByMsgIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("OnsMessageGetByMsgId", "2019-02-14", "HTTPS", "POST", "AK", "json", req, runtime), new OnsMessageGetByMsgIdResponse());
    }

    public OnsMessageGetByMsgIdResponse onsMessageGetByMsgId(OnsMessageGetByMsgIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.onsMessageGetByMsgIdWithOptions(request, runtime);
    }

    public OnsMessagePageQueryByTopicResponse onsMessagePageQueryByTopicWithOptions(OnsMessagePageQueryByTopicRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("OnsMessagePageQueryByTopic", "2019-02-14", "HTTPS", "POST", "AK", "json", req, runtime), new OnsMessagePageQueryByTopicResponse());
    }

    public OnsMessagePageQueryByTopicResponse onsMessagePageQueryByTopic(OnsMessagePageQueryByTopicRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.onsMessagePageQueryByTopicWithOptions(request, runtime);
    }

    public OnsMessagePushResponse onsMessagePushWithOptions(OnsMessagePushRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("OnsMessagePush", "2019-02-14", "HTTPS", "POST", "AK", "json", req, runtime), new OnsMessagePushResponse());
    }

    public OnsMessagePushResponse onsMessagePush(OnsMessagePushRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.onsMessagePushWithOptions(request, runtime);
    }

    public OnsMessageSendResponse onsMessageSendWithOptions(OnsMessageSendRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("OnsMessageSend", "2019-02-14", "HTTPS", "POST", "AK", "json", req, runtime), new OnsMessageSendResponse());
    }

    public OnsMessageSendResponse onsMessageSend(OnsMessageSendRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.onsMessageSendWithOptions(request, runtime);
    }

    public OnsMessageTraceResponse onsMessageTraceWithOptions(OnsMessageTraceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("OnsMessageTrace", "2019-02-14", "HTTPS", "POST", "AK", "json", req, runtime), new OnsMessageTraceResponse());
    }

    public OnsMessageTraceResponse onsMessageTrace(OnsMessageTraceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.onsMessageTraceWithOptions(request, runtime);
    }

    public OnsMqttGroupIdCreateResponse onsMqttGroupIdCreateWithOptions(OnsMqttGroupIdCreateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("OnsMqttGroupIdCreate", "2019-02-14", "HTTPS", "POST", "AK", "json", req, runtime), new OnsMqttGroupIdCreateResponse());
    }

    public OnsMqttGroupIdCreateResponse onsMqttGroupIdCreate(OnsMqttGroupIdCreateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.onsMqttGroupIdCreateWithOptions(request, runtime);
    }

    public OnsMqttGroupIdDeleteResponse onsMqttGroupIdDeleteWithOptions(OnsMqttGroupIdDeleteRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("OnsMqttGroupIdDelete", "2019-02-14", "HTTPS", "POST", "AK", "json", req, runtime), new OnsMqttGroupIdDeleteResponse());
    }

    public OnsMqttGroupIdDeleteResponse onsMqttGroupIdDelete(OnsMqttGroupIdDeleteRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.onsMqttGroupIdDeleteWithOptions(request, runtime);
    }

    public OnsMqttGroupIdListResponse onsMqttGroupIdListWithOptions(OnsMqttGroupIdListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("OnsMqttGroupIdList", "2019-02-14", "HTTPS", "POST", "AK", "json", req, runtime), new OnsMqttGroupIdListResponse());
    }

    public OnsMqttGroupIdListResponse onsMqttGroupIdList(OnsMqttGroupIdListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.onsMqttGroupIdListWithOptions(request, runtime);
    }

    public OnsMqttQueryClientByClientIdResponse onsMqttQueryClientByClientIdWithOptions(OnsMqttQueryClientByClientIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("OnsMqttQueryClientByClientId", "2019-02-14", "HTTPS", "POST", "AK", "json", req, runtime), new OnsMqttQueryClientByClientIdResponse());
    }

    public OnsMqttQueryClientByClientIdResponse onsMqttQueryClientByClientId(OnsMqttQueryClientByClientIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.onsMqttQueryClientByClientIdWithOptions(request, runtime);
    }

    public OnsMqttQueryClientByGroupIdResponse onsMqttQueryClientByGroupIdWithOptions(OnsMqttQueryClientByGroupIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("OnsMqttQueryClientByGroupId", "2019-02-14", "HTTPS", "POST", "AK", "json", req, runtime), new OnsMqttQueryClientByGroupIdResponse());
    }

    public OnsMqttQueryClientByGroupIdResponse onsMqttQueryClientByGroupId(OnsMqttQueryClientByGroupIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.onsMqttQueryClientByGroupIdWithOptions(request, runtime);
    }

    public OnsMqttQueryClientByTopicResponse onsMqttQueryClientByTopicWithOptions(OnsMqttQueryClientByTopicRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("OnsMqttQueryClientByTopic", "2019-02-14", "HTTPS", "POST", "AK", "json", req, runtime), new OnsMqttQueryClientByTopicResponse());
    }

    public OnsMqttQueryClientByTopicResponse onsMqttQueryClientByTopic(OnsMqttQueryClientByTopicRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.onsMqttQueryClientByTopicWithOptions(request, runtime);
    }

    public OnsMqttQueryHistoryOnlineResponse onsMqttQueryHistoryOnlineWithOptions(OnsMqttQueryHistoryOnlineRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("OnsMqttQueryHistoryOnline", "2019-02-14", "HTTPS", "POST", "AK", "json", req, runtime), new OnsMqttQueryHistoryOnlineResponse());
    }

    public OnsMqttQueryHistoryOnlineResponse onsMqttQueryHistoryOnline(OnsMqttQueryHistoryOnlineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.onsMqttQueryHistoryOnlineWithOptions(request, runtime);
    }

    public OnsMqttQueryMsgTransTrendResponse onsMqttQueryMsgTransTrendWithOptions(OnsMqttQueryMsgTransTrendRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("OnsMqttQueryMsgTransTrend", "2019-02-14", "HTTPS", "POST", "AK", "json", req, runtime), new OnsMqttQueryMsgTransTrendResponse());
    }

    public OnsMqttQueryMsgTransTrendResponse onsMqttQueryMsgTransTrend(OnsMqttQueryMsgTransTrendRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.onsMqttQueryMsgTransTrendWithOptions(request, runtime);
    }

    public OnsRegionListResponse onsRegionListWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("OnsRegionList", "2019-02-14", "HTTPS", "POST", "AK", "json", req, runtime), new OnsRegionListResponse());
    }

    public OnsRegionListResponse onsRegionList() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.onsRegionListWithOptions(runtime);
    }

    public OnsTopicCreateResponse onsTopicCreateWithOptions(OnsTopicCreateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("OnsTopicCreate", "2019-02-14", "HTTPS", "POST", "AK", "json", req, runtime), new OnsTopicCreateResponse());
    }

    public OnsTopicCreateResponse onsTopicCreate(OnsTopicCreateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.onsTopicCreateWithOptions(request, runtime);
    }

    public OnsTopicDeleteResponse onsTopicDeleteWithOptions(OnsTopicDeleteRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("OnsTopicDelete", "2019-02-14", "HTTPS", "POST", "AK", "json", req, runtime), new OnsTopicDeleteResponse());
    }

    public OnsTopicDeleteResponse onsTopicDelete(OnsTopicDeleteRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.onsTopicDeleteWithOptions(request, runtime);
    }

    public OnsTopicListResponse onsTopicListWithOptions(OnsTopicListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("OnsTopicList", "2019-02-14", "HTTPS", "POST", "AK", "json", req, runtime), new OnsTopicListResponse());
    }

    public OnsTopicListResponse onsTopicList(OnsTopicListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.onsTopicListWithOptions(request, runtime);
    }

    public OnsTopicStatusResponse onsTopicStatusWithOptions(OnsTopicStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("OnsTopicStatus", "2019-02-14", "HTTPS", "POST", "AK", "json", req, runtime), new OnsTopicStatusResponse());
    }

    public OnsTopicStatusResponse onsTopicStatus(OnsTopicStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.onsTopicStatusWithOptions(request, runtime);
    }

    public OnsTopicSubDetailResponse onsTopicSubDetailWithOptions(OnsTopicSubDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("OnsTopicSubDetail", "2019-02-14", "HTTPS", "POST", "AK", "json", req, runtime), new OnsTopicSubDetailResponse());
    }

    public OnsTopicSubDetailResponse onsTopicSubDetail(OnsTopicSubDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.onsTopicSubDetailWithOptions(request, runtime);
    }

    public OnsTopicUpdateResponse onsTopicUpdateWithOptions(OnsTopicUpdateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("OnsTopicUpdate", "2019-02-14", "HTTPS", "POST", "AK", "json", req, runtime), new OnsTopicUpdateResponse());
    }

    public OnsTopicUpdateResponse onsTopicUpdate(OnsTopicUpdateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.onsTopicUpdateWithOptions(request, runtime);
    }

    public OnsTraceGetResultResponse onsTraceGetResultWithOptions(OnsTraceGetResultRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("OnsTraceGetResult", "2019-02-14", "HTTPS", "POST", "AK", "json", req, runtime), new OnsTraceGetResultResponse());
    }

    public OnsTraceGetResultResponse onsTraceGetResult(OnsTraceGetResultRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.onsTraceGetResultWithOptions(request, runtime);
    }

    public OnsTraceQueryByMsgIdResponse onsTraceQueryByMsgIdWithOptions(OnsTraceQueryByMsgIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("OnsTraceQueryByMsgId", "2019-02-14", "HTTPS", "POST", "AK", "json", req, runtime), new OnsTraceQueryByMsgIdResponse());
    }

    public OnsTraceQueryByMsgIdResponse onsTraceQueryByMsgId(OnsTraceQueryByMsgIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.onsTraceQueryByMsgIdWithOptions(request, runtime);
    }

    public OnsTraceQueryByMsgKeyResponse onsTraceQueryByMsgKeyWithOptions(OnsTraceQueryByMsgKeyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("OnsTraceQueryByMsgKey", "2019-02-14", "HTTPS", "POST", "AK", "json", req, runtime), new OnsTraceQueryByMsgKeyResponse());
    }

    public OnsTraceQueryByMsgKeyResponse onsTraceQueryByMsgKey(OnsTraceQueryByMsgKeyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.onsTraceQueryByMsgKeyWithOptions(request, runtime);
    }

    public OnsTrendGroupOutputTpsResponse onsTrendGroupOutputTpsWithOptions(OnsTrendGroupOutputTpsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("OnsTrendGroupOutputTps", "2019-02-14", "HTTPS", "POST", "AK", "json", req, runtime), new OnsTrendGroupOutputTpsResponse());
    }

    public OnsTrendGroupOutputTpsResponse onsTrendGroupOutputTps(OnsTrendGroupOutputTpsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.onsTrendGroupOutputTpsWithOptions(request, runtime);
    }

    public OnsTrendTopicInputTpsResponse onsTrendTopicInputTpsWithOptions(OnsTrendTopicInputTpsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("OnsTrendTopicInputTps", "2019-02-14", "HTTPS", "POST", "AK", "json", req, runtime), new OnsTrendTopicInputTpsResponse());
    }

    public OnsTrendTopicInputTpsResponse onsTrendTopicInputTps(OnsTrendTopicInputTpsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.onsTrendTopicInputTpsWithOptions(request, runtime);
    }

    public OnsWarnCreateResponse onsWarnCreateWithOptions(OnsWarnCreateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("OnsWarnCreate", "2019-02-14", "HTTPS", "POST", "AK", "json", req, runtime), new OnsWarnCreateResponse());
    }

    public OnsWarnCreateResponse onsWarnCreate(OnsWarnCreateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.onsWarnCreateWithOptions(request, runtime);
    }

    public OnsWarnDeleteResponse onsWarnDeleteWithOptions(OnsWarnDeleteRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("OnsWarnDelete", "2019-02-14", "HTTPS", "POST", "AK", "json", req, runtime), new OnsWarnDeleteResponse());
    }

    public OnsWarnDeleteResponse onsWarnDelete(OnsWarnDeleteRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.onsWarnDeleteWithOptions(request, runtime);
    }

    public OpenOnsServiceResponse openOnsServiceWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("OpenOnsService", "2019-02-14", "HTTPS", "POST", "AK", "json", req, runtime), new OpenOnsServiceResponse());
    }

    public OpenOnsServiceResponse openOnsService() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.openOnsServiceWithOptions(runtime);
    }

    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("TagResources", "2019-02-14", "HTTPS", "POST", "AK", "json", req, runtime), new TagResourcesResponse());
    }

    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

    public UntagResourcesResponse untagResourcesWithOptions(UntagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UntagResources", "2019-02-14", "HTTPS", "POST", "AK", "json", req, runtime), new UntagResourcesResponse());
    }

    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.untagResourcesWithOptions(request, runtime);
    }
}
