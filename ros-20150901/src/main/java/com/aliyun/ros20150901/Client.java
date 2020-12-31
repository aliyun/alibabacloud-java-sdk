// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20150901;

import com.aliyun.tea.*;
import com.aliyun.ros20150901.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "central";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("ros", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AbandonStackResponse abandonStack(String StackName, String StackId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.abandonStackWithOptions(StackName, StackId, headers, runtime);
    }

    public AbandonStackResponse abandonStackWithOptions(String StackName, String StackId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("AbandonStack", "2015-09-01", "HTTPS", "DELETE", "AK", "/stacks/" + StackName + "/{StackId}/abandon", "none", req, runtime), new AbandonStackResponse());
    }

    public CancelUpdateStackResponse cancelUpdateStack(String StackName, String StackId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelUpdateStackWithOptions(StackName, StackId, headers, runtime);
    }

    public CancelUpdateStackResponse cancelUpdateStackWithOptions(String StackName, String StackId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("CancelUpdateStack", "2015-09-01", "HTTPS", "PUT", "AK", "/stacks/" + StackName + "/{StackId}/cancel", "none", req, runtime), new CancelUpdateStackResponse());
    }

    public ContinueCreateStackResponse continueCreateStack(String StackName, String StackId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.continueCreateStackWithOptions(StackName, StackId, headers, runtime);
    }

    public ContinueCreateStackResponse continueCreateStackWithOptions(String StackName, String StackId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("ContinueCreateStack", "2015-09-01", "HTTPS", "POST", "AK", "/stacks/" + StackName + "/{StackId}/continue", "none", req, runtime), new ContinueCreateStackResponse());
    }

    public CreateChangeSetResponse createChangeSet() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createChangeSetWithOptions(headers, runtime);
    }

    public CreateChangeSetResponse createChangeSetWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("CreateChangeSet", "2015-09-01", "HTTPS", "POST", "AK", "/changeSets", "json", req, runtime), new CreateChangeSetResponse());
    }

    public CreateStacksResponse createStacks() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createStacksWithOptions(headers, runtime);
    }

    public CreateStacksResponse createStacksWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("CreateStacks", "2015-09-01", "HTTPS", "POST", "AK", "/stacks", "none", req, runtime), new CreateStacksResponse());
    }

    public DeleteChangeSetResponse deleteChangeSet(String StackName, String StackId, String ChangeSetName) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteChangeSetWithOptions(StackName, StackId, ChangeSetName, headers, runtime);
    }

    public DeleteChangeSetResponse deleteChangeSetWithOptions(String StackName, String StackId, String ChangeSetName, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DeleteChangeSet", "2015-09-01", "HTTPS", "DELETE", "AK", "/stacks/" + StackName + "/{StackId}/changeSets/{ChangeSetName}", "json", req, runtime), new DeleteChangeSetResponse());
    }

    public DeleteStackResponse deleteStack(String StackName, String StackId, DeleteStackRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteStackWithOptions(StackName, StackId, request, headers, runtime);
    }

    public DeleteStackResponse deleteStackWithOptions(String StackName, String StackId, DeleteStackRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DeleteStack", "2015-09-01", "HTTPS", "DELETE", "AK", "/stacks/" + StackName + "/{StackId}", "none", req, runtime), new DeleteStackResponse());
    }

    public DescribeChangeSetDetailResponse describeChangeSetDetail(String StackName, String StackId, String ChangeSetName) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeChangeSetDetailWithOptions(StackName, StackId, ChangeSetName, headers, runtime);
    }

    public DescribeChangeSetDetailResponse describeChangeSetDetailWithOptions(String StackName, String StackId, String ChangeSetName, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DescribeChangeSetDetail", "2015-09-01", "HTTPS", "GET", "AK", "/stacks/" + StackName + "/{StackId}/changeSets/{ChangeSetName}", "json", req, runtime), new DescribeChangeSetDetailResponse());
    }

    public DescribeChangeSetsResponse describeChangeSets(String StackName, String StackId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeChangeSetsWithOptions(StackName, StackId, headers, runtime);
    }

    public DescribeChangeSetsResponse describeChangeSetsWithOptions(String StackName, String StackId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DescribeChangeSets", "2015-09-01", "HTTPS", "GET", "AK", "/stacks/" + StackName + "/{StackId}/changeSets", "json", req, runtime), new DescribeChangeSetsResponse());
    }

    public DescribeEventsResponse describeEvents(String StackName, String StackId, DescribeEventsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeEventsWithOptions(StackName, StackId, request, headers, runtime);
    }

    public DescribeEventsResponse describeEventsWithOptions(String StackName, String StackId, DescribeEventsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceStatus)) {
            query.put("ResourceStatus", request.resourceStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceName)) {
            query.put("ResourceName", request.resourceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DescribeEvents", "2015-09-01", "HTTPS", "GET", "AK", "/stacks/" + StackName + "/{StackId}/events", "none", req, runtime), new DescribeEventsResponse());
    }

    public DescribeRegionsResponse describeRegions() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeRegionsWithOptions(headers, runtime);
    }

    public DescribeRegionsResponse describeRegionsWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DescribeRegions", "2015-09-01", "HTTPS", "GET", "AK", "/regions", "none", req, runtime), new DescribeRegionsResponse());
    }

    public DescribeResourceDetailResponse describeResourceDetail(String StackName, String StackId, String ResourceName) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeResourceDetailWithOptions(StackName, StackId, ResourceName, headers, runtime);
    }

    public DescribeResourceDetailResponse describeResourceDetailWithOptions(String StackName, String StackId, String ResourceName, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DescribeResourceDetail", "2015-09-01", "HTTPS", "GET", "AK", "/stacks/" + StackName + "/{StackId}/resources/{ResourceName}", "none", req, runtime), new DescribeResourceDetailResponse());
    }

    public DescribeResourcesResponse describeResources(String StackName, String StackId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeResourcesWithOptions(StackName, StackId, headers, runtime);
    }

    public DescribeResourcesResponse describeResourcesWithOptions(String StackName, String StackId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DescribeResources", "2015-09-01", "HTTPS", "GET", "AK", "/stacks/" + StackName + "/{StackId}/resources", "none", req, runtime), new DescribeResourcesResponse());
    }

    public DescribeResourceTypeDetailResponse describeResourceTypeDetail(String TypeName) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeResourceTypeDetailWithOptions(TypeName, headers, runtime);
    }

    public DescribeResourceTypeDetailResponse describeResourceTypeDetailWithOptions(String TypeName, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DescribeResourceTypeDetail", "2015-09-01", "HTTPS", "GET", "AK", "/resource_types/" + TypeName + "", "none", req, runtime), new DescribeResourceTypeDetailResponse());
    }

    public DescribeResourceTypesResponse describeResourceTypes(DescribeResourceTypesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeResourceTypesWithOptions(request, headers, runtime);
    }

    public DescribeResourceTypesResponse describeResourceTypesWithOptions(DescribeResourceTypesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.supportStatus)) {
            query.put("SupportStatus", request.supportStatus);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DescribeResourceTypes", "2015-09-01", "HTTPS", "GET", "AK", "/resource_types", "none", req, runtime), new DescribeResourceTypesResponse());
    }

    public DescribeResourceTypeTemplateResponse describeResourceTypeTemplate(String TypeName) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeResourceTypeTemplateWithOptions(TypeName, headers, runtime);
    }

    public DescribeResourceTypeTemplateResponse describeResourceTypeTemplateWithOptions(String TypeName, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DescribeResourceTypeTemplate", "2015-09-01", "HTTPS", "GET", "AK", "/resource_types/" + TypeName + "/template", "none", req, runtime), new DescribeResourceTypeTemplateResponse());
    }

    public DescribeStackDetailResponse describeStackDetail(String StackName, String StackId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeStackDetailWithOptions(StackName, StackId, headers, runtime);
    }

    public DescribeStackDetailResponse describeStackDetailWithOptions(String StackName, String StackId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DescribeStackDetail", "2015-09-01", "HTTPS", "GET", "AK", "/stacks/" + StackName + "/{StackId}", "none", req, runtime), new DescribeStackDetailResponse());
    }

    public DescribeStacksResponse describeStacks(DescribeStacksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeStacksWithOptions(request, headers, runtime);
    }

    public DescribeStacksResponse describeStacksWithOptions(DescribeStacksRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stackId)) {
            query.put("StackId", request.stackId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DescribeStacks", "2015-09-01", "HTTPS", "GET", "AK", "/stacks", "none", req, runtime), new DescribeStacksResponse());
    }

    public DescribeTemplateResponse describeTemplate(String StackName, String StackId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeTemplateWithOptions(StackName, StackId, headers, runtime);
    }

    public DescribeTemplateResponse describeTemplateWithOptions(String StackName, String StackId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DescribeTemplate", "2015-09-01", "HTTPS", "GET", "AK", "/stacks/" + StackName + "/{StackId}/template", "none", req, runtime), new DescribeTemplateResponse());
    }

    public DoActionsResponse doActions(String StackName, String StackId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.doActionsWithOptions(StackName, StackId, headers, runtime);
    }

    public DoActionsResponse doActionsWithOptions(String StackName, String StackId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DoActions", "2015-09-01", "HTTPS", "POST", "AK", "/stacks/" + StackName + "/{StackId}/actions", "none", req, runtime), new DoActionsResponse());
    }

    public ExecuteChangeSetResponse executeChangeSet(String StackName, String StackId, String ChangeSetName) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.executeChangeSetWithOptions(StackName, StackId, ChangeSetName, headers, runtime);
    }

    public ExecuteChangeSetResponse executeChangeSetWithOptions(String StackName, String StackId, String ChangeSetName, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("ExecuteChangeSet", "2015-09-01", "HTTPS", "PUT", "AK", "/stacks/" + StackName + "/{StackId}/changeSets/{ChangeSetName}/execute", "json", req, runtime), new ExecuteChangeSetResponse());
    }

    public GetStackPolicyResponse getStackPolicy(String StackName, String StackId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getStackPolicyWithOptions(StackName, StackId, headers, runtime);
    }

    public GetStackPolicyResponse getStackPolicyWithOptions(String StackName, String StackId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("GetStackPolicy", "2015-09-01", "HTTPS", "GET", "AK", "/stacks/" + StackName + "/{StackId}/policy", "none", req, runtime), new GetStackPolicyResponse());
    }

    public InquiryStackResponse inquiryStack() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.inquiryStackWithOptions(headers, runtime);
    }

    public InquiryStackResponse inquiryStackWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("InquiryStack", "2015-09-01", "HTTPS", "POST", "AK", "/stacks/inquiry", "none", req, runtime), new InquiryStackResponse());
    }

    public PreviewStackResponse previewStack() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.previewStackWithOptions(headers, runtime);
    }

    public PreviewStackResponse previewStackWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("PreviewStack", "2015-09-01", "HTTPS", "POST", "AK", "/stacks/preview", "none", req, runtime), new PreviewStackResponse());
    }

    public SetStackPolicyResponse setStackPolicy(String StackName, String StackId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.setStackPolicyWithOptions(StackName, StackId, headers, runtime);
    }

    public SetStackPolicyResponse setStackPolicyWithOptions(String StackName, String StackId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("SetStackPolicy", "2015-09-01", "HTTPS", "POST", "AK", "/stacks/" + StackName + "/{StackId}/policy", "none", req, runtime), new SetStackPolicyResponse());
    }

    public UpdateStackResponse updateStack(String StackName, String StackId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateStackWithOptions(StackName, StackId, headers, runtime);
    }

    public UpdateStackResponse updateStackWithOptions(String StackName, String StackId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("UpdateStack", "2015-09-01", "HTTPS", "PUT", "AK", "/stacks/" + StackName + "/{StackId}", "none", req, runtime), new UpdateStackResponse());
    }

    public ValidateTemplateResponse validateTemplate() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.validateTemplateWithOptions(headers, runtime);
    }

    public ValidateTemplateResponse validateTemplateWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("ValidateTemplate", "2015-09-01", "HTTPS", "POST", "AK", "/validate", "none", req, runtime), new ValidateTemplateResponse());
    }

    public WaitConditionsResponse waitConditions(WaitConditionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.waitConditionsWithOptions(request, headers, runtime);
    }

    public WaitConditionsResponse waitConditionsWithOptions(WaitConditionsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.stackname)) {
            query.put("stackname", request.stackname);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stackid)) {
            query.put("stackid", request.stackid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resource)) {
            query.put("resource", request.resource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expire)) {
            query.put("expire", request.expire);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signature)) {
            query.put("signature", request.signature);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("WaitConditions", "2015-09-01", "HTTPS", "POST", "AK", "/waitcondition", "none", req, runtime), new WaitConditionsResponse());
    }
}
