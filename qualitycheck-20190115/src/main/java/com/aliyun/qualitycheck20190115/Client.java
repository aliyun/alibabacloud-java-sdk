// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115;

import com.aliyun.tea.*;
import com.aliyun.qualitycheck20190115.models.*;
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
        this._endpoint = this.getEndpoint("qualitycheck", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AddBusinessCategoryResponse addBusinessCategoryWithOptions(AddBusinessCategoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddBusinessCategory", "2019-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new AddBusinessCategoryResponse());
    }

    public AddBusinessCategoryResponse addBusinessCategory(AddBusinessCategoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addBusinessCategoryWithOptions(request, runtime);
    }

    public AddRuleCategoryResponse addRuleCategoryWithOptions(AddRuleCategoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddRuleCategory", "2019-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new AddRuleCategoryResponse());
    }

    public AddRuleCategoryResponse addRuleCategory(AddRuleCategoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addRuleCategoryWithOptions(request, runtime);
    }

    public AddThesaurusForApiResponse addThesaurusForApiWithOptions(AddThesaurusForApiRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddThesaurusForApi", "2019-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new AddThesaurusForApiResponse());
    }

    public AddThesaurusForApiResponse addThesaurusForApi(AddThesaurusForApiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addThesaurusForApiWithOptions(request, runtime);
    }

    public AddUploadDataSetResponse addUploadDataSetWithOptions(AddUploadDataSetRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddUploadDataSet", "2019-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new AddUploadDataSetResponse());
    }

    public AddUploadDataSetResponse addUploadDataSet(AddUploadDataSetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addUploadDataSetWithOptions(request, runtime);
    }

    public AssignReviewerResponse assignReviewerWithOptions(AssignReviewerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AssignReviewer", "2019-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new AssignReviewerResponse());
    }

    public AssignReviewerResponse assignReviewer(AssignReviewerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.assignReviewerWithOptions(request, runtime);
    }

    public ConfigDataSetResponse configDataSetWithOptions(ConfigDataSetRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ConfigDataSet", "2019-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new ConfigDataSetResponse());
    }

    public ConfigDataSetResponse configDataSet(ConfigDataSetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.configDataSetWithOptions(request, runtime);
    }

    public CreateAsrVocabResponse createAsrVocabWithOptions(CreateAsrVocabRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateAsrVocab", "2019-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new CreateAsrVocabResponse());
    }

    public CreateAsrVocabResponse createAsrVocab(CreateAsrVocabRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAsrVocabWithOptions(request, runtime);
    }

    public CreateRuleResponse createRuleWithOptions(CreateRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateRule", "2019-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new CreateRuleResponse());
    }

    public CreateRuleResponse createRule(CreateRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createRuleWithOptions(request, runtime);
    }

    public CreateSkillGroupConfigResponse createSkillGroupConfigWithOptions(CreateSkillGroupConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateSkillGroupConfig", "2019-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new CreateSkillGroupConfigResponse());
    }

    public CreateSkillGroupConfigResponse createSkillGroupConfig(CreateSkillGroupConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSkillGroupConfigWithOptions(request, runtime);
    }

    public CreateTaskAssignRuleResponse createTaskAssignRuleWithOptions(CreateTaskAssignRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateTaskAssignRule", "2019-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new CreateTaskAssignRuleResponse());
    }

    public CreateTaskAssignRuleResponse createTaskAssignRule(CreateTaskAssignRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createTaskAssignRuleWithOptions(request, runtime);
    }

    public CreateUserResponse createUserWithOptions(CreateUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateUser", "2019-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new CreateUserResponse());
    }

    public CreateUserResponse createUser(CreateUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createUserWithOptions(request, runtime);
    }

    public CreateWarningConfigResponse createWarningConfigWithOptions(CreateWarningConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateWarningConfig", "2019-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new CreateWarningConfigResponse());
    }

    public CreateWarningConfigResponse createWarningConfig(CreateWarningConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createWarningConfigWithOptions(request, runtime);
    }

    public DeleteAsrVocabResponse deleteAsrVocabWithOptions(DeleteAsrVocabRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteAsrVocab", "2019-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteAsrVocabResponse());
    }

    public DeleteAsrVocabResponse deleteAsrVocab(DeleteAsrVocabRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAsrVocabWithOptions(request, runtime);
    }

    public DeleteBusinessCategoryResponse deleteBusinessCategoryWithOptions(DeleteBusinessCategoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteBusinessCategory", "2019-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteBusinessCategoryResponse());
    }

    public DeleteBusinessCategoryResponse deleteBusinessCategory(DeleteBusinessCategoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteBusinessCategoryWithOptions(request, runtime);
    }

    public DeleteCustomizationConfigResponse deleteCustomizationConfigWithOptions(DeleteCustomizationConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteCustomizationConfig", "2019-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteCustomizationConfigResponse());
    }

    public DeleteCustomizationConfigResponse deleteCustomizationConfig(DeleteCustomizationConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteCustomizationConfigWithOptions(request, runtime);
    }

    public DeleteDataSetResponse deleteDataSetWithOptions(DeleteDataSetRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteDataSet", "2019-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteDataSetResponse());
    }

    public DeleteDataSetResponse deleteDataSet(DeleteDataSetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDataSetWithOptions(request, runtime);
    }

    public DeletePrecisionTaskResponse deletePrecisionTaskWithOptions(DeletePrecisionTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeletePrecisionTask", "2019-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new DeletePrecisionTaskResponse());
    }

    public DeletePrecisionTaskResponse deletePrecisionTask(DeletePrecisionTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deletePrecisionTaskWithOptions(request, runtime);
    }

    public DeleteScoreForApiResponse deleteScoreForApiWithOptions(DeleteScoreForApiRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteScoreForApi", "2019-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteScoreForApiResponse());
    }

    public DeleteScoreForApiResponse deleteScoreForApi(DeleteScoreForApiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteScoreForApiWithOptions(request, runtime);
    }

    public DeleteSkillGroupConfigResponse deleteSkillGroupConfigWithOptions(DeleteSkillGroupConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteSkillGroupConfig", "2019-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteSkillGroupConfigResponse());
    }

    public DeleteSkillGroupConfigResponse deleteSkillGroupConfig(DeleteSkillGroupConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteSkillGroupConfigWithOptions(request, runtime);
    }

    public DeleteSubScoreForApiResponse deleteSubScoreForApiWithOptions(DeleteSubScoreForApiRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteSubScoreForApi", "2019-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteSubScoreForApiResponse());
    }

    public DeleteSubScoreForApiResponse deleteSubScoreForApi(DeleteSubScoreForApiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteSubScoreForApiWithOptions(request, runtime);
    }

    public DeleteTaskAssignRuleResponse deleteTaskAssignRuleWithOptions(DeleteTaskAssignRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteTaskAssignRule", "2019-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteTaskAssignRuleResponse());
    }

    public DeleteTaskAssignRuleResponse deleteTaskAssignRule(DeleteTaskAssignRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteTaskAssignRuleWithOptions(request, runtime);
    }

    public DeleteUserResponse deleteUserWithOptions(DeleteUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteUser", "2019-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteUserResponse());
    }

    public DeleteUserResponse deleteUser(DeleteUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteUserWithOptions(request, runtime);
    }

    public DeleteWarningConfigResponse deleteWarningConfigWithOptions(DeleteWarningConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteWarningConfig", "2019-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteWarningConfigResponse());
    }

    public DeleteWarningConfigResponse deleteWarningConfig(DeleteWarningConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteWarningConfigWithOptions(request, runtime);
    }

    public DelRuleCategoryResponse delRuleCategoryWithOptions(DelRuleCategoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DelRuleCategory", "2019-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new DelRuleCategoryResponse());
    }

    public DelRuleCategoryResponse delRuleCategory(DelRuleCategoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.delRuleCategoryWithOptions(request, runtime);
    }

    public DelThesaurusForApiResponse delThesaurusForApiWithOptions(DelThesaurusForApiRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DelThesaurusForApi", "2019-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new DelThesaurusForApiResponse());
    }

    public DelThesaurusForApiResponse delThesaurusForApi(DelThesaurusForApiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.delThesaurusForApiWithOptions(request, runtime);
    }

    public EditThesaurusForApiResponse editThesaurusForApiWithOptions(EditThesaurusForApiRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("EditThesaurusForApi", "2019-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new EditThesaurusForApiResponse());
    }

    public EditThesaurusForApiResponse editThesaurusForApi(EditThesaurusForApiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.editThesaurusForApiWithOptions(request, runtime);
    }

    public GetAsrVocabResponse getAsrVocabWithOptions(GetAsrVocabRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAsrVocab", "2019-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new GetAsrVocabResponse());
    }

    public GetAsrVocabResponse getAsrVocab(GetAsrVocabRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAsrVocabWithOptions(request, runtime);
    }

    public GetBusinessCategoryListResponse getBusinessCategoryListWithOptions(GetBusinessCategoryListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetBusinessCategoryList", "2019-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new GetBusinessCategoryListResponse());
    }

    public GetBusinessCategoryListResponse getBusinessCategoryList(GetBusinessCategoryListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getBusinessCategoryListWithOptions(request, runtime);
    }

    public GetCustomizationConfigListResponse getCustomizationConfigListWithOptions(GetCustomizationConfigListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetCustomizationConfigList", "2019-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new GetCustomizationConfigListResponse());
    }

    public GetCustomizationConfigListResponse getCustomizationConfigList(GetCustomizationConfigListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getCustomizationConfigListWithOptions(request, runtime);
    }

    public GetHitResultResponse getHitResultWithOptions(GetHitResultRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetHitResult", "2019-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new GetHitResultResponse());
    }

    public GetHitResultResponse getHitResult(GetHitResultRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getHitResultWithOptions(request, runtime);
    }

    public GetNextResultToVerifyResponse getNextResultToVerifyWithOptions(GetNextResultToVerifyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetNextResultToVerify", "2019-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new GetNextResultToVerifyResponse());
    }

    public GetNextResultToVerifyResponse getNextResultToVerify(GetNextResultToVerifyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getNextResultToVerifyWithOptions(request, runtime);
    }

    public GetPrecisionTaskResponse getPrecisionTaskWithOptions(GetPrecisionTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetPrecisionTask", "2019-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new GetPrecisionTaskResponse());
    }

    public GetPrecisionTaskResponse getPrecisionTask(GetPrecisionTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getPrecisionTaskWithOptions(request, runtime);
    }

    public GetResultResponse getResultWithOptions(GetResultRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetResult", "2019-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new GetResultResponse());
    }

    public GetResultResponse getResult(GetResultRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getResultWithOptions(request, runtime);
    }

    public GetResultCallbackResponse getResultCallbackWithOptions(GetResultCallbackRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetResultCallback", "2019-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new GetResultCallbackResponse());
    }

    public GetResultCallbackResponse getResultCallback(GetResultCallbackRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getResultCallbackWithOptions(request, runtime);
    }

    public GetResultToReviewResponse getResultToReviewWithOptions(GetResultToReviewRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetResultToReview", "2019-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new GetResultToReviewResponse());
    }

    public GetResultToReviewResponse getResultToReview(GetResultToReviewRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getResultToReviewWithOptions(request, runtime);
    }

    public GetReviewInfoResponse getReviewInfoWithOptions(GetReviewInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetReviewInfo", "2019-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new GetReviewInfoResponse());
    }

    public GetReviewInfoResponse getReviewInfo(GetReviewInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getReviewInfoWithOptions(request, runtime);
    }

    public GetRuleResponse getRuleWithOptions(GetRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetRule", "2019-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new GetRuleResponse());
    }

    public GetRuleResponse getRule(GetRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getRuleWithOptions(request, runtime);
    }

    public GetRuleCategoryResponse getRuleCategoryWithOptions(GetRuleCategoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetRuleCategory", "2019-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new GetRuleCategoryResponse());
    }

    public GetRuleCategoryResponse getRuleCategory(GetRuleCategoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getRuleCategoryWithOptions(request, runtime);
    }

    public GetRuleDetailResponse getRuleDetailWithOptions(GetRuleDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetRuleDetail", "2019-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new GetRuleDetailResponse());
    }

    public GetRuleDetailResponse getRuleDetail(GetRuleDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getRuleDetailWithOptions(request, runtime);
    }

    public GetRuleDimensionResponse getRuleDimensionWithOptions(GetRuleDimensionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetRuleDimension", "2019-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new GetRuleDimensionResponse());
    }

    public GetRuleDimensionResponse getRuleDimension(GetRuleDimensionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getRuleDimensionWithOptions(request, runtime);
    }

    public GetScoreInfoResponse getScoreInfoWithOptions(GetScoreInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetScoreInfo", "2019-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new GetScoreInfoResponse());
    }

    public GetScoreInfoResponse getScoreInfo(GetScoreInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getScoreInfoWithOptions(request, runtime);
    }

    public GetSkillGroupConfigResponse getSkillGroupConfigWithOptions(GetSkillGroupConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetSkillGroupConfig", "2019-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new GetSkillGroupConfigResponse());
    }

    public GetSkillGroupConfigResponse getSkillGroupConfig(GetSkillGroupConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getSkillGroupConfigWithOptions(request, runtime);
    }

    public GetSyncResultResponse getSyncResultWithOptions(GetSyncResultRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetSyncResult", "2019-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new GetSyncResultResponse());
    }

    public GetSyncResultResponse getSyncResult(GetSyncResultRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getSyncResultWithOptions(request, runtime);
    }

    public GetTaskFileResultListResponse getTaskFileResultListWithOptions(GetTaskFileResultListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetTaskFileResultList", "2019-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new GetTaskFileResultListResponse());
    }

    public GetTaskFileResultListResponse getTaskFileResultList(GetTaskFileResultListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getTaskFileResultListWithOptions(request, runtime);
    }

    public GetTaskRuleListResponse getTaskRuleListWithOptions(GetTaskRuleListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetTaskRuleList", "2019-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new GetTaskRuleListResponse());
    }

    public GetTaskRuleListResponse getTaskRuleList(GetTaskRuleListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getTaskRuleListWithOptions(request, runtime);
    }

    public GetThesaurusBySynonymForApiResponse getThesaurusBySynonymForApiWithOptions(GetThesaurusBySynonymForApiRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetThesaurusBySynonymForApi", "2019-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new GetThesaurusBySynonymForApiResponse());
    }

    public GetThesaurusBySynonymForApiResponse getThesaurusBySynonymForApi(GetThesaurusBySynonymForApiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getThesaurusBySynonymForApiWithOptions(request, runtime);
    }

    public HandleComplaintResponse handleComplaintWithOptions(HandleComplaintRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("HandleComplaint", "2019-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new HandleComplaintResponse());
    }

    public HandleComplaintResponse handleComplaint(HandleComplaintRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.handleComplaintWithOptions(request, runtime);
    }

    public InsertScoreForApiResponse insertScoreForApiWithOptions(InsertScoreForApiRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("InsertScoreForApi", "2019-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new InsertScoreForApiResponse());
    }

    public InsertScoreForApiResponse insertScoreForApi(InsertScoreForApiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.insertScoreForApiWithOptions(request, runtime);
    }

    public InsertSubScoreForApiResponse insertSubScoreForApiWithOptions(InsertSubScoreForApiRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("InsertSubScoreForApi", "2019-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new InsertSubScoreForApiResponse());
    }

    public InsertSubScoreForApiResponse insertSubScoreForApi(InsertSubScoreForApiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.insertSubScoreForApiWithOptions(request, runtime);
    }

    public InvalidRuleResponse invalidRuleWithOptions(InvalidRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("InvalidRule", "2019-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new InvalidRuleResponse());
    }

    public InvalidRuleResponse invalidRule(InvalidRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.invalidRuleWithOptions(request, runtime);
    }

    public ListAsrVocabResponse listAsrVocabWithOptions(ListAsrVocabRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListAsrVocab", "2019-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new ListAsrVocabResponse());
    }

    public ListAsrVocabResponse listAsrVocab(ListAsrVocabRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAsrVocabWithOptions(request, runtime);
    }

    public ListDataSetTaskResponse listDataSetTaskWithOptions(ListDataSetTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListDataSetTask", "2019-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new ListDataSetTaskResponse());
    }

    public ListDataSetTaskResponse listDataSetTask(ListDataSetTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDataSetTaskWithOptions(request, runtime);
    }

    public ListHotWordsTasksResponse listHotWordsTasksWithOptions(ListHotWordsTasksRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListHotWordsTasks", "2019-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new ListHotWordsTasksResponse());
    }

    public ListHotWordsTasksResponse listHotWordsTasks(ListHotWordsTasksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listHotWordsTasksWithOptions(request, runtime);
    }

    public ListPrecisionTaskResponse listPrecisionTaskWithOptions(ListPrecisionTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListPrecisionTask", "2019-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new ListPrecisionTaskResponse());
    }

    public ListPrecisionTaskResponse listPrecisionTask(ListPrecisionTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listPrecisionTaskWithOptions(request, runtime);
    }

    public ListRolesResponse listRolesWithOptions(ListRolesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListRoles", "2019-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new ListRolesResponse());
    }

    public ListRolesResponse listRoles(ListRolesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listRolesWithOptions(request, runtime);
    }

    public ListRulesResponse listRulesWithOptions(ListRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListRules", "2019-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new ListRulesResponse());
    }

    public ListRulesResponse listRules(ListRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listRulesWithOptions(request, runtime);
    }

    public ListSkillGroupConfigResponse listSkillGroupConfigWithOptions(ListSkillGroupConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListSkillGroupConfig", "2019-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new ListSkillGroupConfigResponse());
    }

    public ListSkillGroupConfigResponse listSkillGroupConfig(ListSkillGroupConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listSkillGroupConfigWithOptions(request, runtime);
    }

    public ListTaskAssignRulesResponse listTaskAssignRulesWithOptions(ListTaskAssignRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListTaskAssignRules", "2019-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new ListTaskAssignRulesResponse());
    }

    public ListTaskAssignRulesResponse listTaskAssignRules(ListTaskAssignRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTaskAssignRulesWithOptions(request, runtime);
    }

    public ListUsersResponse listUsersWithOptions(ListUsersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListUsers", "2019-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new ListUsersResponse());
    }

    public ListUsersResponse listUsers(ListUsersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listUsersWithOptions(request, runtime);
    }

    public ListWarningConfigResponse listWarningConfigWithOptions(ListWarningConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListWarningConfig", "2019-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new ListWarningConfigResponse());
    }

    public ListWarningConfigResponse listWarningConfig(ListWarningConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listWarningConfigWithOptions(request, runtime);
    }

    public RemoveAndGetTaskRulesResponse removeAndGetTaskRulesWithOptions(RemoveAndGetTaskRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RemoveAndGetTaskRules", "2019-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new RemoveAndGetTaskRulesResponse());
    }

    public RemoveAndGetTaskRulesResponse removeAndGetTaskRules(RemoveAndGetTaskRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeAndGetTaskRulesWithOptions(request, runtime);
    }

    public RestartAsrTaskResponse restartAsrTaskWithOptions(RestartAsrTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RestartAsrTask", "2019-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new RestartAsrTaskResponse());
    }

    public RestartAsrTaskResponse restartAsrTask(RestartAsrTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.restartAsrTaskWithOptions(request, runtime);
    }

    public ReviewSingleResultByIdResponse reviewSingleResultByIdWithOptions(ReviewSingleResultByIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ReviewSingleResultById", "2019-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new ReviewSingleResultByIdResponse());
    }

    public ReviewSingleResultByIdResponse reviewSingleResultById(ReviewSingleResultByIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.reviewSingleResultByIdWithOptions(request, runtime);
    }

    public SaveConfigDataSetResponse saveConfigDataSetWithOptions(SaveConfigDataSetRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SaveConfigDataSet", "2019-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new SaveConfigDataSetResponse());
    }

    public SaveConfigDataSetResponse saveConfigDataSet(SaveConfigDataSetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveConfigDataSetWithOptions(request, runtime);
    }

    public SubmitComplaintResponse submitComplaintWithOptions(SubmitComplaintRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SubmitComplaint", "2019-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new SubmitComplaintResponse());
    }

    public SubmitComplaintResponse submitComplaint(SubmitComplaintRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitComplaintWithOptions(request, runtime);
    }

    public SubmitCustomizationConfigResponse submitCustomizationConfigWithOptions(SubmitCustomizationConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SubmitCustomizationConfig", "2019-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new SubmitCustomizationConfigResponse());
    }

    public SubmitCustomizationConfigResponse submitCustomizationConfig(SubmitCustomizationConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitCustomizationConfigWithOptions(request, runtime);
    }

    public SubmitPrecisionTaskResponse submitPrecisionTaskWithOptions(SubmitPrecisionTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SubmitPrecisionTask", "2019-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new SubmitPrecisionTaskResponse());
    }

    public SubmitPrecisionTaskResponse submitPrecisionTask(SubmitPrecisionTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitPrecisionTaskWithOptions(request, runtime);
    }

    public SubmitQualityCheckTaskResponse submitQualityCheckTaskWithOptions(SubmitQualityCheckTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SubmitQualityCheckTask", "2019-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new SubmitQualityCheckTaskResponse());
    }

    public SubmitQualityCheckTaskResponse submitQualityCheckTask(SubmitQualityCheckTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitQualityCheckTaskWithOptions(request, runtime);
    }

    public SubmitReviewInfoResponse submitReviewInfoWithOptions(SubmitReviewInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SubmitReviewInfo", "2019-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new SubmitReviewInfoResponse());
    }

    public SubmitReviewInfoResponse submitReviewInfo(SubmitReviewInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitReviewInfoWithOptions(request, runtime);
    }

    public SyncQualityCheckResponse syncQualityCheckWithOptions(SyncQualityCheckRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SyncQualityCheck", "2019-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new SyncQualityCheckResponse());
    }

    public SyncQualityCheckResponse syncQualityCheck(SyncQualityCheckRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.syncQualityCheckWithOptions(request, runtime);
    }

    public TestRuleResponse testRuleWithOptions(TestRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("TestRule", "2019-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new TestRuleResponse());
    }

    public TestRuleResponse testRule(TestRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.testRuleWithOptions(request, runtime);
    }

    public UpdateAsrVocabResponse updateAsrVocabWithOptions(UpdateAsrVocabRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateAsrVocab", "2019-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateAsrVocabResponse());
    }

    public UpdateAsrVocabResponse updateAsrVocab(UpdateAsrVocabRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateAsrVocabWithOptions(request, runtime);
    }

    public UpdateOnPurchaseSuccessResponse updateOnPurchaseSuccessWithOptions(UpdateOnPurchaseSuccessRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateOnPurchaseSuccess", "2019-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateOnPurchaseSuccessResponse());
    }

    public UpdateOnPurchaseSuccessResponse updateOnPurchaseSuccess(UpdateOnPurchaseSuccessRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateOnPurchaseSuccessWithOptions(request, runtime);
    }

    public UpdateRuleResponse updateRuleWithOptions(UpdateRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateRule", "2019-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateRuleResponse());
    }

    public UpdateRuleResponse updateRule(UpdateRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateRuleWithOptions(request, runtime);
    }

    public UpdateScoreForApiResponse updateScoreForApiWithOptions(UpdateScoreForApiRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateScoreForApi", "2019-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateScoreForApiResponse());
    }

    public UpdateScoreForApiResponse updateScoreForApi(UpdateScoreForApiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateScoreForApiWithOptions(request, runtime);
    }

    public UpdateSkillGroupConfigResponse updateSkillGroupConfigWithOptions(UpdateSkillGroupConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateSkillGroupConfig", "2019-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateSkillGroupConfigResponse());
    }

    public UpdateSkillGroupConfigResponse updateSkillGroupConfig(UpdateSkillGroupConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateSkillGroupConfigWithOptions(request, runtime);
    }

    public UpdateSubScoreForApiResponse updateSubScoreForApiWithOptions(UpdateSubScoreForApiRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateSubScoreForApi", "2019-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateSubScoreForApiResponse());
    }

    public UpdateSubScoreForApiResponse updateSubScoreForApi(UpdateSubScoreForApiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateSubScoreForApiWithOptions(request, runtime);
    }

    public UpdateSyncQualityCheckDataResponse updateSyncQualityCheckDataWithOptions(UpdateSyncQualityCheckDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateSyncQualityCheckData", "2019-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateSyncQualityCheckDataResponse());
    }

    public UpdateSyncQualityCheckDataResponse updateSyncQualityCheckData(UpdateSyncQualityCheckDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateSyncQualityCheckDataWithOptions(request, runtime);
    }

    public UpdateTaskAssignRuleResponse updateTaskAssignRuleWithOptions(UpdateTaskAssignRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateTaskAssignRule", "2019-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateTaskAssignRuleResponse());
    }

    public UpdateTaskAssignRuleResponse updateTaskAssignRule(UpdateTaskAssignRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateTaskAssignRuleWithOptions(request, runtime);
    }

    public UpdateUserResponse updateUserWithOptions(UpdateUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateUser", "2019-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateUserResponse());
    }

    public UpdateUserResponse updateUser(UpdateUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateUserWithOptions(request, runtime);
    }

    public UpdateUserConfigResponse updateUserConfigWithOptions(UpdateUserConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateUserConfig", "2019-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateUserConfigResponse());
    }

    public UpdateUserConfigResponse updateUserConfig(UpdateUserConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateUserConfigWithOptions(request, runtime);
    }

    public UpdateWarningConfigResponse updateWarningConfigWithOptions(UpdateWarningConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateWarningConfig", "2019-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateWarningConfigResponse());
    }

    public UpdateWarningConfigResponse updateWarningConfig(UpdateWarningConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateWarningConfigWithOptions(request, runtime);
    }

    public UploadAudioDataResponse uploadAudioDataWithOptions(UploadAudioDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UploadAudioData", "2019-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new UploadAudioDataResponse());
    }

    public UploadAudioDataResponse uploadAudioData(UploadAudioDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.uploadAudioDataWithOptions(request, runtime);
    }

    public UploadDataResponse uploadDataWithOptions(UploadDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UploadData", "2019-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new UploadDataResponse());
    }

    public UploadDataResponse uploadData(UploadDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.uploadDataWithOptions(request, runtime);
    }

    public UploadDataSyncResponse uploadDataSyncWithOptions(UploadDataSyncRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UploadDataSync", "2019-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new UploadDataSyncResponse());
    }

    public UploadDataSyncResponse uploadDataSync(UploadDataSyncRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.uploadDataSyncWithOptions(request, runtime);
    }

    public UploadRuleResponse uploadRuleWithOptions(UploadRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UploadRule", "2019-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new UploadRuleResponse());
    }

    public UploadRuleResponse uploadRule(UploadRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.uploadRuleWithOptions(request, runtime);
    }

    public VerifyFileResponse verifyFileWithOptions(VerifyFileRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("VerifyFile", "2019-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new VerifyFileResponse());
    }

    public VerifyFileResponse verifyFile(VerifyFileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.verifyFileWithOptions(request, runtime);
    }

    public VerifySentenceResponse verifySentenceWithOptions(VerifySentenceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("VerifySentence", "2019-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new VerifySentenceResponse());
    }

    public VerifySentenceResponse verifySentence(VerifySentenceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.verifySentenceWithOptions(request, runtime);
    }
}
