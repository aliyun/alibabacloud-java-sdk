// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paimodelgallery20260603;

import com.aliyun.tea.*;
import com.aliyun.paimodelgallery20260603.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("us-west-1", "paimodelgallery.us-west-1.aliyuncs.com"),
            new TeaPair("us-east-1", "paimodelgallery.us-east-1.aliyuncs.com"),
            new TeaPair("eu-central-1", "paimodelgallery.eu-central-1.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "paimodelgallery.cn-wulanchabu.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "paimodelgallery.cn-shenzhen.aliyuncs.com"),
            new TeaPair("cn-shanghai", "paimodelgallery.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-hongkong", "paimodelgallery.cn-hongkong.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "paimodelgallery.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-guangzhou", "paimodelgallery.cn-guangzhou.aliyuncs.com"),
            new TeaPair("cn-beijing", "paimodelgallery.cn-beijing.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "paimodelgallery.ap-southeast-5.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "paimodelgallery.ap-southeast-3.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "paimodelgallery.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-northeast-2", "paimodelgallery.ap-northeast-2.aliyuncs.com"),
            new TeaPair("ap-northeast-1", "paimodelgallery.ap-northeast-1.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("paimodelgallery", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>获取ModelGallery模型列表</p>
     * 
     * @param tmpReq ListModelGalleryModelsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListModelGalleryModelsResponse
     */
    public ListModelGalleryModelsResponse listModelGalleryModelsWithOptions(ListModelGalleryModelsRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListModelGalleryModelsShrinkRequest request = new ListModelGalleryModelsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.conditions)) {
            request.conditionsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.conditions, "Conditions", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tag)) {
            request.tagShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tag, "Tag", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.collections)) {
            query.put("Collections", request.collections);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.compressible)) {
            query.put("Compressible", request.compressible);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.conditionsShrink)) {
            query.put("Conditions", request.conditionsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deepThink)) {
            query.put("DeepThink", request.deepThink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.demonstrable)) {
            query.put("Demonstrable", request.demonstrable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deployable)) {
            query.put("Deployable", request.deployable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.distillable)) {
            query.put("Distillable", request.distillable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.evaluable)) {
            query.put("Evaluable", request.evaluable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.functionCall)) {
            query.put("FunctionCall", request.functionCall);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelName)) {
            query.put("ModelName", request.modelName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelSeries)) {
            query.put("ModelSeries", request.modelSeries);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelType)) {
            query.put("ModelType", request.modelType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.origin)) {
            query.put("Origin", request.origin);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            query.put("Query", request.query);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.supportedCompressionResource)) {
            query.put("SupportedCompressionResource", request.supportedCompressionResource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.supportedDistillationResource)) {
            query.put("SupportedDistillationResource", request.supportedDistillationResource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.supportedEvaluationResource)) {
            query.put("SupportedEvaluationResource", request.supportedEvaluationResource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.supportedInferenceResource)) {
            query.put("SupportedInferenceResource", request.supportedInferenceResource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.supportedTrainingResource)) {
            query.put("SupportedTrainingResource", request.supportedTrainingResource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagShrink)) {
            query.put("Tag", request.tagShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.task)) {
            query.put("Task", request.task);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trainable)) {
            query.put("Trainable", request.trainable);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListModelGalleryModels"),
            new TeaPair("version", "2026-06-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/modelgallery/models"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListModelGalleryModelsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取ModelGallery模型列表</p>
     * 
     * @param request ListModelGalleryModelsRequest
     * @return ListModelGalleryModelsResponse
     */
    public ListModelGalleryModelsResponse listModelGalleryModels(ListModelGalleryModelsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listModelGalleryModelsWithOptions(request, headers, runtime);
    }
}
