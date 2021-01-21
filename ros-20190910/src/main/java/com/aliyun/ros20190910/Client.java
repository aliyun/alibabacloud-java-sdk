// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910;

import com.aliyun.tea.*;
import com.aliyun.ros20190910.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.common.*;
import com.aliyun.tearpc.*;
import com.aliyun.tearpc.models.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.tearpc.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "central";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("ros", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
    }


    public GenerateTemplatePolicyResponse generateTemplatePolicyWithOptions(GenerateTemplatePolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GenerateTemplatePolicy", "HTTPS", "POST", "2019-09-10", "AK", null, TeaModel.buildMap(request), runtime), new GenerateTemplatePolicyResponse());
    }

    public GenerateTemplatePolicyResponse generateTemplatePolicy(GenerateTemplatePolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.generateTemplatePolicyWithOptions(request, runtime);
    }

    public ListTemplateVersionsResponse listTemplateVersionsWithOptions(ListTemplateVersionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListTemplateVersions", "HTTPS", "POST", "2019-09-10", "AK", null, TeaModel.buildMap(request), runtime), new ListTemplateVersionsResponse());
    }

    public ListTemplateVersionsResponse listTemplateVersions(ListTemplateVersionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTemplateVersionsWithOptions(request, runtime);
    }

    public SetTemplatePermissionResponse setTemplatePermissionWithOptions(SetTemplatePermissionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SetTemplatePermission", "HTTPS", "POST", "2019-09-10", "AK", null, TeaModel.buildMap(request), runtime), new SetTemplatePermissionResponse());
    }

    public SetTemplatePermissionResponse setTemplatePermission(SetTemplatePermissionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setTemplatePermissionWithOptions(request, runtime);
    }

    public ListStackOperationRisksResponse listStackOperationRisksWithOptions(ListStackOperationRisksRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListStackOperationRisks", "HTTPS", "POST", "2019-09-10", "AK", null, TeaModel.buildMap(request), runtime), new ListStackOperationRisksResponse());
    }

    public ListStackOperationRisksResponse listStackOperationRisks(ListStackOperationRisksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listStackOperationRisksWithOptions(request, runtime);
    }

    public GetTemplateSummaryResponse getTemplateSummaryWithOptions(GetTemplateSummaryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetTemplateSummary", "HTTPS", "POST", "2019-09-10", "AK", null, TeaModel.buildMap(request), runtime), new GetTemplateSummaryResponse());
    }

    public GetTemplateSummaryResponse getTemplateSummary(GetTemplateSummaryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getTemplateSummaryWithOptions(request, runtime);
    }

    public ListTagValuesResponse listTagValuesWithOptions(ListTagValuesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListTagValues", "HTTPS", "POST", "2019-09-10", "AK", null, TeaModel.buildMap(request), runtime), new ListTagValuesResponse());
    }

    public ListTagValuesResponse listTagValues(ListTagValuesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTagValuesWithOptions(request, runtime);
    }

    public ListTagKeysResponse listTagKeysWithOptions(ListTagKeysRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListTagKeys", "HTTPS", "POST", "2019-09-10", "AK", null, TeaModel.buildMap(request), runtime), new ListTagKeysResponse());
    }

    public ListTagKeysResponse listTagKeys(ListTagKeysRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTagKeysWithOptions(request, runtime);
    }

    public SetDeletionProtectionResponse setDeletionProtectionWithOptions(SetDeletionProtectionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SetDeletionProtection", "HTTPS", "POST", "2019-09-10", "AK", null, TeaModel.buildMap(request), runtime), new SetDeletionProtectionResponse());
    }

    public SetDeletionProtectionResponse setDeletionProtection(SetDeletionProtectionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setDeletionProtectionWithOptions(request, runtime);
    }

    public UpdateStackTemplateByResourcesResponse updateStackTemplateByResourcesWithOptions(UpdateStackTemplateByResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateStackTemplateByResources", "HTTPS", "POST", "2019-09-10", "AK", null, TeaModel.buildMap(request), runtime), new UpdateStackTemplateByResourcesResponse());
    }

    public UpdateStackTemplateByResourcesResponse updateStackTemplateByResources(UpdateStackTemplateByResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateStackTemplateByResourcesWithOptions(request, runtime);
    }

    public GetStackDriftDetectionStatusResponse getStackDriftDetectionStatusWithOptions(GetStackDriftDetectionStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetStackDriftDetectionStatus", "HTTPS", "POST", "2019-09-10", "AK", null, TeaModel.buildMap(request), runtime), new GetStackDriftDetectionStatusResponse());
    }

    public GetStackDriftDetectionStatusResponse getStackDriftDetectionStatus(GetStackDriftDetectionStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getStackDriftDetectionStatusWithOptions(request, runtime);
    }

    public DetectStackGroupDriftResponse detectStackGroupDriftWithOptions(DetectStackGroupDriftRequest tmp, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmp);
        DetectStackGroupDriftShrinkRequest request = new DetectStackGroupDriftShrinkRequest();
        com.aliyun.common.Common.convert(tmp, request);
        if (!com.aliyun.teautil.Common.isUnset(tmp.operationPreferences)) {
            request.operationPreferencesShrink = com.aliyun.teautil.Common.toJSONString(tmp.operationPreferences);
        }

        return TeaModel.toModel(this.doRequest("DetectStackGroupDrift", "HTTPS", "POST", "2019-09-10", "AK", null, TeaModel.buildMap(request), runtime), new DetectStackGroupDriftResponse());
    }

    public DetectStackGroupDriftResponse detectStackGroupDrift(DetectStackGroupDriftRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.detectStackGroupDriftWithOptions(request, runtime);
    }

    public ListStackResourceDriftsResponse listStackResourceDriftsWithOptions(ListStackResourceDriftsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListStackResourceDrifts", "HTTPS", "POST", "2019-09-10", "AK", null, TeaModel.buildMap(request), runtime), new ListStackResourceDriftsResponse());
    }

    public ListStackResourceDriftsResponse listStackResourceDrifts(ListStackResourceDriftsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listStackResourceDriftsWithOptions(request, runtime);
    }

    public DetectStackResourceDriftResponse detectStackResourceDriftWithOptions(DetectStackResourceDriftRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DetectStackResourceDrift", "HTTPS", "POST", "2019-09-10", "AK", null, TeaModel.buildMap(request), runtime), new DetectStackResourceDriftResponse());
    }

    public DetectStackResourceDriftResponse detectStackResourceDrift(DetectStackResourceDriftRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.detectStackResourceDriftWithOptions(request, runtime);
    }

    public DetectStackDriftResponse detectStackDriftWithOptions(DetectStackDriftRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DetectStackDrift", "HTTPS", "POST", "2019-09-10", "AK", null, TeaModel.buildMap(request), runtime), new DetectStackDriftResponse());
    }

    public DetectStackDriftResponse detectStackDrift(DetectStackDriftRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.detectStackDriftWithOptions(request, runtime);
    }

    public UpdateStackInstancesResponse updateStackInstancesWithOptions(UpdateStackInstancesRequest tmp, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmp);
        UpdateStackInstancesShrinkRequest request = new UpdateStackInstancesShrinkRequest();
        com.aliyun.common.Common.convert(tmp, request);
        if (!com.aliyun.teautil.Common.isUnset(tmp.accountIds)) {
            request.accountIdsShrink = com.aliyun.teautil.Common.toJSONString(tmp.accountIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(tmp.regionIds)) {
            request.regionIdsShrink = com.aliyun.teautil.Common.toJSONString(tmp.regionIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(tmp.operationPreferences)) {
            request.operationPreferencesShrink = com.aliyun.teautil.Common.toJSONString(tmp.operationPreferences);
        }

        return TeaModel.toModel(this.doRequest("UpdateStackInstances", "HTTPS", "POST", "2019-09-10", "AK", null, TeaModel.buildMap(request), runtime), new UpdateStackInstancesResponse());
    }

    public UpdateStackInstancesResponse updateStackInstances(UpdateStackInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateStackInstancesWithOptions(request, runtime);
    }

    public ListStackGroupOperationsResponse listStackGroupOperationsWithOptions(ListStackGroupOperationsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListStackGroupOperations", "HTTPS", "POST", "2019-09-10", "AK", null, TeaModel.buildMap(request), runtime), new ListStackGroupOperationsResponse());
    }

    public ListStackGroupOperationsResponse listStackGroupOperations(ListStackGroupOperationsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listStackGroupOperationsWithOptions(request, runtime);
    }

    public GetStackGroupResponse getStackGroupWithOptions(GetStackGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetStackGroup", "HTTPS", "POST", "2019-09-10", "AK", null, TeaModel.buildMap(request), runtime), new GetStackGroupResponse());
    }

    public GetStackGroupResponse getStackGroup(GetStackGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getStackGroupWithOptions(request, runtime);
    }

    public GetStackGroupOperationResponse getStackGroupOperationWithOptions(GetStackGroupOperationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetStackGroupOperation", "HTTPS", "POST", "2019-09-10", "AK", null, TeaModel.buildMap(request), runtime), new GetStackGroupOperationResponse());
    }

    public GetStackGroupOperationResponse getStackGroupOperation(GetStackGroupOperationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getStackGroupOperationWithOptions(request, runtime);
    }

    public ListStackGroupsResponse listStackGroupsWithOptions(ListStackGroupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListStackGroups", "HTTPS", "POST", "2019-09-10", "AK", null, TeaModel.buildMap(request), runtime), new ListStackGroupsResponse());
    }

    public ListStackGroupsResponse listStackGroups(ListStackGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listStackGroupsWithOptions(request, runtime);
    }

    public CreateStackInstancesResponse createStackInstancesWithOptions(CreateStackInstancesRequest tmp, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmp);
        CreateStackInstancesShrinkRequest request = new CreateStackInstancesShrinkRequest();
        com.aliyun.common.Common.convert(tmp, request);
        if (!com.aliyun.teautil.Common.isUnset(tmp.accountIds)) {
            request.accountIdsShrink = com.aliyun.teautil.Common.toJSONString(tmp.accountIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(tmp.regionIds)) {
            request.regionIdsShrink = com.aliyun.teautil.Common.toJSONString(tmp.regionIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(tmp.operationPreferences)) {
            request.operationPreferencesShrink = com.aliyun.teautil.Common.toJSONString(tmp.operationPreferences);
        }

        return TeaModel.toModel(this.doRequest("CreateStackInstances", "HTTPS", "POST", "2019-09-10", "AK", null, TeaModel.buildMap(request), runtime), new CreateStackInstancesResponse());
    }

    public CreateStackInstancesResponse createStackInstances(CreateStackInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createStackInstancesWithOptions(request, runtime);
    }

    public CreateStackGroupResponse createStackGroupWithOptions(CreateStackGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateStackGroup", "HTTPS", "POST", "2019-09-10", "AK", null, TeaModel.buildMap(request), runtime), new CreateStackGroupResponse());
    }

    public CreateStackGroupResponse createStackGroup(CreateStackGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createStackGroupWithOptions(request, runtime);
    }

    public GetStackInstanceResponse getStackInstanceWithOptions(GetStackInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetStackInstance", "HTTPS", "POST", "2019-09-10", "AK", null, TeaModel.buildMap(request), runtime), new GetStackInstanceResponse());
    }

    public GetStackInstanceResponse getStackInstance(GetStackInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getStackInstanceWithOptions(request, runtime);
    }

    public UpdateStackGroupResponse updateStackGroupWithOptions(UpdateStackGroupRequest tmp, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmp);
        UpdateStackGroupShrinkRequest request = new UpdateStackGroupShrinkRequest();
        com.aliyun.common.Common.convert(tmp, request);
        if (!com.aliyun.teautil.Common.isUnset(tmp.accountIds)) {
            request.accountIdsShrink = com.aliyun.teautil.Common.toJSONString(tmp.accountIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(tmp.regionIds)) {
            request.regionIdsShrink = com.aliyun.teautil.Common.toJSONString(tmp.regionIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(tmp.operationPreferences)) {
            request.operationPreferencesShrink = com.aliyun.teautil.Common.toJSONString(tmp.operationPreferences);
        }

        return TeaModel.toModel(this.doRequest("UpdateStackGroup", "HTTPS", "POST", "2019-09-10", "AK", null, TeaModel.buildMap(request), runtime), new UpdateStackGroupResponse());
    }

    public UpdateStackGroupResponse updateStackGroup(UpdateStackGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateStackGroupWithOptions(request, runtime);
    }

    public ListStackInstancesResponse listStackInstancesWithOptions(ListStackInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListStackInstances", "HTTPS", "POST", "2019-09-10", "AK", null, TeaModel.buildMap(request), runtime), new ListStackInstancesResponse());
    }

    public ListStackInstancesResponse listStackInstances(ListStackInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listStackInstancesWithOptions(request, runtime);
    }

    public ListStackGroupOperationResultsResponse listStackGroupOperationResultsWithOptions(ListStackGroupOperationResultsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListStackGroupOperationResults", "HTTPS", "POST", "2019-09-10", "AK", null, TeaModel.buildMap(request), runtime), new ListStackGroupOperationResultsResponse());
    }

    public ListStackGroupOperationResultsResponse listStackGroupOperationResults(ListStackGroupOperationResultsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listStackGroupOperationResultsWithOptions(request, runtime);
    }

    public StopStackGroupOperationResponse stopStackGroupOperationWithOptions(StopStackGroupOperationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("StopStackGroupOperation", "HTTPS", "POST", "2019-09-10", "AK", null, TeaModel.buildMap(request), runtime), new StopStackGroupOperationResponse());
    }

    public StopStackGroupOperationResponse stopStackGroupOperation(StopStackGroupOperationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopStackGroupOperationWithOptions(request, runtime);
    }

    public DeleteStackGroupResponse deleteStackGroupWithOptions(DeleteStackGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteStackGroup", "HTTPS", "POST", "2019-09-10", "AK", null, TeaModel.buildMap(request), runtime), new DeleteStackGroupResponse());
    }

    public DeleteStackGroupResponse deleteStackGroup(DeleteStackGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteStackGroupWithOptions(request, runtime);
    }

    public DeleteStackInstancesResponse deleteStackInstancesWithOptions(DeleteStackInstancesRequest tmp, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmp);
        DeleteStackInstancesShrinkRequest request = new DeleteStackInstancesShrinkRequest();
        com.aliyun.common.Common.convert(tmp, request);
        if (!com.aliyun.teautil.Common.isUnset(tmp.accountIds)) {
            request.accountIdsShrink = com.aliyun.teautil.Common.toJSONString(tmp.accountIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(tmp.regionIds)) {
            request.regionIdsShrink = com.aliyun.teautil.Common.toJSONString(tmp.regionIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(tmp.operationPreferences)) {
            request.operationPreferencesShrink = com.aliyun.teautil.Common.toJSONString(tmp.operationPreferences);
        }

        return TeaModel.toModel(this.doRequest("DeleteStackInstances", "HTTPS", "POST", "2019-09-10", "AK", null, TeaModel.buildMap(request), runtime), new DeleteStackInstancesResponse());
    }

    public DeleteStackInstancesResponse deleteStackInstances(DeleteStackInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteStackInstancesWithOptions(request, runtime);
    }

    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListTagResources", "HTTPS", "POST", "2019-09-10", "AK", null, TeaModel.buildMap(request), runtime), new ListTagResourcesResponse());
    }

    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    public UntagResourcesResponse untagResourcesWithOptions(UntagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UntagResources", "HTTPS", "POST", "2019-09-10", "AK", null, TeaModel.buildMap(request), runtime), new UntagResourcesResponse());
    }

    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.untagResourcesWithOptions(request, runtime);
    }

    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("TagResources", "HTTPS", "POST", "2019-09-10", "AK", null, TeaModel.buildMap(request), runtime), new TagResourcesResponse());
    }

    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

    public DeleteTemplateResponse deleteTemplateWithOptions(DeleteTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteTemplate", "HTTPS", "POST", "2019-09-10", "AK", null, TeaModel.buildMap(request), runtime), new DeleteTemplateResponse());
    }

    public DeleteTemplateResponse deleteTemplate(DeleteTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteTemplateWithOptions(request, runtime);
    }

    public UpdateTemplateResponse updateTemplateWithOptions(UpdateTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateTemplate", "HTTPS", "POST", "2019-09-10", "AK", null, TeaModel.buildMap(request), runtime), new UpdateTemplateResponse());
    }

    public UpdateTemplateResponse updateTemplate(UpdateTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateTemplateWithOptions(request, runtime);
    }

    public ListTemplatesResponse listTemplatesWithOptions(ListTemplatesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListTemplates", "HTTPS", "POST", "2019-09-10", "AK", null, TeaModel.buildMap(request), runtime), new ListTemplatesResponse());
    }

    public ListTemplatesResponse listTemplates(ListTemplatesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTemplatesWithOptions(request, runtime);
    }

    public CreateTemplateResponse createTemplateWithOptions(CreateTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateTemplate", "HTTPS", "POST", "2019-09-10", "AK", null, TeaModel.buildMap(request), runtime), new CreateTemplateResponse());
    }

    public CreateTemplateResponse createTemplate(CreateTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createTemplateWithOptions(request, runtime);
    }

    public CreateStackResponse createStackWithOptions(CreateStackRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateStack", "HTTPS", "POST", "2019-09-10", "AK", null, TeaModel.buildMap(request), runtime), new CreateStackResponse());
    }

    public CreateStackResponse createStack(CreateStackRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createStackWithOptions(request, runtime);
    }

    public GetStackResponse getStackWithOptions(GetStackRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetStack", "HTTPS", "POST", "2019-09-10", "AK", null, TeaModel.buildMap(request), runtime), new GetStackResponse());
    }

    public GetStackResponse getStack(GetStackRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getStackWithOptions(request, runtime);
    }

    public DeleteStackResponse deleteStackWithOptions(DeleteStackRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteStack", "HTTPS", "POST", "2019-09-10", "AK", null, TeaModel.buildMap(request), runtime), new DeleteStackResponse());
    }

    public DeleteStackResponse deleteStack(DeleteStackRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteStackWithOptions(request, runtime);
    }

    public UpdateStackResponse updateStackWithOptions(UpdateStackRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateStack", "HTTPS", "POST", "2019-09-10", "AK", null, TeaModel.buildMap(request), runtime), new UpdateStackResponse());
    }

    public UpdateStackResponse updateStack(UpdateStackRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateStackWithOptions(request, runtime);
    }

    public ListStacksResponse listStacksWithOptions(ListStacksRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListStacks", "HTTPS", "POST", "2019-09-10", "AK", null, TeaModel.buildMap(request), runtime), new ListStacksResponse());
    }

    public ListStacksResponse listStacks(ListStacksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listStacksWithOptions(request, runtime);
    }

    public PreviewStackResponse previewStackWithOptions(PreviewStackRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("PreviewStack", "HTTPS", "POST", "2019-09-10", "AK", null, TeaModel.buildMap(request), runtime), new PreviewStackResponse());
    }

    public PreviewStackResponse previewStack(PreviewStackRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.previewStackWithOptions(request, runtime);
    }

    public GetTemplateEstimateCostResponse getTemplateEstimateCostWithOptions(GetTemplateEstimateCostRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetTemplateEstimateCost", "HTTPS", "POST", "2019-09-10", "AK", null, TeaModel.buildMap(request), runtime), new GetTemplateEstimateCostResponse());
    }

    public GetTemplateEstimateCostResponse getTemplateEstimateCost(GetTemplateEstimateCostRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getTemplateEstimateCostWithOptions(request, runtime);
    }

    public CancelUpdateStackResponse cancelUpdateStackWithOptions(CancelUpdateStackRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CancelUpdateStack", "HTTPS", "POST", "2019-09-10", "AK", null, TeaModel.buildMap(request), runtime), new CancelUpdateStackResponse());
    }

    public CancelUpdateStackResponse cancelUpdateStack(CancelUpdateStackRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cancelUpdateStackWithOptions(request, runtime);
    }

    public ContinueCreateStackResponse continueCreateStackWithOptions(ContinueCreateStackRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ContinueCreateStack", "HTTPS", "POST", "2019-09-10", "AK", null, TeaModel.buildMap(request), runtime), new ContinueCreateStackResponse());
    }

    public ContinueCreateStackResponse continueCreateStack(ContinueCreateStackRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.continueCreateStackWithOptions(request, runtime);
    }

    public SetStackPolicyResponse setStackPolicyWithOptions(SetStackPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SetStackPolicy", "HTTPS", "POST", "2019-09-10", "AK", null, TeaModel.buildMap(request), runtime), new SetStackPolicyResponse());
    }

    public SetStackPolicyResponse setStackPolicy(SetStackPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setStackPolicyWithOptions(request, runtime);
    }

    public GetStackPolicyResponse getStackPolicyWithOptions(GetStackPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetStackPolicy", "HTTPS", "POST", "2019-09-10", "AK", null, TeaModel.buildMap(request), runtime), new GetStackPolicyResponse());
    }

    public GetStackPolicyResponse getStackPolicy(GetStackPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getStackPolicyWithOptions(request, runtime);
    }

    public ValidateTemplateResponse validateTemplateWithOptions(ValidateTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ValidateTemplate", "HTTPS", "POST", "2019-09-10", "AK", null, TeaModel.buildMap(request), runtime), new ValidateTemplateResponse());
    }

    public ValidateTemplateResponse validateTemplate(ValidateTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.validateTemplateWithOptions(request, runtime);
    }

    public GetTemplateResponse getTemplateWithOptions(GetTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetTemplate", "HTTPS", "POST", "2019-09-10", "AK", null, TeaModel.buildMap(request), runtime), new GetTemplateResponse());
    }

    public GetTemplateResponse getTemplate(GetTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getTemplateWithOptions(request, runtime);
    }

    public GetChangeSetResponse getChangeSetWithOptions(GetChangeSetRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetChangeSet", "HTTPS", "POST", "2019-09-10", "AK", null, TeaModel.buildMap(request), runtime), new GetChangeSetResponse());
    }

    public GetChangeSetResponse getChangeSet(GetChangeSetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getChangeSetWithOptions(request, runtime);
    }

    public ListChangeSetsResponse listChangeSetsWithOptions(ListChangeSetsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListChangeSets", "HTTPS", "POST", "2019-09-10", "AK", null, TeaModel.buildMap(request), runtime), new ListChangeSetsResponse());
    }

    public ListChangeSetsResponse listChangeSets(ListChangeSetsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listChangeSetsWithOptions(request, runtime);
    }

    public ExecuteChangeSetResponse executeChangeSetWithOptions(ExecuteChangeSetRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ExecuteChangeSet", "HTTPS", "POST", "2019-09-10", "AK", null, TeaModel.buildMap(request), runtime), new ExecuteChangeSetResponse());
    }

    public ExecuteChangeSetResponse executeChangeSet(ExecuteChangeSetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.executeChangeSetWithOptions(request, runtime);
    }

    public DeleteChangeSetResponse deleteChangeSetWithOptions(DeleteChangeSetRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteChangeSet", "HTTPS", "POST", "2019-09-10", "AK", null, TeaModel.buildMap(request), runtime), new DeleteChangeSetResponse());
    }

    public DeleteChangeSetResponse deleteChangeSet(DeleteChangeSetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteChangeSetWithOptions(request, runtime);
    }

    public ListStackEventsResponse listStackEventsWithOptions(ListStackEventsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListStackEvents", "HTTPS", "POST", "2019-09-10", "AK", null, TeaModel.buildMap(request), runtime), new ListStackEventsResponse());
    }

    public ListStackEventsResponse listStackEvents(ListStackEventsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listStackEventsWithOptions(request, runtime);
    }

    public ListStackResourcesResponse listStackResourcesWithOptions(ListStackResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListStackResources", "HTTPS", "POST", "2019-09-10", "AK", null, TeaModel.buildMap(request), runtime), new ListStackResourcesResponse());
    }

    public ListStackResourcesResponse listStackResources(ListStackResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listStackResourcesWithOptions(request, runtime);
    }

    public GetStackResourceResponse getStackResourceWithOptions(GetStackResourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetStackResource", "HTTPS", "POST", "2019-09-10", "AK", null, TeaModel.buildMap(request), runtime), new GetStackResourceResponse());
    }

    public GetStackResourceResponse getStackResource(GetStackResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getStackResourceWithOptions(request, runtime);
    }

    public GetResourceTypeTemplateResponse getResourceTypeTemplateWithOptions(GetResourceTypeTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetResourceTypeTemplate", "HTTPS", "POST", "2019-09-10", "AK", null, TeaModel.buildMap(request), runtime), new GetResourceTypeTemplateResponse());
    }

    public GetResourceTypeTemplateResponse getResourceTypeTemplate(GetResourceTypeTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getResourceTypeTemplateWithOptions(request, runtime);
    }

    public GetResourceTypeResponse getResourceTypeWithOptions(GetResourceTypeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetResourceType", "HTTPS", "POST", "2019-09-10", "AK", null, TeaModel.buildMap(request), runtime), new GetResourceTypeResponse());
    }

    public GetResourceTypeResponse getResourceType(GetResourceTypeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getResourceTypeWithOptions(request, runtime);
    }

    public ListResourceTypesResponse listResourceTypesWithOptions(ListResourceTypesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListResourceTypes", "HTTPS", "POST", "2019-09-10", "AK", null, TeaModel.buildMap(request), runtime), new ListResourceTypesResponse());
    }

    public ListResourceTypesResponse listResourceTypes(ListResourceTypesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listResourceTypesWithOptions(request, runtime);
    }

    public SignalResourceResponse signalResourceWithOptions(SignalResourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SignalResource", "HTTPS", "POST", "2019-09-10", "AK", null, TeaModel.buildMap(request), runtime), new SignalResourceResponse());
    }

    public SignalResourceResponse signalResource(SignalResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.signalResourceWithOptions(request, runtime);
    }

    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeRegions", "HTTPS", "POST", "2019-09-10", "AK", null, TeaModel.buildMap(request), runtime), new DescribeRegionsResponse());
    }

    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRegionsWithOptions(request, runtime);
    }

    public CreateChangeSetResponse createChangeSetWithOptions(CreateChangeSetRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateChangeSet", "HTTPS", "POST", "2019-09-10", "AK", null, TeaModel.buildMap(request), runtime), new CreateChangeSetResponse());
    }

    public CreateChangeSetResponse createChangeSet(CreateChangeSetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createChangeSetWithOptions(request, runtime);
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
