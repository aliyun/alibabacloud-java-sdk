// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ots20160620;

import com.aliyun.tea.*;
import com.aliyun.ots20160620.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("ots", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public BindInstance2VpcResponse bindInstance2VpcWithOptions(BindInstance2VpcRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BindInstance2Vpc", "2016-06-20", "HTTPS", "POST", "AK", "json", req, runtime), new BindInstance2VpcResponse());
    }

    public BindInstance2VpcResponse bindInstance2Vpc(BindInstance2VpcRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.bindInstance2VpcWithOptions(request, runtime);
    }

    public DeleteInstanceResponse deleteInstanceWithOptions(DeleteInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteInstance", "2016-06-20", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteInstanceResponse());
    }

    public DeleteInstanceResponse deleteInstance(DeleteInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteInstanceWithOptions(request, runtime);
    }

    public DeleteTagsResponse deleteTagsWithOptions(DeleteTagsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteTags", "2016-06-20", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteTagsResponse());
    }

    public DeleteTagsResponse deleteTags(DeleteTagsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteTagsWithOptions(request, runtime);
    }

    public GetInstanceResponse getInstanceWithOptions(GetInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetInstance", "2016-06-20", "HTTPS", "GET", "AK", "json", req, runtime), new GetInstanceResponse());
    }

    public GetInstanceResponse getInstance(GetInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getInstanceWithOptions(request, runtime);
    }

    public GetOtsServiceStatusResponse getOtsServiceStatusWithOptions(GetOtsServiceStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetOtsServiceStatus", "2016-06-20", "HTTPS", "GET", "AK", "json", req, runtime), new GetOtsServiceStatusResponse());
    }

    public GetOtsServiceStatusResponse getOtsServiceStatus(GetOtsServiceStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getOtsServiceStatusWithOptions(request, runtime);
    }

    public InsertInstanceResponse insertInstanceWithOptions(InsertInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("InsertInstance", "2016-06-20", "HTTPS", "POST", "AK", "json", req, runtime), new InsertInstanceResponse());
    }

    public InsertInstanceResponse insertInstance(InsertInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.insertInstanceWithOptions(request, runtime);
    }

    public InsertTagsResponse insertTagsWithOptions(InsertTagsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("InsertTags", "2016-06-20", "HTTPS", "POST", "AK", "json", req, runtime), new InsertTagsResponse());
    }

    public InsertTagsResponse insertTags(InsertTagsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.insertTagsWithOptions(request, runtime);
    }

    public ListClusterTypeResponse listClusterTypeWithOptions(ListClusterTypeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListClusterType", "2016-06-20", "HTTPS", "GET", "AK", "json", req, runtime), new ListClusterTypeResponse());
    }

    public ListClusterTypeResponse listClusterType(ListClusterTypeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listClusterTypeWithOptions(request, runtime);
    }

    public ListInstanceResponse listInstanceWithOptions(ListInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListInstance", "2016-06-20", "HTTPS", "GET", "AK", "json", req, runtime), new ListInstanceResponse());
    }

    public ListInstanceResponse listInstance(ListInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listInstanceWithOptions(request, runtime);
    }

    public ListTagsResponse listTagsWithOptions(ListTagsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListTags", "2016-06-20", "HTTPS", "POST", "AK", "json", req, runtime), new ListTagsResponse());
    }

    public ListTagsResponse listTags(ListTagsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTagsWithOptions(request, runtime);
    }

    public ListVpcInfoByInstanceResponse listVpcInfoByInstanceWithOptions(ListVpcInfoByInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListVpcInfoByInstance", "2016-06-20", "HTTPS", "GET", "AK", "json", req, runtime), new ListVpcInfoByInstanceResponse());
    }

    public ListVpcInfoByInstanceResponse listVpcInfoByInstance(ListVpcInfoByInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listVpcInfoByInstanceWithOptions(request, runtime);
    }

    public ListVpcInfoByVpcResponse listVpcInfoByVpcWithOptions(ListVpcInfoByVpcRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListVpcInfoByVpc", "2016-06-20", "HTTPS", "GET", "AK", "json", req, runtime), new ListVpcInfoByVpcResponse());
    }

    public ListVpcInfoByVpcResponse listVpcInfoByVpc(ListVpcInfoByVpcRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listVpcInfoByVpcWithOptions(request, runtime);
    }

    public OpenOtsServiceResponse openOtsServiceWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("OpenOtsService", "2016-06-20", "HTTPS", "POST", "AK", "json", req, runtime), new OpenOtsServiceResponse());
    }

    public OpenOtsServiceResponse openOtsService() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.openOtsServiceWithOptions(runtime);
    }

    public UnbindInstance2VpcResponse unbindInstance2VpcWithOptions(UnbindInstance2VpcRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UnbindInstance2Vpc", "2016-06-20", "HTTPS", "POST", "AK", "json", req, runtime), new UnbindInstance2VpcResponse());
    }

    public UnbindInstance2VpcResponse unbindInstance2Vpc(UnbindInstance2VpcRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unbindInstance2VpcWithOptions(request, runtime);
    }

    public UpdateInstanceResponse updateInstanceWithOptions(UpdateInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateInstance", "2016-06-20", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateInstanceResponse());
    }

    public UpdateInstanceResponse updateInstance(UpdateInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateInstanceWithOptions(request, runtime);
    }
}
