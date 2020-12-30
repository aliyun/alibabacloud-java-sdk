// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20180619;

import com.aliyun.tea.*;
import com.aliyun.openanalytics_open20180619.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
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


    public String getEndpoint(String productId, String regionId, String endpointRule, String network, String suffix, java.util.Map<String, String> endpointMap, String endpoint) throws Exception {
        if (!com.aliyun.teautil.Common.empty(endpoint)) {
            return endpoint;
        }

        if (!com.aliyun.teautil.Common.isUnset(endpointMap) && !com.aliyun.teautil.Common.empty(endpointMap.get(regionId))) {
            return endpointMap.get(regionId);
        }

        return com.aliyun.endpointutil.Client.getEndpointRules(productId, regionId, endpointRule, network, suffix);
    }

    public AddAccountResponse addAccountWithOptions(AddAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddAccount", "2018-06-19", "HTTPS", "POST", "AK", "json", req, runtime), new AddAccountResponse());
    }

    public AddAccountResponse addAccount(AddAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addAccountWithOptions(request, runtime);
    }

    public AddEndPointResponse addEndPointWithOptions(AddEndPointRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddEndPoint", "2018-06-19", "HTTPS", "POST", "AK", "json", req, runtime), new AddEndPointResponse());
    }

    public AddEndPointResponse addEndPoint(AddEndPointRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addEndPointWithOptions(request, runtime);
    }

    public CreateInstanceResponse createInstanceWithOptions(CreateInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateInstance", "2018-06-19", "HTTPS", "POST", "AK", "json", req, runtime), new CreateInstanceResponse());
    }

    public CreateInstanceResponse createInstance(CreateInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createInstanceWithOptions(request, runtime);
    }

    public DeleteAccountResponse deleteAccountWithOptions(DeleteAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteAccount", "2018-06-19", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteAccountResponse());
    }

    public DeleteAccountResponse deleteAccount(DeleteAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAccountWithOptions(request, runtime);
    }

    public GetAllowIPResponse getAllowIPWithOptions(GetAllowIPRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAllowIP", "2018-06-19", "HTTPS", "POST", "AK", "json", req, runtime), new GetAllowIPResponse());
    }

    public GetAllowIPResponse getAllowIP(GetAllowIPRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAllowIPWithOptions(request, runtime);
    }

    public GetEndPointResponse getEndPointWithOptions(GetEndPointRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetEndPoint", "2018-06-19", "HTTPS", "POST", "AK", "json", req, runtime), new GetEndPointResponse());
    }

    public GetEndPointResponse getEndPoint(GetEndPointRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getEndPointWithOptions(request, runtime);
    }

    public GetEndPointByDomainResponse getEndPointByDomainWithOptions(GetEndPointByDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetEndPointByDomain", "2018-06-19", "HTTPS", "POST", "AK", "json", req, runtime), new GetEndPointByDomainResponse());
    }

    public GetEndPointByDomainResponse getEndPointByDomain(GetEndPointByDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getEndPointByDomainWithOptions(request, runtime);
    }

    public GetJobDetailResponse getJobDetailWithOptions(GetJobDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetJobDetail", "2018-06-19", "HTTPS", "POST", "AK", "json", req, runtime), new GetJobDetailResponse());
    }

    public GetJobDetailResponse getJobDetail(GetJobDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getJobDetailWithOptions(request, runtime);
    }

    public GetJobLogResponse getJobLogWithOptions(GetJobLogRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetJobLog", "2018-06-19", "HTTPS", "POST", "AK", "json", req, runtime), new GetJobLogResponse());
    }

    public GetJobLogResponse getJobLog(GetJobLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getJobLogWithOptions(request, runtime);
    }

    public GetJobStatusResponse getJobStatusWithOptions(GetJobStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetJobStatus", "2018-06-19", "HTTPS", "POST", "AK", "json", req, runtime), new GetJobStatusResponse());
    }

    public GetJobStatusResponse getJobStatus(GetJobStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getJobStatusWithOptions(request, runtime);
    }

    public KillSparkJobResponse killSparkJobWithOptions(KillSparkJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("KillSparkJob", "2018-06-19", "HTTPS", "POST", "AK", "json", req, runtime), new KillSparkJobResponse());
    }

    public KillSparkJobResponse killSparkJob(KillSparkJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.killSparkJobWithOptions(request, runtime);
    }

    public ListSparkJobResponse listSparkJobWithOptions(ListSparkJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListSparkJob", "2018-06-19", "HTTPS", "POST", "AK", "json", req, runtime), new ListSparkJobResponse());
    }

    public ListSparkJobResponse listSparkJob(ListSparkJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listSparkJobWithOptions(request, runtime);
    }

    public QueryAccountListResponse queryAccountListWithOptions(QueryAccountListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryAccountList", "2018-06-19", "HTTPS", "POST", "AK", "json", req, runtime), new QueryAccountListResponse());
    }

    public QueryAccountListResponse queryAccountList(QueryAccountListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryAccountListWithOptions(request, runtime);
    }

    public QueryEndPointListResponse queryEndPointListWithOptions(QueryEndPointListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryEndPointList", "2018-06-19", "HTTPS", "POST", "AK", "json", req, runtime), new QueryEndPointListResponse());
    }

    public QueryEndPointListResponse queryEndPointList(QueryEndPointListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryEndPointListWithOptions(request, runtime);
    }

    public ReleaseInstanceResponse releaseInstanceWithOptions(ReleaseInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ReleaseInstance", "2018-06-19", "HTTPS", "POST", "AK", "json", req, runtime), new ReleaseInstanceResponse());
    }

    public ReleaseInstanceResponse releaseInstance(ReleaseInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.releaseInstanceWithOptions(request, runtime);
    }

    public RemoveEndPointResponse removeEndPointWithOptions(RemoveEndPointRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RemoveEndPoint", "2018-06-19", "HTTPS", "POST", "AK", "json", req, runtime), new RemoveEndPointResponse());
    }

    public RemoveEndPointResponse removeEndPoint(RemoveEndPointRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeEndPointWithOptions(request, runtime);
    }

    public ResetMainPasswordResponse resetMainPasswordWithOptions(ResetMainPasswordRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ResetMainPassword", "2018-06-19", "HTTPS", "POST", "AK", "json", req, runtime), new ResetMainPasswordResponse());
    }

    public ResetMainPasswordResponse resetMainPassword(ResetMainPasswordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.resetMainPasswordWithOptions(request, runtime);
    }

    public SetAllowIPResponse setAllowIPWithOptions(SetAllowIPRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetAllowIP", "2018-06-19", "HTTPS", "POST", "AK", "json", req, runtime), new SetAllowIPResponse());
    }

    public SetAllowIPResponse setAllowIP(SetAllowIPRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setAllowIPWithOptions(request, runtime);
    }

    public SubmitSparkJobResponse submitSparkJobWithOptions(SubmitSparkJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SubmitSparkJob", "2018-06-19", "HTTPS", "POST", "AK", "json", req, runtime), new SubmitSparkJobResponse());
    }

    public SubmitSparkJobResponse submitSparkJob(SubmitSparkJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitSparkJobWithOptions(request, runtime);
    }

    public UnSubscribeRegionResponse unSubscribeRegionWithOptions(UnSubscribeRegionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UnSubscribeRegion", "2018-06-19", "HTTPS", "POST", "AK", "json", req, runtime), new UnSubscribeRegionResponse());
    }

    public UnSubscribeRegionResponse unSubscribeRegion(UnSubscribeRegionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unSubscribeRegionWithOptions(request, runtime);
    }

    public UpdateAccountPasswordResponse updateAccountPasswordWithOptions(UpdateAccountPasswordRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateAccountPassword", "2018-06-19", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateAccountPasswordResponse());
    }

    public UpdateAccountPasswordResponse updateAccountPassword(UpdateAccountPasswordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateAccountPasswordWithOptions(request, runtime);
    }

    public UpgradeInstanceResponse upgradeInstanceWithOptions(UpgradeInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpgradeInstance", "2018-06-19", "HTTPS", "POST", "AK", "json", req, runtime), new UpgradeInstanceResponse());
    }

    public UpgradeInstanceResponse upgradeInstance(UpgradeInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.upgradeInstanceWithOptions(request, runtime);
    }

    public ValidateVirtualClusterNameResponse validateVirtualClusterNameWithOptions(ValidateVirtualClusterNameRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ValidateVirtualClusterName", "2018-06-19", "HTTPS", "POST", "AK", "json", req, runtime), new ValidateVirtualClusterNameResponse());
    }

    public ValidateVirtualClusterNameResponse validateVirtualClusterName(ValidateVirtualClusterNameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.validateVirtualClusterNameWithOptions(request, runtime);
    }
}
