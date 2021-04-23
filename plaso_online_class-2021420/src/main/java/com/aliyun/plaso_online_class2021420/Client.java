// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.plaso_online_class2021420;

import com.aliyun.tea.*;
import com.aliyun.plaso_online_class2021420.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "central";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("ap-northeast-1", "plaso-classroom.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "plaso-classroom.aliyuncs.com"),
            new TeaPair("ap-south-1", "plaso-classroom.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "plaso-classroom.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "plaso-classroom.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "plaso-classroom.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "plaso-classroom.aliyuncs.com"),
            new TeaPair("cn-beijing", "plaso-classroom.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "plaso-classroom.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "plaso-classroom.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "plaso-classroom.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "plaso-classroom.aliyuncs.com"),
            new TeaPair("cn-chengdu", "plaso-classroom.aliyuncs.com"),
            new TeaPair("cn-edge-1", "plaso-classroom.aliyuncs.com"),
            new TeaPair("cn-fujian", "plaso-classroom.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "plaso-classroom.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "plaso-classroom.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "plaso-classroom.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "plaso-classroom.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "plaso-classroom.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "plaso-classroom.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "plaso-classroom.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "plaso-classroom.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "plaso-classroom.aliyuncs.com"),
            new TeaPair("cn-hongkong", "plaso-classroom.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "plaso-classroom.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "plaso-classroom.aliyuncs.com"),
            new TeaPair("cn-huhehaote-nebula-1", "plaso-classroom.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "plaso-classroom.aliyuncs.com"),
            new TeaPair("cn-qingdao", "plaso-classroom.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "plaso-classroom.aliyuncs.com"),
            new TeaPair("cn-shanghai", "plaso-classroom.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "plaso-classroom.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "plaso-classroom.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "plaso-classroom.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "plaso-classroom.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "plaso-classroom.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "plaso-classroom.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "plaso-classroom.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "plaso-classroom.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "plaso-classroom.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "plaso-classroom.aliyuncs.com"),
            new TeaPair("cn-wuhan", "plaso-classroom.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "plaso-classroom.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "plaso-classroom.aliyuncs.com"),
            new TeaPair("cn-zhangbei", "plaso-classroom.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "plaso-classroom.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "plaso-classroom.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "plaso-classroom.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "plaso-classroom.aliyuncs.com"),
            new TeaPair("eu-central-1", "plaso-classroom.aliyuncs.com"),
            new TeaPair("eu-west-1", "plaso-classroom.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "plaso-classroom.aliyuncs.com"),
            new TeaPair("me-east-1", "plaso-classroom.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "plaso-classroom.aliyuncs.com"),
            new TeaPair("us-east-1", "plaso-classroom.aliyuncs.com"),
            new TeaPair("us-west-1", "plaso-classroom.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("plaso_online_class", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public EndCallbackResponse endCallback(EndCallbackRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.endCallbackWithOptions(request, headers, runtime);
    }

    public EndCallbackResponse endCallbackWithOptions(EndCallbackRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.signature)) {
            query.put("Signature", request.signature);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.validBegin)) {
            query.put("ValidBegin", request.validBegin);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.meetingId)) {
            query.put("MeetingId", request.meetingId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.validTime)) {
            query.put("ValidTime", request.validTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newEndTime)) {
            query.put("NewEndTime", request.newEndTime);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTime)) {
            body.put("OpTime", request.opTime);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequestWithForm("EndCallback", "2021-4-20", "HTTPS", "POST", "AK", "/plaso/roa", "json", req, runtime), new EndCallbackResponse());
    }
}
