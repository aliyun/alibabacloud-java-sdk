// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815;

import com.aliyun.tea.*;
import com.aliyun.rds20140815.models.*;

public class Client extends com.aliyun.tearpc.Client {
    public Client(com.aliyun.tearpc.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-qingdao", "rds.aliyuncs.com"),
            new TeaPair("cn-beijing", "rds.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "rds.aliyuncs.com"),
            new TeaPair("cn-shanghai", "rds.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "rds.aliyuncs.com"),
            new TeaPair("cn-hongkong", "rds.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "rds.aliyuncs.com"),
            new TeaPair("us-west-1", "rds.aliyuncs.com"),
            new TeaPair("us-east-1", "rds.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "rds.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "rds.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "rds.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "rds.ap-northeast-1.aliyuncs.com"),
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
            new TeaPair("cn-zhangbei-na61-b01", "rds.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "rds.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "rds.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "rds.ap-northeast-1.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "rds.ap-northeast-1.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("rds", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
    }


    public DescribeDBInstanceDetailResponse describeDBInstanceDetailWithOptions(DescribeDBInstanceDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDBInstanceDetail", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDBInstanceDetailResponse());
    }

    public DescribeDBInstanceDetailResponse describeDBInstanceDetail(DescribeDBInstanceDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBInstanceDetailWithOptions(request, runtime);
    }

    public ModifyLicenseInfoResponse modifyLicenseInfoWithOptions(ModifyLicenseInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyLicenseInfo", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new ModifyLicenseInfoResponse());
    }

    public ModifyLicenseInfoResponse modifyLicenseInfo(ModifyLicenseInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyLicenseInfoWithOptions(request, runtime);
    }

    public DeleteDBProxyEndpointAddressResponse deleteDBProxyEndpointAddressWithOptions(DeleteDBProxyEndpointAddressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteDBProxyEndpointAddress", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new DeleteDBProxyEndpointAddressResponse());
    }

    public DeleteDBProxyEndpointAddressResponse deleteDBProxyEndpointAddress(DeleteDBProxyEndpointAddressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDBProxyEndpointAddressWithOptions(request, runtime);
    }

    public CreateDBProxyEndpointAddressResponse createDBProxyEndpointAddressWithOptions(CreateDBProxyEndpointAddressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateDBProxyEndpointAddress", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new CreateDBProxyEndpointAddressResponse());
    }

    public CreateDBProxyEndpointAddressResponse createDBProxyEndpointAddress(CreateDBProxyEndpointAddressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDBProxyEndpointAddressWithOptions(request, runtime);
    }

    public DescribeDasInstanceConfigResponse describeDasInstanceConfigWithOptions(DescribeDasInstanceConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDasInstanceConfig", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDasInstanceConfigResponse());
    }

    public DescribeDasInstanceConfigResponse describeDasInstanceConfig(DescribeDasInstanceConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDasInstanceConfigWithOptions(request, runtime);
    }

    public ModifyDasInstanceConfigResponse modifyDasInstanceConfigWithOptions(ModifyDasInstanceConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyDasInstanceConfig", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new ModifyDasInstanceConfigResponse());
    }

    public ModifyDasInstanceConfigResponse modifyDasInstanceConfig(ModifyDasInstanceConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDasInstanceConfigWithOptions(request, runtime);
    }

    public DescribeRdsResourceSettingsResponse describeRdsResourceSettingsWithOptions(DescribeRdsResourceSettingsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeRdsResourceSettings", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new DescribeRdsResourceSettingsResponse());
    }

    public DescribeRdsResourceSettingsResponse describeRdsResourceSettings(DescribeRdsResourceSettingsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRdsResourceSettingsWithOptions(request, runtime);
    }

    public DeleteHostAccountResponse deleteHostAccountWithOptions(DeleteHostAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteHostAccount", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new DeleteHostAccountResponse());
    }

    public DeleteHostAccountResponse deleteHostAccount(DeleteHostAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteHostAccountWithOptions(request, runtime);
    }

    public DescribeHostAccountsResponse describeHostAccountsWithOptions(DescribeHostAccountsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeHostAccounts", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new DescribeHostAccountsResponse());
    }

    public DescribeHostAccountsResponse describeHostAccounts(DescribeHostAccountsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeHostAccountsWithOptions(request, runtime);
    }

    public ResetHostAccountPasswordResponse resetHostAccountPasswordWithOptions(ResetHostAccountPasswordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ResetHostAccountPassword", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new ResetHostAccountPasswordResponse());
    }

    public ResetHostAccountPasswordResponse resetHostAccountPassword(ResetHostAccountPasswordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resetHostAccountPasswordWithOptions(request, runtime);
    }

    public CreateHostAccountResponse createHostAccountWithOptions(CreateHostAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateHostAccount", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new CreateHostAccountResponse());
    }

    public CreateHostAccountResponse createHostAccount(CreateHostAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createHostAccountWithOptions(request, runtime);
    }

    public DescribeDedicatedHostImageCategoriesResponse describeDedicatedHostImageCategoriesWithOptions(DescribeDedicatedHostImageCategoriesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDedicatedHostImageCategories", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDedicatedHostImageCategoriesResponse());
    }

    public DescribeDedicatedHostImageCategoriesResponse describeDedicatedHostImageCategories(DescribeDedicatedHostImageCategoriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDedicatedHostImageCategoriesWithOptions(request, runtime);
    }

    public DescribeCrossBackupMetaListResponse describeCrossBackupMetaListWithOptions(DescribeCrossBackupMetaListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeCrossBackupMetaList", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new DescribeCrossBackupMetaListResponse());
    }

    public DescribeCrossBackupMetaListResponse describeCrossBackupMetaList(DescribeCrossBackupMetaListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCrossBackupMetaListWithOptions(request, runtime);
    }

    public RestoreDdrTableResponse restoreDdrTableWithOptions(RestoreDdrTableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RestoreDdrTable", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new RestoreDdrTableResponse());
    }

    public RestoreDdrTableResponse restoreDdrTable(RestoreDdrTableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.restoreDdrTableWithOptions(request, runtime);
    }

    public ModifyDBProxyEndpointAddressResponse modifyDBProxyEndpointAddressWithOptions(ModifyDBProxyEndpointAddressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyDBProxyEndpointAddress", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new ModifyDBProxyEndpointAddressResponse());
    }

    public ModifyDBProxyEndpointAddressResponse modifyDBProxyEndpointAddress(ModifyDBProxyEndpointAddressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDBProxyEndpointAddressWithOptions(request, runtime);
    }

    public TerminateMigrateTaskResponse terminateMigrateTaskWithOptions(TerminateMigrateTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("TerminateMigrateTask", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new TerminateMigrateTaskResponse());
    }

    public TerminateMigrateTaskResponse terminateMigrateTask(TerminateMigrateTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.terminateMigrateTaskWithOptions(request, runtime);
    }

    public DescribeLocalAvailableRecoveryTimeResponse describeLocalAvailableRecoveryTimeWithOptions(DescribeLocalAvailableRecoveryTimeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeLocalAvailableRecoveryTime", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new DescribeLocalAvailableRecoveryTimeResponse());
    }

    public DescribeLocalAvailableRecoveryTimeResponse describeLocalAvailableRecoveryTime(DescribeLocalAvailableRecoveryTimeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLocalAvailableRecoveryTimeWithOptions(request, runtime);
    }

    public DescribeAvailableZonesResponse describeAvailableZonesWithOptions(DescribeAvailableZonesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeAvailableZones", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new DescribeAvailableZonesResponse());
    }

    public DescribeAvailableZonesResponse describeAvailableZones(DescribeAvailableZonesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAvailableZonesWithOptions(request, runtime);
    }

    public DescribeAvailableClassesResponse describeAvailableClassesWithOptions(DescribeAvailableClassesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeAvailableClasses", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new DescribeAvailableClassesResponse());
    }

    public DescribeAvailableClassesResponse describeAvailableClasses(DescribeAvailableClassesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAvailableClassesWithOptions(request, runtime);
    }

    public CreateDedicatedHostAccountResponse createDedicatedHostAccountWithOptions(CreateDedicatedHostAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateDedicatedHostAccount", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new CreateDedicatedHostAccountResponse());
    }

    public CreateDedicatedHostAccountResponse createDedicatedHostAccount(CreateDedicatedHostAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDedicatedHostAccountWithOptions(request, runtime);
    }

    public DeleteDedicatedHostAccountResponse deleteDedicatedHostAccountWithOptions(DeleteDedicatedHostAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteDedicatedHostAccount", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new DeleteDedicatedHostAccountResponse());
    }

    public DeleteDedicatedHostAccountResponse deleteDedicatedHostAccount(DeleteDedicatedHostAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDedicatedHostAccountWithOptions(request, runtime);
    }

    public ModifyDedicatedHostAccountResponse modifyDedicatedHostAccountWithOptions(ModifyDedicatedHostAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyDedicatedHostAccount", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new ModifyDedicatedHostAccountResponse());
    }

    public ModifyDedicatedHostAccountResponse modifyDedicatedHostAccount(ModifyDedicatedHostAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDedicatedHostAccountWithOptions(request, runtime);
    }

    public TransformDBInstancePayTypeResponse transformDBInstancePayTypeWithOptions(TransformDBInstancePayTypeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("TransformDBInstancePayType", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new TransformDBInstancePayTypeResponse());
    }

    public TransformDBInstancePayTypeResponse transformDBInstancePayType(TransformDBInstancePayTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.transformDBInstancePayTypeWithOptions(request, runtime);
    }

    public CreateDedicatedHostUserResponse createDedicatedHostUserWithOptions(CreateDedicatedHostUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateDedicatedHostUser", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new CreateDedicatedHostUserResponse());
    }

    public CreateDedicatedHostUserResponse createDedicatedHostUser(CreateDedicatedHostUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDedicatedHostUserWithOptions(request, runtime);
    }

    public ModifyDedicatedHostUserResponse modifyDedicatedHostUserWithOptions(ModifyDedicatedHostUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyDedicatedHostUser", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new ModifyDedicatedHostUserResponse());
    }

    public ModifyDedicatedHostUserResponse modifyDedicatedHostUser(ModifyDedicatedHostUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDedicatedHostUserWithOptions(request, runtime);
    }

    public DropDedicatedHostUserResponse dropDedicatedHostUserWithOptions(DropDedicatedHostUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DropDedicatedHostUser", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new DropDedicatedHostUserResponse());
    }

    public DropDedicatedHostUserResponse dropDedicatedHostUser(DropDedicatedHostUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.dropDedicatedHostUserWithOptions(request, runtime);
    }

    public UpgradeDBProxyInstanceKernelVersionResponse upgradeDBProxyInstanceKernelVersionWithOptions(UpgradeDBProxyInstanceKernelVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpgradeDBProxyInstanceKernelVersion", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new UpgradeDBProxyInstanceKernelVersionResponse());
    }

    public UpgradeDBProxyInstanceKernelVersionResponse upgradeDBProxyInstanceKernelVersion(UpgradeDBProxyInstanceKernelVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.upgradeDBProxyInstanceKernelVersionWithOptions(request, runtime);
    }

    public StopDBInstanceResponse stopDBInstanceWithOptions(StopDBInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("StopDBInstance", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new StopDBInstanceResponse());
    }

    public StopDBInstanceResponse stopDBInstance(StopDBInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopDBInstanceWithOptions(request, runtime);
    }

    public StartDBInstanceResponse startDBInstanceWithOptions(StartDBInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("StartDBInstance", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new StartDBInstanceResponse());
    }

    public StartDBInstanceResponse startDBInstance(StartDBInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startDBInstanceWithOptions(request, runtime);
    }

    public DescribeSignedEventActionsResponse describeSignedEventActionsWithOptions(DescribeSignedEventActionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeSignedEventActions", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new DescribeSignedEventActionsResponse());
    }

    public DescribeSignedEventActionsResponse describeSignedEventActions(DescribeSignedEventActionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSignedEventActionsWithOptions(request, runtime);
    }

    public SignEventActionResponse signEventActionWithOptions(SignEventActionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SignEventAction", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new SignEventActionResponse());
    }

    public SignEventActionResponse signEventAction(SignEventActionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.signEventActionWithOptions(request, runtime);
    }

    public DescribeNextEventForSignResponse describeNextEventForSignWithOptions(DescribeNextEventForSignRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeNextEventForSign", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new DescribeNextEventForSignResponse());
    }

    public DescribeNextEventForSignResponse describeNextEventForSign(DescribeNextEventForSignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeNextEventForSignWithOptions(request, runtime);
    }

    public ModifyActionEventVerifyPolicyResponse modifyActionEventVerifyPolicyWithOptions(ModifyActionEventVerifyPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyActionEventVerifyPolicy", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new ModifyActionEventVerifyPolicyResponse());
    }

    public ModifyActionEventVerifyPolicyResponse modifyActionEventVerifyPolicy(ModifyActionEventVerifyPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyActionEventVerifyPolicyWithOptions(request, runtime);
    }

    public DescribeDBInstancesOverviewResponse describeDBInstancesOverviewWithOptions(DescribeDBInstancesOverviewRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDBInstancesOverview", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDBInstancesOverviewResponse());
    }

    public DescribeDBInstancesOverviewResponse describeDBInstancesOverview(DescribeDBInstancesOverviewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBInstancesOverviewWithOptions(request, runtime);
    }

    public DescribeMigrateTaskByIdResponse describeMigrateTaskByIdWithOptions(DescribeMigrateTaskByIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeMigrateTaskById", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new DescribeMigrateTaskByIdResponse());
    }

    public DescribeMigrateTaskByIdResponse describeMigrateTaskById(DescribeMigrateTaskByIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMigrateTaskByIdWithOptions(request, runtime);
    }

    public DeleteBackupFileResponse deleteBackupFileWithOptions(DeleteBackupFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteBackupFile", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new DeleteBackupFileResponse());
    }

    public DeleteBackupFileResponse deleteBackupFile(DeleteBackupFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteBackupFileWithOptions(request, runtime);
    }

    public DescribeDetachedBackupsResponse describeDetachedBackupsWithOptions(DescribeDetachedBackupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDetachedBackups", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDetachedBackupsResponse());
    }

    public DescribeDetachedBackupsResponse describeDetachedBackups(DescribeDetachedBackupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDetachedBackupsWithOptions(request, runtime);
    }

    public EvaluateDedicatedHostInstanceResourceResponse evaluateDedicatedHostInstanceResourceWithOptions(EvaluateDedicatedHostInstanceResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("EvaluateDedicatedHostInstanceResource", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new EvaluateDedicatedHostInstanceResourceResponse());
    }

    public EvaluateDedicatedHostInstanceResourceResponse evaluateDedicatedHostInstanceResource(EvaluateDedicatedHostInstanceResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.evaluateDedicatedHostInstanceResourceWithOptions(request, runtime);
    }

    public DescribeAvailableDedicatedHostClassesResponse describeAvailableDedicatedHostClassesWithOptions(DescribeAvailableDedicatedHostClassesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeAvailableDedicatedHostClasses", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new DescribeAvailableDedicatedHostClassesResponse());
    }

    public DescribeAvailableDedicatedHostClassesResponse describeAvailableDedicatedHostClasses(DescribeAvailableDedicatedHostClassesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAvailableDedicatedHostClassesWithOptions(request, runtime);
    }

    public DescribeAvailableDedicatedHostZonesResponse describeAvailableDedicatedHostZonesWithOptions(DescribeAvailableDedicatedHostZonesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeAvailableDedicatedHostZones", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new DescribeAvailableDedicatedHostZonesResponse());
    }

    public DescribeAvailableDedicatedHostZonesResponse describeAvailableDedicatedHostZones(DescribeAvailableDedicatedHostZonesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAvailableDedicatedHostZonesWithOptions(request, runtime);
    }

    public ReleaseInstanceConnectionResponse releaseInstanceConnectionWithOptions(ReleaseInstanceConnectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ReleaseInstanceConnection", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new ReleaseInstanceConnectionResponse());
    }

    public ReleaseInstanceConnectionResponse releaseInstanceConnection(ReleaseInstanceConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.releaseInstanceConnectionWithOptions(request, runtime);
    }

    public UnlockAccountResponse unlockAccountWithOptions(UnlockAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UnlockAccount", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new UnlockAccountResponse());
    }

    public UnlockAccountResponse unlockAccount(UnlockAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unlockAccountWithOptions(request, runtime);
    }

    public LockAccountResponse lockAccountWithOptions(LockAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("LockAccount", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new LockAccountResponse());
    }

    public LockAccountResponse lockAccount(LockAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.lockAccountWithOptions(request, runtime);
    }

    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListTagResources", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new ListTagResourcesResponse());
    }

    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("TagResources", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new TagResourcesResponse());
    }

    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

    public UntagResourcesResponse untagResourcesWithOptions(UntagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UntagResources", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new UntagResourcesResponse());
    }

    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.untagResourcesWithOptions(request, runtime);
    }

    public DescribeDedicatedHostGroupsResponse describeDedicatedHostGroupsWithOptions(DescribeDedicatedHostGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDedicatedHostGroups", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDedicatedHostGroupsResponse());
    }

    public DescribeDedicatedHostGroupsResponse describeDedicatedHostGroups(DescribeDedicatedHostGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDedicatedHostGroupsWithOptions(request, runtime);
    }

    public CreateDedicatedHostGroupResponse createDedicatedHostGroupWithOptions(CreateDedicatedHostGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateDedicatedHostGroup", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new CreateDedicatedHostGroupResponse());
    }

    public CreateDedicatedHostGroupResponse createDedicatedHostGroup(CreateDedicatedHostGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDedicatedHostGroupWithOptions(request, runtime);
    }

    public DeleteDedicatedHostGroupResponse deleteDedicatedHostGroupWithOptions(DeleteDedicatedHostGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteDedicatedHostGroup", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new DeleteDedicatedHostGroupResponse());
    }

    public DeleteDedicatedHostGroupResponse deleteDedicatedHostGroup(DeleteDedicatedHostGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDedicatedHostGroupWithOptions(request, runtime);
    }

    public ModifyDedicatedHostGroupAttributeResponse modifyDedicatedHostGroupAttributeWithOptions(ModifyDedicatedHostGroupAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyDedicatedHostGroupAttribute", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new ModifyDedicatedHostGroupAttributeResponse());
    }

    public ModifyDedicatedHostGroupAttributeResponse modifyDedicatedHostGroupAttribute(ModifyDedicatedHostGroupAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDedicatedHostGroupAttributeWithOptions(request, runtime);
    }

    public RestartDedicatedHostResponse restartDedicatedHostWithOptions(RestartDedicatedHostRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RestartDedicatedHost", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new RestartDedicatedHostResponse());
    }

    public RestartDedicatedHostResponse restartDedicatedHost(RestartDedicatedHostRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.restartDedicatedHostWithOptions(request, runtime);
    }

    public ReplaceDedicatedHostResponse replaceDedicatedHostWithOptions(ReplaceDedicatedHostRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ReplaceDedicatedHost", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new ReplaceDedicatedHostResponse());
    }

    public ReplaceDedicatedHostResponse replaceDedicatedHost(ReplaceDedicatedHostRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.replaceDedicatedHostWithOptions(request, runtime);
    }

    public DescribeDedicatedHostsResponse describeDedicatedHostsWithOptions(DescribeDedicatedHostsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDedicatedHosts", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDedicatedHostsResponse());
    }

    public DescribeDedicatedHostsResponse describeDedicatedHosts(DescribeDedicatedHostsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDedicatedHostsWithOptions(request, runtime);
    }

    public DescribeDedicatedHostAttributeResponse describeDedicatedHostAttributeWithOptions(DescribeDedicatedHostAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDedicatedHostAttribute", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDedicatedHostAttributeResponse());
    }

    public DescribeDedicatedHostAttributeResponse describeDedicatedHostAttribute(DescribeDedicatedHostAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDedicatedHostAttributeWithOptions(request, runtime);
    }

    public ClearDedicatedHostResponse clearDedicatedHostWithOptions(ClearDedicatedHostRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ClearDedicatedHost", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new ClearDedicatedHostResponse());
    }

    public ClearDedicatedHostResponse clearDedicatedHost(ClearDedicatedHostRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.clearDedicatedHostWithOptions(request, runtime);
    }

    public ModifyDedicatedHostAttributeResponse modifyDedicatedHostAttributeWithOptions(ModifyDedicatedHostAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyDedicatedHostAttribute", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new ModifyDedicatedHostAttributeResponse());
    }

    public ModifyDedicatedHostAttributeResponse modifyDedicatedHostAttribute(ModifyDedicatedHostAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDedicatedHostAttributeWithOptions(request, runtime);
    }

    public MigrateDBInstanceResponse migrateDBInstanceWithOptions(MigrateDBInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("MigrateDBInstance", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new MigrateDBInstanceResponse());
    }

    public MigrateDBInstanceResponse migrateDBInstance(MigrateDBInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.migrateDBInstanceWithOptions(request, runtime);
    }

    public CreateDedicatedHostResponse createDedicatedHostWithOptions(CreateDedicatedHostRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateDedicatedHost", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new CreateDedicatedHostResponse());
    }

    public CreateDedicatedHostResponse createDedicatedHost(CreateDedicatedHostRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDedicatedHostWithOptions(request, runtime);
    }

    public RebuildDBInstanceResponse rebuildDBInstanceWithOptions(RebuildDBInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RebuildDBInstance", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new RebuildDBInstanceResponse());
    }

    public RebuildDBInstanceResponse rebuildDBInstance(RebuildDBInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.rebuildDBInstanceWithOptions(request, runtime);
    }

    public DescribeDBProxyEndpointResponse describeDBProxyEndpointWithOptions(DescribeDBProxyEndpointRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDBProxyEndpoint", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDBProxyEndpointResponse());
    }

    public DescribeDBProxyEndpointResponse describeDBProxyEndpoint(DescribeDBProxyEndpointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBProxyEndpointWithOptions(request, runtime);
    }

    public DescribeDBProxyPerformanceResponse describeDBProxyPerformanceWithOptions(DescribeDBProxyPerformanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDBProxyPerformance", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDBProxyPerformanceResponse());
    }

    public DescribeDBProxyPerformanceResponse describeDBProxyPerformance(DescribeDBProxyPerformanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBProxyPerformanceWithOptions(request, runtime);
    }

    public DescribeDBProxyResponse describeDBProxyWithOptions(DescribeDBProxyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDBProxy", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDBProxyResponse());
    }

    public DescribeDBProxyResponse describeDBProxy(DescribeDBProxyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBProxyWithOptions(request, runtime);
    }

    public ModifyDBProxyEndpointResponse modifyDBProxyEndpointWithOptions(ModifyDBProxyEndpointRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyDBProxyEndpoint", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new ModifyDBProxyEndpointResponse());
    }

    public ModifyDBProxyEndpointResponse modifyDBProxyEndpoint(ModifyDBProxyEndpointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDBProxyEndpointWithOptions(request, runtime);
    }

    public ModifyDBProxyInstanceResponse modifyDBProxyInstanceWithOptions(ModifyDBProxyInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyDBProxyInstance", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new ModifyDBProxyInstanceResponse());
    }

    public ModifyDBProxyInstanceResponse modifyDBProxyInstance(ModifyDBProxyInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDBProxyInstanceWithOptions(request, runtime);
    }

    public ModifyDBProxyResponse modifyDBProxyWithOptions(ModifyDBProxyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyDBProxy", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new ModifyDBProxyResponse());
    }

    public ModifyDBProxyResponse modifyDBProxy(ModifyDBProxyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDBProxyWithOptions(request, runtime);
    }

    public ModifyHASwitchConfigResponse modifyHASwitchConfigWithOptions(ModifyHASwitchConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyHASwitchConfig", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new ModifyHASwitchConfigResponse());
    }

    public ModifyHASwitchConfigResponse modifyHASwitchConfig(ModifyHASwitchConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyHASwitchConfigWithOptions(request, runtime);
    }

    public DescribeHASwitchConfigResponse describeHASwitchConfigWithOptions(DescribeHASwitchConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeHASwitchConfig", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new DescribeHASwitchConfigResponse());
    }

    public DescribeHASwitchConfigResponse describeHASwitchConfig(DescribeHASwitchConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeHASwitchConfigWithOptions(request, runtime);
    }

    public ModifyActionEventPolicyResponse modifyActionEventPolicyWithOptions(ModifyActionEventPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyActionEventPolicy", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new ModifyActionEventPolicyResponse());
    }

    public ModifyActionEventPolicyResponse modifyActionEventPolicy(ModifyActionEventPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyActionEventPolicyWithOptions(request, runtime);
    }

    public DescribeActionEventPolicyResponse describeActionEventPolicyWithOptions(DescribeActionEventPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeActionEventPolicy", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new DescribeActionEventPolicyResponse());
    }

    public DescribeActionEventPolicyResponse describeActionEventPolicy(DescribeActionEventPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeActionEventPolicyWithOptions(request, runtime);
    }

    public DescribeEventsResponse describeEventsWithOptions(DescribeEventsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeEvents", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new DescribeEventsResponse());
    }

    public DescribeEventsResponse describeEvents(DescribeEventsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEventsWithOptions(request, runtime);
    }

    public DescribeDBInstancesForCloneResponse describeDBInstancesForCloneWithOptions(DescribeDBInstancesForCloneRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDBInstancesForClone", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDBInstancesForCloneResponse());
    }

    public DescribeDBInstancesForCloneResponse describeDBInstancesForClone(DescribeDBInstancesForCloneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBInstancesForCloneWithOptions(request, runtime);
    }

    /**
     * DescribeDTCSecurityIpHostsForSQLServer 调用DescribeDTCSecurityIpHostsForSQLServer接口查询RDS实例的分布式事务白名单信息。
      * request demo:   * ```
      * http(s)://rds.aliyuncs.com/?Action=DescribeDTCSecurityIpHostsForSQLServer
      * &DBInstanceId=rm-uf6wjk5xxxxxxx
      * &RegionId=cn-hangzhou
      * &<公共请求参数>
      * ```
      * description:   * 关于分布式事务白名单请参见[设置分布式事务白名单](~~124321~~)。
      * 仅适用于如下版本实例：
      * * SQL Server 2012/2016企业版高可用版
      * * SQL Server 2012/2016标准版
    
     */
    public DescribeDTCSecurityIpHostsForSQLServerResponse describeDTCSecurityIpHostsForSQLServerWithOptions(DescribeDTCSecurityIpHostsForSQLServerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDTCSecurityIpHostsForSQLServer", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDTCSecurityIpHostsForSQLServerResponse());
    }

    /**
     * DescribeDTCSecurityIpHostsForSQLServer 调用DescribeDTCSecurityIpHostsForSQLServer接口查询RDS实例的分布式事务白名单信息。
      * request demo:   * ```
      * http(s)://rds.aliyuncs.com/?Action=DescribeDTCSecurityIpHostsForSQLServer
      * &DBInstanceId=rm-uf6wjk5xxxxxxx
      * &RegionId=cn-hangzhou
      * &<公共请求参数>
      * ```
      * description:   * 关于分布式事务白名单请参见[设置分布式事务白名单](~~124321~~)。
      * 仅适用于如下版本实例：
      * * SQL Server 2012/2016企业版高可用版
      * * SQL Server 2012/2016标准版
    
     */
    public DescribeDTCSecurityIpHostsForSQLServerResponse describeDTCSecurityIpHostsForSQLServer(DescribeDTCSecurityIpHostsForSQLServerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDTCSecurityIpHostsForSQLServerWithOptions(request, runtime);
    }

    /**
     * ModifyDTCSecurityIpHostsForSQLServer 调用ModifyDTCSecurityIpHostsForSQLServer接口设置分布式事务白名单。
      * request demo:   * ```
      * http(s)://rds.aliyuncs.com/?Action=ModifyDTCSecurityIpHostsForSQLServer
      * &DBInstanceId=rm-uf6wjk5xxxxxxx
      * &RegionId=cn-hangzhou
      * &SecurityIpHosts=192.168.1.100,k3ecstest
      * &WhiteListGroupName=test1
      * &<公共请求参数>
      * ```
      * description:   * 分布式事务白名单可以让ECS实例和RDS实例之间支持分布式事务。详情请参见[设置分布式事务白名单](~~124321~~)。
      * 仅适用于如下版本实例：
      * * SQL Server 2012/2016企业版高可用版
      * * SQL Server 2012/2016标准版
    
     */
    public ModifyDTCSecurityIpHostsForSQLServerResponse modifyDTCSecurityIpHostsForSQLServerWithOptions(ModifyDTCSecurityIpHostsForSQLServerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyDTCSecurityIpHostsForSQLServer", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new ModifyDTCSecurityIpHostsForSQLServerResponse());
    }

    /**
     * ModifyDTCSecurityIpHostsForSQLServer 调用ModifyDTCSecurityIpHostsForSQLServer接口设置分布式事务白名单。
      * request demo:   * ```
      * http(s)://rds.aliyuncs.com/?Action=ModifyDTCSecurityIpHostsForSQLServer
      * &DBInstanceId=rm-uf6wjk5xxxxxxx
      * &RegionId=cn-hangzhou
      * &SecurityIpHosts=192.168.1.100,k3ecstest
      * &WhiteListGroupName=test1
      * &<公共请求参数>
      * ```
      * description:   * 分布式事务白名单可以让ECS实例和RDS实例之间支持分布式事务。详情请参见[设置分布式事务白名单](~~124321~~)。
      * 仅适用于如下版本实例：
      * * SQL Server 2012/2016企业版高可用版
      * * SQL Server 2012/2016标准版
    
     */
    public ModifyDTCSecurityIpHostsForSQLServerResponse modifyDTCSecurityIpHostsForSQLServer(ModifyDTCSecurityIpHostsForSQLServerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDTCSecurityIpHostsForSQLServerWithOptions(request, runtime);
    }

    /**
     * DescribeDBInstanceIpHostname 调用DescribeDBInstanceIpHostname接口查询RDS实例的底层ECS实例的hostname。
      * request demo:   * ```
      * http(s)://rds.aliyuncs.com/?Action=DescribeDBInstanceIpHostname
      * &DBInstanceId=rm-uf6wjk5xxxxxxx	
      * &RegionId=cn-hangzhou
      * &<公共请求参数>
      * ```
      * description:   * RDS实例是基于ECS实例搭建的，本接口用于[设置分布式事务白名单](~~124321~~)时查询RDS实例的底层ECS实例的hostname。
      * 仅适用于如下版本实例：
      * * SQL Server 2012/2016企业版高可用版
      * * SQL Server 2012/2016标准版
    
     */
    public DescribeDBInstanceIpHostnameResponse describeDBInstanceIpHostnameWithOptions(DescribeDBInstanceIpHostnameRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDBInstanceIpHostname", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDBInstanceIpHostnameResponse());
    }

    /**
     * DescribeDBInstanceIpHostname 调用DescribeDBInstanceIpHostname接口查询RDS实例的底层ECS实例的hostname。
      * request demo:   * ```
      * http(s)://rds.aliyuncs.com/?Action=DescribeDBInstanceIpHostname
      * &DBInstanceId=rm-uf6wjk5xxxxxxx	
      * &RegionId=cn-hangzhou
      * &<公共请求参数>
      * ```
      * description:   * RDS实例是基于ECS实例搭建的，本接口用于[设置分布式事务白名单](~~124321~~)时查询RDS实例的底层ECS实例的hostname。
      * 仅适用于如下版本实例：
      * * SQL Server 2012/2016企业版高可用版
      * * SQL Server 2012/2016标准版
    
     */
    public DescribeDBInstanceIpHostnameResponse describeDBInstanceIpHostname(DescribeDBInstanceIpHostnameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBInstanceIpHostnameWithOptions(request, runtime);
    }

    public ModifyDBInstanceAutoUpgradeMinorVersionResponse modifyDBInstanceAutoUpgradeMinorVersionWithOptions(ModifyDBInstanceAutoUpgradeMinorVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyDBInstanceAutoUpgradeMinorVersion", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new ModifyDBInstanceAutoUpgradeMinorVersionResponse());
    }

    public ModifyDBInstanceAutoUpgradeMinorVersionResponse modifyDBInstanceAutoUpgradeMinorVersion(ModifyDBInstanceAutoUpgradeMinorVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDBInstanceAutoUpgradeMinorVersionWithOptions(request, runtime);
    }

    /**
     * DescribeAvailableCrossRegion 调用DescribeAvailableCrossRegion接口查询所选地域当前可以进行跨地域备份的目的地域。
      * request demo:   * ```
      * http(s)://rds.aliyuncs.com/?Action=DescribeAvailableCrossRegion
      * &RegionId=cn-hangzhou
      * &<公共请求参数>
      * ```
      * description: 
     */
    public DescribeAvailableCrossRegionResponse describeAvailableCrossRegionWithOptions(DescribeAvailableCrossRegionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeAvailableCrossRegion", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new DescribeAvailableCrossRegionResponse());
    }

    /**
     * DescribeAvailableCrossRegion 调用DescribeAvailableCrossRegion接口查询所选地域当前可以进行跨地域备份的目的地域。
      * request demo:   * ```
      * http(s)://rds.aliyuncs.com/?Action=DescribeAvailableCrossRegion
      * &RegionId=cn-hangzhou
      * &<公共请求参数>
      * ```
      * description: 
     */
    public DescribeAvailableCrossRegionResponse describeAvailableCrossRegion(DescribeAvailableCrossRegionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAvailableCrossRegionWithOptions(request, runtime);
    }

    public CheckCreateDdrDBInstanceResponse checkCreateDdrDBInstanceWithOptions(CheckCreateDdrDBInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CheckCreateDdrDBInstance", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new CheckCreateDdrDBInstanceResponse());
    }

    public CheckCreateDdrDBInstanceResponse checkCreateDdrDBInstance(CheckCreateDdrDBInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkCreateDdrDBInstanceWithOptions(request, runtime);
    }

    /**
     * DescribeAvailableRecoveryTime 调用DescribeAvailableRecoveryTime接口查询某跨地域备份文件可恢复哪个时间段的数据。
      * request demo:   * ```
      * http(s)://rds.aliyuncs.com/?Action=DescribeAvailableRecoveryTime
      * &CrossBackupId=14377
      * &<公共请求参数>
      * ```
      * description:   * 查看普通备份文件可恢复哪个时间段的数据请参见[DescribeBackups](~~26273~~)。
      * 仅适用于如下实例：
      * * MySQL 5.7高可用本地SSD盘版
      * * MySQL 5.6
    
     */
    public DescribeAvailableRecoveryTimeResponse describeAvailableRecoveryTimeWithOptions(DescribeAvailableRecoveryTimeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeAvailableRecoveryTime", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new DescribeAvailableRecoveryTimeResponse());
    }

    /**
     * DescribeAvailableRecoveryTime 调用DescribeAvailableRecoveryTime接口查询某跨地域备份文件可恢复哪个时间段的数据。
      * request demo:   * ```
      * http(s)://rds.aliyuncs.com/?Action=DescribeAvailableRecoveryTime
      * &CrossBackupId=14377
      * &<公共请求参数>
      * ```
      * description:   * 查看普通备份文件可恢复哪个时间段的数据请参见[DescribeBackups](~~26273~~)。
      * 仅适用于如下实例：
      * * MySQL 5.7高可用本地SSD盘版
      * * MySQL 5.6
    
     */
    public DescribeAvailableRecoveryTimeResponse describeAvailableRecoveryTime(DescribeAvailableRecoveryTimeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAvailableRecoveryTimeWithOptions(request, runtime);
    }

    /**
     * DescribeCrossRegionLogBackupFiles 调用DescribeCrossRegionLogBackupFiles接口查看跨地域日志备份文件列表。
      * request demo:   * ```
      * http(s)://rds.aliyuncs.com/?Action=DescribeCrossRegionLogBackupFiles
      * &DBInstanceId=rm-uf6wjk5xxxxxxxxxx
      * &StartTime=2019-05-30T12:10Z
      * &EndTime=2019-06-15T12:10Z
      * &<公共请求参数>
      * ```
      * description:   * 查看数据备份文件请参见[DescribeCrossRegionBackups](~~121733~~)。
      * 仅适用于如下实例：
      * * MySQL 5.7高可用本地SSD盘版
      * * MySQL 5.6
    
     */
    public DescribeCrossRegionLogBackupFilesResponse describeCrossRegionLogBackupFilesWithOptions(DescribeCrossRegionLogBackupFilesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeCrossRegionLogBackupFiles", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new DescribeCrossRegionLogBackupFilesResponse());
    }

    /**
     * DescribeCrossRegionLogBackupFiles 调用DescribeCrossRegionLogBackupFiles接口查看跨地域日志备份文件列表。
      * request demo:   * ```
      * http(s)://rds.aliyuncs.com/?Action=DescribeCrossRegionLogBackupFiles
      * &DBInstanceId=rm-uf6wjk5xxxxxxxxxx
      * &StartTime=2019-05-30T12:10Z
      * &EndTime=2019-06-15T12:10Z
      * &<公共请求参数>
      * ```
      * description:   * 查看数据备份文件请参见[DescribeCrossRegionBackups](~~121733~~)。
      * 仅适用于如下实例：
      * * MySQL 5.7高可用本地SSD盘版
      * * MySQL 5.6
    
     */
    public DescribeCrossRegionLogBackupFilesResponse describeCrossRegionLogBackupFiles(DescribeCrossRegionLogBackupFilesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCrossRegionLogBackupFilesWithOptions(request, runtime);
    }

    /**
     * ModifyInstanceCrossBackupPolicy 调用ModifyInstanceCrossBackupPolicy接口修改RDS跨地域备份设置。
      * request demo:   * ```
      * http(s)://rds.aliyuncs.com/?Action=ModifyInstanceCrossBackupPolicy
      * &DBInstanceId=rm-uf6wjk5xxxxxxxxxx
      * &RegionId=cn-hangzhou
      * &<公共请求参数>
      * ```
      * description:   * 仅适用于如下实例：
      * * MySQL 5.7高可用本地SSD盘版
      * * MySQL 5.6
    
     */
    public ModifyInstanceCrossBackupPolicyResponse modifyInstanceCrossBackupPolicyWithOptions(ModifyInstanceCrossBackupPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyInstanceCrossBackupPolicy", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new ModifyInstanceCrossBackupPolicyResponse());
    }

    /**
     * ModifyInstanceCrossBackupPolicy 调用ModifyInstanceCrossBackupPolicy接口修改RDS跨地域备份设置。
      * request demo:   * ```
      * http(s)://rds.aliyuncs.com/?Action=ModifyInstanceCrossBackupPolicy
      * &DBInstanceId=rm-uf6wjk5xxxxxxxxxx
      * &RegionId=cn-hangzhou
      * &<公共请求参数>
      * ```
      * description:   * 仅适用于如下实例：
      * * MySQL 5.7高可用本地SSD盘版
      * * MySQL 5.6
    
     */
    public ModifyInstanceCrossBackupPolicyResponse modifyInstanceCrossBackupPolicy(ModifyInstanceCrossBackupPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyInstanceCrossBackupPolicyWithOptions(request, runtime);
    }

    /**
     * CreateDdrInstance 调用CreateDdrInstance接口跨地域恢复数据到新实例。
      * request demo:   * ```
      * http(s)://rds.aliyuncs.com/?Action==CreateDdrInstance
      * &RegionId=cn-hangzhou
      * &Engine=MySQL
      * &EngineVersion=5.6
      * &DBInstanceClass=rds.mysql.s1.small
      * &DBInstanceStorage=20
      * &DBInstanceNetType=Intranet
      * &PayType=Prepaid
      * &RestoreType=0
      * &SecurityIPList=127.0.0.1
      * &BackupSetId=14358
      * &<公共请求参数>
      * ```
      * description:   * 恢复前可以调用[CheckCreateDdrDBInstance](~~121721~~)接口预检查某RDS实例是否可以用跨地域备份集进行跨地域恢复。
      * 仅适用于如下实例：
      * * MySQL 5.7高可用本地SSD盘版
      * * MySQL 5.6
    
     */
    public CreateDdrInstanceResponse createDdrInstanceWithOptions(CreateDdrInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateDdrInstance", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new CreateDdrInstanceResponse());
    }

    /**
     * CreateDdrInstance 调用CreateDdrInstance接口跨地域恢复数据到新实例。
      * request demo:   * ```
      * http(s)://rds.aliyuncs.com/?Action==CreateDdrInstance
      * &RegionId=cn-hangzhou
      * &Engine=MySQL
      * &EngineVersion=5.6
      * &DBInstanceClass=rds.mysql.s1.small
      * &DBInstanceStorage=20
      * &DBInstanceNetType=Intranet
      * &PayType=Prepaid
      * &RestoreType=0
      * &SecurityIPList=127.0.0.1
      * &BackupSetId=14358
      * &<公共请求参数>
      * ```
      * description:   * 恢复前可以调用[CheckCreateDdrDBInstance](~~121721~~)接口预检查某RDS实例是否可以用跨地域备份集进行跨地域恢复。
      * 仅适用于如下实例：
      * * MySQL 5.7高可用本地SSD盘版
      * * MySQL 5.6
    
     */
    public CreateDdrInstanceResponse createDdrInstance(CreateDdrInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDdrInstanceWithOptions(request, runtime);
    }

    public DescribeCrossRegionBackupDBInstanceResponse describeCrossRegionBackupDBInstanceWithOptions(DescribeCrossRegionBackupDBInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeCrossRegionBackupDBInstance", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new DescribeCrossRegionBackupDBInstanceResponse());
    }

    public DescribeCrossRegionBackupDBInstanceResponse describeCrossRegionBackupDBInstance(DescribeCrossRegionBackupDBInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCrossRegionBackupDBInstanceWithOptions(request, runtime);
    }

    /**
     * DescribeInstanceCrossBackupPolicy 调用DescribeInstanceCrossBackupPolicy接口查询跨地域备份设置。
      * request demo:   * ```
      * http(s)://rds.aliyuncs.com/?Action=DescribeInstanceCrossBackupPolicy
      * &DBInstanceId=rm-uf6wjk5xxxxxxxxxx
      * &<公共请求参数>
      * ```
      * description:   * 仅适用于如下实例：
      * * MySQL 5.7高可用本地SSD盘版
      * * MySQL 5.6
    
     */
    public DescribeInstanceCrossBackupPolicyResponse describeInstanceCrossBackupPolicyWithOptions(DescribeInstanceCrossBackupPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeInstanceCrossBackupPolicy", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new DescribeInstanceCrossBackupPolicyResponse());
    }

    /**
     * DescribeInstanceCrossBackupPolicy 调用DescribeInstanceCrossBackupPolicy接口查询跨地域备份设置。
      * request demo:   * ```
      * http(s)://rds.aliyuncs.com/?Action=DescribeInstanceCrossBackupPolicy
      * &DBInstanceId=rm-uf6wjk5xxxxxxxxxx
      * &<公共请求参数>
      * ```
      * description:   * 仅适用于如下实例：
      * * MySQL 5.7高可用本地SSD盘版
      * * MySQL 5.6
    
     */
    public DescribeInstanceCrossBackupPolicyResponse describeInstanceCrossBackupPolicy(DescribeInstanceCrossBackupPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceCrossBackupPolicyWithOptions(request, runtime);
    }

    /**
     * DescribeCrossRegionBackups 调用DescribeCrossRegionBackups接口查看某RDS实例跨地域数据备份文件列表。
      * request demo:   * ```
      * http(s)://rds.aliyuncs.com/?Action=DescribeCrossRegionBackups
      * &DBInstanceId=rm-uf6wjk5xxxxxxxxxx
      * &CrossBackupId=14562
      * &<公共请求参数>
      * ```
      * description:   * 查看日志备份文件请参见[DescribeCrossRegionLogBackupFiles](~~121734~~)。
      * 仅适用于如下实例：
      * * MySQL 5.7高可用本地SSD盘版
      * * MySQL 5.6
    
     */
    public DescribeCrossRegionBackupsResponse describeCrossRegionBackupsWithOptions(DescribeCrossRegionBackupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeCrossRegionBackups", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new DescribeCrossRegionBackupsResponse());
    }

    /**
     * DescribeCrossRegionBackups 调用DescribeCrossRegionBackups接口查看某RDS实例跨地域数据备份文件列表。
      * request demo:   * ```
      * http(s)://rds.aliyuncs.com/?Action=DescribeCrossRegionBackups
      * &DBInstanceId=rm-uf6wjk5xxxxxxxxxx
      * &CrossBackupId=14562
      * &<公共请求参数>
      * ```
      * description:   * 查看日志备份文件请参见[DescribeCrossRegionLogBackupFiles](~~121734~~)。
      * 仅适用于如下实例：
      * * MySQL 5.7高可用本地SSD盘版
      * * MySQL 5.6
    
     */
    public DescribeCrossRegionBackupsResponse describeCrossRegionBackups(DescribeCrossRegionBackupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCrossRegionBackupsWithOptions(request, runtime);
    }

    public CheckCloudResourceAuthorizedResponse checkCloudResourceAuthorizedWithOptions(CheckCloudResourceAuthorizedRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CheckCloudResourceAuthorized", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new CheckCloudResourceAuthorizedResponse());
    }

    public CheckCloudResourceAuthorizedResponse checkCloudResourceAuthorized(CheckCloudResourceAuthorizedRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkCloudResourceAuthorizedWithOptions(request, runtime);
    }

    public DescribeReadDBInstanceDelayResponse describeReadDBInstanceDelayWithOptions(DescribeReadDBInstanceDelayRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeReadDBInstanceDelay", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new DescribeReadDBInstanceDelayResponse());
    }

    public DescribeReadDBInstanceDelayResponse describeReadDBInstanceDelay(DescribeReadDBInstanceDelayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeReadDBInstanceDelayWithOptions(request, runtime);
    }

    public RestoreTableResponse restoreTableWithOptions(RestoreTableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RestoreTable", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new RestoreTableResponse());
    }

    public RestoreTableResponse restoreTable(RestoreTableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.restoreTableWithOptions(request, runtime);
    }

    public CreateParameterGroupResponse createParameterGroupWithOptions(CreateParameterGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateParameterGroup", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new CreateParameterGroupResponse());
    }

    public CreateParameterGroupResponse createParameterGroup(CreateParameterGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createParameterGroupWithOptions(request, runtime);
    }

    public DescribeParameterGroupsResponse describeParameterGroupsWithOptions(DescribeParameterGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeParameterGroups", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new DescribeParameterGroupsResponse());
    }

    public DescribeParameterGroupsResponse describeParameterGroups(DescribeParameterGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeParameterGroupsWithOptions(request, runtime);
    }

    public CloneParameterGroupResponse cloneParameterGroupWithOptions(CloneParameterGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CloneParameterGroup", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new CloneParameterGroupResponse());
    }

    public CloneParameterGroupResponse cloneParameterGroup(CloneParameterGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cloneParameterGroupWithOptions(request, runtime);
    }

    public DescribeParameterGroupResponse describeParameterGroupWithOptions(DescribeParameterGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeParameterGroup", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new DescribeParameterGroupResponse());
    }

    public DescribeParameterGroupResponse describeParameterGroup(DescribeParameterGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeParameterGroupWithOptions(request, runtime);
    }

    public ModifyParameterGroupResponse modifyParameterGroupWithOptions(ModifyParameterGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyParameterGroup", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new ModifyParameterGroupResponse());
    }

    public ModifyParameterGroupResponse modifyParameterGroup(ModifyParameterGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyParameterGroupWithOptions(request, runtime);
    }

    public DeleteParameterGroupResponse deleteParameterGroupWithOptions(DeleteParameterGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteParameterGroup", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new DeleteParameterGroupResponse());
    }

    public DeleteParameterGroupResponse deleteParameterGroup(DeleteParameterGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteParameterGroupWithOptions(request, runtime);
    }

    public ModifySQLCollectorRetentionResponse modifySQLCollectorRetentionWithOptions(ModifySQLCollectorRetentionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifySQLCollectorRetention", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new ModifySQLCollectorRetentionResponse());
    }

    public ModifySQLCollectorRetentionResponse modifySQLCollectorRetention(ModifySQLCollectorRetentionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifySQLCollectorRetentionWithOptions(request, runtime);
    }

    public DescribeSQLCollectorRetentionResponse describeSQLCollectorRetentionWithOptions(DescribeSQLCollectorRetentionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeSQLCollectorRetention", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new DescribeSQLCollectorRetentionResponse());
    }

    public DescribeSQLCollectorRetentionResponse describeSQLCollectorRetention(DescribeSQLCollectorRetentionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSQLCollectorRetentionWithOptions(request, runtime);
    }

    public CheckInstanceExistResponse checkInstanceExistWithOptions(CheckInstanceExistRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CheckInstanceExist", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new CheckInstanceExistResponse());
    }

    public CheckInstanceExistResponse checkInstanceExist(CheckInstanceExistRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkInstanceExistWithOptions(request, runtime);
    }

    public DescribeLogBackupFilesResponse describeLogBackupFilesWithOptions(DescribeLogBackupFilesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeLogBackupFiles", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new DescribeLogBackupFilesResponse());
    }

    public DescribeLogBackupFilesResponse describeLogBackupFiles(DescribeLogBackupFilesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLogBackupFilesWithOptions(request, runtime);
    }

    /**
     * MigrateSecurityIPMode You can call this operation to switch a whitelist from normal mode to safe mode.
      * request demo:   * http(s)://rds.aliyuncs.com/? Action=MigrateSecurityIPMode
      * &DBInstanceId=rm-uf6wjk5xxxxxxx
      * &<Common request parameters>
      * description:   * * In normal mode, IP addresses in the whitelist apply to both classic networks and VPCs. In case of security risks, we recommend that you switch to safe mode.
      * * In safe mode, IP addresses in the whitelist are divided into VPC IP addresses and the IP addresses of classic networks and public networks.
      * > 
      * * Safe mode cannot be switched to normal mode.
      * * This operation is not applicable to SQL Server and MariaDB instances. 
    
     */
    public MigrateSecurityIPModeResponse migrateSecurityIPModeWithOptions(MigrateSecurityIPModeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("MigrateSecurityIPMode", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new MigrateSecurityIPModeResponse());
    }

    /**
     * MigrateSecurityIPMode You can call this operation to switch a whitelist from normal mode to safe mode.
      * request demo:   * http(s)://rds.aliyuncs.com/? Action=MigrateSecurityIPMode
      * &DBInstanceId=rm-uf6wjk5xxxxxxx
      * &<Common request parameters>
      * description:   * * In normal mode, IP addresses in the whitelist apply to both classic networks and VPCs. In case of security risks, we recommend that you switch to safe mode.
      * * In safe mode, IP addresses in the whitelist are divided into VPC IP addresses and the IP addresses of classic networks and public networks.
      * > 
      * * Safe mode cannot be switched to normal mode.
      * * This operation is not applicable to SQL Server and MariaDB instances. 
    
     */
    public MigrateSecurityIPModeResponse migrateSecurityIPMode(MigrateSecurityIPModeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.migrateSecurityIPModeWithOptions(request, runtime);
    }

    public SwitchDBInstanceVpcResponse switchDBInstanceVpcWithOptions(SwitchDBInstanceVpcRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SwitchDBInstanceVpc", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new SwitchDBInstanceVpcResponse());
    }

    public SwitchDBInstanceVpcResponse switchDBInstanceVpc(SwitchDBInstanceVpcRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.switchDBInstanceVpcWithOptions(request, runtime);
    }

    public DescribeCollationTimeZonesResponse describeCollationTimeZonesWithOptions(DescribeCollationTimeZonesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeCollationTimeZones", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new DescribeCollationTimeZonesResponse());
    }

    public DescribeCollationTimeZonesResponse describeCollationTimeZones(DescribeCollationTimeZonesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCollationTimeZonesWithOptions(request, runtime);
    }

    public DescribeInstanceKeywordsResponse describeInstanceKeywordsWithOptions(DescribeInstanceKeywordsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeInstanceKeywords", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new DescribeInstanceKeywordsResponse());
    }

    public DescribeInstanceKeywordsResponse describeInstanceKeywords(DescribeInstanceKeywordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceKeywordsWithOptions(request, runtime);
    }

    public ModifyCollationTimeZoneResponse modifyCollationTimeZoneWithOptions(ModifyCollationTimeZoneRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyCollationTimeZone", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new ModifyCollationTimeZoneResponse());
    }

    public ModifyCollationTimeZoneResponse modifyCollationTimeZone(ModifyCollationTimeZoneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyCollationTimeZoneWithOptions(request, runtime);
    }

    public DescribeBackupDatabaseResponse describeBackupDatabaseWithOptions(DescribeBackupDatabaseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeBackupDatabase", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new DescribeBackupDatabaseResponse());
    }

    public DescribeBackupDatabaseResponse describeBackupDatabase(DescribeBackupDatabaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBackupDatabaseWithOptions(request, runtime);
    }

    public CopyDatabaseBetweenInstancesResponse copyDatabaseBetweenInstancesWithOptions(CopyDatabaseBetweenInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CopyDatabaseBetweenInstances", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new CopyDatabaseBetweenInstancesResponse());
    }

    public CopyDatabaseBetweenInstancesResponse copyDatabaseBetweenInstances(CopyDatabaseBetweenInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.copyDatabaseBetweenInstancesWithOptions(request, runtime);
    }

    public RecoveryDBInstanceResponse recoveryDBInstanceWithOptions(RecoveryDBInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RecoveryDBInstance", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new RecoveryDBInstanceResponse());
    }

    public RecoveryDBInstanceResponse recoveryDBInstance(RecoveryDBInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recoveryDBInstanceWithOptions(request, runtime);
    }

    public DescribeAvailableResourceResponse describeAvailableResourceWithOptions(DescribeAvailableResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeAvailableResource", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new DescribeAvailableResourceResponse());
    }

    public DescribeAvailableResourceResponse describeAvailableResource(DescribeAvailableResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAvailableResourceWithOptions(request, runtime);
    }

    public DestroyDBInstanceResponse destroyDBInstanceWithOptions(DestroyDBInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DestroyDBInstance", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new DestroyDBInstanceResponse());
    }

    public DestroyDBInstanceResponse destroyDBInstance(DestroyDBInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.destroyDBInstanceWithOptions(request, runtime);
    }

    public ModifyReadonlyInstanceDelayReplicationTimeResponse modifyReadonlyInstanceDelayReplicationTimeWithOptions(ModifyReadonlyInstanceDelayReplicationTimeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyReadonlyInstanceDelayReplicationTime", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new ModifyReadonlyInstanceDelayReplicationTimeResponse());
    }

    public ModifyReadonlyInstanceDelayReplicationTimeResponse modifyReadonlyInstanceDelayReplicationTime(ModifyReadonlyInstanceDelayReplicationTimeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyReadonlyInstanceDelayReplicationTimeWithOptions(request, runtime);
    }

    public DescribeDBInstanceProxyConfigurationResponse describeDBInstanceProxyConfigurationWithOptions(DescribeDBInstanceProxyConfigurationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDBInstanceProxyConfiguration", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDBInstanceProxyConfigurationResponse());
    }

    public DescribeDBInstanceProxyConfigurationResponse describeDBInstanceProxyConfiguration(DescribeDBInstanceProxyConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBInstanceProxyConfigurationWithOptions(request, runtime);
    }

    public CreateOnlineDatabaseTaskResponse createOnlineDatabaseTaskWithOptions(CreateOnlineDatabaseTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateOnlineDatabaseTask", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new CreateOnlineDatabaseTaskResponse());
    }

    public CreateOnlineDatabaseTaskResponse createOnlineDatabaseTask(CreateOnlineDatabaseTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createOnlineDatabaseTaskWithOptions(request, runtime);
    }

    public UpgradeDBInstanceKernelVersionResponse upgradeDBInstanceKernelVersionWithOptions(UpgradeDBInstanceKernelVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpgradeDBInstanceKernelVersion", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new UpgradeDBInstanceKernelVersionResponse());
    }

    public UpgradeDBInstanceKernelVersionResponse upgradeDBInstanceKernelVersion(UpgradeDBInstanceKernelVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.upgradeDBInstanceKernelVersionWithOptions(request, runtime);
    }

    public ModifyDBInstanceProxyConfigurationResponse modifyDBInstanceProxyConfigurationWithOptions(ModifyDBInstanceProxyConfigurationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyDBInstanceProxyConfiguration", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new ModifyDBInstanceProxyConfigurationResponse());
    }

    public ModifyDBInstanceProxyConfigurationResponse modifyDBInstanceProxyConfiguration(ModifyDBInstanceProxyConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDBInstanceProxyConfigurationWithOptions(request, runtime);
    }

    public DescribeSecurityGroupConfigurationResponse describeSecurityGroupConfigurationWithOptions(DescribeSecurityGroupConfigurationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeSecurityGroupConfiguration", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new DescribeSecurityGroupConfigurationResponse());
    }

    public DescribeSecurityGroupConfigurationResponse describeSecurityGroupConfiguration(DescribeSecurityGroupConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSecurityGroupConfigurationWithOptions(request, runtime);
    }

    public ModifySecurityGroupConfigurationResponse modifySecurityGroupConfigurationWithOptions(ModifySecurityGroupConfigurationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifySecurityGroupConfiguration", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new ModifySecurityGroupConfigurationResponse());
    }

    public ModifySecurityGroupConfigurationResponse modifySecurityGroupConfiguration(ModifySecurityGroupConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifySecurityGroupConfigurationWithOptions(request, runtime);
    }

    public DescribeOssDownloadsForSQLServerResponse describeOssDownloadsForSQLServerWithOptions(DescribeOssDownloadsForSQLServerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeOssDownloadsForSQLServer", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new DescribeOssDownloadsForSQLServerResponse());
    }

    public DescribeOssDownloadsForSQLServerResponse describeOssDownloadsForSQLServer(DescribeOssDownloadsForSQLServerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeOssDownloadsForSQLServerWithOptions(request, runtime);
    }

    public DescribeMigrateTasksForSQLServerResponse describeMigrateTasksForSQLServerWithOptions(DescribeMigrateTasksForSQLServerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeMigrateTasksForSQLServer", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new DescribeMigrateTasksForSQLServerResponse());
    }

    public DescribeMigrateTasksForSQLServerResponse describeMigrateTasksForSQLServer(DescribeMigrateTasksForSQLServerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMigrateTasksForSQLServerWithOptions(request, runtime);
    }

    public CreateMigrateTaskForSQLServerResponse createMigrateTaskForSQLServerWithOptions(CreateMigrateTaskForSQLServerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateMigrateTaskForSQLServer", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new CreateMigrateTaskForSQLServerResponse());
    }

    public CreateMigrateTaskForSQLServerResponse createMigrateTaskForSQLServer(CreateMigrateTaskForSQLServerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createMigrateTaskForSQLServerWithOptions(request, runtime);
    }

    public CreateMigrateTaskResponse createMigrateTaskWithOptions(CreateMigrateTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateMigrateTask", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new CreateMigrateTaskResponse());
    }

    public CreateMigrateTaskResponse createMigrateTask(CreateMigrateTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createMigrateTaskWithOptions(request, runtime);
    }

    public DescribeOssDownloadsResponse describeOssDownloadsWithOptions(DescribeOssDownloadsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeOssDownloads", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new DescribeOssDownloadsResponse());
    }

    public DescribeOssDownloadsResponse describeOssDownloads(DescribeOssDownloadsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeOssDownloadsWithOptions(request, runtime);
    }

    public DescribeMigrateTasksResponse describeMigrateTasksWithOptions(DescribeMigrateTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeMigrateTasks", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new DescribeMigrateTasksResponse());
    }

    public DescribeMigrateTasksResponse describeMigrateTasks(DescribeMigrateTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMigrateTasksWithOptions(request, runtime);
    }

    public CopyDatabaseResponse copyDatabaseWithOptions(CopyDatabaseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CopyDatabase", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new CopyDatabaseResponse());
    }

    public CopyDatabaseResponse copyDatabase(CopyDatabaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.copyDatabaseWithOptions(request, runtime);
    }

    public ResetAccountResponse resetAccountWithOptions(ResetAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ResetAccount", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new ResetAccountResponse());
    }

    public ResetAccountResponse resetAccount(ResetAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resetAccountWithOptions(request, runtime);
    }

    public DescribeDBInstancesAsCsvResponse describeDBInstancesAsCsvWithOptions(DescribeDBInstancesAsCsvRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDBInstancesAsCsv", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDBInstancesAsCsvResponse());
    }

    public DescribeDBInstancesAsCsvResponse describeDBInstancesAsCsv(DescribeDBInstancesAsCsvRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBInstancesAsCsvWithOptions(request, runtime);
    }

    public ModifyDBInstanceNetworkExpireTimeResponse modifyDBInstanceNetworkExpireTimeWithOptions(ModifyDBInstanceNetworkExpireTimeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyDBInstanceNetworkExpireTime", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new ModifyDBInstanceNetworkExpireTimeResponse());
    }

    public ModifyDBInstanceNetworkExpireTimeResponse modifyDBInstanceNetworkExpireTime(ModifyDBInstanceNetworkExpireTimeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDBInstanceNetworkExpireTimeWithOptions(request, runtime);
    }

    public ModifyResourceGroupResponse modifyResourceGroupWithOptions(ModifyResourceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyResourceGroup", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new ModifyResourceGroupResponse());
    }

    public ModifyResourceGroupResponse modifyResourceGroup(ModifyResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyResourceGroupWithOptions(request, runtime);
    }

    public DescribeRenewalPriceResponse describeRenewalPriceWithOptions(DescribeRenewalPriceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeRenewalPrice", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new DescribeRenewalPriceResponse());
    }

    public DescribeRenewalPriceResponse describeRenewalPrice(DescribeRenewalPriceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRenewalPriceWithOptions(request, runtime);
    }

    public DescribePriceResponse describePriceWithOptions(DescribePriceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribePrice", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new DescribePriceResponse());
    }

    public DescribePriceResponse describePrice(DescribePriceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePriceWithOptions(request, runtime);
    }

    public RenewInstanceResponse renewInstanceWithOptions(RenewInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RenewInstance", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new RenewInstanceResponse());
    }

    public RenewInstanceResponse renewInstance(RenewInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.renewInstanceWithOptions(request, runtime);
    }

    public CheckRecoveryConditionsResponse checkRecoveryConditionsWithOptions(CheckRecoveryConditionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CheckRecoveryConditions", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new CheckRecoveryConditionsResponse());
    }

    public CheckRecoveryConditionsResponse checkRecoveryConditions(CheckRecoveryConditionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkRecoveryConditionsWithOptions(request, runtime);
    }

    public ModifyInstanceAutoRenewalAttributeResponse modifyInstanceAutoRenewalAttributeWithOptions(ModifyInstanceAutoRenewalAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyInstanceAutoRenewalAttribute", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new ModifyInstanceAutoRenewalAttributeResponse());
    }

    public ModifyInstanceAutoRenewalAttributeResponse modifyInstanceAutoRenewalAttribute(ModifyInstanceAutoRenewalAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyInstanceAutoRenewalAttributeWithOptions(request, runtime);
    }

    public DescribeInstanceAutoRenewalAttributeResponse describeInstanceAutoRenewalAttributeWithOptions(DescribeInstanceAutoRenewalAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeInstanceAutoRenewalAttribute", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new DescribeInstanceAutoRenewalAttributeResponse());
    }

    public DescribeInstanceAutoRenewalAttributeResponse describeInstanceAutoRenewalAttribute(DescribeInstanceAutoRenewalAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceAutoRenewalAttributeWithOptions(request, runtime);
    }

    public ReleaseReadWriteSplittingConnectionResponse releaseReadWriteSplittingConnectionWithOptions(ReleaseReadWriteSplittingConnectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ReleaseReadWriteSplittingConnection", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new ReleaseReadWriteSplittingConnectionResponse());
    }

    public ReleaseReadWriteSplittingConnectionResponse releaseReadWriteSplittingConnection(ReleaseReadWriteSplittingConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.releaseReadWriteSplittingConnectionWithOptions(request, runtime);
    }

    public ModifyReadWriteSplittingConnectionResponse modifyReadWriteSplittingConnectionWithOptions(ModifyReadWriteSplittingConnectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyReadWriteSplittingConnection", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new ModifyReadWriteSplittingConnectionResponse());
    }

    public ModifyReadWriteSplittingConnectionResponse modifyReadWriteSplittingConnection(ModifyReadWriteSplittingConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyReadWriteSplittingConnectionWithOptions(request, runtime);
    }

    public CalculateDBInstanceWeightResponse calculateDBInstanceWeightWithOptions(CalculateDBInstanceWeightRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CalculateDBInstanceWeight", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new CalculateDBInstanceWeightResponse());
    }

    public CalculateDBInstanceWeightResponse calculateDBInstanceWeight(CalculateDBInstanceWeightRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.calculateDBInstanceWeightWithOptions(request, runtime);
    }

    public AllocateReadWriteSplittingConnectionResponse allocateReadWriteSplittingConnectionWithOptions(AllocateReadWriteSplittingConnectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AllocateReadWriteSplittingConnection", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new AllocateReadWriteSplittingConnectionResponse());
    }

    public AllocateReadWriteSplittingConnectionResponse allocateReadWriteSplittingConnection(AllocateReadWriteSplittingConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.allocateReadWriteSplittingConnectionWithOptions(request, runtime);
    }

    public ModifyDBInstancePayTypeResponse modifyDBInstancePayTypeWithOptions(ModifyDBInstancePayTypeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyDBInstancePayType", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new ModifyDBInstancePayTypeResponse());
    }

    public ModifyDBInstancePayTypeResponse modifyDBInstancePayType(ModifyDBInstancePayTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDBInstancePayTypeWithOptions(request, runtime);
    }

    public DescribeCharacterSetNameResponse describeCharacterSetNameWithOptions(DescribeCharacterSetNameRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeCharacterSetName", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new DescribeCharacterSetNameResponse());
    }

    public DescribeCharacterSetNameResponse describeCharacterSetName(DescribeCharacterSetNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCharacterSetNameWithOptions(request, runtime);
    }

    public DeleteBackupResponse deleteBackupWithOptions(DeleteBackupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteBackup", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new DeleteBackupResponse());
    }

    public DeleteBackupResponse deleteBackup(DeleteBackupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteBackupWithOptions(request, runtime);
    }

    public DescribeDiagnosticReportListResponse describeDiagnosticReportListWithOptions(DescribeDiagnosticReportListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDiagnosticReportList", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDiagnosticReportListResponse());
    }

    public DescribeDiagnosticReportListResponse describeDiagnosticReportList(DescribeDiagnosticReportListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDiagnosticReportListWithOptions(request, runtime);
    }

    public CreateDiagnosticReportResponse createDiagnosticReportWithOptions(CreateDiagnosticReportRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateDiagnosticReport", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new CreateDiagnosticReportResponse());
    }

    public CreateDiagnosticReportResponse createDiagnosticReport(CreateDiagnosticReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDiagnosticReportWithOptions(request, runtime);
    }

    public CloneDBInstanceResponse cloneDBInstanceWithOptions(CloneDBInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CloneDBInstance", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new CloneDBInstanceResponse());
    }

    public CloneDBInstanceResponse cloneDBInstance(CloneDBInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cloneDBInstanceWithOptions(request, runtime);
    }

    /**
     * DescribeTags 调用DescribeTags接口查询RDS实例的标签。
      * request demo:   * ```
      * http(s)://rds.aliyuncs.com/?Action=DescribeTags
      * &RegionId=cn-hangzhou
      * &<公共请求参数>
      * ```
      * description:   * 调用本接口时限制条件如下：
      * * 如果传入指定实例ID，则查询该实例下所有标签，其他过滤条件失效；
      * * 若查询标签时仅传入标签键（TagKey），未传入标签值（TagValue），则返回所有符合标签键条件的结果。若同时传入标签键和标签值，则返回两个条件都符合的结果。
    
     */
    public DescribeTagsResponse describeTagsWithOptions(DescribeTagsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeTags", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new DescribeTagsResponse());
    }

    /**
     * DescribeTags 调用DescribeTags接口查询RDS实例的标签。
      * request demo:   * ```
      * http(s)://rds.aliyuncs.com/?Action=DescribeTags
      * &RegionId=cn-hangzhou
      * &<公共请求参数>
      * ```
      * description:   * 调用本接口时限制条件如下：
      * * 如果传入指定实例ID，则查询该实例下所有标签，其他过滤条件失效；
      * * 若查询标签时仅传入标签键（TagKey），未传入标签值（TagValue），则返回所有符合标签键条件的结果。若同时传入标签键和标签值，则返回两个条件都符合的结果。
    
     */
    public DescribeTagsResponse describeTags(DescribeTagsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTagsWithOptions(request, runtime);
    }

    public DescribeDBInstanceByTagsResponse describeDBInstanceByTagsWithOptions(DescribeDBInstanceByTagsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDBInstanceByTags", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDBInstanceByTagsResponse());
    }

    public DescribeDBInstanceByTagsResponse describeDBInstanceByTags(DescribeDBInstanceByTagsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBInstanceByTagsWithOptions(request, runtime);
    }

    public RevokeOperatorPermissionResponse revokeOperatorPermissionWithOptions(RevokeOperatorPermissionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RevokeOperatorPermission", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new RevokeOperatorPermissionResponse());
    }

    public RevokeOperatorPermissionResponse revokeOperatorPermission(RevokeOperatorPermissionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.revokeOperatorPermissionWithOptions(request, runtime);
    }

    public ModifyDBInstanceTDEResponse modifyDBInstanceTDEWithOptions(ModifyDBInstanceTDERequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyDBInstanceTDE", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new ModifyDBInstanceTDEResponse());
    }

    public ModifyDBInstanceTDEResponse modifyDBInstanceTDE(ModifyDBInstanceTDERequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDBInstanceTDEWithOptions(request, runtime);
    }

    public ModifyDBInstanceSSLResponse modifyDBInstanceSSLWithOptions(ModifyDBInstanceSSLRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyDBInstanceSSL", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new ModifyDBInstanceSSLResponse());
    }

    public ModifyDBInstanceSSLResponse modifyDBInstanceSSL(ModifyDBInstanceSSLRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDBInstanceSSLWithOptions(request, runtime);
    }

    public GrantOperatorPermissionResponse grantOperatorPermissionWithOptions(GrantOperatorPermissionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GrantOperatorPermission", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new GrantOperatorPermissionResponse());
    }

    public GrantOperatorPermissionResponse grantOperatorPermission(GrantOperatorPermissionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.grantOperatorPermissionWithOptions(request, runtime);
    }

    public DescribeDBInstanceTDEResponse describeDBInstanceTDEWithOptions(DescribeDBInstanceTDERequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDBInstanceTDE", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDBInstanceTDEResponse());
    }

    public DescribeDBInstanceTDEResponse describeDBInstanceTDE(DescribeDBInstanceTDERequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBInstanceTDEWithOptions(request, runtime);
    }

    public DescribeDBInstanceSSLResponse describeDBInstanceSSLWithOptions(DescribeDBInstanceSSLRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDBInstanceSSL", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDBInstanceSSLResponse());
    }

    public DescribeDBInstanceSSLResponse describeDBInstanceSSL(DescribeDBInstanceSSLRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBInstanceSSLWithOptions(request, runtime);
    }

    public DescribeSQLLogFilesResponse describeSQLLogFilesWithOptions(DescribeSQLLogFilesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeSQLLogFiles", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new DescribeSQLLogFilesResponse());
    }

    public DescribeSQLLogFilesResponse describeSQLLogFiles(DescribeSQLLogFilesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSQLLogFilesWithOptions(request, runtime);
    }

    public ModifyDBInstanceMonitorResponse modifyDBInstanceMonitorWithOptions(ModifyDBInstanceMonitorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyDBInstanceMonitor", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new ModifyDBInstanceMonitorResponse());
    }

    public ModifyDBInstanceMonitorResponse modifyDBInstanceMonitor(ModifyDBInstanceMonitorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDBInstanceMonitorWithOptions(request, runtime);
    }

    public SwitchDBInstanceHAResponse switchDBInstanceHAWithOptions(SwitchDBInstanceHARequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SwitchDBInstanceHA", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new SwitchDBInstanceHAResponse());
    }

    public SwitchDBInstanceHAResponse switchDBInstanceHA(SwitchDBInstanceHARequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.switchDBInstanceHAWithOptions(request, runtime);
    }

    public DescribeDBInstanceMonitorResponse describeDBInstanceMonitorWithOptions(DescribeDBInstanceMonitorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDBInstanceMonitor", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDBInstanceMonitorResponse());
    }

    public DescribeDBInstanceMonitorResponse describeDBInstanceMonitor(DescribeDBInstanceMonitorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBInstanceMonitorWithOptions(request, runtime);
    }

    public DescribeSQLCollectorPolicyResponse describeSQLCollectorPolicyWithOptions(DescribeSQLCollectorPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeSQLCollectorPolicy", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new DescribeSQLCollectorPolicyResponse());
    }

    public DescribeSQLCollectorPolicyResponse describeSQLCollectorPolicy(DescribeSQLCollectorPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSQLCollectorPolicyWithOptions(request, runtime);
    }

    public ModifySQLCollectorPolicyResponse modifySQLCollectorPolicyWithOptions(ModifySQLCollectorPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifySQLCollectorPolicy", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new ModifySQLCollectorPolicyResponse());
    }

    public ModifySQLCollectorPolicyResponse modifySQLCollectorPolicy(ModifySQLCollectorPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifySQLCollectorPolicyWithOptions(request, runtime);
    }

    public ModifyDBInstanceHAConfigResponse modifyDBInstanceHAConfigWithOptions(ModifyDBInstanceHAConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyDBInstanceHAConfig", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new ModifyDBInstanceHAConfigResponse());
    }

    public ModifyDBInstanceHAConfigResponse modifyDBInstanceHAConfig(ModifyDBInstanceHAConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDBInstanceHAConfigWithOptions(request, runtime);
    }

    public DescribeDBInstanceHAConfigResponse describeDBInstanceHAConfigWithOptions(DescribeDBInstanceHAConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDBInstanceHAConfig", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDBInstanceHAConfigResponse());
    }

    public DescribeDBInstanceHAConfigResponse describeDBInstanceHAConfig(DescribeDBInstanceHAConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBInstanceHAConfigWithOptions(request, runtime);
    }

    public DescribeSQLReportsResponse describeSQLReportsWithOptions(DescribeSQLReportsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeSQLReports", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new DescribeSQLReportsResponse());
    }

    public DescribeSQLReportsResponse describeSQLReports(DescribeSQLReportsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSQLReportsWithOptions(request, runtime);
    }

    public DescribeDBInstanceIPArrayListResponse describeDBInstanceIPArrayListWithOptions(DescribeDBInstanceIPArrayListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDBInstanceIPArrayList", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDBInstanceIPArrayListResponse());
    }

    public DescribeDBInstanceIPArrayListResponse describeDBInstanceIPArrayList(DescribeDBInstanceIPArrayListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBInstanceIPArrayListWithOptions(request, runtime);
    }

    public DescribeSQLLogReportListResponse describeSQLLogReportListWithOptions(DescribeSQLLogReportListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeSQLLogReportList", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new DescribeSQLLogReportListResponse());
    }

    public DescribeSQLLogReportListResponse describeSQLLogReportList(DescribeSQLLogReportListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSQLLogReportListWithOptions(request, runtime);
    }

    public ResetAccountForPGResponse resetAccountForPGWithOptions(ResetAccountForPGRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ResetAccountForPG", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new ResetAccountForPGResponse());
    }

    public ResetAccountForPGResponse resetAccountForPG(ResetAccountForPGRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resetAccountForPGWithOptions(request, runtime);
    }

    public UpgradeDBInstanceEngineVersionResponse upgradeDBInstanceEngineVersionWithOptions(UpgradeDBInstanceEngineVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpgradeDBInstanceEngineVersion", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new UpgradeDBInstanceEngineVersionResponse());
    }

    public UpgradeDBInstanceEngineVersionResponse upgradeDBInstanceEngineVersion(UpgradeDBInstanceEngineVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.upgradeDBInstanceEngineVersionWithOptions(request, runtime);
    }

    public RevokeAccountPrivilegeResponse revokeAccountPrivilegeWithOptions(RevokeAccountPrivilegeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RevokeAccountPrivilege", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new RevokeAccountPrivilegeResponse());
    }

    public RevokeAccountPrivilegeResponse revokeAccountPrivilege(RevokeAccountPrivilegeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.revokeAccountPrivilegeWithOptions(request, runtime);
    }

    public RestartDBInstanceResponse restartDBInstanceWithOptions(RestartDBInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RestartDBInstance", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new RestartDBInstanceResponse());
    }

    public RestartDBInstanceResponse restartDBInstance(RestartDBInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.restartDBInstanceWithOptions(request, runtime);
    }

    public ResetAccountPasswordResponse resetAccountPasswordWithOptions(ResetAccountPasswordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ResetAccountPassword", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new ResetAccountPasswordResponse());
    }

    public ResetAccountPasswordResponse resetAccountPassword(ResetAccountPasswordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resetAccountPasswordWithOptions(request, runtime);
    }

    /**
     * RemoveTagsFromResource 调用RemoveTagsFromResource接口解绑标签。
      * request demo:   * ```
      * http(s)://rds.aliyuncs.com/?Action=RemoveTagsFromResource
      * &DBInstanceId=rm-uf6wjk5xxxxxxx
      * &RegionId=cn-hangzhou
      * &Tag.1.key=test
      * &<公共请求参数>
      * ```
      * description:   * 限制条件如下：
      * * 单次最多支持解绑10个标签；
      * * 若一个标签所绑定的实例全都解绑，则该标签自动删除；
      * * 若解绑标签时仅传入标签键（TagKey），未传入标签值（TagValue），则解绑所有符合标签键条件的标签。
      * * 必须传入至少一组标签或者单独的一个标签键。
    
     */
    public RemoveTagsFromResourceResponse removeTagsFromResourceWithOptions(RemoveTagsFromResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RemoveTagsFromResource", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new RemoveTagsFromResourceResponse());
    }

    /**
     * RemoveTagsFromResource 调用RemoveTagsFromResource接口解绑标签。
      * request demo:   * ```
      * http(s)://rds.aliyuncs.com/?Action=RemoveTagsFromResource
      * &DBInstanceId=rm-uf6wjk5xxxxxxx
      * &RegionId=cn-hangzhou
      * &Tag.1.key=test
      * &<公共请求参数>
      * ```
      * description:   * 限制条件如下：
      * * 单次最多支持解绑10个标签；
      * * 若一个标签所绑定的实例全都解绑，则该标签自动删除；
      * * 若解绑标签时仅传入标签键（TagKey），未传入标签值（TagValue），则解绑所有符合标签键条件的标签。
      * * 必须传入至少一组标签或者单独的一个标签键。
    
     */
    public RemoveTagsFromResourceResponse removeTagsFromResource(RemoveTagsFromResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeTagsFromResourceWithOptions(request, runtime);
    }

    public PurgeDBInstanceLogResponse purgeDBInstanceLogWithOptions(PurgeDBInstanceLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("PurgeDBInstanceLog", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new PurgeDBInstanceLogResponse());
    }

    public PurgeDBInstanceLogResponse purgeDBInstanceLog(PurgeDBInstanceLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.purgeDBInstanceLogWithOptions(request, runtime);
    }

    public ModifySecurityIpsResponse modifySecurityIpsWithOptions(ModifySecurityIpsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifySecurityIps", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new ModifySecurityIpsResponse());
    }

    public ModifySecurityIpsResponse modifySecurityIps(ModifySecurityIpsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifySecurityIpsWithOptions(request, runtime);
    }

    public ModifyParameterResponse modifyParameterWithOptions(ModifyParameterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyParameter", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new ModifyParameterResponse());
    }

    public ModifyParameterResponse modifyParameter(ModifyParameterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyParameterWithOptions(request, runtime);
    }

    public ModifyDBInstanceSpecResponse modifyDBInstanceSpecWithOptions(ModifyDBInstanceSpecRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyDBInstanceSpec", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new ModifyDBInstanceSpecResponse());
    }

    public ModifyDBInstanceSpecResponse modifyDBInstanceSpec(ModifyDBInstanceSpecRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDBInstanceSpecWithOptions(request, runtime);
    }

    public ModifyDBInstanceMaintainTimeResponse modifyDBInstanceMaintainTimeWithOptions(ModifyDBInstanceMaintainTimeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyDBInstanceMaintainTime", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new ModifyDBInstanceMaintainTimeResponse());
    }

    public ModifyDBInstanceMaintainTimeResponse modifyDBInstanceMaintainTime(ModifyDBInstanceMaintainTimeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDBInstanceMaintainTimeWithOptions(request, runtime);
    }

    public ModifyDBInstanceDescriptionResponse modifyDBInstanceDescriptionWithOptions(ModifyDBInstanceDescriptionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyDBInstanceDescription", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new ModifyDBInstanceDescriptionResponse());
    }

    public ModifyDBInstanceDescriptionResponse modifyDBInstanceDescription(ModifyDBInstanceDescriptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDBInstanceDescriptionWithOptions(request, runtime);
    }

    public ModifyDBDescriptionResponse modifyDBDescriptionWithOptions(ModifyDBDescriptionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyDBDescription", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new ModifyDBDescriptionResponse());
    }

    public ModifyDBDescriptionResponse modifyDBDescription(ModifyDBDescriptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDBDescriptionWithOptions(request, runtime);
    }

    public ModifyBackupPolicyResponse modifyBackupPolicyWithOptions(ModifyBackupPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyBackupPolicy", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new ModifyBackupPolicyResponse());
    }

    public ModifyBackupPolicyResponse modifyBackupPolicy(ModifyBackupPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyBackupPolicyWithOptions(request, runtime);
    }

    public ModifyAccountDescriptionResponse modifyAccountDescriptionWithOptions(ModifyAccountDescriptionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyAccountDescription", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new ModifyAccountDescriptionResponse());
    }

    public ModifyAccountDescriptionResponse modifyAccountDescription(ModifyAccountDescriptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAccountDescriptionWithOptions(request, runtime);
    }

    public MigrateToOtherZoneResponse migrateToOtherZoneWithOptions(MigrateToOtherZoneRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("MigrateToOtherZone", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new MigrateToOtherZoneResponse());
    }

    public MigrateToOtherZoneResponse migrateToOtherZone(MigrateToOtherZoneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.migrateToOtherZoneWithOptions(request, runtime);
    }

    public ImportDatabaseBetweenInstancesResponse importDatabaseBetweenInstancesWithOptions(ImportDatabaseBetweenInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ImportDatabaseBetweenInstances", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new ImportDatabaseBetweenInstancesResponse());
    }

    public ImportDatabaseBetweenInstancesResponse importDatabaseBetweenInstances(ImportDatabaseBetweenInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.importDatabaseBetweenInstancesWithOptions(request, runtime);
    }

    public GrantAccountPrivilegeResponse grantAccountPrivilegeWithOptions(GrantAccountPrivilegeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GrantAccountPrivilege", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new GrantAccountPrivilegeResponse());
    }

    public GrantAccountPrivilegeResponse grantAccountPrivilege(GrantAccountPrivilegeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.grantAccountPrivilegeWithOptions(request, runtime);
    }

    public DescribeTasksResponse describeTasksWithOptions(DescribeTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeTasks", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new DescribeTasksResponse());
    }

    public DescribeTasksResponse describeTasks(DescribeTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTasksWithOptions(request, runtime);
    }

    public DescribeSQLLogReportsResponse describeSQLLogReportsWithOptions(DescribeSQLLogReportsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeSQLLogReports", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new DescribeSQLLogReportsResponse());
    }

    public DescribeSQLLogReportsResponse describeSQLLogReports(DescribeSQLLogReportsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSQLLogReportsWithOptions(request, runtime);
    }

    public DescribeSQLLogRecordsResponse describeSQLLogRecordsWithOptions(DescribeSQLLogRecordsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeSQLLogRecords", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new DescribeSQLLogRecordsResponse());
    }

    public DescribeSQLLogRecordsResponse describeSQLLogRecords(DescribeSQLLogRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSQLLogRecordsWithOptions(request, runtime);
    }

    public DescribeSlowLogsResponse describeSlowLogsWithOptions(DescribeSlowLogsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeSlowLogs", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new DescribeSlowLogsResponse());
    }

    public DescribeSlowLogsResponse describeSlowLogs(DescribeSlowLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSlowLogsWithOptions(request, runtime);
    }

    public DescribeSlowLogRecordsResponse describeSlowLogRecordsWithOptions(DescribeSlowLogRecordsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeSlowLogRecords", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new DescribeSlowLogRecordsResponse());
    }

    public DescribeSlowLogRecordsResponse describeSlowLogRecords(DescribeSlowLogRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSlowLogRecordsWithOptions(request, runtime);
    }

    public DescribeResourceUsageResponse describeResourceUsageWithOptions(DescribeResourceUsageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeResourceUsage", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new DescribeResourceUsageResponse());
    }

    public DescribeResourceUsageResponse describeResourceUsage(DescribeResourceUsageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeResourceUsageWithOptions(request, runtime);
    }

    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeRegions", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new DescribeRegionsResponse());
    }

    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRegionsWithOptions(request, runtime);
    }

    public DescribeParameterTemplatesResponse describeParameterTemplatesWithOptions(DescribeParameterTemplatesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeParameterTemplates", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new DescribeParameterTemplatesResponse());
    }

    public DescribeParameterTemplatesResponse describeParameterTemplates(DescribeParameterTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeParameterTemplatesWithOptions(request, runtime);
    }

    public DescribeParametersResponse describeParametersWithOptions(DescribeParametersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeParameters", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new DescribeParametersResponse());
    }

    public DescribeParametersResponse describeParameters(DescribeParametersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeParametersWithOptions(request, runtime);
    }

    public DescribeModifyParameterLogResponse describeModifyParameterLogWithOptions(DescribeModifyParameterLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeModifyParameterLog", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new DescribeModifyParameterLogResponse());
    }

    public DescribeModifyParameterLogResponse describeModifyParameterLog(DescribeModifyParameterLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeModifyParameterLogWithOptions(request, runtime);
    }

    public DescribeErrorLogsResponse describeErrorLogsWithOptions(DescribeErrorLogsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeErrorLogs", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new DescribeErrorLogsResponse());
    }

    public DescribeErrorLogsResponse describeErrorLogs(DescribeErrorLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeErrorLogsWithOptions(request, runtime);
    }

    public DescribeDBInstancePerformanceResponse describeDBInstancePerformanceWithOptions(DescribeDBInstancePerformanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDBInstancePerformance", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDBInstancePerformanceResponse());
    }

    public DescribeDBInstancePerformanceResponse describeDBInstancePerformance(DescribeDBInstancePerformanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBInstancePerformanceWithOptions(request, runtime);
    }

    public DescribeDatabasesResponse describeDatabasesWithOptions(DescribeDatabasesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDatabases", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDatabasesResponse());
    }

    public DescribeDatabasesResponse describeDatabases(DescribeDatabasesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDatabasesWithOptions(request, runtime);
    }

    public DescribeBinlogFilesResponse describeBinlogFilesWithOptions(DescribeBinlogFilesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeBinlogFiles", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new DescribeBinlogFilesResponse());
    }

    public DescribeBinlogFilesResponse describeBinlogFiles(DescribeBinlogFilesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBinlogFilesWithOptions(request, runtime);
    }

    public DescribeBackupTasksResponse describeBackupTasksWithOptions(DescribeBackupTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeBackupTasks", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new DescribeBackupTasksResponse());
    }

    public DescribeBackupTasksResponse describeBackupTasks(DescribeBackupTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBackupTasksWithOptions(request, runtime);
    }

    public DescribeBackupsResponse describeBackupsWithOptions(DescribeBackupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeBackups", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new DescribeBackupsResponse());
    }

    public DescribeBackupsResponse describeBackups(DescribeBackupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBackupsWithOptions(request, runtime);
    }

    public DescribeBackupPolicyResponse describeBackupPolicyWithOptions(DescribeBackupPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeBackupPolicy", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new DescribeBackupPolicyResponse());
    }

    public DescribeBackupPolicyResponse describeBackupPolicy(DescribeBackupPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBackupPolicyWithOptions(request, runtime);
    }

    public DescribeAccountsResponse describeAccountsWithOptions(DescribeAccountsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeAccounts", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new DescribeAccountsResponse());
    }

    public DescribeAccountsResponse describeAccounts(DescribeAccountsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAccountsWithOptions(request, runtime);
    }

    public DescibeImportsFromDatabaseResponse descibeImportsFromDatabaseWithOptions(DescibeImportsFromDatabaseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescibeImportsFromDatabase", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new DescibeImportsFromDatabaseResponse());
    }

    public DescibeImportsFromDatabaseResponse descibeImportsFromDatabase(DescibeImportsFromDatabaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.descibeImportsFromDatabaseWithOptions(request, runtime);
    }

    public DeleteDBInstanceResponse deleteDBInstanceWithOptions(DeleteDBInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteDBInstance", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new DeleteDBInstanceResponse());
    }

    public DeleteDBInstanceResponse deleteDBInstance(DeleteDBInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDBInstanceWithOptions(request, runtime);
    }

    public DeleteDatabaseResponse deleteDatabaseWithOptions(DeleteDatabaseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteDatabase", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new DeleteDatabaseResponse());
    }

    public DeleteDatabaseResponse deleteDatabase(DeleteDatabaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDatabaseWithOptions(request, runtime);
    }

    public DeleteAccountResponse deleteAccountWithOptions(DeleteAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteAccount", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new DeleteAccountResponse());
    }

    public DeleteAccountResponse deleteAccount(DeleteAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAccountWithOptions(request, runtime);
    }

    public CreateTempDBInstanceResponse createTempDBInstanceWithOptions(CreateTempDBInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateTempDBInstance", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new CreateTempDBInstanceResponse());
    }

    public CreateTempDBInstanceResponse createTempDBInstance(CreateTempDBInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTempDBInstanceWithOptions(request, runtime);
    }

    public CreateDatabaseResponse createDatabaseWithOptions(CreateDatabaseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateDatabase", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new CreateDatabaseResponse());
    }

    public CreateDatabaseResponse createDatabase(CreateDatabaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDatabaseWithOptions(request, runtime);
    }

    public CreateBackupResponse createBackupWithOptions(CreateBackupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateBackup", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new CreateBackupResponse());
    }

    public CreateBackupResponse createBackup(CreateBackupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createBackupWithOptions(request, runtime);
    }

    public CreateAccountResponse createAccountWithOptions(CreateAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateAccount", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new CreateAccountResponse());
    }

    public CreateAccountResponse createAccount(CreateAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAccountWithOptions(request, runtime);
    }

    public CheckDBNameAvailableResponse checkDBNameAvailableWithOptions(CheckDBNameAvailableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CheckDBNameAvailable", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new CheckDBNameAvailableResponse());
    }

    public CheckDBNameAvailableResponse checkDBNameAvailable(CheckDBNameAvailableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkDBNameAvailableWithOptions(request, runtime);
    }

    public CheckAccountNameAvailableResponse checkAccountNameAvailableWithOptions(CheckAccountNameAvailableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CheckAccountNameAvailable", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new CheckAccountNameAvailableResponse());
    }

    public CheckAccountNameAvailableResponse checkAccountNameAvailable(CheckAccountNameAvailableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkAccountNameAvailableWithOptions(request, runtime);
    }

    public CancelImportResponse cancelImportWithOptions(CancelImportRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CancelImport", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new CancelImportResponse());
    }

    public CancelImportResponse cancelImport(CancelImportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelImportWithOptions(request, runtime);
    }

    public AddTagsToResourceResponse addTagsToResourceWithOptions(AddTagsToResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddTagsToResource", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new AddTagsToResourceResponse());
    }

    public AddTagsToResourceResponse addTagsToResource(AddTagsToResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addTagsToResourceWithOptions(request, runtime);
    }

    public SwitchDBInstanceNetTypeResponse switchDBInstanceNetTypeWithOptions(SwitchDBInstanceNetTypeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SwitchDBInstanceNetType", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new SwitchDBInstanceNetTypeResponse());
    }

    public SwitchDBInstanceNetTypeResponse switchDBInstanceNetType(SwitchDBInstanceNetTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.switchDBInstanceNetTypeWithOptions(request, runtime);
    }

    public ReleaseInstancePublicConnectionResponse releaseInstancePublicConnectionWithOptions(ReleaseInstancePublicConnectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ReleaseInstancePublicConnection", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new ReleaseInstancePublicConnectionResponse());
    }

    public ReleaseInstancePublicConnectionResponse releaseInstancePublicConnection(ReleaseInstancePublicConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.releaseInstancePublicConnectionWithOptions(request, runtime);
    }

    public ModifyDBInstanceNetworkTypeResponse modifyDBInstanceNetworkTypeWithOptions(ModifyDBInstanceNetworkTypeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyDBInstanceNetworkType", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new ModifyDBInstanceNetworkTypeResponse());
    }

    public ModifyDBInstanceNetworkTypeResponse modifyDBInstanceNetworkType(ModifyDBInstanceNetworkTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDBInstanceNetworkTypeWithOptions(request, runtime);
    }

    public ModifyDBInstanceConnectionStringResponse modifyDBInstanceConnectionStringWithOptions(ModifyDBInstanceConnectionStringRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyDBInstanceConnectionString", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new ModifyDBInstanceConnectionStringResponse());
    }

    public ModifyDBInstanceConnectionStringResponse modifyDBInstanceConnectionString(ModifyDBInstanceConnectionStringRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDBInstanceConnectionStringWithOptions(request, runtime);
    }

    public ModifyDBInstanceConnectionModeResponse modifyDBInstanceConnectionModeWithOptions(ModifyDBInstanceConnectionModeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyDBInstanceConnectionMode", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new ModifyDBInstanceConnectionModeResponse());
    }

    public ModifyDBInstanceConnectionModeResponse modifyDBInstanceConnectionMode(ModifyDBInstanceConnectionModeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDBInstanceConnectionModeWithOptions(request, runtime);
    }

    public DescribeDBInstanceNetInfoResponse describeDBInstanceNetInfoWithOptions(DescribeDBInstanceNetInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDBInstanceNetInfo", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDBInstanceNetInfoResponse());
    }

    public DescribeDBInstanceNetInfoResponse describeDBInstanceNetInfo(DescribeDBInstanceNetInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBInstanceNetInfoWithOptions(request, runtime);
    }

    public CreateReadOnlyDBInstanceResponse createReadOnlyDBInstanceWithOptions(CreateReadOnlyDBInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateReadOnlyDBInstance", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new CreateReadOnlyDBInstanceResponse());
    }

    public CreateReadOnlyDBInstanceResponse createReadOnlyDBInstance(CreateReadOnlyDBInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createReadOnlyDBInstanceWithOptions(request, runtime);
    }

    /**
     * CreateDBInstance 调用CreateDBInstance接口创建一个RDS实例。
      * request demo:   * ```
      * http(s)://rds.aliyuncs.com/?Action=CreateDBInstance
      * &RegionId=cn-hangzhou
      * &Engine=MySQL
      * &EngineVersion=5.6
      * &DBInstanceClass=rds.mysql.s1.small
      * &DBInstanceStorage=20
      * &DBInstanceNetType=Internet
      * &PayType=Postpaid
      * &SecurityIPList=10.23.12.27/24
      * &<公共请求参数>
      * ```
      * description:   * **请确保在使用该接口前，已充分了解RDS产品的收费方式和<xref href="https://www.alibabacloud.com/product/apsaradb-for-rds#pricing" format="html" scope="external" props="intl">价格</xref><xref href="https://www.aliyun.com/price/product#/rds/detail" format="html" scope="external" props="china">价格</xref>。**
      * 关于RDS实例的规格，请参见[实例规格表](~~26312~~)。
    
     */
    public CreateDBInstanceResponse createDBInstanceWithOptions(CreateDBInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateDBInstance", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new CreateDBInstanceResponse());
    }

    /**
     * CreateDBInstance 调用CreateDBInstance接口创建一个RDS实例。
      * request demo:   * ```
      * http(s)://rds.aliyuncs.com/?Action=CreateDBInstance
      * &RegionId=cn-hangzhou
      * &Engine=MySQL
      * &EngineVersion=5.6
      * &DBInstanceClass=rds.mysql.s1.small
      * &DBInstanceStorage=20
      * &DBInstanceNetType=Internet
      * &PayType=Postpaid
      * &SecurityIPList=10.23.12.27/24
      * &<公共请求参数>
      * ```
      * description:   * **请确保在使用该接口前，已充分了解RDS产品的收费方式和<xref href="https://www.alibabacloud.com/product/apsaradb-for-rds#pricing" format="html" scope="external" props="intl">价格</xref><xref href="https://www.aliyun.com/price/product#/rds/detail" format="html" scope="external" props="china">价格</xref>。**
      * 关于RDS实例的规格，请参见[实例规格表](~~26312~~)。
    
     */
    public CreateDBInstanceResponse createDBInstance(CreateDBInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDBInstanceWithOptions(request, runtime);
    }

    public AllocateInstancePublicConnectionResponse allocateInstancePublicConnectionWithOptions(AllocateInstancePublicConnectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AllocateInstancePublicConnection", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new AllocateInstancePublicConnectionResponse());
    }

    public AllocateInstancePublicConnectionResponse allocateInstancePublicConnection(AllocateInstancePublicConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.allocateInstancePublicConnectionWithOptions(request, runtime);
    }

    public DescribeDBInstancesByPerformanceResponse describeDBInstancesByPerformanceWithOptions(DescribeDBInstancesByPerformanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDBInstancesByPerformance", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDBInstancesByPerformanceResponse());
    }

    public DescribeDBInstancesByPerformanceResponse describeDBInstancesByPerformance(DescribeDBInstancesByPerformanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBInstancesByPerformanceWithOptions(request, runtime);
    }

    public DescribeDBInstancesByExpireTimeResponse describeDBInstancesByExpireTimeWithOptions(DescribeDBInstancesByExpireTimeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDBInstancesByExpireTime", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDBInstancesByExpireTimeResponse());
    }

    public DescribeDBInstancesByExpireTimeResponse describeDBInstancesByExpireTime(DescribeDBInstancesByExpireTimeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBInstancesByExpireTimeWithOptions(request, runtime);
    }

    public DescribeDBInstancesResponse describeDBInstancesWithOptions(DescribeDBInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDBInstances", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDBInstancesResponse());
    }

    public DescribeDBInstancesResponse describeDBInstances(DescribeDBInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBInstancesWithOptions(request, runtime);
    }

    public DescribeDBInstanceAttributeResponse describeDBInstanceAttributeWithOptions(DescribeDBInstanceAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDBInstanceAttribute", "HTTPS", "POST", "2014-08-15", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDBInstanceAttributeResponse());
    }

    public DescribeDBInstanceAttributeResponse describeDBInstanceAttribute(DescribeDBInstanceAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBInstanceAttributeWithOptions(request, runtime);
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
