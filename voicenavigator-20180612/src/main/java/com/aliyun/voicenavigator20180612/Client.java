// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612;

import com.aliyun.tea.*;
import com.aliyun.voicenavigator20180612.models.*;
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
        this._endpoint = this.getEndpoint("voicenavigator", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AssociateChatbotInstanceResponse associateChatbotInstanceWithOptions(AssociateChatbotInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AssociateChatbotInstance", "2018-06-12", "HTTPS", "POST", "AK", "json", req, runtime), new AssociateChatbotInstanceResponse());
    }

    public AssociateChatbotInstanceResponse associateChatbotInstance(AssociateChatbotInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.associateChatbotInstanceWithOptions(request, runtime);
    }

    public AuditTTSVoiceResponse auditTTSVoiceWithOptions(AuditTTSVoiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AuditTTSVoice", "2018-06-12", "HTTPS", "POST", "AK", "json", req, runtime), new AuditTTSVoiceResponse());
    }

    public AuditTTSVoiceResponse auditTTSVoice(AuditTTSVoiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.auditTTSVoiceWithOptions(request, runtime);
    }

    public BeginDialogueResponse beginDialogueWithOptions(BeginDialogueRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BeginDialogue", "2018-06-12", "HTTPS", "POST", "AK", "json", req, runtime), new BeginDialogueResponse());
    }

    public BeginDialogueResponse beginDialogue(BeginDialogueRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.beginDialogueWithOptions(request, runtime);
    }

    public CollectedNumberResponse collectedNumberWithOptions(CollectedNumberRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CollectedNumber", "2018-06-12", "HTTPS", "POST", "AK", "json", req, runtime), new CollectedNumberResponse());
    }

    public CollectedNumberResponse collectedNumber(CollectedNumberRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.collectedNumberWithOptions(request, runtime);
    }

    public CreateInstanceResponse createInstanceWithOptions(CreateInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateInstance", "2018-06-12", "HTTPS", "POST", "AK", "json", req, runtime), new CreateInstanceResponse());
    }

    public CreateInstanceResponse createInstance(CreateInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createInstanceWithOptions(request, runtime);
    }

    public DebugBeginDialogueResponse debugBeginDialogueWithOptions(DebugBeginDialogueRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DebugBeginDialogue", "2018-06-12", "HTTPS", "POST", "AK", "json", req, runtime), new DebugBeginDialogueResponse());
    }

    public DebugBeginDialogueResponse debugBeginDialogue(DebugBeginDialogueRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.debugBeginDialogueWithOptions(request, runtime);
    }

    public DebugCollectedNumberResponse debugCollectedNumberWithOptions(DebugCollectedNumberRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DebugCollectedNumber", "2018-06-12", "HTTPS", "POST", "AK", "json", req, runtime), new DebugCollectedNumberResponse());
    }

    public DebugCollectedNumberResponse debugCollectedNumber(DebugCollectedNumberRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.debugCollectedNumberWithOptions(request, runtime);
    }

    public DebugDialogueResponse debugDialogueWithOptions(DebugDialogueRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DebugDialogue", "2018-06-12", "HTTPS", "POST", "AK", "json", req, runtime), new DebugDialogueResponse());
    }

    public DebugDialogueResponse debugDialogue(DebugDialogueRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.debugDialogueWithOptions(request, runtime);
    }

    public DeleteInstanceResponse deleteInstanceWithOptions(DeleteInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteInstance", "2018-06-12", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteInstanceResponse());
    }

    public DeleteInstanceResponse deleteInstance(DeleteInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteInstanceWithOptions(request, runtime);
    }

    public DescribeConversationResponse describeConversationWithOptions(DescribeConversationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeConversation", "2018-06-12", "HTTPS", "GET", "AK", "json", req, runtime), new DescribeConversationResponse());
    }

    public DescribeConversationResponse describeConversation(DescribeConversationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeConversationWithOptions(request, runtime);
    }

    public DescribeConversationContextResponse describeConversationContextWithOptions(DescribeConversationContextRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeConversationContext", "2018-06-12", "HTTPS", "GET", "AK", "json", req, runtime), new DescribeConversationContextResponse());
    }

    public DescribeConversationContextResponse describeConversationContext(DescribeConversationContextRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeConversationContextWithOptions(request, runtime);
    }

    public DescribeExportProgressResponse describeExportProgressWithOptions(DescribeExportProgressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeExportProgress", "2018-06-12", "HTTPS", "GET", "AK", "json", req, runtime), new DescribeExportProgressResponse());
    }

    public DescribeExportProgressResponse describeExportProgress(DescribeExportProgressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeExportProgressWithOptions(request, runtime);
    }

    public DescribeInstanceResponse describeInstanceWithOptions(DescribeInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeInstance", "2018-06-12", "HTTPS", "GET", "AK", "json", req, runtime), new DescribeInstanceResponse());
    }

    public DescribeInstanceResponse describeInstance(DescribeInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstanceWithOptions(request, runtime);
    }

    public DescribeNavigationConfigResponse describeNavigationConfigWithOptions(DescribeNavigationConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeNavigationConfig", "2018-06-12", "HTTPS", "GET", "AK", "json", req, runtime), new DescribeNavigationConfigResponse());
    }

    public DescribeNavigationConfigResponse describeNavigationConfig(DescribeNavigationConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeNavigationConfigWithOptions(request, runtime);
    }

    public DescribeRecordingResponse describeRecordingWithOptions(DescribeRecordingRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRecording", "2018-06-12", "HTTPS", "GET", "AK", "json", req, runtime), new DescribeRecordingResponse());
    }

    public DescribeRecordingResponse describeRecording(DescribeRecordingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRecordingWithOptions(request, runtime);
    }

    public DescribeStatisticalDataResponse describeStatisticalDataWithOptions(DescribeStatisticalDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeStatisticalData", "2018-06-12", "HTTPS", "GET", "AK", "json", req, runtime), new DescribeStatisticalDataResponse());
    }

    public DescribeStatisticalDataResponse describeStatisticalData(DescribeStatisticalDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeStatisticalDataWithOptions(request, runtime);
    }

    public DescribeTTSConfigResponse describeTTSConfigWithOptions(DescribeTTSConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeTTSConfig", "2018-06-12", "HTTPS", "GET", "AK", "json", req, runtime), new DescribeTTSConfigResponse());
    }

    public DescribeTTSConfigResponse describeTTSConfig(DescribeTTSConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeTTSConfigWithOptions(request, runtime);
    }

    public DialogueResponse dialogueWithOptions(DialogueRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("Dialogue", "2018-06-12", "HTTPS", "POST", "AK", "json", req, runtime), new DialogueResponse());
    }

    public DialogueResponse dialogue(DialogueRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.dialogueWithOptions(request, runtime);
    }

    public DisableInstanceResponse disableInstanceWithOptions(DisableInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DisableInstance", "2018-06-12", "HTTPS", "POST", "AK", "json", req, runtime), new DisableInstanceResponse());
    }

    public DisableInstanceResponse disableInstance(DisableInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.disableInstanceWithOptions(request, runtime);
    }

    public EnableInstanceResponse enableInstanceWithOptions(EnableInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("EnableInstance", "2018-06-12", "HTTPS", "POST", "AK", "json", req, runtime), new EnableInstanceResponse());
    }

    public EnableInstanceResponse enableInstance(EnableInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.enableInstanceWithOptions(request, runtime);
    }

    public EndDialogueResponse endDialogueWithOptions(EndDialogueRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("EndDialogue", "2018-06-12", "HTTPS", "POST", "AK", "json", req, runtime), new EndDialogueResponse());
    }

    public EndDialogueResponse endDialogue(EndDialogueRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.endDialogueWithOptions(request, runtime);
    }

    public ExportConversationDetailsResponse exportConversationDetailsWithOptions(ExportConversationDetailsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ExportConversationDetails", "2018-06-12", "HTTPS", "POST", "AK", "json", req, runtime), new ExportConversationDetailsResponse());
    }

    public ExportConversationDetailsResponse exportConversationDetails(ExportConversationDetailsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.exportConversationDetailsWithOptions(request, runtime);
    }

    public ExportStatisticalDataResponse exportStatisticalDataWithOptions(ExportStatisticalDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ExportStatisticalData", "2018-06-12", "HTTPS", "POST", "AK", "json", req, runtime), new ExportStatisticalDataResponse());
    }

    public ExportStatisticalDataResponse exportStatisticalData(ExportStatisticalDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.exportStatisticalDataWithOptions(request, runtime);
    }

    public ListChatbotInstancesResponse listChatbotInstancesWithOptions(ListChatbotInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListChatbotInstances", "2018-06-12", "HTTPS", "GET", "AK", "json", req, runtime), new ListChatbotInstancesResponse());
    }

    public ListChatbotInstancesResponse listChatbotInstances(ListChatbotInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listChatbotInstancesWithOptions(request, runtime);
    }

    public ListConversationDetailsResponse listConversationDetailsWithOptions(ListConversationDetailsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListConversationDetails", "2018-06-12", "HTTPS", "GET", "AK", "json", req, runtime), new ListConversationDetailsResponse());
    }

    public ListConversationDetailsResponse listConversationDetails(ListConversationDetailsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listConversationDetailsWithOptions(request, runtime);
    }

    public ListConversationsResponse listConversationsWithOptions(ListConversationsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListConversations", "2018-06-12", "HTTPS", "GET", "AK", "json", req, runtime), new ListConversationsResponse());
    }

    public ListConversationsResponse listConversations(ListConversationsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listConversationsWithOptions(request, runtime);
    }

    public ListInstancesResponse listInstancesWithOptions(ListInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListInstances", "2018-06-12", "HTTPS", "GET", "AK", "json", req, runtime), new ListInstancesResponse());
    }

    public ListInstancesResponse listInstances(ListInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listInstancesWithOptions(request, runtime);
    }

    public ModifyGreetingConfigResponse modifyGreetingConfigWithOptions(ModifyGreetingConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyGreetingConfig", "2018-06-12", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyGreetingConfigResponse());
    }

    public ModifyGreetingConfigResponse modifyGreetingConfig(ModifyGreetingConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyGreetingConfigWithOptions(request, runtime);
    }

    public ModifyInstanceResponse modifyInstanceWithOptions(ModifyInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyInstance", "2018-06-12", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyInstanceResponse());
    }

    public ModifyInstanceResponse modifyInstance(ModifyInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyInstanceWithOptions(request, runtime);
    }

    public ModifySilenceTimeoutConfigResponse modifySilenceTimeoutConfigWithOptions(ModifySilenceTimeoutConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifySilenceTimeoutConfig", "2018-06-12", "HTTPS", "POST", "AK", "json", req, runtime), new ModifySilenceTimeoutConfigResponse());
    }

    public ModifySilenceTimeoutConfigResponse modifySilenceTimeoutConfig(ModifySilenceTimeoutConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifySilenceTimeoutConfigWithOptions(request, runtime);
    }

    public ModifyTTSConfigResponse modifyTTSConfigWithOptions(ModifyTTSConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyTTSConfig", "2018-06-12", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyTTSConfigResponse());
    }

    public ModifyTTSConfigResponse modifyTTSConfig(ModifyTTSConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyTTSConfigWithOptions(request, runtime);
    }

    public ModifyUnrecognizingConfigResponse modifyUnrecognizingConfigWithOptions(ModifyUnrecognizingConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyUnrecognizingConfig", "2018-06-12", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyUnrecognizingConfigResponse());
    }

    public ModifyUnrecognizingConfigResponse modifyUnrecognizingConfig(ModifyUnrecognizingConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyUnrecognizingConfigWithOptions(request, runtime);
    }

    public QueryConversationsResponse queryConversationsWithOptions(QueryConversationsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryConversations", "2018-06-12", "HTTPS", "GET", "AK", "json", req, runtime), new QueryConversationsResponse());
    }

    public QueryConversationsResponse queryConversations(QueryConversationsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryConversationsWithOptions(request, runtime);
    }

    public SaveRecordingResponse saveRecordingWithOptions(SaveRecordingRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SaveRecording", "2018-06-12", "HTTPS", "POST", "AK", "json", req, runtime), new SaveRecordingResponse());
    }

    public SaveRecordingResponse saveRecording(SaveRecordingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveRecordingWithOptions(request, runtime);
    }

    public SilenceTimeoutResponse silenceTimeoutWithOptions(SilenceTimeoutRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SilenceTimeout", "2018-06-12", "HTTPS", "POST", "AK", "json", req, runtime), new SilenceTimeoutResponse());
    }

    public SilenceTimeoutResponse silenceTimeout(SilenceTimeoutRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.silenceTimeoutWithOptions(request, runtime);
    }
}
