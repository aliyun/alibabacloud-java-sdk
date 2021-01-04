// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601;

import com.aliyun.tea.*;
import com.aliyun.oos20190601.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("oos", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public CancelExecutionResponse cancelExecutionWithOptions(CancelExecutionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CancelExecution", "2019-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new CancelExecutionResponse());
    }

    public CancelExecutionResponse cancelExecution(CancelExecutionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cancelExecutionWithOptions(request, runtime);
    }

    public CreateParameterResponse createParameterWithOptions(CreateParameterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateParameter", "2019-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateParameterResponse());
    }

    public CreateParameterResponse createParameter(CreateParameterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createParameterWithOptions(request, runtime);
    }

    public CreateSecretParameterResponse createSecretParameterWithOptions(CreateSecretParameterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateSecretParameter", "2019-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateSecretParameterResponse());
    }

    public CreateSecretParameterResponse createSecretParameter(CreateSecretParameterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSecretParameterWithOptions(request, runtime);
    }

    public CreateTemplateResponse createTemplateWithOptions(CreateTemplateRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateTemplateShrinkRequest request = new CreateTemplateShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "Tags", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateTemplate", "2019-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateTemplateResponse());
    }

    public CreateTemplateResponse createTemplate(CreateTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createTemplateWithOptions(request, runtime);
    }

    public DeleteExecutionsResponse deleteExecutionsWithOptions(DeleteExecutionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteExecutions", "2019-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteExecutionsResponse());
    }

    public DeleteExecutionsResponse deleteExecutions(DeleteExecutionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteExecutionsWithOptions(request, runtime);
    }

    public DeleteParameterResponse deleteParameterWithOptions(DeleteParameterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteParameter", "2019-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteParameterResponse());
    }

    public DeleteParameterResponse deleteParameter(DeleteParameterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteParameterWithOptions(request, runtime);
    }

    public DeleteSecretParameterResponse deleteSecretParameterWithOptions(DeleteSecretParameterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteSecretParameter", "2019-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteSecretParameterResponse());
    }

    public DeleteSecretParameterResponse deleteSecretParameter(DeleteSecretParameterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteSecretParameterWithOptions(request, runtime);
    }

    public DeleteTemplateResponse deleteTemplateWithOptions(DeleteTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteTemplate", "2019-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteTemplateResponse());
    }

    public DeleteTemplateResponse deleteTemplate(DeleteTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteTemplateWithOptions(request, runtime);
    }

    public DeleteTemplatesResponse deleteTemplatesWithOptions(DeleteTemplatesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteTemplates", "2019-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteTemplatesResponse());
    }

    public DeleteTemplatesResponse deleteTemplates(DeleteTemplatesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteTemplatesWithOptions(request, runtime);
    }

    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRegions", "2019-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRegionsResponse());
    }

    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRegionsWithOptions(request, runtime);
    }

    public GenerateExecutionPolicyResponse generateExecutionPolicyWithOptions(GenerateExecutionPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GenerateExecutionPolicy", "2019-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new GenerateExecutionPolicyResponse());
    }

    public GenerateExecutionPolicyResponse generateExecutionPolicy(GenerateExecutionPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.generateExecutionPolicyWithOptions(request, runtime);
    }

    public GetExecutionTemplateResponse getExecutionTemplateWithOptions(GetExecutionTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetExecutionTemplate", "2019-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetExecutionTemplateResponse());
    }

    public GetExecutionTemplateResponse getExecutionTemplate(GetExecutionTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getExecutionTemplateWithOptions(request, runtime);
    }

    public GetInventorySchemaResponse getInventorySchemaWithOptions(GetInventorySchemaRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetInventorySchema", "2019-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetInventorySchemaResponse());
    }

    public GetInventorySchemaResponse getInventorySchema(GetInventorySchemaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getInventorySchemaWithOptions(request, runtime);
    }

    public GetParameterResponse getParameterWithOptions(GetParameterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetParameter", "2019-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetParameterResponse());
    }

    public GetParameterResponse getParameter(GetParameterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getParameterWithOptions(request, runtime);
    }

    public GetParametersResponse getParametersWithOptions(GetParametersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetParameters", "2019-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetParametersResponse());
    }

    public GetParametersResponse getParameters(GetParametersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getParametersWithOptions(request, runtime);
    }

    public GetParametersByPathResponse getParametersByPathWithOptions(GetParametersByPathRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetParametersByPath", "2019-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetParametersByPathResponse());
    }

    public GetParametersByPathResponse getParametersByPath(GetParametersByPathRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getParametersByPathWithOptions(request, runtime);
    }

    public GetSecretParameterResponse getSecretParameterWithOptions(GetSecretParameterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetSecretParameter", "2019-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetSecretParameterResponse());
    }

    public GetSecretParameterResponse getSecretParameter(GetSecretParameterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getSecretParameterWithOptions(request, runtime);
    }

    public GetSecretParametersResponse getSecretParametersWithOptions(GetSecretParametersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetSecretParameters", "2019-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetSecretParametersResponse());
    }

    public GetSecretParametersResponse getSecretParameters(GetSecretParametersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getSecretParametersWithOptions(request, runtime);
    }

    public GetSecretParametersByPathResponse getSecretParametersByPathWithOptions(GetSecretParametersByPathRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetSecretParametersByPath", "2019-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetSecretParametersByPathResponse());
    }

    public GetSecretParametersByPathResponse getSecretParametersByPath(GetSecretParametersByPathRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getSecretParametersByPathWithOptions(request, runtime);
    }

    public GetServiceSettingsResponse getServiceSettingsWithOptions(GetServiceSettingsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetServiceSettings", "2019-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetServiceSettingsResponse());
    }

    public GetServiceSettingsResponse getServiceSettings(GetServiceSettingsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getServiceSettingsWithOptions(request, runtime);
    }

    public GetTemplateResponse getTemplateWithOptions(GetTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetTemplate", "2019-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetTemplateResponse());
    }

    public GetTemplateResponse getTemplate(GetTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getTemplateWithOptions(request, runtime);
    }

    public ListActionsResponse listActionsWithOptions(ListActionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListActions", "2019-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListActionsResponse());
    }

    public ListActionsResponse listActions(ListActionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listActionsWithOptions(request, runtime);
    }

    public ListExecutionLogsResponse listExecutionLogsWithOptions(ListExecutionLogsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListExecutionLogs", "2019-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListExecutionLogsResponse());
    }

    public ListExecutionLogsResponse listExecutionLogs(ListExecutionLogsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listExecutionLogsWithOptions(request, runtime);
    }

    public ListExecutionRiskyTasksResponse listExecutionRiskyTasksWithOptions(ListExecutionRiskyTasksRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListExecutionRiskyTasks", "2019-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListExecutionRiskyTasksResponse());
    }

    public ListExecutionRiskyTasksResponse listExecutionRiskyTasks(ListExecutionRiskyTasksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listExecutionRiskyTasksWithOptions(request, runtime);
    }

    public ListExecutionsResponse listExecutionsWithOptions(ListExecutionsRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListExecutionsShrinkRequest request = new ListExecutionsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "Tags", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListExecutions", "2019-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListExecutionsResponse());
    }

    public ListExecutionsResponse listExecutions(ListExecutionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listExecutionsWithOptions(request, runtime);
    }

    public ListInventoryEntriesResponse listInventoryEntriesWithOptions(ListInventoryEntriesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListInventoryEntries", "2019-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListInventoryEntriesResponse());
    }

    public ListInventoryEntriesResponse listInventoryEntries(ListInventoryEntriesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listInventoryEntriesWithOptions(request, runtime);
    }

    public ListParametersResponse listParametersWithOptions(ListParametersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListParameters", "2019-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListParametersResponse());
    }

    public ListParametersResponse listParameters(ListParametersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listParametersWithOptions(request, runtime);
    }

    public ListParameterVersionsResponse listParameterVersionsWithOptions(ListParameterVersionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListParameterVersions", "2019-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListParameterVersionsResponse());
    }

    public ListParameterVersionsResponse listParameterVersions(ListParameterVersionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listParameterVersionsWithOptions(request, runtime);
    }

    public ListResourceExecutionStatusResponse listResourceExecutionStatusWithOptions(ListResourceExecutionStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListResourceExecutionStatus", "2019-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListResourceExecutionStatusResponse());
    }

    public ListResourceExecutionStatusResponse listResourceExecutionStatus(ListResourceExecutionStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listResourceExecutionStatusWithOptions(request, runtime);
    }

    public ListSecretParametersResponse listSecretParametersWithOptions(ListSecretParametersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListSecretParameters", "2019-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListSecretParametersResponse());
    }

    public ListSecretParametersResponse listSecretParameters(ListSecretParametersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listSecretParametersWithOptions(request, runtime);
    }

    public ListSecretParameterVersionsResponse listSecretParameterVersionsWithOptions(ListSecretParameterVersionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListSecretParameterVersions", "2019-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListSecretParameterVersionsResponse());
    }

    public ListSecretParameterVersionsResponse listSecretParameterVersions(ListSecretParameterVersionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listSecretParameterVersionsWithOptions(request, runtime);
    }

    public ListTagKeysResponse listTagKeysWithOptions(ListTagKeysRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListTagKeys", "2019-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListTagKeysResponse());
    }

    public ListTagKeysResponse listTagKeys(ListTagKeysRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTagKeysWithOptions(request, runtime);
    }

    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListTagResourcesShrinkRequest request = new ListTagResourcesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.resourceIds)) {
            request.resourceIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.resourceIds, "ResourceIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "Tags", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListTagResources", "2019-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListTagResourcesResponse());
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
        return TeaModel.toModel(this.doRPCRequest("ListTagValues", "2019-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListTagValuesResponse());
    }

    public ListTagValuesResponse listTagValues(ListTagValuesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTagValuesWithOptions(request, runtime);
    }

    public ListTaskExecutionsResponse listTaskExecutionsWithOptions(ListTaskExecutionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListTaskExecutions", "2019-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListTaskExecutionsResponse());
    }

    public ListTaskExecutionsResponse listTaskExecutions(ListTaskExecutionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTaskExecutionsWithOptions(request, runtime);
    }

    public ListTemplatesResponse listTemplatesWithOptions(ListTemplatesRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListTemplatesShrinkRequest request = new ListTemplatesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "Tags", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListTemplates", "2019-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListTemplatesResponse());
    }

    public ListTemplatesResponse listTemplates(ListTemplatesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTemplatesWithOptions(request, runtime);
    }

    public ListTemplateVersionsResponse listTemplateVersionsWithOptions(ListTemplateVersionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListTemplateVersions", "2019-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListTemplateVersionsResponse());
    }

    public ListTemplateVersionsResponse listTemplateVersions(ListTemplateVersionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTemplateVersionsWithOptions(request, runtime);
    }

    public NotifyExecutionResponse notifyExecutionWithOptions(NotifyExecutionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("NotifyExecution", "2019-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new NotifyExecutionResponse());
    }

    public NotifyExecutionResponse notifyExecution(NotifyExecutionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.notifyExecutionWithOptions(request, runtime);
    }

    public SearchInventoryResponse searchInventoryWithOptions(SearchInventoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SearchInventory", "2019-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new SearchInventoryResponse());
    }

    public SearchInventoryResponse searchInventory(SearchInventoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.searchInventoryWithOptions(request, runtime);
    }

    public SetServiceSettingsResponse setServiceSettingsWithOptions(SetServiceSettingsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetServiceSettings", "2019-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new SetServiceSettingsResponse());
    }

    public SetServiceSettingsResponse setServiceSettings(SetServiceSettingsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setServiceSettingsWithOptions(request, runtime);
    }

    public StartExecutionResponse startExecutionWithOptions(StartExecutionRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        StartExecutionShrinkRequest request = new StartExecutionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "Tags", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StartExecution", "2019-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new StartExecutionResponse());
    }

    public StartExecutionResponse startExecution(StartExecutionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startExecutionWithOptions(request, runtime);
    }

    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        TagResourcesShrinkRequest request = new TagResourcesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.resourceIds)) {
            request.resourceIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.resourceIds, "ResourceIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "Tags", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("TagResources", "2019-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new TagResourcesResponse());
    }

    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

    public TriggerExecutionResponse triggerExecutionWithOptions(TriggerExecutionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("TriggerExecution", "2019-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new TriggerExecutionResponse());
    }

    public TriggerExecutionResponse triggerExecution(TriggerExecutionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.triggerExecutionWithOptions(request, runtime);
    }

    public UntagResourcesResponse untagResourcesWithOptions(UntagResourcesRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UntagResourcesShrinkRequest request = new UntagResourcesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.resourceIds)) {
            request.resourceIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.resourceIds, "ResourceIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tagKeys)) {
            request.tagKeysShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tagKeys, "TagKeys", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UntagResources", "2019-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new UntagResourcesResponse());
    }

    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.untagResourcesWithOptions(request, runtime);
    }

    public UpdateExecutionResponse updateExecutionWithOptions(UpdateExecutionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateExecution", "2019-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateExecutionResponse());
    }

    public UpdateExecutionResponse updateExecution(UpdateExecutionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateExecutionWithOptions(request, runtime);
    }

    public UpdateInstanceInformationResponse updateInstanceInformationWithOptions(UpdateInstanceInformationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateInstanceInformation", "2019-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateInstanceInformationResponse());
    }

    public UpdateInstanceInformationResponse updateInstanceInformation(UpdateInstanceInformationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateInstanceInformationWithOptions(request, runtime);
    }

    public UpdateParameterResponse updateParameterWithOptions(UpdateParameterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateParameter", "2019-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateParameterResponse());
    }

    public UpdateParameterResponse updateParameter(UpdateParameterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateParameterWithOptions(request, runtime);
    }

    public UpdateSecretParameterResponse updateSecretParameterWithOptions(UpdateSecretParameterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateSecretParameter", "2019-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateSecretParameterResponse());
    }

    public UpdateSecretParameterResponse updateSecretParameter(UpdateSecretParameterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateSecretParameterWithOptions(request, runtime);
    }

    public UpdateTemplateResponse updateTemplateWithOptions(UpdateTemplateRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateTemplateShrinkRequest request = new UpdateTemplateShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "Tags", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateTemplate", "2019-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateTemplateResponse());
    }

    public UpdateTemplateResponse updateTemplate(UpdateTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateTemplateWithOptions(request, runtime);
    }

    public ValidateTemplateContentResponse validateTemplateContentWithOptions(ValidateTemplateContentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ValidateTemplateContent", "2019-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new ValidateTemplateContentResponse());
    }

    public ValidateTemplateContentResponse validateTemplateContent(ValidateTemplateContentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.validateTemplateContentWithOptions(request, runtime);
    }
}
