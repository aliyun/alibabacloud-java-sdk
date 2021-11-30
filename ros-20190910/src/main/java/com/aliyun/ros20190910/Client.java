// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910;

import com.aliyun.tea.*;
import com.aliyun.ros20190910.models.*;
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

    public CancelUpdateStackResponse cancelUpdateStackWithOptions(CancelUpdateStackRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CancelType", request.cancelType);
        query.put("RegionId", request.regionId);
        query.put("StackId", request.stackId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelUpdateStack"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelUpdateStackResponse());
    }

    public CancelUpdateStackResponse cancelUpdateStack(CancelUpdateStackRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cancelUpdateStackWithOptions(request, runtime);
    }

    public ContinueCreateStackResponse continueCreateStackWithOptions(ContinueCreateStackRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DryRun", request.dryRun);
        query.put("Mode", request.mode);
        query.put("Parallelism", request.parallelism);
        query.put("Parameters", request.parameters);
        query.put("RamRoleName", request.ramRoleName);
        query.put("RecreatingResources", request.recreatingResources);
        query.put("RegionId", request.regionId);
        query.put("StackId", request.stackId);
        query.put("TemplateBody", request.templateBody);
        query.put("TemplateId", request.templateId);
        query.put("TemplateURL", request.templateURL);
        query.put("TemplateVersion", request.templateVersion);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ContinueCreateStack"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ContinueCreateStackResponse());
    }

    public ContinueCreateStackResponse continueCreateStack(ContinueCreateStackRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.continueCreateStackWithOptions(request, runtime);
    }

    public CreateChangeSetResponse createChangeSetWithOptions(CreateChangeSetRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ChangeSetName", request.changeSetName);
        query.put("ChangeSetType", request.changeSetType);
        query.put("ClientToken", request.clientToken);
        query.put("Description", request.description);
        query.put("DisableRollback", request.disableRollback);
        query.put("NotificationURLs", request.notificationURLs);
        query.put("Parallelism", request.parallelism);
        query.put("Parameters", request.parameters);
        query.put("RamRoleName", request.ramRoleName);
        query.put("RegionId", request.regionId);
        query.put("ReplacementOption", request.replacementOption);
        query.put("ResourcesToImport", request.resourcesToImport);
        query.put("StackId", request.stackId);
        query.put("StackName", request.stackName);
        query.put("StackPolicyBody", request.stackPolicyBody);
        query.put("StackPolicyDuringUpdateBody", request.stackPolicyDuringUpdateBody);
        query.put("StackPolicyDuringUpdateURL", request.stackPolicyDuringUpdateURL);
        query.put("StackPolicyURL", request.stackPolicyURL);
        query.put("TemplateBody", request.templateBody);
        query.put("TemplateId", request.templateId);
        query.put("TemplateScratchId", request.templateScratchId);
        query.put("TemplateURL", request.templateURL);
        query.put("TemplateVersion", request.templateVersion);
        query.put("TimeoutInMinutes", request.timeoutInMinutes);
        query.put("UsePreviousParameters", request.usePreviousParameters);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateChangeSet"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateChangeSetResponse());
    }

    public CreateChangeSetResponse createChangeSet(CreateChangeSetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createChangeSetWithOptions(request, runtime);
    }

    public CreateStackResponse createStackWithOptions(CreateStackRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("CreateOption", request.createOption);
        query.put("DeletionProtection", request.deletionProtection);
        query.put("DisableRollback", request.disableRollback);
        query.put("NotificationURLs", request.notificationURLs);
        query.put("Parallelism", request.parallelism);
        query.put("Parameters", request.parameters);
        query.put("RamRoleName", request.ramRoleName);
        query.put("RegionId", request.regionId);
        query.put("ResourceGroupId", request.resourceGroupId);
        query.put("StackName", request.stackName);
        query.put("StackPolicyBody", request.stackPolicyBody);
        query.put("StackPolicyURL", request.stackPolicyURL);
        query.put("Tags", request.tags);
        query.put("TemplateBody", request.templateBody);
        query.put("TemplateId", request.templateId);
        query.put("TemplateScratchId", request.templateScratchId);
        query.put("TemplateURL", request.templateURL);
        query.put("TemplateVersion", request.templateVersion);
        query.put("TimeoutInMinutes", request.timeoutInMinutes);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateStack"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateStackResponse());
    }

    public CreateStackResponse createStack(CreateStackRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createStackWithOptions(request, runtime);
    }

    public CreateStackGroupResponse createStackGroupWithOptions(CreateStackGroupRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateStackGroupShrinkRequest request = new CreateStackGroupShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.autoDeployment))) {
            request.autoDeploymentShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.autoDeployment), "AutoDeployment", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AdministrationRoleName", request.administrationRoleName);
        query.put("AutoDeployment", request.autoDeploymentShrink);
        query.put("ClientToken", request.clientToken);
        query.put("Description", request.description);
        query.put("ExecutionRoleName", request.executionRoleName);
        query.put("Parameters", request.parameters);
        query.put("PermissionModel", request.permissionModel);
        query.put("RegionId", request.regionId);
        query.put("ResourceGroupId", request.resourceGroupId);
        query.put("StackGroupName", request.stackGroupName);
        query.put("TemplateBody", request.templateBody);
        query.put("TemplateId", request.templateId);
        query.put("TemplateURL", request.templateURL);
        query.put("TemplateVersion", request.templateVersion);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateStackGroup"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateStackGroupResponse());
    }

    public CreateStackGroupResponse createStackGroup(CreateStackGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createStackGroupWithOptions(request, runtime);
    }

    public CreateStackInstancesResponse createStackInstancesWithOptions(CreateStackInstancesRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateStackInstancesShrinkRequest request = new CreateStackInstancesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.accountIds)) {
            request.accountIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.accountIds, "AccountIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.deploymentTargets))) {
            request.deploymentTargetsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.deploymentTargets), "DeploymentTargets", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.operationPreferences)) {
            request.operationPreferencesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.operationPreferences, "OperationPreferences", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.regionIds)) {
            request.regionIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.regionIds, "RegionIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccountIds", request.accountIdsShrink);
        query.put("ClientToken", request.clientToken);
        query.put("DeploymentTargets", request.deploymentTargetsShrink);
        query.put("DisableRollback", request.disableRollback);
        query.put("OperationDescription", request.operationDescription);
        query.put("OperationPreferences", request.operationPreferencesShrink);
        query.put("ParameterOverrides", request.parameterOverrides);
        query.put("RegionId", request.regionId);
        query.put("RegionIds", request.regionIdsShrink);
        query.put("StackGroupName", request.stackGroupName);
        query.put("TimeoutInMinutes", request.timeoutInMinutes);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateStackInstances"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateStackInstancesResponse());
    }

    public CreateStackInstancesResponse createStackInstances(CreateStackInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createStackInstancesWithOptions(request, runtime);
    }

    public CreateTemplateResponse createTemplateWithOptions(CreateTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Description", request.description);
        query.put("ResourceGroupId", request.resourceGroupId);
        query.put("TemplateBody", request.templateBody);
        query.put("TemplateName", request.templateName);
        query.put("TemplateURL", request.templateURL);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTemplate"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTemplateResponse());
    }

    public CreateTemplateResponse createTemplate(CreateTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createTemplateWithOptions(request, runtime);
    }

    public CreateTemplateScratchResponse createTemplateScratchWithOptions(CreateTemplateScratchRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateTemplateScratchShrinkRequest request = new CreateTemplateScratchShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.preferenceParameters)) {
            request.preferenceParametersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.preferenceParameters, "PreferenceParameters", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.sourceResourceGroup))) {
            request.sourceResourceGroupShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.sourceResourceGroup), "SourceResourceGroup", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sourceResources)) {
            request.sourceResourcesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sourceResources, "SourceResources", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.sourceTag))) {
            request.sourceTagShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.sourceTag), "SourceTag", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("Description", request.description);
        query.put("ExecutionMode", request.executionMode);
        query.put("LogicalIdStrategy", request.logicalIdStrategy);
        query.put("PreferenceParameters", request.preferenceParametersShrink);
        query.put("RegionId", request.regionId);
        query.put("SourceResourceGroup", request.sourceResourceGroupShrink);
        query.put("SourceResources", request.sourceResourcesShrink);
        query.put("SourceTag", request.sourceTagShrink);
        query.put("TemplateScratchType", request.templateScratchType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTemplateScratch"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTemplateScratchResponse());
    }

    public CreateTemplateScratchResponse createTemplateScratch(CreateTemplateScratchRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createTemplateScratchWithOptions(request, runtime);
    }

    public DeleteChangeSetResponse deleteChangeSetWithOptions(DeleteChangeSetRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ChangeSetId", request.changeSetId);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteChangeSet"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteChangeSetResponse());
    }

    public DeleteChangeSetResponse deleteChangeSet(DeleteChangeSetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteChangeSetWithOptions(request, runtime);
    }

    public DeleteStackResponse deleteStackWithOptions(DeleteStackRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("RamRoleName", request.ramRoleName);
        query.put("RegionId", request.regionId);
        query.put("RetainAllResources", request.retainAllResources);
        query.put("RetainResources", request.retainResources);
        query.put("StackId", request.stackId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteStack"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteStackResponse());
    }

    public DeleteStackResponse deleteStack(DeleteStackRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteStackWithOptions(request, runtime);
    }

    public DeleteStackGroupResponse deleteStackGroupWithOptions(DeleteStackGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("RegionId", request.regionId);
        query.put("StackGroupName", request.stackGroupName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteStackGroup"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteStackGroupResponse());
    }

    public DeleteStackGroupResponse deleteStackGroup(DeleteStackGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteStackGroupWithOptions(request, runtime);
    }

    public DeleteStackInstancesResponse deleteStackInstancesWithOptions(DeleteStackInstancesRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteStackInstancesShrinkRequest request = new DeleteStackInstancesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.accountIds)) {
            request.accountIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.accountIds, "AccountIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.deploymentTargets))) {
            request.deploymentTargetsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.deploymentTargets), "DeploymentTargets", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.operationPreferences)) {
            request.operationPreferencesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.operationPreferences, "OperationPreferences", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.regionIds)) {
            request.regionIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.regionIds, "RegionIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccountIds", request.accountIdsShrink);
        query.put("ClientToken", request.clientToken);
        query.put("DeploymentTargets", request.deploymentTargetsShrink);
        query.put("OperationDescription", request.operationDescription);
        query.put("OperationPreferences", request.operationPreferencesShrink);
        query.put("RegionId", request.regionId);
        query.put("RegionIds", request.regionIdsShrink);
        query.put("RetainStacks", request.retainStacks);
        query.put("StackGroupName", request.stackGroupName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteStackInstances"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteStackInstancesResponse());
    }

    public DeleteStackInstancesResponse deleteStackInstances(DeleteStackInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteStackInstancesWithOptions(request, runtime);
    }

    public DeleteTemplateResponse deleteTemplateWithOptions(DeleteTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("TemplateId", request.templateId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTemplate"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTemplateResponse());
    }

    public DeleteTemplateResponse deleteTemplate(DeleteTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteTemplateWithOptions(request, runtime);
    }

    public DeleteTemplateScratchResponse deleteTemplateScratchWithOptions(DeleteTemplateScratchRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("RegionId", request.regionId);
        query.put("TemplateScratchId", request.templateScratchId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTemplateScratch"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTemplateScratchResponse());
    }

    public DeleteTemplateScratchResponse deleteTemplateScratch(DeleteTemplateScratchRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteTemplateScratchWithOptions(request, runtime);
    }

    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AcceptLanguage", request.acceptLanguage);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRegions"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRegionsResponse());
    }

    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRegionsWithOptions(request, runtime);
    }

    public DetectStackDriftResponse detectStackDriftWithOptions(DetectStackDriftRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("LogicalResourceId", request.logicalResourceId);
        query.put("RegionId", request.regionId);
        query.put("StackId", request.stackId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetectStackDrift"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetectStackDriftResponse());
    }

    public DetectStackDriftResponse detectStackDrift(DetectStackDriftRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.detectStackDriftWithOptions(request, runtime);
    }

    public DetectStackGroupDriftResponse detectStackGroupDriftWithOptions(DetectStackGroupDriftRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DetectStackGroupDriftShrinkRequest request = new DetectStackGroupDriftShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.operationPreferences)) {
            request.operationPreferencesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.operationPreferences, "OperationPreferences", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("OperationPreferences", request.operationPreferencesShrink);
        query.put("RegionId", request.regionId);
        query.put("StackGroupName", request.stackGroupName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetectStackGroupDrift"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetectStackGroupDriftResponse());
    }

    public DetectStackGroupDriftResponse detectStackGroupDrift(DetectStackGroupDriftRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.detectStackGroupDriftWithOptions(request, runtime);
    }

    public DetectStackResourceDriftResponse detectStackResourceDriftWithOptions(DetectStackResourceDriftRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("LogicalResourceId", request.logicalResourceId);
        query.put("RegionId", request.regionId);
        query.put("StackId", request.stackId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetectStackResourceDrift"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetectStackResourceDriftResponse());
    }

    public DetectStackResourceDriftResponse detectStackResourceDrift(DetectStackResourceDriftRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.detectStackResourceDriftWithOptions(request, runtime);
    }

    public ExecuteChangeSetResponse executeChangeSetWithOptions(ExecuteChangeSetRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ChangeSetId", request.changeSetId);
        query.put("ClientToken", request.clientToken);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExecuteChangeSet"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExecuteChangeSetResponse());
    }

    public ExecuteChangeSetResponse executeChangeSet(ExecuteChangeSetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.executeChangeSetWithOptions(request, runtime);
    }

    public GenerateTemplateByScratchResponse generateTemplateByScratchWithOptions(GenerateTemplateByScratchRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ProvisionRegionId", request.provisionRegionId);
        query.put("RegionId", request.regionId);
        query.put("TemplateScratchId", request.templateScratchId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GenerateTemplateByScratch"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GenerateTemplateByScratchResponse());
    }

    public GenerateTemplateByScratchResponse generateTemplateByScratch(GenerateTemplateByScratchRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.generateTemplateByScratchWithOptions(request, runtime);
    }

    public GenerateTemplatePolicyResponse generateTemplatePolicyWithOptions(GenerateTemplatePolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("TemplateBody", request.templateBody);
        query.put("TemplateId", request.templateId);
        query.put("TemplateURL", request.templateURL);
        query.put("TemplateVersion", request.templateVersion);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GenerateTemplatePolicy"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GenerateTemplatePolicyResponse());
    }

    public GenerateTemplatePolicyResponse generateTemplatePolicy(GenerateTemplatePolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.generateTemplatePolicyWithOptions(request, runtime);
    }

    public GetChangeSetResponse getChangeSetWithOptions(GetChangeSetRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ChangeSetId", request.changeSetId);
        query.put("RegionId", request.regionId);
        query.put("ShowTemplate", request.showTemplate);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetChangeSet"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetChangeSetResponse());
    }

    public GetChangeSetResponse getChangeSet(GetChangeSetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getChangeSetWithOptions(request, runtime);
    }

    public GetFeatureDetailsResponse getFeatureDetailsWithOptions(GetFeatureDetailsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Feature", request.feature);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFeatureDetails"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFeatureDetailsResponse());
    }

    public GetFeatureDetailsResponse getFeatureDetails(GetFeatureDetailsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getFeatureDetailsWithOptions(request, runtime);
    }

    public GetResourceTypeResponse getResourceTypeWithOptions(GetResourceTypeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ResourceType", request.resourceType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetResourceType"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetResourceTypeResponse());
    }

    public GetResourceTypeResponse getResourceType(GetResourceTypeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getResourceTypeWithOptions(request, runtime);
    }

    public GetResourceTypeTemplateResponse getResourceTypeTemplateWithOptions(GetResourceTypeTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ResourceType", request.resourceType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetResourceTypeTemplate"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetResourceTypeTemplateResponse());
    }

    public GetResourceTypeTemplateResponse getResourceTypeTemplate(GetResourceTypeTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getResourceTypeTemplateWithOptions(request, runtime);
    }

    public GetServiceProvisionsResponse getServiceProvisionsWithOptions(GetServiceProvisionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Parameters", request.parameters);
        query.put("RegionId", request.regionId);
        query.put("Services", request.services);
        query.put("TemplateBody", request.templateBody);
        query.put("TemplateId", request.templateId);
        query.put("TemplateURL", request.templateURL);
        query.put("TemplateVersion", request.templateVersion);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetServiceProvisions"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetServiceProvisionsResponse());
    }

    public GetServiceProvisionsResponse getServiceProvisions(GetServiceProvisionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getServiceProvisionsWithOptions(request, runtime);
    }

    public GetStackResponse getStackWithOptions(GetStackRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("OutputOption", request.outputOption);
        query.put("RegionId", request.regionId);
        query.put("ShowResourceProgress", request.showResourceProgress);
        query.put("StackId", request.stackId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetStack"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetStackResponse());
    }

    public GetStackResponse getStack(GetStackRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getStackWithOptions(request, runtime);
    }

    public GetStackDriftDetectionStatusResponse getStackDriftDetectionStatusWithOptions(GetStackDriftDetectionStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DriftDetectionId", request.driftDetectionId);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetStackDriftDetectionStatus"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetStackDriftDetectionStatusResponse());
    }

    public GetStackDriftDetectionStatusResponse getStackDriftDetectionStatus(GetStackDriftDetectionStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getStackDriftDetectionStatusWithOptions(request, runtime);
    }

    public GetStackGroupResponse getStackGroupWithOptions(GetStackGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("RegionId", request.regionId);
        query.put("StackGroupId", request.stackGroupId);
        query.put("StackGroupName", request.stackGroupName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetStackGroup"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetStackGroupResponse());
    }

    public GetStackGroupResponse getStackGroup(GetStackGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getStackGroupWithOptions(request, runtime);
    }

    public GetStackGroupOperationResponse getStackGroupOperationWithOptions(GetStackGroupOperationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OperationId", request.operationId);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetStackGroupOperation"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetStackGroupOperationResponse());
    }

    public GetStackGroupOperationResponse getStackGroupOperation(GetStackGroupOperationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getStackGroupOperationWithOptions(request, runtime);
    }

    public GetStackInstanceResponse getStackInstanceWithOptions(GetStackInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("RegionId", request.regionId);
        query.put("StackGroupName", request.stackGroupName);
        query.put("StackInstanceAccountId", request.stackInstanceAccountId);
        query.put("StackInstanceRegionId", request.stackInstanceRegionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetStackInstance"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetStackInstanceResponse());
    }

    public GetStackInstanceResponse getStackInstance(GetStackInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getStackInstanceWithOptions(request, runtime);
    }

    public GetStackPolicyResponse getStackPolicyWithOptions(GetStackPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("RegionId", request.regionId);
        query.put("StackId", request.stackId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetStackPolicy"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetStackPolicyResponse());
    }

    public GetStackPolicyResponse getStackPolicy(GetStackPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getStackPolicyWithOptions(request, runtime);
    }

    public GetStackResourceResponse getStackResourceWithOptions(GetStackResourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("LogicalResourceId", request.logicalResourceId);
        query.put("RegionId", request.regionId);
        query.put("ShowResourceAttributes", request.showResourceAttributes);
        query.put("StackId", request.stackId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetStackResource"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetStackResourceResponse());
    }

    public GetStackResourceResponse getStackResource(GetStackResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getStackResourceWithOptions(request, runtime);
    }

    public GetTemplateResponse getTemplateWithOptions(GetTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ChangeSetId", request.changeSetId);
        query.put("IncludePermission", request.includePermission);
        query.put("RegionId", request.regionId);
        query.put("StackGroupName", request.stackGroupName);
        query.put("StackId", request.stackId);
        query.put("TemplateId", request.templateId);
        query.put("TemplateStage", request.templateStage);
        query.put("TemplateVersion", request.templateVersion);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTemplate"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTemplateResponse());
    }

    public GetTemplateResponse getTemplate(GetTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getTemplateWithOptions(request, runtime);
    }

    public GetTemplateEstimateCostResponse getTemplateEstimateCostWithOptions(GetTemplateEstimateCostRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("Parameters", request.parameters);
        query.put("RegionId", request.regionId);
        query.put("TemplateBody", request.templateBody);
        query.put("TemplateId", request.templateId);
        query.put("TemplateURL", request.templateURL);
        query.put("TemplateVersion", request.templateVersion);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTemplateEstimateCost"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTemplateEstimateCostResponse());
    }

    public GetTemplateEstimateCostResponse getTemplateEstimateCost(GetTemplateEstimateCostRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getTemplateEstimateCostWithOptions(request, runtime);
    }

    public GetTemplateParameterConstraintsResponse getTemplateParameterConstraintsWithOptions(GetTemplateParameterConstraintsRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetTemplateParameterConstraintsShrinkRequest request = new GetTemplateParameterConstraintsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.parametersKeyFilter)) {
            request.parametersKeyFilterShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.parametersKeyFilter, "ParametersKeyFilter", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("Parameters", request.parameters);
        query.put("ParametersKeyFilter", request.parametersKeyFilterShrink);
        query.put("RegionId", request.regionId);
        query.put("TemplateBody", request.templateBody);
        query.put("TemplateId", request.templateId);
        query.put("TemplateURL", request.templateURL);
        query.put("TemplateVersion", request.templateVersion);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTemplateParameterConstraints"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTemplateParameterConstraintsResponse());
    }

    public GetTemplateParameterConstraintsResponse getTemplateParameterConstraints(GetTemplateParameterConstraintsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getTemplateParameterConstraintsWithOptions(request, runtime);
    }

    public GetTemplateScratchResponse getTemplateScratchWithOptions(GetTemplateScratchRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("RegionId", request.regionId);
        query.put("ShowDataOption", request.showDataOption);
        query.put("TemplateScratchId", request.templateScratchId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTemplateScratch"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTemplateScratchResponse());
    }

    public GetTemplateScratchResponse getTemplateScratch(GetTemplateScratchRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getTemplateScratchWithOptions(request, runtime);
    }

    public GetTemplateSummaryResponse getTemplateSummaryWithOptions(GetTemplateSummaryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ChangeSetId", request.changeSetId);
        query.put("RegionId", request.regionId);
        query.put("StackGroupName", request.stackGroupName);
        query.put("StackId", request.stackId);
        query.put("TemplateBody", request.templateBody);
        query.put("TemplateId", request.templateId);
        query.put("TemplateURL", request.templateURL);
        query.put("TemplateVersion", request.templateVersion);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTemplateSummary"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTemplateSummaryResponse());
    }

    public GetTemplateSummaryResponse getTemplateSummary(GetTemplateSummaryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getTemplateSummaryWithOptions(request, runtime);
    }

    public ListChangeSetsResponse listChangeSetsWithOptions(ListChangeSetsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ChangeSetId", request.changeSetId);
        query.put("ChangeSetName", request.changeSetName);
        query.put("ExecutionStatus", request.executionStatus);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("RegionId", request.regionId);
        query.put("StackId", request.stackId);
        query.put("Status", request.status);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListChangeSets"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListChangeSetsResponse());
    }

    public ListChangeSetsResponse listChangeSets(ListChangeSetsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listChangeSetsWithOptions(request, runtime);
    }

    public ListResourceTypesResponse listResourceTypesWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListResourceTypes"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListResourceTypesResponse());
    }

    public ListResourceTypesResponse listResourceTypes() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listResourceTypesWithOptions(runtime);
    }

    public ListStackEventsResponse listStackEventsWithOptions(ListStackEventsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("LogicalResourceId", request.logicalResourceId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("RegionId", request.regionId);
        query.put("ResourceType", request.resourceType);
        query.put("StackId", request.stackId);
        query.put("Status", request.status);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListStackEvents"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListStackEventsResponse());
    }

    public ListStackEventsResponse listStackEvents(ListStackEventsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listStackEventsWithOptions(request, runtime);
    }

    public ListStackGroupOperationResultsResponse listStackGroupOperationResultsWithOptions(ListStackGroupOperationResultsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OperationId", request.operationId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListStackGroupOperationResults"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListStackGroupOperationResultsResponse());
    }

    public ListStackGroupOperationResultsResponse listStackGroupOperationResults(ListStackGroupOperationResultsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listStackGroupOperationResultsWithOptions(request, runtime);
    }

    public ListStackGroupOperationsResponse listStackGroupOperationsWithOptions(ListStackGroupOperationsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("RegionId", request.regionId);
        query.put("StackGroupName", request.stackGroupName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListStackGroupOperations"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListStackGroupOperationsResponse());
    }

    public ListStackGroupOperationsResponse listStackGroupOperations(ListStackGroupOperationsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listStackGroupOperationsWithOptions(request, runtime);
    }

    public ListStackGroupsResponse listStackGroupsWithOptions(ListStackGroupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("RegionId", request.regionId);
        query.put("ResourceGroupId", request.resourceGroupId);
        query.put("Status", request.status);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListStackGroups"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListStackGroupsResponse());
    }

    public ListStackGroupsResponse listStackGroups(ListStackGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listStackGroupsWithOptions(request, runtime);
    }

    public ListStackInstancesResponse listStackInstancesWithOptions(ListStackInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("RegionId", request.regionId);
        query.put("StackGroupName", request.stackGroupName);
        query.put("StackInstanceAccountId", request.stackInstanceAccountId);
        query.put("StackInstanceRegionId", request.stackInstanceRegionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListStackInstances"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListStackInstancesResponse());
    }

    public ListStackInstancesResponse listStackInstances(ListStackInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listStackInstancesWithOptions(request, runtime);
    }

    public ListStackOperationRisksResponse listStackOperationRisksWithOptions(ListStackOperationRisksRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("OperationType", request.operationType);
        query.put("RamRoleName", request.ramRoleName);
        query.put("RegionId", request.regionId);
        query.put("RetainAllResources", request.retainAllResources);
        query.put("RetainResources", request.retainResources);
        query.put("StackId", request.stackId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListStackOperationRisks"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListStackOperationRisksResponse());
    }

    public ListStackOperationRisksResponse listStackOperationRisks(ListStackOperationRisksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listStackOperationRisksWithOptions(request, runtime);
    }

    public ListStackResourceDriftsResponse listStackResourceDriftsWithOptions(ListStackResourceDriftsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("MaxResults", request.maxResults);
        query.put("NextToken", request.nextToken);
        query.put("RegionId", request.regionId);
        query.put("ResourceDriftStatus", request.resourceDriftStatus);
        query.put("StackId", request.stackId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListStackResourceDrifts"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListStackResourceDriftsResponse());
    }

    public ListStackResourceDriftsResponse listStackResourceDrifts(ListStackResourceDriftsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listStackResourceDriftsWithOptions(request, runtime);
    }

    public ListStackResourcesResponse listStackResourcesWithOptions(ListStackResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("RegionId", request.regionId);
        query.put("StackId", request.stackId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListStackResources"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListStackResourcesResponse());
    }

    public ListStackResourcesResponse listStackResources(ListStackResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listStackResourcesWithOptions(request, runtime);
    }

    public ListStacksResponse listStacksWithOptions(ListStacksRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("ParentStackId", request.parentStackId);
        query.put("RegionId", request.regionId);
        query.put("ResourceGroupId", request.resourceGroupId);
        query.put("ShowNestedStack", request.showNestedStack);
        query.put("StackId", request.stackId);
        query.put("StackIds", request.stackIds);
        query.put("StackName", request.stackName);
        query.put("Status", request.status);
        query.put("Tag", request.tag);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListStacks"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListStacksResponse());
    }

    public ListStacksResponse listStacks(ListStacksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listStacksWithOptions(request, runtime);
    }

    public ListTagKeysResponse listTagKeysWithOptions(ListTagKeysRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("NextToken", request.nextToken);
        query.put("RegionId", request.regionId);
        query.put("ResourceType", request.resourceType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTagKeys"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTagKeysResponse());
    }

    public ListTagKeysResponse listTagKeys(ListTagKeysRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTagKeysWithOptions(request, runtime);
    }

    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("NextToken", request.nextToken);
        query.put("RegionId", request.regionId);
        query.put("ResourceId", request.resourceId);
        query.put("ResourceType", request.resourceType);
        query.put("Tag", request.tag);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTagResources"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTagResourcesResponse());
    }

    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    public ListTagValuesResponse listTagValuesWithOptions(ListTagValuesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Key", request.key);
        query.put("NextToken", request.nextToken);
        query.put("RegionId", request.regionId);
        query.put("ResourceType", request.resourceType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTagValues"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTagValuesResponse());
    }

    public ListTagValuesResponse listTagValues(ListTagValuesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTagValuesWithOptions(request, runtime);
    }

    public ListTemplateScratchesResponse listTemplateScratchesWithOptions(ListTemplateScratchesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("RegionId", request.regionId);
        query.put("Status", request.status);
        query.put("TemplateScratchId", request.templateScratchId);
        query.put("TemplateScratchType", request.templateScratchType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTemplateScratches"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTemplateScratchesResponse());
    }

    public ListTemplateScratchesResponse listTemplateScratches(ListTemplateScratchesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTemplateScratchesWithOptions(request, runtime);
    }

    public ListTemplateVersionsResponse listTemplateVersionsWithOptions(ListTemplateVersionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("MaxResults", request.maxResults);
        query.put("NextToken", request.nextToken);
        query.put("TemplateId", request.templateId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTemplateVersions"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTemplateVersionsResponse());
    }

    public ListTemplateVersionsResponse listTemplateVersions(ListTemplateVersionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTemplateVersionsWithOptions(request, runtime);
    }

    public ListTemplatesResponse listTemplatesWithOptions(ListTemplatesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("ResourceGroupId", request.resourceGroupId);
        query.put("ShareType", request.shareType);
        query.put("Tag", request.tag);
        query.put("TemplateName", request.templateName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTemplates"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTemplatesResponse());
    }

    public ListTemplatesResponse listTemplates(ListTemplatesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTemplatesWithOptions(request, runtime);
    }

    public MoveResourceGroupResponse moveResourceGroupWithOptions(MoveResourceGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("NewResourceGroupId", request.newResourceGroupId);
        query.put("RegionId", request.regionId);
        query.put("ResourceId", request.resourceId);
        query.put("ResourceType", request.resourceType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MoveResourceGroup"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MoveResourceGroupResponse());
    }

    public MoveResourceGroupResponse moveResourceGroup(MoveResourceGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.moveResourceGroupWithOptions(request, runtime);
    }

    public PreviewStackResponse previewStackWithOptions(PreviewStackRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("DisableRollback", request.disableRollback);
        query.put("Parallelism", request.parallelism);
        query.put("Parameters", request.parameters);
        query.put("RegionId", request.regionId);
        query.put("StackName", request.stackName);
        query.put("StackPolicyBody", request.stackPolicyBody);
        query.put("StackPolicyURL", request.stackPolicyURL);
        query.put("TemplateBody", request.templateBody);
        query.put("TemplateId", request.templateId);
        query.put("TemplateURL", request.templateURL);
        query.put("TemplateVersion", request.templateVersion);
        query.put("TimeoutInMinutes", request.timeoutInMinutes);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PreviewStack"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PreviewStackResponse());
    }

    public PreviewStackResponse previewStack(PreviewStackRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.previewStackWithOptions(request, runtime);
    }

    public SetDeletionProtectionResponse setDeletionProtectionWithOptions(SetDeletionProtectionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DeletionProtection", request.deletionProtection);
        query.put("RegionId", request.regionId);
        query.put("StackId", request.stackId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetDeletionProtection"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetDeletionProtectionResponse());
    }

    public SetDeletionProtectionResponse setDeletionProtection(SetDeletionProtectionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setDeletionProtectionWithOptions(request, runtime);
    }

    public SetStackPolicyResponse setStackPolicyWithOptions(SetStackPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("RegionId", request.regionId);
        query.put("StackId", request.stackId);
        query.put("StackPolicyBody", request.stackPolicyBody);
        query.put("StackPolicyURL", request.stackPolicyURL);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetStackPolicy"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetStackPolicyResponse());
    }

    public SetStackPolicyResponse setStackPolicy(SetStackPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setStackPolicyWithOptions(request, runtime);
    }

    public SetTemplatePermissionResponse setTemplatePermissionWithOptions(SetTemplatePermissionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccountIds", request.accountIds);
        query.put("ShareOption", request.shareOption);
        query.put("TemplateId", request.templateId);
        query.put("TemplateVersion", request.templateVersion);
        query.put("VersionOption", request.versionOption);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetTemplatePermission"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetTemplatePermissionResponse());
    }

    public SetTemplatePermissionResponse setTemplatePermission(SetTemplatePermissionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setTemplatePermissionWithOptions(request, runtime);
    }

    public SignalResourceResponse signalResourceWithOptions(SignalResourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("LogicalResourceId", request.logicalResourceId);
        query.put("RegionId", request.regionId);
        query.put("StackId", request.stackId);
        query.put("Status", request.status);
        query.put("UniqueId", request.uniqueId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SignalResource"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SignalResourceResponse());
    }

    public SignalResourceResponse signalResource(SignalResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.signalResourceWithOptions(request, runtime);
    }

    public StopStackGroupOperationResponse stopStackGroupOperationWithOptions(StopStackGroupOperationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OperationId", request.operationId);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopStackGroupOperation"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopStackGroupOperationResponse());
    }

    public StopStackGroupOperationResponse stopStackGroupOperation(StopStackGroupOperationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopStackGroupOperationWithOptions(request, runtime);
    }

    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("RegionId", request.regionId);
        query.put("ResourceId", request.resourceId);
        query.put("ResourceType", request.resourceType);
        query.put("Tag", request.tag);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TagResources"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TagResourcesResponse());
    }

    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

    public UntagResourcesResponse untagResourcesWithOptions(UntagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("All", request.all);
        query.put("RegionId", request.regionId);
        query.put("ResourceId", request.resourceId);
        query.put("ResourceType", request.resourceType);
        query.put("TagKey", request.tagKey);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UntagResources"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UntagResourcesResponse());
    }

    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.untagResourcesWithOptions(request, runtime);
    }

    public UpdateStackResponse updateStackWithOptions(UpdateStackRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("DisableRollback", request.disableRollback);
        query.put("Parallelism", request.parallelism);
        query.put("Parameters", request.parameters);
        query.put("RamRoleName", request.ramRoleName);
        query.put("RegionId", request.regionId);
        query.put("ReplacementOption", request.replacementOption);
        query.put("StackId", request.stackId);
        query.put("StackPolicyBody", request.stackPolicyBody);
        query.put("StackPolicyDuringUpdateBody", request.stackPolicyDuringUpdateBody);
        query.put("StackPolicyDuringUpdateURL", request.stackPolicyDuringUpdateURL);
        query.put("StackPolicyURL", request.stackPolicyURL);
        query.put("Tags", request.tags);
        query.put("TemplateBody", request.templateBody);
        query.put("TemplateId", request.templateId);
        query.put("TemplateURL", request.templateURL);
        query.put("TemplateVersion", request.templateVersion);
        query.put("TimeoutInMinutes", request.timeoutInMinutes);
        query.put("UsePreviousParameters", request.usePreviousParameters);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateStack"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateStackResponse());
    }

    public UpdateStackResponse updateStack(UpdateStackRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateStackWithOptions(request, runtime);
    }

    public UpdateStackGroupResponse updateStackGroupWithOptions(UpdateStackGroupRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateStackGroupShrinkRequest request = new UpdateStackGroupShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.accountIds)) {
            request.accountIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.accountIds, "AccountIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.autoDeployment))) {
            request.autoDeploymentShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.autoDeployment), "AutoDeployment", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.deploymentTargets))) {
            request.deploymentTargetsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.deploymentTargets), "DeploymentTargets", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.operationPreferences)) {
            request.operationPreferencesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.operationPreferences, "OperationPreferences", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.regionIds)) {
            request.regionIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.regionIds, "RegionIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccountIds", request.accountIdsShrink);
        query.put("AdministrationRoleName", request.administrationRoleName);
        query.put("AutoDeployment", request.autoDeploymentShrink);
        query.put("ClientToken", request.clientToken);
        query.put("DeploymentTargets", request.deploymentTargetsShrink);
        query.put("Description", request.description);
        query.put("ExecutionRoleName", request.executionRoleName);
        query.put("OperationDescription", request.operationDescription);
        query.put("OperationPreferences", request.operationPreferencesShrink);
        query.put("Parameters", request.parameters);
        query.put("PermissionModel", request.permissionModel);
        query.put("RegionId", request.regionId);
        query.put("RegionIds", request.regionIdsShrink);
        query.put("StackGroupName", request.stackGroupName);
        query.put("TemplateBody", request.templateBody);
        query.put("TemplateId", request.templateId);
        query.put("TemplateURL", request.templateURL);
        query.put("TemplateVersion", request.templateVersion);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateStackGroup"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateStackGroupResponse());
    }

    public UpdateStackGroupResponse updateStackGroup(UpdateStackGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateStackGroupWithOptions(request, runtime);
    }

    public UpdateStackInstancesResponse updateStackInstancesWithOptions(UpdateStackInstancesRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateStackInstancesShrinkRequest request = new UpdateStackInstancesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.accountIds)) {
            request.accountIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.accountIds, "AccountIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.deploymentTargets))) {
            request.deploymentTargetsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.deploymentTargets), "DeploymentTargets", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.operationPreferences)) {
            request.operationPreferencesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.operationPreferences, "OperationPreferences", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.regionIds)) {
            request.regionIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.regionIds, "RegionIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccountIds", request.accountIdsShrink);
        query.put("ClientToken", request.clientToken);
        query.put("DeploymentTargets", request.deploymentTargetsShrink);
        query.put("OperationDescription", request.operationDescription);
        query.put("OperationPreferences", request.operationPreferencesShrink);
        query.put("ParameterOverrides", request.parameterOverrides);
        query.put("RegionId", request.regionId);
        query.put("RegionIds", request.regionIdsShrink);
        query.put("StackGroupName", request.stackGroupName);
        query.put("TimeoutInMinutes", request.timeoutInMinutes);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateStackInstances"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateStackInstancesResponse());
    }

    public UpdateStackInstancesResponse updateStackInstances(UpdateStackInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateStackInstancesWithOptions(request, runtime);
    }

    public UpdateStackTemplateByResourcesResponse updateStackTemplateByResourcesWithOptions(UpdateStackTemplateByResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        query.put("LogicalResourceId", request.logicalResourceId);
        query.put("RegionId", request.regionId);
        query.put("StackId", request.stackId);
        query.put("TemplateFormat", request.templateFormat);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateStackTemplateByResources"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateStackTemplateByResourcesResponse());
    }

    public UpdateStackTemplateByResourcesResponse updateStackTemplateByResources(UpdateStackTemplateByResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateStackTemplateByResourcesWithOptions(request, runtime);
    }

    public UpdateTemplateResponse updateTemplateWithOptions(UpdateTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Description", request.description);
        query.put("TemplateBody", request.templateBody);
        query.put("TemplateId", request.templateId);
        query.put("TemplateName", request.templateName);
        query.put("TemplateURL", request.templateURL);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTemplate"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTemplateResponse());
    }

    public UpdateTemplateResponse updateTemplate(UpdateTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateTemplateWithOptions(request, runtime);
    }

    public UpdateTemplateScratchResponse updateTemplateScratchWithOptions(UpdateTemplateScratchRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateTemplateScratchShrinkRequest request = new UpdateTemplateScratchShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.preferenceParameters)) {
            request.preferenceParametersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.preferenceParameters, "PreferenceParameters", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.sourceResourceGroup))) {
            request.sourceResourceGroupShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.sourceResourceGroup), "SourceResourceGroup", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sourceResources)) {
            request.sourceResourcesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sourceResources, "SourceResources", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.sourceTag))) {
            request.sourceTagShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.sourceTag), "SourceTag", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("Description", request.description);
        query.put("ExecutionMode", request.executionMode);
        query.put("LogicalIdStrategy", request.logicalIdStrategy);
        query.put("PreferenceParameters", request.preferenceParametersShrink);
        query.put("RegionId", request.regionId);
        query.put("SourceResourceGroup", request.sourceResourceGroupShrink);
        query.put("SourceResources", request.sourceResourcesShrink);
        query.put("SourceTag", request.sourceTagShrink);
        query.put("TemplateScratchId", request.templateScratchId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTemplateScratch"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTemplateScratchResponse());
    }

    public UpdateTemplateScratchResponse updateTemplateScratch(UpdateTemplateScratchRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateTemplateScratchWithOptions(request, runtime);
    }

    public ValidateTemplateResponse validateTemplateWithOptions(ValidateTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("RegionId", request.regionId);
        query.put("TemplateBody", request.templateBody);
        query.put("TemplateURL", request.templateURL);
        query.put("ValidationOption", request.validationOption);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ValidateTemplate"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ValidateTemplateResponse());
    }

    public ValidateTemplateResponse validateTemplate(ValidateTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.validateTemplateWithOptions(request, runtime);
    }
}
