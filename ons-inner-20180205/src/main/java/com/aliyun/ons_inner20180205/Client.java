// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons_inner20180205;

import com.aliyun.tea.*;
import com.aliyun.ons_inner20180205.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("ons-inner", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListTagResources", "2018-02-05", "HTTPS", "POST", "AK", "json", req, runtime), new ListTagResourcesResponse());
    }

    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    public OnsAddInstanceTunnelTagResponse onsAddInstanceTunnelTagWithOptions(OnsAddInstanceTunnelTagRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("OnsAddInstanceTunnelTag", "2018-02-05", "HTTPS", "POST", "AK", "json", req, runtime), new OnsAddInstanceTunnelTagResponse());
    }

    public OnsAddInstanceTunnelTagResponse onsAddInstanceTunnelTag(OnsAddInstanceTunnelTagRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.onsAddInstanceTunnelTagWithOptions(request, runtime);
    }

    public OnsRemoveInstanceTunnelTagResponse onsRemoveInstanceTunnelTagWithOptions(OnsRemoveInstanceTunnelTagRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("OnsRemoveInstanceTunnelTag", "2018-02-05", "HTTPS", "POST", "AK", "json", req, runtime), new OnsRemoveInstanceTunnelTagResponse());
    }

    public OnsRemoveInstanceTunnelTagResponse onsRemoveInstanceTunnelTag(OnsRemoveInstanceTunnelTagRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.onsRemoveInstanceTunnelTagWithOptions(request, runtime);
    }

    public TagResourcesSystemTagsResponse tagResourcesSystemTagsWithOptions(TagResourcesSystemTagsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("TagResourcesSystemTags", "2018-02-05", "HTTPS", "POST", "AK", "json", req, runtime), new TagResourcesSystemTagsResponse());
    }

    public TagResourcesSystemTagsResponse tagResourcesSystemTags(TagResourcesSystemTagsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.tagResourcesSystemTagsWithOptions(request, runtime);
    }

    public UntagResourcesSystemTagsResponse untagResourcesSystemTagsWithOptions(UntagResourcesSystemTagsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UntagResourcesSystemTags", "2018-02-05", "HTTPS", "POST", "AK", "json", req, runtime), new UntagResourcesSystemTagsResponse());
    }

    public UntagResourcesSystemTagsResponse untagResourcesSystemTags(UntagResourcesSystemTagsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.untagResourcesSystemTagsWithOptions(request, runtime);
    }
}
