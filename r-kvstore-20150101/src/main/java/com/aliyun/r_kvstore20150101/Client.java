// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101;

import com.aliyun.tea.*;
import com.aliyun.r_kvstore20150101.models.*;
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
            new TeaPair("cn-qingdao", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-beijing", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-shanghai", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-heyuan", "r-kvstore.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "r-kvstore.aliyuncs.com"),
            new TeaPair("us-west-1", "r-kvstore.aliyuncs.com"),
            new TeaPair("us-east-1", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "r-kvstore.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-edge-1", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-fujian", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-huhehaote-nebula-1", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-wuhan", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "r-kvstore.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "r-kvstore.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "r-kvstore.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("r-kvstore", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public CreateCacheAnalysisTaskResponse createCacheAnalysisTaskWithOptions(CreateCacheAnalysisTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateCacheAnalysisTask", "2015-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateCacheAnalysisTaskResponse());
    }

    public CreateCacheAnalysisTaskResponse createCacheAnalysisTask(CreateCacheAnalysisTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createCacheAnalysisTaskWithOptions(request, runtime);
    }

    public DescribeDedicatedClusterInstanceListResponse describeDedicatedClusterInstanceListWithOptions(DescribeDedicatedClusterInstanceListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDedicatedClusterInstanceList", "2015-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDedicatedClusterInstanceListResponse());
    }

    public DescribeDedicatedClusterInstanceListResponse describeDedicatedClusterInstanceList(DescribeDedicatedClusterInstanceListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDedicatedClusterInstanceListWithOptions(request, runtime);
    }

    public DescribeRoleZoneInfoResponse describeRoleZoneInfoWithOptions(DescribeRoleZoneInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRoleZoneInfo", "2015-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRoleZoneInfoResponse());
    }

    public DescribeRoleZoneInfoResponse describeRoleZoneInfo(DescribeRoleZoneInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRoleZoneInfoWithOptions(request, runtime);
    }
}
