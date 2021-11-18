// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202;

import com.aliyun.tea.*;
import com.aliyun.polardbx20200202.models.*;
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
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("ap-northeast-1", "polardbx.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "polardbx.aliyuncs.com"),
            new TeaPair("ap-south-1", "polardbx.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "polardbx.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "polardbx.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "polardbx.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "polardbx.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "polardbx.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "polardbx.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "polardbx.aliyuncs.com"),
            new TeaPair("cn-edge-1", "polardbx.aliyuncs.com"),
            new TeaPair("cn-fujian", "polardbx.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "polardbx.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "polardbx.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "polardbx.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "polardbx.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "polardbx.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "polardbx.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "polardbx.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "polardbx.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "polardbx.aliyuncs.com"),
            new TeaPair("cn-huhehaote-nebula-1", "polardbx.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "polardbx.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "polardbx.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "polardbx.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "polardbx.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "polardbx.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "polardbx.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "polardbx.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "polardbx.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "polardbx.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "polardbx.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "polardbx.aliyuncs.com"),
            new TeaPair("cn-wuhan", "polardbx.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "polardbx.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "polardbx.aliyuncs.com"),
            new TeaPair("cn-zhangbei", "polardbx.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "polardbx.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "polardbx.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "polardbx.aliyuncs.com"),
            new TeaPair("eu-central-1", "polardbx.aliyuncs.com"),
            new TeaPair("eu-west-1", "polardbx.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "polardbx.aliyuncs.com"),
            new TeaPair("me-east-1", "polardbx.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "polardbx.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("polardbx", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AllocateInstancePublicConnectionResponse allocateInstancePublicConnectionWithOptions(AllocateInstancePublicConnectionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AllocateInstancePublicConnection", "2020-02-02", "HTTPS", "POST", "AK", "json", req, runtime), new AllocateInstancePublicConnectionResponse());
    }

    public AllocateInstancePublicConnectionResponse allocateInstancePublicConnection(AllocateInstancePublicConnectionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.allocateInstancePublicConnectionWithOptions(request, runtime);
    }

    public CancelActiveOperationTasksResponse cancelActiveOperationTasksWithOptions(CancelActiveOperationTasksRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("CancelActiveOperationTasks", "2020-02-02", "HTTPS", "GET", "AK", "json", req, runtime), new CancelActiveOperationTasksResponse());
    }

    public CancelActiveOperationTasksResponse cancelActiveOperationTasks(CancelActiveOperationTasksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cancelActiveOperationTasksWithOptions(request, runtime);
    }

    public CancelPolarxOrderResponse cancelPolarxOrderWithOptions(CancelPolarxOrderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CancelPolarxOrder", "2020-02-02", "HTTPS", "POST", "AK", "json", req, runtime), new CancelPolarxOrderResponse());
    }

    public CancelPolarxOrderResponse cancelPolarxOrder(CancelPolarxOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cancelPolarxOrderWithOptions(request, runtime);
    }

    public CheckCloudResourceAuthorizedResponse checkCloudResourceAuthorizedWithOptions(CheckCloudResourceAuthorizedRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CheckCloudResourceAuthorized", "2020-02-02", "HTTPS", "POST", "AK", "json", req, runtime), new CheckCloudResourceAuthorizedResponse());
    }

    public CheckCloudResourceAuthorizedResponse checkCloudResourceAuthorized(CheckCloudResourceAuthorizedRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkCloudResourceAuthorizedWithOptions(request, runtime);
    }

    public CreateAccountResponse createAccountWithOptions(CreateAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateAccount", "2020-02-02", "HTTPS", "POST", "AK", "json", req, runtime), new CreateAccountResponse());
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
        return TeaModel.toModel(this.doRPCRequest("CreateBackup", "2020-02-02", "HTTPS", "POST", "AK", "json", req, runtime), new CreateBackupResponse());
    }

    public CreateBackupResponse createBackup(CreateBackupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createBackupWithOptions(request, runtime);
    }

    public CreateDBResponse createDBWithOptions(CreateDBRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateDB", "2020-02-02", "HTTPS", "POST", "AK", "json", req, runtime), new CreateDBResponse());
    }

    public CreateDBResponse createDB(CreateDBRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDBWithOptions(request, runtime);
    }

    public CreateDBInstanceResponse createDBInstanceWithOptions(CreateDBInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateDBInstance", "2020-02-02", "HTTPS", "POST", "AK", "json", req, runtime), new CreateDBInstanceResponse());
    }

    public CreateDBInstanceResponse createDBInstance(CreateDBInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDBInstanceWithOptions(request, runtime);
    }

    public CreatePolarxOrderResponse createPolarxOrderWithOptions(CreatePolarxOrderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreatePolarxOrder", "2020-02-02", "HTTPS", "POST", "AK", "json", req, runtime), new CreatePolarxOrderResponse());
    }

    public CreatePolarxOrderResponse createPolarxOrder(CreatePolarxOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createPolarxOrderWithOptions(request, runtime);
    }

    public CreateSuperAccountResponse createSuperAccountWithOptions(CreateSuperAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateSuperAccount", "2020-02-02", "HTTPS", "POST", "AK", "json", req, runtime), new CreateSuperAccountResponse());
    }

    public CreateSuperAccountResponse createSuperAccount(CreateSuperAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSuperAccountWithOptions(request, runtime);
    }

    public DeleteAccountResponse deleteAccountWithOptions(DeleteAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteAccount", "2020-02-02", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteAccountResponse());
    }

    public DeleteAccountResponse deleteAccount(DeleteAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAccountWithOptions(request, runtime);
    }

    public DeleteDBResponse deleteDBWithOptions(DeleteDBRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteDB", "2020-02-02", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteDBResponse());
    }

    public DeleteDBResponse deleteDB(DeleteDBRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDBWithOptions(request, runtime);
    }

    public DeleteDBInstanceResponse deleteDBInstanceWithOptions(DeleteDBInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteDBInstance", "2020-02-02", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteDBInstanceResponse());
    }

    public DeleteDBInstanceResponse deleteDBInstance(DeleteDBInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDBInstanceWithOptions(request, runtime);
    }

    public DescribeAccountListResponse describeAccountListWithOptions(DescribeAccountListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAccountList", "2020-02-02", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAccountListResponse());
    }

    public DescribeAccountListResponse describeAccountList(DescribeAccountListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAccountListWithOptions(request, runtime);
    }

    public DescribeActiveOperationMaintainConfResponse describeActiveOperationMaintainConfWithOptions(DescribeActiveOperationMaintainConfRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeActiveOperationMaintainConf", "2020-02-02", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeActiveOperationMaintainConfResponse());
    }

    public DescribeActiveOperationMaintainConfResponse describeActiveOperationMaintainConf(DescribeActiveOperationMaintainConfRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeActiveOperationMaintainConfWithOptions(request, runtime);
    }

    public DescribeActiveOperationTaskCountResponse describeActiveOperationTaskCountWithOptions(DescribeActiveOperationTaskCountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeActiveOperationTaskCount", "2020-02-02", "HTTPS", "GET", "AK", "json", req, runtime), new DescribeActiveOperationTaskCountResponse());
    }

    public DescribeActiveOperationTaskCountResponse describeActiveOperationTaskCount(DescribeActiveOperationTaskCountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeActiveOperationTaskCountWithOptions(request, runtime);
    }

    public DescribeBackupPolicyResponse describeBackupPolicyWithOptions(DescribeBackupPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeBackupPolicy", "2020-02-02", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeBackupPolicyResponse());
    }

    public DescribeBackupPolicyResponse describeBackupPolicy(DescribeBackupPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeBackupPolicyWithOptions(request, runtime);
    }

    public DescribeBackupSetListResponse describeBackupSetListWithOptions(DescribeBackupSetListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeBackupSetList", "2020-02-02", "HTTPS", "GET", "AK", "json", req, runtime), new DescribeBackupSetListResponse());
    }

    public DescribeBackupSetListResponse describeBackupSetList(DescribeBackupSetListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeBackupSetListWithOptions(request, runtime);
    }

    public DescribeBinaryLogListResponse describeBinaryLogListWithOptions(DescribeBinaryLogListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeBinaryLogList", "2020-02-02", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeBinaryLogListResponse());
    }

    public DescribeBinaryLogListResponse describeBinaryLogList(DescribeBinaryLogListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeBinaryLogListWithOptions(request, runtime);
    }

    public DescribeCharacterSetResponse describeCharacterSetWithOptions(DescribeCharacterSetRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCharacterSet", "2020-02-02", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCharacterSetResponse());
    }

    public DescribeCharacterSetResponse describeCharacterSet(DescribeCharacterSetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCharacterSetWithOptions(request, runtime);
    }

    public DescribeDBInstanceAttributeResponse describeDBInstanceAttributeWithOptions(DescribeDBInstanceAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDBInstanceAttribute", "2020-02-02", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDBInstanceAttributeResponse());
    }

    public DescribeDBInstanceAttributeResponse describeDBInstanceAttribute(DescribeDBInstanceAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDBInstanceAttributeWithOptions(request, runtime);
    }

    public DescribeDBInstanceConfigResponse describeDBInstanceConfigWithOptions(DescribeDBInstanceConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDBInstanceConfig", "2020-02-02", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDBInstanceConfigResponse());
    }

    public DescribeDBInstanceConfigResponse describeDBInstanceConfig(DescribeDBInstanceConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDBInstanceConfigWithOptions(request, runtime);
    }

    public DescribeDBInstanceSSLResponse describeDBInstanceSSLWithOptions(DescribeDBInstanceSSLRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDBInstanceSSL", "2020-02-02", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDBInstanceSSLResponse());
    }

    public DescribeDBInstanceSSLResponse describeDBInstanceSSL(DescribeDBInstanceSSLRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDBInstanceSSLWithOptions(request, runtime);
    }

    public DescribeDBInstanceTDEResponse describeDBInstanceTDEWithOptions(DescribeDBInstanceTDERequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDBInstanceTDE", "2020-02-02", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDBInstanceTDEResponse());
    }

    public DescribeDBInstanceTDEResponse describeDBInstanceTDE(DescribeDBInstanceTDERequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDBInstanceTDEWithOptions(request, runtime);
    }

    public DescribeDBInstanceTopologyResponse describeDBInstanceTopologyWithOptions(DescribeDBInstanceTopologyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDBInstanceTopology", "2020-02-02", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDBInstanceTopologyResponse());
    }

    public DescribeDBInstanceTopologyResponse describeDBInstanceTopology(DescribeDBInstanceTopologyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDBInstanceTopologyWithOptions(request, runtime);
    }

    public DescribeDBInstancesResponse describeDBInstancesWithOptions(DescribeDBInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDBInstances", "2020-02-02", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDBInstancesResponse());
    }

    public DescribeDBInstancesResponse describeDBInstances(DescribeDBInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDBInstancesWithOptions(request, runtime);
    }

    public DescribeDBNodePerformanceResponse describeDBNodePerformanceWithOptions(DescribeDBNodePerformanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDBNodePerformance", "2020-02-02", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDBNodePerformanceResponse());
    }

    public DescribeDBNodePerformanceResponse describeDBNodePerformance(DescribeDBNodePerformanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDBNodePerformanceWithOptions(request, runtime);
    }

    public DescribeDbListResponse describeDbListWithOptions(DescribeDbListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDbList", "2020-02-02", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDbListResponse());
    }

    public DescribeDbListResponse describeDbList(DescribeDbListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDbListWithOptions(request, runtime);
    }

    public DescribeDistributeTableListResponse describeDistributeTableListWithOptions(DescribeDistributeTableListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDistributeTableList", "2020-02-02", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDistributeTableListResponse());
    }

    public DescribeDistributeTableListResponse describeDistributeTableList(DescribeDistributeTableListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDistributeTableListWithOptions(request, runtime);
    }

    public DescribeEventsResponse describeEventsWithOptions(DescribeEventsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeEvents", "2020-02-02", "HTTPS", "GET", "AK", "json", req, runtime), new DescribeEventsResponse());
    }

    public DescribeEventsResponse describeEvents(DescribeEventsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeEventsWithOptions(request, runtime);
    }

    public DescribeParameterTemplatesResponse describeParameterTemplatesWithOptions(DescribeParameterTemplatesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeParameterTemplates", "2020-02-02", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeParameterTemplatesResponse());
    }

    public DescribeParameterTemplatesResponse describeParameterTemplates(DescribeParameterTemplatesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeParameterTemplatesWithOptions(request, runtime);
    }

    public DescribeParametersResponse describeParametersWithOptions(DescribeParametersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeParameters", "2020-02-02", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeParametersResponse());
    }

    public DescribeParametersResponse describeParameters(DescribeParametersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeParametersWithOptions(request, runtime);
    }

    public DescribePolarxDataNodesResponse describePolarxDataNodesWithOptions(DescribePolarxDataNodesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribePolarxDataNodes", "2020-02-02", "HTTPS", "POST", "AK", "json", req, runtime), new DescribePolarxDataNodesResponse());
    }

    public DescribePolarxDataNodesResponse describePolarxDataNodes(DescribePolarxDataNodesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describePolarxDataNodesWithOptions(request, runtime);
    }

    public DescribePolarxDbInstancesResponse describePolarxDbInstancesWithOptions(DescribePolarxDbInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribePolarxDbInstances", "2020-02-02", "HTTPS", "POST", "AK", "json", req, runtime), new DescribePolarxDbInstancesResponse());
    }

    public DescribePolarxDbInstancesResponse describePolarxDbInstances(DescribePolarxDbInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describePolarxDbInstancesWithOptions(request, runtime);
    }

    public DescribeRegionsResponse describeRegionsWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("DescribeRegions", "2020-02-02", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRegionsResponse());
    }

    public DescribeRegionsResponse describeRegions() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRegionsWithOptions(runtime);
    }

    public DescribeScaleOutMigrateTaskListResponse describeScaleOutMigrateTaskListWithOptions(DescribeScaleOutMigrateTaskListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeScaleOutMigrateTaskList", "2020-02-02", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeScaleOutMigrateTaskListResponse());
    }

    public DescribeScaleOutMigrateTaskListResponse describeScaleOutMigrateTaskList(DescribeScaleOutMigrateTaskListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeScaleOutMigrateTaskListWithOptions(request, runtime);
    }

    public DescribeSecurityIpsResponse describeSecurityIpsWithOptions(DescribeSecurityIpsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSecurityIps", "2020-02-02", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSecurityIpsResponse());
    }

    public DescribeSecurityIpsResponse describeSecurityIps(DescribeSecurityIpsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSecurityIpsWithOptions(request, runtime);
    }

    public DescribeTasksResponse describeTasksWithOptions(DescribeTasksRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeTasks", "2020-02-02", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeTasksResponse());
    }

    public DescribeTasksResponse describeTasks(DescribeTasksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeTasksWithOptions(request, runtime);
    }

    public DescribeUserEncryptionKeyListResponse describeUserEncryptionKeyListWithOptions(DescribeUserEncryptionKeyListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeUserEncryptionKeyList", "2020-02-02", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeUserEncryptionKeyListResponse());
    }

    public DescribeUserEncryptionKeyListResponse describeUserEncryptionKeyList(DescribeUserEncryptionKeyListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeUserEncryptionKeyListWithOptions(request, runtime);
    }

    public GetPolarxCommodityResponse getPolarxCommodityWithOptions(GetPolarxCommodityRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetPolarxCommodity", "2020-02-02", "HTTPS", "POST", "AK", "json", req, runtime), new GetPolarxCommodityResponse());
    }

    public GetPolarxCommodityResponse getPolarxCommodity(GetPolarxCommodityRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getPolarxCommodityWithOptions(request, runtime);
    }

    public ModifyAccountDescriptionResponse modifyAccountDescriptionWithOptions(ModifyAccountDescriptionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyAccountDescription", "2020-02-02", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyAccountDescriptionResponse());
    }

    public ModifyAccountDescriptionResponse modifyAccountDescription(ModifyAccountDescriptionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyAccountDescriptionWithOptions(request, runtime);
    }

    public ModifyActiveOperationMaintainConfResponse modifyActiveOperationMaintainConfWithOptions(ModifyActiveOperationMaintainConfRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyActiveOperationMaintainConf", "2020-02-02", "HTTPS", "GET", "AK", "json", req, runtime), new ModifyActiveOperationMaintainConfResponse());
    }

    public ModifyActiveOperationMaintainConfResponse modifyActiveOperationMaintainConf(ModifyActiveOperationMaintainConfRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyActiveOperationMaintainConfWithOptions(request, runtime);
    }

    public ModifyActiveOperationTasksResponse modifyActiveOperationTasksWithOptions(ModifyActiveOperationTasksRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyActiveOperationTasks", "2020-02-02", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyActiveOperationTasksResponse());
    }

    public ModifyActiveOperationTasksResponse modifyActiveOperationTasks(ModifyActiveOperationTasksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyActiveOperationTasksWithOptions(request, runtime);
    }

    public ModifyDBInstanceClassResponse modifyDBInstanceClassWithOptions(ModifyDBInstanceClassRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDBInstanceClass", "2020-02-02", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDBInstanceClassResponse());
    }

    public ModifyDBInstanceClassResponse modifyDBInstanceClass(ModifyDBInstanceClassRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDBInstanceClassWithOptions(request, runtime);
    }

    public ModifyDBInstanceConfigResponse modifyDBInstanceConfigWithOptions(ModifyDBInstanceConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDBInstanceConfig", "2020-02-02", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDBInstanceConfigResponse());
    }

    public ModifyDBInstanceConfigResponse modifyDBInstanceConfig(ModifyDBInstanceConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDBInstanceConfigWithOptions(request, runtime);
    }

    public ModifyDBInstanceDescriptionResponse modifyDBInstanceDescriptionWithOptions(ModifyDBInstanceDescriptionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDBInstanceDescription", "2020-02-02", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDBInstanceDescriptionResponse());
    }

    public ModifyDBInstanceDescriptionResponse modifyDBInstanceDescription(ModifyDBInstanceDescriptionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDBInstanceDescriptionWithOptions(request, runtime);
    }

    public ModifyDatabaseDescriptionResponse modifyDatabaseDescriptionWithOptions(ModifyDatabaseDescriptionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDatabaseDescription", "2020-02-02", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDatabaseDescriptionResponse());
    }

    public ModifyDatabaseDescriptionResponse modifyDatabaseDescription(ModifyDatabaseDescriptionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDatabaseDescriptionWithOptions(request, runtime);
    }

    public ModifyParameterResponse modifyParameterWithOptions(ModifyParameterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyParameter", "2020-02-02", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyParameterResponse());
    }

    public ModifyParameterResponse modifyParameter(ModifyParameterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyParameterWithOptions(request, runtime);
    }

    public ModifySecurityIpsResponse modifySecurityIpsWithOptions(ModifySecurityIpsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifySecurityIps", "2020-02-02", "HTTPS", "POST", "AK", "json", req, runtime), new ModifySecurityIpsResponse());
    }

    public ModifySecurityIpsResponse modifySecurityIps(ModifySecurityIpsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifySecurityIpsWithOptions(request, runtime);
    }

    public ReleaseInstancePublicConnectionResponse releaseInstancePublicConnectionWithOptions(ReleaseInstancePublicConnectionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ReleaseInstancePublicConnection", "2020-02-02", "HTTPS", "POST", "AK", "json", req, runtime), new ReleaseInstancePublicConnectionResponse());
    }

    public ReleaseInstancePublicConnectionResponse releaseInstancePublicConnection(ReleaseInstancePublicConnectionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.releaseInstancePublicConnectionWithOptions(request, runtime);
    }

    public RestartDBInstanceResponse restartDBInstanceWithOptions(RestartDBInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RestartDBInstance", "2020-02-02", "HTTPS", "POST", "AK", "json", req, runtime), new RestartDBInstanceResponse());
    }

    public RestartDBInstanceResponse restartDBInstance(RestartDBInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.restartDBInstanceWithOptions(request, runtime);
    }

    public UpdateBackupPolicyResponse updateBackupPolicyWithOptions(UpdateBackupPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateBackupPolicy", "2020-02-02", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateBackupPolicyResponse());
    }

    public UpdateBackupPolicyResponse updateBackupPolicy(UpdateBackupPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateBackupPolicyWithOptions(request, runtime);
    }

    public UpdateDBInstanceSSLResponse updateDBInstanceSSLWithOptions(UpdateDBInstanceSSLRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateDBInstanceSSL", "2020-02-02", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateDBInstanceSSLResponse());
    }

    public UpdateDBInstanceSSLResponse updateDBInstanceSSL(UpdateDBInstanceSSLRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateDBInstanceSSLWithOptions(request, runtime);
    }

    public UpdateDBInstanceTDEResponse updateDBInstanceTDEWithOptions(UpdateDBInstanceTDERequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateDBInstanceTDE", "2020-02-02", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateDBInstanceTDEResponse());
    }

    public UpdateDBInstanceTDEResponse updateDBInstanceTDE(UpdateDBInstanceTDERequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateDBInstanceTDEWithOptions(request, runtime);
    }

    public UpdatePolarDBXInstanceNodeResponse updatePolarDBXInstanceNodeWithOptions(UpdatePolarDBXInstanceNodeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdatePolarDBXInstanceNode", "2020-02-02", "HTTPS", "POST", "AK", "json", req, runtime), new UpdatePolarDBXInstanceNodeResponse());
    }

    public UpdatePolarDBXInstanceNodeResponse updatePolarDBXInstanceNode(UpdatePolarDBXInstanceNodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updatePolarDBXInstanceNodeWithOptions(request, runtime);
    }

    public UpgradeDBInstanceKernelVersionResponse upgradeDBInstanceKernelVersionWithOptions(UpgradeDBInstanceKernelVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpgradeDBInstanceKernelVersion", "2020-02-02", "HTTPS", "POST", "AK", "json", req, runtime), new UpgradeDBInstanceKernelVersionResponse());
    }

    public UpgradeDBInstanceKernelVersionResponse upgradeDBInstanceKernelVersion(UpgradeDBInstanceKernelVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.upgradeDBInstanceKernelVersionWithOptions(request, runtime);
    }
}
