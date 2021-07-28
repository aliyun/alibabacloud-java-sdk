// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815;

import com.aliyun.tea.*;
import com.aliyun.rds20140815.models.*;
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
            new TeaPair("cn-qingdao", "rds.aliyuncs.com"),
            new TeaPair("cn-beijing", "rds.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "rds.aliyuncs.com"),
            new TeaPair("cn-shanghai", "rds.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "rds.aliyuncs.com"),
            new TeaPair("cn-heyuan", "rds.aliyuncs.com"),
            new TeaPair("cn-hongkong", "rds.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "rds.aliyuncs.com"),
            new TeaPair("us-west-1", "rds.aliyuncs.com"),
            new TeaPair("us-east-1", "rds.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "rds.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "rds.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "rds.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "rds.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "rds.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "rds.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "rds.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "rds.aliyuncs.com"),
            new TeaPair("cn-edge-1", "rds.aliyuncs.com"),
            new TeaPair("cn-fujian", "rds.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "rds.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "rds.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "rds.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "rds.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "rds.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "rds.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "rds.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "rds.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "rds.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "rds.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "rds.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "rds.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "rds.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "rds.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "rds.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "rds.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "rds.aliyuncs.com"),
            new TeaPair("cn-wuhan", "rds.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "rds.aliyuncs.com"),
            new TeaPair("cn-zhangbei", "rds.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "rds.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "rds.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "rds.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "rds.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "rds.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("rds", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AddTagsToResourceResponse addTagsToResourceWithOptions(AddTagsToResourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddTagsToResource", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new AddTagsToResourceResponse());
    }

    public AddTagsToResourceResponse addTagsToResource(AddTagsToResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addTagsToResourceWithOptions(request, runtime);
    }

    public AllocateInstancePublicConnectionResponse allocateInstancePublicConnectionWithOptions(AllocateInstancePublicConnectionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AllocateInstancePublicConnection", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new AllocateInstancePublicConnectionResponse());
    }

    public AllocateInstancePublicConnectionResponse allocateInstancePublicConnection(AllocateInstancePublicConnectionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.allocateInstancePublicConnectionWithOptions(request, runtime);
    }

    public AllocateReadWriteSplittingConnectionResponse allocateReadWriteSplittingConnectionWithOptions(AllocateReadWriteSplittingConnectionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AllocateReadWriteSplittingConnection", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new AllocateReadWriteSplittingConnectionResponse());
    }

    public AllocateReadWriteSplittingConnectionResponse allocateReadWriteSplittingConnection(AllocateReadWriteSplittingConnectionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.allocateReadWriteSplittingConnectionWithOptions(request, runtime);
    }

    public CalculateDBInstanceWeightResponse calculateDBInstanceWeightWithOptions(CalculateDBInstanceWeightRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CalculateDBInstanceWeight", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new CalculateDBInstanceWeightResponse());
    }

    public CalculateDBInstanceWeightResponse calculateDBInstanceWeight(CalculateDBInstanceWeightRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.calculateDBInstanceWeightWithOptions(request, runtime);
    }

    public CancelImportResponse cancelImportWithOptions(CancelImportRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CancelImport", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new CancelImportResponse());
    }

    public CancelImportResponse cancelImport(CancelImportRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cancelImportWithOptions(request, runtime);
    }

    public CheckAccountNameAvailableResponse checkAccountNameAvailableWithOptions(CheckAccountNameAvailableRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CheckAccountNameAvailable", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new CheckAccountNameAvailableResponse());
    }

    public CheckAccountNameAvailableResponse checkAccountNameAvailable(CheckAccountNameAvailableRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkAccountNameAvailableWithOptions(request, runtime);
    }

    public CheckCloudResourceAuthorizedResponse checkCloudResourceAuthorizedWithOptions(CheckCloudResourceAuthorizedRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CheckCloudResourceAuthorized", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new CheckCloudResourceAuthorizedResponse());
    }

    public CheckCloudResourceAuthorizedResponse checkCloudResourceAuthorized(CheckCloudResourceAuthorizedRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkCloudResourceAuthorizedWithOptions(request, runtime);
    }

    public CheckCreateDdrDBInstanceResponse checkCreateDdrDBInstanceWithOptions(CheckCreateDdrDBInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CheckCreateDdrDBInstance", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new CheckCreateDdrDBInstanceResponse());
    }

    public CheckCreateDdrDBInstanceResponse checkCreateDdrDBInstance(CheckCreateDdrDBInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkCreateDdrDBInstanceWithOptions(request, runtime);
    }

    public CheckDBNameAvailableResponse checkDBNameAvailableWithOptions(CheckDBNameAvailableRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CheckDBNameAvailable", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new CheckDBNameAvailableResponse());
    }

    public CheckDBNameAvailableResponse checkDBNameAvailable(CheckDBNameAvailableRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkDBNameAvailableWithOptions(request, runtime);
    }

    public CheckInstanceExistResponse checkInstanceExistWithOptions(CheckInstanceExistRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CheckInstanceExist", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new CheckInstanceExistResponse());
    }

    public CheckInstanceExistResponse checkInstanceExist(CheckInstanceExistRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkInstanceExistWithOptions(request, runtime);
    }

    public ClearDedicatedHostResponse clearDedicatedHostWithOptions(ClearDedicatedHostRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ClearDedicatedHost", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new ClearDedicatedHostResponse());
    }

    public ClearDedicatedHostResponse clearDedicatedHost(ClearDedicatedHostRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.clearDedicatedHostWithOptions(request, runtime);
    }

    public CloneDBInstanceResponse cloneDBInstanceWithOptions(CloneDBInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CloneDBInstance", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new CloneDBInstanceResponse());
    }

    public CloneDBInstanceResponse cloneDBInstance(CloneDBInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cloneDBInstanceWithOptions(request, runtime);
    }

    public CloneParameterGroupResponse cloneParameterGroupWithOptions(CloneParameterGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CloneParameterGroup", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new CloneParameterGroupResponse());
    }

    public CloneParameterGroupResponse cloneParameterGroup(CloneParameterGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cloneParameterGroupWithOptions(request, runtime);
    }

    public CopyDatabaseResponse copyDatabaseWithOptions(CopyDatabaseRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CopyDatabase", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new CopyDatabaseResponse());
    }

    public CopyDatabaseResponse copyDatabase(CopyDatabaseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.copyDatabaseWithOptions(request, runtime);
    }

    public CopyDatabaseBetweenInstancesResponse copyDatabaseBetweenInstancesWithOptions(CopyDatabaseBetweenInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CopyDatabaseBetweenInstances", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new CopyDatabaseBetweenInstancesResponse());
    }

    public CopyDatabaseBetweenInstancesResponse copyDatabaseBetweenInstances(CopyDatabaseBetweenInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.copyDatabaseBetweenInstancesWithOptions(request, runtime);
    }

    public CreateAccountResponse createAccountWithOptions(CreateAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateAccount", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new CreateAccountResponse());
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
        return TeaModel.toModel(this.doRPCRequest("CreateBackup", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new CreateBackupResponse());
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
        return TeaModel.toModel(this.doRPCRequest("CreateDatabase", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new CreateDatabaseResponse());
    }

    public CreateDatabaseResponse createDatabase(CreateDatabaseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDatabaseWithOptions(request, runtime);
    }

    public CreateDBInstanceResponse createDBInstanceWithOptions(CreateDBInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateDBInstance", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new CreateDBInstanceResponse());
    }

    public CreateDBInstanceResponse createDBInstance(CreateDBInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDBInstanceWithOptions(request, runtime);
    }

    public CreateDBProxyEndpointAddressResponse createDBProxyEndpointAddressWithOptions(CreateDBProxyEndpointAddressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateDBProxyEndpointAddress", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new CreateDBProxyEndpointAddressResponse());
    }

    public CreateDBProxyEndpointAddressResponse createDBProxyEndpointAddress(CreateDBProxyEndpointAddressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDBProxyEndpointAddressWithOptions(request, runtime);
    }

    public CreateDdrInstanceResponse createDdrInstanceWithOptions(CreateDdrInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateDdrInstance", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new CreateDdrInstanceResponse());
    }

    public CreateDdrInstanceResponse createDdrInstance(CreateDdrInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDdrInstanceWithOptions(request, runtime);
    }

    public CreateDedicatedHostResponse createDedicatedHostWithOptions(CreateDedicatedHostRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateDedicatedHost", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new CreateDedicatedHostResponse());
    }

    public CreateDedicatedHostResponse createDedicatedHost(CreateDedicatedHostRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDedicatedHostWithOptions(request, runtime);
    }

    public CreateDedicatedHostAccountResponse createDedicatedHostAccountWithOptions(CreateDedicatedHostAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateDedicatedHostAccount", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new CreateDedicatedHostAccountResponse());
    }

    public CreateDedicatedHostAccountResponse createDedicatedHostAccount(CreateDedicatedHostAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDedicatedHostAccountWithOptions(request, runtime);
    }

    public CreateDedicatedHostGroupResponse createDedicatedHostGroupWithOptions(CreateDedicatedHostGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateDedicatedHostGroup", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new CreateDedicatedHostGroupResponse());
    }

    public CreateDedicatedHostGroupResponse createDedicatedHostGroup(CreateDedicatedHostGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDedicatedHostGroupWithOptions(request, runtime);
    }

    public CreateDedicatedHostUserResponse createDedicatedHostUserWithOptions(CreateDedicatedHostUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateDedicatedHostUser", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new CreateDedicatedHostUserResponse());
    }

    public CreateDedicatedHostUserResponse createDedicatedHostUser(CreateDedicatedHostUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDedicatedHostUserWithOptions(request, runtime);
    }

    public CreateDiagnosticReportResponse createDiagnosticReportWithOptions(CreateDiagnosticReportRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateDiagnosticReport", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new CreateDiagnosticReportResponse());
    }

    public CreateDiagnosticReportResponse createDiagnosticReport(CreateDiagnosticReportRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDiagnosticReportWithOptions(request, runtime);
    }

    public CreateGdnInstanceResponse createGdnInstanceWithOptions(CreateGdnInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateGdnInstance", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new CreateGdnInstanceResponse());
    }

    public CreateGdnInstanceResponse createGdnInstance(CreateGdnInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createGdnInstanceWithOptions(request, runtime);
    }

    public CreateMigrateTaskResponse createMigrateTaskWithOptions(CreateMigrateTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateMigrateTask", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new CreateMigrateTaskResponse());
    }

    public CreateMigrateTaskResponse createMigrateTask(CreateMigrateTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createMigrateTaskWithOptions(request, runtime);
    }

    public CreateMigrateTaskForSQLServerResponse createMigrateTaskForSQLServerWithOptions(CreateMigrateTaskForSQLServerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateMigrateTaskForSQLServer", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new CreateMigrateTaskForSQLServerResponse());
    }

    public CreateMigrateTaskForSQLServerResponse createMigrateTaskForSQLServer(CreateMigrateTaskForSQLServerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createMigrateTaskForSQLServerWithOptions(request, runtime);
    }

    public CreateOnlineDatabaseTaskResponse createOnlineDatabaseTaskWithOptions(CreateOnlineDatabaseTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateOnlineDatabaseTask", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new CreateOnlineDatabaseTaskResponse());
    }

    public CreateOnlineDatabaseTaskResponse createOnlineDatabaseTask(CreateOnlineDatabaseTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createOnlineDatabaseTaskWithOptions(request, runtime);
    }

    public CreateParameterGroupResponse createParameterGroupWithOptions(CreateParameterGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateParameterGroup", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new CreateParameterGroupResponse());
    }

    public CreateParameterGroupResponse createParameterGroup(CreateParameterGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createParameterGroupWithOptions(request, runtime);
    }

    public CreateReadOnlyDBInstanceResponse createReadOnlyDBInstanceWithOptions(CreateReadOnlyDBInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateReadOnlyDBInstance", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new CreateReadOnlyDBInstanceResponse());
    }

    public CreateReadOnlyDBInstanceResponse createReadOnlyDBInstance(CreateReadOnlyDBInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createReadOnlyDBInstanceWithOptions(request, runtime);
    }

    public CreateTempDBInstanceResponse createTempDBInstanceWithOptions(CreateTempDBInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateTempDBInstance", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new CreateTempDBInstanceResponse());
    }

    public CreateTempDBInstanceResponse createTempDBInstance(CreateTempDBInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createTempDBInstanceWithOptions(request, runtime);
    }

    public DeleteAccountResponse deleteAccountWithOptions(DeleteAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteAccount", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteAccountResponse());
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
        return TeaModel.toModel(this.doRPCRequest("DeleteBackup", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteBackupResponse());
    }

    public DeleteBackupResponse deleteBackup(DeleteBackupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteBackupWithOptions(request, runtime);
    }

    public DeleteBackupFileResponse deleteBackupFileWithOptions(DeleteBackupFileRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteBackupFile", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteBackupFileResponse());
    }

    public DeleteBackupFileResponse deleteBackupFile(DeleteBackupFileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteBackupFileWithOptions(request, runtime);
    }

    public DeleteDatabaseResponse deleteDatabaseWithOptions(DeleteDatabaseRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteDatabase", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteDatabaseResponse());
    }

    public DeleteDatabaseResponse deleteDatabase(DeleteDatabaseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDatabaseWithOptions(request, runtime);
    }

    public DeleteDBInstanceResponse deleteDBInstanceWithOptions(DeleteDBInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteDBInstance", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteDBInstanceResponse());
    }

    public DeleteDBInstanceResponse deleteDBInstance(DeleteDBInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDBInstanceWithOptions(request, runtime);
    }

    public DeleteDBProxyEndpointAddressResponse deleteDBProxyEndpointAddressWithOptions(DeleteDBProxyEndpointAddressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteDBProxyEndpointAddress", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteDBProxyEndpointAddressResponse());
    }

    public DeleteDBProxyEndpointAddressResponse deleteDBProxyEndpointAddress(DeleteDBProxyEndpointAddressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDBProxyEndpointAddressWithOptions(request, runtime);
    }

    public DeleteDedicatedHostAccountResponse deleteDedicatedHostAccountWithOptions(DeleteDedicatedHostAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteDedicatedHostAccount", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteDedicatedHostAccountResponse());
    }

    public DeleteDedicatedHostAccountResponse deleteDedicatedHostAccount(DeleteDedicatedHostAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDedicatedHostAccountWithOptions(request, runtime);
    }

    public DeleteDedicatedHostGroupResponse deleteDedicatedHostGroupWithOptions(DeleteDedicatedHostGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteDedicatedHostGroup", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteDedicatedHostGroupResponse());
    }

    public DeleteDedicatedHostGroupResponse deleteDedicatedHostGroup(DeleteDedicatedHostGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDedicatedHostGroupWithOptions(request, runtime);
    }

    public DeleteParameterGroupResponse deleteParameterGroupWithOptions(DeleteParameterGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteParameterGroup", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteParameterGroupResponse());
    }

    public DeleteParameterGroupResponse deleteParameterGroup(DeleteParameterGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteParameterGroupWithOptions(request, runtime);
    }

    public DeleteUserBackupFileResponse deleteUserBackupFileWithOptions(DeleteUserBackupFileRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteUserBackupFile", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteUserBackupFileResponse());
    }

    public DeleteUserBackupFileResponse deleteUserBackupFile(DeleteUserBackupFileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteUserBackupFileWithOptions(request, runtime);
    }

    public DescibeImportsFromDatabaseResponse descibeImportsFromDatabaseWithOptions(DescibeImportsFromDatabaseRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescibeImportsFromDatabase", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescibeImportsFromDatabaseResponse());
    }

    public DescibeImportsFromDatabaseResponse descibeImportsFromDatabase(DescibeImportsFromDatabaseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.descibeImportsFromDatabaseWithOptions(request, runtime);
    }

    public DescribeAccountsResponse describeAccountsWithOptions(DescribeAccountsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAccounts", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAccountsResponse());
    }

    public DescribeAccountsResponse describeAccounts(DescribeAccountsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAccountsWithOptions(request, runtime);
    }

    public DescribeActionEventPolicyResponse describeActionEventPolicyWithOptions(DescribeActionEventPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeActionEventPolicy", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeActionEventPolicyResponse());
    }

    public DescribeActionEventPolicyResponse describeActionEventPolicy(DescribeActionEventPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeActionEventPolicyWithOptions(request, runtime);
    }

    public DescribeAvailableClassesResponse describeAvailableClassesWithOptions(DescribeAvailableClassesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAvailableClasses", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAvailableClassesResponse());
    }

    public DescribeAvailableClassesResponse describeAvailableClasses(DescribeAvailableClassesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAvailableClassesWithOptions(request, runtime);
    }

    public DescribeAvailableCrossRegionResponse describeAvailableCrossRegionWithOptions(DescribeAvailableCrossRegionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAvailableCrossRegion", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAvailableCrossRegionResponse());
    }

    public DescribeAvailableCrossRegionResponse describeAvailableCrossRegion(DescribeAvailableCrossRegionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAvailableCrossRegionWithOptions(request, runtime);
    }

    public DescribeAvailableDedicatedHostClassesResponse describeAvailableDedicatedHostClassesWithOptions(DescribeAvailableDedicatedHostClassesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAvailableDedicatedHostClasses", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAvailableDedicatedHostClassesResponse());
    }

    public DescribeAvailableDedicatedHostClassesResponse describeAvailableDedicatedHostClasses(DescribeAvailableDedicatedHostClassesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAvailableDedicatedHostClassesWithOptions(request, runtime);
    }

    public DescribeAvailableDedicatedHostZonesResponse describeAvailableDedicatedHostZonesWithOptions(DescribeAvailableDedicatedHostZonesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAvailableDedicatedHostZones", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAvailableDedicatedHostZonesResponse());
    }

    public DescribeAvailableDedicatedHostZonesResponse describeAvailableDedicatedHostZones(DescribeAvailableDedicatedHostZonesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAvailableDedicatedHostZonesWithOptions(request, runtime);
    }

    public DescribeAvailableRecoveryTimeResponse describeAvailableRecoveryTimeWithOptions(DescribeAvailableRecoveryTimeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAvailableRecoveryTime", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAvailableRecoveryTimeResponse());
    }

    public DescribeAvailableRecoveryTimeResponse describeAvailableRecoveryTime(DescribeAvailableRecoveryTimeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAvailableRecoveryTimeWithOptions(request, runtime);
    }

    public DescribeAvailableZonesResponse describeAvailableZonesWithOptions(DescribeAvailableZonesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAvailableZones", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAvailableZonesResponse());
    }

    public DescribeAvailableZonesResponse describeAvailableZones(DescribeAvailableZonesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAvailableZonesWithOptions(request, runtime);
    }

    public DescribeBackupDatabaseResponse describeBackupDatabaseWithOptions(DescribeBackupDatabaseRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeBackupDatabase", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeBackupDatabaseResponse());
    }

    public DescribeBackupDatabaseResponse describeBackupDatabase(DescribeBackupDatabaseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeBackupDatabaseWithOptions(request, runtime);
    }

    public DescribeBackupPolicyResponse describeBackupPolicyWithOptions(DescribeBackupPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeBackupPolicy", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeBackupPolicyResponse());
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
        return TeaModel.toModel(this.doRPCRequest("DescribeBackups", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeBackupsResponse());
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
        return TeaModel.toModel(this.doRPCRequest("DescribeBackupTasks", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeBackupTasksResponse());
    }

    public DescribeBackupTasksResponse describeBackupTasks(DescribeBackupTasksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeBackupTasksWithOptions(request, runtime);
    }

    public DescribeBinlogFilesResponse describeBinlogFilesWithOptions(DescribeBinlogFilesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeBinlogFiles", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeBinlogFilesResponse());
    }

    public DescribeBinlogFilesResponse describeBinlogFiles(DescribeBinlogFilesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeBinlogFilesWithOptions(request, runtime);
    }

    public DescribeCharacterSetNameResponse describeCharacterSetNameWithOptions(DescribeCharacterSetNameRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCharacterSetName", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCharacterSetNameResponse());
    }

    public DescribeCharacterSetNameResponse describeCharacterSetName(DescribeCharacterSetNameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCharacterSetNameWithOptions(request, runtime);
    }

    public DescribeCollationTimeZonesResponse describeCollationTimeZonesWithOptions(DescribeCollationTimeZonesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCollationTimeZones", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCollationTimeZonesResponse());
    }

    public DescribeCollationTimeZonesResponse describeCollationTimeZones(DescribeCollationTimeZonesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCollationTimeZonesWithOptions(request, runtime);
    }

    public DescribeCrossBackupMetaListResponse describeCrossBackupMetaListWithOptions(DescribeCrossBackupMetaListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCrossBackupMetaList", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCrossBackupMetaListResponse());
    }

    public DescribeCrossBackupMetaListResponse describeCrossBackupMetaList(DescribeCrossBackupMetaListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCrossBackupMetaListWithOptions(request, runtime);
    }

    public DescribeCrossRegionBackupDBInstanceResponse describeCrossRegionBackupDBInstanceWithOptions(DescribeCrossRegionBackupDBInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCrossRegionBackupDBInstance", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCrossRegionBackupDBInstanceResponse());
    }

    public DescribeCrossRegionBackupDBInstanceResponse describeCrossRegionBackupDBInstance(DescribeCrossRegionBackupDBInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCrossRegionBackupDBInstanceWithOptions(request, runtime);
    }

    public DescribeCrossRegionBackupsResponse describeCrossRegionBackupsWithOptions(DescribeCrossRegionBackupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCrossRegionBackups", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCrossRegionBackupsResponse());
    }

    public DescribeCrossRegionBackupsResponse describeCrossRegionBackups(DescribeCrossRegionBackupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCrossRegionBackupsWithOptions(request, runtime);
    }

    public DescribeCrossRegionLogBackupFilesResponse describeCrossRegionLogBackupFilesWithOptions(DescribeCrossRegionLogBackupFilesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCrossRegionLogBackupFiles", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCrossRegionLogBackupFilesResponse());
    }

    public DescribeCrossRegionLogBackupFilesResponse describeCrossRegionLogBackupFiles(DescribeCrossRegionLogBackupFilesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCrossRegionLogBackupFilesWithOptions(request, runtime);
    }

    public DescribeDatabasesResponse describeDatabasesWithOptions(DescribeDatabasesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDatabases", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDatabasesResponse());
    }

    public DescribeDatabasesResponse describeDatabases(DescribeDatabasesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDatabasesWithOptions(request, runtime);
    }

    public DescribeDBInstanceAttributeResponse describeDBInstanceAttributeWithOptions(DescribeDBInstanceAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDBInstanceAttribute", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDBInstanceAttributeResponse());
    }

    public DescribeDBInstanceAttributeResponse describeDBInstanceAttribute(DescribeDBInstanceAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDBInstanceAttributeWithOptions(request, runtime);
    }

    public DescribeDBInstanceDetailResponse describeDBInstanceDetailWithOptions(DescribeDBInstanceDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDBInstanceDetail", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDBInstanceDetailResponse());
    }

    public DescribeDBInstanceDetailResponse describeDBInstanceDetail(DescribeDBInstanceDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDBInstanceDetailWithOptions(request, runtime);
    }

    public DescribeDBInstanceEncryptionKeyResponse describeDBInstanceEncryptionKeyWithOptions(DescribeDBInstanceEncryptionKeyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDBInstanceEncryptionKey", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDBInstanceEncryptionKeyResponse());
    }

    public DescribeDBInstanceEncryptionKeyResponse describeDBInstanceEncryptionKey(DescribeDBInstanceEncryptionKeyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDBInstanceEncryptionKeyWithOptions(request, runtime);
    }

    public DescribeDBInstanceHAConfigResponse describeDBInstanceHAConfigWithOptions(DescribeDBInstanceHAConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDBInstanceHAConfig", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDBInstanceHAConfigResponse());
    }

    public DescribeDBInstanceHAConfigResponse describeDBInstanceHAConfig(DescribeDBInstanceHAConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDBInstanceHAConfigWithOptions(request, runtime);
    }

    public DescribeDBInstanceIPArrayListResponse describeDBInstanceIPArrayListWithOptions(DescribeDBInstanceIPArrayListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDBInstanceIPArrayList", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDBInstanceIPArrayListResponse());
    }

    public DescribeDBInstanceIPArrayListResponse describeDBInstanceIPArrayList(DescribeDBInstanceIPArrayListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDBInstanceIPArrayListWithOptions(request, runtime);
    }

    public DescribeDBInstanceIpHostnameResponse describeDBInstanceIpHostnameWithOptions(DescribeDBInstanceIpHostnameRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDBInstanceIpHostname", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDBInstanceIpHostnameResponse());
    }

    public DescribeDBInstanceIpHostnameResponse describeDBInstanceIpHostname(DescribeDBInstanceIpHostnameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDBInstanceIpHostnameWithOptions(request, runtime);
    }

    public DescribeDBInstanceMonitorResponse describeDBInstanceMonitorWithOptions(DescribeDBInstanceMonitorRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDBInstanceMonitor", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDBInstanceMonitorResponse());
    }

    public DescribeDBInstanceMonitorResponse describeDBInstanceMonitor(DescribeDBInstanceMonitorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDBInstanceMonitorWithOptions(request, runtime);
    }

    public DescribeDBInstanceNetInfoResponse describeDBInstanceNetInfoWithOptions(DescribeDBInstanceNetInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDBInstanceNetInfo", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDBInstanceNetInfoResponse());
    }

    public DescribeDBInstanceNetInfoResponse describeDBInstanceNetInfo(DescribeDBInstanceNetInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDBInstanceNetInfoWithOptions(request, runtime);
    }

    public DescribeDBInstancePerformanceResponse describeDBInstancePerformanceWithOptions(DescribeDBInstancePerformanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDBInstancePerformance", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDBInstancePerformanceResponse());
    }

    public DescribeDBInstancePerformanceResponse describeDBInstancePerformance(DescribeDBInstancePerformanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDBInstancePerformanceWithOptions(request, runtime);
    }

    public DescribeDBInstanceProxyConfigurationResponse describeDBInstanceProxyConfigurationWithOptions(DescribeDBInstanceProxyConfigurationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDBInstanceProxyConfiguration", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDBInstanceProxyConfigurationResponse());
    }

    public DescribeDBInstanceProxyConfigurationResponse describeDBInstanceProxyConfiguration(DescribeDBInstanceProxyConfigurationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDBInstanceProxyConfigurationWithOptions(request, runtime);
    }

    public DescribeDBInstancesResponse describeDBInstancesWithOptions(DescribeDBInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDBInstances", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDBInstancesResponse());
    }

    public DescribeDBInstancesResponse describeDBInstances(DescribeDBInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDBInstancesWithOptions(request, runtime);
    }

    public DescribeDBInstancesAsCsvResponse describeDBInstancesAsCsvWithOptions(DescribeDBInstancesAsCsvRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDBInstancesAsCsv", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDBInstancesAsCsvResponse());
    }

    public DescribeDBInstancesAsCsvResponse describeDBInstancesAsCsv(DescribeDBInstancesAsCsvRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDBInstancesAsCsvWithOptions(request, runtime);
    }

    public DescribeDBInstancesByExpireTimeResponse describeDBInstancesByExpireTimeWithOptions(DescribeDBInstancesByExpireTimeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDBInstancesByExpireTime", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDBInstancesByExpireTimeResponse());
    }

    public DescribeDBInstancesByExpireTimeResponse describeDBInstancesByExpireTime(DescribeDBInstancesByExpireTimeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDBInstancesByExpireTimeWithOptions(request, runtime);
    }

    public DescribeDBInstancesByPerformanceResponse describeDBInstancesByPerformanceWithOptions(DescribeDBInstancesByPerformanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDBInstancesByPerformance", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDBInstancesByPerformanceResponse());
    }

    public DescribeDBInstancesByPerformanceResponse describeDBInstancesByPerformance(DescribeDBInstancesByPerformanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDBInstancesByPerformanceWithOptions(request, runtime);
    }

    public DescribeDBInstancesForCloneResponse describeDBInstancesForCloneWithOptions(DescribeDBInstancesForCloneRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDBInstancesForClone", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDBInstancesForCloneResponse());
    }

    public DescribeDBInstancesForCloneResponse describeDBInstancesForClone(DescribeDBInstancesForCloneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDBInstancesForCloneWithOptions(request, runtime);
    }

    public DescribeDBInstanceSSLResponse describeDBInstanceSSLWithOptions(DescribeDBInstanceSSLRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDBInstanceSSL", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDBInstanceSSLResponse());
    }

    public DescribeDBInstanceSSLResponse describeDBInstanceSSL(DescribeDBInstanceSSLRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDBInstanceSSLWithOptions(request, runtime);
    }

    public DescribeDBInstanceStatusResponse describeDBInstanceStatusWithOptions(DescribeDBInstanceStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDBInstanceStatus", "2014-08-15", "HTTPS", "GET", "AK", "json", req, runtime), new DescribeDBInstanceStatusResponse());
    }

    public DescribeDBInstanceStatusResponse describeDBInstanceStatus(DescribeDBInstanceStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDBInstanceStatusWithOptions(request, runtime);
    }

    public DescribeDBInstanceTDEResponse describeDBInstanceTDEWithOptions(DescribeDBInstanceTDERequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDBInstanceTDE", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDBInstanceTDEResponse());
    }

    public DescribeDBInstanceTDEResponse describeDBInstanceTDE(DescribeDBInstanceTDERequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDBInstanceTDEWithOptions(request, runtime);
    }

    public DescribeDBProxyResponse describeDBProxyWithOptions(DescribeDBProxyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDBProxy", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDBProxyResponse());
    }

    public DescribeDBProxyResponse describeDBProxy(DescribeDBProxyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDBProxyWithOptions(request, runtime);
    }

    public DescribeDBProxyEndpointResponse describeDBProxyEndpointWithOptions(DescribeDBProxyEndpointRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDBProxyEndpoint", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDBProxyEndpointResponse());
    }

    public DescribeDBProxyEndpointResponse describeDBProxyEndpoint(DescribeDBProxyEndpointRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDBProxyEndpointWithOptions(request, runtime);
    }

    public DescribeDBProxyPerformanceResponse describeDBProxyPerformanceWithOptions(DescribeDBProxyPerformanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDBProxyPerformance", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDBProxyPerformanceResponse());
    }

    public DescribeDBProxyPerformanceResponse describeDBProxyPerformance(DescribeDBProxyPerformanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDBProxyPerformanceWithOptions(request, runtime);
    }

    public DescribeDedicatedHostAttributeResponse describeDedicatedHostAttributeWithOptions(DescribeDedicatedHostAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDedicatedHostAttribute", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDedicatedHostAttributeResponse());
    }

    public DescribeDedicatedHostAttributeResponse describeDedicatedHostAttribute(DescribeDedicatedHostAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDedicatedHostAttributeWithOptions(request, runtime);
    }

    public DescribeDedicatedHostGroupsResponse describeDedicatedHostGroupsWithOptions(DescribeDedicatedHostGroupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDedicatedHostGroups", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDedicatedHostGroupsResponse());
    }

    public DescribeDedicatedHostGroupsResponse describeDedicatedHostGroups(DescribeDedicatedHostGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDedicatedHostGroupsWithOptions(request, runtime);
    }

    public DescribeDedicatedHostImageCategoriesResponse describeDedicatedHostImageCategoriesWithOptions(DescribeDedicatedHostImageCategoriesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDedicatedHostImageCategories", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDedicatedHostImageCategoriesResponse());
    }

    public DescribeDedicatedHostImageCategoriesResponse describeDedicatedHostImageCategories(DescribeDedicatedHostImageCategoriesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDedicatedHostImageCategoriesWithOptions(request, runtime);
    }

    public DescribeDedicatedHostsResponse describeDedicatedHostsWithOptions(DescribeDedicatedHostsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDedicatedHosts", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDedicatedHostsResponse());
    }

    public DescribeDedicatedHostsResponse describeDedicatedHosts(DescribeDedicatedHostsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDedicatedHostsWithOptions(request, runtime);
    }

    public DescribeDetachedBackupsResponse describeDetachedBackupsWithOptions(DescribeDetachedBackupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDetachedBackups", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDetachedBackupsResponse());
    }

    public DescribeDetachedBackupsResponse describeDetachedBackups(DescribeDetachedBackupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDetachedBackupsWithOptions(request, runtime);
    }

    public DescribeDiagnosticReportListResponse describeDiagnosticReportListWithOptions(DescribeDiagnosticReportListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDiagnosticReportList", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDiagnosticReportListResponse());
    }

    public DescribeDiagnosticReportListResponse describeDiagnosticReportList(DescribeDiagnosticReportListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDiagnosticReportListWithOptions(request, runtime);
    }

    public DescribeDTCSecurityIpHostsForSQLServerResponse describeDTCSecurityIpHostsForSQLServerWithOptions(DescribeDTCSecurityIpHostsForSQLServerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDTCSecurityIpHostsForSQLServer", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDTCSecurityIpHostsForSQLServerResponse());
    }

    public DescribeDTCSecurityIpHostsForSQLServerResponse describeDTCSecurityIpHostsForSQLServer(DescribeDTCSecurityIpHostsForSQLServerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDTCSecurityIpHostsForSQLServerWithOptions(request, runtime);
    }

    public DescribeErrorLogsResponse describeErrorLogsWithOptions(DescribeErrorLogsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeErrorLogs", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeErrorLogsResponse());
    }

    public DescribeErrorLogsResponse describeErrorLogs(DescribeErrorLogsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeErrorLogsWithOptions(request, runtime);
    }

    public DescribeEventsResponse describeEventsWithOptions(DescribeEventsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeEvents", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeEventsResponse());
    }

    public DescribeEventsResponse describeEvents(DescribeEventsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeEventsWithOptions(request, runtime);
    }

    public DescribeHADiagnoseConfigResponse describeHADiagnoseConfigWithOptions(DescribeHADiagnoseConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeHADiagnoseConfig", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeHADiagnoseConfigResponse());
    }

    public DescribeHADiagnoseConfigResponse describeHADiagnoseConfig(DescribeHADiagnoseConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeHADiagnoseConfigWithOptions(request, runtime);
    }

    public DescribeHASwitchConfigResponse describeHASwitchConfigWithOptions(DescribeHASwitchConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeHASwitchConfig", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeHASwitchConfigResponse());
    }

    public DescribeHASwitchConfigResponse describeHASwitchConfig(DescribeHASwitchConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeHASwitchConfigWithOptions(request, runtime);
    }

    public DescribeInstanceAutoRenewalAttributeResponse describeInstanceAutoRenewalAttributeWithOptions(DescribeInstanceAutoRenewalAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeInstanceAutoRenewalAttribute", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeInstanceAutoRenewalAttributeResponse());
    }

    public DescribeInstanceAutoRenewalAttributeResponse describeInstanceAutoRenewalAttribute(DescribeInstanceAutoRenewalAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstanceAutoRenewalAttributeWithOptions(request, runtime);
    }

    public DescribeInstanceCrossBackupPolicyResponse describeInstanceCrossBackupPolicyWithOptions(DescribeInstanceCrossBackupPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeInstanceCrossBackupPolicy", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeInstanceCrossBackupPolicyResponse());
    }

    public DescribeInstanceCrossBackupPolicyResponse describeInstanceCrossBackupPolicy(DescribeInstanceCrossBackupPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstanceCrossBackupPolicyWithOptions(request, runtime);
    }

    public DescribeInstanceKeywordsResponse describeInstanceKeywordsWithOptions(DescribeInstanceKeywordsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeInstanceKeywords", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeInstanceKeywordsResponse());
    }

    public DescribeInstanceKeywordsResponse describeInstanceKeywords(DescribeInstanceKeywordsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstanceKeywordsWithOptions(request, runtime);
    }

    public DescribeLocalAvailableRecoveryTimeResponse describeLocalAvailableRecoveryTimeWithOptions(DescribeLocalAvailableRecoveryTimeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLocalAvailableRecoveryTime", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeLocalAvailableRecoveryTimeResponse());
    }

    public DescribeLocalAvailableRecoveryTimeResponse describeLocalAvailableRecoveryTime(DescribeLocalAvailableRecoveryTimeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLocalAvailableRecoveryTimeWithOptions(request, runtime);
    }

    public DescribeLogBackupFilesResponse describeLogBackupFilesWithOptions(DescribeLogBackupFilesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLogBackupFiles", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeLogBackupFilesResponse());
    }

    public DescribeLogBackupFilesResponse describeLogBackupFiles(DescribeLogBackupFilesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLogBackupFilesWithOptions(request, runtime);
    }

    public DescribeMetaListResponse describeMetaListWithOptions(DescribeMetaListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeMetaList", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeMetaListResponse());
    }

    public DescribeMetaListResponse describeMetaList(DescribeMetaListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeMetaListWithOptions(request, runtime);
    }

    public DescribeMigrateTaskByIdResponse describeMigrateTaskByIdWithOptions(DescribeMigrateTaskByIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeMigrateTaskById", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeMigrateTaskByIdResponse());
    }

    public DescribeMigrateTaskByIdResponse describeMigrateTaskById(DescribeMigrateTaskByIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeMigrateTaskByIdWithOptions(request, runtime);
    }

    public DescribeMigrateTasksResponse describeMigrateTasksWithOptions(DescribeMigrateTasksRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeMigrateTasks", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeMigrateTasksResponse());
    }

    public DescribeMigrateTasksResponse describeMigrateTasks(DescribeMigrateTasksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeMigrateTasksWithOptions(request, runtime);
    }

    public DescribeMigrateTasksForSQLServerResponse describeMigrateTasksForSQLServerWithOptions(DescribeMigrateTasksForSQLServerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeMigrateTasksForSQLServer", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeMigrateTasksForSQLServerResponse());
    }

    public DescribeMigrateTasksForSQLServerResponse describeMigrateTasksForSQLServer(DescribeMigrateTasksForSQLServerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeMigrateTasksForSQLServerWithOptions(request, runtime);
    }

    public DescribeModifyParameterLogResponse describeModifyParameterLogWithOptions(DescribeModifyParameterLogRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeModifyParameterLog", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeModifyParameterLogResponse());
    }

    public DescribeModifyParameterLogResponse describeModifyParameterLog(DescribeModifyParameterLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeModifyParameterLogWithOptions(request, runtime);
    }

    public DescribeOssDownloadsResponse describeOssDownloadsWithOptions(DescribeOssDownloadsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeOssDownloads", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeOssDownloadsResponse());
    }

    public DescribeOssDownloadsResponse describeOssDownloads(DescribeOssDownloadsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeOssDownloadsWithOptions(request, runtime);
    }

    public DescribeOssDownloadsForSQLServerResponse describeOssDownloadsForSQLServerWithOptions(DescribeOssDownloadsForSQLServerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeOssDownloadsForSQLServer", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeOssDownloadsForSQLServerResponse());
    }

    public DescribeOssDownloadsForSQLServerResponse describeOssDownloadsForSQLServer(DescribeOssDownloadsForSQLServerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeOssDownloadsForSQLServerWithOptions(request, runtime);
    }

    public DescribeParameterGroupResponse describeParameterGroupWithOptions(DescribeParameterGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeParameterGroup", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeParameterGroupResponse());
    }

    public DescribeParameterGroupResponse describeParameterGroup(DescribeParameterGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeParameterGroupWithOptions(request, runtime);
    }

    public DescribeParameterGroupsResponse describeParameterGroupsWithOptions(DescribeParameterGroupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeParameterGroups", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeParameterGroupsResponse());
    }

    public DescribeParameterGroupsResponse describeParameterGroups(DescribeParameterGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeParameterGroupsWithOptions(request, runtime);
    }

    public DescribeParametersResponse describeParametersWithOptions(DescribeParametersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeParameters", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeParametersResponse());
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
        return TeaModel.toModel(this.doRPCRequest("DescribeParameterTemplates", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeParameterTemplatesResponse());
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
        return TeaModel.toModel(this.doRPCRequest("DescribePrice", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribePriceResponse());
    }

    public DescribePriceResponse describePrice(DescribePriceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describePriceWithOptions(request, runtime);
    }

    public DescribeRdsResourceSettingsResponse describeRdsResourceSettingsWithOptions(DescribeRdsResourceSettingsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRdsResourceSettings", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRdsResourceSettingsResponse());
    }

    public DescribeRdsResourceSettingsResponse describeRdsResourceSettings(DescribeRdsResourceSettingsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRdsResourceSettingsWithOptions(request, runtime);
    }

    public DescribeReadDBInstanceDelayResponse describeReadDBInstanceDelayWithOptions(DescribeReadDBInstanceDelayRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeReadDBInstanceDelay", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeReadDBInstanceDelayResponse());
    }

    public DescribeReadDBInstanceDelayResponse describeReadDBInstanceDelay(DescribeReadDBInstanceDelayRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeReadDBInstanceDelayWithOptions(request, runtime);
    }

    public DescribeRegionInfosResponse describeRegionInfosWithOptions(DescribeRegionInfosRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRegionInfos", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRegionInfosResponse());
    }

    public DescribeRegionInfosResponse describeRegionInfos(DescribeRegionInfosRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRegionInfosWithOptions(request, runtime);
    }

    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRegions", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRegionsResponse());
    }

    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRegionsWithOptions(request, runtime);
    }

    public DescribeRenewalPriceResponse describeRenewalPriceWithOptions(DescribeRenewalPriceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRenewalPrice", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRenewalPriceResponse());
    }

    public DescribeRenewalPriceResponse describeRenewalPrice(DescribeRenewalPriceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRenewalPriceWithOptions(request, runtime);
    }

    public DescribeResourceUsageResponse describeResourceUsageWithOptions(DescribeResourceUsageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeResourceUsage", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeResourceUsageResponse());
    }

    public DescribeResourceUsageResponse describeResourceUsage(DescribeResourceUsageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeResourceUsageWithOptions(request, runtime);
    }

    public DescribeSecurityGroupConfigurationResponse describeSecurityGroupConfigurationWithOptions(DescribeSecurityGroupConfigurationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSecurityGroupConfiguration", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSecurityGroupConfigurationResponse());
    }

    public DescribeSecurityGroupConfigurationResponse describeSecurityGroupConfiguration(DescribeSecurityGroupConfigurationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSecurityGroupConfigurationWithOptions(request, runtime);
    }

    public DescribeSlowLogRecordsResponse describeSlowLogRecordsWithOptions(DescribeSlowLogRecordsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSlowLogRecords", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSlowLogRecordsResponse());
    }

    public DescribeSlowLogRecordsResponse describeSlowLogRecords(DescribeSlowLogRecordsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSlowLogRecordsWithOptions(request, runtime);
    }

    public DescribeSlowLogsResponse describeSlowLogsWithOptions(DescribeSlowLogsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSlowLogs", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSlowLogsResponse());
    }

    public DescribeSlowLogsResponse describeSlowLogs(DescribeSlowLogsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSlowLogsWithOptions(request, runtime);
    }

    public DescribeSQLCollectorPolicyResponse describeSQLCollectorPolicyWithOptions(DescribeSQLCollectorPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSQLCollectorPolicy", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSQLCollectorPolicyResponse());
    }

    public DescribeSQLCollectorPolicyResponse describeSQLCollectorPolicy(DescribeSQLCollectorPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSQLCollectorPolicyWithOptions(request, runtime);
    }

    public DescribeSQLCollectorRetentionResponse describeSQLCollectorRetentionWithOptions(DescribeSQLCollectorRetentionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSQLCollectorRetention", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSQLCollectorRetentionResponse());
    }

    public DescribeSQLCollectorRetentionResponse describeSQLCollectorRetention(DescribeSQLCollectorRetentionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSQLCollectorRetentionWithOptions(request, runtime);
    }

    public DescribeSQLLogFilesResponse describeSQLLogFilesWithOptions(DescribeSQLLogFilesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSQLLogFiles", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSQLLogFilesResponse());
    }

    public DescribeSQLLogFilesResponse describeSQLLogFiles(DescribeSQLLogFilesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSQLLogFilesWithOptions(request, runtime);
    }

    public DescribeSQLLogRecordsResponse describeSQLLogRecordsWithOptions(DescribeSQLLogRecordsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSQLLogRecords", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSQLLogRecordsResponse());
    }

    public DescribeSQLLogRecordsResponse describeSQLLogRecords(DescribeSQLLogRecordsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSQLLogRecordsWithOptions(request, runtime);
    }

    public DescribeSQLLogReportListResponse describeSQLLogReportListWithOptions(DescribeSQLLogReportListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSQLLogReportList", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSQLLogReportListResponse());
    }

    public DescribeSQLLogReportListResponse describeSQLLogReportList(DescribeSQLLogReportListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSQLLogReportListWithOptions(request, runtime);
    }

    public DescribeSQLLogReportsResponse describeSQLLogReportsWithOptions(DescribeSQLLogReportsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSQLLogReports", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSQLLogReportsResponse());
    }

    public DescribeSQLLogReportsResponse describeSQLLogReports(DescribeSQLLogReportsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSQLLogReportsWithOptions(request, runtime);
    }

    public DescribeTagsResponse describeTagsWithOptions(DescribeTagsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeTags", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeTagsResponse());
    }

    public DescribeTagsResponse describeTags(DescribeTagsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeTagsWithOptions(request, runtime);
    }

    public DescribeTasksResponse describeTasksWithOptions(DescribeTasksRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeTasks", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeTasksResponse());
    }

    public DescribeTasksResponse describeTasks(DescribeTasksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeTasksWithOptions(request, runtime);
    }

    public DestroyDBInstanceResponse destroyDBInstanceWithOptions(DestroyDBInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DestroyDBInstance", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new DestroyDBInstanceResponse());
    }

    public DestroyDBInstanceResponse destroyDBInstance(DestroyDBInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.destroyDBInstanceWithOptions(request, runtime);
    }

    public DropDedicatedHostUserResponse dropDedicatedHostUserWithOptions(DropDedicatedHostUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DropDedicatedHostUser", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new DropDedicatedHostUserResponse());
    }

    public DropDedicatedHostUserResponse dropDedicatedHostUser(DropDedicatedHostUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.dropDedicatedHostUserWithOptions(request, runtime);
    }

    public EvaluateDedicatedHostInstanceResourceResponse evaluateDedicatedHostInstanceResourceWithOptions(EvaluateDedicatedHostInstanceResourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("EvaluateDedicatedHostInstanceResource", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new EvaluateDedicatedHostInstanceResourceResponse());
    }

    public EvaluateDedicatedHostInstanceResourceResponse evaluateDedicatedHostInstanceResource(EvaluateDedicatedHostInstanceResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.evaluateDedicatedHostInstanceResourceWithOptions(request, runtime);
    }

    public GetDbProxyInstanceSslResponse getDbProxyInstanceSslWithOptions(GetDbProxyInstanceSslRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetDbProxyInstanceSsl", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new GetDbProxyInstanceSslResponse());
    }

    public GetDbProxyInstanceSslResponse getDbProxyInstanceSsl(GetDbProxyInstanceSslRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDbProxyInstanceSslWithOptions(request, runtime);
    }

    public GrantAccountPrivilegeResponse grantAccountPrivilegeWithOptions(GrantAccountPrivilegeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GrantAccountPrivilege", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new GrantAccountPrivilegeResponse());
    }

    public GrantAccountPrivilegeResponse grantAccountPrivilege(GrantAccountPrivilegeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.grantAccountPrivilegeWithOptions(request, runtime);
    }

    public GrantOperatorPermissionResponse grantOperatorPermissionWithOptions(GrantOperatorPermissionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GrantOperatorPermission", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new GrantOperatorPermissionResponse());
    }

    public GrantOperatorPermissionResponse grantOperatorPermission(GrantOperatorPermissionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.grantOperatorPermissionWithOptions(request, runtime);
    }

    public ImportDatabaseBetweenInstancesResponse importDatabaseBetweenInstancesWithOptions(ImportDatabaseBetweenInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ImportDatabaseBetweenInstances", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new ImportDatabaseBetweenInstancesResponse());
    }

    public ImportDatabaseBetweenInstancesResponse importDatabaseBetweenInstances(ImportDatabaseBetweenInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.importDatabaseBetweenInstancesWithOptions(request, runtime);
    }

    public ImportUserBackupFileResponse importUserBackupFileWithOptions(ImportUserBackupFileRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ImportUserBackupFile", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new ImportUserBackupFileResponse());
    }

    public ImportUserBackupFileResponse importUserBackupFile(ImportUserBackupFileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.importUserBackupFileWithOptions(request, runtime);
    }

    public ListClassesResponse listClassesWithOptions(ListClassesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListClasses", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new ListClassesResponse());
    }

    public ListClassesResponse listClasses(ListClassesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listClassesWithOptions(request, runtime);
    }

    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListTagResources", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new ListTagResourcesResponse());
    }

    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    public ListUserBackupFilesResponse listUserBackupFilesWithOptions(ListUserBackupFilesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListUserBackupFiles", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new ListUserBackupFilesResponse());
    }

    public ListUserBackupFilesResponse listUserBackupFiles(ListUserBackupFilesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listUserBackupFilesWithOptions(request, runtime);
    }

    public LockAccountResponse lockAccountWithOptions(LockAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("LockAccount", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new LockAccountResponse());
    }

    public LockAccountResponse lockAccount(LockAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.lockAccountWithOptions(request, runtime);
    }

    public MigrateDBInstanceResponse migrateDBInstanceWithOptions(MigrateDBInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("MigrateDBInstance", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new MigrateDBInstanceResponse());
    }

    public MigrateDBInstanceResponse migrateDBInstance(MigrateDBInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.migrateDBInstanceWithOptions(request, runtime);
    }

    public MigrateSecurityIPModeResponse migrateSecurityIPModeWithOptions(MigrateSecurityIPModeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("MigrateSecurityIPMode", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new MigrateSecurityIPModeResponse());
    }

    public MigrateSecurityIPModeResponse migrateSecurityIPMode(MigrateSecurityIPModeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.migrateSecurityIPModeWithOptions(request, runtime);
    }

    public MigrateToOtherZoneResponse migrateToOtherZoneWithOptions(MigrateToOtherZoneRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("MigrateToOtherZone", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new MigrateToOtherZoneResponse());
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
        return TeaModel.toModel(this.doRPCRequest("ModifyAccountDescription", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyAccountDescriptionResponse());
    }

    public ModifyAccountDescriptionResponse modifyAccountDescription(ModifyAccountDescriptionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyAccountDescriptionWithOptions(request, runtime);
    }

    public ModifyActionEventPolicyResponse modifyActionEventPolicyWithOptions(ModifyActionEventPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyActionEventPolicy", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyActionEventPolicyResponse());
    }

    public ModifyActionEventPolicyResponse modifyActionEventPolicy(ModifyActionEventPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyActionEventPolicyWithOptions(request, runtime);
    }

    public ModifyBackupPolicyResponse modifyBackupPolicyWithOptions(ModifyBackupPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyBackupPolicy", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyBackupPolicyResponse());
    }

    public ModifyBackupPolicyResponse modifyBackupPolicy(ModifyBackupPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyBackupPolicyWithOptions(request, runtime);
    }

    public ModifyCollationTimeZoneResponse modifyCollationTimeZoneWithOptions(ModifyCollationTimeZoneRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyCollationTimeZone", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyCollationTimeZoneResponse());
    }

    public ModifyCollationTimeZoneResponse modifyCollationTimeZone(ModifyCollationTimeZoneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyCollationTimeZoneWithOptions(request, runtime);
    }

    public ModifyDasInstanceConfigResponse modifyDasInstanceConfigWithOptions(ModifyDasInstanceConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDasInstanceConfig", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDasInstanceConfigResponse());
    }

    public ModifyDasInstanceConfigResponse modifyDasInstanceConfig(ModifyDasInstanceConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDasInstanceConfigWithOptions(request, runtime);
    }

    public ModifyDBDescriptionResponse modifyDBDescriptionWithOptions(ModifyDBDescriptionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDBDescription", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDBDescriptionResponse());
    }

    public ModifyDBDescriptionResponse modifyDBDescription(ModifyDBDescriptionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDBDescriptionWithOptions(request, runtime);
    }

    public ModifyDBInstanceAutoUpgradeMinorVersionResponse modifyDBInstanceAutoUpgradeMinorVersionWithOptions(ModifyDBInstanceAutoUpgradeMinorVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDBInstanceAutoUpgradeMinorVersion", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDBInstanceAutoUpgradeMinorVersionResponse());
    }

    public ModifyDBInstanceAutoUpgradeMinorVersionResponse modifyDBInstanceAutoUpgradeMinorVersion(ModifyDBInstanceAutoUpgradeMinorVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDBInstanceAutoUpgradeMinorVersionWithOptions(request, runtime);
    }

    public ModifyDBInstanceConnectionModeResponse modifyDBInstanceConnectionModeWithOptions(ModifyDBInstanceConnectionModeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDBInstanceConnectionMode", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDBInstanceConnectionModeResponse());
    }

    public ModifyDBInstanceConnectionModeResponse modifyDBInstanceConnectionMode(ModifyDBInstanceConnectionModeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDBInstanceConnectionModeWithOptions(request, runtime);
    }

    public ModifyDBInstanceConnectionStringResponse modifyDBInstanceConnectionStringWithOptions(ModifyDBInstanceConnectionStringRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDBInstanceConnectionString", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDBInstanceConnectionStringResponse());
    }

    public ModifyDBInstanceConnectionStringResponse modifyDBInstanceConnectionString(ModifyDBInstanceConnectionStringRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDBInstanceConnectionStringWithOptions(request, runtime);
    }

    public ModifyDBInstanceDescriptionResponse modifyDBInstanceDescriptionWithOptions(ModifyDBInstanceDescriptionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDBInstanceDescription", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDBInstanceDescriptionResponse());
    }

    public ModifyDBInstanceDescriptionResponse modifyDBInstanceDescription(ModifyDBInstanceDescriptionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDBInstanceDescriptionWithOptions(request, runtime);
    }

    public ModifyDBInstanceHAConfigResponse modifyDBInstanceHAConfigWithOptions(ModifyDBInstanceHAConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDBInstanceHAConfig", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDBInstanceHAConfigResponse());
    }

    public ModifyDBInstanceHAConfigResponse modifyDBInstanceHAConfig(ModifyDBInstanceHAConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDBInstanceHAConfigWithOptions(request, runtime);
    }

    public ModifyDBInstanceMaintainTimeResponse modifyDBInstanceMaintainTimeWithOptions(ModifyDBInstanceMaintainTimeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDBInstanceMaintainTime", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDBInstanceMaintainTimeResponse());
    }

    public ModifyDBInstanceMaintainTimeResponse modifyDBInstanceMaintainTime(ModifyDBInstanceMaintainTimeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDBInstanceMaintainTimeWithOptions(request, runtime);
    }

    public ModifyDBInstanceMonitorResponse modifyDBInstanceMonitorWithOptions(ModifyDBInstanceMonitorRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDBInstanceMonitor", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDBInstanceMonitorResponse());
    }

    public ModifyDBInstanceMonitorResponse modifyDBInstanceMonitor(ModifyDBInstanceMonitorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDBInstanceMonitorWithOptions(request, runtime);
    }

    public ModifyDBInstanceNetworkExpireTimeResponse modifyDBInstanceNetworkExpireTimeWithOptions(ModifyDBInstanceNetworkExpireTimeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDBInstanceNetworkExpireTime", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDBInstanceNetworkExpireTimeResponse());
    }

    public ModifyDBInstanceNetworkExpireTimeResponse modifyDBInstanceNetworkExpireTime(ModifyDBInstanceNetworkExpireTimeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDBInstanceNetworkExpireTimeWithOptions(request, runtime);
    }

    public ModifyDBInstanceNetworkTypeResponse modifyDBInstanceNetworkTypeWithOptions(ModifyDBInstanceNetworkTypeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDBInstanceNetworkType", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDBInstanceNetworkTypeResponse());
    }

    public ModifyDBInstanceNetworkTypeResponse modifyDBInstanceNetworkType(ModifyDBInstanceNetworkTypeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDBInstanceNetworkTypeWithOptions(request, runtime);
    }

    public ModifyDBInstancePayTypeResponse modifyDBInstancePayTypeWithOptions(ModifyDBInstancePayTypeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDBInstancePayType", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDBInstancePayTypeResponse());
    }

    public ModifyDBInstancePayTypeResponse modifyDBInstancePayType(ModifyDBInstancePayTypeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDBInstancePayTypeWithOptions(request, runtime);
    }

    public ModifyDBInstanceProxyConfigurationResponse modifyDBInstanceProxyConfigurationWithOptions(ModifyDBInstanceProxyConfigurationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDBInstanceProxyConfiguration", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDBInstanceProxyConfigurationResponse());
    }

    public ModifyDBInstanceProxyConfigurationResponse modifyDBInstanceProxyConfiguration(ModifyDBInstanceProxyConfigurationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDBInstanceProxyConfigurationWithOptions(request, runtime);
    }

    public ModifyDBInstanceSpecResponse modifyDBInstanceSpecWithOptions(ModifyDBInstanceSpecRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDBInstanceSpec", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDBInstanceSpecResponse());
    }

    public ModifyDBInstanceSpecResponse modifyDBInstanceSpec(ModifyDBInstanceSpecRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDBInstanceSpecWithOptions(request, runtime);
    }

    public ModifyDBInstanceSSLResponse modifyDBInstanceSSLWithOptions(ModifyDBInstanceSSLRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDBInstanceSSL", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDBInstanceSSLResponse());
    }

    public ModifyDBInstanceSSLResponse modifyDBInstanceSSL(ModifyDBInstanceSSLRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDBInstanceSSLWithOptions(request, runtime);
    }

    public ModifyDBInstanceTDEResponse modifyDBInstanceTDEWithOptions(ModifyDBInstanceTDERequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDBInstanceTDE", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDBInstanceTDEResponse());
    }

    public ModifyDBInstanceTDEResponse modifyDBInstanceTDE(ModifyDBInstanceTDERequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDBInstanceTDEWithOptions(request, runtime);
    }

    public ModifyDBProxyResponse modifyDBProxyWithOptions(ModifyDBProxyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDBProxy", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDBProxyResponse());
    }

    public ModifyDBProxyResponse modifyDBProxy(ModifyDBProxyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDBProxyWithOptions(request, runtime);
    }

    public ModifyDBProxyEndpointResponse modifyDBProxyEndpointWithOptions(ModifyDBProxyEndpointRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDBProxyEndpoint", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDBProxyEndpointResponse());
    }

    public ModifyDBProxyEndpointResponse modifyDBProxyEndpoint(ModifyDBProxyEndpointRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDBProxyEndpointWithOptions(request, runtime);
    }

    public ModifyDBProxyEndpointAddressResponse modifyDBProxyEndpointAddressWithOptions(ModifyDBProxyEndpointAddressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDBProxyEndpointAddress", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDBProxyEndpointAddressResponse());
    }

    public ModifyDBProxyEndpointAddressResponse modifyDBProxyEndpointAddress(ModifyDBProxyEndpointAddressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDBProxyEndpointAddressWithOptions(request, runtime);
    }

    public ModifyDBProxyInstanceResponse modifyDBProxyInstanceWithOptions(ModifyDBProxyInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDBProxyInstance", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDBProxyInstanceResponse());
    }

    public ModifyDBProxyInstanceResponse modifyDBProxyInstance(ModifyDBProxyInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDBProxyInstanceWithOptions(request, runtime);
    }

    public ModifyDbProxyInstanceSslResponse modifyDbProxyInstanceSslWithOptions(ModifyDbProxyInstanceSslRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDbProxyInstanceSsl", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDbProxyInstanceSslResponse());
    }

    public ModifyDbProxyInstanceSslResponse modifyDbProxyInstanceSsl(ModifyDbProxyInstanceSslRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDbProxyInstanceSslWithOptions(request, runtime);
    }

    public ModifyDedicatedHostAccountResponse modifyDedicatedHostAccountWithOptions(ModifyDedicatedHostAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDedicatedHostAccount", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDedicatedHostAccountResponse());
    }

    public ModifyDedicatedHostAccountResponse modifyDedicatedHostAccount(ModifyDedicatedHostAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDedicatedHostAccountWithOptions(request, runtime);
    }

    public ModifyDedicatedHostAttributeResponse modifyDedicatedHostAttributeWithOptions(ModifyDedicatedHostAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDedicatedHostAttribute", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDedicatedHostAttributeResponse());
    }

    public ModifyDedicatedHostAttributeResponse modifyDedicatedHostAttribute(ModifyDedicatedHostAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDedicatedHostAttributeWithOptions(request, runtime);
    }

    public ModifyDedicatedHostGroupAttributeResponse modifyDedicatedHostGroupAttributeWithOptions(ModifyDedicatedHostGroupAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDedicatedHostGroupAttribute", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDedicatedHostGroupAttributeResponse());
    }

    public ModifyDedicatedHostGroupAttributeResponse modifyDedicatedHostGroupAttribute(ModifyDedicatedHostGroupAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDedicatedHostGroupAttributeWithOptions(request, runtime);
    }

    public ModifyDedicatedHostUserResponse modifyDedicatedHostUserWithOptions(ModifyDedicatedHostUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDedicatedHostUser", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDedicatedHostUserResponse());
    }

    public ModifyDedicatedHostUserResponse modifyDedicatedHostUser(ModifyDedicatedHostUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDedicatedHostUserWithOptions(request, runtime);
    }

    public ModifyDTCSecurityIpHostsForSQLServerResponse modifyDTCSecurityIpHostsForSQLServerWithOptions(ModifyDTCSecurityIpHostsForSQLServerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDTCSecurityIpHostsForSQLServer", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDTCSecurityIpHostsForSQLServerResponse());
    }

    public ModifyDTCSecurityIpHostsForSQLServerResponse modifyDTCSecurityIpHostsForSQLServer(ModifyDTCSecurityIpHostsForSQLServerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDTCSecurityIpHostsForSQLServerWithOptions(request, runtime);
    }

    public ModifyHADiagnoseConfigResponse modifyHADiagnoseConfigWithOptions(ModifyHADiagnoseConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyHADiagnoseConfig", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyHADiagnoseConfigResponse());
    }

    public ModifyHADiagnoseConfigResponse modifyHADiagnoseConfig(ModifyHADiagnoseConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyHADiagnoseConfigWithOptions(request, runtime);
    }

    public ModifyHASwitchConfigResponse modifyHASwitchConfigWithOptions(ModifyHASwitchConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyHASwitchConfig", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyHASwitchConfigResponse());
    }

    public ModifyHASwitchConfigResponse modifyHASwitchConfig(ModifyHASwitchConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyHASwitchConfigWithOptions(request, runtime);
    }

    public ModifyInstanceAutoRenewalAttributeResponse modifyInstanceAutoRenewalAttributeWithOptions(ModifyInstanceAutoRenewalAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyInstanceAutoRenewalAttribute", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyInstanceAutoRenewalAttributeResponse());
    }

    public ModifyInstanceAutoRenewalAttributeResponse modifyInstanceAutoRenewalAttribute(ModifyInstanceAutoRenewalAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyInstanceAutoRenewalAttributeWithOptions(request, runtime);
    }

    public ModifyInstanceCrossBackupPolicyResponse modifyInstanceCrossBackupPolicyWithOptions(ModifyInstanceCrossBackupPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyInstanceCrossBackupPolicy", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyInstanceCrossBackupPolicyResponse());
    }

    public ModifyInstanceCrossBackupPolicyResponse modifyInstanceCrossBackupPolicy(ModifyInstanceCrossBackupPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyInstanceCrossBackupPolicyWithOptions(request, runtime);
    }

    public ModifyParameterResponse modifyParameterWithOptions(ModifyParameterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyParameter", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyParameterResponse());
    }

    public ModifyParameterResponse modifyParameter(ModifyParameterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyParameterWithOptions(request, runtime);
    }

    public ModifyParameterGroupResponse modifyParameterGroupWithOptions(ModifyParameterGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyParameterGroup", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyParameterGroupResponse());
    }

    public ModifyParameterGroupResponse modifyParameterGroup(ModifyParameterGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyParameterGroupWithOptions(request, runtime);
    }

    public ModifyReadonlyInstanceDelayReplicationTimeResponse modifyReadonlyInstanceDelayReplicationTimeWithOptions(ModifyReadonlyInstanceDelayReplicationTimeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyReadonlyInstanceDelayReplicationTime", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyReadonlyInstanceDelayReplicationTimeResponse());
    }

    public ModifyReadonlyInstanceDelayReplicationTimeResponse modifyReadonlyInstanceDelayReplicationTime(ModifyReadonlyInstanceDelayReplicationTimeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyReadonlyInstanceDelayReplicationTimeWithOptions(request, runtime);
    }

    public ModifyReadWriteSplittingConnectionResponse modifyReadWriteSplittingConnectionWithOptions(ModifyReadWriteSplittingConnectionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyReadWriteSplittingConnection", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyReadWriteSplittingConnectionResponse());
    }

    public ModifyReadWriteSplittingConnectionResponse modifyReadWriteSplittingConnection(ModifyReadWriteSplittingConnectionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyReadWriteSplittingConnectionWithOptions(request, runtime);
    }

    public ModifyResourceGroupResponse modifyResourceGroupWithOptions(ModifyResourceGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyResourceGroup", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyResourceGroupResponse());
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
        return TeaModel.toModel(this.doRPCRequest("ModifySecurityGroupConfiguration", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new ModifySecurityGroupConfigurationResponse());
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
        return TeaModel.toModel(this.doRPCRequest("ModifySecurityIps", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new ModifySecurityIpsResponse());
    }

    public ModifySecurityIpsResponse modifySecurityIps(ModifySecurityIpsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifySecurityIpsWithOptions(request, runtime);
    }

    public ModifySQLCollectorPolicyResponse modifySQLCollectorPolicyWithOptions(ModifySQLCollectorPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifySQLCollectorPolicy", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new ModifySQLCollectorPolicyResponse());
    }

    public ModifySQLCollectorPolicyResponse modifySQLCollectorPolicy(ModifySQLCollectorPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifySQLCollectorPolicyWithOptions(request, runtime);
    }

    public ModifySQLCollectorRetentionResponse modifySQLCollectorRetentionWithOptions(ModifySQLCollectorRetentionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifySQLCollectorRetention", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new ModifySQLCollectorRetentionResponse());
    }

    public ModifySQLCollectorRetentionResponse modifySQLCollectorRetention(ModifySQLCollectorRetentionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifySQLCollectorRetentionWithOptions(request, runtime);
    }

    public PurgeDBInstanceLogResponse purgeDBInstanceLogWithOptions(PurgeDBInstanceLogRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PurgeDBInstanceLog", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new PurgeDBInstanceLogResponse());
    }

    public PurgeDBInstanceLogResponse purgeDBInstanceLog(PurgeDBInstanceLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.purgeDBInstanceLogWithOptions(request, runtime);
    }

    public RebuildDBInstanceResponse rebuildDBInstanceWithOptions(RebuildDBInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RebuildDBInstance", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new RebuildDBInstanceResponse());
    }

    public RebuildDBInstanceResponse rebuildDBInstance(RebuildDBInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.rebuildDBInstanceWithOptions(request, runtime);
    }

    public RecoveryDBInstanceResponse recoveryDBInstanceWithOptions(RecoveryDBInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RecoveryDBInstance", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new RecoveryDBInstanceResponse());
    }

    public RecoveryDBInstanceResponse recoveryDBInstance(RecoveryDBInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recoveryDBInstanceWithOptions(request, runtime);
    }

    public ReleaseInstanceConnectionResponse releaseInstanceConnectionWithOptions(ReleaseInstanceConnectionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ReleaseInstanceConnection", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new ReleaseInstanceConnectionResponse());
    }

    public ReleaseInstanceConnectionResponse releaseInstanceConnection(ReleaseInstanceConnectionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.releaseInstanceConnectionWithOptions(request, runtime);
    }

    public ReleaseInstancePublicConnectionResponse releaseInstancePublicConnectionWithOptions(ReleaseInstancePublicConnectionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ReleaseInstancePublicConnection", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new ReleaseInstancePublicConnectionResponse());
    }

    public ReleaseInstancePublicConnectionResponse releaseInstancePublicConnection(ReleaseInstancePublicConnectionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.releaseInstancePublicConnectionWithOptions(request, runtime);
    }

    public ReleaseReadWriteSplittingConnectionResponse releaseReadWriteSplittingConnectionWithOptions(ReleaseReadWriteSplittingConnectionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ReleaseReadWriteSplittingConnection", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new ReleaseReadWriteSplittingConnectionResponse());
    }

    public ReleaseReadWriteSplittingConnectionResponse releaseReadWriteSplittingConnection(ReleaseReadWriteSplittingConnectionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.releaseReadWriteSplittingConnectionWithOptions(request, runtime);
    }

    public RemoveTagsFromResourceResponse removeTagsFromResourceWithOptions(RemoveTagsFromResourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RemoveTagsFromResource", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new RemoveTagsFromResourceResponse());
    }

    public RemoveTagsFromResourceResponse removeTagsFromResource(RemoveTagsFromResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeTagsFromResourceWithOptions(request, runtime);
    }

    public RenewInstanceResponse renewInstanceWithOptions(RenewInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RenewInstance", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new RenewInstanceResponse());
    }

    public RenewInstanceResponse renewInstance(RenewInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.renewInstanceWithOptions(request, runtime);
    }

    public ReplaceDedicatedHostResponse replaceDedicatedHostWithOptions(ReplaceDedicatedHostRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ReplaceDedicatedHost", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new ReplaceDedicatedHostResponse());
    }

    public ReplaceDedicatedHostResponse replaceDedicatedHost(ReplaceDedicatedHostRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.replaceDedicatedHostWithOptions(request, runtime);
    }

    public ResetAccountResponse resetAccountWithOptions(ResetAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ResetAccount", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new ResetAccountResponse());
    }

    public ResetAccountResponse resetAccount(ResetAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.resetAccountWithOptions(request, runtime);
    }

    public ResetAccountPasswordResponse resetAccountPasswordWithOptions(ResetAccountPasswordRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ResetAccountPassword", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new ResetAccountPasswordResponse());
    }

    public ResetAccountPasswordResponse resetAccountPassword(ResetAccountPasswordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.resetAccountPasswordWithOptions(request, runtime);
    }

    public RestartDBInstanceResponse restartDBInstanceWithOptions(RestartDBInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RestartDBInstance", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new RestartDBInstanceResponse());
    }

    public RestartDBInstanceResponse restartDBInstance(RestartDBInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.restartDBInstanceWithOptions(request, runtime);
    }

    public RestartDedicatedHostResponse restartDedicatedHostWithOptions(RestartDedicatedHostRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RestartDedicatedHost", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new RestartDedicatedHostResponse());
    }

    public RestartDedicatedHostResponse restartDedicatedHost(RestartDedicatedHostRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.restartDedicatedHostWithOptions(request, runtime);
    }

    public RestoreDdrTableResponse restoreDdrTableWithOptions(RestoreDdrTableRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RestoreDdrTable", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new RestoreDdrTableResponse());
    }

    public RestoreDdrTableResponse restoreDdrTable(RestoreDdrTableRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.restoreDdrTableWithOptions(request, runtime);
    }

    public RestoreTableResponse restoreTableWithOptions(RestoreTableRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RestoreTable", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new RestoreTableResponse());
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
        return TeaModel.toModel(this.doRPCRequest("RevokeAccountPrivilege", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new RevokeAccountPrivilegeResponse());
    }

    public RevokeAccountPrivilegeResponse revokeAccountPrivilege(RevokeAccountPrivilegeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.revokeAccountPrivilegeWithOptions(request, runtime);
    }

    public RevokeOperatorPermissionResponse revokeOperatorPermissionWithOptions(RevokeOperatorPermissionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RevokeOperatorPermission", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new RevokeOperatorPermissionResponse());
    }

    public RevokeOperatorPermissionResponse revokeOperatorPermission(RevokeOperatorPermissionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.revokeOperatorPermissionWithOptions(request, runtime);
    }

    public StartDBInstanceResponse startDBInstanceWithOptions(StartDBInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StartDBInstance", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new StartDBInstanceResponse());
    }

    public StartDBInstanceResponse startDBInstance(StartDBInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startDBInstanceWithOptions(request, runtime);
    }

    public StopDBInstanceResponse stopDBInstanceWithOptions(StopDBInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StopDBInstance", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new StopDBInstanceResponse());
    }

    public StopDBInstanceResponse stopDBInstance(StopDBInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopDBInstanceWithOptions(request, runtime);
    }

    public SwitchDBInstanceHAResponse switchDBInstanceHAWithOptions(SwitchDBInstanceHARequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SwitchDBInstanceHA", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new SwitchDBInstanceHAResponse());
    }

    public SwitchDBInstanceHAResponse switchDBInstanceHA(SwitchDBInstanceHARequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.switchDBInstanceHAWithOptions(request, runtime);
    }

    public SwitchDBInstanceNetTypeResponse switchDBInstanceNetTypeWithOptions(SwitchDBInstanceNetTypeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SwitchDBInstanceNetType", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new SwitchDBInstanceNetTypeResponse());
    }

    public SwitchDBInstanceNetTypeResponse switchDBInstanceNetType(SwitchDBInstanceNetTypeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.switchDBInstanceNetTypeWithOptions(request, runtime);
    }

    public SwitchDBInstanceVpcResponse switchDBInstanceVpcWithOptions(SwitchDBInstanceVpcRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SwitchDBInstanceVpc", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new SwitchDBInstanceVpcResponse());
    }

    public SwitchDBInstanceVpcResponse switchDBInstanceVpc(SwitchDBInstanceVpcRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.switchDBInstanceVpcWithOptions(request, runtime);
    }

    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("TagResources", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new TagResourcesResponse());
    }

    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

    public TerminateMigrateTaskResponse terminateMigrateTaskWithOptions(TerminateMigrateTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("TerminateMigrateTask", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new TerminateMigrateTaskResponse());
    }

    public TerminateMigrateTaskResponse terminateMigrateTask(TerminateMigrateTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.terminateMigrateTaskWithOptions(request, runtime);
    }

    public TransformDBInstancePayTypeResponse transformDBInstancePayTypeWithOptions(TransformDBInstancePayTypeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("TransformDBInstancePayType", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new TransformDBInstancePayTypeResponse());
    }

    public TransformDBInstancePayTypeResponse transformDBInstancePayType(TransformDBInstancePayTypeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.transformDBInstancePayTypeWithOptions(request, runtime);
    }

    public UnlockAccountResponse unlockAccountWithOptions(UnlockAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UnlockAccount", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new UnlockAccountResponse());
    }

    public UnlockAccountResponse unlockAccount(UnlockAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unlockAccountWithOptions(request, runtime);
    }

    public UntagResourcesResponse untagResourcesWithOptions(UntagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UntagResources", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new UntagResourcesResponse());
    }

    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.untagResourcesWithOptions(request, runtime);
    }

    public UpdateUserBackupFileResponse updateUserBackupFileWithOptions(UpdateUserBackupFileRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateUserBackupFile", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateUserBackupFileResponse());
    }

    public UpdateUserBackupFileResponse updateUserBackupFile(UpdateUserBackupFileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateUserBackupFileWithOptions(request, runtime);
    }

    public UpgradeDBInstanceEngineVersionResponse upgradeDBInstanceEngineVersionWithOptions(UpgradeDBInstanceEngineVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpgradeDBInstanceEngineVersion", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new UpgradeDBInstanceEngineVersionResponse());
    }

    public UpgradeDBInstanceEngineVersionResponse upgradeDBInstanceEngineVersion(UpgradeDBInstanceEngineVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.upgradeDBInstanceEngineVersionWithOptions(request, runtime);
    }

    public UpgradeDBInstanceKernelVersionResponse upgradeDBInstanceKernelVersionWithOptions(UpgradeDBInstanceKernelVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpgradeDBInstanceKernelVersion", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new UpgradeDBInstanceKernelVersionResponse());
    }

    public UpgradeDBInstanceKernelVersionResponse upgradeDBInstanceKernelVersion(UpgradeDBInstanceKernelVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.upgradeDBInstanceKernelVersionWithOptions(request, runtime);
    }

    public UpgradeDBProxyInstanceKernelVersionResponse upgradeDBProxyInstanceKernelVersionWithOptions(UpgradeDBProxyInstanceKernelVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpgradeDBProxyInstanceKernelVersion", "2014-08-15", "HTTPS", "POST", "AK", "json", req, runtime), new UpgradeDBProxyInstanceKernelVersionResponse());
    }

    public UpgradeDBProxyInstanceKernelVersionResponse upgradeDBProxyInstanceKernelVersion(UpgradeDBProxyInstanceKernelVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.upgradeDBProxyInstanceKernelVersionWithOptions(request, runtime);
    }
}
