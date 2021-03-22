// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20180117;

import com.aliyun.tea.*;
import com.aliyun.waf_openapi20180117.models.*;
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

    public CreateAclRuleResponse createAclRuleWithOptions(CreateAclRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateAclRule", "2018-01-17", "HTTPS", "POST", "AK", "json", req, runtime), new CreateAclRuleResponse());
    }

    public CreateAclRuleResponse createAclRule(CreateAclRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAclRuleWithOptions(request, runtime);
    }

    public CreateCertAndKeyResponse createCertAndKeyWithOptions(CreateCertAndKeyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateCertAndKey", "2018-01-17", "HTTPS", "POST", "AK", "json", req, runtime), new CreateCertAndKeyResponse());
    }

    public CreateCertAndKeyResponse createCertAndKey(CreateCertAndKeyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createCertAndKeyWithOptions(request, runtime);
    }

    public CreateDomainConfigResponse createDomainConfigWithOptions(CreateDomainConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateDomainConfig", "2018-01-17", "HTTPS", "POST", "AK", "json", req, runtime), new CreateDomainConfigResponse());
    }

    public CreateDomainConfigResponse createDomainConfig(CreateDomainConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDomainConfigWithOptions(request, runtime);
    }

    public CreateProtectionModuleRuleResponse createProtectionModuleRuleWithOptions(CreateProtectionModuleRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateProtectionModuleRule", "2018-01-17", "HTTPS", "POST", "AK", "json", req, runtime), new CreateProtectionModuleRuleResponse());
    }

    public CreateProtectionModuleRuleResponse createProtectionModuleRule(CreateProtectionModuleRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createProtectionModuleRuleWithOptions(request, runtime);
    }

    public DeleteAclRuleResponse deleteAclRuleWithOptions(DeleteAclRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteAclRule", "2018-01-17", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteAclRuleResponse());
    }

    public DeleteAclRuleResponse deleteAclRule(DeleteAclRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAclRuleWithOptions(request, runtime);
    }

    public DeleteDomainConfigResponse deleteDomainConfigWithOptions(DeleteDomainConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteDomainConfig", "2018-01-17", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteDomainConfigResponse());
    }

    public DeleteDomainConfigResponse deleteDomainConfig(DeleteDomainConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDomainConfigWithOptions(request, runtime);
    }

    public DescribeAclRulesResponse describeAclRulesWithOptions(DescribeAclRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAclRules", "2018-01-17", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAclRulesResponse());
    }

    public DescribeAclRulesResponse describeAclRules(DescribeAclRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAclRulesWithOptions(request, runtime);
    }

    public DescribeAsyncTaskStatusResponse describeAsyncTaskStatusWithOptions(DescribeAsyncTaskStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAsyncTaskStatus", "2018-01-17", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAsyncTaskStatusResponse());
    }

    public DescribeAsyncTaskStatusResponse describeAsyncTaskStatus(DescribeAsyncTaskStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAsyncTaskStatusWithOptions(request, runtime);
    }

    public DescribeDomainConfigResponse describeDomainConfigWithOptions(DescribeDomainConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDomainConfig", "2018-01-17", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDomainConfigResponse());
    }

    public DescribeDomainConfigResponse describeDomainConfig(DescribeDomainConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainConfigWithOptions(request, runtime);
    }

    public DescribeDomainConfigStatusResponse describeDomainConfigStatusWithOptions(DescribeDomainConfigStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDomainConfigStatus", "2018-01-17", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDomainConfigStatusResponse());
    }

    public DescribeDomainConfigStatusResponse describeDomainConfigStatus(DescribeDomainConfigStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainConfigStatusWithOptions(request, runtime);
    }

    public DescribeDomainNamesResponse describeDomainNamesWithOptions(DescribeDomainNamesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDomainNames", "2018-01-17", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDomainNamesResponse());
    }

    public DescribeDomainNamesResponse describeDomainNames(DescribeDomainNamesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainNamesWithOptions(request, runtime);
    }

    public DescribePayInfoResponse describePayInfoWithOptions(DescribePayInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribePayInfo", "2018-01-17", "HTTPS", "POST", "AK", "json", req, runtime), new DescribePayInfoResponse());
    }

    public DescribePayInfoResponse describePayInfo(DescribePayInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describePayInfoWithOptions(request, runtime);
    }

    public DescribeProtectionModuleRulesResponse describeProtectionModuleRulesWithOptions(DescribeProtectionModuleRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeProtectionModuleRules", "2018-01-17", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeProtectionModuleRulesResponse());
    }

    public DescribeProtectionModuleRulesResponse describeProtectionModuleRules(DescribeProtectionModuleRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeProtectionModuleRulesWithOptions(request, runtime);
    }

    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRegions", "2018-01-17", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRegionsResponse());
    }

    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRegionsWithOptions(request, runtime);
    }

    public DescribeWafSourceIpSegmentResponse describeWafSourceIpSegmentWithOptions(DescribeWafSourceIpSegmentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeWafSourceIpSegment", "2018-01-17", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeWafSourceIpSegmentResponse());
    }

    public DescribeWafSourceIpSegmentResponse describeWafSourceIpSegment(DescribeWafSourceIpSegmentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeWafSourceIpSegmentWithOptions(request, runtime);
    }

    public ModifyAclRuleResponse modifyAclRuleWithOptions(ModifyAclRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyAclRule", "2018-01-17", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyAclRuleResponse());
    }

    public ModifyAclRuleResponse modifyAclRule(ModifyAclRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyAclRuleWithOptions(request, runtime);
    }

    public ModifyDomainConfigResponse modifyDomainConfigWithOptions(ModifyDomainConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDomainConfig", "2018-01-17", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDomainConfigResponse());
    }

    public ModifyDomainConfigResponse modifyDomainConfig(ModifyDomainConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDomainConfigWithOptions(request, runtime);
    }

    public ModifyProtectionRuleCacheStatusResponse modifyProtectionRuleCacheStatusWithOptions(ModifyProtectionRuleCacheStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyProtectionRuleCacheStatus", "2018-01-17", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyProtectionRuleCacheStatusResponse());
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
        return TeaModel.toModel(this.doRPCRequest("ModifyProtectionRuleStatus", "2018-01-17", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyProtectionRuleStatusResponse());
    }

    public ModifyProtectionRuleStatusResponse modifyProtectionRuleStatus(ModifyProtectionRuleStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyProtectionRuleStatusWithOptions(request, runtime);
    }

    public ModifyWafSwitchResponse modifyWafSwitchWithOptions(ModifyWafSwitchRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyWafSwitch", "2018-01-17", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyWafSwitchResponse());
    }

    public ModifyWafSwitchResponse modifyWafSwitch(ModifyWafSwitchRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyWafSwitchWithOptions(request, runtime);
    }
}
