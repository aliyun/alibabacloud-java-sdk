// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910;

import com.aliyun.tea.*;
import com.aliyun.ros20190910.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("ap-northeast-1", "ros.aliyuncs.com"),
            new TeaPair("ap-northeast-2", "ros.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "ros.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "ros.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "ros.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "ros.aliyuncs.com"),
            new TeaPair("ap-southeast-6", "ros.aliyuncs.com"),
            new TeaPair("ap-southeast-7", "ros.aliyuncs.com"),
            new TeaPair("ap-southeast-8", "ros.aliyuncs.com"),
            new TeaPair("cn-beijing", "ros.aliyuncs.com"),
            new TeaPair("cn-chengdu", "ros.aliyuncs.com"),
            new TeaPair("cn-fuzhou", "ros.aliyuncs.com"),
            new TeaPair("cn-guangzhou", "ros.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "ros.aliyuncs.com"),
            new TeaPair("cn-heyuan", "ros.aliyuncs.com"),
            new TeaPair("cn-hongkong", "ros.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "ros.aliyuncs.com"),
            new TeaPair("cn-nanjing", "ros.aliyuncs.com"),
            new TeaPair("cn-qingdao", "ros.aliyuncs.com"),
            new TeaPair("cn-shanghai", "ros.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "ros.aliyuncs.com"),
            new TeaPair("cn-wuhan-lr", "ros.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "ros.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "ros.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-jva", "ros.aliyuncs.com"),
            new TeaPair("cn-zhongwei", "ros.aliyuncs.com"),
            new TeaPair("eu-central-1", "ros.aliyuncs.com"),
            new TeaPair("eu-west-1", "ros.aliyuncs.com"),
            new TeaPair("eu-west-2", "ros.aliyuncs.com"),
            new TeaPair("na-south-1", "ros.aliyuncs.com"),
            new TeaPair("sa-east-1", "ros.aliyuncs.com"),
            new TeaPair("us-east-1", "ros.aliyuncs.com"),
            new TeaPair("us-southeast-1", "ros.aliyuncs.com"),
            new TeaPair("us-west-1", "ros.aliyuncs.com"),
            new TeaPair("ap-south-1", "ros.aliyuncs.com"),
            new TeaPair("me-central-1", "ros.aliyuncs.com"),
            new TeaPair("me-east-1", "ros.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "ros.aliyuncs.com"),
            new TeaPair("cn-heyuan-acdr-1", "ros.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "ros.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "ros.aliyuncs.com"),
            new TeaPair("cn-wulanchabu-gic-1", "ros.aliyuncs.com")
        );
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

    /**
     * <b>summary</b> : 
     * <p>Cancels operations on a stack.</p>
     * 
     * @param request CancelStackOperationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelStackOperationResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Cancels operations on a stack.</p>
     * 
     * @param request CancelStackOperationRequest
     * @return CancelStackOperationResponse
     */
    public CancelStackOperationResponse cancelStackOperation(CancelStackOperationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelStackOperationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Cancels an update operation on a stack. You can call this operation to cancel an update operation on a stack when the stack is being updated or created.</p>
     * 
     * @param request CancelUpdateStackRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelUpdateStackResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Cancels an update operation on a stack. You can call this operation to cancel an update operation on a stack when the stack is being updated or created.</p>
     * 
     * @param request CancelUpdateStackRequest
     * @return CancelUpdateStackResponse
     */
    public CancelUpdateStackResponse cancelUpdateStack(CancelUpdateStackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelUpdateStackWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to continue to create a stack after the stack fails to be created. In this example, the stack whose ID is <code>4a6c9851-3b0f-4f5f-b4ca-a14bf691****</code> is created in the China (Hangzhou) region.</p>
     * 
     * <b>summary</b> : 
     * <p>Continues to create a stack after the stack fails to be created.</p>
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
     * <b>description</b> :
     * <p>This topic provides an example on how to continue to create a stack after the stack fails to be created. In this example, the stack whose ID is <code>4a6c9851-3b0f-4f5f-b4ca-a14bf691****</code> is created in the China (Hangzhou) region.</p>
     * 
     * <b>summary</b> : 
     * <p>Continues to create a stack after the stack fails to be created.</p>
     * 
     * @param request ContinueCreateStackRequest
     * @return ContinueCreateStackResponse
     */
    public ContinueCreateStackResponse continueCreateStack(ContinueCreateStackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.continueCreateStackWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API allows users to create an AI task based on the specified task type, covering a range of capabilities from natural language understanding to resource stack deployment. Users need to provide the task type and any required parameters, and the API will return a unique TaskId for tracking the status and results of the task.</p>
     * 
     * <b>summary</b> : 
     * <p>Create AI Task</p>
     * 
     * @param request CreateAITaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAITaskResponse
     */
    public CreateAITaskResponse createAITaskWithOptions(CreateAITaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.prompt)) {
            query.put("Prompt", request.prompt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            query.put("TaskType", request.taskType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateType)) {
            query.put("TemplateType", request.templateType);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.template)) {
            body.put("Template", request.template);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAITask"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAITaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API allows users to create an AI task based on the specified task type, covering a range of capabilities from natural language understanding to resource stack deployment. Users need to provide the task type and any required parameters, and the API will return a unique TaskId for tracking the status and results of the task.</p>
     * 
     * <b>summary</b> : 
     * <p>Create AI Task</p>
     * 
     * @param request CreateAITaskRequest
     * @return CreateAITaskResponse
     */
    public CreateAITaskResponse createAITask(CreateAITaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAITaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Scenarios</h3>
     * <h4>Create a stack using a change set</h4>
     * <p>To manage cloud resources and preview creation results before the stack is created, set <code>ChangeSetType</code> to CREATE. <a href="https://help.aliyun.com/document_detail/155649.html">Change sets</a>.</p>
     * <h4>Update a stack using a change set</h4>
     * <p>To preview the impact of an update before applying changes, set <code>ChangeSetType</code> to UPDATE. <a href="https://help.aliyun.com/document_detail/155649.html">Change sets</a>.</p>
     * <h4>Create a stack from existing resources</h4>
     * <p>To import existing cloud resources into a new stack, set <code>ChangeSetType</code> to IMPORT. <a href="https://help.aliyun.com/document_detail/193454.html">Overview</a>.</p>
     * <h4>Import existing resources to a stack</h4>
     * <p>To import existing resources into an existing stack, set <code>ChangeSetType</code> to IMPORT. <a href="https://help.aliyun.com/document_detail/193454.html">Overview</a>.</p>
     * <h3>Limits</h3>
     * <ul>
     * <li>Only stacks in specific states can be updated using change sets. <a href="https://help.aliyun.com/document_detail/155873.html">Update a stack using a change set</a>.</li>
     * <li>A stack can have a maximum of 20 change sets at a time.</li>
     * <li>A change set shows only the changes to a stack. It does not indicate whether the stack will be successfully updated.</li>
     * <li>A change set does not check for issues such as exceeded account quotas, non-updatable resources, or insufficient permissions. These issues can cause the stack update to fail. If the update fails, ROS attempts to roll back resources to their previous state.
     * In this example, a change set named <code>MyChangeSet</code> is created in the China (Hangzhou) region (<code>cn-hangzhou</code>) to update the template of stack <code>4a6c9851-3b0f-4f5f-b4ca-a14bf691****</code> to <code>{&quot;ROSTemplateFormatVersion&quot;:&quot;2015-09-01&quot;}</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a change set for a stack so you can preview changes before execution.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taintResources)) {
            query.put("TaintResources", request.taintResources);
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
     * <b>description</b> :
     * <h3>Scenarios</h3>
     * <h4>Create a stack using a change set</h4>
     * <p>To manage cloud resources and preview creation results before the stack is created, set <code>ChangeSetType</code> to CREATE. <a href="https://help.aliyun.com/document_detail/155649.html">Change sets</a>.</p>
     * <h4>Update a stack using a change set</h4>
     * <p>To preview the impact of an update before applying changes, set <code>ChangeSetType</code> to UPDATE. <a href="https://help.aliyun.com/document_detail/155649.html">Change sets</a>.</p>
     * <h4>Create a stack from existing resources</h4>
     * <p>To import existing cloud resources into a new stack, set <code>ChangeSetType</code> to IMPORT. <a href="https://help.aliyun.com/document_detail/193454.html">Overview</a>.</p>
     * <h4>Import existing resources to a stack</h4>
     * <p>To import existing resources into an existing stack, set <code>ChangeSetType</code> to IMPORT. <a href="https://help.aliyun.com/document_detail/193454.html">Overview</a>.</p>
     * <h3>Limits</h3>
     * <ul>
     * <li>Only stacks in specific states can be updated using change sets. <a href="https://help.aliyun.com/document_detail/155873.html">Update a stack using a change set</a>.</li>
     * <li>A stack can have a maximum of 20 change sets at a time.</li>
     * <li>A change set shows only the changes to a stack. It does not indicate whether the stack will be successfully updated.</li>
     * <li>A change set does not check for issues such as exceeded account quotas, non-updatable resources, or insufficient permissions. These issues can cause the stack update to fail. If the update fails, ROS attempts to roll back resources to their previous state.
     * In this example, a change set named <code>MyChangeSet</code> is created in the China (Hangzhou) region (<code>cn-hangzhou</code>) to update the template of stack <code>4a6c9851-3b0f-4f5f-b4ca-a14bf691****</code> to <code>{&quot;ROSTemplateFormatVersion&quot;:&quot;2015-09-01&quot;}</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a change set for a stack so you can preview changes before execution.</p>
     * 
     * @param request CreateChangeSetRequest
     * @return CreateChangeSetResponse
     */
    public CreateChangeSetResponse createChangeSet(CreateChangeSetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createChangeSetWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a dignosis task.</p>
     * 
     * @param request CreateDiagnosticRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDiagnosticResponse
     */
    public CreateDiagnosticResponse createDiagnosticWithOptions(CreateDiagnosticRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.diagnosticKey)) {
            query.put("DiagnosticKey", request.diagnosticKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.diagnosticType)) {
            query.put("DiagnosticType", request.diagnosticType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
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

    /**
     * <b>summary</b> : 
     * <p>Creates a dignosis task.</p>
     * 
     * @param request CreateDiagnosticRequest
     * @return CreateDiagnosticResponse
     */
    public CreateDiagnosticResponse createDiagnostic(CreateDiagnosticRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDiagnosticWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>A stack is the management unit for ROS resources (<a href="https://help.aliyun.com/document_detail/172973.html">Overview</a>). Limits:</p>
     * <ul>
     * <li>Each Alibaba Cloud account can create up to 200 stacks.</li>
     * <li>Each stack can contain up to 200 resources.
     * The following example creates a stack named <code>MyStack</code> in the China (Hangzhou) region with <code>TemplateBody</code> set to <code>{&quot;ROSTemplateFormatVersion&quot;:&quot;2015-09-01&quot;}</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a stack from a ROS template to deploy a group of resources.</p>
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
     * <b>description</b> :
     * <p>A stack is the management unit for ROS resources (<a href="https://help.aliyun.com/document_detail/172973.html">Overview</a>). Limits:</p>
     * <ul>
     * <li>Each Alibaba Cloud account can create up to 200 stacks.</li>
     * <li>Each stack can contain up to 200 resources.
     * The following example creates a stack named <code>MyStack</code> in the China (Hangzhou) region with <code>TemplateBody</code> set to <code>{&quot;ROSTemplateFormatVersion&quot;:&quot;2015-09-01&quot;}</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a stack from a ROS template to deploy a group of resources.</p>
     * 
     * @param request CreateStackRequest
     * @return CreateStackResponse
     */
    public CreateStackResponse createStack(CreateStackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createStackWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>A stack group manages multiple ROS stacks as a unit, enabling you to create stacks across Alibaba Cloud accounts and regions.
     * Stack groups support two permission models:</p>
     * <ul>
     * <li>Self-managed: Both the administrator and execution accounts are Alibaba Cloud accounts.</li>
     * <li>Service-managed: The administrator account is the management account or delegated administrator account of a resource directory. The execution account is a member account of that directory.
     * <a href="https://help.aliyun.com/document_detail/154578.html">Overview</a>.
     * This example creates a self-managed stack group named <code>MyStackGroup</code> in the <code>China (Hangzhou)</code> region using template <code>5ecd1e10-b0e9-4389-a565-e4c15efc****</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a stack group from an ROS template to create stacks across multiple Alibaba Cloud accounts and regions.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.stackArn)) {
            query.put("StackArn", request.stackArn);
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
     * <b>description</b> :
     * <p>A stack group manages multiple ROS stacks as a unit, enabling you to create stacks across Alibaba Cloud accounts and regions.
     * Stack groups support two permission models:</p>
     * <ul>
     * <li>Self-managed: Both the administrator and execution accounts are Alibaba Cloud accounts.</li>
     * <li>Service-managed: The administrator account is the management account or delegated administrator account of a resource directory. The execution account is a member account of that directory.
     * <a href="https://help.aliyun.com/document_detail/154578.html">Overview</a>.
     * This example creates a self-managed stack group named <code>MyStackGroup</code> in the <code>China (Hangzhou)</code> region using template <code>5ecd1e10-b0e9-4389-a565-e4c15efc****</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a stack group from an ROS template to create stacks across multiple Alibaba Cloud accounts and regions.</p>
     * 
     * @param request CreateStackGroupRequest
     * @return CreateStackGroupResponse
     */
    public CreateStackGroupResponse createStackGroup(CreateStackGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createStackGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Prerequisites</h3>
     * <p>Ensure that a stack group is created. For more information, see <a href="https://help.aliyun.com/document_detail/151333.html">CreateStackGroup</a>.</p>
     * <h3>Scenarios</h3>
     * <h4>Create stacks across accounts</h4>
     * <p>To create identical resources in multiple accounts, an administrator account can create a stack group, add multiple destination accounts, and deploy resources in a single region. This process creates multiple stacks in different accounts within the same region, improving deployment efficiency.</p>
     * <h4>Create stacks across regions</h4>
     * <p>To create identical resources in multiple regions, an administrator account can create a stack group, add a destination account, and deploy resources in multiple regions. This process creates multiple stacks in different regions within the same account, improving deployment efficiency.</p>
     * <h4>Create stacks across accounts and regions</h4>
     * <p>To create identical resources in multiple accounts across multiple regions, an administrator account can create a stack group, add multiple destination accounts, and deploy resources in multiple regions. This process creates multiple stacks in different accounts across different regions, improving deployment efficiency.
     * This topic provides an example of creating stacks in the China (Hangzhou) and China (Beijing) regions in the Alibaba Cloud accounts <code>151266687691****</code> and <code>141261387191****</code>. The example uses a stack group named <code>MyStackGroup</code> that is created in the China (Hangzhou) region and uses self-managed permissions.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates stack instances for one or more accounts in the specified regions.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.deploymentOptions)) {
            query.put("DeploymentOptions", request.deploymentOptions);
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
     * <b>description</b> :
     * <h3>Prerequisites</h3>
     * <p>Ensure that a stack group is created. For more information, see <a href="https://help.aliyun.com/document_detail/151333.html">CreateStackGroup</a>.</p>
     * <h3>Scenarios</h3>
     * <h4>Create stacks across accounts</h4>
     * <p>To create identical resources in multiple accounts, an administrator account can create a stack group, add multiple destination accounts, and deploy resources in a single region. This process creates multiple stacks in different accounts within the same region, improving deployment efficiency.</p>
     * <h4>Create stacks across regions</h4>
     * <p>To create identical resources in multiple regions, an administrator account can create a stack group, add a destination account, and deploy resources in multiple regions. This process creates multiple stacks in different regions within the same account, improving deployment efficiency.</p>
     * <h4>Create stacks across accounts and regions</h4>
     * <p>To create identical resources in multiple accounts across multiple regions, an administrator account can create a stack group, add multiple destination accounts, and deploy resources in multiple regions. This process creates multiple stacks in different accounts across different regions, improving deployment efficiency.
     * This topic provides an example of creating stacks in the China (Hangzhou) and China (Beijing) regions in the Alibaba Cloud accounts <code>151266687691****</code> and <code>141261387191****</code>. The example uses a stack group named <code>MyStackGroup</code> that is created in the China (Hangzhou) region and uses self-managed permissions.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates stack instances for one or more accounts in the specified regions.</p>
     * 
     * @param request CreateStackInstancesRequest
     * @return CreateStackInstancesResponse
     */
    public CreateStackInstancesResponse createStackInstances(CreateStackInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createStackInstancesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example of how to create a template named <code>MyTemplate</code> in the China (Hangzhou) region (<code>cn-hangzhou</code>). The <code>TemplateBody</code> parameter is set to <code>{&quot;ROSTemplateFormatVersion&quot;: &quot;2015-09-01&quot;}</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a custom template.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.validationOptions)) {
            query.put("ValidationOptions", request.validationOptions);
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
     * <b>description</b> :
     * <p>This topic provides an example of how to create a template named <code>MyTemplate</code> in the China (Hangzhou) region (<code>cn-hangzhou</code>). The <code>TemplateBody</code> parameter is set to <code>{&quot;ROSTemplateFormatVersion&quot;: &quot;2015-09-01&quot;}</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a custom template.</p>
     * 
     * @param request CreateTemplateRequest
     * @return CreateTemplateResponse
     */
    public CreateTemplateResponse createTemplate(CreateTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTemplateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Limits</h3>
     * <p>Only specific resource types support the resource scenario feature. For more information, refer to <a href="https://help.aliyun.com/document_detail/353175.html">Resource types that support scenarios</a>.</p>
     * <h3>Description</h3>
     * <p>Resource Orchestration Service (ROS) provides the resource scenario feature. You can select a resource scope in the UI and perform operations such as replication or management of a group of resources, helping simplify resource management. For more information about resource scenarios, refer to <a href="https://help.aliyun.com/document_detail/352074.html">Overview</a>.</p>
     * <h4>Resource replication scenario</h4>
     * <p>If you want to replicate a collection of resources and dependencies between the resources, you can create a resource replication scenario. This type of scenario lets you replicate all existing resources within the specified scope and generate a collection of resources that have the same architecture as the existing resources. For more information, refer to <a href="https://help.aliyun.com/document_detail/353133.html">Resource replication scenario</a>.</p>
     * <h4>Resource profiling scenario</h4>
     * <p>If the relationships between resources that you want to create are complicated, you can create a resource profiling scenario to preview the overall resource architecture or the architecture starting from a specific resource. This helps simplify resource management. For more information, refer to <a href="https://help.aliyun.com/document_detail/2591901.html">Resource detection scenario</a>.</p>
     * <h4>Resource management scenario</h4>
     * <p>If you need to import a collection of existing resources into a new resource stack for unified management, you can create a resource management scenario. For more information, refer to <a href="https://help.aliyun.com/document_detail/353163.html">Resource management scenario</a>.</p>
     * <h4>Resource migration scenario</h4>
     * <p>If you want to migrate a collection of resources and dependencies between the resources, you can create a resource migration scenario. When you migrate the resources, ROS generates a stack. You can view the migration progress on the Stacks tab of the scenario details page. After you migrate the resources, you can delete source resources. For more information, refer to <a href="https://help.aliyun.com/document_detail/379902.html">Resource migration scenario</a>.
     * This topic provides an example of how to create a resource replication scenario in the China (Hangzhou) region to replicate a virtual private cloud (VPC) with the ID of <code>vpc-bp1m6fww66xbntjyc****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates templatescratch: scenario.</p>
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
     * <b>description</b> :
     * <h3>Limits</h3>
     * <p>Only specific resource types support the resource scenario feature. For more information, refer to <a href="https://help.aliyun.com/document_detail/353175.html">Resource types that support scenarios</a>.</p>
     * <h3>Description</h3>
     * <p>Resource Orchestration Service (ROS) provides the resource scenario feature. You can select a resource scope in the UI and perform operations such as replication or management of a group of resources, helping simplify resource management. For more information about resource scenarios, refer to <a href="https://help.aliyun.com/document_detail/352074.html">Overview</a>.</p>
     * <h4>Resource replication scenario</h4>
     * <p>If you want to replicate a collection of resources and dependencies between the resources, you can create a resource replication scenario. This type of scenario lets you replicate all existing resources within the specified scope and generate a collection of resources that have the same architecture as the existing resources. For more information, refer to <a href="https://help.aliyun.com/document_detail/353133.html">Resource replication scenario</a>.</p>
     * <h4>Resource profiling scenario</h4>
     * <p>If the relationships between resources that you want to create are complicated, you can create a resource profiling scenario to preview the overall resource architecture or the architecture starting from a specific resource. This helps simplify resource management. For more information, refer to <a href="https://help.aliyun.com/document_detail/2591901.html">Resource detection scenario</a>.</p>
     * <h4>Resource management scenario</h4>
     * <p>If you need to import a collection of existing resources into a new resource stack for unified management, you can create a resource management scenario. For more information, refer to <a href="https://help.aliyun.com/document_detail/353163.html">Resource management scenario</a>.</p>
     * <h4>Resource migration scenario</h4>
     * <p>If you want to migrate a collection of resources and dependencies between the resources, you can create a resource migration scenario. When you migrate the resources, ROS generates a stack. You can view the migration progress on the Stacks tab of the scenario details page. After you migrate the resources, you can delete source resources. For more information, refer to <a href="https://help.aliyun.com/document_detail/379902.html">Resource migration scenario</a>.
     * This topic provides an example of how to create a resource replication scenario in the China (Hangzhou) region to replicate a virtual private cloud (VPC) with the ID of <code>vpc-bp1m6fww66xbntjyc****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates templatescratch: scenario.</p>
     * 
     * @param request CreateTemplateScratchRequest
     * @return CreateTemplateScratchResponse
     */
    public CreateTemplateScratchResponse createTemplateScratch(CreateTemplateScratchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTemplateScratchWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before you call this operation, make sure that the following requirements are met:<ul>
     * <li>The status of the change set is CREATE_COMPLETE, CREATE_FAILED, or DELETE_FAILED.</li>
     * <li>The execution status is UNAVAILABLE or AVAILABLE.</li>
     * </ul>
     * </li>
     * <li>After a change set is executed, other change sets associated with the same stack as this change set are also deleted.</li>
     * <li>After a stack is deleted, change sets associated with the stack are deleted.</li>
     * <li>If a change set of the CREATE type is deleted, you must delete stacks associated with the change set.
     * In this example, a change set whose ID is <code>1f6521a4-05af-4975-afe9-bc4b45ad****</code> is deleted. The change set is created in the China (Hangzhou) region.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes change sets.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>Before you call this operation, make sure that the following requirements are met:<ul>
     * <li>The status of the change set is CREATE_COMPLETE, CREATE_FAILED, or DELETE_FAILED.</li>
     * <li>The execution status is UNAVAILABLE or AVAILABLE.</li>
     * </ul>
     * </li>
     * <li>After a change set is executed, other change sets associated with the same stack as this change set are also deleted.</li>
     * <li>After a stack is deleted, change sets associated with the stack are deleted.</li>
     * <li>If a change set of the CREATE type is deleted, you must delete stacks associated with the change set.
     * In this example, a change set whose ID is <code>1f6521a4-05af-4975-afe9-bc4b45ad****</code> is deleted. The change set is created in the China (Hangzhou) region.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes change sets.</p>
     * 
     * @param request DeleteChangeSetRequest
     * @return DeleteChangeSetResponse
     */
    public DeleteChangeSetResponse deleteChangeSet(DeleteChangeSetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteChangeSetWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a diagnostic record.</p>
     * 
     * @param request DeleteDiagnosticRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDiagnosticResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Deletes a diagnostic record.</p>
     * 
     * @param request DeleteDiagnosticRequest
     * @return DeleteDiagnosticResponse
     */
    public DeleteDiagnosticResponse deleteDiagnostic(DeleteDiagnosticRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDiagnosticWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a stack, optionally retaining resources.</p>
     * 
     * @param request DeleteStackRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteStackResponse
     */
    public DeleteStackResponse deleteStackWithOptions(DeleteStackRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deleteOptions)) {
            query.put("DeleteOptions", request.deleteOptions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parallelism)) {
            query.put("Parallelism", request.parallelism);
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

    /**
     * <b>summary</b> : 
     * <p>Deletes a stack, optionally retaining resources.</p>
     * 
     * @param request DeleteStackRequest
     * @return DeleteStackResponse
     */
    public DeleteStackResponse deleteStack(DeleteStackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteStackWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>A stack group can be deleted only when the stack group does not contain stacks. You can call the <a href="https://help.aliyun.com/document_detail/151715.html">DeleteStackInstances</a> operation to delete stacks.
     * This topic provides an example on how to delete a stack group. In this example, a stack group named <code>MyStackGroup</code> in the China (Hangzhou) region is deleted.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a stack group.</p>
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
     * <b>description</b> :
     * <p>A stack group can be deleted only when the stack group does not contain stacks. You can call the <a href="https://help.aliyun.com/document_detail/151715.html">DeleteStackInstances</a> operation to delete stacks.
     * This topic provides an example on how to delete a stack group. In this example, a stack group named <code>MyStackGroup</code> in the China (Hangzhou) region is deleted.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a stack group.</p>
     * 
     * @param request DeleteStackGroupRequest
     * @return DeleteStackGroupResponse
     */
    public DeleteStackGroupResponse deleteStackGroup(DeleteStackGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteStackGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example of how to delete a stack instance from the <code>MyStackGroup</code> stack group. The stack group uses self-managed permissions and is in the China (Hangzhou) region. This example deletes the stack instance that is deployed in the China (Beijing) region for the Alibaba Cloud account <code>151266687691****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes stack instances from specified accounts and regions. You can choose to retain the resources.</p>
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
     * <b>description</b> :
     * <p>This topic provides an example of how to delete a stack instance from the <code>MyStackGroup</code> stack group. The stack group uses self-managed permissions and is in the China (Hangzhou) region. This example deletes the stack instance that is deployed in the China (Beijing) region for the Alibaba Cloud account <code>151266687691****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes stack instances from specified accounts and regions. You can choose to retain the resources.</p>
     * 
     * @param request DeleteStackInstancesRequest
     * @return DeleteStackInstancesResponse
     */
    public DeleteStackInstancesResponse deleteStackInstances(DeleteStackInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteStackInstancesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>If a template is shared with other Alibaba Cloud accounts, unshare it before deletion.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a template.</p>
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
     * <b>description</b> :
     * <p>If a template is shared with other Alibaba Cloud accounts, unshare it before deletion.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a template.</p>
     * 
     * @param request DeleteTemplateRequest
     * @return DeleteTemplateResponse
     */
    public DeleteTemplateResponse deleteTemplate(DeleteTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteTemplateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>In this topic, a scenario whose ID is <code>ts-4f83704400994409****</code> is deleted in the China (Hangzhou) region.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a scenario.</p>
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
     * <b>description</b> :
     * <p>In this topic, a scenario whose ID is <code>ts-4f83704400994409****</code> is deleted in the China (Hangzhou) region.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a scenario.</p>
     * 
     * @param request DeleteTemplateScratchRequest
     * @return DeleteTemplateScratchResponse
     */
    public DeleteTemplateScratchResponse deleteTemplateScratch(DeleteTemplateScratchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteTemplateScratchWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>If you delete a resource type, it can no longer be used in ROS.</li>
     * <li>If you delete a version of a resource type, that version can no longer be used in ROS.</li>
     * <li>You can delete a resource type only if it has a single version. If a resource type has multiple versions, you must delete the other versions first.</li>
     * <li>You cannot delete the default version if the resource type has more than one version.</li>
     * <li>If a resource type has only one version, deleting that version also deletes the resource type.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a resource type or a specific version of a resource type.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>If you delete a resource type, it can no longer be used in ROS.</li>
     * <li>If you delete a version of a resource type, that version can no longer be used in ROS.</li>
     * <li>You can delete a resource type only if it has a single version. If a resource type has multiple versions, you must delete the other versions first.</li>
     * <li>You cannot delete the default version if the resource type has more than one version.</li>
     * <li>If a resource type has only one version, deleting that version also deletes the resource type.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a resource type or a specific version of a resource type.</p>
     * 
     * @param request DeregisterResourceTypeRequest
     * @return DeregisterResourceTypeResponse
     */
    public DeregisterResourceTypeResponse deregisterResourceType(DeregisterResourceTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deregisterResourceTypeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of available regions.</p>
     * 
     * @param request DescribeRegionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRegionsResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries a list of available regions.</p>
     * 
     * @param request DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRegionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Performs drift detection on resources in a stack to check whether the resources have drifted from the expected template configurations.</p>
     * 
     * @param request DetectStackDriftRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DetectStackDriftResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Performs drift detection on resources in a stack to check whether the resources have drifted from the expected template configurations.</p>
     * 
     * @param request DetectStackDriftRequest
     * @return DetectStackDriftResponse
     */
    public DetectStackDriftResponse detectStackDrift(DetectStackDriftRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detectStackDriftWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Performs drift detection on stack groups to check whether the stack groups have drifted from the expected template configurations.</p>
     * 
     * @param tmpReq DetectStackGroupDriftRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DetectStackGroupDriftResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Performs drift detection on stack groups to check whether the stack groups have drifted from the expected template configurations.</p>
     * 
     * @param request DetectStackGroupDriftRequest
     * @return DetectStackGroupDriftResponse
     */
    public DetectStackGroupDriftResponse detectStackGroupDrift(DetectStackGroupDriftRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detectStackGroupDriftWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Performs drift detection on resources in a stack to determine whether the resources have drifted from the expected configurations.</p>
     * 
     * @param request DetectStackResourceDriftRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DetectStackResourceDriftResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Performs drift detection on resources in a stack to determine whether the resources have drifted from the expected configurations.</p>
     * 
     * @param request DetectStackResourceDriftRequest
     * @return DetectStackResourceDriftResponse
     */
    public DetectStackResourceDriftResponse detectStackResourceDrift(DetectStackResourceDriftRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detectStackResourceDriftWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Description</h3>
     * <p>Enables trusted service access.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables trusted service access.</p>
     * 
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableServiceAccessResponse
     */
    public EnableServiceAccessResponse enableServiceAccessWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableServiceAccess"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableServiceAccessResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Description</h3>
     * <p>Enables trusted service access.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables trusted service access.</p>
     * @return EnableServiceAccessResponse
     */
    public EnableServiceAccessResponse enableServiceAccess() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableServiceAccessWithOptions(runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Description</h3>
     * <p>This operation enables multiple Alibaba Cloud services in a batch.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables services in a batch.</p>
     * 
     * @param tmpReq EnableServicesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableServicesResponse
     */
    public EnableServicesResponse enableServicesWithOptions(EnableServicesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        EnableServicesShrinkRequest request = new EnableServicesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.serviceNames)) {
            request.serviceNamesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.serviceNames, "ServiceNames", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceNamesShrink)) {
            query.put("ServiceNames", request.serviceNamesShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableServices"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableServicesResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Description</h3>
     * <p>This operation enables multiple Alibaba Cloud services in a batch.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables services in a batch.</p>
     * 
     * @param request EnableServicesRequest
     * @return EnableServicesResponse
     */
    public EnableServicesResponse enableServices(EnableServicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableServicesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>In this example, the change set whose ID is <code>1f6521a4-05af-4975-afe9-bc4b45ad****</code> is executed. The change set is created in the <code>China (Hangzhou)</code> region.</p>
     * 
     * <b>summary</b> : 
     * <p>Executes change sets.</p>
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
     * <b>description</b> :
     * <p>In this example, the change set whose ID is <code>1f6521a4-05af-4975-afe9-bc4b45ad****</code> is executed. The change set is created in the <code>China (Hangzhou)</code> region.</p>
     * 
     * <b>summary</b> : 
     * <p>Executes change sets.</p>
     * 
     * @param request ExecuteChangeSetRequest
     * @return ExecuteChangeSetResponse
     */
    public ExecuteChangeSetResponse executeChangeSet(ExecuteChangeSetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.executeChangeSetWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>In this example, a template is generated for a resource management scenario that resides in the China (Hangzhou) region. The ID of the resource scenario is <code>ts-aa9c62feab844a6b****</code>.</p>
     * <blockquote>
     * <p>You cannot generate a template for a resource detection scenario.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Generates a template for a resource scenario.</p>
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
     * <b>description</b> :
     * <p>In this example, a template is generated for a resource management scenario that resides in the China (Hangzhou) region. The ID of the resource scenario is <code>ts-aa9c62feab844a6b****</code>.</p>
     * <blockquote>
     * <p>You cannot generate a template for a resource detection scenario.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Generates a template for a resource scenario.</p>
     * 
     * @param request GenerateTemplateByScratchRequest
     * @return GenerateTemplateByScratchResponse
     */
    public GenerateTemplateByScratchResponse generateTemplateByScratch(GenerateTemplateByScratchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.generateTemplateByScratchWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>If the policies required by the template include Enterprise Distributed Application Service (EDAS), log on to your Alibaba Cloud account and upgrade the RAM permissions for the Resource Access Management (RAM) users that require authorization.
     * This topic provides an example of how to generate access policies for a template whose ID is <code>5ecd1e10-b0e9-4389-a565-e4c15efc****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Generates the policy information required by a specified template.</p>
     * 
     * @param request GenerateTemplatePolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GenerateTemplatePolicyResponse
     */
    public GenerateTemplatePolicyResponse generateTemplatePolicyWithOptions(GenerateTemplatePolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.generateOptions)) {
            query.put("GenerateOptions", request.generateOptions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operationTypes)) {
            query.put("OperationTypes", request.operationTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parameters)) {
            query.put("Parameters", request.parameters);
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
     * <b>description</b> :
     * <p>If the policies required by the template include Enterprise Distributed Application Service (EDAS), log on to your Alibaba Cloud account and upgrade the RAM permissions for the Resource Access Management (RAM) users that require authorization.
     * This topic provides an example of how to generate access policies for a template whose ID is <code>5ecd1e10-b0e9-4389-a565-e4c15efc****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Generates the policy information required by a specified template.</p>
     * 
     * @param request GenerateTemplatePolicyRequest
     * @return GenerateTemplatePolicyResponse
     */
    public GenerateTemplatePolicyResponse generateTemplatePolicy(GenerateTemplatePolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.generateTemplatePolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about an AI task by task ID.</p>
     * 
     * @param request GetAITaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAITaskResponse
     */
    public GetAITaskResponse getAITaskWithOptions(GetAITaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.outputOption)) {
            query.put("OutputOption", request.outputOption);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAITask"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAITaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about an AI task by task ID.</p>
     * 
     * @param request GetAITaskRequest
     * @return GetAITaskResponse
     */
    public GetAITaskResponse getAITask(GetAITaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAITaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic demonstrates how to query a change set with the ID <code>4c11658d-bd47-4dd0-ba64-727edc62****</code> in the China (Hangzhou) region.</p>
     * 
     * <b>summary</b> : 
     * <p>Returns details for a specified change set, optionally including the details of its associated template.</p>
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
     * <b>description</b> :
     * <p>This topic demonstrates how to query a change set with the ID <code>4c11658d-bd47-4dd0-ba64-727edc62****</code> in the China (Hangzhou) region.</p>
     * 
     * <b>summary</b> : 
     * <p>Returns details for a specified change set, optionally including the details of its associated template.</p>
     * 
     * @param request GetChangeSetRequest
     * @return GetChangeSetResponse
     */
    public GetChangeSetResponse getChangeSet(GetChangeSetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getChangeSetWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the diagnosis details based on a specified diagnostic report ID.</p>
     * 
     * @param request GetDiagnosticRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDiagnosticResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Obtains the diagnosis details based on a specified diagnostic report ID.</p>
     * 
     * @param request GetDiagnosticRequest
     * @return GetDiagnosticResponse
     */
    public GetDiagnosticResponse getDiagnostic(GetDiagnosticRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDiagnosticWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the Terraform hosting, resource cleaner, and scenario features.
     * This topic provides an example on how to query the details of features supported by ROS in the China (Hangzhou) region. The details include Terraform versions, provider versions, and supported resource types.</p>
     * <blockquote>
     * <p>In the Examples section, only part of the sample code is provided.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of features that are supported by Resource Orchestration Service (ROS).</p>
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
     * <b>description</b> :
     * <p>You can call this operation to query the Terraform hosting, resource cleaner, and scenario features.
     * This topic provides an example on how to query the details of features supported by ROS in the China (Hangzhou) region. The details include Terraform versions, provider versions, and supported resource types.</p>
     * <blockquote>
     * <p>In the Examples section, only part of the sample code is provided.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of features that are supported by Resource Orchestration Service (ROS).</p>
     * 
     * @param request GetFeatureDetailsRequest
     * @return GetFeatureDetailsResponse
     */
    public GetFeatureDetailsResponse getFeatureDetails(GetFeatureDetailsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getFeatureDetailsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example of how to query the details of the <code>ALIYUN::ROS::WaitConditionHandle</code> resource type.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a resource type.</p>
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
     * <b>description</b> :
     * <p>This topic provides an example of how to query the details of the <code>ALIYUN::ROS::WaitConditionHandle</code> resource type.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a resource type.</p>
     * 
     * @param request GetResourceTypeRequest
     * @return GetResourceTypeResponse
     */
    public GetResourceTypeResponse getResourceType(GetResourceTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getResourceTypeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Generates a sample template based on a resource type.</p>
     * 
     * @param request GetResourceTypeTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetResourceTypeTemplateResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Generates a sample template based on a resource type.</p>
     * 
     * @param request GetResourceTypeTemplateRequest
     * @return GetResourceTypeTemplateResponse
     */
    public GetResourceTypeTemplateResponse getResourceTypeTemplate(GetResourceTypeTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getResourceTypeTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the access status of a trusted service.</p>
     * 
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetServiceAccessResponse
     */
    public GetServiceAccessResponse getServiceAccessWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetServiceAccess"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetServiceAccessResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the access status of a trusted service.</p>
     * @return GetServiceAccessResponse
     */
    public GetServiceAccessResponse getServiceAccess() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getServiceAccessWithOptions(runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>This topic provides an example of how to query the activation status of Elastic High Performance Computing (EHPC) and information about the service-linked roles for EHPC in the China (Hangzhou) region.</p>
     * <blockquote>
     * <p>Make sure that you have the permissions to call the <a href="https://help.aliyun.com/document_detail/28711.html">GetRole</a> operation.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the activation status of an Alibaba Cloud service and information about its service-linked roles.</p>
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
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>This topic provides an example of how to query the activation status of Elastic High Performance Computing (EHPC) and information about the service-linked roles for EHPC in the China (Hangzhou) region.</p>
     * <blockquote>
     * <p>Make sure that you have the permissions to call the <a href="https://help.aliyun.com/document_detail/28711.html">GetRole</a> operation.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the activation status of an Alibaba Cloud service and information about its service-linked roles.</p>
     * 
     * @param request GetServiceProvisionsRequest
     * @return GetServiceProvisionsResponse
     */
    public GetServiceProvisionsResponse getServiceProvisions(GetServiceProvisionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getServiceProvisionsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example of how to query the information of a stack whose ID is <code>c754d2a4-28f1-46df-b557-9586173a****</code> in the China (Hangzhou) region.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries stack information.</p>
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
     * <b>description</b> :
     * <p>This topic provides an example of how to query the information of a stack whose ID is <code>c754d2a4-28f1-46df-b557-9586173a****</code> in the China (Hangzhou) region.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries stack information.</p>
     * 
     * @param request GetStackRequest
     * @return GetStackResponse
     */
    public GetStackResponse getStack(GetStackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getStackWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>In this topic, the status of a drift detection operation whose ID is <code>a7044f0d-6f2e-4128-a307-4524ef88****</code> is queried. The operation is performed in the China (Hangzhou) region.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the drift detection status of a stack.</p>
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
     * <b>description</b> :
     * <p>In this topic, the status of a drift detection operation whose ID is <code>a7044f0d-6f2e-4128-a307-4524ef88****</code> is queried. The operation is performed in the China (Hangzhou) region.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the drift detection status of a stack.</p>
     * 
     * @param request GetStackDriftDetectionStatusRequest
     * @return GetStackDriftDetectionStatusResponse
     */
    public GetStackDriftDetectionStatusResponse getStackDriftDetectionStatus(GetStackDriftDetectionStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getStackDriftDetectionStatusWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example of how to query a stack group named <code>MyStackGroup</code>. The stack group is in the China (Hangzhou) region and uses the self-managed permission mode.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a stack group by its name in an Alibaba Cloud region.</p>
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
     * <b>description</b> :
     * <p>This topic provides an example of how to query a stack group named <code>MyStackGroup</code>. The stack group is in the China (Hangzhou) region and uses the self-managed permission mode.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a stack group by its name in an Alibaba Cloud region.</p>
     * 
     * @param request GetStackGroupRequest
     * @return GetStackGroupResponse
     */
    public GetStackGroupResponse getStackGroup(GetStackGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getStackGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>In this example, the information about the stack group operation whose ID is <code>6da106ca-1784-4a6f-a7e1-e723863d****</code> is queried. The stack group named <code>MyStackGroup</code> is granted self-managed permissions and deployed in the China (Hangzhou) region.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about a stack group operation in an Alibaba Cloud region.</p>
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
     * <b>description</b> :
     * <p>In this example, the information about the stack group operation whose ID is <code>6da106ca-1784-4a6f-a7e1-e723863d****</code> is queried. The stack group named <code>MyStackGroup</code> is granted self-managed permissions and deployed in the China (Hangzhou) region.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about a stack group operation in an Alibaba Cloud region.</p>
     * 
     * @param request GetStackGroupOperationRequest
     * @return GetStackGroupOperationResponse
     */
    public GetStackGroupOperationResponse getStackGroupOperation(GetStackGroupOperationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getStackGroupOperationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>In this example, the information about a stack instance associated with a stack group named <code>MyStackGroup</code> is queried. The stack instance is deployed in the China (Beijing) region within the <code>151266687691****</code> Alibaba Cloud account. The stack group is granted self-managed permissions and deployed in the China (Hangzhou) region.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about a stack instance that is associated with a stack group.</p>
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
     * <b>description</b> :
     * <p>In this example, the information about a stack instance associated with a stack group named <code>MyStackGroup</code> is queried. The stack instance is deployed in the China (Beijing) region within the <code>151266687691****</code> Alibaba Cloud account. The stack group is granted self-managed permissions and deployed in the China (Hangzhou) region.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about a stack instance that is associated with a stack group.</p>
     * 
     * @param request GetStackInstanceRequest
     * @return GetStackInstanceResponse
     */
    public GetStackInstanceResponse getStackInstance(GetStackInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getStackInstanceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This example queries the stack policy of stack <code>4a6c9851-3b0f-4f5f-b4ca-a14bf691****</code> in the China (Hangzhou) region.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the stack policy of a specified stack.</p>
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
     * <b>description</b> :
     * <p>This example queries the stack policy of stack <code>4a6c9851-3b0f-4f5f-b4ca-a14bf691****</code> in the China (Hangzhou) region.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the stack policy of a specified stack.</p>
     * 
     * @param request GetStackPolicyRequest
     * @return GetStackPolicyResponse
     */
    public GetStackPolicyResponse getStackPolicy(GetStackPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getStackPolicyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the details of a resource named <code>WebServer</code> in a stack whose ID is <code>4a6c9851-3b0f-4f5f-b4ca-a14bf691****</code> in the China (Hangzhou) region.</p>
     * 
     * <b>summary</b> : 
     * <p>Query a resource in a specific stack.</p>
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
     * <b>description</b> :
     * <p>This topic provides an example on how to query the details of a resource named <code>WebServer</code> in a stack whose ID is <code>4a6c9851-3b0f-4f5f-b4ca-a14bf691****</code> in the China (Hangzhou) region.</p>
     * 
     * <b>summary</b> : 
     * <p>Query a resource in a specific stack.</p>
     * 
     * @param request GetStackResourceRequest
     * @return GetStackResourceResponse
     */
    public GetStackResourceResponse getStackResource(GetStackResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getStackResourceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>In this example, the details of a template whose ID is <code>5ecd1e10-b0e9-4389-a565-e4c15efc****</code> is queried. The region ID of the template is <code>cn-hangzhou</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a template based on stacks, stack groups, change sets, or any custom template information.</p>
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
     * <b>description</b> :
     * <p>In this example, the details of a template whose ID is <code>5ecd1e10-b0e9-4389-a565-e4c15efc****</code> is queried. The region ID of the template is <code>cn-hangzhou</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a template based on stacks, stack groups, change sets, or any custom template information.</p>
     * 
     * @param request GetTemplateRequest
     * @return GetTemplateResponse
     */
    public GetTemplateResponse getTemplate(GetTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTemplateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3></h3>
     * <ul>
     * <li>For more information about the resources that support price inquiry in Resource Orchestration Service (ROS) templates, see the &quot;<strong>Resource types that support price inquiry</strong>&quot; section of the <a href="https://help.aliyun.com/document_detail/203165.html">Estimate resource prices</a> topic.</li>
     * <li>For more information about the resources that support price inquiry in Terraform templates, see the &quot;<strong>ROS resources supported by Terraform</strong>&quot; section of the <a href="https://help.aliyun.com/document_detail/184389.html">ROS features and resources supported by Terraform</a> topic.
     * The following sample code provides an example on how to query the estimated price of an elastic IP address (EIP) that you want to create based on a template. In this example, the following template is used:</li>
     * </ul>
     * <pre><code>{
     *   &quot;ROSTemplateFormatVersion&quot;: &quot;2015-09-01&quot;,
     *   &quot;Parameters&quot;: {
     *     &quot;Isp&quot;: {
     *       &quot;Type&quot;: &quot;String&quot;,
     *       &quot;Default&quot;: &quot;BGP&quot;
     *     },
     *     &quot;Name&quot;: {
     *       &quot;Type&quot;: &quot;String&quot;,
     *       &quot;Default&quot;: &quot;test&quot;
     *     },
     *     &quot;Netmode&quot;: {
     *       &quot;Type&quot;: &quot;String&quot;,
     *       &quot;Default&quot;: &quot;public&quot;
     *     },
     *     &quot;Bandwidth&quot;: {
     *       &quot;Type&quot;: &quot;Number&quot;,
     *       &quot;Default&quot;: 5
     *     }
     *   },
     *   &quot;Resources&quot;: {
     *     &quot;NewEip&quot;: {
     *       &quot;Type&quot;: &quot;ALIYUN::VPC::EIP&quot;,
     *       &quot;Properties&quot;: {
     *         &quot;InstanceChargeType&quot;: &quot;Prepaid&quot;,
     *         &quot;PricingCycle&quot;: &quot;Month&quot;,
     *         &quot;Isp&quot;: {
     *           &quot;Ref&quot;: &quot;Isp&quot;
     *         },
     *         &quot;Period&quot;: 1,
     *         &quot;DeletionProtection&quot;: false,
     *         &quot;AutoPay&quot;: false,
     *         &quot;Name&quot;: {
     *           &quot;Ref&quot;: &quot;Name&quot;
     *         },
     *         &quot;InternetChargeType&quot;: &quot;PayByTraffic&quot;,
     *         &quot;Netmode&quot;: {
     *           &quot;Ref&quot;: &quot;Netmode&quot;
     *         },
     *         &quot;Bandwidth&quot;: {
     *           &quot;Ref&quot;: &quot;Bandwidth&quot;
     *         }
     *       }
     *     }
     *   }
     * }
     * </code></pre>
     * 
     * <b>summary</b> : 
     * <p>Queries the estimated prices of the resources in a template.</p>
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
     * <b>description</b> :
     * <h3></h3>
     * <ul>
     * <li>For more information about the resources that support price inquiry in Resource Orchestration Service (ROS) templates, see the &quot;<strong>Resource types that support price inquiry</strong>&quot; section of the <a href="https://help.aliyun.com/document_detail/203165.html">Estimate resource prices</a> topic.</li>
     * <li>For more information about the resources that support price inquiry in Terraform templates, see the &quot;<strong>ROS resources supported by Terraform</strong>&quot; section of the <a href="https://help.aliyun.com/document_detail/184389.html">ROS features and resources supported by Terraform</a> topic.
     * The following sample code provides an example on how to query the estimated price of an elastic IP address (EIP) that you want to create based on a template. In this example, the following template is used:</li>
     * </ul>
     * <pre><code>{
     *   &quot;ROSTemplateFormatVersion&quot;: &quot;2015-09-01&quot;,
     *   &quot;Parameters&quot;: {
     *     &quot;Isp&quot;: {
     *       &quot;Type&quot;: &quot;String&quot;,
     *       &quot;Default&quot;: &quot;BGP&quot;
     *     },
     *     &quot;Name&quot;: {
     *       &quot;Type&quot;: &quot;String&quot;,
     *       &quot;Default&quot;: &quot;test&quot;
     *     },
     *     &quot;Netmode&quot;: {
     *       &quot;Type&quot;: &quot;String&quot;,
     *       &quot;Default&quot;: &quot;public&quot;
     *     },
     *     &quot;Bandwidth&quot;: {
     *       &quot;Type&quot;: &quot;Number&quot;,
     *       &quot;Default&quot;: 5
     *     }
     *   },
     *   &quot;Resources&quot;: {
     *     &quot;NewEip&quot;: {
     *       &quot;Type&quot;: &quot;ALIYUN::VPC::EIP&quot;,
     *       &quot;Properties&quot;: {
     *         &quot;InstanceChargeType&quot;: &quot;Prepaid&quot;,
     *         &quot;PricingCycle&quot;: &quot;Month&quot;,
     *         &quot;Isp&quot;: {
     *           &quot;Ref&quot;: &quot;Isp&quot;
     *         },
     *         &quot;Period&quot;: 1,
     *         &quot;DeletionProtection&quot;: false,
     *         &quot;AutoPay&quot;: false,
     *         &quot;Name&quot;: {
     *           &quot;Ref&quot;: &quot;Name&quot;
     *         },
     *         &quot;InternetChargeType&quot;: &quot;PayByTraffic&quot;,
     *         &quot;Netmode&quot;: {
     *           &quot;Ref&quot;: &quot;Netmode&quot;
     *         },
     *         &quot;Bandwidth&quot;: {
     *           &quot;Ref&quot;: &quot;Bandwidth&quot;
     *         }
     *       }
     *     }
     *   }
     * }
     * </code></pre>
     * 
     * <b>summary</b> : 
     * <p>Queries the estimated prices of the resources in a template.</p>
     * 
     * @param request GetTemplateEstimateCostRequest
     * @return GetTemplateEstimateCostResponse
     */
    public GetTemplateEstimateCostResponse getTemplateEstimateCost(GetTemplateEstimateCostRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTemplateEstimateCostWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Description</h3>
     * <p>This topic provides an example of how to query the valid values for the <code>ZoneInfo</code> parameter in a template specific to the China (Hangzhou) region. The template is <code>{ &quot;ROSTemplateFormatVersion&quot;: &quot;2015-09-01&quot;, &quot;Parameters&quot;: { &quot;ZoneInfo&quot;: { &quot;Type&quot;: &quot;String&quot; }, &quot;InstanceType&quot;: { &quot;Type&quot;: &quot;String&quot; } }, &quot;Resources&quot;: { &quot;ECS&quot;: { &quot;Type&quot;: &quot;ALIYUN::ECS::Instance&quot;, &quot;Properties&quot;: { &quot;ZoneId&quot;: { &quot;Ref&quot;: &quot;ZoneInfo&quot; }, &quot;InstanceType&quot;: { &quot;Ref&quot;: &quot;InstanceType&quot; } } } } }</code>.
     * For more information about the queryable parameters and template content, refer to <a href="https://help.aliyun.com/document_detail/432820.html">Query parameter constraints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the valid values of the parameters in a template.</p>
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
     * <b>description</b> :
     * <h3>Description</h3>
     * <p>This topic provides an example of how to query the valid values for the <code>ZoneInfo</code> parameter in a template specific to the China (Hangzhou) region. The template is <code>{ &quot;ROSTemplateFormatVersion&quot;: &quot;2015-09-01&quot;, &quot;Parameters&quot;: { &quot;ZoneInfo&quot;: { &quot;Type&quot;: &quot;String&quot; }, &quot;InstanceType&quot;: { &quot;Type&quot;: &quot;String&quot; } }, &quot;Resources&quot;: { &quot;ECS&quot;: { &quot;Type&quot;: &quot;ALIYUN::ECS::Instance&quot;, &quot;Properties&quot;: { &quot;ZoneId&quot;: { &quot;Ref&quot;: &quot;ZoneInfo&quot; }, &quot;InstanceType&quot;: { &quot;Ref&quot;: &quot;InstanceType&quot; } } } } }</code>.
     * For more information about the queryable parameters and template content, refer to <a href="https://help.aliyun.com/document_detail/432820.html">Query parameter constraints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the valid values of the parameters in a template.</p>
     * 
     * @param request GetTemplateParameterConstraintsRequest
     * @return GetTemplateParameterConstraintsResponse
     */
    public GetTemplateParameterConstraintsResponse getTemplateParameterConstraints(GetTemplateParameterConstraintsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTemplateParameterConstraintsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>推荐参数</p>
     * 
     * @param request GetTemplateRecommendParametersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTemplateRecommendParametersResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>推荐参数</p>
     * 
     * @param request GetTemplateRecommendParametersRequest
     * @return GetTemplateRecommendParametersResponse
     */
    public GetTemplateRecommendParametersResponse getTemplateRecommendParameters(GetTemplateRecommendParametersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTemplateRecommendParametersWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example of how to query the details of the resource scenario <code>ts-7f7a704cf71c49a6****</code> in the China (Hangzhou) region and display source node data.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the details of a resource scenario.</p>
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
     * <b>description</b> :
     * <p>This topic provides an example of how to query the details of the resource scenario <code>ts-7f7a704cf71c49a6****</code> in the China (Hangzhou) region and display source node data.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the details of a resource scenario.</p>
     * 
     * @param request GetTemplateScratchRequest
     * @return GetTemplateScratchResponse
     */
    public GetTemplateScratchResponse getTemplateScratch(GetTemplateScratchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTemplateScratchWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a template resource by using the relevant template, stack, stack group, or change set.</p>
     * 
     * @param request GetTemplateSummaryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTemplateSummaryResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a template resource by using the relevant template, stack, stack group, or change set.</p>
     * 
     * @param request GetTemplateSummaryRequest
     * @return GetTemplateSummaryResponse
     */
    public GetTemplateSummaryResponse getTemplateSummary(GetTemplateSummaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTemplateSummaryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Import stacks from multiple different accounts into a stack group.</p>
     * 
     * @param tmpReq ImportStacksToStackGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ImportStacksToStackGroupResponse
     */
    public ImportStacksToStackGroupResponse importStacksToStackGroupWithOptions(ImportStacksToStackGroupRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ImportStacksToStackGroupShrinkRequest request = new ImportStacksToStackGroupShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.operationPreferences)) {
            request.operationPreferencesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.operationPreferences, "OperationPreferences", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.resourceDirectoryFolderIds)) {
            request.resourceDirectoryFolderIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.resourceDirectoryFolderIds, "ResourceDirectoryFolderIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.stackArns)) {
            request.stackArnsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.stackArns, "StackArns", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceDirectoryFolderIdsShrink)) {
            query.put("ResourceDirectoryFolderIds", request.resourceDirectoryFolderIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stackArnsShrink)) {
            query.put("StackArns", request.stackArnsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stackGroupName)) {
            query.put("StackGroupName", request.stackGroupName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ImportStacksToStackGroup"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ImportStacksToStackGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Import stacks from multiple different accounts into a stack group.</p>
     * 
     * @param request ImportStacksToStackGroupRequest
     * @return ImportStacksToStackGroupResponse
     */
    public ImportStacksToStackGroupResponse importStacksToStackGroup(ImportStacksToStackGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.importStacksToStackGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the events of an AI task.</p>
     * 
     * @param request ListAITaskEventsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAITaskEventsResponse
     */
    public ListAITaskEventsResponse listAITaskEventsWithOptions(ListAITaskEventsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAITaskEvents"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAITaskEventsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the events of an AI task.</p>
     * 
     * @param request ListAITaskEventsRequest
     * @return ListAITaskEventsResponse
     */
    public ListAITaskEventsResponse listAITaskEvents(ListAITaskEventsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAITaskEventsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of AI tasks.</p>
     * 
     * @param request ListAITasksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAITasksResponse
     */
    public ListAITasksResponse listAITasksWithOptions(ListAITasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            query.put("TaskType", request.taskType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAITasks"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAITasksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of AI tasks.</p>
     * 
     * @param request ListAITasksRequest
     * @return ListAITasksResponse
     */
    public ListAITasksResponse listAITasks(ListAITasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAITasksWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of created change sets.</p>
     * 
     * @param request ListChangeSetsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListChangeSetsResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries the details of created change sets.</p>
     * 
     * @param request ListChangeSetsRequest
     * @return ListChangeSetsResponse
     */
    public ListChangeSetsResponse listChangeSets(ListChangeSetsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listChangeSetsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>When calling the V2 service, set the <code>AgentVersion</code> parameter to <code>V2</code>.</li>
     * <li>This operation only accepts the <code>SessionId</code> of the current user\&quot;s session. It does not directly return a message array. Instead, it returns pre-signed download URLs for <code>session.jsonl</code> and <code>a2a-snapshot.json</code>.</li>
     * <li>The download URLs are valid for 1800 seconds (30 minutes). Complete the download within the validity period.</li>
     * <li>The URLs in the response contain signature parameters. Do not log, share, or cache them for extended periods.</li>
     * <li><code>MaxResults</code> and <code>NextToken</code> are compatibility fields that are not consumed in V2.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the message history and Pipeline snapshot temporary download URL for a specified session by session ID.</p>
     * 
     * @param request ListChatMessagesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListChatMessagesResponse
     */
    public ListChatMessagesResponse listChatMessagesWithOptions(ListChatMessagesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentVersion)) {
            query.put("AgentVersion", request.agentVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            query.put("SessionId", request.sessionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListChatMessages"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListChatMessagesResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>When calling the V2 service, set the <code>AgentVersion</code> parameter to <code>V2</code>.</li>
     * <li>This operation only accepts the <code>SessionId</code> of the current user\&quot;s session. It does not directly return a message array. Instead, it returns pre-signed download URLs for <code>session.jsonl</code> and <code>a2a-snapshot.json</code>.</li>
     * <li>The download URLs are valid for 1800 seconds (30 minutes). Complete the download within the validity period.</li>
     * <li>The URLs in the response contain signature parameters. Do not log, share, or cache them for extended periods.</li>
     * <li><code>MaxResults</code> and <code>NextToken</code> are compatibility fields that are not consumed in V2.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the message history and Pipeline snapshot temporary download URL for a specified session by session ID.</p>
     * 
     * @param request ListChatMessagesRequest
     * @return ListChatMessagesResponse
     */
    public ListChatMessagesResponse listChatMessages(ListChatMessagesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listChatMessagesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>Set <code>AgentVersion</code> to <code>V2</code> when calling the V2 service.</li>
     * <li>This operation returns only sessions of the current user, sorted by <code>UpdatedAt</code> in descending order by default.</li>
     * <li>Use the <code>Mode</code> parameter to filter sessions by mode. Valid values: <code>IaCCodeNormal</code> and <code>IaCCodePipeline</code>.</li>
     * <li>Do not reuse an old <code>NextToken</code> after switching <code>Mode</code>.</li>
     * <li>Use the <code>CreatedAt</code> and <code>UpdatedAt</code> fields for time information. The <code>UpdatedTime</code> field in the metadata is a compatibility field and is not returned in the current response.</li>
     * <li>Set the <code>MaxResults</code> request parameter to specify the number of entries per page. Valid values: 1 to 100.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the ROS Agent V2 session list of the current user by paging.</p>
     * 
     * @param request ListChatSessionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListChatSessionsResponse
     */
    public ListChatSessionsResponse listChatSessionsWithOptions(ListChatSessionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentVersion)) {
            query.put("AgentVersion", request.agentVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mode)) {
            query.put("Mode", request.mode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListChatSessions"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListChatSessionsResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>Set <code>AgentVersion</code> to <code>V2</code> when calling the V2 service.</li>
     * <li>This operation returns only sessions of the current user, sorted by <code>UpdatedAt</code> in descending order by default.</li>
     * <li>Use the <code>Mode</code> parameter to filter sessions by mode. Valid values: <code>IaCCodeNormal</code> and <code>IaCCodePipeline</code>.</li>
     * <li>Do not reuse an old <code>NextToken</code> after switching <code>Mode</code>.</li>
     * <li>Use the <code>CreatedAt</code> and <code>UpdatedAt</code> fields for time information. The <code>UpdatedTime</code> field in the metadata is a compatibility field and is not returned in the current response.</li>
     * <li>Set the <code>MaxResults</code> request parameter to specify the number of entries per page. Valid values: 1 to 100.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the ROS Agent V2 session list of the current user by paging.</p>
     * 
     * @param request ListChatSessionsRequest
     * @return ListChatSessionsResponse
     */
    public ListChatSessionsResponse listChatSessions(ListChatSessionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listChatSessionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a diagnostic report.</p>
     * 
     * @param request ListDiagnosticsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDiagnosticsResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries a diagnostic report.</p>
     * 
     * @param request ListDiagnosticsRequest
     * @return ListDiagnosticsResponse
     */
    public ListDiagnosticsResponse listDiagnostics(ListDiagnosticsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDiagnosticsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of resource registration records.</p>
     * 
     * @param request ListResourceTypeRegistrationsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListResourceTypeRegistrationsResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries a list of resource registration records.</p>
     * 
     * @param request ListResourceTypeRegistrationsRequest
     * @return ListResourceTypeRegistrationsResponse
     */
    public ListResourceTypeRegistrationsResponse listResourceTypeRegistrations(ListResourceTypeRegistrationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listResourceTypeRegistrationsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of resource type versions, including resource types created by the user and those provided by Resource Orchestration Service (ROS).</p>
     * 
     * @param request ListResourceTypeVersionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListResourceTypeVersionsResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries the list of resource type versions, including resource types created by the user and those provided by Resource Orchestration Service (ROS).</p>
     * 
     * @param request ListResourceTypeVersionsRequest
     * @return ListResourceTypeVersionsResponse
     */
    public ListResourceTypeVersionsResponse listResourceTypeVersions(ListResourceTypeVersionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listResourceTypeVersionsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example of how to query the list of regular resource types supported by ROS.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of supported resource types.</p>
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
     * <b>description</b> :
     * <p>This topic provides an example of how to query the list of regular resource types supported by ROS.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of supported resource types.</p>
     * 
     * @param request ListResourceTypesRequest
     * @return ListResourceTypesResponse
     */
    public ListResourceTypesResponse listResourceTypes(ListResourceTypesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listResourceTypesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries events of a stack and the resources in the stack.</p>
     * 
     * @param request ListStackEventsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListStackEventsResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries events of a stack and the resources in the stack.</p>
     * 
     * @param request ListStackEventsRequest
     * @return ListStackEventsResponse
     */
    public ListStackEventsResponse listStackEvents(ListStackEventsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listStackEventsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>In this example, the operation ID <code>6da106ca-1784-4a6f-a7e1-e723863d∗∗∗∗</code> is set to query the results of an operation on a stack group named <code>MyStackGroup</code>. The stack group is granted self-managed permissions and created in the China (Hangzhou) region.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the results of an operation on a stack group.</p>
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
     * <b>description</b> :
     * <p>In this example, the operation ID <code>6da106ca-1784-4a6f-a7e1-e723863d∗∗∗∗</code> is set to query the results of an operation on a stack group named <code>MyStackGroup</code>. The stack group is granted self-managed permissions and created in the China (Hangzhou) region.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the results of an operation on a stack group.</p>
     * 
     * @param request ListStackGroupOperationResultsRequest
     * @return ListStackGroupOperationResultsResponse
     */
    public ListStackGroupOperationResultsResponse listStackGroupOperationResults(ListStackGroupOperationResultsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listStackGroupOperationResultsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about stack group operations in an Alibaba Cloud region.</p>
     * 
     * @param request ListStackGroupOperationsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListStackGroupOperationsResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries the information about stack group operations in an Alibaba Cloud region.</p>
     * 
     * @param request ListStackGroupOperationsRequest
     * @return ListStackGroupOperationsResponse
     */
    public ListStackGroupOperationsResponse listStackGroupOperations(ListStackGroupOperationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listStackGroupOperationsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This example queries stack groups in the ACTIVE state in the China (Hangzhou) region.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries stack groups in a region.</p>
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
     * <b>description</b> :
     * <p>This example queries stack groups in the ACTIVE state in the China (Hangzhou) region.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries stack groups in a region.</p>
     * 
     * @param request ListStackGroupsRequest
     * @return ListStackGroupsResponse
     */
    public ListStackGroupsResponse listStackGroups(ListStackGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listStackGroupsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>In this example, the list of stack instances that are associated with a stack group named <code>MyStackGroup</code> is queried. The stack group is granted self-managed permissions and deployed in the China (Hangzhou) region.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of stack instances that are associated with a stack group in an Alibaba Cloud region.</p>
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
     * <b>description</b> :
     * <p>In this example, the list of stack instances that are associated with a stack group named <code>MyStackGroup</code> is queried. The stack group is granted self-managed permissions and deployed in the China (Hangzhou) region.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of stack instances that are associated with a stack group in an Alibaba Cloud region.</p>
     * 
     * @param request ListStackInstancesRequest
     * @return ListStackInstancesResponse
     */
    public ListStackInstancesResponse listStackInstances(ListStackInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listStackInstancesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The ListStackOperationRisks operation is suitable for the following scenarios:</p>
     * <ul>
     * <li>You want to detect high risks that may arise in resources when you delete a stack that contains the resources, and query the cause of each risk in a resource.</li>
     * <li>When you create a stack, the creation may fail. In this case, you can call this operation to check which types of permissions that are required to create stacks are missing.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Detects stack-related operation risks and returns missing permissions and the causes of the risks.</p>
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
     * <b>description</b> :
     * <p>The ListStackOperationRisks operation is suitable for the following scenarios:</p>
     * <ul>
     * <li>You want to detect high risks that may arise in resources when you delete a stack that contains the resources, and query the cause of each risk in a resource.</li>
     * <li>When you create a stack, the creation may fail. In this case, you can call this operation to check which types of permissions that are required to create stacks are missing.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Detects stack-related operation risks and returns missing permissions and the causes of the risks.</p>
     * 
     * @param request ListStackOperationRisksRequest
     * @return ListStackOperationRisksResponse
     */
    public ListStackOperationRisksResponse listStackOperationRisks(ListStackOperationRisksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listStackOperationRisksWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>The query token. Set this parameter to the NextToken value returned in the last API call.</p>
     * 
     * @param request ListStackResourceDriftsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListStackResourceDriftsResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>The query token. Set this parameter to the NextToken value returned in the last API call.</p>
     * 
     * @param request ListStackResourceDriftsRequest
     * @return ListStackResourceDriftsResponse
     */
    public ListStackResourceDriftsResponse listStackResourceDrifts(ListStackResourceDriftsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listStackResourceDriftsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the resources in a stack whose ID is <code>4a6c9851-3b0f-4f5f-b4ca-a14bf691****</code> in the China (Hangzhou) region.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the resources in a specified stack.</p>
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
     * <b>description</b> :
     * <p>This topic provides an example on how to query the resources in a stack whose ID is <code>4a6c9851-3b0f-4f5f-b4ca-a14bf691****</code> in the China (Hangzhou) region.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the resources in a specified stack.</p>
     * 
     * @param request ListStackResourcesRequest
     * @return ListStackResourcesResponse
     */
    public ListStackResourcesResponse listStackResources(ListStackResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listStackResourcesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Operation description</h3>
     * <p>This topic provides an example of how to query the list of stacks in the China (Hangzhou) region.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of stacks.</p>
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
     * <b>description</b> :
     * <h3>Operation description</h3>
     * <p>This topic provides an example of how to query the list of stacks in the China (Hangzhou) region.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of stacks.</p>
     * 
     * @param request ListStacksRequest
     * @return ListStacksResponse
     */
    public ListStacksResponse listStacks(ListStacksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listStacksWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>This topic provides an example of how to query a list of stacks in the China (Hangzhou) region.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries for an overview.</p>
     * 
     * @param request ListSummariesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSummariesResponse
     */
    public ListSummariesResponse listSummariesWithOptions(ListSummariesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.option)) {
            query.put("Option", request.option);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSummaries"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSummariesResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>This topic provides an example of how to query a list of stacks in the China (Hangzhou) region.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries for an overview.</p>
     * 
     * @param request ListSummariesRequest
     * @return ListSummariesResponse
     */
    public ListSummariesResponse listSummaries(ListSummariesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSummariesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example of how to query the tag keys that are attached to a stack in the China (Hangzhou) region.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the tag keys for stacks or templates in a specified region.</p>
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
     * <b>description</b> :
     * <p>This topic provides an example of how to query the tag keys that are attached to a stack in the China (Hangzhou) region.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the tag keys for stacks or templates in a specified region.</p>
     * 
     * @param request ListTagKeysRequest
     * @return ListTagKeysResponse
     */
    public ListTagKeysResponse listTagKeys(ListTagKeysRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagKeysWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3></h3>
     * <ul>
     * <li>To specify the query object, specify ResourceId or Tag in the request. Tag consists of Key and Value.</li>
     * <li>If you specify Tag and ResourceId, ROS resources that match both the parameters are returned.
     * This topic provides an example on how to query the tags that are added to a stack. In this example, the stack ID is <code>6bc589b5-9c02-4944-8fc3-f3624234****</code>. The stack is deployed in the China (Hangzhou) region.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the tags that are added to resources in a template or stack in an Alibaba Cloud region.</p>
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
     * <b>description</b> :
     * <h3></h3>
     * <ul>
     * <li>To specify the query object, specify ResourceId or Tag in the request. Tag consists of Key and Value.</li>
     * <li>If you specify Tag and ResourceId, ROS resources that match both the parameters are returned.
     * This topic provides an example on how to query the tags that are added to a stack. In this example, the stack ID is <code>6bc589b5-9c02-4944-8fc3-f3624234****</code>. The stack is deployed in the China (Hangzhou) region.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the tags that are added to resources in a template or stack in an Alibaba Cloud region.</p>
     * 
     * @param request ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>In this example, the tag values of <code>TagKey1</code> that is added to a stack in the China (Hangzhou) region are queried.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the tag values that are added to resources in a template or stack in an Alibaba Cloud region.</p>
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
     * <b>description</b> :
     * <p>In this example, the tag values of <code>TagKey1</code> that is added to a stack in the China (Hangzhou) region are queried.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the tag values that are added to resources in a template or stack in an Alibaba Cloud region.</p>
     * 
     * @param request ListTagValuesRequest
     * @return ListTagValuesResponse
     */
    public ListTagValuesResponse listTagValues(ListTagValuesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagValuesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example of how to query the list of resource scenarios in the China (Hangzhou) region. The response shows that there are two resource scenarios in the China (Hangzhou) region: resource management and resource replication.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of resource scenarios.</p>
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
     * <b>description</b> :
     * <p>This topic provides an example of how to query the list of resource scenarios in the China (Hangzhou) region. The response shows that there are two resource scenarios in the China (Hangzhou) region: resource management and resource replication.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of resource scenarios.</p>
     * 
     * @param request ListTemplateScratchesRequest
     * @return ListTemplateScratchesResponse
     */
    public ListTemplateScratchesResponse listTemplateScratches(ListTemplateScratchesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTemplateScratchesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of versions of a template.</p>
     * 
     * @param request ListTemplateVersionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTemplateVersionsResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries the list of versions of a template.</p>
     * 
     * @param request ListTemplateVersionsRequest
     * @return ListTemplateVersionsResponse
     */
    public ListTemplateVersionsResponse listTemplateVersions(ListTemplateVersionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTemplateVersionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of private and shared templates.</p>
     * 
     * @param request ListTemplatesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTemplatesResponse
     */
    public ListTemplatesResponse listTemplatesWithOptions(ListTemplatesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filters)) {
            query.put("Filters", request.filters);
        }

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

    /**
     * <b>summary</b> : 
     * <p>Queries a list of private and shared templates.</p>
     * 
     * @param request ListTemplatesRequest
     * @return ListTemplatesResponse
     */
    public ListTemplatesResponse listTemplates(ListTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTemplatesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>In this example, a stack deployed in the <code>China (Hangzhou)</code> region is moved to a specific resource group. The ID of the stack is <code>4e8611cb-251e-42b7-b9cb-3496362c****</code> and the ID of the resource group is <code>rg-acfm3peow3k****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Moves a resource to a specific resource group.</p>
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
     * <b>description</b> :
     * <p>In this example, a stack deployed in the <code>China (Hangzhou)</code> region is moved to a specific resource group. The ID of the stack is <code>4e8611cb-251e-42b7-b9cb-3496362c****</code> and the ID of the resource group is <code>rg-acfm3peow3k****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Moves a resource to a specific resource group.</p>
     * 
     * @param request MoveResourceGroupRequest
     * @return MoveResourceGroupResponse
     */
    public MoveResourceGroupResponse moveResourceGroup(MoveResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.moveResourceGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>In this example, a stack named <code>MyStack</code> is created in the China (Hangzhou) region and previewed. The <code>TemplateBody</code> parameter of the stack is set to <code>{&quot;ROSTemplateFormatVersion&quot;:&quot;2015-09-01&quot;}</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Previews the information about a stack that you want to create or update based on a template. You can call this operation to verify whether the template resources are valid.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.taintResources)) {
            query.put("TaintResources", request.taintResources);
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
     * <b>description</b> :
     * <p>In this example, a stack named <code>MyStack</code> is created in the China (Hangzhou) region and previewed. The <code>TemplateBody</code> parameter of the stack is set to <code>{&quot;ROSTemplateFormatVersion&quot;:&quot;2015-09-01&quot;}</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Previews the information about a stack that you want to create or update based on a template. You can call this operation to verify whether the template resources are valid.</p>
     * 
     * @param request PreviewStackRequest
     * @return PreviewStackResponse
     */
    public PreviewStackResponse previewStack(PreviewStackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.previewStackWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Versions increase from v1.</li>
     * <li>If you create a new resource type, v1 is used as the default version of the resource type. You can call the SetResourceType operation to change the default version of a resource type.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a new resource type, or creates a new version for an existing resource type.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>Versions increase from v1.</li>
     * <li>If you create a new resource type, v1 is used as the default version of the resource type. You can call the SetResourceType operation to change the default version of a resource type.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a new resource type, or creates a new version for an existing resource type.</p>
     * 
     * @param request RegisterResourceTypeRequest
     * @return RegisterResourceTypeResponse
     */
    public RegisterResourceTypeResponse registerResourceType(RegisterResourceTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.registerResourceTypeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the deletion protection setting for a stack.</p>
     * 
     * @param request SetDeletionProtectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetDeletionProtectionResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Modifies the deletion protection setting for a stack.</p>
     * 
     * @param request SetDeletionProtectionRequest
     * @return SetDeletionProtectionResponse
     */
    public SetDeletionProtectionResponse setDeletionProtection(SetDeletionProtectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setDeletionProtectionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the description of a resource type or a version of that type.</p>
     * 
     * @param request SetResourceTypeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetResourceTypeResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Modifies the description of a resource type or a version of that type.</p>
     * 
     * @param request SetResourceTypeRequest
     * @return SetResourceTypeResponse
     */
    public SetResourceTypeResponse setResourceType(SetResourceTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setResourceTypeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>In this example, a stack policy is configured for a stack deployed in the <code>China (Hangzhou)</code> region whose ID is <code>4a6c9851-3b0f-4f5f-b4ca-a14bf691****</code>. The URL to the stack policy body is <code>oss://ros/stack-policy/demo</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Configures a stack policy for a stack.</p>
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
     * <b>description</b> :
     * <p>In this example, a stack policy is configured for a stack deployed in the <code>China (Hangzhou)</code> region whose ID is <code>4a6c9851-3b0f-4f5f-b4ca-a14bf691****</code>. The URL to the stack policy body is <code>oss://ros/stack-policy/demo</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Configures a stack policy for a stack.</p>
     * 
     * @param request SetStackPolicyRequest
     * @return SetStackPolicyResponse
     */
    public SetStackPolicyResponse setStackPolicy(SetStackPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setStackPolicyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>In this example, the template whose ID is <code>5ecd1e10-b0e9-4389-a565-e4c15efc****</code> is shared with an Alibaba Cloud account. The ID of the Alibaba Cloud account is <code>151266687691****</code>.</p>
     * <blockquote>
     * <p>The recipient Alibaba Cloud account (ID: <code>151266687691****</code>) can authorize RAM users to use the shared template.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Shares or unshares a template.</p>
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
     * <b>description</b> :
     * <p>In this example, the template whose ID is <code>5ecd1e10-b0e9-4389-a565-e4c15efc****</code> is shared with an Alibaba Cloud account. The ID of the Alibaba Cloud account is <code>151266687691****</code>.</p>
     * <blockquote>
     * <p>The recipient Alibaba Cloud account (ID: <code>151266687691****</code>) can authorize RAM users to use the shared template.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Shares or unshares a template.</p>
     * 
     * @param request SetTemplatePermissionRequest
     * @return SetTemplatePermissionResponse
     */
    public SetTemplatePermissionResponse setTemplatePermission(SetTemplatePermissionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setTemplatePermissionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Sends a signal to a resource in a stack.</p>
     * 
     * @param request SignalResourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SignalResourceResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Sends a signal to a resource in a stack.</p>
     * 
     * @param request SignalResourceRequest
     * @return SignalResourceResponse
     */
    public SignalResourceResponse signalResource(SignalResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.signalResourceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>When calling this API, ensure that <code>AgentVersion</code> is set to <code>V2</code>.</li>
     * <li>If <code>SessionId</code> is not provided, a new session is created. If <code>SessionId</code> is provided, the existing session is continued.</li>
     * <li>The default value of <code>Mode</code> is <code>IaCCodeNormal</code>. Only <code>IaCCodeNormal</code> and <code>IaCCodePipeline</code> modes are supported. An existing session cannot switch modes.</li>
     * <li><code>EnableThinking</code> defaults to <code>true</code>, which specifies whether to output thinking content. This can be reset in each request.</li>
     * <li>A maximum of 5 image attachments are supported. Each attachment can be up to 5 MiB and must be accessed through an OssObjectKey under the current user directory.</li>
     * <li><code>ClientContext</code> is a page context JSON string with a maximum size of 16 KiB. It is valid only in <code>IaCCodeNormal</code> mode.</li>
     * <li>The response type is <code>text/event-stream</code>. A successful HTTP connection does not indicate that the operation is complete. Continue reading SSE events until a terminal state is reached.</li>
     * <li>When the <code>TASK_STATE_INPUT_REQUIRED</code> status is received, it indicates that user input is required. This is not a failure state.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Returns agent events through SSE streaming. Supports creating a new session or continuing an existing session.</p>
     * 
     * @param request StartChatRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartChatResponse
     */
    public StartChatResponse startChatWithOptions(StartChatRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentVersion)) {
            query.put("AgentVersion", request.agentVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.attachments)) {
            query.put("Attachments", request.attachments);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enablePartialMessage)) {
            query.put("EnablePartialMessage", request.enablePartialMessage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableThinking)) {
            query.put("EnableThinking", request.enableThinking);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mode)) {
            query.put("Mode", request.mode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            query.put("Query", request.query);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            query.put("SessionId", request.sessionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartChat"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "string")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartChatResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>When calling this API, ensure that <code>AgentVersion</code> is set to <code>V2</code>.</li>
     * <li>If <code>SessionId</code> is not provided, a new session is created. If <code>SessionId</code> is provided, the existing session is continued.</li>
     * <li>The default value of <code>Mode</code> is <code>IaCCodeNormal</code>. Only <code>IaCCodeNormal</code> and <code>IaCCodePipeline</code> modes are supported. An existing session cannot switch modes.</li>
     * <li><code>EnableThinking</code> defaults to <code>true</code>, which specifies whether to output thinking content. This can be reset in each request.</li>
     * <li>A maximum of 5 image attachments are supported. Each attachment can be up to 5 MiB and must be accessed through an OssObjectKey under the current user directory.</li>
     * <li><code>ClientContext</code> is a page context JSON string with a maximum size of 16 KiB. It is valid only in <code>IaCCodeNormal</code> mode.</li>
     * <li>The response type is <code>text/event-stream</code>. A successful HTTP connection does not indicate that the operation is complete. Continue reading SSE events until a terminal state is reached.</li>
     * <li>When the <code>TASK_STATE_INPUT_REQUIRED</code> status is received, it indicates that user input is required. This is not a failure state.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Returns agent events through SSE streaming. Supports creating a new session or continuing an existing session.</p>
     * 
     * @param request StartChatRequest
     * @return StartChatResponse
     */
    public StartChatResponse startChat(StartChatRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startChatWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>When calling this operation, ensure that <code>AgentVersion</code> is set to <code>V2</code> to route to the correct backend service.</li>
     * <li><code>SessionId</code> is required to identify the specific session to stop.</li>
     * <li>In a multi-process environment, if the target session is within the calling process, a cancel signal is sent directly and the system waits for cleanup to complete. If the session is managed by another process, a cancel request is sent to the remote end through the persisted active session state, and a <code>Stopping</code> status is returned immediately.</li>
     * <li>When no active task exists, the API returns the <code>NoActiveStream</code> status code, which is not considered an error condition.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Stops a running task in a specified ROS Agent V2 session.</p>
     * 
     * @param request StopChatRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopChatResponse
     */
    public StopChatResponse stopChatWithOptions(StopChatRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentVersion)) {
            query.put("AgentVersion", request.agentVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            query.put("SessionId", request.sessionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopChat"),
            new TeaPair("version", "2019-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopChatResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>When calling this operation, ensure that <code>AgentVersion</code> is set to <code>V2</code> to route to the correct backend service.</li>
     * <li><code>SessionId</code> is required to identify the specific session to stop.</li>
     * <li>In a multi-process environment, if the target session is within the calling process, a cancel signal is sent directly and the system waits for cleanup to complete. If the session is managed by another process, a cancel request is sent to the remote end through the persisted active session state, and a <code>Stopping</code> status is returned immediately.</li>
     * <li>When no active task exists, the API returns the <code>NoActiveStream</code> status code, which is not considered an error condition.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Stops a running task in a specified ROS Agent V2 session.</p>
     * 
     * @param request StopChatRequest
     * @return StopChatResponse
     */
    public StopChatResponse stopChat(StopChatRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopChatWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This example stops the stack group operation <code>6da106ca-1784-4a6f-a7e1-e723863****</code> in the China (Hangzhou) region.</p>
     * 
     * <b>summary</b> : 
     * <p>Stops an ongoing operation in a stack group.</p>
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
     * <b>description</b> :
     * <p>This example stops the stack group operation <code>6da106ca-1784-4a6f-a7e1-e723863****</code> in the China (Hangzhou) region.</p>
     * 
     * <b>summary</b> : 
     * <p>Stops an ongoing operation in a stack group.</p>
     * 
     * @param request StopStackGroupOperationRequest
     * @return StopStackGroupOperationResponse
     */
    public StopStackGroupOperationResponse stopStackGroupOperation(StopStackGroupOperationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopStackGroupOperationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example of how to create and add a tag to a resource stack in China (Hangzhou) region. The resource stack ID is <code>7fee80e1-8c48-4c2f-8300-0f6dc40b****</code>, with the tag key of <code>FinanceDept</code> and the tag value of <code>FinanceJoshua</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates and adds tags to resources.</p>
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
     * <b>description</b> :
     * <p>This topic provides an example of how to create and add a tag to a resource stack in China (Hangzhou) region. The resource stack ID is <code>7fee80e1-8c48-4c2f-8300-0f6dc40b****</code>, with the tag key of <code>FinanceDept</code> and the tag value of <code>FinanceJoshua</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates and adds tags to resources.</p>
     * 
     * @param request TagResourcesRequest
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to remove all tags from a stack that is deployed in the China (Hangzhou) region. In this example, the stack ID is <code>46ec7b78-9d5e-4b21-aefd-448c90aa****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Removes tags from resources and then deletes the tags.</p>
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
     * <b>description</b> :
     * <p>This topic provides an example on how to remove all tags from a stack that is deployed in the China (Hangzhou) region. In this example, the stack ID is <code>46ec7b78-9d5e-4b21-aefd-448c90aa****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Removes tags from resources and then deletes the tags.</p>
     * 
     * @param request UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.untagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The values of Parameters and UsePreviousParameters are related. If a parameter defined in the template is not specified in Parameters:  </p>
     * <ul>
     * <li>If UsePreviousParameters is set to false: the default value of the parameter in the template is used if available. If no default value exists, you must specify the parameter in Parameters.  </li>
     * <li>If UsePreviousParameters is set to true: if the parameter was specified when the stack was created, the specified value is used. If the parameter was not specified when the stack was created and the parameter has a default value in the template, the default value is used.</li>
     * </ul>
     * <p>This topic provides an example to show how to update the template content of a stack in the China (Beijing) region to <code>{&quot;ROSTemplateFormatVersion&quot;: &quot;2015-09-01&quot;}</code>. The stack ID is <code>4a6c9851-3b0f-4f5f-b4ca-a14bf691****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the resource information of a created stack.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.taintResources)) {
            query.put("TaintResources", request.taintResources);
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
     * <b>description</b> :
     * <p>The values of Parameters and UsePreviousParameters are related. If a parameter defined in the template is not specified in Parameters:  </p>
     * <ul>
     * <li>If UsePreviousParameters is set to false: the default value of the parameter in the template is used if available. If no default value exists, you must specify the parameter in Parameters.  </li>
     * <li>If UsePreviousParameters is set to true: if the parameter was specified when the stack was created, the specified value is used. If the parameter was not specified when the stack was created and the parameter has a default value in the template, the default value is used.</li>
     * </ul>
     * <p>This topic provides an example to show how to update the template content of a stack in the China (Beijing) region to <code>{&quot;ROSTemplateFormatVersion&quot;: &quot;2015-09-01&quot;}</code>. The stack ID is <code>4a6c9851-3b0f-4f5f-b4ca-a14bf691****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the resource information of a created stack.</p>
     * 
     * @param request UpdateStackRequest
     * @return UpdateStackResponse
     */
    public UpdateStackResponse updateStack(UpdateStackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateStackWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example of how to update the template of the stack group <code>MyStackGroup</code> to <code>{&quot;ROSTemplateFormatVersion&quot;: &quot;2015-09-01&quot;}</code>. The stack group is in the China (Hangzhou) region and uses self-managed permissions.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates an existing stack group.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.deploymentOptions)) {
            query.put("DeploymentOptions", request.deploymentOptions);
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
     * <b>description</b> :
     * <p>This topic provides an example of how to update the template of the stack group <code>MyStackGroup</code> to <code>{&quot;ROSTemplateFormatVersion&quot;: &quot;2015-09-01&quot;}</code>. The stack group is in the China (Hangzhou) region and uses self-managed permissions.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates an existing stack group.</p>
     * 
     * @param request UpdateStackGroupRequest
     * @return UpdateStackGroupResponse
     */
    public UpdateStackGroupResponse updateStackGroup(UpdateStackGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateStackGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example of how to update stacks for the stack group <code>MyStackGroup</code>, which is in the China (Hangzhou) region and uses self-managed permissions. The stacks are updated for the Alibaba Cloud accounts <code>151266687691****</code> and <code>141261387191****</code> in the China (Hangzhou) and China (Beijing) regions.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates stack instances for one or more accounts in specified regions.</p>
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
     * <b>description</b> :
     * <p>This topic provides an example of how to update stacks for the stack group <code>MyStackGroup</code>, which is in the China (Hangzhou) region and uses self-managed permissions. The stacks are updated for the Alibaba Cloud accounts <code>151266687691****</code> and <code>141261387191****</code> in the China (Hangzhou) and China (Beijing) regions.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates stack instances for one or more accounts in specified regions.</p>
     * 
     * @param request UpdateStackInstancesRequest
     * @return UpdateStackInstancesResponse
     */
    public UpdateStackInstancesResponse updateStackInstances(UpdateStackInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateStackInstancesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Limits: You can eliminate only drift on stacks that have drifted. You must call the <a href="https://help.aliyun.com/document_detail/155094.html">DetectStackDrift</a> operation to perform drift detection on a stack, call the <a href="https://help.aliyun.com/document_detail/155097.html">GetStackDriftDetectionStatus</a> operation to query the drift status of the stack to make sure that the stack has drifted, and then call the UpdateStackTemplateByResources operation to eliminate drift.
     * In this topic, drift is eliminated for a stack whose ID is <code>4a6c9851-3b0f-4f5f-b4ca-a14bf691****</code>. The stack is deployed in the China (Hangzhou) region.</p>
     * 
     * <b>summary</b> : 
     * <p>Eliminates stack drifts by performing drift detection.</p>
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
     * <b>description</b> :
     * <p>Limits: You can eliminate only drift on stacks that have drifted. You must call the <a href="https://help.aliyun.com/document_detail/155094.html">DetectStackDrift</a> operation to perform drift detection on a stack, call the <a href="https://help.aliyun.com/document_detail/155097.html">GetStackDriftDetectionStatus</a> operation to query the drift status of the stack to make sure that the stack has drifted, and then call the UpdateStackTemplateByResources operation to eliminate drift.
     * In this topic, drift is eliminated for a stack whose ID is <code>4a6c9851-3b0f-4f5f-b4ca-a14bf691****</code>. The stack is deployed in the China (Hangzhou) region.</p>
     * 
     * <b>summary</b> : 
     * <p>Eliminates stack drifts by performing drift detection.</p>
     * 
     * @param request UpdateStackTemplateByResourcesRequest
     * @return UpdateStackTemplateByResourcesResponse
     */
    public UpdateStackTemplateByResourcesResponse updateStackTemplateByResources(UpdateStackTemplateByResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateStackTemplateByResourcesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>When updating a template, please note:</p>
     * <ul>
     * <li>If you specify <code>TemplateBody</code> or <code>TemplateURL</code>, the template version will be incremented by 1 after a successful update. For example, the version changes from v1 to v2.</li>
     * <li>If neither <code>TemplateBody</code> nor <code>TemplateURL</code> is specified, the template version remains unchanged.</li>
     * <li>A template can have up to 100 versions. If the version limit is reached, the template update will fail, and you need to recreate the template.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Update Template</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.isDraft)) {
            query.put("IsDraft", request.isDraft);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rotateStrategy)) {
            query.put("RotateStrategy", request.rotateStrategy);
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

        if (!com.aliyun.teautil.Common.isUnset(request.validationOptions)) {
            query.put("ValidationOptions", request.validationOptions);
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
     * <b>description</b> :
     * <p>When updating a template, please note:</p>
     * <ul>
     * <li>If you specify <code>TemplateBody</code> or <code>TemplateURL</code>, the template version will be incremented by 1 after a successful update. For example, the version changes from v1 to v2.</li>
     * <li>If neither <code>TemplateBody</code> nor <code>TemplateURL</code> is specified, the template version remains unchanged.</li>
     * <li>A template can have up to 100 versions. If the version limit is reached, the template update will fail, and you need to recreate the template.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Update Template</p>
     * 
     * @param request UpdateTemplateRequest
     * @return UpdateTemplateResponse
     */
    public UpdateTemplateResponse updateTemplate(UpdateTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateTemplateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Resource replication scenario</h3>
     * <p>Resource Orchestration Service (ROS) allows you to update a resource replication scenario. The updates that you make to a resource replication scenario do not affect the stack that is generated by using the resource scenario. You can call the <a href="https://help.aliyun.com/document_detail/610829.html">GenerateTemplateByScratch</a> operation to generate a template for the resource scenario.</p>
     * <h3><a href="#"></a>Resource migration scenario</h3>
     * <ul>
     * <li>If you want to update a resource migration scenario in which the migrated source resources are retained, you can delete the source resources to manage the updated resource migration scenario. You can also call the <a href="https://help.aliyun.com/document_detail/610829.html">GenerateTemplateByScratch</a> operation to generate a template for the resource scenario.
     * \<em>\</em>
     * <strong>Note</strong> Make sure that the source resources that you want to delete from a resource migration scenario are associated only with the resource scenario. Otherwise, the source resources fail to be deleted.</li>
     * <li>If you want to update a resource migration scenario in which the migrated source resources are deleted, you can only call the <a href="https://help.aliyun.com/document_detail/610829.html">GenerateTemplateByScratch</a> operation to generate a template for the resource scenario.</li>
     * </ul>
     * <h3><a href="#"></a>Resource management scenario</h3>
     * <p>If you want to update a resource management scenario after you use the resource scenario to manage resources, you can only call the <a href="https://help.aliyun.com/document_detail/610829.html">GenerateTemplateByScratch</a> operation to generate a template for the resource scenario.</p>
     * <h3><a href="#"></a>Resource detection scenario</h3>
     * <p>After you update a resource detection scenario, ROS obtains the most recent data from Resource Center and renders the architecture diagram.
     * This topic provides an example on how to update a resource scenario. In this example, the ID of a virtual private cloud (VPC) in a resource scenario whose ID is <code>ts-7f7a704cf71c49a6****</code> is updated to <code>vpc-bp1m6fww66xbntjyc****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a scenario.</p>
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
     * <b>description</b> :
     * <h3><a href="#"></a>Resource replication scenario</h3>
     * <p>Resource Orchestration Service (ROS) allows you to update a resource replication scenario. The updates that you make to a resource replication scenario do not affect the stack that is generated by using the resource scenario. You can call the <a href="https://help.aliyun.com/document_detail/610829.html">GenerateTemplateByScratch</a> operation to generate a template for the resource scenario.</p>
     * <h3><a href="#"></a>Resource migration scenario</h3>
     * <ul>
     * <li>If you want to update a resource migration scenario in which the migrated source resources are retained, you can delete the source resources to manage the updated resource migration scenario. You can also call the <a href="https://help.aliyun.com/document_detail/610829.html">GenerateTemplateByScratch</a> operation to generate a template for the resource scenario.
     * \<em>\</em>
     * <strong>Note</strong> Make sure that the source resources that you want to delete from a resource migration scenario are associated only with the resource scenario. Otherwise, the source resources fail to be deleted.</li>
     * <li>If you want to update a resource migration scenario in which the migrated source resources are deleted, you can only call the <a href="https://help.aliyun.com/document_detail/610829.html">GenerateTemplateByScratch</a> operation to generate a template for the resource scenario.</li>
     * </ul>
     * <h3><a href="#"></a>Resource management scenario</h3>
     * <p>If you want to update a resource management scenario after you use the resource scenario to manage resources, you can only call the <a href="https://help.aliyun.com/document_detail/610829.html">GenerateTemplateByScratch</a> operation to generate a template for the resource scenario.</p>
     * <h3><a href="#"></a>Resource detection scenario</h3>
     * <p>After you update a resource detection scenario, ROS obtains the most recent data from Resource Center and renders the architecture diagram.
     * This topic provides an example on how to update a resource scenario. In this example, the ID of a virtual private cloud (VPC) in a resource scenario whose ID is <code>ts-7f7a704cf71c49a6****</code> is updated to <code>vpc-bp1m6fww66xbntjyc****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a scenario.</p>
     * 
     * @param request UpdateTemplateScratchRequest
     * @return UpdateTemplateScratchResponse
     */
    public UpdateTemplateScratchResponse updateTemplateScratch(UpdateTemplateScratchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateTemplateScratchWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API operation validates only templates and does not involve user data. RAM authentication is not required.
     * This topic provides an example of how to validate a stack template. In this example, the <code>TemplateURL</code> of the template file is <code>oss://ros/template/demo</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Validates a template that is used to create a stack by specifying template URL or body.</p>
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
     * <b>description</b> :
     * <p>This API operation validates only templates and does not involve user data. RAM authentication is not required.
     * This topic provides an example of how to validate a stack template. In this example, the <code>TemplateURL</code> of the template file is <code>oss://ros/template/demo</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Validates a template that is used to create a stack by specifying template URL or body.</p>
     * 
     * @param request ValidateTemplateRequest
     * @return ValidateTemplateResponse
     */
    public ValidateTemplateResponse validateTemplate(ValidateTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.validateTemplateWithOptions(request, runtime);
    }
}
