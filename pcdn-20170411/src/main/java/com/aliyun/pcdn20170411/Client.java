// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411;

import com.aliyun.tea.*;
import com.aliyun.pcdn20170411.models.*;
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
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("pcdn", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AddConsumerResponse addConsumerWithOptions(AddConsumerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("AddConsumer", "2017-04-11", "HTTPS", "GET", "AK", "json", req, runtime), new AddConsumerResponse());
    }

    public AddConsumerResponse addConsumer(AddConsumerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addConsumerWithOptions(request, runtime);
    }

    public AddDomainResponse addDomainWithOptions(AddDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("AddDomain", "2017-04-11", "HTTPS", "GET", "AK", "json", req, runtime), new AddDomainResponse());
    }

    public AddDomainResponse addDomain(AddDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addDomainWithOptions(request, runtime);
    }

    public AddPcdnControlRuleResponse addPcdnControlRuleWithOptions(AddPcdnControlRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("AddPcdnControlRule", "2017-04-11", "HTTPS", "GET", "AK", "json", req, runtime), new AddPcdnControlRuleResponse());
    }

    public AddPcdnControlRuleResponse addPcdnControlRule(AddPcdnControlRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addPcdnControlRuleWithOptions(request, runtime);
    }

    public DeleteDomainResponse deleteDomainWithOptions(DeleteDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteDomain", "2017-04-11", "HTTPS", "GET", "AK", "json", req, runtime), new DeleteDomainResponse());
    }

    public DeleteDomainResponse deleteDomain(DeleteDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDomainWithOptions(request, runtime);
    }

    public DeletePcdnControlRuleResponse deletePcdnControlRuleWithOptions(DeletePcdnControlRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DeletePcdnControlRule", "2017-04-11", "HTTPS", "GET", "AK", "json", req, runtime), new DeletePcdnControlRuleResponse());
    }

    public DeletePcdnControlRuleResponse deletePcdnControlRule(DeletePcdnControlRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deletePcdnControlRuleWithOptions(request, runtime);
    }

    public DisablePcdnControlRuleResponse disablePcdnControlRuleWithOptions(DisablePcdnControlRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DisablePcdnControlRule", "2017-04-11", "HTTPS", "GET", "AK", "json", req, runtime), new DisablePcdnControlRuleResponse());
    }

    public DisablePcdnControlRuleResponse disablePcdnControlRule(DisablePcdnControlRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.disablePcdnControlRuleWithOptions(request, runtime);
    }

    public EditPcdnControlRuleResponse editPcdnControlRuleWithOptions(EditPcdnControlRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("EditPcdnControlRule", "2017-04-11", "HTTPS", "GET", "AK", "json", req, runtime), new EditPcdnControlRuleResponse());
    }

    public EditPcdnControlRuleResponse editPcdnControlRule(EditPcdnControlRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.editPcdnControlRuleWithOptions(request, runtime);
    }

    public EnablePcdnControlRuleResponse enablePcdnControlRuleWithOptions(EnablePcdnControlRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("EnablePcdnControlRule", "2017-04-11", "HTTPS", "GET", "AK", "json", req, runtime), new EnablePcdnControlRuleResponse());
    }

    public EnablePcdnControlRuleResponse enablePcdnControlRule(EnablePcdnControlRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.enablePcdnControlRuleWithOptions(request, runtime);
    }

    public GetAccessDataResponse getAccessDataWithOptions(GetAccessDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAccessData", "2017-04-11", "HTTPS", "GET", "AK", "json", req, runtime), new GetAccessDataResponse());
    }

    public GetAccessDataResponse getAccessData(GetAccessDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAccessDataWithOptions(request, runtime);
    }

    public GetAllAppVersionsResponse getAllAppVersionsWithOptions(GetAllAppVersionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAllAppVersions", "2017-04-11", "HTTPS", "GET", "AK", "json", req, runtime), new GetAllAppVersionsResponse());
    }

    public GetAllAppVersionsResponse getAllAppVersions(GetAllAppVersionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAllAppVersionsWithOptions(request, runtime);
    }

    public GetAllIspResponse getAllIspWithOptions(GetAllIspRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAllIsp", "2017-04-11", "HTTPS", "GET", "AK", "json", req, runtime), new GetAllIspResponse());
    }

    public GetAllIspResponse getAllIsp(GetAllIspRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAllIspWithOptions(request, runtime);
    }

    public GetAllMarketsResponse getAllMarketsWithOptions(GetAllMarketsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAllMarkets", "2017-04-11", "HTTPS", "GET", "AK", "json", req, runtime), new GetAllMarketsResponse());
    }

    public GetAllMarketsResponse getAllMarkets(GetAllMarketsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAllMarketsWithOptions(request, runtime);
    }

    public GetAllPlatformTypesResponse getAllPlatformTypesWithOptions(GetAllPlatformTypesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAllPlatformTypes", "2017-04-11", "HTTPS", "GET", "AK", "json", req, runtime), new GetAllPlatformTypesResponse());
    }

    public GetAllPlatformTypesResponse getAllPlatformTypes(GetAllPlatformTypesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAllPlatformTypesWithOptions(request, runtime);
    }

    public GetAllRegionsResponse getAllRegionsWithOptions(GetAllRegionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAllRegions", "2017-04-11", "HTTPS", "GET", "AK", "json", req, runtime), new GetAllRegionsResponse());
    }

    public GetAllRegionsResponse getAllRegions(GetAllRegionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAllRegionsWithOptions(request, runtime);
    }

    public GetBalanceBandwidthDataResponse getBalanceBandwidthDataWithOptions(GetBalanceBandwidthDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetBalanceBandwidthData", "2017-04-11", "HTTPS", "GET", "AK", "json", req, runtime), new GetBalanceBandwidthDataResponse());
    }

    public GetBalanceBandwidthDataResponse getBalanceBandwidthData(GetBalanceBandwidthDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getBalanceBandwidthDataWithOptions(request, runtime);
    }

    public GetBalanceTrafficDataResponse getBalanceTrafficDataWithOptions(GetBalanceTrafficDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetBalanceTrafficData", "2017-04-11", "HTTPS", "GET", "AK", "json", req, runtime), new GetBalanceTrafficDataResponse());
    }

    public GetBalanceTrafficDataResponse getBalanceTrafficData(GetBalanceTrafficDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getBalanceTrafficDataWithOptions(request, runtime);
    }

    public GetBandwidthDataResponse getBandwidthDataWithOptions(GetBandwidthDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetBandwidthData", "2017-04-11", "HTTPS", "GET", "AK", "json", req, runtime), new GetBandwidthDataResponse());
    }

    public GetBandwidthDataResponse getBandwidthData(GetBandwidthDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getBandwidthDataWithOptions(request, runtime);
    }

    public GetClientsRatioResponse getClientsRatioWithOptions(GetClientsRatioRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetClientsRatio", "2017-04-11", "HTTPS", "GET", "AK", "json", req, runtime), new GetClientsRatioResponse());
    }

    public GetClientsRatioResponse getClientsRatio(GetClientsRatioRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getClientsRatioWithOptions(request, runtime);
    }

    public GetConsumerStatusResponse getConsumerStatusWithOptions(GetConsumerStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetConsumerStatus", "2017-04-11", "HTTPS", "GET", "AK", "json", req, runtime), new GetConsumerStatusResponse());
    }

    public GetConsumerStatusResponse getConsumerStatus(GetConsumerStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getConsumerStatusWithOptions(request, runtime);
    }

    public GetControlRulesResponse getControlRulesWithOptions(GetControlRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetControlRules", "2017-04-11", "HTTPS", "GET", "AK", "json", req, runtime), new GetControlRulesResponse());
    }

    public GetControlRulesResponse getControlRules(GetControlRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getControlRulesWithOptions(request, runtime);
    }

    public GetCoverRateDataResponse getCoverRateDataWithOptions(GetCoverRateDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetCoverRateData", "2017-04-11", "HTTPS", "GET", "AK", "json", req, runtime), new GetCoverRateDataResponse());
    }

    public GetCoverRateDataResponse getCoverRateData(GetCoverRateDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getCoverRateDataWithOptions(request, runtime);
    }

    public GetCurrentModeResponse getCurrentModeWithOptions(GetCurrentModeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetCurrentMode", "2017-04-11", "HTTPS", "GET", "AK", "json", req, runtime), new GetCurrentModeResponse());
    }

    public GetCurrentModeResponse getCurrentMode(GetCurrentModeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getCurrentModeWithOptions(request, runtime);
    }

    public GetDomainCountResponse getDomainCountWithOptions(GetDomainCountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetDomainCount", "2017-04-11", "HTTPS", "GET", "AK", "json", req, runtime), new GetDomainCountResponse());
    }

    public GetDomainCountResponse getDomainCount(GetDomainCountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDomainCountWithOptions(request, runtime);
    }

    public GetDomainsResponse getDomainsWithOptions(GetDomainsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetDomains", "2017-04-11", "HTTPS", "GET", "AK", "json", req, runtime), new GetDomainsResponse());
    }

    public GetDomainsResponse getDomains(GetDomainsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDomainsWithOptions(request, runtime);
    }

    public GetExpenseSummaryResponse getExpenseSummaryWithOptions(GetExpenseSummaryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetExpenseSummary", "2017-04-11", "HTTPS", "GET", "AK", "json", req, runtime), new GetExpenseSummaryResponse());
    }

    public GetExpenseSummaryResponse getExpenseSummary(GetExpenseSummaryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getExpenseSummaryWithOptions(request, runtime);
    }

    public GetFeeHistoryResponse getFeeHistoryWithOptions(GetFeeHistoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetFeeHistory", "2017-04-11", "HTTPS", "GET", "AK", "json", req, runtime), new GetFeeHistoryResponse());
    }

    public GetFeeHistoryResponse getFeeHistory(GetFeeHistoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getFeeHistoryWithOptions(request, runtime);
    }

    public GetFirstFrameDelayDataResponse getFirstFrameDelayDataWithOptions(GetFirstFrameDelayDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetFirstFrameDelayData", "2017-04-11", "HTTPS", "GET", "AK", "json", req, runtime), new GetFirstFrameDelayDataResponse());
    }

    public GetFirstFrameDelayDataResponse getFirstFrameDelayData(GetFirstFrameDelayDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getFirstFrameDelayDataWithOptions(request, runtime);
    }

    public GetFluencyDataResponse getFluencyDataWithOptions(GetFluencyDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetFluencyData", "2017-04-11", "HTTPS", "GET", "AK", "json", req, runtime), new GetFluencyDataResponse());
    }

    public GetFluencyDataResponse getFluencyData(GetFluencyDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getFluencyDataWithOptions(request, runtime);
    }

    public GetLogsListResponse getLogsListWithOptions(GetLogsListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetLogsList", "2017-04-11", "HTTPS", "GET", "AK", "json", req, runtime), new GetLogsListResponse());
    }

    public GetLogsListResponse getLogsList(GetLogsListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getLogsListWithOptions(request, runtime);
    }

    public GetShareRateDataResponse getShareRateDataWithOptions(GetShareRateDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetShareRateData", "2017-04-11", "HTTPS", "GET", "AK", "json", req, runtime), new GetShareRateDataResponse());
    }

    public GetShareRateDataResponse getShareRateData(GetShareRateDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getShareRateDataWithOptions(request, runtime);
    }

    public GetTokenListResponse getTokenListWithOptions(GetTokenListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetTokenList", "2017-04-11", "HTTPS", "GET", "AK", "json", req, runtime), new GetTokenListResponse());
    }

    public GetTokenListResponse getTokenList(GetTokenListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getTokenListWithOptions(request, runtime);
    }

    public GetTrafficByRegionResponse getTrafficByRegionWithOptions(GetTrafficByRegionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetTrafficByRegion", "2017-04-11", "HTTPS", "GET", "AK", "json", req, runtime), new GetTrafficByRegionResponse());
    }

    public GetTrafficByRegionResponse getTrafficByRegion(GetTrafficByRegionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getTrafficByRegionWithOptions(request, runtime);
    }

    public GetTrafficDataResponse getTrafficDataWithOptions(GetTrafficDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetTrafficData", "2017-04-11", "HTTPS", "GET", "AK", "json", req, runtime), new GetTrafficDataResponse());
    }

    public GetTrafficDataResponse getTrafficData(GetTrafficDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getTrafficDataWithOptions(request, runtime);
    }

    public StartDomainResponse startDomainWithOptions(StartDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("StartDomain", "2017-04-11", "HTTPS", "GET", "AK", "json", req, runtime), new StartDomainResponse());
    }

    public StartDomainResponse startDomain(StartDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startDomainWithOptions(request, runtime);
    }

    public StopDomainResponse stopDomainWithOptions(StopDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("StopDomain", "2017-04-11", "HTTPS", "GET", "AK", "json", req, runtime), new StopDomainResponse());
    }

    public StopDomainResponse stopDomain(StopDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopDomainWithOptions(request, runtime);
    }
}
