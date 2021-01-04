// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smc20190601;

import com.aliyun.tea.*;
import com.aliyun.smc20190601.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "central";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("smc", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public CreateReplicationJobResponse createReplicationJobWithOptions(CreateReplicationJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateReplicationJob", "2019-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateReplicationJobResponse());
    }

    public CreateReplicationJobResponse createReplicationJob(CreateReplicationJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createReplicationJobWithOptions(request, runtime);
    }

    public CutOverReplicationJobResponse cutOverReplicationJobWithOptions(CutOverReplicationJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CutOverReplicationJob", "2019-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new CutOverReplicationJobResponse());
    }

    public CutOverReplicationJobResponse cutOverReplicationJob(CutOverReplicationJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cutOverReplicationJobWithOptions(request, runtime);
    }

    public DeleteReplicationJobResponse deleteReplicationJobWithOptions(DeleteReplicationJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteReplicationJob", "2019-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteReplicationJobResponse());
    }

    public DeleteReplicationJobResponse deleteReplicationJob(DeleteReplicationJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteReplicationJobWithOptions(request, runtime);
    }

    public DeleteSourceServerResponse deleteSourceServerWithOptions(DeleteSourceServerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteSourceServer", "2019-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteSourceServerResponse());
    }

    public DeleteSourceServerResponse deleteSourceServer(DeleteSourceServerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteSourceServerWithOptions(request, runtime);
    }

    public DescribeReplicationJobsResponse describeReplicationJobsWithOptions(DescribeReplicationJobsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeReplicationJobs", "2019-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeReplicationJobsResponse());
    }

    public DescribeReplicationJobsResponse describeReplicationJobs(DescribeReplicationJobsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeReplicationJobsWithOptions(request, runtime);
    }

    public DescribeSourceServersResponse describeSourceServersWithOptions(DescribeSourceServersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSourceServers", "2019-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSourceServersResponse());
    }

    public DescribeSourceServersResponse describeSourceServers(DescribeSourceServersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSourceServersWithOptions(request, runtime);
    }

    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListTagResources", "2019-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListTagResourcesResponse());
    }

    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    public ModifyReplicationJobAttributeResponse modifyReplicationJobAttributeWithOptions(ModifyReplicationJobAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyReplicationJobAttribute", "2019-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyReplicationJobAttributeResponse());
    }

    public ModifyReplicationJobAttributeResponse modifyReplicationJobAttribute(ModifyReplicationJobAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyReplicationJobAttributeWithOptions(request, runtime);
    }

    public ModifySourceServerAttributeResponse modifySourceServerAttributeWithOptions(ModifySourceServerAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifySourceServerAttribute", "2019-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifySourceServerAttributeResponse());
    }

    public ModifySourceServerAttributeResponse modifySourceServerAttribute(ModifySourceServerAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifySourceServerAttributeWithOptions(request, runtime);
    }

    public StartReplicationJobResponse startReplicationJobWithOptions(StartReplicationJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StartReplicationJob", "2019-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new StartReplicationJobResponse());
    }

    public StartReplicationJobResponse startReplicationJob(StartReplicationJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startReplicationJobWithOptions(request, runtime);
    }

    public StopReplicationJobResponse stopReplicationJobWithOptions(StopReplicationJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StopReplicationJob", "2019-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new StopReplicationJobResponse());
    }

    public StopReplicationJobResponse stopReplicationJob(StopReplicationJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopReplicationJobWithOptions(request, runtime);
    }

    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("TagResources", "2019-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new TagResourcesResponse());
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
        return TeaModel.toModel(this.doRPCRequest("UntagResources", "2019-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new UntagResourcesResponse());
    }

    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.untagResourcesWithOptions(request, runtime);
    }
}
