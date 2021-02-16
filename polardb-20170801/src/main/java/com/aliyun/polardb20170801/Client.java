// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801;

import com.aliyun.tea.*;
import com.aliyun.polardb20170801.models.*;
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
            new TeaPair("cn-qingdao", "polardb.aliyuncs.com"),
            new TeaPair("cn-beijing", "polardb.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "polardb.aliyuncs.com"),
            new TeaPair("cn-shanghai", "polardb.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "polardb.aliyuncs.com"),
            new TeaPair("cn-hongkong", "polardb.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "polardb.aliyuncs.com"),
            new TeaPair("us-west-1", "polardb.aliyuncs.com"),
            new TeaPair("us-east-1", "polardb.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "polardb.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "polardb.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "polardb.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "polardb.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "polardb.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "polardb.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "polardb.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "polardb.aliyuncs.com"),
            new TeaPair("cn-edge-1", "polardb.aliyuncs.com"),
            new TeaPair("cn-fujian", "polardb.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "polardb.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "polardb.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "polardb.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "polardb.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "polardb.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "polardb.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "polardb.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "polardb.aliyuncs.com"),
            new TeaPair("cn-huhehaote-nebula-1", "polardb.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "polardb.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "polardb.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "polardb.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "polardb.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "polardb.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "polardb.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "polardb.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "polardb.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "polardb.aliyuncs.com"),
            new TeaPair("cn-wuhan", "polardb.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "polardb.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "polardb.aliyuncs.com"),
            new TeaPair("cn-zhangbei", "polardb.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "polardb.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "polardb.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "polardb.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "polardb.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "polardb.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("polardb", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public CancelScheduleTasksResponse cancelScheduleTasksWithOptions(CancelScheduleTasksRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CancelScheduleTasks", "2017-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new CancelScheduleTasksResponse());
    }

    public CancelScheduleTasksResponse cancelScheduleTasks(CancelScheduleTasksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cancelScheduleTasksWithOptions(request, runtime);
    }

    public CheckAccountNameResponse checkAccountNameWithOptions(CheckAccountNameRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CheckAccountName", "2017-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new CheckAccountNameResponse());
    }

    public CheckAccountNameResponse checkAccountName(CheckAccountNameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkAccountNameWithOptions(request, runtime);
    }

    public CheckDBNameResponse checkDBNameWithOptions(CheckDBNameRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CheckDBName", "2017-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new CheckDBNameResponse());
    }

    public CheckDBNameResponse checkDBName(CheckDBNameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkDBNameWithOptions(request, runtime);
    }

    public CloseDBClusterMigrationResponse closeDBClusterMigrationWithOptions(CloseDBClusterMigrationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CloseDBClusterMigration", "2017-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new CloseDBClusterMigrationResponse());
    }

    public CloseDBClusterMigrationResponse closeDBClusterMigration(CloseDBClusterMigrationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.closeDBClusterMigrationWithOptions(request, runtime);
    }

    public CreateAccountResponse createAccountWithOptions(CreateAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateAccount", "2017-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateAccountResponse());
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
        return TeaModel.toModel(this.doRPCRequest("CreateBackup", "2017-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateBackupResponse());
    }

    public CreateBackupResponse createBackup(CreateBackupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createBackupWithOptions(request, runtime);
    }

    public CreateDatabaseResponse createDatabaseWithOptions(CreateDatabaseRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateDatabase", "2017-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateDatabaseResponse());
    }

    public CreateDatabaseResponse createDatabase(CreateDatabaseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDatabaseWithOptions(request, runtime);
    }

    public CreateDBClusterResponse createDBClusterWithOptions(CreateDBClusterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateDBCluster", "2017-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateDBClusterResponse());
    }

    public CreateDBClusterResponse createDBCluster(CreateDBClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDBClusterWithOptions(request, runtime);
    }

    public CreateDBClusterEndpointResponse createDBClusterEndpointWithOptions(CreateDBClusterEndpointRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateDBClusterEndpoint", "2017-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateDBClusterEndpointResponse());
    }

    public CreateDBClusterEndpointResponse createDBClusterEndpoint(CreateDBClusterEndpointRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDBClusterEndpointWithOptions(request, runtime);
    }

    public CreateDBEndpointAddressResponse createDBEndpointAddressWithOptions(CreateDBEndpointAddressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateDBEndpointAddress", "2017-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateDBEndpointAddressResponse());
    }

    public CreateDBEndpointAddressResponse createDBEndpointAddress(CreateDBEndpointAddressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDBEndpointAddressWithOptions(request, runtime);
    }

    public CreateDBLinkResponse createDBLinkWithOptions(CreateDBLinkRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateDBLink", "2017-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateDBLinkResponse());
    }

    public CreateDBLinkResponse createDBLink(CreateDBLinkRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDBLinkWithOptions(request, runtime);
    }

    public CreateDBNodesResponse createDBNodesWithOptions(CreateDBNodesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateDBNodes", "2017-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateDBNodesResponse());
    }

    public CreateDBNodesResponse createDBNodes(CreateDBNodesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDBNodesWithOptions(request, runtime);
    }

    public DeleteAccountResponse deleteAccountWithOptions(DeleteAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteAccount", "2017-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteAccountResponse());
    }

    public DeleteAccountResponse deleteAccount(DeleteAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAccountWithOptions(request, runtime);
    }

    public DeleteBackupResponse deleteBackupWithOptions(DeleteBackupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteBackup", "2017-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteBackupResponse());
    }

    public DeleteBackupResponse deleteBackup(DeleteBackupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteBackupWithOptions(request, runtime);
    }

    public DeleteDatabaseResponse deleteDatabaseWithOptions(DeleteDatabaseRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteDatabase", "2017-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteDatabaseResponse());
    }

    public DeleteDatabaseResponse deleteDatabase(DeleteDatabaseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDatabaseWithOptions(request, runtime);
    }

    public DeleteDBClusterResponse deleteDBClusterWithOptions(DeleteDBClusterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteDBCluster", "2017-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteDBClusterResponse());
    }

    public DeleteDBClusterResponse deleteDBCluster(DeleteDBClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDBClusterWithOptions(request, runtime);
    }

    public DeleteDBClusterEndpointResponse deleteDBClusterEndpointWithOptions(DeleteDBClusterEndpointRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteDBClusterEndpoint", "2017-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteDBClusterEndpointResponse());
    }

    public DeleteDBClusterEndpointResponse deleteDBClusterEndpoint(DeleteDBClusterEndpointRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDBClusterEndpointWithOptions(request, runtime);
    }

    public DeleteDBEndpointAddressResponse deleteDBEndpointAddressWithOptions(DeleteDBEndpointAddressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteDBEndpointAddress", "2017-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteDBEndpointAddressResponse());
    }

    public DeleteDBEndpointAddressResponse deleteDBEndpointAddress(DeleteDBEndpointAddressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDBEndpointAddressWithOptions(request, runtime);
    }

    public DeleteDBLinkResponse deleteDBLinkWithOptions(DeleteDBLinkRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteDBLink", "2017-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteDBLinkResponse());
    }

    public DeleteDBLinkResponse deleteDBLink(DeleteDBLinkRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDBLinkWithOptions(request, runtime);
    }

    public DeleteDBNodesResponse deleteDBNodesWithOptions(DeleteDBNodesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteDBNodes", "2017-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteDBNodesResponse());
    }

    public DeleteDBNodesResponse deleteDBNodes(DeleteDBNodesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDBNodesWithOptions(request, runtime);
    }

    public DescribeAccountsResponse describeAccountsWithOptions(DescribeAccountsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAccounts", "2017-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAccountsResponse());
    }

    public DescribeAccountsResponse describeAccounts(DescribeAccountsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAccountsWithOptions(request, runtime);
    }

    public DescribeAutoRenewAttributeResponse describeAutoRenewAttributeWithOptions(DescribeAutoRenewAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAutoRenewAttribute", "2017-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAutoRenewAttributeResponse());
    }

    public DescribeAutoRenewAttributeResponse describeAutoRenewAttribute(DescribeAutoRenewAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAutoRenewAttributeWithOptions(request, runtime);
    }

    public DescribeBackupLogsResponse describeBackupLogsWithOptions(DescribeBackupLogsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeBackupLogs", "2017-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeBackupLogsResponse());
    }

    public DescribeBackupLogsResponse describeBackupLogs(DescribeBackupLogsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeBackupLogsWithOptions(request, runtime);
    }

    public DescribeBackupPolicyResponse describeBackupPolicyWithOptions(DescribeBackupPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeBackupPolicy", "2017-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeBackupPolicyResponse());
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
        return TeaModel.toModel(this.doRPCRequest("DescribeBackups", "2017-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeBackupsResponse());
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
        return TeaModel.toModel(this.doRPCRequest("DescribeBackupTasks", "2017-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeBackupTasksResponse());
    }

    public DescribeBackupTasksResponse describeBackupTasks(DescribeBackupTasksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeBackupTasksWithOptions(request, runtime);
    }

    public DescribeCharacterSetNameResponse describeCharacterSetNameWithOptions(DescribeCharacterSetNameRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCharacterSetName", "2017-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCharacterSetNameResponse());
    }

    public DescribeCharacterSetNameResponse describeCharacterSetName(DescribeCharacterSetNameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCharacterSetNameWithOptions(request, runtime);
    }

    public DescribeDatabasesResponse describeDatabasesWithOptions(DescribeDatabasesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDatabases", "2017-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDatabasesResponse());
    }

    public DescribeDatabasesResponse describeDatabases(DescribeDatabasesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDatabasesWithOptions(request, runtime);
    }

    public DescribeDBClusterAccessWhitelistResponse describeDBClusterAccessWhitelistWithOptions(DescribeDBClusterAccessWhitelistRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDBClusterAccessWhitelist", "2017-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDBClusterAccessWhitelistResponse());
    }

    public DescribeDBClusterAccessWhitelistResponse describeDBClusterAccessWhitelist(DescribeDBClusterAccessWhitelistRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDBClusterAccessWhitelistWithOptions(request, runtime);
    }

    public DescribeDBClusterAttributeResponse describeDBClusterAttributeWithOptions(DescribeDBClusterAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDBClusterAttribute", "2017-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDBClusterAttributeResponse());
    }

    public DescribeDBClusterAttributeResponse describeDBClusterAttribute(DescribeDBClusterAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDBClusterAttributeWithOptions(request, runtime);
    }

    public DescribeDBClusterAuditLogCollectorResponse describeDBClusterAuditLogCollectorWithOptions(DescribeDBClusterAuditLogCollectorRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDBClusterAuditLogCollector", "2017-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDBClusterAuditLogCollectorResponse());
    }

    public DescribeDBClusterAuditLogCollectorResponse describeDBClusterAuditLogCollector(DescribeDBClusterAuditLogCollectorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDBClusterAuditLogCollectorWithOptions(request, runtime);
    }

    public DescribeDBClusterAvailableResourcesResponse describeDBClusterAvailableResourcesWithOptions(DescribeDBClusterAvailableResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDBClusterAvailableResources", "2017-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDBClusterAvailableResourcesResponse());
    }

    public DescribeDBClusterAvailableResourcesResponse describeDBClusterAvailableResources(DescribeDBClusterAvailableResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDBClusterAvailableResourcesWithOptions(request, runtime);
    }

    public DescribeDBClusterEndpointsResponse describeDBClusterEndpointsWithOptions(DescribeDBClusterEndpointsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDBClusterEndpoints", "2017-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDBClusterEndpointsResponse());
    }

    public DescribeDBClusterEndpointsResponse describeDBClusterEndpoints(DescribeDBClusterEndpointsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDBClusterEndpointsWithOptions(request, runtime);
    }

    public DescribeDBClusterMigrationResponse describeDBClusterMigrationWithOptions(DescribeDBClusterMigrationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDBClusterMigration", "2017-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDBClusterMigrationResponse());
    }

    public DescribeDBClusterMigrationResponse describeDBClusterMigration(DescribeDBClusterMigrationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDBClusterMigrationWithOptions(request, runtime);
    }

    public DescribeDBClusterMonitorResponse describeDBClusterMonitorWithOptions(DescribeDBClusterMonitorRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDBClusterMonitor", "2017-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDBClusterMonitorResponse());
    }

    public DescribeDBClusterMonitorResponse describeDBClusterMonitor(DescribeDBClusterMonitorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDBClusterMonitorWithOptions(request, runtime);
    }

    public DescribeDBClusterParametersResponse describeDBClusterParametersWithOptions(DescribeDBClusterParametersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDBClusterParameters", "2017-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDBClusterParametersResponse());
    }

    public DescribeDBClusterParametersResponse describeDBClusterParameters(DescribeDBClusterParametersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDBClusterParametersWithOptions(request, runtime);
    }

    public DescribeDBClusterPerformanceResponse describeDBClusterPerformanceWithOptions(DescribeDBClusterPerformanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDBClusterPerformance", "2017-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDBClusterPerformanceResponse());
    }

    public DescribeDBClusterPerformanceResponse describeDBClusterPerformance(DescribeDBClusterPerformanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDBClusterPerformanceWithOptions(request, runtime);
    }

    public DescribeDBClustersResponse describeDBClustersWithOptions(DescribeDBClustersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDBClusters", "2017-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDBClustersResponse());
    }

    public DescribeDBClustersResponse describeDBClusters(DescribeDBClustersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDBClustersWithOptions(request, runtime);
    }

    public DescribeDBClusterSSLResponse describeDBClusterSSLWithOptions(DescribeDBClusterSSLRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDBClusterSSL", "2017-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDBClusterSSLResponse());
    }

    public DescribeDBClusterSSLResponse describeDBClusterSSL(DescribeDBClusterSSLRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDBClusterSSLWithOptions(request, runtime);
    }

    public DescribeDBClustersWithBackupsResponse describeDBClustersWithBackupsWithOptions(DescribeDBClustersWithBackupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDBClustersWithBackups", "2017-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDBClustersWithBackupsResponse());
    }

    public DescribeDBClustersWithBackupsResponse describeDBClustersWithBackups(DescribeDBClustersWithBackupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDBClustersWithBackupsWithOptions(request, runtime);
    }

    public DescribeDBClusterTDEResponse describeDBClusterTDEWithOptions(DescribeDBClusterTDERequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDBClusterTDE", "2017-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDBClusterTDEResponse());
    }

    public DescribeDBClusterTDEResponse describeDBClusterTDE(DescribeDBClusterTDERequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDBClusterTDEWithOptions(request, runtime);
    }

    public DescribeDBClusterVersionResponse describeDBClusterVersionWithOptions(DescribeDBClusterVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDBClusterVersion", "2017-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDBClusterVersionResponse());
    }

    public DescribeDBClusterVersionResponse describeDBClusterVersion(DescribeDBClusterVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDBClusterVersionWithOptions(request, runtime);
    }

    public DescribeDBInitializeVariableResponse describeDBInitializeVariableWithOptions(DescribeDBInitializeVariableRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDBInitializeVariable", "2017-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDBInitializeVariableResponse());
    }

    public DescribeDBInitializeVariableResponse describeDBInitializeVariable(DescribeDBInitializeVariableRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDBInitializeVariableWithOptions(request, runtime);
    }

    public DescribeDBLinksResponse describeDBLinksWithOptions(DescribeDBLinksRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDBLinks", "2017-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDBLinksResponse());
    }

    public DescribeDBLinksResponse describeDBLinks(DescribeDBLinksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDBLinksWithOptions(request, runtime);
    }

    public DescribeDBNodePerformanceResponse describeDBNodePerformanceWithOptions(DescribeDBNodePerformanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDBNodePerformance", "2017-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDBNodePerformanceResponse());
    }

    public DescribeDBNodePerformanceResponse describeDBNodePerformance(DescribeDBNodePerformanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDBNodePerformanceWithOptions(request, runtime);
    }

    public DescribeDetachedBackupsResponse describeDetachedBackupsWithOptions(DescribeDetachedBackupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDetachedBackups", "2017-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDetachedBackupsResponse());
    }

    public DescribeDetachedBackupsResponse describeDetachedBackups(DescribeDetachedBackupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDetachedBackupsWithOptions(request, runtime);
    }

    public DescribeGlobalDatabaseNetworksResponse describeGlobalDatabaseNetworksWithOptions(DescribeGlobalDatabaseNetworksRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeGlobalDatabaseNetworks", "2017-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeGlobalDatabaseNetworksResponse());
    }

    public DescribeGlobalDatabaseNetworksResponse describeGlobalDatabaseNetworks(DescribeGlobalDatabaseNetworksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeGlobalDatabaseNetworksWithOptions(request, runtime);
    }

    public DescribeLogBackupPolicyResponse describeLogBackupPolicyWithOptions(DescribeLogBackupPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLogBackupPolicy", "2017-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeLogBackupPolicyResponse());
    }

    public DescribeLogBackupPolicyResponse describeLogBackupPolicy(DescribeLogBackupPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLogBackupPolicyWithOptions(request, runtime);
    }

    public DescribeMetaListResponse describeMetaListWithOptions(DescribeMetaListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeMetaList", "2017-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeMetaListResponse());
    }

    public DescribeMetaListResponse describeMetaList(DescribeMetaListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeMetaListWithOptions(request, runtime);
    }

    public DescribePendingMaintenanceActionResponse describePendingMaintenanceActionWithOptions(DescribePendingMaintenanceActionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribePendingMaintenanceAction", "2017-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribePendingMaintenanceActionResponse());
    }

    public DescribePendingMaintenanceActionResponse describePendingMaintenanceAction(DescribePendingMaintenanceActionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describePendingMaintenanceActionWithOptions(request, runtime);
    }

    public DescribePendingMaintenanceActionsResponse describePendingMaintenanceActionsWithOptions(DescribePendingMaintenanceActionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribePendingMaintenanceActions", "2017-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribePendingMaintenanceActionsResponse());
    }

    public DescribePendingMaintenanceActionsResponse describePendingMaintenanceActions(DescribePendingMaintenanceActionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describePendingMaintenanceActionsWithOptions(request, runtime);
    }

    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRegions", "2017-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRegionsResponse());
    }

    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRegionsWithOptions(request, runtime);
    }

    public DescribeScheduleTasksResponse describeScheduleTasksWithOptions(DescribeScheduleTasksRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeScheduleTasks", "2017-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeScheduleTasksResponse());
    }

    public DescribeScheduleTasksResponse describeScheduleTasks(DescribeScheduleTasksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeScheduleTasksWithOptions(request, runtime);
    }

    public DescribeSlowLogRecordsResponse describeSlowLogRecordsWithOptions(DescribeSlowLogRecordsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSlowLogRecords", "2017-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSlowLogRecordsResponse());
    }

    public DescribeSlowLogRecordsResponse describeSlowLogRecords(DescribeSlowLogRecordsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSlowLogRecordsWithOptions(request, runtime);
    }

    public DescribeSQLExplorerPolicyResponse describeSQLExplorerPolicyWithOptions(DescribeSQLExplorerPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSQLExplorerPolicy", "2017-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSQLExplorerPolicyResponse());
    }

    public DescribeSQLExplorerPolicyResponse describeSQLExplorerPolicy(DescribeSQLExplorerPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSQLExplorerPolicyWithOptions(request, runtime);
    }

    public DescribeSQLExplorerRetentionResponse describeSQLExplorerRetentionWithOptions(DescribeSQLExplorerRetentionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSQLExplorerRetention", "2017-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSQLExplorerRetentionResponse());
    }

    public DescribeSQLExplorerRetentionResponse describeSQLExplorerRetention(DescribeSQLExplorerRetentionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSQLExplorerRetentionWithOptions(request, runtime);
    }

    public DescribeSQLExplorerVersionResponse describeSQLExplorerVersionWithOptions(DescribeSQLExplorerVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSQLExplorerVersion", "2017-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSQLExplorerVersionResponse());
    }

    public DescribeSQLExplorerVersionResponse describeSQLExplorerVersion(DescribeSQLExplorerVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSQLExplorerVersionWithOptions(request, runtime);
    }

    public DescribeSQLLogRecordsResponse describeSQLLogRecordsWithOptions(DescribeSQLLogRecordsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSQLLogRecords", "2017-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSQLLogRecordsResponse());
    }

    public DescribeSQLLogRecordsResponse describeSQLLogRecords(DescribeSQLLogRecordsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSQLLogRecordsWithOptions(request, runtime);
    }

    public DescribeSQLLogTemplatesResponse describeSQLLogTemplatesWithOptions(DescribeSQLLogTemplatesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSQLLogTemplates", "2017-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSQLLogTemplatesResponse());
    }

    public DescribeSQLLogTemplatesResponse describeSQLLogTemplates(DescribeSQLLogTemplatesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSQLLogTemplatesWithOptions(request, runtime);
    }

    public DescribeSqlLogTrialStatusResponse describeSqlLogTrialStatusWithOptions(DescribeSqlLogTrialStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSqlLogTrialStatus", "2017-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSqlLogTrialStatusResponse());
    }

    public DescribeSqlLogTrialStatusResponse describeSqlLogTrialStatus(DescribeSqlLogTrialStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSqlLogTrialStatusWithOptions(request, runtime);
    }

    public DescribeTasksResponse describeTasksWithOptions(DescribeTasksRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeTasks", "2017-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeTasksResponse());
    }

    public DescribeTasksResponse describeTasks(DescribeTasksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeTasksWithOptions(request, runtime);
    }

    public FailoverDBClusterResponse failoverDBClusterWithOptions(FailoverDBClusterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("FailoverDBCluster", "2017-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new FailoverDBClusterResponse());
    }

    public FailoverDBClusterResponse failoverDBCluster(FailoverDBClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.failoverDBClusterWithOptions(request, runtime);
    }

    public GrantAccountPrivilegeResponse grantAccountPrivilegeWithOptions(GrantAccountPrivilegeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GrantAccountPrivilege", "2017-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new GrantAccountPrivilegeResponse());
    }

    public GrantAccountPrivilegeResponse grantAccountPrivilege(GrantAccountPrivilegeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.grantAccountPrivilegeWithOptions(request, runtime);
    }

    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListTagResources", "2017-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListTagResourcesResponse());
    }

    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    public ModifyAccountDescriptionResponse modifyAccountDescriptionWithOptions(ModifyAccountDescriptionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyAccountDescription", "2017-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyAccountDescriptionResponse());
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
        return TeaModel.toModel(this.doRPCRequest("ModifyAccountPassword", "2017-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyAccountPasswordResponse());
    }

    public ModifyAccountPasswordResponse modifyAccountPassword(ModifyAccountPasswordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyAccountPasswordWithOptions(request, runtime);
    }

    public ModifyAutoRenewAttributeResponse modifyAutoRenewAttributeWithOptions(ModifyAutoRenewAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyAutoRenewAttribute", "2017-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyAutoRenewAttributeResponse());
    }

    public ModifyAutoRenewAttributeResponse modifyAutoRenewAttribute(ModifyAutoRenewAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyAutoRenewAttributeWithOptions(request, runtime);
    }

    public ModifyBackupPolicyResponse modifyBackupPolicyWithOptions(ModifyBackupPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyBackupPolicy", "2017-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyBackupPolicyResponse());
    }

    public ModifyBackupPolicyResponse modifyBackupPolicy(ModifyBackupPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyBackupPolicyWithOptions(request, runtime);
    }

    public ModifyDBClusterAccessWhitelistResponse modifyDBClusterAccessWhitelistWithOptions(ModifyDBClusterAccessWhitelistRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDBClusterAccessWhitelist", "2017-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDBClusterAccessWhitelistResponse());
    }

    public ModifyDBClusterAccessWhitelistResponse modifyDBClusterAccessWhitelist(ModifyDBClusterAccessWhitelistRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDBClusterAccessWhitelistWithOptions(request, runtime);
    }

    public ModifyDBClusterAuditLogCollectorResponse modifyDBClusterAuditLogCollectorWithOptions(ModifyDBClusterAuditLogCollectorRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDBClusterAuditLogCollector", "2017-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDBClusterAuditLogCollectorResponse());
    }

    public ModifyDBClusterAuditLogCollectorResponse modifyDBClusterAuditLogCollector(ModifyDBClusterAuditLogCollectorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDBClusterAuditLogCollectorWithOptions(request, runtime);
    }

    public ModifyDBClusterDescriptionResponse modifyDBClusterDescriptionWithOptions(ModifyDBClusterDescriptionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDBClusterDescription", "2017-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDBClusterDescriptionResponse());
    }

    public ModifyDBClusterDescriptionResponse modifyDBClusterDescription(ModifyDBClusterDescriptionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDBClusterDescriptionWithOptions(request, runtime);
    }

    public ModifyDBClusterEndpointResponse modifyDBClusterEndpointWithOptions(ModifyDBClusterEndpointRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDBClusterEndpoint", "2017-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDBClusterEndpointResponse());
    }

    public ModifyDBClusterEndpointResponse modifyDBClusterEndpoint(ModifyDBClusterEndpointRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDBClusterEndpointWithOptions(request, runtime);
    }

    public ModifyDBClusterMaintainTimeResponse modifyDBClusterMaintainTimeWithOptions(ModifyDBClusterMaintainTimeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDBClusterMaintainTime", "2017-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDBClusterMaintainTimeResponse());
    }

    public ModifyDBClusterMaintainTimeResponse modifyDBClusterMaintainTime(ModifyDBClusterMaintainTimeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDBClusterMaintainTimeWithOptions(request, runtime);
    }

    public ModifyDBClusterMigrationResponse modifyDBClusterMigrationWithOptions(ModifyDBClusterMigrationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDBClusterMigration", "2017-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDBClusterMigrationResponse());
    }

    public ModifyDBClusterMigrationResponse modifyDBClusterMigration(ModifyDBClusterMigrationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDBClusterMigrationWithOptions(request, runtime);
    }

    public ModifyDBClusterMonitorResponse modifyDBClusterMonitorWithOptions(ModifyDBClusterMonitorRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDBClusterMonitor", "2017-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDBClusterMonitorResponse());
    }

    public ModifyDBClusterMonitorResponse modifyDBClusterMonitor(ModifyDBClusterMonitorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDBClusterMonitorWithOptions(request, runtime);
    }

    public ModifyDBClusterParametersResponse modifyDBClusterParametersWithOptions(ModifyDBClusterParametersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDBClusterParameters", "2017-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDBClusterParametersResponse());
    }

    public ModifyDBClusterParametersResponse modifyDBClusterParameters(ModifyDBClusterParametersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDBClusterParametersWithOptions(request, runtime);
    }

    public ModifyDBClusterPrimaryZoneResponse modifyDBClusterPrimaryZoneWithOptions(ModifyDBClusterPrimaryZoneRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDBClusterPrimaryZone", "2017-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDBClusterPrimaryZoneResponse());
    }

    public ModifyDBClusterPrimaryZoneResponse modifyDBClusterPrimaryZone(ModifyDBClusterPrimaryZoneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDBClusterPrimaryZoneWithOptions(request, runtime);
    }

    public ModifyDBClusterSSLResponse modifyDBClusterSSLWithOptions(ModifyDBClusterSSLRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDBClusterSSL", "2017-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDBClusterSSLResponse());
    }

    public ModifyDBClusterSSLResponse modifyDBClusterSSL(ModifyDBClusterSSLRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDBClusterSSLWithOptions(request, runtime);
    }

    public ModifyDBClusterTDEResponse modifyDBClusterTDEWithOptions(ModifyDBClusterTDERequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDBClusterTDE", "2017-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDBClusterTDEResponse());
    }

    public ModifyDBClusterTDEResponse modifyDBClusterTDE(ModifyDBClusterTDERequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDBClusterTDEWithOptions(request, runtime);
    }

    public ModifyDBDescriptionResponse modifyDBDescriptionWithOptions(ModifyDBDescriptionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDBDescription", "2017-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDBDescriptionResponse());
    }

    public ModifyDBDescriptionResponse modifyDBDescription(ModifyDBDescriptionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDBDescriptionWithOptions(request, runtime);
    }

    public ModifyDBEndpointAddressResponse modifyDBEndpointAddressWithOptions(ModifyDBEndpointAddressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDBEndpointAddress", "2017-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDBEndpointAddressResponse());
    }

    public ModifyDBEndpointAddressResponse modifyDBEndpointAddress(ModifyDBEndpointAddressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDBEndpointAddressWithOptions(request, runtime);
    }

    public ModifyDBNodeClassResponse modifyDBNodeClassWithOptions(ModifyDBNodeClassRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDBNodeClass", "2017-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDBNodeClassResponse());
    }

    public ModifyDBNodeClassResponse modifyDBNodeClass(ModifyDBNodeClassRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDBNodeClassWithOptions(request, runtime);
    }

    public ModifyLogBackupPolicyResponse modifyLogBackupPolicyWithOptions(ModifyLogBackupPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyLogBackupPolicy", "2017-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyLogBackupPolicyResponse());
    }

    public ModifyLogBackupPolicyResponse modifyLogBackupPolicy(ModifyLogBackupPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyLogBackupPolicyWithOptions(request, runtime);
    }

    public ModifyPendingMaintenanceActionResponse modifyPendingMaintenanceActionWithOptions(ModifyPendingMaintenanceActionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyPendingMaintenanceAction", "2017-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyPendingMaintenanceActionResponse());
    }

    public ModifyPendingMaintenanceActionResponse modifyPendingMaintenanceAction(ModifyPendingMaintenanceActionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyPendingMaintenanceActionWithOptions(request, runtime);
    }

    public ResetAccountResponse resetAccountWithOptions(ResetAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ResetAccount", "2017-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new ResetAccountResponse());
    }

    public ResetAccountResponse resetAccount(ResetAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.resetAccountWithOptions(request, runtime);
    }

    public RestartDBNodeResponse restartDBNodeWithOptions(RestartDBNodeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RestartDBNode", "2017-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new RestartDBNodeResponse());
    }

    public RestartDBNodeResponse restartDBNode(RestartDBNodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.restartDBNodeWithOptions(request, runtime);
    }

    public RestoreTableResponse restoreTableWithOptions(RestoreTableRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RestoreTable", "2017-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new RestoreTableResponse());
    }

    public RestoreTableResponse restoreTable(RestoreTableRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.restoreTableWithOptions(request, runtime);
    }

    public RevokeAccountPrivilegeResponse revokeAccountPrivilegeWithOptions(RevokeAccountPrivilegeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RevokeAccountPrivilege", "2017-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new RevokeAccountPrivilegeResponse());
    }

    public RevokeAccountPrivilegeResponse revokeAccountPrivilege(RevokeAccountPrivilegeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.revokeAccountPrivilegeWithOptions(request, runtime);
    }

    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("TagResources", "2017-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new TagResourcesResponse());
    }

    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

    public UntagResourcesResponse untagResourcesWithOptions(UntagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UntagResources", "2017-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new UntagResourcesResponse());
    }

    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.untagResourcesWithOptions(request, runtime);
    }

    public UpgradeDBClusterMinorVersionResponse upgradeDBClusterMinorVersionWithOptions(UpgradeDBClusterMinorVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpgradeDBClusterMinorVersion", "2017-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new UpgradeDBClusterMinorVersionResponse());
    }

    public UpgradeDBClusterMinorVersionResponse upgradeDBClusterMinorVersion(UpgradeDBClusterMinorVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.upgradeDBClusterMinorVersionWithOptions(request, runtime);
    }

    public UpgradeDBClusterVersionResponse upgradeDBClusterVersionWithOptions(UpgradeDBClusterVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpgradeDBClusterVersion", "2017-08-01", "HTTPS", "POST", "AK", "json", req, runtime), new UpgradeDBClusterVersionResponse());
    }

    public UpgradeDBClusterVersionResponse upgradeDBClusterVersion(UpgradeDBClusterVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.upgradeDBClusterVersionWithOptions(request, runtime);
    }
}
