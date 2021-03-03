// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910;

import com.aliyun.tea.*;
import com.aliyun.waf_openapi20190910.models.*;
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
            new TeaPair("cn-qingdao", "wafopenapi.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-beijing", "wafopenapi.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-chengdu", "wafopenapi.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "wafopenapi.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "wafopenapi.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "wafopenapi.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-shanghai", "wafopenapi.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "wafopenapi.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-heyuan", "wafopenapi.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "wafopenapi.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-hongkong", "wafopenapi.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "wafopenapi.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "wafopenapi.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "wafopenapi.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "wafopenapi.ap-southeast-1.aliyuncs.com"),
            new TeaPair("eu-west-1", "wafopenapi.ap-southeast-1.aliyuncs.com"),
            new TeaPair("us-west-1", "wafopenapi.ap-southeast-1.aliyuncs.com"),
            new TeaPair("us-east-1", "wafopenapi.ap-southeast-1.aliyuncs.com"),
            new TeaPair("eu-central-1", "wafopenapi.ap-southeast-1.aliyuncs.com"),
            new TeaPair("me-east-1", "wafopenapi.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-south-1", "wafopenapi.ap-southeast-1.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "wafopenapi.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "wafopenapi.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "wafopenapi.cn-hangzhou.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("waf-openapi", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public CreateCertificateResponse createCertificateWithOptions(CreateCertificateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateCertificate", "2019-09-10", "HTTPS", "POST", "AK", "json", req, runtime), new CreateCertificateResponse());
    }

    public CreateCertificateResponse createCertificate(CreateCertificateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createCertificateWithOptions(request, runtime);
    }

    public CreateCertificateByCertificateIdResponse createCertificateByCertificateIdWithOptions(CreateCertificateByCertificateIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateCertificateByCertificateId", "2019-09-10", "HTTPS", "POST", "AK", "json", req, runtime), new CreateCertificateByCertificateIdResponse());
    }

    public CreateCertificateByCertificateIdResponse createCertificateByCertificateId(CreateCertificateByCertificateIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createCertificateByCertificateIdWithOptions(request, runtime);
    }

    public CreateDomainResponse createDomainWithOptions(CreateDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateDomain", "2019-09-10", "HTTPS", "POST", "AK", "json", req, runtime), new CreateDomainResponse());
    }

    public CreateDomainResponse createDomain(CreateDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDomainWithOptions(request, runtime);
    }

    public CreateProtectionModuleRuleResponse createProtectionModuleRuleWithOptions(CreateProtectionModuleRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateProtectionModuleRule", "2019-09-10", "HTTPS", "POST", "AK", "json", req, runtime), new CreateProtectionModuleRuleResponse());
    }

    public CreateProtectionModuleRuleResponse createProtectionModuleRule(CreateProtectionModuleRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createProtectionModuleRuleWithOptions(request, runtime);
    }

    public DeleteDomainResponse deleteDomainWithOptions(DeleteDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteDomain", "2019-09-10", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteDomainResponse());
    }

    public DeleteDomainResponse deleteDomain(DeleteDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDomainWithOptions(request, runtime);
    }

    public DeleteInstanceResponse deleteInstanceWithOptions(DeleteInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteInstance", "2019-09-10", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteInstanceResponse());
    }

    public DeleteInstanceResponse deleteInstance(DeleteInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteInstanceWithOptions(request, runtime);
    }

    public DeleteProtectionModuleRuleResponse deleteProtectionModuleRuleWithOptions(DeleteProtectionModuleRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteProtectionModuleRule", "2019-09-10", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteProtectionModuleRuleResponse());
    }

    public DeleteProtectionModuleRuleResponse deleteProtectionModuleRule(DeleteProtectionModuleRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteProtectionModuleRuleWithOptions(request, runtime);
    }

    public DescribeCertificatesResponse describeCertificatesWithOptions(DescribeCertificatesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCertificates", "2019-09-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCertificatesResponse());
    }

    public DescribeCertificatesResponse describeCertificates(DescribeCertificatesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCertificatesWithOptions(request, runtime);
    }

    public DescribeCertMatchStatusResponse describeCertMatchStatusWithOptions(DescribeCertMatchStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCertMatchStatus", "2019-09-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCertMatchStatusResponse());
    }

    public DescribeCertMatchStatusResponse describeCertMatchStatus(DescribeCertMatchStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCertMatchStatusWithOptions(request, runtime);
    }

    public DescribeDomainResponse describeDomainWithOptions(DescribeDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDomain", "2019-09-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDomainResponse());
    }

    public DescribeDomainResponse describeDomain(DescribeDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainWithOptions(request, runtime);
    }

    public DescribeDomainAdvanceConfigsResponse describeDomainAdvanceConfigsWithOptions(DescribeDomainAdvanceConfigsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDomainAdvanceConfigs", "2019-09-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDomainAdvanceConfigsResponse());
    }

    public DescribeDomainAdvanceConfigsResponse describeDomainAdvanceConfigs(DescribeDomainAdvanceConfigsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainAdvanceConfigsWithOptions(request, runtime);
    }

    public DescribeDomainBasicConfigsResponse describeDomainBasicConfigsWithOptions(DescribeDomainBasicConfigsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDomainBasicConfigs", "2019-09-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDomainBasicConfigsResponse());
    }

    public DescribeDomainBasicConfigsResponse describeDomainBasicConfigs(DescribeDomainBasicConfigsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainBasicConfigsWithOptions(request, runtime);
    }

    public DescribeDomainListResponse describeDomainListWithOptions(DescribeDomainListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDomainList", "2019-09-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDomainListResponse());
    }

    public DescribeDomainListResponse describeDomainList(DescribeDomainListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainListWithOptions(request, runtime);
    }

    public DescribeDomainNamesResponse describeDomainNamesWithOptions(DescribeDomainNamesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDomainNames", "2019-09-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDomainNamesResponse());
    }

    public DescribeDomainNamesResponse describeDomainNames(DescribeDomainNamesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainNamesWithOptions(request, runtime);
    }

    public DescribeDomainRuleGroupResponse describeDomainRuleGroupWithOptions(DescribeDomainRuleGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDomainRuleGroup", "2019-09-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDomainRuleGroupResponse());
    }

    public DescribeDomainRuleGroupResponse describeDomainRuleGroup(DescribeDomainRuleGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainRuleGroupWithOptions(request, runtime);
    }

    public DescribeInstanceInfoResponse describeInstanceInfoWithOptions(DescribeInstanceInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeInstanceInfo", "2019-09-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeInstanceInfoResponse());
    }

    public DescribeInstanceInfoResponse describeInstanceInfo(DescribeInstanceInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstanceInfoWithOptions(request, runtime);
    }

    public DescribeInstanceInfosResponse describeInstanceInfosWithOptions(DescribeInstanceInfosRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeInstanceInfos", "2019-09-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeInstanceInfosResponse());
    }

    public DescribeInstanceInfosResponse describeInstanceInfos(DescribeInstanceInfosRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstanceInfosWithOptions(request, runtime);
    }

    public DescribeInstanceSpecInfoResponse describeInstanceSpecInfoWithOptions(DescribeInstanceSpecInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeInstanceSpecInfo", "2019-09-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeInstanceSpecInfoResponse());
    }

    public DescribeInstanceSpecInfoResponse describeInstanceSpecInfo(DescribeInstanceSpecInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstanceSpecInfoWithOptions(request, runtime);
    }

    public DescribeLogServiceStatusResponse describeLogServiceStatusWithOptions(DescribeLogServiceStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLogServiceStatus", "2019-09-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeLogServiceStatusResponse());
    }

    public DescribeLogServiceStatusResponse describeLogServiceStatus(DescribeLogServiceStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLogServiceStatusWithOptions(request, runtime);
    }

    public DescribeProtectionModuleCodeConfigResponse describeProtectionModuleCodeConfigWithOptions(DescribeProtectionModuleCodeConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeProtectionModuleCodeConfig", "2019-09-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeProtectionModuleCodeConfigResponse());
    }

    public DescribeProtectionModuleCodeConfigResponse describeProtectionModuleCodeConfig(DescribeProtectionModuleCodeConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeProtectionModuleCodeConfigWithOptions(request, runtime);
    }

    public DescribeProtectionModuleModeResponse describeProtectionModuleModeWithOptions(DescribeProtectionModuleModeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeProtectionModuleMode", "2019-09-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeProtectionModuleModeResponse());
    }

    public DescribeProtectionModuleModeResponse describeProtectionModuleMode(DescribeProtectionModuleModeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeProtectionModuleModeWithOptions(request, runtime);
    }

    public DescribeProtectionModuleRulesResponse describeProtectionModuleRulesWithOptions(DescribeProtectionModuleRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeProtectionModuleRules", "2019-09-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeProtectionModuleRulesResponse());
    }

    public DescribeProtectionModuleRulesResponse describeProtectionModuleRules(DescribeProtectionModuleRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeProtectionModuleRulesWithOptions(request, runtime);
    }

    public DescribeProtectionModuleStatusResponse describeProtectionModuleStatusWithOptions(DescribeProtectionModuleStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeProtectionModuleStatus", "2019-09-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeProtectionModuleStatusResponse());
    }

    public DescribeProtectionModuleStatusResponse describeProtectionModuleStatus(DescribeProtectionModuleStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeProtectionModuleStatusWithOptions(request, runtime);
    }

    public DescribeWafSourceIpSegmentResponse describeWafSourceIpSegmentWithOptions(DescribeWafSourceIpSegmentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeWafSourceIpSegment", "2019-09-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeWafSourceIpSegmentResponse());
    }

    public DescribeWafSourceIpSegmentResponse describeWafSourceIpSegment(DescribeWafSourceIpSegmentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeWafSourceIpSegmentWithOptions(request, runtime);
    }

    public ModifyDomainResponse modifyDomainWithOptions(ModifyDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDomain", "2019-09-10", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDomainResponse());
    }

    public ModifyDomainResponse modifyDomain(ModifyDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDomainWithOptions(request, runtime);
    }

    public ModifyDomainIpv6StatusResponse modifyDomainIpv6StatusWithOptions(ModifyDomainIpv6StatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDomainIpv6Status", "2019-09-10", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDomainIpv6StatusResponse());
    }

    public ModifyDomainIpv6StatusResponse modifyDomainIpv6Status(ModifyDomainIpv6StatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDomainIpv6StatusWithOptions(request, runtime);
    }

    public ModifyLogRetrievalStatusResponse modifyLogRetrievalStatusWithOptions(ModifyLogRetrievalStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyLogRetrievalStatus", "2019-09-10", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyLogRetrievalStatusResponse());
    }

    public ModifyLogRetrievalStatusResponse modifyLogRetrievalStatus(ModifyLogRetrievalStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyLogRetrievalStatusWithOptions(request, runtime);
    }

    public ModifyLogServiceStatusResponse modifyLogServiceStatusWithOptions(ModifyLogServiceStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyLogServiceStatus", "2019-09-10", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyLogServiceStatusResponse());
    }

    public ModifyLogServiceStatusResponse modifyLogServiceStatus(ModifyLogServiceStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyLogServiceStatusWithOptions(request, runtime);
    }

    public ModifyProtectionModuleModeResponse modifyProtectionModuleModeWithOptions(ModifyProtectionModuleModeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyProtectionModuleMode", "2019-09-10", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyProtectionModuleModeResponse());
    }

    public ModifyProtectionModuleModeResponse modifyProtectionModuleMode(ModifyProtectionModuleModeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyProtectionModuleModeWithOptions(request, runtime);
    }

    public ModifyProtectionModuleRuleResponse modifyProtectionModuleRuleWithOptions(ModifyProtectionModuleRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyProtectionModuleRule", "2019-09-10", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyProtectionModuleRuleResponse());
    }

    public ModifyProtectionModuleRuleResponse modifyProtectionModuleRule(ModifyProtectionModuleRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyProtectionModuleRuleWithOptions(request, runtime);
    }

    public ModifyProtectionModuleStatusResponse modifyProtectionModuleStatusWithOptions(ModifyProtectionModuleStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyProtectionModuleStatus", "2019-09-10", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyProtectionModuleStatusResponse());
    }

    public ModifyProtectionModuleStatusResponse modifyProtectionModuleStatus(ModifyProtectionModuleStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyProtectionModuleStatusWithOptions(request, runtime);
    }

    public ModifyProtectionRuleCacheStatusResponse modifyProtectionRuleCacheStatusWithOptions(ModifyProtectionRuleCacheStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyProtectionRuleCacheStatus", "2019-09-10", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyProtectionRuleCacheStatusResponse());
    }

    public ModifyProtectionRuleCacheStatusResponse modifyProtectionRuleCacheStatus(ModifyProtectionRuleCacheStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyProtectionRuleCacheStatusWithOptions(request, runtime);
    }

    public ModifyProtectionRuleStatusResponse modifyProtectionRuleStatusWithOptions(ModifyProtectionRuleStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyProtectionRuleStatus", "2019-09-10", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyProtectionRuleStatusResponse());
    }

    public ModifyProtectionRuleStatusResponse modifyProtectionRuleStatus(ModifyProtectionRuleStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyProtectionRuleStatusWithOptions(request, runtime);
    }

    public SetDomainRuleGroupResponse setDomainRuleGroupWithOptions(SetDomainRuleGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetDomainRuleGroup", "2019-09-10", "HTTPS", "POST", "AK", "json", req, runtime), new SetDomainRuleGroupResponse());
    }

    public SetDomainRuleGroupResponse setDomainRuleGroup(SetDomainRuleGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setDomainRuleGroupWithOptions(request, runtime);
    }
}
