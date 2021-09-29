// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sts20150401;

import com.aliyun.tea.*;
import com.aliyun.sts20150401.models.*;
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
            new TeaPair("ap-northeast-2-pop", "sts.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "sts.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "sts.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "sts.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "sts.aliyuncs.com"),
            new TeaPair("cn-edge-1", "sts.aliyuncs.com"),
            new TeaPair("cn-fujian", "sts.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "sts.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "sts.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "sts.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "sts.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "sts.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "sts.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "sts.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "sts.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "sts.aliyuncs.com"),
            new TeaPair("cn-huhehaote-nebula-1", "sts.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "sts-vpc.cn-north-2-gov-1.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "sts.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "sts.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "sts.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "sts.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "sts.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "sts-vpc.cn-shenzhen-finance-1.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "sts.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "sts.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "sts.aliyuncs.com"),
            new TeaPair("cn-wuhan", "sts.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "sts.aliyuncs.com"),
            new TeaPair("cn-zhangbei", "sts.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "sts.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "sts.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "sts.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "sts.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "sts.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("sts", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AssumeRoleResponse assumeRoleWithOptions(AssumeRoleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AssumeRole", "2015-04-01", "HTTPS", "POST", "AK", "json", req, runtime), new AssumeRoleResponse());
    }

    public AssumeRoleResponse assumeRole(AssumeRoleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.assumeRoleWithOptions(request, runtime);
    }

    public AssumeRoleWithOIDCResponse assumeRoleWithOIDCWithOptions(AssumeRoleWithOIDCRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AssumeRoleWithOIDC", "2015-04-01", "HTTPS", "POST", "AK", "json", req, runtime), new AssumeRoleWithOIDCResponse());
    }

    public AssumeRoleWithOIDCResponse assumeRoleWithOIDC(AssumeRoleWithOIDCRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.assumeRoleWithOIDCWithOptions(request, runtime);
    }

    public AssumeRoleWithSAMLResponse assumeRoleWithSAMLWithOptions(AssumeRoleWithSAMLRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AssumeRoleWithSAML", "2015-04-01", "HTTPS", "POST", "AK", "json", req, runtime), new AssumeRoleWithSAMLResponse());
    }

    public AssumeRoleWithSAMLResponse assumeRoleWithSAML(AssumeRoleWithSAMLRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.assumeRoleWithSAMLWithOptions(request, runtime);
    }

    public GetCallerIdentityResponse getCallerIdentityWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("GetCallerIdentity", "2015-04-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetCallerIdentityResponse());
    }

    public GetCallerIdentityResponse getCallerIdentity() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getCallerIdentityWithOptions(runtime);
    }
}
