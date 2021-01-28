// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101;

import com.aliyun.tea.*;
import com.aliyun.r_kvstore20150101.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-qingdao", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-beijing", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-shanghai", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-heyuan", "r-kvstore.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "r-kvstore.aliyuncs.com"),
            new TeaPair("us-west-1", "r-kvstore.aliyuncs.com"),
            new TeaPair("us-east-1", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "r-kvstore.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-edge-1", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-fujian", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-huhehaote-nebula-1", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-wuhan", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "r-kvstore.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "r-kvstore.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "r-kvstore.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "r-kvstore.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("r-kvstore", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AddShardingNodeResponse addShardingNodeWithOptions(AddShardingNodeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddShardingNode", "2015-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new AddShardingNodeResponse());
    }

    public AddShardingNodeResponse addShardingNode(AddShardingNodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addShardingNodeWithOptions(request, runtime);
    }

    public AllocateDirectConnectionResponse allocateDirectConnectionWithOptions(AllocateDirectConnectionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AllocateDirectConnection", "2015-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new AllocateDirectConnectionResponse());
    }

    public AllocateDirectConnectionResponse allocateDirectConnection(AllocateDirectConnectionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.allocateDirectConnectionWithOptions(request, runtime);
    }

    public AllocateInstancePublicConnectionResponse allocateInstancePublicConnectionWithOptions(AllocateInstancePublicConnectionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AllocateInstancePublicConnection", "2015-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new AllocateInstancePublicConnectionResponse());
    }

    public AllocateInstancePublicConnectionResponse allocateInstancePublicConnection(AllocateInstancePublicConnectionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.allocateInstancePublicConnectionWithOptions(request, runtime);
    }

    public CreateAccountResponse createAccountWithOptions(CreateAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateAccount", "2015-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateAccountResponse());
    }

    public CreateAccountResponse createAccount(CreateAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAccountWithOptions(request, runtime);
    }

    public CreateBackupResponse createBackupWithOptions(CreateBackupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateBackup", "2015-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateBackupResponse());
    }

    public CreateBackupResponse createBackup(CreateBackupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createBackupWithOptions(request, runtime);
    }

    public CreateCacheAnalysisTaskResponse createCacheAnalysisTaskWithOptions(CreateCacheAnalysisTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateCacheAnalysisTask", "2015-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateCacheAnalysisTaskResponse());
    }

    public CreateCacheAnalysisTaskResponse createCacheAnalysisTask(CreateCacheAnalysisTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createCacheAnalysisTaskWithOptions(request, runtime);
    }

    public CreateGlobalDistributeCacheResponse createGlobalDistributeCacheWithOptions(CreateGlobalDistributeCacheRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateGlobalDistributeCache", "2015-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateGlobalDistributeCacheResponse());
    }

    public CreateGlobalDistributeCacheResponse createGlobalDistributeCache(CreateGlobalDistributeCacheRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createGlobalDistributeCacheWithOptions(request, runtime);
    }

    public CreateInstanceResponse createInstanceWithOptions(CreateInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateInstance", "2015-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateInstanceResponse());
    }

    public CreateInstanceResponse createInstance(CreateInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createInstanceWithOptions(request, runtime);
    }

    public CreateUserClusterHostResponse createUserClusterHostWithOptions(CreateUserClusterHostRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateUserClusterHost", "2015-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateUserClusterHostResponse());
    }

    public CreateUserClusterHostResponse createUserClusterHost(CreateUserClusterHostRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createUserClusterHostWithOptions(request, runtime);
    }

    public DeleteAccountResponse deleteAccountWithOptions(DeleteAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteAccount", "2015-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteAccountResponse());
    }

    public DeleteAccountResponse deleteAccount(DeleteAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAccountWithOptions(request, runtime);
    }

    public DeleteInstanceResponse deleteInstanceWithOptions(DeleteInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteInstance", "2015-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteInstanceResponse());
    }

    public DeleteInstanceResponse deleteInstance(DeleteInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteInstanceWithOptions(request, runtime);
    }

    public DeleteShardingNodeResponse deleteShardingNodeWithOptions(DeleteShardingNodeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteShardingNode", "2015-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteShardingNodeResponse());
    }

    public DeleteShardingNodeResponse deleteShardingNode(DeleteShardingNodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteShardingNodeWithOptions(request, runtime);
    }

    public DeleteUserClusterHostResponse deleteUserClusterHostWithOptions(DeleteUserClusterHostRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteUserClusterHost", "2015-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteUserClusterHostResponse());
    }

    public DeleteUserClusterHostResponse deleteUserClusterHost(DeleteUserClusterHostRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteUserClusterHostWithOptions(request, runtime);
    }

    public DescribeAccountsResponse describeAccountsWithOptions(DescribeAccountsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAccounts", "2015-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAccountsResponse());
    }

    public DescribeAccountsResponse describeAccounts(DescribeAccountsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAccountsWithOptions(request, runtime);
    }

    public DescribeActiveOperationTaskResponse describeActiveOperationTaskWithOptions(DescribeActiveOperationTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeActiveOperationTask", "2015-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeActiveOperationTaskResponse());
    }

    public DescribeActiveOperationTaskResponse describeActiveOperationTask(DescribeActiveOperationTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeActiveOperationTaskWithOptions(request, runtime);
    }

    public DescribeAuditRecordsResponse describeAuditRecordsWithOptions(DescribeAuditRecordsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAuditRecords", "2015-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAuditRecordsResponse());
    }

    public DescribeAuditRecordsResponse describeAuditRecords(DescribeAuditRecordsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAuditRecordsWithOptions(request, runtime);
    }

    public DescribeAvailableResourceResponse describeAvailableResourceWithOptions(DescribeAvailableResourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAvailableResource", "2015-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAvailableResourceResponse());
    }

    public DescribeAvailableResourceResponse describeAvailableResource(DescribeAvailableResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAvailableResourceWithOptions(request, runtime);
    }

    public DescribeBackupPolicyResponse describeBackupPolicyWithOptions(DescribeBackupPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeBackupPolicy", "2015-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeBackupPolicyResponse());
    }

    public DescribeBackupPolicyResponse describeBackupPolicy(DescribeBackupPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeBackupPolicyWithOptions(request, runtime);
    }

    public DescribeBackupsResponse describeBackupsWithOptions(DescribeBackupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeBackups", "2015-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeBackupsResponse());
    }

    public DescribeBackupsResponse describeBackups(DescribeBackupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeBackupsWithOptions(request, runtime);
    }

    public DescribeBackupTasksResponse describeBackupTasksWithOptions(DescribeBackupTasksRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeBackupTasks", "2015-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeBackupTasksResponse());
    }

    public DescribeBackupTasksResponse describeBackupTasks(DescribeBackupTasksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeBackupTasksWithOptions(request, runtime);
    }

    public DescribeCacheAnalysisReportResponse describeCacheAnalysisReportWithOptions(DescribeCacheAnalysisReportRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCacheAnalysisReport", "2015-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCacheAnalysisReportResponse());
    }

    public DescribeCacheAnalysisReportResponse describeCacheAnalysisReport(DescribeCacheAnalysisReportRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCacheAnalysisReportWithOptions(request, runtime);
    }

    public DescribeCacheAnalysisReportListResponse describeCacheAnalysisReportListWithOptions(DescribeCacheAnalysisReportListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCacheAnalysisReportList", "2015-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCacheAnalysisReportListResponse());
    }

    public DescribeCacheAnalysisReportListResponse describeCacheAnalysisReportList(DescribeCacheAnalysisReportListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCacheAnalysisReportListWithOptions(request, runtime);
    }

    public DescribeClusterMemberInfoResponse describeClusterMemberInfoWithOptions(DescribeClusterMemberInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeClusterMemberInfo", "2015-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeClusterMemberInfoResponse());
    }

    public DescribeClusterMemberInfoResponse describeClusterMemberInfo(DescribeClusterMemberInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeClusterMemberInfoWithOptions(request, runtime);
    }

    public DescribeDBInstanceNetInfoResponse describeDBInstanceNetInfoWithOptions(DescribeDBInstanceNetInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDBInstanceNetInfo", "2015-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDBInstanceNetInfoResponse());
    }

    public DescribeDBInstanceNetInfoResponse describeDBInstanceNetInfo(DescribeDBInstanceNetInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDBInstanceNetInfoWithOptions(request, runtime);
    }

    public DescribeDedicatedClusterInstanceListResponse describeDedicatedClusterInstanceListWithOptions(DescribeDedicatedClusterInstanceListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDedicatedClusterInstanceList", "2015-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDedicatedClusterInstanceListResponse());
    }

    public DescribeDedicatedClusterInstanceListResponse describeDedicatedClusterInstanceList(DescribeDedicatedClusterInstanceListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDedicatedClusterInstanceListWithOptions(request, runtime);
    }

    public DescribeEngineVersionResponse describeEngineVersionWithOptions(DescribeEngineVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeEngineVersion", "2015-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeEngineVersionResponse());
    }

    public DescribeEngineVersionResponse describeEngineVersion(DescribeEngineVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeEngineVersionWithOptions(request, runtime);
    }

    public DescribeGlobalDistributeCacheResponse describeGlobalDistributeCacheWithOptions(DescribeGlobalDistributeCacheRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeGlobalDistributeCache", "2015-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeGlobalDistributeCacheResponse());
    }

    public DescribeGlobalDistributeCacheResponse describeGlobalDistributeCache(DescribeGlobalDistributeCacheRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeGlobalDistributeCacheWithOptions(request, runtime);
    }

    public DescribeHistoryMonitorValuesResponse describeHistoryMonitorValuesWithOptions(DescribeHistoryMonitorValuesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeHistoryMonitorValues", "2015-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeHistoryMonitorValuesResponse());
    }

    public DescribeHistoryMonitorValuesResponse describeHistoryMonitorValues(DescribeHistoryMonitorValuesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeHistoryMonitorValuesWithOptions(request, runtime);
    }

    public DescribeInstanceAttributeResponse describeInstanceAttributeWithOptions(DescribeInstanceAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeInstanceAttribute", "2015-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeInstanceAttributeResponse());
    }

    public DescribeInstanceAttributeResponse describeInstanceAttribute(DescribeInstanceAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstanceAttributeWithOptions(request, runtime);
    }

    public DescribeInstanceAutoRenewalAttributeResponse describeInstanceAutoRenewalAttributeWithOptions(DescribeInstanceAutoRenewalAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeInstanceAutoRenewalAttribute", "2015-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeInstanceAutoRenewalAttributeResponse());
    }

    public DescribeInstanceAutoRenewalAttributeResponse describeInstanceAutoRenewalAttribute(DescribeInstanceAutoRenewalAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstanceAutoRenewalAttributeWithOptions(request, runtime);
    }

    public DescribeInstanceConfigResponse describeInstanceConfigWithOptions(DescribeInstanceConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeInstanceConfig", "2015-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeInstanceConfigResponse());
    }

    public DescribeInstanceConfigResponse describeInstanceConfig(DescribeInstanceConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstanceConfigWithOptions(request, runtime);
    }

    public DescribeInstancesResponse describeInstancesWithOptions(DescribeInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeInstances", "2015-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeInstancesResponse());
    }

    public DescribeInstancesResponse describeInstances(DescribeInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstancesWithOptions(request, runtime);
    }

    public DescribeInstanceSSLResponse describeInstanceSSLWithOptions(DescribeInstanceSSLRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeInstanceSSL", "2015-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeInstanceSSLResponse());
    }

    public DescribeInstanceSSLResponse describeInstanceSSL(DescribeInstanceSSLRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstanceSSLWithOptions(request, runtime);
    }

    public DescribeIntranetAttributeResponse describeIntranetAttributeWithOptions(DescribeIntranetAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeIntranetAttribute", "2015-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeIntranetAttributeResponse());
    }

    public DescribeIntranetAttributeResponse describeIntranetAttribute(DescribeIntranetAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeIntranetAttributeWithOptions(request, runtime);
    }

    public DescribeLogicInstanceTopologyResponse describeLogicInstanceTopologyWithOptions(DescribeLogicInstanceTopologyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLogicInstanceTopology", "2015-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeLogicInstanceTopologyResponse());
    }

    public DescribeLogicInstanceTopologyResponse describeLogicInstanceTopology(DescribeLogicInstanceTopologyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLogicInstanceTopologyWithOptions(request, runtime);
    }

    public DescribeMonitorItemsResponse describeMonitorItemsWithOptions(DescribeMonitorItemsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeMonitorItems", "2015-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeMonitorItemsResponse());
    }

    public DescribeMonitorItemsResponse describeMonitorItems(DescribeMonitorItemsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeMonitorItemsWithOptions(request, runtime);
    }

    public DescribeParametersResponse describeParametersWithOptions(DescribeParametersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeParameters", "2015-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeParametersResponse());
    }

    public DescribeParametersResponse describeParameters(DescribeParametersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeParametersWithOptions(request, runtime);
    }

    public DescribeParameterTemplatesResponse describeParameterTemplatesWithOptions(DescribeParameterTemplatesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeParameterTemplates", "2015-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeParameterTemplatesResponse());
    }

    public DescribeParameterTemplatesResponse describeParameterTemplates(DescribeParameterTemplatesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeParameterTemplatesWithOptions(request, runtime);
    }

    public DescribePriceResponse describePriceWithOptions(DescribePriceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribePrice", "2015-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribePriceResponse());
    }

    public DescribePriceResponse describePrice(DescribePriceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describePriceWithOptions(request, runtime);
    }

    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRegions", "2015-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRegionsResponse());
    }

    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRegionsWithOptions(request, runtime);
    }

    public DescribeRoleZoneInfoResponse describeRoleZoneInfoWithOptions(DescribeRoleZoneInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRoleZoneInfo", "2015-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRoleZoneInfoResponse());
    }

    public DescribeRoleZoneInfoResponse describeRoleZoneInfo(DescribeRoleZoneInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRoleZoneInfoWithOptions(request, runtime);
    }

    public DescribeRunningLogRecordsResponse describeRunningLogRecordsWithOptions(DescribeRunningLogRecordsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRunningLogRecords", "2015-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRunningLogRecordsResponse());
    }

    public DescribeRunningLogRecordsResponse describeRunningLogRecords(DescribeRunningLogRecordsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRunningLogRecordsWithOptions(request, runtime);
    }

    public DescribeSecurityGroupConfigurationResponse describeSecurityGroupConfigurationWithOptions(DescribeSecurityGroupConfigurationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSecurityGroupConfiguration", "2015-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSecurityGroupConfigurationResponse());
    }

    public DescribeSecurityGroupConfigurationResponse describeSecurityGroupConfiguration(DescribeSecurityGroupConfigurationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSecurityGroupConfigurationWithOptions(request, runtime);
    }

    public DescribeSecurityIpsResponse describeSecurityIpsWithOptions(DescribeSecurityIpsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSecurityIps", "2015-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSecurityIpsResponse());
    }

    public DescribeSecurityIpsResponse describeSecurityIps(DescribeSecurityIpsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSecurityIpsWithOptions(request, runtime);
    }

    public DescribeSlowLogRecordsResponse describeSlowLogRecordsWithOptions(DescribeSlowLogRecordsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSlowLogRecords", "2015-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSlowLogRecordsResponse());
    }

    public DescribeSlowLogRecordsResponse describeSlowLogRecords(DescribeSlowLogRecordsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSlowLogRecordsWithOptions(request, runtime);
    }

    public DescribeTasksResponse describeTasksWithOptions(DescribeTasksRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeTasks", "2015-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeTasksResponse());
    }

    public DescribeTasksResponse describeTasks(DescribeTasksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeTasksWithOptions(request, runtime);
    }

    public DescribeUserClusterHostResponse describeUserClusterHostWithOptions(DescribeUserClusterHostRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeUserClusterHost", "2015-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeUserClusterHostResponse());
    }

    public DescribeUserClusterHostResponse describeUserClusterHost(DescribeUserClusterHostRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeUserClusterHostWithOptions(request, runtime);
    }

    public DescribeUserClusterHostInstanceResponse describeUserClusterHostInstanceWithOptions(DescribeUserClusterHostInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeUserClusterHostInstance", "2015-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeUserClusterHostInstanceResponse());
    }

    public DescribeUserClusterHostInstanceResponse describeUserClusterHostInstance(DescribeUserClusterHostInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeUserClusterHostInstanceWithOptions(request, runtime);
    }

    public DescribeZonesResponse describeZonesWithOptions(DescribeZonesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeZones", "2015-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeZonesResponse());
    }

    public DescribeZonesResponse describeZones(DescribeZonesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeZonesWithOptions(request, runtime);
    }

    public FlushExpireKeysResponse flushExpireKeysWithOptions(FlushExpireKeysRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("FlushExpireKeys", "2015-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new FlushExpireKeysResponse());
    }

    public FlushExpireKeysResponse flushExpireKeys(FlushExpireKeysRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.flushExpireKeysWithOptions(request, runtime);
    }

    public FlushInstanceResponse flushInstanceWithOptions(FlushInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("FlushInstance", "2015-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new FlushInstanceResponse());
    }

    public FlushInstanceResponse flushInstance(FlushInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.flushInstanceWithOptions(request, runtime);
    }

    public GrantAccountPrivilegeResponse grantAccountPrivilegeWithOptions(GrantAccountPrivilegeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GrantAccountPrivilege", "2015-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new GrantAccountPrivilegeResponse());
    }

    public GrantAccountPrivilegeResponse grantAccountPrivilege(GrantAccountPrivilegeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.grantAccountPrivilegeWithOptions(request, runtime);
    }

    public InitializeKvstorePermissionResponse initializeKvstorePermissionWithOptions(InitializeKvstorePermissionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("InitializeKvstorePermission", "2015-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new InitializeKvstorePermissionResponse());
    }

    public InitializeKvstorePermissionResponse initializeKvstorePermission(InitializeKvstorePermissionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.initializeKvstorePermissionWithOptions(request, runtime);
    }

    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListTagResources", "2015-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListTagResourcesResponse());
    }

    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    public MigrateToOtherZoneResponse migrateToOtherZoneWithOptions(MigrateToOtherZoneRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("MigrateToOtherZone", "2015-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new MigrateToOtherZoneResponse());
    }

    public MigrateToOtherZoneResponse migrateToOtherZone(MigrateToOtherZoneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.migrateToOtherZoneWithOptions(request, runtime);
    }

    public ModifyAccountDescriptionResponse modifyAccountDescriptionWithOptions(ModifyAccountDescriptionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyAccountDescription", "2015-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyAccountDescriptionResponse());
    }

    public ModifyAccountDescriptionResponse modifyAccountDescription(ModifyAccountDescriptionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyAccountDescriptionWithOptions(request, runtime);
    }

    public ModifyAccountPasswordResponse modifyAccountPasswordWithOptions(ModifyAccountPasswordRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyAccountPassword", "2015-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyAccountPasswordResponse());
    }

    public ModifyAccountPasswordResponse modifyAccountPassword(ModifyAccountPasswordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyAccountPasswordWithOptions(request, runtime);
    }

    public ModifyActiveOperationTaskResponse modifyActiveOperationTaskWithOptions(ModifyActiveOperationTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyActiveOperationTask", "2015-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyActiveOperationTaskResponse());
    }

    public ModifyActiveOperationTaskResponse modifyActiveOperationTask(ModifyActiveOperationTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyActiveOperationTaskWithOptions(request, runtime);
    }

    public ModifyBackupPolicyResponse modifyBackupPolicyWithOptions(ModifyBackupPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyBackupPolicy", "2015-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyBackupPolicyResponse());
    }

    public ModifyBackupPolicyResponse modifyBackupPolicy(ModifyBackupPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyBackupPolicyWithOptions(request, runtime);
    }

    public ModifyDBInstanceConnectionStringResponse modifyDBInstanceConnectionStringWithOptions(ModifyDBInstanceConnectionStringRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDBInstanceConnectionString", "2015-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDBInstanceConnectionStringResponse());
    }

    public ModifyDBInstanceConnectionStringResponse modifyDBInstanceConnectionString(ModifyDBInstanceConnectionStringRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDBInstanceConnectionStringWithOptions(request, runtime);
    }

    public ModifyInstanceAttributeResponse modifyInstanceAttributeWithOptions(ModifyInstanceAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyInstanceAttribute", "2015-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyInstanceAttributeResponse());
    }

    public ModifyInstanceAttributeResponse modifyInstanceAttribute(ModifyInstanceAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyInstanceAttributeWithOptions(request, runtime);
    }

    public ModifyInstanceAutoRenewalAttributeResponse modifyInstanceAutoRenewalAttributeWithOptions(ModifyInstanceAutoRenewalAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyInstanceAutoRenewalAttribute", "2015-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyInstanceAutoRenewalAttributeResponse());
    }

    public ModifyInstanceAutoRenewalAttributeResponse modifyInstanceAutoRenewalAttribute(ModifyInstanceAutoRenewalAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyInstanceAutoRenewalAttributeWithOptions(request, runtime);
    }

    public ModifyInstanceConfigResponse modifyInstanceConfigWithOptions(ModifyInstanceConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyInstanceConfig", "2015-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyInstanceConfigResponse());
    }

    public ModifyInstanceConfigResponse modifyInstanceConfig(ModifyInstanceConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyInstanceConfigWithOptions(request, runtime);
    }

    public ModifyInstanceMaintainTimeResponse modifyInstanceMaintainTimeWithOptions(ModifyInstanceMaintainTimeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyInstanceMaintainTime", "2015-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyInstanceMaintainTimeResponse());
    }

    public ModifyInstanceMaintainTimeResponse modifyInstanceMaintainTime(ModifyInstanceMaintainTimeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyInstanceMaintainTimeWithOptions(request, runtime);
    }

    public ModifyInstanceMajorVersionResponse modifyInstanceMajorVersionWithOptions(ModifyInstanceMajorVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyInstanceMajorVersion", "2015-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyInstanceMajorVersionResponse());
    }

    public ModifyInstanceMajorVersionResponse modifyInstanceMajorVersion(ModifyInstanceMajorVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyInstanceMajorVersionWithOptions(request, runtime);
    }

    public ModifyInstanceMinorVersionResponse modifyInstanceMinorVersionWithOptions(ModifyInstanceMinorVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyInstanceMinorVersion", "2015-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyInstanceMinorVersionResponse());
    }

    public ModifyInstanceMinorVersionResponse modifyInstanceMinorVersion(ModifyInstanceMinorVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyInstanceMinorVersionWithOptions(request, runtime);
    }

    public ModifyInstanceNetExpireTimeResponse modifyInstanceNetExpireTimeWithOptions(ModifyInstanceNetExpireTimeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyInstanceNetExpireTime", "2015-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyInstanceNetExpireTimeResponse());
    }

    public ModifyInstanceNetExpireTimeResponse modifyInstanceNetExpireTime(ModifyInstanceNetExpireTimeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyInstanceNetExpireTimeWithOptions(request, runtime);
    }

    public ModifyInstanceSpecResponse modifyInstanceSpecWithOptions(ModifyInstanceSpecRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyInstanceSpec", "2015-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyInstanceSpecResponse());
    }

    public ModifyInstanceSpecResponse modifyInstanceSpec(ModifyInstanceSpecRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyInstanceSpecWithOptions(request, runtime);
    }

    public ModifyInstanceSSLResponse modifyInstanceSSLWithOptions(ModifyInstanceSSLRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyInstanceSSL", "2015-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyInstanceSSLResponse());
    }

    public ModifyInstanceSSLResponse modifyInstanceSSL(ModifyInstanceSSLRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyInstanceSSLWithOptions(request, runtime);
    }

    public ModifyInstanceVpcAuthModeResponse modifyInstanceVpcAuthModeWithOptions(ModifyInstanceVpcAuthModeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyInstanceVpcAuthMode", "2015-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyInstanceVpcAuthModeResponse());
    }

    public ModifyInstanceVpcAuthModeResponse modifyInstanceVpcAuthMode(ModifyInstanceVpcAuthModeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyInstanceVpcAuthModeWithOptions(request, runtime);
    }

    public ModifyIntranetAttributeResponse modifyIntranetAttributeWithOptions(ModifyIntranetAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyIntranetAttribute", "2015-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyIntranetAttributeResponse());
    }

    public ModifyIntranetAttributeResponse modifyIntranetAttribute(ModifyIntranetAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyIntranetAttributeWithOptions(request, runtime);
    }

    public ModifyNodeSpecResponse modifyNodeSpecWithOptions(ModifyNodeSpecRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyNodeSpec", "2015-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyNodeSpecResponse());
    }

    public ModifyNodeSpecResponse modifyNodeSpec(ModifyNodeSpecRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyNodeSpecWithOptions(request, runtime);
    }

    public ModifyResourceGroupResponse modifyResourceGroupWithOptions(ModifyResourceGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyResourceGroup", "2015-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyResourceGroupResponse());
    }

    public ModifyResourceGroupResponse modifyResourceGroup(ModifyResourceGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyResourceGroupWithOptions(request, runtime);
    }

    public ModifySecurityGroupConfigurationResponse modifySecurityGroupConfigurationWithOptions(ModifySecurityGroupConfigurationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifySecurityGroupConfiguration", "2015-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifySecurityGroupConfigurationResponse());
    }

    public ModifySecurityGroupConfigurationResponse modifySecurityGroupConfiguration(ModifySecurityGroupConfigurationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifySecurityGroupConfigurationWithOptions(request, runtime);
    }

    public ModifySecurityIpsResponse modifySecurityIpsWithOptions(ModifySecurityIpsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifySecurityIps", "2015-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifySecurityIpsResponse());
    }

    public ModifySecurityIpsResponse modifySecurityIps(ModifySecurityIpsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifySecurityIpsWithOptions(request, runtime);
    }

    public ModifyUserClusterHostResponse modifyUserClusterHostWithOptions(ModifyUserClusterHostRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyUserClusterHost", "2015-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyUserClusterHostResponse());
    }

    public ModifyUserClusterHostResponse modifyUserClusterHost(ModifyUserClusterHostRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyUserClusterHostWithOptions(request, runtime);
    }

    public ReleaseDirectConnectionResponse releaseDirectConnectionWithOptions(ReleaseDirectConnectionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ReleaseDirectConnection", "2015-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ReleaseDirectConnectionResponse());
    }

    public ReleaseDirectConnectionResponse releaseDirectConnection(ReleaseDirectConnectionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.releaseDirectConnectionWithOptions(request, runtime);
    }

    public ReleaseInstancePublicConnectionResponse releaseInstancePublicConnectionWithOptions(ReleaseInstancePublicConnectionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ReleaseInstancePublicConnection", "2015-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ReleaseInstancePublicConnectionResponse());
    }

    public ReleaseInstancePublicConnectionResponse releaseInstancePublicConnection(ReleaseInstancePublicConnectionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.releaseInstancePublicConnectionWithOptions(request, runtime);
    }

    public RenewInstanceResponse renewInstanceWithOptions(RenewInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RenewInstance", "2015-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new RenewInstanceResponse());
    }

    public RenewInstanceResponse renewInstance(RenewInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.renewInstanceWithOptions(request, runtime);
    }

    public ReplaceUserClusterHostResponse replaceUserClusterHostWithOptions(ReplaceUserClusterHostRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ReplaceUserClusterHost", "2015-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ReplaceUserClusterHostResponse());
    }

    public ReplaceUserClusterHostResponse replaceUserClusterHost(ReplaceUserClusterHostRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.replaceUserClusterHostWithOptions(request, runtime);
    }

    public ResetAccountPasswordResponse resetAccountPasswordWithOptions(ResetAccountPasswordRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ResetAccountPassword", "2015-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ResetAccountPasswordResponse());
    }

    public ResetAccountPasswordResponse resetAccountPassword(ResetAccountPasswordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.resetAccountPasswordWithOptions(request, runtime);
    }

    public RestartInstanceResponse restartInstanceWithOptions(RestartInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RestartInstance", "2015-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new RestartInstanceResponse());
    }

    public RestartInstanceResponse restartInstance(RestartInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.restartInstanceWithOptions(request, runtime);
    }

    public RestoreInstanceResponse restoreInstanceWithOptions(RestoreInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RestoreInstance", "2015-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new RestoreInstanceResponse());
    }

    public RestoreInstanceResponse restoreInstance(RestoreInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.restoreInstanceWithOptions(request, runtime);
    }

    public SwitchInstanceHAResponse switchInstanceHAWithOptions(SwitchInstanceHARequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SwitchInstanceHA", "2015-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new SwitchInstanceHAResponse());
    }

    public SwitchInstanceHAResponse switchInstanceHA(SwitchInstanceHARequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.switchInstanceHAWithOptions(request, runtime);
    }

    public SwitchNetworkResponse switchNetworkWithOptions(SwitchNetworkRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SwitchNetwork", "2015-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new SwitchNetworkResponse());
    }

    public SwitchNetworkResponse switchNetwork(SwitchNetworkRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.switchNetworkWithOptions(request, runtime);
    }

    public SyncDtsStatusResponse syncDtsStatusWithOptions(SyncDtsStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SyncDtsStatus", "2015-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new SyncDtsStatusResponse());
    }

    public SyncDtsStatusResponse syncDtsStatus(SyncDtsStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.syncDtsStatusWithOptions(request, runtime);
    }

    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("TagResources", "2015-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new TagResourcesResponse());
    }

    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

    public TransformToPrePaidResponse transformToPrePaidWithOptions(TransformToPrePaidRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("TransformToPrePaid", "2015-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new TransformToPrePaidResponse());
    }

    public TransformToPrePaidResponse transformToPrePaid(TransformToPrePaidRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.transformToPrePaidWithOptions(request, runtime);
    }

    public UntagResourcesResponse untagResourcesWithOptions(UntagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UntagResources", "2015-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new UntagResourcesResponse());
    }

    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.untagResourcesWithOptions(request, runtime);
    }
}
