// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.snsuapi20180709;

import com.aliyun.tea.*;
import com.aliyun.snsuapi20180709.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("snsuapi", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public BandOfferOrderResponse bandOfferOrderWithOptions(BandOfferOrderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BandOfferOrder", "2018-07-09", "HTTPS", "POST", "AK", "json", req, runtime), new BandOfferOrderResponse());
    }

    public BandOfferOrderResponse bandOfferOrder(BandOfferOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.bandOfferOrderWithOptions(request, runtime);
    }

    public BandPrecheckResponse bandPrecheckWithOptions(BandPrecheckRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BandPrecheck", "2018-07-09", "HTTPS", "POST", "AK", "json", req, runtime), new BandPrecheckResponse());
    }

    public BandPrecheckResponse bandPrecheck(BandPrecheckRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.bandPrecheckWithOptions(request, runtime);
    }

    public BandStartSpeedUpResponse bandStartSpeedUpWithOptions(BandStartSpeedUpRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BandStartSpeedUp", "2018-07-09", "HTTPS", "POST", "AK", "json", req, runtime), new BandStartSpeedUpResponse());
    }

    public BandStartSpeedUpResponse bandStartSpeedUp(BandStartSpeedUpRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.bandStartSpeedUpWithOptions(request, runtime);
    }

    public BandStatusQueryResponse bandStatusQueryWithOptions(BandStatusQueryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BandStatusQuery", "2018-07-09", "HTTPS", "POST", "AK", "json", req, runtime), new BandStatusQueryResponse());
    }

    public BandStatusQueryResponse bandStatusQuery(BandStatusQueryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.bandStatusQueryWithOptions(request, runtime);
    }

    public BandStopSpeedUpResponse bandStopSpeedUpWithOptions(BandStopSpeedUpRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BandStopSpeedUp", "2018-07-09", "HTTPS", "POST", "AK", "json", req, runtime), new BandStopSpeedUpResponse());
    }

    public BandStopSpeedUpResponse bandStopSpeedUp(BandStopSpeedUpRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.bandStopSpeedUpWithOptions(request, runtime);
    }

    public MobileStartSpeedUpResponse mobileStartSpeedUpWithOptions(MobileStartSpeedUpRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("MobileStartSpeedUp", "2018-07-09", "HTTPS", "POST", "AK", "json", req, runtime), new MobileStartSpeedUpResponse());
    }

    public MobileStartSpeedUpResponse mobileStartSpeedUp(MobileStartSpeedUpRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.mobileStartSpeedUpWithOptions(request, runtime);
    }

    public MobileStatusQueryResponse mobileStatusQueryWithOptions(MobileStatusQueryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("MobileStatusQuery", "2018-07-09", "HTTPS", "POST", "AK", "json", req, runtime), new MobileStatusQueryResponse());
    }

    public MobileStatusQueryResponse mobileStatusQuery(MobileStatusQueryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.mobileStatusQueryWithOptions(request, runtime);
    }

    public MobileStopSpeedUpResponse mobileStopSpeedUpWithOptions(MobileStopSpeedUpRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("MobileStopSpeedUp", "2018-07-09", "HTTPS", "POST", "AK", "json", req, runtime), new MobileStopSpeedUpResponse());
    }

    public MobileStopSpeedUpResponse mobileStopSpeedUp(MobileStopSpeedUpRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.mobileStopSpeedUpWithOptions(request, runtime);
    }
}
