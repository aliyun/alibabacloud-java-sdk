// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506;

import com.aliyun.tea.*;
import com.aliyun.sae20190506.models.*;

public class Client extends com.aliyun.tearoa.Client {

    public Client(com.aliyun.tearoa.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpointHost = this.getEndpoint("sae", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpointHost);
    }


    public RestartInstancesResponse restartInstancesWithOptions(RestartInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("RestartInstances", "2019-05-06", "HTTPS", "PUT", "AK", "/pop/v1/sam/app/restartInstances", com.aliyun.teautil.Common.stringifyMapValue(TeaModel.buildMap(request.query)), request.headers, null, runtime), new RestartInstancesResponse());
    }

    public RestartInstancesResponse restartInstances(RestartInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.restartInstancesWithOptions(request, runtime);
    }

    public UpdateAppSecurityGroupResponse updateAppSecurityGroupWithOptions(UpdateAppSecurityGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("UpdateAppSecurityGroup", "2019-05-06", "HTTPS", "PUT", "AK", "/pop/v1/sam/app/updateAppSecurityGroup", com.aliyun.teautil.Common.stringifyMapValue(TeaModel.buildMap(request.query)), request.headers, null, runtime), new UpdateAppSecurityGroupResponse());
    }

    public UpdateAppSecurityGroupResponse updateAppSecurityGroup(UpdateAppSecurityGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAppSecurityGroupWithOptions(request, runtime);
    }

    public DescribeConfigMapResponse describeConfigMapWithOptions(DescribeConfigMapRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("DescribeConfigMap", "2019-05-06", "HTTPS", "GET", "AK", "/pop/v1/sam/configmap/configMap", com.aliyun.teautil.Common.stringifyMapValue(TeaModel.buildMap(request.query)), request.headers, null, runtime), new DescribeConfigMapResponse());
    }

    public DescribeConfigMapResponse describeConfigMap(DescribeConfigMapRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeConfigMapWithOptions(request, runtime);
    }

    public UpdateConfigMapResponse updateConfigMapWithOptions(UpdateConfigMapRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("UpdateConfigMap", "2019-05-06", "HTTPS", "PUT", "AK", "/pop/v1/sam/configmap/configMap", com.aliyun.teautil.Common.stringifyMapValue(TeaModel.buildMap(request.query)), request.headers, TeaModel.buildMap(request.body), runtime), new UpdateConfigMapResponse());
    }

    public UpdateConfigMapResponse updateConfigMap(UpdateConfigMapRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateConfigMapWithOptions(request, runtime);
    }

    public CreateConfigMapResponse createConfigMapWithOptions(CreateConfigMapRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("CreateConfigMap", "2019-05-06", "HTTPS", "POST", "AK", "/pop/v1/sam/configmap/configMap", com.aliyun.teautil.Common.stringifyMapValue(TeaModel.buildMap(request.query)), request.headers, TeaModel.buildMap(request.body), runtime), new CreateConfigMapResponse());
    }

    public CreateConfigMapResponse createConfigMap(CreateConfigMapRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createConfigMapWithOptions(request, runtime);
    }

    public ListNamespacedConfigMapsResponse listNamespacedConfigMapsWithOptions(ListNamespacedConfigMapsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("ListNamespacedConfigMaps", "2019-05-06", "HTTPS", "GET", "AK", "/pop/v1/sam/configmap/listNamespacedConfigMaps", com.aliyun.teautil.Common.stringifyMapValue(TeaModel.buildMap(request.query)), request.headers, null, runtime), new ListNamespacedConfigMapsResponse());
    }

    public ListNamespacedConfigMapsResponse listNamespacedConfigMaps(ListNamespacedConfigMapsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listNamespacedConfigMapsWithOptions(request, runtime);
    }

    public DeleteConfigMapResponse deleteConfigMapWithOptions(DeleteConfigMapRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("DeleteConfigMap", "2019-05-06", "HTTPS", "DELETE", "AK", "/pop/v1/sam/configmap/configMap", com.aliyun.teautil.Common.stringifyMapValue(TeaModel.buildMap(request.query)), request.headers, null, runtime), new DeleteConfigMapResponse());
    }

    public DeleteConfigMapResponse deleteConfigMap(DeleteConfigMapRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteConfigMapWithOptions(request, runtime);
    }

    public ListAppVersionsResponse listAppVersionsWithOptions(ListAppVersionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("ListAppVersions", "2019-05-06", "HTTPS", "GET", "AK", "/pop/v1/sam/app/listAppVersions", com.aliyun.teautil.Common.stringifyMapValue(TeaModel.buildMap(request.query)), request.headers, null, runtime), new ListAppVersionsResponse());
    }

    public ListAppVersionsResponse listAppVersions(ListAppVersionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAppVersionsWithOptions(request, runtime);
    }

    public RollbackApplicationResponse rollbackApplicationWithOptions(RollbackApplicationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("RollbackApplication", "2019-05-06", "HTTPS", "PUT", "AK", "/pop/v1/sam/app/rollbackApplication", com.aliyun.teautil.Common.stringifyMapValue(TeaModel.buildMap(request.query)), request.headers, null, runtime), new RollbackApplicationResponse());
    }

    public RollbackApplicationResponse rollbackApplication(RollbackApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.rollbackApplicationWithOptions(request, runtime);
    }

    public UntagResourcesResponse untagResourcesWithOptions(UntagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("UntagResources", "2019-05-06", "HTTPS", "DELETE", "AK", "/tags", com.aliyun.teautil.Common.stringifyMapValue(TeaModel.buildMap(request.query)), request.headers, null, runtime), new UntagResourcesResponse());
    }

    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.untagResourcesWithOptions(request, runtime);
    }

    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("TagResources", "2019-05-06", "HTTPS", "POST", "AK", "/tags", null, request.headers, TeaModel.buildMap(request.body), runtime), new TagResourcesResponse());
    }

    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("ListTagResources", "2019-05-06", "HTTPS", "GET", "AK", "/tags", com.aliyun.teautil.Common.stringifyMapValue(TeaModel.buildMap(request.query)), request.headers, null, runtime), new ListTagResourcesResponse());
    }

    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    public DescribeIngressResponse describeIngressWithOptions(DescribeIngressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("DescribeIngress", "2019-05-06", "HTTPS", "GET", "AK", "/pop/v1/sam/ingress/Ingress", com.aliyun.teautil.Common.stringifyMapValue(TeaModel.buildMap(request.query)), request.headers, null, runtime), new DescribeIngressResponse());
    }

    public DescribeIngressResponse describeIngress(DescribeIngressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeIngressWithOptions(request, runtime);
    }

    public ListIngressesResponse listIngressesWithOptions(ListIngressesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("ListIngresses", "2019-05-06", "HTTPS", "GET", "AK", "/pop/v1/sam/ingress/IngressList", com.aliyun.teautil.Common.stringifyMapValue(TeaModel.buildMap(request.query)), request.headers, null, runtime), new ListIngressesResponse());
    }

    public ListIngressesResponse listIngresses(ListIngressesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listIngressesWithOptions(request, runtime);
    }

    public UpdateIngressResponse updateIngressWithOptions(UpdateIngressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("UpdateIngress", "2019-05-06", "HTTPS", "PUT", "AK", "/pop/v1/sam/ingress/Ingress", com.aliyun.teautil.Common.stringifyMapValue(TeaModel.buildMap(request.query)), request.headers, TeaModel.buildMap(request.body), runtime), new UpdateIngressResponse());
    }

    public UpdateIngressResponse updateIngress(UpdateIngressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateIngressWithOptions(request, runtime);
    }

    public DeleteIngressResponse deleteIngressWithOptions(DeleteIngressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("DeleteIngress", "2019-05-06", "HTTPS", "DELETE", "AK", "/pop/v1/sam/ingress/Ingress", com.aliyun.teautil.Common.stringifyMapValue(TeaModel.buildMap(request.query)), request.headers, null, runtime), new DeleteIngressResponse());
    }

    public DeleteIngressResponse deleteIngress(DeleteIngressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteIngressWithOptions(request, runtime);
    }

    public CreateIngressResponse createIngressWithOptions(CreateIngressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("CreateIngress", "2019-05-06", "HTTPS", "POST", "AK", "/pop/v1/sam/ingress/Ingress", com.aliyun.teautil.Common.stringifyMapValue(TeaModel.buildMap(request.query)), request.headers, TeaModel.buildMap(request.body), runtime), new CreateIngressResponse());
    }

    public CreateIngressResponse createIngress(CreateIngressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createIngressWithOptions(request, runtime);
    }

    public UpdateNamespaceVpcResponse updateNamespaceVpcWithOptions(UpdateNamespaceVpcRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("UpdateNamespaceVpc", "2019-05-06", "HTTPS", "POST", "AK", "/pop/v1/sam/namespace/updateNamespaceVpc", com.aliyun.teautil.Common.stringifyMapValue(TeaModel.buildMap(request.query)), request.headers, null, runtime), new UpdateNamespaceVpcResponse());
    }

    public UpdateNamespaceVpcResponse updateNamespaceVpc(UpdateNamespaceVpcRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateNamespaceVpcWithOptions(request, runtime);
    }

    public BatchStopApplicationsResponse batchStopApplicationsWithOptions(BatchStopApplicationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("BatchStopApplications", "2019-05-06", "HTTPS", "PUT", "AK", "/pop/v1/sam/app/batchStopApplications", com.aliyun.teautil.Common.stringifyMapValue(TeaModel.buildMap(request.query)), request.headers, null, runtime), new BatchStopApplicationsResponse());
    }

    public BatchStopApplicationsResponse batchStopApplications(BatchStopApplicationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchStopApplicationsWithOptions(request, runtime);
    }

    public DescribeNamespaceResourcesResponse describeNamespaceResourcesWithOptions(DescribeNamespaceResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("DescribeNamespaceResources", "2019-05-06", "HTTPS", "GET", "AK", "/pop/v1/sam/namespace/describeNamespaceResources", com.aliyun.teautil.Common.stringifyMapValue(TeaModel.buildMap(request.query)), request.headers, null, runtime), new DescribeNamespaceResourcesResponse());
    }

    public DescribeNamespaceResourcesResponse describeNamespaceResources(DescribeNamespaceResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeNamespaceResourcesWithOptions(request, runtime);
    }

    public ListNamespaceChangeOrdersResponse listNamespaceChangeOrdersWithOptions(ListNamespaceChangeOrdersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("ListNamespaceChangeOrders", "2019-05-06", "HTTPS", "GET", "AK", "/pop/v1/sam/changeorder/listNamespaceChangeOrders", com.aliyun.teautil.Common.stringifyMapValue(TeaModel.buildMap(request.query)), request.headers, null, runtime), new ListNamespaceChangeOrdersResponse());
    }

    public ListNamespaceChangeOrdersResponse listNamespaceChangeOrders(ListNamespaceChangeOrdersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listNamespaceChangeOrdersWithOptions(request, runtime);
    }

    public BatchStartApplicationsResponse batchStartApplicationsWithOptions(BatchStartApplicationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("BatchStartApplications", "2019-05-06", "HTTPS", "PUT", "AK", "/pop/v1/sam/app/batchStartApplications", com.aliyun.teautil.Common.stringifyMapValue(TeaModel.buildMap(request.query)), request.headers, null, runtime), new BatchStartApplicationsResponse());
    }

    public BatchStartApplicationsResponse batchStartApplications(BatchStartApplicationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchStartApplicationsWithOptions(request, runtime);
    }

    public ListAppEventsResponse listAppEventsWithOptions(ListAppEventsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("ListAppEvents", "2019-05-06", "HTTPS", "GET", "AK", "/pop/v1/sam/app/listAppEvents", com.aliyun.teautil.Common.stringifyMapValue(TeaModel.buildMap(request.query)), request.headers, null, runtime), new ListAppEventsResponse());
    }

    public ListAppEventsResponse listAppEvents(ListAppEventsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAppEventsWithOptions(request, runtime);
    }

    public ListLogConfigsResponse listLogConfigsWithOptions(ListLogConfigsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("ListLogConfigs", "2019-05-06", "HTTPS", "GET", "AK", "/pop/v1/sam/log/listLogConfigs", com.aliyun.teautil.Common.stringifyMapValue(TeaModel.buildMap(request.query)), request.headers, null, runtime), new ListLogConfigsResponse());
    }

    public ListLogConfigsResponse listLogConfigs(ListLogConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listLogConfigsWithOptions(request, runtime);
    }

    public RestartApplicationResponse restartApplicationWithOptions(RestartApplicationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("RestartApplication", "2019-05-06", "HTTPS", "PUT", "AK", "/pop/v1/sam/app/restartApplication", com.aliyun.teautil.Common.stringifyMapValue(TeaModel.buildMap(request.query)), request.headers, null, runtime), new RestartApplicationResponse());
    }

    public RestartApplicationResponse restartApplication(RestartApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.restartApplicationWithOptions(request, runtime);
    }

    public RescaleApplicationResponse rescaleApplicationWithOptions(RescaleApplicationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("RescaleApplication", "2019-05-06", "HTTPS", "PUT", "AK", "/pop/v1/sam/app/rescaleApplication", com.aliyun.teautil.Common.stringifyMapValue(TeaModel.buildMap(request.query)), request.headers, null, runtime), new RescaleApplicationResponse());
    }

    public RescaleApplicationResponse rescaleApplication(RescaleApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.rescaleApplicationWithOptions(request, runtime);
    }

    public DeleteApplicationResponse deleteApplicationWithOptions(DeleteApplicationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("DeleteApplication", "2019-05-06", "HTTPS", "DELETE", "AK", "/pop/v1/sam/app/deleteApplication", com.aliyun.teautil.Common.stringifyMapValue(TeaModel.buildMap(request.query)), request.headers, null, runtime), new DeleteApplicationResponse());
    }

    public DeleteApplicationResponse deleteApplication(DeleteApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteApplicationWithOptions(request, runtime);
    }

    public DescribeChangeOrderResponse describeChangeOrderWithOptions(DescribeChangeOrderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("DescribeChangeOrder", "2019-05-06", "HTTPS", "GET", "AK", "/pop/v1/sam/changeorder/DescribeChangeOrder", com.aliyun.teautil.Common.stringifyMapValue(TeaModel.buildMap(request.query)), request.headers, null, runtime), new DescribeChangeOrderResponse());
    }

    public DescribeChangeOrderResponse describeChangeOrder(DescribeChangeOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeChangeOrderWithOptions(request, runtime);
    }

    public AbortChangeOrderResponse abortChangeOrderWithOptions(AbortChangeOrderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("AbortChangeOrder", "2019-05-06", "HTTPS", "PUT", "AK", "/pop/v1/sam/changeorder/AbortChangeOrder", com.aliyun.teautil.Common.stringifyMapValue(TeaModel.buildMap(request.query)), request.headers, null, runtime), new AbortChangeOrderResponse());
    }

    public AbortChangeOrderResponse abortChangeOrder(AbortChangeOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.abortChangeOrderWithOptions(request, runtime);
    }

    public AbortAndRollbackChangeOrderResponse abortAndRollbackChangeOrderWithOptions(AbortAndRollbackChangeOrderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("AbortAndRollbackChangeOrder", "2019-05-06", "HTTPS", "PUT", "AK", "/pop/v1/sam/changeorder/AbortAndRollbackChangeOrder", com.aliyun.teautil.Common.stringifyMapValue(TeaModel.buildMap(request.query)), request.headers, null, runtime), new AbortAndRollbackChangeOrderResponse());
    }

    public AbortAndRollbackChangeOrderResponse abortAndRollbackChangeOrder(AbortAndRollbackChangeOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.abortAndRollbackChangeOrderWithOptions(request, runtime);
    }

    public ConfirmPipelineBatchResponse confirmPipelineBatchWithOptions(ConfirmPipelineBatchRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("ConfirmPipelineBatch", "2019-05-06", "HTTPS", "GET", "AK", "/pop/v1/sam/changeorder/ConfirmPipelineBatch", com.aliyun.teautil.Common.stringifyMapValue(TeaModel.buildMap(request.query)), request.headers, null, runtime), new ConfirmPipelineBatchResponse());
    }

    public ConfirmPipelineBatchResponse confirmPipelineBatch(ConfirmPipelineBatchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.confirmPipelineBatchWithOptions(request, runtime);
    }

    public ListChangeOrdersResponse listChangeOrdersWithOptions(ListChangeOrdersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("ListChangeOrders", "2019-05-06", "HTTPS", "GET", "AK", "/pop/v1/sam/changeorder/ListChangeOrders", com.aliyun.teautil.Common.stringifyMapValue(TeaModel.buildMap(request.query)), request.headers, null, runtime), new ListChangeOrdersResponse());
    }

    public ListChangeOrdersResponse listChangeOrders(ListChangeOrdersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listChangeOrdersWithOptions(request, runtime);
    }

    public DescribeNamespaceListResponse describeNamespaceListWithOptions(DescribeNamespaceListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("DescribeNamespaceList", "2019-05-06", "HTTPS", "GET", "AK", "/pop/v1/sam/namespace/describeNamespaceList", com.aliyun.teautil.Common.stringifyMapValue(TeaModel.buildMap(request.query)), request.headers, null, runtime), new DescribeNamespaceListResponse());
    }

    public DescribeNamespaceListResponse describeNamespaceList(DescribeNamespaceListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeNamespaceListWithOptions(request, runtime);
    }

    public StartApplicationResponse startApplicationWithOptions(StartApplicationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("StartApplication", "2019-05-06", "HTTPS", "PUT", "AK", "/pop/v1/sam/app/startApplication", com.aliyun.teautil.Common.stringifyMapValue(TeaModel.buildMap(request.query)), request.headers, null, runtime), new StartApplicationResponse());
    }

    public StartApplicationResponse startApplication(StartApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startApplicationWithOptions(request, runtime);
    }

    public StopApplicationResponse stopApplicationWithOptions(StopApplicationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("StopApplication", "2019-05-06", "HTTPS", "PUT", "AK", "/pop/v1/sam/app/stopApplication", com.aliyun.teautil.Common.stringifyMapValue(TeaModel.buildMap(request.query)), request.headers, null, runtime), new StopApplicationResponse());
    }

    public StopApplicationResponse stopApplication(StopApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopApplicationWithOptions(request, runtime);
    }

    public QueryResourceStaticsResponse queryResourceStaticsWithOptions(QueryResourceStaticsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("QueryResourceStatics", "2019-05-06", "HTTPS", "GET", "AK", "/pop/v1/paas/quota/queryResourceStatics", com.aliyun.teautil.Common.stringifyMapValue(TeaModel.buildMap(request.query)), request.headers, null, runtime), new QueryResourceStaticsResponse());
    }

    public QueryResourceStaticsResponse queryResourceStatics(QueryResourceStaticsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryResourceStaticsWithOptions(request, runtime);
    }

    public DescribeApplicationSlbsResponse describeApplicationSlbsWithOptions(DescribeApplicationSlbsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("DescribeApplicationSlbs", "2019-05-06", "HTTPS", "GET", "AK", "/pop/v1/sam/app/slb", com.aliyun.teautil.Common.stringifyMapValue(TeaModel.buildMap(request.query)), request.headers, null, runtime), new DescribeApplicationSlbsResponse());
    }

    public DescribeApplicationSlbsResponse describeApplicationSlbs(DescribeApplicationSlbsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeApplicationSlbsWithOptions(request, runtime);
    }

    public BindSlbResponse bindSlbWithOptions(BindSlbRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("BindSlb", "2019-05-06", "HTTPS", "POST", "AK", "/pop/v1/sam/app/slb", com.aliyun.teautil.Common.stringifyMapValue(TeaModel.buildMap(request.query)), request.headers, null, runtime), new BindSlbResponse());
    }

    public BindSlbResponse bindSlb(BindSlbRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.bindSlbWithOptions(request, runtime);
    }

    public UnbindSlbResponse unbindSlbWithOptions(UnbindSlbRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("UnbindSlb", "2019-05-06", "HTTPS", "DELETE", "AK", "/pop/v1/sam/app/slb", com.aliyun.teautil.Common.stringifyMapValue(TeaModel.buildMap(request.query)), request.headers, null, runtime), new UnbindSlbResponse());
    }

    public UnbindSlbResponse unbindSlb(UnbindSlbRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unbindSlbWithOptions(request, runtime);
    }

    public CreateApplicationResponse createApplicationWithOptions(CreateApplicationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("CreateApplication", "2019-05-06", "HTTPS", "POST", "AK", "/pop/v1/sam/app/createApplication", com.aliyun.teautil.Common.stringifyMapValue(TeaModel.buildMap(request.query)), request.headers, TeaModel.buildMap(request.body), runtime), new CreateApplicationResponse());
    }

    public CreateApplicationResponse createApplication(CreateApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createApplicationWithOptions(request, runtime);
    }

    public DeployApplicationResponse deployApplicationWithOptions(String nasId, String mountHost, String mountDesc, DeployApplicationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("DeployApplication", "2019-05-06", "HTTPS", "POST", "AK", "/pop/v1/sam/app/deployApplication", com.aliyun.teautil.Common.stringifyMapValue(TeaModel.buildMap(request.query)), request.headers, TeaModel.buildMap(request.body), runtime), new DeployApplicationResponse());
    }

    public DeployApplicationResponse deployApplication(String nasId, String mountHost, String mountDesc, DeployApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deployApplicationWithOptions(nasId, mountHost, mountDesc, request, runtime);
    }

    public DescribeApplicationConfigResponse describeApplicationConfigWithOptions(DescribeApplicationConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("DescribeApplicationConfig", "2019-05-06", "HTTPS", "GET", "AK", "/pop/v1/sam/app/describeApplicationConfig", com.aliyun.teautil.Common.stringifyMapValue(TeaModel.buildMap(request.query)), request.headers, null, runtime), new DescribeApplicationConfigResponse());
    }

    public DescribeApplicationConfigResponse describeApplicationConfig(DescribeApplicationConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeApplicationConfigWithOptions(request, runtime);
    }

    public DescribeApplicationStatusResponse describeApplicationStatusWithOptions(DescribeApplicationStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("DescribeApplicationStatus", "2019-05-06", "HTTPS", "GET", "AK", "/pop/v1/sam/app/describeApplicationStatus", com.aliyun.teautil.Common.stringifyMapValue(TeaModel.buildMap(request.query)), request.headers, null, runtime), new DescribeApplicationStatusResponse());
    }

    public DescribeApplicationStatusResponse describeApplicationStatus(DescribeApplicationStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeApplicationStatusWithOptions(request, runtime);
    }

    public RescaleApplicationVerticallyResponse rescaleApplicationVerticallyWithOptions(RescaleApplicationVerticallyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("RescaleApplicationVertically", "2019-05-06", "HTTPS", "POST", "AK", "/pop/v1/sam/app/rescaleApplicationVertically", com.aliyun.teautil.Common.stringifyMapValue(TeaModel.buildMap(request.query)), request.headers, null, runtime), new RescaleApplicationVerticallyResponse());
    }

    public RescaleApplicationVerticallyResponse rescaleApplicationVertically(RescaleApplicationVerticallyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.rescaleApplicationVerticallyWithOptions(request, runtime);
    }

    public DescribeInstanceLogResponse describeInstanceLogWithOptions(DescribeInstanceLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("DescribeInstanceLog", "2019-05-06", "HTTPS", "GET", "AK", "/pop/v1/sam/instance/describeInstanceLog", com.aliyun.teautil.Common.stringifyMapValue(TeaModel.buildMap(request.query)), request.headers, null, runtime), new DescribeInstanceLogResponse());
    }

    public DescribeInstanceLogResponse describeInstanceLog(DescribeInstanceLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceLogWithOptions(request, runtime);
    }

    public DescribeApplicationInstancesResponse describeApplicationInstancesWithOptions(DescribeApplicationInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("DescribeApplicationInstances", "2019-05-06", "HTTPS", "GET", "AK", "/pop/v1/sam/app/describeApplicationInstances", com.aliyun.teautil.Common.stringifyMapValue(TeaModel.buildMap(request.query)), request.headers, null, runtime), new DescribeApplicationInstancesResponse());
    }

    public DescribeApplicationInstancesResponse describeApplicationInstances(DescribeApplicationInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeApplicationInstancesWithOptions(request, runtime);
    }

    public DescribeApplicationGroupsResponse describeApplicationGroupsWithOptions(DescribeApplicationGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("DescribeApplicationGroups", "2019-05-06", "HTTPS", "GET", "AK", "/pop/v1/sam/app/describeApplicationGroups", com.aliyun.teautil.Common.stringifyMapValue(TeaModel.buildMap(request.query)), request.headers, null, runtime), new DescribeApplicationGroupsResponse());
    }

    public DescribeApplicationGroupsResponse describeApplicationGroups(DescribeApplicationGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeApplicationGroupsWithOptions(request, runtime);
    }

    public DescribeApplicationImageResponse describeApplicationImageWithOptions(DescribeApplicationImageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("DescribeApplicationImage", "2019-05-06", "HTTPS", "GET", "AK", "/pop/v1/sam/container/describeApplicationImage", com.aliyun.teautil.Common.stringifyMapValue(TeaModel.buildMap(request.query)), request.headers, null, runtime), new DescribeApplicationImageResponse());
    }

    public DescribeApplicationImageResponse describeApplicationImage(DescribeApplicationImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeApplicationImageWithOptions(request, runtime);
    }

    public DescribeEdasContainersResponse describeEdasContainersWithOptions(DescribeEdasContainersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("DescribeEdasContainers", "2019-05-06", "HTTPS", "GET", "AK", "/pop/v1/sam/resource/edasContainers", null, request.headers, null, runtime), new DescribeEdasContainersResponse());
    }

    public DescribeEdasContainersResponse describeEdasContainers(DescribeEdasContainersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEdasContainersWithOptions(request, runtime);
    }

    public CreateNamespaceResponse createNamespaceWithOptions(CreateNamespaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("CreateNamespace", "2019-05-06", "HTTPS", "POST", "AK", "/pop/v1/paas/namespace", com.aliyun.teautil.Common.stringifyMapValue(TeaModel.buildMap(request.query)), request.headers, null, runtime), new CreateNamespaceResponse());
    }

    public CreateNamespaceResponse createNamespace(CreateNamespaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createNamespaceWithOptions(request, runtime);
    }

    public ListApplicationsResponse listApplicationsWithOptions(ListApplicationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("ListApplications", "2019-05-06", "HTTPS", "GET", "AK", "/pop/v1/sam/app/listApplications", com.aliyun.teautil.Common.stringifyMapValue(TeaModel.buildMap(request.query)), request.headers, null, runtime), new ListApplicationsResponse());
    }

    public ListApplicationsResponse listApplications(ListApplicationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listApplicationsWithOptions(request, runtime);
    }

    public DeleteNamespaceResponse deleteNamespaceWithOptions(DeleteNamespaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("DeleteNamespace", "2019-05-06", "HTTPS", "DELETE", "AK", "/pop/v1/paas/namespace", com.aliyun.teautil.Common.stringifyMapValue(TeaModel.buildMap(request.query)), request.headers, null, runtime), new DeleteNamespaceResponse());
    }

    public DeleteNamespaceResponse deleteNamespace(DeleteNamespaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteNamespaceWithOptions(request, runtime);
    }

    public UpdateNamespaceResponse updateNamespaceWithOptions(UpdateNamespaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("UpdateNamespace", "2019-05-06", "HTTPS", "PUT", "AK", "/pop/v1/paas/namespace", com.aliyun.teautil.Common.stringifyMapValue(TeaModel.buildMap(request.query)), request.headers, null, runtime), new UpdateNamespaceResponse());
    }

    public UpdateNamespaceResponse updateNamespace(UpdateNamespaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateNamespaceWithOptions(request, runtime);
    }

    public DescribeNamespaceResponse describeNamespaceWithOptions(DescribeNamespaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("DescribeNamespace", "2019-05-06", "HTTPS", "GET", "AK", "/pop/v1/paas/namespace", com.aliyun.teautil.Common.stringifyMapValue(TeaModel.buildMap(request.query)), request.headers, null, runtime), new DescribeNamespaceResponse());
    }

    public DescribeNamespaceResponse describeNamespace(DescribeNamespaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeNamespaceWithOptions(request, runtime);
    }

    public DescribeNamespacesResponse describeNamespacesWithOptions(DescribeNamespacesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("DescribeNamespaces", "2019-05-06", "HTTPS", "GET", "AK", "/pop/v1/paas/namespaces", com.aliyun.teautil.Common.stringifyMapValue(TeaModel.buildMap(request.query)), request.headers, null, runtime), new DescribeNamespacesResponse());
    }

    public DescribeNamespacesResponse describeNamespaces(DescribeNamespacesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeNamespacesWithOptions(request, runtime);
    }

    public ListConsumedServicesResponse listConsumedServicesWithOptions(ListConsumedServicesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("ListConsumedServices", "2019-05-06", "HTTPS", "GET", "AK", "/pop/v1/sam/service/listConsumedServices", com.aliyun.teautil.Common.stringifyMapValue(TeaModel.buildMap(request.query)), request.headers, null, runtime), new ListConsumedServicesResponse());
    }

    public ListConsumedServicesResponse listConsumedServices(ListConsumedServicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listConsumedServicesWithOptions(request, runtime);
    }

    public ListPublishedServicesResponse listPublishedServicesWithOptions(ListPublishedServicesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("ListPublishedServices", "2019-05-06", "HTTPS", "GET", "AK", "/pop/v1/sam/service/listPublishedServices", com.aliyun.teautil.Common.stringifyMapValue(TeaModel.buildMap(request.query)), request.headers, null, runtime), new ListPublishedServicesResponse());
    }

    public ListPublishedServicesResponse listPublishedServices(ListPublishedServicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPublishedServicesWithOptions(request, runtime);
    }

    public DescribeComponentsResponse describeComponentsWithOptions(DescribeComponentsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("DescribeComponents", "2019-05-06", "HTTPS", "GET", "AK", "/pop/v1/sam/resource/components", com.aliyun.teautil.Common.stringifyMapValue(TeaModel.buildMap(request.query)), request.headers, null, runtime), new DescribeComponentsResponse());
    }

    public DescribeComponentsResponse describeComponents(DescribeComponentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeComponentsWithOptions(request, runtime);
    }

    public DescribeInstanceSpecificationsResponse describeInstanceSpecificationsWithOptions(DescribeInstanceSpecificationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("DescribeInstanceSpecifications", "2019-05-06", "HTTPS", "GET", "AK", "/pop/v1/paas/quota/instanceSpecifications", null, request.headers, null, runtime), new DescribeInstanceSpecificationsResponse());
    }

    public DescribeInstanceSpecificationsResponse describeInstanceSpecifications(DescribeInstanceSpecificationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceSpecificationsWithOptions(request, runtime);
    }

    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("DescribeRegions", "2019-05-06", "HTTPS", "GET", "AK", "/pop/v1/paas/regionConfig", null, request.headers, null, runtime), new DescribeRegionsResponse());
    }

    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRegionsWithOptions(request, runtime);
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
}
