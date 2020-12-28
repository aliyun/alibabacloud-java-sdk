// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20200928;

import com.aliyun.tea.*;
import com.aliyun.openanalytics_open20200928.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
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

    public AlterTableResponse alterTableWithOptions(AlterTableRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AlterTableShrinkRequest request = new AlterTableShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.parameters)) {
            request.parametersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.parameters, "Parameters", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.col)) {
            request.colShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.col, "Col", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AlterTable", "2020-09-28", "HTTPS", "POST", "AK", "json", req, runtime), new AlterTableResponse());
    }

    public AlterTableResponse alterTable(AlterTableRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.alterTableWithOptions(request, runtime);
    }

    public CountDatabasesByNameAndTagsResponse countDatabasesByNameAndTagsWithOptions(CountDatabasesByNameAndTagsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CountDatabasesByNameAndTags", "2020-09-28", "HTTPS", "POST", "AK", "json", req, runtime), new CountDatabasesByNameAndTagsResponse());
    }

    public CountDatabasesByNameAndTagsResponse countDatabasesByNameAndTags(CountDatabasesByNameAndTagsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.countDatabasesByNameAndTagsWithOptions(request, runtime);
    }

    public DropPartitionResponse dropPartitionWithOptions(DropPartitionRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DropPartitionShrinkRequest request = new DropPartitionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.partValues)) {
            request.partValuesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.partValues, "PartValues", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DropPartition", "2020-09-28", "HTTPS", "POST", "AK", "json", req, runtime), new DropPartitionResponse());
    }

    public DropPartitionResponse dropPartition(DropPartitionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.dropPartitionWithOptions(request, runtime);
    }

    public GetDatabaseObjectsByFilterResponse getDatabaseObjectsByFilterWithOptions(GetDatabaseObjectsByFilterRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetDatabaseObjectsByFilterShrinkRequest request = new GetDatabaseObjectsByFilterShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.catalogTypes)) {
            request.catalogTypesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.catalogTypes, "CatalogTypes", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.likeLocations)) {
            request.likeLocationsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.likeLocations, "LikeLocations", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.locations)) {
            request.locationsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.locations, "Locations", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetDatabaseObjectsByFilter", "2020-09-28", "HTTPS", "POST", "AK", "json", req, runtime), new GetDatabaseObjectsByFilterResponse());
    }

    public GetDatabaseObjectsByFilterResponse getDatabaseObjectsByFilter(GetDatabaseObjectsByFilterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDatabaseObjectsByFilterWithOptions(request, runtime);
    }

    public CreateTableResponse createTableWithOptions(CreateTableRequest tmpReq, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateTable", "2020-09-28", "HTTPS", "POST", "AK", "json", req, runtime), new CreateTableResponse());
    }

    public CreateTableResponse createTable(CreateTableRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createTableWithOptions(request, runtime);
    }

    public DropTableResponse dropTableWithOptions(DropTableRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DropTable", "2020-09-28", "HTTPS", "POST", "AK", "json", req, runtime), new DropTableResponse());
    }

    public DropTableResponse dropTable(DropTableRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.dropTableWithOptions(request, runtime);
    }

    public GetTableObjectsByNameResponse getTableObjectsByNameWithOptions(GetTableObjectsByNameRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetTableObjectsByNameShrinkRequest request = new GetTableObjectsByNameShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tableNames)) {
            request.tableNamesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tableNames, "TableNames", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetTableObjectsByName", "2020-09-28", "HTTPS", "POST", "AK", "json", req, runtime), new GetTableObjectsByNameResponse());
    }

    public GetTableObjectsByNameResponse getTableObjectsByName(GetTableObjectsByNameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getTableObjectsByNameWithOptions(request, runtime);
    }

    public GetDatabaseObjectsByNamePrefixResponse getDatabaseObjectsByNamePrefixWithOptions(GetDatabaseObjectsByNamePrefixRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetDatabaseObjectsByNamePrefix", "2020-09-28", "HTTPS", "POST", "AK", "json", req, runtime), new GetDatabaseObjectsByNamePrefixResponse());
    }

    public GetDatabaseObjectsByNamePrefixResponse getDatabaseObjectsByNamePrefix(GetDatabaseObjectsByNamePrefixRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDatabaseObjectsByNamePrefixWithOptions(request, runtime);
    }

    public AddPartitionsResponse addPartitionsWithOptions(AddPartitionsRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AddPartitionsShrinkRequest request = new AddPartitionsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.partition)) {
            request.partitionShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.partition, "Partition", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddPartitions", "2020-09-28", "HTTPS", "POST", "AK", "json", req, runtime), new AddPartitionsResponse());
    }

    public AddPartitionsResponse addPartitions(AddPartitionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addPartitionsWithOptions(request, runtime);
    }

    public GrantPrivilegesResponse grantPrivilegesWithOptions(GrantPrivilegesRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GrantPrivilegesShrinkRequest request = new GrantPrivilegesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.privilegeBag))) {
            request.privilegeBagShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.privilegeBag), "PrivilegeBag", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GrantPrivileges", "2020-09-28", "HTTPS", "POST", "AK", "json", req, runtime), new GrantPrivilegesResponse());
    }

    public GrantPrivilegesResponse grantPrivileges(GrantPrivilegesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.grantPrivilegesWithOptions(request, runtime);
    }

    public GetDatabaseObjectByNameResponse getDatabaseObjectByNameWithOptions(GetDatabaseObjectByNameRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetDatabaseObjectByName", "2020-09-28", "HTTPS", "POST", "AK", "json", req, runtime), new GetDatabaseObjectByNameResponse());
    }

    public GetDatabaseObjectByNameResponse getDatabaseObjectByName(GetDatabaseObjectByNameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDatabaseObjectByNameWithOptions(request, runtime);
    }

    public GetPartitionsResponse getPartitionsWithOptions(GetPartitionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetPartitions", "2020-09-28", "HTTPS", "POST", "AK", "json", req, runtime), new GetPartitionsResponse());
    }

    public GetPartitionsResponse getPartitions(GetPartitionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getPartitionsWithOptions(request, runtime);
    }

    public GetDatabaseObjectsResponse getDatabaseObjectsWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("GetDatabaseObjects", "2020-09-28", "HTTPS", "POST", "AK", "json", req, runtime), new GetDatabaseObjectsResponse());
    }

    public GetDatabaseObjectsResponse getDatabaseObjects() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDatabaseObjectsWithOptions(runtime);
    }

    public CreateDatabaseResponse createDatabaseWithOptions(CreateDatabaseRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateDatabaseShrinkRequest request = new CreateDatabaseShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.parameters)) {
            request.parametersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.parameters, "Parameters", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateDatabase", "2020-09-28", "HTTPS", "POST", "AK", "json", req, runtime), new CreateDatabaseResponse());
    }

    public CreateDatabaseResponse createDatabase(CreateDatabaseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDatabaseWithOptions(request, runtime);
    }

    public GetColumnObjectsResponse getColumnObjectsWithOptions(GetColumnObjectsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetColumnObjects", "2020-09-28", "HTTPS", "POST", "AK", "json", req, runtime), new GetColumnObjectsResponse());
    }

    public GetColumnObjectsResponse getColumnObjects(GetColumnObjectsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getColumnObjectsWithOptions(request, runtime);
    }

    public AlterDatabaseResponse alterDatabaseWithOptions(AlterDatabaseRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AlterDatabaseShrinkRequest request = new AlterDatabaseShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.parameters)) {
            request.parametersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.parameters, "Parameters", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AlterDatabase", "2020-09-28", "HTTPS", "POST", "AK", "json", req, runtime), new AlterDatabaseResponse());
    }

    public AlterDatabaseResponse alterDatabase(AlterDatabaseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.alterDatabaseWithOptions(request, runtime);
    }

    public GetDatabaseTagsResponse getDatabaseTagsWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("GetDatabaseTags", "2020-09-28", "HTTPS", "POST", "AK", "json", req, runtime), new GetDatabaseTagsResponse());
    }

    public GetDatabaseTagsResponse getDatabaseTags() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDatabaseTagsWithOptions(runtime);
    }

    public GetPartitionResponse getPartitionWithOptions(GetPartitionRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetPartitionShrinkRequest request = new GetPartitionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.values)) {
            request.valuesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.values, "Values", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetPartition", "2020-09-28", "HTTPS", "POST", "AK", "json", req, runtime), new GetPartitionResponse());
    }

    public GetPartitionResponse getPartition(GetPartitionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getPartitionWithOptions(request, runtime);
    }

    public GetDatabaseObjectByIdResponse getDatabaseObjectByIdWithOptions(GetDatabaseObjectByIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetDatabaseObjectById", "2020-09-28", "HTTPS", "POST", "AK", "json", req, runtime), new GetDatabaseObjectByIdResponse());
    }

    public GetDatabaseObjectByIdResponse getDatabaseObjectById(GetDatabaseObjectByIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDatabaseObjectByIdWithOptions(request, runtime);
    }

    public GetTableObjectsByDatabaseIdResponse getTableObjectsByDatabaseIdWithOptions(GetTableObjectsByDatabaseIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetTableObjectsByDatabaseId", "2020-09-28", "HTTPS", "POST", "AK", "json", req, runtime), new GetTableObjectsByDatabaseIdResponse());
    }

    public GetTableObjectsByDatabaseIdResponse getTableObjectsByDatabaseId(GetTableObjectsByDatabaseIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getTableObjectsByDatabaseIdWithOptions(request, runtime);
    }

    public RevokePrivilegesResponse revokePrivilegesWithOptions(RevokePrivilegesRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RevokePrivilegesShrinkRequest request = new RevokePrivilegesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.privilegeBag))) {
            request.privilegeBagShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.privilegeBag), "PrivilegeBag", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RevokePrivileges", "2020-09-28", "HTTPS", "POST", "AK", "json", req, runtime), new RevokePrivilegesResponse());
    }

    public RevokePrivilegesResponse revokePrivileges(RevokePrivilegesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.revokePrivilegesWithOptions(request, runtime);
    }

    public GetTableResponse getTableWithOptions(GetTableRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetTable", "2020-09-28", "HTTPS", "POST", "AK", "json", req, runtime), new GetTableResponse());
    }

    public GetTableResponse getTable(GetTableRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getTableWithOptions(request, runtime);
    }

    public GetAllTablesResponse getAllTablesWithOptions(GetAllTablesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAllTables", "2020-09-28", "HTTPS", "POST", "AK", "json", req, runtime), new GetAllTablesResponse());
    }

    public GetAllTablesResponse getAllTables(GetAllTablesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAllTablesWithOptions(request, runtime);
    }

    public DropDatabaseResponse dropDatabaseWithOptions(DropDatabaseRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DropDatabase", "2020-09-28", "HTTPS", "POST", "AK", "json", req, runtime), new DropDatabaseResponse());
    }

    public DropDatabaseResponse dropDatabase(DropDatabaseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.dropDatabaseWithOptions(request, runtime);
    }

    public GetAllDatabasesResponse getAllDatabasesWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("GetAllDatabases", "2020-09-28", "HTTPS", "POST", "AK", "json", req, runtime), new GetAllDatabasesResponse());
    }

    public GetAllDatabasesResponse getAllDatabases() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAllDatabasesWithOptions(runtime);
    }

    public GetDatabaseResponse getDatabaseWithOptions(GetDatabaseRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetDatabase", "2020-09-28", "HTTPS", "POST", "AK", "json", req, runtime), new GetDatabaseResponse());
    }

    public GetDatabaseResponse getDatabase(GetDatabaseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDatabaseWithOptions(request, runtime);
    }
}
