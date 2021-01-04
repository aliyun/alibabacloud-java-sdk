// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101;

import com.aliyun.tea.*;
import com.aliyun.pvtz20180101.models.*;
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
        this._endpoint = this.getEndpoint("pvtz", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AddZoneResponse addZoneWithOptions(AddZoneRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddZone", "2018-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new AddZoneResponse());
    }

    public AddZoneResponse addZone(AddZoneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addZoneWithOptions(request, runtime);
    }

    public AddZoneRecordResponse addZoneRecordWithOptions(AddZoneRecordRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddZoneRecord", "2018-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new AddZoneRecordResponse());
    }

    public AddZoneRecordResponse addZoneRecord(AddZoneRecordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addZoneRecordWithOptions(request, runtime);
    }

    public BindZoneVpcResponse bindZoneVpcWithOptions(BindZoneVpcRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BindZoneVpc", "2018-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new BindZoneVpcResponse());
    }

    public BindZoneVpcResponse bindZoneVpc(BindZoneVpcRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.bindZoneVpcWithOptions(request, runtime);
    }

    public CheckZoneNameResponse checkZoneNameWithOptions(CheckZoneNameRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CheckZoneName", "2018-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new CheckZoneNameResponse());
    }

    public CheckZoneNameResponse checkZoneName(CheckZoneNameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkZoneNameWithOptions(request, runtime);
    }

    public DeleteZoneResponse deleteZoneWithOptions(DeleteZoneRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteZone", "2018-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteZoneResponse());
    }

    public DeleteZoneResponse deleteZone(DeleteZoneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteZoneWithOptions(request, runtime);
    }

    public DeleteZoneRecordResponse deleteZoneRecordWithOptions(DeleteZoneRecordRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteZoneRecord", "2018-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteZoneRecordResponse());
    }

    public DeleteZoneRecordResponse deleteZoneRecord(DeleteZoneRecordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteZoneRecordWithOptions(request, runtime);
    }

    public DescribeChangeLogsResponse describeChangeLogsWithOptions(DescribeChangeLogsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeChangeLogs", "2018-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeChangeLogsResponse());
    }

    public DescribeChangeLogsResponse describeChangeLogs(DescribeChangeLogsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeChangeLogsWithOptions(request, runtime);
    }

    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRegions", "2018-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRegionsResponse());
    }

    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRegionsWithOptions(request, runtime);
    }

    public DescribeRequestGraphResponse describeRequestGraphWithOptions(DescribeRequestGraphRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRequestGraph", "2018-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRequestGraphResponse());
    }

    public DescribeRequestGraphResponse describeRequestGraph(DescribeRequestGraphRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRequestGraphWithOptions(request, runtime);
    }

    public DescribeStatisticSummaryResponse describeStatisticSummaryWithOptions(DescribeStatisticSummaryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeStatisticSummary", "2018-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeStatisticSummaryResponse());
    }

    public DescribeStatisticSummaryResponse describeStatisticSummary(DescribeStatisticSummaryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeStatisticSummaryWithOptions(request, runtime);
    }

    public DescribeUserServiceStatusResponse describeUserServiceStatusWithOptions(DescribeUserServiceStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeUserServiceStatus", "2018-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeUserServiceStatusResponse());
    }

    public DescribeUserServiceStatusResponse describeUserServiceStatus(DescribeUserServiceStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeUserServiceStatusWithOptions(request, runtime);
    }

    public DescribeZoneInfoResponse describeZoneInfoWithOptions(DescribeZoneInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeZoneInfo", "2018-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeZoneInfoResponse());
    }

    public DescribeZoneInfoResponse describeZoneInfo(DescribeZoneInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeZoneInfoWithOptions(request, runtime);
    }

    public DescribeZoneRecordsResponse describeZoneRecordsWithOptions(DescribeZoneRecordsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeZoneRecords", "2018-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeZoneRecordsResponse());
    }

    public DescribeZoneRecordsResponse describeZoneRecords(DescribeZoneRecordsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeZoneRecordsWithOptions(request, runtime);
    }

    public DescribeZonesResponse describeZonesWithOptions(DescribeZonesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeZones", "2018-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeZonesResponse());
    }

    public DescribeZonesResponse describeZones(DescribeZonesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeZonesWithOptions(request, runtime);
    }

    public DescribeZoneVpcTreeResponse describeZoneVpcTreeWithOptions(DescribeZoneVpcTreeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeZoneVpcTree", "2018-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeZoneVpcTreeResponse());
    }

    public DescribeZoneVpcTreeResponse describeZoneVpcTree(DescribeZoneVpcTreeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeZoneVpcTreeWithOptions(request, runtime);
    }

    public MoveResourceGroupResponse moveResourceGroupWithOptions(MoveResourceGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("MoveResourceGroup", "2018-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new MoveResourceGroupResponse());
    }

    public MoveResourceGroupResponse moveResourceGroup(MoveResourceGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.moveResourceGroupWithOptions(request, runtime);
    }

    public SetProxyPatternResponse setProxyPatternWithOptions(SetProxyPatternRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetProxyPattern", "2018-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new SetProxyPatternResponse());
    }

    public SetProxyPatternResponse setProxyPattern(SetProxyPatternRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setProxyPatternWithOptions(request, runtime);
    }

    public SetZoneRecordStatusResponse setZoneRecordStatusWithOptions(SetZoneRecordStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetZoneRecordStatus", "2018-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new SetZoneRecordStatusResponse());
    }

    public SetZoneRecordStatusResponse setZoneRecordStatus(SetZoneRecordStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setZoneRecordStatusWithOptions(request, runtime);
    }

    public UpdateRecordRemarkResponse updateRecordRemarkWithOptions(UpdateRecordRemarkRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateRecordRemark", "2018-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateRecordRemarkResponse());
    }

    public UpdateRecordRemarkResponse updateRecordRemark(UpdateRecordRemarkRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateRecordRemarkWithOptions(request, runtime);
    }

    public UpdateZoneRecordResponse updateZoneRecordWithOptions(UpdateZoneRecordRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateZoneRecord", "2018-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateZoneRecordResponse());
    }

    public UpdateZoneRecordResponse updateZoneRecord(UpdateZoneRecordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateZoneRecordWithOptions(request, runtime);
    }

    public UpdateZoneRemarkResponse updateZoneRemarkWithOptions(UpdateZoneRemarkRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateZoneRemark", "2018-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateZoneRemarkResponse());
    }

    public UpdateZoneRemarkResponse updateZoneRemark(UpdateZoneRemarkRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateZoneRemarkWithOptions(request, runtime);
    }
}
