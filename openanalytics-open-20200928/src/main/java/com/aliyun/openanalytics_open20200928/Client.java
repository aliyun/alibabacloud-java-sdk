// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20200928;

import com.aliyun.tea.*;
import com.aliyun.openanalytics_open20200928.models.*;

public class Client extends com.aliyun.teaopenapi.Client {
    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
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

    public AddPartitionsResponse addPartitionsWithOptions(AddPartitionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddPartitions", "2020-09-28", "HTTPS", "POST", "AK", "json", req, runtime), new AddPartitionsResponse());
    }

    public AddPartitionsResponse addPartitions(AddPartitionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addPartitionsWithOptions(request, runtime);
    }

    public AlterDatabaseResponse alterDatabaseWithOptions(AlterDatabaseRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AlterDatabaseShrinkRequest request = new AlterDatabaseShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.parameters)) {
            request.parametersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.parameters, "Parameters", "json");
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AlterDatabase", "2020-09-28", "HTTPS", "POST", "AK", "json", req, runtime), new AlterDatabaseResponse());
    }

    public AlterDatabaseResponse alterDatabase(AlterDatabaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.alterDatabaseWithOptions(request, runtime);
    }

    public AlterTableResponse alterTableWithOptions(AlterTableRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AlterTableShrinkRequest request = new AlterTableShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.parameters)) {
            request.parametersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.parameters, "Parameters", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.col)) {
            request.colShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.col, "Col", "json");
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AlterTable", "2020-09-28", "HTTPS", "POST", "AK", "json", req, runtime), new AlterTableResponse());
    }

    public AlterTableResponse alterTable(AlterTableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.alterTableWithOptions(request, runtime);
    }

    public CreateDatabaseResponse createDatabaseWithOptions(CreateDatabaseRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateDatabaseShrinkRequest request = new CreateDatabaseShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.parameters)) {
            request.parametersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.parameters, "Parameters", "json");
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateDatabase", "2020-09-28", "HTTPS", "POST", "AK", "json", req, runtime), new CreateDatabaseResponse());
    }

    public CreateDatabaseResponse createDatabase(CreateDatabaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDatabaseWithOptions(request, runtime);
    }

    public CreateTableResponse createTableWithOptions(CreateTableRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateTableShrinkRequest request = new CreateTableShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.partitionKeys)) {
            request.partitionKeysShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.partitionKeys, "PartitionKeys", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.parameters)) {
            request.parametersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.parameters, "Parameters", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.storageDescriptor))) {
            request.storageDescriptorShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.storageDescriptor), "StorageDescriptor", "json");
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateTable", "2020-09-28", "HTTPS", "POST", "AK", "json", req, runtime), new CreateTableResponse());
    }

    public CreateTableResponse createTable(CreateTableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTableWithOptions(request, runtime);
    }

    public DropDatabaseResponse dropDatabaseWithOptions(DropDatabaseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DropDatabase", "2020-09-28", "HTTPS", "POST", "AK", "json", req, runtime), new DropDatabaseResponse());
    }

    public DropDatabaseResponse dropDatabase(DropDatabaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.dropDatabaseWithOptions(request, runtime);
    }

    public DropPartitionResponse dropPartitionWithOptions(DropPartitionRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DropPartitionShrinkRequest request = new DropPartitionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.partValues)) {
            request.partValuesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.partValues, "PartValues", "json");
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DropPartition", "2020-09-28", "HTTPS", "POST", "AK", "json", req, runtime), new DropPartitionResponse());
    }

    public DropPartitionResponse dropPartition(DropPartitionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.dropPartitionWithOptions(request, runtime);
    }

    public DropTableResponse dropTableWithOptions(DropTableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DropTable", "2020-09-28", "HTTPS", "POST", "AK", "json", req, runtime), new DropTableResponse());
    }

    public DropTableResponse dropTable(DropTableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.dropTableWithOptions(request, runtime);
    }

    public GetAllDatabasesResponse getAllDatabasesWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("GetAllDatabases", "2020-09-28", "HTTPS", "POST", "AK", "json", req, runtime), new GetAllDatabasesResponse());
    }

    public GetAllDatabasesResponse getAllDatabases() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAllDatabasesWithOptions(runtime);
    }

    public GetAllTablesResponse getAllTablesWithOptions(GetAllTablesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAllTables", "2020-09-28", "HTTPS", "POST", "AK", "json", req, runtime), new GetAllTablesResponse());
    }

    public GetAllTablesResponse getAllTables(GetAllTablesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAllTablesWithOptions(request, runtime);
    }

    public GetDatabaseResponse getDatabaseWithOptions(GetDatabaseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetDatabase", "2020-09-28", "HTTPS", "POST", "AK", "json", req, runtime), new GetDatabaseResponse());
    }

    public GetDatabaseResponse getDatabase(GetDatabaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDatabaseWithOptions(request, runtime);
    }

    public GetPartitionResponse getPartitionWithOptions(GetPartitionRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetPartitionShrinkRequest request = new GetPartitionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.values)) {
            request.valuesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.values, "Values", "json");
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetPartition", "2020-09-28", "HTTPS", "POST", "AK", "json", req, runtime), new GetPartitionResponse());
    }

    public GetPartitionResponse getPartition(GetPartitionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPartitionWithOptions(request, runtime);
    }

    public GetPartitionsResponse getPartitionsWithOptions(GetPartitionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetPartitions", "2020-09-28", "HTTPS", "POST", "AK", "json", req, runtime), new GetPartitionsResponse());
    }

    public GetPartitionsResponse getPartitions(GetPartitionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPartitionsWithOptions(request, runtime);
    }

    public GetTableResponse getTableWithOptions(GetTableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetTable", "2020-09-28", "HTTPS", "POST", "AK", "json", req, runtime), new GetTableResponse());
    }

    public GetTableResponse getTable(GetTableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTableWithOptions(request, runtime);
    }

    public GrantPrivilegesResponse grantPrivilegesWithOptions(GrantPrivilegesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GrantPrivileges", "2020-09-28", "HTTPS", "POST", "AK", "json", req, runtime), new GrantPrivilegesResponse());
    }

    public GrantPrivilegesResponse grantPrivileges(GrantPrivilegesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.grantPrivilegesWithOptions(request, runtime);
    }

    public RevokePrivilegesResponse revokePrivilegesWithOptions(RevokePrivilegesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RevokePrivileges", "2020-09-28", "HTTPS", "POST", "AK", "json", req, runtime), new RevokePrivilegesResponse());
    }

    public RevokePrivilegesResponse revokePrivileges(RevokePrivilegesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.revokePrivilegesWithOptions(request, runtime);
    }
}
