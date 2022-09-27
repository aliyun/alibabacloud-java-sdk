// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resellertrade20220920;

import com.aliyun.tea.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("ap-northeast-1", "resellertrade.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "resellertrade.aliyuncs.com"),
            new TeaPair("ap-south-1", "resellertrade.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "resellertrade.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "resellertrade.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "resellertrade.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-beijing", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-chengdu", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-edge-1", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-fujian", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-hongkong", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-qingdao", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-shanghai", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-wuhan", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "resellertrade.aliyuncs.com"),
            new TeaPair("eu-central-1", "resellertrade.aliyuncs.com"),
            new TeaPair("eu-west-1", "resellertrade.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "resellertrade.aliyuncs.com"),
            new TeaPair("me-east-1", "resellertrade.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "resellertrade.aliyuncs.com"),
            new TeaPair("us-east-1", "resellertrade.aliyuncs.com"),
            new TeaPair("us-west-1", "resellertrade.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("resellertrade", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
