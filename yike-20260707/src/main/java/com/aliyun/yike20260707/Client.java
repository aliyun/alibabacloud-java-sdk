// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707;

import com.aliyun.tea.*;
import com.aliyun.yike20260707.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-shanghai", "yike.cn-shanghai.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "yike.ap-southeast-1.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("yike", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>查询媒资内容理解作业</p>
     * 
     * @param request GetMediaComprehensionJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMediaComprehensionJobResponse
     */
    public GetMediaComprehensionJobResponse getMediaComprehensionJobWithOptions(GetMediaComprehensionJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMediaComprehensionJob"),
            new TeaPair("version", "2026-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMediaComprehensionJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询媒资内容理解作业</p>
     * 
     * @param request GetMediaComprehensionJobRequest
     * @return GetMediaComprehensionJobResponse
     */
    public GetMediaComprehensionJobResponse getMediaComprehensionJob(GetMediaComprehensionJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMediaComprehensionJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>提交媒资内容理解作业</p>
     * 
     * @param request SubmitMediaComprehensionJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitMediaComprehensionJobResponse
     */
    public SubmitMediaComprehensionJobResponse submitMediaComprehensionJobWithOptions(SubmitMediaComprehensionJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobParams)) {
            query.put("JobParams", request.jobParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitMediaComprehensionJob"),
            new TeaPair("version", "2026-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitMediaComprehensionJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>提交媒资内容理解作业</p>
     * 
     * @param request SubmitMediaComprehensionJobRequest
     * @return SubmitMediaComprehensionJobResponse
     */
    public SubmitMediaComprehensionJobResponse submitMediaComprehensionJob(SubmitMediaComprehensionJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitMediaComprehensionJobWithOptions(request, runtime);
    }
}
