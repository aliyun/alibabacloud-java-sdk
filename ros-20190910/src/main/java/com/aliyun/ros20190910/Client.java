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
        if (!com.aliyun.teautil.Common.isUnset(request.cancelType)) {
            query.put("CancelType", request.cancelType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stackId)) {
            query.put("StackId", request.stackId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelUpdateStack"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mode)) {
            query.put("Mode", request.mode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parallelism)) {
            query.put("Parallelism", request.parallelism);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parameters)) {
            query.put("Parameters", request.parameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ramRoleName)) {
            query.put("RamRoleName", request.ramRoleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recreatingResources)) {
            query.put("RecreatingResources", request.recreatingResources);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stackId)) {
            query.put("StackId", request.stackId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateBody)) {
            query.put("TemplateBody", request.templateBody);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateURL)) {
            query.put("TemplateURL", request.templateURL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateVersion)) {
            query.put("TemplateVersion", request.templateVersion);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ContinueCreateStack"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.changeSetName)) {
            query.put("ChangeSetName", request.changeSetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.changeSetType)) {
            query.put("ChangeSetType", request.changeSetType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disableRollback)) {
            query.put("DisableRollback", request.disableRollback);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notificationURLs)) {
            query.put("NotificationURLs", request.notificationURLs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parallelism)) {
            query.put("Parallelism", request.parallelism);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parameters)) {
            query.put("Parameters", request.parameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ramRoleName)) {
            query.put("RamRoleName", request.ramRoleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replacementOption)) {
            query.put("ReplacementOption", request.replacementOption);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourcesToImport)) {
            query.put("ResourcesToImport", request.resourcesToImport);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stackId)) {
            query.put("StackId", request.stackId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stackName)) {
            query.put("StackName", request.stackName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stackPolicyBody)) {
            query.put("StackPolicyBody", request.stackPolicyBody);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stackPolicyDuringUpdateBody)) {
            query.put("StackPolicyDuringUpdateBody", request.stackPolicyDuringUpdateBody);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stackPolicyDuringUpdateURL)) {
            query.put("StackPolicyDuringUpdateURL", request.stackPolicyDuringUpdateURL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stackPolicyURL)) {
            query.put("StackPolicyURL", request.stackPolicyURL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateBody)) {
            query.put("TemplateBody", request.templateBody);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateScratchId)) {
            query.put("TemplateScratchId", request.templateScratchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateURL)) {
            query.put("TemplateURL", request.templateURL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateVersion)) {
            query.put("TemplateVersion", request.templateVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeoutInMinutes)) {
            query.put("TimeoutInMinutes", request.timeoutInMinutes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.usePreviousParameters)) {
            query.put("UsePreviousParameters", request.usePreviousParameters);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateChangeSet"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createOption)) {
            query.put("CreateOption", request.createOption);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deletionProtection)) {
            query.put("DeletionProtection", request.deletionProtection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disableRollback)) {
            query.put("DisableRollback", request.disableRollback);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notificationURLs)) {
            query.put("NotificationURLs", request.notificationURLs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parallelism)) {
            query.put("Parallelism", request.parallelism);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parameters)) {
            query.put("Parameters", request.parameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ramRoleName)) {
            query.put("RamRoleName", request.ramRoleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stackName)) {
            query.put("StackName", request.stackName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stackPolicyBody)) {
            query.put("StackPolicyBody", request.stackPolicyBody);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stackPolicyURL)) {
            query.put("StackPolicyURL", request.stackPolicyURL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateBody)) {
            query.put("TemplateBody", request.templateBody);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateScratchId)) {
            query.put("TemplateScratchId", request.templateScratchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateScratchRegionId)) {
            query.put("TemplateScratchRegionId", request.templateScratchRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateURL)) {
            query.put("TemplateURL", request.templateURL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateVersion)) {
            query.put("TemplateVersion", request.templateVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeoutInMinutes)) {
            query.put("TimeoutInMinutes", request.timeoutInMinutes);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateStack"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.administrationRoleName)) {
            query.put("AdministrationRoleName", request.administrationRoleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoDeploymentShrink)) {
            query.put("AutoDeployment", request.autoDeploymentShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executionRoleName)) {
            query.put("ExecutionRoleName", request.executionRoleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parameters)) {
            query.put("Parameters", request.parameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.permissionModel)) {
            query.put("PermissionModel", request.permissionModel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stackGroupName)) {
            query.put("StackGroupName", request.stackGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateBody)) {
            query.put("TemplateBody", request.templateBody);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateURL)) {
            query.put("TemplateURL", request.templateURL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateVersion)) {
            query.put("TemplateVersion", request.templateVersion);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateStackGroup"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.accountIdsShrink)) {
            query.put("AccountIds", request.accountIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deploymentTargetsShrink)) {
            query.put("DeploymentTargets", request.deploymentTargetsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disableRollback)) {
            query.put("DisableRollback", request.disableRollback);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operationDescription)) {
            query.put("OperationDescription", request.operationDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operationPreferencesShrink)) {
            query.put("OperationPreferences", request.operationPreferencesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parameterOverrides)) {
            query.put("ParameterOverrides", request.parameterOverrides);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionIdsShrink)) {
            query.put("RegionIds", request.regionIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stackGroupName)) {
            query.put("StackGroupName", request.stackGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeoutInMinutes)) {
            query.put("TimeoutInMinutes", request.timeoutInMinutes);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateStackInstances"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateBody)) {
            query.put("TemplateBody", request.templateBody);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateName)) {
            query.put("TemplateName", request.templateName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateURL)) {
            query.put("TemplateURL", request.templateURL);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTemplate"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executionMode)) {
            query.put("ExecutionMode", request.executionMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logicalIdStrategy)) {
            query.put("LogicalIdStrategy", request.logicalIdStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.preferenceParametersShrink)) {
            query.put("PreferenceParameters", request.preferenceParametersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceResourceGroupShrink)) {
            query.put("SourceResourceGroup", request.sourceResourceGroupShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceResourcesShrink)) {
            query.put("SourceResources", request.sourceResourcesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceTagShrink)) {
            query.put("SourceTag", request.sourceTagShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateScratchType)) {
            query.put("TemplateScratchType", request.templateScratchType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTemplateScratch"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.changeSetId)) {
            query.put("ChangeSetId", request.changeSetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteChangeSet"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.ramRoleName)) {
            query.put("RamRoleName", request.ramRoleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.retainAllResources)) {
            query.put("RetainAllResources", request.retainAllResources);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.retainResources)) {
            query.put("RetainResources", request.retainResources);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stackId)) {
            query.put("StackId", request.stackId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteStack"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stackGroupName)) {
            query.put("StackGroupName", request.stackGroupName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteStackGroup"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.accountIdsShrink)) {
            query.put("AccountIds", request.accountIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deploymentTargetsShrink)) {
            query.put("DeploymentTargets", request.deploymentTargetsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operationDescription)) {
            query.put("OperationDescription", request.operationDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operationPreferencesShrink)) {
            query.put("OperationPreferences", request.operationPreferencesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionIdsShrink)) {
            query.put("RegionIds", request.regionIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.retainStacks)) {
            query.put("RetainStacks", request.retainStacks);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stackGroupName)) {
            query.put("StackGroupName", request.stackGroupName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteStackInstances"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTemplate"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateScratchId)) {
            query.put("TemplateScratchId", request.templateScratchId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTemplateScratch"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRegions"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logicalResourceId)) {
            query.put("LogicalResourceId", request.logicalResourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stackId)) {
            query.put("StackId", request.stackId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetectStackDrift"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operationPreferencesShrink)) {
            query.put("OperationPreferences", request.operationPreferencesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stackGroupName)) {
            query.put("StackGroupName", request.stackGroupName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetectStackGroupDrift"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logicalResourceId)) {
            query.put("LogicalResourceId", request.logicalResourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stackId)) {
            query.put("StackId", request.stackId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetectStackResourceDrift"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.changeSetId)) {
            query.put("ChangeSetId", request.changeSetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExecuteChangeSet"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.provisionRegionId)) {
            query.put("ProvisionRegionId", request.provisionRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateScratchId)) {
            query.put("TemplateScratchId", request.templateScratchId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GenerateTemplateByScratch"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.templateBody)) {
            query.put("TemplateBody", request.templateBody);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateURL)) {
            query.put("TemplateURL", request.templateURL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateVersion)) {
            query.put("TemplateVersion", request.templateVersion);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GenerateTemplatePolicy"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.changeSetId)) {
            query.put("ChangeSetId", request.changeSetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.showTemplate)) {
            query.put("ShowTemplate", request.showTemplate);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetChangeSet"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.feature)) {
            query.put("Feature", request.feature);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFeatureDetails"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetResourceType"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetResourceTypeTemplate"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.parameters)) {
            query.put("Parameters", request.parameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.services)) {
            query.put("Services", request.services);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateBody)) {
            query.put("TemplateBody", request.templateBody);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateURL)) {
            query.put("TemplateURL", request.templateURL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateVersion)) {
            query.put("TemplateVersion", request.templateVersion);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetServiceProvisions"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputOption)) {
            query.put("OutputOption", request.outputOption);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.showResourceProgress)) {
            query.put("ShowResourceProgress", request.showResourceProgress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stackId)) {
            query.put("StackId", request.stackId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetStack"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.driftDetectionId)) {
            query.put("DriftDetectionId", request.driftDetectionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetStackDriftDetectionStatus"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stackGroupId)) {
            query.put("StackGroupId", request.stackGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stackGroupName)) {
            query.put("StackGroupName", request.stackGroupName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetStackGroup"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.operationId)) {
            query.put("OperationId", request.operationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetStackGroupOperation"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stackGroupName)) {
            query.put("StackGroupName", request.stackGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stackInstanceAccountId)) {
            query.put("StackInstanceAccountId", request.stackInstanceAccountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stackInstanceRegionId)) {
            query.put("StackInstanceRegionId", request.stackInstanceRegionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetStackInstance"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stackId)) {
            query.put("StackId", request.stackId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetStackPolicy"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logicalResourceId)) {
            query.put("LogicalResourceId", request.logicalResourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.showResourceAttributes)) {
            query.put("ShowResourceAttributes", request.showResourceAttributes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stackId)) {
            query.put("StackId", request.stackId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetStackResource"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.changeSetId)) {
            query.put("ChangeSetId", request.changeSetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includePermission)) {
            query.put("IncludePermission", request.includePermission);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stackGroupName)) {
            query.put("StackGroupName", request.stackGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stackId)) {
            query.put("StackId", request.stackId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateStage)) {
            query.put("TemplateStage", request.templateStage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateVersion)) {
            query.put("TemplateVersion", request.templateVersion);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTemplate"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parameters)) {
            query.put("Parameters", request.parameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateBody)) {
            query.put("TemplateBody", request.templateBody);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateScratchId)) {
            query.put("TemplateScratchId", request.templateScratchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateScratchRegionId)) {
            query.put("TemplateScratchRegionId", request.templateScratchRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateURL)) {
            query.put("TemplateURL", request.templateURL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateVersion)) {
            query.put("TemplateVersion", request.templateVersion);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTemplateEstimateCost"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parameters)) {
            query.put("Parameters", request.parameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parametersKeyFilterShrink)) {
            query.put("ParametersKeyFilter", request.parametersKeyFilterShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateBody)) {
            query.put("TemplateBody", request.templateBody);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateURL)) {
            query.put("TemplateURL", request.templateURL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateVersion)) {
            query.put("TemplateVersion", request.templateVersion);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTemplateParameterConstraints"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.showDataOption)) {
            query.put("ShowDataOption", request.showDataOption);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateScratchId)) {
            query.put("TemplateScratchId", request.templateScratchId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTemplateScratch"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.changeSetId)) {
            query.put("ChangeSetId", request.changeSetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stackGroupName)) {
            query.put("StackGroupName", request.stackGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stackId)) {
            query.put("StackId", request.stackId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateBody)) {
            query.put("TemplateBody", request.templateBody);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateURL)) {
            query.put("TemplateURL", request.templateURL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateVersion)) {
            query.put("TemplateVersion", request.templateVersion);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTemplateSummary"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.changeSetId)) {
            query.put("ChangeSetId", request.changeSetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.changeSetName)) {
            query.put("ChangeSetName", request.changeSetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executionStatus)) {
            query.put("ExecutionStatus", request.executionStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stackId)) {
            query.put("StackId", request.stackId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListChangeSets"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.logicalResourceId)) {
            query.put("LogicalResourceId", request.logicalResourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stackId)) {
            query.put("StackId", request.stackId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListStackEvents"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.operationId)) {
            query.put("OperationId", request.operationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListStackGroupOperationResults"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stackGroupName)) {
            query.put("StackGroupName", request.stackGroupName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListStackGroupOperations"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListStackGroups"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stackGroupName)) {
            query.put("StackGroupName", request.stackGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stackInstanceAccountId)) {
            query.put("StackInstanceAccountId", request.stackInstanceAccountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stackInstanceRegionId)) {
            query.put("StackInstanceRegionId", request.stackInstanceRegionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListStackInstances"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operationType)) {
            query.put("OperationType", request.operationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ramRoleName)) {
            query.put("RamRoleName", request.ramRoleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.retainAllResources)) {
            query.put("RetainAllResources", request.retainAllResources);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.retainResources)) {
            query.put("RetainResources", request.retainResources);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stackId)) {
            query.put("StackId", request.stackId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListStackOperationRisks"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceDriftStatus)) {
            query.put("ResourceDriftStatus", request.resourceDriftStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stackId)) {
            query.put("StackId", request.stackId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListStackResourceDrifts"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stackId)) {
            query.put("StackId", request.stackId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListStackResources"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentStackId)) {
            query.put("ParentStackId", request.parentStackId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.showNestedStack)) {
            query.put("ShowNestedStack", request.showNestedStack);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stackId)) {
            query.put("StackId", request.stackId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stackIds)) {
            query.put("StackIds", request.stackIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stackName)) {
            query.put("StackName", request.stackName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListStacks"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTagKeys"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTagResources"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.key)) {
            query.put("Key", request.key);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTagValues"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateScratchId)) {
            query.put("TemplateScratchId", request.templateScratchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateScratchType)) {
            query.put("TemplateScratchType", request.templateScratchType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTemplateScratches"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTemplateVersions"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shareType)) {
            query.put("ShareType", request.shareType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateName)) {
            query.put("TemplateName", request.templateName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTemplates"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.newResourceGroupId)) {
            query.put("NewResourceGroupId", request.newResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MoveResourceGroup"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disableRollback)) {
            query.put("DisableRollback", request.disableRollback);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parallelism)) {
            query.put("Parallelism", request.parallelism);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parameters)) {
            query.put("Parameters", request.parameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stackName)) {
            query.put("StackName", request.stackName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stackPolicyBody)) {
            query.put("StackPolicyBody", request.stackPolicyBody);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stackPolicyURL)) {
            query.put("StackPolicyURL", request.stackPolicyURL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateBody)) {
            query.put("TemplateBody", request.templateBody);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateScratchId)) {
            query.put("TemplateScratchId", request.templateScratchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateScratchRegionId)) {
            query.put("TemplateScratchRegionId", request.templateScratchRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateURL)) {
            query.put("TemplateURL", request.templateURL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateVersion)) {
            query.put("TemplateVersion", request.templateVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeoutInMinutes)) {
            query.put("TimeoutInMinutes", request.timeoutInMinutes);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PreviewStack"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.deletionProtection)) {
            query.put("DeletionProtection", request.deletionProtection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stackId)) {
            query.put("StackId", request.stackId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetDeletionProtection"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stackId)) {
            query.put("StackId", request.stackId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stackPolicyBody)) {
            query.put("StackPolicyBody", request.stackPolicyBody);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stackPolicyURL)) {
            query.put("StackPolicyURL", request.stackPolicyURL);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetStackPolicy"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.accountIds)) {
            query.put("AccountIds", request.accountIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shareOption)) {
            query.put("ShareOption", request.shareOption);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateVersion)) {
            query.put("TemplateVersion", request.templateVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionOption)) {
            query.put("VersionOption", request.versionOption);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetTemplatePermission"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logicalResourceId)) {
            query.put("LogicalResourceId", request.logicalResourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stackId)) {
            query.put("StackId", request.stackId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uniqueId)) {
            query.put("UniqueId", request.uniqueId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SignalResource"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.operationId)) {
            query.put("OperationId", request.operationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopStackGroupOperation"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TagResources"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.all)) {
            query.put("All", request.all);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagKey)) {
            query.put("TagKey", request.tagKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UntagResources"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disableRollback)) {
            query.put("DisableRollback", request.disableRollback);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parallelism)) {
            query.put("Parallelism", request.parallelism);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parameters)) {
            query.put("Parameters", request.parameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ramRoleName)) {
            query.put("RamRoleName", request.ramRoleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replacementOption)) {
            query.put("ReplacementOption", request.replacementOption);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stackId)) {
            query.put("StackId", request.stackId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stackPolicyBody)) {
            query.put("StackPolicyBody", request.stackPolicyBody);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stackPolicyDuringUpdateBody)) {
            query.put("StackPolicyDuringUpdateBody", request.stackPolicyDuringUpdateBody);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stackPolicyDuringUpdateURL)) {
            query.put("StackPolicyDuringUpdateURL", request.stackPolicyDuringUpdateURL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stackPolicyURL)) {
            query.put("StackPolicyURL", request.stackPolicyURL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateBody)) {
            query.put("TemplateBody", request.templateBody);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateURL)) {
            query.put("TemplateURL", request.templateURL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateVersion)) {
            query.put("TemplateVersion", request.templateVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeoutInMinutes)) {
            query.put("TimeoutInMinutes", request.timeoutInMinutes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.usePreviousParameters)) {
            query.put("UsePreviousParameters", request.usePreviousParameters);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateStack"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.accountIdsShrink)) {
            query.put("AccountIds", request.accountIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.administrationRoleName)) {
            query.put("AdministrationRoleName", request.administrationRoleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoDeploymentShrink)) {
            query.put("AutoDeployment", request.autoDeploymentShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deploymentTargetsShrink)) {
            query.put("DeploymentTargets", request.deploymentTargetsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executionRoleName)) {
            query.put("ExecutionRoleName", request.executionRoleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operationDescription)) {
            query.put("OperationDescription", request.operationDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operationPreferencesShrink)) {
            query.put("OperationPreferences", request.operationPreferencesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parameters)) {
            query.put("Parameters", request.parameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.permissionModel)) {
            query.put("PermissionModel", request.permissionModel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionIdsShrink)) {
            query.put("RegionIds", request.regionIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stackGroupName)) {
            query.put("StackGroupName", request.stackGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateBody)) {
            query.put("TemplateBody", request.templateBody);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateURL)) {
            query.put("TemplateURL", request.templateURL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateVersion)) {
            query.put("TemplateVersion", request.templateVersion);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateStackGroup"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.accountIdsShrink)) {
            query.put("AccountIds", request.accountIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deploymentTargetsShrink)) {
            query.put("DeploymentTargets", request.deploymentTargetsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operationDescription)) {
            query.put("OperationDescription", request.operationDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operationPreferencesShrink)) {
            query.put("OperationPreferences", request.operationPreferencesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parameterOverrides)) {
            query.put("ParameterOverrides", request.parameterOverrides);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionIdsShrink)) {
            query.put("RegionIds", request.regionIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stackGroupName)) {
            query.put("StackGroupName", request.stackGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeoutInMinutes)) {
            query.put("TimeoutInMinutes", request.timeoutInMinutes);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateStackInstances"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logicalResourceId)) {
            query.put("LogicalResourceId", request.logicalResourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stackId)) {
            query.put("StackId", request.stackId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateFormat)) {
            query.put("TemplateFormat", request.templateFormat);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateStackTemplateByResources"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateBody)) {
            query.put("TemplateBody", request.templateBody);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateName)) {
            query.put("TemplateName", request.templateName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateURL)) {
            query.put("TemplateURL", request.templateURL);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTemplate"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executionMode)) {
            query.put("ExecutionMode", request.executionMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logicalIdStrategy)) {
            query.put("LogicalIdStrategy", request.logicalIdStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.preferenceParametersShrink)) {
            query.put("PreferenceParameters", request.preferenceParametersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceResourceGroupShrink)) {
            query.put("SourceResourceGroup", request.sourceResourceGroupShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceResourcesShrink)) {
            query.put("SourceResources", request.sourceResourcesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceTagShrink)) {
            query.put("SourceTag", request.sourceTagShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateScratchId)) {
            query.put("TemplateScratchId", request.templateScratchId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTemplateScratch"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateBody)) {
            query.put("TemplateBody", request.templateBody);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateURL)) {
            query.put("TemplateURL", request.templateURL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.validationOption)) {
            query.put("ValidationOption", request.validationOption);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ValidateTemplate"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ValidateTemplateResponse());
    }

    public ValidateTemplateResponse validateTemplate(ValidateTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.validateTemplateWithOptions(request, runtime);
    }
}
