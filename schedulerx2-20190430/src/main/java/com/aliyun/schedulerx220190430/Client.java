// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430;

import com.aliyun.tea.*;
import com.aliyun.schedulerx220190430.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-beijing", "schedulerx.cn-beijing.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "schedulerx.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-shanghai", "schedulerx.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "schedulerx.cn-shenzhen.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("schedulerx2", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * @summary Deletes multiple jobs at a time.
     *
     * @description Before you call this operation, you must add the following dependency to the pom.xml file:
     * ```xml
     * <dependency>
     *     <groupId>com.aliyun</groupId>
     *     <artifactId>aliyun-java-sdk-schedulerx2</artifactId>
     *     <version>1.0.4</version>
     * </dependency>
     * ```
     *
     * @param request BatchDeleteJobsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchDeleteJobsResponse
     */
    public BatchDeleteJobsResponse batchDeleteJobsWithOptions(BatchDeleteJobsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceSource)) {
            query.put("NamespaceSource", request.namespaceSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobIdList)) {
            body.put("JobIdList", request.jobIdList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchDeleteJobs"),
            new TeaPair("version", "2019-04-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchDeleteJobsResponse());
    }

    /**
     * @summary Deletes multiple jobs at a time.
     *
     * @description Before you call this operation, you must add the following dependency to the pom.xml file:
     * ```xml
     * <dependency>
     *     <groupId>com.aliyun</groupId>
     *     <artifactId>aliyun-java-sdk-schedulerx2</artifactId>
     *     <version>1.0.4</version>
     * </dependency>
     * ```
     *
     * @param request BatchDeleteJobsRequest
     * @return BatchDeleteJobsResponse
     */
    public BatchDeleteJobsResponse batchDeleteJobs(BatchDeleteJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchDeleteJobsWithOptions(request, runtime);
    }

    /**
     * @summary The additional information that is returned.
     *
     * @param request BatchDeleteRouteStrategyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchDeleteRouteStrategyResponse
     */
    public BatchDeleteRouteStrategyResponse batchDeleteRouteStrategyWithOptions(BatchDeleteRouteStrategyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobIdList)) {
            body.put("JobIdList", request.jobIdList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchDeleteRouteStrategy"),
            new TeaPair("version", "2019-04-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchDeleteRouteStrategyResponse());
    }

    /**
     * @summary The additional information that is returned.
     *
     * @param request BatchDeleteRouteStrategyRequest
     * @return BatchDeleteRouteStrategyResponse
     */
    public BatchDeleteRouteStrategyResponse batchDeleteRouteStrategy(BatchDeleteRouteStrategyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchDeleteRouteStrategyWithOptions(request, runtime);
    }

    /**
     * @summary Disables multiple jobs at a time.
     *
     * @description Before you call this operation, you must add the following dependency to the pom.xml file:
     * ```xml
     * <dependency>
     *     <groupId>com.aliyun</groupId>
     *     <artifactId>aliyun-java-sdk-schedulerx2</artifactId>
     *     <version>1.0.4</version>
     * </dependency>
     * ```
     *
     * @param request BatchDisableJobsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchDisableJobsResponse
     */
    public BatchDisableJobsResponse batchDisableJobsWithOptions(BatchDisableJobsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceSource)) {
            query.put("NamespaceSource", request.namespaceSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobIdList)) {
            body.put("JobIdList", request.jobIdList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchDisableJobs"),
            new TeaPair("version", "2019-04-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchDisableJobsResponse());
    }

    /**
     * @summary Disables multiple jobs at a time.
     *
     * @description Before you call this operation, you must add the following dependency to the pom.xml file:
     * ```xml
     * <dependency>
     *     <groupId>com.aliyun</groupId>
     *     <artifactId>aliyun-java-sdk-schedulerx2</artifactId>
     *     <version>1.0.4</version>
     * </dependency>
     * ```
     *
     * @param request BatchDisableJobsRequest
     * @return BatchDisableJobsResponse
     */
    public BatchDisableJobsResponse batchDisableJobs(BatchDisableJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchDisableJobsWithOptions(request, runtime);
    }

    /**
     * @summary Enables multiple jobs at a time.
     *
     * @description Before you call this operation, you must add the following dependency to the pom.xml file:
     * ```xml
     * <dependency>
     *     <groupId>com.aliyun</groupId>
     *     <artifactId>aliyun-java-sdk-schedulerx2</artifactId>
     *     <version>1.0.4</version>
     * </dependency>
     * ```
     *
     * @param request BatchEnableJobsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchEnableJobsResponse
     */
    public BatchEnableJobsResponse batchEnableJobsWithOptions(BatchEnableJobsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceSource)) {
            query.put("NamespaceSource", request.namespaceSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobIdList)) {
            body.put("JobIdList", request.jobIdList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchEnableJobs"),
            new TeaPair("version", "2019-04-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchEnableJobsResponse());
    }

    /**
     * @summary Enables multiple jobs at a time.
     *
     * @description Before you call this operation, you must add the following dependency to the pom.xml file:
     * ```xml
     * <dependency>
     *     <groupId>com.aliyun</groupId>
     *     <artifactId>aliyun-java-sdk-schedulerx2</artifactId>
     *     <version>1.0.4</version>
     * </dependency>
     * ```
     *
     * @param request BatchEnableJobsRequest
     * @return BatchEnableJobsResponse
     */
    public BatchEnableJobsResponse batchEnableJobs(BatchEnableJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchEnableJobsWithOptions(request, runtime);
    }

    /**
     * @summary Creates an application group. The AppKey is returned.
     *
     * @param request CreateAppGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAppGroupResponse
     */
    public CreateAppGroupResponse createAppGroupWithOptions(CreateAppGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAppGroup"),
            new TeaPair("version", "2019-04-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAppGroupResponse());
    }

    /**
     * @summary Creates an application group. The AppKey is returned.
     *
     * @param request CreateAppGroupRequest
     * @return CreateAppGroupResponse
     */
    public CreateAppGroupResponse createAppGroup(CreateAppGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAppGroupWithOptions(request, runtime);
    }

    /**
     * @summary Creates a job and obtains the job ID.
     *
     * @param request CreateJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateJobResponse
     */
    public CreateJobResponse createJobWithOptions(CreateJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.attemptInterval)) {
            body.put("AttemptInterval", request.attemptInterval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.calendar)) {
            body.put("Calendar", request.calendar);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.className)) {
            body.put("ClassName", request.className);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consumerSize)) {
            body.put("ConsumerSize", request.consumerSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactInfo)) {
            body.put("ContactInfo", request.contactInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataOffset)) {
            body.put("DataOffset", request.dataOffset);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dispatcherSize)) {
            body.put("DispatcherSize", request.dispatcherSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executeMode)) {
            body.put("ExecuteMode", request.executeMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.failEnable)) {
            body.put("FailEnable", request.failEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.failTimes)) {
            body.put("FailTimes", request.failTimes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            body.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobType)) {
            body.put("JobType", request.jobType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxAttempt)) {
            body.put("MaxAttempt", request.maxAttempt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxConcurrency)) {
            body.put("MaxConcurrency", request.maxConcurrency);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.missWorkerEnable)) {
            body.put("MissWorkerEnable", request.missWorkerEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            body.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceSource)) {
            body.put("NamespaceSource", request.namespaceSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parameters)) {
            body.put("Parameters", request.parameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queueSize)) {
            body.put("QueueSize", request.queueSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sendChannel)) {
            body.put("SendChannel", request.sendChannel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.successNoticeEnable)) {
            body.put("SuccessNoticeEnable", request.successNoticeEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskAttemptInterval)) {
            body.put("TaskAttemptInterval", request.taskAttemptInterval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskMaxAttempt)) {
            body.put("TaskMaxAttempt", request.taskMaxAttempt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeExpression)) {
            body.put("TimeExpression", request.timeExpression);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeType)) {
            body.put("TimeType", request.timeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeout)) {
            body.put("Timeout", request.timeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeoutEnable)) {
            body.put("TimeoutEnable", request.timeoutEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeoutKillEnable)) {
            body.put("TimeoutKillEnable", request.timeoutKillEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timezone)) {
            body.put("Timezone", request.timezone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.XAttrs)) {
            body.put("XAttrs", request.XAttrs);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateJob"),
            new TeaPair("version", "2019-04-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateJobResponse());
    }

    /**
     * @summary Creates a job and obtains the job ID.
     *
     * @param request CreateJobRequest
     * @return CreateJobResponse
     */
    public CreateJobResponse createJob(CreateJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createJobWithOptions(request, runtime);
    }

    /**
     * @summary Creates a namespace.
     *
     * @param request CreateNamespaceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateNamespaceResponse
     */
    public CreateNamespaceResponse createNamespaceWithOptions(CreateNamespaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uid)) {
            query.put("Uid", request.uid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateNamespace"),
            new TeaPair("version", "2019-04-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateNamespaceResponse());
    }

    /**
     * @summary Creates a namespace.
     *
     * @param request CreateNamespaceRequest
     * @return CreateNamespaceResponse
     */
    public CreateNamespaceResponse createNamespace(CreateNamespaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createNamespaceWithOptions(request, runtime);
    }

    /**
     * @summary Creates a routing policy.
     *
     * @param request CreateRouteStrategyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateRouteStrategyResponse
     */
    public CreateRouteStrategyResponse createRouteStrategyWithOptions(CreateRouteStrategyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strategyContent)) {
            query.put("StrategyContent", request.strategyContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRouteStrategy"),
            new TeaPair("version", "2019-04-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRouteStrategyResponse());
    }

    /**
     * @summary Creates a routing policy.
     *
     * @param request CreateRouteStrategyRequest
     * @return CreateRouteStrategyResponse
     */
    public CreateRouteStrategyResponse createRouteStrategy(CreateRouteStrategyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRouteStrategyWithOptions(request, runtime);
    }

    /**
     * @summary Creates a workflow. By default, the created workflow is disabled. After you update the directed acyclic graph (DAG) of the workflow, you must manually or call the corresponding operation to enable the workflow. You can call this operation only in the professional edition.
     *
     * @param request CreateWorkflowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateWorkflowResponse
     */
    public CreateWorkflowResponse createWorkflowWithOptions(CreateWorkflowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            body.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxConcurrency)) {
            body.put("MaxConcurrency", request.maxConcurrency);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            body.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceSource)) {
            body.put("NamespaceSource", request.namespaceSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeExpression)) {
            body.put("TimeExpression", request.timeExpression);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeType)) {
            body.put("TimeType", request.timeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timezone)) {
            body.put("Timezone", request.timezone);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateWorkflow"),
            new TeaPair("version", "2019-04-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateWorkflowResponse());
    }

    /**
     * @summary Creates a workflow. By default, the created workflow is disabled. After you update the directed acyclic graph (DAG) of the workflow, you must manually or call the corresponding operation to enable the workflow. You can call this operation only in the professional edition.
     *
     * @param request CreateWorkflowRequest
     * @return CreateWorkflowResponse
     */
    public CreateWorkflowResponse createWorkflow(CreateWorkflowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createWorkflowWithOptions(request, runtime);
    }

    /**
     * @summary The additional information that is returned.
     *
     * @param request DeleteAppGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAppGroupResponse
     */
    public DeleteAppGroupResponse deleteAppGroupWithOptions(DeleteAppGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deleteJobs)) {
            query.put("DeleteJobs", request.deleteJobs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAppGroup"),
            new TeaPair("version", "2019-04-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAppGroupResponse());
    }

    /**
     * @summary The additional information that is returned.
     *
     * @param request DeleteAppGroupRequest
     * @return DeleteAppGroupResponse
     */
    public DeleteAppGroupResponse deleteAppGroup(DeleteAppGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAppGroupWithOptions(request, runtime);
    }

    /**
     * @summary Deletes a specified job.
     *
     * @param request DeleteJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteJobResponse
     */
    public DeleteJobResponse deleteJobWithOptions(DeleteJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteJob"),
            new TeaPair("version", "2019-04-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteJobResponse());
    }

    /**
     * @summary Deletes a specified job.
     *
     * @param request DeleteJobRequest
     * @return DeleteJobResponse
     */
    public DeleteJobResponse deleteJob(DeleteJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteJobWithOptions(request, runtime);
    }

    /**
     * @summary Deletes a routing policy.
     *
     * @param request DeleteRouteStrategyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteRouteStrategyResponse
     */
    public DeleteRouteStrategyResponse deleteRouteStrategyWithOptions(DeleteRouteStrategyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRouteStrategy"),
            new TeaPair("version", "2019-04-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRouteStrategyResponse());
    }

    /**
     * @summary Deletes a routing policy.
     *
     * @param request DeleteRouteStrategyRequest
     * @return DeleteRouteStrategyResponse
     */
    public DeleteRouteStrategyResponse deleteRouteStrategy(DeleteRouteStrategyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRouteStrategyWithOptions(request, runtime);
    }

    /**
     * @summary Deletes a workflow.
     *
     * @param request DeleteWorkflowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteWorkflowResponse
     */
    public DeleteWorkflowResponse deleteWorkflowWithOptions(DeleteWorkflowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteWorkflow"),
            new TeaPair("version", "2019-04-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteWorkflowResponse());
    }

    /**
     * @summary Deletes a workflow.
     *
     * @param request DeleteWorkflowRequest
     * @return DeleteWorkflowResponse
     */
    public DeleteWorkflowResponse deleteWorkflow(DeleteWorkflowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteWorkflowWithOptions(request, runtime);
    }

    /**
     * @summary Returns available regions.
     *
     * @param request DescribeRegionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegionsWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRegions"),
            new TeaPair("version", "2019-04-30"),
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
     * @summary Returns available regions.
     *
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegions() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRegionsWithOptions(runtime);
    }

    /**
     * @summary Designates machines.
     *
     * @param request DesignateWorkersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DesignateWorkersResponse
     */
    public DesignateWorkersResponse designateWorkersWithOptions(DesignateWorkersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DesignateWorkers"),
            new TeaPair("version", "2019-04-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DesignateWorkersResponse());
    }

    /**
     * @summary Designates machines.
     *
     * @param request DesignateWorkersRequest
     * @return DesignateWorkersResponse
     */
    public DesignateWorkersResponse designateWorkers(DesignateWorkersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.designateWorkersWithOptions(request, runtime);
    }

    /**
     * @summary Disables a job.
     *
     * @param request DisableJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableJobResponse
     */
    public DisableJobResponse disableJobWithOptions(DisableJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableJob"),
            new TeaPair("version", "2019-04-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableJobResponse());
    }

    /**
     * @summary Disables a job.
     *
     * @param request DisableJobRequest
     * @return DisableJobResponse
     */
    public DisableJobResponse disableJob(DisableJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableJobWithOptions(request, runtime);
    }

    /**
     * @summary Disables a specified workflow.
     *
     * @param request DisableWorkflowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableWorkflowResponse
     */
    public DisableWorkflowResponse disableWorkflowWithOptions(DisableWorkflowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableWorkflow"),
            new TeaPair("version", "2019-04-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableWorkflowResponse());
    }

    /**
     * @summary Disables a specified workflow.
     *
     * @param request DisableWorkflowRequest
     * @return DisableWorkflowResponse
     */
    public DisableWorkflowResponse disableWorkflow(DisableWorkflowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableWorkflowWithOptions(request, runtime);
    }

    /**
     * @summary Enables a job.
     *
     * @param request EnableJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableJobResponse
     */
    public EnableJobResponse enableJobWithOptions(EnableJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableJob"),
            new TeaPair("version", "2019-04-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableJobResponse());
    }

    /**
     * @summary Enables a job.
     *
     * @param request EnableJobRequest
     * @return EnableJobResponse
     */
    public EnableJobResponse enableJob(EnableJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableJobWithOptions(request, runtime);
    }

    /**
     * @summary Enables a specified workflow.
     *
     * @param request EnableWorkflowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableWorkflowResponse
     */
    public EnableWorkflowResponse enableWorkflowWithOptions(EnableWorkflowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableWorkflow"),
            new TeaPair("version", "2019-04-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableWorkflowResponse());
    }

    /**
     * @summary Enables a specified workflow.
     *
     * @param request EnableWorkflowRequest
     * @return EnableWorkflowResponse
     */
    public EnableWorkflowResponse enableWorkflow(EnableWorkflowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableWorkflowWithOptions(request, runtime);
    }

    /**
     * @summary Triggers a job to immediately run once.
     *
     * @description > The combination of the `JobID` and `ScheduleTime` parameters serves as a unique index. Therefore, after the ExecuteJob operation is called to run a job once, a sleep for one second is required before the ExecuteJob operation is called to run the job again. Otherwise, the job may fail.
     *
     * @param request ExecuteJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExecuteJobResponse
     */
    public ExecuteJobResponse executeJobWithOptions(ExecuteJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExecuteJob"),
            new TeaPair("version", "2019-04-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExecuteJobResponse());
    }

    /**
     * @summary Triggers a job to immediately run once.
     *
     * @description > The combination of the `JobID` and `ScheduleTime` parameters serves as a unique index. Therefore, after the ExecuteJob operation is called to run a job once, a sleep for one second is required before the ExecuteJob operation is called to run the job again. Otherwise, the job may fail.
     *
     * @param request ExecuteJobRequest
     * @return ExecuteJobResponse
     */
    public ExecuteJobResponse executeJob(ExecuteJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.executeJobWithOptions(request, runtime);
    }

    /**
     * @summary Immediately triggers a workflow.
     *
     * @param request ExecuteWorkflowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExecuteWorkflowResponse
     */
    public ExecuteWorkflowResponse executeWorkflowWithOptions(ExecuteWorkflowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExecuteWorkflow"),
            new TeaPair("version", "2019-04-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExecuteWorkflowResponse());
    }

    /**
     * @summary Immediately triggers a workflow.
     *
     * @param request ExecuteWorkflowRequest
     * @return ExecuteWorkflowResponse
     */
    public ExecuteWorkflowResponse executeWorkflow(ExecuteWorkflowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.executeWorkflowWithOptions(request, runtime);
    }

    /**
     * @summary The configuration of the alert. The value is a JSON string. For more information, see **the additional information about response parameters below this table**.
     *
     * @param request GetAppGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAppGroupResponse
     */
    public GetAppGroupResponse getAppGroupWithOptions(GetAppGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAppGroup"),
            new TeaPair("version", "2019-04-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAppGroupResponse());
    }

    /**
     * @summary The configuration of the alert. The value is a JSON string. For more information, see **the additional information about response parameters below this table**.
     *
     * @param request GetAppGroupRequest
     * @return GetAppGroupResponse
     */
    public GetAppGroupResponse getAppGroup(GetAppGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAppGroupWithOptions(request, runtime);
    }

    /**
     * @summary Queries the details of a job based on the job ID. In most cases, the obtained information is used to update jobs.
     *
     * @param request GetJobInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetJobInfoResponse
     */
    public GetJobInfoResponse getJobInfoWithOptions(GetJobInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetJobInfo"),
            new TeaPair("version", "2019-04-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetJobInfoResponse());
    }

    /**
     * @summary Queries the details of a job based on the job ID. In most cases, the obtained information is used to update jobs.
     *
     * @param request GetJobInfoRequest
     * @return GetJobInfoResponse
     */
    public GetJobInfoResponse getJobInfo(GetJobInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getJobInfoWithOptions(request, runtime);
    }

    /**
     * @summary Queries the information about a job instance. You can view the status and progress of the job instance.
     *
     * @param request GetJobInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetJobInstanceResponse
     */
    public GetJobInstanceResponse getJobInstanceWithOptions(GetJobInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetJobInstance"),
            new TeaPair("version", "2019-04-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetJobInstanceResponse());
    }

    /**
     * @summary Queries the information about a job instance. You can view the status and progress of the job instance.
     *
     * @param request GetJobInstanceRequest
     * @return GetJobInstanceResponse
     */
    public GetJobInstanceResponse getJobInstance(GetJobInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getJobInstanceWithOptions(request, runtime);
    }

    /**
     * @summary Queries the most recent 10 execution instances of a job.
     *
     * @param request GetJobInstanceListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetJobInstanceListResponse
     */
    public GetJobInstanceListResponse getJobInstanceListWithOptions(GetJobInstanceListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetJobInstanceList"),
            new TeaPair("version", "2019-04-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetJobInstanceListResponse());
    }

    /**
     * @summary Queries the most recent 10 execution instances of a job.
     *
     * @param request GetJobInstanceListRequest
     * @return GetJobInstanceListResponse
     */
    public GetJobInstanceListResponse getJobInstanceList(GetJobInstanceListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getJobInstanceListWithOptions(request, runtime);
    }

    /**
     * @summary Queries the operational logs of a job. You can call this operation only in the professional edition.
     *
     * @param request GetLogRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetLogResponse
     */
    public GetLogResponse getLogWithOptions(GetLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLog"),
            new TeaPair("version", "2019-04-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLogResponse());
    }

    /**
     * @summary Queries the operational logs of a job. You can call this operation only in the professional edition.
     *
     * @param request GetLogRequest
     * @return GetLogResponse
     */
    public GetLogResponse getLog(GetLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getLogWithOptions(request, runtime);
    }

    /**
     * @summary 查询概览数据信息
     *
     * @param request GetOverviewRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetOverviewResponse
     */
    public GetOverviewResponse getOverviewWithOptions(GetOverviewRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricType)) {
            query.put("MetricType", request.metricType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceSource)) {
            query.put("NamespaceSource", request.namespaceSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operate)) {
            query.put("Operate", request.operate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOverview"),
            new TeaPair("version", "2019-04-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOverviewResponse());
    }

    /**
     * @summary 查询概览数据信息
     *
     * @param request GetOverviewRequest
     * @return GetOverviewResponse
     */
    public GetOverviewResponse getOverview(GetOverviewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getOverviewWithOptions(request, runtime);
    }

    /**
     * @summary Obtains the information about a workflow.
     *
     * @param request GetWorkFlowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetWorkFlowResponse
     */
    public GetWorkFlowResponse getWorkFlowWithOptions(GetWorkFlowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWorkFlow"),
            new TeaPair("version", "2019-04-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWorkFlowResponse());
    }

    /**
     * @summary Obtains the information about a workflow.
     *
     * @param request GetWorkFlowRequest
     * @return GetWorkFlowResponse
     */
    public GetWorkFlowResponse getWorkFlow(GetWorkFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWorkFlowWithOptions(request, runtime);
    }

    /**
     * @summary Obtains the list of workers that are connected to an application.
     *
     * @param request GetWorkerListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetWorkerListResponse
     */
    public GetWorkerListResponse getWorkerListWithOptions(GetWorkerListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWorkerList"),
            new TeaPair("version", "2019-04-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWorkerListResponse());
    }

    /**
     * @summary Obtains the list of workers that are connected to an application.
     *
     * @param request GetWorkerListRequest
     * @return GetWorkerListResponse
     */
    public GetWorkerListResponse getWorkerList(GetWorkerListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWorkerListWithOptions(request, runtime);
    }

    /**
     * @summary Queries the details of a specified workflow instance, including the state of the workflow instance, the state of each job instance, and the dependencies between job instances. You can call this operation only in the professional edition.
     *
     * @param request GetWorkflowInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetWorkflowInstanceResponse
     */
    public GetWorkflowInstanceResponse getWorkflowInstanceWithOptions(GetWorkflowInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWorkflowInstance"),
            new TeaPair("version", "2019-04-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWorkflowInstanceResponse());
    }

    /**
     * @summary Queries the details of a specified workflow instance, including the state of the workflow instance, the state of each job instance, and the dependencies between job instances. You can call this operation only in the professional edition.
     *
     * @param request GetWorkflowInstanceRequest
     * @return GetWorkflowInstanceResponse
     */
    public GetWorkflowInstanceResponse getWorkflowInstance(GetWorkflowInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWorkflowInstanceWithOptions(request, runtime);
    }

    /**
     * @summary Grants permissions to an application group.
     *
     * @param request GrantPermissionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GrantPermissionResponse
     */
    public GrantPermissionResponse grantPermissionWithOptions(GrantPermissionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.grantOption)) {
            query.put("GrantOption", request.grantOption);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceSource)) {
            query.put("NamespaceSource", request.namespaceSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            query.put("UserName", request.userName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GrantPermission"),
            new TeaPair("version", "2019-04-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GrantPermissionResponse());
    }

    /**
     * @summary Grants permissions to an application group.
     *
     * @param request GrantPermissionRequest
     * @return GrantPermissionResponse
     */
    public GrantPermissionResponse grantPermission(GrantPermissionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.grantPermissionWithOptions(request, runtime);
    }

    /**
     * @summary Queries a list of applications.
     *
     * @description Before you call this operation, you must add the following dependency to the pom.xml file:
     * ```xml
     * <dependency>
     *     <groupId>com.aliyun</groupId>
     *     <artifactId>aliyun-java-sdk-schedulerx2</artifactId>
     *     <version>1.0.5</version>
     * </dependency>
     * ```
     *
     * @param request ListGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListGroupsResponse
     */
    public ListGroupsResponse listGroupsWithOptions(ListGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appGroupName)) {
            query.put("AppGroupName", request.appGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceSource)) {
            query.put("NamespaceSource", request.namespaceSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListGroups"),
            new TeaPair("version", "2019-04-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListGroupsResponse());
    }

    /**
     * @summary Queries a list of applications.
     *
     * @description Before you call this operation, you must add the following dependency to the pom.xml file:
     * ```xml
     * <dependency>
     *     <groupId>com.aliyun</groupId>
     *     <artifactId>aliyun-java-sdk-schedulerx2</artifactId>
     *     <version>1.0.5</version>
     * </dependency>
     * ```
     *
     * @param request ListGroupsRequest
     * @return ListGroupsResponse
     */
    public ListGroupsResponse listGroups(ListGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listGroupsWithOptions(request, runtime);
    }

    /**
     * @summary Queries jobs.
     *
     * @description Before you call this operation, you must add the following dependency to the pom.xml file:
     *     <dependency>
     *           <groupId>com.aliyun</groupId>
     *           <artifactId>aliyun-java-sdk-schedulerx2</artifactId>
     *           <version>1.0.5</version>
     *     </dependency>
     *
     * @param request ListJobsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListJobsResponse
     */
    public ListJobsResponse listJobsWithOptions(ListJobsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListJobs"),
            new TeaPair("version", "2019-04-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListJobsResponse());
    }

    /**
     * @summary Queries jobs.
     *
     * @description Before you call this operation, you must add the following dependency to the pom.xml file:
     *     <dependency>
     *           <groupId>com.aliyun</groupId>
     *           <artifactId>aliyun-java-sdk-schedulerx2</artifactId>
     *           <version>1.0.5</version>
     *     </dependency>
     *
     * @param request ListJobsRequest
     * @return ListJobsResponse
     */
    public ListJobsResponse listJobs(ListJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listJobsWithOptions(request, runtime);
    }

    /**
     * @summary Queries namespaces.
     *
     * @description Before you call this operation, you must add the following dependency to the pom.xml file:
     *     <dependency>
     *         <groupId>com.aliyun</groupId>
     *         <artifactId>aliyun-java-sdk-schedulerx2</artifactId>
     *         <version>1.0.5</version>
     *     </dependency>
     *
     * @param request ListNamespacesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListNamespacesResponse
     */
    public ListNamespacesResponse listNamespacesWithOptions(ListNamespacesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceName)) {
            query.put("NamespaceName", request.namespaceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListNamespaces"),
            new TeaPair("version", "2019-04-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListNamespacesResponse());
    }

    /**
     * @summary Queries namespaces.
     *
     * @description Before you call this operation, you must add the following dependency to the pom.xml file:
     *     <dependency>
     *         <groupId>com.aliyun</groupId>
     *         <artifactId>aliyun-java-sdk-schedulerx2</artifactId>
     *         <version>1.0.5</version>
     *     </dependency>
     *
     * @param request ListNamespacesRequest
     * @return ListNamespacesResponse
     */
    public ListNamespacesResponse listNamespaces(ListNamespacesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listNamespacesWithOptions(request, runtime);
    }

    /**
     * @summary Queries the execution history of a workflow. You can call this operation only in the professional edition.
     *
     * @param request ListWorkflowInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListWorkflowInstanceResponse
     */
    public ListWorkflowInstanceResponse listWorkflowInstanceWithOptions(ListWorkflowInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListWorkflowInstance"),
            new TeaPair("version", "2019-04-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListWorkflowInstanceResponse());
    }

    /**
     * @summary Queries the execution history of a workflow. You can call this operation only in the professional edition.
     *
     * @param request ListWorkflowInstanceRequest
     * @return ListWorkflowInstanceResponse
     */
    public ListWorkflowInstanceResponse listWorkflowInstance(ListWorkflowInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listWorkflowInstanceWithOptions(request, runtime);
    }

    /**
     * @summary Reruns a job to obtain the historical data of the job. You can call this operation only in the professional edition.
     *
     * @param request RerunJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RerunJobResponse
     */
    public RerunJobResponse rerunJobWithOptions(RerunJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataTime)) {
            body.put("DataTime", request.dataTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            body.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            body.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            body.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            body.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceSource)) {
            body.put("NamespaceSource", request.namespaceSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            body.put("StartDate", request.startDate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RerunJob"),
            new TeaPair("version", "2019-04-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RerunJobResponse());
    }

    /**
     * @summary Reruns a job to obtain the historical data of the job. You can call this operation only in the professional edition.
     *
     * @param request RerunJobRequest
     * @return RerunJobResponse
     */
    public RerunJobResponse rerunJob(RerunJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.rerunJobWithOptions(request, runtime);
    }

    /**
     * @summary Reruns a successful or failed job instance. You can call this operation only in the professional edition.
     *
     * @param request RetryJobInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RetryJobInstanceResponse
     */
    public RetryJobInstanceResponse retryJobInstanceWithOptions(RetryJobInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobInstanceId)) {
            query.put("JobInstanceId", request.jobInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceSource)) {
            query.put("NamespaceSource", request.namespaceSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RetryJobInstance"),
            new TeaPair("version", "2019-04-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RetryJobInstanceResponse());
    }

    /**
     * @summary Reruns a successful or failed job instance. You can call this operation only in the professional edition.
     *
     * @param request RetryJobInstanceRequest
     * @return RetryJobInstanceResponse
     */
    public RetryJobInstanceResponse retryJobInstance(RetryJobInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.retryJobInstanceWithOptions(request, runtime);
    }

    /**
     * @summary Revokes the permissions that are granted to an Alibaba Cloud Resource Access Management (RAM) user.
     *
     * @param request RevokePermissionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RevokePermissionResponse
     */
    public RevokePermissionResponse revokePermissionWithOptions(RevokePermissionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceSource)) {
            query.put("NamespaceSource", request.namespaceSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RevokePermission"),
            new TeaPair("version", "2019-04-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RevokePermissionResponse());
    }

    /**
     * @summary Revokes the permissions that are granted to an Alibaba Cloud Resource Access Management (RAM) user.
     *
     * @param request RevokePermissionRequest
     * @return RevokePermissionResponse
     */
    public RevokePermissionResponse revokePermission(RevokePermissionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.revokePermissionWithOptions(request, runtime);
    }

    /**
     * @summary Forcibly sets the state of a job instance to successful. You can call this operation only in the professional edition.
     *
     * @param request SetJobInstanceSuccessRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetJobInstanceSuccessResponse
     */
    public SetJobInstanceSuccessResponse setJobInstanceSuccessWithOptions(SetJobInstanceSuccessRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobInstanceId)) {
            query.put("JobInstanceId", request.jobInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceSource)) {
            query.put("NamespaceSource", request.namespaceSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetJobInstanceSuccess"),
            new TeaPair("version", "2019-04-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetJobInstanceSuccessResponse());
    }

    /**
     * @summary Forcibly sets the state of a job instance to successful. You can call this operation only in the professional edition.
     *
     * @param request SetJobInstanceSuccessRequest
     * @return SetJobInstanceSuccessResponse
     */
    public SetJobInstanceSuccessResponse setJobInstanceSuccess(SetJobInstanceSuccessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setJobInstanceSuccessWithOptions(request, runtime);
    }

    /**
     * @summary Forcibly sets the state of a workflow instance to successful. You can call this operation only in the professional edition.
     *
     * @param request SetWfInstanceSuccessRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetWfInstanceSuccessResponse
     */
    public SetWfInstanceSuccessResponse setWfInstanceSuccessWithOptions(SetWfInstanceSuccessRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceSource)) {
            query.put("NamespaceSource", request.namespaceSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wfInstanceId)) {
            query.put("WfInstanceId", request.wfInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workflowId)) {
            query.put("WorkflowId", request.workflowId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetWfInstanceSuccess"),
            new TeaPair("version", "2019-04-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetWfInstanceSuccessResponse());
    }

    /**
     * @summary Forcibly sets the state of a workflow instance to successful. You can call this operation only in the professional edition.
     *
     * @param request SetWfInstanceSuccessRequest
     * @return SetWfInstanceSuccessResponse
     */
    public SetWfInstanceSuccessResponse setWfInstanceSuccess(SetWfInstanceSuccessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setWfInstanceSuccessWithOptions(request, runtime);
    }

    /**
     * @summary Stops a job instance in the running state.
     *
     * @param request StopInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopInstanceResponse
     */
    public StopInstanceResponse stopInstanceWithOptions(StopInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopInstance"),
            new TeaPair("version", "2019-04-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopInstanceResponse());
    }

    /**
     * @summary Stops a job instance in the running state.
     *
     * @param request StopInstanceRequest
     * @return StopInstanceResponse
     */
    public StopInstanceResponse stopInstance(StopInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopInstanceWithOptions(request, runtime);
    }

    /**
     * @summary The additional information that is returned.
     *
     * @param request UpdateAppGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAppGroupResponse
     */
    public UpdateAppGroupResponse updateAppGroupWithOptions(UpdateAppGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxConcurrency)) {
            query.put("MaxConcurrency", request.maxConcurrency);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAppGroup"),
            new TeaPair("version", "2019-04-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAppGroupResponse());
    }

    /**
     * @summary The additional information that is returned.
     *
     * @param request UpdateAppGroupRequest
     * @return UpdateAppGroupResponse
     */
    public UpdateAppGroupResponse updateAppGroup(UpdateAppGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAppGroupWithOptions(request, runtime);
    }

    /**
     * @summary Updates the configuration information about a job. By default, you need to call the GetJobInfo operation to obtain the original configuration of the job before you call this operation to modify the configuration as required.
     *
     * @param request UpdateJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateJobResponse
     */
    public UpdateJobResponse updateJobWithOptions(UpdateJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.attemptInterval)) {
            body.put("AttemptInterval", request.attemptInterval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.calendar)) {
            body.put("Calendar", request.calendar);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.className)) {
            body.put("ClassName", request.className);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consumerSize)) {
            body.put("ConsumerSize", request.consumerSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactInfo)) {
            body.put("ContactInfo", request.contactInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataOffset)) {
            body.put("DataOffset", request.dataOffset);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dispatcherSize)) {
            body.put("DispatcherSize", request.dispatcherSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executeMode)) {
            body.put("ExecuteMode", request.executeMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.failEnable)) {
            body.put("FailEnable", request.failEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.failTimes)) {
            body.put("FailTimes", request.failTimes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            body.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            body.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxAttempt)) {
            body.put("MaxAttempt", request.maxAttempt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxConcurrency)) {
            body.put("MaxConcurrency", request.maxConcurrency);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.missWorkerEnable)) {
            body.put("MissWorkerEnable", request.missWorkerEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            body.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceSource)) {
            body.put("NamespaceSource", request.namespaceSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parameters)) {
            body.put("Parameters", request.parameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queueSize)) {
            body.put("QueueSize", request.queueSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sendChannel)) {
            body.put("SendChannel", request.sendChannel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.successNoticeEnable)) {
            body.put("SuccessNoticeEnable", request.successNoticeEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskAttemptInterval)) {
            body.put("TaskAttemptInterval", request.taskAttemptInterval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskDispatchMode)) {
            body.put("TaskDispatchMode", request.taskDispatchMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskMaxAttempt)) {
            body.put("TaskMaxAttempt", request.taskMaxAttempt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.template)) {
            body.put("Template", request.template);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeExpression)) {
            body.put("TimeExpression", request.timeExpression);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeType)) {
            body.put("TimeType", request.timeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeout)) {
            body.put("Timeout", request.timeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeoutEnable)) {
            body.put("TimeoutEnable", request.timeoutEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeoutKillEnable)) {
            body.put("TimeoutKillEnable", request.timeoutKillEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timezone)) {
            body.put("Timezone", request.timezone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.XAttrs)) {
            body.put("XAttrs", request.XAttrs);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateJob"),
            new TeaPair("version", "2019-04-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateJobResponse());
    }

    /**
     * @summary Updates the configuration information about a job. By default, you need to call the GetJobInfo operation to obtain the original configuration of the job before you call this operation to modify the configuration as required.
     *
     * @param request UpdateJobRequest
     * @return UpdateJobResponse
     */
    public UpdateJobResponse updateJob(UpdateJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateJobWithOptions(request, runtime);
    }

    /**
     * @summary Updates the basic information about a workflow. You can call this operation only in the professional edition.
     *
     * @param request UpdateWorkflowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateWorkflowResponse
     */
    public UpdateWorkflowResponse updateWorkflowWithOptions(UpdateWorkflowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            body.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            body.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceSource)) {
            body.put("NamespaceSource", request.namespaceSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeExpression)) {
            body.put("TimeExpression", request.timeExpression);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeType)) {
            body.put("TimeType", request.timeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workflowId)) {
            body.put("WorkflowId", request.workflowId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateWorkflow"),
            new TeaPair("version", "2019-04-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateWorkflowResponse());
    }

    /**
     * @summary Updates the basic information about a workflow. You can call this operation only in the professional edition.
     *
     * @param request UpdateWorkflowRequest
     * @return UpdateWorkflowResponse
     */
    public UpdateWorkflowResponse updateWorkflow(UpdateWorkflowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateWorkflowWithOptions(request, runtime);
    }

    /**
     * @summary Modifies the nodes and dependencies of a workflow. You can call this operation only in the professional edition.
     *
     * @param request UpdateWorkflowDagRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateWorkflowDagResponse
     */
    public UpdateWorkflowDagResponse updateWorkflowDagWithOptions(UpdateWorkflowDagRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dagJson)) {
            body.put("DagJson", request.dagJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            body.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            body.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceSource)) {
            body.put("NamespaceSource", request.namespaceSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workflowId)) {
            body.put("WorkflowId", request.workflowId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateWorkflowDag"),
            new TeaPair("version", "2019-04-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateWorkflowDagResponse());
    }

    /**
     * @summary Modifies the nodes and dependencies of a workflow. You can call this operation only in the professional edition.
     *
     * @param request UpdateWorkflowDagRequest
     * @return UpdateWorkflowDagResponse
     */
    public UpdateWorkflowDagResponse updateWorkflowDag(UpdateWorkflowDagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateWorkflowDagWithOptions(request, runtime);
    }
}
