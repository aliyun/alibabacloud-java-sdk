// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.reid_cloud20201027;

import com.aliyun.tea.*;
import com.aliyun.reid_cloud20201027.models.*;
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
            new TeaPair("ap-northeast-1", "reidcloud.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "reidcloud.aliyuncs.com"),
            new TeaPair("ap-south-1", "reidcloud.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "reidcloud.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "reidcloud.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "reidcloud.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "reidcloud.aliyuncs.com"),
            new TeaPair("cn-beijing", "reidcloud.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "reidcloud.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "reidcloud.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "reidcloud.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "reidcloud.aliyuncs.com"),
            new TeaPair("cn-chengdu", "reidcloud.aliyuncs.com"),
            new TeaPair("cn-edge-1", "reidcloud.aliyuncs.com"),
            new TeaPair("cn-fujian", "reidcloud.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "reidcloud.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "reidcloud.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "reidcloud.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "reidcloud.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "reidcloud.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "reidcloud.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "reidcloud.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "reidcloud.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "reidcloud.aliyuncs.com"),
            new TeaPair("cn-hongkong", "reidcloud.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "reidcloud.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "reidcloud.aliyuncs.com"),
            new TeaPair("cn-huhehaote-nebula-1", "reidcloud.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "reidcloud.aliyuncs.com"),
            new TeaPair("cn-qingdao", "reidcloud.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "reidcloud.aliyuncs.com"),
            new TeaPair("cn-shanghai", "reidcloud.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "reidcloud.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "reidcloud.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "reidcloud.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "reidcloud.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "reidcloud.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "reidcloud.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "reidcloud.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "reidcloud.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "reidcloud.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "reidcloud.aliyuncs.com"),
            new TeaPair("cn-wuhan", "reidcloud.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "reidcloud.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "reidcloud.aliyuncs.com"),
            new TeaPair("cn-zhangbei", "reidcloud.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "reidcloud.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "reidcloud.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "reidcloud.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "reidcloud.aliyuncs.com"),
            new TeaPair("eu-central-1", "reidcloud.aliyuncs.com"),
            new TeaPair("eu-west-1", "reidcloud.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "reidcloud.aliyuncs.com"),
            new TeaPair("me-east-1", "reidcloud.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "reidcloud.aliyuncs.com"),
            new TeaPair("us-east-1", "reidcloud.aliyuncs.com"),
            new TeaPair("us-west-1", "reidcloud.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("reid_cloud", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public ListIpcStoreInfoResponse listIpcStoreInfoWithOptions(ListIpcStoreInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListIpcStoreInfo", "2020-10-27", "HTTPS", "POST", "AK", "json", req, runtime), new ListIpcStoreInfoResponse());
    }

    public ListIpcStoreInfoResponse listIpcStoreInfo(ListIpcStoreInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listIpcStoreInfoWithOptions(request, runtime);
    }

    public ExtractFaceAttributeCROResponse extractFaceAttributeCROWithOptions(ExtractFaceAttributeCRORequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ExtractFaceAttributeCRO", "2020-10-27", "HTTPS", "POST", "AK", "json", req, runtime), new ExtractFaceAttributeCROResponse());
    }

    public ExtractFaceAttributeCROResponse extractFaceAttributeCRO(ExtractFaceAttributeCRORequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.extractFaceAttributeCROWithOptions(request, runtime);
    }

    public CopyStoresResponse copyStoresWithOptions(CopyStoresRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CopyStores", "2020-10-27", "HTTPS", "POST", "AK", "json", req, runtime), new CopyStoresResponse());
    }

    public CopyStoresResponse copyStores(CopyStoresRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.copyStoresWithOptions(request, runtime);
    }

    public GetAllStoreDataByTypeResponse getAllStoreDataByTypeWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("GetAllStoreDataByType", "2020-10-27", "HTTPS", "POST", "AK", "json", req, runtime), new GetAllStoreDataByTypeResponse());
    }

    public GetAllStoreDataByTypeResponse getAllStoreDataByType() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAllStoreDataByTypeWithOptions(runtime);
    }

    public ExtractFaceFeatureCROResponse extractFaceFeatureCROWithOptions(ExtractFaceFeatureCRORequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ExtractFaceFeatureCRO", "2020-10-27", "HTTPS", "GET", "AK", "json", req, runtime), new ExtractFaceFeatureCROResponse());
    }

    public ExtractFaceFeatureCROResponse extractFaceFeatureCRO(ExtractFaceFeatureCRORequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.extractFaceFeatureCROWithOptions(request, runtime);
    }

    public GetEmapIpcDataListByStoreIdResponse getEmapIpcDataListByStoreIdWithOptions(GetEmapIpcDataListByStoreIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetEmapIpcDataListByStoreId", "2020-10-27", "HTTPS", "POST", "AK", "json", req, runtime), new GetEmapIpcDataListByStoreIdResponse());
    }

    public GetEmapIpcDataListByStoreIdResponse getEmapIpcDataListByStoreId(GetEmapIpcDataListByStoreIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getEmapIpcDataListByStoreIdWithOptions(request, runtime);
    }
}
