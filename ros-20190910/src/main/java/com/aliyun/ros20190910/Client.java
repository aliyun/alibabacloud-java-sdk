// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910;

import com.aliyun.tea.*;
import com.aliyun.ros20190910.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
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

    public CancelStackOperationResponse cancelStackOperationWithOptions(CancelStackOperationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.allowedStackOperations)) {
            query.put("AllowedStackOperations", request.allowedStackOperations);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cancelType)) {
            query.put("CancelType", request.cancelType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stackId)) {
            query.put("StackId", request.stackId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelStackOperation"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelStackOperationResponse());
    }

    public CancelStackOperationResponse cancelStackOperation(CancelStackOperationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelStackOperationWithOptions(request, runtime);
    }

    public CancelUpdateStackResponse cancelUpdateStackWithOptions(CancelUpdateStackRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelUpdateStackWithOptions(request, runtime);
    }

    /**
      * This topic provides an example on how to continue to create a stack after the stack fails to be created. In this example, the stack whose ID is `4a6c9851-3b0f-4f5f-b4ca-a14bf691****` is created in the China (Hangzhou) region.
      *
      * @param request ContinueCreateStackRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ContinueCreateStackResponse
     */
    public ContinueCreateStackResponse continueCreateStackWithOptions(ContinueCreateStackRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.recreatingOptions)) {
            query.put("RecreatingOptions", request.recreatingOptions);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * This topic provides an example on how to continue to create a stack after the stack fails to be created. In this example, the stack whose ID is `4a6c9851-3b0f-4f5f-b4ca-a14bf691****` is created in the China (Hangzhou) region.
      *
      * @param request ContinueCreateStackRequest
      * @return ContinueCreateStackResponse
     */
    public ContinueCreateStackResponse continueCreateStack(ContinueCreateStackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.continueCreateStackWithOptions(request, runtime);
    }

    /**
      * ### Limits
      * You can create and execute change sets to update running stacks. For more information about change sets, see [Overview](~~156038~~).
      * ### Usage notes
      * *   A stack can contain up to 20 change sets.
      * *   Change sets reflect only the changes of stacks. Change sets do not reflect whether stacks are updated.
      * *   You cannot use change sets to check the following items: whether the upper limit of your Alibaba Cloud account is reached, whether resources that cannot be updated are updated, and whether your Alibaba Cloud account has permissions to modify resources. These items may cause stack updates to fail. If stacks fail to be updated, Resource Orchestration Service (ROS) rolls back the resources to the original status.
      * In this topic, a change set named `MyChangeSet` is created in the `China (Hangzhou)` region. In this example, the template of the stack whose ID is `4a6c9851-3b0f-4f5f-b4ca-a14bf691****` is updated to `{"ROSTemplateFormatVersion":"2015-09-01"}`.
      *
      * @param request CreateChangeSetRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return CreateChangeSetResponse
     */
    public CreateChangeSetResponse createChangeSetWithOptions(CreateChangeSetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.templateBody)) {
            body.put("TemplateBody", request.templateBody);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * ### Limits
      * You can create and execute change sets to update running stacks. For more information about change sets, see [Overview](~~156038~~).
      * ### Usage notes
      * *   A stack can contain up to 20 change sets.
      * *   Change sets reflect only the changes of stacks. Change sets do not reflect whether stacks are updated.
      * *   You cannot use change sets to check the following items: whether the upper limit of your Alibaba Cloud account is reached, whether resources that cannot be updated are updated, and whether your Alibaba Cloud account has permissions to modify resources. These items may cause stack updates to fail. If stacks fail to be updated, Resource Orchestration Service (ROS) rolls back the resources to the original status.
      * In this topic, a change set named `MyChangeSet` is created in the `China (Hangzhou)` region. In this example, the template of the stack whose ID is `4a6c9851-3b0f-4f5f-b4ca-a14bf691****` is updated to `{"ROSTemplateFormatVersion":"2015-09-01"}`.
      *
      * @param request CreateChangeSetRequest
      * @return CreateChangeSetResponse
     */
    public CreateChangeSetResponse createChangeSet(CreateChangeSetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createChangeSetWithOptions(request, runtime);
    }

    public CreateDiagnosticResponse createDiagnosticWithOptions(CreateDiagnosticRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.diagnosticKey)) {
            query.put("DiagnosticKey", request.diagnosticKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.diagnosticType)) {
            query.put("DiagnosticType", request.diagnosticType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.product)) {
            query.put("Product", request.product);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDiagnostic"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDiagnosticResponse());
    }

    public CreateDiagnosticResponse createDiagnostic(CreateDiagnosticRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDiagnosticWithOptions(request, runtime);
    }

    /**
      * A stack is a collection of ROS resources that you can manage as a single unit. To create a collection of resources, you can create a stack. For more information about stacks, see [Overview](~~172973~~).\\
      * When you call the operation, take note of the following limits:
      * *   You can create up to 200 stacks within an Alibaba Cloud account.
      * *   You can create up to 200 resources in a stack.
      * This topic provides an example on how to create a stack named `MyStack` in the China (Hangzhou) region by using a template. In this example, `TemplateBody` is set to `{"ROSTemplateFormatVersion":"2015-09-01"}`.
      *
      * @param request CreateStackRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return CreateStackResponse
     */
    public CreateStackResponse createStackWithOptions(CreateStackRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createOption)) {
            query.put("CreateOption", request.createOption);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createOptions)) {
            query.put("CreateOptions", request.createOptions);
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

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.templateBody)) {
            body.put("TemplateBody", request.templateBody);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * A stack is a collection of ROS resources that you can manage as a single unit. To create a collection of resources, you can create a stack. For more information about stacks, see [Overview](~~172973~~).\\
      * When you call the operation, take note of the following limits:
      * *   You can create up to 200 stacks within an Alibaba Cloud account.
      * *   You can create up to 200 resources in a stack.
      * This topic provides an example on how to create a stack named `MyStack` in the China (Hangzhou) region by using a template. In this example, `TemplateBody` is set to `{"ROSTemplateFormatVersion":"2015-09-01"}`.
      *
      * @param request CreateStackRequest
      * @return CreateStackResponse
     */
    public CreateStackResponse createStack(CreateStackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createStackWithOptions(request, runtime);
    }

    /**
      * A stack group is a collection of ROS stacks that you can manage as a unit. You can use an ROS template of a stack group to create stacks within Alibaba Cloud accounts across regions.
      * You can create a stack group that is granted self-managed or service-managed permissions:
      * *   If you use an Alibaba Cloud account to create a self-managed stack group, the administrator account and the execution account are Alibaba Cloud accounts.
      * *   If you enable a resource directory and use the management account or a delegated administrator account of the resource directory to create a service-managed stack group, the administrator account is the management account or delegated administrator account, and the execution account is a member account of the resource directory.
      * For more information about stack groups, see [Overview](~~154578~~).
      * In this topic, a stack group named `MyStackGroup` is created in the `China (Hangzhou)` region and granted the self-managed permissions. In this example, the template whose ID is `5ecd1e10-b0e9-4389-a565-e4c15efc****` is used.
      *
      * @param tmpReq CreateStackGroupRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return CreateStackGroupResponse
     */
    public CreateStackGroupResponse createStackGroupWithOptions(CreateStackGroupRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateStackGroupShrinkRequest request = new CreateStackGroupShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.autoDeployment)) {
            request.autoDeploymentShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.autoDeployment, "AutoDeployment", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.administrationRoleName)) {
            query.put("AdministrationRoleName", request.administrationRoleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoDeploymentShrink)) {
            query.put("AutoDeployment", request.autoDeploymentShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.capabilities)) {
            query.put("Capabilities", request.capabilities);
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

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
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

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.templateBody)) {
            body.put("TemplateBody", request.templateBody);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * A stack group is a collection of ROS stacks that you can manage as a unit. You can use an ROS template of a stack group to create stacks within Alibaba Cloud accounts across regions.
      * You can create a stack group that is granted self-managed or service-managed permissions:
      * *   If you use an Alibaba Cloud account to create a self-managed stack group, the administrator account and the execution account are Alibaba Cloud accounts.
      * *   If you enable a resource directory and use the management account or a delegated administrator account of the resource directory to create a service-managed stack group, the administrator account is the management account or delegated administrator account, and the execution account is a member account of the resource directory.
      * For more information about stack groups, see [Overview](~~154578~~).
      * In this topic, a stack group named `MyStackGroup` is created in the `China (Hangzhou)` region and granted the self-managed permissions. In this example, the template whose ID is `5ecd1e10-b0e9-4389-a565-e4c15efc****` is used.
      *
      * @param request CreateStackGroupRequest
      * @return CreateStackGroupResponse
     */
    public CreateStackGroupResponse createStackGroup(CreateStackGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createStackGroupWithOptions(request, runtime);
    }

    /**
      * Before you call this operation, make sure that a stack group is created. For more information, see [CreateStackGroup](~~151333~~).
      * In this topic, the stack group named `MyStackGroup` is used. The stack group is created in the China (Hangzhou) region and granted the self-managed permissions. In this example, stacks are created by using Alibaba Cloud accounts whose IDs are `151266687691****` and `141261387191****` in the China (Hangzhou) region and China (Beijing) region.
      *
      * @param tmpReq CreateStackInstancesRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return CreateStackInstancesResponse
     */
    public CreateStackInstancesResponse createStackInstancesWithOptions(CreateStackInstancesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateStackInstancesShrinkRequest request = new CreateStackInstancesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.accountIds)) {
            request.accountIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.accountIds, "AccountIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.deploymentTargets)) {
            request.deploymentTargetsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.deploymentTargets, "DeploymentTargets", "json");
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * Before you call this operation, make sure that a stack group is created. For more information, see [CreateStackGroup](~~151333~~).
      * In this topic, the stack group named `MyStackGroup` is used. The stack group is created in the China (Hangzhou) region and granted the self-managed permissions. In this example, stacks are created by using Alibaba Cloud accounts whose IDs are `151266687691****` and `141261387191****` in the China (Hangzhou) region and China (Beijing) region.
      *
      * @param request CreateStackInstancesRequest
      * @return CreateStackInstancesResponse
     */
    public CreateStackInstancesResponse createStackInstances(CreateStackInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createStackInstancesWithOptions(request, runtime);
    }

    /**
      * In this topic, a custom template named `MyTemplate` is created in the `cn-hangzhou` region. The `TemplateBody` parameter of the template is set to `{"ROSTemplateFormatVersion": "2015-09-01"}`.
      *
      * @param request CreateTemplateRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return CreateTemplateResponse
     */
    public CreateTemplateResponse createTemplateWithOptions(CreateTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateName)) {
            query.put("TemplateName", request.templateName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateURL)) {
            query.put("TemplateURL", request.templateURL);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.templateBody)) {
            body.put("TemplateBody", request.templateBody);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * In this topic, a custom template named `MyTemplate` is created in the `cn-hangzhou` region. The `TemplateBody` parameter of the template is set to `{"ROSTemplateFormatVersion": "2015-09-01"}`.
      *
      * @param request CreateTemplateRequest
      * @return CreateTemplateResponse
     */
    public CreateTemplateResponse createTemplate(CreateTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTemplateWithOptions(request, runtime);
    }

    /**
      * ###
      * You can call this operation to create a scenario that allows you to specify a resource scope on a visualized interface and easily replicate and manage the resources that you specify. For more information about scenarios, see [Overview](~~352074~~).
      * In this example, a scenario of the Resource Replication type is created in the China (Hangzhou) region. In the scenario, the virtual private cloud (VPC) whose ID is `vpc-bp1m6fww66xbntjyc****` is replicated.
      *
      * @param tmpReq CreateTemplateScratchRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return CreateTemplateScratchResponse
     */
    public CreateTemplateScratchResponse createTemplateScratchWithOptions(CreateTemplateScratchRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateTemplateScratchShrinkRequest request = new CreateTemplateScratchShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.preferenceParameters)) {
            request.preferenceParametersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.preferenceParameters, "PreferenceParameters", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sourceResourceGroup)) {
            request.sourceResourceGroupShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sourceResourceGroup, "SourceResourceGroup", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sourceResources)) {
            request.sourceResourcesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sourceResources, "SourceResources", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sourceTag)) {
            request.sourceTagShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sourceTag, "SourceTag", "json");
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateScratchType)) {
            query.put("TemplateScratchType", request.templateScratchType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * ###
      * You can call this operation to create a scenario that allows you to specify a resource scope on a visualized interface and easily replicate and manage the resources that you specify. For more information about scenarios, see [Overview](~~352074~~).
      * In this example, a scenario of the Resource Replication type is created in the China (Hangzhou) region. In the scenario, the virtual private cloud (VPC) whose ID is `vpc-bp1m6fww66xbntjyc****` is replicated.
      *
      * @param request CreateTemplateScratchRequest
      * @return CreateTemplateScratchResponse
     */
    public CreateTemplateScratchResponse createTemplateScratch(CreateTemplateScratchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTemplateScratchWithOptions(request, runtime);
    }

    /**
      * *   Before you call this operation, make sure that the following requirements are met:
      *     *   The status of the change set is CREATE_COMPLETE, CREATE_FAILED, or DELETE_FAILED.
      *     *   The execution status is UNAVAILABLE or AVAILABLE.
      * *   After a change set is executed, other change sets associated with the same stack as this change set are also deleted.
      * *   After a stack is deleted, change sets associated with the stack are deleted.
      * *   If a change set of the CREATE type is deleted, you must delete stacks associated with the change set.
      * In this example, a change set whose ID is `1f6521a4-05af-4975-afe9-bc4b45ad****` is deleted. The change set is created in the China (Hangzhou) region.
      *
      * @param request DeleteChangeSetRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DeleteChangeSetResponse
     */
    public DeleteChangeSetResponse deleteChangeSetWithOptions(DeleteChangeSetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.changeSetId)) {
            query.put("ChangeSetId", request.changeSetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * *   Before you call this operation, make sure that the following requirements are met:
      *     *   The status of the change set is CREATE_COMPLETE, CREATE_FAILED, or DELETE_FAILED.
      *     *   The execution status is UNAVAILABLE or AVAILABLE.
      * *   After a change set is executed, other change sets associated with the same stack as this change set are also deleted.
      * *   After a stack is deleted, change sets associated with the stack are deleted.
      * *   If a change set of the CREATE type is deleted, you must delete stacks associated with the change set.
      * In this example, a change set whose ID is `1f6521a4-05af-4975-afe9-bc4b45ad****` is deleted. The change set is created in the China (Hangzhou) region.
      *
      * @param request DeleteChangeSetRequest
      * @return DeleteChangeSetResponse
     */
    public DeleteChangeSetResponse deleteChangeSet(DeleteChangeSetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteChangeSetWithOptions(request, runtime);
    }

    public DeleteDiagnosticResponse deleteDiagnosticWithOptions(DeleteDiagnosticRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.reportId)) {
            query.put("ReportId", request.reportId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDiagnostic"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDiagnosticResponse());
    }

    public DeleteDiagnosticResponse deleteDiagnostic(DeleteDiagnosticRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDiagnosticWithOptions(request, runtime);
    }

    public DeleteStackResponse deleteStackWithOptions(DeleteStackRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deleteOptions)) {
            query.put("DeleteOptions", request.deleteOptions);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteStackWithOptions(request, runtime);
    }

    /**
      * A stack group can be deleted only when the stack group does not contain stacks. You can call the [DeleteStackInstances](~~151715~~) operation to delete stacks.
      * This topic provides an example on how to delete a stack group. In this example, a stack group named `MyStackGroup` in the China (Hangzhou) region is deleted.
      *
      * @param request DeleteStackGroupRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DeleteStackGroupResponse
     */
    public DeleteStackGroupResponse deleteStackGroupWithOptions(DeleteStackGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stackGroupName)) {
            query.put("StackGroupName", request.stackGroupName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * A stack group can be deleted only when the stack group does not contain stacks. You can call the [DeleteStackInstances](~~151715~~) operation to delete stacks.
      * This topic provides an example on how to delete a stack group. In this example, a stack group named `MyStackGroup` in the China (Hangzhou) region is deleted.
      *
      * @param request DeleteStackGroupRequest
      * @return DeleteStackGroupResponse
     */
    public DeleteStackGroupResponse deleteStackGroup(DeleteStackGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteStackGroupWithOptions(request, runtime);
    }

    /**
      * In this topic, the stack group named `MyStackGroup` that is created in the China (Hangzhou) region is used. In this example, the stacks of the stack group that are deployed in the China (Beijing) region by using the Alibaba Cloud account whose ID is `151266687691****` are deleted.
      *
      * @param tmpReq DeleteStackInstancesRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DeleteStackInstancesResponse
     */
    public DeleteStackInstancesResponse deleteStackInstancesWithOptions(DeleteStackInstancesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteStackInstancesShrinkRequest request = new DeleteStackInstancesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.accountIds)) {
            request.accountIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.accountIds, "AccountIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.deploymentTargets)) {
            request.deploymentTargetsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.deploymentTargets, "DeploymentTargets", "json");
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * In this topic, the stack group named `MyStackGroup` that is created in the China (Hangzhou) region is used. In this example, the stacks of the stack group that are deployed in the China (Beijing) region by using the Alibaba Cloud account whose ID is `151266687691****` are deleted.
      *
      * @param request DeleteStackInstancesRequest
      * @return DeleteStackInstancesResponse
     */
    public DeleteStackInstancesResponse deleteStackInstances(DeleteStackInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteStackInstancesWithOptions(request, runtime);
    }

    /**
      * If a template is shared with other Alibaba Cloud accounts, you must unshare the template before you delete it.
      *
      * @param request DeleteTemplateRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DeleteTemplateResponse
     */
    public DeleteTemplateResponse deleteTemplateWithOptions(DeleteTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * If a template is shared with other Alibaba Cloud accounts, you must unshare the template before you delete it.
      *
      * @param request DeleteTemplateRequest
      * @return DeleteTemplateResponse
     */
    public DeleteTemplateResponse deleteTemplate(DeleteTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteTemplateWithOptions(request, runtime);
    }

    /**
      * In this topic, a scenario whose ID is `ts-4f83704400994409****` is deleted in the China (Hangzhou) region.
      *
      * @param request DeleteTemplateScratchRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DeleteTemplateScratchResponse
     */
    public DeleteTemplateScratchResponse deleteTemplateScratchWithOptions(DeleteTemplateScratchRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateScratchId)) {
            query.put("TemplateScratchId", request.templateScratchId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * In this topic, a scenario whose ID is `ts-4f83704400994409****` is deleted in the China (Hangzhou) region.
      *
      * @param request DeleteTemplateScratchRequest
      * @return DeleteTemplateScratchResponse
     */
    public DeleteTemplateScratchResponse deleteTemplateScratch(DeleteTemplateScratchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteTemplateScratchWithOptions(request, runtime);
    }

    /**
      * *   If you delete a resource type, you can no longer use the resource type in Resource Orchestration Service (ROS).
      * *   If you delete a version of a resource type, you can no longer use the version in ROS.
      * *   If a resource type has only one version, you can delete the version by calling the operation. If a resource type has more than one version, you must manually delete the remaining versions.
      * *   When a resource type has more than one version, you cannot delete the default version by calling the operation.
      * *   When a resource type has only one version, you can delete the resource type and the version by calling the operation.
      *
      * @param request DeregisterResourceTypeRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DeregisterResourceTypeResponse
     */
    public DeregisterResourceTypeResponse deregisterResourceTypeWithOptions(DeregisterResourceTypeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionId)) {
            query.put("VersionId", request.versionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeregisterResourceType"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeregisterResourceTypeResponse());
    }

    /**
      * *   If you delete a resource type, you can no longer use the resource type in Resource Orchestration Service (ROS).
      * *   If you delete a version of a resource type, you can no longer use the version in ROS.
      * *   If a resource type has only one version, you can delete the version by calling the operation. If a resource type has more than one version, you must manually delete the remaining versions.
      * *   When a resource type has more than one version, you cannot delete the default version by calling the operation.
      * *   When a resource type has only one version, you can delete the resource type and the version by calling the operation.
      *
      * @param request DeregisterResourceTypeRequest
      * @return DeregisterResourceTypeResponse
     */
    public DeregisterResourceTypeResponse deregisterResourceType(DeregisterResourceTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deregisterResourceTypeWithOptions(request, runtime);
    }

    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRegionsWithOptions(request, runtime);
    }

    public DetectStackDriftResponse detectStackDriftWithOptions(DetectStackDriftRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detectStackDriftWithOptions(request, runtime);
    }

    public DetectStackGroupDriftResponse detectStackGroupDriftWithOptions(DetectStackGroupDriftRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detectStackGroupDriftWithOptions(request, runtime);
    }

    public DetectStackResourceDriftResponse detectStackResourceDriftWithOptions(DetectStackResourceDriftRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detectStackResourceDriftWithOptions(request, runtime);
    }

    /**
      * In this example, the change set whose ID is `1f6521a4-05af-4975-afe9-bc4b45ad****` is executed. The change set is created in the `China (Hangzhou)` region.
      *
      * @param request ExecuteChangeSetRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ExecuteChangeSetResponse
     */
    public ExecuteChangeSetResponse executeChangeSetWithOptions(ExecuteChangeSetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * In this example, the change set whose ID is `1f6521a4-05af-4975-afe9-bc4b45ad****` is executed. The change set is created in the `China (Hangzhou)` region.
      *
      * @param request ExecuteChangeSetRequest
      * @return ExecuteChangeSetResponse
     */
    public ExecuteChangeSetResponse executeChangeSet(ExecuteChangeSetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.executeChangeSetWithOptions(request, runtime);
    }

    /**
      * In this example, a template is created for the scenario whose ID is `ts-aa9c62feab844a6b****`. The scenario is of the Resource Management type and resides in the China (Hangzhou) region.
      *
      * @param request GenerateTemplateByScratchRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GenerateTemplateByScratchResponse
     */
    public GenerateTemplateByScratchResponse generateTemplateByScratchWithOptions(GenerateTemplateByScratchRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.templateType)) {
            query.put("TemplateType", request.templateType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * In this example, a template is created for the scenario whose ID is `ts-aa9c62feab844a6b****`. The scenario is of the Resource Management type and resides in the China (Hangzhou) region.
      *
      * @param request GenerateTemplateByScratchRequest
      * @return GenerateTemplateByScratchResponse
     */
    public GenerateTemplateByScratchResponse generateTemplateByScratch(GenerateTemplateByScratchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.generateTemplateByScratchWithOptions(request, runtime);
    }

    /**
      * If the policy information is related to Enterprise Distributed Application Service (EDAS), you must log on to your Alibaba Cloud account and grant the required permissions to the relevant RAM users.
      * In this example, a policy is generated for a template whose ID is `5ecd1e10-b0e9-4389-a565-e4c15efc****`.
      *
      * @param request GenerateTemplatePolicyRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GenerateTemplatePolicyResponse
     */
    public GenerateTemplatePolicyResponse generateTemplatePolicyWithOptions(GenerateTemplatePolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.operationTypes)) {
            query.put("OperationTypes", request.operationTypes);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * If the policy information is related to Enterprise Distributed Application Service (EDAS), you must log on to your Alibaba Cloud account and grant the required permissions to the relevant RAM users.
      * In this example, a policy is generated for a template whose ID is `5ecd1e10-b0e9-4389-a565-e4c15efc****`.
      *
      * @param request GenerateTemplatePolicyRequest
      * @return GenerateTemplatePolicyResponse
     */
    public GenerateTemplatePolicyResponse generateTemplatePolicy(GenerateTemplatePolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.generateTemplatePolicyWithOptions(request, runtime);
    }

    /**
      * In this example, the details of a change set whose ID is `4c11658d-bd47-4dd0-ba64-727edc62****` is queried. The change set is created in the China (Hangzhou) region.
      *
      * @param request GetChangeSetRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetChangeSetResponse
     */
    public GetChangeSetResponse getChangeSetWithOptions(GetChangeSetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * In this example, the details of a change set whose ID is `4c11658d-bd47-4dd0-ba64-727edc62****` is queried. The change set is created in the China (Hangzhou) region.
      *
      * @param request GetChangeSetRequest
      * @return GetChangeSetResponse
     */
    public GetChangeSetResponse getChangeSet(GetChangeSetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getChangeSetWithOptions(request, runtime);
    }

    public GetDiagnosticResponse getDiagnosticWithOptions(GetDiagnosticRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.reportId)) {
            query.put("ReportId", request.reportId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDiagnostic"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDiagnosticResponse());
    }

    public GetDiagnosticResponse getDiagnostic(GetDiagnosticRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDiagnosticWithOptions(request, runtime);
    }

    /**
      * You can call this operation to query the Terraform hosting, resource cleaner, and scenario features.
      * This topic provides an example on how to query the details of features supported by ROS in the China (Hangzhou) region. The details include Terraform versions, provider versions, and supported resource types.
      * >  In the Examples section, only part of the sample code is provided.
      *
      * @param request GetFeatureDetailsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetFeatureDetailsResponse
     */
    public GetFeatureDetailsResponse getFeatureDetailsWithOptions(GetFeatureDetailsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.feature)) {
            query.put("Feature", request.feature);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * You can call this operation to query the Terraform hosting, resource cleaner, and scenario features.
      * This topic provides an example on how to query the details of features supported by ROS in the China (Hangzhou) region. The details include Terraform versions, provider versions, and supported resource types.
      * >  In the Examples section, only part of the sample code is provided.
      *
      * @param request GetFeatureDetailsRequest
      * @return GetFeatureDetailsResponse
     */
    public GetFeatureDetailsResponse getFeatureDetails(GetFeatureDetailsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getFeatureDetailsWithOptions(request, runtime);
    }

    /**
      * For more information about common request parameters, see [Common parameters](~~131957~~).
      *
      * @param request GetResourceTypeRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetResourceTypeResponse
     */
    public GetResourceTypeResponse getResourceTypeWithOptions(GetResourceTypeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionId)) {
            query.put("VersionId", request.versionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * For more information about common request parameters, see [Common parameters](~~131957~~).
      *
      * @param request GetResourceTypeRequest
      * @return GetResourceTypeResponse
     */
    public GetResourceTypeResponse getResourceType(GetResourceTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getResourceTypeWithOptions(request, runtime);
    }

    public GetResourceTypeTemplateResponse getResourceTypeTemplateWithOptions(GetResourceTypeTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionId)) {
            query.put("VersionId", request.versionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getResourceTypeTemplateWithOptions(request, runtime);
    }

    /**
      * ### Description
      * This topic describes how to query the activation status and the RAM roles of an Alibaba Cloud service. In this example, the Elastic High Performance Computing (E-HPC) service that is deployed in the China (Hangzhou) region is queried.
      * > Make sure that you have the permissions to call the [GetRole](~~28711~~) operation.
      *
      * @param request GetServiceProvisionsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetServiceProvisionsResponse
     */
    public GetServiceProvisionsResponse getServiceProvisionsWithOptions(GetServiceProvisionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateURL)) {
            query.put("TemplateURL", request.templateURL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateVersion)) {
            query.put("TemplateVersion", request.templateVersion);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.templateBody)) {
            body.put("TemplateBody", request.templateBody);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * ### Description
      * This topic describes how to query the activation status and the RAM roles of an Alibaba Cloud service. In this example, the Elastic High Performance Computing (E-HPC) service that is deployed in the China (Hangzhou) region is queried.
      * > Make sure that you have the permissions to call the [GetRole](~~28711~~) operation.
      *
      * @param request GetServiceProvisionsRequest
      * @return GetServiceProvisionsResponse
     */
    public GetServiceProvisionsResponse getServiceProvisions(GetServiceProvisionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getServiceProvisionsWithOptions(request, runtime);
    }

    /**
      * In this topic, the information about a stack whose ID is `c754d2a4-28f1-46df-b557-9586173a****` is queried. The stack is deployed in the China (Hangzhou) region.
      *
      * @param request GetStackRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetStackResponse
     */
    public GetStackResponse getStackWithOptions(GetStackRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logOption)) {
            query.put("LogOption", request.logOption);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * In this topic, the information about a stack whose ID is `c754d2a4-28f1-46df-b557-9586173a****` is queried. The stack is deployed in the China (Hangzhou) region.
      *
      * @param request GetStackRequest
      * @return GetStackResponse
     */
    public GetStackResponse getStack(GetStackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getStackWithOptions(request, runtime);
    }

    /**
      * In this topic, the status of a drift detection operation whose ID is `a7044f0d-6f2e-4128-a307-4524ef88****` is queried. The operation is performed in the China (Hangzhou) region.
      *
      * @param request GetStackDriftDetectionStatusRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetStackDriftDetectionStatusResponse
     */
    public GetStackDriftDetectionStatusResponse getStackDriftDetectionStatusWithOptions(GetStackDriftDetectionStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.driftDetectionId)) {
            query.put("DriftDetectionId", request.driftDetectionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * In this topic, the status of a drift detection operation whose ID is `a7044f0d-6f2e-4128-a307-4524ef88****` is queried. The operation is performed in the China (Hangzhou) region.
      *
      * @param request GetStackDriftDetectionStatusRequest
      * @return GetStackDriftDetectionStatusResponse
     */
    public GetStackDriftDetectionStatusResponse getStackDriftDetectionStatus(GetStackDriftDetectionStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getStackDriftDetectionStatusWithOptions(request, runtime);
    }

    /**
      * For more information about common request parameters, see [Common parameters](~~131957~~).
      *
      * @param request GetStackGroupRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetStackGroupResponse
     */
    public GetStackGroupResponse getStackGroupWithOptions(GetStackGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * For more information about common request parameters, see [Common parameters](~~131957~~).
      *
      * @param request GetStackGroupRequest
      * @return GetStackGroupResponse
     */
    public GetStackGroupResponse getStackGroup(GetStackGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getStackGroupWithOptions(request, runtime);
    }

    /**
      * In this example, the information about the stack group operation whose ID is `6da106ca-1784-4a6f-a7e1-e723863d****` is queried. The stack group named `MyStackGroup` is granted self-managed permissions and deployed in the China (Hangzhou) region.
      *
      * @param request GetStackGroupOperationRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetStackGroupOperationResponse
     */
    public GetStackGroupOperationResponse getStackGroupOperationWithOptions(GetStackGroupOperationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.operationId)) {
            query.put("OperationId", request.operationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * In this example, the information about the stack group operation whose ID is `6da106ca-1784-4a6f-a7e1-e723863d****` is queried. The stack group named `MyStackGroup` is granted self-managed permissions and deployed in the China (Hangzhou) region.
      *
      * @param request GetStackGroupOperationRequest
      * @return GetStackGroupOperationResponse
     */
    public GetStackGroupOperationResponse getStackGroupOperation(GetStackGroupOperationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getStackGroupOperationWithOptions(request, runtime);
    }

    /**
      * In this example, the information about a stack instance associated with a stack group named `MyStackGroup` is queried. The stack instance is deployed in the China (Beijing) region within the `151266687691****` Alibaba Cloud account. The stack group is granted self-managed permissions and deployed in the China (Hangzhou) region.
      *
      * @param request GetStackInstanceRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetStackInstanceResponse
     */
    public GetStackInstanceResponse getStackInstanceWithOptions(GetStackInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.outputOption)) {
            query.put("OutputOption", request.outputOption);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * In this example, the information about a stack instance associated with a stack group named `MyStackGroup` is queried. The stack instance is deployed in the China (Beijing) region within the `151266687691****` Alibaba Cloud account. The stack group is granted self-managed permissions and deployed in the China (Hangzhou) region.
      *
      * @param request GetStackInstanceRequest
      * @return GetStackInstanceResponse
     */
    public GetStackInstanceResponse getStackInstance(GetStackInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getStackInstanceWithOptions(request, runtime);
    }

    /**
      * In this example, the stack policy of a stack whose ID is `4a6c9851-3b0f-4f5f-b4ca-a14bf691****` is queried. The stack is deployed in the China (Hangzhou) region.
      *
      * @param request GetStackPolicyRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetStackPolicyResponse
     */
    public GetStackPolicyResponse getStackPolicyWithOptions(GetStackPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stackId)) {
            query.put("StackId", request.stackId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * In this example, the stack policy of a stack whose ID is `4a6c9851-3b0f-4f5f-b4ca-a14bf691****` is queried. The stack is deployed in the China (Hangzhou) region.
      *
      * @param request GetStackPolicyRequest
      * @return GetStackPolicyResponse
     */
    public GetStackPolicyResponse getStackPolicy(GetStackPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getStackPolicyWithOptions(request, runtime);
    }

    /**
      * | Http status code | Error code | Error message | Description |
      * | ---------------- | ---------- | ------------- | ----------- |
      * | 404 | ResourceNotFound | The Resource ({name}) could not be found in Stack {stack}. | The error message returned because the specified resource does not exist in the stack. name indicates the resource name. stack indicates the stack name or ID. |
      * | 404 | StackNotFound | The Stack ({name}) could not be found. | The error message returned because the stack does not exist. name indicates the name or ID of the stack. |
      *
      * @param request GetStackResourceRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetStackResourceResponse
     */
    public GetStackResourceResponse getStackResourceWithOptions(GetStackResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceAttributes)) {
            query.put("ResourceAttributes", request.resourceAttributes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.showResourceAttributes)) {
            query.put("ShowResourceAttributes", request.showResourceAttributes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stackId)) {
            query.put("StackId", request.stackId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * | Http status code | Error code | Error message | Description |
      * | ---------------- | ---------- | ------------- | ----------- |
      * | 404 | ResourceNotFound | The Resource ({name}) could not be found in Stack {stack}. | The error message returned because the specified resource does not exist in the stack. name indicates the resource name. stack indicates the stack name or ID. |
      * | 404 | StackNotFound | The Stack ({name}) could not be found. | The error message returned because the stack does not exist. name indicates the name or ID of the stack. |
      *
      * @param request GetStackResourceRequest
      * @return GetStackResourceResponse
     */
    public GetStackResourceResponse getStackResource(GetStackResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getStackResourceWithOptions(request, runtime);
    }

    /**
      * In this example, the details of a template whose ID is `5ecd1e10-b0e9-4389-a565-e4c15efc****` is queried. The region ID of the template is `cn-hangzhou`.
      *
      * @param request GetTemplateRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetTemplateResponse
     */
    public GetTemplateResponse getTemplateWithOptions(GetTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.changeSetId)) {
            query.put("ChangeSetId", request.changeSetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includePermission)) {
            query.put("IncludePermission", request.includePermission);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includeTags)) {
            query.put("IncludeTags", request.includeTags);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * In this example, the details of a template whose ID is `5ecd1e10-b0e9-4389-a565-e4c15efc****` is queried. The region ID of the template is `cn-hangzhou`.
      *
      * @param request GetTemplateRequest
      * @return GetTemplateResponse
     */
    public GetTemplateResponse getTemplate(GetTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTemplateWithOptions(request, runtime);
    }

    /**
      * ###
      * *   For more information about the resources that support price inquiry in Resource Orchestration Service (ROS) templates, see the "**Resource types that support price inquiry**" section of the [Estimate resource prices](~~203165~~) topic.
      * *   For more information about the resources that support price inquiry in Terraform templates, see the "**ROS resources supported by Terraform**" section of the [ROS features and resources supported by Terraform](~~184389~~) topic.
      * The following sample code provides an example on how to query the estimated price of an elastic IP address (EIP) that you want to create based on a template. In this example, the following template is used:
      *     {
      *       "ROSTemplateFormatVersion": "2015-09-01",
      *       "Parameters": {
      *         "Isp": {
      *           "Type": "String",
      *           "Default": "BGP"
      *         },
      *         "Name": {
      *           "Type": "String",
      *           "Default": "test"
      *         },
      *         "Netmode": {
      *           "Type": "String",
      *           "Default": "public"
      *         },
      *         "Bandwidth": {
      *           "Type": "Number",
      *           "Default": 5
      *         }
      *       },
      *       "Resources": {
      *         "NewEip": {
      *           "Type": "ALIYUN::VPC::EIP",
      *           "Properties": {
      *             "InstanceChargeType": "Prepaid",
      *             "PricingCycle": "Month",
      *             "Isp": {
      *               "Ref": "Isp"
      *             },
      *             "Period": 1,
      *             "DeletionProtection": false,
      *             "AutoPay": false,
      *             "Name": {
      *               "Ref": "Name"
      *             },
      *             "InternetChargeType": "PayByTraffic",
      *             "Netmode": {
      *               "Ref": "Netmode"
      *             },
      *             "Bandwidth": {
      *               "Ref": "Bandwidth"
      *             }
      *           }
      *         }
      *       }
      *     }
      *
      * @param request GetTemplateEstimateCostRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetTemplateEstimateCostResponse
     */
    public GetTemplateEstimateCostResponse getTemplateEstimateCostWithOptions(GetTemplateEstimateCostRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.stackId)) {
            query.put("StackId", request.stackId);
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

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.templateBody)) {
            body.put("TemplateBody", request.templateBody);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * ###
      * *   For more information about the resources that support price inquiry in Resource Orchestration Service (ROS) templates, see the "**Resource types that support price inquiry**" section of the [Estimate resource prices](~~203165~~) topic.
      * *   For more information about the resources that support price inquiry in Terraform templates, see the "**ROS resources supported by Terraform**" section of the [ROS features and resources supported by Terraform](~~184389~~) topic.
      * The following sample code provides an example on how to query the estimated price of an elastic IP address (EIP) that you want to create based on a template. In this example, the following template is used:
      *     {
      *       "ROSTemplateFormatVersion": "2015-09-01",
      *       "Parameters": {
      *         "Isp": {
      *           "Type": "String",
      *           "Default": "BGP"
      *         },
      *         "Name": {
      *           "Type": "String",
      *           "Default": "test"
      *         },
      *         "Netmode": {
      *           "Type": "String",
      *           "Default": "public"
      *         },
      *         "Bandwidth": {
      *           "Type": "Number",
      *           "Default": 5
      *         }
      *       },
      *       "Resources": {
      *         "NewEip": {
      *           "Type": "ALIYUN::VPC::EIP",
      *           "Properties": {
      *             "InstanceChargeType": "Prepaid",
      *             "PricingCycle": "Month",
      *             "Isp": {
      *               "Ref": "Isp"
      *             },
      *             "Period": 1,
      *             "DeletionProtection": false,
      *             "AutoPay": false,
      *             "Name": {
      *               "Ref": "Name"
      *             },
      *             "InternetChargeType": "PayByTraffic",
      *             "Netmode": {
      *               "Ref": "Netmode"
      *             },
      *             "Bandwidth": {
      *               "Ref": "Bandwidth"
      *             }
      *           }
      *         }
      *       }
      *     }
      *
      * @param request GetTemplateEstimateCostRequest
      * @return GetTemplateEstimateCostResponse
     */
    public GetTemplateEstimateCostResponse getTemplateEstimateCost(GetTemplateEstimateCostRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTemplateEstimateCostWithOptions(request, runtime);
    }

    /**
      * This topic provides an example on how to query the values of a parameter. In this example, the values of the `ZoneInfo` parameter in a template that is created in the China (Hangzhou) region are queried. The template body is `{"Parameters":{"ZoneInfo":{"Type": "String"},"InstanceType": {"Type": "String"}},"ROSTemplateFormatVersion": "2015-09-01","Resources":{"ECS":{"Properties":{"ZoneId":{"Ref": "ZoneInfo"},"InstanceType": {"Ref": "InstanceType"}},"Type": "ALIYUN::ECS::Instance"}}}`.
      * For more information about the template parameters whose values you can query by calling this operation and the sample code of the template, see [Query the constraints of parameters](~~432820~~).
      *
      * @param tmpReq GetTemplateParameterConstraintsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetTemplateParameterConstraintsResponse
     */
    public GetTemplateParameterConstraintsResponse getTemplateParameterConstraintsWithOptions(GetTemplateParameterConstraintsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetTemplateParameterConstraintsShrinkRequest request = new GetTemplateParameterConstraintsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.parametersKeyFilter)) {
            request.parametersKeyFilterShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.parametersKeyFilter, "ParametersKeyFilter", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.parametersOrder)) {
            request.parametersOrderShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.parametersOrder, "ParametersOrder", "json");
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

        if (!com.aliyun.teautil.Common.isUnset(request.parametersOrderShrink)) {
            query.put("ParametersOrder", request.parametersOrderShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stackId)) {
            query.put("StackId", request.stackId);
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

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.templateBody)) {
            body.put("TemplateBody", request.templateBody);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * This topic provides an example on how to query the values of a parameter. In this example, the values of the `ZoneInfo` parameter in a template that is created in the China (Hangzhou) region are queried. The template body is `{"Parameters":{"ZoneInfo":{"Type": "String"},"InstanceType": {"Type": "String"}},"ROSTemplateFormatVersion": "2015-09-01","Resources":{"ECS":{"Properties":{"ZoneId":{"Ref": "ZoneInfo"},"InstanceType": {"Ref": "InstanceType"}},"Type": "ALIYUN::ECS::Instance"}}}`.
      * For more information about the template parameters whose values you can query by calling this operation and the sample code of the template, see [Query the constraints of parameters](~~432820~~).
      *
      * @param request GetTemplateParameterConstraintsRequest
      * @return GetTemplateParameterConstraintsResponse
     */
    public GetTemplateParameterConstraintsResponse getTemplateParameterConstraints(GetTemplateParameterConstraintsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTemplateParameterConstraintsWithOptions(request, runtime);
    }

    public GetTemplateRecommendParametersResponse getTemplateRecommendParametersWithOptions(GetTemplateRecommendParametersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.templateURL)) {
            query.put("TemplateURL", request.templateURL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateVersion)) {
            query.put("TemplateVersion", request.templateVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTemplateRecommendParameters"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTemplateRecommendParametersResponse());
    }

    public GetTemplateRecommendParametersResponse getTemplateRecommendParameters(GetTemplateRecommendParametersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTemplateRecommendParametersWithOptions(request, runtime);
    }

    /**
      * In this example, the details of the scenario whose ID is `ts-7f7a704cf71c49a6****` is queried. In the response, the source node data is displayed.
      *
      * @param request GetTemplateScratchRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetTemplateScratchResponse
     */
    public GetTemplateScratchResponse getTemplateScratchWithOptions(GetTemplateScratchRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * In this example, the details of the scenario whose ID is `ts-7f7a704cf71c49a6****` is queried. In the response, the source node data is displayed.
      *
      * @param request GetTemplateScratchRequest
      * @return GetTemplateScratchResponse
     */
    public GetTemplateScratchResponse getTemplateScratch(GetTemplateScratchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTemplateScratchWithOptions(request, runtime);
    }

    public GetTemplateSummaryResponse getTemplateSummaryWithOptions(GetTemplateSummaryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.changeSetId)) {
            query.put("ChangeSetId", request.changeSetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parameters)) {
            query.put("Parameters", request.parameters);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTemplateSummaryWithOptions(request, runtime);
    }

    public ListChangeSetsResponse listChangeSetsWithOptions(ListChangeSetsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listChangeSetsWithOptions(request, runtime);
    }

    public ListDiagnosticsResponse listDiagnosticsWithOptions(ListDiagnosticsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.diagnosticKey)) {
            query.put("DiagnosticKey", request.diagnosticKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.diagnosticProduct)) {
            query.put("DiagnosticProduct", request.diagnosticProduct);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDiagnostics"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDiagnosticsResponse());
    }

    public ListDiagnosticsResponse listDiagnostics(ListDiagnosticsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDiagnosticsWithOptions(request, runtime);
    }

    public ListResourceTypeRegistrationsResponse listResourceTypeRegistrationsWithOptions(ListResourceTypeRegistrationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.entityType)) {
            query.put("EntityType", request.entityType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registrationId)) {
            query.put("RegistrationId", request.registrationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListResourceTypeRegistrations"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListResourceTypeRegistrationsResponse());
    }

    public ListResourceTypeRegistrationsResponse listResourceTypeRegistrations(ListResourceTypeRegistrationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listResourceTypeRegistrationsWithOptions(request, runtime);
    }

    public ListResourceTypeVersionsResponse listResourceTypeVersionsWithOptions(ListResourceTypeVersionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListResourceTypeVersions"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListResourceTypeVersionsResponse());
    }

    public ListResourceTypeVersionsResponse listResourceTypeVersions(ListResourceTypeVersionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listResourceTypeVersionsWithOptions(request, runtime);
    }

    /**
      * For more information about errors common to all operations, see [Common error codes](/help/en/resource-orchestration-service/latest/common-error-codes).
      *
      * @param request ListResourceTypesRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListResourceTypesResponse
     */
    public ListResourceTypesResponse listResourceTypesWithOptions(ListResourceTypesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.entityType)) {
            query.put("EntityType", request.entityType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.provider)) {
            query.put("Provider", request.provider);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * For more information about errors common to all operations, see [Common error codes](/help/en/resource-orchestration-service/latest/common-error-codes).
      *
      * @param request ListResourceTypesRequest
      * @return ListResourceTypesResponse
     */
    public ListResourceTypesResponse listResourceTypes(ListResourceTypesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listResourceTypesWithOptions(request, runtime);
    }

    public ListStackEventsResponse listStackEventsWithOptions(ListStackEventsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listStackEventsWithOptions(request, runtime);
    }

    /**
      * In this example, the operation ID `6da106ca-1784-4a6f-a7e1-e723863d∗∗∗∗` is set to query the results of an operation on a stack group named `MyStackGroup`. The stack group is granted self-managed permissions and created in the China (Hangzhou) region.
      *
      * @param request ListStackGroupOperationResultsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListStackGroupOperationResultsResponse
     */
    public ListStackGroupOperationResultsResponse listStackGroupOperationResultsWithOptions(ListStackGroupOperationResultsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * In this example, the operation ID `6da106ca-1784-4a6f-a7e1-e723863d∗∗∗∗` is set to query the results of an operation on a stack group named `MyStackGroup`. The stack group is granted self-managed permissions and created in the China (Hangzhou) region.
      *
      * @param request ListStackGroupOperationResultsRequest
      * @return ListStackGroupOperationResultsResponse
     */
    public ListStackGroupOperationResultsResponse listStackGroupOperationResults(ListStackGroupOperationResultsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listStackGroupOperationResultsWithOptions(request, runtime);
    }

    public ListStackGroupOperationsResponse listStackGroupOperationsWithOptions(ListStackGroupOperationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listStackGroupOperationsWithOptions(request, runtime);
    }

    /**
      * In this example, the list of stack groups that are in the ACTIVE state and deployed in the China (Hangzhou) region is queried.
      *
      * @param request ListStackGroupsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListStackGroupsResponse
     */
    public ListStackGroupsResponse listStackGroupsWithOptions(ListStackGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * In this example, the list of stack groups that are in the ACTIVE state and deployed in the China (Hangzhou) region is queried.
      *
      * @param request ListStackGroupsRequest
      * @return ListStackGroupsResponse
     */
    public ListStackGroupsResponse listStackGroups(ListStackGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listStackGroupsWithOptions(request, runtime);
    }

    /**
      * In this example, the list of stack instances that are associated with a stack group named `MyStackGroup` is queried. The stack group is granted self-managed permissions and deployed in the China (Hangzhou) region.
      *
      * @param request ListStackInstancesRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListStackInstancesResponse
     */
    public ListStackInstancesResponse listStackInstancesWithOptions(ListStackInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * In this example, the list of stack instances that are associated with a stack group named `MyStackGroup` is queried. The stack group is granted self-managed permissions and deployed in the China (Hangzhou) region.
      *
      * @param request ListStackInstancesRequest
      * @return ListStackInstancesResponse
     */
    public ListStackInstancesResponse listStackInstances(ListStackInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listStackInstancesWithOptions(request, runtime);
    }

    /**
      * The ListStackOperationRisks operation is suitable for the following scenarios:
      * *   You want to detect high risks that may arise in resources when you delete a stack that contains the resources, and query the cause of each risk in a resource.
      * *   When you create a stack, the creation may fail. In this case, you can call this operation to check which types of permissions that are required to create stacks are missing.
      *
      * @param request ListStackOperationRisksRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListStackOperationRisksResponse
     */
    public ListStackOperationRisksResponse listStackOperationRisksWithOptions(ListStackOperationRisksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateURL)) {
            query.put("TemplateURL", request.templateURL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateVersion)) {
            query.put("TemplateVersion", request.templateVersion);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.templateBody)) {
            body.put("TemplateBody", request.templateBody);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * The ListStackOperationRisks operation is suitable for the following scenarios:
      * *   You want to detect high risks that may arise in resources when you delete a stack that contains the resources, and query the cause of each risk in a resource.
      * *   When you create a stack, the creation may fail. In this case, you can call this operation to check which types of permissions that are required to create stacks are missing.
      *
      * @param request ListStackOperationRisksRequest
      * @return ListStackOperationRisksResponse
     */
    public ListStackOperationRisksResponse listStackOperationRisks(ListStackOperationRisksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listStackOperationRisksWithOptions(request, runtime);
    }

    public ListStackResourceDriftsResponse listStackResourceDriftsWithOptions(ListStackResourceDriftsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listStackResourceDriftsWithOptions(request, runtime);
    }

    /**
      * For more information about common request parameters, see [Common parameters](~~131957~~).
      *
      * @param request ListStackResourcesRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListStackResourcesResponse
     */
    public ListStackResourcesResponse listStackResourcesWithOptions(ListStackResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stackId)) {
            query.put("StackId", request.stackId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * For more information about common request parameters, see [Common parameters](~~131957~~).
      *
      * @param request ListStackResourcesRequest
      * @return ListStackResourcesResponse
     */
    public ListStackResourcesResponse listStackResources(ListStackResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listStackResourcesWithOptions(request, runtime);
    }

    /**
      * ###
      * This topic provides an example on how to query a list of stacks. In this example, the stacks that are deployed in the China (Hangzhou) region are queried.
      *
      * @param request ListStacksRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListStacksResponse
     */
    public ListStacksResponse listStacksWithOptions(ListStacksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

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

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * ###
      * This topic provides an example on how to query a list of stacks. In this example, the stacks that are deployed in the China (Hangzhou) region are queried.
      *
      * @param request ListStacksRequest
      * @return ListStacksResponse
     */
    public ListStacksResponse listStacks(ListStacksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listStacksWithOptions(request, runtime);
    }

    /**
      * In this example, the tag keys that are added to a stack in the China (Hangzhou) region are queried.
      *
      * @param request ListTagKeysRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListTagKeysResponse
     */
    public ListTagKeysResponse listTagKeysWithOptions(ListTagKeysRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * In this example, the tag keys that are added to a stack in the China (Hangzhou) region are queried.
      *
      * @param request ListTagKeysRequest
      * @return ListTagKeysResponse
     */
    public ListTagKeysResponse listTagKeys(ListTagKeysRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagKeysWithOptions(request, runtime);
    }

    /**
      * ###
      * *   To specify the query object, specify ResourceId or Tag in the request. Tag consists of Key and Value.
      * *   If you specify Tag and ResourceId, ROS resources that match both the parameters are returned.
      * This topic provides an example on how to query the tags that are added to a stack. In this example, the stack ID is `6bc589b5-9c02-4944-8fc3-f3624234****`. The stack is deployed in the China (Hangzhou) region.
      *
      * @param request ListTagResourcesRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * ###
      * *   To specify the query object, specify ResourceId or Tag in the request. Tag consists of Key and Value.
      * *   If you specify Tag and ResourceId, ROS resources that match both the parameters are returned.
      * This topic provides an example on how to query the tags that are added to a stack. In this example, the stack ID is `6bc589b5-9c02-4944-8fc3-f3624234****`. The stack is deployed in the China (Hangzhou) region.
      *
      * @param request ListTagResourcesRequest
      * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    /**
      * In this example, the tag values of `TagKey1` that is added to a stack in the China (Hangzhou) region are queried.
      *
      * @param request ListTagValuesRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListTagValuesResponse
     */
    public ListTagValuesResponse listTagValuesWithOptions(ListTagValuesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * In this example, the tag values of `TagKey1` that is added to a stack in the China (Hangzhou) region are queried.
      *
      * @param request ListTagValuesRequest
      * @return ListTagValuesResponse
     */
    public ListTagValuesResponse listTagValues(ListTagValuesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagValuesWithOptions(request, runtime);
    }

    /**
      * In this example, the scenarios that are created in the China (Hangzhou) region are queried. In the response, a scenario of the Resource Management and a scenario of the Resource Replication type are returned.
      *
      * @param request ListTemplateScratchesRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListTemplateScratchesResponse
     */
    public ListTemplateScratchesResponse listTemplateScratchesWithOptions(ListTemplateScratchesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateScratchId)) {
            query.put("TemplateScratchId", request.templateScratchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateScratchType)) {
            query.put("TemplateScratchType", request.templateScratchType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * In this example, the scenarios that are created in the China (Hangzhou) region are queried. In the response, a scenario of the Resource Management and a scenario of the Resource Replication type are returned.
      *
      * @param request ListTemplateScratchesRequest
      * @return ListTemplateScratchesResponse
     */
    public ListTemplateScratchesResponse listTemplateScratches(ListTemplateScratchesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTemplateScratchesWithOptions(request, runtime);
    }

    public ListTemplateVersionsResponse listTemplateVersionsWithOptions(ListTemplateVersionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTemplateVersionsWithOptions(request, runtime);
    }

    public ListTemplatesResponse listTemplatesWithOptions(ListTemplatesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.includeTags)) {
            query.put("IncludeTags", request.includeTags);
        }

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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTemplatesWithOptions(request, runtime);
    }

    /**
      * In this example, a stack deployed in the `China (Hangzhou)` region is moved to a specific resource group. The ID of the stack is `4e8611cb-251e-42b7-b9cb-3496362c****` and the ID of the resource group is `rg-acfm3peow3k****`.
      *
      * @param request MoveResourceGroupRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return MoveResourceGroupResponse
     */
    public MoveResourceGroupResponse moveResourceGroupWithOptions(MoveResourceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * In this example, a stack deployed in the `China (Hangzhou)` region is moved to a specific resource group. The ID of the stack is `4e8611cb-251e-42b7-b9cb-3496362c****` and the ID of the resource group is `rg-acfm3peow3k****`.
      *
      * @param request MoveResourceGroupRequest
      * @return MoveResourceGroupResponse
     */
    public MoveResourceGroupResponse moveResourceGroup(MoveResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.moveResourceGroupWithOptions(request, runtime);
    }

    /**
      * This topic provides an example on how to create a stack named `MyStack` in the China (Hangzhou) region by using a template and preview the information about the stack. In this example, the `template body` is `{"ROSTemplateFormatVersion":"2015-09-01"}`.
      *
      * @param request PreviewStackRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return PreviewStackResponse
     */
    public PreviewStackResponse previewStackWithOptions(PreviewStackRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disableRollback)) {
            query.put("DisableRollback", request.disableRollback);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enablePreConfig)) {
            query.put("EnablePreConfig", request.enablePreConfig);
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

        if (!com.aliyun.teautil.Common.isUnset(request.stackId)) {
            query.put("StackId", request.stackId);
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

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.templateBody)) {
            body.put("TemplateBody", request.templateBody);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * This topic provides an example on how to create a stack named `MyStack` in the China (Hangzhou) region by using a template and preview the information about the stack. In this example, the `template body` is `{"ROSTemplateFormatVersion":"2015-09-01"}`.
      *
      * @param request PreviewStackRequest
      * @return PreviewStackResponse
     */
    public PreviewStackResponse previewStack(PreviewStackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.previewStackWithOptions(request, runtime);
    }

    /**
      * *   Versions increase from v1.
      * *   If you create a new resource type, v1 is used as the default version of the resource type. You can call the SetResourceType operation to change the default version of a resource type.
      *
      * @param request RegisterResourceTypeRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return RegisterResourceTypeResponse
     */
    public RegisterResourceTypeResponse registerResourceTypeWithOptions(RegisterResourceTypeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entityType)) {
            query.put("EntityType", request.entityType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateURL)) {
            query.put("TemplateURL", request.templateURL);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.templateBody)) {
            body.put("TemplateBody", request.templateBody);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RegisterResourceType"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RegisterResourceTypeResponse());
    }

    /**
      * *   Versions increase from v1.
      * *   If you create a new resource type, v1 is used as the default version of the resource type. You can call the SetResourceType operation to change the default version of a resource type.
      *
      * @param request RegisterResourceTypeRequest
      * @return RegisterResourceTypeResponse
     */
    public RegisterResourceTypeResponse registerResourceType(RegisterResourceTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.registerResourceTypeWithOptions(request, runtime);
    }

    public SetDeletionProtectionResponse setDeletionProtectionWithOptions(SetDeletionProtectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setDeletionProtectionWithOptions(request, runtime);
    }

    public SetResourceTypeResponse setResourceTypeWithOptions(SetResourceTypeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.defaultVersionId)) {
            query.put("DefaultVersionId", request.defaultVersionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionId)) {
            query.put("VersionId", request.versionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetResourceType"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetResourceTypeResponse());
    }

    public SetResourceTypeResponse setResourceType(SetResourceTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setResourceTypeWithOptions(request, runtime);
    }

    /**
      * In this example, a stack policy is configured for a stack deployed in the `China (Hangzhou)` region whose ID is `4a6c9851-3b0f-4f5f-b4ca-a14bf691****`. The URL to the stack policy body is `oss://ros/stack-policy/demo`.
      *
      * @param request SetStackPolicyRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return SetStackPolicyResponse
     */
    public SetStackPolicyResponse setStackPolicyWithOptions(SetStackPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * In this example, a stack policy is configured for a stack deployed in the `China (Hangzhou)` region whose ID is `4a6c9851-3b0f-4f5f-b4ca-a14bf691****`. The URL to the stack policy body is `oss://ros/stack-policy/demo`.
      *
      * @param request SetStackPolicyRequest
      * @return SetStackPolicyResponse
     */
    public SetStackPolicyResponse setStackPolicy(SetStackPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setStackPolicyWithOptions(request, runtime);
    }

    /**
      * In this example, the template whose ID is `5ecd1e10-b0e9-4389-a565-e4c15efc****` is shared with an Alibaba Cloud account. The ID of the Alibaba Cloud account is `151266687691****`.
      * > The recipient Alibaba Cloud account (ID: `151266687691****`) can authorize RAM users to use the shared template.
      *
      * @param request SetTemplatePermissionRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return SetTemplatePermissionResponse
     */
    public SetTemplatePermissionResponse setTemplatePermissionWithOptions(SetTemplatePermissionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * In this example, the template whose ID is `5ecd1e10-b0e9-4389-a565-e4c15efc****` is shared with an Alibaba Cloud account. The ID of the Alibaba Cloud account is `151266687691****`.
      * > The recipient Alibaba Cloud account (ID: `151266687691****`) can authorize RAM users to use the shared template.
      *
      * @param request SetTemplatePermissionRequest
      * @return SetTemplatePermissionResponse
     */
    public SetTemplatePermissionResponse setTemplatePermission(SetTemplatePermissionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setTemplatePermissionWithOptions(request, runtime);
    }

    public SignalResourceResponse signalResourceWithOptions(SignalResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.signalResourceWithOptions(request, runtime);
    }

    /**
      * This topic provides an example on how to stop a stack group operation whose ID is `6da106ca-1784-4a6f-a7e1-e723863****` in the China (Hangzhou) region.
      *
      * @param request StopStackGroupOperationRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return StopStackGroupOperationResponse
     */
    public StopStackGroupOperationResponse stopStackGroupOperationWithOptions(StopStackGroupOperationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.operationId)) {
            query.put("OperationId", request.operationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * This topic provides an example on how to stop a stack group operation whose ID is `6da106ca-1784-4a6f-a7e1-e723863****` in the China (Hangzhou) region.
      *
      * @param request StopStackGroupOperationRequest
      * @return StopStackGroupOperationResponse
     */
    public StopStackGroupOperationResponse stopStackGroupOperation(StopStackGroupOperationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopStackGroupOperationWithOptions(request, runtime);
    }

    /**
      * This topic provides an example on how to create a tag and add the tag to a stack. In this example, the stack ID is `7fee80e1-8c48-4c2f-8300-0f6dc40b****`, the tag key is `FinanceDept`, and the tag value is `FinanceJoshua`.
      *
      * @param request TagResourcesRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * This topic provides an example on how to create a tag and add the tag to a stack. In this example, the stack ID is `7fee80e1-8c48-4c2f-8300-0f6dc40b****`, the tag key is `FinanceDept`, and the tag value is `FinanceJoshua`.
      *
      * @param request TagResourcesRequest
      * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

    /**
      * This topic provides an example on how to remove all tags from a stack that is deployed in the China (Hangzhou) region. In this example, the stack ID is `46ec7b78-9d5e-4b21-aefd-448c90aa****`.
      *
      * @param request UntagResourcesRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return UntagResourcesResponse
     */
    public UntagResourcesResponse untagResourcesWithOptions(UntagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * This topic provides an example on how to remove all tags from a stack that is deployed in the China (Hangzhou) region. In this example, the stack ID is `46ec7b78-9d5e-4b21-aefd-448c90aa****`.
      *
      * @param request UntagResourcesRequest
      * @return UntagResourcesResponse
     */
    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.untagResourcesWithOptions(request, runtime);
    }

    /**
      * The values of parameters in the Parameters section vary based on the value that you specify for the UsePreviousParameters parameter in the request. If you do not add the parameters that are defined in the template to the Parameters section, take note of the following items:
      * *   UsePreviousParameters is set to false: If the template parameters have default values, the default values are used. Otherwise, you must specify values for the template parameters in the Parameters section.
      * *   UsePreviousParameters is set to true: If you specify values for the template parameters when you create a stack, the values are used. If you leave the template parameters empty when you create a stack but the template parameters have default values, the default values are used.
      * This topic describes how to update a stack. In this example, the template body of a stack whose ID is `4a6c9851-3b0f-4f5f-b4ca-a14bf691****` in the China (Beijing) region is updated to `{"ROSTemplateFormatVersion": "2015-09-01"}`.
      *
      * @param request UpdateStackRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return UpdateStackResponse
     */
    public UpdateStackResponse updateStackWithOptions(UpdateStackRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disableRollback)) {
            query.put("DisableRollback", request.disableRollback);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRunOptions)) {
            query.put("DryRunOptions", request.dryRunOptions);
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
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

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.templateBody)) {
            body.put("TemplateBody", request.templateBody);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * The values of parameters in the Parameters section vary based on the value that you specify for the UsePreviousParameters parameter in the request. If you do not add the parameters that are defined in the template to the Parameters section, take note of the following items:
      * *   UsePreviousParameters is set to false: If the template parameters have default values, the default values are used. Otherwise, you must specify values for the template parameters in the Parameters section.
      * *   UsePreviousParameters is set to true: If you specify values for the template parameters when you create a stack, the values are used. If you leave the template parameters empty when you create a stack but the template parameters have default values, the default values are used.
      * This topic describes how to update a stack. In this example, the template body of a stack whose ID is `4a6c9851-3b0f-4f5f-b4ca-a14bf691****` in the China (Beijing) region is updated to `{"ROSTemplateFormatVersion": "2015-09-01"}`.
      *
      * @param request UpdateStackRequest
      * @return UpdateStackResponse
     */
    public UpdateStackResponse updateStack(UpdateStackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateStackWithOptions(request, runtime);
    }

    /**
      * The name of the stack group. The name must be unique within a region.
      * The name can be up to 255 characters in length and can contain digits, letters, hyphens (-), and underscores (\\_). The name must start with a digit or a letter.
      *
      * @param tmpReq UpdateStackGroupRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return UpdateStackGroupResponse
     */
    public UpdateStackGroupResponse updateStackGroupWithOptions(UpdateStackGroupRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateStackGroupShrinkRequest request = new UpdateStackGroupShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.accountIds)) {
            request.accountIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.accountIds, "AccountIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.autoDeployment)) {
            request.autoDeploymentShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.autoDeployment, "AutoDeployment", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.deploymentTargets)) {
            request.deploymentTargetsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.deploymentTargets, "DeploymentTargets", "json");
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

        if (!com.aliyun.teautil.Common.isUnset(request.capabilities)) {
            query.put("Capabilities", request.capabilities);
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

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateURL)) {
            query.put("TemplateURL", request.templateURL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateVersion)) {
            query.put("TemplateVersion", request.templateVersion);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.templateBody)) {
            body.put("TemplateBody", request.templateBody);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * The name of the stack group. The name must be unique within a region.
      * The name can be up to 255 characters in length and can contain digits, letters, hyphens (-), and underscores (\\_). The name must start with a digit or a letter.
      *
      * @param request UpdateStackGroupRequest
      * @return UpdateStackGroupResponse
     */
    public UpdateStackGroupResponse updateStackGroup(UpdateStackGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateStackGroupWithOptions(request, runtime);
    }

    /**
      * In this topic, the stack group named `MyStackGroup` that is created in the China (Hangzhou) region is used. The stack group is granted the self-managed permissions. In this example, stacks of the stack group are updated by using the Alibaba Cloud accounts whose IDs are `151266687691****` and `141261387191****` in the China (Hangzhou) region and China (Beijing) region.
      *
      * @param tmpReq UpdateStackInstancesRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return UpdateStackInstancesResponse
     */
    public UpdateStackInstancesResponse updateStackInstancesWithOptions(UpdateStackInstancesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateStackInstancesShrinkRequest request = new UpdateStackInstancesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.accountIds)) {
            request.accountIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.accountIds, "AccountIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.deploymentTargets)) {
            request.deploymentTargetsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.deploymentTargets, "DeploymentTargets", "json");
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * In this topic, the stack group named `MyStackGroup` that is created in the China (Hangzhou) region is used. The stack group is granted the self-managed permissions. In this example, stacks of the stack group are updated by using the Alibaba Cloud accounts whose IDs are `151266687691****` and `141261387191****` in the China (Hangzhou) region and China (Beijing) region.
      *
      * @param request UpdateStackInstancesRequest
      * @return UpdateStackInstancesResponse
     */
    public UpdateStackInstancesResponse updateStackInstances(UpdateStackInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateStackInstancesWithOptions(request, runtime);
    }

    /**
      * Limits: You can eliminate only drift on stacks that have drifted. You must call the [DetectStackDrift](~~155094~~) operation to perform drift detection on a stack, call the [GetStackDriftDetectionStatus](~~155097~~) operation to query the drift status of the stack to make sure that the stack has drifted, and then call the UpdateStackTemplateByResources operation to eliminate drift.
      * In this topic, drift is eliminated for a stack whose ID is `4a6c9851-3b0f-4f5f-b4ca-a14bf691****`. The stack is deployed in the China (Hangzhou) region.
      *
      * @param request UpdateStackTemplateByResourcesRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return UpdateStackTemplateByResourcesResponse
     */
    public UpdateStackTemplateByResourcesResponse updateStackTemplateByResourcesWithOptions(UpdateStackTemplateByResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * Limits: You can eliminate only drift on stacks that have drifted. You must call the [DetectStackDrift](~~155094~~) operation to perform drift detection on a stack, call the [GetStackDriftDetectionStatus](~~155097~~) operation to query the drift status of the stack to make sure that the stack has drifted, and then call the UpdateStackTemplateByResources operation to eliminate drift.
      * In this topic, drift is eliminated for a stack whose ID is `4a6c9851-3b0f-4f5f-b4ca-a14bf691****`. The stack is deployed in the China (Hangzhou) region.
      *
      * @param request UpdateStackTemplateByResourcesRequest
      * @return UpdateStackTemplateByResourcesResponse
     */
    public UpdateStackTemplateByResourcesResponse updateStackTemplateByResources(UpdateStackTemplateByResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateStackTemplateByResourcesWithOptions(request, runtime);
    }

    /**
      * When you update a template, take note of the following items:
      * *   If you specify TemplateBody or TemplateURL, the existing version number is automatically incremented by 1 after the template is updated. For example, the version is changed from v1 to v2.
      * *   If you do not specify TemplateBody or TemplateURL, the version number remains unchanged.
      * *   A template can have up to 100 versions. If the number of templates reaches the upper limit, the template fails to be updated. You must create another template.
      *
      * @param request UpdateTemplateRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return UpdateTemplateResponse
     */
    public UpdateTemplateResponse updateTemplateWithOptions(UpdateTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
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

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.templateBody)) {
            body.put("TemplateBody", request.templateBody);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * When you update a template, take note of the following items:
      * *   If you specify TemplateBody or TemplateURL, the existing version number is automatically incremented by 1 after the template is updated. For example, the version is changed from v1 to v2.
      * *   If you do not specify TemplateBody or TemplateURL, the version number remains unchanged.
      * *   A template can have up to 100 versions. If the number of templates reaches the upper limit, the template fails to be updated. You must create another template.
      *
      * @param request UpdateTemplateRequest
      * @return UpdateTemplateResponse
     */
    public UpdateTemplateResponse updateTemplate(UpdateTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateTemplateWithOptions(request, runtime);
    }

    /**
      * In this example, a scenario whose ID is `ts-7f7a704cf71c49a6****` is used. The scenario is created in the China (Hangzhou) region. In the scenario, the ID of a virtual private cloud (VPC) is updated to `vpc-bp1m6fww66xbntjyc****`.
      *
      * @param tmpReq UpdateTemplateScratchRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return UpdateTemplateScratchResponse
     */
    public UpdateTemplateScratchResponse updateTemplateScratchWithOptions(UpdateTemplateScratchRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateTemplateScratchShrinkRequest request = new UpdateTemplateScratchShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.preferenceParameters)) {
            request.preferenceParametersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.preferenceParameters, "PreferenceParameters", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sourceResourceGroup)) {
            request.sourceResourceGroupShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sourceResourceGroup, "SourceResourceGroup", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sourceResources)) {
            request.sourceResourcesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sourceResources, "SourceResources", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sourceTag)) {
            request.sourceTagShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sourceTag, "SourceTag", "json");
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * In this example, a scenario whose ID is `ts-7f7a704cf71c49a6****` is used. The scenario is created in the China (Hangzhou) region. In the scenario, the ID of a virtual private cloud (VPC) is updated to `vpc-bp1m6fww66xbntjyc****`.
      *
      * @param request UpdateTemplateScratchRequest
      * @return UpdateTemplateScratchResponse
     */
    public UpdateTemplateScratchResponse updateTemplateScratch(UpdateTemplateScratchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateTemplateScratchWithOptions(request, runtime);
    }

    /**
      * In this example, a template that you want to use to create a stack is validated. `TemplateURL` is set to `oss://ros/template/demo`.
      *
      * @param request ValidateTemplateRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ValidateTemplateResponse
     */
    public ValidateTemplateResponse validateTemplateWithOptions(ValidateTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateURL)) {
            query.put("TemplateURL", request.templateURL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.updateInfoOptions)) {
            query.put("UpdateInfoOptions", request.updateInfoOptions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.validationOption)) {
            query.put("ValidationOption", request.validationOption);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.templateBody)) {
            body.put("TemplateBody", request.templateBody);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * In this example, a template that you want to use to create a stack is validated. `TemplateURL` is set to `oss://ros/template/demo`.
      *
      * @param request ValidateTemplateRequest
      * @return ValidateTemplateResponse
     */
    public ValidateTemplateResponse validateTemplate(ValidateTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.validateTemplateWithOptions(request, runtime);
    }
}
