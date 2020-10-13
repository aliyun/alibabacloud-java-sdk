// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411;

import com.aliyun.tea.*;
import com.aliyun.pcdn20170411.models.*;

public class Client extends com.aliyun.tearpc.Client {
    public Client(com.aliyun.tearpc.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "central";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("pcdn", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
    }


    public StopDomainResponse stopDomainWithOptions(StopDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("StopDomain", "HTTPS", "GET", "2017-04-11", "AK", TeaModel.buildMap(request), null, runtime), new StopDomainResponse());
    }

    public StopDomainResponse stopDomain(StopDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopDomainWithOptions(request, runtime);
    }

    public StartDomainResponse startDomainWithOptions(StartDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("StartDomain", "HTTPS", "GET", "2017-04-11", "AK", TeaModel.buildMap(request), null, runtime), new StartDomainResponse());
    }

    public StartDomainResponse startDomain(StartDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startDomainWithOptions(request, runtime);
    }

    public DeleteDomainResponse deleteDomainWithOptions(DeleteDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteDomain", "HTTPS", "GET", "2017-04-11", "AK", TeaModel.buildMap(request), null, runtime), new DeleteDomainResponse());
    }

    public DeleteDomainResponse deleteDomain(DeleteDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDomainWithOptions(request, runtime);
    }

    public AddDomainResponse addDomainWithOptions(AddDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddDomain", "HTTPS", "GET", "2017-04-11", "AK", TeaModel.buildMap(request), null, runtime), new AddDomainResponse());
    }

    public AddDomainResponse addDomain(AddDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addDomainWithOptions(request, runtime);
    }

    public GetBalanceTrafficDataResponse getBalanceTrafficDataWithOptions(GetBalanceTrafficDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetBalanceTrafficData", "HTTPS", "GET", "2017-04-11", "AK", TeaModel.buildMap(request), null, runtime), new GetBalanceTrafficDataResponse());
    }

    public GetBalanceTrafficDataResponse getBalanceTrafficData(GetBalanceTrafficDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getBalanceTrafficDataWithOptions(request, runtime);
    }

    public AddPcdnControlRuleResponse addPcdnControlRuleWithOptions(AddPcdnControlRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddPcdnControlRule", "HTTPS", "GET", "2017-04-11", "AK", TeaModel.buildMap(request), null, runtime), new AddPcdnControlRuleResponse());
    }

    public AddPcdnControlRuleResponse addPcdnControlRule(AddPcdnControlRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addPcdnControlRuleWithOptions(request, runtime);
    }

    public AddConsumerResponse addConsumerWithOptions(AddConsumerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddConsumer", "HTTPS", "GET", "2017-04-11", "AK", TeaModel.buildMap(request), null, runtime), new AddConsumerResponse());
    }

    public AddConsumerResponse addConsumer(AddConsumerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addConsumerWithOptions(request, runtime);
    }

    public GetAccessDataResponse getAccessDataWithOptions(GetAccessDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetAccessData", "HTTPS", "GET", "2017-04-11", "AK", TeaModel.buildMap(request), null, runtime), new GetAccessDataResponse());
    }

    public GetAccessDataResponse getAccessData(GetAccessDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAccessDataWithOptions(request, runtime);
    }

    public EnablePcdnControlRuleResponse enablePcdnControlRuleWithOptions(EnablePcdnControlRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("EnablePcdnControlRule", "HTTPS", "GET", "2017-04-11", "AK", TeaModel.buildMap(request), null, runtime), new EnablePcdnControlRuleResponse());
    }

    public EnablePcdnControlRuleResponse enablePcdnControlRule(EnablePcdnControlRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enablePcdnControlRuleWithOptions(request, runtime);
    }

    public EditPcdnControlRuleResponse editPcdnControlRuleWithOptions(EditPcdnControlRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("EditPcdnControlRule", "HTTPS", "GET", "2017-04-11", "AK", TeaModel.buildMap(request), null, runtime), new EditPcdnControlRuleResponse());
    }

    public EditPcdnControlRuleResponse editPcdnControlRule(EditPcdnControlRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.editPcdnControlRuleWithOptions(request, runtime);
    }

    public DisablePcdnControlRuleResponse disablePcdnControlRuleWithOptions(DisablePcdnControlRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DisablePcdnControlRule", "HTTPS", "GET", "2017-04-11", "AK", TeaModel.buildMap(request), null, runtime), new DisablePcdnControlRuleResponse());
    }

    public DisablePcdnControlRuleResponse disablePcdnControlRule(DisablePcdnControlRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disablePcdnControlRuleWithOptions(request, runtime);
    }

    public DeletePcdnControlRuleResponse deletePcdnControlRuleWithOptions(DeletePcdnControlRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeletePcdnControlRule", "HTTPS", "GET", "2017-04-11", "AK", TeaModel.buildMap(request), null, runtime), new DeletePcdnControlRuleResponse());
    }

    public DeletePcdnControlRuleResponse deletePcdnControlRule(DeletePcdnControlRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deletePcdnControlRuleWithOptions(request, runtime);
    }

    public GetAllPlatformTypesResponse getAllPlatformTypesWithOptions(GetAllPlatformTypesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetAllPlatformTypes", "HTTPS", "GET", "2017-04-11", "AK", TeaModel.buildMap(request), null, runtime), new GetAllPlatformTypesResponse());
    }

    public GetAllPlatformTypesResponse getAllPlatformTypes(GetAllPlatformTypesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAllPlatformTypesWithOptions(request, runtime);
    }

    public GetAllMarketsResponse getAllMarketsWithOptions(GetAllMarketsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetAllMarkets", "HTTPS", "GET", "2017-04-11", "AK", TeaModel.buildMap(request), null, runtime), new GetAllMarketsResponse());
    }

    public GetAllMarketsResponse getAllMarkets(GetAllMarketsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAllMarketsWithOptions(request, runtime);
    }

    public GetAllIspResponse getAllIspWithOptions(GetAllIspRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetAllIsp", "HTTPS", "GET", "2017-04-11", "AK", TeaModel.buildMap(request), null, runtime), new GetAllIspResponse());
    }

    public GetAllIspResponse getAllIsp(GetAllIspRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAllIspWithOptions(request, runtime);
    }

    public GetAllAppVersionsResponse getAllAppVersionsWithOptions(GetAllAppVersionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetAllAppVersions", "HTTPS", "GET", "2017-04-11", "AK", TeaModel.buildMap(request), null, runtime), new GetAllAppVersionsResponse());
    }

    public GetAllAppVersionsResponse getAllAppVersions(GetAllAppVersionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAllAppVersionsWithOptions(request, runtime);
    }

    public GetConsumerStatusResponse getConsumerStatusWithOptions(GetConsumerStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetConsumerStatus", "HTTPS", "GET", "2017-04-11", "AK", TeaModel.buildMap(request), null, runtime), new GetConsumerStatusResponse());
    }

    public GetConsumerStatusResponse getConsumerStatus(GetConsumerStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getConsumerStatusWithOptions(request, runtime);
    }

    public GetClientsRatioResponse getClientsRatioWithOptions(GetClientsRatioRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetClientsRatio", "HTTPS", "GET", "2017-04-11", "AK", TeaModel.buildMap(request), null, runtime), new GetClientsRatioResponse());
    }

    public GetClientsRatioResponse getClientsRatio(GetClientsRatioRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getClientsRatioWithOptions(request, runtime);
    }

    public GetBandwidthDataResponse getBandwidthDataWithOptions(GetBandwidthDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetBandwidthData", "HTTPS", "GET", "2017-04-11", "AK", TeaModel.buildMap(request), null, runtime), new GetBandwidthDataResponse());
    }

    public GetBandwidthDataResponse getBandwidthData(GetBandwidthDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getBandwidthDataWithOptions(request, runtime);
    }

    public GetBalanceBandwidthDataResponse getBalanceBandwidthDataWithOptions(GetBalanceBandwidthDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetBalanceBandwidthData", "HTTPS", "GET", "2017-04-11", "AK", TeaModel.buildMap(request), null, runtime), new GetBalanceBandwidthDataResponse());
    }

    public GetBalanceBandwidthDataResponse getBalanceBandwidthData(GetBalanceBandwidthDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getBalanceBandwidthDataWithOptions(request, runtime);
    }

    public GetControlRulesResponse getControlRulesWithOptions(GetControlRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetControlRules", "HTTPS", "GET", "2017-04-11", "AK", TeaModel.buildMap(request), null, runtime), new GetControlRulesResponse());
    }

    public GetControlRulesResponse getControlRules(GetControlRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getControlRulesWithOptions(request, runtime);
    }

    public GetDomainCountResponse getDomainCountWithOptions(GetDomainCountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetDomainCount", "HTTPS", "GET", "2017-04-11", "AK", TeaModel.buildMap(request), null, runtime), new GetDomainCountResponse());
    }

    public GetDomainCountResponse getDomainCount(GetDomainCountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDomainCountWithOptions(request, runtime);
    }

    public GetCurrentModeResponse getCurrentModeWithOptions(GetCurrentModeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetCurrentMode", "HTTPS", "GET", "2017-04-11", "AK", TeaModel.buildMap(request), null, runtime), new GetCurrentModeResponse());
    }

    public GetCurrentModeResponse getCurrentMode(GetCurrentModeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCurrentModeWithOptions(request, runtime);
    }

    public GetCoverRateDataResponse getCoverRateDataWithOptions(GetCoverRateDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetCoverRateData", "HTTPS", "GET", "2017-04-11", "AK", TeaModel.buildMap(request), null, runtime), new GetCoverRateDataResponse());
    }

    public GetCoverRateDataResponse getCoverRateData(GetCoverRateDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCoverRateDataWithOptions(request, runtime);
    }

    public GetFeeHistoryResponse getFeeHistoryWithOptions(GetFeeHistoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetFeeHistory", "HTTPS", "GET", "2017-04-11", "AK", TeaModel.buildMap(request), null, runtime), new GetFeeHistoryResponse());
    }

    public GetFeeHistoryResponse getFeeHistory(GetFeeHistoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getFeeHistoryWithOptions(request, runtime);
    }

    public GetExpenseSummaryResponse getExpenseSummaryWithOptions(GetExpenseSummaryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetExpenseSummary", "HTTPS", "GET", "2017-04-11", "AK", TeaModel.buildMap(request), null, runtime), new GetExpenseSummaryResponse());
    }

    public GetExpenseSummaryResponse getExpenseSummary(GetExpenseSummaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getExpenseSummaryWithOptions(request, runtime);
    }

    public GetDomainsResponse getDomainsWithOptions(GetDomainsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetDomains", "HTTPS", "GET", "2017-04-11", "AK", TeaModel.buildMap(request), null, runtime), new GetDomainsResponse());
    }

    public GetDomainsResponse getDomains(GetDomainsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDomainsWithOptions(request, runtime);
    }

    public GetLogsListResponse getLogsListWithOptions(GetLogsListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetLogsList", "HTTPS", "GET", "2017-04-11", "AK", TeaModel.buildMap(request), null, runtime), new GetLogsListResponse());
    }

    public GetLogsListResponse getLogsList(GetLogsListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getLogsListWithOptions(request, runtime);
    }

    public GetFluencyDataResponse getFluencyDataWithOptions(GetFluencyDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetFluencyData", "HTTPS", "GET", "2017-04-11", "AK", TeaModel.buildMap(request), null, runtime), new GetFluencyDataResponse());
    }

    public GetFluencyDataResponse getFluencyData(GetFluencyDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getFluencyDataWithOptions(request, runtime);
    }

    public GetFirstFrameDelayDataResponse getFirstFrameDelayDataWithOptions(GetFirstFrameDelayDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetFirstFrameDelayData", "HTTPS", "GET", "2017-04-11", "AK", TeaModel.buildMap(request), null, runtime), new GetFirstFrameDelayDataResponse());
    }

    public GetFirstFrameDelayDataResponse getFirstFrameDelayData(GetFirstFrameDelayDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getFirstFrameDelayDataWithOptions(request, runtime);
    }

    public GetTokenListResponse getTokenListWithOptions(GetTokenListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetTokenList", "HTTPS", "GET", "2017-04-11", "AK", TeaModel.buildMap(request), null, runtime), new GetTokenListResponse());
    }

    public GetTokenListResponse getTokenList(GetTokenListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTokenListWithOptions(request, runtime);
    }

    public GetShareRateDataResponse getShareRateDataWithOptions(GetShareRateDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetShareRateData", "HTTPS", "GET", "2017-04-11", "AK", TeaModel.buildMap(request), null, runtime), new GetShareRateDataResponse());
    }

    public GetShareRateDataResponse getShareRateData(GetShareRateDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getShareRateDataWithOptions(request, runtime);
    }

    public GetTrafficDataResponse getTrafficDataWithOptions(GetTrafficDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetTrafficData", "HTTPS", "GET", "2017-04-11", "AK", TeaModel.buildMap(request), null, runtime), new GetTrafficDataResponse());
    }

    public GetTrafficDataResponse getTrafficData(GetTrafficDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTrafficDataWithOptions(request, runtime);
    }

    public GetTrafficByRegionResponse getTrafficByRegionWithOptions(GetTrafficByRegionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetTrafficByRegion", "HTTPS", "GET", "2017-04-11", "AK", TeaModel.buildMap(request), null, runtime), new GetTrafficByRegionResponse());
    }

    public GetTrafficByRegionResponse getTrafficByRegion(GetTrafficByRegionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTrafficByRegionWithOptions(request, runtime);
    }

    public GetAllRegionsResponse getAllRegionsWithOptions(GetAllRegionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetAllRegions", "HTTPS", "GET", "2017-04-11", "AK", TeaModel.buildMap(request), null, runtime), new GetAllRegionsResponse());
    }

    public GetAllRegionsResponse getAllRegions(GetAllRegionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAllRegionsWithOptions(request, runtime);
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
}
