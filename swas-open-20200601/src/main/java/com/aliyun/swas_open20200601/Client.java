// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601;

import com.aliyun.tea.*;
import com.aliyun.swas_open20200601.models.*;
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
        this._endpoint = this.getEndpoint("swas-open", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public CreateCustomImageResponse createCustomImageWithOptions(CreateCustomImageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateCustomImage", "2020-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateCustomImageResponse());
    }

    public CreateCustomImageResponse createCustomImage(CreateCustomImageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createCustomImageWithOptions(request, runtime);
    }

    public CreateFirewallRuleResponse createFirewallRuleWithOptions(CreateFirewallRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateFirewallRule", "2020-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateFirewallRuleResponse());
    }

    public CreateFirewallRuleResponse createFirewallRule(CreateFirewallRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createFirewallRuleWithOptions(request, runtime);
    }

    public CreateInstancesResponse createInstancesWithOptions(CreateInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateInstances", "2020-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateInstancesResponse());
    }

    public CreateInstancesResponse createInstances(CreateInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createInstancesWithOptions(request, runtime);
    }

    public CreateSnapshotResponse createSnapshotWithOptions(CreateSnapshotRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateSnapshot", "2020-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateSnapshotResponse());
    }

    public CreateSnapshotResponse createSnapshot(CreateSnapshotRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSnapshotWithOptions(request, runtime);
    }

    public DeleteCustomImageResponse deleteCustomImageWithOptions(DeleteCustomImageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteCustomImage", "2020-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteCustomImageResponse());
    }

    public DeleteCustomImageResponse deleteCustomImage(DeleteCustomImageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteCustomImageWithOptions(request, runtime);
    }

    public DeleteFirewallRuleResponse deleteFirewallRuleWithOptions(DeleteFirewallRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteFirewallRule", "2020-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteFirewallRuleResponse());
    }

    public DeleteFirewallRuleResponse deleteFirewallRule(DeleteFirewallRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteFirewallRuleWithOptions(request, runtime);
    }

    public DeleteSnapshotResponse deleteSnapshotWithOptions(DeleteSnapshotRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteSnapshot", "2020-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteSnapshotResponse());
    }

    public DeleteSnapshotResponse deleteSnapshot(DeleteSnapshotRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteSnapshotWithOptions(request, runtime);
    }

    public ListDisksResponse listDisksWithOptions(ListDisksRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListDisks", "2020-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListDisksResponse());
    }

    public ListDisksResponse listDisks(ListDisksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDisksWithOptions(request, runtime);
    }

    public ListFirewallRulesResponse listFirewallRulesWithOptions(ListFirewallRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListFirewallRules", "2020-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListFirewallRulesResponse());
    }

    public ListFirewallRulesResponse listFirewallRules(ListFirewallRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listFirewallRulesWithOptions(request, runtime);
    }

    public ListImagesResponse listImagesWithOptions(ListImagesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListImages", "2020-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListImagesResponse());
    }

    public ListImagesResponse listImages(ListImagesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listImagesWithOptions(request, runtime);
    }

    public ListInstancePlansModificationResponse listInstancePlansModificationWithOptions(ListInstancePlansModificationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListInstancePlansModification", "2020-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListInstancePlansModificationResponse());
    }

    public ListInstancePlansModificationResponse listInstancePlansModification(ListInstancePlansModificationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listInstancePlansModificationWithOptions(request, runtime);
    }

    public ListInstancesResponse listInstancesWithOptions(ListInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListInstances", "2020-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListInstancesResponse());
    }

    public ListInstancesResponse listInstances(ListInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listInstancesWithOptions(request, runtime);
    }

    public ListInstancesTrafficPackagesResponse listInstancesTrafficPackagesWithOptions(ListInstancesTrafficPackagesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListInstancesTrafficPackages", "2020-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListInstancesTrafficPackagesResponse());
    }

    public ListInstancesTrafficPackagesResponse listInstancesTrafficPackages(ListInstancesTrafficPackagesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listInstancesTrafficPackagesWithOptions(request, runtime);
    }

    public ListPlansResponse listPlansWithOptions(ListPlansRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListPlans", "2020-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListPlansResponse());
    }

    public ListPlansResponse listPlans(ListPlansRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listPlansWithOptions(request, runtime);
    }

    public ListRegionsResponse listRegionsWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("ListRegions", "2020-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListRegionsResponse());
    }

    public ListRegionsResponse listRegions() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listRegionsWithOptions(runtime);
    }

    public ListSnapshotsResponse listSnapshotsWithOptions(ListSnapshotsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListSnapshots", "2020-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListSnapshotsResponse());
    }

    public ListSnapshotsResponse listSnapshots(ListSnapshotsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listSnapshotsWithOptions(request, runtime);
    }

    public ModifyImageShareStatusResponse modifyImageShareStatusWithOptions(ModifyImageShareStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyImageShareStatus", "2020-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyImageShareStatusResponse());
    }

    public ModifyImageShareStatusResponse modifyImageShareStatus(ModifyImageShareStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyImageShareStatusWithOptions(request, runtime);
    }

    public RebootInstanceResponse rebootInstanceWithOptions(RebootInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RebootInstance", "2020-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new RebootInstanceResponse());
    }

    public RebootInstanceResponse rebootInstance(RebootInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.rebootInstanceWithOptions(request, runtime);
    }

    public RenewInstanceResponse renewInstanceWithOptions(RenewInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RenewInstance", "2020-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new RenewInstanceResponse());
    }

    public RenewInstanceResponse renewInstance(RenewInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.renewInstanceWithOptions(request, runtime);
    }

    public ResetDiskResponse resetDiskWithOptions(ResetDiskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ResetDisk", "2020-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new ResetDiskResponse());
    }

    public ResetDiskResponse resetDisk(ResetDiskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.resetDiskWithOptions(request, runtime);
    }

    public ResetSystemResponse resetSystemWithOptions(ResetSystemRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ResetSystem", "2020-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new ResetSystemResponse());
    }

    public ResetSystemResponse resetSystem(ResetSystemRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.resetSystemWithOptions(request, runtime);
    }

    public StartInstanceResponse startInstanceWithOptions(StartInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StartInstance", "2020-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new StartInstanceResponse());
    }

    public StartInstanceResponse startInstance(StartInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startInstanceWithOptions(request, runtime);
    }

    public StopInstanceResponse stopInstanceWithOptions(StopInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StopInstance", "2020-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new StopInstanceResponse());
    }

    public StopInstanceResponse stopInstance(StopInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopInstanceWithOptions(request, runtime);
    }

    public UpdateInstanceAttributeResponse updateInstanceAttributeWithOptions(UpdateInstanceAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateInstanceAttribute", "2020-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateInstanceAttributeResponse());
    }

    public UpdateInstanceAttributeResponse updateInstanceAttribute(UpdateInstanceAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateInstanceAttributeWithOptions(request, runtime);
    }

    public UpgradeInstanceResponse upgradeInstanceWithOptions(UpgradeInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpgradeInstance", "2020-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new UpgradeInstanceResponse());
    }

    public UpgradeInstanceResponse upgradeInstance(UpgradeInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.upgradeInstanceWithOptions(request, runtime);
    }
}
