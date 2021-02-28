// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115;

import com.aliyun.tea.*;
import com.aliyun.scdn20171115.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("ap-northeast-1", "scdn.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "scdn.aliyuncs.com"),
            new TeaPair("ap-south-1", "scdn.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "scdn.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "scdn.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "scdn.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "scdn.aliyuncs.com"),
            new TeaPair("cn-beijing", "scdn.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "scdn.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "scdn.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "scdn.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "scdn.aliyuncs.com"),
            new TeaPair("cn-chengdu", "scdn.aliyuncs.com"),
            new TeaPair("cn-edge-1", "scdn.aliyuncs.com"),
            new TeaPair("cn-fujian", "scdn.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "scdn.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "scdn.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "scdn.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "scdn.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "scdn.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "scdn.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "scdn.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "scdn.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "scdn.aliyuncs.com"),
            new TeaPair("cn-hongkong", "scdn.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "scdn.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "scdn.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "scdn.aliyuncs.com"),
            new TeaPair("cn-qingdao", "scdn.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "scdn.aliyuncs.com"),
            new TeaPair("cn-shanghai", "scdn.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "scdn.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "scdn.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "scdn.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "scdn.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "scdn.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "scdn.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "scdn.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "scdn.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "scdn.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "scdn.aliyuncs.com"),
            new TeaPair("cn-wuhan", "scdn.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "scdn.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "scdn.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "scdn.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "scdn.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "scdn.aliyuncs.com"),
            new TeaPair("eu-central-1", "scdn.aliyuncs.com"),
            new TeaPair("eu-west-1", "scdn.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "scdn.aliyuncs.com"),
            new TeaPair("me-east-1", "scdn.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "scdn.aliyuncs.com"),
            new TeaPair("us-east-1", "scdn.aliyuncs.com"),
            new TeaPair("us-west-1", "scdn.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("scdn", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AddScdnDomainResponse addScdnDomainWithOptions(AddScdnDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddScdnDomain", "2017-11-15", "HTTPS", "POST", "AK", "json", req, runtime), new AddScdnDomainResponse());
    }

    public AddScdnDomainResponse addScdnDomain(AddScdnDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addScdnDomainWithOptions(request, runtime);
    }

    public BatchDeleteScdnDomainConfigsResponse batchDeleteScdnDomainConfigsWithOptions(BatchDeleteScdnDomainConfigsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BatchDeleteScdnDomainConfigs", "2017-11-15", "HTTPS", "POST", "AK", "json", req, runtime), new BatchDeleteScdnDomainConfigsResponse());
    }

    public BatchDeleteScdnDomainConfigsResponse batchDeleteScdnDomainConfigs(BatchDeleteScdnDomainConfigsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchDeleteScdnDomainConfigsWithOptions(request, runtime);
    }

    public BatchSetScdnDomainConfigsResponse batchSetScdnDomainConfigsWithOptions(BatchSetScdnDomainConfigsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BatchSetScdnDomainConfigs", "2017-11-15", "HTTPS", "POST", "AK", "json", req, runtime), new BatchSetScdnDomainConfigsResponse());
    }

    public BatchSetScdnDomainConfigsResponse batchSetScdnDomainConfigs(BatchSetScdnDomainConfigsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchSetScdnDomainConfigsWithOptions(request, runtime);
    }

    public BatchUpdateScdnDomainResponse batchUpdateScdnDomainWithOptions(BatchUpdateScdnDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BatchUpdateScdnDomain", "2017-11-15", "HTTPS", "POST", "AK", "json", req, runtime), new BatchUpdateScdnDomainResponse());
    }

    public BatchUpdateScdnDomainResponse batchUpdateScdnDomain(BatchUpdateScdnDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchUpdateScdnDomainWithOptions(request, runtime);
    }

    public CheckScdnServiceResponse checkScdnServiceWithOptions(CheckScdnServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CheckScdnService", "2017-11-15", "HTTPS", "POST", "AK", "json", req, runtime), new CheckScdnServiceResponse());
    }

    public CheckScdnServiceResponse checkScdnService(CheckScdnServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkScdnServiceWithOptions(request, runtime);
    }

    public DeleteScdnDomainResponse deleteScdnDomainWithOptions(DeleteScdnDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteScdnDomain", "2017-11-15", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteScdnDomainResponse());
    }

    public DeleteScdnDomainResponse deleteScdnDomain(DeleteScdnDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteScdnDomainWithOptions(request, runtime);
    }

    public DeleteScdnSpecificConfigResponse deleteScdnSpecificConfigWithOptions(DeleteScdnSpecificConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteScdnSpecificConfig", "2017-11-15", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteScdnSpecificConfigResponse());
    }

    public DeleteScdnSpecificConfigResponse deleteScdnSpecificConfig(DeleteScdnSpecificConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteScdnSpecificConfigWithOptions(request, runtime);
    }

    public DescribeScdnCcQpsInfoResponse describeScdnCcQpsInfoWithOptions(DescribeScdnCcQpsInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeScdnCcQpsInfo", "2017-11-15", "HTTPS", "GET", "AK", "json", req, runtime), new DescribeScdnCcQpsInfoResponse());
    }

    public DescribeScdnCcQpsInfoResponse describeScdnCcQpsInfo(DescribeScdnCcQpsInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeScdnCcQpsInfoWithOptions(request, runtime);
    }

    public DescribeScdnCcTopIpResponse describeScdnCcTopIpWithOptions(DescribeScdnCcTopIpRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeScdnCcTopIp", "2017-11-15", "HTTPS", "GET", "AK", "json", req, runtime), new DescribeScdnCcTopIpResponse());
    }

    public DescribeScdnCcTopIpResponse describeScdnCcTopIp(DescribeScdnCcTopIpRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeScdnCcTopIpWithOptions(request, runtime);
    }

    public DescribeScdnCcTopUrlResponse describeScdnCcTopUrlWithOptions(DescribeScdnCcTopUrlRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeScdnCcTopUrl", "2017-11-15", "HTTPS", "GET", "AK", "json", req, runtime), new DescribeScdnCcTopUrlResponse());
    }

    public DescribeScdnCcTopUrlResponse describeScdnCcTopUrl(DescribeScdnCcTopUrlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeScdnCcTopUrlWithOptions(request, runtime);
    }

    public DescribeScdnCertificateDetailResponse describeScdnCertificateDetailWithOptions(DescribeScdnCertificateDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeScdnCertificateDetail", "2017-11-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeScdnCertificateDetailResponse());
    }

    public DescribeScdnCertificateDetailResponse describeScdnCertificateDetail(DescribeScdnCertificateDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeScdnCertificateDetailWithOptions(request, runtime);
    }

    public DescribeScdnCertificateListResponse describeScdnCertificateListWithOptions(DescribeScdnCertificateListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeScdnCertificateList", "2017-11-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeScdnCertificateListResponse());
    }

    public DescribeScdnCertificateListResponse describeScdnCertificateList(DescribeScdnCertificateListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeScdnCertificateListWithOptions(request, runtime);
    }

    public DescribeScdnDDoSInfoResponse describeScdnDDoSInfoWithOptions(DescribeScdnDDoSInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeScdnDDoSInfo", "2017-11-15", "HTTPS", "GET", "AK", "json", req, runtime), new DescribeScdnDDoSInfoResponse());
    }

    public DescribeScdnDDoSInfoResponse describeScdnDDoSInfo(DescribeScdnDDoSInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeScdnDDoSInfoWithOptions(request, runtime);
    }

    public DescribeScdnDDoSTrafficInfoResponse describeScdnDDoSTrafficInfoWithOptions(DescribeScdnDDoSTrafficInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeScdnDDoSTrafficInfo", "2017-11-15", "HTTPS", "GET", "AK", "json", req, runtime), new DescribeScdnDDoSTrafficInfoResponse());
    }

    public DescribeScdnDDoSTrafficInfoResponse describeScdnDDoSTrafficInfo(DescribeScdnDDoSTrafficInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeScdnDDoSTrafficInfoWithOptions(request, runtime);
    }

    public DescribeScdnDomainBpsDataResponse describeScdnDomainBpsDataWithOptions(DescribeScdnDomainBpsDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeScdnDomainBpsData", "2017-11-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeScdnDomainBpsDataResponse());
    }

    public DescribeScdnDomainBpsDataResponse describeScdnDomainBpsData(DescribeScdnDomainBpsDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeScdnDomainBpsDataWithOptions(request, runtime);
    }

    public DescribeScdnDomainCertificateInfoResponse describeScdnDomainCertificateInfoWithOptions(DescribeScdnDomainCertificateInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeScdnDomainCertificateInfo", "2017-11-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeScdnDomainCertificateInfoResponse());
    }

    public DescribeScdnDomainCertificateInfoResponse describeScdnDomainCertificateInfo(DescribeScdnDomainCertificateInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeScdnDomainCertificateInfoWithOptions(request, runtime);
    }

    public DescribeScdnDomainCnameResponse describeScdnDomainCnameWithOptions(DescribeScdnDomainCnameRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeScdnDomainCname", "2017-11-15", "HTTPS", "GET", "AK", "json", req, runtime), new DescribeScdnDomainCnameResponse());
    }

    public DescribeScdnDomainCnameResponse describeScdnDomainCname(DescribeScdnDomainCnameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeScdnDomainCnameWithOptions(request, runtime);
    }

    public DescribeScdnDomainConfigsResponse describeScdnDomainConfigsWithOptions(DescribeScdnDomainConfigsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeScdnDomainConfigs", "2017-11-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeScdnDomainConfigsResponse());
    }

    public DescribeScdnDomainConfigsResponse describeScdnDomainConfigs(DescribeScdnDomainConfigsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeScdnDomainConfigsWithOptions(request, runtime);
    }

    public DescribeScdnDomainDetailResponse describeScdnDomainDetailWithOptions(DescribeScdnDomainDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeScdnDomainDetail", "2017-11-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeScdnDomainDetailResponse());
    }

    public DescribeScdnDomainDetailResponse describeScdnDomainDetail(DescribeScdnDomainDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeScdnDomainDetailWithOptions(request, runtime);
    }

    public DescribeScdnDomainHitRateDataResponse describeScdnDomainHitRateDataWithOptions(DescribeScdnDomainHitRateDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeScdnDomainHitRateData", "2017-11-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeScdnDomainHitRateDataResponse());
    }

    public DescribeScdnDomainHitRateDataResponse describeScdnDomainHitRateData(DescribeScdnDomainHitRateDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeScdnDomainHitRateDataWithOptions(request, runtime);
    }

    public DescribeScdnDomainHttpCodeDataResponse describeScdnDomainHttpCodeDataWithOptions(DescribeScdnDomainHttpCodeDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeScdnDomainHttpCodeData", "2017-11-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeScdnDomainHttpCodeDataResponse());
    }

    public DescribeScdnDomainHttpCodeDataResponse describeScdnDomainHttpCodeData(DescribeScdnDomainHttpCodeDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeScdnDomainHttpCodeDataWithOptions(request, runtime);
    }

    public DescribeScdnDomainIspDataResponse describeScdnDomainIspDataWithOptions(DescribeScdnDomainIspDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeScdnDomainIspData", "2017-11-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeScdnDomainIspDataResponse());
    }

    public DescribeScdnDomainIspDataResponse describeScdnDomainIspData(DescribeScdnDomainIspDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeScdnDomainIspDataWithOptions(request, runtime);
    }

    public DescribeScdnDomainLogResponse describeScdnDomainLogWithOptions(DescribeScdnDomainLogRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeScdnDomainLog", "2017-11-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeScdnDomainLogResponse());
    }

    public DescribeScdnDomainLogResponse describeScdnDomainLog(DescribeScdnDomainLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeScdnDomainLogWithOptions(request, runtime);
    }

    public DescribeScdnDomainOriginBpsDataResponse describeScdnDomainOriginBpsDataWithOptions(DescribeScdnDomainOriginBpsDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeScdnDomainOriginBpsData", "2017-11-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeScdnDomainOriginBpsDataResponse());
    }

    public DescribeScdnDomainOriginBpsDataResponse describeScdnDomainOriginBpsData(DescribeScdnDomainOriginBpsDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeScdnDomainOriginBpsDataWithOptions(request, runtime);
    }

    public DescribeScdnDomainOriginTrafficDataResponse describeScdnDomainOriginTrafficDataWithOptions(DescribeScdnDomainOriginTrafficDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeScdnDomainOriginTrafficData", "2017-11-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeScdnDomainOriginTrafficDataResponse());
    }

    public DescribeScdnDomainOriginTrafficDataResponse describeScdnDomainOriginTrafficData(DescribeScdnDomainOriginTrafficDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeScdnDomainOriginTrafficDataWithOptions(request, runtime);
    }

    public DescribeScdnDomainPvDataResponse describeScdnDomainPvDataWithOptions(DescribeScdnDomainPvDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeScdnDomainPvData", "2017-11-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeScdnDomainPvDataResponse());
    }

    public DescribeScdnDomainPvDataResponse describeScdnDomainPvData(DescribeScdnDomainPvDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeScdnDomainPvDataWithOptions(request, runtime);
    }

    public DescribeScdnDomainQpsDataResponse describeScdnDomainQpsDataWithOptions(DescribeScdnDomainQpsDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeScdnDomainQpsData", "2017-11-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeScdnDomainQpsDataResponse());
    }

    public DescribeScdnDomainQpsDataResponse describeScdnDomainQpsData(DescribeScdnDomainQpsDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeScdnDomainQpsDataWithOptions(request, runtime);
    }

    public DescribeScdnDomainRealTimeBpsDataResponse describeScdnDomainRealTimeBpsDataWithOptions(DescribeScdnDomainRealTimeBpsDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeScdnDomainRealTimeBpsData", "2017-11-15", "HTTPS", "GET", "AK", "json", req, runtime), new DescribeScdnDomainRealTimeBpsDataResponse());
    }

    public DescribeScdnDomainRealTimeBpsDataResponse describeScdnDomainRealTimeBpsData(DescribeScdnDomainRealTimeBpsDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeScdnDomainRealTimeBpsDataWithOptions(request, runtime);
    }

    public DescribeScdnDomainRealTimeByteHitRateDataResponse describeScdnDomainRealTimeByteHitRateDataWithOptions(DescribeScdnDomainRealTimeByteHitRateDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeScdnDomainRealTimeByteHitRateData", "2017-11-15", "HTTPS", "GET", "AK", "json", req, runtime), new DescribeScdnDomainRealTimeByteHitRateDataResponse());
    }

    public DescribeScdnDomainRealTimeByteHitRateDataResponse describeScdnDomainRealTimeByteHitRateData(DescribeScdnDomainRealTimeByteHitRateDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeScdnDomainRealTimeByteHitRateDataWithOptions(request, runtime);
    }

    public DescribeScdnDomainRealTimeHttpCodeDataResponse describeScdnDomainRealTimeHttpCodeDataWithOptions(DescribeScdnDomainRealTimeHttpCodeDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeScdnDomainRealTimeHttpCodeData", "2017-11-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeScdnDomainRealTimeHttpCodeDataResponse());
    }

    public DescribeScdnDomainRealTimeHttpCodeDataResponse describeScdnDomainRealTimeHttpCodeData(DescribeScdnDomainRealTimeHttpCodeDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeScdnDomainRealTimeHttpCodeDataWithOptions(request, runtime);
    }

    public DescribeScdnDomainRealTimeQpsDataResponse describeScdnDomainRealTimeQpsDataWithOptions(DescribeScdnDomainRealTimeQpsDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeScdnDomainRealTimeQpsData", "2017-11-15", "HTTPS", "GET", "AK", "json", req, runtime), new DescribeScdnDomainRealTimeQpsDataResponse());
    }

    public DescribeScdnDomainRealTimeQpsDataResponse describeScdnDomainRealTimeQpsData(DescribeScdnDomainRealTimeQpsDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeScdnDomainRealTimeQpsDataWithOptions(request, runtime);
    }

    public DescribeScdnDomainRealTimeReqHitRateDataResponse describeScdnDomainRealTimeReqHitRateDataWithOptions(DescribeScdnDomainRealTimeReqHitRateDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeScdnDomainRealTimeReqHitRateData", "2017-11-15", "HTTPS", "GET", "AK", "json", req, runtime), new DescribeScdnDomainRealTimeReqHitRateDataResponse());
    }

    public DescribeScdnDomainRealTimeReqHitRateDataResponse describeScdnDomainRealTimeReqHitRateData(DescribeScdnDomainRealTimeReqHitRateDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeScdnDomainRealTimeReqHitRateDataWithOptions(request, runtime);
    }

    public DescribeScdnDomainRealTimeSrcBpsDataResponse describeScdnDomainRealTimeSrcBpsDataWithOptions(DescribeScdnDomainRealTimeSrcBpsDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeScdnDomainRealTimeSrcBpsData", "2017-11-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeScdnDomainRealTimeSrcBpsDataResponse());
    }

    public DescribeScdnDomainRealTimeSrcBpsDataResponse describeScdnDomainRealTimeSrcBpsData(DescribeScdnDomainRealTimeSrcBpsDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeScdnDomainRealTimeSrcBpsDataWithOptions(request, runtime);
    }

    public DescribeScdnDomainRealTimeSrcTrafficDataResponse describeScdnDomainRealTimeSrcTrafficDataWithOptions(DescribeScdnDomainRealTimeSrcTrafficDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeScdnDomainRealTimeSrcTrafficData", "2017-11-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeScdnDomainRealTimeSrcTrafficDataResponse());
    }

    public DescribeScdnDomainRealTimeSrcTrafficDataResponse describeScdnDomainRealTimeSrcTrafficData(DescribeScdnDomainRealTimeSrcTrafficDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeScdnDomainRealTimeSrcTrafficDataWithOptions(request, runtime);
    }

    public DescribeScdnDomainRealTimeTrafficDataResponse describeScdnDomainRealTimeTrafficDataWithOptions(DescribeScdnDomainRealTimeTrafficDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeScdnDomainRealTimeTrafficData", "2017-11-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeScdnDomainRealTimeTrafficDataResponse());
    }

    public DescribeScdnDomainRealTimeTrafficDataResponse describeScdnDomainRealTimeTrafficData(DescribeScdnDomainRealTimeTrafficDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeScdnDomainRealTimeTrafficDataWithOptions(request, runtime);
    }

    public DescribeScdnDomainRegionDataResponse describeScdnDomainRegionDataWithOptions(DescribeScdnDomainRegionDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeScdnDomainRegionData", "2017-11-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeScdnDomainRegionDataResponse());
    }

    public DescribeScdnDomainRegionDataResponse describeScdnDomainRegionData(DescribeScdnDomainRegionDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeScdnDomainRegionDataWithOptions(request, runtime);
    }

    public DescribeScdnDomainTopReferVisitResponse describeScdnDomainTopReferVisitWithOptions(DescribeScdnDomainTopReferVisitRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeScdnDomainTopReferVisit", "2017-11-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeScdnDomainTopReferVisitResponse());
    }

    public DescribeScdnDomainTopReferVisitResponse describeScdnDomainTopReferVisit(DescribeScdnDomainTopReferVisitRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeScdnDomainTopReferVisitWithOptions(request, runtime);
    }

    public DescribeScdnDomainTopUrlVisitResponse describeScdnDomainTopUrlVisitWithOptions(DescribeScdnDomainTopUrlVisitRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeScdnDomainTopUrlVisit", "2017-11-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeScdnDomainTopUrlVisitResponse());
    }

    public DescribeScdnDomainTopUrlVisitResponse describeScdnDomainTopUrlVisit(DescribeScdnDomainTopUrlVisitRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeScdnDomainTopUrlVisitWithOptions(request, runtime);
    }

    public DescribeScdnDomainTrafficDataResponse describeScdnDomainTrafficDataWithOptions(DescribeScdnDomainTrafficDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeScdnDomainTrafficData", "2017-11-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeScdnDomainTrafficDataResponse());
    }

    public DescribeScdnDomainTrafficDataResponse describeScdnDomainTrafficData(DescribeScdnDomainTrafficDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeScdnDomainTrafficDataWithOptions(request, runtime);
    }

    public DescribeScdnDomainUvDataResponse describeScdnDomainUvDataWithOptions(DescribeScdnDomainUvDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeScdnDomainUvData", "2017-11-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeScdnDomainUvDataResponse());
    }

    public DescribeScdnDomainUvDataResponse describeScdnDomainUvData(DescribeScdnDomainUvDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeScdnDomainUvDataWithOptions(request, runtime);
    }

    public DescribeScdnRefreshQuotaResponse describeScdnRefreshQuotaWithOptions(DescribeScdnRefreshQuotaRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeScdnRefreshQuota", "2017-11-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeScdnRefreshQuotaResponse());
    }

    public DescribeScdnRefreshQuotaResponse describeScdnRefreshQuota(DescribeScdnRefreshQuotaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeScdnRefreshQuotaWithOptions(request, runtime);
    }

    public DescribeScdnRefreshTasksResponse describeScdnRefreshTasksWithOptions(DescribeScdnRefreshTasksRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeScdnRefreshTasks", "2017-11-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeScdnRefreshTasksResponse());
    }

    public DescribeScdnRefreshTasksResponse describeScdnRefreshTasks(DescribeScdnRefreshTasksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeScdnRefreshTasksWithOptions(request, runtime);
    }

    public DescribeScdnServiceResponse describeScdnServiceWithOptions(DescribeScdnServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeScdnService", "2017-11-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeScdnServiceResponse());
    }

    public DescribeScdnServiceResponse describeScdnService(DescribeScdnServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeScdnServiceWithOptions(request, runtime);
    }

    public DescribeScdnTopDomainsByFlowResponse describeScdnTopDomainsByFlowWithOptions(DescribeScdnTopDomainsByFlowRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeScdnTopDomainsByFlow", "2017-11-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeScdnTopDomainsByFlowResponse());
    }

    public DescribeScdnTopDomainsByFlowResponse describeScdnTopDomainsByFlow(DescribeScdnTopDomainsByFlowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeScdnTopDomainsByFlowWithOptions(request, runtime);
    }

    public DescribeScdnUserDomainsResponse describeScdnUserDomainsWithOptions(DescribeScdnUserDomainsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeScdnUserDomains", "2017-11-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeScdnUserDomainsResponse());
    }

    public DescribeScdnUserDomainsResponse describeScdnUserDomains(DescribeScdnUserDomainsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeScdnUserDomainsWithOptions(request, runtime);
    }

    public DescribeScdnUserProtectInfoResponse describeScdnUserProtectInfoWithOptions(DescribeScdnUserProtectInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeScdnUserProtectInfo", "2017-11-15", "HTTPS", "GET", "AK", "json", req, runtime), new DescribeScdnUserProtectInfoResponse());
    }

    public DescribeScdnUserProtectInfoResponse describeScdnUserProtectInfo(DescribeScdnUserProtectInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeScdnUserProtectInfoWithOptions(request, runtime);
    }

    public DescribeScdnUserQuotaResponse describeScdnUserQuotaWithOptions(DescribeScdnUserQuotaRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeScdnUserQuota", "2017-11-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeScdnUserQuotaResponse());
    }

    public DescribeScdnUserQuotaResponse describeScdnUserQuota(DescribeScdnUserQuotaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeScdnUserQuotaWithOptions(request, runtime);
    }

    public OpenScdnServiceResponse openScdnServiceWithOptions(OpenScdnServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("OpenScdnService", "2017-11-15", "HTTPS", "POST", "AK", "json", req, runtime), new OpenScdnServiceResponse());
    }

    public OpenScdnServiceResponse openScdnService(OpenScdnServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.openScdnServiceWithOptions(request, runtime);
    }

    public PreloadScdnObjectCachesResponse preloadScdnObjectCachesWithOptions(PreloadScdnObjectCachesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PreloadScdnObjectCaches", "2017-11-15", "HTTPS", "POST", "AK", "json", req, runtime), new PreloadScdnObjectCachesResponse());
    }

    public PreloadScdnObjectCachesResponse preloadScdnObjectCaches(PreloadScdnObjectCachesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.preloadScdnObjectCachesWithOptions(request, runtime);
    }

    public RefreshScdnObjectCachesResponse refreshScdnObjectCachesWithOptions(RefreshScdnObjectCachesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RefreshScdnObjectCaches", "2017-11-15", "HTTPS", "POST", "AK", "json", req, runtime), new RefreshScdnObjectCachesResponse());
    }

    public RefreshScdnObjectCachesResponse refreshScdnObjectCaches(RefreshScdnObjectCachesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.refreshScdnObjectCachesWithOptions(request, runtime);
    }

    public SetScdnBotInfoResponse setScdnBotInfoWithOptions(SetScdnBotInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("SetScdnBotInfo", "2017-11-15", "HTTPS", "GET", "AK", "json", req, runtime), new SetScdnBotInfoResponse());
    }

    public SetScdnBotInfoResponse setScdnBotInfo(SetScdnBotInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setScdnBotInfoWithOptions(request, runtime);
    }

    public SetScdnCcInfoResponse setScdnCcInfoWithOptions(SetScdnCcInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("SetScdnCcInfo", "2017-11-15", "HTTPS", "GET", "AK", "json", req, runtime), new SetScdnCcInfoResponse());
    }

    public SetScdnCcInfoResponse setScdnCcInfo(SetScdnCcInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setScdnCcInfoWithOptions(request, runtime);
    }

    public SetScdnDDoSInfoResponse setScdnDDoSInfoWithOptions(SetScdnDDoSInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("SetScdnDDoSInfo", "2017-11-15", "HTTPS", "GET", "AK", "json", req, runtime), new SetScdnDDoSInfoResponse());
    }

    public SetScdnDDoSInfoResponse setScdnDDoSInfo(SetScdnDDoSInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setScdnDDoSInfoWithOptions(request, runtime);
    }

    public SetScdnDomainBizInfoResponse setScdnDomainBizInfoWithOptions(SetScdnDomainBizInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("SetScdnDomainBizInfo", "2017-11-15", "HTTPS", "GET", "AK", "json", req, runtime), new SetScdnDomainBizInfoResponse());
    }

    public SetScdnDomainBizInfoResponse setScdnDomainBizInfo(SetScdnDomainBizInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setScdnDomainBizInfoWithOptions(request, runtime);
    }

    public SetScdnDomainCertificateResponse setScdnDomainCertificateWithOptions(SetScdnDomainCertificateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetScdnDomainCertificate", "2017-11-15", "HTTPS", "POST", "AK", "json", req, runtime), new SetScdnDomainCertificateResponse());
    }

    public SetScdnDomainCertificateResponse setScdnDomainCertificate(SetScdnDomainCertificateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setScdnDomainCertificateWithOptions(request, runtime);
    }

    public StartScdnDomainResponse startScdnDomainWithOptions(StartScdnDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StartScdnDomain", "2017-11-15", "HTTPS", "POST", "AK", "json", req, runtime), new StartScdnDomainResponse());
    }

    public StartScdnDomainResponse startScdnDomain(StartScdnDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startScdnDomainWithOptions(request, runtime);
    }

    public StopScdnDomainResponse stopScdnDomainWithOptions(StopScdnDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StopScdnDomain", "2017-11-15", "HTTPS", "POST", "AK", "json", req, runtime), new StopScdnDomainResponse());
    }

    public StopScdnDomainResponse stopScdnDomain(StopScdnDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopScdnDomainWithOptions(request, runtime);
    }

    public UpdateScdnDomainResponse updateScdnDomainWithOptions(UpdateScdnDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateScdnDomain", "2017-11-15", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateScdnDomainResponse());
    }

    public UpdateScdnDomainResponse updateScdnDomain(UpdateScdnDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateScdnDomainWithOptions(request, runtime);
    }
}
