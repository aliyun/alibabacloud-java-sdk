// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20180619;

import com.aliyun.tea.*;
import com.aliyun.openanalytics_open20180619.models.*;

public class Client extends com.aliyun.tearpc.Client {

    public Client(com.aliyun.tearpc.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "central";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-beijing", "openanalytics.cn-beijing.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "openanalytics.cn-zhangjiakou.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "openanalytics.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-shanghai", "openanalytics.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "openanalytics.cn-shenzhen.aliyuncs.com"),
            new TeaPair("cn-hongkong", "openanalytics.cn-hongkong.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "openanalytics.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "datalakeanalytics.ap-southeast-2.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "openanalytics.ap-southeast-3.aliyuncs.com"),
            new TeaPair("ap-northeast-1", "datalakeanalytics.ap-northeast-1.aliyuncs.com"),
            new TeaPair("eu-west-1", "openanalytics.eu-west-1.aliyuncs.com"),
            new TeaPair("us-west-1", "openanalytics.us-west-1.aliyuncs.com"),
            new TeaPair("us-east-1", "datalakeanalytics.us-east-1.aliyuncs.com"),
            new TeaPair("eu-central-1", "datalakeanalytics.eu-central-1.aliyuncs.com"),
            new TeaPair("ap-south-1", "openanalytics.ap-south-1.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "openanalytics.ap-northeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "openanalytics.ap-southeast-5.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "openanalytics.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "openanalytics.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "openanalytics.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "openanalytics.aliyuncs.com"),
            new TeaPair("cn-chengdu", "openanalytics.aliyuncs.com"),
            new TeaPair("cn-edge-1", "openanalytics.aliyuncs.com"),
            new TeaPair("cn-fujian", "openanalytics.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "openanalytics.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "openanalytics.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "openanalytics.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "openanalytics.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "openanalytics.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "openanalytics.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "openanalytics.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "openanalytics.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "openanalytics.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "openanalytics.cn-huhehaote.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "openanalytics.aliyuncs.com"),
            new TeaPair("cn-qingdao", "openanalytics.cn-qingdao.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "openanalytics.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "openanalytics.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "openanalytics.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "openanalytics.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "openanalytics.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "openanalytics.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "openanalytics.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "openanalytics.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "openanalytics.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "openanalytics.aliyuncs.com"),
            new TeaPair("cn-wuhan", "openanalytics.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "openanalytics.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "openanalytics.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "openanalytics.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "openanalytics.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "openanalytics.ap-northeast-1.aliyuncs.com"),
            new TeaPair("me-east-1", "openanalytics.me-east-1.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "openanalytics.ap-northeast-1.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("openanalytics-open", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
    }


    public ValidateVirtualClusterNameResponse validateVirtualClusterNameWithOptions(ValidateVirtualClusterNameRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ValidateVirtualClusterName", "HTTPS", "POST", "2018-06-19", "AK", null, TeaModel.buildMap(request), runtime), new ValidateVirtualClusterNameResponse());
    }

    public ValidateVirtualClusterNameResponse validateVirtualClusterName(ValidateVirtualClusterNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.validateVirtualClusterNameWithOptions(request, runtime);
    }

    public UpgradeInstanceResponse upgradeInstanceWithOptions(UpgradeInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpgradeInstance", "HTTPS", "POST", "2018-06-19", "AK", null, TeaModel.buildMap(request), runtime), new UpgradeInstanceResponse());
    }

    public UpgradeInstanceResponse upgradeInstance(UpgradeInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.upgradeInstanceWithOptions(request, runtime);
    }

    public CreateInstanceResponse createInstanceWithOptions(CreateInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateInstance", "HTTPS", "POST", "2018-06-19", "AK", null, TeaModel.buildMap(request), runtime), new CreateInstanceResponse());
    }

    public CreateInstanceResponse createInstance(CreateInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createInstanceWithOptions(request, runtime);
    }

    public ReleaseInstanceResponse releaseInstanceWithOptions(ReleaseInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ReleaseInstance", "HTTPS", "POST", "2018-06-19", "AK", null, TeaModel.buildMap(request), runtime), new ReleaseInstanceResponse());
    }

    public ReleaseInstanceResponse releaseInstance(ReleaseInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.releaseInstanceWithOptions(request, runtime);
    }

    public GetJobDetailResponse getJobDetailWithOptions(GetJobDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetJobDetail", "HTTPS", "POST", "2018-06-19", "AK", null, TeaModel.buildMap(request), runtime), new GetJobDetailResponse());
    }

    public GetJobDetailResponse getJobDetail(GetJobDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getJobDetailWithOptions(request, runtime);
    }

    public GetJobStatusResponse getJobStatusWithOptions(GetJobStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetJobStatus", "HTTPS", "POST", "2018-06-19", "AK", null, TeaModel.buildMap(request), runtime), new GetJobStatusResponse());
    }

    public GetJobStatusResponse getJobStatus(GetJobStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getJobStatusWithOptions(request, runtime);
    }

    public KillSparkJobResponse killSparkJobWithOptions(KillSparkJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("KillSparkJob", "HTTPS", "POST", "2018-06-19", "AK", null, TeaModel.buildMap(request), runtime), new KillSparkJobResponse());
    }

    public KillSparkJobResponse killSparkJob(KillSparkJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.killSparkJobWithOptions(request, runtime);
    }

    public SubmitSparkJobResponse submitSparkJobWithOptions(SubmitSparkJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SubmitSparkJob", "HTTPS", "POST", "2018-06-19", "AK", null, TeaModel.buildMap(request), runtime), new SubmitSparkJobResponse());
    }

    public SubmitSparkJobResponse submitSparkJob(SubmitSparkJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitSparkJobWithOptions(request, runtime);
    }

    public GetJobLogResponse getJobLogWithOptions(GetJobLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetJobLog", "HTTPS", "POST", "2018-06-19", "AK", null, TeaModel.buildMap(request), runtime), new GetJobLogResponse());
    }

    public GetJobLogResponse getJobLog(GetJobLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getJobLogWithOptions(request, runtime);
    }

    public ListSparkJobResponse listSparkJobWithOptions(ListSparkJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListSparkJob", "HTTPS", "POST", "2018-06-19", "AK", null, TeaModel.buildMap(request), runtime), new ListSparkJobResponse());
    }

    public ListSparkJobResponse listSparkJob(ListSparkJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSparkJobWithOptions(request, runtime);
    }

    public GetAllowIPResponse getAllowIPWithOptions(GetAllowIPRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetAllowIP", "HTTPS", "POST", "2018-06-19", "AK", null, TeaModel.buildMap(request), runtime), new GetAllowIPResponse());
    }

    public GetAllowIPResponse getAllowIP(GetAllowIPRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAllowIPWithOptions(request, runtime);
    }

    public SetAllowIPResponse setAllowIPWithOptions(SetAllowIPRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SetAllowIP", "HTTPS", "POST", "2018-06-19", "AK", null, TeaModel.buildMap(request), runtime), new SetAllowIPResponse());
    }

    public SetAllowIPResponse setAllowIP(SetAllowIPRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setAllowIPWithOptions(request, runtime);
    }

    public ResetMainPasswordResponse resetMainPasswordWithOptions(ResetMainPasswordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ResetMainPassword", "HTTPS", "POST", "2018-06-19", "AK", null, TeaModel.buildMap(request), runtime), new ResetMainPasswordResponse());
    }

    public ResetMainPasswordResponse resetMainPassword(ResetMainPasswordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resetMainPasswordWithOptions(request, runtime);
    }

    public UnSubscribeRegionResponse unSubscribeRegionWithOptions(UnSubscribeRegionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UnSubscribeRegion", "HTTPS", "POST", "2018-06-19", "AK", null, TeaModel.buildMap(request), runtime), new UnSubscribeRegionResponse());
    }

    public UnSubscribeRegionResponse unSubscribeRegion(UnSubscribeRegionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unSubscribeRegionWithOptions(request, runtime);
    }

    public QueryAccountListResponse queryAccountListWithOptions(QueryAccountListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryAccountList", "HTTPS", "POST", "2018-06-19", "AK", null, TeaModel.buildMap(request), runtime), new QueryAccountListResponse());
    }

    public QueryAccountListResponse queryAccountList(QueryAccountListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryAccountListWithOptions(request, runtime);
    }

    public DeleteAccountResponse deleteAccountWithOptions(DeleteAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteAccount", "HTTPS", "POST", "2018-06-19", "AK", null, TeaModel.buildMap(request), runtime), new DeleteAccountResponse());
    }

    public DeleteAccountResponse deleteAccount(DeleteAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAccountWithOptions(request, runtime);
    }

    public AddAccountResponse addAccountWithOptions(AddAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddAccount", "HTTPS", "POST", "2018-06-19", "AK", null, TeaModel.buildMap(request), runtime), new AddAccountResponse());
    }

    public AddAccountResponse addAccount(AddAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addAccountWithOptions(request, runtime);
    }

    public UpdateAccountPasswordResponse updateAccountPasswordWithOptions(UpdateAccountPasswordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateAccountPassword", "HTTPS", "POST", "2018-06-19", "AK", null, TeaModel.buildMap(request), runtime), new UpdateAccountPasswordResponse());
    }

    public UpdateAccountPasswordResponse updateAccountPassword(UpdateAccountPasswordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAccountPasswordWithOptions(request, runtime);
    }

    public RemoveEndPointResponse removeEndPointWithOptions(RemoveEndPointRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RemoveEndPoint", "HTTPS", "POST", "2018-06-19", "AK", null, TeaModel.buildMap(request), runtime), new RemoveEndPointResponse());
    }

    public RemoveEndPointResponse removeEndPoint(RemoveEndPointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeEndPointWithOptions(request, runtime);
    }

    public QueryEndPointListResponse queryEndPointListWithOptions(QueryEndPointListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryEndPointList", "HTTPS", "POST", "2018-06-19", "AK", null, TeaModel.buildMap(request), runtime), new QueryEndPointListResponse());
    }

    public QueryEndPointListResponse queryEndPointList(QueryEndPointListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryEndPointListWithOptions(request, runtime);
    }

    public AddEndPointResponse addEndPointWithOptions(AddEndPointRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddEndPoint", "HTTPS", "POST", "2018-06-19", "AK", null, TeaModel.buildMap(request), runtime), new AddEndPointResponse());
    }

    public AddEndPointResponse addEndPoint(AddEndPointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addEndPointWithOptions(request, runtime);
    }

    public GetEndPointResponse getEndPointWithOptions(GetEndPointRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetEndPoint", "HTTPS", "POST", "2018-06-19", "AK", null, TeaModel.buildMap(request), runtime), new GetEndPointResponse());
    }

    public GetEndPointResponse getEndPoint(GetEndPointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getEndPointWithOptions(request, runtime);
    }

    public GetEndPointByDomainResponse getEndPointByDomainWithOptions(GetEndPointByDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetEndPointByDomain", "HTTPS", "POST", "2018-06-19", "AK", null, TeaModel.buildMap(request), runtime), new GetEndPointByDomainResponse());
    }

    public GetEndPointByDomainResponse getEndPointByDomain(GetEndPointByDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getEndPointByDomainWithOptions(request, runtime);
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
