// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910;

import com.aliyun.tea.*;
import com.aliyun.waf_openapi20190910.models.*;
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
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Certificate", request.certificate);
        query.put("CertificateName", request.certificateName);
        query.put("Domain", request.domain);
        query.put("InstanceId", request.instanceId);
        query.put("PrivateKey", request.privateKey);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCertificate"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCertificateResponse());
    }

    public CreateCertificateResponse createCertificate(CreateCertificateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createCertificateWithOptions(request, runtime);
    }

    public CreateCertificateByCertificateIdResponse createCertificateByCertificateIdWithOptions(CreateCertificateByCertificateIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CertificateId", request.certificateId);
        query.put("Domain", request.domain);
        query.put("InstanceId", request.instanceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCertificateByCertificateId"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCertificateByCertificateIdResponse());
    }

    public CreateCertificateByCertificateIdResponse createCertificateByCertificateId(CreateCertificateByCertificateIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createCertificateByCertificateIdWithOptions(request, runtime);
    }

    public CreateDomainResponse createDomainWithOptions(CreateDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccessHeaderMode", request.accessHeaderMode);
        query.put("AccessHeaders", request.accessHeaders);
        query.put("AccessType", request.accessType);
        query.put("CloudNativeInstances", request.cloudNativeInstances);
        query.put("ClusterType", request.clusterType);
        query.put("ConnectionTime", request.connectionTime);
        query.put("Domain", request.domain);
        query.put("Http2Port", request.http2Port);
        query.put("HttpPort", request.httpPort);
        query.put("HttpToUserIp", request.httpToUserIp);
        query.put("HttpsPort", request.httpsPort);
        query.put("HttpsRedirect", request.httpsRedirect);
        query.put("InstanceId", request.instanceId);
        query.put("IpFollowStatus", request.ipFollowStatus);
        query.put("IsAccessProduct", request.isAccessProduct);
        query.put("LoadBalancing", request.loadBalancing);
        query.put("LogHeaders", request.logHeaders);
        query.put("ReadTime", request.readTime);
        query.put("ResourceGroupId", request.resourceGroupId);
        query.put("SniHost", request.sniHost);
        query.put("SniStatus", request.sniStatus);
        query.put("SourceIps", request.sourceIps);
        query.put("WriteTime", request.writeTime);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDomain"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDomainResponse());
    }

    public CreateDomainResponse createDomain(CreateDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDomainWithOptions(request, runtime);
    }

    public CreateProtectionModuleRuleResponse createProtectionModuleRuleWithOptions(CreateProtectionModuleRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DefenseType", request.defenseType);
        query.put("Domain", request.domain);
        query.put("InstanceId", request.instanceId);
        query.put("Rule", request.rule);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateProtectionModuleRule"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateProtectionModuleRuleResponse());
    }

    public CreateProtectionModuleRuleResponse createProtectionModuleRule(CreateProtectionModuleRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createProtectionModuleRuleWithOptions(request, runtime);
    }

    public DeleteDomainResponse deleteDomainWithOptions(DeleteDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Domain", request.domain);
        query.put("InstanceId", request.instanceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDomain"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDomainResponse());
    }

    public DeleteDomainResponse deleteDomain(DeleteDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDomainWithOptions(request, runtime);
    }

    public DeleteInstanceResponse deleteInstanceWithOptions(DeleteInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("InstanceId", request.instanceId);
        query.put("ResourceGroupId", request.resourceGroupId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteInstance"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteInstanceResponse());
    }

    public DeleteInstanceResponse deleteInstance(DeleteInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteInstanceWithOptions(request, runtime);
    }

    public DeleteProtectionModuleRuleResponse deleteProtectionModuleRuleWithOptions(DeleteProtectionModuleRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DefenseType", request.defenseType);
        query.put("Domain", request.domain);
        query.put("InstanceId", request.instanceId);
        query.put("RuleId", request.ruleId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteProtectionModuleRule"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteProtectionModuleRuleResponse());
    }

    public DeleteProtectionModuleRuleResponse deleteProtectionModuleRule(DeleteProtectionModuleRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteProtectionModuleRuleWithOptions(request, runtime);
    }

    public DescribeCertMatchStatusResponse describeCertMatchStatusWithOptions(DescribeCertMatchStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Certificate", request.certificate);
        query.put("Domain", request.domain);
        query.put("InstanceId", request.instanceId);
        query.put("PrivateKey", request.privateKey);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCertMatchStatus"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCertMatchStatusResponse());
    }

    public DescribeCertMatchStatusResponse describeCertMatchStatus(DescribeCertMatchStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCertMatchStatusWithOptions(request, runtime);
    }

    public DescribeCertificatesResponse describeCertificatesWithOptions(DescribeCertificatesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Domain", request.domain);
        query.put("InstanceId", request.instanceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCertificates"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCertificatesResponse());
    }

    public DescribeCertificatesResponse describeCertificates(DescribeCertificatesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCertificatesWithOptions(request, runtime);
    }

    public DescribeDomainResponse describeDomainWithOptions(DescribeDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Domain", request.domain);
        query.put("InstanceId", request.instanceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomain"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainResponse());
    }

    public DescribeDomainResponse describeDomain(DescribeDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainWithOptions(request, runtime);
    }

    public DescribeDomainAdvanceConfigsResponse describeDomainAdvanceConfigsWithOptions(DescribeDomainAdvanceConfigsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DomainList", request.domainList);
        query.put("InstanceId", request.instanceId);
        query.put("ResourceGroupId", request.resourceGroupId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainAdvanceConfigs"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainAdvanceConfigsResponse());
    }

    public DescribeDomainAdvanceConfigsResponse describeDomainAdvanceConfigs(DescribeDomainAdvanceConfigsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainAdvanceConfigsWithOptions(request, runtime);
    }

    public DescribeDomainBasicConfigsResponse describeDomainBasicConfigsWithOptions(DescribeDomainBasicConfigsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccessType", request.accessType);
        query.put("CloudNativeProductId", request.cloudNativeProductId);
        query.put("DomainKey", request.domainKey);
        query.put("InstanceId", request.instanceId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("ResourceGroupId", request.resourceGroupId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainBasicConfigs"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainBasicConfigsResponse());
    }

    public DescribeDomainBasicConfigsResponse describeDomainBasicConfigs(DescribeDomainBasicConfigsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainBasicConfigsWithOptions(request, runtime);
    }

    public DescribeDomainListResponse describeDomainListWithOptions(DescribeDomainListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DomainName", request.domainName);
        query.put("DomainNames", request.domainNames);
        query.put("InstanceId", request.instanceId);
        query.put("IsSub", request.isSub);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("ResourceGroupId", request.resourceGroupId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainList"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainListResponse());
    }

    public DescribeDomainListResponse describeDomainList(DescribeDomainListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainListWithOptions(request, runtime);
    }

    public DescribeDomainNamesResponse describeDomainNamesWithOptions(DescribeDomainNamesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("InstanceId", request.instanceId);
        query.put("ResourceGroupId", request.resourceGroupId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainNames"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainNamesResponse());
    }

    public DescribeDomainNamesResponse describeDomainNames(DescribeDomainNamesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainNamesWithOptions(request, runtime);
    }

    public DescribeDomainRuleGroupResponse describeDomainRuleGroupWithOptions(DescribeDomainRuleGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Domain", request.domain);
        query.put("InstanceId", request.instanceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainRuleGroup"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainRuleGroupResponse());
    }

    public DescribeDomainRuleGroupResponse describeDomainRuleGroup(DescribeDomainRuleGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainRuleGroupWithOptions(request, runtime);
    }

    public DescribeInstanceInfoResponse describeInstanceInfoWithOptions(DescribeInstanceInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("InstanceId", request.instanceId);
        query.put("ResourceGroupId", request.resourceGroupId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstanceInfo"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceInfoResponse());
    }

    public DescribeInstanceInfoResponse describeInstanceInfo(DescribeInstanceInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstanceInfoWithOptions(request, runtime);
    }

    public DescribeInstanceSpecInfoResponse describeInstanceSpecInfoWithOptions(DescribeInstanceSpecInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("InstanceId", request.instanceId);
        query.put("ResourceGroupId", request.resourceGroupId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstanceSpecInfo"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceSpecInfoResponse());
    }

    public DescribeInstanceSpecInfoResponse describeInstanceSpecInfo(DescribeInstanceSpecInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstanceSpecInfoWithOptions(request, runtime);
    }

    public DescribeLogServiceStatusResponse describeLogServiceStatusWithOptions(DescribeLogServiceStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DomainNames", request.domainNames);
        query.put("InstanceId", request.instanceId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("Region", request.region);
        query.put("ResourceGroupId", request.resourceGroupId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeLogServiceStatus"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeLogServiceStatusResponse());
    }

    public DescribeLogServiceStatusResponse describeLogServiceStatus(DescribeLogServiceStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLogServiceStatusWithOptions(request, runtime);
    }

    public DescribeProtectionModuleCodeConfigResponse describeProtectionModuleCodeConfigWithOptions(DescribeProtectionModuleCodeConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CodeType", request.codeType);
        query.put("CodeValue", request.codeValue);
        query.put("InstanceId", request.instanceId);
        query.put("ResourceGroupId", request.resourceGroupId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeProtectionModuleCodeConfig"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeProtectionModuleCodeConfigResponse());
    }

    public DescribeProtectionModuleCodeConfigResponse describeProtectionModuleCodeConfig(DescribeProtectionModuleCodeConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeProtectionModuleCodeConfigWithOptions(request, runtime);
    }

    public DescribeProtectionModuleRulesResponse describeProtectionModuleRulesWithOptions(DescribeProtectionModuleRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DefenseType", request.defenseType);
        query.put("Domain", request.domain);
        query.put("InstanceId", request.instanceId);
        query.put("Lang", request.lang);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("Query", request.query);
        query.put("ResourceGroupId", request.resourceGroupId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeProtectionModuleRules"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeProtectionModuleRulesResponse());
    }

    public DescribeProtectionModuleRulesResponse describeProtectionModuleRules(DescribeProtectionModuleRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeProtectionModuleRulesWithOptions(request, runtime);
    }

    public DescribeProtectionModuleStatusResponse describeProtectionModuleStatusWithOptions(DescribeProtectionModuleStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DefenseType", request.defenseType);
        query.put("Domain", request.domain);
        query.put("InstanceId", request.instanceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeProtectionModuleStatus"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeProtectionModuleStatusResponse());
    }

    public DescribeProtectionModuleStatusResponse describeProtectionModuleStatus(DescribeProtectionModuleStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeProtectionModuleStatusWithOptions(request, runtime);
    }

    public DescribeWafSourceIpSegmentResponse describeWafSourceIpSegmentWithOptions(DescribeWafSourceIpSegmentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("InstanceId", request.instanceId);
        query.put("ResourceGroupId", request.resourceGroupId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeWafSourceIpSegment"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeWafSourceIpSegmentResponse());
    }

    public DescribeWafSourceIpSegmentResponse describeWafSourceIpSegment(DescribeWafSourceIpSegmentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeWafSourceIpSegmentWithOptions(request, runtime);
    }

    public ModifyDomainResponse modifyDomainWithOptions(ModifyDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccessHeaderMode", request.accessHeaderMode);
        query.put("AccessHeaders", request.accessHeaders);
        query.put("AccessType", request.accessType);
        query.put("CloudNativeInstances", request.cloudNativeInstances);
        query.put("ClusterType", request.clusterType);
        query.put("ConnectionTime", request.connectionTime);
        query.put("Domain", request.domain);
        query.put("Http2Port", request.http2Port);
        query.put("HttpPort", request.httpPort);
        query.put("HttpToUserIp", request.httpToUserIp);
        query.put("HttpsPort", request.httpsPort);
        query.put("HttpsRedirect", request.httpsRedirect);
        query.put("InstanceId", request.instanceId);
        query.put("InstanceId", request.instanceId);
        query.put("IpFollowStatus", request.ipFollowStatus);
        query.put("IsAccessProduct", request.isAccessProduct);
        query.put("LoadBalancing", request.loadBalancing);
        query.put("LogHeaders", request.logHeaders);
        query.put("ReadTime", request.readTime);
        query.put("SniHost", request.sniHost);
        query.put("SniStatus", request.sniStatus);
        query.put("SourceIps", request.sourceIps);
        query.put("WriteTime", request.writeTime);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDomain"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDomainResponse());
    }

    public ModifyDomainResponse modifyDomain(ModifyDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDomainWithOptions(request, runtime);
    }

    public ModifyDomainIpv6StatusResponse modifyDomainIpv6StatusWithOptions(ModifyDomainIpv6StatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Domain", request.domain);
        query.put("Enabled", request.enabled);
        query.put("InstanceId", request.instanceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDomainIpv6Status"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDomainIpv6StatusResponse());
    }

    public ModifyDomainIpv6StatusResponse modifyDomainIpv6Status(ModifyDomainIpv6StatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDomainIpv6StatusWithOptions(request, runtime);
    }

    public ModifyLogRetrievalStatusResponse modifyLogRetrievalStatusWithOptions(ModifyLogRetrievalStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Domain", request.domain);
        query.put("Enabled", request.enabled);
        query.put("InstanceId", request.instanceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyLogRetrievalStatus"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyLogRetrievalStatusResponse());
    }

    public ModifyLogRetrievalStatusResponse modifyLogRetrievalStatus(ModifyLogRetrievalStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyLogRetrievalStatusWithOptions(request, runtime);
    }

    public ModifyLogServiceStatusResponse modifyLogServiceStatusWithOptions(ModifyLogServiceStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Domain", request.domain);
        query.put("Enabled", request.enabled);
        query.put("InstanceId", request.instanceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyLogServiceStatus"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyLogServiceStatusResponse());
    }

    public ModifyLogServiceStatusResponse modifyLogServiceStatus(ModifyLogServiceStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyLogServiceStatusWithOptions(request, runtime);
    }

    public ModifyProtectionModuleModeResponse modifyProtectionModuleModeWithOptions(ModifyProtectionModuleModeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DefenseType", request.defenseType);
        query.put("Domain", request.domain);
        query.put("InstanceId", request.instanceId);
        query.put("Mode", request.mode);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyProtectionModuleMode"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyProtectionModuleModeResponse());
    }

    public ModifyProtectionModuleModeResponse modifyProtectionModuleMode(ModifyProtectionModuleModeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyProtectionModuleModeWithOptions(request, runtime);
    }

    public ModifyProtectionModuleRuleResponse modifyProtectionModuleRuleWithOptions(ModifyProtectionModuleRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DefenseType", request.defenseType);
        query.put("Domain", request.domain);
        query.put("InstanceId", request.instanceId);
        query.put("LockVersion", request.lockVersion);
        query.put("Rule", request.rule);
        query.put("RuleId", request.ruleId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyProtectionModuleRule"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyProtectionModuleRuleResponse());
    }

    public ModifyProtectionModuleRuleResponse modifyProtectionModuleRule(ModifyProtectionModuleRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyProtectionModuleRuleWithOptions(request, runtime);
    }

    public ModifyProtectionModuleStatusResponse modifyProtectionModuleStatusWithOptions(ModifyProtectionModuleStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DefenseType", request.defenseType);
        query.put("Domain", request.domain);
        query.put("InstanceId", request.instanceId);
        query.put("ModuleStatus", request.moduleStatus);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyProtectionModuleStatus"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyProtectionModuleStatusResponse());
    }

    public ModifyProtectionModuleStatusResponse modifyProtectionModuleStatus(ModifyProtectionModuleStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyProtectionModuleStatusWithOptions(request, runtime);
    }

    public ModifyProtectionRuleCacheStatusResponse modifyProtectionRuleCacheStatusWithOptions(ModifyProtectionRuleCacheStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DefenseType", request.defenseType);
        query.put("Domain", request.domain);
        query.put("InstanceId", request.instanceId);
        query.put("RuleId", request.ruleId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyProtectionRuleCacheStatus"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyProtectionRuleCacheStatusResponse());
    }

    public ModifyProtectionRuleCacheStatusResponse modifyProtectionRuleCacheStatus(ModifyProtectionRuleCacheStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyProtectionRuleCacheStatusWithOptions(request, runtime);
    }

    public ModifyProtectionRuleStatusResponse modifyProtectionRuleStatusWithOptions(ModifyProtectionRuleStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DefenseType", request.defenseType);
        query.put("Domain", request.domain);
        query.put("InstanceId", request.instanceId);
        query.put("LockVersion", request.lockVersion);
        query.put("RuleId", request.ruleId);
        query.put("RuleStatus", request.ruleStatus);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyProtectionRuleStatus"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyProtectionRuleStatusResponse());
    }

    public ModifyProtectionRuleStatusResponse modifyProtectionRuleStatus(ModifyProtectionRuleStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyProtectionRuleStatusWithOptions(request, runtime);
    }

    public MoveResourceGroupResponse moveResourceGroupWithOptions(MoveResourceGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ResourceGroupId", request.resourceGroupId);
        query.put("ResourceId", request.resourceId);
        query.put("ResourceType", request.resourceType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MoveResourceGroup"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MoveResourceGroupResponse());
    }

    public MoveResourceGroupResponse moveResourceGroup(MoveResourceGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.moveResourceGroupWithOptions(request, runtime);
    }

    public SetDomainRuleGroupResponse setDomainRuleGroupWithOptions(SetDomainRuleGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Domains", request.domains);
        query.put("InstanceId", request.instanceId);
        query.put("ResourceGroupId", request.resourceGroupId);
        query.put("RuleGroupId", request.ruleGroupId);
        query.put("WafVersion", request.wafVersion);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetDomainRuleGroup"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetDomainRuleGroupResponse());
    }

    public SetDomainRuleGroupResponse setDomainRuleGroup(SetDomainRuleGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setDomainRuleGroupWithOptions(request, runtime);
    }
}
