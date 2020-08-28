// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20150901;

import com.aliyun.tea.*;
import com.aliyun.ros20150901.models.*;

public class Client extends com.aliyun.tearoa.Client {
    public Client(com.aliyun.tearoa.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "central";
        this.checkConfig(config);
        this._endpointHost = this.getEndpoint(_productId, _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpointHost);
    }


    public CreateChangeSetResponse createChangeSetWithOptions(CreateChangeSetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2015-09-01", "HTTPS", "POST", "AK", "/changeSets", null, request.headers, null, runtime), new CreateChangeSetResponse());
    }

    public CreateChangeSetResponse createChangeSet(CreateChangeSetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createChangeSetWithOptions(request, runtime);
    }

    public DescribeChangeSetDetailResponse describeChangeSetDetailWithOptions(String stackName, String stackId, String changeSetName, DescribeChangeSetDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2015-09-01", "HTTPS", "GET", "AK", "/stacks/" + stackName + "/" + stackId + "/changeSets/" + changeSetName + "", null, request.headers, null, runtime), new DescribeChangeSetDetailResponse());
    }

    public DescribeChangeSetDetailResponse describeChangeSetDetail(String stackName, String stackId, String changeSetName, DescribeChangeSetDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeChangeSetDetailWithOptions(stackName, stackId, changeSetName, request, runtime);
    }

    public DescribeChangeSetsResponse describeChangeSetsWithOptions(String stackName, String stackId, DescribeChangeSetsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2015-09-01", "HTTPS", "GET", "AK", "/stacks/" + stackName + "/" + stackId + "/changeSets", null, request.headers, null, runtime), new DescribeChangeSetsResponse());
    }

    public DescribeChangeSetsResponse describeChangeSets(String stackName, String stackId, DescribeChangeSetsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeChangeSetsWithOptions(stackName, stackId, request, runtime);
    }

    public ExecuteChangeSetResponse executeChangeSetWithOptions(String stackName, String stackId, String changeSetName, ExecuteChangeSetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2015-09-01", "HTTPS", "PUT", "AK", "/stacks/" + stackName + "/" + stackId + "/changeSets/" + changeSetName + "/execute", null, request.headers, null, runtime), new ExecuteChangeSetResponse());
    }

    public ExecuteChangeSetResponse executeChangeSet(String stackName, String stackId, String changeSetName, ExecuteChangeSetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.executeChangeSetWithOptions(stackName, stackId, changeSetName, request, runtime);
    }

    public DeleteChangeSetResponse deleteChangeSetWithOptions(String stackName, String stackId, String changeSetName, DeleteChangeSetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2015-09-01", "HTTPS", "DELETE", "AK", "/stacks/" + stackName + "/" + stackId + "/changeSets/" + changeSetName + "", null, request.headers, null, runtime), new DeleteChangeSetResponse());
    }

    public DeleteChangeSetResponse deleteChangeSet(String stackName, String stackId, String changeSetName, DeleteChangeSetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteChangeSetWithOptions(stackName, stackId, changeSetName, request, runtime);
    }

    public ContinueCreateStackResponse continueCreateStackWithOptions(String stackName, String stackId, ContinueCreateStackRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2015-09-01", "HTTPS", "POST", "AK", "/stacks/" + stackName + "/" + stackId + "/continue", null, request.headers, null, runtime), new ContinueCreateStackResponse());
    }

    public ContinueCreateStackResponse continueCreateStack(String stackName, String stackId, ContinueCreateStackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.continueCreateStackWithOptions(stackName, stackId, request, runtime);
    }

    public CancelUpdateStackResponse cancelUpdateStackWithOptions(String stackName, String stackId, CancelUpdateStackRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2015-09-01", "HTTPS", "PUT", "AK", "/stacks/" + stackName + "/" + stackId + "/cancel", null, request.headers, null, runtime), new CancelUpdateStackResponse());
    }

    public CancelUpdateStackResponse cancelUpdateStack(String stackName, String stackId, CancelUpdateStackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelUpdateStackWithOptions(stackName, stackId, request, runtime);
    }

    public GetStackPolicyResponse getStackPolicyWithOptions(String stackName, String stackId, GetStackPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2015-09-01", "HTTPS", "GET", "AK", "/stacks/" + stackName + "/" + stackId + "/policy", null, request.headers, null, runtime), new GetStackPolicyResponse());
    }

    public GetStackPolicyResponse getStackPolicy(String stackName, String stackId, GetStackPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getStackPolicyWithOptions(stackName, stackId, request, runtime);
    }

    public SetStackPolicyResponse setStackPolicyWithOptions(String stackName, String stackId, SetStackPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2015-09-01", "HTTPS", "POST", "AK", "/stacks/" + stackName + "/" + stackId + "/policy", null, request.headers, null, runtime), new SetStackPolicyResponse());
    }

    public SetStackPolicyResponse setStackPolicy(String stackName, String stackId, SetStackPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setStackPolicyWithOptions(stackName, stackId, request, runtime);
    }

    public UpdateStackResponse updateStackWithOptions(String stackName, String stackId, UpdateStackRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2015-09-01", "HTTPS", "PUT", "AK", "/stacks/" + stackName + "/" + stackId + "", null, request.headers, null, runtime), new UpdateStackResponse());
    }

    public UpdateStackResponse updateStack(String stackName, String stackId, UpdateStackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateStackWithOptions(stackName, stackId, request, runtime);
    }

    public WaitConditionsResponse waitConditionsWithOptions(WaitConditionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2015-09-01", "HTTPS", "POST", "Anonymous", "/waitcondition", com.aliyun.teautil.Common.stringifyMapValue(TeaModel.buildMap(request.query)), request.headers, null, runtime), new WaitConditionsResponse());
    }

    public WaitConditionsResponse waitConditions(WaitConditionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.waitConditionsWithOptions(request, runtime);
    }

    public InquiryStackResponse inquiryStackWithOptions(InquiryStackRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2015-09-01", "HTTPS", "POST", "AK", "/stacks/inquiry", null, request.headers, null, runtime), new InquiryStackResponse());
    }

    public InquiryStackResponse inquiryStack(InquiryStackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.inquiryStackWithOptions(request, runtime);
    }

    public PreviewStackResponse previewStackWithOptions(PreviewStackRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2015-09-01", "HTTPS", "POST", "AK", "/stacks/preview", null, request.headers, null, runtime), new PreviewStackResponse());
    }

    public PreviewStackResponse previewStack(PreviewStackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.previewStackWithOptions(request, runtime);
    }

    public DoActionsResponse doActionsWithOptions(String stackName, String stackId, DoActionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2015-09-01", "HTTPS", "POST", "AK", "/stacks/" + stackName + "/" + stackId + "/actions", null, request.headers, null, runtime), new DoActionsResponse());
    }

    public DoActionsResponse doActions(String stackName, String stackId, DoActionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.doActionsWithOptions(stackName, stackId, request, runtime);
    }

    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2015-09-01", "HTTPS", "GET", "AK", "/regions", null, request.headers, null, runtime), new DescribeRegionsResponse());
    }

    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRegionsWithOptions(request, runtime);
    }

    public DescribeEventsResponse describeEventsWithOptions(String stackName, String stackId, DescribeEventsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2015-09-01", "HTTPS", "GET", "AK", "/stacks/" + stackName + "/" + stackId + "/events", com.aliyun.teautil.Common.stringifyMapValue(TeaModel.buildMap(request.query)), request.headers, null, runtime), new DescribeEventsResponse());
    }

    public DescribeEventsResponse describeEvents(String stackName, String stackId, DescribeEventsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEventsWithOptions(stackName, stackId, request, runtime);
    }

    public DeleteStackResponse deleteStackWithOptions(String stackName, String stackId, DeleteStackRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2015-09-01", "HTTPS", "DELETE", "AK", "/stacks/" + stackName + "/" + stackId + "", com.aliyun.teautil.Common.stringifyMapValue(TeaModel.buildMap(request.query)), request.headers, null, runtime), new DeleteStackResponse());
    }

    public DeleteStackResponse deleteStack(String stackName, String stackId, DeleteStackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteStackWithOptions(stackName, stackId, request, runtime);
    }

    public CreateStacksResponse createStacksWithOptions(CreateStacksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2015-09-01", "HTTPS", "POST", "AK", "/stacks", null, request.headers, null, runtime), new CreateStacksResponse());
    }

    public CreateStacksResponse createStacks(CreateStacksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createStacksWithOptions(request, runtime);
    }

    public AbandonStackResponse abandonStackWithOptions(String stackName, String stackId, AbandonStackRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2015-09-01", "HTTPS", "DELETE", "AK", "/stacks/" + stackName + "/" + stackId + "/abandon", null, request.headers, null, runtime), new AbandonStackResponse());
    }

    public AbandonStackResponse abandonStack(String stackName, String stackId, AbandonStackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.abandonStackWithOptions(stackName, stackId, request, runtime);
    }

    public DescribeResourceTypesResponse describeResourceTypesWithOptions(DescribeResourceTypesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2015-09-01", "HTTPS", "GET", "AK", "/resource_types", com.aliyun.teautil.Common.stringifyMapValue(TeaModel.buildMap(request.query)), request.headers, null, runtime), new DescribeResourceTypesResponse());
    }

    public DescribeResourceTypesResponse describeResourceTypes(DescribeResourceTypesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeResourceTypesWithOptions(request, runtime);
    }

    public DescribeResourceTypeDetailResponse describeResourceTypeDetailWithOptions(String typeName, DescribeResourceTypeDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2015-09-01", "HTTPS", "GET", "AK", "/resource_types/" + typeName + "", null, request.headers, null, runtime), new DescribeResourceTypeDetailResponse());
    }

    public DescribeResourceTypeDetailResponse describeResourceTypeDetail(String typeName, DescribeResourceTypeDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeResourceTypeDetailWithOptions(typeName, request, runtime);
    }

    public DescribeResourcesResponse describeResourcesWithOptions(String stackName, String stackId, DescribeResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2015-09-01", "HTTPS", "GET", "AK", "/stacks/" + stackName + "/" + stackId + "/resources", null, request.headers, null, runtime), new DescribeResourcesResponse());
    }

    public DescribeResourcesResponse describeResources(String stackName, String stackId, DescribeResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeResourcesWithOptions(stackName, stackId, request, runtime);
    }

    public DescribeResourceDetailResponse describeResourceDetailWithOptions(String stackName, String stackId, String resourceName, DescribeResourceDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2015-09-01", "HTTPS", "GET", "AK", "/stacks/" + stackName + "/" + stackId + "/resources/" + resourceName + "", null, request.headers, null, runtime), new DescribeResourceDetailResponse());
    }

    public DescribeResourceDetailResponse describeResourceDetail(String stackName, String stackId, String resourceName, DescribeResourceDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeResourceDetailWithOptions(stackName, stackId, resourceName, request, runtime);
    }

    public DescribeResourceTypeTemplateResponse describeResourceTypeTemplateWithOptions(String typeName, DescribeResourceTypeTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2015-09-01", "HTTPS", "GET", "AK", "/resource_types/" + typeName + "/template", null, request.headers, null, runtime), new DescribeResourceTypeTemplateResponse());
    }

    public DescribeResourceTypeTemplateResponse describeResourceTypeTemplate(String typeName, DescribeResourceTypeTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeResourceTypeTemplateWithOptions(typeName, request, runtime);
    }

    public DescribeStacksResponse describeStacksWithOptions(DescribeStacksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2015-09-01", "HTTPS", "GET", "AK", "/stacks", com.aliyun.teautil.Common.stringifyMapValue(TeaModel.buildMap(request.query)), request.headers, null, runtime), new DescribeStacksResponse());
    }

    public DescribeStacksResponse describeStacks(DescribeStacksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeStacksWithOptions(request, runtime);
    }

    public DescribeStackDetailResponse describeStackDetailWithOptions(String stackName, String stackId, DescribeStackDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2015-09-01", "HTTPS", "GET", "AK", "/stacks/" + stackName + "/" + stackId + "", null, request.headers, null, runtime), new DescribeStackDetailResponse());
    }

    public DescribeStackDetailResponse describeStackDetail(String stackName, String stackId, DescribeStackDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeStackDetailWithOptions(stackName, stackId, request, runtime);
    }

    public ValidateTemplateResponse validateTemplateWithOptions(ValidateTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2015-09-01", "HTTPS", "POST", "AK", "/validate", null, request.headers, null, runtime), new ValidateTemplateResponse());
    }

    public ValidateTemplateResponse validateTemplate(ValidateTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.validateTemplateWithOptions(request, runtime);
    }

    public DescribeTemplateResponse describeTemplateWithOptions(String stackName, String stackId, DescribeTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2015-09-01", "HTTPS", "GET", "AK", "/stacks/" + stackName + "/" + stackId + "/template", null, request.headers, null, runtime), new DescribeTemplateResponse());
    }

    public DescribeTemplateResponse describeTemplate(String stackName, String stackId, DescribeTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTemplateWithOptions(stackName, stackId, request, runtime);
    }

    public String getEndpoint(String productId, String regionId, String endpointRule, String network, String suffix, java.util.Map<String, String> endpointMap, String endpoint) throws Exception {
        if (!com.aliyun.teautil.Common.empty(endpoint)) {
            return endpoint;
        }

        if (!com.aliyun.teautil.Common.isUnset(endpointMap) && !com.aliyun.teautil.Common.empty(endpointMap.get("regionId"))) {
            return endpointMap.get("regionId");
        }

        return com.aliyun.endpointutil.Client.getEndpointRules(productId, regionId, endpointRule, network, suffix);
    }
}
