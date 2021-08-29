// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tag20180828;

import com.aliyun.tea.*;
import com.aliyun.tag20180828.models.*;
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
            new TeaPair("cn-qingdao", "tag.aliyuncs.com"),
            new TeaPair("cn-beijing", "tag.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "tag.aliyuncs.com"),
            new TeaPair("cn-shanghai", "tag.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "tag.aliyuncs.com"),
            new TeaPair("cn-hongkong", "tag.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "tag.aliyuncs.com"),
            new TeaPair("us-west-1", "tag.aliyuncs.com"),
            new TeaPair("us-east-1", "tag.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "tag.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "tag.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "tag.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "tag.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "tag.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "tag.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "tag.aliyuncs.com"),
            new TeaPair("cn-edge-1", "tag.aliyuncs.com"),
            new TeaPair("cn-fujian", "tag.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "tag.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "tag.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "tag.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "tag.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "tag.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "tag.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "tag.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "tag.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "tag.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "tag.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "tag.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "tag.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "tag.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "tag.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "tag.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "tag.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "tag.aliyuncs.com"),
            new TeaPair("cn-wuhan", "tag.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "tag.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "tag.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "tag.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "tag.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "tag.cn-shenzhen-cloudstone.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "tag.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("tag", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public CreateTagsResponse createTagsWithOptions(CreateTagsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateTags", "2018-08-28", "HTTPS", "POST", "AK", "json", req, runtime), new CreateTagsResponse());
    }

    public CreateTagsResponse createTags(CreateTagsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createTagsWithOptions(request, runtime);
    }

    public DeleteTagResponse deleteTagWithOptions(DeleteTagRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteTag", "2018-08-28", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteTagResponse());
    }

    public DeleteTagResponse deleteTag(DeleteTagRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteTagWithOptions(request, runtime);
    }

    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRegions", "2018-08-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRegionsResponse());
    }

    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRegionsWithOptions(request, runtime);
    }

    public ListTagKeysResponse listTagKeysWithOptions(ListTagKeysRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListTagKeys", "2018-08-28", "HTTPS", "POST", "AK", "json", req, runtime), new ListTagKeysResponse());
    }

    public ListTagKeysResponse listTagKeys(ListTagKeysRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTagKeysWithOptions(request, runtime);
    }

    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListTagResources", "2018-08-28", "HTTPS", "POST", "AK", "json", req, runtime), new ListTagResourcesResponse());
    }

    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    public ListTagValuesResponse listTagValuesWithOptions(ListTagValuesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListTagValues", "2018-08-28", "HTTPS", "POST", "AK", "json", req, runtime), new ListTagValuesResponse());
    }

    public ListTagValuesResponse listTagValues(ListTagValuesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTagValuesWithOptions(request, runtime);
    }

    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("TagResources", "2018-08-28", "HTTPS", "POST", "AK", "json", req, runtime), new TagResourcesResponse());
    }

    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

    public UntagResourcesResponse untagResourcesWithOptions(UntagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UntagResources", "2018-08-28", "HTTPS", "POST", "AK", "json", req, runtime), new UntagResourcesResponse());
    }

    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.untagResourcesWithOptions(request, runtime);
    }
}
