// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pam20200930;

import com.aliyun.tea.*;
import com.aliyun.pam20200930.models.*;
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
        this._endpoint = this.getEndpoint("pam", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public CreateAssetCredentialResponse createAssetCredentialWithOptions(CreateAssetCredentialRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateAssetCredential", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new CreateAssetCredentialResponse());
    }

    public CreateAssetCredentialResponse createAssetCredential(CreateAssetCredentialRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAssetCredentialWithOptions(request, runtime);
    }

    public CreateInstanceResponse createInstanceWithOptions(CreateInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateInstance", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new CreateInstanceResponse());
    }

    public CreateInstanceResponse createInstance(CreateInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createInstanceWithOptions(request, runtime);
    }

    public DescribeAuditLogsResponse describeAuditLogsWithOptions(DescribeAuditLogsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAuditLogs", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAuditLogsResponse());
    }

    public DescribeAuditLogsResponse describeAuditLogs(DescribeAuditLogsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAuditLogsWithOptions(request, runtime);
    }

    public DescribeInstancesResponse describeInstancesWithOptions(DescribeInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeInstances", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeInstancesResponse());
    }

    public DescribeInstancesResponse describeInstances(DescribeInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstancesWithOptions(request, runtime);
    }

    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRegions", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRegionsResponse());
    }

    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRegionsWithOptions(request, runtime);
    }

    public DescribeSessionsResponse describeSessionsWithOptions(DescribeSessionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSessions", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSessionsResponse());
    }

    public DescribeSessionsResponse describeSessions(DescribeSessionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSessionsWithOptions(request, runtime);
    }

    public GenerateDirectOperationTokenResponse generateDirectOperationTokenWithOptions(GenerateDirectOperationTokenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GenerateDirectOperationToken", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new GenerateDirectOperationTokenResponse());
    }

    public GenerateDirectOperationTokenResponse generateDirectOperationToken(GenerateDirectOperationTokenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.generateDirectOperationTokenWithOptions(request, runtime);
    }

    public GeneratePlaybackTokenResponse generatePlaybackTokenWithOptions(GeneratePlaybackTokenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GeneratePlaybackToken", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new GeneratePlaybackTokenResponse());
    }

    public GeneratePlaybackTokenResponse generatePlaybackToken(GeneratePlaybackTokenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.generatePlaybackTokenWithOptions(request, runtime);
    }

    public GetAssetDetailResponse getAssetDetailWithOptions(GetAssetDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAssetDetail", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new GetAssetDetailResponse());
    }

    public GetAssetDetailResponse getAssetDetail(GetAssetDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAssetDetailWithOptions(request, runtime);
    }

    public ModifyAssetsPortResponse modifyAssetsPortWithOptions(ModifyAssetsPortRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyAssetsPort", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyAssetsPortResponse());
    }

    public ModifyAssetsPortResponse modifyAssetsPort(ModifyAssetsPortRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyAssetsPortWithOptions(request, runtime);
    }

    public RegisterAssetResponse registerAssetWithOptions(RegisterAssetRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RegisterAsset", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new RegisterAssetResponse());
    }

    public RegisterAssetResponse registerAsset(RegisterAssetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.registerAssetWithOptions(request, runtime);
    }
}
