// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224;

import com.aliyun.tea.*;
import com.aliyun.retailbot20210224.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("retailbot", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public ListIndustryPackagesResponse listIndustryPackagesWithOptions(ListIndustryPackagesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListIndustryPackages", "2021-02-24", "HTTPS", "POST", "AK", "json", req, runtime), new ListIndustryPackagesResponse());
    }

    public ListIndustryPackagesResponse listIndustryPackages(ListIndustryPackagesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listIndustryPackagesWithOptions(request, runtime);
    }

    public ListCategoriesResponse listCategoriesWithOptions(ListCategoriesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListCategories", "2021-02-24", "HTTPS", "POST", "AK", "json", req, runtime), new ListCategoriesResponse());
    }

    public ListCategoriesResponse listCategories(ListCategoriesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listCategoriesWithOptions(request, runtime);
    }

    public EnableSceneResponse enableSceneWithOptions(EnableSceneRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        EnableSceneShrinkRequest request = new EnableSceneShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.knowledgeIds)) {
            request.knowledgeIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.knowledgeIds, "KnowledgeIds", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("EnableScene", "2021-02-24", "HTTPS", "POST", "AK", "json", req, runtime), new EnableSceneResponse());
    }

    public EnableSceneResponse enableScene(EnableSceneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.enableSceneWithOptions(request, runtime);
    }

    public ListPackageKnowledgesResponse listPackageKnowledgesWithOptions(ListPackageKnowledgesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListPackageKnowledges", "2021-02-24", "HTTPS", "POST", "AK", "json", req, runtime), new ListPackageKnowledgesResponse());
    }

    public ListPackageKnowledgesResponse listPackageKnowledges(ListPackageKnowledgesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listPackageKnowledgesWithOptions(request, runtime);
    }

    public GetKnowledgeResponse getKnowledgeWithOptions(GetKnowledgeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetKnowledge", "2021-02-24", "HTTPS", "POST", "AK", "json", req, runtime), new GetKnowledgeResponse());
    }

    public GetKnowledgeResponse getKnowledge(GetKnowledgeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getKnowledgeWithOptions(request, runtime);
    }

    public DisableSceneResponse disableSceneWithOptions(DisableSceneRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DisableSceneShrinkRequest request = new DisableSceneShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.knowledgeIds)) {
            request.knowledgeIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.knowledgeIds, "KnowledgeIds", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DisableScene", "2021-02-24", "HTTPS", "POST", "AK", "json", req, runtime), new DisableSceneResponse());
    }

    public DisableSceneResponse disableScene(DisableSceneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.disableSceneWithOptions(request, runtime);
    }

    public DeleteSolutionResponse deleteSolutionWithOptions(DeleteSolutionRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteSolutionShrinkRequest request = new DeleteSolutionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.solutionIds)) {
            request.solutionIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.solutionIds, "SolutionIds", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteSolution", "2021-02-24", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteSolutionResponse());
    }

    public DeleteSolutionResponse deleteSolution(DeleteSolutionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteSolutionWithOptions(request, runtime);
    }

    public UpdateSolutionResponse updateSolutionWithOptions(UpdateSolutionRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateSolutionShrinkRequest request = new UpdateSolutionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.solution))) {
            request.solutionShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.solution), "Solution", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateSolution", "2021-02-24", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateSolutionResponse());
    }

    public UpdateSolutionResponse updateSolution(UpdateSolutionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateSolutionWithOptions(request, runtime);
    }

    public ListPackageVersionsResponse listPackageVersionsWithOptions(ListPackageVersionsRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListPackageVersionsShrinkRequest request = new ListPackageVersionsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.packageCodes)) {
            request.packageCodesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.packageCodes, "PackageCodes", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListPackageVersions", "2021-02-24", "HTTPS", "POST", "AK", "json", req, runtime), new ListPackageVersionsResponse());
    }

    public ListPackageVersionsResponse listPackageVersions(ListPackageVersionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listPackageVersionsWithOptions(request, runtime);
    }

    public ListSubscribedPackageKnowledgesResponse listSubscribedPackageKnowledgesWithOptions(ListSubscribedPackageKnowledgesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListSubscribedPackageKnowledges", "2021-02-24", "HTTPS", "POST", "AK", "json", req, runtime), new ListSubscribedPackageKnowledgesResponse());
    }

    public ListSubscribedPackageKnowledgesResponse listSubscribedPackageKnowledges(ListSubscribedPackageKnowledgesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listSubscribedPackageKnowledgesWithOptions(request, runtime);
    }

    public GetPackageVersionResponse getPackageVersionWithOptions(GetPackageVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetPackageVersion", "2021-02-24", "HTTPS", "POST", "AK", "json", req, runtime), new GetPackageVersionResponse());
    }

    public GetPackageVersionResponse getPackageVersion(GetPackageVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getPackageVersionWithOptions(request, runtime);
    }

    public AddSolutionResponse addSolutionWithOptions(AddSolutionRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AddSolutionShrinkRequest request = new AddSolutionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.solution))) {
            request.solutionShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.solution), "Solution", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddSolution", "2021-02-24", "HTTPS", "POST", "AK", "json", req, runtime), new AddSolutionResponse());
    }

    public AddSolutionResponse addSolution(AddSolutionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addSolutionWithOptions(request, runtime);
    }

    public GetSolutionResponse getSolutionWithOptions(GetSolutionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetSolution", "2021-02-24", "HTTPS", "POST", "AK", "json", req, runtime), new GetSolutionResponse());
    }

    public GetSolutionResponse getSolution(GetSolutionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getSolutionWithOptions(request, runtime);
    }
}
