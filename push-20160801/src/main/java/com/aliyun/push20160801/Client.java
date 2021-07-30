// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801;

import com.aliyun.tea.*;
import com.aliyun.push20160801.models.*;
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
            new TeaPair("ap-northeast-1", "cloudpush.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "cloudpush.aliyuncs.com"),
            new TeaPair("ap-south-1", "cloudpush.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "cloudpush.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "cloudpush.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "cloudpush.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-beijing", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-chengdu", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-edge-1", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-fujian", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-hongkong", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-qingdao", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-shanghai", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-wuhan", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "cloudpush.aliyuncs.com"),
            new TeaPair("eu-central-1", "cloudpush.aliyuncs.com"),
            new TeaPair("eu-west-1", "cloudpush.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "cloudpush.aliyuncs.com"),
            new TeaPair("me-east-1", "cloudpush.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "cloudpush.aliyuncs.com"),
            new TeaPair("us-east-1", "cloudpush.aliyuncs.com"),
            new TeaPair("us-west-1", "cloudpush.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("push", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public BindAliasResponse bindAliasWithOptions(BindAliasRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BindAlias", "2016-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new BindAliasResponse());
    }

    public BindAliasResponse bindAlias(BindAliasRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.bindAliasWithOptions(request, runtime);
    }

    public BindPhoneResponse bindPhoneWithOptions(BindPhoneRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BindPhone", "2016-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new BindPhoneResponse());
    }

    public BindPhoneResponse bindPhone(BindPhoneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.bindPhoneWithOptions(request, runtime);
    }

    public BindTagResponse bindTagWithOptions(BindTagRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BindTag", "2016-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new BindTagResponse());
    }

    public BindTagResponse bindTag(BindTagRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.bindTagWithOptions(request, runtime);
    }

    public CancelPushResponse cancelPushWithOptions(CancelPushRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CancelPush", "2016-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new CancelPushResponse());
    }

    public CancelPushResponse cancelPush(CancelPushRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cancelPushWithOptions(request, runtime);
    }

    public CheckCertificateResponse checkCertificateWithOptions(CheckCertificateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CheckCertificate", "2016-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new CheckCertificateResponse());
    }

    public CheckCertificateResponse checkCertificate(CheckCertificateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkCertificateWithOptions(request, runtime);
    }

    public CheckDeviceResponse checkDeviceWithOptions(CheckDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CheckDevice", "2016-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new CheckDeviceResponse());
    }

    public CheckDeviceResponse checkDevice(CheckDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkDeviceWithOptions(request, runtime);
    }

    public CheckDevicesResponse checkDevicesWithOptions(CheckDevicesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CheckDevices", "2016-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new CheckDevicesResponse());
    }

    public CheckDevicesResponse checkDevices(CheckDevicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkDevicesWithOptions(request, runtime);
    }

    public CompleteContinuouslyPushResponse completeContinuouslyPushWithOptions(CompleteContinuouslyPushRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CompleteContinuouslyPush", "2016-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new CompleteContinuouslyPushResponse());
    }

    public CompleteContinuouslyPushResponse completeContinuouslyPush(CompleteContinuouslyPushRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.completeContinuouslyPushWithOptions(request, runtime);
    }

    public ContinuouslyPushResponse continuouslyPushWithOptions(ContinuouslyPushRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ContinuouslyPush", "2016-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new ContinuouslyPushResponse());
    }

    public ContinuouslyPushResponse continuouslyPush(ContinuouslyPushRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.continuouslyPushWithOptions(request, runtime);
    }

    public ListSummaryAppsResponse listSummaryAppsWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("ListSummaryApps", "2016-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListSummaryAppsResponse());
    }

    public ListSummaryAppsResponse listSummaryApps() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listSummaryAppsWithOptions(runtime);
    }

    public ListTagsResponse listTagsWithOptions(ListTagsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListTags", "2016-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListTagsResponse());
    }

    public ListTagsResponse listTags(ListTagsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTagsWithOptions(request, runtime);
    }

    public MassPushResponse massPushWithOptions(MassPushRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("MassPush", "2016-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new MassPushResponse());
    }

    public MassPushResponse massPush(MassPushRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.massPushWithOptions(request, runtime);
    }

    public PushResponse pushWithOptions(PushRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("Push", "2016-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new PushResponse());
    }

    public PushResponse push(PushRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.pushWithOptions(request, runtime);
    }

    public PushMessageToAndroidResponse pushMessageToAndroidWithOptions(PushMessageToAndroidRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PushMessageToAndroid", "2016-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new PushMessageToAndroidResponse());
    }

    public PushMessageToAndroidResponse pushMessageToAndroid(PushMessageToAndroidRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.pushMessageToAndroidWithOptions(request, runtime);
    }

    public PushMessageToiOSResponse pushMessageToiOSWithOptions(PushMessageToiOSRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PushMessageToiOS", "2016-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new PushMessageToiOSResponse());
    }

    public PushMessageToiOSResponse pushMessageToiOS(PushMessageToiOSRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.pushMessageToiOSWithOptions(request, runtime);
    }

    public PushNoticeToAndroidResponse pushNoticeToAndroidWithOptions(PushNoticeToAndroidRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PushNoticeToAndroid", "2016-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new PushNoticeToAndroidResponse());
    }

    public PushNoticeToAndroidResponse pushNoticeToAndroid(PushNoticeToAndroidRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.pushNoticeToAndroidWithOptions(request, runtime);
    }

    public PushNoticeToiOSResponse pushNoticeToiOSWithOptions(PushNoticeToiOSRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PushNoticeToiOS", "2016-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new PushNoticeToiOSResponse());
    }

    public PushNoticeToiOSResponse pushNoticeToiOS(PushNoticeToiOSRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.pushNoticeToiOSWithOptions(request, runtime);
    }

    public QueryAliasesResponse queryAliasesWithOptions(QueryAliasesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryAliases", "2016-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new QueryAliasesResponse());
    }

    public QueryAliasesResponse queryAliases(QueryAliasesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryAliasesWithOptions(request, runtime);
    }

    public QueryDeviceCountResponse queryDeviceCountWithOptions(QueryDeviceCountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryDeviceCount", "2016-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new QueryDeviceCountResponse());
    }

    public QueryDeviceCountResponse queryDeviceCount(QueryDeviceCountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDeviceCountWithOptions(request, runtime);
    }

    public QueryDeviceInfoResponse queryDeviceInfoWithOptions(QueryDeviceInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryDeviceInfo", "2016-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new QueryDeviceInfoResponse());
    }

    public QueryDeviceInfoResponse queryDeviceInfo(QueryDeviceInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDeviceInfoWithOptions(request, runtime);
    }

    public QueryDevicesByAccountResponse queryDevicesByAccountWithOptions(QueryDevicesByAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryDevicesByAccount", "2016-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new QueryDevicesByAccountResponse());
    }

    public QueryDevicesByAccountResponse queryDevicesByAccount(QueryDevicesByAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDevicesByAccountWithOptions(request, runtime);
    }

    public QueryDevicesByAliasResponse queryDevicesByAliasWithOptions(QueryDevicesByAliasRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryDevicesByAlias", "2016-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new QueryDevicesByAliasResponse());
    }

    public QueryDevicesByAliasResponse queryDevicesByAlias(QueryDevicesByAliasRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDevicesByAliasWithOptions(request, runtime);
    }

    public QueryDeviceStatResponse queryDeviceStatWithOptions(QueryDeviceStatRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryDeviceStat", "2016-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new QueryDeviceStatResponse());
    }

    public QueryDeviceStatResponse queryDeviceStat(QueryDeviceStatRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDeviceStatWithOptions(request, runtime);
    }

    public QueryPushRecordsResponse queryPushRecordsWithOptions(QueryPushRecordsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryPushRecords", "2016-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new QueryPushRecordsResponse());
    }

    public QueryPushRecordsResponse queryPushRecords(QueryPushRecordsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryPushRecordsWithOptions(request, runtime);
    }

    public QueryPushStatByAppResponse queryPushStatByAppWithOptions(QueryPushStatByAppRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryPushStatByApp", "2016-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new QueryPushStatByAppResponse());
    }

    public QueryPushStatByAppResponse queryPushStatByApp(QueryPushStatByAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryPushStatByAppWithOptions(request, runtime);
    }

    public QueryPushStatByMsgResponse queryPushStatByMsgWithOptions(QueryPushStatByMsgRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryPushStatByMsg", "2016-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new QueryPushStatByMsgResponse());
    }

    public QueryPushStatByMsgResponse queryPushStatByMsg(QueryPushStatByMsgRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryPushStatByMsgWithOptions(request, runtime);
    }

    public QueryTagsResponse queryTagsWithOptions(QueryTagsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryTags", "2016-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new QueryTagsResponse());
    }

    public QueryTagsResponse queryTags(QueryTagsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryTagsWithOptions(request, runtime);
    }

    public QueryUniqueDeviceStatResponse queryUniqueDeviceStatWithOptions(QueryUniqueDeviceStatRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryUniqueDeviceStat", "2016-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new QueryUniqueDeviceStatResponse());
    }

    public QueryUniqueDeviceStatResponse queryUniqueDeviceStat(QueryUniqueDeviceStatRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryUniqueDeviceStatWithOptions(request, runtime);
    }

    public RemoveTagResponse removeTagWithOptions(RemoveTagRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RemoveTag", "2016-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new RemoveTagResponse());
    }

    public RemoveTagResponse removeTag(RemoveTagRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeTagWithOptions(request, runtime);
    }

    public UnbindAliasResponse unbindAliasWithOptions(UnbindAliasRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UnbindAlias", "2016-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new UnbindAliasResponse());
    }

    public UnbindAliasResponse unbindAlias(UnbindAliasRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unbindAliasWithOptions(request, runtime);
    }

    public UnbindPhoneResponse unbindPhoneWithOptions(UnbindPhoneRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UnbindPhone", "2016-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new UnbindPhoneResponse());
    }

    public UnbindPhoneResponse unbindPhone(UnbindPhoneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unbindPhoneWithOptions(request, runtime);
    }

    public UnbindTagResponse unbindTagWithOptions(UnbindTagRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UnbindTag", "2016-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new UnbindTagResponse());
    }

    public UnbindTagResponse unbindTag(UnbindTagRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unbindTagWithOptions(request, runtime);
    }
}
