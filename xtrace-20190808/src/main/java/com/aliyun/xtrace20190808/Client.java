// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtrace20190808;

import com.aliyun.tea.*;
import com.aliyun.xtrace20190808.models.*;
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
        this._endpoint = this.getEndpoint("xtrace", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public GetTagKeyResponse getTagKeyWithOptions(GetTagKeyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetTagKey", "2019-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new GetTagKeyResponse());
    }

    public GetTagKeyResponse getTagKey(GetTagKeyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getTagKeyWithOptions(request, runtime);
    }

    public GetTagValResponse getTagValWithOptions(GetTagValRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetTagVal", "2019-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new GetTagValResponse());
    }

    public GetTagValResponse getTagVal(GetTagValRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getTagValWithOptions(request, runtime);
    }

    public GetTokenResponse getTokenWithOptions(GetTokenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetToken", "2019-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new GetTokenResponse());
    }

    public GetTokenResponse getToken(GetTokenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getTokenWithOptions(request, runtime);
    }

    public GetTraceResponse getTraceWithOptions(GetTraceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetTrace", "2019-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new GetTraceResponse());
    }

    public GetTraceResponse getTrace(GetTraceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getTraceWithOptions(request, runtime);
    }

    public GetTraceAnalysisResponse getTraceAnalysisWithOptions(GetTraceAnalysisRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetTraceAnalysis", "2019-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new GetTraceAnalysisResponse());
    }

    public GetTraceAnalysisResponse getTraceAnalysis(GetTraceAnalysisRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getTraceAnalysisWithOptions(request, runtime);
    }

    public ListIpOrHostsResponse listIpOrHostsWithOptions(ListIpOrHostsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListIpOrHosts", "2019-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new ListIpOrHostsResponse());
    }

    public ListIpOrHostsResponse listIpOrHosts(ListIpOrHostsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listIpOrHostsWithOptions(request, runtime);
    }

    public ListServicesResponse listServicesWithOptions(ListServicesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListServices", "2019-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new ListServicesResponse());
    }

    public ListServicesResponse listServices(ListServicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listServicesWithOptions(request, runtime);
    }

    public ListSpanNamesResponse listSpanNamesWithOptions(ListSpanNamesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListSpanNames", "2019-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new ListSpanNamesResponse());
    }

    public ListSpanNamesResponse listSpanNames(ListSpanNamesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listSpanNamesWithOptions(request, runtime);
    }

    public QueryMetricResponse queryMetricWithOptions(QueryMetricRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryMetric", "2019-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new QueryMetricResponse());
    }

    public QueryMetricResponse queryMetric(QueryMetricRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryMetricWithOptions(request, runtime);
    }

    public SearchTracesResponse searchTracesWithOptions(SearchTracesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SearchTraces", "2019-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new SearchTracesResponse());
    }

    public SearchTracesResponse searchTraces(SearchTracesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.searchTracesWithOptions(request, runtime);
    }
}
